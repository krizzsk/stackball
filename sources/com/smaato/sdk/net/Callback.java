package com.smaato.sdk.net;

public interface Callback {
    void onFailure(Call call, Exception exc);

    void onResponse(Call call, Response response);
}
