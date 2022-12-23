package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdPlayer;

public class kk0 {

    /* renamed from: a */
    private final Context f36149a;

    /* renamed from: b */
    private final og0 f36150b;

    /* renamed from: c */
    private final C13372i1 f36151c;

    /* renamed from: d */
    private final ok0 f36152d;

    public kk0(Context context, og0 og0, C13372i1 i1Var, ok0 ok0) {
        this.f36149a = context.getApplicationContext();
        this.f36150b = og0;
        this.f36151c = i1Var;
        this.f36152d = ok0;
    }

    /* renamed from: a */
    public jk0 mo68247a(InstreamAdPlayer instreamAdPlayer) {
        return new jk0(this.f36149a, this.f36150b, new gf0(instreamAdPlayer), this.f36151c, this.f36152d);
    }
}
