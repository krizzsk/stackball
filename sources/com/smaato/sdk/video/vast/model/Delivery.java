package com.smaato.sdk.video.vast.model;

public enum Delivery {
    PROGRESSIVE,
    STREAMING;

    public static Delivery parse(String str) {
        for (Delivery delivery : values()) {
            if (delivery.name().equalsIgnoreCase(str)) {
                return delivery;
            }
        }
        return null;
    }
}
