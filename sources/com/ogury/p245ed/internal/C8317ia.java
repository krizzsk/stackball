package com.ogury.p245ed.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import p269io.presage.mraid.browser.listeners.OrientationListener$1;

/* renamed from: com.ogury.ed.internal.ia */
public final class C8317ia {

    /* renamed from: a */
    private final Context f21493a;

    /* renamed from: b */
    private final C8300hp f21494b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f21495c;

    /* renamed from: d */
    private final BroadcastReceiver f21496d = new OrientationListener$1(this);

    public C8317ia(Context context, C8300hp hpVar) {
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(hpVar, "multiWebViewCommandExecutor");
        this.f21493a = context;
        this.f21494b = hpVar;
        this.f21495c = context.getResources().getConfiguration().orientation;
        m23463b();
    }

    /* renamed from: b */
    private final void m23463b() {
        this.f21493a.registerReceiver(this.f21496d, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m23465c() {
        this.f21494b.mo53682c();
    }

    /* renamed from: a */
    public final void mo53727a() {
        try {
            this.f21493a.unregisterReceiver(this.f21496d);
        } catch (Exception e) {
            C8261gl.m23201a((Throwable) e);
        }
    }
}
