package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.k2 */
public final class C13677k2 {

    /* renamed from: a */
    private final Context f35927a;

    /* renamed from: b */
    private final og0 f35928b;

    /* renamed from: c */
    private final C13156g1 f35929c;

    /* renamed from: d */
    private final gf0 f35930d;

    /* renamed from: e */
    private final vf0 f35931e;

    /* renamed from: f */
    private final mk1<VideoAd> f35932f;

    /* renamed from: g */
    private final nn1 f35933g = new nn1();

    public C13677k2(Context context, og0 og0, C13156g1 g1Var, gf0 gf0, vf0 vf0, mk1<VideoAd> mk1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(og0, "adBreak");
        Intrinsics.checkNotNullParameter(g1Var, "adBreakPosition");
        Intrinsics.checkNotNullParameter(gf0, "adPlayerController");
        Intrinsics.checkNotNullParameter(vf0, "adViewsHolderManager");
        Intrinsics.checkNotNullParameter(mk1, "playbackEventsListener");
        this.f35927a = context;
        this.f35928b = og0;
        this.f35929c = g1Var;
        this.f35930d = gf0;
        this.f35931e = vf0;
        this.f35932f = mk1;
    }

    /* renamed from: a */
    public final C13471j2 mo68116a(ck1<VideoAd> ck1) {
        Intrinsics.checkNotNullParameter(ck1, "videoAdInfo");
        ln1 a = this.f35933g.mo69070a(this.f35927a, ck1, this.f35929c);
        ll1 ll1 = new ll1();
        return new C13471j2(ck1, new lg0(this.f35927a, this.f35930d, this.f35931e, this.f35928b, ck1, ll1, a, this.f35932f), ll1, a);
    }
}
