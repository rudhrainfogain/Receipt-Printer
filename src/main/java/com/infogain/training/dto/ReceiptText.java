package com.infogain.training.dto;

import java.util.Objects;

import com.infogain.training.RecieptElementType;

/**
 * Copyright (c) 2019 FedEx. All Rights Reserved.<br>
 * <br>
 * Theme - Core Retail Peripheral Services<br>
 * Feature - Peripheral Services - Design and Architecture<br>
 * Description - This class is a model class for ReceiptText
 * 
 * @author Puneet Gupta [3696361]
 * @version 1.0.0
 * @since 10-Jul-2019
 */
public class ReceiptText implements RecieptElementType {

    private String text;

    private String alignment;

    public ReceiptText() {

        this.alignment = "left";
    }

    public ReceiptText(final String text, final String alignment) {

        this.text = text;
        this.alignment = alignment;
    }

    @Override
    public String getText() {

        return text;
    }

    public void setText(String text) {

        this.text = text;
    }

    @Override
    public String getAlignment() {

        return alignment;
    }

    public void setAlignment(String alignment) {

        this.alignment = alignment;
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + ((alignment == null) ? 0 : alignment.hashCode());
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReceiptText)) {
            return false;
        }
        ReceiptText receiptText = (ReceiptText) obj;
        return Objects.equals(alignment, receiptText.alignment) && Objects.equals(text, receiptText.text);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("ReceiptText [text=").append(text).append(", alignment=").append(alignment).append("]");
        return builder.toString();
    }

}
