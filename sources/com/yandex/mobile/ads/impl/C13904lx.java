package com.yandex.mobile.ads.impl;

import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.VungleApiClient;
import com.yandex.mobile.ads.impl.C12992er;
import com.yandex.mobile.ads.impl.C13525jn;
import com.yandex.mobile.ads.impl.cg1;
import com.yandex.mobile.ads.impl.f50;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.lx */
public class C13904lx implements qh0 {

    /* renamed from: f */
    public static final C13908d f36937f = new C13908d((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final f50<Integer> f36938g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final f50<C13909e> f36939h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final f50<C13525jn> f36940i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final f50<Integer> f36941j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final cg1<C13909e> f36942k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final cg1<C13525jn> f36943l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final rh1<Integer> f36944m = $$Lambda$lx$i8HYhnNLEUer_cMv9sSJr7ue8Rk.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final rh1<Integer> f36945n = $$Lambda$lx$YptQyXIQu8b31lJMyhXqdcYN0kY.INSTANCE;

    /* renamed from: a */
    public final C12992er f36946a;

    /* renamed from: b */
    private final f50<Integer> f36947b;

    /* renamed from: c */
    public final f50<C13909e> f36948c;

    /* renamed from: d */
    private final f50<C13525jn> f36949d;

    /* renamed from: e */
    private final f50<Integer> f36950e;

    /* renamed from: com.yandex.mobile.ads.impl.lx$a */
    static final class C13905a extends Lambda implements Function2<ly0, JSONObject, C13904lx> {

        /* renamed from: b */
        public static final C13905a f36951b = new C13905a();

        C13905a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return C13904lx.f36937f.mo68525a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lx$b */
    static final class C13906b extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C13906b f36952b = new C13906b();

        C13906b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13909e);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lx$c */
    static final class C13907c extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C13907c f36953b = new C13907c();

        C13907c() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13525jn);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lx$d */
    public static final class C13908d {
        private C13908d() {
        }

        public /* synthetic */ C13908d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C13904lx mo68525a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            C12992er.C12995c cVar = C12992er.f33046c;
            C12992er erVar = (C12992er) zh0.m44622b(jSONObject, "distance", C12992er.f33049f, b, ly0);
            Function1<Number, Integer> d = ky0.m38514d();
            rh1 b2 = C13904lx.f36944m;
            f50 a = C13904lx.f36938g;
            cg1<Integer> cg1 = dg1.f32574b;
            f50 a2 = zh0.m44601a(jSONObject, "duration", (Function1) d, b2, b, a, (cg1) cg1);
            if (a2 == null) {
                a2 = C13904lx.f36938g;
            }
            f50 f50 = a2;
            C13909e.C13911b bVar = C13909e.f36954c;
            f50 b3 = zh0.m44621b(jSONObject, VungleApiClient.ConnectionTypeDetail.EDGE, C13909e.f36955d, b, ly0, C13904lx.f36942k);
            if (b3 == null) {
                b3 = C13904lx.f36939h;
            }
            f50 f502 = b3;
            C13525jn.C13527b bVar2 = C13525jn.f35400c;
            f50 b4 = zh0.m44621b(jSONObject, "interpolator", C13525jn.f35401d, b, ly0, C13904lx.f36943l);
            if (b4 == null) {
                b4 = C13904lx.f36940i;
            }
            f50 a3 = zh0.m44601a(jSONObject, "start_delay", (Function1) ky0.m38514d(), C13904lx.f36945n, b, C13904lx.f36941j, (cg1) cg1);
            if (a3 == null) {
                a3 = C13904lx.f36941j;
            }
            return new C13904lx(erVar, f50, f502, b4, a3);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lx$e */
    public enum C13909e {
        LEFT("left"),
        TOP("top"),
        RIGHT("right"),
        BOTTOM(TJAdUnitConstants.String.BOTTOM);
        

        /* renamed from: c */
        public static final C13911b f36954c = null;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public static final Function1<String, C13909e> f36955d = null;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f36961b;

        /* renamed from: com.yandex.mobile.ads.impl.lx$e$a */
        static final class C13910a extends Lambda implements Function1<String, C13909e> {

            /* renamed from: b */
            public static final C13910a f36962b = null;

            static {
                f36962b = new C13910a();
            }

            C13910a() {
                super(1);
            }

            public Object invoke(Object obj) {
                String str = (String) obj;
                Intrinsics.checkNotNullParameter(str, "string");
                C13909e eVar = C13909e.LEFT;
                if (Intrinsics.areEqual((Object) str, (Object) eVar.f36961b)) {
                    return eVar;
                }
                C13909e eVar2 = C13909e.TOP;
                if (Intrinsics.areEqual((Object) str, (Object) eVar2.f36961b)) {
                    return eVar2;
                }
                C13909e eVar3 = C13909e.RIGHT;
                if (Intrinsics.areEqual((Object) str, (Object) eVar3.f36961b)) {
                    return eVar3;
                }
                C13909e eVar4 = C13909e.BOTTOM;
                if (Intrinsics.areEqual((Object) str, (Object) eVar4.f36961b)) {
                    return eVar4;
                }
                return null;
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.lx$e$b */
        public static final class C13911b {
            private C13911b() {
            }

            public /* synthetic */ C13911b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final Function1<String, C13909e> mo68526a() {
                return C13909e.f36955d;
            }
        }

        static {
            f36954c = new C13911b((DefaultConstructorMarker) null);
            f36955d = C13910a.f36962b;
        }

        private C13909e(String str) {
            this.f36961b = str;
        }
    }

    static {
        f50.C13029a aVar = f50.f33229a;
        f36938g = aVar.mo66929a(200);
        f36939h = aVar.mo66929a(C13909e.BOTTOM);
        f36940i = aVar.mo66929a(C13525jn.EASE_IN_OUT);
        f36941j = aVar.mo66929a(0);
        cg1.C12733a aVar2 = cg1.f31917a;
        f36942k = aVar2.mo66293a(ArraysKt.first((T[]) C13909e.values()), C13906b.f36952b);
        f36943l = aVar2.mo66293a(ArraysKt.first((T[]) C13525jn.values()), C13907c.f36953b);
        $$Lambda$lx$gADo52cFczMKzRXk1j8PnFTvcI r0 = $$Lambda$lx$gADo52cFczMKzRXk1j8PnFTvcI.INSTANCE;
        $$Lambda$lx$hIyNQqlEYCcpap3d2oAHS9kwOwk r02 = $$Lambda$lx$hIyNQqlEYCcpap3d2oAHS9kwOwk.INSTANCE;
        C13905a aVar3 = C13905a.f36951b;
    }

    public C13904lx(C12992er erVar, f50<Integer> f50, f50<C13909e> f502, f50<C13525jn> f503, f50<Integer> f504) {
        Intrinsics.checkNotNullParameter(f50, "duration");
        Intrinsics.checkNotNullParameter(f502, VungleApiClient.ConnectionTypeDetail.EDGE);
        Intrinsics.checkNotNullParameter(f503, "interpolator");
        Intrinsics.checkNotNullParameter(f504, "startDelay");
        this.f36946a = erVar;
        this.f36947b = f50;
        this.f36948c = f502;
        this.f36949d = f503;
        this.f36950e = f504;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m39025a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m39027b(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m39029c(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m39031d(int i) {
        return i >= 0;
    }

    /* renamed from: i */
    public f50<Integer> mo68522i() {
        return this.f36947b;
    }

    /* renamed from: j */
    public f50<C13525jn> mo68523j() {
        return this.f36949d;
    }

    /* renamed from: k */
    public f50<Integer> mo68524k() {
        return this.f36950e;
    }
}
