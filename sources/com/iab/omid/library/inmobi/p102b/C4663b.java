package com.iab.omid.library.inmobi.p102b;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.inmobi.adsession.C4660a;

/* renamed from: com.iab.omid.library.inmobi.b.b */
public class C4663b {

    /* renamed from: a */
    private static C4663b f10510a = new C4663b();

    /* renamed from: b */
    private Context f10511b;

    /* renamed from: c */
    private BroadcastReceiver f10512c;

    /* renamed from: d */
    private boolean f10513d;

    /* renamed from: e */
    private boolean f10514e;

    /* renamed from: f */
    private C4665a f10515f;

    /* renamed from: com.iab.omid.library.inmobi.b.b$a */
    public interface C4665a {
        /* renamed from: a */
        void mo38959a(boolean z);
    }

    private C4663b() {
    }

    /* renamed from: a */
    public static C4663b m9978a() {
        return f10510a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9980a(boolean z) {
        if (this.f10514e != z) {
            this.f10514e = z;
            if (this.f10513d) {
                m9983g();
                C4665a aVar = this.f10515f;
                if (aVar != null) {
                    aVar.mo38959a(mo38957d());
                }
            }
        }
    }

    /* renamed from: e */
    private void m9981e() {
        this.f10512c = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                KeyguardManager keyguardManager;
                if (intent != null) {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        C4663b.this.m9980a(true);
                    } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                        C4663b.this.m9980a(false);
                    } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) && (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) != null && !keyguardManager.inKeyguardRestrictedInputMode()) {
                        C4663b.this.m9980a(false);
                    }
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f10511b.registerReceiver(this.f10512c, intentFilter);
    }

    /* renamed from: f */
    private void m9982f() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.f10511b;
        if (context != null && (broadcastReceiver = this.f10512c) != null) {
            context.unregisterReceiver(broadcastReceiver);
            this.f10512c = null;
        }
    }

    /* renamed from: g */
    private void m9983g() {
        boolean z = !this.f10514e;
        for (C4660a adSessionStatePublisher : C4662a.m9971a().mo38948b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo38998a(z);
        }
    }

    /* renamed from: a */
    public void mo38953a(Context context) {
        this.f10511b = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo38954a(C4665a aVar) {
        this.f10515f = aVar;
    }

    /* renamed from: b */
    public void mo38955b() {
        m9981e();
        this.f10513d = true;
        m9983g();
    }

    /* renamed from: c */
    public void mo38956c() {
        m9982f();
        this.f10513d = false;
        this.f10514e = false;
        this.f10515f = null;
    }

    /* renamed from: d */
    public boolean mo38957d() {
        return !this.f10514e;
    }
}
