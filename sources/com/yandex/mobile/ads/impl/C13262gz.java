package com.yandex.mobile.ads.impl;

import android.util.DisplayMetrics;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.C12667bz;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.mobile.ads.impl.gz */
public final class C13262gz {

    /* renamed from: com.yandex.mobile.ads.impl.gz$a */
    static final class C13263a extends Lambda implements Function1<C12915ds, Unit> {

        /* renamed from: b */
        final /* synthetic */ tc1 f34177b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13263a(tc1 tc1) {
            super(1);
            this.f34177b = tc1;
        }

        public Object invoke(Object obj) {
            C12915ds dsVar = (C12915ds) obj;
            Intrinsics.checkNotNullParameter(dsVar, "it");
            int ordinal = dsVar.ordinal();
            if (ordinal == 0) {
                this.f34177b.setDefaultTypefaceType(gg1.LIGHT);
            } else if (ordinal == 1) {
                this.f34177b.setDefaultTypefaceType(gg1.MEDIUM);
            } else if (ordinal == 2) {
                this.f34177b.setDefaultTypefaceType(gg1.REGULAR);
            } else if (ordinal == 3) {
                this.f34177b.setDefaultTypefaceType(gg1.BOLD);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gz$b */
    static final class C13264b extends Lambda implements Function1<Object, Unit> {

        /* renamed from: b */
        final /* synthetic */ tc1 f34178b;

        /* renamed from: c */
        final /* synthetic */ C12667bz.C12677h f34179c;

        /* renamed from: d */
        final /* synthetic */ j50 f34180d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13264b(tc1 tc1, C12667bz.C12677h hVar, j50 j50) {
            super(1);
            this.f34178b = tc1;
            this.f34179c = hVar;
            this.f34180d = j50;
        }

        public Object invoke(Object obj) {
            tc1 tc1 = this.f34178b;
            int intValue = this.f34179c.f31724c.mo66924a(this.f34180d).intValue();
            C13794kx a = this.f34179c.f31725d.mo66924a(this.f34180d);
            Intrinsics.checkNotNullParameter(tc1, "<this>");
            Intrinsics.checkNotNullParameter(a, "unit");
            tc1.setTextSize(C14175ob.m40327a(a), (float) intValue);
            tc1 tc12 = this.f34178b;
            double doubleValue = this.f34179c.f31729h.mo66924a(this.f34180d).doubleValue();
            Intrinsics.checkNotNullParameter(tc12, "<this>");
            tc12.setLetterSpacing((float) doubleValue);
            tc1 tc13 = this.f34178b;
            f50<Integer> f50 = this.f34179c.f31730i;
            C14175ob.m40342a((TextView) tc13, f50 == null ? null : f50.mo66924a(this.f34180d), this.f34179c.f31725d.mo66924a(this.f34180d));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gz$c */
    static final class C13265c extends Lambda implements Function1<Object, Unit> {

        /* renamed from: b */
        final /* synthetic */ tc1 f34181b;

        /* renamed from: c */
        final /* synthetic */ C13776kr f34182c;

        /* renamed from: d */
        final /* synthetic */ j50 f34183d;

        /* renamed from: e */
        final /* synthetic */ DisplayMetrics f34184e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13265c(tc1 tc1, C13776kr krVar, j50 j50, DisplayMetrics displayMetrics) {
            super(1);
            this.f34181b = tc1;
            this.f34182c = krVar;
            this.f34183d = j50;
            this.f34184e = displayMetrics;
        }

        public Object invoke(Object obj) {
            tc1 tc1 = this.f34181b;
            DisplayMetrics displayMetrics = this.f34184e;
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "metrics");
            int a = C14175ob.m40330a(this.f34182c.f36398b.mo66924a(this.f34183d), displayMetrics);
            DisplayMetrics displayMetrics2 = this.f34184e;
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "metrics");
            int a2 = C14175ob.m40330a(this.f34182c.f36400d.mo66924a(this.f34183d), displayMetrics2);
            DisplayMetrics displayMetrics3 = this.f34184e;
            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "metrics");
            int a3 = C14175ob.m40330a(this.f34182c.f36399c.mo66924a(this.f34183d), displayMetrics3);
            DisplayMetrics displayMetrics4 = this.f34184e;
            Intrinsics.checkNotNullExpressionValue(displayMetrics4, "metrics");
            tc1.setTabPadding(a, a2, a3, C14175ob.m40330a(this.f34182c.f36397a.mo66924a(this.f34183d), displayMetrics4));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final void m36735a(tc1 tc1, C12667bz.C12677h hVar, j50 j50, l50 l50) {
        C15055wl a;
        Intrinsics.checkNotNullParameter(tc1, "<this>");
        Intrinsics.checkNotNullParameter(hVar, "style");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        Intrinsics.checkNotNullParameter(l50, "subscriber");
        C13264b bVar = new C13264b(tc1, hVar, j50);
        l50.mo65870a(hVar.f31724c.mo66923a(j50, bVar));
        l50.mo65870a(hVar.f31725d.mo66923a(j50, bVar));
        f50<Integer> f50 = hVar.f31730i;
        if (!(f50 == null || (a = f50.mo66923a(j50, bVar)) == null)) {
            l50.mo65870a(a);
        }
        bVar.invoke(null);
        tc1.setIncludeFontPadding(false);
        C13776kr krVar = hVar.f31731j;
        C13265c cVar = new C13265c(tc1, krVar, j50, tc1.getResources().getDisplayMetrics());
        l50.mo65870a(krVar.f36398b.mo66923a(j50, cVar));
        l50.mo65870a(krVar.f36399c.mo66923a(j50, cVar));
        l50.mo65870a(krVar.f36400d.mo66923a(j50, cVar));
        l50.mo65870a(krVar.f36397a.mo66923a(j50, cVar));
        cVar.invoke(null);
        l50.mo65870a(hVar.f31726e.mo66925b(j50, new C13263a(tc1)));
    }
}
