package com.iab.omid.library.smaato.p120b;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.smaato.adsession.C4809a;

/* renamed from: com.iab.omid.library.smaato.b.b */
public class C4812b {

    /* renamed from: a */
    private static C4812b f10847a = new C4812b();

    /* renamed from: b */
    private Context f10848b;

    /* renamed from: c */
    private BroadcastReceiver f10849c;

    /* renamed from: d */
    private boolean f10850d;

    /* renamed from: e */
    private boolean f10851e;

    /* renamed from: f */
    private C4814a f10852f;

    /* renamed from: com.iab.omid.library.smaato.b.b$a */
    public interface C4814a {
        /* renamed from: a */
        void mo39525a(boolean z);
    }

    private C4812b() {
    }

    /* renamed from: a */
    public static C4812b m10638a() {
        return f10847a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10640a(boolean z) {
        if (this.f10851e != z) {
            this.f10851e = z;
            if (this.f10850d) {
                m10643g();
                C4814a aVar = this.f10852f;
                if (aVar != null) {
                    aVar.mo39525a(mo39523d());
                }
            }
        }
    }

    /* renamed from: e */
    private void m10641e() {
        this.f10849c = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                KeyguardManager keyguardManager;
                if (intent != null) {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        C4812b.this.m10640a(true);
                    } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                        C4812b.this.m10640a(false);
                    } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) && (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) != null && !keyguardManager.inKeyguardRestrictedInputMode()) {
                        C4812b.this.m10640a(false);
                    }
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f10848b.registerReceiver(this.f10849c, intentFilter);
    }

    /* renamed from: f */
    private void m10642f() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.f10848b;
        if (context != null && (broadcastReceiver = this.f10849c) != null) {
            context.unregisterReceiver(broadcastReceiver);
            this.f10849c = null;
        }
    }

    /* renamed from: g */
    private void m10643g() {
        boolean z = !this.f10851e;
        for (C4809a adSessionStatePublisher : C4811a.m10631a().mo39514b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo39563a(z);
        }
    }

    /* renamed from: a */
    public void mo39519a(Context context) {
        this.f10848b = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo39520a(C4814a aVar) {
        this.f10852f = aVar;
    }

    /* renamed from: b */
    public void mo39521b() {
        m10641e();
        this.f10850d = true;
        m10643g();
    }

    /* renamed from: c */
    public void mo39522c() {
        m10642f();
        this.f10850d = false;
        this.f10851e = false;
        this.f10852f = null;
    }

    /* renamed from: d */
    public boolean mo39523d() {
        return !this.f10851e;
    }
}
