package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.p267ad.error.InstreamAdPlayerError;

public final class jg0 {

    /* renamed from: com.yandex.mobile.ads.impl.jg0$a */
    public /* synthetic */ class C13499a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35292a;

        static {
            int[] iArr = new int[InstreamAdPlayerError.Reason.values().length];
            iArr[InstreamAdPlayerError.Reason.RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER.ordinal()] = 1;
            iArr[InstreamAdPlayerError.Reason.RENDERER_FAILED_DEQUEUE_INPUT_BUFFER.ordinal()] = 2;
            iArr[InstreamAdPlayerError.Reason.RENDERER_FAILED_STOP.ordinal()] = 3;
            iArr[InstreamAdPlayerError.Reason.RENDERER_FAILED_SET_SURFACE.ordinal()] = 4;
            iArr[InstreamAdPlayerError.Reason.RENDERER_FAILED_RELEASE_OUTPUT_BUFFER.ordinal()] = 5;
            iArr[InstreamAdPlayerError.Reason.RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER.ordinal()] = 6;
            iArr[InstreamAdPlayerError.Reason.RENDERER_MEDIA_CODEC_UNKNOWN.ordinal()] = 7;
            iArr[InstreamAdPlayerError.Reason.TIMEOUT.ordinal()] = 8;
            iArr[InstreamAdPlayerError.Reason.ILLEGAL_SEEK_POSITION.ordinal()] = 9;
            iArr[InstreamAdPlayerError.Reason.DECODER_QUERY_ERROR.ordinal()] = 10;
            iArr[InstreamAdPlayerError.Reason.DECODER_INITIALIZATION_ERROR.ordinal()] = 11;
            iArr[InstreamAdPlayerError.Reason.DECODER_UNKNOWN_ERROR.ordinal()] = 12;
            iArr[InstreamAdPlayerError.Reason.BEHIND_LIVE_WINDOW_ERROR.ordinal()] = 13;
            iArr[InstreamAdPlayerError.Reason.DRM_KEYS_EXPIRED.ordinal()] = 14;
            iArr[InstreamAdPlayerError.Reason.DRM_MEDIA_RESOURCE_BUSY.ordinal()] = 15;
            iArr[InstreamAdPlayerError.Reason.DRM_SESSION_ERROR.ordinal()] = 16;
            iArr[InstreamAdPlayerError.Reason.HTTP_CLEARTEXT_NOT_PERMITTED.ordinal()] = 17;
            iArr[InstreamAdPlayerError.Reason.HTTP_CODE_UNAUTHORIZED.ordinal()] = 18;
            iArr[InstreamAdPlayerError.Reason.HTTP_CODE_FORBIDDEN.ordinal()] = 19;
            iArr[InstreamAdPlayerError.Reason.HTTP_CODE_NOT_FOUND.ordinal()] = 20;
            iArr[InstreamAdPlayerError.Reason.HTTP_CODE_UNKNOWN.ordinal()] = 21;
            iArr[InstreamAdPlayerError.Reason.SSL_HANDSHAKE_ERROR.ordinal()] = 22;
            iArr[InstreamAdPlayerError.Reason.NETWORK_UNAVAILABLE.ordinal()] = 23;
            iArr[InstreamAdPlayerError.Reason.CONTENT_PARSER_ERROR.ordinal()] = 24;
            iArr[InstreamAdPlayerError.Reason.LOADER_UNEXPECTED_ERROR.ordinal()] = 25;
            iArr[InstreamAdPlayerError.Reason.AUDIO_ERROR.ordinal()] = 26;
            iArr[InstreamAdPlayerError.Reason.SUBTITLE_ERROR.ordinal()] = 27;
            iArr[InstreamAdPlayerError.Reason.CACHE_ERROR.ordinal()] = 28;
            iArr[InstreamAdPlayerError.Reason.UNKNOWN.ordinal()] = 29;
            f35292a = iArr;
        }
    }
}
