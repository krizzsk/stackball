package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.yandex.mobile.ads.impl.C12607bs;
import com.yandex.mobile.ads.impl.C13086fp;
import com.yandex.mobile.ads.impl.C13215gn;
import com.yandex.mobile.ads.impl.C13332hn;
import com.yandex.mobile.ads.impl.C13420in;
import com.yandex.mobile.ads.impl.C13452ix;
import com.yandex.mobile.ads.impl.C13776kr;
import com.yandex.mobile.ads.impl.C14008mr;
import com.yandex.mobile.ads.impl.C14111nn;
import com.yandex.mobile.ads.impl.C14287pm;
import com.yandex.mobile.ads.impl.C14298pn;
import com.yandex.mobile.ads.impl.C14479rn;
import com.yandex.mobile.ads.impl.C14687tm;
import com.yandex.mobile.ads.impl.C14709tt;
import com.yandex.mobile.ads.impl.C15066wo;
import com.yandex.mobile.ads.impl.c00;
import com.yandex.mobile.ads.impl.cg1;
import com.yandex.mobile.ads.impl.f50;
import com.yandex.mobile.ads.impl.l10;
import com.yandex.mobile.ads.impl.m10;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.ls */
public class C13885ls implements qh0, C14697tn {

    /* renamed from: K */
    public static final C13893h f36830K = new C13893h((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: L */
    public static final C14287pm f36831L = new C14287pm((f50) null, (f50) null, (f50) null, (f50) null, (f50) null, 31);
    /* access modifiers changed from: private */

    /* renamed from: M */
    public static final C13420in f36832M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public static final f50<Double> f36833N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public static final C15066wo f36834O = new C15066wo((f50) null, (C13873lq) null, (f50) null, (C12663bx) null, (C15405zy) null, 31);
    /* access modifiers changed from: private */

    /* renamed from: P */
    public static final f50<C13215gn> f36835P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public static final f50<C13332hn> f36836Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public static final C13452ix.C13457e f36837R = new C13452ix.C13457e(new x10((f50) null, 1));
    /* access modifiers changed from: private */

    /* renamed from: S */
    public static final C13776kr f36838S = new C13776kr((f50) null, (f50) null, (f50) null, (f50) null, (f50) null, 31);
    /* access modifiers changed from: private */

    /* renamed from: T */
    public static final C13776kr f36839T = new C13776kr((f50) null, (f50) null, (f50) null, (f50) null, (f50) null, 31);
    /* access modifiers changed from: private */

    /* renamed from: U */
    public static final f50<Integer> f36840U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public static final f50<Boolean> f36841V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public static final f50<C14709tt> f36842W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public static final f50<l10> f36843X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public static final C13452ix.C13456d f36844Y = new C13452ix.C13456d(new C13250gv((f50) null, 1));
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public static final cg1<C13215gn> f36845Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public static final cg1<C13332hn> f36846a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public static final cg1<C13215gn> f36847b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public static final cg1<C13332hn> f36848c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public static final cg1<C14709tt> f36849d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public static final cg1<l10> f36850e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public static final gj0<C14687tm> f36851f0 = $$Lambda$ls$gjV69iHSXE1DcMIdsYUc30lYGA.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public static final rh1<Double> f36852g0 = $$Lambda$ls$xwmNV9OwdDZ7uGF7u9wjER5ipZo.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public static final gj0<C14479rn> f36853h0 = $$Lambda$ls$DrSpV7YrBO9dWfilxFw_ujJ9g1I.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public static final rh1<Integer> f36854i0 = $$Lambda$ls$HlfQicGq41IeDIJeJN6Z_cah1gc.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public static final gj0<C14687tm> f36855j0 = $$Lambda$ls$iabGstv5MwS13CzHyqyDI2P1Pm0.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public static final gj0<C14008mr> f36856k0 = $$Lambda$ls$Q_KB_FawMMiD1XldeqPzpJQG4.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public static final rh1<String> f36857l0 = $$Lambda$ls$0qtVuEOySVOuD_1Y1Dfsot3i3sU.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public static final gj0<C14687tm> f36858m0 = $$Lambda$ls$rpvzX17s2Ktxf2dsZqavTtU_jZI.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public static final rh1<String> f36859n0 = $$Lambda$ls$Esx2IpoUPG9FQJzYATrRgpoflOU.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public static final rh1<Integer> f36860o0 = $$Lambda$ls$OHIrQCxjAkwgahQvD5vZ1JyW0eo.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public static final gj0<C14687tm> f36861p0 = $$Lambda$ls$4MlZ5hfhBvn0x0OmQt7TftQTIEU.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public static final gj0<c00> f36862q0 = $$Lambda$ls$XQGAJCYN2Wd95V5GzmuthKDqaE.INSTANCE;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public static final gj0<m10> f36863r0 = $$Lambda$ls$mai2k09xcs5UlrYDAlWpGS5SKw.INSTANCE;

    /* renamed from: A */
    public final f50<C14709tt> f36864A;

    /* renamed from: B */
    private final List<C14687tm> f36865B;

    /* renamed from: C */
    private final List<c00> f36866C;

    /* renamed from: D */
    private final C13086fp f36867D;

    /* renamed from: E */
    private final C14111nn f36868E;

    /* renamed from: F */
    private final C14111nn f36869F;

    /* renamed from: G */
    private final f50<l10> f36870G;

    /* renamed from: H */
    private final m10 f36871H;

    /* renamed from: I */
    private final List<m10> f36872I;

    /* renamed from: J */
    private final C13452ix f36873J;

    /* renamed from: a */
    private final C14287pm f36874a;

    /* renamed from: b */
    public final C14687tm f36875b;

    /* renamed from: c */
    public final C13420in f36876c;

    /* renamed from: d */
    public final List<C14687tm> f36877d;

    /* renamed from: e */
    private final f50<C13215gn> f36878e;

    /* renamed from: f */
    private final f50<C13332hn> f36879f;

    /* renamed from: g */
    private final f50<Double> f36880g;

    /* renamed from: h */
    public final C14298pn f36881h;

    /* renamed from: i */
    private final List<C14479rn> f36882i;

    /* renamed from: j */
    private final C15066wo f36883j;

    /* renamed from: k */
    private final f50<Integer> f36884k;

    /* renamed from: l */
    public final f50<C13215gn> f36885l;

    /* renamed from: m */
    public final f50<C13332hn> f36886m;

    /* renamed from: n */
    public final List<C14687tm> f36887n;

    /* renamed from: o */
    private final List<C14008mr> f36888o;

    /* renamed from: p */
    private final C12607bs f36889p;

    /* renamed from: q */
    public final f50<Uri> f36890q;

    /* renamed from: r */
    private final C13452ix f36891r;

    /* renamed from: s */
    private final String f36892s;

    /* renamed from: t */
    public final List<C14687tm> f36893t;

    /* renamed from: u */
    private final C13776kr f36894u;

    /* renamed from: v */
    private final C13776kr f36895v;

    /* renamed from: w */
    public final f50<Integer> f36896w;

    /* renamed from: x */
    public final f50<Boolean> f36897x;

    /* renamed from: y */
    public final f50<String> f36898y;

    /* renamed from: z */
    private final f50<Integer> f36899z;

    /* renamed from: com.yandex.mobile.ads.impl.ls$a */
    static final class C13886a extends Lambda implements Function2<ly0, JSONObject, C13885ls> {

        /* renamed from: b */
        public static final C13886a f36900b = new C13886a();

        C13886a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            return C13885ls.f36830K.mo68503a(ly0, jSONObject);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ls$b */
    static final class C13887b extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C13887b f36901b = new C13887b();

        C13887b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13215gn);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ls$c */
    static final class C13888c extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C13888c f36902b = new C13888c();

        C13888c() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13332hn);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ls$d */
    static final class C13889d extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C13889d f36903b = new C13889d();

        C13889d() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13215gn);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ls$e */
    static final class C13890e extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C13890e f36904b = new C13890e();

