package com.flurry.sdk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.facebook.AccessToken;
import com.facebook.appevents.codeless.internal.Constants;
import com.flurry.android.FlurryPrivacySession;
import com.flurry.sdk.C2537di;
import com.flurry.sdk.C2542dk;
import com.flurry.sdk.C2634ex;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.fa */
public class C2639fa {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f6198a = C2639fa.class.getSimpleName();

    /* renamed from: b */
    private static C2639fa f6199b = new C2639fa();

    private C2639fa() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m5746b(Context context, FlurryPrivacySession.C2326a aVar) {
        Intent intent = new Intent("android.intent.action.VIEW", aVar.f5323a);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m5743a(final FlurryPrivacySession.Request request) {
        C2494ck.m5371a().mo17685b(new C2621eo() {
            /* renamed from: a */
            public final void mo17573a() {
                Map b = C2639fa.m5745b(request);
                C2537di diVar = new C2537di();
                diVar.f5970g = "https://api.login.yahoo.com/oauth2/device_session";
                diVar.f5971h = C2542dk.C2545a.kPost;
                diVar.mo17759a("Content-Type", WebRequest.CONTENT_TYPE_JSON);
                diVar.f5954b = new JSONObject(b).toString();
                diVar.f5956d = new C2588dx();
                diVar.f5955c = new C2588dx();
                diVar.f5953a = new C2537di.C2539a<String, String>() {
                    /* renamed from: a */
                    public final /* synthetic */ void mo17574a(C2537di diVar, Object obj) {
                        String str = (String) obj;
                        try {
                            int i = diVar.f5980q;
                            if (i == 200) {
                                JSONObject jSONObject = new JSONObject(str);
                                C2639fa.m5744a(C2639fa.this, new FlurryPrivacySession.C2326a(jSONObject.getString(Constants.DEVICE_SESSION_ID), jSONObject.getLong(AccessToken.EXPIRES_IN_KEY), request));
                                if (request.callback != null) {
                                    request.callback.success();
                                    return;
                                }
                                return;
                            }
                            C2530db.m5490e(C2639fa.f6198a, "Error in getting privacy dashboard url. Error code = ".concat(String.valueOf(i)));
                            if (request.callback != null) {
                                request.callback.failure();
                            }
                        } catch (JSONException e) {
                            C2530db.m5483b(C2639fa.f6198a, "Error in getting privacy dashboard url. ", (Throwable) e);
                            if (request.callback != null) {
                                request.callback.failure();
                            }
                        }
                    }
                };
                C2485cg.m5355a().mo17728a((Object) C2639fa.this, diVar);
            }
        });
    }

    /* renamed from: b */
    static /* synthetic */ Map m5745b(FlurryPrivacySession.Request request) {
        HashMap hashMap = new HashMap();
        hashMap.put("device_verifier", request.verifier);
        HashMap hashMap2 = new HashMap();
        String d = C2451bs.m5276a().mo17650d();
        if (d != null) {
            hashMap2.put("gpaid", d);
        }
        String str = C2451bs.m5276a().f5717b;
        if (str != null) {
            hashMap2.put("andid", str);
        }
        hashMap.putAll(hashMap2);
        HashMap hashMap3 = new HashMap();
        byte[] e = C2451bs.m5276a().mo17651e();
        if (e != null) {
            hashMap3.put("flurry_guid", C2619em.m5696a(e));
        }
        hashMap3.put("flurry_project_api_key", C2494ck.m5371a().f5833b);
        hashMap.putAll(hashMap3);
        Context context = request.context;
        HashMap hashMap4 = new HashMap();
        hashMap4.put("src", "flurryandroidsdk");
        hashMap4.put("srcv", "11.5.0");
        hashMap4.put("appsrc", context.getPackageName());
        C2476cb.m5335a();
        hashMap4.put("appsrcv", C2476cb.m5336a(context));
        hashMap.putAll(hashMap4);
        return hashMap;
    }

    /* renamed from: a */
    static /* synthetic */ void m5744a(C2639fa faVar, final FlurryPrivacySession.C2326a aVar) {
        Context context = C2494ck.m5371a().f5832a;
        if (C2634ex.m5735a(context)) {
            C2634ex.m5734a(context, new CustomTabsIntent.Builder().setShowTitle(true).build(), Uri.parse(aVar.f5323a.toString()), new C2634ex.C2635a() {
                /* renamed from: a */
                public final void mo17836a(Context context) {
                    C2639fa.m5746b(context, aVar);
                }
            });
        } else {
            m5746b(context, aVar);
        }
    }
}
