package com.yandex.mobile.ads.core.identifiers.p266ad.gms.service;

import android.os.IBinder;
import android.os.IInterface;
import com.yandex.mobile.ads.impl.C14743u6;
import com.yandex.mobile.ads.impl.C14866v6;

/* renamed from: com.yandex.mobile.ads.core.identifiers.ad.gms.service.e */
class C12143e {

    /* renamed from: a */
    private final C14866v6 f29446a = new C14866v6();

    /* renamed from: b */
    private final C12140b f29447b = new C12140b();

    C12143e() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C14743u6 mo64724a(C12141c cVar) {
        C12139a aVar;
        try {
            IBinder a = cVar.mo64720a();
            if (a != null) {
                this.f29447b.getClass();
                IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                if (queryLocalInterface instanceof C12139a) {
                    aVar = (C12139a) queryLocalInterface;
                } else {
                    aVar = new GmsServiceAdvertisingInfoReader(a);
                }
                return this.f29446a.mo70450a(aVar.readAdvertisingId(), aVar.readAdTrackingLimited());
            }
        } catch (InterruptedException unused) {
        }
        return null;
    }
}
