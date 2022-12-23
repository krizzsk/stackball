package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TJAdUnitJSBridge;
import com.tapjoy.Tapjoy;
import com.tapjoy.TapjoyCache;
import com.tapjoy.TapjoyCachedAssetData;
import com.tapjoy.TapjoyLog;
import com.tapjoy.TapjoyUtil;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.eq */
public final class C9219eq {

    /* renamed from: b */
    public static String f22630b = "";

    /* renamed from: a */
    public TJAdUnitJSBridge f22631a;

    /* renamed from: c */
    public boolean f22632c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C9137cr f22633d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C9138cs f22634e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C9143cx f22635f = C9143cx.m24480a("Tapjoy", Tapjoy.getVersion());
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C9149dc f22636g;

    public C9219eq(TJAdUnitJSBridge tJAdUnitJSBridge) {
        this.f22631a = tJAdUnitJSBridge;
    }

    /* renamed from: a */
    public final boolean mo58023a(JSONObject jSONObject) {
        if (this.f22631a.f21931b == null) {
            TapjoyLog.m24273d("TJOMViewabilityAgent", "Can not init -- WebView is null");
            return false;
        } else if (this.f22631a.f21930a == null) {
            TapjoyLog.m24273d("TJOMViewabilityAgent", "Can not init -- TJAdUnit is null");
            return false;
        } else if (this.f22631a.f21930a.getVideoView() == null) {
            TapjoyLog.m24273d("TJOMViewabilityAgent", "Can not init -- VideoView is null");
            return false;
        } else if (jSONObject == null) {
            TapjoyLog.m24273d("TJOMViewabilityAgent", "Can not init -- json parameter is null");
            return false;
        } else if (!jSONObject.has(TJAdUnitConstants.String.OM_JAVASCRIPT_URL)) {
            TapjoyLog.m24273d("TJOMViewabilityAgent", "Can not init -- unable to parse om javascript url from json");
            return false;
        } else {
            try {
                jSONObject.getJSONArray(TJAdUnitConstants.String.VENDORS);
                return true;
            } catch (JSONException unused) {
                TapjoyLog.m24273d("TJOMViewabilityAgent", "Can not init -- unable to parse vendors from json");
                return false;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static List m24686b(JSONArray jSONArray) {
        C9144cy cyVar;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String optString = jSONObject.optString(TJAdUnitConstants.String.VENDOR_JS_URL, (String) null);
                if (optString == null) {
                    TapjoyLog.m24273d("TJOMViewabilityAgent", "Vendor JS URL not found. Skipping.");
                } else {
                    try {
                        URL url = new URL(optString);
                        String optString2 = jSONObject.optString(TJAdUnitConstants.String.VENDOR_NAME, (String) null);
                        String optString3 = jSONObject.optString(TJAdUnitConstants.String.VENDOR_PARAMETERS, (String) null);
                        if (optString3 == null || optString2 == null) {
                            cyVar = C9144cy.m24482a(url);
                        } else {
                            cyVar = C9144cy.m24481a(optString2, url, optString3);
                        }
                        arrayList.add(cyVar);
                    } catch (Exception unused) {
                        TapjoyLog.m24273d("TJOMViewabilityAgent", "Malformed vendor JS URL. Skipping " + optString);
                    }
                }
            } catch (JSONException unused2) {
                TapjoyLog.m24273d("TJOMViewabilityAgent", "Malformed vendor object. Skipping.");
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static void m24687b(JSONObject jSONObject) {
        if (C9067al.m24297a(f22630b)) {
            String optString = jSONObject.optString(TJAdUnitConstants.String.OM_JAVASCRIPT_URL, (String) null);
            if (optString == null) {
                TapjoyLog.m24273d("TJOMViewabilityAgent", "Open Mediation JavaScript name not found in json.");
                return;
            }
            try {
                TapjoyCachedAssetData cachedDataForURL = TapjoyCache.getInstance().getCachedDataForURL(optString);
                String str = "";
                if (cachedDataForURL == null) {
                    TapjoyCache.getInstance().cacheAssetFromURL(optString, str, 30).get();
                    cachedDataForURL = TapjoyCache.getInstance().getCachedDataForURL(optString);
                }
                if (cachedDataForURL != null) {
                    str = TapjoyUtil.getFileContents(new File(cachedDataForURL.getLocalFilePath()));
                }
                f22630b = str;
            } catch (Exception unused) {
                TapjoyLog.m24273d("TJOMViewabilityAgent", "Failed downloading Open Mediation JavaScript");
            }
        }
    }
}
