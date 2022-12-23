package com.yandex.mobile.ads.impl;

import java.io.Closeable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;

public abstract class e51 implements Closeable {

    /* renamed from: b */
    public static final C12956a f32914b = new C12956a((DefaultConstructorMarker) null);

    /* renamed from: com.yandex.mobile.ads.impl.e51$a */
    public static final class C12956a {
        private C12956a() {
        }

        public /* synthetic */ C12956a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static e51 m35581a(C12956a aVar, byte[] bArr, int i) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            Buffer write = new Buffer().write(bArr);
            Intrinsics.checkNotNullParameter(write, "<this>");
            return new d51((long) bArr.length, write);
        }
    }

    /* renamed from: b */
    public abstract long mo66401b();

    /* renamed from: c */
    public abstract BufferedSource mo66402c();

    public void close() {
        jh1.m37826a((Closeable) mo66402c());
    }
}
