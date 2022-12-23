package com.smaato.sdk.net;

import java.io.IOException;

public interface Interceptor {

    public interface Chain {
        Call call();

        long connectTimeoutMillis();

        Response proceed(Request request) throws IOException;

        long readTimeoutMillis();

        Request request();
    }

    Response intercept(Chain chain) throws IOException;
}
