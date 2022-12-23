package com.yandex.mobile.ads.impl;

import com.appsflyer.internal.referrer.Payload;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.xl */
public abstract class C15177xl implements qh0 {

    /* renamed from: a */
    public static final C15179b f42609a = new C15179b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Function2<ly0, JSONObject, C15177xl> f42610b = C15178a.f42611b;

    /* renamed from: com.yandex.mobile.ads.impl.xl$a */
    static final class C15178a extends Lambda implements Function2<ly0, JSONObject, C15177xl> {

        /* renamed from: b */
        public static final C15178a f42611b = new C15178a();

        C15178a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ly0 ly0 = (ly0) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            C15179b bVar = C15177xl.f42609a;
            Intrinsics.checkNotNullParameter(ly0, "env");
            Intrinsics.checkNotNullParameter(jSONObject, "json");
            String str = (String) ai0.m33744a(jSONObject, "type", (rh1) null, ly0.mo66818b(), ly0, 2);
            switch (str.hashCode()) {
                case -1349088399:
                    if (str.equals(Payload.CUSTOM)) {
                        return new C15181d(C14406qq.f39241y.mo69635a(ly0, jSONObject));
                    }
                    break;
                case -899647263:
                    if (str.equals("slider")) {
                        return new C15189l(C14141nx.f37930L.mo69084a(ly0, jSONObject));
                    }
                    break;
                case -711999985:
                    if (str.equals("indicator")) {
                        return new C15186i(C15107wt.f42216F.mo70752a(ly0, jSONObject));
                    }
                    break;
                case -410956671:
                    if (str.equals(TtmlNode.RUBY_CONTAINER)) {
                        return new C15180c(C13091fq.f33489H.mo67064a(ly0, jSONObject));
                    }
                    break;
                case -196315310:
                    if (str.equals("gallery")) {
                        return new C15182e(C13111fs.f33600H.mo67074a(ly0, jSONObject));
                    }
                    break;
                case 102340:
                    if (str.equals("gif")) {
                        return new C15183f(C13885ls.f36830K.mo68503a(ly0, jSONObject));
                    }
                    break;
                case 3181382:
                    if (str.equals("grid")) {
                        return new C15184g(C14924vs.f41456G.mo70566a(ly0, jSONObject));
                    }
                    break;
                case 3552126:
                    if (str.equals("tabs")) {
                        return new C15191n(C12667bz.f31627I.mo66165a(ly0, jSONObject));
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        return new C15192o(C13915lz.f36988W.mo68530a(ly0, jSONObject));
                    }
                    break;
                case 100313435:
                    if (str.equals("image")) {
                        return new C15185h(C12997et.f33067N.mo66872a(ly0, jSONObject));
                    }
                    break;
                case 106426307:
                    if (str.equals("pager")) {
                        return new C15187j(C14215ov.f38319D.mo69270a(ly0, jSONObject));
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        return new C15190m(C13358hy.f34642B.mo67703a(ly0, jSONObject));
                    }
                    break;
                case 1732829925:
                    if (str.equals("separator")) {
                        return new C15188k(C14841uw.f41070D.mo70417a(ly0, jSONObject));
                    }
                    break;
            }
            ci0<?> a = ly0.mo68529a().mo66059a(str);
            C13806kz kzVar = a instanceof C13806kz ? (C13806kz) a : null;
            if (kzVar != null) {
                return kzVar.mo65774a(ly0, jSONObject);
            }
            throw py0.m41004a(jSONObject, "type", str);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xl$b */
    public static final class C15179b {
        private C15179b() {
        }

        public /* synthetic */ C15179b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xl$c */
    public static class C15180c extends C15177xl {

        /* renamed from: c */
        private final C13091fq f42612c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15180c(C13091fq fqVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(fqVar, "value");
            this.f42612c = fqVar;
        }

