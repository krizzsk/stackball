package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.yandex.mobile.ads.impl.gd */
public final class C13191gd {

    /* renamed from: n */
    public static final C13193b f33938n = new C13193b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final boolean f33939a;

    /* renamed from: b */
    private final boolean f33940b;

    /* renamed from: c */
    private final int f33941c;

    /* renamed from: d */
    private final int f33942d;

    /* renamed from: e */
    private final boolean f33943e;

    /* renamed from: f */
    private final boolean f33944f;

    /* renamed from: g */
    private final boolean f33945g;

    /* renamed from: h */
    private final int f33946h;

    /* renamed from: i */
    private final int f33947i;

    /* renamed from: j */
    private final boolean f33948j;

    /* renamed from: k */
    private final boolean f33949k;

    /* renamed from: l */
    private final boolean f33950l;

    /* renamed from: m */
    private String f33951m;

    static {
        new C13192a().mo67249b().mo67248a();
        new C13192a().mo67250c().mo67247a(Integer.MAX_VALUE, TimeUnit.SECONDS).mo67248a();
    }

    private C13191gd(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f33939a = z;
        this.f33940b = z2;
        this.f33941c = i;
        this.f33942d = i2;
        this.f33943e = z3;
        this.f33944f = z4;
        this.f33945g = z5;
        this.f33946h = i3;
        this.f33947i = i4;
        this.f33948j = z6;
        this.f33949k = z7;
        this.f33950l = z8;
        this.f33951m = str;
    }

    public /* synthetic */ C13191gd(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }

    /* renamed from: a */
    public final boolean mo67237a() {
        return this.f33943e;
    }

    /* renamed from: b */
    public final boolean mo67238b() {
        return this.f33944f;
    }

    /* renamed from: c */
    public final int mo67239c() {
        return this.f33941c;
    }

    /* renamed from: d */
    public final int mo67240d() {
        return this.f33946h;
    }

    /* renamed from: e */
    public final int mo67241e() {
        return this.f33947i;
    }

    /* renamed from: f */
    public final boolean mo67242f() {
        return this.f33945g;
    }

    /* renamed from: g */
    public final boolean mo67243g() {
        return this.f33939a;
    }

    /* renamed from: h */
    public final boolean mo67244h() {
        return this.f33940b;
    }

    /* renamed from: i */
    public final boolean mo67245i() {
        return this.f33948j;
    }

