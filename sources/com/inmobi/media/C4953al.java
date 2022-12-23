package com.inmobi.media;

import android.text.TextUtils;
import android.util.Base64;
import com.inmobi.media.C5220ev;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.al */
/* compiled from: AdFactory */
public final class C4953al {

    /* renamed from: a */
    private static final String f11221a = C4948ah.class.getSimpleName();

    /* renamed from: a */
    private static void m11181a(C4948ah ahVar, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("pubContent");
            if (!jSONObject2.isNull("rootContainer")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("rootContainer");
                JSONArray jSONArray = new JSONArray();
                for (String a : m11187e(jSONObject3)) {
                    m11183a(jSONArray, a, (byte) 2);
                }
                for (String a2 : m11188f(jSONObject3)) {
                    m11183a(jSONArray, a2, (byte) 1);
                }
                boolean d = m11186d(jSONObject3);
                ahVar.assetUrls = jSONArray;
                ahVar.mIsPreloadWebView = d;
            }
        } catch (Exception e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        }
    }

    /* renamed from: a */
    public static C4948ah m11178a(C4948ah ahVar, C5220ev evVar) throws JSONException {
        String b;
        if (!"inmobiJson".equals(ahVar.mo40039i())) {
            return ahVar;
        }
        JSONObject jSONObject = new JSONObject(ahVar.mo40041k());
        String c = m11185c(jSONObject.getJSONObject("rootContainer"));
        if (c.trim().length() == 0) {
            return ahVar;
        }
        C5094cv a = new C5088cs(evVar.vastVideo).mo40353a(c);
        JSONArray jSONArray = ahVar.assetUrls;
        if (a.f11681f != 0 || (b = a.mo40359b()) == null || b.isEmpty()) {
            return null;
        }
        m11183a(jSONArray, b, (byte) 0);
        List<String> a2 = m11180a(jSONObject, evVar.vastVideo);
        a2.size();
        for (String a3 : a2) {
            m11183a(jSONArray, a3, (byte) 0);
        }
        try {
            for (String a4 : m11179a(jSONObject)) {
                m11183a(jSONArray, a4, (byte) 2);
            }
            for (String a5 : m11184b(jSONObject)) {
                m11183a(jSONArray, a5, (byte) 1);
            }
        } catch (Exception unused) {
        }
        return new C5002ay(ahVar, jSONArray, a.mo40359b(), a.f11677b, a.f11678c, a.f11679d, a.f11680e);
    }

    /* renamed from: a */
    private static void m11183a(JSONArray jSONArray, String str, byte b) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", b);
        jSONObject.put("url", str);
        jSONArray.put(jSONObject);
    }

    /* renamed from: a */
    private static List<String> m11180a(JSONObject jSONObject, C5220ev.C5232i iVar) {
        C5094cv a;
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("pages");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (!jSONArray.getJSONObject(i).isNull("rootContainer")) {
                    String c = m11185c(jSONArray.getJSONObject(i).getJSONObject("rootContainer"));
                    if (!(c.trim().length() == 0 || (a = new C5088cs(iVar).mo40353a(c)) == null)) {
                        if (a.f11681f == 0) {
                            String b = a.mo40359b();
                            if (b != null && !b.isEmpty()) {
                                arrayList.add(b);
                            }
                        }
                    }
                }
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    /* renamed from: a */
    private static List<String> m11179a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("pages");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (!jSONArray.getJSONObject(i).isNull("rootContainer")) {
                    arrayList.addAll(m11187e(jSONArray.getJSONObject(i).getJSONObject("rootContainer")));
                }
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    /* renamed from: b */
    private static List<String> m11184b(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("pages");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (!jSONArray.getJSONObject(i).isNull("rootContainer")) {
                    arrayList.addAll(m11188f(jSONArray.getJSONObject(i).getJSONObject("rootContainer")));
                }
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    /* renamed from: c */
    private static String m11185c(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            if (jSONArray.length() == 0) {
                return "";
            }
            String string = jSONObject.getString("assetType");
            if ("video".equalsIgnoreCase(string)) {
                return jSONArray.getString(0);
            }
            if (!TtmlNode.RUBY_CONTAINER.equalsIgnoreCase(string)) {
                return "";
            }
            String str = "";
            for (int i = 0; i < jSONArray.length(); i++) {
                str = m11185c(jSONArray.getJSONObject(i));
                if (str.trim().length() != 0) {
                    break;
                }
            }
            return str;
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return "";
        }
    }

    /* renamed from: d */
    private static boolean m11186d(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            if (jSONArray.length() == 0) {
                return false;
            }
            String string = jSONObject.getString("assetType");
            if ("webview".equalsIgnoreCase(string)) {
                if (jSONObject.isNull("preload") || !jSONObject.getBoolean("preload")) {
                    return false;
                }
                return true;
            } else if (!TtmlNode.RUBY_CONTAINER.equalsIgnoreCase(string)) {
                return false;
            } else {
                int i = 0;
                boolean z = false;
                while (i < jSONArray.length() && !(z = m11186d(jSONArray.getJSONObject(i)))) {
                    i++;
                }
                return z;
            }
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return false;
        }
    }

    /* renamed from: e */
    private static List<String> m11187e(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            if (jSONArray.length() == 0) {
                return arrayList;
            }
            String string = jSONObject.getString("assetType");
            if ("image".equalsIgnoreCase(string)) {
                if (!jSONObject.isNull("preload") && jSONObject.getBoolean("preload")) {
                    arrayList.add(jSONArray.getString(0));
                }
                return arrayList;
            }
            if (TtmlNode.RUBY_CONTAINER.equalsIgnoreCase(string)) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.addAll(m11187e(jSONArray.getJSONObject(i)));
                }
            }
            return arrayList;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: f */
    private static List<String> m11188f(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            if (jSONArray.length() == 0) {
                return arrayList;
            }
            String string = jSONObject.getString("assetType");
            if ("gif".equalsIgnoreCase(string)) {
                arrayList.add(jSONArray.getString(0));
                return arrayList;
            }
            if (TtmlNode.RUBY_CONTAINER.equalsIgnoreCase(string)) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.addAll(m11188f(jSONArray.getJSONObject(i)));
                }
            }
            return arrayList;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m11182a(C4948ah ahVar, JSONObject jSONObject, String str, C5074ck ckVar, long j) throws JSONException, IllegalStateException {
        long j2;
        if ("unknown".equals(ahVar.markupType) || TextUtils.isEmpty(ahVar.impressionId)) {
            throw new IllegalStateException("Invalid Ad");
        }
        long optLong = jSONObject.optLong("expiry", TimeUnit.MILLISECONDS.toSeconds(j));
        if (optLong <= 0) {
            j2 = -1;
        } else {
            j2 = TimeUnit.SECONDS.toMillis(optLong);
        }
        float f = 0.0f;
        if (jSONObject.has(BidResponsed.KEY_BID_ID) && ckVar != null) {
            f = Float.parseFloat(C5300gd.m12137a(C5339hc.m12320a(Base64.decode(jSONObject.getString(BidResponsed.KEY_BID_ID), 0), ckVar.f11614b, ckVar.f11613a)));
        }
        ahVar.mAdContent = jSONObject;
        ahVar.mAdType = str;
        ahVar.mInsertionTimestampInMillis = System.currentTimeMillis();
        ahVar.mExpiryDurationInMillis = j2;
        ahVar.mBid = f;
        if ("inmobiJson".equals(ahVar.mo40039i())) {
            m11181a(ahVar, jSONObject);
        }
    }
}
