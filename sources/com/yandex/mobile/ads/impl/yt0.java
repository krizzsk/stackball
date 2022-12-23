package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.mobile.ads.impl.C13325hj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class yt0 {

    /* renamed from: a */
    private final Object f42953a = new Object();

    /* renamed from: b */
    private final Context f42954b;

    /* renamed from: c */
    private final C13325hj.C13326a f42955c;

    /* renamed from: d */
    private final ul1 f42956d;

    /* renamed from: e */
    private final t40 f42957e;

    /* renamed from: f */
    private final Map<C13504jj, AtomicBoolean> f42958f;

    public yt0(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f42954b = applicationContext;
        this.f42956d = ul1.m42746a();
        this.f42957e = t40.m42252a();
        this.f42958f = new HashMap();
        this.f42955c = new C12981ek(applicationContext, new do0().mo66647a(context));
    }

    /* renamed from: a */
    public void mo71126a() {
        synchronized (this.f42953a) {
            Iterator it = new ArrayList(this.f42958f.values()).iterator();
            while (it.hasNext()) {
                ((AtomicBoolean) it.next()).set(true);
            }
            this.f42958f.clear();
        }
    }

    /* renamed from: a */
    public void mo71127a(String str, vl1 vl1) {
        synchronized (this.f42953a) {
            C13504jj jjVar = new C13504jj(Uri.parse(str), 0);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.f42958f.put(jjVar, atomicBoolean);
            this.f42956d.mo70371b().execute(new Runnable(jjVar, vl1, atomicBoolean) {
                public final /* synthetic */ C13504jj f$1;
                public final /* synthetic */ vl1 f$2;
                public final /* synthetic */ AtomicBoolean f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void run() {
                    yt0.this.m44430a(this.f$1, this.f$2, this.f$3);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m44430a(C13504jj jjVar, vl1 vl1, AtomicBoolean atomicBoolean) {
        try {
            C15041wd.m43578a(jjVar, this.f42957e.mo70127a(this.f42954b), this.f42955c.mo66840a(), new C14667td(vl1), atomicBoolean);
        } catch (IOException unused) {
            vl1.mo66121a();
        } catch (InterruptedException unused2) {
            if (!atomicBoolean.get()) {
                vl1.mo66121a();
            }
        }
        synchronized (this.f42953a) {
            this.f42958f.remove(jjVar);
        }
    }
}
