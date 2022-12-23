package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jg0;
import com.yandex.mobile.ads.impl.xk1;
import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdPlayerListener;
import com.yandex.mobile.ads.instream.player.p267ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.MediaFile;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

public class kg0 implements wk1<VideoAd> {

    /* renamed from: a */
    private final gf0 f36124a;

    /* renamed from: b */
    private final VideoAd f36125b;

    /* renamed from: c */
    private C13707a f36126c;

    /* renamed from: com.yandex.mobile.ads.impl.kg0$a */
    private static class C13707a implements InstreamAdPlayerListener {

        /* renamed from: a */
        private final jg0 f36127a = new jg0();

        /* renamed from: b */
        private final yk1 f36128b;

        C13707a(yk1 yk1) {
            this.f36128b = yk1;
        }

        public void onAdBufferingFinished(VideoAd videoAd) {
            this.f36128b.mo67194g(videoAd.getMediaFile());
        }

        public void onAdBufferingStarted(VideoAd videoAd) {
            this.f36128b.mo67191d(videoAd.getMediaFile());
        }

        public void onAdCompleted(VideoAd videoAd) {
            this.f36128b.mo67189b(videoAd.getMediaFile());
        }

        public void onAdPaused(VideoAd videoAd) {
            this.f36128b.mo67190c(videoAd.getMediaFile());
        }

        public void onAdPrepared(VideoAd videoAd) {
            this.f36128b.mo67196i(videoAd.getMediaFile());
        }

        public void onAdResumed(VideoAd videoAd) {
            this.f36128b.mo67192e(videoAd.getMediaFile());
        }

        public void onAdSkipped(VideoAd videoAd) {
            this.f36128b.mo67193f(videoAd.getMediaFile());
        }

        public void onAdStarted(VideoAd videoAd) {
            this.f36128b.mo67195h(videoAd.getMediaFile());
        }

        public void onAdStopped(VideoAd videoAd) {
            this.f36128b.mo67186a(videoAd.getMediaFile());
        }

        public void onError(VideoAd videoAd, InstreamAdPlayerError instreamAdPlayerError) {
            xk1.C15176a aVar;
            yk1 yk1 = this.f36128b;
            MediaFile mediaFile = videoAd.getMediaFile();
            this.f36127a.getClass();
            Intrinsics.checkNotNullParameter(instreamAdPlayerError, "instreamAdPlayerError");
            switch (jg0.C13499a.f35292a[instreamAdPlayerError.getReason().ordinal()]) {
                case 1:
                    aVar = xk1.C15176a.RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER;
                    break;
                case 2:
                    aVar = xk1.C15176a.RENDERER_FAILED_DEQUEUE_INPUT_BUFFER;
                    break;
                case 3:
                    aVar = xk1.C15176a.RENDERER_FAILED_STOP;
                    break;
                case 4:
                    aVar = xk1.C15176a.RENDERER_FAILED_SET_SURFACE;
                    break;
                case 5:
                    aVar = xk1.C15176a.RENDERER_FAILED_RELEASE_OUTPUT_BUFFER;
                    break;
                case 6:
                    aVar = xk1.C15176a.RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER;
                    break;
                case 7:
                    aVar = xk1.C15176a.RENDERER_MEDIA_CODEC_UNKNOWN;
                    break;
                case 8:
                    aVar = xk1.C15176a.f42591i;
                    break;
                case 9:
                    aVar = xk1.C15176a.ILLEGAL_SEEK_POSITION;
                    break;
                case 10:
                    aVar = xk1.C15176a.DECODER_QUERY_ERROR;
                    break;
                case 11:
                    aVar = xk1.C15176a.DECODER_INITIALIZATION_ERROR;
                    break;
                case 12:
                    aVar = xk1.C15176a.DECODER_UNKNOWN_ERROR;
                    break;
                case 13:
                    aVar = xk1.C15176a.BEHIND_LIVE_WINDOW_ERROR;
                    break;
                case 14:
                    aVar = xk1.C15176a.DRM_KEYS_EXPIRED;
                    break;
                case 15:
                    aVar = xk1.C15176a.DRM_MEDIA_RESOURCE_BUSY;
                    break;
                case 16:
                    aVar = xk1.C15176a.DRM_SESSION_ERROR;
                    break;
                case 17:
                    aVar = xk1.C15176a.HTTP_CLEARTEXT_NOT_PERMITTED;
                    break;
                case 18:
                    aVar = xk1.C15176a.HTTP_CODE_UNAUTHORIZED;
                    break;
                case 19:
                    aVar = xk1.C15176a.HTTP_CODE_FORBIDDEN;
                    break;
                case 20:
                    aVar = xk1.C15176a.HTTP_CODE_NOT_FOUND;
                    break;
                case 21:
                    aVar = xk1.C15176a.HTTP_CODE_UNKNOWN;
                    break;
                case 22:
                    aVar = xk1.C15176a.SSL_HANDSHAKE_ERROR;
                    break;
                case 23:
                    aVar = xk1.C15176a.NETWORK_UNAVAILABLE;
                    break;
                case 24:
                    aVar = xk1.C15176a.CONTENT_PARSER_ERROR;
                    break;
                case 25:
                    aVar = xk1.C15176a.LOADER_UNEXPECTED_ERROR;
                    break;
                case 26:
                    aVar = xk1.C15176a.AUDIO_ERROR;
                    break;
                case 27:
                    aVar = xk1.C15176a.SUBTITLE_ERROR;
                    break;
                case 28:
                    aVar = xk1.C15176a.CACHE_ERROR;
                    break;
                case 29:
                    aVar = xk1.C15176a.UNKNOWN;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            yk1.mo67188a((ok1) mediaFile, new xk1(aVar, instreamAdPlayerError.getUnderlyingError()));
        }

        public void onVolumeChanged(VideoAd videoAd, float f) {
            this.f36128b.mo67187a((ok1) videoAd.getMediaFile(), f);
        }
    }

