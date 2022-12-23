package com.smaato.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.smaato.sdk.inject.Provider;
import com.smaato.sdk.net.Interceptor;

public interface SmaatoBridge {
    Provider<Activity> activityProvider();

    Interceptor apiCallInterceptor();

    Intent createBrowserIntent(Context context, String str);

    String publisherId();
}
