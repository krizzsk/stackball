package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.yandex.mobile.ads.impl.qj */
public class C14387qj extends C15241yc {

    /* renamed from: c */
    public final C14463ri f39146c = new C14463ri();

    /* renamed from: d */
    public ByteBuffer f39147d;

    /* renamed from: e */
    public boolean f39148e;

    /* renamed from: f */
    public long f39149f;

    /* renamed from: g */
    public ByteBuffer f39150g;

    /* renamed from: h */
    private final int f39151h;

    public C14387qj(int i) {
        this.f39151h = i;
    }

    /* renamed from: f */
    private ByteBuffer m41247f(int i) {
        int i2 = this.f39151h;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f39147d;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i + ")");
    }

    /* renamed from: j */
    public static C14387qj m41248j() {
        return new C14387qj(0);
    }

    /* renamed from: b */
    public void mo66557b() {
        super.mo66557b();
        ByteBuffer byteBuffer = this.f39147d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f39150g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f39148e = false;
    }

    @EnsuresNonNull({"data"})
    /* renamed from: g */
    public void mo69601g(int i) {
        ByteBuffer byteBuffer = this.f39147d;
        if (byteBuffer == null) {
            this.f39147d = m41247f(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f39147d.position();
        int i2 = i + position;
        if (capacity < i2) {
            ByteBuffer f = m41247f(i2);
            f.order(this.f39147d.order());
            if (position > 0) {
                this.f39147d.flip();
                f.put(this.f39147d);
            }
            this.f39147d = f;
        }
    }

    /* renamed from: h */
    public final boolean mo69602h() {
        return mo71019d(1073741824);
    }

    /* renamed from: i */
    public final boolean mo69603i() {
        return this.f39147d == null && this.f39151h == 0;
    }

    /* renamed from: g */
    public final void mo69600g() {
        this.f39147d.flip();
        ByteBuffer byteBuffer = this.f39150g;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
    }
}
