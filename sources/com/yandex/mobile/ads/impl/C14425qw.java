package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C15266yr;
import com.yandex.mobile.ads.impl.f50;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.qw */
public class C14425qw implements qh0 {

    /* renamed from: d */
    public static final C14427b f39305d = new C14427b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C15266yr f39306e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C15266yr f39307f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C15266yr f39308g;

    /* renamed from: a */
    public final C15266yr f39309a;

    /* renamed from: b */
    public final C15266yr f39310b;

    /* renamed from: c */
    public final C15266yr f39311c;

    /* renamed from: com.yandex.mobile.ads.impl.qw$a */
    static final class C14426a extends Lambda implements Function2<ly0, JSONObject, C14425qw> {

        /* renamed from: b */
        public static final C14426a f39312b = new C14426a();

        C14426a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return C14425qw.f39305d.mo69655a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.qw$b */
    public static final class C14427b {
        private C14427b() {
        }

        public /* synthetic */ C14427b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C14425qw mo69655a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            C15266yr.C15269c cVar = C15266yr.f42914c;
            C15266yr yrVar = (C15266yr) zh0.m44622b(jSONObject, "corner_radius", C15266yr.f42918g, b, ly0);
            if (yrVar == null) {
                yrVar = C14425qw.f39306e;
            }
            Intrinsics.checkNotNullExpressionValue(yrVar, "JsonParser.readOptional(…RNER_RADIUS_DEFAULT_VALUE");
            C15266yr yrVar2 = (C15266yr) zh0.m44622b(jSONObject, "item_height", C15266yr.f42918g, b, ly0);
            if (yrVar2 == null) {
                yrVar2 = C14425qw.f39307f;
            }
            Intrinsics.checkNotNullExpressionValue(yrVar2, "JsonParser.readOptional(…ITEM_HEIGHT_DEFAULT_VALUE");
            C15266yr yrVar3 = (C15266yr) zh0.m44622b(jSONObject, "item_width", C15266yr.f42918g, b, ly0);
            if (yrVar3 == null) {
                yrVar3 = C14425qw.f39308g;
            }
            Intrinsics.checkNotNullExpressionValue(yrVar3, "JsonParser.readOptional(… ITEM_WIDTH_DEFAULT_VALUE");
            return new C14425qw(yrVar, yrVar2, yrVar3);
        }
    }

    static {
        f50.C13029a aVar = f50.f33229a;
        f39306e = new C15266yr((f50) null, aVar.mo66929a(5), 1);
        f39307f = new C15266yr((f50) null, aVar.mo66929a(10), 1);
        f39308g = new C15266yr((f50) null, aVar.mo66929a(10), 1);
        C14426a aVar2 = C14426a.f39312b;
    }

    public C14425qw(C15266yr yrVar, C15266yr yrVar2, C15266yr yrVar3) {
        Intrinsics.checkNotNullParameter(yrVar, "cornerRadius");
        Intrinsics.checkNotNullParameter(yrVar2, "itemHeight");
        Intrinsics.checkNotNullParameter(yrVar3, "itemWidth");
        this.f39309a = yrVar;
        this.f39310b = yrVar2;
        this.f39311c = yrVar3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14425qw(C15266yr yrVar, C15266yr yrVar2, C15266yr yrVar3, int i) {
        this((i & 1) != 0 ? f39306e : null, (i & 2) != 0 ? f39307f : null, (i & 4) != 0 ? f39308g : null);
    }
}
