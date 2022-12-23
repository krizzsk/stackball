package com.yandex.metrica;

import android.webkit.JavascriptInterface;
import com.yandex.metrica.impl.p265ob.C11851vg;

public class AppMetricaInitializerJsInterface {

    /* renamed from: a */
    private final C11851vg f24005a;

    public AppMetricaInitializerJsInterface(C11851vg vgVar) {
        this.f24005a = vgVar;
    }

    @JavascriptInterface
    public void init(String str) {
        this.f24005a.mo63873c(str);
    }
}
