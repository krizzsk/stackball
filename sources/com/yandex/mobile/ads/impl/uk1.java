package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.jvm.internal.Intrinsics;

public final class uk1 {

    /* renamed from: com.yandex.mobile.ads.impl.uk1$a */
    public static final class C14767a implements oj1 {

        /* renamed from: a */
        final /* synthetic */ qk1 f40782a;

        C14767a(qk1 qk1) {
            this.f40782a = qk1;
        }

        /* renamed from: a */
        public void mo69173a(ze0 ze0) {
            Intrinsics.checkNotNullParameter(ze0, "videoAdCreativePlayback");
            ((sk1) this.f40782a).mo70013e(ze0.mo71213a());
        }

        /* renamed from: b */
        public void mo69175b(VideoAd videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            ((sk1) this.f40782a).mo70011c(videoAd);
        }

        /* renamed from: c */
        public void mo69176c(VideoAd videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            ((sk1) this.f40782a).mo70018j(videoAd);
        }

        public void onAdCompleted(VideoAd videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            ((sk1) this.f40782a).mo70010b(videoAd);
        }

        public void onAdPaused(VideoAd videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            ((sk1) this.f40782a).mo70012d(videoAd);
        }

        public void onAdResumed(VideoAd videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            ((sk1) this.f40782a).mo70014f(videoAd);
        }

        public void onAdSkipped(VideoAd videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            ((sk1) this.f40782a).mo70015g(videoAd);
        }

        public void onAdStarted(VideoAd videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            ((sk1) this.f40782a).mo70016h(videoAd);
        }

        public void onAdStopped(VideoAd videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            ((sk1) this.f40782a).mo70017i(videoAd);
        }

        public void onVolumeChanged(VideoAd videoAd, float f) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            ((sk1) this.f40782a).mo70009a(videoAd, f);
        }

        /* renamed from: a */
        public void mo69174a(VideoAd videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            ((sk1) this.f40782a).mo70008a(videoAd);
        }
    }

    /* renamed from: a */
    public final oj1 mo70365a(qk1 qk1) {
        Intrinsics.checkNotNullParameter(qk1, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        return new C14767a(qk1);
    }
}
