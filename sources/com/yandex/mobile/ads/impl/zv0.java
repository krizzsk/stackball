package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public class zv0 implements qh0, ci0<yv0> {

    /* renamed from: c */
    private static final rh1<String> f43336c = $$Lambda$zv0$NhGpG9Wh2AcCj7lny1S5qfNkLe0.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final rh1<String> f43337d = $$Lambda$zv0$zKG_UFl7ROPeMfW4mzzSp9DixX0.INSTANCE;

    /* renamed from: e */
    private static final Function3<String, JSONObject, ly0, String> f43338e = C15359b.f43343b;

    /* renamed from: f */
    private static final Function3<String, JSONObject, ly0, Double> f43339f = C15361d.f43345b;

    /* renamed from: a */
    public final v60<String> f43340a;

    /* renamed from: b */
    public final v60<Double> f43341b;

    /* renamed from: com.yandex.mobile.ads.impl.zv0$a */
    static final class C15358a extends Lambda implements Function2<ly0, JSONObject, zv0> {

        /* renamed from: b */
        public static final C15358a f43342b = new C15358a();

        C15358a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new zv0(ly0, (zv0) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zv0$b */
    static final class C15359b extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C15359b f43343b = new C15359b();

        C15359b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            Object a = zh0.m44608a(jSONObject, str, zv0.f43337d, ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, NAME_VALIDATOR, env.logger, env)");
            return (String) a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zv0$c */
    static final class C15360c extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C15360c f43344b = new C15360c();

        C15360c() {
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

    /* renamed from: com.yandex.mobile.ads.impl.zv0$d */
    static final class C15361d extends Lambda implements Function3<String, JSONObject, ly0, Double> {

        /* renamed from: b */
        public static final C15361d f43345b = new C15361d();

        C15361d() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            Object a = zh0.m44609a(jSONObject, str, ky0.m38513c(), ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, NUMBER_TO_DOUBLE, env.logger, env)");
            return (Double) a;
        }
    }

    static {
        C15360c cVar = C15360c.f43344b;
        C15358a aVar = C15358a.f43342b;
    }

    public zv0(ly0 ly0, zv0 zv0, boolean z, JSONObject jSONObject) {
        v60<String> v60;
        v60<Double> v602;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (zv0 == null) {
            v60 = null;
        } else {
            v60 = zv0.f43340a;
        }
        v60<String> a = di0.m35278a(jSONObject, "name", z, v60, f43336c, b, ly0);
        Intrinsics.checkNotNullExpressionValue(a, "readField(json, \"name\", …E_VALIDATOR, logger, env)");
        this.f43340a = a;
        if (zv0 == null) {
            v602 = null;
        } else {
            v602 = zv0.f43341b;
        }
        v60<Double> a2 = di0.m35281a(jSONObject, "value", z, v602, ky0.m38513c(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(a2, "readField(json, \"value\",…R_TO_DOUBLE, logger, env)");
        this.f43341b = a2;
    }

    /* renamed from: b */
    public yv0 mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        return new yv0((String) w60.m43539a(this.f43340a, ly0, "name", jSONObject, f43338e), ((Number) w60.m43539a(this.f43341b, ly0, "value", jSONObject, f43339f)).doubleValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m44793a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m44794b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }
}
