package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.utils.i */
public class C1521i {
    /* renamed from: a */
    public static float m3460a(JSONObject jSONObject, String str, float f, C1469j jVar) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return f;
        }
        try {
            double d = jSONObject.getDouble(str);
            return (-3.4028234663852886E38d >= d || d >= 3.4028234663852886E38d) ? f : (float) d;
        } catch (JSONException e) {
            if (jVar == null) {
                return f;
            }
            C1505q v = jVar.mo13139v();
            v.mo13278b("JsonUtils", "Failed to retrieve float property for key = " + str, e);
            return f;
        }
    }

    /* renamed from: a */
    public static long m3461a(JSONObject jSONObject, String str, long j, C1469j jVar) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return j;
        }
        try {
            return jSONObject.getLong(str);
        } catch (JSONException e) {
            if (jVar == null) {
                return j;
            }
            C1505q v = jVar.mo13139v();
            v.mo13278b("JsonUtils", "Failed to retrieve int property for key = " + str, e);
            return j;
        }
    }

    /* renamed from: a */
    public static Bundle m3462a(Object obj) {
        JSONObject jSONObject;
        if (obj instanceof JSONObject) {
            jSONObject = (JSONObject) obj;
        } else {
            if (obj instanceof String) {
                try {
                    jSONObject = new JSONObject((String) obj);
                } catch (JSONException unused) {
                }
            }
            jSONObject = null;
        }
        return m3494c(jSONObject);
    }

    /* renamed from: a */
    public static Boolean m3463a(JSONObject jSONObject, String str, Boolean bool, C1469j jVar) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return bool;
        }
        try {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        } catch (JSONException unused) {
            boolean z = true;
            if (m3485b(jSONObject, str, (bool == null || !bool.booleanValue()) ? 0 : 1, jVar) <= 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public static Object m3464a(JSONArray jSONArray, int i, Object obj, C1469j jVar) {
        if (jSONArray == null || jSONArray.length() <= i) {
            return obj;
        }
        try {
            return jSONArray.get(i);
        } catch (JSONException e) {
            if (jVar == null) {
                return obj;
            }
            C1505q v = jVar.mo13139v();
            v.mo13278b("JsonUtils", "Failed to retrieve object at index " + i + " for JSON array", e);
            return obj;
        }
    }

    /* renamed from: a */
    public static String m3465a(Map<String, Object> map, String str, C1469j jVar) {
        try {
            return m3473a((Map<String, ?>) map).toString();
        } catch (JSONException e) {
            C1505q v = jVar.mo13139v();
            v.mo13278b("JsonUtils", "Failed to convert map '" + map + "' to JSON string.", e);
            return str;
        }
    }

    /* renamed from: a */
    public static ArrayList<Bundle> m3466a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList<>();
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m3494c(jSONArray.optJSONObject(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List m3467a(JSONObject jSONObject, String str, List list, C1469j jVar) {
        try {
            JSONArray b = m3491b(jSONObject, str, (JSONArray) null, jVar);
            return b != null ? m3488b(b) : list;
        } catch (JSONException unused) {
            return list;
        }
    }

    /* renamed from: a */
    public static Map<String, String> m3468a(Bundle bundle) {
        if (bundle == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(bundle.size());
        for (String str : bundle.keySet()) {
            hashMap.put(str, String.valueOf(bundle.get(str)));
        }
        return hashMap;
    }

    /* renamed from: a */
    public static Map<String, Object> m3469a(String str, Map<String, Object> map, C1469j jVar) {
        try {
            return m3489b(new JSONObject(str));
        } catch (JSONException e) {
            C1505q v = jVar.mo13139v();
            v.mo13278b("JsonUtils", "Failed to convert json string '" + str + "' to map", e);
            return map;
        }
    }

    /* renamed from: a */
    public static Map<String, String> m3470a(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m3495c(jSONObject.get(next)).toString());
        }
        return hashMap;
    }

    /* renamed from: a */
    public static JSONObject m3471a(String str, C1469j jVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            C1505q v = jVar.mo13139v();
            v.mo13281e("JsonUtils", "Failed to deserialize into JSON: " + str);
            return null;
        }
    }

    /* renamed from: a */
    public static JSONObject m3472a(String str, JSONObject jSONObject, C1469j jVar) {
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            if (jVar != null) {
                C1505q v = jVar.mo13139v();
                v.mo13278b("JsonUtils", "Failed to convert JSON string '" + str + "' to JSONObject", e);
            }
            return jSONObject;
        }
    }

    /* renamed from: a */
    public static JSONObject m3473a(Map<String, ?> map) throws JSONException {
        if (map == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            jSONObject.put((String) next.getKey(), next.getValue());
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m3474a(JSONArray jSONArray, int i, JSONObject jSONObject, C1469j jVar) {
        if (jSONArray == null || i >= jSONArray.length()) {
            return jSONObject;
        }
        try {
            return jSONArray.getJSONObject(i);
        } catch (JSONException e) {
            if (jVar == null) {
                return jSONObject;
            }
            C1505q v = jVar.mo13139v();
            v.mo13278b("JsonUtils", "Failed to retrieve JSON object from array for index = " + i, e);
            return jSONObject;
        }
    }

    /* renamed from: a */
    public static void m3475a(JSONObject jSONObject, String str, int i, C1469j jVar) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, i);
            } catch (JSONException e) {
                if (jVar != null) {
                    C1505q v = jVar.mo13139v();
                    v.mo13278b("JsonUtils", "Failed to put int property for key = " + str, e);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3476a(JSONObject jSONObject, String str, Object obj, C1469j jVar) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, obj);
            } catch (JSONException e) {
                if (jVar != null) {
                    C1505q v = jVar.mo13139v();
                    v.mo13278b("JsonUtils", "Failed to put Object property for key = " + str, e);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3477a(JSONObject jSONObject, String str, String str2, C1469j jVar) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, str2);
            } catch (JSONException e) {
                if (jVar != null) {
                    C1505q v = jVar.mo13139v();
                    v.mo13278b("JsonUtils", "Failed to put String property for key = " + str, e);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3478a(JSONObject jSONObject, String str, JSONArray jSONArray, C1469j jVar) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, jSONArray);
            } catch (JSONException e) {
                if (jVar != null) {
                    C1505q v = jVar.mo13139v();
                    v.mo13278b("JsonUtils", "Failed to put JSONArray property for key = " + str, e);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3479a(JSONObject jSONObject, String str, JSONObject jSONObject2, C1469j jVar) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, jSONObject2);
            } catch (JSONException e) {
                if (jVar != null) {
                    C1505q v = jVar.mo13139v();
                    v.mo13278b("JsonUtils", "Failed to put JSON property for key = " + str, e);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3480a(JSONObject jSONObject, String str, boolean z, C1469j jVar) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, z);
            } catch (JSONException e) {
                if (jVar != null) {
                    C1505q v = jVar.mo13139v();
                    v.mo13278b("JsonUtils", "Failed to put boolean property for key = " + str, e);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3481a(JSONObject jSONObject, JSONObject jSONObject2, C1469j jVar) {
        if (jSONObject != null && jSONObject2 != null) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object b = m3486b(jSONObject2, next, (Object) null, jVar);
                if (b != null) {
                    m3476a(jSONObject, next, b, jVar);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3482a(JSONObject jSONObject, String[] strArr) {
        for (String remove : strArr) {
            jSONObject.remove(remove);
        }
    }

    /* renamed from: a */
    public static boolean m3483a(String str, JSONArray jSONArray) {
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                Object obj = jSONArray.get(i);
                if ((obj instanceof String) && ((String) obj).equalsIgnoreCase(str)) {
                    return true;
                }
                i++;
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m3484a(JSONObject jSONObject, String str) {
        return jSONObject != null && jSONObject.has(str);
    }

    /* renamed from: b */
    public static int m3485b(JSONObject jSONObject, String str, int i, C1469j jVar) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return i;
        }
        try {
            return jSONObject.getInt(str);
        } catch (JSONException e) {
            if (jVar == null) {
                return i;
            }
            C1505q v = jVar.mo13139v();
            v.mo13278b("JsonUtils", "Failed to retrieve int property for key = " + str, e);
            return i;
        }
    }

    /* renamed from: b */
    public static Object m3486b(JSONObject jSONObject, String str, Object obj, C1469j jVar) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return obj;
        }
        try {
            Object obj2 = jSONObject.get(str);
            return obj2 != null ? obj2 : obj;
        } catch (JSONException e) {
            if (jVar == null) {
                return obj;
            }
            C1505q v = jVar.mo13139v();
            v.mo13278b("JsonUtils", "Failed to retrieve Object for key = " + str, e);
            return obj;
        }
    }

    /* renamed from: b */
    public static String m3487b(JSONObject jSONObject, String str, String str2, C1469j jVar) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return str2;
        }
        try {
            return jSONObject.getString(str);
        } catch (JSONException e) {
            if (jVar == null) {
                return str2;
            }
            C1505q v = jVar.mo13139v();
            v.mo13278b("JsonUtils", "Failed to retrieve string property for key = " + str, e);
            return str2;
        }
    }

    /* renamed from: b */
    public static List m3488b(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m3495c(jSONArray.get(i)));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Map<String, Object> m3489b(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m3495c(jSONObject.get(next)));
        }
        return hashMap;
    }

    /* renamed from: b */
    public static JSONArray m3490b(Object obj) {
        if (obj == null) {
            return new JSONArray();
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(obj);
        return jSONArray;
    }

    /* renamed from: b */
    public static JSONArray m3491b(JSONObject jSONObject, String str, JSONArray jSONArray, C1469j jVar) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return jSONArray;
        }
        try {
            return jSONObject.getJSONArray(str);
        } catch (JSONException e) {
            if (jVar == null) {
                return jSONArray;
            }
            C1505q v = jVar.mo13139v();
            v.mo13278b("JsonUtils", "Failed to retrieve JSON array for key = " + str, e);
            return jSONArray;
        }
    }

    /* renamed from: b */
    public static JSONObject m3492b(JSONObject jSONObject, String str, JSONObject jSONObject2, C1469j jVar) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return jSONObject2;
        }
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException e) {
            if (jVar == null) {
                return jSONObject2;
            }
            C1505q v = jVar.mo13139v();
            v.mo13278b("JsonUtils", "Failed to retrieve JSON property for key = " + str, e);
            return jSONObject2;
        }
    }

    /* renamed from: b */
    public static void m3493b(JSONObject jSONObject, String str, long j, C1469j jVar) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, j);
            } catch (JSONException e) {
                if (jVar != null) {
                    C1505q v = jVar.mo13139v();
                    v.mo13278b("JsonUtils", "Failed to put long property for key = " + str, e);
                }
            }
        }
    }

    /* renamed from: c */
    public static Bundle m3494c(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return new Bundle();
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (jSONObject.isNull(next)) {
                bundle.putString(next, (String) null);
            } else {
                Object opt = jSONObject.opt(next);
                if (opt instanceof JSONObject) {
                    bundle.putBundle(next, m3494c((JSONObject) opt));
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    if (jSONArray.length() == 0) {
                        bundle.putStringArrayList(next, new ArrayList(0));
                    } else if (m3464a(jSONArray, 0, (Object) null, (C1469j) null) instanceof String) {
                        ArrayList arrayList = new ArrayList(jSONArray.length());
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList.add((String) m3464a(jSONArray, i, (Object) null, (C1469j) null));
                        }
                        bundle.putStringArrayList(next, arrayList);
                    } else {
                        bundle.putParcelableArrayList(next, m3466a(jSONArray));
                    }
                } else if (opt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) opt).booleanValue());
                } else if (opt instanceof String) {
                    bundle.putString(next, (String) opt);
                } else if (opt instanceof Integer) {
                    bundle.putInt(next, ((Integer) opt).intValue());
                } else if (opt instanceof Long) {
                    bundle.putLong(next, ((Long) opt).longValue());
                } else if (opt instanceof Double) {
                    bundle.putDouble(next, ((Double) opt).doubleValue());
                }
            }
        }
        return bundle;
    }

    /* renamed from: c */
    private static Object m3495c(Object obj) throws JSONException {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj instanceof JSONObject ? m3489b((JSONObject) obj) : obj instanceof JSONArray ? m3488b((JSONArray) obj) : obj;
    }

    /* renamed from: d */
    public static JSONObject m3496d(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject2.put(next, jSONObject.get(next));
            } catch (JSONException unused) {
                C1505q.m3344h("JsonUtils", "Failed to copy over item for key '" + next + "' to JSONObject copy");
            }
        }
        return jSONObject2;
    }

    /* renamed from: e */
    public static String m3497e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.toString(4);
        } catch (JSONException unused) {
            return jSONObject.toString();
        }
    }
}