    public String toString() {
        String str = this.f33951m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f33939a) {
            sb.append("no-cache, ");
        }
        if (this.f33940b) {
            sb.append("no-store, ");
        }
        if (this.f33941c != -1) {
            sb.append("max-age=");
            sb.append(this.f33941c);
            sb.append(", ");
        }
        if (this.f33942d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f33942d);
            sb.append(", ");
        }
        if (this.f33943e) {
            sb.append("private, ");
        }
        if (this.f33944f) {
            sb.append("public, ");
        }
        if (this.f33945g) {
            sb.append("must-revalidate, ");
        }
        if (this.f33946h != -1) {
            sb.append("max-stale=");
            sb.append(this.f33946h);
            sb.append(", ");
        }
        if (this.f33947i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f33947i);
            sb.append(", ");
        }
        if (this.f33948j) {
            sb.append("only-if-cached, ");
        }
        if (this.f33949k) {
            sb.append("no-transform, ");
        }
        if (this.f33950l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f33951m = sb2;
        return sb2;
    }

    /* renamed from: com.yandex.mobile.ads.impl.gd$a */
    public static final class C13192a {

        /* renamed from: a */
        private boolean f33952a;

        /* renamed from: b */
        private int f33953b = -1;

        /* renamed from: c */
        private boolean f33954c;

        /* renamed from: a */
        public final C13192a mo67247a(int i, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                this.f33953b = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("maxStale < 0: ", Integer.valueOf(i)).toString());
        }

        /* renamed from: b */
        public final C13192a mo67249b() {
            this.f33952a = true;
            return this;
        }

        /* renamed from: c */
        public final C13192a mo67250c() {
            this.f33954c = true;
            return this;
        }

        /* renamed from: a */
        public final C13191gd mo67248a() {
            return new C13191gd(this.f33952a, false, -1, -1, false, false, false, this.f33953b, -1, this.f33954c, false, false, (String) null, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gd$b */
    public static final class C13193b {
        private C13193b() {
        }

        public /* synthetic */ C13193b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x010f  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x011a  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0210 A[LOOP:0: B:3:0x0025->B:88:0x0210, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x01f5 A[SYNTHETIC] */
        @kotlin.jvm.JvmStatic
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.yandex.mobile.ads.impl.C13191gd mo67251a(com.yandex.mobile.ads.impl.q90 r38) {
            /*
                r37 = this;
                r0 = r37
                r1 = r38
                java.lang.String r2 = "headers"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
                int r2 = r38.size()
                r6 = 1
                if (r2 <= 0) goto L_0x0216
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = -1
                r12 = -1
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = -1
                r17 = -1
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 1
            L_0x0025:
                int r3 = r7 + 1
                java.lang.String r5 = r1.mo69509a((int) r7)
                java.lang.String r7 = r1.mo69511b(r7)
                java.lang.String r4 = "Cache-Control"
                boolean r4 = kotlin.text.StringsKt.equals(r5, r4, r6)
                if (r4 == 0) goto L_0x003c
                if (r8 == 0) goto L_0x003a
                goto L_0x0044
            L_0x003a:
                r8 = r7
                goto L_0x0046
            L_0x003c:
                java.lang.String r4 = "Pragma"
                boolean r4 = kotlin.text.StringsKt.equals(r5, r4, r6)
                if (r4 == 0) goto L_0x01f1
            L_0x0044:
                r21 = 0
            L_0x0046:
                r4 = 0
            L_0x0047:
                int r5 = r7.length()
                if (r4 >= r5) goto L_0x01e5
                java.lang.String r5 = "=,;"
                int r5 = r0.m36548a(r7, r5, r4)
                java.lang.String r4 = r7.substring(r4, r5)
                java.lang.String r6 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
                if (r4 == 0) goto L_0x01df
                java.lang.CharSequence r4 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r4)
                java.lang.String r4 = r4.toString()
                r30 = r8
                int r8 = r7.length()
                if (r5 == r8) goto L_0x00fe
                char r8 = r7.charAt(r5)
                r31 = r9
                r9 = 44
                if (r8 == r9) goto L_0x0100
                char r8 = r7.charAt(r5)
                r9 = 59
                if (r8 != r9) goto L_0x0084
                goto L_0x0100
            L_0x0084:
                int r5 = r5 + 1
                byte[] r8 = com.yandex.mobile.ads.impl.jh1.f35305a
                java.lang.String r8 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)
                int r8 = r7.length()
                if (r5 >= r8) goto L_0x00af
            L_0x0093:
                int r9 = r5 + 1
                r32 = r10
                char r10 = r7.charAt(r5)
                r22 = r5
                r5 = 32
                if (r10 == r5) goto L_0x00a8
                r5 = 9
                if (r10 == r5) goto L_0x00a8
                r5 = r22
                goto L_0x00b5
            L_0x00a8:
                if (r9 < r8) goto L_0x00ab
                goto L_0x00b1
            L_0x00ab:
                r5 = r9
                r10 = r32
                goto L_0x0093
            L_0x00af:
                r32 = r10
            L_0x00b1:
                int r5 = r7.length()
            L_0x00b5:
                int r8 = r7.length()
                if (r5 >= r8) goto L_0x00df
                char r8 = r7.charAt(r5)
                r9 = 34
                if (r8 != r9) goto L_0x00df
                int r5 = r5 + 1
                r23 = 34
                r25 = 0
                r26 = 4
                r27 = 0
                r22 = r7
                r24 = r5
                int r1 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) r22, (char) r23, (int) r24, (boolean) r25, (int) r26, (java.lang.Object) r27)
                java.lang.String r5 = r7.substring(r5, r1)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
                r6 = 1
                int r1 = r1 + r6
                goto L_0x0106
            L_0x00df:
                java.lang.String r8 = ",;"
                int r8 = r0.m36548a(r7, r8, r5)
                java.lang.String r5 = r7.substring(r5, r8)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
                if (r5 == 0) goto L_0x00f8
                java.lang.CharSequence r1 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r5)
                java.lang.String r5 = r1.toString()
                r1 = r8
                goto L_0x0106
            L_0x00f8:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                r2.<init>(r1)
                throw r2
            L_0x00fe:
                r31 = r9
            L_0x0100:
                r32 = r10
                int r5 = r5 + 1
                r1 = r5
                r5 = 0
            L_0x0106:
                java.lang.String r6 = "no-cache"
                r8 = 1
                boolean r6 = kotlin.text.StringsKt.equals(r6, r4, r8)
                if (r6 == 0) goto L_0x011a
                r4 = r1
                r8 = r30
                r10 = r32
                r6 = 1
                r9 = 1
            L_0x0116:
                r1 = r38
                goto L_0x0047
            L_0x011a:
                java.lang.String r6 = "no-store"
                boolean r6 = kotlin.text.StringsKt.equals(r6, r4, r8)
                if (r6 == 0) goto L_0x012a
                r4 = r1
                r8 = r30
                r9 = r31
                r6 = 1
                r10 = 1
                goto L_0x0116
            L_0x012a:
                java.lang.String r6 = "max-age"
                boolean r6 = kotlin.text.StringsKt.equals(r6, r4, r8)
                if (r6 == 0) goto L_0x0140
                r6 = -1
                int r11 = com.yandex.mobile.ads.impl.jh1.m37809a((java.lang.String) r5, (int) r6)
            L_0x0137:
                r4 = r1
                r8 = r30
                r9 = r31
                r10 = r32
                r6 = 1
                goto L_0x0116
            L_0x0140:
                r6 = -1
                java.lang.String r9 = "s-maxage"
                boolean r9 = kotlin.text.StringsKt.equals(r9, r4, r8)
                if (r9 == 0) goto L_0x014e
                int r12 = com.yandex.mobile.ads.impl.jh1.m37809a((java.lang.String) r5, (int) r6)
                goto L_0x0137
            L_0x014e:
                java.lang.String r6 = "private"
                boolean r6 = kotlin.text.StringsKt.equals(r6, r4, r8)
                if (r6 == 0) goto L_0x0160
                r4 = r1
                r8 = r30
                r9 = r31
                r10 = r32
                r6 = 1
                r13 = 1
                goto L_0x0116
            L_0x0160:
                java.lang.String r6 = "public"
                boolean r6 = kotlin.text.StringsKt.equals(r6, r4, r8)
                if (r6 == 0) goto L_0x0172
                r4 = r1
                r8 = r30
                r9 = r31
                r10 = r32
                r6 = 1
                r14 = 1
                goto L_0x0116
            L_0x0172:
                java.lang.String r6 = "must-revalidate"
                boolean r6 = kotlin.text.StringsKt.equals(r6, r4, r8)
                if (r6 == 0) goto L_0x0184
                r4 = r1
                r8 = r30
                r9 = r31
                r10 = r32
                r6 = 1
                r15 = 1
                goto L_0x0116
            L_0x0184:
                java.lang.String r6 = "max-stale"
                boolean r6 = kotlin.text.StringsKt.equals(r6, r4, r8)
                if (r6 == 0) goto L_0x0194
                r4 = 2147483647(0x7fffffff, float:NaN)
                int r16 = com.yandex.mobile.ads.impl.jh1.m37809a((java.lang.String) r5, (int) r4)
                goto L_0x0137
            L_0x0194:
                java.lang.String r6 = "min-fresh"
                boolean r6 = kotlin.text.StringsKt.equals(r6, r4, r8)
                if (r6 == 0) goto L_0x01a2
                r6 = -1
                int r17 = com.yandex.mobile.ads.impl.jh1.m37809a((java.lang.String) r5, (int) r6)
                goto L_0x0137
            L_0x01a2:
                r6 = -1
                java.lang.String r5 = "only-if-cached"
                boolean r5 = kotlin.text.StringsKt.equals(r5, r4, r8)
                if (r5 == 0) goto L_0x01b7
                r4 = r1
                r8 = r30
                r9 = r31
                r10 = r32
                r6 = 1
                r18 = 1
                goto L_0x0116
            L_0x01b7:
                java.lang.String r5 = "no-transform"
                boolean r5 = kotlin.text.StringsKt.equals(r5, r4, r8)
                if (r5 == 0) goto L_0x01cb
                r4 = r1
                r8 = r30
                r9 = r31
                r10 = r32
                r6 = 1
                r19 = 1
                goto L_0x0116
            L_0x01cb:
                java.lang.String r5 = "immutable"
                boolean r4 = kotlin.text.StringsKt.equals(r5, r4, r8)
                if (r4 == 0) goto L_0x0137
                r4 = r1
                r8 = r30
                r9 = r31
                r10 = r32
                r6 = 1
                r20 = 1
                goto L_0x0116
            L_0x01df:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                r2.<init>(r1)
                throw r2
            L_0x01e5:
                r30 = r8
                r31 = r9
                r32 = r10
                r6 = -1
                r8 = 1
                r8 = r30
                r1 = 1
                goto L_0x01f3
            L_0x01f1:
                r1 = 1
                r6 = -1
            L_0x01f3:
                if (r3 < r2) goto L_0x0210
                r23 = r9
                r24 = r10
                r25 = r11
                r26 = r12
                r27 = r13
                r28 = r14
                r29 = r15
                r30 = r16
                r31 = r17
                r32 = r18
                r33 = r19
                r34 = r20
                r6 = r21
                goto L_0x0232
            L_0x0210:
                r1 = r38
                r7 = r3
                r6 = 1
                goto L_0x0025
            L_0x0216:
                r1 = 1
                r6 = -1
                r6 = 1
                r8 = 0
                r23 = 0
                r24 = 0
                r25 = -1
                r26 = -1
                r27 = 0
                r28 = 0
                r29 = 0
                r30 = -1
                r31 = -1
                r32 = 0
                r33 = 0
                r34 = 0
            L_0x0232:
                if (r6 != 0) goto L_0x0237
                r35 = 0
                goto L_0x0239
            L_0x0237:
                r35 = r8
            L_0x0239:
                com.yandex.mobile.ads.impl.gd r1 = new com.yandex.mobile.ads.impl.gd
                r36 = 0
                r22 = r1
                r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13191gd.C13193b.mo67251a(com.yandex.mobile.ads.impl.q90):com.yandex.mobile.ads.impl.gd");
        }

        /* renamed from: a */
        private final int m36548a(String str, String str2, int i) {
            int length = str.length();
            if (i < length) {
                while (true) {
                    int i2 = i + 1;
                    if (StringsKt.contains$default((CharSequence) str2, str.charAt(i), false, 2, (Object) null)) {
                        return i;
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            return str.length();
        }
    }
}
