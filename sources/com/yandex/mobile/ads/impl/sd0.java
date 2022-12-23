package com.yandex.mobile.ads.impl;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class sd0 implements o70, gm1, xd0, ko0, v31 {

    /* renamed from: a */
    private final Set<o70> f39934a = new LinkedHashSet();

    /* renamed from: b */
    private final Set<gm1> f39935b = new LinkedHashSet();

    /* renamed from: c */
    private final Set<v31> f39936c = new LinkedHashSet();

    /* renamed from: d */
    private final Set<xd0> f39937d = new LinkedHashSet();

    /* renamed from: e */
    private final Set<ko0> f39938e = new LinkedHashSet();

    /* renamed from: a */
    public final void mo69952a(o70 o70) {
        Intrinsics.checkNotNullParameter(o70, "forceImpressionTrackingListener");
        this.f39934a.add(o70);
    }

    /* renamed from: b */
    public void mo68930b() {
        for (o70 b : this.f39934a) {
            b.mo68930b();
        }
    }

    /* renamed from: c */
    public void mo68156c() {
        for (ko0 c : this.f39938e) {
            c.mo68156c();
        }
    }

    /* renamed from: d */
    public void mo69955d() {
        for (v31 d : this.f39936c) {
            d.mo69955d();
        }
    }

    /* renamed from: e */
    public void mo68157e() {
        for (ko0 e : this.f39938e) {
            e.mo68157e();
        }
    }

    /* renamed from: f */
    public void mo69956f() {
        for (xd0 f : this.f39937d) {
            f.mo69956f();
        }
    }

    /* renamed from: g */
    public void mo67331g() {
        for (gm1 g : this.f39935b) {
            g.mo67331g();
        }
    }

    /* renamed from: a */
    public final void mo69954a(xd0 xd0) {
        Intrinsics.checkNotNullParameter(xd0, "impressionTrackingListener");
        this.f39937d.add(xd0);
    }

    /* renamed from: a */
    public final void mo69950a(gm1 gm1) {
        Intrinsics.checkNotNullParameter(gm1, "videoImpressionTrackingListener");
        this.f39935b.add(gm1);
    }

    /* renamed from: a */
    public final void mo69951a(ko0 ko0) {
        Intrinsics.checkNotNullParameter(ko0, "mobileAdsSchemeImpressionListener");
        this.f39938e.add(ko0);
    }

    /* renamed from: a */
    public final void mo69953a(v31 v31) {
        Intrinsics.checkNotNullParameter(v31, "impressionTrackingListener");
        this.f39936c.add(v31);
    }

    /* renamed from: a */
    public void mo67330a() {
        for (gm1 a : this.f39935b) {
            a.mo67330a();
        }
    }
}
