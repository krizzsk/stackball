package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.internal.security.CertificateUtil;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.yandex.metrica.C10078e;
import com.yandex.metrica.impl.p265ob.C11215em;
import com.yandex.metrica.impl.p265ob.C11428kg;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ym */
public class C11993ym {

    /* renamed from: com.yandex.metrica.impl.ob.ym$a */
    public static class C11994a extends JSONObject {
        public C11994a() {
        }

        /* renamed from: a */
        public Long mo64175a(String str) {
            try {
                return Long.valueOf(getLong(str));
            } catch (Throwable unused) {
                return null;
            }
        }

        /* renamed from: b */
        public String mo64176b(String str) {
            if (!has(str) || !has(str)) {
                return "";
            }
            try {
                return getString(str);
            } catch (Throwable unused) {
                return "";
            }
        }

        /* renamed from: c */
        public String mo64177c(String str) {
            if (has(str)) {
                try {
                    return getString(str);
                } catch (Throwable unused) {
                }
            }
            return "";
        }

        /* renamed from: d */
        public boolean mo64178d(String str) {
            try {
                return JSONObject.NULL != get(str);
            } catch (Throwable unused) {
                return false;
            }
        }

        public C11994a(String str) throws JSONException {
            super(str);
        }
    }

    /* renamed from: a */
    public static <T> T m30961a(T t, T t2) {
        return t == null ? t2 : t;
    }

