package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.zip.Inflater;

public final class dz0 extends s81 {

    /* renamed from: n */
    private final fy0 f32843n = new fy0();

    /* renamed from: o */
    private final fy0 f32844o = new fy0();

    /* renamed from: p */
    private final C12943a f32845p = new C12943a();

    /* renamed from: q */
    private Inflater f32846q;

    public dz0() {
        super("PgsDecoder");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.mobile.ads.impl.yb1 mo65718a(byte[] r6, int r7, boolean r8) throws com.yandex.mobile.ads.impl.ac1 {
        /*
            r5 = this;
            com.yandex.mobile.ads.impl.fy0 r8 = r5.f32843n
            r8.mo67103a((byte[]) r6, (int) r7)
            com.yandex.mobile.ads.impl.fy0 r6 = r5.f32843n
            int r7 = r6.mo67098a()
            if (r7 <= 0) goto L_0x0096
            int r7 = r6.mo67111e()
            r8 = 120(0x78, float:1.68E-43)
            if (r7 != r8) goto L_0x0096
            java.util.zip.Inflater r7 = r5.f32846q
            if (r7 != 0) goto L_0x0020
            java.util.zip.Inflater r7 = new java.util.zip.Inflater
            r7.<init>()
            r5.f32846q = r7
        L_0x0020:
            com.yandex.mobile.ads.impl.fy0 r7 = r5.f32844o
            java.util.zip.Inflater r8 = r5.f32846q
            int r0 = com.yandex.mobile.ads.impl.ih1.f34858a
            int r0 = r6.mo67098a()
            r1 = 0
            if (r0 > 0) goto L_0x002e
            goto L_0x0089
        L_0x002e:
            byte[] r0 = r7.f33778a
            int r2 = r0.length
            int r3 = r6.mo67098a()
            if (r2 >= r3) goto L_0x003f
            int r0 = r6.mo67098a()
            int r0 = r0 * 2
            byte[] r0 = new byte[r0]
        L_0x003f:
            if (r8 != 0) goto L_0x0046
            java.util.zip.Inflater r8 = new java.util.zip.Inflater
            r8.<init>()
        L_0x0046:
            byte[] r2 = r6.f33778a
            int r3 = r6.mo67105b()
            int r4 = r6.mo67098a()
            r8.setInput(r2, r3, r4)
            r2 = 0
        L_0x0054:
            int r3 = r0.length     // Catch:{ DataFormatException -> 0x0086, all -> 0x0081 }
            int r3 = r3 - r2
            int r3 = r8.inflate(r0, r2, r3)     // Catch:{ DataFormatException -> 0x0086, all -> 0x0081 }
            int r2 = r2 + r3
            boolean r3 = r8.finished()     // Catch:{ DataFormatException -> 0x0086, all -> 0x0081 }
            if (r3 == 0) goto L_0x0069
            r7.mo67103a((byte[]) r0, (int) r2)     // Catch:{ DataFormatException -> 0x0086, all -> 0x0081 }
            r8.reset()
            r1 = 1
            goto L_0x0089
        L_0x0069:
            boolean r3 = r8.needsDictionary()     // Catch:{ DataFormatException -> 0x0086, all -> 0x0081 }
            if (r3 != 0) goto L_0x0086
            boolean r3 = r8.needsInput()     // Catch:{ DataFormatException -> 0x0086, all -> 0x0081 }
            if (r3 == 0) goto L_0x0076
            goto L_0x0086
        L_0x0076:
            int r3 = r0.length     // Catch:{ DataFormatException -> 0x0086, all -> 0x0081 }
            if (r2 != r3) goto L_0x0054
            int r3 = r0.length     // Catch:{ DataFormatException -> 0x0086, all -> 0x0081 }
            int r3 = r3 * 2
            byte[] r0 = java.util.Arrays.copyOf(r0, r3)     // Catch:{ DataFormatException -> 0x0086, all -> 0x0081 }
            goto L_0x0054
        L_0x0081:
            r6 = move-exception
            r8.reset()
            throw r6
        L_0x0086:
            r8.reset()
        L_0x0089:
            if (r1 == 0) goto L_0x0096
            com.yandex.mobile.ads.impl.fy0 r7 = r5.f32844o
            byte[] r8 = r7.f33778a
            int r7 = r7.mo67107c()
            r6.mo67103a((byte[]) r8, (int) r7)
        L_0x0096:
            com.yandex.mobile.ads.impl.dz0$a r6 = r5.f32845p
            r6.mo66719b()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x00a0:
            com.yandex.mobile.ads.impl.fy0 r7 = r5.f32843n
            int r7 = r7.mo67098a()
            r8 = 3
            if (r7 < r8) goto L_0x00e9
            com.yandex.mobile.ads.impl.fy0 r7 = r5.f32843n
            com.yandex.mobile.ads.impl.dz0$a r8 = r5.f32845p
            int r0 = r7.mo67107c()
            int r1 = r7.mo67126r()
            int r2 = r7.mo67132x()
            int r3 = r7.mo67105b()
            int r3 = r3 + r2
            r4 = 0
            if (r3 <= r0) goto L_0x00c5
            r7.mo67112e(r0)
            goto L_0x00e3
        L_0x00c5:
            r0 = 128(0x80, float:1.794E-43)
            if (r1 == r0) goto L_0x00d9
            switch(r1) {
                case 20: goto L_0x00d5;
                case 21: goto L_0x00d1;
                case 22: goto L_0x00cd;
                default: goto L_0x00cc;
            }
        L_0x00cc:
            goto L_0x00e0
        L_0x00cd:
            com.yandex.mobile.ads.impl.dz0.C12943a.m35512c(r8, r7, r2)
            goto L_0x00e0
        L_0x00d1:
            com.yandex.mobile.ads.impl.dz0.C12943a.m35511b(r8, r7, r2)
            goto L_0x00e0
        L_0x00d5:
            com.yandex.mobile.ads.impl.dz0.C12943a.m35510a(r8, r7, r2)
            goto L_0x00e0
        L_0x00d9:
            com.yandex.mobile.ads.impl.ti r4 = r8.mo66718a()
            r8.mo66719b()
        L_0x00e0:
            r7.mo67112e(r3)
        L_0x00e3:
            if (r4 == 0) goto L_0x00a0
            r6.add(r4)
            goto L_0x00a0
        L_0x00e9:
            com.yandex.mobile.ads.impl.ez0 r7 = new com.yandex.mobile.ads.impl.ez0
            java.util.List r6 = java.util.Collections.unmodifiableList(r6)
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.dz0.mo65718a(byte[], int, boolean):com.yandex.mobile.ads.impl.yb1");
    }

    /* renamed from: com.yandex.mobile.ads.impl.dz0$a */
    private static final class C12943a {

        /* renamed from: a */
        private final fy0 f32847a = new fy0();

        /* renamed from: b */
        private final int[] f32848b = new int[256];

        /* renamed from: c */
        private boolean f32849c;

        /* renamed from: d */
        private int f32850d;

        /* renamed from: e */
        private int f32851e;

        /* renamed from: f */
        private int f32852f;

        /* renamed from: g */
        private int f32853g;

        /* renamed from: h */
        private int f32854h;

        /* renamed from: i */
        private int f32855i;

        /* renamed from: a */
        static void m35510a(C12943a aVar, fy0 fy0, int i) {
            C12943a aVar2 = aVar;
            aVar.getClass();
            if (i % 5 == 2) {
                fy0.mo67114f(2);
                Arrays.fill(aVar2.f32848b, 0);
                int i2 = i / 5;
                for (int i3 = 0; i3 < i2; i3++) {
                    int r = fy0.mo67126r();
                    int r2 = fy0.mo67126r();
                    int r3 = fy0.mo67126r();
                    int r4 = fy0.mo67126r();
                    int r5 = fy0.mo67126r();
                    double d = (double) r2;
                    double d2 = (double) (r3 - 128);
                    double d3 = (double) (r4 - 128);
                    int i4 = (int) (d + (d3 * 1.772d));
                    int[] iArr = aVar2.f32848b;
                    int i5 = ih1.f34858a;
                    iArr[r] = (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8) | (r5 << 24) | (Math.max(0, Math.min((int) ((1.402d * d2) + d), 255)) << 16) | Math.max(0, Math.min(i4, 255));
                }
                aVar2.f32849c = true;
            }
        }

        /* renamed from: b */
        static void m35511b(C12943a aVar, fy0 fy0, int i) {
            int u;
            aVar.getClass();
            if (i >= 4) {
                fy0.mo67114f(3);
                int i2 = i - 4;
                if ((fy0.mo67126r() & 128) != 0) {
                    if (i2 >= 7 && (u = fy0.mo67129u()) >= 4) {
                        aVar.f32854h = fy0.mo67132x();
                        aVar.f32855i = fy0.mo67132x();
                        aVar.f32847a.mo67108c(u - 4);
                        i2 -= 7;
                    } else {
                        return;
                    }
                }
                int b = aVar.f32847a.mo67105b();
                int c = aVar.f32847a.mo67107c();
                if (b < c && i2 > 0) {
                    int min = Math.min(i2, c - b);
                    fy0.mo67104a(aVar.f32847a.f33778a, b, min);
                    aVar.f32847a.mo67112e(b + min);
                }
            }
        }

        /* renamed from: c */
        static void m35512c(C12943a aVar, fy0 fy0, int i) {
            aVar.getClass();
            if (i >= 19) {
                aVar.f32850d = fy0.mo67132x();
                aVar.f32851e = fy0.mo67132x();
                fy0.mo67114f(11);
                aVar.f32852f = fy0.mo67132x();
                aVar.f32853g = fy0.mo67132x();
            }
        }

        /* renamed from: b */
        public void mo66719b() {
            this.f32850d = 0;
            this.f32851e = 0;
            this.f32852f = 0;
            this.f32853g = 0;
            this.f32854h = 0;
            this.f32855i = 0;
            this.f32847a.mo67108c(0);
            this.f32849c = false;
        }

        /* renamed from: a */
        public C14683ti mo66718a() {
            int i;
            int i2;
            int i3;
            if (this.f32850d == 0 || this.f32851e == 0 || this.f32854h == 0 || this.f32855i == 0 || this.f32847a.mo67107c() == 0 || this.f32847a.mo67105b() != this.f32847a.mo67107c() || !this.f32849c) {
                return null;
            }
            this.f32847a.mo67112e(0);
            int i4 = this.f32854h * this.f32855i;
            int[] iArr = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int r = this.f32847a.mo67126r();
                if (r != 0) {
                    i3 = i5 + 1;
                    iArr[i5] = this.f32848b[r];
                } else {
                    int r2 = this.f32847a.mo67126r();
                    if (r2 != 0) {
                        if ((r2 & 64) == 0) {
                            i = r2 & 63;
                        } else {
                            i = ((r2 & 63) << 8) | this.f32847a.mo67126r();
                        }
                        if ((r2 & 128) == 0) {
                            i2 = 0;
                        } else {
                            i2 = this.f32848b[this.f32847a.mo67126r()];
                        }
                        i3 = i + i5;
                        Arrays.fill(iArr, i5, i3, i2);
                    }
                }
                i5 = i3;
            }
            Bitmap createBitmap = Bitmap.createBitmap(iArr, this.f32854h, this.f32855i, Bitmap.Config.ARGB_8888);
            float f = (float) this.f32850d;
            float f2 = (float) this.f32851e;
            return new C14683ti(createBitmap, ((float) this.f32852f) / f, 0, ((float) this.f32853g) / f2, 0, ((float) this.f32854h) / f, ((float) this.f32855i) / f2);
        }
    }
}
