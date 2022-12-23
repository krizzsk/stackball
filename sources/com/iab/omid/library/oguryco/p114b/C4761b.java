package com.iab.omid.library.oguryco.p114b;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.oguryco.adsession.C4758a;

/* renamed from: com.iab.omid.library.oguryco.b.b */
public class C4761b {

    /* renamed from: a */
    private static C4761b f10731a = new C4761b();

    /* renamed from: b */
    private Context f10732b;

    /* renamed from: c */
    private BroadcastReceiver f10733c;

    /* renamed from: d */
    private boolean f10734d;

    /* renamed from: e */
    private boolean f10735e;

    /* renamed from: f */
    private C4763a f10736f;

    /* renamed from: com.iab.omid.library.oguryco.b.b$a */
    public interface C4763a {
        /* renamed from: a */
        void mo39347a(boolean z);
    }

    private C4761b() {
    }

    /* renamed from: a */
    public static C4761b m10409a() {
        return f10731a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10411a(boolean z) {
        if (this.f10735e != z) {
            this.f10735e = z;
            if (this.f10734d) {
                m10414g();
                C4763a aVar = this.f10736f;
                if (aVar != null) {
                    aVar.mo39347a(mo39345d());
                }
            }
        }
    }

    /* renamed from: e */
    private void m10412e() {
        this.f10733c = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                KeyguardManager keyguardManager;
                if (intent != null) {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        C4761b.this.m10411a(true);
                    } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                        C4761b.this.m10411a(false);
                    } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) && (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) != null && !keyguardManager.inKeyguardRestrictedInputMode()) {
                        C4761b.this.m10411a(false);
                    }
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f10732b.registerReceiver(this.f10733c, intentFilter);
    }

    /* renamed from: f */
    private void m10413f() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.f10732b;
        if (context != null && (broadcastReceiver = this.f10733c) != null) {
            context.unregisterReceiver(broadcastReceiver);
            this.f10733c = null;
        }
    }

    /* renamed from: g */
    private void m10414g() {
        boolean z = !this.f10735e;
        for (C4758a adSessionStatePublisher : C4760a.m10402a().mo39336b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo39394a(z);
        }
    }

    /* renamed from: a */
    public void mo39341a(Context context) {
        this.f10732b = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo39342a(C4763a aVar) {
        this.f10736f = aVar;
    }

    /* renamed from: b */
    public void mo39343b() {
        m10412e();
        this.f10734d = true;
        m10414g();
    }

    /* renamed from: c */
    public void mo39344c() {
        m10413f();
        this.f10734d = false;
        this.f10735e = false;
        this.f10736f = null;
    }

    /* renamed from: d */
    public boolean mo39345d() {
        return !this.f10735e;
    }
}
