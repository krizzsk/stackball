package com.yandex.mobile.ads.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.vg */
public final class C14889vg {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f41283a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f41284b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f41285c;

    /* renamed from: d */
    private final Lazy f41286d = LazyKt.lazy(new C14890a(this));

    /* renamed from: com.yandex.mobile.ads.impl.vg$a */
    static final class C14890a extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ C14889vg f41287b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14890a(C14889vg vgVar) {
            super(0);
            this.f41287b = vgVar;
        }

        public Object invoke() {
            return this.f41287b.f41283a + '#' + this.f41287b.f41284b + '#' + this.f41287b.f41285c;
        }
    }

    public C14889vg(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "scopeLogId");
        Intrinsics.checkNotNullParameter(str2, "dataTag");
        Intrinsics.checkNotNullParameter(str3, "actionLogId");
        this.f41283a = str;
        this.f41284b = str2;
        this.f41285c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) C14889vg.class, (Object) obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj != null) {
            C14889vg vgVar = (C14889vg) obj;
            return Intrinsics.areEqual((Object) this.f41283a, (Object) vgVar.f41283a) && Intrinsics.areEqual((Object) this.f41285c, (Object) vgVar.f41285c) && Intrinsics.areEqual((Object) this.f41284b, (Object) vgVar.f41284b);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.core.view2.CompositeLogId");
    }

    public int hashCode() {
        return (((this.f41283a.hashCode() * 31) + this.f41285c.hashCode()) * 31) + this.f41284b.hashCode();
    }

    public String toString() {
        return (String) this.f41286d.getValue();
    }
}
