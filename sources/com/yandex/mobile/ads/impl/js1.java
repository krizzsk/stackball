package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.C12686c0;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.impl.ys0;
import com.yandex.mobile.ads.nativeads.NativeAd;
import java.lang.ref.WeakReference;

public class js1 implements d80 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final WeakReference<m80> f35621a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final pr1 f35622b;

    /* renamed from: c */
    private final ys0 f35623c;

    /* renamed from: d */
    private final C14645t1 f35624d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ks0 f35625e;

    /* renamed from: f */
    private AdResponse<String> f35626f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public NativeAd f35627g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f35628h;

    public js1(m80 m80) {
        this.f35621a = new WeakReference<>(m80);
        Context h = m80.mo64596h();
        C14645t1 d = m80.mo64592d();
        this.f35624d = d;
        this.f35625e = new ks0(d);
        C15230y2 e = m80.mo64593e();
        this.f35622b = new pr1(d);
        this.f35623c = new ys0(h, d, e);
    }

    /* renamed from: b */
    public void mo66525b() {
        AdResponse<String> adResponse;
        m80 m80 = (m80) this.f35621a.get();
        if (m80 != null && (adResponse = this.f35626f) != null && this.f35627g != null) {
            C12686c0 c0Var = new C12686c0(new C12686c0.C12687a(adResponse).mo66173a(this.f35624d.mo70106l()).mo66175a(this.f35627g));
            this.f35626f = null;
            this.f35627g = null;
            m80.mo68613a(c0Var);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.js1$b */
    private final class C13583b implements g51 {

        /* renamed from: a */
        private final Context f35629a;

        /* renamed from: b */
        private final AdResponse f35630b;

        public C13583b(Context context, AdResponse adResponse) {
            this.f35629a = context.getApplicationContext();
            this.f35630b = adResponse;
        }

        /* renamed from: a */
        public void mo67201a(as0 as0) {
            m38028a((h41.C13275a) new ls0(as0));
        }

        /* renamed from: a */
        public void mo67200a(C12350a2 a2Var) {
            m38028a((h41.C13275a) null);
        }

        /* renamed from: a */
        private void m38028a(h41.C13275a aVar) {
            js1.this.f35622b.mo69425a(this.f35629a, this.f35630b, js1.this.f35625e);
            js1.this.f35622b.mo69426b(this.f35629a, this.f35630b, aVar);
        }
    }

    /* renamed from: a */
    public void mo66522a(Context context) {
        this.f35628h = true;
        this.f35626f = null;
        this.f35627g = null;
        this.f35623c.mo71110a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.js1$c */
    private final class C13584c implements ys0.C15272b {
        private C13584c() {
        }

        /* renamed from: a */
        public void mo67890a(NativeAd nativeAd) {
            m80 m80 = (m80) js1.this.f35621a.get();
            if (!js1.this.f35628h && m80 != null) {
                NativeAd unused = js1.this.f35627g = nativeAd;
                m80.onAdLoaded();
            }
        }

        /* renamed from: a */
        public void mo67889a(C12350a2 a2Var) {
            m80 m80 = (m80) js1.this.f35621a.get();
            if (!js1.this.f35628h && m80 != null) {
                NativeAd unused = js1.this.f35627g = null;
                m80.mo64404a(a2Var);
            }
        }
    }

    /* renamed from: a */
    public boolean mo66524a() {
        m80 m80 = (m80) this.f35621a.get();
        return m80 != null && m80.mo64598j();
    }

    /* renamed from: a */
    public void mo66523a(Context context, AdResponse<String> adResponse) {
        if (!this.f35628h) {
            this.f35626f = adResponse;
            this.f35623c.mo71111a(adResponse, new C13584c(), new C13583b(context, adResponse));
        }
    }
}
