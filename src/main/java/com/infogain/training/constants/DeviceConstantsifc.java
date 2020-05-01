/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (c) 2019 FedEx Services, Inc. All Rights Reserved.* * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */
package com.infogain.training.constants;

/**
 * This class consists of all the common strings which can be used application
 * wide.
 * 
 * @author abhishek.singhal.osv
 *
 */
public interface DeviceConstantsifc {

	// Device Integration : Configuration Constants
	public static final String DEVICE_CONFIG_PATH = "classpath:device.properties";
	// Device Integration : Printer constants
	public static final String PRINTER_LOGICAL_PORTNAME = "LogicalPortName";
	public static final String PRINTER_MODELNAME = "PhysicalPrinterName";
	public static final String PRINTER_PHYSICAL_PORTNAME = "physicalPortName";
	public static final String PRINTERPCS_MODELNAME = "ModelName";
	public static final String PRINTER_VIRTUAL_PORTNAME = "APD.spooler.portname";
	public static final String H6K2_LOGICAL_NAME = "H6K2Win7EpsonPrinter";
	public static final String H6K4_LOGICAL_NAME = "H6K4Win7EpsonPrinter";
	public static final String TM88V_LOGICAL_NAME = "TM-T88VWin10EpsonPrinter";
	public static final String PRINTER_FEDEX_LOGO_FILEPATH = "D:\\fedexPOCs\\ReceiptPrinterPOC\\src\\main\\resources\\static\\logo.jpg";
	public static final String PRINTER_TM6000II = "TM-H6000II";
	public static final String PRINTER_TM6000IV = "TM-H6000IV";
	public static final String PRINTER_TM88V = "TM-T88V";
	public static final String JPOS_DEVICE_STATUS_OK = "OK";

	// Device Integration : Common JPOS constants
	public static final String XML_JPOS_TAGNAME = "JposEntry";
	public static final String XML_JPOS_NAME = "name";
	public static final String XML_JPOS_VALUE = "value";
	public static final String XML_YES = "yes";
	public static final String XML_PORT = "Port";
	public static final String DLL_PATH = "D:\\DeviceIntegration\\dlls\\";
	public static final String JAVA_LIBRARY_PATH = "java.library.path";
	public static final String USER_DIR = "user.dir";
	public static final String SYS_PATHS = "sys_paths";
	public static final String XML_NAMESPACE_URL = "http://xml.org/sax/features/namespaces";
	public static final String XML_VALIDATION_URL = "http://xml.org/sax/features/validation";
	public static final String XML_DTD_GRAMMAR_URL = "http://apache.org/xml/features/nonvalidating/load-dtd-grammar";
	public static final String XML_EXT_DTD_URL = "http://apache.org/xml/features/nonvalidating/load-external-dtd";
	public static final String XML_ID = "id";
	public static final String XML_JPOSENTRY = "JposEntry";
	public static final String XML_JPOS = "jpos";
	public static final String XML_CATEGORY = "category";
	public static final String XML_PROP = "prop";
	public static final String XML_NAME = "name";
	public static final String XML_TYPE = "type";
	public static final String XML_POSPRINTER = "POSPrinter";
	public static final String LOGICAL_NAME = "logicalName";
	public static final String PORT = "Port";
	public static final String DEVICE_CATEGORY_JPOS = "deviceCategory";
	public static final String SERVICE_MANAGER_KEY = "jpos.loader.serviceManagerClass";
	public static final String SERVICE_MANAGER_VALUE = "jpos.loader.simple.SimpleServiceManager";
	public static final String REG_POPULATOR_KEY = "jpos.config.regPopulatorClass";
	public static final String REG_POPULATOR_VALUE = "jpos.config.simple.xml.SimpleXmlRegPopulator";
	public static final String TRACER_KEY = "jpos.util.tracing.TurnOnNamedTracers";
	public static final String TRACER_VALUE = "JposServiceLoader,SimpleEntryRegistry,SimpleRegPopulator,XercesRegPopulator";
	public static final String POPULATOR_KEY = "jpos.config.populatorFile";

	// Device Integration : Response constants
	public static final String OK = "OK";
	public static final String MESSAGE = "message";
	public static final String SUCCESSFUL = "Successful";
	public static final String EXCEPTION = "Exception occured";

	// Device Integration : Scanner Constants
	public static final String CONNECTED_SCANNER = "device.connected.scanner";
	public static final String NO_SCANNER_DEVICE = "No Scanner Device";
	public static final String SCANNER_HONEYWELL1900_NAME = "BarcodeScanner1900";
	public static final String SCANNER_HONEYWELL1900_PORT = "COM3";
	public static final String SCANNER_HONEYWELL1900_DEVICEID = "VID_0C2E&PID_090A";
	public static final String SCANNER_IT3800_NAME = "BarcodeScannerIT3800";
	public static final String SCANNER_IT3800_PORT = "COM5";
	public static final String SCANNER_IT3800_DEVICEID = "VID_0536&PID_012A";
	public static final String BARCODE_VALUE = "barcodeValue";
	public static final String SCANNER_STATUS = "status";
	public static final String DEVICE_CATEGORY_SCANNER = "Scanner";

	// Constants for label printer
	public static final String SHIPPING_LABEL = "ShippingLabel";
	public static final String CUSTOM_LABEL = "CustomLabel";
	public static final String CUSTOM_LABEL_TEMPLATE = "customLabelTemplate.txt";
	public static final String SHIPPING_LABEL_TEMPLATE = "shippingLabelTemplate.txt";
	public static final String EXCEPTION_OCCURED_MESSAGE = "Exception Occurred";
	public static final String NOT_VALID_LABEL_TYPE_MESSAGE = "Not a valid label type";
	public static final String NOT_VALID_STRING_MESSAGE = "String not in proper format";
	public static final String DYMO_LABEL_PRINTER_NOT_CONNECTED_MESSAGE = "DymoLabel Printer is not Connected";
	public static final String LABEL_PRINTER_NOT_CONNECTED_MESSAGE = "Label Printer is not Connected";

	// Device Exception Constants
	public static final String INVALID_REQUEST_PAYLOAD_MESSAGE = "Invalid request payload";
	public static final String FILE_WRITE_EXCEPTION_MESSAGE = "File Write Exception";

}
