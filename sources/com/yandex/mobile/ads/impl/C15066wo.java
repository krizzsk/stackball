package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C12663bx;
import com.yandex.mobile.ads.impl.C13873lq;
import com.yandex.mobile.ads.impl.C15405zy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.wo */
public class C15066wo implements qh0 {

    /* renamed from: f */
    public static final C15068b f42068f = new C15068b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final f50<Boolean> f42069g = f50.f33229a.mo66929a(Boolean.FALSE);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final rh1<Integer> f42070h = $$Lambda$wo$yRSeORwFzETdW7RfCC0s0wpVSQ.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final Function2<ly0, JSONObject, C15066wo> f42071i = C15067a.f42077b;

    /* renamed from: a */
    public final f50<Integer> f42072a;

    /* renamed from: b */
    public final C13873lq f42073b;

    /* renamed from: c */
    public final f50<Boolean> f42074c;

    /* renamed from: d */
    public final C12663bx f42075d;

    /* renamed from: e */
    public final C15405zy f42076e;

    /* renamed from: com.yandex.mobile.ads.impl.wo$a */
    static final class C15067a extends Lambda implements Function2<ly0, JSONObject, C15066wo> {

        /* renamed from: b */
        public static final C15067a f42077b = new C15067a();

        C15067a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C15068b bVar = C15066wo.f42068f;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            f50 a = zh0.m44601a(jSONObject, "corner_radius", (Function1) ky0.m38514d(), C15066wo.f42070h, b, (f50) null, (cg1) dg1.f32574b);
            C13873lq.C13875b bVar2 = C13873lq.f36780e;
            C13873lq lqVar = (C13873lq) zh0.m44622b(jSONObject, "corners_radius", C13873lq.f36785j, b, ly0);
            f50<Boolean> a2 = zh0.m44599a(jSONObject, "has_shadow", ky0.m38512b(), b, ly0, C15066wo.f42069g, dg1.f32573a);
            if (a2 == null) {
                a2 = C15066wo.f42069g;
            }
            f50<Boolean> f50 = a2;
            C12663bx.C12665b bVar3 = C12663bx.f31611e;
            C15405zy.C15408c cVar = C15405zy.f43497d;
            return new C15066wo(a, lqVar, f50, (C12663bx) zh0.m44622b(jSONObject, "shadow", C12663bx.f31617k, b, ly0), (C15405zy) zh0.m44622b(jSONObject, "stroke", C15405zy.f43502i, b, ly0));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.wo$b */
    public static final class C15068b {
        private C15068b() {
        }

        public /* synthetic */ C15068b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        $$Lambda$wo$yaPDZ8wDy8p4HLfujcb7EKv8wEw r0 = $$Lambda$wo$yaPDZ8wDy8p4HLfujcb7EKv8wEw.INSTANCE;
    }

    public C15066wo() {
        this((f50) null, (C13873lq) null, (f50) null, (C12663bx) null, (C15405zy) null, 31);
    }

    public C15066wo(f50<Integer> f50, C13873lq lqVar, f50<Boolean> f502, C12663bx bxVar, C15405zy zyVar) {
        Intrinsics.checkNotNullParameter(f502, "hasShadow");
        this.f42072a = f50;
        this.f42073b = lqVar;
        this.f42074c = f502;
        this.f42075d = bxVar;
        this.f42076e = zyVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m43733a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m43735b(int i) {
        return i >= 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15066wo(f50 f50, C13873lq lqVar, f50 f502, C12663bx bxVar, C15405zy zyVar, int i) {
        this((f50<Integer>) null, (C13873lq) null, (i & 4) != 0 ? f42069g : null, (C12663bx) null, (C15405zy) null);
    }
}
