package com.infogain.training.dto;

import java.util.Objects;

import com.infogain.training.RecieptElementType;

/**
 * Copyright (c) 2019 FedEx. All Rights Reserved.<br>
 * <br>
 * Theme - Core Retail Peripheral Services<br>
 * Feature - Peripheral Services - Design and Architecture<br>
 * Description - This class is a model class for Cut
 * 
 * @author Puneet Gupta [3696361]
 * @version 1.0.0
 * @since 09-Jul-2019
 */
public class Cut implements RecieptElementType {

    private boolean cutReceipt;

    private int percentage;

    public Cut() {

        this.cutReceipt = true;
        this.percentage = 100;
    }

    @Override
    public boolean isCutReceipt() {

        return cutReceipt;
    }

    public void setCutReceipt(boolean cutReceipt) {

        this.cutReceipt = cutReceipt;
    }

    @Override
    public int getPercentage() {

        return percentage;
    }

    public void setPercentage(int percentage) {

        this.percentage = percentage;
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + (cutReceipt ? 1231 : 1237);
        result = prime * result + percentage;
        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cut)) {
            return false;
        }
        Cut cut = (Cut) obj;
        return Objects.equals(cutReceipt, cut.cutReceipt) && Objects.equals(percentage, cut.percentage);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("Cut [cutReceipt=").append(cutReceipt).append(", percentage=").append(percentage).append("]");
        return builder.toString();
    }


}
