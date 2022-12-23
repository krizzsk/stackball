package com.yandex.mobile.ads.core.identifiers.p266ad.gms.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.yandex.mobile.ads.impl.C14743u6;
import com.yandex.mobile.ads.impl.s61;

/* renamed from: com.yandex.mobile.ads.core.identifiers.ad.gms.service.d */
public class C12142d {

    /* renamed from: a */
    private final Context f29442a;

    /* renamed from: b */
    private final s61 f29443b = new s61();

    /* renamed from: c */
    private final C12143e f29444c = new C12143e();

    /* renamed from: d */
    private final C12144f f29445d = new C12144f();

    public C12142d(Context context) {
        this.f29442a = context.getApplicationContext();
    }

    /* renamed from: a */
    public C14743u6 mo64723a() {
        ResolveInfo resolveInfo;
        this.f29445d.getClass();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        s61 s61 = this.f29443b;
        Context context = this.f29442a;
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
            C12141c cVar = new C12141c();
            if (!this.f29442a.bindService(intent, cVar, 1)) {
                return null;
            }
            C14743u6 a = this.f29444c.mo64724a(cVar);
            this.f29442a.unbindService(cVar);
            return a;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
