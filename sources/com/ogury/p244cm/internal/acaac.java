package com.ogury.p244cm.internal;

import android.content.Context;
import android.content.res.Resources;
import android.net.NetworkInfo;
import android.util.DisplayMetrics;
import com.ogury.core.internal.InternalCore;
import com.ogury.p244cm.ConsentActivity;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.acaac */
public final class acaac {

    /* renamed from: a */
    public static final aaaaa f20524a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.acaac$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: a */
    public static String m21921a(Context context, String str) {
        Context context2 = context;
        bbabc.m22051b(context2, "context");
        bbabc.m22051b(str, "appKey");
        Context applicationContext = context.getApplicationContext();
        bbabc.m22048a((Object) applicationContext, "context.applicationContext");
        Resources resources = applicationContext.getResources();
        bbabc.m22048a((Object) resources, "context.applicationContext.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        bbabc.m22048a((Object) displayMetrics, "context.applicationConte….resources.displayMetrics");
        NetworkInfo a = ConsentActivity.aaaaa.m21625a(context);
        String typeName = a != null ? a.getTypeName() : null;
        Resources resources2 = context.getResources();
        bbabc.m22048a((Object) resources2, "context.resources");
        Context applicationContext2 = context.getApplicationContext();
        bbabc.m22048a((Object) applicationContext2, "context.applicationContext");
        String packageName = applicationContext2.getPackageName();
        bbabc.m22048a((Object) packageName, "context.applicationContext.packageName");
        String c = ConsentActivity.aaaaa.m21631c(context);
        String token = InternalCore.getToken(context2, "consent_token");
        bbabc.m22048a((Object) token, "InternalCore.getToken(context, \"consent_token\")");
        boolean z = !baaba.f20569a.isBillingDisabled();
        baabc baabc = baabc.f20594a;
        String a2 = baabc.m22006a();
        aacac aacac = aacac.f20366a;
        Boolean a3 = aacac.m21777a("IS_CHILD_UNDER_COPPA");
        aacac aacac2 = aacac.f20366a;
        String jSONObject = new acaab(displayMetrics, resources2, typeName, str, "android", packageName, "3.3.0", c, token, z, a2, a3, aacac.m21777a("IS_UNDER_AGE_OF_GDPR_CONSENT")).mo52733a().mo52729a().toString();
        bbabc.m22048a((Object) jSONObject, "requestBodyBuilder.build…serializedJson.toString()");
        return jSONObject;
    }

    /* renamed from: a */
    public static String m21922a(String str) {
        bbabc.m22051b(str, "errorMessage");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", "CONSENT_ERROR");
        jSONObject.put("errorMessage", str);
        String jSONObject2 = jSONObject.toString();
        bbabc.m22048a((Object) jSONObject2, "json.toString()");
        return jSONObject2;
    }
}
