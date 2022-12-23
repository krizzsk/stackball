package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

class uo0 {

    /* renamed from: a */
    private final cy0 f40832a;

    uo0(cy0 cy0) {
        this.f40832a = cy0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70384a() {
        m42766a("notifyReadyEvent();");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo70388b(String str) {
        this.f40832a.mo64616b(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70386a(fp0 fp0, String str) {
        m42766a("notifyErrorEvent(" + JSONObject.quote(fp0.mo67063a()) + ", " + JSONObject.quote(str) + ")");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70385a(fp0 fp0) {
        m42766a("nativeCallComplete(" + JSONObject.quote(fp0.mo67063a()) + ")");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70387a(vh0... vh0Arr) {
        if (vh0Arr.length > 0) {
            StringBuilder sb = new StringBuilder("fireChangeEvent({");
            int length = vh0Arr.length;
            int i = 0;
            String str = "";
            while (i < length) {
                vh0 vh0 = vh0Arr[i];
                sb.append(str);
                sb.append(vh0.mo66428a());
                i++;
                str = ", ";
            }
            sb.append("})");
            m42766a(sb.toString());
        }
    }

    /* renamed from: a */
    private void m42766a(String str) {
        String format = String.format("window.mraidbridge.%s", new Object[]{str});
        cy0 cy0 = this.f40832a;
        cy0.loadUrl("javascript: " + format);
    }
}
