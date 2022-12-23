package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.C6195e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6151i;
import com.mbridge.msdk.foundation.p164db.C6152j;
import com.mbridge.msdk.foundation.tools.C6338i;
import com.mbridge.msdk.p158b.C6072a;
import com.mbridge.msdk.p158b.C6076b;
import com.tapjoy.TapjoyConstants;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.mbridge.msdk.foundation.tools.u */
/* compiled from: SameTool */
public final class C6366u extends C6336g {

    /* renamed from: a */
    private static char[] f15791a = {'A', 'p', 'p', 'l', 'i', 'c', 'a', 't', 'i', 'o', 'n', 'I', 'n', 'f', 'o'};

    /* renamed from: b */
    private static char[] f15792b = {'.', 'X'};

    /* renamed from: c */
    private static int f15793c = 0;

    /* renamed from: d */
    private static int f15794d = 1;

    /* renamed from: e */
    private static int f15795e = 2;

    /* renamed from: f */
    private static int f15796f = 3;

    /* renamed from: g */
    private static int f15797g = 0;

    /* renamed from: h */
    private static int f15798h = 7;

    /* renamed from: i */
    private static int f15799i = 14;

    /* renamed from: j */
    private static int f15800j = 19;

    /* renamed from: k */
    private static int f15801k = 16;

    /* renamed from: l */
    private static int f15802l = 26;

    /* renamed from: m */
    private static String f15803m = "[一-龥]";

    /* renamed from: n */
    private static Pattern f15804n = Pattern.compile("[一-龥]");

    /* renamed from: o */
    private static int f15805o = 1;

    /* renamed from: p */
    private static boolean f15806p = true;

    /* renamed from: q */
    private static Map<String, String> f15807q;

    /* renamed from: r */
    private static Map<String, String> f15808r;

    /* renamed from: s */
    private static volatile Boolean f15809s = null;

    /* renamed from: a */
    public static <T extends String> boolean m16200a(T t) {
        return t == null || t.length() == 0;
    }

