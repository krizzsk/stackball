package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.tv */
public abstract class C14713tv implements qh0 {

    /* renamed from: a */
    public static final C14715b f40473a = new C14715b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Function2<ly0, JSONObject, C14713tv> f40474b = C14714a.f40475b;

    /* renamed from: com.yandex.mobile.ads.impl.tv$a */
    static final class C14714a extends Lambda implements Function2<ly0, JSONObject, C14713tv> {

        /* renamed from: b */
        public static final C14714a f40475b = new C14714a();

        C14714a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C14715b bVar = C14713tv.f40473a;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            String str = (String) ai0.m33744a(jSONObject, "type", (rh1) null, ly0.mo66818b(), ly0, 2);
            if (Intrinsics.areEqual((Object) str, (Object) "percentage")) {
                return new C14717d(C14018mv.f37524b.mo68858a(ly0, jSONObject));
            }
            if (Intrinsics.areEqual((Object) str, (Object) "fixed")) {
                return new C14716c(C13784kv.f36425b.mo68277a(ly0, jSONObject));
            }
            ci0<?> a = ly0.mo68529a().mo66059a(str);
            C14836uv uvVar = a instanceof C14836uv ? (C14836uv) a : null;
            if (uvVar != null) {
                return uvVar.mo65774a(ly0, jSONObject);
            }
            throw py0.m41004a(jSONObject, "type", str);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tv$b */
    public static final class C14715b {
        private C14715b() {
        }

        public /* synthetic */ C14715b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tv$c */
    public static class C14716c extends C14713tv {

        /* renamed from: c */
        private final C13784kv f40476c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14716c(C13784kv kvVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(kvVar, "value");
            this.f40476c = kvVar;
        }

        /* renamed from: b */
        public C13784kv mo70237b() {
            return this.f40476c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tv$d */
    public static class C14717d extends C14713tv {

        /* renamed from: c */
        private final C14018mv f40477c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14717d(C14018mv mvVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(mvVar, "value");
            this.f40477c = mvVar;
        }

        /* renamed from: b */
        public C14018mv mo70238b() {
            return this.f40477c;
        }
    }

    private C14713tv() {
    }

    public /* synthetic */ C14713tv(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
