package com.yandex.mobile.ads.impl;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.mobile.ads.impl.C14111nn;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.ln */
public class C13866ln implements qh0 {

    /* renamed from: b */
    public static final C13868b f36757b = new C13868b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final gj0<C14111nn> f36758c = $$Lambda$ln$I3Su7kXFgnAQsudfDtXeMPIenrI.INSTANCE;

    /* renamed from: a */
    public final List<C14111nn> f36759a;

    /* renamed from: com.yandex.mobile.ads.impl.ln$a */
    static final class C13867a extends Lambda implements Function2<ly0, JSONObject, C13866ln> {

        /* renamed from: b */
        public static final C13867a f36760b = new C13867a();

        C13867a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return C13866ln.f36757b.mo68492a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ln$b */
    public static final class C13868b {
        private C13868b() {
        }

        public /* synthetic */ C13868b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C13866ln mo68492a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            C14111nn.C14114c cVar = C14111nn.f37864a;
            List a = zh0.m44614a(jSONObject, FirebaseAnalytics.Param.ITEMS, C14111nn.f37865b, C13866ln.f36758c, b, ly0);
            Intrinsics.checkNotNullExpressionValue(a, "readList(json, \"items\", …S_VALIDATOR, logger, env)");
            return new C13866ln(a);
        }
    }

    static {
        C13867a aVar = C13867a.f36760b;
    }

    public C13866ln(List<? extends C14111nn> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.f36759a = list;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m38839a(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }
}
