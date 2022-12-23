package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;

public abstract class o41 {

    /* renamed from: a */
    public static final C14166a f38088a = new C14166a((DefaultConstructorMarker) null);

    /* renamed from: com.yandex.mobile.ads.impl.o41$a */
    public static final class C14166a {
        private C14166a() {
        }

        public /* synthetic */ C14166a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static o41 m40287a(C14166a aVar, byte[] bArr, int i, int i2, int i3) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            jh1.m37825a((long) bArr.length, (long) i, (long) i2);
            return new n41(i2, bArr, i);
        }
    }

    /* renamed from: a */
    public abstract long mo68888a() throws IOException;

    /* renamed from: a */
    public abstract void mo68889a(BufferedSink bufferedSink) throws IOException;

    /* renamed from: b */
    public abstract void mo68890b();
}
