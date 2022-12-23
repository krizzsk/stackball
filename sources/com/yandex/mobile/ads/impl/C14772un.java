package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.x61;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.un */
public final class C14772un extends C14130nt {

    /* renamed from: a */
    final /* synthetic */ x61 f40805a;

    /* renamed from: b */
    final /* synthetic */ C13133ft f40806b;

    /* renamed from: c */
    final /* synthetic */ j50 f40807c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C14772un(C13513jm jmVar, x61 x61, C13133ft ftVar, j50 j50) {
        super(jmVar);
        this.f40805a = x61;
        this.f40806b = ftVar;
        this.f40807c = j50;
    }

    /* renamed from: a */
    public void mo67624a(C15163xd xdVar) {
        x61.C15153c cVar;
        x61.C15151a aVar;
        x61.C15152b bVar;
        Intrinsics.checkNotNullParameter(xdVar, "cachedBitmap");
        x61 x61 = this.f40805a;
        Bitmap a = xdVar.mo70883a();
        Intrinsics.checkNotNullExpressionValue(a, "cachedBitmap.bitmap");
        x61.mo70832a(a);
        this.f40805a.setAlpha((int) (this.f40806b.f33723a.mo66924a(this.f40807c).doubleValue() * ((double) 255)));
        x61 x612 = this.f40805a;
        C14709tt a2 = this.f40806b.f33728f.mo66924a(this.f40807c);
        Intrinsics.checkNotNullParameter(a2, "<this>");
        int ordinal = a2.ordinal();
        if (ordinal == 0) {
            cVar = x61.C15153c.FILL;
        } else if (ordinal != 2) {
            cVar = x61.C15153c.NO_SCALE;
        } else {
            cVar = x61.C15153c.FIT;
        }
        x612.mo70835a(cVar);
        x61 x613 = this.f40805a;
        C13215gn a3 = this.f40806b.f33724b.mo66924a(this.f40807c);
        Intrinsics.checkNotNullParameter(a3, "<this>");
        int ordinal2 = a3.ordinal();
        if (ordinal2 == 1) {
            aVar = x61.C15151a.CENTER;
        } else if (ordinal2 != 2) {
            aVar = x61.C15151a.LEFT;
        } else {
            aVar = x61.C15151a.RIGHT;
        }
        x613.mo70833a(aVar);
        x61 x614 = this.f40805a;
        C13332hn a4 = this.f40806b.f33725c.mo66924a(this.f40807c);
        Intrinsics.checkNotNullParameter(a4, "<this>");
        int ordinal3 = a4.ordinal();
        if (ordinal3 == 1) {
            bVar = x61.C15152b.CENTER;
        } else if (ordinal3 != 2) {
            bVar = x61.C15152b.TOP;
        } else {
            bVar = x61.C15152b.BOTTOM;
        }
        x614.mo70834a(bVar);
    }
}
