package com.fyber.inneractive.sdk.player.p059c.p060a;

import com.fyber.inneractive.sdk.player.p059c.p060a.C3192c;
import java.nio.ByteBuffer;

/* renamed from: com.fyber.inneractive.sdk.player.c.a.i */
final class C3217i implements C3192c {

    /* renamed from: b */
    private int f8063b = -1;

    /* renamed from: c */
    private int f8064c = -1;

    /* renamed from: d */
    private int f8065d = 0;

    /* renamed from: e */
    private ByteBuffer f8066e = f7942a;

    /* renamed from: f */
    private ByteBuffer f8067f = f7942a;

    /* renamed from: g */
    private boolean f8068g;

    /* renamed from: c */
    public final int mo18904c() {
        return 2;
    }

    /* renamed from: a */
    public final boolean mo18902a(int i, int i2, int i3) throws C3192c.C3193a {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new C3192c.C3193a(i, i2, i3);
        } else if (this.f8063b == i && this.f8064c == i2 && this.f8065d == i3) {
            return false;
        } else {
            this.f8063b = i;
            this.f8064c = i2;
            this.f8065d = i3;
            if (i3 != 2) {
                return true;
            }
            this.f8066e = f7942a;
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo18901a() {
        int i = this.f8065d;
        return (i == 0 || i == 2) ? false : true;
    }

    /* renamed from: b */
    public final int mo18903b() {
        return this.f8064c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081 A[LOOP:2: B:23:0x0081->B:24:0x0083, LOOP_START, PHI: r0 
      PHI: (r0v2 int) = (r0v0 int), (r0v3 int) binds: [B:14:0x0041, B:24:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18900a(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f8065d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L_0x0020
            if (r3 == r6) goto L_0x0021
            if (r3 != r4) goto L_0x001a
            int r2 = r2 / 2
            goto L_0x0023
        L_0x001a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0020:
            int r2 = r2 / r6
        L_0x0021:
            int r2 = r2 * 2
        L_0x0023:
            java.nio.ByteBuffer r3 = r7.f8066e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L_0x003a
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f8066e = r2
            goto L_0x003f
        L_0x003a:
            java.nio.ByteBuffer r2 = r7.f8066e
            r2.clear()
        L_0x003f:
            int r2 = r7.f8065d
            if (r2 == r5) goto L_0x0081
            if (r2 == r6) goto L_0x0068
            if (r2 != r4) goto L_0x0062
        L_0x0047:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f8066e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f8066e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L_0x0047
        L_0x0062:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0068:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f8066e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f8066e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + -128
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L_0x0068
        L_0x0081:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f8066e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f8066e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L_0x0081
        L_0x009c:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f8066e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f8066e
            r7.f8067f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p060a.C3217i.mo18900a(java.nio.ByteBuffer):void");
    }

    /* renamed from: d */
    public final void mo18905d() {
        this.f8068g = true;
    }

    /* renamed from: e */
    public final ByteBuffer mo18906e() {
        ByteBuffer byteBuffer = this.f8067f;
        this.f8067f = f7942a;
        return byteBuffer;
    }

    /* renamed from: f */
    public final boolean mo18907f() {
        return this.f8068g && this.f8067f == f7942a;
    }

    /* renamed from: g */
    public final void mo18908g() {
        this.f8067f = f7942a;
        this.f8068g = false;
    }

    /* renamed from: h */
    public final void mo18909h() {
        mo18908g();
        this.f8066e = f7942a;
        this.f8063b = -1;
        this.f8064c = -1;
        this.f8065d = 0;
    }
}
