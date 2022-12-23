package com.yandex.mobile.ads.impl;

public class xk1 {

    /* renamed from: a */
    private final C15176a f42577a;

    /* renamed from: b */
    private final Throwable f42578b;

    /* renamed from: com.yandex.mobile.ads.impl.xk1$a */
    public enum C15176a {
        RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER,
        RENDERER_FAILED_DEQUEUE_INPUT_BUFFER,
        RENDERER_FAILED_STOP,
        RENDERER_FAILED_SET_SURFACE,
        RENDERER_FAILED_RELEASE_OUTPUT_BUFFER,
        RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER,
        RENDERER_MEDIA_CODEC_UNKNOWN,
        f42591i,
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

    public xk1(C15176a aVar, Throwable th) {
        this.f42577a = aVar;
        this.f42578b = th;
    }

    /* renamed from: a */
    public C15176a mo70909a() {
        return this.f42577a;
    }

    /* renamed from: b */
    public Throwable mo70910b() {
        return this.f42578b;
    }
}
