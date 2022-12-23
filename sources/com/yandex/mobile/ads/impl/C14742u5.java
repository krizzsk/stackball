package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaDrmResetException;
import android.media.ResourceBusyException;
import android.os.Build;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoTimeoutException;
import com.google.android.exoplayer2.IllegalSeekPositionException;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.KeysExpiredException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.exoplayer2.video.MediaCodecVideoDecoderException;
import com.yandex.mobile.ads.instream.player.p267ad.error.InstreamAdPlayerError;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.u5 */
public final class C14742u5 {
    /* renamed from: a */
    private final InstreamAdPlayerError.Reason m42607a(Throwable th) {
        InstreamAdPlayerError.Reason reason;
        boolean z;
        boolean z2;
        if (th instanceof ExoPlaybackException) {
            InstreamAdPlayerError.Reason b = m42608b(th);
            if (b != null) {
                return b;
            }
            Throwable cause = th.getCause();
            InstreamAdPlayerError.Reason a = cause == null ? null : m42607a(cause);
            if (a != null) {
                return a;
            }
            reason = InstreamAdPlayerError.Reason.UNKNOWN;
        } else if (th instanceof ExoTimeoutException) {
            reason = InstreamAdPlayerError.Reason.TIMEOUT;
        } else if (th instanceof IllegalSeekPositionException) {
            reason = InstreamAdPlayerError.Reason.ILLEGAL_SEEK_POSITION;
        } else if (th instanceof MediaCodecUtil.DecoderQueryException) {
            reason = InstreamAdPlayerError.Reason.DECODER_QUERY_ERROR;
        } else if (th instanceof MediaCodecRenderer.DecoderInitializationException) {
            reason = InstreamAdPlayerError.Reason.DECODER_INITIALIZATION_ERROR;
        } else if (th instanceof MediaCodecVideoDecoderException) {
            InstreamAdPlayerError.Reason b2 = m42608b(th);
            if (b2 != null) {
                return b2;
            }
            reason = InstreamAdPlayerError.Reason.DECODER_UNKNOWN_ERROR;
        } else if (th instanceof BehindLiveWindowException) {
            reason = InstreamAdPlayerError.Reason.BEHIND_LIVE_WINDOW_ERROR;
        } else if (th instanceof MediaCodec.CryptoException) {
            reason = InstreamAdPlayerError.Reason.DRM_KEYS_EXPIRED;
        } else if (th instanceof DrmSession.DrmSessionException) {
            Throwable cause2 = ((DrmSession.DrmSessionException) th).getCause();
            if (cause2 == null) {
                reason = InstreamAdPlayerError.Reason.DRM_SESSION_ERROR;
            } else {
                int i = Build.VERSION.SDK_INT;
                if ((i >= 23 && (cause2 instanceof MediaDrmResetException)) || (i >= 19 && (cause2 instanceof ResourceBusyException))) {
                    reason = InstreamAdPlayerError.Reason.DRM_MEDIA_RESOURCE_BUSY;
                } else if ((cause2 instanceof MediaCodec.CryptoException) || (cause2 instanceof KeysExpiredException)) {
                    reason = InstreamAdPlayerError.Reason.DRM_KEYS_EXPIRED;
                } else {
                    reason = InstreamAdPlayerError.Reason.DRM_SESSION_ERROR;
                }
            }
        } else if (th instanceof HttpDataSource.CleartextNotPermittedException) {
            reason = InstreamAdPlayerError.Reason.HTTP_CLEARTEXT_NOT_PERMITTED;
        } else if (th instanceof HttpDataSource.InvalidResponseCodeException) {
            int i2 = ((HttpDataSource.InvalidResponseCodeException) th).responseCode;
            if (i2 == 401) {
                reason = InstreamAdPlayerError.Reason.HTTP_CODE_UNAUTHORIZED;
            } else if (i2 == 403) {
                reason = InstreamAdPlayerError.Reason.HTTP_CODE_FORBIDDEN;
            } else if (i2 != 404) {
                reason = InstreamAdPlayerError.Reason.HTTP_CODE_UNKNOWN;
            } else {
                reason = InstreamAdPlayerError.Reason.HTTP_CODE_NOT_FOUND;
            }
        } else if (th instanceof HttpDataSource.HttpDataSourceException) {
            if (((HttpDataSource.HttpDataSourceException) th).getCause() instanceof SSLHandshakeException) {
                reason = InstreamAdPlayerError.Reason.SSL_HANDSHAKE_ERROR;
            } else {
                reason = InstreamAdPlayerError.Reason.NETWORK_UNAVAILABLE;
            }
        } else if (th instanceof ParserException) {
            reason = InstreamAdPlayerError.Reason.CONTENT_PARSER_ERROR;
        } else if (th instanceof Loader.UnexpectedLoaderException) {
            reason = InstreamAdPlayerError.Reason.LOADER_UNEXPECTED_ERROR;
        } else {
            boolean z3 = true;
            if (th instanceof AudioSink.ConfigurationException) {
                z = true;
            } else {
                z = th instanceof AudioSink.InitializationException;
            }
            if (z) {
                z2 = true;
            } else {
                z2 = th instanceof DefaultAudioSink.InvalidAudioTrackTimestampException;
            }
            if (z2) {
                reason = InstreamAdPlayerError.Reason.AUDIO_ERROR;
            } else if (th instanceof SubtitleDecoderException) {
                reason = InstreamAdPlayerError.Reason.SUBTITLE_ERROR;
            } else {
                if (!(th instanceof Cache.CacheException)) {
                    z3 = th instanceof CacheDataSink.CacheDataSinkException;
                }
                if (z3) {
                    reason = InstreamAdPlayerError.Reason.CACHE_ERROR;
                } else {
                    reason = InstreamAdPlayerError.Reason.UNKNOWN;
                }
            }
        }
        return reason;
    }

