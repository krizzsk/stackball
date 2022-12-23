package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.webkit.WebSettings;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.cb0;
import java.io.File;

public class n80 extends cb0 {

    /* renamed from: n */
    private final fq1 f37663n = new fq1(this);

    public n80(Context context, AdResponse adResponse, C14645t1 t1Var) {
        super(context, adResponse, t1Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64384a(Context context, C14645t1 t1Var) {
        addJavascriptInterface(new cb0.C12720a(context), "AdPerformActionsJSI");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo66361b(Context context) {
        super.mo66361b(context);
        WebSettings settings = getSettings();
        settings.setAppCachePath(new File(getContext().getCacheDir(), "com.yandex.mobile.ads.cache").getAbsolutePath());
        settings.setDatabasePath(getContext().getDatabasePath("com.yandex.mobile.ads.db").getAbsolutePath());
        settings.setAppCacheMaxSize(8388608);
        settings.setAppCacheEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setCacheMode(-1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo64387h() {
        this.f37663n.mo67066a(mo66245i());
    }
}
