package com.yandex.mobile.ads.impl;

import android.util.Log;
import com.facebook.internal.security.CertificateUtil;
import com.tapjoy.TapjoyConstants;
import com.yandex.mobile.ads.impl.cb1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ab1 extends s81 {

    /* renamed from: s */
    private static final Pattern f30497s = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: n */
    private final boolean f30498n;

    /* renamed from: o */
    private final bb1 f30499o;

    /* renamed from: p */
    private Map<String, cb1> f30500p;

    /* renamed from: q */
    private float f30501q = -3.4028235E38f;

    /* renamed from: r */
    private float f30502r = -3.4028235E38f;

    public ab1(List<byte[]> list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.f30498n = false;
            this.f30499o = null;
            return;
        }
        this.f30498n = true;
        String a = ih1.m37375a(list.get(0));
        C13479j9.m37705a(a.startsWith("Format:"));
        this.f30499o = (bb1) C13479j9.m37703a(bb1.m34210a(a));
        m33668a(new fy0(list.get(1)));
    }

    /* renamed from: b */
    private static float m33669b(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019c, code lost:
        r18 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019f, code lost:
        r18 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a6, code lost:
        r16 = new com.yandex.mobile.ads.impl.C14683ti((java.lang.CharSequence) r17, r18, r19, 0, r21, r22, r23, -3.4028235E38f, false, (int) androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        r6 = m33666a(r9, (java.util.List<java.lang.Long>) r2, (java.util.List<java.util.List<com.yandex.mobile.ads.impl.C14683ti>>) r1);
        r7 = m33666a(r14, (java.util.List<java.lang.Long>) r2, (java.util.List<java.util.List<com.yandex.mobile.ads.impl.C14683ti>>) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01bc, code lost:
        if (r6 >= r7) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01be, code lost:
        ((java.util.List) r1.get(r6)).add(r16);
        r6 = r6 + 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.mobile.ads.impl.yb1 mo65718a(byte[] r28, int r29, boolean r30) {
        /*
            r27 = this;
            r0 = r27
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.yandex.mobile.ads.impl.fy0 r3 = new com.yandex.mobile.ads.impl.fy0
            r4 = r28
            r5 = r29
            r3.<init>(r4, r5)
            boolean r4 = r0.f30498n
            if (r4 != 0) goto L_0x001c
            r0.m33668a((com.yandex.mobile.ads.impl.fy0) r3)
        L_0x001c:
            boolean r4 = r0.f30498n
            if (r4 == 0) goto L_0x0023
            com.yandex.mobile.ads.impl.bb1 r4 = r0.f30499o
            goto L_0x0024
        L_0x0023:
            r4 = 0
        L_0x0024:
            java.lang.String r6 = r3.mo67116h()
            if (r6 == 0) goto L_0x01ca
            java.lang.String r7 = "Format:"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x0037
            com.yandex.mobile.ads.impl.bb1 r4 = com.yandex.mobile.ads.impl.bb1.m34210a(r6)
            goto L_0x0024
        L_0x0037:
            java.lang.String r7 = "Dialogue:"
            boolean r8 = r6.startsWith(r7)
            if (r8 == 0) goto L_0x0024
            java.lang.String r8 = "SsaDecoder"
            if (r4 != 0) goto L_0x0058
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "Skipping dialogue line before complete format: "
            r7.append(r9)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.util.Log.w(r8, r6)
            goto L_0x0024
        L_0x0058:
            boolean r7 = r6.startsWith(r7)
            com.yandex.mobile.ads.impl.C13479j9.m37705a((boolean) r7)
            r7 = 9
            java.lang.String r7 = r6.substring(r7)
            int r9 = r4.f31286e
            java.lang.String r10 = ","
            java.lang.String[] r7 = r7.split(r10, r9)
            int r9 = r7.length
            int r10 = r4.f31286e
            if (r9 == r10) goto L_0x0087
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "Skipping dialogue line with fewer columns than format: "
            r7.append(r9)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.util.Log.w(r8, r6)
            goto L_0x0024
        L_0x0087:
            int r9 = r4.f31282a
            r9 = r7[r9]
            long r9 = m33667a((java.lang.String) r9)
            java.lang.String r11 = "Skipping invalid timing: "
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x00ae
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r11)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.util.Log.w(r8, r6)
            goto L_0x0024
        L_0x00ae:
            int r14 = r4.f31283b
            r14 = r7[r14]
            long r14 = m33667a((java.lang.String) r14)
            int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r16 != 0) goto L_0x00ce
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r11)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.util.Log.w(r8, r6)
            goto L_0x0024
        L_0x00ce:
            java.util.Map<java.lang.String, com.yandex.mobile.ads.impl.cb1> r6 = r0.f30500p
            r11 = -1
            if (r6 == 0) goto L_0x00e4
            int r12 = r4.f31284c
            if (r12 == r11) goto L_0x00e4
            r12 = r7[r12]
            java.lang.String r12 = r12.trim()
            java.lang.Object r6 = r6.get(r12)
            com.yandex.mobile.ads.impl.cb1 r6 = (com.yandex.mobile.ads.impl.cb1) r6
            goto L_0x00e5
        L_0x00e4:
            r6 = 0
        L_0x00e5:
            int r12 = r4.f31285d
            r7 = r7[r12]
            com.yandex.mobile.ads.impl.cb1$b r12 = com.yandex.mobile.ads.impl.cb1.C12722b.m34669a(r7)
            java.lang.String r7 = com.yandex.mobile.ads.impl.cb1.C12722b.m34671c(r7)
            java.lang.String r13 = "\\\\N"
            java.lang.String r5 = "\n"
            java.lang.String r7 = r7.replaceAll(r13, r5)
            java.lang.String r13 = "\\\\n"
            java.lang.String r17 = r7.replaceAll(r13, r5)
            float r5 = r0.f30501q
            float r7 = r0.f30502r
            int r13 = r12.f31882a
            if (r13 == r11) goto L_0x0109
            r11 = r13
            goto L_0x010d
        L_0x0109:
            if (r6 == 0) goto L_0x010d
            int r11 = r6.f31874b
        L_0x010d:
            r16 = 1
            java.lang.String r6 = "Unknown alignment: "
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
            switch(r11) {
                case -1: goto L_0x012f;
                case 0: goto L_0x0116;
                case 1: goto L_0x012c;
                case 2: goto L_0x0129;
                case 3: goto L_0x0126;
                case 4: goto L_0x012c;
                case 5: goto L_0x0129;
                case 6: goto L_0x0126;
                case 7: goto L_0x012c;
                case 8: goto L_0x0129;
                case 9: goto L_0x0126;
                default: goto L_0x0116;
            }
        L_0x0116:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r6)
            r13.append(r11)
            java.lang.String r13 = r13.toString()
            goto L_0x0132
        L_0x0126:
            r23 = 2
            goto L_0x0136
        L_0x0129:
            r23 = 1
            goto L_0x0136
        L_0x012c:
            r23 = 0
            goto L_0x0136
        L_0x012f:
            r23 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0136
        L_0x0132:
            android.util.Log.w(r8, r13)
            goto L_0x012f
        L_0x0136:
            switch(r11) {
                case -1: goto L_0x0152;
                case 0: goto L_0x0139;
                case 1: goto L_0x014f;
                case 2: goto L_0x014f;
                case 3: goto L_0x014f;
                case 4: goto L_0x014c;
                case 5: goto L_0x014c;
                case 6: goto L_0x014c;
                case 7: goto L_0x0149;
                case 8: goto L_0x0149;
                case 9: goto L_0x0149;
                default: goto L_0x0139;
            }
        L_0x0139:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r6)
            r13.append(r11)
            java.lang.String r13 = r13.toString()
            goto L_0x0155
        L_0x0149:
            r21 = 0
            goto L_0x0159
        L_0x014c:
            r21 = 1
            goto L_0x0159
        L_0x014f:
            r21 = 2
            goto L_0x0159
        L_0x0152:
            r21 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0159
        L_0x0155:
            android.util.Log.w(r8, r13)
            goto L_0x0152
        L_0x0159:
            android.graphics.PointF r12 = r12.f31883b
            if (r12 == 0) goto L_0x0173
            r13 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r16 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r16 == 0) goto L_0x0173
            int r13 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r13 == 0) goto L_0x0173
            float r13 = r12.x
            float r13 = r13 / r5
            float r5 = r12.y
            float r5 = r5 / r7
            r19 = r5
            r22 = r13
            goto L_0x017f
        L_0x0173:
            float r5 = m33669b(r23)
            float r7 = m33669b(r21)
            r22 = r5
            r19 = r7
        L_0x017f:
            com.yandex.mobile.ads.impl.ti r5 = new com.yandex.mobile.ads.impl.ti
            switch(r11) {
                case -1: goto L_0x019f;
                case 0: goto L_0x0184;
                case 1: goto L_0x019a;
                case 2: goto L_0x0197;
                case 3: goto L_0x0194;
                case 4: goto L_0x019a;
                case 5: goto L_0x0197;
                case 6: goto L_0x0194;
                case 7: goto L_0x019a;
                case 8: goto L_0x0197;
                case 9: goto L_0x0194;
                default: goto L_0x0184;
            }
        L_0x0184:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r11)
            java.lang.String r6 = r7.toString()
            goto L_0x01a2
        L_0x0194:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x019c
        L_0x0197:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x019c
        L_0x019a:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x019c:
            r18 = r6
            goto L_0x01a6
        L_0x019f:
            r18 = 0
            goto L_0x01a6
        L_0x01a2:
            android.util.Log.w(r8, r6)
            goto L_0x019f
        L_0x01a6:
            r20 = 0
            r24 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r25 = 0
            r26 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r16 = r5
            r16.<init>((java.lang.CharSequence) r17, (android.text.Layout.Alignment) r18, (float) r19, (int) r20, (int) r21, (float) r22, (int) r23, (float) r24, (boolean) r25, (int) r26)
            int r6 = m33666a((long) r9, (java.util.List<java.lang.Long>) r2, (java.util.List<java.util.List<com.yandex.mobile.ads.impl.C14683ti>>) r1)
            int r7 = m33666a((long) r14, (java.util.List<java.lang.Long>) r2, (java.util.List<java.util.List<com.yandex.mobile.ads.impl.C14683ti>>) r1)
        L_0x01bc:
            if (r6 >= r7) goto L_0x0024
            java.lang.Object r8 = r1.get(r6)
            java.util.List r8 = (java.util.List) r8
            r8.add(r5)
            int r6 = r6 + 1
            goto L_0x01bc
        L_0x01ca:
            com.yandex.mobile.ads.impl.db1 r3 = new com.yandex.mobile.ads.impl.db1
            r3.<init>(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ab1.mo65718a(byte[], int, boolean):com.yandex.mobile.ads.impl.yb1");
    }

    /* renamed from: a */
    private void m33668a(fy0 fy0) {
        while (true) {
            String h = fy0.mo67116h();
            if (h == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(h)) {
                while (true) {
                    String h2 = fy0.mo67116h();
                    if (h2 == null || (fy0.mo67098a() != 0 && fy0.mo67111e() == 91)) {
                        break;
                    }
                    String[] split = h2.split(CertificateUtil.DELIMITER);
                    if (split.length == 2) {
                        String e = ih1.m37399e(split[0].trim());
                        e.getClass();
                        if (e.equals("playresx")) {
                            this.f30501q = Float.parseFloat(split[1].trim());
                        } else if (e.equals("playresy")) {
                            try {
                                this.f30502r = Float.parseFloat(split[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(h)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                cb1.C12721a aVar = null;
                while (true) {
                    String h3 = fy0.mo67116h();
                    if (h3 == null || (fy0.mo67098a() != 0 && fy0.mo67111e() == 91)) {
                        this.f30500p = linkedHashMap;
                    } else if (h3.startsWith("Format:")) {
                        aVar = cb1.C12721a.m34668a(h3);
                    } else if (h3.startsWith("Style:")) {
                        if (aVar == null) {
                            Log.w("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + h3);
                        } else {
                            cb1 a = cb1.m34666a(h3, aVar);
                            if (a != null) {
                                linkedHashMap.put(a.f31873a, a);
                            }
                        }
                    }
                }
                this.f30500p = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(h)) {
                Log.i("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(h)) {
                return;
            }
        }
    }

    /* renamed from: a */
    private static long m33667a(String str) {
        Matcher matcher = f30497s.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i = ih1.f34858a;
        return (Long.parseLong(group) * 60 * 60 * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * TapjoyConstants.TIMER_INCREMENT);
    }

    /* renamed from: a */
    private static int m33666a(long j, List<Long> list, List<List<C14683ti>> list2) {
        int i;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            } else if (list.get(size).longValue() == j) {
                return size;
            } else {
                if (list.get(size).longValue() < j) {
                    i = size + 1;
                    break;
                }
                size--;
            }
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList(list2.get(i - 1)));
        return i;
    }
}
