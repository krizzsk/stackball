package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.jg */
public class C13494jg implements qh0, ci0<C13409ig> {

    /* renamed from: c */
    private static final rh1<String> f35282c = $$Lambda$jg$AcestdV4SwIP8p7M6PTdnx3p0o.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final rh1<String> f35283d = $$Lambda$jg$w9kVCtRa3alAopFPwO45equW8tU.INSTANCE;

    /* renamed from: e */
    private static final Function3<String, JSONObject, ly0, String> f35284e = C13496b.f35289b;

    /* renamed from: f */
    private static final Function3<String, JSONObject, ly0, Integer> f35285f = C13498d.f35291b;

    /* renamed from: a */
    public final v60<String> f35286a;

    /* renamed from: b */
    public final v60<Integer> f35287b;

    /* renamed from: com.yandex.mobile.ads.impl.jg$a */
    static final class C13495a extends Lambda implements Function2<ly0, JSONObject, C13494jg> {

        /* renamed from: b */
        public static final C13495a f35288b = new C13495a();

        C13495a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C13494jg(ly0, (C13494jg) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jg$b */
    static final class C13496b extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C13496b f35289b = new C13496b();

        C13496b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            Object a = zh0.m44608a(jSONObject, str, C13494jg.f35283d, ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, NAME_VALIDATOR, env.logger, env)");
            return (String) a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jg$c */
    static final class C13497c extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C13497c f35290b = new C13497c();

        C13497c() {
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

    /* renamed from: com.yandex.mobile.ads.impl.jg$d */
    static final class C13498d extends Lambda implements Function3<String, JSONObject, ly0, Integer> {

        /* renamed from: b */
        public static final C13498d f35291b = new C13498d();

        C13498d() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            Object a = zh0.m44609a(jSONObject, str, ky0.m38515e(), ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, STRING_T…LOR_INT, env.logger, env)");
            return (Integer) a;
        }
    }

    static {
        C13497c cVar = C13497c.f35290b;
        C13495a aVar = C13495a.f35288b;
    }

    public C13494jg(ly0 ly0, C13494jg jgVar, boolean z, JSONObject jSONObject) {
        v60<String> v60;
        v60<Integer> v602;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (jgVar == null) {
            v60 = null;
        } else {
            v60 = jgVar.f35286a;
        }
        v60<String> a = di0.m35278a(jSONObject, "name", z, v60, f35282c, b, ly0);
        Intrinsics.checkNotNullExpressionValue(a, "readField(json, \"name\", …E_VALIDATOR, logger, env)");
        this.f35286a = a;
        if (jgVar == null) {
            v602 = null;
        } else {
            v602 = jgVar.f35287b;
        }
        v60<Integer> a2 = di0.m35281a(jSONObject, "value", z, v602, ky0.m38515e(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(a2, "readField(json, \"value\",…O_COLOR_INT, logger, env)");
        this.f35287b = a2;
    }

    /* renamed from: b */
    public C13409ig mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        return new C13409ig((String) w60.m43539a(this.f35286a, ly0, "name", jSONObject, f35284e), ((Number) w60.m43539a(this.f35287b, ly0, "value", jSONObject, f35285f)).intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m37787a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m37788b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }
}
