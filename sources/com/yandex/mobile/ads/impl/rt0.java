package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

public class rt0 {
    /* JADX WARNING: Removed duplicated region for block: B:132:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.yandex.mobile.ads.impl.xk1.C15176a m41725a(java.lang.Throwable r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.yandex.mobile.ads.impl.k40
            r1 = 1
            if (r0 == 0) goto L_0x00bc
            java.lang.Throwable r0 = r10.getCause()
            r2 = 0
            if (r0 == 0) goto L_0x00a6
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            r5 = 0
            if (r3 < r4) goto L_0x0019
            boolean r6 = r0 instanceof android.media.MediaCodec.CodecException
            if (r6 == 0) goto L_0x0019
            r6 = 1
            goto L_0x001a
        L_0x0019:
            r6 = 0
        L_0x001a:
            if (r6 != 0) goto L_0x0024
            boolean r6 = r0 instanceof java.lang.IllegalStateException
            if (r6 != 0) goto L_0x0024
            boolean r6 = r0 instanceof java.lang.IllegalArgumentException
            if (r6 == 0) goto L_0x00a6
        L_0x0024:
            java.lang.StackTraceElement[] r6 = r0.getStackTrace()
            java.lang.String r7 = "stackTrace"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            int r7 = r6.length
            if (r7 != 0) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r7 = r7 ^ r1
            if (r7 == 0) goto L_0x00a6
            r7 = r6[r5]
            boolean r7 = r7.isNativeMethod()
            if (r7 == 0) goto L_0x00a6
            r7 = r6[r5]
            java.lang.String r7 = r7.getClassName()
            java.lang.String r8 = "android.media.MediaCodec"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x00a6
            r6 = r6[r5]
            java.lang.String r6 = r6.getMethodName()
            if (r6 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            java.lang.String r6 = ""
        L_0x0057:
            java.lang.String r7 = "native_dequeueOutputBuffer"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x0062
            com.yandex.mobile.ads.impl.xk1$a r0 = com.yandex.mobile.ads.impl.xk1.C15176a.RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER
            goto L_0x00a7
        L_0x0062:
            java.lang.String r7 = "native_dequeueInputBuffer"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x006d
            com.yandex.mobile.ads.impl.xk1$a r0 = com.yandex.mobile.ads.impl.xk1.C15176a.RENDERER_FAILED_DEQUEUE_INPUT_BUFFER
            goto L_0x00a7
        L_0x006d:
            java.lang.String r7 = "native_stop"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x0078
            com.yandex.mobile.ads.impl.xk1$a r0 = com.yandex.mobile.ads.impl.xk1.C15176a.RENDERER_FAILED_STOP
            goto L_0x00a7
        L_0x0078:
            java.lang.String r7 = "native_setSurface"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x0083
            com.yandex.mobile.ads.impl.xk1$a r0 = com.yandex.mobile.ads.impl.xk1.C15176a.RENDERER_FAILED_SET_SURFACE
            goto L_0x00a7
        L_0x0083:
            java.lang.String r7 = "releaseOutputBuffer"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x008e
            com.yandex.mobile.ads.impl.xk1$a r0 = com.yandex.mobile.ads.impl.xk1.C15176a.RENDERER_FAILED_RELEASE_OUTPUT_BUFFER
            goto L_0x00a7
        L_0x008e:
            java.lang.String r7 = "native_queueSecureInputBuffer"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x0099
            com.yandex.mobile.ads.impl.xk1$a r0 = com.yandex.mobile.ads.impl.xk1.C15176a.RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER
            goto L_0x00a7
        L_0x0099:
            if (r3 < r4) goto L_0x00a0
            boolean r0 = r0 instanceof android.media.MediaCodec.CodecException
            if (r0 == 0) goto L_0x00a0
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            if (r1 == 0) goto L_0x00a6
            com.yandex.mobile.ads.impl.xk1$a r0 = com.yandex.mobile.ads.impl.xk1.C15176a.RENDERER_MEDIA_CODEC_UNKNOWN
            goto L_0x00a7
        L_0x00a6:
            r0 = r2
        L_0x00a7:
            if (r0 != 0) goto L_0x0176
            java.lang.Throwable r10 = r10.getCause()
            if (r10 != 0) goto L_0x00b0
            goto L_0x00b4
        L_0x00b0:
            com.yandex.mobile.ads.impl.xk1$a r2 = r9.m41725a(r10)
        L_0x00b4:
            if (r2 != 0) goto L_0x00b9
            com.yandex.mobile.ads.impl.xk1$a r10 = com.yandex.mobile.ads.impl.xk1.C15176a.UNKNOWN
            goto L_0x00c2
        L_0x00b9:
            r0 = r2
            goto L_0x0176
        L_0x00bc:
            boolean r0 = r10 instanceof com.yandex.mobile.ads.impl.rl0.C14471c
            if (r0 == 0) goto L_0x00c5
            com.yandex.mobile.ads.impl.xk1$a r10 = com.yandex.mobile.ads.impl.xk1.C15176a.DECODER_QUERY_ERROR
        L_0x00c2:
            r0 = r10
            goto L_0x0176
        L_0x00c5:
            boolean r0 = r10 instanceof com.yandex.mobile.ads.impl.pl0.C14286a
            if (r0 == 0) goto L_0x00cc
            com.yandex.mobile.ads.impl.xk1$a r10 = com.yandex.mobile.ads.impl.xk1.C15176a.DECODER_INITIALIZATION_ERROR
            goto L_0x00c2
        L_0x00cc:
            boolean r0 = r10 instanceof android.media.MediaCodec.CryptoException
            if (r0 == 0) goto L_0x00d3
            com.yandex.mobile.ads.impl.xk1$a r10 = com.yandex.mobile.ads.impl.xk1.C15176a.DRM_KEYS_EXPIRED
            goto L_0x00c2
        L_0x00d3:
            boolean r0 = r10 instanceof com.yandex.mobile.ads.exo.drm.C12186c.C12187a
            if (r0 == 0) goto L_0x0106
            com.yandex.mobile.ads.exo.drm.c$a r10 = (com.yandex.mobile.ads.exo.drm.C12186c.C12187a) r10
            java.lang.Throwable r10 = r10.getCause()
            if (r10 != 0) goto L_0x00e2
            com.yandex.mobile.ads.impl.xk1$a r10 = com.yandex.mobile.ads.impl.xk1.C15176a.DRM_SESSION_ERROR
            goto L_0x00c2
        L_0x00e2:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x00ec
            boolean r1 = r10 instanceof android.media.MediaDrmResetException
            if (r1 != 0) goto L_0x00f4
        L_0x00ec:
            r1 = 19
            if (r0 < r1) goto L_0x00f7
            boolean r0 = r10 instanceof android.media.ResourceBusyException
            if (r0 == 0) goto L_0x00f7
        L_0x00f4:
            com.yandex.mobile.ads.impl.xk1$a r10 = com.yandex.mobile.ads.impl.xk1.C15176a.DRM_MEDIA_RESOURCE_BUSY
            goto L_0x00c2
        L_0x00f7:
            boolean r0 = r10 instanceof android.media.MediaCodec.CryptoException
            if (r0 != 0) goto L_0x0103
            boolean r10 = r10 instanceof com.yandex.mobile.ads.impl.li0
            if (r10 == 0) goto L_0x0100
            goto L_0x0103
        L_0x0100:
            com.yandex.mobile.ads.impl.xk1$a r10 = com.yandex.mobile.ads.impl.xk1.C15176a.DRM_SESSION_ERROR
            goto L_0x00c2
        L_0x0103:
            com.yandex.mobile.ads.impl.xk1$a r10 = com.yandex.mobile.ads.impl.xk1.C15176a.DRM_KEYS_EXPIRED
            goto L_0x00c2
        L_0x0106:
            boolean r0 = r10 instanceof com.yandex.mobile.ads.impl.ub0
            if (r0 == 0) goto L_0x0126
            com.yandex.mobile.ads.impl.ub0 r10 = (com.yandex.mobile.ads.impl.ub0) r10
            int r10 = r10.f40614b
            r0 = 401(0x191, float:5.62E-43)
            if (r10 == r0) goto L_0x0123
            r0 = 403(0x193, float:5.65E-43)
            if (r10 == r0) goto L_0x0120
            r0 = 404(0x194, float:5.66E-43)
            if (r10 == r0) goto L_0x011d
            com.yandex.mobile.ads.impl.xk1$a r10 = com.yandex.mobile.ads.impl.xk1.C15176a.HTTP_CODE_UNKNOWN
            goto L_0x00c2
        L_0x011d:
            com.yandex.mobile.ads.impl.xk1$a r10 = com.yandex.mobile.ads.impl.xk1.C15176a.HTTP_CODE_NOT_FOUND
            goto L_0x00c2
        L_0x0120:
            com.yandex.mobile.ads.impl.xk1$a r10 = com.yandex.mobile.ads.impl.xk1.C15176a.HTTP_CODE_FORBIDDEN
            goto L_0x00c2
        L_0x0123:
            com.yandex.mobile.ads.impl.xk1$a r10 = com.yandex.mobile.ads.impl.xk1.C15176a.HTTP_CODE_UNAUTHORIZED
            goto L_0x00c2
        L_0x0126:
            boolean r0 = r10 instanceof com.yandex.mobile.ads.impl.tb0
            if (r0 == 0) goto L_0x013a
            com.yandex.mobile.ads.impl.tb0 r10 = (com.yandex.mobile.ads.impl.tb0) r10
            java.lang.Throwable r10 = r10.getCause()
            boolean r10 = r10 instanceof javax.net.ssl.SSLHandshakeException
            if (r10 == 0) goto L_0x0137
            com.yandex.mobile.ads.impl.xk1$a r10 = com.yandex.mobile.ads.impl.xk1.C15176a.SSL_HANDSHAKE_ERROR
            goto L_0x00c2
        L_0x0137:
            com.yandex.mobile.ads.impl.xk1$a r10 = com.yandex.mobile.ads.impl.xk1.C15176a.NETWORK_UNAVAILABLE
            goto L_0x00c2
        L_0x013a:
            boolean r0 = r10 instanceof com.yandex.mobile.ads.impl.jy0
            if (r0 == 0) goto L_0x0141
            com.yandex.mobile.ads.impl.xk1$a r10 = com.yandex.mobile.ads.impl.xk1.C15176a.CONTENT_PARSER_ERROR
            goto L_0x00c2
        L_0x0141:
            boolean r0 = r10 instanceof com.yandex.mobile.ads.impl.mj0.C13989h
            if (r0 == 0) goto L_0x0149
            com.yandex.mobile.ads.impl.xk1$a r10 = com.yandex.mobile.ads.impl.xk1.C15176a.LOADER_UNEXPECTED_ERROR
            goto L_0x00c2
        L_0x0149:
            boolean r0 = r10 instanceof com.yandex.mobile.ads.impl.C13397ia.C13398a
            if (r0 == 0) goto L_0x014f
            r0 = 1
            goto L_0x0151
        L_0x014f:
            boolean r0 = r10 instanceof com.yandex.mobile.ads.impl.C13397ia.C13399b
        L_0x0151:
            if (r0 == 0) goto L_0x0155
            r0 = 1
            goto L_0x0157
        L_0x0155:
            boolean r0 = r10 instanceof com.yandex.mobile.ads.impl.C15319zj.C15324e
        L_0x0157:
            if (r0 == 0) goto L_0x015d
            com.yandex.mobile.ads.impl.xk1$a r10 = com.yandex.mobile.ads.impl.xk1.C15176a.AUDIO_ERROR
            goto L_0x00c2
        L_0x015d:
            boolean r0 = r10 instanceof com.yandex.mobile.ads.impl.ac1
            if (r0 == 0) goto L_0x0165
            com.yandex.mobile.ads.impl.xk1$a r10 = com.yandex.mobile.ads.impl.xk1.C15176a.SUBTITLE_ERROR
            goto L_0x00c2
        L_0x0165:
            boolean r0 = r10 instanceof com.yandex.mobile.ads.impl.C12966ed.C12967a
            if (r0 == 0) goto L_0x016a
            goto L_0x016c
        L_0x016a:
            boolean r1 = r10 instanceof com.yandex.mobile.ads.impl.C13312hd.C13313a
        L_0x016c:
            if (r1 == 0) goto L_0x0172
            com.yandex.mobile.ads.impl.xk1$a r10 = com.yandex.mobile.ads.impl.xk1.C15176a.CACHE_ERROR
            goto L_0x00c2
        L_0x0172:
            com.yandex.mobile.ads.impl.xk1$a r10 = com.yandex.mobile.ads.impl.xk1.C15176a.UNKNOWN
            goto L_0x00c2
        L_0x0176:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rt0.m41725a(java.lang.Throwable):com.yandex.mobile.ads.impl.xk1$a");
    }

    /* renamed from: b */
    public final xk1 mo69817b(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "throwable");
        return new xk1(m41725a(th), th);
    }
}
