package com.yandex.mobile.ads.impl;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.yandex.mobile.ads.impl.C14287pm;
import com.yandex.mobile.ads.impl.cg1;
import com.yandex.mobile.ads.impl.f50;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.sm */
public class C14608sm implements qh0, ci0<C14287pm> {

    /* renamed from: f */
    public static final C14617i f40032f = new C14617i((DefaultConstructorMarker) null);

    /* renamed from: g */
    private static final f50<C14287pm.C14292e> f40033g;

    /* renamed from: h */
    private static final f50<C14287pm.C14295f> f40034h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final cg1<C14287pm.C14292e> f40035i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final cg1<C14287pm.C14295f> f40036j;

    /* renamed from: k */
    private static final rh1<String> f40037k = $$Lambda$sm$PZYQY3PZkAkSZfhUpJBrhVPQSfc.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final rh1<String> f40038l = $$Lambda$sm$Q98d7LKgoSoyryolEpO58uIPE.INSTANCE;

    /* renamed from: m */
    private static final rh1<String> f40039m = $$Lambda$sm$oDWa73NjHvrwKCCoXoir091Glew.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final rh1<String> f40040n = $$Lambda$sm$cibnrNqHFNlGCawwDh2CvW2Uwew.INSTANCE;

    /* renamed from: o */
    private static final rh1<String> f40041o = $$Lambda$sm$dG0gS6ymSyyyw9GIAOjKx7vCqmE.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final rh1<String> f40042p = $$Lambda$sm$SVVNmuUTQEBdQ47RqmpAbVvR5qI.INSTANCE;

    /* renamed from: q */
    private static final Function3<String, JSONObject, ly0, f50<String>> f40043q = C14610b.f40055b;

    /* renamed from: r */
    private static final Function3<String, JSONObject, ly0, f50<String>> f40044r = C14611c.f40056b;

    /* renamed from: s */
    private static final Function3<String, JSONObject, ly0, f50<C14287pm.C14292e>> f40045s = C14612d.f40057b;

    /* renamed from: t */
    private static final Function3<String, JSONObject, ly0, f50<String>> f40046t = C14613e.f40058b;

    /* renamed from: u */
    private static final Function3<String, JSONObject, ly0, f50<C14287pm.C14295f>> f40047u = C14616h.f40061b;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static final Function2<ly0, JSONObject, C14608sm> f40048v = C14609a.f40054b;

    /* renamed from: a */
    public final v60<f50<String>> f40049a;

    /* renamed from: b */
    public final v60<f50<String>> f40050b;

    /* renamed from: c */
    public final v60<f50<C14287pm.C14292e>> f40051c;

    /* renamed from: d */
    public final v60<f50<String>> f40052d;

    /* renamed from: e */
    public final v60<f50<C14287pm.C14295f>> f40053e;

    /* renamed from: com.yandex.mobile.ads.impl.sm$a */
    static final class C14609a extends Lambda implements Function2<ly0, JSONObject, C14608sm> {

        /* renamed from: b */
        public static final C14609a f40054b = new C14609a();

