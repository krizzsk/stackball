package com.fyber.inneractive.sdk.util;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.fyber.inneractive.sdk.util.t */
public final class C3681t {

    /* renamed from: a */
    public List<C3684b> f9971a;

    /* renamed from: b */
    public boolean f9972b;

    /* renamed from: c */
    public Context f9973c;

    /* renamed from: d */
    public BroadcastReceiver f9974d;

    /* renamed from: com.fyber.inneractive.sdk.util.t$a */
    private static class C3683a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C3681t f9976a = new C3681t((byte) 0);
    }

    /* renamed from: com.fyber.inneractive.sdk.util.t$b */
    public interface C3684b {
        /* renamed from: a */
        void mo18459a(boolean z);
    }

    /* synthetic */ C3681t(byte b) {
        this();
    }

    private C3681t() {
        this.f9971a = new CopyOnWriteArrayList();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo19596a(Context context, Intent intent) {
        boolean z;
        try {
            z = ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked();
        } catch (Exception unused) {
            IAlog.m9034b("%sFailed to get lock screen status", IAlog.m9029a((Object) this));
            z = false;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f9972b = true;
        } else if (("android.intent.action.SCREEN_ON".equals(intent.getAction()) && !z) || "android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f9972b = false;
        }
        IAlog.m9034b("%sNew screen state is locked: %s. number of listeners: %d", IAlog.m9029a((Object) this), Boolean.valueOf(this.f9972b), Integer.valueOf(this.f9971a.size()));
        for (C3684b a : this.f9971a) {
            a.mo18459a(this.f9972b);
        }
    }

    /* renamed from: a */
    public final synchronized void mo19595a() {
        if (this.f9973c != null) {
            IAlog.m9034b("%sremoving screen state receiver and destroying singleton", IAlog.m9029a((Object) this));
            this.f9973c.unregisterReceiver(this.f9974d);
            this.f9973c = null;
            this.f9974d = null;
            this.f9971a.clear();
        }
    }
}
