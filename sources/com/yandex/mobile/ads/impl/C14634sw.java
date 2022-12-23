package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C13525jn;
import com.yandex.mobile.ads.impl.f50;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.sw */
public class C14634sw implements qh0 {

    /* renamed from: g */
    public static final C14637c f40138g = new C14637c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final f50<Integer> f40139h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final f50<C13525jn> f40140i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final f50<Double> f40141j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final f50<Double> f40142k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final f50<Double> f40143l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final f50<Integer> f40144m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final cg1<C13525jn> f40145n = cg1.f31917a.mo66293a(ArraysKt.first((T[]) C13525jn.values()), C14636b.f40158b);
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final rh1<Integer> f40146o = $$Lambda$sw$vkhD1uNW6HvGcSYH1Zx9xcAPgtQ.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final rh1<Double> f40147p = $$Lambda$sw$Rfg9hMtCdPjQz5rj5T1EB18mUSU.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final rh1<Double> f40148q = $$Lambda$sw$iiuP8IM0K0I5fPWedzz1M0zjfhE.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final rh1<Double> f40149r = $$Lambda$sw$421dKvMec5d3vZPFAdey9d9keZI.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final rh1<Integer> f40150s = $$Lambda$sw$elwujuBppJQXrWdc67Sa3VjEyOQ.INSTANCE;

    /* renamed from: a */
    private final f50<Integer> f40151a;

    /* renamed from: b */
    private final f50<C13525jn> f40152b;

    /* renamed from: c */
    public final f50<Double> f40153c;

    /* renamed from: d */
    public final f50<Double> f40154d;

    /* renamed from: e */
    public final f50<Double> f40155e;

    /* renamed from: f */
    private final f50<Integer> f40156f;

    /* renamed from: com.yandex.mobile.ads.impl.sw$a */
    static final class C14635a extends Lambda implements Function2<ly0, JSONObject, C14634sw> {

        /* renamed from: b */
        public static final C14635a f40157b = new C14635a();

        C14635a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return C14634sw.f40138g.mo70065a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sw$b */
    static final class C14636b extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C14636b f40158b = new C14636b();

        C14636b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13525jn);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sw$c */
    public static final class C14637c {
        private C14637c() {
        }

        public /* synthetic */ C14637c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C14634sw mo70065a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            Function1<Number, Integer> d = ky0.m38514d();
            rh1 b2 = C14634sw.f40146o;
            f50 a = C14634sw.f40139h;
            cg1<Integer> cg1 = dg1.f32574b;
            f50 a2 = zh0.m44601a(jSONObject, "duration", (Function1) d, b2, b, a, (cg1) cg1);
            if (a2 == null) {
                a2 = C14634sw.f40139h;
            }
            f50 f50 = a2;
            C13525jn.C13527b bVar = C13525jn.f35400c;
            f50 b3 = zh0.m44621b(jSONObject, "interpolator", C13525jn.f35401d, b, ly0, C14634sw.f40145n);
            if (b3 == null) {
                b3 = C14634sw.f40140i;
            }
            f50 f502 = b3;
            Function1<Number, Double> c = ky0.m38513c();
            rh1 e = C14634sw.f40147p;
            f50 d2 = C14634sw.f40141j;
            cg1<Double> cg12 = dg1.f32576d;
            f50 a3 = zh0.m44601a(jSONObject, "pivot_x", (Function1) c, e, b, d2, (cg1) cg12);
            if (a3 == null) {
                a3 = C14634sw.f40141j;
            }
            f50 f503 = a3;
            f50 a4 = zh0.m44601a(jSONObject, "pivot_y", (Function1) ky0.m38513c(), C14634sw.f40148q, b, C14634sw.f40142k, (cg1) cg12);
            if (a4 == null) {
                a4 = C14634sw.f40142k;
            }
            f50 f504 = a4;
            f50 a5 = zh0.m44601a(jSONObject, "scale", (Function1) ky0.m38513c(), C14634sw.f40149r, b, C14634sw.f40143l, (cg1) cg12);
            if (a5 == null) {
                a5 = C14634sw.f40143l;
            }
            f50 f505 = a5;
            f50 a6 = zh0.m44601a(jSONObject, "start_delay", (Function1) ky0.m38514d(), C14634sw.f40150s, b, C14634sw.f40144m, (cg1) cg1);
            if (a6 == null) {
                a6 = C14634sw.f40144m;
            }
            return new C14634sw(f50, f502, f503, f504, f505, a6);
        }
    }

    static {
        f50.C13029a aVar = f50.f33229a;
        f40139h = aVar.mo66929a(200);
        f40140i = aVar.mo66929a(C13525jn.EASE_IN_OUT);
        Double valueOf = Double.valueOf(0.5d);
        f40141j = aVar.mo66929a(valueOf);
        f40142k = aVar.mo66929a(valueOf);
        f40143l = aVar.mo66929a(Double.valueOf(0.0d));
        f40144m = aVar.mo66929a(0);
        $$Lambda$sw$TGD1nnbV8FrFxRMuzNnbef4A8c4 r0 = $$Lambda$sw$TGD1nnbV8FrFxRMuzNnbef4A8c4.INSTANCE;
        $$Lambda$sw$bT29z3cVhFgxONN145uWynHGk8 r02 = $$Lambda$sw$bT29z3cVhFgxONN145uWynHGk8.INSTANCE;
        $$Lambda$sw$RHSVFSOMj46U0tqDG19IcLjfkcU r03 = $$Lambda$sw$RHSVFSOMj46U0tqDG19IcLjfkcU.INSTANCE;
        $$Lambda$sw$VREtASXQE7eAPJvE3qnvnRrXo8s r04 = $$Lambda$sw$VREtASXQE7eAPJvE3qnvnRrXo8s.INSTANCE;
        $$Lambda$sw$CTFB4scXPpEYhoplqiuu3K0a5c r05 = $$Lambda$sw$CTFB4scXPpEYhoplqiuu3K0a5c.INSTANCE;
        C14635a aVar2 = C14635a.f40157b;
    }

    public C14634sw(f50<Integer> f50, f50<C13525jn> f502, f50<Double> f503, f50<Double> f504, f50<Double> f505, f50<Integer> f506) {
        Intrinsics.checkNotNullParameter(f50, "duration");
        Intrinsics.checkNotNullParameter(f502, "interpolator");
        Intrinsics.checkNotNullParameter(f503, "pivotX");
        Intrinsics.checkNotNullParameter(f504, "pivotY");
        Intrinsics.checkNotNullParameter(f505, "scale");
        Intrinsics.checkNotNullParameter(f506, "startDelay");
        this.f40151a = f50;
        this.f40152b = f502;
        this.f40153c = f503;
        this.f40154d = f504;
        this.f40155e = f505;
        this.f40156f = f506;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m42152a(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m42153a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m42155b(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m42156b(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m42158c(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m42159c(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m42161d(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m42162d(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final boolean m42164e(double d) {
        return d >= 0.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final boolean m42166f(double d) {
        return d >= 0.0d;
    }

    /* renamed from: m */
    public f50<Integer> mo70062m() {
        return this.f40151a;
    }

    /* renamed from: n */
    public f50<C13525jn> mo70063n() {
        return this.f40152b;
    }

    /* renamed from: o */
    public f50<Integer> mo70064o() {
        return this.f40156f;
    }
}