        C14609a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return new C14608sm(ly0, (C14608sm) null, false, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sm$b */
    static final class C14610b extends Lambda implements Function3<String, JSONObject, ly0, f50<String>> {

        /* renamed from: b */
        public static final C14610b f40055b = new C14610b();

        C14610b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44620b(jSONObject, str, C14608sm.f40038l, ly0.mo66818b(), ly0, dg1.f32575c);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sm$c */
    static final class C14611c extends Lambda implements Function3<String, JSONObject, ly0, f50<String>> {

        /* renamed from: b */
        public static final C14611c f40056b = new C14611c();

        C14611c() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44620b(jSONObject, str, C14608sm.f40040n, ly0.mo66818b(), ly0, dg1.f32575c);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sm$d */
    static final class C14612d extends Lambda implements Function3<String, JSONObject, ly0, f50<C14287pm.C14292e>> {

        /* renamed from: b */
        public static final C14612d f40057b = new C14612d();

        C14612d() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C14287pm.C14292e.C14294b bVar = C14287pm.C14292e.f38723c;
            return zh0.m44621b(jSONObject, str, C14287pm.C14292e.f38724d, ly0.mo66818b(), ly0, C14608sm.f40035i);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sm$e */
    static final class C14613e extends Lambda implements Function3<String, JSONObject, ly0, f50<String>> {

        /* renamed from: b */
        public static final C14613e f40058b = new C14613e();

        C14613e() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            return zh0.m44620b(jSONObject, str, C14608sm.f40042p, ly0.mo66818b(), ly0, dg1.f32575c);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sm$f */
    static final class C14614f extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C14614f f40059b = new C14614f();

        C14614f() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C14287pm.C14292e);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sm$g */
    static final class C14615g extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C14615g f40060b = new C14615g();

        C14615g() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C14287pm.C14295f);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sm$h */
    static final class C14616h extends Lambda implements Function3<String, JSONObject, ly0, f50<C14287pm.C14295f>> {

        /* renamed from: b */
        public static final C14616h f40061b = new C14616h();

        C14616h() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            ly0 ly0 = (ly0) obj3;
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            Intrinsics.checkNotNullParameter(ly0, "env");
            C14287pm.C14295f.C14297b bVar = C14287pm.C14295f.f38731c;
            return zh0.m44621b(jSONObject, str, C14287pm.C14295f.f38732d, ly0.mo66818b(), ly0, C14608sm.f40036j);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sm$i */
    public static final class C14617i {
        private C14617i() {
        }

        public /* synthetic */ C14617i(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function2<ly0, JSONObject, C14608sm> mo70025a() {
            return C14608sm.f40048v;
        }
    }

    static {
        f50.C13029a aVar = f50.f33229a;
        f40033g = aVar.mo66929a(C14287pm.C14292e.f38725e);
        f40034h = aVar.mo66929a(C14287pm.C14295f.NONE);
        cg1.C12733a aVar2 = cg1.f31917a;
        f40035i = aVar2.mo66293a(ArraysKt.first((T[]) C14287pm.C14292e.values()), C14614f.f40059b);
        f40036j = aVar2.mo66293a(ArraysKt.first((T[]) C14287pm.C14295f.values()), C14615g.f40060b);
    }

    public C14608sm(ly0 ly0, C14608sm smVar, boolean z, JSONObject jSONObject) {
        v60<f50<String>> v60;
        v60<f50<String>> v602;
        v60<f50<C14287pm.C14292e>> v603;
        v60<f50<String>> v604;
        v60<f50<C14287pm.C14295f>> v605;
        C14608sm smVar2 = smVar;
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        ny0 b = ly0.mo66818b();
        if (smVar2 == null) {
            v60 = null;
        } else {
            v60 = smVar2.f40049a;
        }
        rh1<String> rh1 = f40037k;
        cg1<String> cg1 = dg1.f32575c;
        v60<f50<f50<String>>> b2 = di0.m35292b(jSONObject, "description", z, v60, rh1, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b2, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
        this.f40049a = b2;
        if (smVar2 == null) {
            v602 = null;
        } else {
            v602 = smVar2.f40050b;
        }
        v60<f50<f50<String>>> b3 = di0.m35292b(jSONObject, ViewHierarchyConstants.HINT_KEY, z, v602, f40039m, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b3, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
        this.f40050b = b3;
        if (smVar2 == null) {
            v603 = null;
        } else {
            v603 = smVar2.f40051c;
        }
        v60<f50<f50<C14287pm.C14292e>>> b4 = di0.m35293b(jSONObject, "mode", z, v603, C14287pm.C14292e.f38723c.mo69386a(), b, ly0, f40035i);
        Intrinsics.checkNotNullExpressionValue(b4, "readOptionalFieldWithExp…r, env, TYPE_HELPER_MODE)");
        this.f40051c = b4;
        if (smVar2 == null) {
            v604 = null;
        } else {
            v604 = smVar2.f40052d;
        }
        v60<f50<f50<String>>> b5 = di0.m35292b(jSONObject, "state_description", z, v604, f40041o, b, ly0, cg1);
        Intrinsics.checkNotNullExpressionValue(b5, "readOptionalFieldWithExp… env, TYPE_HELPER_STRING)");
        this.f40052d = b5;
        if (smVar2 == null) {
            v605 = null;
        } else {
            v605 = smVar2.f40053e;
        }
        v60<f50<f50<C14287pm.C14295f>>> b6 = di0.m35293b(jSONObject, "type", z, v605, C14287pm.C14295f.f38731c.mo69387a(), b, ly0, f40036j);
        Intrinsics.checkNotNullExpressionValue(b6, "readOptionalFieldWithExp…r, env, TYPE_HELPER_TYPE)");
        this.f40053e = b6;
    }

    /* renamed from: a */
    public qh0 mo65774a(ly0 ly0, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(ly0, "env");
        Intrinsics.checkNotNullParameter(jSONObject, "data");
        f50<T> d = w60.m43544d(this.f40049a, ly0, "description", jSONObject, f40043q);
        f50<T> d2 = w60.m43544d(this.f40050b, ly0, ViewHierarchyConstants.HINT_KEY, jSONObject, f40044r);
        f50<C14287pm.C14292e> f50 = (f50) w60.m43543c(this.f40051c, ly0, "mode", jSONObject, f40045s);
        if (f50 == null) {
            f50 = f40033g;
        }
        f50<C14287pm.C14292e> f502 = f50;
        f50<T> d3 = w60.m43544d(this.f40052d, ly0, "state_description", jSONObject, f40046t);
        f50<C14287pm.C14295f> f503 = (f50) w60.m43543c(this.f40053e, ly0, "type", jSONObject, f40047u);
        if (f503 == null) {
            f503 = f40034h;
        }
        return new C14287pm(d, d2, f502, d3, f503);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m42061b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m42063c(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m42065d(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final boolean m42067e(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final boolean m42069f(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m42059a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }
}
