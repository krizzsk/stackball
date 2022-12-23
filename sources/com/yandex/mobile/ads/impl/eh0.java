package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public class eh0 implements qh0, ci0<dh0> {

    /* renamed from: c */
    private static final rh1<String> f32974c = $$Lambda$eh0$3x6rg6P3MbOdxThQK8L6pTeQze8.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final rh1<String> f32975d = $$Lambda$eh0$V3tz4HrvtPzYfuiuuZZdx6L2hww.INSTANCE;

    /* renamed from: e */
    private static final Function3<String, JSONObject, ly0, String> f32976e = C12976b.f32981b;

    /* renamed from: f */
    private static final Function3<String, JSONObject, ly0, Integer> f32977f = C12978d.f32983b;

    /* renamed from: a */
    public final v60<String> f32978a;

    /* renamed from: b */
    public final v60<Integer> f32979b;

    /* renamed from: com.yandex.mobile.ads.impl.eh0$a */
    static final class C12975a extends Lambda implements Function2<ly0, JSONObject, eh0> {

        /* renamed from: b */
        public static final C12975a f32980b = new C12975a();

        C12975a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new eh0(ly0, (eh0) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.eh0$b */
    static final class C12976b extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C12976b f32981b = new C12976b();

        C12976b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            Object a = zh0.m44608a(jSONObject, str, eh0.f32975d, ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, NAME_VALIDATOR, env.logger, env)");
            return (String) a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.eh0$c */
    static final class C12977c extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C12977c f32982b = new C12977c();

        C12977c() {
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

    /* renamed from: com.yandex.mobile.ads.impl.eh0$d */
    static final class C12978d extends Lambda implements Function3<String, JSONObject, ly0, Integer> {

        /* renamed from: b */
        public static final C12978d f32983b = new C12978d();

        C12978d() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            Object a = zh0.m44609a(jSONObject, str, ky0.m38514d(), ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, NUMBER_TO_INT, env.logger, env)");
            return (Integer) a;
        }
    }

    static {
        C12977c cVar = C12977c.f32982b;
        C12975a aVar = C12975a.f32980b;
    }

    public eh0(ly0 ly0, eh0 eh0, boolean z, JSONObject jSONObject) {
        v60<String> v60;
        v60<Integer> v602;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (eh0 == null) {
            v60 = null;
        } else {
            v60 = eh0.f32978a;
        }
        v60<String> a = di0.m35278a(jSONObject, "name", z, v60, f32974c, b, ly0);
        Intrinsics.checkNotNullExpressionValue(a, "readField(json, \"name\", …E_VALIDATOR, logger, env)");
        this.f32978a = a;
        if (eh0 == null) {
            v602 = null;
        } else {
            v602 = eh0.f32979b;
        }
        v60<Integer> a2 = di0.m35281a(jSONObject, "value", z, v602, ky0.m38514d(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(a2, "readField(json, \"value\",…MBER_TO_INT, logger, env)");
        this.f32979b = a2;
    }

    /* renamed from: b */
    public dh0 mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        return new dh0((String) w60.m43539a(this.f32978a, ly0, "name", jSONObject, f32976e), ((Number) w60.m43539a(this.f32979b, ly0, "value", jSONObject, f32977f)).intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m35665a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m35666b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }
}
