package com.yandex.mobile.ads.impl;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.mobile.ads.impl.C13086fp;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.dp */
public class C12909dp implements qh0 {

    /* renamed from: b */
    public static final C12911b f32733b = new C12911b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final gj0<C13086fp> f32734c = $$Lambda$dp$R9TWwoWRfOS_eYTVrWYTsFWcQz8.INSTANCE;

    /* renamed from: a */
    public final List<C13086fp> f32735a;

    /* renamed from: com.yandex.mobile.ads.impl.dp$a */
    static final class C12910a extends Lambda implements Function2<ly0, JSONObject, C12909dp> {

        /* renamed from: b */
        public static final C12910a f32736b = new C12910a();

        C12910a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return C12909dp.f32733b.mo66654a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dp$b */
    public static final class C12911b {
        private C12911b() {
        }

        public /* synthetic */ C12911b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C12909dp mo66654a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            C13086fp.C13089c cVar = C13086fp.f33474a;
            List a = zh0.m44614a(jSONObject, FirebaseAnalytics.Param.ITEMS, C13086fp.f33475b, C12909dp.f32734c, b, ly0);
            Intrinsics.checkNotNullExpressionValue(a, "readList(json, \"items\", …S_VALIDATOR, logger, env)");
            return new C12909dp(a);
        }
    }

    static {
        C12910a aVar = C12910a.f32736b;
    }

    public C12909dp(List<? extends C13086fp> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.f32735a = list;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m35413a(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }
}
