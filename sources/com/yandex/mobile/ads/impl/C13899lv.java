package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.yandex.mobile.ads.impl.C15266yr;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.lv */
public class C13899lv implements qh0, ci0<C13784kv> {

    /* renamed from: b */
    private static final Function3<String, JSONObject, ly0, C15266yr> f36925b = C13901b.f36928b;

    /* renamed from: a */
    public final v60<C15347zr> f36926a;

    /* renamed from: com.yandex.mobile.ads.impl.lv$a */
    static final class C13900a extends Lambda implements Function2<ly0, JSONObject, C13899lv> {

        /* renamed from: b */
        public static final C13900a f36927b = new C13900a();

        C13900a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C13899lv(ly0, (C13899lv) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lv$b */
    static final class C13901b extends Lambda implements Function3<String, JSONObject, ly0, C15266yr> {

        /* renamed from: b */
        public static final C13901b f36928b = new C13901b();

        C13901b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C15266yr.C15269c cVar = C15266yr.f42914c;
            Object a = zh0.m44612a(jSONObject, str, C15266yr.f42918g, ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, DivFixed…CREATOR, env.logger, env)");
            return (C15266yr) a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lv$c */
    static final class C13902c extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C13902c f36929b = new C13902c();

        C13902c() {
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
        C13902c cVar = C13902c.f36929b;
        C13900a aVar = C13900a.f36927b;
    }

    public C13899lv(ly0 ly0, C13899lv lvVar, boolean z, JSONObject jSONObject) {
        v60<C15347zr> v60;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (lvVar == null) {
            v60 = null;
        } else {
            v60 = lvVar.f36926a;
        }
        v60<C15347zr> a = di0.m35286a(jSONObject, "neighbour_page_width", z, v60, C15347zr.f43304c.mo71278a(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(a, "readField(json, \"neighbo…ate.CREATOR, logger, env)");
        this.f36926a = a;
    }

    /* renamed from: b */
    public C13784kv mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        return new C13784kv((C15266yr) w60.m43546f(this.f36926a, ly0, "neighbour_page_width", jSONObject, f36925b));
    }
}
