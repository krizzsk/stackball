package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.yandex.mobile.ads.impl.C13590jw;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.nv */
public class C14132nv implements qh0, ci0<C14018mv> {

    /* renamed from: b */
    private static final Function3<String, JSONObject, ly0, C13590jw> f37913b = C14134b.f37916b;

    /* renamed from: a */
    public final v60<C13789kw> f37914a;

    /* renamed from: com.yandex.mobile.ads.impl.nv$a */
    static final class C14133a extends Lambda implements Function2<ly0, JSONObject, C14132nv> {

        /* renamed from: b */
        public static final C14133a f37915b = new C14133a();

        C14133a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C14132nv(ly0, (C14132nv) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nv$b */
    static final class C14134b extends Lambda implements Function3<String, JSONObject, ly0, C13590jw> {

        /* renamed from: b */
        public static final C14134b f37916b = new C14134b();

        C14134b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C13590jw.C13592b bVar = C13590jw.f35651b;
            Object a = zh0.m44612a(jSONObject, str, C13590jw.f35653d, ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, DivPerce…CREATOR, env.logger, env)");
            return (C13590jw) a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nv$c */
    static final class C14135c extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C14135c f37917b = new C14135c();

        C14135c() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            Object a = zh0.m44607a(jSONObject, str, ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, env.logger, env)");
            return (String) a;
        }
    }

    static {
        C14135c cVar = C14135c.f37917b;
        C14133a aVar = C14133a.f37915b;
    }

    public C14132nv(ly0 ly0, C14132nv nvVar, boolean z, JSONObject jSONObject) {
        v60<C13789kw> v60;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (nvVar == null) {
            v60 = null;
        } else {
            v60 = nvVar.f37914a;
        }
        v60<C13789kw> a = di0.m35286a(jSONObject, "page_width", z, v60, C13789kw.f36430b.mo68278a(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(a, "readField(json, \"page_wi…ate.CREATOR, logger, env)");
        this.f37914a = a;
    }

    /* renamed from: b */
    public C14018mv mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        return new C14018mv((C13590jw) w60.m43546f(this.f37914a, ly0, "page_width", jSONObject, f37913b));
    }
}
