package com.yandex.mobile.ads.impl;

import android.view.View;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.yandex.mobile.ads.impl.ln1;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

public final class nl1 implements ln1 {

    /* renamed from: a */
    private final lj1 f37846a;

    /* renamed from: b */
    private final jn1 f37847b;

    public nl1(lj1 lj1, jn1 jn1) {
        Intrinsics.checkNotNullParameter(lj1, "videoAd");
        Intrinsics.checkNotNullParameter(jn1, "eventsTracker");
        this.f37846a = lj1;
        this.f37847b = jn1;
    }

    /* renamed from: a */
    public void mo65756a(View view, List<bk1> list) {
        Intrinsics.checkNotNullParameter(this, "this");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(list, "friendlyOverlays");
    }

    /* renamed from: b */
    public void mo65760b() {
        this.f37847b.mo68069a(new ak1().mo65796a(this.f37846a), "renderingStart");
    }

    /* renamed from: c */
    public void mo65761c() {
        Intrinsics.checkNotNullParameter(this, "this");
    }

    /* renamed from: d */
    public void mo65762d() {
        Intrinsics.checkNotNullParameter(this, "this");
    }

    /* renamed from: e */
    public void mo65763e() {
        Intrinsics.checkNotNullParameter(this, "this");
    }

    /* renamed from: f */
    public void mo65764f() {
        Intrinsics.checkNotNullParameter(this, "this");
    }

    /* renamed from: g */
    public void mo65765g() {
        Intrinsics.checkNotNullParameter(this, "this");
    }

    /* renamed from: h */
    public void mo65766h() {
        Intrinsics.checkNotNullParameter(this, "this");
    }

    /* renamed from: i */
    public void mo65767i() {
        Intrinsics.checkNotNullParameter(this, "this");
    }

    /* renamed from: j */
    public void mo65768j() {
        Intrinsics.checkNotNullParameter(this, "this");
    }

    /* renamed from: k */
    public void mo65769k() {
        Intrinsics.checkNotNullParameter(this, "this");
    }

    /* renamed from: l */
    public void mo65770l() {
        Intrinsics.checkNotNullParameter(this, "this");
    }

    /* renamed from: m */
    public void mo65771m() {
        this.f37847b.mo68069a(this.f37846a, "impression");
    }

    /* renamed from: n */
    public void mo65772n() {
        Intrinsics.checkNotNullParameter(this, "this");
    }

    /* renamed from: a */
    public void mo65757a(ln1.C13869a aVar) {
        Intrinsics.checkNotNullParameter(this, "this");
        Intrinsics.checkNotNullParameter(aVar, "quartile");
    }

    /* renamed from: a */
    public void mo65755a(long j, float f) {
        Intrinsics.checkNotNullParameter(this, "this");
    }

    /* renamed from: a */
    public void mo65754a(float f) {
        Intrinsics.checkNotNullParameter(this, "this");
    }

    /* renamed from: a */
    public void mo65753a() {
        this.f37847b.mo68069a(this.f37846a, "render_impression");
    }

    /* renamed from: a */
    public void mo65759a(xk1 xk1) {
        int i;
        Intrinsics.checkNotNullParameter(xk1, "error");
        switch (xk1.mo70909a().ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 25:
            case 26:
                i = ErrorCode.COULD_NOT_DISPLAY_MEDIA_FILE_ERROR;
                break;
            case 7:
                i = ErrorCode.MEDIAFILE_REQUEST_TIMEOUT_ERROR;
                break;
            case 8:
            case 12:
            case 28:
                i = ErrorCode.UNDEFINED_ERROR;
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case 24:
            case 27:
                i = ErrorCode.GENERAL_LINEAR_ERROR;
                break;
            case 19:
                i = ErrorCode.COULD_NOT_FIND_LINEAR_OR_MEDIAFILE_ERROR;
                break;
            case 23:
                i = ErrorCode.COULD_NOT_FIND_SUPPORTED_MEDIA_FILE_ERROR;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.f37847b.mo68070a(this.f37846a, "error", MapsKt.mapOf(TuplesKt.m45515to("[ERRORCODE]", String.valueOf(i))));
    }
}
