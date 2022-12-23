package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.exoplayer2.extractor.p086ts.TsExtractor;
import com.smaato.sdk.video.vast.model.ErrorCode;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;

/* renamed from: com.appsflyer.internal.d */
public final class C1750d {

    /* renamed from: ı */
    private static int f4167 = 1;

    /* renamed from: ǃ */
    private static long f4168 = 8991119168789736674L;

    /* renamed from: ɩ */
    private static int f4169;

    /* renamed from: Ι */
    private static char[] f4170 = {1744, 59965, 57105, 49253, 46422, 42674, 35737, 31921, 25045, 21798, 17929, 11106, 7257, 419, 62082, 59361, 51432, 48541, 41217, 37394, 34677, 26718, 23981, 20119, 13294, 9421, 2108, 64810, 61032, 54085, 50348, 43400, 39572, 36833, 64923, 62914, 32741, 37639, 42529, 47427, 52281, 57275, 62109, 1439, 6376, 11274, 16151, 21090, 25932, 30859, 35757, 40657, 45519, 50372, 5365, 63508, 52529, 53844, 42878, 46232, 39403, 28300, 29630, 18177, 21622, 14610, 3694, 5007, 57586, 62874, 55939, 45043, 45895, 32820, 38155, 31352, 20431, 23785, 8643, 14012, 6738, 61223, 64541, 49469, 55002, 48120, 19590, 41067, 38215, 35379, 65280, 60644, 49615, 14055, 11160, 8038, 3101, 24851, 22046, 19433, 47311, 44476, 33461, 63388, 60238, 55360, 52513, 8716, 6124, 1228, 31141, 'a', 60556, 55712, 50900, 46055, 40963, 36136, 31232, 26488, 21395, 16550, 11730, 6895, 1819, 62510, 57691, 52750, 47953, 42881, 38056, 33243, 28389, 23326, 34342, 27339, 24551, 16531, 13728, 9796, 2927, 64583, 57656, 54726, 50877, 43952, 40108, 33092, 29301, 26394, 18483, 15652, 8656, 4842, 33805, 26848, 24012, 17080, 14219, 9327, 2372, 65132, 58130, 55291, 50380, 43508, 40609, 33636, 28761, '.', '\\', 60620, 45034, 17155, 30258, 26951, 7206, 3971, 8867, 54656, 51428, 64543, 61220, 33362, 46449, 43144, '/', 60545, 55717, 50885, 46048, 40975, '.', 60616, 55787, 50938, 46075, 41024, 36196, 31232, 26426, 21467, 64746, 4131, 9480, 14956, 20298, 23728, 29072, 34538, 39932, 44835, 48158, 53626, 58945, 64423, 2204, 7672, 13031, 20874, 48463, 34913, 38662, 57889, 61890, 56480, 11158, 14003, 542, 4479, 31775, 19232, 22166, 42483, 45203, 40847, 60070, 63053, 50474, 53268, 16167, 2772, 6634, 25820, 29609, 24401, 43630, 47388, 33910, 37845, 65258, 52719, 55435, 10168, 13150, 7789, 27913, 30766, 18328, 21180, 'g', 60551, 55728, 50927, 46054, 40985, 36152, 31311, 26492, 21406, 16561, 11730, 6873, 1802, 62508, 57682, 52809, 47969, 42885, 38066, 33217, 28389, 23298, 18493, 'C', 60554, 55713, 50885, 46051, 40985, 36153, 31299, 26434, 21399, 16562, 11738, 6909, 1817, 62504, 57723, 52824, 47969, 42881, 38070, 33244, 28387, 23299, 18464, 46123, 22766, 28096, 29351, 1920, 5219, 14593, 52778, 54035, 59369, 62678, 39344, 44688, 45879, 16451, 21814, 31275, 3843, 5100, 8392, 13745, 55938, 61285, 64515, 33072, 38426, 47853, 20435, 23738, 24979, 30257, 6980, 10308, 15675, 49665, 54955, 64448, 35007, 40322, 41574, 46925, 17451, 26896, 32244, 731, 6125, 9425};

