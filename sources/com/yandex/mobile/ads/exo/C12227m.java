package com.yandex.mobile.ads.exo;

import com.yandex.mobile.ads.exo.C12270q;
import com.yandex.mobile.ads.exo.source.TrackGroupArray;
import com.yandex.mobile.ads.exo.trackselection.C12333e;
import com.yandex.mobile.ads.impl.k40;
import com.yandex.mobile.ads.impl.sz0;

/* renamed from: com.yandex.mobile.ads.exo.m */
public interface C12227m {

    /* renamed from: com.yandex.mobile.ads.exo.m$a */
    public interface C12228a {

        /* renamed from: com.yandex.mobile.ads.exo.m$a$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(C12228a _this, C12270q qVar, int i) {
                if (qVar.mo65193c() == 1) {
                    Object obj = qVar.mo65190a(0, new C12270q.C12273c(), 0).f30047c;
                }
            }

            public static void $default$a(C12228a aVar, TrackGroupArray trackGroupArray, C12333e eVar) {
            }

            public static void $default$a(C12228a aVar, k40 k40) {
            }

            public static void $default$a(C12228a aVar, sz0 sz0) {
            }

            public static void $default$onIsPlayingChanged(C12228a aVar, boolean z) {
            }

            public static void $default$onLoadingChanged(C12228a aVar, boolean z) {
            }

            public static void $default$onPlaybackSuppressionReasonChanged(C12228a aVar, int i) {
            }

            public static void $default$onPlayerStateChanged(C12228a aVar, boolean z, int i) {
            }

            public static void $default$onPositionDiscontinuity(C12228a aVar, int i) {
            }

            public static void $default$onSeekProcessed(C12228a aVar) {
            }
        }

        /* renamed from: a */
        void mo64984a(C12270q qVar, int i);

        /* renamed from: a */
        void mo64985a(TrackGroupArray trackGroupArray, C12333e eVar);

        /* renamed from: a */
        void mo64986a(k40 k40);

        /* renamed from: a */
        void mo64987a(sz0 sz0);

        void onIsPlayingChanged(boolean z);

        void onLoadingChanged(boolean z);

        void onPlaybackSuppressionReasonChanged(int i);

        void onPlayerStateChanged(boolean z, int i);

        void onPositionDiscontinuity(int i);

        void onSeekProcessed();
    }

    /* renamed from: a */
    int mo64904a();

    /* renamed from: b */
    long mo64911b();

    /* renamed from: c */
    long mo64913c();

    /* renamed from: d */
    int mo64914d();

    /* renamed from: e */
    boolean mo64915e();

    /* renamed from: f */
    C12270q mo64916f();

    /* renamed from: g */
    int mo64917g();

    /* renamed from: h */
    int mo64918h();

    /* renamed from: i */
    long mo64919i();

    /* renamed from: j */
    int mo64920j();
}
