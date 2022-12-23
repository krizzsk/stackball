package com.ogury.core.internal.network;

/* compiled from: OguryNetworkException.kt */
public final class OguryNetworkException extends Exception {

    /* renamed from: a */
    private final int f20776a;

    public OguryNetworkException(int i) {
        super("Received " + i + " from the server");
        this.f20776a = i;
    }

    public final int getResponseCode() {
        return this.f20776a;
    }
}
