package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.ad */
public class C12374ad implements C15051wi {

    /* renamed from: a */
    private final Context f30505a;

    public C12374ad(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30505a = context.getApplicationContext();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        kotlin.p271io.CloseableKt.closeFinally(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        throw r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[][] mo65721a() {
        /*
            r3 = this;
            android.content.Context r0 = r3.f30505a     // Catch:{ IOException -> 0x0027 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IOException -> 0x0027 }
            int r1 = com.yandex.mobile.ads.C12066R.raw.bundled_cert     // Catch:{ IOException -> 0x0027 }
            java.io.InputStream r0 = r0.openRawResource(r1)     // Catch:{ IOException -> 0x0027 }
            r1 = 0
            java.lang.String r2 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch:{ all -> 0x0020 }
            byte[] r2 = kotlin.p271io.ByteStreamsKt.readBytes(r0)     // Catch:{ all -> 0x0020 }
            kotlin.p271io.CloseableKt.closeFinally(r0, r1)     // Catch:{ IOException -> 0x0027 }
            r0 = 1
            byte[][] r0 = new byte[r0][]
            r1 = 0
            r0[r1] = r2
            return r0
        L_0x0020:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r2 = move-exception
            kotlin.p271io.CloseableKt.closeFinally(r0, r1)     // Catch:{ IOException -> 0x0027 }
            throw r2     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Failed to create cert"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C12374ad.mo65721a():byte[][]");
    }
}
