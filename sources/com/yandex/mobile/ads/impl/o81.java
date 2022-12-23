package com.yandex.mobile.ads.impl;

import java.io.File;
import java.util.regex.Pattern;

final class o81 extends C14752ud {

    /* renamed from: h */
    private static final Pattern f38114h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: i */
    private static final Pattern f38115i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: j */
    private static final Pattern f38116j = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    private o81(String str, long j, long j2, long j3, File file) {
        super(str, j, j2, j3, file);
    }

    /* renamed from: a */
    public static File m40311a(File file, int i, long j, long j2) {
        return new File(file, i + "." + j + "." + j2 + ".v3.exo");
    }

    /* renamed from: b */
    public static o81 m40312b(String str, long j) {
        return new o81(str, j, -1, -9223372036854775807L, (File) null);
    }

    /* renamed from: a */
    public static o81 m40309a(String str, long j) {
        return new o81(str, j, -1, -9223372036854775807L, (File) null);
    }

    /* renamed from: a */
    public static o81 m40310a(String str, long j, long j2) {
        return new o81(str, j, j2, -9223372036854775807L, (File) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0069, code lost:
        if (r16.renameTo(r1) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r1 == null) goto L_0x006b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.yandex.mobile.ads.impl.o81 m40308a(java.io.File r16, long r17, long r19, com.yandex.mobile.ads.impl.C15303zd r21) {
        /*
            r0 = r21
            java.lang.String r1 = r16.getName()
            java.lang.String r2 = ".v3.exo"
            boolean r2 = r1.endsWith(r2)
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 != 0) goto L_0x0076
            java.lang.String r1 = r16.getName()
            java.util.regex.Pattern r2 = f38115i
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r7 = r2.matches()
            if (r7 == 0) goto L_0x002d
            java.lang.String r1 = r2.group(r5)
            java.lang.String r1 = com.yandex.mobile.ads.impl.ih1.m37401g(r1)
            if (r1 != 0) goto L_0x003e
            goto L_0x006b
        L_0x002d:
            java.util.regex.Pattern r2 = f38114h
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r1 = r2.matches()
            if (r1 != 0) goto L_0x003a
            goto L_0x006b
        L_0x003a:
            java.lang.String r1 = r2.group(r5)
        L_0x003e:
            java.io.File r7 = r16.getParentFile()
            java.lang.Object r7 = com.yandex.mobile.ads.impl.C13479j9.m37707b(r7)
            r8 = r7
            java.io.File r8 = (java.io.File) r8
            com.yandex.mobile.ads.impl.yd r1 = r0.mo71200c(r1)
            int r9 = r1.f42807a
            java.lang.String r1 = r2.group(r4)
            long r10 = java.lang.Long.parseLong(r1)
            java.lang.String r1 = r2.group(r3)
            long r12 = java.lang.Long.parseLong(r1)
            java.io.File r1 = m40311a((java.io.File) r8, (int) r9, (long) r10, (long) r12)
            r2 = r16
            boolean r2 = r2.renameTo(r1)
            if (r2 != 0) goto L_0x006c
        L_0x006b:
            r1 = r6
        L_0x006c:
            if (r1 != 0) goto L_0x006f
            return r6
        L_0x006f:
            java.lang.String r2 = r1.getName()
            r15 = r1
            r1 = r2
            goto L_0x0079
        L_0x0076:
            r2 = r16
            r15 = r2
        L_0x0079:
            java.util.regex.Pattern r2 = f38116j
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 != 0) goto L_0x0086
            return r6
        L_0x0086:
            java.lang.String r2 = r1.group(r5)
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.String r8 = r0.mo71195a((int) r2)
            if (r8 != 0) goto L_0x0095
            return r6
        L_0x0095:
            r9 = -1
            int r0 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x00a1
            long r9 = r15.length()
            r11 = r9
            goto L_0x00a3
        L_0x00a1:
            r11 = r17
        L_0x00a3:
            r9 = 0
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x00aa
            return r6
        L_0x00aa:
            java.lang.String r0 = r1.group(r4)
            long r9 = java.lang.Long.parseLong(r0)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00c5
            java.lang.String r0 = r1.group(r3)
            long r0 = java.lang.Long.parseLong(r0)
            r13 = r0
            goto L_0x00c7
        L_0x00c5:
            r13 = r19
        L_0x00c7:
            com.yandex.mobile.ads.impl.o81 r0 = new com.yandex.mobile.ads.impl.o81
            r7 = r0
            r7.<init>(r8, r9, r11, r13, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.o81.m40308a(java.io.File, long, long, com.yandex.mobile.ads.impl.zd):com.yandex.mobile.ads.impl.o81");
    }

    /* renamed from: a */
    public o81 mo69125a(File file, long j) {
        C13479j9.m37708b(this.f40632e);
        return new o81(this.f40629b, this.f40630c, this.f40631d, j, file);
    }
}
