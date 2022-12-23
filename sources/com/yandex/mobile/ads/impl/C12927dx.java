package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.dx */
public abstract class C12927dx implements qh0 {

    /* renamed from: a */
    public static final C12929b f32794a = new C12929b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Function2<ly0, JSONObject, C12927dx> f32795b = C12928a.f32796b;

    /* renamed from: com.yandex.mobile.ads.impl.dx$a */
    static final class C12928a extends Lambda implements Function2<ly0, JSONObject, C12927dx> {

        /* renamed from: b */
        public static final C12928a f32796b = new C12928a();

        C12928a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C12929b bVar = C12927dx.f32794a;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            String str = (String) ai0.m33744a(jSONObject, "type", (rh1) null, ly0.mo66818b(), ly0, 2);
            if (Intrinsics.areEqual((Object) str, (Object) "rounded_rectangle")) {
                return new C12930c(C14425qw.f39305d.mo69655a(ly0, jSONObject));
            }
            ci0<?> a = ly0.mo68529a().mo66059a(str);
            C13254gx gxVar = a instanceof C13254gx ? (C13254gx) a : null;
            if (gxVar != null) {
                return gxVar.mo65774a(ly0, jSONObject);
            }
            throw py0.m41004a(jSONObject, "type", str);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dx$b */
    public static final class C12929b {
        private C12929b() {
        }

        public /* synthetic */ C12929b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dx$c */
    public static class C12930c extends C12927dx {

        /* renamed from: c */
        private final C14425qw f32797c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12930c(C14425qw qwVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(qwVar, "value");
            this.f32797c = qwVar;
        }

        /* renamed from: b */
        public C14425qw mo66711b() {
            return this.f32797c;
        }
    }

    private C12927dx() {
    }

    public /* synthetic */ C12927dx(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
