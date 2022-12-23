package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.h41;

public class nk1 {

    /* renamed from: a */
    private final sn0 f37824a;

    /* renamed from: b */
    private final h41.C13275a f37825b;

    public nk1(Context context, h41.C13275a aVar) {
        this.f37824a = sn0.m42091b(context);
        this.f37825b = aVar;
    }

    /* renamed from: a */
    public void mo69042a() {
        this.f37824a.mo70035a(new h41(h41.C13276b.VIDEO_AD_COMPLETE, this.f37825b.mo66063a()));
    }

    /* renamed from: b */
    public void mo69043b() {
        this.f37824a.mo70035a(new h41(h41.C13276b.VIDEO_AD_START, this.f37825b.mo66063a()));
    }
}
