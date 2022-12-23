package com.fyber.inneractive.sdk.player.p059c.p060a;

import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.smaato.sdk.video.vast.model.ErrorCode;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.c.a.j */
final class C3218j {

    /* renamed from: a */
    final int f8069a;

    /* renamed from: b */
    final int f8070b;

    /* renamed from: c */
    short[] f8071c;

    /* renamed from: d */
    short[] f8072d;

    /* renamed from: e */
    float f8073e = 1.0f;

    /* renamed from: f */
    float f8074f = 1.0f;

    /* renamed from: g */
    int f8075g;

    /* renamed from: h */
    int f8076h;

    /* renamed from: i */
    int f8077i;

    /* renamed from: j */
    int f8078j;

    /* renamed from: k */
    private final int f8079k;

    /* renamed from: l */
    private final int f8080l;

    /* renamed from: m */
    private final int f8081m;

    /* renamed from: n */
    private final short[] f8082n;

    /* renamed from: o */
    private int f8083o;

    /* renamed from: p */
    private int f8084p;

    /* renamed from: q */
    private int f8085q;

    /* renamed from: r */
    private short[] f8086r;

    /* renamed from: s */
    private int f8087s = 0;

    /* renamed from: t */
    private int f8088t = 0;

    /* renamed from: u */
    private int f8089u = 0;

    /* renamed from: v */
    private int f8090v;

    /* renamed from: w */
    private int f8091w;

    /* renamed from: x */
    private int f8092x;

    public C3218j(int i, int i2) {
        this.f8079k = i;
        this.f8069a = i2;
        this.f8080l = i / ErrorCode.GENERAL_LINEAR_ERROR;
        int i3 = i / 65;
        this.f8081m = i3;
        int i4 = i3 * 2;
        this.f8070b = i4;
        this.f8082n = new short[i4];
        this.f8083o = i4;
        this.f8071c = new short[(i4 * i2)];
        this.f8084p = i4;
        this.f8072d = new short[(i4 * i2)];
        this.f8085q = i4;
        this.f8086r = new short[(i4 * i2)];
    }

