package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.ir */
public abstract class C13436ir implements qh0 {

    /* renamed from: a */
    public static final C13438b f35004a = new C13438b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Function2<ly0, JSONObject, C13436ir> f35005b = C13437a.f35006b;

    /* renamed from: com.yandex.mobile.ads.impl.ir$a */
    static final class C13437a extends Lambda implements Function2<ly0, JSONObject, C13436ir> {

        /* renamed from: b */
        public static final C13437a f35006b = new C13437a();

        C13437a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C13438b bVar = C13436ir.f35004a;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            String str = (String) ai0.m33744a(jSONObject, "type", (rh1) null, ly0.mo66818b(), ly0, 2);
            if (Intrinsics.areEqual((Object) str, (Object) "shape_drawable")) {
                return new C13439c(C13013ex.f33173d.mo66881a(ly0, jSONObject));
            }
            ci0<?> a = ly0.mo68529a().mo66059a(str);
            C13535jr jrVar = a instanceof C13535jr ? (C13535jr) a : null;
            if (jrVar != null) {
                return jrVar.mo65774a(ly0, jSONObject);
            }
            throw py0.m41004a(jSONObject, "type", str);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ir$b */
    public static final class C13438b {
        private C13438b() {
        }

        public /* synthetic */ C13438b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ir$c */
    public static class C13439c extends C13436ir {

        /* renamed from: c */
        private final C13013ex f35007c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13439c(C13013ex exVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(exVar, "value");
            this.f35007c = exVar;
        }

        /* renamed from: b */
        public C13013ex mo67884b() {
            return this.f35007c;
        }
    }

    private C13436ir() {
    }

    public /* synthetic */ C13436ir(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
