package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C15177xl;
import com.yandex.mobile.ads.impl.f50;
import com.yandex.mobile.ads.impl.o00;
import com.yandex.mobile.ads.impl.s00;
import com.yandex.mobile.ads.impl.w00;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.zq */
public class C15340zq implements qh0 {

    /* renamed from: g */
    public static final C15343c f43278g = new C15343c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final f50<Boolean> f43279h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final f50<o00> f43280i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final cg1<o00> f43281j = cg1.f31917a.mo66293a(ArraysKt.first((T[]) o00.values()), C15342b.f43293b);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final rh1<String> f43282k = $$Lambda$zq$QtJ7eqhcWQiMaqaxzlVIIrr_Uw.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final gj0<C15344d> f43283l = $$Lambda$zq$ao2jALHENEEfNKgfa_WYscCLxQ.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final gj0<s00> f43284m = $$Lambda$zq$IR1Nz3lh7MihvH99y1O2EXcHCjU.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final gj0<w00> f43285n = $$Lambda$zq$0NS5gT5lAxjSoE2GJyXjEzbcwbo.INSTANCE;

    /* renamed from: a */
    public final f50<Boolean> f43286a;

    /* renamed from: b */
    public final String f43287b;

    /* renamed from: c */
    public final List<C15344d> f43288c;

    /* renamed from: d */
    public final f50<o00> f43289d;

    /* renamed from: e */
    public final List<s00> f43290e;

    /* renamed from: f */
    public final List<w00> f43291f;

    /* renamed from: com.yandex.mobile.ads.impl.zq$a */
    static final class C15341a extends Lambda implements Function2<ly0, JSONObject, C15340zq> {

        /* renamed from: b */
        public static final C15341a f43292b = new C15341a();

        C15341a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return C15340zq.f43278g.mo71274a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zq$b */
    static final class C15342b extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C15342b f43293b = new C15342b();

        C15342b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof o00);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zq$c */
    public static final class C15343c {
        private C15343c() {
        }

        public /* synthetic */ C15343c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C15340zq mo71274a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            f50<Boolean> a = zh0.m44599a(jSONObject, "auto_animations_enabled", ky0.m38512b(), b, ly0, C15340zq.f43279h, dg1.f32573a);
            if (a == null) {
                a = C15340zq.f43279h;
            }
            f50<Boolean> f50 = a;
            Object a2 = zh0.m44608a(jSONObject, "log_id", C15340zq.f43282k, b, ly0);
            Intrinsics.checkNotNullExpressionValue(a2, "read(json, \"log_id\", LOG…D_VALIDATOR, logger, env)");
            String str = (String) a2;
            C15344d.C15346b bVar = C15344d.f43294c;
            List c = zh0.m44629c(jSONObject, "states", C15344d.f43295d, C15340zq.f43283l, b, ly0);
            Intrinsics.checkNotNullExpressionValue(c, "readStrictList(json, \"st…S_VALIDATOR, logger, env)");
            o00.C14159b bVar2 = o00.f38039c;
            f50 b2 = zh0.m44621b(jSONObject, "transition_animation_selector", o00.f38040d, b, ly0, C15340zq.f43281j);
            if (b2 == null) {
                b2 = C15340zq.f43280i;
            }
            f50 f502 = b2;
            s00.C14553c cVar = s00.f39775d;
            ny0 ny0 = b;
            ly0 ly02 = ly0;
            List b3 = zh0.m44626b(jSONObject, "variable_triggers", s00.f39779h, C15340zq.f43284m, ny0, ly02);
            w00.C15021d dVar = w00.f41826a;
            return new C15340zq(f50, str, c, f502, b3, zh0.m44626b(jSONObject, "variables", w00.f41827b, C15340zq.f43285n, ny0, ly02));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zq$d */
    public static class C15344d implements qh0 {

        /* renamed from: c */
        public static final C15346b f43294c = new C15346b((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: d */
        public static final Function2<ly0, JSONObject, C15344d> f43295d = C15345a.f43298b;

        /* renamed from: a */
        public final C15177xl f43296a;

        /* renamed from: b */
        public final int f43297b;

        /* renamed from: com.yandex.mobile.ads.impl.zq$d$a */
        static final class C15345a extends Lambda implements Function2<ly0, JSONObject, C15344d> {

            /* renamed from: b */
            public static final C15345a f43298b = new C15345a();

            C15345a() {
                super(2);
            }

            public Object invoke(Object obj, Object obj2) {
                ly0 ly0 = (ly0) obj;
                JSONObject jSONObject = (JSONObject) obj2;
                Intrinsics.checkNotNullParameter(ly0, "env");
                Intrinsics.checkNotNullParameter(jSONObject, "it");
                C15346b bVar = C15344d.f43294c;
                Intrinsics.checkNotNullParameter(ly0, "env");
                Intrinsics.checkNotNullParameter(jSONObject, "json");
                ny0 b = ly0.mo66818b();
                C15177xl.C15179b bVar2 = C15177xl.f42609a;
                Object a = zh0.m44612a(jSONObject, "div", C15177xl.f42610b, b, ly0);
                Intrinsics.checkNotNullExpressionValue(a, "read(json, \"div\", Div.CREATOR, logger, env)");
                Object a2 = zh0.m44609a(jSONObject, "state_id", ky0.m38514d(), b, ly0);
                Intrinsics.checkNotNullExpressionValue(a2, "read(json, \"state_id\", NUMBER_TO_INT, logger, env)");
                return new C15344d((C15177xl) a, ((Number) a2).intValue());
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.zq$d$b */
        public static final class C15346b {
            private C15346b() {
            }

            public /* synthetic */ C15346b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C15344d(C15177xl xlVar, int i) {
            Intrinsics.checkNotNullParameter(xlVar, "div");
            this.f43296a = xlVar;
            this.f43297b = i;
        }
    }

    static {
        f50.C13029a aVar = f50.f33229a;
        f43279h = aVar.mo66929a(Boolean.FALSE);
        f43280i = aVar.mo66929a(o00.NONE);
        $$Lambda$zq$ZCvDawbRIbZyUpHyr9UUGkYqU1o r0 = $$Lambda$zq$ZCvDawbRIbZyUpHyr9UUGkYqU1o.INSTANCE;
        C15341a aVar2 = C15341a.f43292b;
    }

    public C15340zq(f50<Boolean> f50, String str, List<? extends C15344d> list, f50<o00> f502, List<? extends s00> list2, List<? extends w00> list3) {
        Intrinsics.checkNotNullParameter(f50, "autoAnimationsEnabled");
        Intrinsics.checkNotNullParameter(str, "logId");
        Intrinsics.checkNotNullParameter(list, "states");
        Intrinsics.checkNotNullParameter(f502, "transitionAnimationSelector");
        this.f43286a = f50;
        this.f43287b = str;
        this.f43288c = list;
        this.f43289d = f502;
        this.f43290e = list2;
        this.f43291f = list3;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m44756a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m44759b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m44762c(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m44757a(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m44760b(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }
}
