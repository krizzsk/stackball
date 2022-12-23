package com.yandex.mobile.ads.impl;

import com.facebook.internal.NativeProtocol;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.mr */
public class C14008mr implements qh0 {

    /* renamed from: c */
    public static final C14010b f37491c = new C14010b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final rh1<String> f37492d = $$Lambda$mr$ku2NHPRfamjcvlxqF3m4HlsgfGQ.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Function2<ly0, JSONObject, C14008mr> f37493e = C14009a.f37496b;

    /* renamed from: a */
    public final String f37494a;

    /* renamed from: b */
    public final JSONObject f37495b;

    /* renamed from: com.yandex.mobile.ads.impl.mr$a */
    static final class C14009a extends Lambda implements Function2<ly0, JSONObject, C14008mr> {

        /* renamed from: b */
        public static final C14009a f37496b = new C14009a();

        C14009a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C14010b bVar = C14008mr.f37491c;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            Object a = zh0.m44608a(jSONObject, "id", C14008mr.f37492d, b, ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, \"id\", ID_VALIDATOR, logger, env)");
            return new C14008mr((String) a, (JSONObject) zh0.m44624b(jSONObject, NativeProtocol.WEB_DIALOG_PARAMS, b, ly0));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mr$b */
    public static final class C14010b {
        private C14010b() {
        }

        public /* synthetic */ C14010b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        $$Lambda$mr$H6BfRTrUeTmEEkYVrA9Tn9OkwU r0 = $$Lambda$mr$H6BfRTrUeTmEEkYVrA9Tn9OkwU.INSTANCE;
    }

    public C14008mr(String str, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(str, "id");
        this.f37494a = str;
        this.f37495b = jSONObject;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m39715a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m39717b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }
}
