package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C12927dx;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.gx */
public abstract class C13254gx implements qh0, ci0<C12927dx> {

    /* renamed from: a */
    public static final C13256b f34162a = new C13256b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Function2<ly0, JSONObject, C13254gx> f34163b = C13255a.f34164b;

    /* renamed from: com.yandex.mobile.ads.impl.gx$a */
    static final class C13255a extends Lambda implements Function2<ly0, JSONObject, C13254gx> {

        /* renamed from: b */
        public static final C13255a f34164b = new C13255a();

        C13255a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C13256b bVar = C13254gx.f34162a;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            String str = (String) ai0.m33744a(jSONObject, "type", (rh1) null, ly0.mo66818b(), ly0, 2);
            ci0<?> a = ly0.mo68529a().mo66059a(str);
            C14538rw rwVar = null;
            C13254gx gxVar = a instanceof C13254gx ? (C13254gx) a : null;
            if (gxVar != null) {
                if (gxVar instanceof C13257c) {
                    str = "rounded_rectangle";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (Intrinsics.areEqual((Object) str, (Object) "rounded_rectangle")) {
                if (gxVar != null) {
                    if (gxVar instanceof C13257c) {
                        rwVar = ((C13257c) gxVar).mo67360b();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return new C13257c(new C14538rw(ly0, rwVar, false, jSONObject));
            }
            throw py0.m41004a(jSONObject, "type", str);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gx$b */
    public static final class C13256b {
        private C13256b() {
        }

        public /* synthetic */ C13256b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C13254gx> mo67359a() {
            return C13254gx.f34163b;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gx$c */
    public static class C13257c extends C13254gx {

        /* renamed from: c */
        private final C14538rw f34165c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13257c(C14538rw rwVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(rwVar, "value");
            this.f34165c = rwVar;
        }

        /* renamed from: b */
        public C14538rw mo67360b() {
            return this.f34165c;
        }
    }

    private C13254gx() {
    }

    public /* synthetic */ C13254gx(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public C12927dx mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        if (this instanceof C13257c) {
            return new C12927dx.C12930c(((C13257c) this).mo67360b().mo65774a(ly0, jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
