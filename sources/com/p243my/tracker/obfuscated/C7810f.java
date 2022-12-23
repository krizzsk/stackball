package com.p243my.tracker.obfuscated;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.my.tracker.obfuscated.f */
final class C7810f {

    /* renamed from: a */
    int f19875a = 1;

    /* renamed from: b */
    int f19876b = -1;

    C7810f() {
    }

    /* renamed from: a */
    public void mo52286a(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            this.f19875a = 1;
            this.f19876b = -1;
            return;
        }
        int intExtra = registerReceiver.getIntExtra("level", -1);
        int intExtra2 = registerReceiver.getIntExtra("scale", -1);
        this.f19875a = registerReceiver.getIntExtra("status", 1);
        if (intExtra < 0 || intExtra2 <= 0) {
            this.f19876b = -1;
        } else {
            this.f19876b = (intExtra * 100) / intExtra2;
        }
    }

    /* renamed from: a */
    public void mo52287a(C7831m0 m0Var, Context context) {
        m0Var.mo52423f(this.f19875a);
        int i = this.f19876b;
        if (i >= 0) {
            m0Var.mo52418e(i);
        }
    }

    /* renamed from: b */
    public void mo52288b(Context context) {
    }
}
