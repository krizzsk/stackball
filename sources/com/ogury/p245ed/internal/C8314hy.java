package com.ogury.p245ed.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import p269io.presage.mraid.browser.listeners.CloseSystemDialogsListener$1;

/* renamed from: com.ogury.ed.internal.hy */
public final class C8314hy {

    /* renamed from: a */
    private final Context f21481a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8300hp f21482b;

    /* renamed from: c */
    private final BroadcastReceiver f21483c = new CloseSystemDialogsListener$1(this);

    public C8314hy(Context context, C8300hp hpVar) {
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(hpVar, "multiWebViewCommandExecutor");
        this.f21481a = context;
        this.f21482b = hpVar;
        m23442b();
    }

    /* renamed from: b */
    private final void m23442b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.f21481a.registerReceiver(this.f21483c, intentFilter);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m23444c() {
        this.f21482b.mo53681b();
    }

    /* renamed from: a */
    public final void mo53722a() {
        try {
            this.f21481a.unregisterReceiver(this.f21483c);
        } catch (Throwable th) {
            C8261gl.m23201a(th);
        }
    }
}
