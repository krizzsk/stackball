package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class wb1 extends s81 {

    /* renamed from: p */
    private static final Pattern f41950p = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: q */
    private static final Pattern f41951q = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: n */
    private final StringBuilder f41952n = new StringBuilder();

    /* renamed from: o */
    private final ArrayList<String> f41953o = new ArrayList<>();

    public wb1() {
        super("SubripDecoder");
    }

    /* renamed from: b */
    static float m43571b(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.mobile.ads.impl.yb1 mo65718a(byte[] r23, int r24, boolean r25) {
        /*
            r22 = this;
            r0 = r22
            java.lang.String r1 = "SubripDecoder"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.yandex.mobile.ads.impl.ck0 r3 = new com.yandex.mobile.ads.impl.ck0
            r4 = 32
            r3.<init>(r4)
            com.yandex.mobile.ads.impl.fy0 r4 = new com.yandex.mobile.ads.impl.fy0
            r5 = r23
            r6 = r24
            r4.<init>(r5, r6)
        L_0x0019:
            java.lang.String r5 = r4.mo67116h()
            if (r5 == 0) goto L_0x0242
            int r6 = r5.length()
            if (r6 != 0) goto L_0x0026
            goto L_0x0019
        L_0x0026:
            java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0222 }
            java.lang.String r5 = r4.mo67116h()
            if (r5 != 0) goto L_0x0036
            java.lang.String r4 = "Unexpected end"
            android.util.Log.w(r1, r4)
            goto L_0x0242
        L_0x0036:
            java.util.regex.Pattern r6 = f41950p
            java.util.regex.Matcher r6 = r6.matcher(r5)
            boolean r7 = r6.matches()
            if (r7 == 0) goto L_0x0207
            r5 = 1
            long r7 = m43570a(r6, r5)
            r3.mo66319a((long) r7)
            r7 = 6
            long r8 = m43570a(r6, r7)
            r3.mo66319a((long) r8)
            java.lang.StringBuilder r6 = r0.f41952n
            r8 = 0
            r6.setLength(r8)
            java.util.ArrayList<java.lang.String> r6 = r0.f41953o
            r6.clear()
            java.lang.String r6 = r4.mo67116h()
        L_0x0061:
            boolean r9 = android.text.TextUtils.isEmpty(r6)
            if (r9 != 0) goto L_0x00b7
            java.lang.StringBuilder r9 = r0.f41952n
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x0076
            java.lang.StringBuilder r9 = r0.f41952n
            java.lang.String r10 = "<br>"
            r9.append(r10)
        L_0x0076:
            java.lang.StringBuilder r9 = r0.f41952n
            java.util.ArrayList<java.lang.String> r10 = r0.f41953o
            java.lang.String r6 = r6.trim()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r6)
            java.util.regex.Pattern r12 = f41951q
            java.util.regex.Matcher r6 = r12.matcher(r6)
            r12 = 0
        L_0x008a:
            boolean r13 = r6.find()
            if (r13 == 0) goto L_0x00aa
            java.lang.String r13 = r6.group()
            r10.add(r13)
            int r14 = r6.start()
            int r14 = r14 - r12
            int r13 = r13.length()
            int r15 = r14 + r13
            java.lang.String r7 = ""
            r11.replace(r14, r15, r7)
            int r12 = r12 + r13
            r7 = 6
            goto L_0x008a
        L_0x00aa:
            java.lang.String r6 = r11.toString()
            r9.append(r6)
            java.lang.String r6 = r4.mo67116h()
            r7 = 6
            goto L_0x0061
        L_0x00b7:
            java.lang.StringBuilder r6 = r0.f41952n
            java.lang.String r6 = r6.toString()
            android.text.Spanned r10 = android.text.Html.fromHtml(r6)
            r6 = 0
            r7 = 0
        L_0x00c3:
            java.util.ArrayList<java.lang.String> r9 = r0.f41953o
            int r9 = r9.size()
            if (r7 >= r9) goto L_0x00e0
            java.util.ArrayList<java.lang.String> r9 = r0.f41953o
            java.lang.Object r9 = r9.get(r7)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r11 = "\\{\\\\an[1-9]\\}"
            boolean r11 = r9.matches(r11)
            if (r11 == 0) goto L_0x00dd
            r6 = r9
            goto L_0x00e0
        L_0x00dd:
            int r7 = r7 + 1
            goto L_0x00c3
        L_0x00e0:
            if (r6 != 0) goto L_0x00fe
            com.yandex.mobile.ads.impl.ti r5 = new com.yandex.mobile.ads.impl.ti
            r11 = 0
            r12 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r17 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r9 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r21 = r3
            r20 = r4
            goto L_0x01fe
        L_0x00fe:
            int r7 = r6.hashCode()
            java.lang.String r12 = "{\\an9}"
            java.lang.String r13 = "{\\an8}"
            java.lang.String r14 = "{\\an7}"
            java.lang.String r15 = "{\\an6}"
            java.lang.String r8 = "{\\an5}"
            java.lang.String r9 = "{\\an4}"
            java.lang.String r11 = "{\\an3}"
            java.lang.String r5 = "{\\an2}"
            java.lang.String r0 = "{\\an1}"
            r18 = -1
            r20 = r4
            r4 = 2
            switch(r7) {
                case -685620710: goto L_0x015e;
                case -685620679: goto L_0x0156;
                case -685620648: goto L_0x014e;
                case -685620617: goto L_0x0146;
                case -685620586: goto L_0x013e;
                case -685620555: goto L_0x0136;
                case -685620524: goto L_0x012e;
                case -685620493: goto L_0x0125;
                case -685620462: goto L_0x011d;
                default: goto L_0x011c;
            }
        L_0x011c:
            goto L_0x0166
        L_0x011d:
            boolean r7 = r6.equals(r12)
            if (r7 == 0) goto L_0x0166
            r7 = 5
            goto L_0x0167
        L_0x0125:
            boolean r7 = r6.equals(r13)
            if (r7 == 0) goto L_0x0166
            r7 = 8
            goto L_0x0167
        L_0x012e:
            boolean r7 = r6.equals(r14)
            if (r7 == 0) goto L_0x0166
            r7 = 2
            goto L_0x0167
        L_0x0136:
            boolean r7 = r6.equals(r15)
            if (r7 == 0) goto L_0x0166
            r7 = 4
            goto L_0x0167
        L_0x013e:
            boolean r7 = r6.equals(r8)
            if (r7 == 0) goto L_0x0166
            r7 = 7
            goto L_0x0167
        L_0x0146:
            boolean r7 = r6.equals(r9)
            if (r7 == 0) goto L_0x0166
            r7 = 1
            goto L_0x0167
        L_0x014e:
            boolean r7 = r6.equals(r11)
            if (r7 == 0) goto L_0x0166
            r7 = 3
            goto L_0x0167
        L_0x0156:
            boolean r7 = r6.equals(r5)
            if (r7 == 0) goto L_0x0166
            r7 = 6
            goto L_0x0167
        L_0x015e:
            boolean r7 = r6.equals(r0)
            if (r7 == 0) goto L_0x0166
            r7 = 0
            goto L_0x0167
        L_0x0166:
            r7 = -1
        L_0x0167:
            r21 = r3
            if (r7 == 0) goto L_0x017d
            r3 = 1
            if (r7 == r3) goto L_0x017d
            if (r7 == r4) goto L_0x017d
            r3 = 3
            if (r7 == r3) goto L_0x017b
            r3 = 4
            if (r7 == r3) goto L_0x017b
            r3 = 5
            if (r7 == r3) goto L_0x017b
            r3 = 1
            goto L_0x017e
        L_0x017b:
            r3 = 2
            goto L_0x017e
        L_0x017d:
            r3 = 0
        L_0x017e:
            int r7 = r6.hashCode()
            switch(r7) {
                case -685620710: goto L_0x01c7;
                case -685620679: goto L_0x01bf;
                case -685620648: goto L_0x01b7;
                case -685620617: goto L_0x01af;
                case -685620586: goto L_0x01a7;
                case -685620555: goto L_0x019e;
                case -685620524: goto L_0x0196;
                case -685620493: goto L_0x018e;
                case -685620462: goto L_0x0186;
                default: goto L_0x0185;
            }
        L_0x0185:
            goto L_0x01cf
        L_0x0186:
            boolean r0 = r6.equals(r12)
            if (r0 == 0) goto L_0x01cf
            r7 = 5
            goto L_0x01d0
        L_0x018e:
            boolean r0 = r6.equals(r13)
            if (r0 == 0) goto L_0x01cf
            r7 = 4
            goto L_0x01d0
        L_0x0196:
            boolean r0 = r6.equals(r14)
            if (r0 == 0) goto L_0x01cf
            r7 = 3
            goto L_0x01d0
        L_0x019e:
            boolean r0 = r6.equals(r15)
            if (r0 == 0) goto L_0x01cf
            r7 = 8
            goto L_0x01d0
        L_0x01a7:
            boolean r0 = r6.equals(r8)
            if (r0 == 0) goto L_0x01cf
            r7 = 7
            goto L_0x01d0
        L_0x01af:
            boolean r0 = r6.equals(r9)
            if (r0 == 0) goto L_0x01cf
            r7 = 6
            goto L_0x01d0
        L_0x01b7:
            boolean r0 = r6.equals(r11)
            if (r0 == 0) goto L_0x01cf
            r7 = 2
            goto L_0x01d0
        L_0x01bf:
            boolean r0 = r6.equals(r5)
            if (r0 == 0) goto L_0x01cf
            r7 = 1
            goto L_0x01d0
        L_0x01c7:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x01cf
            r7 = 0
            goto L_0x01d0
        L_0x01cf:
            r7 = -1
        L_0x01d0:
            if (r7 == 0) goto L_0x01e4
            r0 = 1
            if (r7 == r0) goto L_0x01e4
            if (r7 == r4) goto L_0x01e4
            r5 = 3
            if (r7 == r5) goto L_0x01e2
            r4 = 4
            if (r7 == r4) goto L_0x01e2
            r4 = 5
            if (r7 == r4) goto L_0x01e2
            r14 = 1
            goto L_0x01e5
        L_0x01e2:
            r14 = 0
            goto L_0x01e5
        L_0x01e4:
            r14 = 2
        L_0x01e5:
            com.yandex.mobile.ads.impl.ti r5 = new com.yandex.mobile.ads.impl.ti
            float r12 = m43571b(r14)
            float r15 = m43571b(r3)
            r11 = 0
            r13 = 0
            r17 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r18 = 0
            r19 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r9 = r5
            r16 = r3
            r9.<init>((java.lang.CharSequence) r10, (android.text.Layout.Alignment) r11, (float) r12, (int) r13, (int) r14, (float) r15, (int) r16, (float) r17, (boolean) r18, (int) r19)
        L_0x01fe:
            r2.add(r5)
            com.yandex.mobile.ads.impl.ti r0 = com.yandex.mobile.ads.impl.C14683ti.f40336f
            r2.add(r0)
            goto L_0x023a
        L_0x0207:
            r21 = r3
            r20 = r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Skipping invalid timing: "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r1, r0)
            r0 = r22
            goto L_0x023e
        L_0x0222:
            r21 = r3
            r20 = r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Skipping invalid index: "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r1, r0)
        L_0x023a:
            r0 = r22
            r4 = r20
        L_0x023e:
            r3 = r21
            goto L_0x0019
        L_0x0242:
            r21 = r3
            int r0 = r2.size()
            com.yandex.mobile.ads.impl.ti[] r0 = new com.yandex.mobile.ads.impl.C14683ti[r0]
            r2.toArray(r0)
            long[] r1 = r21.mo66320b()
            com.yandex.mobile.ads.impl.xb1 r2 = new com.yandex.mobile.ads.impl.xb1
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.wb1.mo65718a(byte[], int, boolean):com.yandex.mobile.ads.impl.yb1");
    }

    /* renamed from: a */
    private static long m43570a(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0) + (Long.parseLong(matcher.group(i + 2)) * 60 * 1000) + (Long.parseLong(matcher.group(i + 3)) * 1000);
        String group2 = matcher.group(i + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }
}
