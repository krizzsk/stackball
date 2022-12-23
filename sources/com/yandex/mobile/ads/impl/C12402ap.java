package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.yandex.mobile.ads.impl.C12663bx;
import com.yandex.mobile.ads.impl.C13873lq;
import com.yandex.mobile.ads.impl.C15405zy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.ap */
public class C12402ap implements qh0, ci0<C15066wo> {

    /* renamed from: f */
    public static final C12409g f30615f = new C12409g((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final f50<Boolean> f30616g = f50.f33229a.mo66929a(Boolean.FALSE);

    /* renamed from: h */
    private static final rh1<Integer> f30617h = $$Lambda$ap$ZvVYFA8vKbn54K9qTNmAXuhaYiM.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final rh1<Integer> f30618i = $$Lambda$ap$d1pSPVpWyAQl3cAEi35BqNWDeQ.INSTANCE;

    /* renamed from: j */
    private static final Function3<String, JSONObject, ly0, f50<Integer>> f30619j = C12404b.f30631b;

    /* renamed from: k */
    private static final Function3<String, JSONObject, ly0, C13873lq> f30620k = C12403a.f30630b;

    /* renamed from: l */
    private static final Function3<String, JSONObject, ly0, f50<Boolean>> f30621l = C12406d.f30633b;

    /* renamed from: m */
    private static final Function3<String, JSONObject, ly0, C12663bx> f30622m = C12407e.f30634b;

    /* renamed from: n */
    private static final Function3<String, JSONObject, ly0, C15405zy> f30623n = C12408f.f30635b;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final Function2<ly0, JSONObject, C12402ap> f30624o = C12405c.f30632b;

    /* renamed from: a */
    public final v60<f50<Integer>> f30625a;

    /* renamed from: b */
    public final v60<C14001mq> f30626b;

    /* renamed from: c */
    public final v60<f50<Boolean>> f30627c;

    /* renamed from: d */
    public final v60<C12782cx> f30628d;

    /* renamed from: e */
    public final v60<C12460az> f30629e;

    /* renamed from: com.yandex.mobile.ads.impl.ap$a */
    static final class C12403a extends Lambda implements Function3<String, JSONObject, ly0, C13873lq> {

        /* renamed from: b */
        public static final C12403a f30630b = new C12403a();

        C12403a() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C13873lq.C13875b bVar = C13873lq.f36780e;
            return (C13873lq) zh0.m44622b(jSONObject, str, C13873lq.f36785j, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ap$b */
    static final class C12404b extends Lambda implements Function3<String, JSONObject, ly0, f50<Integer>> {

        /* renamed from: b */
        public static final C12404b f30631b = new C12404b();

        C12404b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44601a(jSONObject, str, (Function1) ky0.m38514d(), C12402ap.f30618i, ly0.mo66818b(), (f50) null, (cg1) dg1.f32574b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ap$c */
    static final class C12405c extends Lambda implements Function2<ly0, JSONObject, C12402ap> {

        /* renamed from: b */
        public static final C12405c f30632b = new C12405c();

        C12405c() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C12402ap(ly0, (C12402ap) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ap$d */
    static final class C12406d extends Lambda implements Function3<String, JSONObject, ly0, f50<Boolean>> {

        /* renamed from: b */
        public static final C12406d f30633b = new C12406d();

        C12406d() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44599a(jSONObject, str, ky0.m38512b(), ly0.mo66818b(), ly0, C12402ap.f30616g, dg1.f32573a);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ap$e */
    static final class C12407e extends Lambda implements Function3<String, JSONObject, ly0, C12663bx> {

        /* renamed from: b */
        public static final C12407e f30634b = new C12407e();

        C12407e() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C12663bx.C12665b bVar = C12663bx.f31611e;
            return (C12663bx) zh0.m44622b(jSONObject, str, C12663bx.f31617k, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ap$f */
    static final class C12408f extends Lambda implements Function3<String, JSONObject, ly0, C15405zy> {

        /* renamed from: b */
        public static final C12408f f30635b = new C12408f();

        C12408f() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C15405zy.C15408c cVar = C15405zy.f43497d;
            return (C15405zy) zh0.m44622b(jSONObject, str, C15405zy.f43502i, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ap$g */
    public static final class C12409g {
        private C12409g() {
        }

        public /* synthetic */ C12409g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C12402ap> mo65829a() {
            return C12402ap.f30624o;
        }
    }

    public C12402ap(ly0 ly0, C12402ap apVar, boolean z, JSONObject jSONObject) {
        v60<f50<Integer>> v60;
        v60<C14001mq> v602;
        v60<f50<Boolean>> v603;
        v60<C12782cx> v604;
        v60<C12460az> v605;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (apVar == null) {
            v60 = null;
        } else {
            v60 = apVar.f30625a;
        }
        v60<f50<f50<Integer>>> b2 = di0.m35295b(jSONObject, "corner_radius", z, v60, ky0.m38514d(), f30617h, b, ly0, dg1.f32574b);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalFieldWithExp…er, env, TYPE_HELPER_INT)");
        this.f30625a = b2;
        if (apVar == null) {
            v602 = null;
        } else {
            v602 = apVar.f30626b;
        }
        v60<C14001mq> b3 = di0.m35297b(jSONObject, "corners_radius", z, v602, C14001mq.f37459e.mo68846a(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(b3, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f30626b = b3;
        if (apVar == null) {
            v603 = null;
        } else {
            v603 = apVar.f30627c;
        }
        v60<f50<f50<Boolean>>> b4 = di0.m35293b(jSONObject, "has_shadow", z, v603, ky0.m38512b(), b, ly0, dg1.f32573a);
        Intrinsics.checkNotNullExpressionValue(b4, "readOptionalFieldWithExp…env, TYPE_HELPER_BOOLEAN)");
        this.f30627c = b4;
        if (apVar == null) {
            v604 = null;
        } else {
            v604 = apVar.f30628d;
        }
        v60<C12782cx> b5 = di0.m35297b(jSONObject, "shadow", z, v604, C12782cx.f32089e.mo66356a(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(b5, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f30628d = b5;
        if (apVar == null) {
            v605 = null;
        } else {
            v605 = apVar.f30629e;
        }
        v60<C12460az> b6 = di0.m35297b(jSONObject, "stroke", z, v605, C12460az.f30840d.mo65922a(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(b6, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f30629e = b6;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m33820a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m33822b(int i) {
        return i >= 0;
    }

    /* renamed from: a */
    public qh0 mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        f50<T> d = w60.m43544d(this.f30625a, ly0, "corner_radius", jSONObject, f30619j);
        C13873lq lqVar = (C13873lq) w60.m43545e(this.f30626b, ly0, "corners_radius", jSONObject, f30620k);
        f50<Boolean> d2 = w60.m43544d(this.f30627c, ly0, "has_shadow", jSONObject, f30621l);
        if (d2 == null) {
            d2 = f30616g;
        }
        return new C15066wo(d, lqVar, d2, (C12663bx) w60.m43545e(this.f30628d, ly0, "shadow", jSONObject, f30622m), (C15405zy) w60.m43545e(this.f30629e, ly0, "stroke", jSONObject, f30623n));
    }
}
