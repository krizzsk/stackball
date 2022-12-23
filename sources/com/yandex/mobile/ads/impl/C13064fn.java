package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.yandex.mobile.ads.impl.C14687tm;
import com.yandex.mobile.ads.impl.f20;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.fn */
public class C13064fn implements qh0, ci0<C14687tm> {

    /* renamed from: i */
    public static final C13075k f33412i = new C13075k((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final cg1<C14687tm.C14694e> f33413j = cg1.f31917a.mo66293a(ArraysKt.first((T[]) C14687tm.C14694e.values()), C13073i.f33443b);

    /* renamed from: k */
    private static final rh1<String> f33414k = $$Lambda$fn$ulO2D6hg7OB83cpdyWSRiAM8nPQ.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final rh1<String> f33415l = $$Lambda$fn$sDWEyVgWR93PtZvnBsI2pOnfUfg.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final gj0<C14687tm.C14691d> f33416m = $$Lambda$fn$Pj1ywizRvF_zAQvrySEv5EAspw.INSTANCE;

    /* renamed from: n */
    private static final gj0<C13076l> f33417n = $$Lambda$fn$q2Nyl1rJX4ZhQKqQJYKfd3MStmw.INSTANCE;

    /* renamed from: o */
    private static final Function3<String, JSONObject, ly0, f20> f33418o = C13066b.f33436b;

    /* renamed from: p */
    private static final Function3<String, JSONObject, ly0, String> f33419p = C13067c.f33437b;

    /* renamed from: q */
    private static final Function3<String, JSONObject, ly0, f50<Uri>> f33420q = C13068d.f33438b;

    /* renamed from: r */
    private static final Function3<String, JSONObject, ly0, List<C14687tm.C14691d>> f33421r = C13069e.f33439b;

    /* renamed from: s */
    private static final Function3<String, JSONObject, ly0, JSONObject> f33422s = C13070f.f33440b;

    /* renamed from: t */
    private static final Function3<String, JSONObject, ly0, f50<Uri>> f33423t = C13071g.f33441b;

    /* renamed from: u */
    private static final Function3<String, JSONObject, ly0, f50<C14687tm.C14694e>> f33424u = C13072h.f33442b;

    /* renamed from: v */
    private static final Function3<String, JSONObject, ly0, f50<Uri>> f33425v = C13074j.f33444b;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final Function2<ly0, JSONObject, C13064fn> f33426w = C13065a.f33435b;

    /* renamed from: a */
    public final v60<g20> f33427a;

    /* renamed from: b */
    public final v60<String> f33428b;

    /* renamed from: c */
    public final v60<f50<Uri>> f33429c;

    /* renamed from: d */
    public final v60<List<C13076l>> f33430d;

    /* renamed from: e */
    public final v60<JSONObject> f33431e;

    /* renamed from: f */
    public final v60<f50<Uri>> f33432f;

    /* renamed from: g */
    public final v60<f50<C14687tm.C14694e>> f33433g;

    /* renamed from: h */
    public final v60<f50<Uri>> f33434h;

    /* renamed from: com.yandex.mobile.ads.impl.fn$a */
    static final class C13065a extends Lambda implements Function2<ly0, JSONObject, C13064fn> {

        /* renamed from: b */
        public static final C13065a f33435b = new C13065a();

        C13065a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C13064fn(ly0, (C13064fn) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fn$b */
    static final class C13066b extends Lambda implements Function3<String, JSONObject, ly0, f20> {

        /* renamed from: b */
        public static final C13066b f33436b = new C13066b();

        C13066b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            f20.C13024b bVar = f20.f33208a;
            return (f20) zh0.m44622b(jSONObject, str, f20.f33211d, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fn$c */
    static final class C13067c extends Lambda implements Function3<String, JSONObject, ly0, String> {

        /* renamed from: b */
        public static final C13067c f33437b = new C13067c();

        C13067c() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            Object a = zh0.m44608a(jSONObject, str, C13064fn.f33415l, ly0.mo66818b(), ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, key, LOG_ID_VALIDATOR, env.logger, env)");
            return (String) a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fn$d */
    static final class C13068d extends Lambda implements Function3<String, JSONObject, ly0, f50<Uri>> {

        /* renamed from: b */
        public static final C13068d f33438b = new C13068d();

        C13068d() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44621b(jSONObject, str, ky0.m38516f(), ly0.mo66818b(), ly0, dg1.f32577e);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fn$e */
    static final class C13069e extends Lambda implements Function3<String, JSONObject, ly0, List<C14687tm.C14691d>> {

        /* renamed from: b */
        public static final C13069e f33439b = new C13069e();

        C13069e() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C14687tm.C14691d.C14693b bVar = C14687tm.C14691d.f40367d;
            return zh0.m44626b(jSONObject, str, C14687tm.C14691d.f40370g, C13064fn.f33416m, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fn$f */
    static final class C13070f extends Lambda implements Function3<String, JSONObject, ly0, JSONObject> {

        /* renamed from: b */
        public static final C13070f f33440b = new C13070f();

        C13070f() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return (JSONObject) zh0.m44624b(jSONObject, str, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fn$g */
    static final class C13071g extends Lambda implements Function3<String, JSONObject, ly0, f50<Uri>> {

        /* renamed from: b */
        public static final C13071g f33441b = new C13071g();

        C13071g() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44621b(jSONObject, str, ky0.m38516f(), ly0.mo66818b(), ly0, dg1.f32577e);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fn$h */
    static final class C13072h extends Lambda implements Function3<String, JSONObject, ly0, f50<C14687tm.C14694e>> {

        /* renamed from: b */
        public static final C13072h f33442b = new C13072h();

        C13072h() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C14687tm.C14694e.C14696b bVar = C14687tm.C14694e.f40375c;
            return zh0.m44621b(jSONObject, str, C14687tm.C14694e.f40376d, ly0.mo66818b(), ly0, C13064fn.f33413j);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fn$i */
    static final class C13073i extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C13073i f33443b = new C13073i();

        C13073i() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C14687tm.C14694e);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fn$j */
    static final class C13074j extends Lambda implements Function3<String, JSONObject, ly0, f50<Uri>> {

        /* renamed from: b */
        public static final C13074j f33444b = new C13074j();

        C13074j() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44621b(jSONObject, str, ky0.m38516f(), ly0.mo66818b(), ly0, dg1.f32577e);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fn$k */
    public static final class C13075k {
        private C13075k() {
        }

        public /* synthetic */ C13075k(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C13064fn> mo67047a() {
            return C13064fn.f33426w;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fn$l */
    public static class C13076l implements qh0, ci0<C14687tm.C14691d> {

        /* renamed from: d */
        public static final C13081e f33445d = new C13081e((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: e */
        public static final gj0<C14687tm> f33446e = $$Lambda$fn$l$pgLtZVGcayQglTQbXYb2HoxOETU.INSTANCE;

        /* renamed from: f */
        private static final gj0<C13064fn> f33447f = $$Lambda$fn$l$Jr9oE2jezlcMMDMe2IRyRSfjI.INSTANCE;

        /* renamed from: g */
        private static final rh1<String> f33448g = $$Lambda$fn$l$EIg0V2LbkvIctY9JfEYEEC6uGI.INSTANCE;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final rh1<String> f33449h = $$Lambda$fn$l$3Nu2MUFKVI9134ZvkGRSDkV6e8.INSTANCE;

        /* renamed from: i */
        private static final Function3<String, JSONObject, ly0, C14687tm> f33450i = C13078b.f33458b;

        /* renamed from: j */
        private static final Function3<String, JSONObject, ly0, List<C14687tm>> f33451j = C13077a.f33457b;

        /* renamed from: k */
        private static final Function3<String, JSONObject, ly0, f50<String>> f33452k = C13080d.f33460b;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public static final Function2<ly0, JSONObject, C13076l> f33453l = C13079c.f33459b;

        /* renamed from: a */
        public final v60<C13064fn> f33454a;

        /* renamed from: b */
        public final v60<List<C13064fn>> f33455b;

        /* renamed from: c */
        public final v60<f50<String>> f33456c;

        /* renamed from: com.yandex.mobile.ads.impl.fn$l$a */
        static final class C13077a extends Lambda implements Function3<String, JSONObject, ly0, List<C14687tm>> {

            /* renamed from: b */
            public static final C13077a f33457b = new C13077a();

            C13077a() {
                super(3);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                String str = (String) obj;
                JSONObject jSONObject = (JSONObject) obj2;
                ly0 ly0 = (ly0) obj3;
                Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
                Intrinsics.checkNotNullParameter(jSONObject, "json");
                Intrinsics.checkNotNullParameter(ly0, "env");
                C14687tm.C14690c cVar = C14687tm.f40352i;
                return zh0.m44626b(jSONObject, str, C14687tm.f40356m, C13076l.f33446e, ly0.mo66818b(), ly0);
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.fn$l$b */
        static final class C13078b extends Lambda implements Function3<String, JSONObject, ly0, C14687tm> {

            /* renamed from: b */
            public static final C13078b f33458b = new C13078b();

            C13078b() {
                super(3);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                String str = (String) obj;
                JSONObject jSONObject = (JSONObject) obj2;
                ly0 ly0 = (ly0) obj3;
                Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
                Intrinsics.checkNotNullParameter(jSONObject, "json");
                Intrinsics.checkNotNullParameter(ly0, "env");
                C14687tm.C14690c cVar = C14687tm.f40352i;
                return (C14687tm) zh0.m44622b(jSONObject, str, C14687tm.f40356m, ly0.mo66818b(), ly0);
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.fn$l$c */
        static final class C13079c extends Lambda implements Function2<ly0, JSONObject, C13076l> {

            /* renamed from: b */
            public static final C13079c f33459b = new C13079c();

            C13079c() {
                super(2);
            }

            public Object invoke(Object obj, Object obj2) {
                ly0 ly0 = (ly0) obj;
                JSONObject jSONObject = (JSONObject) obj2;
                Intrinsics.checkNotNullParameter(ly0, "env");
                Intrinsics.checkNotNullParameter(jSONObject, "it");
                return new C13076l(ly0, (C13076l) null, false, jSONObject);
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.fn$l$d */
        static final class C13080d extends Lambda implements Function3<String, JSONObject, ly0, f50<String>> {

            /* renamed from: b */
            public static final C13080d f33460b = new C13080d();

            C13080d() {
                super(3);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                String str = (String) obj;
                JSONObject jSONObject = (JSONObject) obj2;
                ly0 ly0 = (ly0) obj3;
                Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
                Intrinsics.checkNotNullParameter(jSONObject, "json");
                Intrinsics.checkNotNullParameter(ly0, "env");
                f50<String> a = zh0.m44597a(jSONObject, str, C13076l.f33449h, ly0.mo66818b(), ly0, dg1.f32575c);
                Intrinsics.checkNotNullExpressionValue(a, "readExpression(json, key… env, TYPE_HELPER_STRING)");
                return a;
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.fn$l$e */
        public static final class C13081e {
            private C13081e() {
            }

            public /* synthetic */ C13081e(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final Function2<ly0, JSONObject, C13076l> mo67048a() {
                return C13076l.f33453l;
            }
        }

        public C13076l(ly0 ly0, C13076l lVar, boolean z, JSONObject jSONObject) {
            v60<C13064fn> v60;
            v60<List<C13064fn>> v602;
            v60<f50<String>> v603;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            if (lVar == null) {
                v60 = null;
            } else {
                v60 = lVar.f33454a;
            }
            C13075k kVar = C13064fn.f33412i;
            v60<C13064fn> b2 = di0.m35297b(jSONObject, "action", z, v60, kVar.mo67047a(), b, ly0);
            Intrinsics.checkNotNullExpressionValue(b2, "readOptionalField(json, …ate.CREATOR, logger, env)");
            this.f33454a = b2;
            if (lVar == null) {
                v602 = null;
            } else {
                v602 = lVar.f33455b;
            }
            v60<List<List<C13064fn>>> b3 = di0.m35296b(jSONObject, "actions", z, v602, kVar.mo67047a(), f33447f, b, ly0);
            Intrinsics.checkNotNullExpressionValue(b3, "readOptionalListField(js…E_VALIDATOR, logger, env)");
            this.f33455b = b3;
            if (lVar == null) {
                v603 = null;
            } else {
                v603 = lVar.f33456c;
            }
            v60<f50<f50<String>>> a = di0.m35279a(jSONObject, "text", z, v603, f33448g, b, ly0, dg1.f32575c);
            Intrinsics.checkNotNullExpressionValue(a, "readFieldWithExpression(… env, TYPE_HELPER_STRING)");
            this.f33456c = a;
        }

        /* renamed from: a */
        public qh0 mo65774a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "data");
            return new C14687tm.C14691d((C14687tm) w60.m43545e(this.f33454a, ly0, "action", jSONObject, f33450i), w60.m43540a(this.f33455b, ly0, "actions", jSONObject, f33446e, f33451j), w60.m43541b(this.f33456c, ly0, "text", jSONObject, f33452k));
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final boolean m36078b(List list) {
            Intrinsics.checkNotNullParameter(list, "it");
            return list.size() >= 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final boolean m36077b(String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return str.length() >= 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static final boolean m36075a(List list) {
            Intrinsics.checkNotNullParameter(list, "it");
            return list.size() >= 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static final boolean m36074a(String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return str.length() >= 1;
        }
    }

    public C13064fn(ly0 ly0, C13064fn fnVar, boolean z, JSONObject jSONObject) {
        v60<g20> v60;
        v60<String> v602;
        v60<f50<Uri>> v603;
        v60<List<C13076l>> v604;
        v60<JSONObject> v605;
        v60<f50<Uri>> v606;
        v60<f50<C14687tm.C14694e>> v607;
        v60<f50<Uri>> v608;
        C13064fn fnVar2 = fnVar;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (fnVar2 == null) {
            v60 = null;
        } else {
            v60 = fnVar2.f33427a;
        }
        v60<g20> b2 = di0.m35297b(jSONObject, "download_callbacks", z, v60, g20.f33849c.mo67176a(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f33427a = b2;
        if (fnVar2 == null) {
            v602 = null;
        } else {
            v602 = fnVar2.f33428b;
        }
        v60<String> a = di0.m35278a(jSONObject, "log_id", z, v602, f33414k, b, ly0);
        Intrinsics.checkNotNullExpressionValue(a, "readField(json, \"log_id\"…E_VALIDATOR, logger, env)");
        this.f33428b = a;
        if (fnVar2 == null) {
            v603 = null;
        } else {
            v603 = fnVar2.f33429c;
        }
        Function1<String, Uri> f = ky0.m38516f();
        cg1<Uri> cg1 = dg1.f32577e;
        v60<f50<f50<Uri>>> b3 = di0.m35293b(jSONObject, "log_url", z, v603, f, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b3, "readOptionalFieldWithExp…er, env, TYPE_HELPER_URI)");
        this.f33429c = b3;
        if (fnVar2 == null) {
            v604 = null;
        } else {
            v604 = fnVar2.f33430d;
        }
        v60<List<List<C13076l>>> b4 = di0.m35296b(jSONObject, "menu_items", z, v604, C13076l.f33445d.mo67048a(), f33417n, b, ly0);
        Intrinsics.checkNotNullExpressionValue(b4, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f33430d = b4;
        if (fnVar2 == null) {
            v605 = null;
        } else {
            v605 = fnVar2.f33431e;
        }
        v60<JSONObject> b5 = di0.m35290b(jSONObject, "payload", z, v605, b, ly0);
        Intrinsics.checkNotNullExpressionValue(b5, "readOptionalField(json, …nt?.payload, logger, env)");
        this.f33431e = b5;
        if (fnVar2 == null) {
            v606 = null;
        } else {
            v606 = fnVar2.f33432f;
        }
        v60<f50<f50<Uri>>> b6 = di0.m35293b(jSONObject, "referer", z, v606, ky0.m38516f(), b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b6, "readOptionalFieldWithExp…er, env, TYPE_HELPER_URI)");
        this.f33432f = b6;
        if (fnVar2 == null) {
            v607 = null;
        } else {
            v607 = fnVar2.f33433g;
        }
        v60<f50<f50<C14687tm.C14694e>>> b7 = di0.m35293b(jSONObject, "target", z, v607, C14687tm.C14694e.f40375c.mo70205a(), b, ly0, f33413j);
        Intrinsics.checkNotNullExpressionValue(b7, "readOptionalFieldWithExp… env, TYPE_HELPER_TARGET)");
        this.f33433g = b7;
        if (fnVar2 == null) {
            v608 = null;
        } else {
            v608 = fnVar2.f33434h;
        }
        v60<f50<f50<Uri>>> b8 = di0.m35293b(jSONObject, "url", z, v608, ky0.m38516f(), b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b8, "readOptionalFieldWithExp…er, env, TYPE_HELPER_URI)");
        this.f33434h = b8;
    }

    /* renamed from: a */
    public qh0 mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        return new C14687tm((f20) w60.m43545e(this.f33427a, ly0, "download_callbacks", jSONObject, f33418o), (String) w60.m43539a(this.f33428b, ly0, "log_id", jSONObject, f33419p), w60.m43544d(this.f33429c, ly0, "log_url", jSONObject, f33420q), w60.m43540a(this.f33430d, ly0, "menu_items", jSONObject, f33416m, f33421r), (JSONObject) w60.m43543c(this.f33431e, ly0, "payload", jSONObject, f33422s), w60.m43544d(this.f33432f, ly0, "referer", jSONObject, f33423t), (f50) w60.m43543c(this.f33433g, ly0, "target", jSONObject, f33424u), w60.m43544d(this.f33434h, ly0, "url", jSONObject, f33425v));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m36067b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m36068b(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m36064a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m36065a(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }
}
