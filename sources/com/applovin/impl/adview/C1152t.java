package com.applovin.impl.adview;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p025b.C1369c;

/* renamed from: com.applovin.impl.adview.t */
public class C1152t extends C1085g {

    /* renamed from: a */
    private static C1152t f2125a;

    public C1152t(C1153u uVar, Context context) {
        super(context);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setWebViewClient(uVar);
        setWebChromeClient(new WebChromeClient());
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
    }

    /* renamed from: a */
    public static C1152t m1792a(C1469j jVar, C1153u uVar, Context context) {
        if (!((Boolean) jVar.mo13088a(C1369c.f3092eZ)).booleanValue()) {
            return new C1152t(uVar, context);
        }
        C1152t tVar = f2125a;
        if (tVar == null) {
            f2125a = new C1152t(uVar, context);
        } else {
            tVar.loadUrl("about:blank");
            f2125a.clearHistory();
            f2125a.setWebViewClient(uVar);
        }
        return f2125a;
    }

    /* renamed from: a */
    public void mo12067a(String str) {
        loadDataWithBaseURL("/", str, WebRequest.CONTENT_TYPE_HTML, (String) null, "");
    }
}
