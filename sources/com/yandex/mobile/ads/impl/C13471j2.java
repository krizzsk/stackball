package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.j2 */
public final class C13471j2 {

    /* renamed from: a */
    private final ck1<VideoAd> f35106a;

    /* renamed from: b */
    private final lg0 f35107b;

    /* renamed from: c */
    private final ll1 f35108c;

    /* renamed from: d */
    private final ln1 f35109d;

    public C13471j2(ck1<VideoAd> ck1, lg0 lg0, ll1 ll1, ln1 ln1) {
        Intrinsics.checkNotNullParameter(ck1, "videoAdInfo");
        Intrinsics.checkNotNullParameter(lg0, "playbackController");
        Intrinsics.checkNotNullParameter(ll1, "statusController");
        Intrinsics.checkNotNullParameter(ln1, "videoTracker");
        this.f35106a = ck1;
        this.f35107b = lg0;
        this.f35108c = ll1;
        this.f35109d = ln1;
    }

    /* renamed from: a */
    public final lg0 mo67916a() {
        return this.f35107b;
    }

    /* renamed from: b */
    public final ll1 mo67917b() {
        return this.f35108c;
    }

    /* renamed from: c */
    public final ck1<VideoAd> mo67918c() {
        return this.f35106a;
    }

    /* renamed from: d */
    public final ln1 mo67919d() {
        return this.f35109d;
    }
}
