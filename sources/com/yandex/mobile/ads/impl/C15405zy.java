package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C13794kx;
import com.yandex.mobile.ads.impl.f50;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.zy */
public class C15405zy implements qh0 {

    /* renamed from: d */
    public static final C15408c f43497d = new C15408c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final f50<C13794kx> f43498e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final f50<Integer> f43499f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final cg1<C13794kx> f43500g = cg1.f31917a.mo66293a(ArraysKt.first((T[]) C13794kx.values()), C15407b.f43507b);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final rh1<Integer> f43501h = $$Lambda$zy$AZeCx4a4B8nKKlcp6DXrCJiWZ1w.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final Function2<ly0, JSONObject, C15405zy> f43502i = C15406a.f43506b;

    /* renamed from: a */
    public final f50<Integer> f43503a;

    /* renamed from: b */
    public final f50<C13794kx> f43504b;

    /* renamed from: c */
    public final f50<Integer> f43505c;

    /* renamed from: com.yandex.mobile.ads.impl.zy$a */
    static final class C15406a extends Lambda implements Function2<ly0, JSONObject, C15405zy> {

        /* renamed from: b */
        public static final C15406a f43506b = new C15406a();

        C15406a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C15408c cVar = C15405zy.f43497d;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            ny0 ny0 = b;
            ly0 ly02 = ly0;
            f50<Integer> a = zh0.m44598a(jSONObject, "color", ky0.m38515e(), ny0, ly02, dg1.f32578f);
            Intrinsics.checkNotNullExpressionValue(a, "readExpression(json, \"co…, env, TYPE_HELPER_COLOR)");
            C13794kx.C13796b bVar = C13794kx.f36440c;
            f50 b2 = zh0.m44621b(jSONObject, "unit", C13794kx.f36441d, ny0, ly02, C15405zy.f43500g);
            if (b2 == null) {
                b2 = C15405zy.f43498e;
            }
            f50 a2 = zh0.m44601a(jSONObject, "width", (Function1) ky0.m38514d(), C15405zy.f43501h, b, C15405zy.f43499f, (cg1) dg1.f32574b);
            if (a2 == null) {
                a2 = C15405zy.f43499f;
            }
            return new C15405zy(a, b2, a2);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zy$b */
    static final class C15407b extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C15407b f43507b = new C15407b();

        C15407b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13794kx);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zy$c */
    public static final class C15408c {
        private C15408c() {
        }

        public /* synthetic */ C15408c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        f50.C13029a aVar = f50.f33229a;
        f43498e = aVar.mo66929a(C13794kx.DP);
        f43499f = aVar.mo66929a(1);
        $$Lambda$zy$ucCei0kItsUCZkVAVudAJbjo6BU r0 = $$Lambda$zy$ucCei0kItsUCZkVAVudAJbjo6BU.INSTANCE;
    }

    public C15405zy(f50<Integer> f50, f50<C13794kx> f502, f50<Integer> f503) {
        Intrinsics.checkNotNullParameter(f50, "color");
        Intrinsics.checkNotNullParameter(f502, "unit");
        Intrinsics.checkNotNullParameter(f503, "width");
        this.f43503a = f50;
        this.f43504b = f502;
        this.f43505c = f503;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m44854a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m44856b(int i) {
        return i >= 0;
    }
}
