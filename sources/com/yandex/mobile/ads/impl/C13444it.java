package com.yandex.mobile.ads.impl;

import android.graphics.ColorFilter;
import android.net.Uri;
import android.view.View;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.it */
public final class C13444it {

    /* renamed from: a */
    private final C14624so f35021a;

    /* renamed from: b */
    private final C14213ot f35022b;

    /* renamed from: c */
    private final C13903lw f35023c;

    /* renamed from: com.yandex.mobile.ads.impl.it$a */
    static final class C13445a extends Lambda implements Function1<C14709tt, Unit> {

        /* renamed from: b */
        final /* synthetic */ C14933vt f35024b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13445a(C14933vt vtVar) {
            super(1);
            this.f35024b = vtVar;
        }

        public Object invoke(Object obj) {
            C14709tt ttVar = (C14709tt) obj;
            Intrinsics.checkNotNullParameter(ttVar, "scale");
            this.f35024b.setImageScale(C14175ob.m40333a(ttVar));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.it$b */
    static final class C13446b extends Lambda implements Function1<Uri, Unit> {

        /* renamed from: b */
        final /* synthetic */ C13444it f35025b;

        /* renamed from: c */
        final /* synthetic */ C14933vt f35026c;

        /* renamed from: d */
        final /* synthetic */ C13513jm f35027d;

        /* renamed from: e */
        final /* synthetic */ j50 f35028e;

        /* renamed from: f */
        final /* synthetic */ C12997et f35029f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13446b(C13444it itVar, C14933vt vtVar, C13513jm jmVar, j50 j50, C12997et etVar) {
            super(1);
            this.f35025b = itVar;
            this.f35026c = vtVar;
            this.f35027d = jmVar;
            this.f35028e = j50;
            this.f35029f = etVar;
        }

        public Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter((Uri) obj, "it");
            C13444it.m37579a(this.f35025b, this.f35026c, this.f35027d, this.f35028e, this.f35029f);
            return Unit.INSTANCE;
        }
    }

    @Inject
    public C13444it(C14624so soVar, C14213ot otVar, C13903lw lwVar) {
        Intrinsics.checkNotNullParameter(soVar, "baseBinder");
        Intrinsics.checkNotNullParameter(otVar, "imageLoader");
        Intrinsics.checkNotNullParameter(lwVar, "placeholderLoader");
        this.f35021a = soVar;
        this.f35022b = otVar;
        this.f35023c = lwVar;
    }

    /* renamed from: a */
    public static final void m37579a(C13444it itVar, C14933vt vtVar, C13513jm jmVar, j50 j50, C12997et etVar) {
        boolean z;
        itVar.getClass();
        Uri a = etVar.f33135u.mo66924a(j50);
        if (!vtVar.mo68240e() || !Intrinsics.areEqual((Object) a, (Object) vtVar.mo70574i())) {
            if (!etVar.f33133s.mo66924a(j50).booleanValue()) {
                z = false;
            } else {
                z = !vtVar.mo68240e();
            }
            if (!Intrinsics.areEqual((Object) a, (Object) vtVar.mo70574i())) {
                vtVar.mo70575j();
            }
            C13903lw lwVar = itVar.f35023c;
            f50<String> f50 = etVar.f33102A;
            lwVar.mo68520a(vtVar, f50 == null ? null : f50.mo66924a(j50), etVar.f33139y.mo66924a(j50).intValue(), z);
            ij0 a2 = itVar.f35022b.mo69264a(a.toString(), new C13344ht(jmVar, vtVar, a, itVar, etVar, j50));
            Intrinsics.checkNotNullExpressionValue(a2, "private fun DivImageView…ce(reference, this)\n    }");
            jmVar.mo68028a(a2, (View) vtVar);
        }
    }

    /* renamed from: a */
    public void mo67891a(C14933vt vtVar, C12997et etVar, C13513jm jmVar) {
        f50<Double> f50;
        Intrinsics.checkNotNullParameter(vtVar, "view");
        Intrinsics.checkNotNullParameter(etVar, "div");
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        C12997et h = vtVar.mo70573h();
        if (!Intrinsics.areEqual((Object) etVar, (Object) h)) {
            j50 b = jmVar.mo66388b();
            vtVar.mo65871b();
            vtVar.setDiv$div_release(etVar);
            if (h != null) {
                this.f35021a.mo70038a((View) vtVar, (C14697tn) h, jmVar);
            }
            this.f35021a.mo70039a((View) vtVar, (C14697tn) etVar, (C14697tn) h, jmVar);
            C14175ob.m40337a(vtVar, jmVar, etVar.f33116b, etVar.f33118d, etVar.f33136v, etVar.f33129o, etVar.f33117c);
            C14298pn pnVar = etVar.f33123i;
            if (pnVar == null) {
                f50 = null;
            } else {
                f50 = pnVar.f38748a;
            }
            if (f50 == null) {
                vtVar.setAspectRatio(0.0f);
            } else {
                vtVar.mo65870a(pnVar.f38748a.mo66925b(b, new C13585jt(vtVar)));
            }
            vtVar.mo65870a(etVar.f33104C.mo66925b(b, new C13445a(vtVar)));
            f50<C13215gn> f502 = etVar.f33127m;
            f50<C13332hn> f503 = etVar.f33128n;
            vtVar.setGravity(C14175ob.m40325a(f502.mo66924a(b), f503.mo66924a(b)));
            C13781kt ktVar = new C13781kt(this, vtVar, b, f502, f503);
            vtVar.mo65870a(f502.mo66923a(b, ktVar));
            vtVar.mo65870a(f503.mo66923a(b, ktVar));
            f50<Integer> f504 = etVar.f33106E;
            if (f504 == null) {
                vtVar.setColorFilter((ColorFilter) null);
            } else {
                vtVar.mo65870a(f504.mo66925b(b, new C13894lt(this, vtVar)));
            }
            vtVar.mo65870a(etVar.f33135u.mo66925b(b, new C13446b(this, vtVar, jmVar, b, etVar)));
        }
    }
}
