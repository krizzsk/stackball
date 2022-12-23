package com.fyber.inneractive.sdk.player.p059c.p060a;

import com.fyber.inneractive.sdk.player.p059c.p060a.C3192c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.c.a.f */
final class C3213f implements C3192c {

    /* renamed from: b */
    int[] f8042b;

    /* renamed from: c */
    private int f8043c = -1;

    /* renamed from: d */
    private int f8044d = -1;

    /* renamed from: e */
    private boolean f8045e;

    /* renamed from: f */
    private int[] f8046f;

    /* renamed from: g */
    private ByteBuffer f8047g = f7942a;

    /* renamed from: h */
    private ByteBuffer f8048h = f7942a;

    /* renamed from: i */
    private boolean f8049i;

    /* renamed from: c */
    public final int mo18904c() {
        return 2;
    }

    /* renamed from: a */
    public final boolean mo18902a(int i, int i2, int i3) throws C3192c.C3193a {
        boolean z = !Arrays.equals(this.f8042b, this.f8046f);
        int[] iArr = this.f8042b;
        this.f8046f = iArr;
        if (iArr == null) {
            this.f8045e = false;
            return z;
        } else if (i3 != 2) {
            throw new C3192c.C3193a(i, i2, i3);
        } else if (!z && this.f8044d == i && this.f8043c == i2) {
            return false;
        } else {
            this.f8044d = i;
            this.f8043c = i2;
            this.f8045e = i2 != this.f8046f.length;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f8046f;
                if (i4 >= iArr2.length) {
                    return true;
                }
                int i5 = iArr2[i4];
                if (i5 < i2) {
                    this.f8045e = (i5 != i4) | this.f8045e;
                    i4++;
                } else {
                    throw new C3192c.C3193a(i, i2, i3);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo18901a() {
        return this.f8045e;
    }

    /* renamed from: b */
    public final int mo18903b() {
        int[] iArr = this.f8046f;
        return iArr == null ? this.f8043c : iArr.length;
    }

    /* renamed from: a */
    public final void mo18900a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.f8043c * 2)) * this.f8046f.length * 2;
        if (this.f8047g.capacity() < length) {
            this.f8047g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f8047g.clear();
        }
        while (position < limit) {
            for (int i : this.f8046f) {
                this.f8047g.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f8043c * 2;
        }
        byteBuffer.position(limit);
        this.f8047g.flip();
        this.f8048h = this.f8047g;
    }

    /* renamed from: d */
    public final void mo18905d() {
        this.f8049i = true;
    }

    /* renamed from: e */
    public final ByteBuffer mo18906e() {
        ByteBuffer byteBuffer = this.f8048h;
        this.f8048h = f7942a;
        return byteBuffer;
    }

    /* renamed from: f */
    public final boolean mo18907f() {
        return this.f8049i && this.f8048h == f7942a;
    }

    /* renamed from: g */
    public final void mo18908g() {
        this.f8048h = f7942a;
        this.f8049i = false;
    }

    /* renamed from: h */
    public final void mo18909h() {
        mo18908g();
        this.f8047g = f7942a;
        this.f8043c = -1;
        this.f8044d = -1;
        this.f8046f = null;
        this.f8045e = false;
    }
}
