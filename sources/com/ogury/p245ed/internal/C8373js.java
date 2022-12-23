package com.ogury.p245ed.internal;

import android.webkit.WebView;

/* renamed from: com.ogury.ed.internal.js */
public final class C8373js {

    /* renamed from: a */
    private final C8370jp f21624a;

    /* renamed from: b */
    private C8371jq f21625b;

    public /* synthetic */ C8373js() {
        this(C8370jp.f21621a);
    }

    private C8373js(C8370jp jpVar) {
        C8467mq.m23881b(jpVar, "omidSdk");
        this.f21624a = jpVar;
    }

    /* renamed from: a */
    public final void mo53850a(boolean z, WebView webView) {
        C8467mq.m23881b(webView, "webView");
        if (C8370jp.m23726a()) {
            C8371jq b = C8370jp.m23727b();
            this.f21625b = b;
            if (b != null) {
                b.mo53848a(webView, z);
            }
        }
    }

    /* renamed from: a */
    public final void mo53849a() {
        C8371jq jqVar;
        if (C8370jp.m23726a() && (jqVar = this.f21625b) != null) {
            jqVar.mo53847a();
        }
    }
}
