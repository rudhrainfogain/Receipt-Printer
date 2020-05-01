package com.infogain.training.dto;

import java.util.Objects;

import com.infogain.training.RecieptElementType;
import com.infogain.training.constants.JPOSBarcodeAlignment;
import com.infogain.training.constants.JPOSBarcodeSymbology;
import com.infogain.training.constants.JPOSBarcodeTextPosition;

/**
 * Copyright (c) 2019 FedEx. All Rights Reserved.<br>
 * <br>
 * Theme - Core Retail Peripheral Services<br>
 * Feature - Peripheral Services - Design and Architecture<br>
 * Description - This class is a model class for Barcode
 * 
 * @author Puneet Gupta [3696361]
 * @version 1.0.0
 * @since 09-Jul-2019
 */
public class Barcode implements RecieptElementType {

    private static final String ALIGNMENT_CENTER = "center";
    private static final String TEXT_POSITION_BELOW = "below";
    private static final String ITF = "ITF";
    private String data;
    private String symbology;
    private int height;
    private int width;
    private String textPosition;
    private String alignment;

    public Barcode() {}

    public Barcode(final String data, final String symbology, final Integer height, final Integer width,
                    final String textPosition, final String alignment) {
        this.data = data;
        this.symbology = symbology;
        if (height == null) {
            this.height = 0;
        } else {
            this.height = height;
        }
        if (width == null) {
            this.width = 0;
        } else {
            this.width = width;
        }
        this.textPosition = textPosition;
        this.alignment = alignment;
    }

    @Override
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String getSymbology() {
        try {
            if (symbology != null) {
                JPOSBarcodeSymbology.valueOf(symbology.toUpperCase()).getJposBarcodeSymbology();
            } else {
                symbology = ITF;
            }
        } catch (IllegalArgumentException e) {
            symbology = ITF;
        }
        return symbology;
    }

    public void setSymbology(String symbology) {
        this.symbology = symbology;
    }

    @Override
    public int getHeight() {
        if (height < 1) {
            height = 100;
        }
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getWidth() {
        if (width < 1) {
            width = 100;
        }
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String getTextPosition() {
        try {
            if (textPosition != null) {
                JPOSBarcodeTextPosition.valueOf(textPosition.toUpperCase()).getJposBarcodeTextPosition();
            } else {
                textPosition = TEXT_POSITION_BELOW;
            }
        } catch (IllegalArgumentException e) {
            textPosition = TEXT_POSITION_BELOW;
        }
        return textPosition;
    }

    public void setTextPosition(String textPosition) {
        this.textPosition = textPosition;
    }

    @Override
    public String getAlignment() {
        try {
            if (alignment != null) {
                JPOSBarcodeAlignment.valueOf(alignment.toUpperCase()).getJposBarcodeAlignment();
            } else {
                alignment = ALIGNMENT_CENTER;
            }
        } catch (IllegalArgumentException e) {
            alignment = ALIGNMENT_CENTER;
        }
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
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + height;
        result = prime * result + ((symbology == null) ? 0 : symbology.hashCode());
        result = prime * result + ((textPosition == null) ? 0 : textPosition.hashCode());
        result = prime * result + width;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Barcode)) {
            return false;
        }
        Barcode barcode = (Barcode) obj;
        return Objects.equals(data, barcode.data) && Objects.equals(alignment, barcode.alignment)
                        && Objects.equals(height, barcode.height) && Objects.equals(symbology, barcode.symbology)
                        && Objects.equals(textPosition, barcode.textPosition) && Objects.equals(width, barcode.width);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Barcode [data=").append(data).append(", symbology=").append(symbology).append(", height=")
                        .append(height).append(", width=").append(width).append(", textPosition=").append(textPosition)
                        .append(", alignment=").append(alignment).append("]");
        return builder.toString();
    }

}