    /* renamed from: b */
    private final InstreamAdPlayerError.Reason m42608b(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if (!(i >= 21 && (cause instanceof MediaCodec.CodecException)) && !(cause instanceof IllegalStateException) && !(cause instanceof IllegalArgumentException)) {
            return null;
        }
        StackTraceElement[] stackTrace = cause.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        if (!(!(stackTrace.length == 0)) || !stackTrace[0].isNativeMethod() || !Intrinsics.areEqual((Object) stackTrace[0].getClassName(), (Object) "android.media.MediaCodec")) {
            return null;
        }
        String methodName = stackTrace[0].getMethodName();
        if (methodName == null) {
            methodName = "";
        }
        if (Intrinsics.areEqual((Object) methodName, (Object) "native_dequeueOutputBuffer")) {
            return InstreamAdPlayerError.Reason.RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER;
        }
        if (Intrinsics.areEqual((Object) methodName, (Object) "native_dequeueInputBuffer")) {
            return InstreamAdPlayerError.Reason.RENDERER_FAILED_DEQUEUE_INPUT_BUFFER;
        }
        if (Intrinsics.areEqual((Object) methodName, (Object) "native_stop")) {
            return InstreamAdPlayerError.Reason.RENDERER_FAILED_STOP;
        }
        if (Intrinsics.areEqual((Object) methodName, (Object) "native_setSurface")) {
            return InstreamAdPlayerError.Reason.RENDERER_FAILED_SET_SURFACE;
        }
        if (Intrinsics.areEqual((Object) methodName, (Object) "releaseOutputBuffer")) {
            return InstreamAdPlayerError.Reason.RENDERER_FAILED_RELEASE_OUTPUT_BUFFER;
        }
        if (Intrinsics.areEqual((Object) methodName, (Object) "native_queueSecureInputBuffer")) {
            return InstreamAdPlayerError.Reason.RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER;
        }
        if (i < 21 || !(cause instanceof MediaCodec.CodecException)) {
            z = false;
        }
        if (z) {
            return InstreamAdPlayerError.Reason.RENDERER_MEDIA_CODEC_UNKNOWN;
        }
        return null;
    }

    /* renamed from: c */
    public final InstreamAdPlayerError mo70291c(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "throwable");
        return new InstreamAdPlayerError(m42607a(th), th);
    }
}
