package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.c2 */
public final class C12695c2 {

    /* renamed from: a */
    private final Context f31785a;

    /* renamed from: b */
    private final og0 f31786b;

    /* renamed from: c */
    private final gf0 f31787c;

    /* renamed from: d */
    private final vf0 f31788d;

    /* renamed from: e */
    private final mk1<VideoAd> f31789e;

    public C12695c2(Context context, og0 og0, gf0 gf0, vf0 vf0, mk1<VideoAd> mk1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(og0, "adBreak");
        Intrinsics.checkNotNullParameter(gf0, "adPlayerController");
        Intrinsics.checkNotNullParameter(vf0, "adViewsHolderManager");
        Intrinsics.checkNotNullParameter(mk1, "playbackEventsListener");
        this.f31785a = context;
        this.f31786b = og0;
        this.f31787c = gf0;
        this.f31788d = vf0;
        this.f31789e = mk1;
    }

    /* renamed from: a */
    public final C12564b2 mo66188a() {
        C13828l2 l2Var = new C13828l2(this.f31785a, this.f31786b, this.f31787c, this.f31788d, this.f31789e);
        List<ck1<VideoAd>> c = this.f31786b.mo69158c();
        Intrinsics.checkNotNullExpressionValue(c, "adBreak.videoAdInfoList");
        return new C12564b2(l2Var.mo68309a(c));
    }
}
