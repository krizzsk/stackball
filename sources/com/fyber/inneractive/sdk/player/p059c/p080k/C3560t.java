package com.fyber.inneractive.sdk.player.p059c.p080k;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3506g;
import com.mbridge.msdk.playercommon.exoplayer2.C6603C;
import com.p243my.target.common.models.VideoData;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.c.k.t */
public final class C3560t {

    /* renamed from: a */
    public static final int f9655a = ((Build.VERSION.SDK_INT == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') ? 26 : Build.VERSION.SDK_INT);

    /* renamed from: b */
    public static final String f9656b = Build.DEVICE;

    /* renamed from: c */
    public static final String f9657c = Build.MANUFACTURER;

    /* renamed from: d */
    public static final String f9658d = Build.MODEL;

    /* renamed from: e */
    public static final String f9659e = (f9656b + ", " + f9658d + ", " + f9657c + ", " + f9655a);

    /* renamed from: f */
    private static final Pattern f9660f = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* renamed from: g */
    private static final Pattern f9661g = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    /* renamed from: h */
    private static final Pattern f9662h = Pattern.compile("%([A-Fa-f0-9]{2})");

    /* renamed from: i */
    private static final int[] f9663i = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    /* renamed from: a */
    public static int m8870a(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public static boolean m8884a(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || scheme.equals("file");
    }

    /* renamed from: a */
    public static boolean m8885a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static ExecutorService m8879a(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, str);
            }
        });
    }

    /* renamed from: a */
    public static void m8880a(C3506g gVar) {
        if (gVar != null) {
            try {
                gVar.mo18705b();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m8881a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static String m8890b(String str) {
        if (str == null) {
            return null;
        }
        return new Locale(str).getLanguage();
    }

    /* renamed from: c */
    public static byte[] m8891c(String str) {
        return str.getBytes(Charset.defaultCharset());
    }

    /* renamed from: d */
    public static String m8892d(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.US);
    }

    /* renamed from: a */
    public static int m8871a(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: a */
    public static int m8872a(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* renamed from: a */
    public static long m8876a(long j, long j2) {
        return Math.max(0, Math.min(j, j2));
    }

    /* renamed from: a */
    public static float m8869a(float f) {
        return Math.max(0.1f, Math.min(f, 8.0f));
    }

    /* renamed from: a */
    public static int m8874a(long[] jArr, long j, boolean z) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0 || jArr[binarySearch] != j) {
                    i = binarySearch + 1;
                }
                binarySearch--;
                break;
            } while (jArr[binarySearch] != j);
            i = binarySearch + 1;
        }
        return z ? Math.max(0, i) : i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m8875a(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x0008
            int r5 = ~r0
            goto L_0x0019
        L_0x0008:
            int r0 = r0 + 1
            int r1 = r4.length
            if (r0 >= r1) goto L_0x0013
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0008
        L_0x0013:
            if (r7 == 0) goto L_0x0018
            int r5 = r0 + -1
            goto L_0x0019
        L_0x0018:
            r5 = r0
        L_0x0019:
            if (r8 == 0) goto L_0x0023
            int r4 = r4.length
            int r4 = r4 + -1
            int r4 = java.lang.Math.min(r4, r5)
            return r4
        L_0x0023:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8875a(long[], long, boolean, boolean):int");
    }

    /* renamed from: a */
    public static long m8877a(long j, long j2, long j3) {
        int i = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        if (i >= 0 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (i < 0 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        return (long) (((double) j) * (((double) j2) / ((double) j3)));
    }

    /* renamed from: a */
    public static void m8883a(long[] jArr, long j) {
        int i = 0;
        int i2 = (j > 1000000 ? 1 : (j == 1000000 ? 0 : -1));
        if (i2 >= 0 && j % 1000000 == 0) {
            long j2 = j / 1000000;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j2;
                i++;
            }
        } else if (i2 >= 0 || 1000000 % j != 0) {
            double d = 1000000.0d / ((double) j);
            while (i < jArr.length) {
                jArr[i] = (long) (((double) jArr[i]) * d);
                i++;
            }
        } else {
            long j3 = 1000000 / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j3;
                i++;
            }
        }
    }

    /* renamed from: a */
    public static int[] m8886a(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = list.get(i).intValue();
        }
        return iArr;
    }

    /* renamed from: e */
    public static int m8893e(String str) {
        int length = str.length();
        C3535a.m8782a(length <= 4);
        char c = 0;
        for (int i = 0; i < length; i++) {
            c = (c << 8) | str.charAt(i);
        }
        return c;
    }

    /* renamed from: f */
    public static byte[] m8894f(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    /* renamed from: a */
    public static String m8878a(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static int m8888b(int i, int i2) {
        if (i == Integer.MIN_VALUE) {
            return i2 * 3;
        }
        if (i == 1073741824) {
            return i2 * 4;
        }
        if (i == 2) {
            return i2 * 2;
        }
        if (i == 3) {
            return i2;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public static int m8889b(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return 3;
        }
        return m8895g(path);
    }

    /* renamed from: g */
    public static int m8895g(String str) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.endsWith(".mpd")) {
            return 0;
        }
        if (lowerCase.endsWith(VideoData.M3U8)) {
            return 2;
        }
        return (lowerCase.endsWith(".ism") || lowerCase.endsWith(".isml") || lowerCase.endsWith(".ism/manifest") || lowerCase.endsWith(".isml/manifest")) ? 1 : 3;
    }

    /* renamed from: b */
    public static int m8887b(int i) {
        if (i == 0) {
            return 16777216;
        }
        if (i == 1) {
            return C6603C.DEFAULT_AUDIO_BUFFER_SIZE;
        }
        if (i == 2) {
            return 13107200;
        }
        if (i == 3 || i == 4) {
            return 131072;
        }
        throw new IllegalStateException();
    }

    /* renamed from: h */
    public static String m8896h(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) == '%') {
                i2++;
            }
        }
        if (i2 == 0) {
            return str;
        }
        int i4 = length - (i2 * 2);
        StringBuilder sb = new StringBuilder(i4);
        Matcher matcher = f9662h.matcher(str);
        while (i2 > 0 && matcher.find()) {
            sb.append(str, i, matcher.start());
            sb.append((char) Integer.parseInt(matcher.group(1), 16));
            i = matcher.end();
            i2--;
        }
        if (i < length) {
            sb.append(str, i, length);
        }
        if (sb.length() != i4) {
            return null;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static int m8873a(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            i2 = f9663i[((i2 >>> 24) ^ (bArr[i3] & 255)) & 255] ^ (i2 << 8);
        }
        return i2;
    }

    /* renamed from: a */
    public static void m8882a(Throwable th) {
        throw th;
    }
}
