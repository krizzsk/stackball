package com.smaato.sdk.net;

import java.io.IOException;

public interface Call {

    public interface Factory {
        Call newCall(Request request);
    }

    void cancel();

    void enqueue(Callback callback);

    Response execute() throws IOException;

    Request request();
}
