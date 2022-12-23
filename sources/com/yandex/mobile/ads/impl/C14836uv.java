package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C14713tv;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.uv */
public abstract class C14836uv implements qh0, ci0<C14713tv> {

    /* renamed from: a */
    public static final C14838b f41065a = new C14838b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Function2<ly0, JSONObject, C14836uv> f41066b = C14837a.f41067b;

    /* renamed from: com.yandex.mobile.ads.impl.uv$a */
    static final class C14837a extends Lambda implements Function2<ly0, JSONObject, C14836uv> {

        /* renamed from: b */
        public static final C14837a f41067b = new C14837a();

        C14837a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            Object obj3;
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C14838b bVar = C14836uv.f41065a;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            String str = (String) ai0.m33744a(jSONObject, "type", (rh1) null, ly0.mo66818b(), ly0, 2);
            ci0<?> a = ly0.mo68529a().mo66059a(str);
            Object obj4 = null;
            C14836uv uvVar = a instanceof C14836uv ? (C14836uv) a : null;
            if (uvVar != null) {
                if (uvVar instanceof C14840d) {
                    str = "percentage";
                } else if (uvVar instanceof C14839c) {
                    str = "fixed";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (Intrinsics.areEqual((Object) str, (Object) "percentage")) {
                if (uvVar != null) {
                    obj4 = uvVar.mo70412b();
                }
                obj3 = new C14840d(new C14132nv(ly0, (C14132nv) obj4, false, jSONObject));
            } else if (Intrinsics.areEqual((Object) str, (Object) "fixed")) {
                if (uvVar != null) {
                    obj4 = uvVar.mo70412b();
                }
                obj3 = new C14839c(new C13899lv(ly0, (C13899lv) obj4, false, jSONObject));
            } else {
                throw py0.m41004a(jSONObject, "type", str);
            }
            return obj3;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.uv$b */
    public static final class C14838b {
        private C14838b() {
        }

        public /* synthetic */ C14838b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C14836uv> mo70413a() {
            return C14836uv.f41066b;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.uv$c */
    public static class C14839c extends C14836uv {

        /* renamed from: c */
        private final C13899lv f41068c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14839c(C13899lv lvVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(lvVar, "value");
            this.f41068c = lvVar;
        }

        /* renamed from: c */
        public C13899lv mo70414c() {
            return this.f41068c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.uv$d */
    public static class C14840d extends C14836uv {

        /* renamed from: c */
        private final C14132nv f41069c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14840d(C14132nv nvVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(nvVar, "value");
            this.f41069c = nvVar;
        }

        /* renamed from: c */
        public C14132nv mo70415c() {
            return this.f41069c;
        }
    }

    private C14836uv() {
    }

    public /* synthetic */ C14836uv(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public Object mo70412b() {
        if (this instanceof C14840d) {
            return ((C14840d) this).mo70415c();
        }
        if (this instanceof C14839c) {
            return ((C14839c) this).mo70414c();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public C14713tv mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        if (this instanceof C14840d) {
            return new C14713tv.C14717d(((C14840d) this).mo70415c().mo65774a(ly0, jSONObject));
        }
        if (this instanceof C14839c) {
            return new C14713tv.C14716c(((C14839c) this).mo70414c().mo65774a(ly0, jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
