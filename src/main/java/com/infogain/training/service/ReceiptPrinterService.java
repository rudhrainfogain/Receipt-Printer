package com.infogain.training.service;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.infogain.training.constants.JPOSBarcodeAlignment;
import com.infogain.training.constants.JPOSBarcodeSymbology;
import com.infogain.training.constants.JPOSBarcodeTextPosition;
import com.infogain.training.constants.JPOSImageAlignment;
import com.infogain.training.dto.Barcode;
import com.infogain.training.dto.Image;
import com.infogain.training.exception.ReceiptPrinterJposException;

import jpos.JposException;
import jpos.POSPrinter;
import jpos.POSPrinterConst;

public class ReceiptPrinterService {

	
	private static Logger logger = LogManager.getLogger(ReceiptPrinterService.class);
	/**
     * {@inheritDoc}
     * 
     * @since 08-Jul-2019
     */
    public void printReceiptText(POSPrinter posPrinter, String text) {
        try {
            logger.info("printing receipt text");
            posPrinter.printNormal(POSPrinterConst.PTR_S_RECEIPT, text);
        } catch (JposException jposException) {
            logger.error("JPOS Exception occured while printing receipt text: {}",
                            ExceptionUtils.getStackTrace(jposException));
            throw new ReceiptPrinterJposException(jposException);
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @since 08-Jul-2019
     */
    public void printReceiptLogo(POSPrinter posPrinter, Image logo) {
        logger.info("printing receipt logo");
        try {
            int logoAlignment = JPOSImageAlignment.valueOf((logo.getAlignment()).toUpperCase()).getJposImageAlignment();
            logger.debug("printing receipt logo");
            posPrinter.printBitmap(POSPrinterConst.PTR_S_RECEIPT, logo.getUrl(), POSPrinterConst.PTR_BM_ASIS,
                            logoAlignment);
        } catch (JposException jposException) {
            logger.error("JPOS Exception occured while printing receipt logo: {}",
                            ExceptionUtils.getStackTrace(jposException));
            throw new ReceiptPrinterJposException(jposException);
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @since 08-Jul-2019
     */
    public void printReceiptBarcode(POSPrinter posPrinter, Barcode barcode) {
        logger.info("printing receipt barcode");
        try {
            int barcodeALignment = JPOSBarcodeAlignment.valueOf((barcode.getAlignment()).toUpperCase())
                            .getJposBarcodeAlignment();
            int textPosition = JPOSBarcodeTextPosition.valueOf((barcode.getTextPosition()).toUpperCase())
                            .getJposBarcodeTextPosition();
            int symbology = JPOSBarcodeSymbology.valueOf((barcode.getSymbology()).toUpperCase())
                            .getJposBarcodeSymbology();
            posPrinter.printBarCode(POSPrinterConst.PTR_S_RECEIPT, barcode.getData(), symbology, barcode.getHeight(),
                            barcode.getWidth(), barcodeALignment, textPosition);
            logger.debug("printing barcode");
        } catch (JposException jposException) {
            logger.error("JPOS Exception occured while printing receipt barcode: {}",
                            ExceptionUtils.getStackTrace(jposException));
            throw new ReceiptPrinterJposException(jposException);
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @since 08-Jul-2019
     */
    public void cutReceiptPaper(POSPrinter posPrinter) {
        try {
            posPrinter.cutPaper(100);
            logger.info("Cutting the receipt paper");
        } catch (JposException jposException) {
            logger.error("JPOS Exception occured while cutting receipt paper: {}",
                            ExceptionUtils.getStackTrace(jposException));
            throw new ReceiptPrinterJposException(jposException);
        }
    }
    
}
