package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import java.io.Closeable;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import javax.net.ssl.HttpsURLConnection;
import kotlin.time.DurationKt;

/* renamed from: com.yandex.metrica.impl.ob.U2 */
public final class C10796U2 {

    /* renamed from: a */
    private static final C10898Wn f25905a = new C10898Wn();

    /* renamed from: a */
    public static String m27877a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        if (packageInfo == null) {
            return "0.0";
        }
        return packageInfo.versionName;
    }

    /* renamed from: a */
    public static boolean m27891a(Object obj) {
        return obj != null;
    }

    /* renamed from: b */
    public static int m27895b(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        if (packageInfo == null) {
            return 0;
        }
        return packageInfo.versionCode;
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m27898c(Map<K, V> map) {
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    /* renamed from: a */
    public static boolean m27890a(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    /* renamed from: b */
    public static boolean m27897b(Map map) {
        return map == null || map.size() == 0;
    }

    /* renamed from: a */
    public static void m27888a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m27896b(Collection collection) {
        return collection == null || collection.size() == 0;
    }

    /* renamed from: a */
    public static void m27889a(HttpsURLConnection httpsURLConnection) {
        if (httpsURLConnection != null) {
            try {
                httpsURLConnection.disconnect();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m27886a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* renamed from: a */
    public static boolean m27892a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static void m27887a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static <T> boolean m27894a(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    /* renamed from: a */
    public static boolean m27893a(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    /* renamed from: a */
    public static String m27878a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 36) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.replace(8, str.length() - 4, "-xxxx-xxxx-xxxx-xxxxxxxx");
        return sb.toString();
    }

    /* renamed from: a */
    public static Set<Integer> m27885a(int[] iArr) {
        HashSet hashSet = new HashSet();
        for (int valueOf : iArr) {
            hashSet.add(Integer.valueOf(valueOf));
        }
        return hashSet;
    }

    /* renamed from: a */
    public static String m27879a(String str, int i) {
        if (str == null) {
            return null;
        }
        return str.length() > i ? str.substring(0, i) : str;
    }

    /* renamed from: a */
    public static List<String> m27883a(String... strArr) {
        TreeSet treeSet = new TreeSet();
        Collections.addAll(treeSet, strArr);
        return Collections.unmodifiableList(new ArrayList(treeSet));
    }

    /* renamed from: a */
    public static <T, S> Object m27876a(C10897Wm wm, Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return wm.mo61337a(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static <T, S> S m27875a(C10897Wm<T, S> wm, Context context, String str, String str2, String str3) {
        try {
            return m27876a((C10897Wm) wm, context.getSystemService(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static <K, V> List<Map.Entry<K, V>> m27882a(Map<K, V> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<K, V> simpleEntry : map.entrySet()) {
            arrayList.add(new AbstractMap.SimpleEntry(simpleEntry));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m27884a(List<Map.Entry<K, V>> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (Map.Entry next : list) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static <T> List<T> m27881a(Collection<T> collection) {
        if (collection == null) {
            return null;
        }
        return new ArrayList(collection);
    }

    /* renamed from: a */
    public static BigDecimal m27880a(long j) {
        return new BigDecimal(j).divide(new BigDecimal(DurationKt.NANOS_IN_MILLIS), 6, 6);
    }

    /* renamed from: a */
    public static double m27874a(double d, double d2) {
        return (Double.isNaN(d) || Double.isInfinite(d)) ? d2 : d;
    }
}
