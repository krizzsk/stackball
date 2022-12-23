package com.yandex.mobile.ads.impl;

import android.text.Layout;

public final class iq1 extends C14683ti {

    /* renamed from: g */
    public final long f34992g;

    /* renamed from: h */
    public final long f34993h;

    /* renamed from: com.yandex.mobile.ads.impl.iq1$b */
    public static class C13435b {

        /* renamed from: a */
        private long f34994a;

        /* renamed from: b */
        private long f34995b;

        /* renamed from: c */
        private CharSequence f34996c;

        /* renamed from: d */
        private int f34997d;

        /* renamed from: e */
        private float f34998e;

        /* renamed from: f */
        private int f34999f;

        /* renamed from: g */
        private int f35000g;

        /* renamed from: h */
        private float f35001h;

        /* renamed from: i */
        private int f35002i;

        /* renamed from: j */
        private float f35003j;

        public C13435b() {
            mo67880b();
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x007d  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0094  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.yandex.mobile.ads.impl.iq1 mo67876a() {
            /*
                r24 = this;
                r0 = r24
                float r1 = r0.f34998e
                int r2 = r0.f34999f
                r3 = 0
                r4 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                r5 = 1065353216(0x3f800000, float:1.0)
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 == 0) goto L_0x001b
                if (r2 != 0) goto L_0x001b
                int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r7 < 0) goto L_0x0020
                int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r7 <= 0) goto L_0x001b
                goto L_0x0020
            L_0x001b:
                if (r6 == 0) goto L_0x001e
                goto L_0x0026
            L_0x001e:
                if (r2 != 0) goto L_0x0023
            L_0x0020:
                r1 = 1065353216(0x3f800000, float:1.0)
                goto L_0x0026
            L_0x0023:
                r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            L_0x0026:
                r0.f34998e = r1
                float r1 = r0.f35001h
                r2 = 1056964608(0x3f000000, float:0.5)
                r6 = 5
                r7 = 4
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 != 0) goto L_0x003f
                int r1 = r0.f34997d
                if (r1 == r7) goto L_0x003d
                if (r1 == r6) goto L_0x003b
                r3 = 1056964608(0x3f000000, float:0.5)
                goto L_0x003d
            L_0x003b:
                r3 = 1065353216(0x3f800000, float:1.0)
            L_0x003d:
                r0.f35001h = r3
            L_0x003f:
                int r1 = r0.f35002i
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = 3
                r8 = 2
                r9 = 1
                if (r1 != r3) goto L_0x0059
                int r1 = r0.f34997d
                if (r1 == r9) goto L_0x0056
                if (r1 == r4) goto L_0x0054
                if (r1 == r7) goto L_0x0056
                if (r1 == r6) goto L_0x0054
                r1 = 1
                goto L_0x0057
            L_0x0054:
                r1 = 2
                goto L_0x0057
            L_0x0056:
                r1 = 0
            L_0x0057:
                r0.f35002i = r1
            L_0x0059:
                float r1 = r0.f35003j
                int r3 = r0.f35002i
                float r10 = r0.f35001h
                if (r3 == 0) goto L_0x007d
                if (r3 == r9) goto L_0x0070
                if (r3 != r8) goto L_0x0066
                goto L_0x007f
            L_0x0066:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = java.lang.String.valueOf(r3)
                r1.<init>(r2)
                throw r1
            L_0x0070:
                r3 = 1073741824(0x40000000, float:2.0)
                int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r2 > 0) goto L_0x0079
                float r10 = r10 * r3
                goto L_0x007f
            L_0x0079:
                float r5 = r5 - r10
                float r10 = r5 * r3
                goto L_0x007f
            L_0x007d:
                float r10 = r5 - r10
            L_0x007f:
                float r1 = java.lang.Math.min(r1, r10)
                r0.f35003j = r1
                com.yandex.mobile.ads.impl.iq1 r1 = new com.yandex.mobile.ads.impl.iq1
                long r11 = r0.f34994a
                long r13 = r0.f34995b
                java.lang.CharSequence r15 = r0.f34996c
                r15.getClass()
                int r2 = r0.f34997d
                if (r2 == r9) goto L_0x00ba
                if (r2 == r8) goto L_0x00b7
                if (r2 == r4) goto L_0x00b4
                if (r2 == r7) goto L_0x00ba
                if (r2 == r6) goto L_0x00b4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Unknown textAlignment: "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                java.lang.String r3 = "WebvttCueBuilder"
                android.util.Log.w(r3, r2)
                r2 = 0
                goto L_0x00bc
            L_0x00b4:
                android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L_0x00bc
            L_0x00b7:
                android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L_0x00bc
            L_0x00ba:
                android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_NORMAL
            L_0x00bc:
                r16 = r2
                float r2 = r0.f34998e
                int r3 = r0.f34999f
                int r4 = r0.f35000g
                float r5 = r0.f35001h
                int r6 = r0.f35002i
                float r7 = r0.f35003j
                r23 = 0
                r10 = r1
                r17 = r2
                r18 = r3
                r19 = r4
                r20 = r5
                r21 = r6
                r22 = r7
                r10.<init>(r11, r13, r15, r16, r17, r18, r19, r20, r21, r22)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.iq1.C13435b.mo67876a():com.yandex.mobile.ads.impl.iq1");
        }

        /* renamed from: b */
        public void mo67880b() {
            this.f34994a = 0;
            this.f34995b = 0;
            this.f34996c = null;
            this.f34997d = 2;
            this.f34998e = -3.4028235E38f;
            this.f34999f = 1;
            this.f35000g = 0;
            this.f35001h = -3.4028235E38f;
            this.f35002i = Integer.MIN_VALUE;
            this.f35003j = 1.0f;
        }

        /* renamed from: c */
        public C13435b mo67882c(int i) {
            this.f35002i = i;
            return this;
        }

        /* renamed from: d */
        public C13435b mo67883d(int i) {
            this.f34997d = i;
            return this;
        }

        /* renamed from: c */
        public C13435b mo67881c(float f) {
            this.f35003j = f;
            return this;
        }

        /* renamed from: b */
        public C13435b mo67879b(long j) {
            this.f34994a = j;
            return this;
        }

        /* renamed from: b */
        public C13435b mo67878b(int i) {
            this.f34999f = i;
            return this;
        }

        /* renamed from: b */
        public C13435b mo67877b(float f) {
            this.f35001h = f;
            return this;
        }

        /* renamed from: a */
        public C13435b mo67874a(long j) {
            this.f34995b = j;
            return this;
        }

        /* renamed from: a */
        public C13435b mo67875a(CharSequence charSequence) {
            this.f34996c = charSequence;
            return this;
        }

        /* renamed from: a */
        public C13435b mo67872a(float f) {
            this.f34998e = f;
            return this;
        }

        /* renamed from: a */
        public C13435b mo67873a(int i) {
            this.f35000g = i;
            return this;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private iq1(long j, long j2, CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3);
        this.f34992g = j;
        this.f34993h = j2;
    }
}
