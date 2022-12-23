package com.yandex.mobile.ads.impl;

import java.util.regex.Pattern;

/* renamed from: com.yandex.mobile.ads.impl.si */
final class C14600si {

    /* renamed from: c */
    private static final Pattern f40003c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: a */
    private final fy0 f40004a = new fy0();

    /* renamed from: b */
    private final StringBuilder f40005b = new StringBuilder();

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070 A[LOOP:1: B:2:0x0003->B:35:0x0070, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0002 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m42010b(com.yandex.mobile.ads.impl.fy0 r8) {
        /*
            r0 = 0
            r1 = 1
        L_0x0002:
            r2 = 1
        L_0x0003:
            int r3 = r8.mo67098a()
            if (r3 <= 0) goto L_0x0072
            if (r2 == 0) goto L_0x0072
            int r2 = r8.mo67105b()
            byte[] r3 = r8.f33778a
            byte r2 = r3[r2]
            char r2 = (char) r2
            r3 = 9
            if (r2 == r3) goto L_0x002a
            r3 = 10
            if (r2 == r3) goto L_0x002a
            r3 = 12
            if (r2 == r3) goto L_0x002a
            r3 = 13
            if (r2 == r3) goto L_0x002a
            r3 = 32
            if (r2 == r3) goto L_0x002a
            r2 = 0
            goto L_0x002e
        L_0x002a:
            r8.mo67114f(r1)
            r2 = 1
        L_0x002e:
            if (r2 != 0) goto L_0x0002
            int r2 = r8.mo67105b()
            int r3 = r8.mo67107c()
            byte[] r4 = r8.f33778a
            int r5 = r2 + 2
            if (r5 > r3) goto L_0x006c
            int r5 = r2 + 1
            byte r2 = r4[r2]
            r6 = 47
            if (r2 != r6) goto L_0x006c
            int r2 = r5 + 1
            byte r5 = r4[r5]
            r7 = 42
            if (r5 != r7) goto L_0x006c
        L_0x004e:
            int r5 = r2 + 1
            if (r5 >= r3) goto L_0x0062
            byte r2 = r4[r2]
            char r2 = (char) r2
            if (r2 != r7) goto L_0x0060
            byte r2 = r4[r5]
            char r2 = (char) r2
            if (r2 != r6) goto L_0x0060
            int r3 = r5 + 1
            r2 = r3
            goto L_0x004e
        L_0x0060:
            r2 = r5
            goto L_0x004e
        L_0x0062:
            int r2 = r8.mo67105b()
            int r3 = r3 - r2
            r8.mo67114f(r3)
            r2 = 1
            goto L_0x006d
        L_0x006c:
            r2 = 0
        L_0x006d:
            if (r2 == 0) goto L_0x0070
            goto L_0x0002
        L_0x0070:
            r2 = 0
            goto L_0x0003
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14600si.m42010b(com.yandex.mobile.ads.impl.fy0):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a5, code lost:
        if (")".equals(m42009b(r3, r4)) == false) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.yandex.mobile.ads.impl.hq1> mo69998a(com.yandex.mobile.ads.impl.fy0 r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.StringBuilder r1 = r0.f40005b
            r2 = 0
            r1.setLength(r2)
            int r1 = r18.mo67105b()
        L_0x000c:
            java.lang.String r3 = r18.mo67116h()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0233
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f40004a
            r4 = r18
            byte[] r5 = r4.f33778a
            int r4 = r18.mo67105b()
            r3.mo67103a((byte[]) r5, (int) r4)
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f40004a
            r3.mo67112e(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x002d:
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f40004a
            java.lang.StringBuilder r4 = r0.f40005b
            m42010b(r3)
            int r5 = r3.mo67098a()
            java.lang.String r6 = "{"
            r7 = 5
            java.lang.String r8 = ""
            r10 = 1
            if (r5 >= r7) goto L_0x0042
            goto L_0x00a7
        L_0x0042:
            java.lang.String r5 = r3.mo67106b(r7)
            java.lang.String r7 = "::cue"
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L_0x004f
            goto L_0x00a7
        L_0x004f:
            int r5 = r3.mo67105b()
            java.lang.String r7 = m42009b(r3, r4)
            if (r7 != 0) goto L_0x005a
            goto L_0x00a7
        L_0x005a:
            boolean r11 = r6.equals(r7)
            if (r11 == 0) goto L_0x0065
            r3.mo67112e(r5)
            r5 = r8
            goto L_0x00a8
        L_0x0065:
            java.lang.String r5 = "("
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x009a
            int r5 = r3.mo67105b()
            int r7 = r3.mo67107c()
        L_0x0075:
            r11 = 0
        L_0x0076:
            if (r5 >= r7) goto L_0x008a
            if (r11 != 0) goto L_0x008a
            byte[] r11 = r3.f33778a
            int r12 = r5 + 1
            byte r5 = r11[r5]
            char r5 = (char) r5
            r11 = 41
            if (r5 != r11) goto L_0x0088
            r5 = r12
            r11 = 1
            goto L_0x0076
        L_0x0088:
            r5 = r12
            goto L_0x0075
        L_0x008a:
            int r5 = r5 + -1
            int r7 = r3.mo67105b()
            int r5 = r5 - r7
            java.lang.String r5 = r3.mo67106b(r5)
            java.lang.String r5 = r5.trim()
            goto L_0x009b
        L_0x009a:
            r5 = 0
        L_0x009b:
            java.lang.String r3 = m42009b(r3, r4)
            java.lang.String r4 = ")"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x00a8
        L_0x00a7:
            r5 = 0
        L_0x00a8:
            if (r5 == 0) goto L_0x0232
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f40004a
            java.lang.StringBuilder r4 = r0.f40005b
            java.lang.String r3 = m42009b(r3, r4)
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x00b9
            return r1
        L_0x00b9:
            com.yandex.mobile.ads.impl.hq1 r3 = new com.yandex.mobile.ads.impl.hq1
            r3.<init>()
            boolean r4 = r8.equals(r5)
            if (r4 == 0) goto L_0x00c5
            goto L_0x011c
        L_0x00c5:
            r4 = 91
            int r4 = r5.indexOf(r4)
            r6 = -1
            if (r4 == r6) goto L_0x00e9
            java.util.regex.Pattern r7 = f40003c
            java.lang.String r11 = r5.substring(r4)
            java.util.regex.Matcher r7 = r7.matcher(r11)
            boolean r11 = r7.matches()
            if (r11 == 0) goto L_0x00e5
            java.lang.String r7 = r7.group(r10)
            r3.mo67605d(r7)
        L_0x00e5:
            java.lang.String r5 = r5.substring(r2, r4)
        L_0x00e9:
            int r4 = com.yandex.mobile.ads.impl.ih1.f34858a
            java.lang.String r4 = "\\."
            java.lang.String[] r4 = r5.split(r4, r6)
            r5 = r4[r2]
            r7 = 35
            int r7 = r5.indexOf(r7)
            if (r7 == r6) goto L_0x010c
            java.lang.String r6 = r5.substring(r2, r7)
            r3.mo67603c((java.lang.String) r6)
            int r7 = r7 + 1
            java.lang.String r5 = r5.substring(r7)
            r3.mo67600b((java.lang.String) r5)
            goto L_0x010f
        L_0x010c:
            r3.mo67603c((java.lang.String) r5)
        L_0x010f:
            int r5 = r4.length
            if (r5 <= r10) goto L_0x011c
            int r5 = r4.length
            java.lang.Object[] r4 = com.yandex.mobile.ads.impl.ih1.m37384a((T[]) r4, (int) r10, (int) r5)
            java.lang.String[] r4 = (java.lang.String[]) r4
            r3.mo67596a((java.lang.String[]) r4)
        L_0x011c:
            r4 = 0
            r5 = 0
        L_0x011e:
            java.lang.String r6 = "}"
            if (r4 != 0) goto L_0x0226
            com.yandex.mobile.ads.impl.fy0 r4 = r0.f40004a
            int r4 = r4.mo67105b()
            com.yandex.mobile.ads.impl.fy0 r5 = r0.f40004a
            java.lang.StringBuilder r7 = r0.f40005b
            java.lang.String r5 = m42009b(r5, r7)
            if (r5 == 0) goto L_0x013b
            boolean r7 = r6.equals(r5)
            if (r7 == 0) goto L_0x0139
            goto L_0x013b
        L_0x0139:
            r7 = 0
            goto L_0x013c
        L_0x013b:
            r7 = 1
        L_0x013c:
            if (r7 != 0) goto L_0x0222
            com.yandex.mobile.ads.impl.fy0 r11 = r0.f40004a
            r11.mo67112e(r4)
            com.yandex.mobile.ads.impl.fy0 r4 = r0.f40004a
            java.lang.StringBuilder r11 = r0.f40005b
            m42010b(r4)
            java.lang.String r12 = m42008a(r4, r11)
            boolean r13 = r8.equals(r12)
            if (r13 == 0) goto L_0x0156
            goto L_0x0222
        L_0x0156:
            java.lang.String r13 = m42009b(r4, r11)
            java.lang.String r14 = ":"
            boolean r13 = r14.equals(r13)
            if (r13 != 0) goto L_0x0164
            goto L_0x0222
        L_0x0164:
            m42010b(r4)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r14 = 0
        L_0x016d:
            java.lang.String r15 = ";"
            if (r14 != 0) goto L_0x0195
            int r2 = r4.mo67105b()
            java.lang.String r9 = m42009b(r4, r11)
            if (r9 != 0) goto L_0x017d
            r2 = 0
            goto L_0x0199
        L_0x017d:
            boolean r16 = r6.equals(r9)
            if (r16 != 0) goto L_0x018f
            boolean r15 = r15.equals(r9)
            if (r15 == 0) goto L_0x018a
            goto L_0x018f
        L_0x018a:
            r13.append(r9)
            r2 = 0
            goto L_0x016d
        L_0x018f:
            r4.mo67112e(r2)
            r2 = 0
            r14 = 1
            goto L_0x016d
        L_0x0195:
            java.lang.String r2 = r13.toString()
        L_0x0199:
            if (r2 == 0) goto L_0x0222
            boolean r9 = r8.equals(r2)
            if (r9 == 0) goto L_0x01a3
            goto L_0x0222
        L_0x01a3:
            int r9 = r4.mo67105b()
            java.lang.String r11 = m42009b(r4, r11)
            boolean r13 = r15.equals(r11)
            if (r13 == 0) goto L_0x01b2
            goto L_0x01bb
        L_0x01b2:
            boolean r6 = r6.equals(r11)
            if (r6 == 0) goto L_0x0222
            r4.mo67112e(r9)
        L_0x01bb:
            java.lang.String r4 = "color"
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x01cb
            int r2 = com.yandex.mobile.ads.impl.C13320hg.m36963a(r2)
            r3.mo67598b((int) r2)
            goto L_0x0222
        L_0x01cb:
            java.lang.String r4 = "background-color"
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x01db
            int r2 = com.yandex.mobile.ads.impl.C13320hg.m36963a(r2)
            r3.mo67593a((int) r2)
            goto L_0x0222
        L_0x01db:
            java.lang.String r4 = "text-decoration"
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x01ef
            java.lang.String r4 = "underline"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0222
            r3.mo67601c((boolean) r10)
            goto L_0x0222
        L_0x01ef:
            java.lang.String r4 = "font-family"
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x01fb
            r3.mo67594a((java.lang.String) r2)
            goto L_0x0222
        L_0x01fb:
            java.lang.String r4 = "font-weight"
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x020f
            java.lang.String r4 = "bold"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0222
            r3.mo67595a((boolean) r10)
            goto L_0x0222
        L_0x020f:
            java.lang.String r4 = "font-style"
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x0222
            java.lang.String r4 = "italic"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0222
            r3.mo67599b((boolean) r10)
        L_0x0222:
            r4 = r7
            r2 = 0
            goto L_0x011e
        L_0x0226:
            boolean r2 = r6.equals(r5)
            if (r2 == 0) goto L_0x022f
            r1.add(r3)
        L_0x022f:
            r2 = 0
            goto L_0x002d
        L_0x0232:
            return r1
        L_0x0233:
            r4 = r18
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14600si.mo69998a(com.yandex.mobile.ads.impl.fy0):java.util.List");
    }

    /* renamed from: b */
    static String m42009b(fy0 fy0, StringBuilder sb) {
        m42010b(fy0);
        if (fy0.mo67098a() == 0) {
            return null;
        }
        String a = m42008a(fy0, sb);
        if (!"".equals(a)) {
            return a;
        }
        return "" + ((char) fy0.mo67126r());
    }

    /* renamed from: a */
    private static String m42008a(fy0 fy0, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int b = fy0.mo67105b();
        int c = fy0.mo67107c();
        while (b < c && !z) {
            char c2 = (char) fy0.f33778a[b];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                b++;
                sb.append(c2);
            }
        }
        fy0.mo67114f(b - fy0.mo67105b());
        return sb.toString();
    }
}
