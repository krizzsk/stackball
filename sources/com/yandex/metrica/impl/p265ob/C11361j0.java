package com.yandex.metrica.impl.p265ob;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.yandex.metrica.impl.ob.j0 */
public class C11361j0 {

    /* renamed from: a */
    private final BroadcastReceiver f27142a;

    /* renamed from: b */
    private boolean f27143b = false;

    /* renamed from: com.yandex.metrica.impl.ob.j0$a */
    public static class C11362a {
        /* renamed from: a */
        public C11361j0 mo63058a(BroadcastReceiver broadcastReceiver) {
            return new C11361j0(broadcastReceiver);
        }
    }

    public C11361j0(BroadcastReceiver broadcastReceiver) {
        this.f27142a = broadcastReceiver;
    }

    /* renamed from: a */
    public synchronized Intent mo63056a(Context context, IntentFilter intentFilter) {
        Intent intent;
        try {
            intent = context.registerReceiver(this.f27142a, intentFilter);
            try {
                this.f27143b = true;
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            intent = null;
        }
        return intent;
    }

    /* renamed from: a */
    public synchronized void mo63057a(Context context) {
        if (this.f27143b) {
            try {
                context.unregisterReceiver(this.f27142a);
                this.f27143b = false;
            } catch (Throwable unused) {
            }
        }
    }
}
