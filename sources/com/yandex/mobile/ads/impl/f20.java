package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C14687tm;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public class f20 implements qh0 {

    /* renamed from: a */
    public static final C13024b f33208a = new C13024b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final gj0<C14687tm> f33209b = $$Lambda$f20$4WPzYBn8k62meDZFY4gLPrPm0P4.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final gj0<C14687tm> f33210c = $$Lambda$f20$mGYgTPnqQv93_c0p56AAQIWs0o.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Function2<ly0, JSONObject, f20> f33211d = C13023a.f33212b;

    /* renamed from: com.yandex.mobile.ads.impl.f20$a */
    static final class C13023a extends Lambda implements Function2<ly0, JSONObject, f20> {

        /* renamed from: b */
        public static final C13023a f33212b = new C13023a();

        C13023a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C13024b bVar = f20.f33208a;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            C14687tm.C14690c cVar = C14687tm.f40352i;
            JSONObject jSONObject2 = jSONObject;
            ny0 ny0 = b;
            ly0 ly02 = ly0;
            return new f20(zh0.m44626b(jSONObject2, "on_fail_actions", C14687tm.f40356m, f20.f33209b, ny0, ly02), zh0.m44626b(jSONObject2, "on_success_actions", C14687tm.f40356m, f20.f33210c, ny0, ly02));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.f20$b */
    public static final class C13024b {
        private C13024b() {
        }

        public /* synthetic */ C13024b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public f20() {
        this((List) null, (List) null, 3);
    }

    public f20(List<? extends C14687tm> list, List<? extends C14687tm> list2) {
    }

    public /* synthetic */ f20(List list, List list2, int i) {
        this((List<? extends C14687tm>) null, (List<? extends C14687tm>) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m35878a(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m35880b(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }
}
