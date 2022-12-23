package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C12992er;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.nw */
public class C14138nw implements qh0 {

    /* renamed from: c */
    public static final C14140b f37925c = new C14140b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Function2<ly0, JSONObject, C14138nw> f37926d = C14139a.f37929b;

    /* renamed from: a */
    public final C12992er f37927a;

    /* renamed from: b */
    public final C12992er f37928b;

    /* renamed from: com.yandex.mobile.ads.impl.nw$a */
    static final class C14139a extends Lambda implements Function2<ly0, JSONObject, C14138nw> {

        /* renamed from: b */
        public static final C14139a f37929b = new C14139a();

        C14139a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C14140b bVar = C14138nw.f37925c;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            C12992er.C12995c cVar = C12992er.f33046c;
            Object a = zh0.m44612a(jSONObject, "x", C12992er.f33049f, b, ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, \"x\", DivDimension.CREATOR, logger, env)");
            Object a2 = zh0.m44612a(jSONObject, "y", C12992er.f33049f, b, ly0);
            Intrinsics.checkNotNullExpressionValue(a2, "read(json, \"y\", DivDimension.CREATOR, logger, env)");
            return new C14138nw((C12992er) a, (C12992er) a2);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.nw$b */
    public static final class C14140b {
        private C14140b() {
        }

        public /* synthetic */ C14140b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14138nw(C12992er erVar, C12992er erVar2) {
        Intrinsics.checkNotNullParameter(erVar, "x");
        Intrinsics.checkNotNullParameter(erVar2, "y");
        this.f37927a = erVar;
        this.f37928b = erVar2;
    }
}
