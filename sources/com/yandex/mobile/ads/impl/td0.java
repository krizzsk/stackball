package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.common.AdImpressionData;
import java.util.List;

public class td0 implements xd0, ko0, gm1, v31 {

    /* renamed from: a */
    private final C14668a f40283a;

    /* renamed from: b */
    private final vd0 f40284b;

    /* renamed from: c */
    private final C14351q2 f40285c;

    /* renamed from: d */
    private final Context f40286d;

    /* renamed from: e */
    private List<k81> f40287e;

    /* renamed from: f */
    private AdImpressionData f40288f;

    /* renamed from: com.yandex.mobile.ads.impl.td0$a */
    public interface C14668a {
        /* renamed from: a */
        void mo64359a(AdImpressionData adImpressionData);
    }

    public td0(Context context, C14668a aVar, wd0 wd0, C14351q2 q2Var) {
        this.f40286d = context.getApplicationContext();
        this.f40283a = aVar;
        this.f40285c = q2Var;
        this.f40284b = new vd0(wd0);
    }

    /* renamed from: b */
    private void m42305b() {
        this.f40285c.mo69471a();
        this.f40283a.mo64359a(this.f40288f);
    }

    /* renamed from: h */
    private void m42306h() {
        if (m42307i()) {
            m42305b();
        }
    }

    /* renamed from: i */
    private boolean m42307i() {
        d71 a = l71.m38631c().mo68362a(this.f40286d);
        return a == null || a.mo66466n();
    }

    /* renamed from: j */
    private boolean m42308j() {
        List<k81> list = this.f40287e;
        return list != null && !list.isEmpty();
    }

    /* renamed from: a */
    public void mo70156a(List<k81> list, AdImpressionData adImpressionData) {
        this.f40287e = list;
        this.f40288f = adImpressionData;
        this.f40284b.mo70474a();
    }

    /* renamed from: c */
    public void mo68156c() {
        if (!m42308j()) {
            this.f40284b.mo70475b();
            if (!m42307i()) {
                m42305b();
            }
        }
    }

    /* renamed from: d */
    public void mo69955d() {
        if (m42308j() && !m42307i()) {
            m42305b();
        }
    }

    /* renamed from: e */
    public void mo68157e() {
        if (!m42308j()) {
            this.f40284b.mo70476c();
            m42306h();
        }
    }

    /* renamed from: f */
    public void mo69956f() {
        if (m42308j()) {
            m42306h();
        }
    }

    /* renamed from: g */
    public void mo67331g() {
        if (!m42308j()) {
            this.f40284b.mo70476c();
            m42306h();
        }
    }

    /* renamed from: a */
    public void mo67330a() {
        if (!m42308j()) {
            this.f40284b.mo70475b();
            if (!m42307i()) {
                m42305b();
            }
        }
    }
}
