package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C12654bu;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.nq */
public abstract class C14121nq implements qh0 {

    /* renamed from: a */
    public static final C14123b f37876a = new C14123b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Function2<ly0, JSONObject, C14121nq> f37877b = C14122a.f37878b;

    /* renamed from: com.yandex.mobile.ads.impl.nq$a */
    static final class C14122a extends Lambda implements Function2<ly0, JSONObject, C14121nq> {

        /* renamed from: b */
        public static final C14122a f37878b = new C14122a();

        C14122a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C14123b bVar = C14121nq.f37876a;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            String str = (String) ai0.m33744a(jSONObject, "type", (rh1) null, ly0.mo66818b(), ly0, 2);
            if (Intrinsics.areEqual((Object) str, (Object) "infinity")) {
                C12654bu.C12656b bVar2 = C12654bu.f31579a;
                Intrinsics.checkNotNullParameter(ly0, "env");
                Intrinsics.checkNotNullParameter(jSONObject, "json");
                ly0.mo66818b();
                return new C14125d(new C12654bu());
            } else if (Intrinsics.areEqual((Object) str, (Object) "fixed")) {
                return new C14124c(C15102wr.f42202a.mo70741a(ly0, jSONObject));
            } else {
                ci0<?> a = ly0.mo68529a().mo66059a(str);
                C14206oq oqVar = a instanceof C14206oq ? (C14206oq) a : null;
                if (oqVar != null) {
                    return oqVar.mo65774a(ly0, jSONObject);
                }
                throw py0.m41004a(jSONObject, "type", str);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nq$b */
    public static final class C14123b {
        private C14123b() {
        }

        public /* synthetic */ C14123b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nq$c */
    public static class C14124c extends C14121nq {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14124c(C15102wr wrVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(wrVar, "value");
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nq$d */
    public static class C14125d extends C14121nq {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14125d(C12654bu buVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(buVar, "value");
        }
    }

    private C14121nq() {
    }

    public /* synthetic */ C14121nq(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
