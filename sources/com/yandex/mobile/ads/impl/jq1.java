package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.util.Log;
import com.yandex.mobile.ads.impl.iq1;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class jq1 {

    /* renamed from: b */
    public static final Pattern f35442b = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: c */
    private static final Pattern f35443c = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: a */
    private final StringBuilder f35444a = new StringBuilder();

    /* renamed from: com.yandex.mobile.ads.impl.jq1$b */
    private static final class C13534b implements Comparable<C13534b> {

        /* renamed from: b */
        public final int f35450b;

        /* renamed from: c */
        public final hq1 f35451c;

        public C13534b(int i, hq1 hq1) {
            this.f35450b = i;
            this.f35451c = hq1;
        }

        public int compareTo(Object obj) {
            return this.f35450b - ((C13534b) obj).f35450b;
        }
    }

    /* renamed from: a */
    public boolean mo68082a(fy0 fy0, iq1.C13435b bVar, List<hq1> list) {
        String h = fy0.mo67116h();
        if (h == null) {
            return false;
        }
        Pattern pattern = f35442b;
        Matcher matcher = pattern.matcher(h);
        if (matcher.matches()) {
            return m37951a((String) null, matcher, fy0, bVar, this.f35444a, list);
        }
        String h2 = fy0.mo67116h();
        if (h2 == null) {
            return false;
        }
        Matcher matcher2 = pattern.matcher(h2);
        if (!matcher2.matches()) {
            return false;
        }
        return m37951a(h.trim(), matcher2, fy0, bVar, this.f35444a, list);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b3, code lost:
        if (r4.equals("center") == false) goto L_0x00b5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m37948a(java.lang.String r10, com.yandex.mobile.ads.impl.iq1.C13435b r11) {
        /*
            java.lang.String r0 = "WebvttCueParser"
            java.util.regex.Pattern r1 = f35443c
            java.util.regex.Matcher r10 = r1.matcher(r10)
        L_0x0008:
            boolean r1 = r10.find()
            if (r1 == 0) goto L_0x0154
            r1 = 1
            java.lang.String r2 = r10.group(r1)
            r3 = 2
            java.lang.String r4 = r10.group(r3)
            java.lang.String r5 = "line"
            boolean r5 = r5.equals(r2)     // Catch:{ NumberFormatException -> 0x013a }
            r6 = 44
            r7 = 0
            r8 = -1
            if (r5 == 0) goto L_0x0060
            int r2 = r4.indexOf(r6)     // Catch:{ NumberFormatException -> 0x013a }
            if (r2 == r8) goto L_0x003b
            int r3 = r2 + 1
            java.lang.String r3 = r4.substring(r3)     // Catch:{ NumberFormatException -> 0x013a }
            int r3 = m37947a(r3)     // Catch:{ NumberFormatException -> 0x013a }
            r11.mo67873a((int) r3)     // Catch:{ NumberFormatException -> 0x013a }
            java.lang.String r4 = r4.substring(r7, r2)     // Catch:{ NumberFormatException -> 0x013a }
        L_0x003b:
            java.lang.String r2 = "%"
            boolean r2 = r4.endsWith(r2)     // Catch:{ NumberFormatException -> 0x013a }
            if (r2 == 0) goto L_0x004f
            float r1 = com.yandex.mobile.ads.impl.lq1.m38894a((java.lang.String) r4)     // Catch:{ NumberFormatException -> 0x013a }
            com.yandex.mobile.ads.impl.iq1$b r1 = r11.mo67872a((float) r1)     // Catch:{ NumberFormatException -> 0x013a }
            r1.mo67878b((int) r7)     // Catch:{ NumberFormatException -> 0x013a }
            goto L_0x0008
        L_0x004f:
            int r2 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x013a }
            if (r2 >= 0) goto L_0x0057
            int r2 = r2 + -1
        L_0x0057:
            float r2 = (float) r2     // Catch:{ NumberFormatException -> 0x013a }
            com.yandex.mobile.ads.impl.iq1$b r2 = r11.mo67872a((float) r2)     // Catch:{ NumberFormatException -> 0x013a }
            r2.mo67878b((int) r1)     // Catch:{ NumberFormatException -> 0x013a }
            goto L_0x0008
        L_0x0060:
            java.lang.String r5 = "align"
            boolean r5 = r5.equals(r2)     // Catch:{ NumberFormatException -> 0x013a }
            if (r5 == 0) goto L_0x00e3
            r4.getClass()     // Catch:{ NumberFormatException -> 0x013a }
            int r2 = r4.hashCode()
            r5 = 5
            r6 = 4
            r9 = 3
            switch(r2) {
                case -1364013995: goto L_0x00ad;
                case -1074341483: goto L_0x00a2;
                case 100571: goto L_0x0097;
                case 3317767: goto L_0x008c;
                case 108511772: goto L_0x0081;
                case 109757538: goto L_0x0076;
                default: goto L_0x0075;
            }
        L_0x0075:
            goto L_0x00b5
        L_0x0076:
            java.lang.String r2 = "start"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x007f
            goto L_0x00b5
        L_0x007f:
            r7 = 5
            goto L_0x00b6
        L_0x0081:
            java.lang.String r2 = "right"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x008a
            goto L_0x00b5
        L_0x008a:
            r7 = 4
            goto L_0x00b6
        L_0x008c:
            java.lang.String r2 = "left"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x0095
            goto L_0x00b5
        L_0x0095:
            r7 = 3
            goto L_0x00b6
        L_0x0097:
            java.lang.String r2 = "end"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x00a0
            goto L_0x00b5
        L_0x00a0:
            r7 = 2
            goto L_0x00b6
        L_0x00a2:
            java.lang.String r2 = "middle"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x00ab
            goto L_0x00b5
        L_0x00ab:
            r7 = 1
            goto L_0x00b6
        L_0x00ad:
            java.lang.String r2 = "center"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x00b6
        L_0x00b5:
            r7 = -1
        L_0x00b6:
            if (r7 == 0) goto L_0x00dd
            if (r7 == r1) goto L_0x00dd
            if (r7 == r3) goto L_0x00db
            if (r7 == r9) goto L_0x00d9
            if (r7 == r6) goto L_0x00d7
            if (r7 == r5) goto L_0x00de
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x013a }
            r1.<init>()     // Catch:{ NumberFormatException -> 0x013a }
            java.lang.String r2 = "Invalid alignment value: "
            r1.append(r2)     // Catch:{ NumberFormatException -> 0x013a }
            r1.append(r4)     // Catch:{ NumberFormatException -> 0x013a }
            java.lang.String r1 = r1.toString()     // Catch:{ NumberFormatException -> 0x013a }
            android.util.Log.w(r0, r1)     // Catch:{ NumberFormatException -> 0x013a }
            goto L_0x00dd
        L_0x00d7:
            r1 = 5
            goto L_0x00de
        L_0x00d9:
            r1 = 4
            goto L_0x00de
        L_0x00db:
            r1 = 3
            goto L_0x00de
        L_0x00dd:
            r1 = 2
        L_0x00de:
            r11.mo67883d(r1)     // Catch:{ NumberFormatException -> 0x013a }
            goto L_0x0008
        L_0x00e3:
            java.lang.String r1 = "position"
            boolean r1 = r1.equals(r2)     // Catch:{ NumberFormatException -> 0x013a }
            if (r1 == 0) goto L_0x010b
            int r1 = r4.indexOf(r6)     // Catch:{ NumberFormatException -> 0x013a }
            if (r1 == r8) goto L_0x0102
            int r2 = r1 + 1
            java.lang.String r2 = r4.substring(r2)     // Catch:{ NumberFormatException -> 0x013a }
            int r2 = m37947a(r2)     // Catch:{ NumberFormatException -> 0x013a }
            r11.mo67882c((int) r2)     // Catch:{ NumberFormatException -> 0x013a }
            java.lang.String r4 = r4.substring(r7, r1)     // Catch:{ NumberFormatException -> 0x013a }
        L_0x0102:
            float r1 = com.yandex.mobile.ads.impl.lq1.m38894a((java.lang.String) r4)     // Catch:{ NumberFormatException -> 0x013a }
            r11.mo67877b((float) r1)     // Catch:{ NumberFormatException -> 0x013a }
            goto L_0x0008
        L_0x010b:
            java.lang.String r1 = "size"
            boolean r1 = r1.equals(r2)     // Catch:{ NumberFormatException -> 0x013a }
            if (r1 == 0) goto L_0x011c
            float r1 = com.yandex.mobile.ads.impl.lq1.m38894a((java.lang.String) r4)     // Catch:{ NumberFormatException -> 0x013a }
            r11.mo67881c((float) r1)     // Catch:{ NumberFormatException -> 0x013a }
            goto L_0x0008
        L_0x011c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x013a }
            r1.<init>()     // Catch:{ NumberFormatException -> 0x013a }
            java.lang.String r3 = "Unknown cue setting "
            r1.append(r3)     // Catch:{ NumberFormatException -> 0x013a }
            r1.append(r2)     // Catch:{ NumberFormatException -> 0x013a }
            java.lang.String r2 = ":"
            r1.append(r2)     // Catch:{ NumberFormatException -> 0x013a }
            r1.append(r4)     // Catch:{ NumberFormatException -> 0x013a }
            java.lang.String r1 = r1.toString()     // Catch:{ NumberFormatException -> 0x013a }
            android.util.Log.w(r0, r1)     // Catch:{ NumberFormatException -> 0x013a }
            goto L_0x0008
        L_0x013a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Skipping bad cue setting: "
            r1.append(r2)
            java.lang.String r2 = r10.group()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r0, r1)
            goto L_0x0008
        L_0x0154:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.jq1.m37948a(java.lang.String, com.yandex.mobile.ads.impl.iq1$b):void");
    }

    /* renamed from: com.yandex.mobile.ads.impl.jq1$a */
    private static final class C13533a {

        /* renamed from: e */
        private static final String[] f35445e = new String[0];

        /* renamed from: a */
        public final String f35446a;

        /* renamed from: b */
        public final int f35447b;

        /* renamed from: c */
        public final String f35448c;

        /* renamed from: d */
        public final String[] f35449d;

        private C13533a(String str, int i, String str2, String[] strArr) {
            this.f35447b = i;
            this.f35446a = str;
            this.f35448c = str2;
            this.f35449d = strArr;
        }

        /* renamed from: a */
        public static C13533a m37954a(String str, int i) {
            String str2;
            String[] strArr;
            String trim = str.trim();
            C13479j9.m37705a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            int i2 = ih1.f34858a;
            String[] split = trim.split("\\.", -1);
            String str3 = split[0];
            if (split.length > 1) {
                strArr = (String[]) ih1.m37384a((T[]) split, 1, split.length);
            } else {
                strArr = f35445e;
            }
            return new C13533a(str3, i, str2, strArr);
        }

        /* renamed from: a */
        public static C13533a m37953a() {
            return new C13533a("", 0, "", new String[0]);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0109  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m37950a(java.lang.String r16, java.lang.String r17, com.yandex.mobile.ads.impl.iq1.C13435b r18, java.util.List<com.yandex.mobile.ads.impl.hq1> r19) {
        /*
            r0 = r16
            r1 = r17
            r2 = r19
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            r7 = 0
        L_0x0017:
            int r8 = r17.length()
            if (r7 >= r8) goto L_0x01e4
            char r8 = r1.charAt(r7)
            r9 = 62
            r10 = 60
            r11 = 38
            r13 = -1
            r14 = 2
            r15 = 1
            if (r8 == r11) goto L_0x0138
            if (r8 == r10) goto L_0x0034
            r3.append(r8)
            int r7 = r7 + 1
            goto L_0x0017
        L_0x0034:
            int r8 = r7 + 1
            int r10 = r17.length()
            if (r8 < r10) goto L_0x003f
        L_0x003c:
            r7 = r8
            goto L_0x0135
        L_0x003f:
            char r10 = r1.charAt(r8)
            r11 = 47
            if (r10 != r11) goto L_0x0049
            r10 = 1
            goto L_0x004a
        L_0x0049:
            r10 = 0
        L_0x004a:
            int r8 = r1.indexOf(r9, r8)
            if (r8 != r13) goto L_0x0055
            int r8 = r17.length()
            goto L_0x0057
        L_0x0055:
            int r8 = r8 + 1
        L_0x0057:
            int r9 = r8 + -2
            char r13 = r1.charAt(r9)
            if (r13 != r11) goto L_0x0061
            r11 = 1
            goto L_0x0062
        L_0x0061:
            r11 = 0
        L_0x0062:
            if (r10 == 0) goto L_0x0066
            r13 = 2
            goto L_0x0067
        L_0x0066:
            r13 = 1
        L_0x0067:
            int r7 = r7 + r13
            if (r11 == 0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            int r9 = r8 + -1
        L_0x006d:
            java.lang.String r7 = r1.substring(r7, r9)
            java.lang.String r9 = r7.trim()
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x007c
            goto L_0x003c
        L_0x007c:
            java.lang.String r9 = r7.trim()
            boolean r13 = r9.isEmpty()
            r13 = r13 ^ r15
            com.yandex.mobile.ads.impl.C13479j9.m37705a((boolean) r13)
            int r13 = com.yandex.mobile.ads.impl.ih1.f34858a
            java.lang.String r13 = "[ \\.]"
            java.lang.String[] r9 = r9.split(r13, r14)
            r9 = r9[r6]
            r9.getClass()
            int r13 = r9.hashCode()
            r6 = 98
            r12 = 4
            if (r13 == r6) goto L_0x00eb
            r6 = 99
            if (r13 == r6) goto L_0x00e0
            r6 = 105(0x69, float:1.47E-43)
            if (r13 == r6) goto L_0x00d5
            r6 = 3314158(0x3291ee, float:4.644125E-39)
            if (r13 == r6) goto L_0x00ca
            r6 = 117(0x75, float:1.64E-43)
            if (r13 == r6) goto L_0x00bf
            r6 = 118(0x76, float:1.65E-43)
            if (r13 == r6) goto L_0x00b4
            goto L_0x00f3
        L_0x00b4:
            java.lang.String r6 = "v"
            boolean r6 = r9.equals(r6)
            if (r6 != 0) goto L_0x00bd
            goto L_0x00f3
        L_0x00bd:
            r13 = 4
            goto L_0x00f6
        L_0x00bf:
            java.lang.String r6 = "u"
            boolean r6 = r9.equals(r6)
            if (r6 != 0) goto L_0x00c8
            goto L_0x00f3
        L_0x00c8:
            r13 = 3
            goto L_0x00f6
        L_0x00ca:
            java.lang.String r6 = "lang"
            boolean r6 = r9.equals(r6)
            if (r6 != 0) goto L_0x00d3
            goto L_0x00f3
        L_0x00d3:
            r13 = 5
            goto L_0x00f6
        L_0x00d5:
            java.lang.String r6 = "i"
            boolean r6 = r9.equals(r6)
            if (r6 != 0) goto L_0x00de
            goto L_0x00f3
        L_0x00de:
            r13 = 2
            goto L_0x00f6
        L_0x00e0:
            java.lang.String r6 = "c"
            boolean r6 = r9.equals(r6)
            if (r6 != 0) goto L_0x00e9
            goto L_0x00f3
        L_0x00e9:
            r13 = 1
            goto L_0x00f6
        L_0x00eb:
            java.lang.String r6 = "b"
            boolean r6 = r9.equals(r6)
            if (r6 != 0) goto L_0x00f5
        L_0x00f3:
            r13 = -1
            goto L_0x00f6
        L_0x00f5:
            r13 = 0
        L_0x00f6:
            if (r13 == 0) goto L_0x0105
            if (r13 == r15) goto L_0x0105
            if (r13 == r14) goto L_0x0105
            r6 = 3
            if (r13 == r6) goto L_0x0105
            if (r13 == r12) goto L_0x0105
            r6 = 5
            if (r13 == r6) goto L_0x0105
            r15 = 0
        L_0x0105:
            if (r15 != 0) goto L_0x0109
            goto L_0x003c
        L_0x0109:
            if (r10 == 0) goto L_0x0126
        L_0x010b:
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L_0x0113
            goto L_0x003c
        L_0x0113:
            java.lang.Object r6 = r4.pop()
            com.yandex.mobile.ads.impl.jq1$a r6 = (com.yandex.mobile.ads.impl.jq1.C13533a) r6
            m37949a(r0, r6, r3, r2, r5)
            java.lang.String r6 = r6.f35446a
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x010b
            goto L_0x003c
        L_0x0126:
            if (r11 != 0) goto L_0x003c
            int r6 = r3.length()
            com.yandex.mobile.ads.impl.jq1$a r6 = com.yandex.mobile.ads.impl.jq1.C13533a.m37954a(r7, r6)
            r4.push(r6)
            goto L_0x003c
        L_0x0135:
            r6 = 0
            goto L_0x0017
        L_0x0138:
            int r7 = r7 + 1
            r6 = 59
            int r6 = r1.indexOf(r6, r7)
            r12 = 32
            int r13 = r1.indexOf(r12, r7)
            r9 = -1
            if (r6 != r9) goto L_0x014b
            r6 = r13
            goto L_0x0152
        L_0x014b:
            if (r13 != r9) goto L_0x014e
            goto L_0x0152
        L_0x014e:
            int r6 = java.lang.Math.min(r6, r13)
        L_0x0152:
            if (r6 == r9) goto L_0x01df
            java.lang.String r7 = r1.substring(r7, r6)
            r7.getClass()
            int r8 = r7.hashCode()
            r9 = 3309(0xced, float:4.637E-42)
            if (r8 == r9) goto L_0x0193
            r9 = 3464(0xd88, float:4.854E-42)
            if (r8 == r9) goto L_0x0188
            r9 = 96708(0x179c4, float:1.35517E-40)
            if (r8 == r9) goto L_0x017d
            r9 = 3374865(0x337f11, float:4.729193E-39)
            if (r8 == r9) goto L_0x0172
            goto L_0x019b
        L_0x0172:
            java.lang.String r8 = "nbsp"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x017b
            goto L_0x019b
        L_0x017b:
            r8 = 3
            goto L_0x019e
        L_0x017d:
            java.lang.String r8 = "amp"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x0186
            goto L_0x019b
        L_0x0186:
            r8 = 2
            goto L_0x019e
        L_0x0188:
            java.lang.String r8 = "lt"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x0191
            goto L_0x019b
        L_0x0191:
            r8 = 1
            goto L_0x019e
        L_0x0193:
            java.lang.String r8 = "gt"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x019d
        L_0x019b:
            r8 = -1
            goto L_0x019e
        L_0x019d:
            r8 = 0
        L_0x019e:
            if (r8 == 0) goto L_0x01cf
            if (r8 == r15) goto L_0x01cb
            if (r8 == r14) goto L_0x01c7
            r9 = 3
            if (r8 == r9) goto L_0x01c3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "ignoring unsupported entity: '&"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = ";'"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "WebvttCueParser"
            android.util.Log.w(r8, r7)
            goto L_0x01d4
        L_0x01c3:
            r3.append(r12)
            goto L_0x01d4
        L_0x01c7:
            r3.append(r11)
            goto L_0x01d4
        L_0x01cb:
            r3.append(r10)
            goto L_0x01d4
        L_0x01cf:
            r7 = 62
            r3.append(r7)
        L_0x01d4:
            if (r6 != r13) goto L_0x01db
            java.lang.String r7 = " "
            r3.append(r7)
        L_0x01db:
            int r7 = r6 + 1
            goto L_0x0135
        L_0x01df:
            r3.append(r8)
            goto L_0x0135
        L_0x01e4:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x01f4
            java.lang.Object r1 = r4.pop()
            com.yandex.mobile.ads.impl.jq1$a r1 = (com.yandex.mobile.ads.impl.jq1.C13533a) r1
            m37949a(r0, r1, r3, r2, r5)
            goto L_0x01e4
        L_0x01f4:
            com.yandex.mobile.ads.impl.jq1$a r1 = com.yandex.mobile.ads.impl.jq1.C13533a.m37953a()
            m37949a(r0, r1, r3, r2, r5)
            r0 = r18
            r0.mo67875a((java.lang.CharSequence) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.jq1.m37950a(java.lang.String, java.lang.String, com.yandex.mobile.ads.impl.iq1$b, java.util.List):void");
    }

    /* renamed from: a */
    private static boolean m37951a(String str, Matcher matcher, fy0 fy0, iq1.C13435b bVar, StringBuilder sb, List<hq1> list) {
        try {
            bVar.mo67879b(lq1.m38896b(matcher.group(1))).mo67874a(lq1.m38896b(matcher.group(2)));
            m37948a(matcher.group(3), bVar);
            sb.setLength(0);
            String h = fy0.mo67116h();
            while (!TextUtils.isEmpty(h)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(h.trim());
                h = fy0.mo67116h();
            }
            m37950a(str, sb.toString(), bVar, list);
            return true;
        } catch (NumberFormatException unused) {
            Log.w("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return false;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m37947a(java.lang.String r5) {
        /*
            r5.getClass()
            int r0 = r5.hashCode()
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L_0x0030;
                case -1074341483: goto L_0x0025;
                case 100571: goto L_0x001a;
                case 109757538: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x003b
        L_0x000f:
            java.lang.String r0 = "start"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0018
            goto L_0x003b
        L_0x0018:
            r0 = 3
            goto L_0x003c
        L_0x001a:
            java.lang.String r0 = "end"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0023
            goto L_0x003b
        L_0x0023:
            r0 = 2
            goto L_0x003c
        L_0x0025:
            java.lang.String r0 = "middle"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x002e
            goto L_0x003b
        L_0x002e:
            r0 = 1
            goto L_0x003c
        L_0x0030:
            java.lang.String r0 = "center"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r0 = 0
            goto L_0x003c
        L_0x003b:
            r0 = -1
        L_0x003c:
            if (r0 == 0) goto L_0x005f
            if (r0 == r4) goto L_0x005f
            if (r0 == r3) goto L_0x005e
            if (r0 == r1) goto L_0x005d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid anchor value: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "WebvttCueParser"
            android.util.Log.w(r0, r5)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            return r5
        L_0x005d:
            return r2
        L_0x005e:
            return r3
        L_0x005f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.jq1.m37947a(java.lang.String):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m37949a(java.lang.String r16, com.yandex.mobile.ads.impl.jq1.C13533a r17, android.text.SpannableStringBuilder r18, java.util.List<com.yandex.mobile.ads.impl.hq1> r19, java.util.List<com.yandex.mobile.ads.impl.jq1.C13534b> r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r20
            int r3 = r0.f35447b
            int r4 = r18.length()
            java.lang.String r5 = r0.f35446a
            r5.getClass()
            int r6 = r5.hashCode()
            r8 = -1
            r9 = 2
            r11 = 1
            if (r6 == 0) goto L_0x0076
            r12 = 105(0x69, float:1.47E-43)
            if (r6 == r12) goto L_0x006b
            r12 = 3314158(0x3291ee, float:4.644125E-39)
            if (r6 == r12) goto L_0x0060
            r12 = 98
            if (r6 == r12) goto L_0x0055
            r12 = 99
            if (r6 == r12) goto L_0x004a
            r12 = 117(0x75, float:1.64E-43)
            if (r6 == r12) goto L_0x003f
            r12 = 118(0x76, float:1.65E-43)
            if (r6 == r12) goto L_0x0034
            goto L_0x007e
        L_0x0034:
            java.lang.String r6 = "v"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x003d
            goto L_0x007e
        L_0x003d:
            r5 = 5
            goto L_0x0081
        L_0x003f:
            java.lang.String r6 = "u"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0048
            goto L_0x007e
        L_0x0048:
            r5 = 4
            goto L_0x0081
        L_0x004a:
            java.lang.String r6 = "c"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0053
            goto L_0x007e
        L_0x0053:
            r5 = 2
            goto L_0x0081
        L_0x0055:
            java.lang.String r6 = "b"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x005e
            goto L_0x007e
        L_0x005e:
            r5 = 1
            goto L_0x0081
        L_0x0060:
            java.lang.String r6 = "lang"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0069
            goto L_0x007e
        L_0x0069:
            r5 = 6
            goto L_0x0081
        L_0x006b:
            java.lang.String r6 = "i"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0074
            goto L_0x007e
        L_0x0074:
            r5 = 3
            goto L_0x0081
        L_0x0076:
            java.lang.String r6 = ""
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0080
        L_0x007e:
            r5 = -1
            goto L_0x0081
        L_0x0080:
            r5 = 0
        L_0x0081:
            r6 = 33
            switch(r5) {
                case 0: goto L_0x00a1;
                case 1: goto L_0x0099;
                case 2: goto L_0x00a1;
                case 3: goto L_0x0090;
                case 4: goto L_0x0087;
                case 5: goto L_0x00a1;
                case 6: goto L_0x00a1;
                default: goto L_0x0086;
            }
        L_0x0086:
            return
        L_0x0087:
            android.text.style.UnderlineSpan r5 = new android.text.style.UnderlineSpan
            r5.<init>()
            r1.setSpan(r5, r3, r4, r6)
            goto L_0x00a1
        L_0x0090:
            android.text.style.StyleSpan r5 = new android.text.style.StyleSpan
            r5.<init>(r9)
            r1.setSpan(r5, r3, r4, r6)
            goto L_0x00a1
        L_0x0099:
            android.text.style.StyleSpan r5 = new android.text.style.StyleSpan
            r5.<init>(r11)
            r1.setSpan(r5, r3, r4, r6)
        L_0x00a1:
            r20.clear()
            int r5 = r19.size()
            r12 = 0
        L_0x00a9:
            if (r12 >= r5) goto L_0x00cd
            r13 = r19
            java.lang.Object r14 = r13.get(r12)
            com.yandex.mobile.ads.impl.hq1 r14 = (com.yandex.mobile.ads.impl.hq1) r14
            java.lang.String r15 = r0.f35446a
            java.lang.String[] r10 = r0.f35449d
            java.lang.String r7 = r0.f35448c
            r9 = r16
            int r7 = r14.mo67592a((java.lang.String) r9, (java.lang.String) r15, (java.lang.String[]) r10, (java.lang.String) r7)
            if (r7 <= 0) goto L_0x00c9
            com.yandex.mobile.ads.impl.jq1$b r10 = new com.yandex.mobile.ads.impl.jq1$b
            r10.<init>(r7, r14)
            r2.add(r10)
        L_0x00c9:
            int r12 = r12 + 1
            r9 = 2
            goto L_0x00a9
        L_0x00cd:
            java.util.Collections.sort(r20)
            int r0 = r20.size()
            r10 = 0
        L_0x00d5:
            if (r10 >= r0) goto L_0x0179
            java.lang.Object r5 = r2.get(r10)
            com.yandex.mobile.ads.impl.jq1$b r5 = (com.yandex.mobile.ads.impl.jq1.C13534b) r5
            com.yandex.mobile.ads.impl.hq1 r5 = r5.f35451c
            if (r5 != 0) goto L_0x00e5
            r9 = 2
            r12 = 3
            goto L_0x0175
        L_0x00e5:
            int r7 = r5.mo67606e()
            if (r7 == r8) goto L_0x00f7
            android.text.style.StyleSpan r7 = new android.text.style.StyleSpan
            int r9 = r5.mo67606e()
            r7.<init>(r9)
            r1.setSpan(r7, r3, r4, r6)
        L_0x00f7:
            boolean r7 = r5.mo67609h()
            if (r7 == 0) goto L_0x0105
            android.text.style.StrikethroughSpan r7 = new android.text.style.StrikethroughSpan
            r7.<init>()
            r1.setSpan(r7, r3, r4, r6)
        L_0x0105:
            boolean r7 = r5.mo67610i()
            if (r7 == 0) goto L_0x0113
            android.text.style.UnderlineSpan r7 = new android.text.style.UnderlineSpan
            r7.<init>()
            r1.setSpan(r7, r3, r4, r6)
        L_0x0113:
            boolean r7 = r5.mo67608g()
            if (r7 == 0) goto L_0x0125
            android.text.style.ForegroundColorSpan r7 = new android.text.style.ForegroundColorSpan
            int r9 = r5.mo67597b()
            r7.<init>(r9)
            r1.setSpan(r7, r3, r4, r6)
        L_0x0125:
            boolean r7 = r5.mo67607f()
            if (r7 == 0) goto L_0x0137
            android.text.style.BackgroundColorSpan r7 = new android.text.style.BackgroundColorSpan
            int r9 = r5.mo67591a()
            r7.<init>(r9)
            r1.setSpan(r7, r3, r4, r6)
        L_0x0137:
            java.lang.String r7 = r5.mo67602c()
            if (r7 == 0) goto L_0x0149
            android.text.style.TypefaceSpan r7 = new android.text.style.TypefaceSpan
            java.lang.String r9 = r5.mo67602c()
            r7.<init>(r9)
            r1.setSpan(r7, r3, r4, r6)
        L_0x0149:
            int r5 = r5.mo67604d()
            r7 = 0
            if (r5 == r11) goto L_0x016a
            r9 = 2
            if (r5 == r9) goto L_0x0160
            r12 = 3
            if (r5 == r12) goto L_0x0157
            goto L_0x0175
        L_0x0157:
            android.text.style.RelativeSizeSpan r5 = new android.text.style.RelativeSizeSpan
            r5.<init>(r7)
            r1.setSpan(r5, r3, r4, r6)
            goto L_0x0175
        L_0x0160:
            r12 = 3
            android.text.style.RelativeSizeSpan r5 = new android.text.style.RelativeSizeSpan
            r5.<init>(r7)
            r1.setSpan(r5, r3, r4, r6)
            goto L_0x0175
        L_0x016a:
            r9 = 2
            r12 = 3
            android.text.style.AbsoluteSizeSpan r5 = new android.text.style.AbsoluteSizeSpan
            int r7 = (int) r7
            r5.<init>(r7, r11)
            r1.setSpan(r5, r3, r4, r6)
        L_0x0175:
            int r10 = r10 + 1
            goto L_0x00d5
        L_0x0179:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.jq1.m37949a(java.lang.String, com.yandex.mobile.ads.impl.jq1$a, android.text.SpannableStringBuilder, java.util.List, java.util.List):void");
    }
}
