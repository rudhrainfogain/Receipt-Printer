package com.infogain.training;

/**
 * Copyright (c) 2019 FedEx. All Rights Reserved.<br>
 * <br>
 * Theme - Core Retail Peripheral Services<br>
 * Feature - Peripheral Services - PI 20.3 - Research, Design and Architecture<br>
 * Description - This interface defines the multiple receipt elements
 * 
 * @author Abhishek Singhal [3692173]
 * @version 1.0.0
 * @since Dec 30, 2019
 */
public interface RecieptElementType {

    default String getData() {
        throw new UnsupportedOperationException(getClass().getName());
    }

    default String getSymbology() {
        throw new UnsupportedOperationException(getClass().getName());
    }

    default String getAlignment() {
        throw new UnsupportedOperationException(getClass().getName());
    }

    default String getTextPosition() {
        throw new UnsupportedOperationException(getClass().getName());
    }

    default int getWidth() {
        throw new UnsupportedOperationException(getClass().getName());
    }

    default int getHeight() {
        throw new UnsupportedOperationException(getClass().getName());
    }

    default int getPercentage() {
        throw new UnsupportedOperationException(getClass().getName());
    }

    default boolean isCutReceipt() {
        throw new UnsupportedOperationException(getClass().getName());
    }

    default String getText() {
        throw new UnsupportedOperationException(getClass().getName());
    }

    default String getUrl() {
        throw new UnsupportedOperationException(getClass().getName());
    }

    default String getOriginalUrl() {
        throw new UnsupportedOperationException(getClass().getName());
    }
}
