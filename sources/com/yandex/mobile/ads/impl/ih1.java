package com.yandex.mobile.ads.impl;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.exoplayer2.C3716C;
import com.google.android.exoplayer2.extractor.p086ts.TsExtractor;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.smaato.sdk.video.vast.model.ErrorCode;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class ih1 {

    /* renamed from: a */
    public static final int f34858a;

    /* renamed from: b */
    public static final String f34859b;

    /* renamed from: c */
    public static final String f34860c;

    /* renamed from: d */
    public static final String f34861d;

    /* renamed from: e */
    public static final String f34862e;

    /* renamed from: f */
    public static final byte[] f34863f = new byte[0];

    /* renamed from: g */
    private static final Pattern f34864g = Pattern.compile("%([A-Fa-f0-9]{2})");

    /* renamed from: h */
    private static HashMap<String, String> f34865h;

    /* renamed from: i */
    private static final String[] f34866i = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", AdWebViewClient.GEO, "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};

    /* renamed from: j */
    private static final String[] f34867j = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};

    /* renamed from: k */
    private static final int[] f34868k = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    /* renamed from: l */
    private static final int[] f34869l = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, ErrorCode.DIFFERENT_DURATION_EXPECTED_ERROR, ErrorCode.INLINE_CATEGORY_VIOLATES_BLOCKED_CATEGORIES_ERROR, 144, 151, 158, 153, IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 171, TsExtractor.TS_STREAM_TYPE_AC4, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, TsExtractor.TS_PACKET_SIZE, 187, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, ErrorCode.DIFFERENT_SIZE_EXPECTED_ERROR, 230, 225, 232, 239, 250, 253, 244, 243};

    static {
        int i = Build.VERSION.SDK_INT;
        f34858a = i;
        String str = Build.DEVICE;
        f34859b = str;
        String str2 = Build.MANUFACTURER;
        f34860c = str2;
        String str3 = Build.MODEL;
        f34861d = str3;
        f34862e = str + ", " + str3 + ", " + str2 + ", " + i;
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    }

    /* renamed from: a */
    public static int m37365a(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i == 24) {
            return 536870912;
        }
        if (i != 32) {
            return 0;
        }
        return C3716C.ENCODING_PCM_32BIT;
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: a */
    public static <T> T m37372a(T t) {
        return t;
    }

    /* renamed from: a */
    public static boolean m37382a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: b */
    public static int m37385b(int i) {
        if (i == 13) {
            return 1;
        }
        switch (i) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* renamed from: b */
    public static byte[] m37390b(String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: c */
    public static ExecutorService m37393c(String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Thread newThread(Runnable runnable) {
                return ih1.m37377a(this.f$0, runnable);
            }
        });
    }

    /* renamed from: c */
    public static boolean m37394c(int i) {
        return i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: d */
    public static String m37395d(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !"und".equals(replace)) {
            str = replace;
        }
        String e = m37399e(str);
        int i = 0;
        String str2 = e.split("-", 2)[0];
        if (f34865h == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f34866i.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            int i2 = 0;
            while (true) {
                String[] strArr = f34866i;
                if (i2 >= strArr.length) {
                    break;
                }
                hashMap.put(strArr[i2], strArr[i2 + 1]);
                i2 += 2;
            }
            f34865h = hashMap;
        }
        String str4 = f34865h.get(str2);
        if (str4 != null) {
            e = str4 + e.substring(str2.length());
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return e;
        }
        while (true) {
            String[] strArr2 = f34867j;
            if (i >= strArr2.length) {
                return e;
            }
            if (e.startsWith(strArr2[i])) {
                return strArr2[i + 1] + e.substring(strArr2[i].length());
            }
            i += 2;
        }
    }

    /* renamed from: d */
    public static boolean m37396d(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: e */
    public static long m37398e(int i) {
        return ((long) i) & 4294967295L;
    }

    /* renamed from: e */
    public static String m37399e(String str) {
        return str == null ? str : str.toLowerCase(Locale.US);
    }

    /* renamed from: f */
    public static String m37400f(String str) {
        return str == null ? str : str.toUpperCase(Locale.US);
    }

    /* renamed from: g */
    public static String m37401g(String str) {
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
        Matcher matcher = f34864g.matcher(str);
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
    public static <T> T[] m37383a(T[] tArr, int i) {
        C13479j9.m37705a(i <= tArr.length);
        return Arrays.copyOf(tArr, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m37388b(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r4 = -r0
            goto L_0x001b
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0015
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0015
            goto L_0x000a
        L_0x0015:
            if (r7 == 0) goto L_0x001a
            int r4 = r0 + 1
            goto L_0x001b
        L_0x001a:
            r4 = r0
        L_0x001b:
            if (r8 == 0) goto L_0x0022
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
        L_0x0022:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ih1.m37388b(long[], long, boolean, boolean):int");
    }

    /* renamed from: c */
    public static int m37392c(Context context) {
        ConnectivityManager connectivityManager;
        int i = 0;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type == 9) {
                        return 7;
                    }
                    if (!(type == 4 || type == 5)) {
                        return type != 6 ? 8 : 5;
                    }
                }
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                        return 3;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 4;
                    case 13:
                        return 5;
                    case 18:
                        return 2;
                    case 20:
                        return 9;
                    default:
                        return 6;
                }
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    /* renamed from: a */
    public static <T> T[] m37384a(T[] tArr, int i, int i2) {
        boolean z = true;
        C13479j9.m37705a(i >= 0);
        if (i2 > tArr.length) {
            z = false;
        }
        C13479j9.m37705a(z);
        return Arrays.copyOfRange(tArr, i, i2);
    }

    /* renamed from: a */
    public static Handler m37370a(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* renamed from: a */
    public static Looper m37371a() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Thread m37377a(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    /* renamed from: a */
    public static void m37378a(C13325hj hjVar) {
        if (hjVar != null) {
            try {
                hjVar.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m37379a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static int m37386b(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                if (i != 268435456) {
                    if (i == 536870912) {
                        return i2 * 3;
                    }
                    if (i != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i2 * 4;
        }
        return i2 * 2;
    }

    /* renamed from: a */
    public static boolean m37381a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: b */
    public static int m37387b(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f34869l[i3 ^ (bArr[i] & 255)];
            i++;
        }
        return i3;
    }

    /* renamed from: a */
    public static String m37375a(byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    /* renamed from: b */
    public static Point m37389b(Context context) {
        String str;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int i = f34858a;
        if (i <= 29 && defaultDisplay.getDisplayId() == 0 && m37397d(context)) {
            byte[] decode = Base64.decode("U29ueQ==", 0);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(\"U29ueQ==\",\n      Base64.DEFAULT)");
            if (new String(decode, Charsets.UTF_8).equals(f34860c)) {
                String str2 = f34861d;
                byte[] decode2 = Base64.decode("QlJBVklB", 0);
                Intrinsics.checkNotNullExpressionValue(decode2, "decode(\"QlJBVklB\", Base64.DEFAULT)");
                if (str2.startsWith(new String(decode2, Charsets.UTF_8)) && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                    return new Point(3840, 2160);
                }
            }
            if (i < 28) {
                str = m37374a("sys.display-size");
            } else {
                str = m37374a("vendor.display-size");
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] split = str.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                Log.e("Util", "Invalid display size: " + str);
            }
        }
        Point point = new Point();
        int i2 = f34858a;
        if (i2 >= 23) {
            Display.Mode mode = defaultDisplay.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            return point;
        } else if (i2 >= 17) {
            defaultDisplay.getRealSize(point);
            return point;
        } else {
            defaultDisplay.getSize(point);
            return point;
        }
    }

    /* renamed from: a */
    public static String m37376a(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, Charset.forName("UTF-8"));
    }

    /* renamed from: a */
    public static int m37366a(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: a */
    public static float m37364a(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m37368a(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x0008
            int r5 = ~r0
            goto L_0x001a
        L_0x0008:
            int r0 = r0 + 1
            int r1 = r4.length
            if (r0 >= r1) goto L_0x0014
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0014
            goto L_0x0008
        L_0x0014:
            if (r7 == 0) goto L_0x0019
            int r5 = r0 + -1
            goto L_0x001a
        L_0x0019:
            r5 = r0
        L_0x001a:
            if (r8 == 0) goto L_0x0023
            int r4 = r4.length
            int r4 = r4 + -1
            int r5 = java.lang.Math.min(r4, r5)
        L_0x0023:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ih1.m37368a(long[], long, boolean, boolean):int");
    }

    /* renamed from: a */
    public static long m37369a(long j, long j2, long j3) {
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
    public static void m37380a(long[] jArr, long j, long j2) {
        int i = 0;
        int i2 = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        if (i2 >= 0 && j2 % j == 0) {
            long j3 = j2 / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j3;
                i++;
            }
        } else if (i2 >= 0 || j % j2 != 0) {
            double d = ((double) j) / ((double) j2);
            while (i < jArr.length) {
                jArr[i] = (long) (((double) jArr[i]) * d);
                i++;
            }
        } else {
            long j4 = j / j2;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j4;
                i++;
            }
        }
    }

    /* renamed from: d */
    public static boolean m37397d(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: a */
    public static int m37367a(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f34868k[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    /* renamed from: a */
    public static String m37373a(Context context) {
        TelephonyManager telephonyManager;
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null)) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return m37400f(networkCountryIso);
            }
        }
        return m37400f(Locale.getDefault().getCountry());
    }

    /* renamed from: b */
    public static String[] m37391b() {
        String[] strArr;
        String str;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i = f34858a;
        if (i >= 24) {
            strArr = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            String[] strArr2 = new String[1];
            Locale locale = configuration.locale;
            if (i >= 21) {
                str = locale.toLanguageTag();
            } else {
                str = locale.toString();
            }
            strArr2[0] = str;
            strArr = strArr2;
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr[i2] = m37395d(strArr[i2]);
        }
        return strArr;
    }

    /* renamed from: a */
    private static String m37374a(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e) {
            bk0.m34269a("Util", "Failed to read system property " + str, e);
            return null;
        }
    }
}
