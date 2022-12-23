package com.smaato.sdk.core.deeplink;

import android.content.Context;
import com.smaato.sdk.core.util.p251fi.Consumer;

public interface UrlResolveListener {
    void onError();

    void onSuccess(Consumer<Context> consumer);
}
