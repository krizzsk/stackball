package com.yandex.metrica.impl.p265ob;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.android.billingclient.api.BillingClient;
import com.yandex.metrica.C12042k;
import com.yandex.metrica.billing_interface.C10073e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.i */
public class C11327i {
    /* renamed from: a */
    public static boolean m29172a(String str, String str2) {
        int i = C10585O2.f25307a;
        return !((str == null && str2 == null) ? true : (str == null || str2 == null) ? false : str.equals(str2));
    }

    /* renamed from: b */
    public static Integer m29175b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static C10073e m29176c(String str) {
        if (BillingClient.SkuType.INAPP.equals(str)) {
            return C10073e.INAPP;
        }
        if (BillingClient.SkuType.SUBS.equals(str)) {
            return C10073e.SUBS;
        }
        return C10073e.UNKNOWN;
    }

    /* renamed from: a */
    public static boolean m29171a(Boolean bool) {
        return Boolean.TRUE.equals(bool);
    }

    /* renamed from: a */
    public static String m29167a(Context context) {
        return context.getPackageName() + "-crashpad_new_crash_socket";
    }

    /* renamed from: a */
    public static SharedPreferences m29165a(Context context, String str) {
        return context.getSharedPreferences(context.getPackageName() + str, 0);
    }

    /* renamed from: a */
    public static boolean m29173a(Collection<?> collection, Collection<?> collection2) {
        HashSet hashSet;
        if (collection == null && collection2 == null) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        if (collection instanceof HashSet) {
            Collection<?> collection3 = collection2;
            hashSet = (HashSet) collection;
            collection = collection3;
        } else if (collection2 instanceof HashSet) {
            hashSet = (HashSet) collection2;
        } else {
            HashSet hashSet2 = new HashSet(collection);
            collection = collection2;
            hashSet = hashSet2;
        }
        for (Object contains : collection) {
            if (!hashSet.contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m29170a(Cursor cursor, ContentValues contentValues) {
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            int type = cursor.getType(i);
            if (type == 0) {
                contentValues.put(columnNames[i], cursor.getString(i));
            } else if (type == 1) {
                contentValues.put(columnNames[i], Long.valueOf(cursor.getLong(i)));
            } else if (type == 2) {
                contentValues.put(columnNames[i], Double.valueOf(cursor.getDouble(i)));
            } else if (type == 3) {
                contentValues.put(columnNames[i], cursor.getString(i));
            } else if (type != 4) {
                contentValues.put(columnNames[i], cursor.getString(i));
            } else {
                contentValues.put(columnNames[i], cursor.getBlob(i));
            }
        }
    }

    /* renamed from: a */
    public static long m29163a() {
        return C10470Lm.m26853c().mo61544a();
    }

    /* renamed from: a */
    public static int m29162a(long j) {
        return ((GregorianCalendar) GregorianCalendar.getInstance()).getTimeZone().getOffset(j * 1000) / 1000;
    }

    /* renamed from: a */
    public static List<Integer> m29168a(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m29169a(SharedPreferences sharedPreferences, String str, int i) {
        if (sharedPreferences != null && sharedPreferences.contains(str)) {
            try {
                sharedPreferences.edit().remove(str).putLong(str, (long) sharedPreferences.getInt(str, i)).apply();
            } catch (ClassCastException unused) {
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.String[], android.database.Cursor] */
    /* renamed from: a */
    public static long m29164a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor = 0;
        try {
            cursor = sQLiteDatabase.rawQuery("SELECT count() FROM " + str, cursor);
            return cursor.moveToFirst() ? cursor.getLong(0) : 0;
        } finally {
            C10796U2.m27886a((Cursor) cursor);
        }
    }

    /* renamed from: a */
    public static int[] m29174a(List<Integer> list) {
        int[] iArr = new int[list.size()];
        int i = 0;
        for (Integer intValue : list) {
            iArr[i] = intValue.intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: a */
    public static C12042k m29166a(String str) {
        C12042k kVar = new C12042k();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                kVar.mo64240b(jSONObject.optString("UserInfo.UserId", (String) null));
                kVar.mo64237a(jSONObject.optString("UserInfo.Type", (String) null));
                kVar.mo64238a((Map<String, String>) C11993ym.m30979b(jSONObject.optJSONObject("UserInfo.Options")));
            } catch (Throwable unused) {
            }
        }
        return kVar;
    }
}
