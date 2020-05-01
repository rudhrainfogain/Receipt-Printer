package com.infogain.training.utilities;

import java.util.Enumeration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.Message;

import com.infogain.training.constants.DeviceConstantsifc;

import jpos.JposException;
import jpos.POSPrinter;
import jpos.config.JposEntry;
import jpos.config.JposEntryRegistry;
import jpos.loader.JposServiceLoader;

public class ReceiptPrinterUtility {

	private static Logger logger = LogManager.getLogger(ReceiptPrinterUtility.class);

	/**
	 * This method is used to get the devices information
	 * 
	 * @param jposEntry
	 * @return
	 */
	public String getDeviceInfo(JposEntry jposEntry) {
		String propValue[] = { "vendorName", "deviceCategory", "productDescription" };
		return (jposEntry.getLogicalName() + "," + jposEntry.getPropertyValue(propValue[0]) + ","
				+ jposEntry.getPropertyValue(propValue[1]) + "," + jposEntry.getPropertyValue(propValue[2]));
	}

	public void setSystemProperties() {
		Message m = logger.traceEntry();
		logger.info("Setting required system properties for JPOS");
		System.setProperty(DeviceConstantsifc.SERVICE_MANAGER_KEY, DeviceConstantsifc.SERVICE_MANAGER_VALUE);
		System.setProperty(DeviceConstantsifc.REG_POPULATOR_KEY, DeviceConstantsifc.REG_POPULATOR_VALUE);
		System.setProperty(DeviceConstantsifc.TRACER_KEY, DeviceConstantsifc.TRACER_VALUE);
		System.setProperty(DeviceConstantsifc.POPULATOR_KEY,"D:\\fedexPOCs\\receipt-printer-poc\\src\\main\\resources\\static\\jpos.xml");
		logger.info("System properties set successfully");
		logger.traceExit(m);
	}
	
	/**
	 * This method accumulates all the JPOS entries in JPOS.XML file and return it as Enumeration
	 * 
	 * @return Enumeration
	 */
	public Enumeration<?> getRegistryEntries() {
		Message m = logger.traceEntry();
		JposServiceLoader.getManager().getProperties();
		JposEntryRegistry registry = JposServiceLoader.getManager().getEntryRegistry();
		registry.load();
		return logger.traceExit(m,registry.getEntries());
	}
	
	/**
	 * This method is used to get the device status
	 * 
	 * @param printerRequestInformation
	 * @param configFileName
	 * @param deviceName
	 * @return status of device
	 */
	public POSPrinter getPrinter(String deviceName) {
		Message m = logger.traceEntry();
		POSPrinter posPrinter = null;
		StringBuilder status = new StringBuilder();
		String deviceInfo = "";
		setSystemProperties();
		@SuppressWarnings("rawtypes")
		Enumeration localEnumeration = getRegistryEntries();
		while (localEnumeration.hasMoreElements()) {
			JposEntry jposEntry = (JposEntry) localEnumeration.nextElement();
			if (!"".equals(deviceName) && deviceName.equalsIgnoreCase(jposEntry.getLogicalName())) {
				deviceInfo = getDeviceInfo(jposEntry);
				try {
					logger.info("Creating an object of POSPrinter");
					posPrinter = new POSPrinter();
					logger.info("Trying to open,claim and enabling the device(receipt printer) " + deviceName);
					posPrinter.open(deviceName);
					posPrinter.claim(1000);
					posPrinter.setDeviceEnabled(true);
					logger.info("Printer claimed successfully, starting receipt printing");
					//recieptUtility.printReceipt(posPrinter, printerRequestInformation);
					logger.info("Receipt printed successfully");
					status.append(deviceInfo).append(",").append(DeviceConstantsifc.JPOS_DEVICE_STATUS_OK).append("|");
					
				} catch (JposException e) {
					status.append(deviceInfo).append(",").append("JPOSEXCEPTION : ").append(e.getMessage()).append("|");
					logger.debug(status.toString());
					System.out.println();
				} catch (Exception e) {
					status.append(deviceInfo).append(",").append("EXCEPTION : ").append(e.getMessage()).append("|");
					logger.debug(status.toString());
				} 
				break;
			}
		}
		return logger.traceExit(m, posPrinter);
	}

}
