package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C13436ir;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.jr */
public abstract class C13535jr implements qh0, ci0<C13436ir> {

    /* renamed from: a */
    public static final C13537b f35452a = new C13537b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Function2<ly0, JSONObject, C13535jr> f35453b = C13536a.f35454b;

    /* renamed from: com.yandex.mobile.ads.impl.jr$a */
    static final class C13536a extends Lambda implements Function2<ly0, JSONObject, C13535jr> {

        /* renamed from: b */
        public static final C13536a f35454b = new C13536a();

        C13536a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C13537b bVar = C13535jr.f35452a;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            String str = (String) ai0.m33744a(jSONObject, "type", (rh1) null, ly0.mo66818b(), ly0, 2);
            ci0<?> a = ly0.mo68529a().mo66059a(str);
            C13142fx fxVar = null;
            C13535jr jrVar = a instanceof C13535jr ? (C13535jr) a : null;
            if (jrVar != null) {
                if (jrVar instanceof C13538c) {
                    str = "shape_drawable";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (Intrinsics.areEqual((Object) str, (Object) "shape_drawable")) {
                if (jrVar != null) {
                    if (jrVar instanceof C13538c) {
                        fxVar = ((C13538c) jrVar).mo68086b();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return new C13538c(new C13142fx(ly0, fxVar, false, jSONObject));
            }
            throw py0.m41004a(jSONObject, "type", str);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jr$b */
    public static final class C13537b {
        private C13537b() {
        }

        public /* synthetic */ C13537b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C13535jr> mo68085a() {
            return C13535jr.f35453b;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jr$c */
    public static class C13538c extends C13535jr {

        /* renamed from: c */
        private final C13142fx f35455c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13538c(C13142fx fxVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(fxVar, "value");
            this.f35455c = fxVar;
        }

        /* renamed from: b */
        public C13142fx mo68086b() {
            return this.f35455c;
        }
    }

    private C13535jr() {
    }

    public /* synthetic */ C13535jr(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public C13436ir mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        if (this instanceof C13538c) {
            return new C13436ir.C13439c(((C13538c) this).mo68086b().mo65774a(ly0, jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
