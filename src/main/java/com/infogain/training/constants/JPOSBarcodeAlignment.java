package com.infogain.training.constants;

import jpos.POSPrinterConst;

/**
 * Copyright (c) 2019 FedEx. All Rights Reserved.<br>
 * <br>
 * Theme - Core Retail Peripheral Services<br>
 * Feature - Peripheral Services - Design and Architecture<br>
 * Description - This class consists of receipt printer related string constants
 * 
 * @author Puneet Gupta [3696361]
 * @version 1.0.0
 * @since 15-Jul-2019
 */
public enum JPOSBarcodeAlignment {

    CENTER(POSPrinterConst.PTR_BC_CENTER),
    LEFT(POSPrinterConst.PTR_BC_LEFT),
    RIGHT(POSPrinterConst.PTR_BC_RIGHT);

    private int barcodeAlignment;

    @SuppressWarnings("squid:UnusedPrivateMethod")
    private JPOSBarcodeAlignment(int barcodeAlignment) {

        this.barcodeAlignment = barcodeAlignment;
    }

    public int getJposBarcodeAlignment() {

        return barcodeAlignment;
    }
}
