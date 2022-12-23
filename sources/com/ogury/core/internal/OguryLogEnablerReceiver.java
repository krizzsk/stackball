package com.ogury.core.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;

/* compiled from: OguryLogEnablerReceiver.kt */
public final class OguryLogEnablerReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        C7921ai.m22144b(context, "context");
        C7921ai.m22144b(intent, SDKConstants.PARAM_INTENT);
        if (C7936av.m22162a(intent.getAction(), "com.ogury.sdk.intent.ENABLE_LOGS", false, 2) && intent.hasExtra("level")) {
            Bundle extras = intent.getExtras();
            Integer valueOf = extras != null ? Integer.valueOf(extras.getInt("level")) : null;
            if (valueOf != null) {
                OguryIntegrationLogger.setLevel(valueOf.intValue());
            }
        }
    }
}
