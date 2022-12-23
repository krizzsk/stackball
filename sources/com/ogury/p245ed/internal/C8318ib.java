package com.ogury.p245ed.internal;

import android.content.Context;
import android.content.pm.ShortcutManager;

/* renamed from: com.ogury.ed.internal.ib */
public final class C8318ib {
    /* renamed from: a */
    public static ShortcutManager m23467a(Context context) {
        C8467mq.m23881b(context, "context");
        Object systemService = context.getSystemService(ShortcutManager.class);
        C8467mq.m23878a(systemService, "context.getSystemService…rtcutManager::class.java)");
        return (ShortcutManager) systemService;
    }
}