    /* renamed from: a */
    public static String m30962a(Context context, String str) throws UnsupportedEncodingException {
        byte[] a = m30975a(context, Base64.decode(str.getBytes("UTF-8"), 0));
        if (a == null) {
            return null;
        }
        try {
            return new String(C10823V0.m27968a(new String(a, "UTF-8")), "UTF-8");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m30983b(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest instance = MessageDigest.getInstance(SameMD5.TAG);
        instance.reset();
        instance.update(str.getBytes("UTF-8"));
        return instance.digest();
    }

    /* renamed from: c */
    public static String m30987c(Map<String, String> map) {
        if (C10796U2.m27897b((Map) map)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            sb.append((String) next.getKey());
            sb.append(CertificateUtil.DELIMITER);
            sb.append((String) next.getValue());
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    /* renamed from: d */
    public static boolean m30991d(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (Map.Entry value : map.entrySet()) {
            try {
                Integer.parseInt((String) value.getValue());
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static JSONObject m30994e(Map map) {
        if (C10796U2.m27897b(map)) {
            return null;
        }
        if (C10796U2.m27890a(19)) {
            return new JSONObject(map);
        }
        return m30998h(map);
    }

    /* renamed from: f */
    public static JSONObject m30996f(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return new JSONObject();
        }
        return m30994e(map);
    }

    /* renamed from: g */
    public static String m30997g(Map map) {
        if (C10796U2.m27897b(map)) {
            return null;
        }
        if (C10796U2.m27890a(19)) {
            return new JSONObject(map).toString();
        }
        return m30960a((Object) map).toString();
    }

    /* renamed from: h */
    private static JSONObject m30998h(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String obj = entry.getKey().toString();
            if (obj != null) {
                linkedHashMap.put(obj, m30960a(entry.getValue()));
            }
        }
        return new JSONObject(linkedHashMap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r2 != -1) goto L_0x0060;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.String> m30999i(java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r9 == 0) goto L_0x006e
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x000f:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x006e
            java.lang.Object r1 = r9.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0043
            java.lang.String r3 = ":"
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L_0x0043
            java.lang.String r3 = ","
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L_0x0043
            java.lang.String r3 = "&"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x0043
            r2 = 1
            goto L_0x0044
        L_0x0043:
            r2 = 0
        L_0x0044:
            if (r2 == 0) goto L_0x000f
            java.lang.Object r2 = r1.getValue()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x005f
            r6 = -1
            long r2 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x0059 }
            goto L_0x005a
        L_0x0059:
            r2 = r6
        L_0x005a:
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r4 = 0
        L_0x0060:
            if (r4 == 0) goto L_0x000f
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L_0x000f
        L_0x006e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11993ym.m30999i(java.util.Map):java.util.Map");
    }

    /* renamed from: b */
    public static String m30977b(Context context, String str) throws UnsupportedEncodingException {
        String str2;
        try {
            str2 = C10823V0.m27963a(str.getBytes("UTF-8"));
        } catch (Throwable unused) {
            str2 = null;
        }
        return Base64.encodeToString(m30975a(context, str2.getBytes("UTF-8")), 0);
    }

    /* renamed from: f */
    public static C11900w2 m30995f(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new C11900w2(jSONObject.optInt("width"), jSONObject.optInt("height"), jSONObject.optInt("dpi"), (float) jSONObject.optDouble("scaleFactor", 0.0d), C10078e.m25944a(jSONObject.optString("deviceType")));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Map<String, String> m30966a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",")) {
                int indexOf = str2.indexOf(CertificateUtil.DELIMITER);
                if (indexOf != -1) {
                    hashMap.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
                }
            }
        }
        return hashMap;
    }

    /* renamed from: d */
    public static HashMap<String, String> m30990d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return m30979b(new JSONObject(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static String m30986c(List<String> list) {
        if (C10796U2.m27896b((Collection) list)) {
            return null;
        }
        if (C10796U2.m27890a(19)) {
            return new JSONArray(list).toString();
        }
        return m30960a((Object) list).toString();
    }

    /* renamed from: b */
    private static JSONArray m30981b(Collection<?> collection) {
        if (collection == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            for (Object a : collection) {
                arrayList.add(m30960a((Object) a));
            }
            return new JSONArray(arrayList);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static HashMap<String, String> m30993e(String str) throws JSONException {
        return m30979b(new JSONObject(str));
    }

    /* renamed from: d */
    public static Long m30989d(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Long.valueOf(jSONObject.getLong(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public static String m30992e(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return jSONObject.getString(str);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public static JSONArray m30982b(List<?> list) {
        if (C10796U2.m27896b((Collection) list)) {
            return null;
        }
        if (C10796U2.m27890a(19)) {
            return new JSONArray(list);
        }
        return m30981b((Collection<?>) list);
    }

    /* renamed from: a */
    public static long m30956a(Long l, TimeUnit timeUnit, long j) {
        return l == null ? j : timeUnit.toMillis(l.longValue());
    }

    /* renamed from: a */
    private static byte[] m30975a(Context context, byte[] bArr) {
        try {
            byte[] b = m30983b(context.getPackageName());
            byte[] bArr2 = new byte[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                bArr2[i] = (byte) (bArr[i] ^ b[i % b.length]);
            }
            return bArr2;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static List<String> m30988c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList = new ArrayList(jSONArray.length());
                int i = 0;
                while (i < jSONArray.length()) {
                    try {
                        arrayList.add(jSONArray.getString(i));
                        i++;
                    } catch (Throwable unused) {
                        return arrayList;
                    }
                }
                return arrayList;
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Object m30960a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                ArrayList arrayList = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    arrayList.add(m30960a(Array.get(obj, i)));
                }
                return new JSONArray(arrayList);
            } else if (obj instanceof Collection) {
                return m30981b((Collection<?>) (Collection) obj);
            } else {
                return obj instanceof Map ? m30998h((Map) obj) : obj;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static HashMap<String, String> m30979b(JSONObject jSONObject) {
        if (JSONObject.NULL.equals(jSONObject)) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    /* renamed from: c */
    public static Integer m30985c(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Integer.valueOf(jSONObject.getInt(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public static C10378Il m30984c(JSONObject jSONObject) throws JSONException {
        C11091bm bmVar;
        C10437Kl kl;
        C10437Kl kl2;
        JSONObject jSONObject2 = jSONObject;
        C11428kg.C11439i iVar = new C11428kg.C11439i();
        JSONObject optJSONObject = jSONObject2.optJSONObject("upc");
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("uecc");
        JSONObject optJSONObject3 = jSONObject2.optJSONObject("ucfbc");
        JSONObject optJSONObject4 = jSONObject2.optJSONObject("ruecc");
        boolean optBoolean = jSONObject2.optBoolean("upe", iVar.f27484q);
        boolean optBoolean2 = jSONObject2.optBoolean("uece", iVar.f27485r);
        boolean optBoolean3 = jSONObject2.optBoolean("ucfbe", iVar.f27486s);
        boolean optBoolean4 = jSONObject2.optBoolean("ruece", iVar.f27490w);
        C10437Kl kl3 = null;
        if (optJSONObject == null) {
            bmVar = null;
        } else {
            C11428kg.C11459v vVar = new C11428kg.C11459v();
            bmVar = new C11091bm(optJSONObject.optInt("tltb", vVar.f27579b), optJSONObject.optInt("ttb", vVar.f27580c), optJSONObject.optInt("mvcl", vVar.f27581d), optJSONObject.optLong("act", vVar.f27582e), optJSONObject.optBoolean("rtsc", vVar.f27583f), optJSONObject.optBoolean("er", vVar.f27584g), optJSONObject.optBoolean("pabd", vVar.f27585h), m30965a(optJSONObject.optJSONArray(InneractiveMediationDefs.GENDER_FEMALE)));
        }
        if (optJSONObject2 == null) {
            kl = null;
        } else {
            kl = m30957a(optJSONObject2, C11898w0.m30737b());
        }
        if (optJSONObject3 == null) {
            kl2 = null;
        } else {
            kl2 = m30957a(optJSONObject3, C11898w0.m30736a());
        }
        if (optJSONObject4 != null) {
            kl3 = m30957a(optJSONObject4, C11898w0.m30737b());
        }
        return new C10378Il(optBoolean, optBoolean2, optBoolean3, optBoolean4, bmVar, kl, kl2, kl3);
    }

    /* renamed from: b */
    public static Boolean m30976b(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Boolean.valueOf(jSONObject.getBoolean(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m30964a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return "";
        }
        return m30997g(map);
    }

    /* renamed from: b */
    public static List<String> m30980b(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m30974a(JSONObject jSONObject, String str, boolean z) {
        Boolean b = m30976b(jSONObject, str);
        return b == null ? z : b.booleanValue();
    }

    /* renamed from: b */
    public static String m30978b(Map<String, List<String>> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry next : map.entrySet()) {
                JSONArray b = m30982b((List<?>) (List) next.getValue());
                if (b != null) {
                    jSONObject.put((String) next.getKey(), b.toString());
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static JSONArray m30967a(Collection<C10859Vj> collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            for (C10859Vj a : collection) {
                try {
                    jSONArray.put(m30971a(a));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONObject m30971a(C10859Vj vj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cell_id", vj.mo62398b());
        jSONObject.put("signal_strength", vj.mo62412p());
        jSONObject.put("lac", vj.mo62401e());
        jSONObject.put(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, vj.mo62407k());
        jSONObject.put("operator_id", vj.mo62408l());
        jSONObject.put("operator_name", vj.mo62410n());
        jSONObject.put("is_connected", vj.mo62413q());
        jSONObject.put("cell_type", vj.mo62399c());
        jSONObject.put("pci", vj.mo62411o());
        jSONObject.put("last_visible_time_offset", vj.mo62400d());
        jSONObject.put("lte_rsrq", vj.mo62404h());
        jSONObject.put("lte_rssnr", vj.mo62406j());
        jSONObject.put("arfcn", vj.mo62396a());
        jSONObject.put("lte_rssi", vj.mo62405i());
        jSONObject.put("lte_bandwidth", vj.mo62402f());
        jSONObject.put("lte_cqi", vj.mo62403g());
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m30969a(C10378Il il) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject put = new JSONObject().put("upe", il.f24919a).put("uece", il.f24920b).put("ruece", il.f24922d).put("ucfbe", il.f24921c);
        C11091bm bmVar = il.f24923e;
        JSONObject jSONObject4 = null;
        if (bmVar == null) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject().put("tltb", bmVar.f26619a).put("ttb", bmVar.f26620b).put("mvcl", bmVar.f26621c).put("act", bmVar.f26622d).put("rtsc", bmVar.f26623e).put("er", bmVar.f26624f).put("pabd", bmVar.f26625g).put(InneractiveMediationDefs.GENDER_FEMALE, m30968a(bmVar.f26626h));
        }
        JSONObject putOpt = put.putOpt("upc", jSONObject);
        C10437Kl kl = il.f24924f;
        if (kl == null) {
            jSONObject2 = null;
        } else {
            jSONObject2 = m30970a(kl);
        }
        JSONObject putOpt2 = putOpt.putOpt("uecc", jSONObject2);
        C10437Kl kl2 = il.f24926h;
        if (kl2 == null) {
            jSONObject3 = null;
        } else {
            jSONObject3 = m30970a(kl2);
        }
        JSONObject putOpt3 = putOpt2.putOpt("ruecc", jSONObject3);
        C10437Kl kl3 = il.f24925g;
        if (kl3 != null) {
            jSONObject4 = m30970a(kl3);
        }
        return putOpt3.putOpt("ucfbc", jSONObject4);
    }

    /* renamed from: a */
    private static JSONObject m30970a(C10437Kl kl) throws JSONException {
        return new JSONObject().put("tsc", kl.f25063a).put("rtsc1", kl.f25064b).put("tvc", kl.f25065c).put("tsc1", kl.f25066d).put("ic", kl.f25067e).put("ncvc", kl.f25068f).put("tlc", kl.f25069g).put("vh", kl.f25070h).put("if", kl.f25071i).put("wvuc", kl.f25072j).put("tltb", kl.f25073k).put("ttb", kl.f25074l).put("mec", kl.f25075m).put("mfcl", kl.f25076n).put("wvul", kl.f25077o).put(InneractiveMediationDefs.GENDER_FEMALE, m30968a(kl.f25078p));
    }

    /* renamed from: a */
    private static C10437Kl m30957a(JSONObject jSONObject, C11428kg.C11458u uVar) {
        JSONObject jSONObject2 = jSONObject;
        C11428kg.C11458u uVar2 = uVar;
        return new C10437Kl(jSONObject2.optBoolean("tsc", uVar2.f27563b), jSONObject2.optBoolean("rtsc1", uVar2.f27564c), jSONObject2.optBoolean("tvc", uVar2.f27565d), jSONObject2.optBoolean("tsc1", uVar2.f27566e), jSONObject2.optBoolean("ic", uVar2.f27571j), jSONObject2.optBoolean("ncvc", uVar2.f27572k), jSONObject2.optBoolean("tlc", uVar2.f27573l), jSONObject2.optBoolean("vh", uVar2.f27574m), jSONObject2.optBoolean("if", uVar2.f27576o), jSONObject2.optBoolean("wvuc", uVar2.f27577p), jSONObject2.optInt("tltb", uVar2.f27567f), jSONObject2.optInt("ttb", uVar2.f27568g), jSONObject2.optInt("mec", uVar2.f27569h), jSONObject2.optInt("mfcl", uVar2.f27570i), jSONObject2.optInt("wvul", uVar2.f27578q), m30965a(jSONObject2.optJSONArray(InneractiveMediationDefs.GENDER_FEMALE)));
    }

    /* renamed from: a */
    private static JSONArray m30968a(List<C11215em> list) {
        JSONArray jSONArray = new JSONArray();
        for (C11215em next : list) {
            try {
                jSONArray.put(new JSONObject().put("ft", next.f26845a.f26852a).put("fv", next.f26846b));
            } catch (Throwable unused) {
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    private static List<C11215em> m30965a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    arrayList.add(new C11215em(C11215em.C11217b.m28893a(jSONObject.getInt("ft")), jSONObject.optString("fv")));
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C10921Xa m30959a(JSONObject jSONObject) {
        return new C10921Xa(m30958a(jSONObject, "activation"), m30958a(jSONObject, "satellite_clids"), m30958a(jSONObject, "preload_info"));
    }

    /* renamed from: a */
    public static JSONObject m30973a(C10921Xa xa) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("activation", m30972a(xa.f26252a));
            jSONObject.putOpt("preload_info", m30972a(xa.f26254c));
            jSONObject.putOpt("satellite_clids", m30972a(xa.f26253b));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static C10880Wa m30958a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            return new C10880Wa(optJSONObject.optLong("exp_t"), optJSONObject.optInt(TJAdUnitConstants.String.INTERVAL));
        }
        return null;
    }

    /* renamed from: a */
    private static JSONObject m30972a(C10880Wa wa) {
        if (wa == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("exp_t", wa.f26152a).put(TJAdUnitConstants.String.INTERVAL, wa.f26153b);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static String m30963a(C11900w2 w2Var) {
        JSONObject jSONObject;
        if (w2Var == null) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("width", w2Var.mo64003e()).put("height", w2Var.mo64001c()).put("dpi", w2Var.mo64000b()).put("scaleFactor", (double) w2Var.mo64002d()).putOpt("deviceType", w2Var.mo63999a() == null ? null : w2Var.mo63999a().mo60963a());
            } catch (Throwable unused) {
            }
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }
}
