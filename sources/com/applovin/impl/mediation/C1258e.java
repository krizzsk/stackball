package com.applovin.impl.mediation;

import com.applovin.impl.sdk.utils.C1553o;

/* renamed from: com.applovin.impl.mediation.e */
public class C1258e {
    public static final C1258e EMPTY = new C1258e(0);
    private final int errorCode;
    private final String errorMessage;

    public C1258e(int i) {
        this(i, "");
    }

    public C1258e(int i, String str) {
        this.errorCode = i;
        this.errorMessage = C1553o.m3555c(str);
    }

    public C1258e(String str) {
        this(-1, str);
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String toString() {
        return "MaxError{errorCode=" + getErrorCode() + ", errorMessage='" + getErrorMessage() + '\'' + '}';
    }
}
