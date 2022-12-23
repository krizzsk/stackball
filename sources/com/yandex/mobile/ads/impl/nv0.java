package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.g30;
import com.yandex.mobile.ads.impl.kn0;
import com.yandex.mobile.ads.impl.nv0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

class nv0 {

    /* renamed from: a */
    private final kn0 f37918a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f37919b = new Object();

    /* renamed from: c */
    private final Handler f37920c;

    /* renamed from: d */
    private final Executor f37921d;

    /* renamed from: com.yandex.mobile.ads.impl.nv0$a */
    class C14136a implements kn0.C13731b {

        /* renamed from: a */
        final /* synthetic */ List f37922a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f37923b;

        C14136a(List list, CountDownLatch countDownLatch) {
            this.f37922a = list;
            this.f37923b = countDownLatch;
        }

        /* renamed from: a */
        public void mo69082a(JSONObject jSONObject) {
            if (jSONObject != null) {
                synchronized (nv0.this.f37919b) {
                    this.f37922a.add(jSONObject);
                }
            }
            this.f37923b.countDown();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nv0$b */
    public interface C14137b {
    }

    public nv0(wm0 wm0) {
        this.f37918a = new kn0(wm0);
        this.f37920c = new Handler(Looper.getMainLooper());
        this.f37921d = pj0.m40784a().mo69371b();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m40171a(Context context, List<hn0> list, C14137b bVar) {
        ArrayList arrayList = new ArrayList(list.size());
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        C12373ac acVar = new C12373ac();
        for (hn0 a : list) {
            this.f37918a.mo68254a(context, a, acVar, new C14136a(arrayList, countDownLatch));
        }
        this.f37921d.execute(new Runnable(countDownLatch, arrayList, acVar, bVar) {
            public final /* synthetic */ CountDownLatch f$1;
            public final /* synthetic */ List f$2;
            public final /* synthetic */ C12373ac f$3;
            public final /* synthetic */ nv0.C14137b f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                nv0.this.m40172a(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    /* renamed from: b */
    public void mo69081b(Context context, List<hn0> list, C14137b bVar) {
        this.f37920c.post(new Runnable(context, list, bVar) {
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ List f$2;
            public final /* synthetic */ nv0.C14137b f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                nv0.this.m40171a(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m40172a(CountDownLatch countDownLatch, List list, C12373ac acVar, C14137b bVar) {
        try {
            countDownLatch.await(1000, TimeUnit.MILLISECONDS);
            acVar.mo65720b();
            synchronized (this.f37919b) {
                ((g30.C13169b) bVar).mo67179a(new JSONArray(list));
            }
        } catch (InterruptedException unused) {
        }
    }
}
