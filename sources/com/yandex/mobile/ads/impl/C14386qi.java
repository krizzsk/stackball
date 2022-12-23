package com.yandex.mobile.ads.impl;

import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.model.VisionDataDBAdapter;
import com.yandex.mobile.ads.impl.ln1;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.qi */
public final class C14386qi implements ln1 {

    /* renamed from: a */
    private final C13413ii f39117a;

    /* renamed from: b */
    private final jn1 f39118b;

    /* renamed from: c */
    private boolean f39119c;

    public C14386qi(C13413ii iiVar, jn1 jn1) {
        Intrinsics.checkNotNullParameter(iiVar, VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE);
        Intrinsics.checkNotNullParameter(jn1, "eventsTracker");
        this.f39117a = iiVar;
        this.f39118b = jn1;
    }

    /* renamed from: a */
    public void mo65756a(View view, List<bk1> list) {
        Intrinsics.checkNotNullParameter(this, "this");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(list, "friendlyOverlays");
    }

    /* renamed from: b */
    public void mo65760b() {
        this.f39118b.mo68069a(new C14100ni().mo69032a(this.f39117a), "creativeRenderingStart");
    }

    /* renamed from: c */
    public void mo65761c() {
        this.f39118b.mo68069a(this.f39117a, "unmute");
    }

    /* renamed from: d */
    public void mo65762d() {
        Intrinsics.checkNotNullParameter(this, "this");
    }

    /* renamed from: e */
    public void mo65763e() {
        this.f39118b.mo68069a(this.f39117a, "complete");
    }

    /* renamed from: f */
    public void mo65764f() {
        this.f39118b.mo68069a(this.f39117a, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    /* renamed from: g */
    public void mo65765g() {
        this.f39118b.mo68069a(this.f39117a, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    /* renamed from: h */
    public void mo65766h() {
        this.f39118b.mo68069a(this.f39117a, "skip");
    }

    /* renamed from: i */
    public void mo65767i() {
        this.f39119c = false;
    }

    /* renamed from: j */
    public void mo65768j() {
        this.f39118b.mo68069a(this.f39117a, "mute");
    }

    /* renamed from: k */
    public void mo65769k() {
        if (!this.f39119c) {
            this.f39119c = true;
            this.f39118b.mo68069a(this.f39117a, "start");
        }
        this.f39118b.mo68069a(this.f39117a, "clickTracking");
    }

    /* renamed from: l */
    public void mo65770l() {
        Intrinsics.checkNotNullParameter(this, "this");
    }

    /* renamed from: m */
    public void mo65771m() {
        Intrinsics.checkNotNullParameter(this, "this");
    }

    /* renamed from: n */
    public void mo65772n() {
        Intrinsics.checkNotNullParameter(this, "this");
    }

    /* renamed from: a */
    public void mo65759a(xk1 xk1) {
        Intrinsics.checkNotNullParameter(this, "this");
        Intrinsics.checkNotNullParameter(xk1, "error");
    }

    /* renamed from: a */
    public void mo65754a(float f) {
        Intrinsics.checkNotNullParameter(this, "this");
    }

    /* renamed from: a */
    public void mo65753a() {
        this.f39118b.mo68069a(this.f39117a, "creativeView");
    }

    /* renamed from: a */
    public void mo65757a(ln1.C13869a aVar) {
        String str;
        Intrinsics.checkNotNullParameter(aVar, "quartile");
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            str = TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE;
        } else if (ordinal == 1) {
            str = "midpoint";
        } else if (ordinal == 2) {
            str = TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f39118b.mo68069a(this.f39117a, str);
    }

    /* renamed from: a */
    public void mo65755a(long j, float f) {
        if (!this.f39119c) {
            this.f39119c = true;
            this.f39118b.mo68069a(this.f39117a, "start");
        }
    }
}
