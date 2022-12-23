package com.ogury.p245ed.internal;

import android.webkit.WebSettings;
import android.webkit.WebView;

/* renamed from: com.ogury.ed.internal.al */
public final class C8033al {

    /* renamed from: a */
    public static final C8034a f20889a = new C8034a((byte) 0);

    /* renamed from: b */
    private final C8320id f20890b;

    /* renamed from: c */
    private final C8291hj f20891c;

    /* renamed from: d */
    private final C8345iv f20892d;

    /* renamed from: e */
    private C8362jh f20893e;

    public /* synthetic */ C8033al(C8320id idVar, C8291hj hjVar, C8345iv ivVar, byte b) {
        this(idVar, hjVar, ivVar);
    }

    private C8033al(C8320id idVar, C8291hj hjVar, C8345iv ivVar) {
        this.f20890b = idVar;
        this.f20891c = hjVar;
        this.f20892d = ivVar;
    }

    /* renamed from: com.ogury.ed.internal.al$a */
    public static final class C8034a {
        public /* synthetic */ C8034a(byte b) {
            this();
        }

        private C8034a() {
        }

        /* renamed from: a */
        public static C8033al m22392a(C8297ho hoVar, C8345iv ivVar) {
            C8467mq.m23881b(hoVar, "multiWebViewBrowser");
            C8467mq.m23881b(ivVar, "foregroundHandlerFactory");
            return new C8033al(C8320id.f21501a, hoVar.mo53663a(), ivVar, (byte) 0);
        }
    }

    /* renamed from: a */
    public final C8362jh mo53194a(C8185eb ebVar) {
        C8467mq.m23881b(ebVar, "ad");
        C8362jh b = m22389b(ebVar);
        if (b == null) {
            return null;
        }
        this.f20893e = b;
        m22386a();
        m22388a(this.f20893e);
        m22390b();
        return this.f20893e;
    }

    /* renamed from: b */
    private static C8362jh m22389b(C8185eb ebVar) {
        return C8320id.m23476b(ebVar.mo53330a());
    }

    /* renamed from: a */
    private final void m22386a() {
        C8362jh jhVar = this.f20893e;
        if (jhVar != null) {
            jhVar.setMraidUrlHandler(new C8343iu(new C8291hj[]{this.f20891c, this.f20892d.mo53772a(jhVar)}));
            WebSettings settings = jhVar.getSettings();
            if (settings != null) {
                settings.setJavaScriptEnabled(true);
            }
            WebView webView = jhVar;
            C8268gr.m23217c(webView);
            C8268gr.m23216b(webView);
        }
    }

    /* renamed from: com.ogury.ed.internal.al$b */
    public static final class C8035b extends C8363ji {

        /* renamed from: a */
        final /* synthetic */ C8033al f20894a;

        C8035b(C8033al alVar) {
            this.f20894a = alVar;
        }

        /* renamed from: a */
        public final void mo53195a(WebView webView) {
            C8467mq.m23881b(webView, "webView");
            this.f20894a.m22390b();
        }
    }

    /* renamed from: a */
    private final void m22388a(C8362jh jhVar) {
        if (jhVar != null) {
            jhVar.setClientAdapter(new C8035b(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m22390b() {
        C8362jh jhVar = this.f20893e;
        if (jhVar != null) {
            jhVar.mo53806c();
        }
    }
}
