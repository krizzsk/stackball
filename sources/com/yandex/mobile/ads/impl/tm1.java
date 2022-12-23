package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.h41;

public class tm1 {

    /* renamed from: a */
    private final sn0 f40382a;

    /* renamed from: b */
    private final tk1 f40383b;

    public tm1(Context context, C14645t1 t1Var, AdResponse adResponse) {
        this.f40382a = sn0.m42091b(context);
        this.f40383b = new tk1(t1Var, adResponse);
    }

    /* renamed from: a */
    public void mo70206a(String str) {
        i41 i41 = new i41(this.f40383b.mo66063a());
        i41.mo67733b("error_message", str);
        this.f40382a.mo70035a(new h41(h41.C13276b.VIDEO_AD_PLAYER_ERROR, i41.mo67729a()));
    }
}