    C1750d() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b4  */
    /* renamed from: ɩ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m3860(android.content.Context r17, long r18) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 1713(0x6b1, float:2.4E-42)
            r4 = 0
            r5 = 34
            java.lang.String r3 = m3863(r4, r5, r3)
            java.lang.String r3 = r3.intern()
            boolean r3 = m3864(r3)
            r6 = 90
            r7 = 2
            r8 = 35
            r9 = 62962(0xf5f2, float:8.8229E-41)
            r10 = 64938(0xfdaa, float:9.0998E-41)
            r11 = 1
            if (r3 == 0) goto L_0x0047
            int r3 = f4167
            int r3 = r3 + 11
            int r12 = r3 % 128
            f4169 = r12
            int r3 = r3 % r7
            if (r3 == 0) goto L_0x0042
            java.lang.String r3 = m3863(r6, r4, r10)
            java.lang.String r3 = r3.intern()
            goto L_0x004f
        L_0x0042:
            java.lang.String r3 = m3863(r5, r11, r10)
            goto L_0x004b
        L_0x0047:
            java.lang.String r3 = m3863(r8, r11, r9)
        L_0x004b:
            java.lang.String r3 = r3.intern()
        L_0x004f:
            r1.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r12 = r17.getPackageName()
            java.lang.String r13 = m3862(r12)
            java.lang.String r14 = m3863(r5, r11, r10)
            java.lang.String r14 = r14.intern()
            r1.append(r14)
            r3.append(r13)
            java.lang.String r13 = m3859(r17)
            r14 = 60
            if (r13 != 0) goto L_0x0077
            r13 = 5
            goto L_0x0079
        L_0x0077:
            r13 = 60
        L_0x0079:
            r15 = 27
            r16 = 19
            if (r13 == r14) goto L_0x009e
            int r13 = f4169
            int r13 = r13 + 19
            int r14 = r13 % 128
            f4167 = r14
            int r13 = r13 % r7
            if (r13 != 0) goto L_0x008f
            java.lang.String r13 = m3863(r15, r4, r9)
            goto L_0x0093
        L_0x008f:
            java.lang.String r13 = m3863(r8, r11, r9)
        L_0x0093:
            java.lang.String r13 = r13.intern()
            r1.append(r13)
            r3.append(r12)
            goto L_0x00ac
        L_0x009e:
            java.lang.String r13 = m3863(r5, r11, r10)
            java.lang.String r13 = r13.intern()
            r1.append(r13)
            r3.append(r12)
        L_0x00ac:
            java.lang.String r13 = m3865(r17)
            if (r13 != 0) goto L_0x00c1
            java.lang.String r13 = m3863(r8, r11, r9)
            java.lang.String r13 = r13.intern()
            r1.append(r13)
            r3.append(r12)
            goto L_0x00cf
        L_0x00c1:
            java.lang.String r14 = m3863(r5, r11, r10)
            java.lang.String r14 = r14.intern()
            r1.append(r14)
            r3.append(r13)
        L_0x00cf:
            r13 = r17
            java.lang.String r12 = m3861((android.content.Context) r13, (java.lang.String) r12)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            android.content.pm.PackageManager r12 = r17.getPackageManager()     // Catch:{ NameNotFoundException -> 0x021b }
            java.lang.String r13 = r17.getPackageName()     // Catch:{ NameNotFoundException -> 0x021b }
            android.content.pm.PackageInfo r12 = r12.getPackageInfo(r13, r4)     // Catch:{ NameNotFoundException -> 0x021b }
            long r12 = r12.firstInstallTime     // Catch:{ NameNotFoundException -> 0x021b }
            r14 = 36
            r3 = 18
            r15 = 32668(0x7f9c, float:4.5778E-41)
            java.lang.String r3 = m3863(r14, r3, r15)     // Catch:{ NameNotFoundException -> 0x021b }
            java.lang.String r3 = r3.intern()     // Catch:{ NameNotFoundException -> 0x021b }
            java.text.SimpleDateFormat r3 = com.appsflyer.AFDateFormat.getDataFormatter(r3)     // Catch:{ NameNotFoundException -> 0x021b }
            java.util.Date r14 = new java.util.Date     // Catch:{ NameNotFoundException -> 0x021b }
            r14.<init>(r12)     // Catch:{ NameNotFoundException -> 0x021b }
            java.lang.String r3 = r3.format(r14)     // Catch:{ NameNotFoundException -> 0x021b }
            r0.append(r3)     // Catch:{ NameNotFoundException -> 0x021b }
            r12 = r18
            r0.append(r12)
            r3 = 86
            r14 = 25
            r15 = 19687(0x4ce7, float:2.7587E-41)
            java.lang.String r3 = m3863(r3, r14, r15)
            java.lang.String r3 = r3.intern()
            boolean r3 = m3864(r3)
            r14 = 67
            if (r3 == 0) goto L_0x0129
            r3 = 67
            goto L_0x012b
        L_0x0129:
            r3 = 54
        L_0x012b:
            if (r3 == r14) goto L_0x0136
            java.lang.String r3 = m3863(r8, r11, r9)
        L_0x0131:
            java.lang.String r3 = r3.intern()
            goto L_0x013b
        L_0x0136:
            java.lang.String r3 = m3863(r5, r11, r10)
            goto L_0x0131
        L_0x013b:
            r2.append(r3)
            r3 = 111(0x6f, float:1.56E-43)
            r14 = 23
            java.lang.String r3 = m3863(r3, r14, r4)
            java.lang.String r3 = r3.intern()
            boolean r3 = m3864(r3)
            if (r3 == 0) goto L_0x0153
            r3 = 90
            goto L_0x0155
        L_0x0153:
            r3 = 19
        L_0x0155:
            if (r3 == r6) goto L_0x0160
            java.lang.String r3 = m3863(r8, r11, r9)
        L_0x015b:
            java.lang.String r3 = r3.intern()
            goto L_0x0165
        L_0x0160:
            java.lang.String r3 = m3863(r5, r11, r10)
            goto L_0x015b
        L_0x0165:
            r2.append(r3)
            r3 = 134(0x86, float:1.88E-43)
            r6 = 20
            r14 = 34375(0x8647, float:4.817E-41)
            java.lang.String r3 = m3863(r3, r6, r14)
            java.lang.String r3 = r3.intern()
            boolean r3 = m3864(r3)
            if (r3 == 0) goto L_0x0182
            java.lang.String r3 = m3863(r5, r11, r10)
            goto L_0x0186
        L_0x0182:
            java.lang.String r3 = m3863(r8, r11, r9)
        L_0x0186:
            java.lang.String r3 = r3.intern()
            r2.append(r3)
            r3 = 154(0x9a, float:2.16E-43)
            r6 = 15
            r14 = 33900(0x846c, float:4.7504E-41)
            java.lang.String r3 = m3863(r3, r6, r14)
            java.lang.String r3 = r3.intern()
            boolean r3 = m3864(r3)
            if (r3 == 0) goto L_0x01b4
            int r3 = f4169
            int r3 = r3 + 11
            int r6 = r3 % 128
            f4167 = r6
            int r3 = r3 % r7
            java.lang.String r3 = m3863(r5, r11, r10)
            java.lang.String r3 = r3.intern()
            goto L_0x01c5
        L_0x01b4:
            java.lang.String r3 = m3863(r8, r11, r9)
            java.lang.String r3 = r3.intern()
            int r5 = f4169
            int r5 = r5 + 7
            int r6 = r5 % 128
            f4167 = r6
            int r5 = r5 % r7
        L_0x01c5:
            r2.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = com.appsflyer.HashUtils.toSha256(r0)
            java.lang.String r0 = com.appsflyer.HashUtils.toMD5(r0)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r0 = 17
            int r1 = java.lang.Integer.parseInt(r1, r7)
            r5 = 16
            java.lang.String r1 = java.lang.Integer.toString(r1, r5)
            char r1 = r1.charAt(r4)
            r3.setCharAt(r0, r1)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            int r0 = java.lang.Integer.parseInt(r1, r7)
            java.lang.String r0 = java.lang.Integer.toString(r0, r5)
            char r0 = r0.charAt(r4)
            r1 = 27
            r2.setCharAt(r1, r0)
            java.lang.String r0 = r2.toString()
            java.lang.Long r1 = java.lang.Long.valueOf(r18)
            java.lang.String r0 = m3866(r0, r1)
            return r0
        L_0x021b:
            r0 = 32
            r1 = 5271(0x1497, float:7.386E-42)
            r2 = 54
            java.lang.String r0 = m3863(r2, r0, r1)
            java.lang.String r0 = r0.intern()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C1750d.m3860(android.content.Context, long):java.lang.String");
    }

    /* renamed from: ι */
    private static String m3866(String str, Long l) {
        if (str == null || l == null || str.length() != 32) {
            return m3863(54, 32, 5271).intern();
        }
        StringBuilder sb = new StringBuilder(str);
        String obj = l.toString();
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= obj.length()) {
                break;
            }
            i2 += Character.getNumericValue(obj.charAt(i));
            i++;
            int i3 = f4167 + 113;
            f4169 = i3 % 128;
            int i4 = i3 % 2;
        }
        String hexString = Integer.toHexString(i2);
        sb.replace(7, hexString.length() + 7, hexString);
        int i5 = 0;
        while (true) {
            if ((i5 < sb.length() ? (char) 4 : 16) == 16) {
                break;
            }
            int i6 = f4169 + 75;
            f4167 = i6 % 128;
            if (i6 % 2 != 0) {
                j += (long) Character.getNumericValue(sb.charAt(i5));
                i5++;
            } else {
                j ^= (long) Character.getNumericValue(sb.charAt(i5));
                i5 += 24;
            }
        }
        while (true) {
            if ((j > 100 ? 'M' : '8') == '8') {
                break;
            }
            j %= 100;
        }
        sb.insert(23, (int) j);
        if (j < 10) {
            int i7 = f4169 + 63;
            f4167 = i7 % 128;
            int i8 = i7 % 2;
            sb.insert(23, m3863(35, 1, 62962).intern());
        }
        return sb.toString();
    }

    /* renamed from: Ι */
    private static boolean m3864(String str) {
        int i = f4167 + 117;
        f4169 = i % 128;
        boolean z = false;
        if ((i % 2 != 0 ? 'C' : 'Z') != 'C') {
            try {
                Class.forName(str);
                z = true;
            } catch (ClassNotFoundException unused) {
            }
        } else {
            Class.forName(str);
        }
        int i2 = f4167 + 75;
        f4169 = i2 % 128;
        int i3 = i2 % 2;
        return z;
    }

    /* renamed from: ɩ */
    private static String m3862(String str) {
        if (str.contains(m3863(169, 1, 0).intern())) {
            String[] split = str.split(m3863(170, 2, 0).intern());
            int length = split.length;
            StringBuilder sb = new StringBuilder();
            int i = length - 1;
            sb.append(split[i]);
            sb.append(m3863(169, 1, 0).intern());
            for (int i2 = 1; i2 < i; i2++) {
                int i3 = f4167 + 9;
                f4169 = i3 % 128;
                int i4 = i3 % 2;
                sb.append(split[i2]);
                sb.append(m3863(169, 1, 0).intern());
            }
            sb.append(split[0]);
            String obj = sb.toString();
            int i5 = f4169 + 105;
            f4167 = i5 % 128;
            if ((i5 % 2 == 0 ? (char) 12 : 22) == 22) {
                return obj;
            }
            int i6 = 77 / 0;
            return obj;
        }
        int i7 = f4167 + 43;
        f4169 = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    /* renamed from: ı */
    private static String m3859(Context context) {
        if (!(System.getProperties().containsKey(m3863(TsExtractor.TS_STREAM_TYPE_AC4, 14, 44928).intern()))) {
            return null;
        }
        int i = f4169 + 109;
        f4167 = i % 128;
        int i2 = i % 2;
        try {
            Matcher matcher = Pattern.compile(m3863(192, 10, 0).intern()).matcher(context.getCacheDir().getPath().replace(m3863(186, 6, 0).intern(), ""));
            if (!matcher.find()) {
                return null;
            }
            int i3 = f4167 + 85;
            f4169 = i3 % 128;
            int i4 = i3 % 2;
            return matcher.group(1);
        } catch (Exception e) {
            C1740aa r0 = C1740aa.m3833();
            String intern = m3863(ErrorCode.DIFFERENT_DURATION_EXPECTED_ERROR, 17, 64681).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m3863(219, 41, 20940).intern());
            sb.append(e);
            r0.mo14060((String) null, intern, sb.toString());
            return null;
        }
    }

    /* renamed from: ι */
    private static String m3865(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            int i = f4169 + 59;
            f4167 = i % 128;
            int i2 = i % 2;
            int i3 = f4167 + 69;
            f4169 = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.String] */
    /* renamed from: ɩ */
    private static String m3861(Context context, String str) {
        int i = f4169 + 123;
        f4167 = i % 128;
        int i2 = i % 2;
        ? r4 = 0;
        boolean z = false;
        try {
            Iterator it = ((List) PackageManager.class.getDeclaredMethod(m3863(260, 24, 0).intern(), new Class[]{Integer.TYPE}).invoke(context.getPackageManager(), new Object[]{0})).iterator();
            do {
                if (it.hasNext()) {
                    int i3 = f4169 + 61;
                    f4167 = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    String obj = Boolean.FALSE.toString();
                    int i5 = f4169 + 7;
                    f4167 = i5 % 128;
                    if (i5 % 2 != 0) {
                        z = true;
                    }
                    if (z) {
                        return obj;
                    }
                    int length = r4.length;
                    return obj;
                }
            } while (!((ApplicationInfo) it.next()).packageName.equals(str));
            return Boolean.TRUE.toString();
        } catch (IllegalAccessException e) {
            C1740aa r13 = C1740aa.m3833();
            String intern = m3863(284, 24, 0).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m3863(308, 47, 46189).intern());
            sb.append(e);
            r13.mo14060(r4, intern, sb.toString());
        } catch (NoSuchMethodException e2) {
            C1740aa r132 = C1740aa.m3833();
            String intern2 = m3863(284, 24, 0).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m3863(308, 47, 46189).intern());
            sb2.append(e2);
            r132.mo14060(r4, intern2, sb2.toString());
        } catch (InvocationTargetException e3) {
            C1740aa r133 = C1740aa.m3833();
            String intern3 = m3863(284, 24, 0).intern();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m3863(308, 47, 46189).intern());
            sb3.append(e3);
            r133.mo14060(r4, intern3, sb3.toString());
        }
    }

    /* renamed from: com.appsflyer.internal.d$c */
    public static class C1751c extends HashMap<String, Object> {

        /* renamed from: ǃ */
        private static int f4171 = 0;

        /* renamed from: ɩ */
        private static long f4172 = 1626664846685826103L;

        /* renamed from: Ι */
        private static char[] f4173 = {'a', 60497, 55345, 50385, 45237, 40318, 35119, 30194, 25036, 19854, 14923, 9773, 'b', 60485, 55311, 50379, 45240, 4348, 64714, 51331, 54357, 41020, 36320, 39350, 25975, 'k', 60498, 55304, 'f', 60502, 55303, 50377, 45241, 40311, 35178, 30182, 25053, 19841, 14915, 9775, 4853, 65215, 60267, 55127, 49943, 44935, 39861, 34928, 29738, 24739, 19665, 14484, 9553, 4479, 64993, 59812, 54896, 49747, 44626, 39628, 34456, 29556, 24363, 19445, 14280, 9114, 4165, 64527, 59554, 54511, 2017, 60376, 57218, 49942, 46959, 39584, 36601, 'f', 60510, 55324, 50390, 45224, 40287, 35115, 30196, 25046, 19852, 14926, 9753, 4853, 65215, 60263, '6', 60441, 55391, 50315, 45295, '-', 60485, 55309, 50315, 45302, 'f', 60502, 55303, 50377, 45241, 40311, 35178, 30182, 25053, 19841, 14915, 9775, 4853, 65215, 60267, 55127, 49943, 44935, 39861, 34928, 29738, 24739, 19660, 14480, 9540, 4394, 65011, 59885, 54899, 49746, 44550, 39617, 34496, 29554, 24374, 19430, 14297, 9091, 4190, 64520, 59639, 54433, 49468, 44317, 'b', 60502, 55308, 50368, 45245, 40310, 35194, 30132, 24972, 19935, 14914, 9828, 4773, 65197, 60208, 55049, 49985, 44959, 'a', 60505, 55306, 50391, 45235, 40314, 35118, 30127, 25041, 19841, 14930, 9784, 4858, 65215, 60204, 55128, 49939, 45011, 39863, 34938, 29730, 24749, 19704, 14512, 9596, 4363, 64979, 59807, 54877, 49764, 44593, 39649, 34465, 29529, 24329, 19392, 14328, 't', 60498, 55299, 50389, 45241, 40289, 35115, 30197, 25037, 19869, 14915, 38102, 30881, 19702, 's', 60498, 55296, 50390, 45235, 40289, 'b', Typography.amp, 60495, 36167, 24869, Typography.amp, 60487, 'f', 60423, 55327, 50325, 45229, 40226, 35130, 30128, 25032, 19933, 14868, 9790, 4860, 65215, 60259, 55124};

        /* renamed from: Ӏ */
        private static int f4174 = 1;

        /* renamed from: ı */
        private final Context f4175;

        /* renamed from: ι */
        private final Map<String, Object> f4176;

        public C1751c(Map<String, Object> map, Context context) {
            this.f4176 = map;
            this.f4175 = context;
            put(m3868(), m3867());
        }

        /* renamed from: ι */
        private static StringBuilder m3870(String... strArr) throws Exception {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < 3) {
                arrayList.add(Integer.valueOf(strArr[i].length()));
                i++;
                int i2 = f4174 + 103;
                f4171 = i2 % 128;
                int i3 = i2 % 2;
            }
            Collections.sort(arrayList);
            int intValue = ((Integer) arrayList.get(0)).intValue();
            StringBuilder sb = new StringBuilder();
            int i4 = f4174 + 21;
            f4171 = i4 % 128;
            int i5 = i4 % 2;
            for (int i6 = 0; i6 < intValue; i6++) {
                int i7 = f4174 + 99;
                f4171 = i7 % 128;
                if (i7 % 2 != 0) {
                }
                Integer num = null;
                int i8 = 0;
                while (true) {
                    if (i8 >= 3) {
                        break;
                    }
                    char charAt = strArr[i8].charAt(i6);
                    if (num != null) {
                        charAt ^= num.intValue();
                    }
                    num = Integer.valueOf(charAt);
                    i8++;
                }
                sb.append(Integer.toHexString(num.intValue()));
            }
            return sb;
        }

        /* renamed from: ι */
        private String m3868() {
            try {
                String num = Integer.toString(Build.VERSION.SDK_INT);
                char c = 12;
                String obj = this.f4176.get(m3869(0, 12, 0).intern()).toString();
                String obj2 = this.f4176.get(m3869(12, 5, 0).intern()).toString();
                if (obj2 != null) {
                    c = 'c';
                }
                if (c != 'c') {
                    obj2 = m3869(17, 8, 4274).intern();
                }
                StringBuilder sb = new StringBuilder(obj);
                sb.reverse();
                StringBuilder r4 = m3870(num, obj2, sb.toString());
                int length = r4.length();
                if (length <= 4) {
                    while (true) {
                        if ((length < 4 ? 'X' : 28) == 28) {
                            break;
                        }
                        length++;
                        r4.append('1');
                    }
                } else {
                    int i = f4174 + 97;
                    f4171 = i % 128;
                    if (i % 2 != 0) {
                        r4.delete(3, length);
                    } else {
                        r4.delete(4, length);
                    }
                }
                r4.insert(0, m3869(25, 3, 0).intern());
                String obj3 = r4.toString();
                int i2 = f4174 + 115;
                f4171 = i2 % 128;
                int i3 = i2 % 2;
                return obj3;
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m3869(28, 42, 0).intern());
                sb2.append(e);
                AFLogger.afRDLog(sb2.toString());
                return m3869(70, 7, 1930).intern();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0125, code lost:
            if (r6.contains(m3869(212, 3, 38062).intern()) != false) goto L_0x0127;
         */
        /* renamed from: ǃ */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.String m3867() {
            /*
                r12 = this;
                java.lang.String r0 = ""
                r1 = 16
                r2 = 44
                r3 = 102(0x66, float:1.43E-43)
                r4 = 5
                r5 = 0
                java.util.Map<java.lang.String, java.lang.Object> r6 = r12.f4176     // Catch:{ Exception -> 0x0076 }
                r7 = 12
                java.lang.String r7 = m3869(r5, r7, r5)     // Catch:{ Exception -> 0x0076 }
                java.lang.String r7 = r7.intern()     // Catch:{ Exception -> 0x0076 }
                java.lang.Object r6 = r6.get(r7)     // Catch:{ Exception -> 0x0076 }
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0076 }
                java.util.Map<java.lang.String, java.lang.Object> r7 = r12.f4176     // Catch:{ Exception -> 0x0076 }
                r8 = 77
                r9 = 15
                java.lang.String r8 = m3869(r8, r9, r5)     // Catch:{ Exception -> 0x0076 }
                java.lang.String r8 = r8.intern()     // Catch:{ Exception -> 0x0076 }
                java.lang.Object r7 = r7.get(r8)     // Catch:{ Exception -> 0x0076 }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0076 }
                r8 = 92
                java.lang.String r8 = m3869(r8, r4, r5)     // Catch:{ Exception -> 0x0076 }
                java.lang.String r8 = r8.intern()     // Catch:{ Exception -> 0x0076 }
                r9 = 97
                java.lang.String r9 = m3869(r9, r4, r5)     // Catch:{ Exception -> 0x0076 }
                java.lang.String r9 = r9.intern()     // Catch:{ Exception -> 0x0076 }
                java.lang.String r8 = r8.replaceAll(r9, r0)     // Catch:{ Exception -> 0x0076 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0076 }
                r9.<init>()     // Catch:{ Exception -> 0x0076 }
                r9.append(r6)     // Catch:{ Exception -> 0x0076 }
                r9.append(r7)     // Catch:{ Exception -> 0x0076 }
                r9.append(r8)     // Catch:{ Exception -> 0x0076 }
                java.lang.String r6 = r9.toString()     // Catch:{ Exception -> 0x0076 }
                java.lang.String r6 = com.appsflyer.HashUtils.toSha256(r6)     // Catch:{ Exception -> 0x0076 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0076 }
                r7.<init>()     // Catch:{ Exception -> 0x0076 }
                r7.append(r0)     // Catch:{ Exception -> 0x0076 }
                java.lang.String r6 = r6.substring(r5, r1)     // Catch:{ Exception -> 0x0076 }
                r7.append(r6)     // Catch:{ Exception -> 0x0076 }
                java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x0076 }
                goto L_0x00ac
            L_0x0076:
                r6 = move-exception
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = m3869(r3, r2, r5)
                java.lang.String r8 = r8.intern()
                r7.append(r8)
                r7.append(r6)
                java.lang.String r6 = r7.toString()
                com.appsflyer.AFLogger.afRDLog(r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r0)
                r0 = 146(0x92, float:2.05E-43)
                r7 = 18
                java.lang.String r0 = m3869(r0, r7, r5)
                java.lang.String r0 = r0.intern()
                r6.append(r0)
                java.lang.String r0 = r6.toString()
            L_0x00ac:
                android.content.Context r6 = r12.f4175     // Catch:{ Exception -> 0x01c0 }
                r7 = 0
                android.content.IntentFilter r8 = new android.content.IntentFilter     // Catch:{ Exception -> 0x01c0 }
                r9 = 164(0xa4, float:2.3E-43)
                r10 = 37
                java.lang.String r9 = m3869(r9, r10, r5)     // Catch:{ Exception -> 0x01c0 }
                java.lang.String r9 = r9.intern()     // Catch:{ Exception -> 0x01c0 }
                r8.<init>(r9)     // Catch:{ Exception -> 0x01c0 }
                android.content.Intent r6 = r6.registerReceiver(r7, r8)     // Catch:{ Exception -> 0x01c0 }
                r7 = 25
                if (r6 == 0) goto L_0x00cb
                r8 = 25
                goto L_0x00cd
            L_0x00cb:
                r8 = 86
            L_0x00cd:
                r9 = -2700(0xfffffffffffff574, float:NaN)
                if (r8 == r7) goto L_0x00d2
                goto L_0x00e2
            L_0x00d2:
                r7 = 201(0xc9, float:2.82E-43)
                r8 = 11
                java.lang.String r7 = m3869(r7, r8, r5)     // Catch:{ Exception -> 0x01c0 }
                java.lang.String r7 = r7.intern()     // Catch:{ Exception -> 0x01c0 }
                int r9 = r6.getIntExtra(r7, r9)     // Catch:{ Exception -> 0x01c0 }
            L_0x00e2:
                android.content.Context r6 = r12.f4175     // Catch:{ Exception -> 0x01c0 }
                android.content.pm.ApplicationInfo r6 = r6.getApplicationInfo()     // Catch:{ Exception -> 0x01c0 }
                java.lang.String r6 = r6.nativeLibraryDir     // Catch:{ Exception -> 0x01c0 }
                r7 = 1
                r8 = 2
                if (r6 == 0) goto L_0x0135
                int r10 = f4174
                int r10 = r10 + 65
                int r11 = r10 % 128
                f4171 = r11
                int r10 = r10 % r8
                r11 = 38062(0x94ae, float:5.3336E-41)
                if (r10 == 0) goto L_0x0116
                r10 = 13371(0x343b, float:1.8737E-41)
                java.lang.String r4 = m3869(r10, r4, r11)     // Catch:{ Exception -> 0x01c0 }
                java.lang.String r4 = r4.intern()     // Catch:{ Exception -> 0x01c0 }
                boolean r4 = r6.contains(r4)     // Catch:{ Exception -> 0x01c0 }
                r6 = 40
                if (r4 == 0) goto L_0x0111
                r4 = 42
                goto L_0x0113
            L_0x0111:
                r4 = 40
            L_0x0113:
                if (r4 == r6) goto L_0x0135
                goto L_0x0127
            L_0x0116:
                r4 = 212(0xd4, float:2.97E-43)
                r10 = 3
                java.lang.String r4 = m3869(r4, r10, r11)     // Catch:{ Exception -> 0x01c0 }
                java.lang.String r4 = r4.intern()     // Catch:{ Exception -> 0x01c0 }
                boolean r4 = r6.contains(r4)     // Catch:{ Exception -> 0x01c0 }
                if (r4 == 0) goto L_0x0135
            L_0x0127:
                int r4 = f4171
                int r4 = r4 + 71
                int r6 = r4 % 128
                f4174 = r6
                int r4 = r4 % r8
                if (r4 != 0) goto L_0x0133
                goto L_0x0135
            L_0x0133:
                r4 = 1
                goto L_0x0136
            L_0x0135:
                r4 = 0
            L_0x0136:
                android.content.Context r6 = r12.f4175     // Catch:{ Exception -> 0x01c0 }
                r10 = 215(0xd7, float:3.01E-43)
                r11 = 6
                java.lang.String r10 = m3869(r10, r11, r5)     // Catch:{ Exception -> 0x01c0 }
                java.lang.String r10 = r10.intern()     // Catch:{ Exception -> 0x01c0 }
                java.lang.Object r6 = r6.getSystemService(r10)     // Catch:{ Exception -> 0x01c0 }
                android.hardware.SensorManager r6 = (android.hardware.SensorManager) r6     // Catch:{ Exception -> 0x01c0 }
                r10 = -1
                java.util.List r6 = r6.getSensorList(r10)     // Catch:{ Exception -> 0x01c0 }
                int r6 = r6.size()     // Catch:{ Exception -> 0x01c0 }
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c0 }
                r10.<init>()     // Catch:{ Exception -> 0x01c0 }
                r11 = 221(0xdd, float:3.1E-43)
                java.lang.String r7 = m3869(r11, r7, r5)     // Catch:{ Exception -> 0x01c0 }
                java.lang.String r7 = r7.intern()     // Catch:{ Exception -> 0x01c0 }
                r10.append(r7)     // Catch:{ Exception -> 0x01c0 }
                r10.append(r9)     // Catch:{ Exception -> 0x01c0 }
                r7 = 222(0xde, float:3.11E-43)
                java.lang.String r7 = m3869(r7, r8, r5)     // Catch:{ Exception -> 0x01c0 }
                java.lang.String r7 = r7.intern()     // Catch:{ Exception -> 0x01c0 }
                r10.append(r7)     // Catch:{ Exception -> 0x01c0 }
                r10.append(r4)     // Catch:{ Exception -> 0x01c0 }
                r4 = 224(0xe0, float:3.14E-43)
                r7 = 36193(0x8d61, float:5.0717E-41)
                java.lang.String r4 = m3869(r4, r8, r7)     // Catch:{ Exception -> 0x01c0 }
                java.lang.String r4 = r4.intern()     // Catch:{ Exception -> 0x01c0 }
                r10.append(r4)     // Catch:{ Exception -> 0x01c0 }
                r10.append(r6)     // Catch:{ Exception -> 0x01c0 }
                r4 = 226(0xe2, float:3.17E-43)
                java.lang.String r4 = m3869(r4, r8, r5)     // Catch:{ Exception -> 0x01c0 }
                java.lang.String r4 = r4.intern()     // Catch:{ Exception -> 0x01c0 }
                r10.append(r4)     // Catch:{ Exception -> 0x01c0 }
                java.util.Map<java.lang.String, java.lang.Object> r4 = r12.f4176     // Catch:{ Exception -> 0x01c0 }
                int r4 = r4.size()     // Catch:{ Exception -> 0x01c0 }
                r10.append(r4)     // Catch:{ Exception -> 0x01c0 }
                java.lang.String r4 = r10.toString()     // Catch:{ Exception -> 0x01c0 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c0 }
                r6.<init>()     // Catch:{ Exception -> 0x01c0 }
                r6.append(r0)     // Catch:{ Exception -> 0x01c0 }
                byte[] r4 = com.appsflyer.internal.C1750d.C1751c.C1752d.m3876(r4)     // Catch:{ Exception -> 0x01c0 }
                byte[] r4 = com.appsflyer.internal.C1750d.C1751c.C1752d.m3873((byte[]) r4)     // Catch:{ Exception -> 0x01c0 }
                java.lang.String r4 = com.appsflyer.internal.C1750d.C1751c.C1752d.m3874(r4)     // Catch:{ Exception -> 0x01c0 }
                r6.append(r4)     // Catch:{ Exception -> 0x01c0 }
                java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x01c0 }
                goto L_0x01f4
            L_0x01c0:
                r4 = move-exception
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = m3869(r3, r2, r5)
                java.lang.String r2 = r2.intern()
                r6.append(r2)
                r6.append(r4)
                java.lang.String r2 = r6.toString()
                com.appsflyer.AFLogger.afRDLog(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                r0 = 228(0xe4, float:3.2E-43)
                java.lang.String r0 = m3869(r0, r1, r5)
                java.lang.String r0 = r0.intern()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
            L_0x01f4:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C1750d.C1751c.m3867():java.lang.String");
        }

        /* renamed from: com.appsflyer.internal.d$c$d */
        public static class C1752d {

            /* renamed from: ɩ */
            private long f4177;

            /* renamed from: Ι */
            private final Object f4178;

            /* renamed from: ι */
            public String f4179;

            C1752d() {
            }

            /* renamed from: ι */
            static byte[] m3876(String str) throws Exception {
                return str.getBytes();
            }

            /* renamed from: ı */
            static byte[] m3873(byte[] bArr) throws Exception {
                for (int i = 0; i < bArr.length; i++) {
                    bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
                }
                return bArr;
            }

            /* renamed from: ɩ */
            static String m3874(byte[] bArr) throws Exception {
                StringBuilder sb = new StringBuilder();
                for (byte hexString : bArr) {
                    String hexString2 = Integer.toHexString(hexString);
                    if (hexString2.length() == 1) {
                        hexString2 = AppEventsConstants.EVENT_PARAM_VALUE_NO.concat(String.valueOf(hexString2));
                    }
                    sb.append(hexString2);
                }
                return sb.toString();
            }

            public C1752d(long j, String str) {
                this.f4178 = new Object();
                this.f4177 = 0;
                this.f4179 = "";
                this.f4177 = j;
                this.f4179 = str;
            }

            /* renamed from: ı */
            public static C1752d m3871(String str) {
                if (str == null) {
                    return new C1752d(0, "");
                }
                String[] split = str.split(",");
                return split.length < 2 ? new C1752d(0, "") : new C1752d(Long.parseLong(split[0]), split[1]);
            }

            /* renamed from: Ι */
            public final boolean mo14077(C1752d dVar) {
                return m3875(dVar.f4177, dVar.f4179);
            }

            /* renamed from: ι */
            private boolean m3875(long j, String str) {
                synchronized (this.f4178) {
                    if (str != null) {
                        if (!str.equals(this.f4179) && m3872(j)) {
                            this.f4177 = j;
                            this.f4179 = str;
                            return true;
                        }
                    }
                    return false;
                }
            }

            /* renamed from: ı */
            private boolean m3872(long j) {
                return j - this.f4177 > 2000;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f4177);
                sb.append(",");
                sb.append(this.f4179);
                return sb.toString();
            }
        }

        /* renamed from: ι */
        private static String m3869(int i, int i2, char c) {
            char[] cArr;
            int i3 = f4171 + 71;
            f4174 = i3 % 128;
            int i4 = 0;
            if (!(i3 % 2 != 0)) {
                cArr = new char[i2];
                i4 = 1;
            } else {
                cArr = new char[i2];
            }
            while (true) {
                if ((i4 < i2 ? (char) 17 : 6) == 6) {
                    return new String(cArr);
                }
                cArr[i4] = (char) ((int) ((((long) f4173[i + i4]) ^ (((long) i4) * f4172)) ^ ((long) c)));
                i4++;
                int i5 = f4174 + 35;
                f4171 = i5 % 128;
                int i6 = i5 % 2;
            }
        }
    }

    /* renamed from: Ι */
    private static String m3863(int i, int i2, char c) {
        char[] cArr = new char[i2];
        int i3 = 0;
        int i4 = f4169 + 53;
        f4167 = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            if ((i3 < i2 ? Typography.dollar : 'a') != '$') {
                String str = new String(cArr);
                int i6 = f4169 + 25;
                f4167 = i6 % 128;
                int i7 = i6 % 2;
                return str;
            }
            cArr[i3] = (char) ((int) ((((long) f4170[i + i3]) ^ (((long) i3) * f4168)) ^ ((long) c)));
            i3++;
        }
    }
}
