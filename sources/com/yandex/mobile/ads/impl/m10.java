package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.mobile.ads.impl.f20;
import com.yandex.mobile.ads.impl.f50;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public class m10 implements qh0 {

    /* renamed from: i */
    public static final C13949b f37143i = new C13949b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final f50<Integer> f37144j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final f50<Integer> f37145k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final f50<Integer> f37146l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final rh1<String> f37147m = $$Lambda$m10$R7LgewjcPWNX0x2PXPpjc2ft0k.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final rh1<Integer> f37148n = $$Lambda$m10$IuTi3sUWYMs03eEhJs0aDKQi7Iw.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final rh1<Integer> f37149o = $$Lambda$m10$5EdqYDsWyiNJ1lI2oePgD2oGc.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final rh1<Integer> f37150p = $$Lambda$m10$RPLETk1uaAiuSYugJWAYj0VnU.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final Function2<ly0, JSONObject, m10> f37151q = C13948a.f37160b;

    /* renamed from: a */
    public final f20 f37152a;

    /* renamed from: b */
    public final String f37153b;

    /* renamed from: c */
    public final f50<Integer> f37154c;

    /* renamed from: d */
    public final JSONObject f37155d;

    /* renamed from: e */
    public final f50<Uri> f37156e;

    /* renamed from: f */
    public final f50<Uri> f37157f;

    /* renamed from: g */
    public final f50<Integer> f37158g;

    /* renamed from: h */
    public final f50<Integer> f37159h;

    /* renamed from: com.yandex.mobile.ads.impl.m10$a */
    static final class C13948a extends Lambda implements Function2<ly0, JSONObject, m10> {

        /* renamed from: b */
        public static final C13948a f37160b = new C13948a();

        C13948a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C13949b bVar = m10.f37143i;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            ny0 b = ly0.mo66818b();
            f20.C13024b bVar2 = f20.f33208a;
            f20 f20 = (f20) zh0.m44622b(jSONObject, "download_callbacks", f20.f33211d, b, ly0);
            Object a = zh0.m44608a(jSONObject, "log_id", m10.f37147m, b, ly0);
            Intrinsics.checkNotNullExpressionValue(a, "read(json, \"log_id\", LOG…D_VALIDATOR, logger, env)");
            String str = (String) a;
            Function1<Number, Integer> d = ky0.m38514d();
            rh1 d2 = m10.f37148n;
            f50 c = m10.f37144j;
            cg1<Integer> cg1 = dg1.f32574b;
            f50 a2 = zh0.m44601a(jSONObject, "log_limit", (Function1) d, d2, b, c, (cg1) cg1);
            if (a2 == null) {
                a2 = m10.f37144j;
            }
            f50 f50 = a2;
            JSONObject jSONObject2 = (JSONObject) zh0.m44624b(jSONObject, "payload", b, ly0);
            Function1<String, Uri> f = ky0.m38516f();
            JSONObject jSONObject3 = jSONObject;
            ny0 ny0 = b;
            ly0 ly02 = ly0;
            cg1<Uri> cg12 = dg1.f32577e;
            f50<Uri> b2 = zh0.m44621b(jSONObject3, "referer", f, ny0, ly02, cg12);
            f50<T> b3 = zh0.m44621b(jSONObject3, "url", ky0.m38516f(), ny0, ly02, cg12);
            f50 a3 = zh0.m44601a(jSONObject, "visibility_duration", (Function1) ky0.m38514d(), m10.f37149o, b, m10.f37145k, (cg1) cg1);
            if (a3 == null) {
                a3 = m10.f37145k;
            }
            f50 f502 = a3;
            f50 a4 = zh0.m44601a(jSONObject, "visibility_percentage", (Function1) ky0.m38514d(), m10.f37150p, b, m10.f37146l, (cg1) cg1);
            if (a4 == null) {
                a4 = m10.f37146l;
            }
            return new m10(f20, str, f50, jSONObject2, b2, b3, f502, a4);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.m10$b */
    public static final class C13949b {
        private C13949b() {
        }

        public /* synthetic */ C13949b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        f50.C13029a aVar = f50.f33229a;
        f37144j = aVar.mo66929a(1);
        f37145k = aVar.mo66929a(800);
        f37146l = aVar.mo66929a(50);
        $$Lambda$m10$xfs2H961oM7dHHq2Hp9L6icfXo r0 = $$Lambda$m10$xfs2H961oM7dHHq2Hp9L6icfXo.INSTANCE;
        $$Lambda$m10$1VimbF00r5v_bYkcbRmVVORHrA r02 = $$Lambda$m10$1VimbF00r5v_bYkcbRmVVORHrA.INSTANCE;
        $$Lambda$m10$4yXwkKO8fTE8dAsXXTdM6pX59g8 r03 = $$Lambda$m10$4yXwkKO8fTE8dAsXXTdM6pX59g8.INSTANCE;
        $$Lambda$m10$DuupjAR1_YiGHj3dCJuSpIKP6c r04 = $$Lambda$m10$DuupjAR1_YiGHj3dCJuSpIKP6c.INSTANCE;
    }

    public m10(f20 f20, String str, f50<Integer> f50, JSONObject jSONObject, f50<Uri> f502, f50<Uri> f503, f50<Integer> f504, f50<Integer> f505) {
        Intrinsics.checkNotNullParameter(str, "logId");
        Intrinsics.checkNotNullParameter(f50, "logLimit");
        Intrinsics.checkNotNullParameter(f504, "visibilityDuration");
        Intrinsics.checkNotNullParameter(f505, "visibilityPercentage");
        this.f37152a = f20;
        this.f37153b = str;
        this.f37154c = f50;
        this.f37155d = jSONObject;
        this.f37156e = f502;
        this.f37157f = f503;
        this.f37158g = f504;
        this.f37159h = f505;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m39217a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m39220b(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m39223c(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m39225d(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final boolean m39227e(int i) {
        return i > 0 && i <= 100;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final boolean m39229f(int i) {
        return i > 0 && i <= 100;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m39218a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m39221b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }
}
