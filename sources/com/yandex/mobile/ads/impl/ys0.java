package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.C12127t;
import com.yandex.mobile.ads.nativeads.NativeAd;

public class ys0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f42930a;

    /* renamed from: b */
    private final ws0 f42931b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final fr0 f42932c;

    /* renamed from: com.yandex.mobile.ads.impl.ys0$b */
    public interface C15272b {
        /* renamed from: a */
        void mo67889a(C12350a2 a2Var);

        /* renamed from: a */
        void mo67890a(NativeAd nativeAd);
    }

    public ys0(Context context, C14645t1 t1Var, C15230y2 y2Var) {
        Context applicationContext = context.getApplicationContext();
        this.f42930a = applicationContext;
        t1Var.mo70083a(C12127t.AD);
        this.f42931b = new ws0(context);
        this.f42932c = new fr0(applicationContext, t1Var, y2Var);
    }

    /* renamed from: a */
    public void mo71111a(AdResponse<String> adResponse, C15272b bVar, g51 g51) {
        this.f42931b.mo70749a(adResponse, new C15271a(adResponse, bVar, g51));
    }

    /* renamed from: a */
    public void mo71110a() {
        this.f42932c.mo67069a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.ys0$a */
    private class C15271a implements g51 {

        /* renamed from: a */
        private final AdResponse<String> f42933a;

        /* renamed from: b */
        private final C15272b f42934b;

        /* renamed from: c */
        private final g51 f42935c;

        /* renamed from: d */
        private final es1 f42936d = new es1();

        C15271a(AdResponse<String> adResponse, C15272b bVar, g51 g51) {
            this.f42933a = adResponse;
            this.f42934b = bVar;
            this.f42935c = g51;
        }

        /* renamed from: a */
        public void mo67201a(as0 as0) {
            this.f42935c.mo67201a(as0);
            AdResponse<String> adResponse = this.f42933a;
            C15272b bVar = this.f42934b;
            ys0.this.f42932c.mo67070a(ys0.this.f42930a, adResponse, as0, this.f42936d.mo66871a(adResponse), new us0(bVar));
        }

        /* renamed from: a */
        public void mo67200a(C12350a2 a2Var) {
            this.f42935c.mo67200a(a2Var);
            this.f42934b.mo67889a(a2Var);
        }
    }
}
