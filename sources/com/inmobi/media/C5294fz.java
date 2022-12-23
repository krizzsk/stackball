package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

/* renamed from: com.inmobi.media.fz */
/* compiled from: DebugBroadcastManager */
public class C5294fz {

    /* renamed from: a */
    private static final String f12110a = C5294fz.class.getName();

    /* renamed from: com.inmobi.media.fz$a */
    /* compiled from: DebugBroadcastManager */
    public enum C5295a {
        NETWORK_REQUEST_RESPONSE,
        PRE_INIT_INSERTED,
        APP_FOCUS_CHANGE
    }

    /* renamed from: a */
    public static void m12116a(Intent intent) {
        intent.getAction();
        Context c = C5314go.m12203c();
        if (c != null) {
            LocalBroadcastManager.getInstance(c).sendBroadcast(intent);
        }
    }
}