        C13890e() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C13332hn);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ls$f */
    static final class C13891f extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C13891f f36905b = new C13891f();

        C13891f() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof C14709tt);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ls$g */
    static final class C13892g extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: b */
        public static final C13892g f36906b = new C13892g();

        C13892g() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "it");
            return Boolean.valueOf(obj instanceof l10);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ls$h */
    public static final class C13893h {
        private C13893h() {
        }

        public /* synthetic */ C13893h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C13885ls mo68503a(ly0 ly0, JSONObject jSONObject) {
            ly0 ly02 = ly0;
            JSONObject jSONObject2 = jSONObject;
            Intrinsics.checkNotNullParameter(ly02, "env");
            Intrinsics.checkNotNullParameter(jSONObject2, "json");
            ny0 b = ly0.mo66818b();
            C14287pm.C14291d dVar = C14287pm.f38708d;
            C14287pm pmVar = (C14287pm) zh0.m44622b(jSONObject2, "accessibility", C14287pm.f38716l, b, ly02);
            if (pmVar == null) {
                pmVar = C13885ls.f36831L;
            }
            C14287pm pmVar2 = pmVar;
            Intrinsics.checkNotNullExpressionValue(pmVar2, "JsonParser.readOptional(…CESSIBILITY_DEFAULT_VALUE");
            C14687tm.C14690c cVar = C14687tm.f40352i;
            C14687tm tmVar = (C14687tm) zh0.m44622b(jSONObject2, "action", C14687tm.f40356m, b, ly02);
            C13420in.C13424d dVar2 = C13420in.f34922h;
            C13420in inVar = (C13420in) zh0.m44622b(jSONObject2, "action_animation", C13420in.f34932r, b, ly02);
            if (inVar == null) {
                inVar = C13885ls.f36832M;
            }
            C13420in inVar2 = inVar;
            Intrinsics.checkNotNullExpressionValue(inVar2, "JsonParser.readOptional(…N_ANIMATION_DEFAULT_VALUE");
            List b2 = zh0.m44626b(jSONObject, "actions", C14687tm.f40356m, C13885ls.f36851f0, b, ly0);
            C13215gn.C13217b bVar = C13215gn.f34045c;
            ny0 ny0 = b;
            ly0 ly03 = ly0;
            f50 b3 = zh0.m44621b(jSONObject, "alignment_horizontal", C13215gn.f34046d, ny0, ly03, C13885ls.f36845Z);
            C13332hn.C13334b bVar2 = C13332hn.f34465c;
            JSONObject jSONObject3 = jSONObject;
            f50 b4 = zh0.m44621b(jSONObject3, "alignment_vertical", C13332hn.f34466d, ny0, ly03, C13885ls.f36846a0);
            f50 a = zh0.m44601a(jSONObject3, "alpha", (Function1) ky0.m38513c(), C13885ls.f36852g0, b, C13885ls.f36833N, (cg1) dg1.f32576d);
            if (a == null) {
                a = C13885ls.f36833N;
            }
            f50 f50 = a;
            C14298pn.C14300b bVar3 = C14298pn.f38745b;
            C14298pn pnVar = (C14298pn) zh0.m44622b(jSONObject2, "aspect", C14298pn.f38747d, b, ly02);
            C14479rn.C14481b bVar4 = C14479rn.f39510a;
            List b5 = zh0.m44626b(jSONObject, "background", C14479rn.f39511b, C13885ls.f36853h0, b, ly0);
            C15066wo.C15068b bVar5 = C15066wo.f42068f;
            C15066wo woVar = (C15066wo) zh0.m44622b(jSONObject2, "border", C15066wo.f42071i, b, ly02);
            if (woVar == null) {
                woVar = C13885ls.f36834O;
            }
            C15066wo woVar2 = woVar;
            Intrinsics.checkNotNullExpressionValue(woVar2, "JsonParser.readOptional(…) ?: BORDER_DEFAULT_VALUE");
            Function1<Number, Integer> d = ky0.m38514d();
            rh1 D = C13885ls.f36854i0;
            cg1<Integer> cg1 = dg1.f32574b;
            JSONObject jSONObject4 = jSONObject;
            f50 a2 = zh0.m44601a(jSONObject4, "column_span", (Function1) d, D, b, (f50) null, (cg1) cg1);
            f50 b6 = zh0.m44621b(jSONObject4, "content_alignment_horizontal", C13215gn.f34046d, b, ly0, C13885ls.f36847b0);
            if (b6 == null) {
                b6 = C13885ls.f36835P;
            }
            f50 f502 = b6;
            f50 b7 = zh0.m44621b(jSONObject, "content_alignment_vertical", C13332hn.f34466d, b, ly0, C13885ls.f36848c0);
            if (b7 == null) {
                b7 = C13885ls.f36836Q;
            }
            f50 f503 = b7;
            ny0 ny02 = b;
            ly0 ly04 = ly0;
            List b8 = zh0.m44626b(jSONObject, "doubletap_actions", C14687tm.f40356m, C13885ls.f36855j0, ny02, ly04);
            C14008mr.C14010b bVar6 = C14008mr.f37491c;
            List b9 = zh0.m44626b(jSONObject, "extensions", C14008mr.f37493e, C13885ls.f36856k0, ny02, ly04);
            C12607bs.C12609b bVar7 = C12607bs.f31402e;
            C12607bs bsVar = (C12607bs) zh0.m44622b(jSONObject2, "focus", C12607bs.f31406i, b, ly02);
            f50<Uri> a3 = zh0.m44598a(jSONObject, CampaignEx.JSON_KEY_GIF_URL, ky0.m38516f(), b, ly0, dg1.f32577e);
            Intrinsics.checkNotNullExpressionValue(a3, "readExpression(json, \"gi…er, env, TYPE_HELPER_URI)");
            C13452ix.C13454b bVar8 = C13452ix.f35059a;
            C13452ix ixVar = (C13452ix) zh0.m44622b(jSONObject2, "height", C13452ix.f35060b, b, ly02);
            if (ixVar == null) {
                ixVar = C13885ls.f36837R;
            }
            C13452ix ixVar2 = ixVar;
            Intrinsics.checkNotNullExpressionValue(ixVar2, "JsonParser.readOptional(…) ?: HEIGHT_DEFAULT_VALUE");
            String str = (String) zh0.m44625b(jSONObject2, "id", C13885ls.f36857l0, b, ly02);
            C13452ix ixVar3 = ixVar2;
            List b10 = zh0.m44626b(jSONObject, "longtap_actions", C14687tm.f40356m, C13885ls.f36858m0, b, ly0);
            C13776kr.C13779c cVar2 = C13776kr.f36385f;
            C13776kr krVar = (C13776kr) zh0.m44622b(jSONObject2, "margins", C13776kr.f36396q, b, ly02);
            if (krVar == null) {
                krVar = C13885ls.f36838S;
            }
            C13776kr krVar2 = krVar;
            Intrinsics.checkNotNullExpressionValue(krVar2, "JsonParser.readOptional(… ?: MARGINS_DEFAULT_VALUE");
            C13776kr krVar3 = (C13776kr) zh0.m44622b(jSONObject2, "paddings", C13776kr.f36396q, b, ly02);
            if (krVar3 == null) {
                krVar3 = C13885ls.f36839T;
            }
            C13776kr krVar4 = krVar3;
            Intrinsics.checkNotNullExpressionValue(krVar4, "JsonParser.readOptional(…?: PADDINGS_DEFAULT_VALUE");
            Function1<String, Integer> e = ky0.m38515e();
            C13776kr krVar5 = krVar4;
            C13776kr krVar6 = krVar2;
            f50 N = C13885ls.f36840U;
            f50<Uri> f504 = a3;
            f50<Integer> a4 = zh0.m44599a(jSONObject, "placeholder_color", e, b, ly0, N, dg1.f32578f);
            if (a4 == null) {
                a4 = C13885ls.f36840U;
            }
            f50<Integer> f505 = a4;
            f50<Boolean> a5 = zh0.m44599a(jSONObject, "preload_required", ky0.m38512b(), b, ly0, C13885ls.f36841V, dg1.f32573a);
            if (a5 == null) {
                a5 = C13885ls.f36841V;
            }
            f50<Boolean> f506 = a5;
            JSONObject jSONObject5 = jSONObject;
            f50<String> b11 = zh0.m44620b(jSONObject5, "preview", C13885ls.f36859n0, b, ly0, dg1.f32575c);
            f50 a6 = zh0.m44601a(jSONObject5, "row_span", (Function1) ky0.m38514d(), C13885ls.f36860o0, b, (f50) null, (cg1) cg1);
            C14709tt.C14711b bVar9 = C14709tt.f40453c;
            f50 b12 = zh0.m44621b(jSONObject, "scale", C14709tt.f40454d, b, ly0, C13885ls.f36849d0);
            if (b12 == null) {
                b12 = C13885ls.f36842W;
            }
            f50 f507 = b12;
            ny0 ny03 = b;
            ly0 ly05 = ly0;
            List b13 = zh0.m44626b(jSONObject, "selected_actions", C14687tm.f40356m, C13885ls.f36861p0, ny03, ly05);
            c00.C12690c cVar3 = c00.f31754h;
            List b14 = zh0.m44626b(jSONObject, "tooltips", c00.f31759m, C13885ls.f36862q0, ny03, ly05);
            C13086fp.C13089c cVar4 = C13086fp.f33474a;
            C13086fp fpVar = (C13086fp) zh0.m44622b(jSONObject2, "transition_change", C13086fp.f33475b, b, ly02);
            C14111nn.C14114c cVar5 = C14111nn.f37864a;
            C14111nn nnVar = (C14111nn) zh0.m44622b(jSONObject2, "transition_in", C14111nn.f37865b, b, ly02);
            C14111nn nnVar2 = (C14111nn) zh0.m44622b(jSONObject2, "transition_out", C14111nn.f37865b, b, ly02);
            l10.C13827b bVar10 = l10.f36487c;
            f50 b15 = zh0.m44621b(jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, l10.f36488d, b, ly0, C13885ls.f36850e0);
            if (b15 == null) {
                b15 = C13885ls.f36843X;
            }
            f50 f508 = b15;
            m10.C13949b bVar11 = m10.f37143i;
            m10 m10 = (m10) zh0.m44622b(jSONObject2, "visibility_action", m10.f37151q, b, ly02);
            List b16 = zh0.m44626b(jSONObject, "visibility_actions", m10.f37151q, C13885ls.f36863r0, b, ly0);
            C13452ix ixVar4 = (C13452ix) zh0.m44622b(jSONObject2, "width", C13452ix.f35060b, b, ly02);
            if (ixVar4 == null) {
                ixVar4 = C13885ls.f36844Y;
            }
            Intrinsics.checkNotNullExpressionValue(ixVar4, "JsonParser.readOptional(…v) ?: WIDTH_DEFAULT_VALUE");
            return new C13885ls(pmVar2, tmVar, inVar2, b2, b3, b4, f50, pnVar, b5, woVar2, a2, f502, f503, b8, b9, bsVar, f504, ixVar3, str, b10, krVar6, krVar5, f505, f506, b11, a6, f507, b13, b14, fpVar, nnVar, nnVar2, f508, m10, b16, ixVar4);
        }
    }

    static {
        f50.C13029a aVar = f50.f33229a;
        f50 a = aVar.mo66929a(100);
        f50 a2 = aVar.mo66929a(Double.valueOf(0.6d));
        f50 a3 = aVar.mo66929a(C13420in.C13425e.FADE);
        Double valueOf = Double.valueOf(1.0d);
        f36832M = new C13420in(a, a2, (f50) null, (List) null, a3, (C14121nq) null, (f50) null, aVar.mo66929a(valueOf), 108);
        f36833N = aVar.mo66929a(valueOf);
        f36835P = aVar.mo66929a(C13215gn.CENTER);
        f36836Q = aVar.mo66929a(C13332hn.CENTER);
        f36840U = aVar.mo66929a(335544320);
        f36841V = aVar.mo66929a(Boolean.FALSE);
        f36842W = aVar.mo66929a(C14709tt.FILL);
        f36843X = aVar.mo66929a(l10.VISIBLE);
        cg1.C12733a aVar2 = cg1.f31917a;
        f36845Z = aVar2.mo66293a(ArraysKt.first((T[]) C13215gn.values()), C13887b.f36901b);
        f36846a0 = aVar2.mo66293a(ArraysKt.first((T[]) C13332hn.values()), C13888c.f36902b);
        f36847b0 = aVar2.mo66293a(ArraysKt.first((T[]) C13215gn.values()), C13889d.f36903b);
        f36848c0 = aVar2.mo66293a(ArraysKt.first((T[]) C13332hn.values()), C13890e.f36904b);
        f36849d0 = aVar2.mo66293a(ArraysKt.first((T[]) C14709tt.values()), C13891f.f36905b);
        f36850e0 = aVar2.mo66293a(ArraysKt.first((T[]) l10.values()), C13892g.f36906b);
        $$Lambda$ls$N_ACldLffaLlrFn3ya4a2QE9fU r0 = $$Lambda$ls$N_ACldLffaLlrFn3ya4a2QE9fU.INSTANCE;
        $$Lambda$ls$bKsRWWUab8Kwsl8bIcW0wwqDPl0 r02 = $$Lambda$ls$bKsRWWUab8Kwsl8bIcW0wwqDPl0.INSTANCE;
        $$Lambda$ls$c4CC5PrhlnssXWxdlTTjCop8N4 r03 = $$Lambda$ls$c4CC5PrhlnssXWxdlTTjCop8N4.INSTANCE;
        $$Lambda$ls$Xa51iXGvps9nppJLd1yVa45Tlc r04 = $$Lambda$ls$Xa51iXGvps9nppJLd1yVa45Tlc.INSTANCE;
        $$Lambda$ls$qGB6BzV0PRo6rcIaEniBu2ot8XI r05 = $$Lambda$ls$qGB6BzV0PRo6rcIaEniBu2ot8XI.INSTANCE;
        C13886a aVar3 = C13886a.f36900b;
    }

    public C13885ls(C14287pm pmVar, C14687tm tmVar, C13420in inVar, List<? extends C14687tm> list, f50<C13215gn> f50, f50<C13332hn> f502, f50<Double> f503, C14298pn pnVar, List<? extends C14479rn> list2, C15066wo woVar, f50<Integer> f504, f50<C13215gn> f505, f50<C13332hn> f506, List<? extends C14687tm> list3, List<? extends C14008mr> list4, C12607bs bsVar, f50<Uri> f507, C13452ix ixVar, String str, List<? extends C14687tm> list5, C13776kr krVar, C13776kr krVar2, f50<Integer> f508, f50<Boolean> f509, f50<String> f5010, f50<Integer> f5011, f50<C14709tt> f5012, List<? extends C14687tm> list6, List<? extends c00> list7, C13086fp fpVar, C14111nn nnVar, C14111nn nnVar2, f50<l10> f5013, m10 m10, List<? extends m10> list8, C13452ix ixVar2) {
        C14287pm pmVar2 = pmVar;
        C13420in inVar2 = inVar;
        f50<Double> f5014 = f503;
        C15066wo woVar2 = woVar;
        f50<C13215gn> f5015 = f505;
        f50<C13332hn> f5016 = f506;
        f50<Uri> f5017 = f507;
        C13452ix ixVar3 = ixVar;
        C13776kr krVar3 = krVar;
        C13776kr krVar4 = krVar2;
        f50<Integer> f5018 = f508;
        f50<Boolean> f5019 = f509;
        f50<C14709tt> f5020 = f5012;
        f50<l10> f5021 = f5013;
        C13452ix ixVar4 = ixVar2;
        Intrinsics.checkNotNullParameter(pmVar2, "accessibility");
        Intrinsics.checkNotNullParameter(inVar2, "actionAnimation");
        Intrinsics.checkNotNullParameter(f5014, "alpha");
        Intrinsics.checkNotNullParameter(woVar2, "border");
        Intrinsics.checkNotNullParameter(f5015, "contentAlignmentHorizontal");
        Intrinsics.checkNotNullParameter(f5016, "contentAlignmentVertical");
        Intrinsics.checkNotNullParameter(f5017, "gifUrl");
        Intrinsics.checkNotNullParameter(ixVar3, "height");
        Intrinsics.checkNotNullParameter(krVar3, "margins");
        Intrinsics.checkNotNullParameter(krVar4, "paddings");
        Intrinsics.checkNotNullParameter(f5018, "placeholderColor");
        Intrinsics.checkNotNullParameter(f5019, "preloadRequired");
        Intrinsics.checkNotNullParameter(f5020, "scale");
        Intrinsics.checkNotNullParameter(f5021, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY);
        Intrinsics.checkNotNullParameter(ixVar4, "width");
        this.f36874a = pmVar2;
        this.f36875b = tmVar;
        this.f36876c = inVar2;
        this.f36877d = list;
        this.f36878e = f50;
        this.f36879f = f502;
        this.f36880g = f5014;
        this.f36881h = pnVar;
        this.f36882i = list2;
        this.f36883j = woVar2;
        this.f36884k = f504;
        this.f36885l = f5015;
        this.f36886m = f5016;
        this.f36887n = list3;
        this.f36888o = list4;
        this.f36889p = bsVar;
        this.f36890q = f5017;
        this.f36891r = ixVar3;
        this.f36892s = str;
        this.f36893t = list5;
        this.f36894u = krVar3;
        this.f36895v = krVar4;
        this.f36896w = f5018;
        this.f36897x = f5019;
        this.f36898y = f5010;
        this.f36899z = f5011;
        this.f36864A = f5020;
        this.f36865B = list6;
        this.f36866C = list7;
        this.f36867D = fpVar;
        this.f36868E = nnVar;
        this.f36869F = nnVar2;
        this.f36870G = f5021;
        this.f36871H = m10;
        this.f36872I = list8;
        this.f36873J = ixVar4;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m38944a(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m38945a(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m38949b(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m38950b(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m38954c(int i) {
        return i >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m38958d(int i) {
        return i >= 0;
    }

    /* renamed from: a */
    public f50<Integer> mo66142a() {
        return this.f36884k;
    }

    /* renamed from: b */
    public f50<C13332hn> mo66143b() {
        return this.f36879f;
    }

    /* renamed from: c */
    public String mo66144c() {
        return this.f36892s;
    }

    /* renamed from: d */
    public C14111nn mo66145d() {
        return this.f36868E;
    }

    /* renamed from: e */
    public List<C14687tm> mo66146e() {
        return this.f36865B;
    }

    /* renamed from: f */
    public C13452ix mo66147f() {
        return this.f36873J;
    }

    /* renamed from: g */
    public C13452ix mo66148g() {
        return this.f36891r;
    }

    public f50<l10> getVisibility() {
        return this.f36870G;
    }

    /* renamed from: h */
    public f50<Double> mo66150h() {
        return this.f36880g;
    }

    /* renamed from: i */
    public f50<C13215gn> mo66151i() {
        return this.f36878e;
    }

    /* renamed from: j */
    public C13776kr mo66152j() {
        return this.f36894u;
    }

    /* renamed from: k */
    public C15066wo mo66153k() {
        return this.f36883j;
    }

    /* renamed from: l */
    public List<C14008mr> mo66154l() {
        return this.f36888o;
    }

    /* renamed from: m */
    public List<C14479rn> mo66155m() {
        return this.f36882i;
    }

    /* renamed from: n */
    public List<c00> mo66156n() {
        return this.f36866C;
    }

    /* renamed from: o */
    public f50<Integer> mo66157o() {
        return this.f36899z;
    }

    /* renamed from: p */
    public C13776kr mo66158p() {
        return this.f36895v;
    }

    /* renamed from: q */
    public C12607bs mo66159q() {
        return this.f36889p;
    }

    /* renamed from: r */
    public m10 mo66160r() {
        return this.f36871H;
    }

    /* renamed from: s */
    public C14111nn mo66161s() {
        return this.f36869F;
    }

    /* renamed from: t */
    public List<m10> mo66162t() {
        return this.f36872I;
    }

    /* renamed from: u */
    public C13086fp mo66163u() {
        return this.f36867D;
    }

    /* renamed from: v */
    public C14287pm mo66164v() {
        return this.f36874a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m38947a(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m38952b(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m38956c(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m38960d(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final boolean m38961e(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final boolean m38962f(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final boolean m38963g(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final boolean m38964h(List list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list.size() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m38946a(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m38951b(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m38955c(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m38959d(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        return str.length() >= 1;
    }
}
