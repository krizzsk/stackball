package com.ogury.core.internal.crash;

import com.appsflyer.ServerParameters;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.ogury.core.internal.C7918af;
import com.ogury.core.internal.C7921ai;
import com.ogury.core.internal.C7980h;
import com.tapjoy.TapjoyConstants;
import org.json.JSONObject;

/* renamed from: com.ogury.core.internal.crash.e */
/* compiled from: CrashFormatter.kt */
public final class C7952e {

    /* renamed from: a */
    private final SdkInfo f20730a;

    static {
        new C7953a((byte) 0);
    }

    public C7952e(SdkInfo sdkInfo) {
        C7921ai.m22144b(sdkInfo, "sdkInfo");
        this.f20730a = sdkInfo;
    }

    /* renamed from: com.ogury.core.internal.crash.e$a */
    /* compiled from: CrashFormatter.kt */
    public static final class C7953a {
        private C7953a() {
        }

        public /* synthetic */ C7953a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final JSONObject mo52933a(C7945a aVar, C7969o oVar, Throwable th, String str) {
        String str2;
        C7921ai.m22144b(aVar, "appInfo");
        C7921ai.m22144b(oVar, "phoneInfo");
        C7921ai.m22144b(th, "throwable");
        C7921ai.m22144b(str, "stackTrace");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("created_at", System.currentTimeMillis());
        jSONObject.put(ServerParameters.SDK_DATA_SDK_VERSION, this.f20730a.getSdkVersion());
        jSONObject.put(TapjoyConstants.TJC_API_KEY, this.f20730a.getApiKey());
        jSONObject.put("aaid", this.f20730a.getAaid());
        jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, aVar.mo52919b());
        jSONObject.put("package_version", aVar.mo52918a());
        String a = oVar.mo52954a();
        if (a.length() > 16) {
            if (a != null) {
                a = a.substring(0, 16);
                C7921ai.m22142a((Object) a, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        jSONObject.put("phone_model", a);
        jSONObject.put("android_version", oVar.mo52955b());
        jSONObject.put("exception_type", th.getClass().getCanonicalName());
        C7971p c = oVar.mo52956c();
        StringBuilder sb = new StringBuilder();
        sb.append(th.getClass().getName());
        sb.append(" : ");
        sb.append(th.getMessage());
        if (c.mo52960d()) {
            str2 = " : Free[" + c.mo52957a() + "] Total[" + c.mo52958b() + "] Max[" + c.mo52959c() + "]";
        } else {
            str2 = "";
        }
        sb.append(str2);
        jSONObject.put("message", sb.toString());
        jSONObject.put("stacktrace", str);
        jSONObject.put("number_of_crashes", 1);
        jSONObject.put("number_of_crashes_on_last_upload", 0);
        return jSONObject;
    }

    /* renamed from: a */
    public static String m22187a(Throwable th) {
        C7921ai.m22144b(th, "throwable");
        StackTraceElement[] stackTrace = th.getStackTrace();
        C7921ai.m22142a((Object) stackTrace, "throwable.stackTrace");
        return C7980h.m22236a((Object[]) stackTrace, (CharSequence) "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C7918af) null, 62);
    }
}
