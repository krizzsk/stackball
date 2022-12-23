package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.ErrorCode;
import java.nio.ShortBuffer;
import java.util.Arrays;

final class ua1 {

    /* renamed from: a */
    private final int f40591a;

    /* renamed from: b */
    private final int f40592b;

    /* renamed from: c */
    private final float f40593c;

    /* renamed from: d */
    private final float f40594d;

    /* renamed from: e */
    private final float f40595e;

    /* renamed from: f */
    private final int f40596f;

    /* renamed from: g */
    private final int f40597g;

    /* renamed from: h */
    private final int f40598h;

    /* renamed from: i */
    private final short[] f40599i;

    /* renamed from: j */
    private short[] f40600j;

    /* renamed from: k */
    private int f40601k;

    /* renamed from: l */
    private short[] f40602l;

    /* renamed from: m */
    private int f40603m;

    /* renamed from: n */
    private short[] f40604n;

    /* renamed from: o */
    private int f40605o;

    /* renamed from: p */
    private int f40606p;

    /* renamed from: q */
    private int f40607q;

    /* renamed from: r */
    private int f40608r;

    /* renamed from: s */
    private int f40609s;

    /* renamed from: t */
    private int f40610t;

    /* renamed from: u */
    private int f40611u;

    /* renamed from: v */
    private int f40612v;

    public ua1(int i, int i2, float f, float f2, int i3) {
        this.f40591a = i;
        this.f40592b = i2;
        this.f40593c = f;
        this.f40594d = f2;
        this.f40595e = ((float) i) / ((float) i3);
        this.f40596f = i / ErrorCode.GENERAL_LINEAR_ERROR;
        int i4 = i / 65;
        this.f40597g = i4;
        int i5 = i4 * 2;
        this.f40598h = i5;
        this.f40599i = new short[i5];
        int i6 = i5 * i2;
        this.f40600j = new short[i6];
        this.f40602l = new short[i6];
        this.f40604n = new short[i6];
    }

