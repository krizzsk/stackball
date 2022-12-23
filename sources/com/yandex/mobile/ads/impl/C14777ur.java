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

/* renamed from: com.yandex.mobile.ads.impl.ur */
public class C14777ur implements qh0 {

    /* renamed from: e */
    public static final C14780c f40848e = new C14780c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final f50<Double> f40849f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final f50<Integer> f40850g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final f50<C13525jn> f40851h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final f50<Integer> f40852i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final cg1<C13525jn> f40853j = cg1.f31917a.mo66293a(ArraysKt.first((T[]) C13525jn.values()), C14779b.f40863b);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final rh1<Double> f40854k = $$Lambda$ur$5cUAqZ_JXp6kR0Nei4Z0VPalag.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final rh1<Integer> f40855l = $$Lambda$ur$V4yy6zO8_x3Cm9HFUHijv2eBTqY.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final rh1<Integer> f40856m = $$Lambda$ur$sRxWiOaPVPOPZ6e7l7QdXs3doDc.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final Function2<ly0, JSONObject, C14777ur> f40857n = C14778a.f40862b;

    /* renamed from: a */
    public final f50<Double> f40858a;

    /* renamed from: b */
    private final f50<Integer> f40859b;

    /* renamed from: c */
    private final f50<C13525jn> f40860c;

    /* renamed from: d */
    private final f50<Integer> f40861d;

    /* renamed from: com.yandex.mobile.ads.impl.ur$a */
    static final class C14778a extends Lambda implements Function2<ly0, JSONObject, C14777ur> {

        /* renamed from: b */
        public static final C14778a f40862b = new C14778a();

        C14778a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return C14777ur.f40848e.mo70395a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ur$b */
    static final class C14779b extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C14779b f40863b = new C14779b();

        C14779b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13525jn);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ur$c */
    public static final class C14780c {
        private C14780c() {
        }

        public /* synthetic */ C14780c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C14777ur mo70395a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            f50 a = zh0.m44601a(jSONObject, "alpha", (Function1) ky0.m38513c(), C14777ur.f40854k, b, C14777ur.f40849f, (cg1) dg1.f32576d);
            if (a == null) {
                a = C14777ur.f40849f;
            }
            f50 f50 = a;
            Function1<Number, Integer> d = ky0.m38514d();
            rh1 e = C14777ur.f40855l;
            f50 d2 = C14777ur.f40850g;
            cg1<Integer> cg1 = dg1.f32574b;
            f50 a2 = zh0.m44601a(jSONObject, "duration", (Function1) d, e, b, d2, (cg1) cg1);
            if (a2 == null) {
                a2 = C14777ur.f40850g;
            }
            f50 f502 = a2;
            C13525jn.C13527b bVar = C13525jn.f35400c;
            f50 b2 = zh0.m44621b(jSONObject, "interpolator", C13525jn.f35401d, b, ly0, C14777ur.f40853j);
            if (b2 == null) {
                b2 = C14777ur.f40851h;
            }
            f50 a3 = zh0.m44601a(jSONObject, "start_delay", (Function1) ky0.m38514d(), C14777ur.f40856m, b, C14777ur.f40852i, (cg1) cg1);
            if (a3 == null) {
                a3 = C14777ur.f40852i;
            }
            return new C14777ur(f50, f502, b2, a3);
        }
    }

    static {
        f50.C13029a aVar = f50.f33229a;
        f40849f = aVar.mo66929a(Double.valueOf(0.0d));
        f40850g = aVar.mo66929a(200);
        f40851h = aVar.mo66929a(C13525jn.EASE_IN_OUT);
        f40852i = aVar.mo66929a(0);
        $$Lambda$ur$cLUVVcZjYkzlAg5FA9ZbBLIjMHs r0 = $$Lambda$ur$cLUVVcZjYkzlAg5FA9ZbBLIjMHs.INSTANCE;
        $$Lambda$ur$26zFljXpWwJGeZrlgIIXqRixxDk r02 = $$Lambda$ur$26zFljXpWwJGeZrlgIIXqRixxDk.INSTANCE;
        $$Lambda$ur$dvJVajT3664DUCaIDz1zH7yRMc r03 = $$Lambda$ur$dvJVajT3664DUCaIDz1zH7yRMc.INSTANCE;
    }

    public C14777ur() {
        this((f50) null, (f50) null, (f50) null, (f50) null, 15);
    }

    public C14777ur(f50<Double> f50, f50<Integer> f502, f50<C13525jn> f503, f50<Integer> f504) {
        Intrinsics.checkNotNullParameter(f50, "alpha");
        Intrinsics.checkNotNullParameter(f502, "duration");
        Intrinsics.checkNotNullParameter(f503, "interpolator");
        Intrinsics.checkNotNullParameter(f504, "startDelay");
        this.f40858a = f50;
        this.f40859b = f502;
        this.f40860c = f503;
        this.f40861d = f504;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m42799a(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m42800a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m42802b(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m42803b(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m42805c(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m42807d(int i) {
        return i >= 0;
    }

    /* renamed from: j */
    public f50<Integer> mo70392j() {
        return this.f40859b;
    }

    /* renamed from: k */
    public f50<C13525jn> mo70393k() {
        return this.f40860c;
    }

    /* renamed from: l */
    public f50<Integer> mo70394l() {
        return this.f40861d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14777ur(f50 f50, f50 f502, f50 f503, f50 f504, int i) {
        this((i & 1) != 0 ? f40849f : null, (i & 2) != 0 ? f40850g : null, (i & 4) != 0 ? f40851h : null, (i & 8) != 0 ? f40852i : null);
    }
}