    public kg0(VideoAd videoAd, gf0 gf0) {
        this.f36125b = videoAd;
        this.f36124a = gf0;
    }

    /* renamed from: a */
    public void mo68212a(ck1<VideoAd> ck1) {
        this.f36124a.mo67289g(ck1.mo66323c());
    }

    /* renamed from: b */
    public boolean mo68214b() {
        return this.f36124a.mo67286d(this.f36125b);
    }

    /* renamed from: c */
    public long mo68215c() {
        return this.f36124a.mo67278a(this.f36125b);
    }

    /* renamed from: d */
    public void mo68216d() {
        this.f36124a.mo67293k(this.f36125b);
    }

    /* renamed from: e */
    public void mo68217e() {
        this.f36124a.mo67288f(this.f36125b);
    }

    /* renamed from: f */
    public void mo68218f() {
        this.f36124a.mo67291i(this.f36125b);
    }

    /* renamed from: g */
    public void mo68219g() {
        this.f36124a.mo67290h(this.f36125b);
    }

    public long getAdPosition() {
        return this.f36124a.mo67282b(this.f36125b);
    }

    public float getVolume() {
        return this.f36124a.mo67285c(this.f36125b);
    }

    /* renamed from: h */
    public void mo68222h() {
        this.f36124a.mo67292j(this.f36125b);
    }

    /* renamed from: a */
    public void mo68210a() {
        this.f36124a.mo67287e(this.f36125b);
    }

    /* renamed from: a */
    public void mo68211a(float f) {
        this.f36124a.mo67280a(this.f36125b, f);
    }

    /* renamed from: a */
    public void mo68213a(yk1 yk1) {
        C13707a aVar = this.f36126c;
        if (aVar != null) {
            this.f36124a.mo67284b(this.f36125b, aVar);
            this.f36126c = null;
        }
        if (yk1 != null) {
            C13707a aVar2 = new C13707a(yk1);
            this.f36126c = aVar2;
            this.f36124a.mo67281a(this.f36125b, (InstreamAdPlayerListener) aVar2);
        }
    }
}
