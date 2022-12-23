package com.ironsource.sdk.controller;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.p151h.C6017b;
import com.ironsource.sdk.p151h.C6020c;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.l */
final class C5896l {

    /* renamed from: a */
    String f14405a;

    /* renamed from: b */
    C6017b f14406b;

    C5896l(String str, C6017b bVar) {
        this.f14405a = str;
        this.f14406b = bVar;
    }

    /* renamed from: a */
    static C6020c m14543a(JSONObject jSONObject, String str) {
        if (!jSONObject.has("filePath") || !jSONObject.has("fileName")) {
            throw new Exception("Missing params for file");
        }
        String string = jSONObject.getString("filePath");
        return new C6020c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString("fileName"));
    }

    /* renamed from: a */
    static JSONObject m14544a(C5899n nVar, long j) {
        try {
            return nVar.mo42316a().put(IronSourceConstants.EVENTS_RESULT, j);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: a */
    static JSONObject m14545a(C5899n nVar, String str) {
        try {
            return nVar.mo42316a().put("errMsg", str);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: a */
    static JSONObject m14546a(C5899n nVar, JSONObject jSONObject) {
        try {
            return nVar.mo42316a().put(IronSourceConstants.EVENTS_RESULT, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: b */
    static C6020c m14547b(JSONObject jSONObject, String str) {
        if (jSONObject.has("folderPath")) {
            return new C6020c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString("folderPath")));
        }
        throw new Exception("Missing params for folder");
    }
}
