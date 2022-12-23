package com.yandex.mobile.ads.impl;

import com.tapjoy.TJAdUnitConstants;
import com.yandex.mobile.ads.impl.C13794kx;
import com.yandex.mobile.ads.impl.f50;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.kr */
public class C13776kr implements qh0 {

    /* renamed from: f */
    public static final C13779c f36385f = new C13779c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final f50<Integer> f36386g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final f50<Integer> f36387h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final f50<Integer> f36388i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final f50<Integer> f36389j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final f50<C13794kx> f36390k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final cg1<C13794kx> f36391l = cg1.f31917a.mo66293a(ArraysKt.first((T[]) C13794kx.values()), C13778b.f36403b);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final rh1<Integer> f36392m = $$Lambda$kr$rkcjMrK5gTDyjNuo9iNQoWZ4Kc.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final rh1<Integer> f36393n = $$Lambda$kr$x2aoV1dELTCfr9exBhQU2oIFIUA.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final rh1<Integer> f36394o = $$Lambda$kr$y0SPW7buMbH0Alfqqw42NdYgi7Y.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final rh1<Integer> f36395p = $$Lambda$kr$whZBcIuK6NqGUCvC7gj7VSZiY9I.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final Function2<ly0, JSONObject, C13776kr> f36396q = C13777a.f36402b;

    /* renamed from: a */
    public final f50<Integer> f36397a;

    /* renamed from: b */
    public final f50<Integer> f36398b;

    /* renamed from: c */
    public final f50<Integer> f36399c;

    /* renamed from: d */
    public final f50<Integer> f36400d;

    /* renamed from: e */
    public final f50<C13794kx> f36401e;

    /* renamed from: com.yandex.mobile.ads.impl.kr$a */
    static final class C13777a extends Lambda implements Function2<ly0, JSONObject, C13776kr> {

        /* renamed from: b */
        public static final C13777a f36402b = new C13777a();

        C13777a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C13779c cVar = C13776kr.f36385f;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            Function1<Number, Integer> d = ky0.m38514d();
            rh1 b2 = C13776kr.f36392m;
            f50 a = C13776kr.f36386g;
            cg1<Integer> cg1 = dg1.f32574b;
            f50 a2 = zh0.m44601a(jSONObject, TJAdUnitConstants.String.BOTTOM, (Function1) d, b2, b, a, (cg1) cg1);
            if (a2 == null) {
                a2 = C13776kr.f36386g;
            }
            f50 f50 = a2;
            f50 a3 = zh0.m44601a(jSONObject, "left", (Function1) ky0.m38514d(), C13776kr.f36393n, b, C13776kr.f36387h, (cg1) cg1);
            if (a3 == null) {
                a3 = C13776kr.f36387h;
            }
            f50 f502 = a3;
            f50 a4 = zh0.m44601a(jSONObject, "right", (Function1) ky0.m38514d(), C13776kr.f36394o, b, C13776kr.f36388i, (cg1) cg1);
            if (a4 == null) {
                a4 = C13776kr.f36388i;
            }
            f50 f503 = a4;
            f50 a5 = zh0.m44601a(jSONObject, "top", (Function1) ky0.m38514d(), C13776kr.f36395p, b, C13776kr.f36389j, (cg1) cg1);
            if (a5 == null) {
                a5 = C13776kr.f36389j;
            }
            f50 f504 = a5;
            C13794kx.C13796b bVar = C13794kx.f36440c;
            f50 b3 = zh0.m44621b(jSONObject, "unit", C13794kx.f36441d, b, ly0, C13776kr.f36391l);
            if (b3 == null) {
                b3 = C13776kr.f36390k;
            }
            return new C13776kr(f50, f502, f503, f504, b3);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kr$b */
    static final class C13778b extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C13778b f36403b = new C13778b();

        C13778b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13794kx);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kr$c */
    public static final class C13779c {
        private C13779c() {
        }

        public /* synthetic */ C13779c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        f50.C13029a aVar = f50.f33229a;
        f36386g = aVar.mo66929a(0);
        f36387h = aVar.mo66929a(0);
        f36388i = aVar.mo66929a(0);
        f36389j = aVar.mo66929a(0);
        f36390k = aVar.mo66929a(C13794kx.DP);
        $$Lambda$kr$h_sbZjYy2lB3gk2y4lGoQF6sQs r0 = $$Lambda$kr$h_sbZjYy2lB3gk2y4lGoQF6sQs.INSTANCE;
        $$Lambda$kr$vn0hT_zySstLkZLwCFAB1pvsUcY r02 = $$Lambda$kr$vn0hT_zySstLkZLwCFAB1pvsUcY.INSTANCE;
        $$Lambda$kr$H16WR0_MCdtQ3ZAdct4JtGmEBNw r03 = $$Lambda$kr$H16WR0_MCdtQ3ZAdct4JtGmEBNw.INSTANCE;
        $$Lambda$kr$dv7VT6sOtx8Y9AMZjNMy71HPLKY r04 = $$Lambda$kr$dv7VT6sOtx8Y9AMZjNMy71HPLKY.INSTANCE;
    }

    public C13776kr() {
        this((f50) null, (f50) null, (f50) null, (f50) null, (f50) null, 31);
    }

    public C13776kr(f50<Integer> f50, f50<Integer> f502, f50<Integer> f503, f50<Integer> f504, f50<C13794kx> f505) {
        Intrinsics.checkNotNullParameter(f50, TJAdUnitConstants.String.BOTTOM);
        Intrinsics.checkNotNullParameter(f502, "left");
        Intrinsics.checkNotNullParameter(f503, "right");
        Intrinsics.checkNotNullParameter(f504, "top");
        Intrinsics.checkNotNullParameter(f505, "unit");
        this.f36397a = f50;
        this.f36398b = f502;
        this.f36399c = f503;
        this.f36400d = f504;
        this.f36401e = f505;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m38460a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m38462b(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m38464c(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m38466d(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final boolean m38468e(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final boolean m38470f(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final boolean m38472g(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final boolean m38474h(int i) {
        return i >= 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13776kr(f50<Integer> f50, f50<Integer> f502, f50<Integer> f503, f50<Integer> f504, f50 f505, int i) {
        this((i & 1) != 0 ? f36386g : f50, (i & 2) != 0 ? f36387h : f502, (i & 4) != 0 ? f36388i : f503, (i & 8) != 0 ? f36389j : f504, (i & 16) != 0 ? f36390k : null);
    }
}
