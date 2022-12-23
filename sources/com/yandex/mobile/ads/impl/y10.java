package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public class y10 implements qh0, ci0<x10> {

    /* renamed from: b */
    private static final Function3<String, JSONObject, ly0, f50<Boolean>> f42737b = C15225a.f42739b;

    /* renamed from: a */
    public final v60<f50<Boolean>> f42738a;

    /* renamed from: com.yandex.mobile.ads.impl.y10$a */
    static final class C15225a extends Lambda implements Function3<String, JSONObject, ly0, f50<Boolean>> {

        /* renamed from: b */
        public static final C15225a f42739b = new C15225a();

        C15225a() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44621b(jSONObject, str, ky0.m38512b(), ly0.mo66818b(), ly0, dg1.f32573a);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.y10$b */
    static final class C15226b extends Lambda implements Function2<ly0, JSONObject, y10> {

        /* renamed from: b */
        public static final C15226b f42740b = new C15226b();

        C15226b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new y10(ly0, (y10) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.y10$c */
    static final class C15227c extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C15227c f42741b = new C15227c();

        C15227c() {
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
        C15227c cVar = C15227c.f42741b;
        C15226b bVar = C15226b.f42740b;
    }

    public y10(ly0 ly0, y10 y10, boolean z, JSONObject jSONObject) {
        v60<f50<Boolean>> v60;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (y10 == null) {
            v60 = null;
        } else {
            v60 = y10.f42738a;
        }
        v60<f50<f50<Boolean>>> b2 = di0.m35293b(jSONObject, "constrained", z, v60, ky0.m38512b(), b, ly0, dg1.f32573a);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.f42738a = b2;
    }

    /* renamed from: b */
    public x10 mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        return new x10(w60.m43544d(this.f42738a, ly0, "constrained", jSONObject, f42737b));
    }
}
