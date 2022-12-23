package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C12927dx;
import com.yandex.mobile.ads.impl.C15405zy;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.ex */
public class C13013ex implements qh0 {

    /* renamed from: d */
    public static final C13015b f33173d = new C13015b((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final f50<Integer> f33174a;

    /* renamed from: b */
    public final C12927dx f33175b;

    /* renamed from: c */
    public final C15405zy f33176c;

    /* renamed from: com.yandex.mobile.ads.impl.ex$a */
    static final class C13014a extends Lambda implements Function2<ly0, JSONObject, C13013ex> {

        /* renamed from: b */
        public static final C13014a f33177b = new C13014a();

        C13014a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return C13013ex.f33173d.mo66881a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ex$b */
    public static final class C13015b {
        private C13015b() {
        }

        public /* synthetic */ C13015b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C13013ex mo66881a(ly0 ly0, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            f50<Integer> a = zh0.m44598a(jSONObject, "color", ky0.m38515e(), b, ly0, dg1.f32578f);
            Intrinsics.checkNotNullExpressionValue(a, "readExpression(json, \"co…, env, TYPE_HELPER_COLOR)");
            C12927dx.C12929b bVar = C12927dx.f32794a;
            Object a2 = zh0.m44612a(jSONObject, "shape", C12927dx.f32795b, b, ly0);
            Intrinsics.checkNotNullExpressionValue(a2, "read(json, \"shape\", DivShape.CREATOR, logger, env)");
            C15405zy.C15408c cVar = C15405zy.f43497d;
            return new C13013ex(a, (C12927dx) a2, (C15405zy) zh0.m44622b(jSONObject, "stroke", C15405zy.f43502i, b, ly0));
        }
    }

    static {
        C13014a aVar = C13014a.f33177b;
    }

    public C13013ex(f50<Integer> f50, C12927dx dxVar, C15405zy zyVar) {
        Intrinsics.checkNotNullParameter(f50, "color");
        Intrinsics.checkNotNullParameter(dxVar, "shape");
        this.f33174a = f50;
        this.f33175b = dxVar;
        this.f33176c = zyVar;
    }
}
