package com.ogury.p245ed.internal;

import android.util.Log;
import androidx.core.app.NotificationCompat;

/* renamed from: com.ogury.ed.internal.ga */
public final class C8250ga {

    /* renamed from: a */
    public static final C8250ga f21371a = new C8250ga();

    private C8250ga() {
    }

    /* renamed from: a */
    public static void m23180a(String str) {
        C8467mq.m23881b(str, NotificationCompat.CATEGORY_MESSAGE);
        Log.e("OGURY", str);
    }

    /* renamed from: b */
    public static void m23181b(String str) {
        C8467mq.m23881b(str, NotificationCompat.CATEGORY_MESSAGE);
        Log.i("OGURY", str);
    }
}
