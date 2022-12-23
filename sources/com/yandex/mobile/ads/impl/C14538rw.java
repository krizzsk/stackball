package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.yandex.mobile.ads.impl.C15266yr;
import com.yandex.mobile.ads.impl.C15347zr;
import com.yandex.mobile.ads.impl.f50;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.rw */
public class C14538rw implements qh0, ci0<C14425qw> {

    /* renamed from: d */
    private static final C15266yr f39730d;

    /* renamed from: e */
    private static final C15266yr f39731e;

    /* renamed from: f */
    private static final C15266yr f39732f;

    /* renamed from: g */
    private static final Function3<String, JSONObject, ly0, C15266yr> f39733g = C14539a.f39739b;

    /* renamed from: h */
    private static final Function3<String, JSONObject, ly0, C15266yr> f39734h = C14541c.f39741b;

    /* renamed from: i */
    private static final Function3<String, JSONObject, ly0, C15266yr> f39735i = C14542d.f39742b;

    /* renamed from: a */
    public final v60<C15347zr> f39736a;

    /* renamed from: b */
    public final v60<C15347zr> f39737b;

    /* renamed from: c */
    public final v60<C15347zr> f39738c;

    /* renamed from: com.yandex.mobile.ads.impl.rw$a */
    static final class C14539a extends Lambda implements Function3<String, JSONObject, ly0, C15266yr> {

        /* renamed from: b */
        public static final C14539a f39739b = new C14539a();

        C14539a() {
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
            return (C15266yr) zh0.m44622b(jSONObject, str, C15266yr.f42918g, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rw$b */
    static final class C14540b extends Lambda implements Function2<ly0, JSONObject, C14538rw> {

        /* renamed from: b */
        public static final C14540b f39740b = new C14540b();

        C14540b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C14538rw(ly0, (C14538rw) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rw$c */
    static final class C14541c extends Lambda implements Function3<String, JSONObject, ly0, C15266yr> {

        /* renamed from: b */
        public static final C14541c f39741b = new C14541c();

        C14541c() {
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
            return (C15266yr) zh0.m44622b(jSONObject, str, C15266yr.f42918g, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rw$d */
    static final class C14542d extends Lambda implements Function3<String, JSONObject, ly0, C15266yr> {

        /* renamed from: b */
        public static final C14542d f39742b = new C14542d();

        C14542d() {
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
            return (C15266yr) zh0.m44622b(jSONObject, str, C15266yr.f42918g, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rw$e */
    static final class C14543e extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C14543e f39743b = new C14543e();

        C14543e() {
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
        f50.C13029a aVar = f50.f33229a;
        f39730d = new C15266yr((f50) null, aVar.mo66929a(5), 1);
        f39731e = new C15266yr((f50) null, aVar.mo66929a(10), 1);
        f39732f = new C15266yr((f50) null, aVar.mo66929a(10), 1);
        C14543e eVar = C14543e.f39743b;
        C14540b bVar = C14540b.f39740b;
    }

    public C14538rw(ly0 ly0, C14538rw rwVar, boolean z, JSONObject jSONObject) {
        v60<C15347zr> v60;
        v60<C15347zr> v602;
        v60<C15347zr> v603;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (rwVar == null) {
            v60 = null;
        } else {
            v60 = rwVar.f39736a;
        }
        C15347zr.C15353f fVar = C15347zr.f43304c;
        v60<C15347zr> b2 = di0.m35297b(jSONObject, "corner_radius", z, v60, fVar.mo71278a(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39736a = b2;
        if (rwVar == null) {
            v602 = null;
        } else {
            v602 = rwVar.f39737b;
        }
        v60<C15347zr> b3 = di0.m35297b(jSONObject, "item_height", z, v602, fVar.mo71278a(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(b3, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39737b = b3;
        if (rwVar == null) {
            v603 = null;
        } else {
            v603 = rwVar.f39738c;
        }
        v60<C15347zr> b4 = di0.m35297b(jSONObject, "item_width", z, v603, fVar.mo71278a(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(b4, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f39738c = b4;
    }

    /* renamed from: b */
    public C14425qw mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        C15266yr yrVar = (C15266yr) w60.m43545e(this.f39736a, ly0, "corner_radius", jSONObject, f39733g);
        if (yrVar == null) {
            yrVar = f39730d;
        }
        C15266yr yrVar2 = (C15266yr) w60.m43545e(this.f39737b, ly0, "item_height", jSONObject, f39734h);
        if (yrVar2 == null) {
            yrVar2 = f39731e;
        }
        C15266yr yrVar3 = (C15266yr) w60.m43545e(this.f39738c, ly0, "item_width", jSONObject, f39735i);
        if (yrVar3 == null) {
            yrVar3 = f39732f;
        }
        return new C14425qw(yrVar, yrVar2, yrVar3);
    }
}
