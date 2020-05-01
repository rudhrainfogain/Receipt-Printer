package com.infogain.training.constants;

import jpos.POSPrinterConst;

/**
 * Copyright (c) 2019 FedEx. All Rights Reserved.<br>
 * <br>
 * Theme - Core Retail Peripheral Services<br>
 * Feature - Peripheral Services - Design and Architecture<br>
 * Description - This class consists of barcode symbology enum
 * 
 * @author Puneet Gupta [3696361]
 * @version 1.0.0
 * @since 17-Jul-2019
 */
public enum JPOSBarcodeSymbology {

    ITF(POSPrinterConst.PTR_BCS_ITF),
    UPCA(POSPrinterConst.PTR_BCS_UPCA),
    UPCA_S(POSPrinterConst.PTR_BCS_UPCA_S),
    UPCE(POSPrinterConst.PTR_BCS_UPCE),
    UPCE_S(POSPrinterConst.PTR_BCS_UPCE_S),
    UPCD1(POSPrinterConst.PTR_BCS_UPCD1),
    UPCD2(POSPrinterConst.PTR_BCS_UPCD2),
    UPCD3(POSPrinterConst.PTR_BCS_UPCD3),
    UPCD4(POSPrinterConst.PTR_BCS_UPCD4),
    UPCD5(POSPrinterConst.PTR_BCS_UPCD5),
    EAN8(POSPrinterConst.PTR_BCS_EAN8),
    JAN8(POSPrinterConst.PTR_BCS_JAN8),
    EAN8_S(POSPrinterConst.PTR_BCS_EAN8_S),
    EAN13(POSPrinterConst.PTR_BCS_EAN13),
    JAN13(POSPrinterConst.PTR_BCS_JAN13),
    EAN13_S(POSPrinterConst.PTR_BCS_EAN13_S),
    EAN128(POSPrinterConst.PTR_BCS_EAN128),
    TF(POSPrinterConst.PTR_BCS_TF),
    CODABAR(POSPrinterConst.PTR_BCS_Codabar),
    CODE39(POSPrinterConst.PTR_BCS_Code39),
    CODE93(POSPrinterConst.PTR_BCS_Code93),
    CODE128(POSPrinterConst.PTR_BCS_Code128),
    OCRA(POSPrinterConst.PTR_BCS_OCRA),
    OCRB(POSPrinterConst.PTR_BCS_OCRB),
    PDF417(POSPrinterConst.PTR_BCS_PDF417),
    MAXICODE(POSPrinterConst.PTR_BCS_MAXICODE);

    private int barcodeSymbology;

    @SuppressWarnings("squid:UnusedPrivateMethod")
    private JPOSBarcodeSymbology(int jposBarcodeSymbology) {

        this.barcodeSymbology = jposBarcodeSymbology;
    }

    public int getJposBarcodeSymbology() {

        return barcodeSymbology;
    }


}
