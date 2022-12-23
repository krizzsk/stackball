package com.yandex.metrica.impl.p265ob;

import android.location.LocationManager;

/* renamed from: com.yandex.metrica.impl.ob.kd */
public class C11425kd {

    /* renamed from: a */
    public final C12025zc f27389a;

    /* renamed from: b */
    public final LocationManager f27390b;

    /* renamed from: c */
    public final C10807Uc f27391c;

    C11425kd(C12025zc zcVar, C10675Qi qi, C10807Uc uc, LocationManager locationManager, C10106Ad ad, C11982yc ycVar) {
        this.f27389a = zcVar;
        this.f27391c = uc;
        this.f27390b = locationManager;
    }

    /* renamed from: a */
    public static C11425kd m29478a(C11848vd vdVar, C10106Ad ad, C11982yc ycVar, LocationManager locationManager) {
        return new C11425kd(vdVar.f28478a, vdVar.f28479b, vdVar.f28480c, locationManager, ad, ycVar);
    }
}
