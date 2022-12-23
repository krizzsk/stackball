package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.common.MobileAds;

public class i71 implements t41<d71> {

    /* renamed from: a */
    private final Context f34759a;

    /* renamed from: b */
    private final e71 f34760b = new e71();

    /* renamed from: c */
    private final o71 f34761c = new o71();

    /* renamed from: d */
    private final C13857lh f34762d = new C13857lh();

    /* renamed from: e */
    private final i51<d71> f34763e = new k71();

    public i71(Context context) {
        this.f34759a = context.getApplicationContext();
    }

    /* renamed from: a */
    public Object mo67748a(fv0 fv0) {
        return this.f34763e.mo66870a(fv0);
    }

    /* renamed from: a */
    public boolean mo67749a() {
        d71 a = l71.m38631c().mo68362a(this.f34759a);
        if (a != null && !this.f34760b.mo66772a(a)) {
            this.f34761c.getClass();
            if (!(!MobileAds.getLibraryVersion().equals(a.mo66462j()))) {
                this.f34762d.getClass();
                if (!(l71.m38631c().mo68372g() != a.mo66447L())) {
                    this.f34762d.getClass();
                    if (Boolean.valueOf(l71.m38631c().mo68371f()).booleanValue() != a.mo66436A()) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
