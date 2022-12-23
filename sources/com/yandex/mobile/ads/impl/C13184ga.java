package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.yandex.mobile.ads.impl.ga */
public interface C13184ga {

    /* renamed from: a */
    public static final ByteBuffer f33912a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: com.yandex.mobile.ads.impl.ga$a */
    public static final class C13185a {

        /* renamed from: e */
        public static final C13185a f33913e = new C13185a(-1, -1, -1);

        /* renamed from: a */
        public final int f33914a;

        /* renamed from: b */
        public final int f33915b;

        /* renamed from: c */
        public final int f33916c;

        /* renamed from: d */
        public final int f33917d;

        public C13185a(int i, int i2, int i3) {
            this.f33914a = i;
            this.f33915b = i2;
            this.f33916c = i3;
            this.f33917d = ih1.m37396d(i3) ? ih1.m37386b(i3, i2) : -1;
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f33914a + ", channelCount=" + this.f33915b + ", encoding=" + this.f33916c + ']';
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ga$b */
    public static final class C13186b extends Exception {
        public C13186b(C13185a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    /* renamed from: a */
    C13185a mo67212a(C13185a aVar) throws C13186b;

    /* renamed from: a */
    ByteBuffer mo67213a();

    /* renamed from: a */
    void mo67214a(ByteBuffer byteBuffer);

    /* renamed from: b */
    void mo67215b();

    /* renamed from: c */
    boolean mo67216c();

    /* renamed from: e */
    boolean mo67217e();

    void flush();

    /* renamed from: g */
    void mo67219g();
}
