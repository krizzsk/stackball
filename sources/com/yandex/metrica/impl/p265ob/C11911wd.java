package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.location.LocationManager;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.yandex.metrica.impl.ob.wd */
public class C11911wd {

    /* renamed from: a */
    private final LocationManager f28647a;

    /* renamed from: b */
    private final C11065b3 f28648b;

    /* renamed from: c */
    private final C11991yk f28649c = C10619P0.m27164i().mo61895w();

    public C11911wd(Context context) {
        this.f28647a = (LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        this.f28648b = C11065b3.m28563a(context);
    }

    /* renamed from: a */
    public LocationManager mo64028a() {
        return this.f28647a;
    }

    /* renamed from: b */
    public C11991yk mo64029b() {
        return this.f28649c;
    }

    /* renamed from: c */
    public C11065b3 mo64030c() {
        return this.f28648b;
    }
}
