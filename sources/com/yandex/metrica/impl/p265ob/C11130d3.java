package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.yandex.metrica.impl.p265ob.C11361j0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.d3 */
public class C11130d3 implements C10237F2 {

    /* renamed from: a */
    private final List<C10791Tm<Context, Intent, Void>> f26678a;

    /* renamed from: b */
    private boolean f26679b;

    /* renamed from: c */
    private boolean f26680c;

    /* renamed from: d */
    private final Context f26681d;

    /* renamed from: e */
    private final C11361j0 f26682e;

    /* renamed from: com.yandex.metrica.impl.ob.d3$a */
    class C11131a implements C10762Sm<Context, Intent> {
        C11131a() {
        }

        /* renamed from: a */
        public void mo61639a(Object obj, Object obj2) {
            C11130d3.m28691a(C11130d3.this, (Context) obj, (Intent) obj2);
        }
    }

    public C11130d3(Context context, C11769sn snVar) {
        this(context, snVar, new C11361j0.C11362a());
    }

    /* renamed from: a */
    public synchronized void mo61207a() {
        this.f26680c = true;
        if (!this.f26678a.isEmpty()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            this.f26682e.mo63056a(this.f26681d, intentFilter);
            this.f26679b = true;
        }
    }

    /* renamed from: b */
    public synchronized void mo61209b() {
        this.f26680c = false;
        if (this.f26679b) {
            this.f26682e.mo63057a(this.f26681d);
            this.f26679b = false;
        }
    }

    C11130d3(Context context, C11769sn snVar, C11361j0.C11362a aVar) {
        this.f26678a = new ArrayList();
        this.f26679b = false;
        this.f26680c = false;
        this.f26681d = context;
        this.f26682e = aVar.mo63058a(new C11663pm(new C11131a(), snVar));
    }

    /* renamed from: b */
    public synchronized void mo62740b(C10791Tm<Context, Intent, Void> tm) {
        this.f26678a.remove(tm);
        if (this.f26678a.isEmpty() && this.f26679b) {
            this.f26682e.mo63057a(this.f26681d);
            this.f26679b = false;
        }
    }

    /* renamed from: a */
    public synchronized void mo62739a(C10791Tm<Context, Intent, Void> tm) {
        this.f26678a.add(tm);
        if (this.f26680c && !this.f26679b) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            this.f26682e.mo63056a(this.f26681d, intentFilter);
            this.f26679b = true;
        }
    }

    /* renamed from: a */
    static void m28691a(C11130d3 d3Var, Context context, Intent intent) {
        synchronized (d3Var) {
            for (C10791Tm<Context, Intent, Void> a : d3Var.f26678a) {
                a.mo61165a(context, intent);
            }
        }
    }
}
