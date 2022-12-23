package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.fr0;
import com.yandex.mobile.ads.impl.jt0;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class fr0 {

    /* renamed from: a */
    private final Executor f33586a = Executors.newSingleThreadExecutor(new oq0("YandexMobileAds.BaseController"));
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C14645t1 f33587b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final hr0 f33588c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final jt0 f33589d;

    public fr0(Context context, C14645t1 t1Var, C15230y2 y2Var) {
        this.f33587b = t1Var;
        this.f33588c = new hr0(t1Var);
        this.f33589d = new jt0(context, y2Var);
    }

    /* renamed from: a */
    public void mo67070a(Context context, AdResponse<?> adResponse, as0 as0, or0 or0, er0 er0) {
        this.f33586a.execute(new C13110a(context, adResponse, as0, or0, er0));
    }

    /* renamed from: a */
    public void mo67069a() {
        this.f33589d.mo68090a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.fr0$a */
    class C13110a implements Runnable {

        /* renamed from: b */
        private final or0 f33590b;

        /* renamed from: c */
        private final WeakReference<Context> f33591c;

        /* renamed from: d */
        private final AdResponse<?> f33592d;

        /* renamed from: e */
        private final as0 f33593e;

        /* renamed from: f */
        private final er0 f33594f;

        C13110a(Context context, AdResponse<?> adResponse, as0 as0, or0 or0, er0 er0) {
            this.f33592d = adResponse;
            this.f33593e = as0;
            this.f33590b = or0;
            this.f33591c = new WeakReference<>(context);
            this.f33594f = er0;
        }

        /* renamed from: a */
        private void m36192a(Context context, C14645t1 t1Var, vq0 vq0, er0 er0) {
            if (t1Var.mo70111q()) {
                bz0 bz0 = new bz0();
                fr0.this.f33589d.mo68091a(vq0, bz0, new jt0.C13586a(context, vq0, bz0, er0) {
                    public final /* synthetic */ Context f$1;
                    public final /* synthetic */ vq0 f$2;
                    public final /* synthetic */ ed0 f$3;
                    public final /* synthetic */ er0 f$4;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                    }

                    /* renamed from: a */
                    public final void mo65503a() {
                        fr0.C13110a.this.m36193a(this.f$1, this.f$2, this.f$3, this.f$4);
                    }
                });
                return;
            }
            Context context2 = context;
            vq0 vq02 = vq0;
            fr0.this.f33588c.mo67612a(context2, vq02, new C14379qd(context), this.f33590b, er0);
        }

        public void run() {
            Context context = (Context) this.f33591c.get();
            if (context != null) {
                try {
                    as0 as0 = this.f33593e;
                    if (as0 == null) {
                        this.f33594f.mo66860a(C14559s3.f39812e);
                        return;
                    }
                    if (C13378i5.m37281a(as0.mo65856c())) {
                        this.f33594f.mo66860a(C14559s3.f39817j);
                        return;
                    }
                    m36192a(context, fr0.this.f33587b, new vq0(this.f33593e, this.f33592d, fr0.this.f33587b), this.f33594f);
                } catch (Exception unused) {
                    this.f33594f.mo66860a(C14559s3.f39812e);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m36193a(Context context, vq0 vq0, ed0 ed0, er0 er0) {
            fr0.this.f33588c.mo67612a(context, vq0, ed0, this.f33590b, er0);
        }
    }
}
