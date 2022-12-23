package com.yandex.mobile.ads.core.identifiers.p266ad.huawei;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.yandex.mobile.ads.impl.C12363a7;
import com.yandex.mobile.ads.impl.C14743u6;
import com.yandex.mobile.ads.impl.s61;

/* renamed from: com.yandex.mobile.ads.core.identifiers.ad.huawei.a */
public class C12145a implements C12363a7 {

    /* renamed from: a */
    private final Context f29449a;

    /* renamed from: b */
    private final s61 f29450b = new s61();

    /* renamed from: c */
    private final C12147c f29451c = new C12147c();

    /* renamed from: d */
    private final C12148d f29452d = new C12148d();

    public C12145a(Context context) {
        this.f29449a = context.getApplicationContext();
    }

    /* renamed from: a */
    public C14743u6 mo64730a() {
        ResolveInfo resolveInfo;
        this.f29452d.getClass();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        s61 s61 = this.f29450b;
        Context context = this.f29449a;
        s61.getClass();
        try {
            resolveInfo = context.getPackageManager().resolveService(intent, 0);
        } catch (Throwable unused) {
            resolveInfo = null;
        }
        if (resolveInfo == null) {
            return null;
        }
        try {
            C12146b bVar = new C12146b();
            if (!this.f29449a.bindService(intent, bVar, 1)) {
                return null;
            }
            C14743u6 a = this.f29451c.mo64734a(bVar);
            this.f29449a.unbindService(bVar);
            return a;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
