package com.yandex.mobile.ads.base;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.yandex.mobile.ads.impl.C13278h5;
import com.yandex.mobile.ads.impl.C13378i5;
import com.yandex.mobile.ads.impl.lo1;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.base.r */
public abstract class C12123r extends WebView {

    /* renamed from: a */
    Map<String, Object> f29243a;

    protected C12123r(Context context) {
        super(context);
        m31472g();
    }

    /* renamed from: g */
    private void m31472g() {
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        if (C13378i5.m37280a(11)) {
            settings.setAllowContentAccess(false);
            if (C13378i5.m37280a(16)) {
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            }
        }
    }

    /* renamed from: a */
    public Object mo64614a(String str) {
        Map<String, Object> map = this.f29243a;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public void addJavascriptInterface(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
        if (this.f29243a == null) {
            this.f29243a = new HashMap();
        }
        this.f29243a.put(str, obj);
    }

    /* renamed from: b */
    public void mo64616b(String str) {
        loadDataWithBaseURL("https://yandex.ru", str + mo64386c() + "<body style='margin:0; padding:0;'>", WebRequest.CONTENT_TYPE_HTML, "UTF-8", (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo64386c() {
        return "";
    }

    /* renamed from: d */
    public void mo64617d() {
        lo1.m38877f(this);
        Map<String, Object> map = this.f29243a;
        if (map != null) {
            for (String removeJavascriptInterface : map.keySet()) {
                removeJavascriptInterface(removeJavascriptInterface);
            }
            this.f29243a.clear();
        }
        destroy();
        getClass().toString();
    }

    /* renamed from: e */
    public void mo64618e() {
        int i = C13278h5.f34274b;
        try {
            WebView.class.getDeclaredMethod("onPause", new Class[0]).invoke(this, new Object[0]);
        } catch (Exception unused) {
        }
        getClass().toString();
    }

    /* renamed from: f */
    public void mo64619f() {
        int i = C13278h5.f34274b;
        try {
            WebView.class.getDeclaredMethod("onResume", new Class[0]).invoke(this, new Object[0]);
        } catch (Exception unused) {
        }
        getClass().toString();
    }

    public void removeJavascriptInterface(String str) {
        if (C13378i5.m37280a(11)) {
            super.removeJavascriptInterface(str);
        }
    }
}
