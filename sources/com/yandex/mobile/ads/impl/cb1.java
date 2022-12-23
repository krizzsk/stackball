package com.yandex.mobile.ads.impl;

import android.graphics.PointF;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class cb1 {

    /* renamed from: a */
    public final String f31873a;

    /* renamed from: b */
    public final int f31874b;

    /* renamed from: com.yandex.mobile.ads.impl.cb1$a */
    static final class C12721a {

        /* renamed from: a */
        public final int f31875a;

        /* renamed from: b */
        public final int f31876b;

        /* renamed from: c */
        public final int f31877c;

        private C12721a(int i, int i2, int i3) {
            this.f31875a = i;
            this.f31876b = i2;
            this.f31877c = i3;
        }

        /* renamed from: a */
        public static C12721a m34668a(String str) {
            String[] split = TextUtils.split(str.substring(7), ",");
            int i = -1;
            int i2 = -1;
            for (int i3 = 0; i3 < split.length; i3++) {
                String e = ih1.m37399e(split[i3].trim());
                e.getClass();
                if (e.equals("name")) {
                    i = i3;
                } else if (e.equals("alignment")) {
                    i2 = i3;
                }
            }
            if (i != -1) {
                return new C12721a(i, i2, split.length);
            }
            return null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.cb1$b */
    static final class C12722b {

        /* renamed from: c */
        private static final Pattern f31878c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d */
        private static final Pattern f31879d;

        /* renamed from: e */
        private static final Pattern f31880e;

        /* renamed from: f */
        private static final Pattern f31881f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a */
        public final int f31882a;

        /* renamed from: b */
        public final PointF f31883b;

        static {
            int i = ih1.f34858a;
            Locale locale = Locale.US;
            f31879d = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", new Object[]{"\\s*\\d+(?:\\.\\d+)?\\s*"}));
            f31880e = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", new Object[]{"\\s*\\d+(?:\\.\\d+)?\\s*"}));
        }

        private C12722b(int i, PointF pointF) {
            this.f31882a = i;
            this.f31883b = pointF;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(10:3|4|5|(1:7)|8|9|(1:11)(1:12)|(2:14|21)(1:20)|18|1) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001b */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0027 A[Catch:{ RuntimeException -> 0x0035 }] */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0009 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.yandex.mobile.ads.impl.cb1.C12722b m34669a(java.lang.String r6) {
            /*
                java.util.regex.Pattern r0 = f31878c
                java.util.regex.Matcher r6 = r0.matcher(r6)
                r0 = -1
                r1 = 0
                r2 = -1
            L_0x0009:
                boolean r3 = r6.find()
                if (r3 == 0) goto L_0x0037
                r3 = 1
                java.lang.String r4 = r6.group(r3)
                android.graphics.PointF r5 = m34670b(r4)     // Catch:{ RuntimeException -> 0x001b }
                if (r5 == 0) goto L_0x001b
                r1 = r5
            L_0x001b:
                java.util.regex.Pattern r5 = f31881f     // Catch:{ RuntimeException -> 0x0035 }
                java.util.regex.Matcher r4 = r5.matcher(r4)     // Catch:{ RuntimeException -> 0x0035 }
                boolean r5 = r4.find()     // Catch:{ RuntimeException -> 0x0035 }
                if (r5 == 0) goto L_0x0030
                java.lang.String r3 = r4.group(r3)     // Catch:{ RuntimeException -> 0x0035 }
                int r3 = com.yandex.mobile.ads.impl.cb1.m34667b(r3)     // Catch:{ RuntimeException -> 0x0035 }
                goto L_0x0031
            L_0x0030:
                r3 = -1
            L_0x0031:
                if (r3 == r0) goto L_0x0009
                r2 = r3
                goto L_0x0009
            L_0x0035:
                goto L_0x0009
            L_0x0037:
                com.yandex.mobile.ads.impl.cb1$b r6 = new com.yandex.mobile.ads.impl.cb1$b
                r6.<init>(r2, r1)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.cb1.C12722b.m34669a(java.lang.String):com.yandex.mobile.ads.impl.cb1$b");
        }

        /* renamed from: b */
        private static PointF m34670b(String str) {
            String str2;
            String str3;
            Matcher matcher = f31879d.matcher(str);
            Matcher matcher2 = f31880e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    Log.i("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                str2 = matcher.group(1);
                str3 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                str2 = matcher2.group(1);
                str3 = matcher2.group(2);
            }
            str2.getClass();
            float parseFloat = Float.parseFloat(str2.trim());
            str3.getClass();
            return new PointF(parseFloat, Float.parseFloat(str3.trim()));
        }

        /* renamed from: c */
        public static String m34671c(String str) {
            return f31878c.matcher(str).replaceAll("");
        }
    }

    private cb1(String str, int i) {
        this.f31873a = str;
        this.f31874b = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m34667b(String str) {
        boolean z;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        Log.w("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    /* renamed from: a */
    public static cb1 m34666a(String str, C12721a aVar) {
        C13479j9.m37705a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i = aVar.f31877c;
        if (length != i) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(split.length), str};
            int i2 = ih1.f34858a;
            Log.w("SsaStyle", String.format(Locale.US, "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", objArr));
            return null;
        }
        try {
            return new cb1(split[aVar.f31875a].trim(), m34667b(split[aVar.f31876b]));
        } catch (RuntimeException e) {
            bk0.m34271b("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
            return null;
        }
    }
}
