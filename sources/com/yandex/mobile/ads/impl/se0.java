package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.qj1;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.jvm.internal.Intrinsics;

public final class se0 implements oj1 {

    /* renamed from: a */
    private final rj1 f39940a = new rj1();

    /* renamed from: b */
    private final sj1 f39941b = new sj1();

    /* renamed from: c */
    private final tj1 f39942c = new tj1();

    /* renamed from: d */
    private mj1 f39943d;

    /* renamed from: e */
    private nj1 f39944e;

    /* renamed from: f */
    private qj1 f39945f;

    /* renamed from: a */
    public final void mo69959a(mj1 mj1) {
        if (mj1 != null) {
            this.f39941b.getClass();
            if (!(mj1.mo68709a() != null)) {
                return;
            }
        }
        this.f39943d = mj1;
        m41932a();
    }

    /* renamed from: a */
    public void mo69174a(VideoAd videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
    }

    /* renamed from: b */
    public void mo69175b(VideoAd videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
    }

    /* renamed from: c */
    public void mo69176c(VideoAd videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
    }

    public void onAdCompleted(VideoAd videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
    }

    public void onAdPaused(VideoAd videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
    }

    public void onAdResumed(VideoAd videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
    }

    public void onAdSkipped(VideoAd videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
    }

    public void onAdStarted(VideoAd videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
    }

    public void onAdStopped(VideoAd videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
    }

    public void onVolumeChanged(VideoAd videoAd, float f) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        if ((r0.getParent() != null) == false) goto L_0x0053;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69960a(com.yandex.mobile.ads.impl.nj1 r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0055
            com.yandex.mobile.ads.impl.tj1 r0 = r5.f39942c
            r0.getClass()
            com.yandex.mobile.ads.video.playback.view.VideoAdControlsContainer r0 = r6.mo69039e()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
            android.view.View r2 = r6.mo69037c()
            r1.add(r2)
            android.view.View r2 = r6.mo69038d()
            r1.add(r2)
            android.view.View r2 = r6.mo69035a()
            r1.add(r2)
            android.view.View r2 = r6.mo69036b()
            r1.add(r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0033:
            boolean r2 = r1.hasNext()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r1.next()
            if (r2 != 0) goto L_0x0033
            r1 = 1
            goto L_0x0044
        L_0x0043:
            r1 = 0
        L_0x0044:
            if (r1 != 0) goto L_0x0052
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x004e
            r0 = 1
            goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            if (r0 != 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r3 = 0
        L_0x0053:
            if (r3 == 0) goto L_0x005a
        L_0x0055:
            r5.f39944e = r6
            r5.m41932a()
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.se0.mo69960a(com.yandex.mobile.ads.impl.nj1):void");
    }

    /* renamed from: a */
    public void mo69173a(ze0 ze0) {
        Intrinsics.checkNotNullParameter(ze0, "videoAdCreativePlayback");
        qj1 qj1 = this.f39945f;
        if (qj1 != null) {
            ze0.mo71214a(qj1);
        }
    }

    /* renamed from: a */
    private final void m41932a() {
        qj1 qj1;
        nj1 nj1 = this.f39944e;
        mj1 mj1 = this.f39943d;
        if (nj1 == null || mj1 == null) {
            qj1 = null;
        } else {
            this.f39940a.getClass();
            qj1 = new qj1.C14389b(nj1.mo69039e()).mo69614a(mj1.mo68709a()).mo69611a(nj1.mo69037c()).mo69615a((iq0) new lq0(nj1.mo69038d())).mo69617b(nj1.mo69036b()).mo69616a();
        }
        this.f39945f = qj1;
    }
}
