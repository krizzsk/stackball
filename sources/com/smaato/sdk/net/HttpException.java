package com.smaato.sdk.net;

import java.io.IOException;

public class HttpException extends IOException {
    private final int responseCode;

    HttpException(Throwable th, int i) {
        super(th);
        this.responseCode = i;
    }

    public int getResponseCode() {
        return this.responseCode;
    }
}
