package com.yandex.mobile.ads.core.identifiers.p266ad.huawei;

import com.yandex.mobile.ads.impl.C14743u6;
import com.yandex.mobile.ads.impl.C14866v6;

/* renamed from: com.yandex.mobile.ads.core.identifiers.ad.huawei.c */
class C12147c {

    /* renamed from: a */
    private final C14866v6 f29454a = new C14866v6();

    C12147c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C14743u6 mo64734a(C12146b bVar) {
        try {
            OpenDeviceIdentifierService a = bVar.mo64731a();
            if (a != null) {
                return this.f29454a.mo70450a(a.getOaid(), Boolean.valueOf(a.isOaidTrackLimited()));
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
