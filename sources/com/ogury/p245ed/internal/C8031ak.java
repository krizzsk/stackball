package com.ogury.p245ed.internal;

import android.webkit.WebView;

/* renamed from: com.ogury.ed.internal.ak */
public final class C8031ak {

    /* renamed from: a */
    public static final C8032a f20887a = new C8032a((byte) 0);

    /* renamed from: b */
    private final C8373js f20888b;

    public C8031ak(C8373js jsVar) {
        C8467mq.m23881b(jsVar, "omidTracker");
        this.f20888b = jsVar;
    }

    /* renamed from: com.ogury.ed.internal.ak$a */
    public static final class C8032a {
        public /* synthetic */ C8032a(byte b) {
            this();
        }

        private C8032a() {
        }

        /* renamed from: a */
        public static C8031ak m22385a() {
            return new C8031ak(new C8373js());
        }
    }

    /* renamed from: a */
    public final void mo53193a(C8232fm fmVar, C8185eb ebVar, WebView webView) {
        C8467mq.m23881b(fmVar, "profig");
        C8467mq.m23881b(ebVar, "ad");
        C8467mq.m23881b(webView, "webView");
        if (fmVar.mo53536c() && ebVar.mo53370o()) {
            this.f20888b.mo53850a(ebVar.mo53372p(), webView);
        }
    }

    /* renamed from: a */
    public final void mo53192a() {
        this.f20888b.mo53849a();
    }
}
