package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public class lb1 implements qh0, ci0<kb1> {

    /* renamed from: c */
    private static final rh1<String> f36628c = $$Lambda$lb1$y5tQseohBixfAuquj1ya0FfH8g.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final rh1<String> f36629d = $$Lambda$lb1$R_ivb9Rthm9JJYWnfx_iCIACYy0.INSTANCE;

    /* renamed from: e */
    private static final Function3<String, JSONObject, ly0, String> f36630e = C13849b.f36635b;

    /* renamed from: f */
    private static final Function3<String, JSONObject, ly0, String> f36631f = C13851d.f36637b;

    /* renamed from: a */
    public final v60<String> f36632a;

    /* renamed from: b */
    public final v60<String> f36633b;

    /* renamed from: com.yandex.mobile.ads.impl.lb1$a */
    static final class C13848a extends Lambda implements Function2<ly0, JSONObject, lb1> {

        /* renamed from: b */
        public static final C13848a f36634b = new C13848a();

        C13848a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new lb1(ly0, (lb1) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lb1$b */
    static final class C13849b extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C13849b f36635b = new C13849b();

        C13849b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            Object a = zh0.m44608a(jSONObject, str, lb1.f36629d, ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, NAME_VALIDATOR, env.logger, env)");
            return (String) a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lb1$c */
    static final class C13850c extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C13850c f36636b = new C13850c();

        C13850c() {
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

    /* renamed from: com.yandex.mobile.ads.impl.lb1$d */
    static final class C13851d extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C13851d f36637b = new C13851d();

        C13851d() {
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
        C13850c cVar = C13850c.f36636b;
        C13848a aVar = C13848a.f36634b;
    }

    public lb1(ly0 ly0, lb1 lb1, boolean z, JSONObject jSONObject) {
        v60<String> v60;
        v60<String> v602;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (lb1 == null) {
            v60 = null;
        } else {
            v60 = lb1.f36632a;
        }
        v60<String> a = di0.m35278a(jSONObject, "name", z, v60, f36628c, b, ly0);
        Intrinsics.checkNotNullExpressionValue(a, "readField(json, \"name\", …E_VALIDATOR, logger, env)");
        this.f36632a = a;
        if (lb1 == null) {
            v602 = null;
        } else {
            v602 = lb1.f36633b;
        }
        v60<String> a2 = di0.m35277a(jSONObject, "value", z, v602, b, ly0);
        Intrinsics.checkNotNullExpressionValue(a2, "readField(json, \"value\",…rent?.value, logger, env)");
        this.f36633b = a2;
    }

    /* renamed from: b */
    public kb1 mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        return new kb1((String) w60.m43539a(this.f36632a, ly0, "name", jSONObject, f36630e), (String) w60.m43539a(this.f36633b, ly0, "value", jSONObject, f36631f));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m38715a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m38716b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }
}
