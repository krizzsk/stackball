package com.yandex.mobile.ads.instream.player.p267ad.error;

/* renamed from: com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError */
public class InstreamAdPlayerError {

    /* renamed from: a */
    private final Reason f43569a;

    /* renamed from: b */
    private final Throwable f43570b;

    /* renamed from: com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError$Reason */
    public enum Reason {
        RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER,
        RENDERER_FAILED_DEQUEUE_INPUT_BUFFER,
        RENDERER_FAILED_STOP,
        RENDERER_FAILED_SET_SURFACE,
        RENDERER_FAILED_RELEASE_OUTPUT_BUFFER,
        RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER,
        RENDERER_MEDIA_CODEC_UNKNOWN,
        TIMEOUT,
        ILLEGAL_SEEK_POSITION,
        DECODER_QUERY_ERROR,
        DECODER_INITIALIZATION_ERROR,
        DECODER_UNKNOWN_ERROR,
        BEHIND_LIVE_WINDOW_ERROR,
        DRM_KEYS_EXPIRED,
        DRM_MEDIA_RESOURCE_BUSY,
        DRM_SESSION_ERROR,
        HTTP_CLEARTEXT_NOT_PERMITTED,
        HTTP_CODE_UNAUTHORIZED,
        HTTP_CODE_FORBIDDEN,
        HTTP_CODE_NOT_FOUND,
        HTTP_CODE_UNKNOWN,
        SSL_HANDSHAKE_ERROR,
        NETWORK_UNAVAILABLE,
        CONTENT_PARSER_ERROR,
        LOADER_UNEXPECTED_ERROR,
        AUDIO_ERROR,
        SUBTITLE_ERROR,
        CACHE_ERROR,
        UNKNOWN
    }

    public InstreamAdPlayerError(Reason reason, Throwable th) {
        this.f43569a = reason;
        this.f43570b = th;
    }

    public Reason getReason() {
        return this.f43569a;
    }

    public Throwable getUnderlyingError() {
        return this.f43570b;
    }
}
