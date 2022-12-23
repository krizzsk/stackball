package com.yandex.metrica;

import android.webkit.JavascriptInterface;
import com.yandex.metrica.impl.p265ob.C11851vg;

public class AppMetricaJsInterface {

    /* renamed from: a */
    private final C11851vg f24006a;

    public AppMetricaJsInterface(C11851vg vgVar) {
        this.f24006a = vgVar;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.f24006a.mo63874c(str, str2);
    }
}