    /* renamed from: b */
    private void m7829b(int i) {
        int i2 = this.f8076h + i;
        int i3 = this.f8084p;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.f8084p = i4;
            this.f8072d = Arrays.copyOf(this.f8072d, i4 * this.f8069a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo18959a(int i) {
        int i2 = this.f8075g + i;
        int i3 = this.f8083o;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.f8083o = i4;
            this.f8071c = Arrays.copyOf(this.f8071c, i4 * this.f8069a);
        }
    }

    /* renamed from: a */
    private void m7828a(short[] sArr, int i, int i2) {
        m7829b(i2);
        int i3 = this.f8069a;
        System.arraycopy(sArr, i * i3, this.f8072d, this.f8076h * i3, i3 * i2);
        this.f8076h += i2;
    }

    /* renamed from: b */
    private void m7830b(short[] sArr, int i, int i2) {
        int i3 = this.f8070b / i2;
        int i4 = this.f8069a;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f8082n[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: a */
    private int m7826a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f8069a;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.f8091w = i5 / i7;
        this.f8092x = i8 / i6;
        return i7;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo18958a() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.f8076h;
        float f = this.f8073e / this.f8074f;
        double d = (double) f;
        int i8 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i9 = this.f8075g;
            if (i9 >= this.f8070b) {
                int i10 = 0;
                while (true) {
                    int i11 = this.f8078j;
                    if (i11 > 0) {
                        int min = Math.min(this.f8070b, i11);
                        m7828a(this.f8071c, i10, min);
                        this.f8078j -= min;
                        i10 += min;
                    } else {
                        short[] sArr = this.f8071c;
                        int i12 = this.f8079k;
                        int i13 = i12 > 4000 ? i12 / 4000 : 1;
                        if (this.f8069a == i8 && i13 == i8) {
                            i4 = m7826a(sArr, i10, this.f8080l, this.f8081m);
                        } else {
                            m7830b(sArr, i10, i13);
                            int a = m7826a(this.f8082n, 0, this.f8080l / i13, this.f8081m / i13);
                            if (i13 != i8) {
                                int i14 = a * i13;
                                int i15 = i13 * 4;
                                int i16 = i14 - i15;
                                int i17 = i14 + i15;
                                int i18 = this.f8080l;
                                if (i16 < i18) {
                                    i16 = i18;
                                }
                                int i19 = this.f8081m;
                                if (i17 > i19) {
                                    i17 = i19;
                                }
                                if (this.f8069a == i8) {
                                    i4 = m7826a(sArr, i10, i16, i17);
                                } else {
                                    m7830b(sArr, i10, i8);
                                    i4 = m7826a(this.f8082n, 0, i16, i17);
                                }
                            } else {
                                i4 = a;
                            }
                        }
                        int i20 = this.f8091w;
                        int i21 = i20 != 0 && this.f8089u != 0 && this.f8092x <= i20 * 3 && i20 * 2 > this.f8090v * 3 ? this.f8089u : i4;
                        this.f8090v = this.f8091w;
                        this.f8089u = i4;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f8071c;
                            if (f >= 2.0f) {
                                i6 = (int) (((float) i21) / (f - 1.0f));
                            } else {
                                this.f8078j = (int) ((((float) i21) * (2.0f - f)) / (f - 1.0f));
                                i6 = i21;
                            }
                            m7829b(i6);
                            int i22 = i6;
                            m7827a(i6, this.f8069a, this.f8072d, this.f8076h, sArr2, i10, sArr2, i10 + i21);
                            this.f8076h += i22;
                            i10 += i21 + i22;
                        } else {
                            int i23 = i21;
                            short[] sArr3 = this.f8071c;
                            if (f < 0.5f) {
                                i5 = (int) ((((float) i23) * f) / (1.0f - f));
                            } else {
                                this.f8078j = (int) ((((float) i23) * ((2.0f * f) - 1.0f)) / (1.0f - f));
                                i5 = i23;
                            }
                            int i24 = i23 + i5;
                            m7829b(i24);
                            int i25 = this.f8069a;
                            System.arraycopy(sArr3, i10 * i25, this.f8072d, this.f8076h * i25, i25 * i23);
                            m7827a(i5, this.f8069a, this.f8072d, this.f8076h + i23, sArr3, i23 + i10, sArr3, i10);
                            this.f8076h += i24;
                            i10 += i5;
                        }
                    }
                    if (this.f8070b + i10 > i9) {
                        break;
                    }
                    i8 = 1;
                }
                int i26 = this.f8075g - i10;
                short[] sArr4 = this.f8071c;
                int i27 = this.f8069a;
                System.arraycopy(sArr4, i10 * i27, sArr4, 0, i27 * i26);
                this.f8075g = i26;
            }
        } else {
            m7828a(this.f8071c, 0, this.f8075g);
            this.f8075g = 0;
        }
        float f2 = this.f8074f;
        if (f2 != 1.0f && this.f8076h != i7) {
            int i28 = this.f8079k;
            int i29 = (int) (((float) i28) / f2);
            while (true) {
                if (i29 <= 16384 && i28 <= 16384) {
                    break;
                }
                i29 /= 2;
                i28 /= 2;
            }
            int i30 = this.f8076h - i7;
            int i31 = this.f8077i + i30;
            int i32 = this.f8085q;
            if (i31 > i32) {
                int i33 = i32 + (i32 / 2) + i30;
                this.f8085q = i33;
                this.f8086r = Arrays.copyOf(this.f8086r, i33 * this.f8069a);
            }
            short[] sArr5 = this.f8072d;
            int i34 = this.f8069a;
            System.arraycopy(sArr5, i7 * i34, this.f8086r, this.f8077i * i34, i34 * i30);
            this.f8076h = i7;
            this.f8077i += i30;
            int i35 = 0;
            while (true) {
                i = this.f8077i;
                if (i35 >= i - 1) {
                    break;
                }
                while (true) {
                    i2 = this.f8087s;
                    int i36 = (i2 + 1) * i29;
                    i3 = this.f8088t;
                    if (i36 <= i3 * i28) {
                        break;
                    }
                    m7829b(1);
                    int i37 = 0;
                    while (true) {
                        int i38 = this.f8069a;
                        if (i37 >= i38) {
                            break;
                        }
                        short[] sArr6 = this.f8086r;
                        int i39 = (i35 * i38) + i37;
                        short s = sArr6[i39];
                        short s2 = sArr6[i39 + i38];
                        int i40 = this.f8087s;
                        int i41 = i40 * i29;
                        int i42 = (i40 + 1) * i29;
                        int i43 = i42 - (this.f8088t * i28);
                        int i44 = i42 - i41;
                        this.f8072d[(this.f8076h * i38) + i37] = (short) (((s * i43) + ((i44 - i43) * s2)) / i44);
                        i37++;
                    }
                    this.f8088t++;
                    this.f8076h++;
                }
                int i45 = i2 + 1;
                this.f8087s = i45;
                if (i45 == i28) {
                    this.f8087s = 0;
                    C3535a.m8784b(i3 == i29);
                    this.f8088t = 0;
                }
                i35++;
            }
            int i46 = i - 1;
            if (i46 != 0) {
                short[] sArr7 = this.f8086r;
                int i47 = this.f8069a;
                System.arraycopy(sArr7, i46 * i47, sArr7, 0, (i - i46) * i47);
                this.f8077i -= i46;
            }
        }
    }

    /* renamed from: a */
    private static void m7827a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }
}
