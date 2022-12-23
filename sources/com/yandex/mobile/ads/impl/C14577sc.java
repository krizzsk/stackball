package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.sc */
public class C14577sc implements qh0, ci0<C14452rc> {

    /* renamed from: c */
    private static final rh1<String> f39913c = $$Lambda$sc$z8p_9Nl1ceBswKQn8feazkI6Nws.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final rh1<String> f39914d = $$Lambda$sc$jxdv0Ktq1Xo1EZJsZryqdJxm1OQ.INSTANCE;

    /* renamed from: e */
    private static final Function3<String, JSONObject, ly0, String> f39915e = C14579b.f39920b;

    /* renamed from: f */
    private static final Function3<String, JSONObject, ly0, Boolean> f39916f = C14581d.f39922b;

    /* renamed from: a */
    public final v60<String> f39917a;

    /* renamed from: b */
    public final v60<Boolean> f39918b;

    /* renamed from: com.yandex.mobile.ads.impl.sc$a */
    static final class C14578a extends Lambda implements Function2<ly0, JSONObject, C14577sc> {

        /* renamed from: b */
        public static final C14578a f39919b = new C14578a();

        C14578a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C14577sc(ly0, (C14577sc) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sc$b */
    static final class C14579b extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C14579b f39920b = new C14579b();

        C14579b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            Object a = zh0.m44608a(jSONObject, str, C14577sc.f39914d, ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, NAME_VALIDATOR, env.logger, env)");
            return (String) a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sc$c */
    static final class C14580c extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C14580c f39921b = new C14580c();

        C14580c() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return (String) zh0.m44624b(jSONObject, str, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sc$d */
    static final class C14581d extends Lambda implements Function3<String, JSONObject, ly0, Boolean> {

        /* renamed from: b */
        public static final C14581d f39922b = new C14581d();

        C14581d() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            Object a = zh0.m44609a(jSONObject, str, ky0.m38512b(), ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, NUMBER_T…BOOLEAN, env.logger, env)");
            return (Boolean) a;
        }
    }

    static {
        C14580c cVar = C14580c.f39921b;
        C14578a aVar = C14578a.f39919b;
    }

    public C14577sc(ly0 ly0, C14577sc scVar, boolean z, JSONObject jSONObject) {
        v60<String> v60;
        v60<Boolean> v602;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (scVar == null) {
            v60 = null;
        } else {
            v60 = scVar.f39917a;
        }
        v60<String> a = di0.m35278a(jSONObject, "name", z, v60, f39913c, b, ly0);
        Intrinsics.checkNotNullExpressionValue(a, "readField(json, \"name\", …E_VALIDATOR, logger, env)");
        this.f39917a = a;
        if (scVar == null) {
            v602 = null;
        } else {
            v602 = scVar.f39918b;
        }
        v60<Boolean> a2 = di0.m35281a(jSONObject, "value", z, v602, ky0.m38512b(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(a2, "readField(json, \"value\",…_TO_BOOLEAN, logger, env)");
        this.f39918b = a2;
    }

    /* renamed from: b */
    public C14452rc mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        return new C14452rc((String) w60.m43539a(this.f39917a, ly0, "name", jSONObject, f39915e), ((Boolean) w60.m43539a(this.f39918b, ly0, "value", jSONObject, f39916f)).booleanValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m41899a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m41900b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }
}
