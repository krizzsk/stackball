package com.yandex.mobile.ads.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.yandex.mobile.ads.impl.C12607bs;
import com.yandex.mobile.ads.impl.C13064fn;
import com.yandex.mobile.ads.impl.C14479rn;
import com.yandex.mobile.ads.impl.C14687tm;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.cs */
public class C12759cs implements qh0, ci0<C12607bs> {

    /* renamed from: e */
    public static final C12765f f32029e = new C12765f((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final gj0<C14479rn> f32030f = $$Lambda$cs$ginuyYefFPXPWElrXjwttvuXGcw.INSTANCE;

    /* renamed from: g */
    private static final gj0<C14618sn> f32031g = $$Lambda$cs$uig7yzzQTeWqfWwbwKXsxEgTQ.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final gj0<C14687tm> f32032h = $$Lambda$cs$njbsK0K6uKdQytxXQxBaPSl5hc.INSTANCE;

    /* renamed from: i */
    private static final gj0<C13064fn> f32033i = $$Lambda$cs$iOLvWyFSAf2YsVKJeO0OCcskGb0.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final gj0<C14687tm> f32034j = $$Lambda$cs$7zcRaY9lKOpKvFAfgXcUcEb3Hs.INSTANCE;

    /* renamed from: k */
    private static final gj0<C13064fn> f32035k = $$Lambda$cs$lAoLtokqHgQzTk4snnZVD3vH26g.INSTANCE;

    /* renamed from: l */
    private static final Function3<String, JSONObject, ly0, List<C14479rn>> f32036l = C12760a.f32045b;

    /* renamed from: m */
    private static final Function3<String, JSONObject, ly0, C12607bs.C12610c> f32037m = C12762c.f32047b;

    /* renamed from: n */
    private static final Function3<String, JSONObject, ly0, List<C14687tm>> f32038n = C12763d.f32048b;

    /* renamed from: o */
    private static final Function3<String, JSONObject, ly0, List<C14687tm>> f32039o = C12764e.f32049b;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final Function2<ly0, JSONObject, C12759cs> f32040p = C12761b.f32046b;

    /* renamed from: a */
    public final v60<List<C14618sn>> f32041a;

    /* renamed from: b */
    public final v60<C12766g> f32042b;

    /* renamed from: c */
    public final v60<List<C13064fn>> f32043c;

    /* renamed from: d */
    public final v60<List<C13064fn>> f32044d;

    /* renamed from: com.yandex.mobile.ads.impl.cs$a */
    static final class C12760a extends Lambda implements Function3<String, JSONObject, ly0, List<C14479rn>> {

        /* renamed from: b */
        public static final C12760a f32045b = new C12760a();

        C12760a() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C14479rn.C14481b bVar = C14479rn.f39510a;
            return zh0.m44626b(jSONObject, str, C14479rn.f39511b, C12759cs.f32030f, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.cs$b */
    static final class C12761b extends Lambda implements Function2<ly0, JSONObject, C12759cs> {

        /* renamed from: b */
        public static final C12761b f32046b = new C12761b();

        C12761b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C12759cs(ly0, (C12759cs) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.cs$c */
    static final class C12762c extends Lambda implements Function3<String, JSONObject, ly0, C12607bs.C12610c> {

        /* renamed from: b */
        public static final C12762c f32047b = new C12762c();

        C12762c() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C12607bs.C12610c.C12612b bVar = C12607bs.C12610c.f31412f;
            return (C12607bs.C12610c) zh0.m44622b(jSONObject, str, C12607bs.C12610c.f31418l, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.cs$d */
    static final class C12763d extends Lambda implements Function3<String, JSONObject, ly0, List<C14687tm>> {

        /* renamed from: b */
        public static final C12763d f32048b = new C12763d();

        C12763d() {
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
            return zh0.m44626b(jSONObject, str, C14687tm.f40356m, C12759cs.f32032h, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.cs$e */
    static final class C12764e extends Lambda implements Function3<String, JSONObject, ly0, List<C14687tm>> {

        /* renamed from: b */
        public static final C12764e f32049b = new C12764e();

        C12764e() {
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
            return zh0.m44626b(jSONObject, str, C14687tm.f40356m, C12759cs.f32034j, ly0.mo66818b(), ly0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.cs$f */
    public static final class C12765f {
        private C12765f() {
        }

        public /* synthetic */ C12765f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C12759cs> mo66350a() {
            return C12759cs.f32040p;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.cs$g */
    public static class C12766g implements qh0, ci0<C12607bs.C12610c> {

        /* renamed from: f */
        public static final C12773g f32050f = new C12773g((DefaultConstructorMarker) null);

        /* renamed from: g */
        private static final rh1<String> f32051g = $$Lambda$cs$g$kqu7ZY_FfZgIGG5bJMkgttWwWTE.INSTANCE;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static final rh1<String> f32052h = $$Lambda$cs$g$5dzAImR9kMtS4spmWTVro3usl0.INSTANCE;

        /* renamed from: i */
        private static final rh1<String> f32053i = $$Lambda$cs$g$9o_PpbZmw6NOuUa327UrQvv6uC4.INSTANCE;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public static final rh1<String> f32054j = $$Lambda$cs$g$G9BSKCVSTE3pkgWwVtdrh5VrmpM.INSTANCE;

        /* renamed from: k */
        private static final rh1<String> f32055k = $$Lambda$cs$g$k4EPjlnlSahFL7j8ipDY47D9Pc.INSTANCE;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public static final rh1<String> f32056l = $$Lambda$cs$g$7LlASLGzw7hxdxOYQ38c2EAGO8w.INSTANCE;

        /* renamed from: m */
        private static final rh1<String> f32057m = $$Lambda$cs$g$VP1HY6u8E0eEHATqHA_716FlqLo.INSTANCE;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public static final rh1<String> f32058n = $$Lambda$cs$g$KdcF7usA51s4sKvB348XNcA908o.INSTANCE;

        /* renamed from: o */
        private static final rh1<String> f32059o = $$Lambda$cs$g$OS81r6Vk6xdXbaMgSUr6Fq8KFE.INSTANCE;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public static final rh1<String> f32060p = $$Lambda$cs$g$sK927dAJXNmSl_5W0NkYlQJPf7w.INSTANCE;

        /* renamed from: q */
        private static final Function3<String, JSONObject, ly0, f50<String>> f32061q = C12768b.f32073b;

        /* renamed from: r */
        private static final Function3<String, JSONObject, ly0, f50<String>> f32062r = C12769c.f32074b;

        /* renamed from: s */
        private static final Function3<String, JSONObject, ly0, f50<String>> f32063s = C12770d.f32075b;

        /* renamed from: t */
        private static final Function3<String, JSONObject, ly0, f50<String>> f32064t = C12771e.f32076b;

        /* renamed from: u */
        private static final Function3<String, JSONObject, ly0, f50<String>> f32065u = C12772f.f32077b;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public static final Function2<ly0, JSONObject, C12766g> f32066v = C12767a.f32072b;

        /* renamed from: a */
        public final v60<f50<String>> f32067a;

        /* renamed from: b */
        public final v60<f50<String>> f32068b;

        /* renamed from: c */
        public final v60<f50<String>> f32069c;

        /* renamed from: d */
        public final v60<f50<String>> f32070d;

        /* renamed from: e */
        public final v60<f50<String>> f32071e;

        /* renamed from: com.yandex.mobile.ads.impl.cs$g$a */
        static final class C12767a extends Lambda implements Function2<ly0, JSONObject, C12766g> {

            /* renamed from: b */
            public static final C12767a f32072b = new C12767a();

            C12767a() {
                super(2);
            }

            public Object invoke(Object obj, Object obj2) {
                ly0 ly0 = (ly0) obj;
                JSONObject jSONObject = (JSONObject) obj2;
                Intrinsics.checkNotNullParameter(ly0, "env");
                Intrinsics.checkNotNullParameter(jSONObject, "it");
                return new C12766g(ly0, (C12766g) null, false, jSONObject);
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.cs$g$b */
        static final class C12768b extends Lambda implements Function3<String, JSONObject, ly0, f50<String>> {

            /* renamed from: b */
            public static final C12768b f32073b = new C12768b();

            C12768b() {
                super(3);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                String str = (String) obj;
                JSONObject jSONObject = (JSONObject) obj2;
                ly0 ly0 = (ly0) obj3;
                Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
                Intrinsics.checkNotNullParameter(jSONObject, "json");
                Intrinsics.checkNotNullParameter(ly0, "env");
                return zh0.m44620b(jSONObject, str, C12766g.f32052h, ly0.mo66818b(), ly0, dg1.f32575c);
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.cs$g$c */
        static final class C12769c extends Lambda implements Function3<String, JSONObject, ly0, f50<String>> {

            /* renamed from: b */
            public static final C12769c f32074b = new C12769c();

            C12769c() {
                super(3);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                String str = (String) obj;
                JSONObject jSONObject = (JSONObject) obj2;
                ly0 ly0 = (ly0) obj3;
                Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
                Intrinsics.checkNotNullParameter(jSONObject, "json");
                Intrinsics.checkNotNullParameter(ly0, "env");
                return zh0.m44620b(jSONObject, str, C12766g.f32054j, ly0.mo66818b(), ly0, dg1.f32575c);
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.cs$g$d */
        static final class C12770d extends Lambda implements Function3<String, JSONObject, ly0, f50<String>> {

            /* renamed from: b */
            public static final C12770d f32075b = new C12770d();

            C12770d() {
                super(3);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                String str = (String) obj;
                JSONObject jSONObject = (JSONObject) obj2;
                ly0 ly0 = (ly0) obj3;
                Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
                Intrinsics.checkNotNullParameter(jSONObject, "json");
                Intrinsics.checkNotNullParameter(ly0, "env");
                return zh0.m44620b(jSONObject, str, C12766g.f32056l, ly0.mo66818b(), ly0, dg1.f32575c);
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.cs$g$e */
        static final class C12771e extends Lambda implements Function3<String, JSONObject, ly0, f50<String>> {

            /* renamed from: b */
            public static final C12771e f32076b = new C12771e();

            C12771e() {
                super(3);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                String str = (String) obj;
                JSONObject jSONObject = (JSONObject) obj2;
                ly0 ly0 = (ly0) obj3;
                Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
                Intrinsics.checkNotNullParameter(jSONObject, "json");
                Intrinsics.checkNotNullParameter(ly0, "env");
                return zh0.m44620b(jSONObject, str, C12766g.f32058n, ly0.mo66818b(), ly0, dg1.f32575c);
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.cs$g$f */
        static final class C12772f extends Lambda implements Function3<String, JSONObject, ly0, f50<String>> {

            /* renamed from: b */
            public static final C12772f f32077b = new C12772f();

            C12772f() {
                super(3);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                String str = (String) obj;
                JSONObject jSONObject = (JSONObject) obj2;
                ly0 ly0 = (ly0) obj3;
                Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
                Intrinsics.checkNotNullParameter(jSONObject, "json");
                Intrinsics.checkNotNullParameter(ly0, "env");
                return zh0.m44620b(jSONObject, str, C12766g.f32060p, ly0.mo66818b(), ly0, dg1.f32575c);
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.cs$g$g */
        public static final class C12773g {
            private C12773g() {
            }

            public /* synthetic */ C12773g(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final Function2<ly0, JSONObject, C12766g> mo66351a() {
                return C12766g.f32066v;
            }
        }

        public C12766g(ly0 ly0, C12766g gVar, boolean z, JSONObject jSONObject) {
            v60<f50<String>> v60;
            v60<f50<String>> v602;
            v60<f50<String>> v603;
            v60<f50<String>> v604;
            v60<f50<String>> v605;
            C12766g gVar2 = gVar;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            if (gVar2 == null) {
                v60 = null;
            } else {
                v60 = gVar2.f32067a;
            }
            rh1<String> rh1 = f32051g;
            cg1<String> cg1 = dg1.f32575c;
            v60<f50<f50<String>>> b2 = di0.m35292b(jSONObject, "down", z, v60, rh1, b, ly0, cg1);
            Intrinsics.checkNotNullExpressionValue(b2, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
            this.f32067a = b2;
            if (gVar2 == null) {
                v602 = null;
            } else {
                v602 = gVar2.f32068b;
            }
            v60<f50<f50<String>>> b3 = di0.m35292b(jSONObject, "forward", z, v602, f32053i, b, ly0, cg1);
            Intrinsics.checkNotNullExpressionValue(b3, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
            this.f32068b = b3;
            if (gVar2 == null) {
                v603 = null;
            } else {
                v603 = gVar2.f32069c;
            }
            v60<f50<f50<String>>> b4 = di0.m35292b(jSONObject, "left", z, v603, f32055k, b, ly0, cg1);
            Intrinsics.checkNotNullExpressionValue(b4, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
            this.f32069c = b4;
            if (gVar2 == null) {
                v604 = null;
            } else {
                v604 = gVar2.f32070d;
            }
            v60<f50<f50<String>>> b5 = di0.m35292b(jSONObject, "right", z, v604, f32057m, b, ly0, cg1);
            Intrinsics.checkNotNullExpressionValue(b5, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
            this.f32070d = b5;
            if (gVar2 == null) {
                v605 = null;
            } else {
                v605 = gVar2.f32071e;
            }
            v60<f50<f50<String>>> b6 = di0.m35292b(jSONObject, "up", z, v605, f32059o, b, ly0, cg1);
            Intrinsics.checkNotNullExpressionValue(b6, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
            this.f32071e = b6;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public static final boolean m34837g(String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return str.length() >= 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public static final boolean m34838h(String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return str.length() >= 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final boolean m34839i(String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return str.length() >= 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final boolean m34840j(String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return str.length() >= 1;
        }

        /* renamed from: a */
        public qh0 mo65774a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "data");
            return new C12607bs.C12610c(w60.m43544d(this.f32067a, ly0, "down", jSONObject, f32061q), w60.m43544d(this.f32068b, ly0, "forward", jSONObject, f32062r), w60.m43544d(this.f32069c, ly0, "left", jSONObject, f32063s), w60.m43544d(this.f32070d, ly0, "right", jSONObject, f32064t), w60.m43544d(this.f32071e, ly0, "up", jSONObject, f32065u));
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final boolean m34828b(String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return str.length() >= 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final boolean m34830c(String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return str.length() >= 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final boolean m34832d(String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return str.length() >= 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final boolean m34834e(String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return str.length() >= 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static final boolean m34836f(String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return str.length() >= 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static final boolean m34826a(String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return str.length() >= 1;
        }
    }

    public C12759cs(ly0 ly0, C12759cs csVar, boolean z, JSONObject jSONObject) {
        v60<List<C14618sn>> v60;
        v60<C12766g> v602;
        v60<List<C13064fn>> v603;
        v60<List<C13064fn>> v604;
        C12759cs csVar2 = csVar;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (csVar2 == null) {
            v60 = null;
        } else {
            v60 = csVar2.f32041a;
        }
        v60<List<List<C14618sn>>> b2 = di0.m35296b(jSONObject, "background", z, v60, C14618sn.f40069a.mo70031a(), f32031g, b, ly0);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f32041a = b2;
        if (csVar2 == null) {
            v602 = null;
        } else {
            v602 = csVar2.f32042b;
        }
        v60<C12766g> b3 = di0.m35297b(jSONObject, "next_focus_ids", z, v602, C12766g.f32050f.mo66351a(), b, ly0);
        Intrinsics.checkNotNullExpressionValue(b3, "readOptionalField(json, …ate.CREATOR, logger, env)");
        this.f32042b = b3;
        if (csVar2 == null) {
            v603 = null;
        } else {
            v603 = csVar2.f32043c;
        }
        C13064fn.C13075k kVar = C13064fn.f33412i;
        v60<List<List<C13064fn>>> b4 = di0.m35296b(jSONObject, "on_blur", z, v603, kVar.mo67047a(), f32033i, b, ly0);
        Intrinsics.checkNotNullExpressionValue(b4, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f32043c = b4;
        if (csVar2 == null) {
            v604 = null;
        } else {
            v604 = csVar2.f32044d;
        }
        v60<List<List<C13064fn>>> b5 = di0.m35296b(jSONObject, "on_focus", z, v604, kVar.mo67047a(), f32035k, b, ly0);
        Intrinsics.checkNotNullExpressionValue(b5, "readOptionalListField(js…E_VALIDATOR, logger, env)");
        this.f32044d = b5;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final boolean m34821e(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final boolean m34822f(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* renamed from: a */
    public qh0 mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        ly0 ly02 = ly0;
        JSONObject jSONObject2 = jSONObject;
        return new C12607bs(w60.m43540a(this.f32041a, ly02, "background", jSONObject2, f32030f, f32036l), (C12607bs.C12610c) w60.m43545e(this.f32042b, ly0, "next_focus_ids", jSONObject, f32037m), w60.m43540a(this.f32043c, ly0, "on_blur", jSONObject, f32032h, f32038n), w60.m43540a(this.f32044d, ly0, "on_focus", jSONObject, f32034j, f32039o));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m34816b(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m34818c(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m34820d(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m34814a(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }
}
