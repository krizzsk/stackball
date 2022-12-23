package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ed1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.xv */
public final class C15215xv extends ed1<C13806kz> {

    /* renamed from: c */
    private final ek0<C13806kz> f42700c;

    /* renamed from: d */
    private final ed1.C12969a<C13806kz> f42701d;

    /* renamed from: com.yandex.mobile.ads.impl.xv$a */
    public static final class C15216a implements ed1.C12969a<C13806kz> {
        C15216a() {
        }

        /* renamed from: a */
        public Object mo66820a(ly0 ly0, boolean z, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            return C13806kz.f36464a.mo68284a(ly0, z, jSONObject);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15215xv(ny0 ny0, ek0 ek0, int i) {
        this(ny0, (i & 2) != 0 ? new ek0(new be0(), gd1.f33955a.mo67252a()) : null);
    }

    /* renamed from: a */
    public gd1 mo68529a() {
        return this.f42700c;
    }

    /* renamed from: c */
    public ed1.C12969a<C13806kz> mo66819c() {
        return this.f42701d;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15215xv(ny0 ny0, ek0<C13806kz> ek0) {
        super(ny0, ek0);
        Intrinsics.checkNotNullParameter(ny0, "logger");
        Intrinsics.checkNotNullParameter(ek0, "mainTemplateProvider");
        this.f42700c = ek0;
        this.f42701d = new C15216a();
    }
}