        /* renamed from: c */
        public C13091fq mo70912c() {
            return this.f42612c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xl$d */
    public static class C15181d extends C15177xl {

        /* renamed from: c */
        private final C14406qq f42613c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15181d(C14406qq qqVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(qqVar, "value");
            this.f42613c = qqVar;
        }

        /* renamed from: c */
        public C14406qq mo70913c() {
            return this.f42613c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xl$e */
    public static class C15182e extends C15177xl {

        /* renamed from: c */
        private final C13111fs f42614c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15182e(C13111fs fsVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(fsVar, "value");
            this.f42614c = fsVar;
        }

        /* renamed from: c */
        public C13111fs mo70914c() {
            return this.f42614c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xl$f */
    public static class C15183f extends C15177xl {

        /* renamed from: c */
        private final C13885ls f42615c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15183f(C13885ls lsVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(lsVar, "value");
            this.f42615c = lsVar;
        }

        /* renamed from: c */
        public C13885ls mo70915c() {
            return this.f42615c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xl$g */
    public static class C15184g extends C15177xl {

        /* renamed from: c */
        private final C14924vs f42616c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15184g(C14924vs vsVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(vsVar, "value");
            this.f42616c = vsVar;
        }

        /* renamed from: c */
        public C14924vs mo70916c() {
            return this.f42616c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xl$h */
    public static class C15185h extends C15177xl {

        /* renamed from: c */
        private final C12997et f42617c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15185h(C12997et etVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(etVar, "value");
            this.f42617c = etVar;
        }

        /* renamed from: c */
        public C12997et mo70917c() {
            return this.f42617c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xl$i */
    public static class C15186i extends C15177xl {

        /* renamed from: c */
        private final C15107wt f42618c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15186i(C15107wt wtVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(wtVar, "value");
            this.f42618c = wtVar;
        }

        /* renamed from: c */
        public C15107wt mo70918c() {
            return this.f42618c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xl$j */
    public static class C15187j extends C15177xl {

        /* renamed from: c */
        private final C14215ov f42619c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15187j(C14215ov ovVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(ovVar, "value");
            this.f42619c = ovVar;
        }

        /* renamed from: c */
        public C14215ov mo70919c() {
            return this.f42619c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xl$k */
    public static class C15188k extends C15177xl {

        /* renamed from: c */
        private final C14841uw f42620c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15188k(C14841uw uwVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(uwVar, "value");
            this.f42620c = uwVar;
        }

        /* renamed from: c */
        public C14841uw mo70920c() {
            return this.f42620c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xl$l */
    public static class C15189l extends C15177xl {

        /* renamed from: c */
        private final C14141nx f42621c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15189l(C14141nx nxVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(nxVar, "value");
            this.f42621c = nxVar;
        }

        /* renamed from: c */
        public C14141nx mo70921c() {
            return this.f42621c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xl$m */
    public static class C15190m extends C15177xl {

        /* renamed from: c */
        private final C13358hy f42622c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15190m(C13358hy hyVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(hyVar, "value");
            this.f42622c = hyVar;
        }

        /* renamed from: c */
        public C13358hy mo70922c() {
            return this.f42622c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xl$n */
    public static class C15191n extends C15177xl {

        /* renamed from: c */
        private final C12667bz f42623c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15191n(C12667bz bzVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(bzVar, "value");
            this.f42623c = bzVar;
        }

        /* renamed from: c */
        public C12667bz mo70923c() {
            return this.f42623c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xl$o */
    public static class C15192o extends C15177xl {

        /* renamed from: c */
        private final C13915lz f42624c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15192o(C13915lz lzVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(lzVar, "value");
            this.f42624c = lzVar;
        }

        /* renamed from: c */
        public C13915lz mo70924c() {
            return this.f42624c;
        }
    }

    private C15177xl() {
    }

    public /* synthetic */ C15177xl(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public C14697tn mo70911b() {
        if (this instanceof C15185h) {
            return ((C15185h) this).mo70917c();
        }
        if (this instanceof C15183f) {
            return ((C15183f) this).mo70915c();
        }
        if (this instanceof C15192o) {
            return ((C15192o) this).mo70924c();
        }
        if (this instanceof C15188k) {
            return ((C15188k) this).mo70920c();
        }
        if (this instanceof C15180c) {
            return ((C15180c) this).mo70912c();
        }
        if (this instanceof C15184g) {
            return ((C15184g) this).mo70916c();
        }
        if (this instanceof C15182e) {
            return ((C15182e) this).mo70914c();
        }
        if (this instanceof C15187j) {
            return ((C15187j) this).mo70919c();
        }
        if (this instanceof C15191n) {
            return ((C15191n) this).mo70923c();
        }
        if (this instanceof C15190m) {
            return ((C15190m) this).mo70922c();
        }
        if (this instanceof C15181d) {
            return ((C15181d) this).mo70913c();
        }
        if (this instanceof C15186i) {
            return ((C15186i) this).mo70918c();
        }
        if (this instanceof C15189l) {
            return ((C15189l) this).mo70921c();
        }
        throw new NoWhenBranchMatchedException();
    }
}
