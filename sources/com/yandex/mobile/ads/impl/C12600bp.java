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

/* renamed from: com.yandex.mobile.ads.impl.bp */
public class C12600bp implements qh0 {

    /* renamed from: e */
    public static final C12603c f31382e = new C12603c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final f50<Integer> f31383f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final f50<C13525jn> f31384g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final f50<Integer> f31385h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final cg1<C13525jn> f31386i = cg1.f31917a.mo66293a(ArraysKt.first((T[]) C13525jn.values()), C12602b.f31395b);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final rh1<Integer> f31387j = $$Lambda$bp$BQaA1ol6b9ZXcFPfrxktOvXOL6I.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final rh1<String> f31388k = $$Lambda$bp$lE4k3KslBexf7vUapq31wIzYgY.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final rh1<Integer> f31389l = $$Lambda$bp$IvLW65WBSxRByuuo3xn_4Xg9gWQ.INSTANCE;

    /* renamed from: a */
    private final f50<Integer> f31390a;

    /* renamed from: b */
    private final f50<C13525jn> f31391b;

    /* renamed from: c */
    public final f50<String> f31392c;

    /* renamed from: d */
    private final f50<Integer> f31393d;

    /* renamed from: com.yandex.mobile.ads.impl.bp$a */
    static final class C12601a extends Lambda implements Function2<ly0, JSONObject, C12600bp> {

        /* renamed from: b */
        public static final C12601a f31394b = new C12601a();

        C12601a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return C12600bp.f31382e.mo66106a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.bp$b */
    static final class C12602b extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C12602b f31395b = new C12602b();

        C12602b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13525jn);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.bp$c */
    public static final class C12603c {
        private C12603c() {
        }

        public /* synthetic */ C12603c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C12600bp mo66106a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            Function1<Number, Integer> d = ky0.m38514d();
            rh1 b2 = C12600bp.f31387j;
            f50 a = C12600bp.f31383f;
            cg1<Integer> cg1 = dg1.f32574b;
            f50 a2 = zh0.m44601a(jSONObject, "duration", (Function1) d, b2, b, a, (cg1) cg1);
            if (a2 == null) {
                a2 = C12600bp.f31383f;
            }
            f50 f50 = a2;
            C13525jn.C13527b bVar = C13525jn.f35400c;
            f50 b3 = zh0.m44621b(jSONObject, "interpolator", C13525jn.f35401d, b, ly0, C12600bp.f31386i);
            if (b3 == null) {
                b3 = C12600bp.f31384g;
            }
            f50 f502 = b3;
            JSONObject jSONObject2 = jSONObject;
            f50<String> b4 = zh0.m44620b(jSONObject2, "path_motion", C12600bp.f31388k, b, ly0, dg1.f32575c);
            f50 a3 = zh0.m44601a(jSONObject2, "start_delay", (Function1) ky0.m38514d(), C12600bp.f31389l, b, C12600bp.f31385h, (cg1) cg1);
            if (a3 == null) {
                a3 = C12600bp.f31385h;
            }
            return new C12600bp(f50, f502, b4, a3);
        }
    }

    static {
        f50.C13029a aVar = f50.f33229a;
        f31383f = aVar.mo66929a(200);
        f31384g = aVar.mo66929a(C13525jn.EASE_IN_OUT);
        f31385h = aVar.mo66929a(0);
        $$Lambda$bp$HIeLLSAxab9aL5PgYy9__MdJrY r0 = $$Lambda$bp$HIeLLSAxab9aL5PgYy9__MdJrY.INSTANCE;
        $$Lambda$bp$KrkS4s1z6XEfKZ16g3PqHRX9E r02 = $$Lambda$bp$KrkS4s1z6XEfKZ16g3PqHRX9E.INSTANCE;
        $$Lambda$bp$Z7tUeaIVF2mQgmmBWYAPbTs1S8 r03 = $$Lambda$bp$Z7tUeaIVF2mQgmmBWYAPbTs1S8.INSTANCE;
        C12601a aVar2 = C12601a.f31394b;
    }

    public C12600bp(f50<Integer> f50, f50<C13525jn> f502, f50<String> f503, f50<Integer> f504) {
        Intrinsics.checkNotNullParameter(f50, "duration");
        Intrinsics.checkNotNullParameter(f502, "interpolator");
        Intrinsics.checkNotNullParameter(f504, "startDelay");
        this.f31390a = f50;
        this.f31391b = f502;
        this.f31392c = f503;
        this.f31393d = f504;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m34289a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m34292b(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m34295c(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m34297d(int i) {
        return i >= 0;
    }

    /* renamed from: h */
    public f50<Integer> mo66103h() {
        return this.f31390a;
    }

    /* renamed from: i */
    public f50<C13525jn> mo66104i() {
        return this.f31391b;
    }

    /* renamed from: j */
    public f50<Integer> mo66105j() {
        return this.f31393d;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m34290a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m34293b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }
}
