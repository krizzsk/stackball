package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.C12686c0;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.impl.ys0;
import com.yandex.mobile.ads.nativeads.NativeAd;
import java.lang.ref.WeakReference;

public class is1 implements d80 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final WeakReference<m80> f35009a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final pr1 f35010b;

    /* renamed from: c */
    private final ys0 f35011c;

    /* renamed from: d */
    private final C14645t1 f35012d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ks0 f35013e;

    /* renamed from: f */
    private AdResponse<String> f35014f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public NativeAd f35015g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f35016h;

    public is1(m80 m80) {
        this.f35009a = new WeakReference<>(m80);
        Context h = m80.mo64596h();
        C14645t1 d = m80.mo64592d();
        this.f35012d = d;
        this.f35013e = new ks0(d);
        C15230y2 e = m80.mo64593e();
        this.f35010b = new pr1(d);
        this.f35011c = new ys0(h, d, e);
    }

    /* renamed from: b */
    public void mo66525b() {
        AdResponse<String> adResponse;
        m80 m80 = (m80) this.f35009a.get();
        if (m80 != null && (adResponse = this.f35014f) != null && this.f35015g != null) {
            C12686c0 c0Var = new C12686c0(new C12686c0.C12687a(adResponse).mo66173a(this.f35012d.mo70106l()).mo66175a(this.f35015g));
            this.f35014f = null;
            this.f35015g = null;
            m80.mo68613a(c0Var);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.is1$b */
    private final class C13442b implements g51 {

        /* renamed from: a */
        private final Context f35017a;

        /* renamed from: b */
        private final AdResponse f35018b;

        public C13442b(Context context, AdResponse adResponse) {
            this.f35017a = context.getApplicationContext();
            this.f35018b = adResponse;
        }

        /* renamed from: a */
        public void mo67201a(as0 as0) {
            m37574a((h41.C13275a) new ls0(as0));
        }

        /* renamed from: a */
        public void mo67200a(C12350a2 a2Var) {
            m37574a((h41.C13275a) null);
        }

        /* renamed from: a */
        private void m37574a(h41.C13275a aVar) {
            is1.this.f35010b.mo69425a(this.f35017a, this.f35018b, is1.this.f35013e);
            is1.this.f35010b.mo69426b(this.f35017a, this.f35018b, aVar);
        }
    }

    /* renamed from: a */
    public void mo66522a(Context context) {
        this.f35016h = true;
        this.f35014f = null;
        this.f35015g = null;
        this.f35011c.mo71110a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.is1$c */
    private final class C13443c implements ys0.C15272b {
        private C13443c() {
        }

        /* renamed from: a */
        public void mo67890a(NativeAd nativeAd) {
            m80 m80 = (m80) is1.this.f35009a.get();
            if (!is1.this.f35016h && m80 != null) {
                NativeAd unused = is1.this.f35015g = nativeAd;
                m80.onAdLoaded();
            }
        }

        /* renamed from: a */
        public void mo67889a(C12350a2 a2Var) {
            m80 m80 = (m80) is1.this.f35009a.get();
            if (!is1.this.f35016h && m80 != null) {
                NativeAd unused = is1.this.f35015g = null;
                m80.mo64404a(a2Var);
            }
        }
    }

    /* renamed from: a */
    public boolean mo66524a() {
        m80 m80 = (m80) this.f35009a.get();
        return m80 != null && m80.mo64598j();
    }

    /* renamed from: a */
    public void mo66523a(Context context, AdResponse<String> adResponse) {
        if (!this.f35016h) {
            this.f35014f = adResponse;
            this.f35011c.mo71111a(adResponse, new C13443c(), new C13442b(context, adResponse));
        }
    }
}
