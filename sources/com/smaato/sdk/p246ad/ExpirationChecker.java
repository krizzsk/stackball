package com.smaato.sdk.p246ad;

import com.smaato.sdk.net.Headers;
import com.smaato.sdk.util.Disposable;

/* renamed from: com.smaato.sdk.ad.ExpirationChecker */
public interface ExpirationChecker {
    Disposable schedule(Headers headers, Runnable runnable);
}