    /* renamed from: c */
    private short[] m42642c(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f40592b;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: a */
    public void mo70310a(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f40592b, this.f40603m);
        shortBuffer.put(this.f40602l, 0, this.f40592b * min);
        int i = this.f40603m - min;
        this.f40603m = i;
        short[] sArr = this.f40602l;
        int i2 = this.f40592b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: b */
    public void mo70312b(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f40592b;
        int i2 = remaining / i;
        short[] c = m42642c(this.f40600j, this.f40601k, i2);
        this.f40600j = c;
        shortBuffer.get(c, this.f40601k * this.f40592b, ((i * i2) * 2) / 2);
        this.f40601k += i2;
        m42641c();
    }

    /* renamed from: d */
    public void mo70313d() {
        int i;
        int i2 = this.f40601k;
        float f = this.f40593c;
        float f2 = this.f40594d;
        int i3 = this.f40603m + ((int) ((((((float) i2) / (f / f2)) + ((float) this.f40605o)) / (this.f40595e * f2)) + 0.5f));
        this.f40600j = m42642c(this.f40600j, i2, (this.f40598h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.f40598h * 2;
            int i5 = this.f40592b;
            if (i4 >= i * i5) {
                break;
            }
            this.f40600j[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.f40601k += i;
        m42641c();
        if (this.f40603m > i3) {
            this.f40603m = i3;
        }
        this.f40601k = 0;
        this.f40608r = 0;
        this.f40605o = 0;
    }

    /* renamed from: a */
    public void mo70309a() {
        this.f40601k = 0;
        this.f40603m = 0;
        this.f40605o = 0;
        this.f40606p = 0;
        this.f40607q = 0;
        this.f40608r = 0;
        this.f40609s = 0;
        this.f40610t = 0;
        this.f40611u = 0;
        this.f40612v = 0;
    }

    /* renamed from: c */
    private void m42641c() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.f40603m;
        float f = this.f40593c;
        float f2 = this.f40594d;
        float f3 = f / f2;
        float f4 = this.f40595e * f2;
        double d = (double) f3;
        float f5 = 1.0f;
        int i9 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i10 = this.f40601k;
            if (i10 >= this.f40598h) {
                int i11 = 0;
                while (true) {
                    int i12 = this.f40608r;
                    if (i12 > 0) {
                        int min = Math.min(this.f40598h, i12);
                        m42639a(this.f40600j, i11, min);
                        this.f40608r -= min;
                        i11 += min;
                    } else {
                        short[] sArr = this.f40600j;
                        int i13 = this.f40591a;
                        int i14 = i13 > 4000 ? i13 / 4000 : 1;
                        if (this.f40592b == i9 && i14 == i9) {
                            i5 = m42637a(sArr, i11, this.f40596f, this.f40597g);
                        } else {
                            m42640b(sArr, i11, i14);
                            int a = m42637a(this.f40599i, 0, this.f40596f / i14, this.f40597g / i14);
                            if (i14 != i9) {
                                int i15 = a * i14;
                                int i16 = i14 * 4;
                                int i17 = i15 - i16;
                                int i18 = i15 + i16;
                                int i19 = this.f40596f;
                                if (i17 < i19) {
                                    i17 = i19;
                                }
                                int i20 = this.f40597g;
                                if (i18 > i20) {
                                    i18 = i20;
                                }
                                if (this.f40592b == i9) {
                                    i5 = m42637a(sArr, i11, i17, i18);
                                } else {
                                    m42640b(sArr, i11, i9);
                                    i5 = m42637a(this.f40599i, 0, i17, i18);
                                }
                            } else {
                                i5 = a;
                            }
                        }
                        int i21 = this.f40611u;
                        int i22 = i21 != 0 && this.f40609s != 0 && this.f40612v <= i21 * 3 && i21 * 2 > this.f40610t * 3 ? this.f40609s : i5;
                        this.f40610t = i21;
                        this.f40609s = i5;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f40600j;
                            if (f3 >= 2.0f) {
                                i7 = (int) (((float) i22) / (f3 - f5));
                            } else {
                                this.f40608r = (int) ((((float) i22) * (2.0f - f3)) / (f3 - f5));
                                i7 = i22;
                            }
                            short[] c = m42642c(this.f40602l, this.f40603m, i7);
                            this.f40602l = c;
                            int i23 = i7;
                            short[] sArr3 = sArr2;
                            m42638a(i7, this.f40592b, c, this.f40603m, sArr3, i11, sArr3, i11 + i22);
                            this.f40603m += i23;
                            i11 += i22 + i23;
                        } else {
                            int i24 = i22;
                            short[] sArr4 = this.f40600j;
                            if (f3 < 0.5f) {
                                i6 = (int) ((((float) i24) * f3) / (f5 - f3));
                            } else {
                                this.f40608r = (int) ((((float) i24) * ((2.0f * f3) - f5)) / (f5 - f3));
                                i6 = i24;
                            }
                            int i25 = i24 + i6;
                            short[] c2 = m42642c(this.f40602l, this.f40603m, i25);
                            this.f40602l = c2;
                            int i26 = this.f40592b;
                            System.arraycopy(sArr4, i11 * i26, c2, this.f40603m * i26, i26 * i24);
                            m42638a(i6, this.f40592b, this.f40602l, this.f40603m + i24, sArr4, i11 + i24, sArr4, i11);
                            this.f40603m += i25;
                            i11 += i6;
                        }
                    }
                    if (this.f40598h + i11 > i10) {
                        break;
                    }
                    f5 = 1.0f;
                    i9 = 1;
                }
                int i27 = this.f40601k - i11;
                short[] sArr5 = this.f40600j;
                int i28 = this.f40592b;
                System.arraycopy(sArr5, i11 * i28, sArr5, 0, i28 * i27);
                this.f40601k = i27;
                f5 = 1.0f;
            }
        } else {
            m42639a(this.f40600j, 0, this.f40601k);
            this.f40601k = 0;
        }
        if (f4 != f5 && this.f40603m != i8) {
            int i29 = this.f40591a;
            int i30 = (int) (((float) i29) / f4);
            while (true) {
                if (i30 <= 16384 && i29 <= 16384) {
                    break;
                }
                i30 /= 2;
                i29 /= 2;
            }
            int i31 = this.f40603m - i8;
            short[] c3 = m42642c(this.f40604n, this.f40605o, i31);
            this.f40604n = c3;
            short[] sArr6 = this.f40602l;
            int i32 = this.f40592b;
            System.arraycopy(sArr6, i8 * i32, c3, this.f40605o * i32, i32 * i31);
            this.f40603m = i8;
            this.f40605o += i31;
            int i33 = 0;
            while (true) {
                i = this.f40605o;
                i2 = i - 1;
                if (i33 >= i2) {
                    break;
                }
                while (true) {
                    i3 = this.f40606p + 1;
                    int i34 = i3 * i30;
                    i4 = this.f40607q;
                    if (i34 <= i4 * i29) {
                        break;
                    }
                    this.f40602l = m42642c(this.f40602l, this.f40603m, 1);
                    int i35 = 0;
                    while (true) {
                        int i36 = this.f40592b;
                        if (i35 >= i36) {
                            break;
                        }
                        short[] sArr7 = this.f40604n;
                        int i37 = (i33 * i36) + i35;
                        short s = sArr7[i37];
                        short s2 = sArr7[i37 + i36];
                        int i38 = this.f40606p;
                        int i39 = i38 * i30;
                        int i40 = (i38 + 1) * i30;
                        int i41 = i40 - (this.f40607q * i29);
                        int i42 = i40 - i39;
                        this.f40602l[(this.f40603m * i36) + i35] = (short) (((s * i41) + ((i42 - i41) * s2)) / i42);
                        i35++;
                    }
                    this.f40607q++;
                    this.f40603m++;
                }
                this.f40606p = i3;
                if (i3 == i29) {
                    this.f40606p = 0;
                    C13479j9.m37708b(i4 == i30);
                    this.f40607q = 0;
                }
                i33++;
            }
            if (i2 != 0) {
                short[] sArr8 = this.f40604n;
                int i43 = this.f40592b;
                System.arraycopy(sArr8, i2 * i43, sArr8, 0, (i - i2) * i43);
                this.f40605o -= i2;
            }
        }
    }

    /* renamed from: b */
    public int mo70311b() {
        return this.f40603m * this.f40592b * 2;
    }

    /* renamed from: b */
    private void m42640b(short[] sArr, int i, int i2) {
        int i3 = this.f40598h / i2;
        int i4 = this.f40592b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f40599i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: a */
    private void m42639a(short[] sArr, int i, int i2) {
        short[] c = m42642c(this.f40602l, this.f40603m, i2);
        this.f40602l = c;
        int i3 = this.f40592b;
        System.arraycopy(sArr, i * i3, c, this.f40603m * i3, i3 * i2);
        this.f40603m += i2;
    }

    /* renamed from: a */
    private int m42637a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f40592b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
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
        this.f40611u = i5 / i7;
        this.f40612v = i8 / i6;
        return i7;
    }

    /* renamed from: a */
    private static void m42638a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
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
