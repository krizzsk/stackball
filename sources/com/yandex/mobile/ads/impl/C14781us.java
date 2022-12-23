package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.yandex.mobile.ads.impl.v60;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.us */
public class C14781us implements qh0, ci0<C14706ts> {

    /* renamed from: c */
    public static final C14786e f40870c = new C14786e((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final f50<Integer> f40871d = f50.f33229a.mo66929a(0);

    /* renamed from: e */
    private static final rh1<Integer> f40872e = $$Lambda$us$7zdce0cIQ90s4f5HFJBwfvlJnz0.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final rh1<Integer> f40873f = $$Lambda$us$IEQXCDCzOO7XE0kgkwsUVNywOVI.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final gj0<Integer> f40874g = $$Lambda$us$dJ7QlzFSoXwXo9ooHWT5G1p7uXw.INSTANCE;

    /* renamed from: h */
    private static final gj0<Integer> f40875h = $$Lambda$us$ibQKvUwBLsDUEhf5rBZGzd2N6T0.INSTANCE;

    /* renamed from: i */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f40876i = C14782a.f40881b;

    /* renamed from: j */
    private static final Function3<String, JSONObject, ly0, n50<Integer>> f40877j = C14783b.f40882b;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Function2<ly0, JSONObject, C14781us> f40878k = C14784c.f40883b;

    /* renamed from: a */
    public final v60<f50<Integer>> f40879a;

    /* renamed from: b */
    public final v60<n50<Integer>> f40880b;

    /* renamed from: com.yandex.mobile.ads.impl.us$a */
    static final class C14782a extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C14782a f40881b = new C14782a();

        C14782a() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), C14781us.f40873f, ly0.mo66818b(), C14781us.f40871d, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.us$b */
    static final class C14783b extends Lambda implements Function3<String, JSONObject, ly0, n50<Integer>> {

        /* renamed from: b */
        public static final C14783b f40882b = new C14783b();

        C14783b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            n50<Integer> a = zh0.m44602a(jSONObject, str, ky0.m38515e(), C14781us.f40874g, ly0.mo66818b(), ly0, dg1.f32578f);
            Intrinsics.checkNotNullExpressionValue(a, "readExpressionsList(json…, env, TYPE_HELPER_COLOR)");
            return a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.us$c */
    static final class C14784c extends Lambda implements Function2<ly0, JSONObject, C14781us> {

        /* renamed from: b */
        public static final C14784c f40883b = new C14784c();

        C14784c() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C14781us(ly0, (C14781us) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.us$d */
    static final class C14785d extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C14785d f40884b = new C14785d();

        C14785d() {
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

    /* renamed from: com.yandex.mobile.ads.impl.us$e */
    public static final class C14786e {
        private C14786e() {
        }

        public /* synthetic */ C14786e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C14781us> mo70398a() {
            return C14781us.f40878k;
        }
    }

    static {
        C14785d dVar = C14785d.f40884b;
    }

    public C14781us(ly0 ly0, C14781us usVar, boolean z, JSONObject jSONObject) {
        v60<f50<Integer>> v60;
        v60<n50<Integer>> v602;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (usVar == null) {
            v60 = null;
        } else {
            v60 = usVar.f40879a;
        }
        v60<f50<f50<Integer>>> b2 = di0.m35295b(jSONObject, "angle", z, v60, ky0.m38514d(), f40872e, b, ly0, dg1.f32574b);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f40879a = b2;
        if (usVar == null) {
            v602 = null;
        } else {
            v602 = usVar.f40880b;
        }
        v60<n50<n50<Integer>>> a = di0.m35280a(jSONObject, "colors", z, v602, ky0.m38515e(), f40875h, b, ly0, dg1.f32578f);
        Intrinsics.checkNotNullExpressionValue(a, "readExpressionsListField…, env, TYPE_HELPER_COLOR)");
        this.f40880b = a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m42823a(int i) {
        return i >= 0 && i <= 360;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m42826b(int i) {
        return i >= 0 && i <= 360;
    }

    /* renamed from: b */
    public C14706ts mo65774a(ly0 ly0, JSONObject jSONObject) {
        n50 n50;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        f50<Integer> d = w60.m43544d(this.f40879a, ly0, "angle", jSONObject, f40876i);
        if (d == null) {
            d = f40871d;
        }
        v60<n50<Integer>> v60 = this.f40880b;
        Function3<String, JSONObject, ly0, n50<Integer>> function3 = f40877j;
        Intrinsics.checkNotNullParameter(v60, "<this>");
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter("colors", SDKConstants.PARAM_KEY);
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        Intrinsics.checkNotNullParameter(function3, "reader");
        if (v60.mo70451a() && jSONObject.has("colors")) {
            n50 = (n50) ((C14783b) function3).invoke("colors", jSONObject, ly0);
        } else if (v60 instanceof v60.C14870d) {
            n50 = (n50) ((v60.C14870d) v60).mo70453b();
        } else if (v60 instanceof v60.C14869c) {
            n50 = (n50) ((C14783b) function3).invoke(((v60.C14869c) v60).mo70452b(), jSONObject, ly0);
        } else {
            throw py0.m41002a(jSONObject, "colors");
        }
        return new C14706ts(d, n50);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m42824a(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m42827b(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 2;
    }
}
