package com.infogain.training.exception;

import jpos.JposException;

/**
 * Copyright (c) 2019 FedEx. All Rights Reserved.<br>
 * <br>
 * Theme - Core Retail Peripheral Services<br>
 * Feature - Peripheral Services - Design and Architecture<br>
 * Description - This is an exception class for Receipt Printer Jpos related Exceptions
 * 
 * @author Puneet Gupta [3696361]
 * @version 1.0.0
 * @since 10-Jul-2019
 */
public class ReceiptPrinterJposException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private final JposException jposException;

    public ReceiptPrinterJposException(String message) {
        super(message);
        this.jposException = null;
    }

    public ReceiptPrinterJposException(String message, Throwable cause) {
        super(message, cause);
        this.jposException = null;
    }

    public ReceiptPrinterJposException(JposException jposException) {
        super(jposException.getMessage());
        this.jposException = jposException;
    }

    public JposException getJposException() {
        return jposException;
    }

}