    /* renamed from: b */
    public static boolean m16208b(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !TapjoyConstants.TJC_CONNECTION_TYPE_WIFI.equals(activeNetworkInfo.getTypeName().toLowerCase(Locale.US))) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m16213c(Context context) {
        try {
            if (((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m16199a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            return !TextUtils.isEmpty(campaignEx.getDeepLinkURL());
        }
        return false;
    }

    /* renamed from: d */
    public static float m16215d(Context context) {
        if (context == null) {
            return 2.5f;
        }
        try {
            float f = context.getResources().getDisplayMetrics().density;
            if (f == 0.0f) {
                return 2.5f;
            }
            return f;
        } catch (Exception e) {
            e.printStackTrace();
            return 2.5f;
        }
    }

    /* renamed from: a */
    public static int m16186a(Context context, float f) {
        float f2 = 2.5f;
        if (context != null) {
            try {
                float f3 = context.getResources().getDisplayMetrics().density;
                if (f3 != 0.0f) {
                    f2 = f3;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (int) ((f / f2) + 0.5f);
    }

    /* renamed from: b */
    public static int m16203b(Context context, float f) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        if (r2 != null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002a, code lost:
        if (r2 != null) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0026 A[SYNTHETIC, Splitter:B:19:0x0026] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m16188a(java.io.File r4) throws java.lang.Exception {
        /*
            r0 = 0
            r2 = 0
            boolean r3 = r4.exists()     // Catch:{ Exception -> 0x002a, all -> 0x0023 }
            if (r3 == 0) goto L_0x001a
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x002a, all -> 0x0023 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x002a, all -> 0x0023 }
            int r4 = r3.available()     // Catch:{ Exception -> 0x0018, all -> 0x0015 }
            long r0 = (long) r4
            r2 = r3
            goto L_0x001d
        L_0x0015:
            r4 = move-exception
            r2 = r3
            goto L_0x0024
        L_0x0018:
            r2 = r3
            goto L_0x002a
        L_0x001a:
            r4.createNewFile()     // Catch:{ Exception -> 0x002a, all -> 0x0023 }
        L_0x001d:
            if (r2 == 0) goto L_0x002d
        L_0x001f:
            r2.close()     // Catch:{ Exception -> 0x002d }
            goto L_0x002d
        L_0x0023:
            r4 = move-exception
        L_0x0024:
            if (r2 == 0) goto L_0x0029
            r2.close()     // Catch:{ Exception -> 0x0029 }
        L_0x0029:
            throw r4
        L_0x002a:
            if (r2 == 0) goto L_0x002d
            goto L_0x001f
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C6366u.m16188a(java.io.File):long");
    }

    /* renamed from: e */
    public static int m16218e(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: f */
    public static float m16220f(Context context) {
        return (float) context.getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: a */
    public static int m16185a() {
        int i = f15805o;
        f15805o = i + 1;
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c A[Catch:{ Exception -> 0x005f }, LOOP:0: B:17:0x004a->B:18:0x004c, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m16189a(int r6) {
        /*
            java.lang.String r0 = ""
            com.mbridge.msdk.b.b r1 = com.mbridge.msdk.p158b.C6076b.m15089a()     // Catch:{ Exception -> 0x005f }
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ Exception -> 0x005f }
            java.lang.String r2 = r2.mo42896e()     // Catch:{ Exception -> 0x005f }
            com.mbridge.msdk.b.a r1 = r1.mo42749b(r2)     // Catch:{ Exception -> 0x005f }
            if (r1 != 0) goto L_0x001c
            com.mbridge.msdk.b.b r1 = com.mbridge.msdk.p158b.C6076b.m15089a()     // Catch:{ Exception -> 0x005f }
            com.mbridge.msdk.b.a r1 = r1.mo42748b()     // Catch:{ Exception -> 0x005f }
        L_0x001c:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x005f }
            r2.<init>()     // Catch:{ Exception -> 0x005f }
            if (r1 == 0) goto L_0x0054
            int r1 = r1.mo42734w()     // Catch:{ Exception -> 0x005f }
            r3 = 1
            if (r1 != r3) goto L_0x0054
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ Exception -> 0x005f }
            android.content.Context r1 = r1.mo42895d()     // Catch:{ Exception -> 0x005f }
            com.mbridge.msdk.foundation.db.f r1 = com.mbridge.msdk.foundation.p164db.C6148f.m15420a((android.content.Context) r1)     // Catch:{ Exception -> 0x005f }
            com.mbridge.msdk.foundation.db.j r1 = com.mbridge.msdk.foundation.p164db.C6152j.m15441a((com.mbridge.msdk.foundation.p164db.C6146e) r1)     // Catch:{ Exception -> 0x005f }
            long[] r1 = r1.mo43014a()     // Catch:{ Exception -> 0x005f }
            if (r1 == 0) goto L_0x0054
            int r3 = r1.length     // Catch:{ Exception -> 0x005f }
            if (r3 <= r6) goto L_0x0049
            if (r6 != 0) goto L_0x0046
            goto L_0x0049
        L_0x0046:
            int r6 = r3 - r6
            goto L_0x004a
        L_0x0049:
            r6 = 0
        L_0x004a:
            if (r6 >= r3) goto L_0x0054
            r4 = r1[r6]     // Catch:{ Exception -> 0x005f }
            r2.put(r4)     // Catch:{ Exception -> 0x005f }
            int r6 = r6 + 1
            goto L_0x004a
        L_0x0054:
            int r6 = r2.length()     // Catch:{ Exception -> 0x005f }
            if (r6 <= 0) goto L_0x0063
            java.lang.String r0 = m16192a((org.json.JSONArray) r2)     // Catch:{ Exception -> 0x005f }
            goto L_0x0063
        L_0x005f:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C6366u.m16189a(int):java.lang.String");
    }

    /* renamed from: a */
    public static String m16192a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return "";
        }
        C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
        if (b == null) {
            b = C6076b.m15089a().mo42748b();
        }
        int o = b.mo42724o();
        if (jSONArray.length() <= o) {
            return jSONArray.toString();
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < o; i++) {
            try {
                jSONArray2.put(jSONArray.get(i));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray2.toString();
    }

    /* renamed from: a */
    public static boolean m16201a(String str, Context context) {
        try {
            if (context.getPackageManager().checkPermission(str, context.getPackageName()) == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m16209b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                return campaignEx.getRetarget_offer() == 1;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: b */
    public static double m16202b(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return Double.parseDouble(str);
            }
            return 0.0d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0d;
        }
    }

    /* renamed from: a */
    public static int m16187a(Object obj) {
        if (obj == null) {
            return 0;
        }
        try {
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
            return 0;
        } catch (Throwable th) {
            C6361q.m16155a("SameTools", th.getMessage(), th);
            return 0;
        }
    }

    /* renamed from: a */
    public static double m16184a(Double d) {
        try {
            String format = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US)).format(d);
            if (C6369x.m16236b(format)) {
                return Double.parseDouble(format);
            }
            return 0.0d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0d;
        }
    }

    /* renamed from: n */
    private static DisplayMetrics m16230n(Context context) {
        if (context == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealMetrics(displayMetrics);
                return displayMetrics;
            }
            defaultDisplay.getMetrics(displayMetrics);
            return displayMetrics;
        } catch (Throwable th) {
            th.printStackTrace();
            return context.getResources().getDisplayMetrics();
        }
    }

    /* renamed from: g */
    public static int m16222g(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return m16230n(context).heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: h */
    public static int m16224h(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return m16230n(context).widthPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: i */
    public static int m16225i(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().widthPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: j */
    public static int m16226j(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static void m16195a(View view) {
        if (view != null) {
            try {
                if (Build.VERSION.SDK_INT >= 11) {
                    view.setSystemUiVisibility(4102);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: k */
    public static int m16227k(Context context) {
        if (context != null) {
            return 0;
        }
        try {
            if (context.getResources().getIdentifier("config_showNavigationBar", "bool", "android") != 0) {
                return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", "android"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /* renamed from: a */
    public static void m16196a(ImageView imageView) {
        if (imageView != null) {
            try {
                imageView.setImageResource(0);
                imageView.setImageDrawable((Drawable) null);
                imageView.setImageURI((Uri) null);
                imageView.setImageBitmap((Bitmap) null);
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    public static List<String> m16206b(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            if (jSONArray.length() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (C6369x.m16236b(optString)) {
                    arrayList.add(optString);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C6361q.m16155a("SameTools", th.getMessage(), th);
            return null;
        }
    }

    /* renamed from: c */
    public static String m16212c(String str) {
        try {
            if (C6369x.m16236b(str)) {
                return URLEncoder.encode(str, "utf-8");
            }
            return "";
        } catch (Throwable th) {
            C6361q.m16155a("SameTools", th.getMessage(), th);
            return "";
        }
    }

    /* renamed from: b */
    public static boolean m16207b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: l */
    public static boolean m16228l(Context context) {
        try {
            return ((PowerManager) context.getSystemService("power")).isScreenOn();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: m */
    public static int m16229m(Context context) {
        PackageInfo packageInfo;
        if (context == null) {
            return 0;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                packageInfo = WebView.getCurrentWebViewPackage();
            } else {
                packageInfo = context.getPackageManager().getPackageInfo("com.google.android.webview", 1);
            }
            C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
            if (b == null) {
                b = C6076b.m15089a().mo42748b();
            }
            if (packageInfo == null || TextUtils.isEmpty(packageInfo.versionName) || !packageInfo.versionName.equals("77.0.3865.92")) {
                return b.mo42688ab();
            }
            return 5;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static JSONArray m16194a(Context context, String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
            if (b == null) {
                b = C6076b.m15089a().mo42748b();
            }
            if (b != null && b.mo42734w() == 1) {
                C6361q.m16156b("SameTools", "fqci cfc:" + b.mo42734w());
                long[] a = C6152j.m15441a((C6146e) C6148f.m15420a(context)).mo43014a();
                if (a != null) {
                    for (long put : a) {
                        C6361q.m16156b("SameTools", "cfc campaignIds:" + a);
                        jSONArray.put(put);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONArray;
    }

    /* renamed from: b */
    public static String m16205b(Context context, String str) {
        String str2 = "";
        try {
            JSONArray a = m16194a(context, str);
            if (a.length() > 0) {
                str2 = m16192a(a);
            }
            C6361q.m16156b("SameTools", "get excludes:" + str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str2;
    }

    /* renamed from: a */
    public static void m16197a(String str, CampaignEx campaignEx, int i) {
        if (!TextUtils.isEmpty(str) && campaignEx != null && C6122a.m15302b().mo42895d() != null) {
            C6151i a = C6151i.m15437a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d()));
            C6195e eVar = new C6195e();
            eVar.mo43622a(System.currentTimeMillis());
            eVar.mo43625b(str);
            eVar.mo43623a(campaignEx.getId());
            eVar.mo43621a(i);
            a.mo43010a(eVar);
        }
    }

    /* renamed from: c */
    public static synchronized boolean m16214c(Context context, String str) {
        boolean z;
        synchronized (C6366u.class) {
            z = false;
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        if (m16204b(str, context) != null) {
                            z = true;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    private static Object m16204b(String str, Context context) {
        try {
            return Class.forName(String.valueOf(m16210b(f15793c))).getMethod(String.valueOf(m16210b(f15795e)), new Class[]{String.class, Integer.TYPE}).invoke(Class.forName(String.valueOf(m16210b(f15794d))).getMethod(String.valueOf(m16210b(f15796f)), new Class[0]).invoke(context, new Object[0]), new Object[]{str, 8192});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static final char[] m16210b(int i) {
        StringBuilder sb;
        if (i == 0) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOf(C6364t.f15790b, f15798h)));
            sb.append(f15792b[f15797g]);
            sb.append(String.valueOf(Arrays.copyOfRange(C6364t.f15790b, f15798h, f15799i)));
            sb.append(f15792b[f15797g]);
            sb.append(String.valueOf(Arrays.copyOfRange(C6364t.f15790b, f15799i, f15801k)));
            sb.append(f15792b[f15797g]);
            sb.append(String.valueOf(C6363s.f15783c));
        } else if (i == 1) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOf(C6364t.f15790b, f15798h)));
            sb.append(f15792b[f15797g]);
            sb.append(String.valueOf(Arrays.copyOfRange(C6364t.f15790b, f15798h, f15799i)));
            sb.append(f15792b[f15797g]);
            sb.append(String.valueOf(Arrays.copyOfRange(C6364t.f15790b, f15800j, f15802l)));
        } else if (i == 2) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOfRange(C6364t.f15790b, f15801k, f15800j)));
            sb.append(String.valueOf(f15791a));
        } else if (i != 3) {
            sb = null;
        } else {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOfRange(C6364t.f15790b, f15801k, f15800j)));
            sb.append(String.valueOf(C6363s.f15783c));
        }
        return sb.toString().toCharArray();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2 = new java.lang.StringBuilder("&rtins_type=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r2.append(0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0025 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0042 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.lang.String m16191a(java.lang.String r2, android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.Class<com.mbridge.msdk.foundation.tools.u> r0 = com.mbridge.msdk.foundation.tools.C6366u.class
            monitor-enter(r0)
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x0025 }
            java.util.Set r2 = r2.getQueryParameterNames()     // Catch:{ Exception -> 0x0025 }
            if (r2 == 0) goto L_0x001b
            int r2 = r2.size()     // Catch:{ Exception -> 0x0025 }
            if (r2 <= 0) goto L_0x001b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0025 }
            java.lang.String r1 = "&rtins_type="
            r2.<init>(r1)     // Catch:{ Exception -> 0x0025 }
            goto L_0x002c
        L_0x001b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0025 }
            java.lang.String r1 = "?rtins_type="
            r2.<init>(r1)     // Catch:{ Exception -> 0x0025 }
            goto L_0x002c
        L_0x0023:
            r2 = move-exception
            goto L_0x004b
        L_0x0025:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = "&rtins_type="
            r2.<init>(r1)     // Catch:{ all -> 0x0023 }
        L_0x002c:
            r1 = 0
            java.lang.Object r3 = m16204b((java.lang.String) r4, (android.content.Context) r3)     // Catch:{ Exception -> 0x0042 }
            r4 = 1
            if (r3 == 0) goto L_0x0036
            r3 = 1
            goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            if (r3 == 0) goto L_0x003d
            r2.append(r4)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0045
        L_0x003d:
            r3 = 2
            r2.append(r3)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0045
        L_0x0042:
            r2.append(r1)     // Catch:{ all -> 0x0023 }
        L_0x0045:
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)
            return r2
        L_0x004b:
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C6366u.m16191a(java.lang.String, android.content.Context, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|4|5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String m16190a(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
        /*
            java.lang.Class<com.mbridge.msdk.foundation.tools.u> r0 = com.mbridge.msdk.foundation.tools.C6366u.class
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0015 }
            r1.<init>(r4)     // Catch:{ all -> 0x0015 }
            java.lang.String r2 = m16191a((java.lang.String) r4, (android.content.Context) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x000f }
            r1.append(r2)     // Catch:{ Exception -> 0x000f }
        L_0x000f:
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x0015 }
            monitor-exit(r0)
            return r2
        L_0x0015:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C6366u.m16190a(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011c, code lost:
        return r2;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized java.lang.String m16217d(java.lang.String r10) {
        /*
            java.lang.Class<com.mbridge.msdk.foundation.tools.u> r0 = com.mbridge.msdk.foundation.tools.C6366u.class
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0127 }
            r1.<init>()     // Catch:{ Exception -> 0x0127 }
            java.lang.String r2 = "app_id_"
            r1.append(r2)     // Catch:{ Exception -> 0x0127 }
            r1.append(r10)     // Catch:{ Exception -> 0x0127 }
            java.lang.String r10 = r1.toString()     // Catch:{ Exception -> 0x0127 }
            com.mbridge.msdk.b.b r1 = com.mbridge.msdk.p158b.C6076b.m15089a()     // Catch:{ Exception -> 0x0127 }
            java.lang.String r2 = "app_id"
            com.mbridge.msdk.b.a r1 = r1.mo42749b(r2)     // Catch:{ Exception -> 0x0127 }
            r2 = 3
            r3 = 0
            if (r1 == 0) goto L_0x0036
            boolean r2 = r1.mo42674S()     // Catch:{ Exception -> 0x0127 }
            boolean r4 = r1.mo42672Q()     // Catch:{ Exception -> 0x0127 }
            int r1 = r1.mo42673R()     // Catch:{ Exception -> 0x0127 }
            int r1 = java.lang.Math.max(r3, r1)     // Catch:{ Exception -> 0x0127 }
            r9 = r2
            r2 = r1
            r1 = r9
            goto L_0x0038
        L_0x0036:
            r1 = 1
            r4 = 0
        L_0x0038:
            if (r4 == 0) goto L_0x0121
            if (r2 != 0) goto L_0x003e
            goto L_0x0121
        L_0x003e:
            if (r1 == 0) goto L_0x0056
            java.util.Map<java.lang.String, java.lang.String> r4 = f15807q     // Catch:{ Exception -> 0x0127 }
            if (r4 == 0) goto L_0x0056
            java.util.Map<java.lang.String, java.lang.String> r4 = f15807q     // Catch:{ Exception -> 0x0127 }
            boolean r4 = r4.containsKey(r10)     // Catch:{ Exception -> 0x0127 }
            if (r4 == 0) goto L_0x0056
            java.util.Map<java.lang.String, java.lang.String> r1 = f15807q     // Catch:{ Exception -> 0x0127 }
            java.lang.Object r10 = r1.get(r10)     // Catch:{ Exception -> 0x0127 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0127 }
            monitor-exit(r0)
            return r10
        L_0x0056:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0127 }
            java.lang.String r5 = ""
            r4.<init>(r5)     // Catch:{ Exception -> 0x0127 }
            java.lang.Exception r5 = new java.lang.Exception     // Catch:{ Exception -> 0x0127 }
            r5.<init>()     // Catch:{ Exception -> 0x0127 }
            java.lang.StackTraceElement[] r5 = r5.getStackTrace()     // Catch:{ Exception -> 0x0127 }
            if (r5 == 0) goto L_0x0131
            int r6 = r5.length     // Catch:{ Exception -> 0x0127 }
            if (r6 <= 0) goto L_0x0131
            java.util.List r5 = m16193a((java.lang.StackTraceElement[]) r5)     // Catch:{ Exception -> 0x0127 }
            java.util.Collections.reverse(r5)     // Catch:{ Exception -> 0x0127 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0127 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x0127 }
            r6.<init>()     // Catch:{ Exception -> 0x0127 }
        L_0x007b:
            boolean r7 = r5.hasNext()     // Catch:{ Exception -> 0x0127 }
            if (r7 == 0) goto L_0x00b9
            java.lang.Object r7 = r5.next()     // Catch:{ Exception -> 0x0127 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0127 }
            java.lang.String r8 = "com.android"
            boolean r8 = r7.startsWith(r8)     // Catch:{ Exception -> 0x0127 }
            if (r8 != 0) goto L_0x007b
            java.lang.String r8 = "android.os"
            boolean r8 = r7.startsWith(r8)     // Catch:{ Exception -> 0x0127 }
            if (r8 != 0) goto L_0x007b
            java.lang.String r8 = "android.app"
            boolean r8 = r7.startsWith(r8)     // Catch:{ Exception -> 0x0127 }
            if (r8 != 0) goto L_0x007b
            java.lang.String r8 = "java.lang.reflect.Method"
            boolean r8 = r7.startsWith(r8)     // Catch:{ Exception -> 0x0127 }
            if (r8 != 0) goto L_0x007b
            java.lang.String r8 = "android.view"
            boolean r8 = r7.startsWith(r8)     // Catch:{ Exception -> 0x0127 }
            if (r8 != 0) goto L_0x007b
            boolean r8 = r6.contains(r7)     // Catch:{ Exception -> 0x0127 }
            if (r8 != 0) goto L_0x007b
            r6.add(r7)     // Catch:{ Exception -> 0x0127 }
            goto L_0x007b
        L_0x00b9:
            int r5 = r6.size()     // Catch:{ Exception -> 0x0127 }
            int r2 = java.lang.Math.min(r5, r2)     // Catch:{ Exception -> 0x0127 }
            if (r2 <= 0) goto L_0x00da
        L_0x00c3:
            if (r3 >= r2) goto L_0x00da
            java.lang.Object r5 = r6.get(r3)     // Catch:{ Exception -> 0x0127 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0127 }
            r4.append(r5)     // Catch:{ Exception -> 0x0127 }
            int r5 = r2 + -1
            if (r3 >= r5) goto L_0x00d7
            java.lang.String r5 = "|"
            r4.append(r5)     // Catch:{ Exception -> 0x0127 }
        L_0x00d7:
            int r3 = r3 + 1
            goto L_0x00c3
        L_0x00da:
            r2 = 0
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0127 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0127 }
            if (r3 != 0) goto L_0x00f3
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0127 }
            r2.<init>()     // Catch:{ Exception -> 0x0127 }
            java.lang.String r3 = "1"
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0127 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x0127 }
        L_0x00f3:
            if (r2 == 0) goto L_0x011d
            int r3 = r2.length()     // Catch:{ Exception -> 0x0127 }
            if (r3 <= 0) goto L_0x011d
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0127 }
            java.lang.String r2 = com.mbridge.msdk.foundation.tools.C6328a.m16055a(r2)     // Catch:{ Exception -> 0x0127 }
            if (r1 == 0) goto L_0x011b
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0127 }
            if (r1 != 0) goto L_0x011b
            java.util.Map<java.lang.String, java.lang.String> r1 = f15807q     // Catch:{ Exception -> 0x0127 }
            if (r1 != 0) goto L_0x0116
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Exception -> 0x0127 }
            r1.<init>()     // Catch:{ Exception -> 0x0127 }
            f15807q = r1     // Catch:{ Exception -> 0x0127 }
        L_0x0116:
            java.util.Map<java.lang.String, java.lang.String> r1 = f15807q     // Catch:{ Exception -> 0x0127 }
            r1.put(r10, r2)     // Catch:{ Exception -> 0x0127 }
        L_0x011b:
            monitor-exit(r0)
            return r2
        L_0x011d:
            java.lang.String r10 = ""
            monitor-exit(r0)
            return r10
        L_0x0121:
            java.lang.String r10 = ""
            monitor-exit(r0)
            return r10
        L_0x0125:
            r10 = move-exception
            goto L_0x0135
        L_0x0127:
            r10 = move-exception
            java.lang.String r1 = "SameTools"
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x0125 }
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r1, r10)     // Catch:{ all -> 0x0125 }
        L_0x0131:
            java.lang.String r10 = ""
            monitor-exit(r0)
            return r10
        L_0x0135:
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C6366u.m16217d(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static synchronized void m16198a(String str, String str2) {
        synchronized (C6366u.class) {
            if (f15808r == null) {
                f15808r = new HashMap();
            }
            f15808r.put("app_id_" + str, str2);
        }
    }

    /* renamed from: e */
    public static synchronized String m16219e(String str) {
        synchronized (C6366u.class) {
            String str2 = "app_id_" + str;
            if (f15808r == null || !f15808r.containsKey(str2)) {
                return null;
            }
            String str3 = f15808r.get(str2);
            return str3;
        }
    }

    /* renamed from: a */
    private static List<String> m16193a(StackTraceElement[] stackTraceElementArr) {
        ArrayList arrayList = new ArrayList();
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement className : stackTraceElementArr) {
                arrayList.add(className.getClassName());
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static final int m16211c() {
        if (f15809s == null) {
            try {
                f15809s = C6338i.C6344a.f15741a.mo43944e();
            } catch (Exception e) {
                C6361q.m16158d("SameTools", e.getMessage());
            }
        }
        if (f15809s != null) {
            return f15809s.booleanValue() ? 1 : 0;
        }
        return -1;
    }

    /* renamed from: f */
    public static boolean m16221f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            String queryParameter = parse.getQueryParameter("view");
            if (!TextUtils.isEmpty(queryParameter)) {
                return queryParameter.equals("1");
            }
            return false;
        } catch (Exception e) {
            C6361q.m16158d("SameTools", e.getMessage());
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        if ((r6 + (r4 * 1000)) >= r8) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        if ((r6 + (r4.mo42726p() * 1000)) >= r8) goto L_0x0075;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m16223g(java.lang.String r17) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r17)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.util.concurrent.ConcurrentHashMap r0 = com.mbridge.msdk.foundation.same.p166a.C6208d.m15702a(r17)
            if (r0 == 0) goto L_0x009c
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x009c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0022:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0087
            java.lang.Object r3 = r0.next()
            com.mbridge.msdk.foundation.entity.b r3 = (com.mbridge.msdk.foundation.entity.C6192b) r3
            if (r3 == 0) goto L_0x0022
            long r4 = r3.mo43599c()
            long r6 = r3.mo43601d()
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 0
            r12 = 1
            r13 = 0
            r14 = 1000(0x3e8, double:4.94E-321)
            int r16 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r16 <= 0) goto L_0x004e
            long r4 = r4 * r14
            long r6 = r6 + r4
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x0074
            goto L_0x0075
        L_0x004e:
            com.mbridge.msdk.b.b r4 = com.mbridge.msdk.p158b.C6076b.m15089a()
            com.mbridge.msdk.foundation.controller.a r5 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            java.lang.String r5 = r5.mo42896e()
            com.mbridge.msdk.b.a r4 = r4.mo42749b(r5)
            if (r4 != 0) goto L_0x0068
            com.mbridge.msdk.b.b r4 = com.mbridge.msdk.p158b.C6076b.m15089a()
            com.mbridge.msdk.b.a r4 = r4.mo42748b()
        L_0x0068:
            long r4 = r4.mo42726p()
            long r4 = r4 * r14
            long r6 = r6 + r4
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r12 = 0
        L_0x0075:
            if (r12 == 0) goto L_0x0022
            java.util.List r3 = r3.mo43597b()
            if (r3 == 0) goto L_0x0022
            int r4 = r3.size()
            if (r4 <= 0) goto L_0x0022
            r2.addAll(r3)
            goto L_0x0022
        L_0x0087:
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x009c
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r2)
            r2.clear()
            r2.addAll(r0)
            java.lang.String r1 = r2.toString()
        L_0x009c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C6366u.m16223g(java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    public static final String m16216d() {
        return C6338i.C6344a.f15741a.mo43945f();
    }
}
