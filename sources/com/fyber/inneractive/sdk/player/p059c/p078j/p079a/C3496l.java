package com.fyber.inneractive.sdk.player.p059c.p078j.p079a;

import java.io.File;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.c.j.a.l */
final class C3496l extends C3490g {

    /* renamed from: g */
    private static final Pattern f9481g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: h */
    private static final Pattern f9482h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: i */
    private static final Pattern f9483i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* renamed from: a */
    public static File m8703a(File file, int i, long j, long j2) {
        return new File(file, i + "." + j + "." + j2 + ".v3.exo");
    }

    /* renamed from: a */
    public static C3496l m8701a(String str, long j) {
        return new C3496l(str, j, -1, -9223372036854775807L, (File) null);
    }

    /* renamed from: b */
    public static C3496l m8704b(String str, long j) {
        return new C3496l(str, j, -1, -9223372036854775807L, (File) null);
    }

    /* renamed from: a */
    public static C3496l m8702a(String str, long j, long j2) {
        return new C3496l(str, j, j2, -9223372036854775807L, (File) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0061, code lost:
        if (r16.renameTo(r1) == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r1 == null) goto L_0x0039;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fyber.inneractive.sdk.player.p059c.p078j.p079a.C3496l m8700a(java.io.File r16, com.fyber.inneractive.sdk.player.p059c.p078j.p079a.C3492i r17) {
        /*
            r0 = r17
            java.lang.String r1 = r16.getName()
            java.lang.String r2 = ".v3.exo"
            boolean r2 = r1.endsWith(r2)
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 != 0) goto L_0x006e
            java.lang.String r1 = r16.getName()
            java.util.regex.Pattern r2 = f9482h
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r7 = r2.matches()
            if (r7 == 0) goto L_0x002d
            java.lang.String r1 = r2.group(r5)
            java.lang.String r1 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8896h(r1)
            if (r1 != 0) goto L_0x003f
            goto L_0x0039
        L_0x002d:
            java.util.regex.Pattern r2 = f9481g
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r1 = r2.matches()
            if (r1 != 0) goto L_0x003b
        L_0x0039:
            r1 = r6
            goto L_0x0064
        L_0x003b:
            java.lang.String r1 = r2.group(r5)
        L_0x003f:
            java.io.File r7 = r16.getParentFile()
            int r8 = r0.mo19334c(r1)
            java.lang.String r1 = r2.group(r4)
            long r9 = java.lang.Long.parseLong(r1)
            java.lang.String r1 = r2.group(r3)
            long r11 = java.lang.Long.parseLong(r1)
            java.io.File r1 = m8703a(r7, r8, r9, r11)
            r2 = r16
            boolean r2 = r2.renameTo(r1)
            if (r2 != 0) goto L_0x0064
            goto L_0x0039
        L_0x0064:
            if (r1 != 0) goto L_0x0067
            return r6
        L_0x0067:
            java.lang.String r2 = r1.getName()
            r15 = r1
            r1 = r2
            goto L_0x0071
        L_0x006e:
            r2 = r16
            r15 = r2
        L_0x0071:
            java.util.regex.Pattern r2 = f9483i
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 != 0) goto L_0x007e
            return r6
        L_0x007e:
            long r11 = r15.length()
            java.lang.String r2 = r1.group(r5)
            int r2 = java.lang.Integer.parseInt(r2)
            android.util.SparseArray<java.lang.String> r0 = r0.f9463b
            java.lang.Object r0 = r0.get(r2)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L_0x0096
            return r6
        L_0x0096:
            com.fyber.inneractive.sdk.player.c.j.a.l r0 = new com.fyber.inneractive.sdk.player.c.j.a.l
            java.lang.String r2 = r1.group(r4)
            long r9 = java.lang.Long.parseLong(r2)
            java.lang.String r1 = r1.group(r3)
            long r13 = java.lang.Long.parseLong(r1)
            r7 = r0
            r7.<init>(r8, r9, r11, r13, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p078j.p079a.C3496l.m8700a(java.io.File, com.fyber.inneractive.sdk.player.c.j.a.i):com.fyber.inneractive.sdk.player.c.j.a.l");
    }

    C3496l(String str, long j, long j2, long j3, File file) {
        super(str, j, j2, j3, file);
    }
}
