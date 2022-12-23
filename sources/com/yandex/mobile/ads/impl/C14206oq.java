package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C14121nq;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.oq */
public abstract class C14206oq implements qh0, ci0<C14121nq> {

    /* renamed from: a */
    public static final C14208b f38297a = new C14208b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Function2<ly0, JSONObject, C14206oq> f38298b = C14207a.f38299b;

    /* renamed from: com.yandex.mobile.ads.impl.oq$a */
    static final class C14207a extends Lambda implements Function2<ly0, JSONObject, C14206oq> {

        /* renamed from: b */
        public static final C14207a f38299b = new C14207a();

        C14207a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            Object obj3;
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C14208b bVar = C14206oq.f38297a;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            String str = (String) ai0.m33744a(jSONObject, "type", (rh1) null, ly0.mo66818b(), ly0, 2);
            ci0<?> a = ly0.mo68529a().mo66059a(str);
            Object obj4 = null;
            C14206oq oqVar = a instanceof C14206oq ? (C14206oq) a : null;
            if (oqVar != null) {
                if (oqVar instanceof C14210d) {
                    str = "infinity";
                } else if (oqVar instanceof C14209c) {
                    str = "fixed";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (Intrinsics.areEqual((Object) str, (Object) "infinity")) {
                if (oqVar != null) {
                    obj4 = oqVar.mo69254b();
                }
                C12776cu cuVar = (C12776cu) obj4;
                obj3 = new C14210d(new C12776cu(ly0, jSONObject));
            } else if (Intrinsics.areEqual((Object) str, (Object) "fixed")) {
                if (oqVar != null) {
                    obj4 = oqVar.mo69254b();
                }
                obj3 = new C14209c(new C15204xr(ly0, (C15204xr) obj4, false, jSONObject));
            } else {
                throw py0.m41004a(jSONObject, "type", str);
            }
            return obj3;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.oq$b */
    public static final class C14208b {
        private C14208b() {
        }

        public /* synthetic */ C14208b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C14206oq> mo69255a() {
            return C14206oq.f38298b;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.oq$c */
    public static class C14209c extends C14206oq {

        /* renamed from: c */
        private final C15204xr f38300c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14209c(C15204xr xrVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(xrVar, "value");
            this.f38300c = xrVar;
        }

        /* renamed from: c */
        public C15204xr mo69256c() {
            return this.f38300c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.oq$d */
    public static class C14210d extends C14206oq {

        /* renamed from: c */
        private final C12776cu f38301c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14210d(C12776cu cuVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(cuVar, "value");
            this.f38301c = cuVar;
        }

        /* renamed from: c */
        public C12776cu mo69257c() {
            return this.f38301c;
        }
    }

    private C14206oq() {
    }

    public /* synthetic */ C14206oq(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public Object mo69254b() {
        if (this instanceof C14210d) {
            return ((C14210d) this).mo69257c();
        }
        if (this instanceof C14209c) {
            return ((C14209c) this).mo69256c();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public C14121nq mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        if (this instanceof C14210d) {
            ((C14210d) this).mo69257c().getClass();
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "data");
            return new C14121nq.C14125d(new C12654bu());
        } else if (this instanceof C14209c) {
            return new C14121nq.C14124c(((C14209c) this).mo69256c().mo65774a(ly0, jSONObject));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
