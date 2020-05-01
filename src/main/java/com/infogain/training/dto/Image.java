package com.infogain.training.dto;

import java.util.Objects;

import com.infogain.training.RecieptElementType;
import com.infogain.training.constants.JPOSImageAlignment;

/**
 * Copyright (c) 2019 FedEx. All Rights Reserved.<br>
 * <br>
 * Theme - Core Retail Peripheral Services<br>
 * Feature - Peripheral Services - Design and Architecture<br>
 * Description - This class is a model class for Image
 * 
 * @author Puneet Gupta [3696361]
 * @version 1.0.0
 * @since 09-Jul-2019
 */
public class Image implements RecieptElementType {

    private static final String CENTER = "center";
    private String alignment;
    private String url;
    private String originalUrl;

    @Override
    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public Image() {}

    public Image(final String alignment, final String url) {
        this.alignment = alignment;
        this.url = url;
    }

    public Image(String alignment, String url, String originalUrl) {
        this(alignment, url);
        this.originalUrl = originalUrl;
    }

    @Override
    public String getAlignment() {
        try {
            if (alignment != null) {
                JPOSImageAlignment.valueOf(alignment.toUpperCase()).getJposImageAlignment();
            } else {
                alignment = CENTER;
            }
        } catch (IllegalArgumentException e) {
            alignment = CENTER;
        }
        return alignment;
    }

    public void setAlignment(String alignment) {

        this.alignment = alignment;
    }

    @Override
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((alignment == null) ? 0 : alignment.hashCode());
        result = prime * result + ((url == null) ? 0 : url.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        return Objects.equals(url, image.url) && Objects.equals(alignment, image.alignment);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Image [alignment=").append(alignment).append(", url=").append(originalUrl).append("]");
        return builder.toString();
    }

}
