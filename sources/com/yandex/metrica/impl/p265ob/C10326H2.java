package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import com.appsflyer.share.Constants;
import com.yandex.metrica.MetricaService;

/* renamed from: com.yandex.metrica.impl.ob.H2 */
public final class C10326H2 {

    /* renamed from: a */
    private static final C10898Wn f24808a = new C10898Wn();

    /* renamed from: a */
    public static Intent m26427a(Context context) {
        return new Intent(context, MetricaService.class).setAction("com.yandex.metrica.IMetricaService").setData(new Uri.Builder().scheme("metrica").authority(context.getPackageName()).build()).addFlags(32);
    }

    /* renamed from: b */
    public static Intent m26428b(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Intent a = m26427a(context);
        String str = null;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            applicationInfo = null;
        }
        try {
            bundle = applicationInfo.metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
        } catch (Throwable unused2) {
            bundle = new Bundle();
        }
        Intent putExtras = a.putExtras(bundle);
        putExtras.setData(putExtras.getData().buildUpon().path("client").appendQueryParameter(Constants.URL_MEDIA_SOURCE, String.valueOf(Process.myPid())).appendQueryParameter("psid", C10797U3.f25906c).build());
        C11900w2 a2 = C12013z2.m31034a(context).mo64181a();
        if (a2 != null) {
            str = C11993ym.m30963a(a2);
        }
        putExtras.putExtra("screen_size", str);
        return putExtras.setPackage(context.getApplicationContext().getPackageName());
    }
}
