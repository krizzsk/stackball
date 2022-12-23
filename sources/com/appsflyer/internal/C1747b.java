package com.appsflyer.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.appsflyer.internal.b */
public final class C1747b {

    /* renamed from: ɩ */
    private IntentFilter f4163 = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: com.appsflyer.internal.b$d */
    public static final class C1749d {

        /* renamed from: ι */
        public static final C1747b f4166 = new C1747b();
    }

    C1747b() {
    }

    /* renamed from: Ι */
    public final C1748a mo14075(Context context) {
        String str = null;
        float f = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, this.f4163);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra("status", -1)) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    str = intExtra != 1 ? intExtra != 2 ? intExtra != 4 ? "other" : "wireless" : "usb" : "ac";
                } else {
                    str = "no";
                }
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (!(-1 == intExtra2 || -1 == intExtra3)) {
                    f = (((float) intExtra2) * 100.0f) / ((float) intExtra3);
                }
            }
        } catch (Throwable unused) {
        }
        return new C1748a(f, str);
    }

    /* renamed from: com.appsflyer.internal.b$a */
    public static final class C1748a {

        /* renamed from: Ι */
        public final float f4164;

        /* renamed from: ι */
        public final String f4165;

        C1748a(float f, String str) {
            this.f4164 = f;
            this.f4165 = str;
        }
    }
}
