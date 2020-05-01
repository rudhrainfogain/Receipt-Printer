package com.infogain.training.constants;

import jpos.POSPrinterConst;

/**
 * Copyright (c) 2019 FedEx. All Rights Reserved.<br>
 * <br>
 * Theme - Core Retail Peripheral Services<br>
 * Feature - Peripheral Services - Design and Architecture<br>
 * Description - This class consists of JPOS Barcode text positions
 * 
 * @author Puneet Gupta [3696361]
 * @version 1.0.0
 * @since 15-Jul-2019
 */
public enum JPOSBarcodeTextPosition {

    NONE(POSPrinterConst.PTR_BC_TEXT_NONE),
    ABOVE(POSPrinterConst.PTR_BC_TEXT_ABOVE),
    BELOW(POSPrinterConst.PTR_BC_TEXT_BELOW);

    private int barcodeTextPosition;

    @SuppressWarnings("squid:UnusedPrivateMethod")
    private JPOSBarcodeTextPosition(int barcodeTextPosition) {

        this.barcodeTextPosition = barcodeTextPosition;
    }

    public int getJposBarcodeTextPosition() {

        return barcodeTextPosition;
    }
}
