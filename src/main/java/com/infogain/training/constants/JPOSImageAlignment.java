package com.infogain.training.constants;

import jpos.POSPrinterConst;

/**
 * Copyright (c) 2019 FedEx. All Rights Reserved.<br>
 * <br>
 * Theme - Core Retail Peripheral Services<br>
 * Feature - Peripheral Services - Design and Architecture<br>
 * Description - This class consists of all JPOS Image Alignments
 * 
 * @author Puneet Gupta [3696361]
 * @version 1.0.0
 * @since 15-Jul-2019
 */
public enum JPOSImageAlignment {

    CENTER(POSPrinterConst.PTR_BM_CENTER),
    LEFT(POSPrinterConst.PTR_BM_LEFT),
    RIGHT(POSPrinterConst.PTR_BM_RIGHT);

    private int imageAlignment;

    @SuppressWarnings("squid:UnusedPrivateMethod")
    private JPOSImageAlignment(int imageAlignment) {

        this.imageAlignment = imageAlignment;
    }

    public int getJposImageAlignment() {

        return imageAlignment;
    }
}
