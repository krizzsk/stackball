package com.inmobi.media;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.inmobi.media.C5239ey;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.gr */
/* compiled from: AppDataManager */
public class C5318gr {

    /* renamed from: a */
    private static final String f12198a = C5318gr.class.getName();

    /* renamed from: a */
    public static Map<String, Long> m12236a() {
        C5236ew ewVar = (C5236ew) C5239ey.m11987a("appOwnership", C5314go.m12211f(), (C5239ey.C5242c) null);
        Context c = C5314go.m12203c();
        if (m12240a(ewVar, c)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            int i = ewVar.batchSize;
            Set<String> a = C5319gs.m12241a(ewVar.bundleIds);
            if (a != null) {
                for (String next : a) {
                    int i2 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    hashMap.put(next, Long.valueOf(m12235a(c, next)));
                    i = i2;
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    /* renamed from: a */
    private static JSONObject m12238a(int i) {
        TreeMap treeMap = new TreeMap();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        Calendar instance = Calendar.getInstance();
        for (int i2 = 1; i2 <= i; i2++) {
            instance.add(5, -1);
            treeMap.put(simpleDateFormat.format(instance.getTime()), 0);
        }
        if (C5314go.m12203c() == null) {
            return null;
        }
        try {
            for (PackageInfo packageInfo : C5314go.m12203c().getPackageManager().getInstalledPackages(256)) {
                String format = simpleDateFormat.format(new Date(packageInfo.firstInstallTime));
                if (treeMap.containsKey(format)) {
                    treeMap.put(format, Integer.valueOf(((Integer) treeMap.get(format)).intValue() + 1));
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(String.valueOf(System.currentTimeMillis()), new JSONArray(treeMap.values()));
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static long m12235a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30 && !C5329gy.m12278a(context, "android.permission.QUERY_ALL_PACKAGES")) {
            return -2;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 256).firstInstallTime;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        } catch (Exception unused2) {
            return -2;
        }
    }

    /* renamed from: a */
    public static Map<String, String> m12237a(Context context, Map<String, Long> map) {
        JSONObject a;
        C5236ew ewVar = (C5236ew) C5239ey.m11987a("appOwnership", C5314go.m12211f(), (C5239ey.C5242c) null);
        HashMap hashMap = new HashMap();
        if (m12240a(ewVar, context)) {
            return hashMap;
        }
        try {
            if (C5319gs.m12245b(context) && (a = m12238a(ewVar.numOfDays)) != null) {
                hashMap.put("u-apps-cnt", a.toString());
                C5319gs.m12243a(context);
            }
            if (map != null && map.size() > 0) {
                hashMap.put("u-apps-meta", new JSONObject(map).toString());
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m12239a(Context context, String str, Map<String, String> map) {
        if (!m12240a((C5236ew) C5239ey.m11987a("appOwnership", C5314go.m12211f(), (C5239ey.C5242c) null), context) && str != null) {
            long a = m12235a(context, str);
            if (a > 0) {
                map.put("$IM_INSTALL_TIME", String.valueOf(a));
            }
        }
    }

    /* renamed from: a */
    private static boolean m12240a(C5236ew ewVar, Context context) {
        if (!ewVar.isEnabled || context == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 30 || C5329gy.m12278a(context, "android.permission.QUERY_ALL_PACKAGES")) {
            return false;
        }
        return true;
    }
}
