package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdView;
import java.lang.ref.WeakReference;
import java.util.List;

public class uf0 {

    /* renamed from: a */
    private final WeakReference<InstreamAdView> f40638a;

    /* renamed from: b */
    private final List<bk1> f40639b;

    public uf0(InstreamAdView instreamAdView, List<bk1> list) {
        this.f40638a = new WeakReference<>(instreamAdView);
        this.f40639b = list;
    }

    /* renamed from: a */
    public List<bk1> mo70345a() {
        return this.f40639b;
    }

    /* renamed from: b */
    public InstreamAdView mo70346b() {
        return (InstreamAdView) this.f40638a.get();
    }
}
