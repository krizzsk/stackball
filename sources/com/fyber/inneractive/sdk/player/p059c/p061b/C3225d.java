package com.fyber.inneractive.sdk.player.p059c.p061b;

import java.nio.ByteBuffer;

/* renamed from: com.fyber.inneractive.sdk.player.c.b.d */
public final class C3225d extends C3221a {

    /* renamed from: b */
    public final C3222b f8129b = new C3222b();

    /* renamed from: c */
    public ByteBuffer f8130c;

    /* renamed from: d */
    public long f8131d;

    /* renamed from: e */
    public final int f8132e = 0;

    /* renamed from: e */
    public final boolean mo18967e() {
        return mo18961a(1073741824);
    }

    /* renamed from: a */
    public final void mo18960a() {
        super.mo18960a();
        ByteBuffer byteBuffer = this.f8130c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* renamed from: b */
    public final ByteBuffer mo18966b(int i) {
        int i2 = this.f8132e;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f8130c;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i + ")");
    }
}
