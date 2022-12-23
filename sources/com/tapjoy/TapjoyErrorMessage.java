package com.tapjoy;

public class TapjoyErrorMessage {

    /* renamed from: a */
    private ErrorType f22268a;

    /* renamed from: b */
    private String f22269b;

    public enum ErrorType {
        INTERNAL_ERROR,
        SDK_ERROR,
        SERVER_ERROR,
        INTEGRATION_ERROR,
        NETWORK_ERROR
    }

    public TapjoyErrorMessage(ErrorType errorType, String str) {
        this.f22268a = errorType;
        this.f22269b = str;
    }

    public ErrorType getType() {
        return this.f22268a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Type=" + this.f22268a.toString());
        sb.append(";Message=" + this.f22269b);
        return sb.toString();
    }
}
