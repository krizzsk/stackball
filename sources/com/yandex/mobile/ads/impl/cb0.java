package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.yandex.mobile.ads.base.AdResponse;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class cb0 extends cy0 implements kb0 {

    /* renamed from: k */
    protected final AdResponse f31869k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final sy0 f31870l = new sy0(this);

    /* renamed from: m */
    private Map<String, String> f31871m;

    /* renamed from: com.yandex.mobile.ads.impl.cb0$a */
    public class C12720a {
        public C12720a(Context context) {
            new WeakReference(context);
        }

        @JavascriptInterface
        public String getBannerInfo() {
            return "{\"isDelicate\": false}";
        }

        @JavascriptInterface
        public void onAdRender(int i, String str) {
            cb0.this.f31870l.mo70071a(i, str);
        }
    }

    protected cb0(Context context, AdResponse adResponse, C14645t1 t1Var) {
        super(context);
        this.f31869k = adResponse;
        mo64384a(context, t1Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo64384a(Context context, C14645t1 t1Var);

    /* renamed from: b */
    public void mo65845b() {
        if (mo66246j()) {
            this.f31870l.mo70073b();
        } else {
            super.mo65845b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo64386c() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.mo64386c());
        sb.append(mo66246j() ? eq1.f33044a : "");
        return sb.toString();
    }

    /* renamed from: d */
    public void mo64617d() {
        this.f31870l.mo70070a();
        super.mo64617d();
    }

    /* renamed from: i */
    public Map<String, String> mo66245i() {
        Map<String, String> map = this.f31871m;
        return map != null ? map : Collections.emptyMap();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo66246j() {
        return "partner-code".equals(this.f31869k.mo64429i());
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        Object a = mo64614a("AdPerformActionsJSI");
        if (a != null && (a instanceof C12720a)) {
            C12720a aVar = (C12720a) a;
        }
        super.onConfigurationChanged(configuration);
    }

    public void setHtmlWebViewListener(jb0 jb0) {
        super.setHtmlWebViewListener(jb0);
        this.f31870l.mo70072a(jb0);
    }

    /* renamed from: a */
    public void mo66244a(int i, String str) {
        mo64385b(i, str);
        super.mo65845b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo64385b(int i, String str) {
        if (!TextUtils.isEmpty(str) && !"undefined".equals(str)) {
            HashMap hashMap = new HashMap();
            this.f31871m = hashMap;
            hashMap.put("test-tag", str);
        }
    }
}
