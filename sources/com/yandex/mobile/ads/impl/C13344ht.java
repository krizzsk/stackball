package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.view.animation.Interpolator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.ht */
public final class C13344ht extends C14130nt {

    /* renamed from: a */
    final /* synthetic */ C14933vt f34547a;

    /* renamed from: b */
    final /* synthetic */ Uri f34548b;

    /* renamed from: c */
    final /* synthetic */ C13444it f34549c;

    /* renamed from: d */
    final /* synthetic */ C12997et f34550d;

    /* renamed from: e */
    final /* synthetic */ j50 f34551e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C13344ht(C13513jm jmVar, C14933vt vtVar, Uri uri, C13444it itVar, C12997et etVar, j50 j50) {
        super(jmVar);
        this.f34547a = vtVar;
        this.f34548b = uri;
        this.f34549c = itVar;
        this.f34550d = etVar;
        this.f34551e = j50;
    }

    /* renamed from: a */
    public void mo67624a(C15163xd xdVar) {
        Intrinsics.checkNotNullParameter(xdVar, "cachedBitmap");
        this.f34547a.setImageUrl$div_release(this.f34548b);
        this.f34547a.setImage(xdVar.mo70883a());
        C13444it itVar = this.f34549c;
        C14933vt vtVar = this.f34547a;
        C12997et etVar = this.f34550d;
        j50 j50 = this.f34551e;
        bd0 d = xdVar.mo70886d();
        itVar.getClass();
        vtVar.animate().cancel();
        C14777ur urVar = etVar.f33122h;
        float doubleValue = (float) etVar.mo66150h().mo66924a(j50).doubleValue();
        if (urVar == null || d == bd0.MEMORY) {
            vtVar.setAlpha(doubleValue);
        } else {
            long intValue = (long) urVar.mo70392j().mo66924a(j50).intValue();
            Interpolator a = t00.m42195a(urVar.mo70393k().mo66924a(j50));
            vtVar.setAlpha((float) urVar.f40858a.mo66924a(j50).doubleValue());
            vtVar.animate().alpha(doubleValue).setDuration(intValue).setInterpolator(a).setStartDelay((long) urVar.mo70394l().mo66924a(j50).intValue());
        }
        this.f34547a.mo68443g();
        this.f34547a.invalidate();
    }
}
