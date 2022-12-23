package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.fp */
public abstract class C13086fp implements qh0 {

    /* renamed from: a */
    public static final C13089c f33474a = new C13089c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Function2<ly0, JSONObject, C13086fp> f33475b = C13088b.f33477b;

    /* renamed from: com.yandex.mobile.ads.impl.fp$a */
    public static class C13087a extends C13086fp {

        /* renamed from: c */
        private final C12600bp f33476c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13087a(C12600bp bpVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(bpVar, "value");
            this.f33476c = bpVar;
        }

        /* renamed from: b */
        public C12600bp mo67061b() {
            return this.f33476c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fp$b */
    static final class C13088b extends Lambda implements Function2<ly0, JSONObject, C13086fp> {

        /* renamed from: b */
        public static final C13088b f33477b = new C13088b();

        C13088b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C13089c cVar = C13086fp.f33474a;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            String str = (String) ai0.m33744a(jSONObject, "type", (rh1) null, ly0.mo66818b(), ly0, 2);
            if (Intrinsics.areEqual((Object) str, (Object) "set")) {
                return new C13090d(C12909dp.f32733b.mo66654a(ly0, jSONObject));
            }
            if (Intrinsics.areEqual((Object) str, (Object) "change_bounds")) {
                return new C13087a(C12600bp.f31382e.mo66106a(ly0, jSONObject));
            }
            ci0<?> a = ly0.mo68529a().mo66059a(str);
            C13219gp gpVar = a instanceof C13219gp ? (C13219gp) a : null;
            if (gpVar != null) {
                return gpVar.mo65774a(ly0, jSONObject);
            }
            throw py0.m41004a(jSONObject, "type", str);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fp$c */
    public static final class C13089c {
        private C13089c() {
        }

        public /* synthetic */ C13089c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fp$d */
    public static class C13090d extends C13086fp {

        /* renamed from: c */
        private final C12909dp f33478c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13090d(C12909dp dpVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(dpVar, "value");
            this.f33478c = dpVar;
        }

        /* renamed from: b */
        public C12909dp mo67062b() {
            return this.f33478c;
        }
    }

    private C13086fp() {
    }

    public /* synthetic */ C13086fp(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
