package com.tapjoy.internal;

import com.google.common.base.Ascii;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.tapjoy.internal.if */
public final class C9410if {

    /* renamed from: a */
    private final byte[] f23375a = new byte[256];

    /* renamed from: b */
    private ByteBuffer f23376b;

    /* renamed from: c */
    private C9409ie f23377c;

    /* renamed from: d */
    private int f23378d = 0;

    /* renamed from: a */
    public final C9410if mo58341a(byte[] bArr) {
        if (bArr != null) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.f23376b = null;
            Arrays.fill(this.f23375a, (byte) 0);
            this.f23377c = new C9409ie();
            this.f23378d = 0;
            ByteBuffer asReadOnlyBuffer = wrap.asReadOnlyBuffer();
            this.f23376b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f23376b.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f23376b = null;
            this.f23377c.f23363b = 2;
        }
        return this;
    }

    /* renamed from: a */
    public final C9409ie mo58340a() {
        if (this.f23376b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m25265h()) {
            return this.f23377c;
        } else {
            m25261d();
            if (!m25265h()) {
                m25259b();
                if (this.f23377c.f23364c < 0) {
                    this.f23377c.f23363b = 1;
                }
            }
            return this.f23377c;
        }
    }

    /* renamed from: b */
    private void m25259b() {
        boolean z = false;
        while (!z && !m25265h() && this.f23377c.f23364c <= Integer.MAX_VALUE) {
            int g = m25264g();
            if (g == 33) {
                int g2 = m25264g();
                if (g2 == 1) {
                    m25262e();
                } else if (g2 == 249) {
                    this.f23377c.f23365d = new C9408id();
                    m25264g();
                    int g3 = m25264g();
                    this.f23377c.f23365d.f23357g = (g3 & 28) >> 2;
                    if (this.f23377c.f23365d.f23357g == 0) {
                        this.f23377c.f23365d.f23357g = 1;
                    }
                    this.f23377c.f23365d.f23356f = (g3 & 1) != 0;
                    short s = this.f23376b.getShort();
                    if (s < 2) {
                        s = 10;
                    }
                    this.f23377c.f23365d.f23359i = s * 10;
                    this.f23377c.f23365d.f23358h = m25264g();
                    m25264g();
                } else if (g2 == 254) {
                    m25262e();
                } else if (g2 != 255) {
                    m25262e();
                } else {
                    m25263f();
                    String str = "";
                    for (int i = 0; i < 11; i++) {
                        str = str + ((char) this.f23375a[i]);
                    }
                    if (str.equals("NETSCAPE2.0")) {
                        m25260c();
                    } else {
                        m25262e();
                    }
                }
            } else if (g == 44) {
                if (this.f23377c.f23365d == null) {
                    this.f23377c.f23365d = new C9408id();
                }
                this.f23377c.f23365d.f23351a = this.f23376b.getShort();
                this.f23377c.f23365d.f23352b = this.f23376b.getShort();
                this.f23377c.f23365d.f23353c = this.f23376b.getShort();
                this.f23377c.f23365d.f23354d = this.f23376b.getShort();
                int g4 = m25264g();
                boolean z2 = (g4 & 128) != 0;
                int pow = (int) Math.pow(2.0d, (double) ((g4 & 7) + 1));
                this.f23377c.f23365d.f23355e = (g4 & 64) != 0;
                if (z2) {
                    this.f23377c.f23365d.f23361k = m25258a(pow);
                } else {
                    this.f23377c.f23365d.f23361k = null;
                }
                this.f23377c.f23365d.f23360j = this.f23376b.position();
                m25264g();
                m25262e();
                if (!m25265h()) {
                    this.f23377c.f23364c++;
                    this.f23377c.f23366e.add(this.f23377c.f23365d);
                }
            } else if (g != 59) {
                this.f23377c.f23363b = 1;
            } else {
                z = true;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m25260c() {
        /*
            r3 = this;
        L_0x0000:
            r3.m25263f()
            byte[] r0 = r3.f23375a
            r1 = 0
            byte r1 = r0[r1]
            r2 = 1
            if (r1 != r2) goto L_0x0026
            byte r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            com.tapjoy.internal.ie r2 = r3.f23377c
            int r0 = r0 << 8
            r0 = r0 | r1
            r2.f23374m = r0
            com.tapjoy.internal.ie r0 = r3.f23377c
            int r0 = r0.f23374m
            if (r0 != 0) goto L_0x0026
            com.tapjoy.internal.ie r0 = r3.f23377c
            r1 = -1
            r0.f23374m = r1
        L_0x0026:
            int r0 = r3.f23378d
            if (r0 <= 0) goto L_0x0030
            boolean r0 = r3.m25265h()
            if (r0 == 0) goto L_0x0000
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9410if.m25260c():void");
    }

    /* renamed from: d */
    private void m25261d() {
        boolean z = false;
        String str = "";
        for (int i = 0; i < 6; i++) {
            str = str + ((char) m25264g());
        }
        if (!str.startsWith("GIF")) {
            this.f23377c.f23363b = 1;
            return;
        }
        this.f23377c.f23367f = this.f23376b.getShort();
        this.f23377c.f23368g = this.f23376b.getShort();
        int g = m25264g();
        C9409ie ieVar = this.f23377c;
        if ((g & 128) != 0) {
            z = true;
        }
        ieVar.f23369h = z;
        this.f23377c.f23370i = 2 << (g & 7);
        this.f23377c.f23371j = m25264g();
        this.f23377c.f23372k = m25264g();
        if (this.f23377c.f23369h && !m25265h()) {
            C9409ie ieVar2 = this.f23377c;
            ieVar2.f23362a = m25258a(ieVar2.f23370i);
            C9409ie ieVar3 = this.f23377c;
            ieVar3.f23373l = ieVar3.f23362a[this.f23377c.f23371j];
        }
    }

    /* renamed from: a */
    private int[] m25258a(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f23376b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << Ascii.DLE) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException unused) {
            this.f23377c.f23363b = 1;
        }
        return iArr;
    }

    /* renamed from: e */
    private void m25262e() {
        int g;
        do {
            try {
                g = m25264g();
                this.f23376b.position(this.f23376b.position() + g);
            } catch (IllegalArgumentException unused) {
                return;
            }
        } while (g > 0);
    }

    /* renamed from: f */
    private int m25263f() {
        int g = m25264g();
        this.f23378d = g;
        int i = 0;
        if (g > 0) {
            int i2 = 0;
            while (i < this.f23378d) {
                try {
                    i2 = this.f23378d - i;
                    this.f23376b.get(this.f23375a, i, i2);
                    i += i2;
                } catch (Exception unused) {
                    Integer.valueOf(i);
                    Integer.valueOf(i2);
                    Integer.valueOf(this.f23378d);
                    this.f23377c.f23363b = 1;
                }
            }
        }
        return i;
    }

    /* renamed from: g */
    private int m25264g() {
        try {
            return this.f23376b.get() & 255;
        } catch (Exception unused) {
            this.f23377c.f23363b = 1;
            return 0;
        }
    }

    /* renamed from: h */
    private boolean m25265h() {
        return this.f23377c.f23363b != 0;
    }
}
