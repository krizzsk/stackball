package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.facebook.internal.NativeProtocol;
import com.ironsource.sdk.controller.C5923w;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.h */
final class C5889h {

    /* renamed from: c */
    private static final String f14389c = C5889h.class.getCanonicalName();

    /* renamed from: a */
    private final C5861d f14390a;

    /* renamed from: b */
    private final C5919t f14391b;

    C5889h(C5861d dVar, C5919t tVar) {
        this.f14390a = dVar;
        this.f14391b = tVar;
    }

    /* renamed from: a */
    private static String m14534a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", SDKUtils.encodeString(str));
            jSONObject.put(NativeProtocol.WEB_DIALOG_PARAMS, SDKUtils.encodeString(str2));
            jSONObject.put("hash", SDKUtils.encodeString(str3));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public final void messageHandler(String str, String str2, String str3) {
        try {
            String str4 = f14389c;
            Logger.m14957i(str4, "messageHandler(" + str + " " + str3 + ")");
            if (this.f14391b.mo42332a(str, str2, str3)) {
                this.f14390a.mo42248a(str, str2);
                return;
            }
            C5861d dVar = this.f14390a;
            String a = m14534a(str, str2, str3);
            if (dVar.f14297a != null) {
                C5923w.C5942d dVar2 = dVar.f14297a;
                C5923w.this.mo42342b(C5923w.m14624a("unauthorizedMessage", a, (String) null, (String) null));
            }
        } catch (Exception e) {
            e.printStackTrace();
            String str5 = f14389c;
            Logger.m14957i(str5, "messageHandler failed with exception " + e.getMessage());
        }
    }
}
