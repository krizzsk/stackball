package com.fyber.inneractive.sdk.p029a;

import com.facebook.internal.NativeProtocol;
import com.fyber.inneractive.sdk.config.C2788f;
import com.fyber.inneractive.sdk.config.C2791i;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.a.b */
public final class C2698b implements C2681a<C2791i> {

    /* renamed from: a */
    private static final String f6361a = String.format("https://%sconfig_android.json", new Object[]{"cdn2.inner-active.mobi/ia-sdk-config/"});

    /* renamed from: a */
    public final String mo17886a() {
        return "IALastModifiedFromHeader.global";
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo17887a(Object obj) {
    }

    /* renamed from: b */
    public final String mo17888b() {
        return "ia-global.config";
    }

    /* renamed from: d */
    public final boolean mo17890d() {
        return true;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo17885a(String str) throws Exception {
        return m5859b(str);
    }

    /* renamed from: b */
    private static C2791i m5859b(String str) throws Exception {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C2791i iVar = new C2791i();
            JSONObject optJSONObject = jSONObject.optJSONObject(NativeProtocol.WEB_DIALOG_PARAMS);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("overrides");
            C2791i.m6089a(optJSONObject, iVar);
            C2791i.m6090b(optJSONObject2, iVar);
            return iVar;
        } catch (JSONException e) {
            IAlog.m9037e("internal error while parsing global config file", new Object[0]);
            throw e;
        }
    }

    /* renamed from: c */
    public final String mo17889c() {
        if (C2788f.m6080h() == null) {
            return f6361a;
        }
        return C2788f.m6080h();
    }
}
