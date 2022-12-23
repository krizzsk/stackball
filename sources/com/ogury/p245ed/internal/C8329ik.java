package com.ogury.p245ed.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;

/* renamed from: com.ogury.ed.internal.ik */
public final class C8329ik implements C8337iq {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8362jh f21520a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8185eb f21521b;

    /* renamed from: c */
    private final C8320id f21522c;

    /* renamed from: d */
    private final C8324ig f21523d;

    /* renamed from: e */
    private C8331il f21524e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f21525f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f21526g;

    public C8329ik(C8362jh jhVar, C8185eb ebVar, C8320id idVar, C8324ig igVar) {
        C8467mq.m23881b(jhVar, "webView");
        C8467mq.m23881b(ebVar, "ad");
        C8467mq.m23881b(idVar, "webViewCache");
        C8467mq.m23881b(igVar, "presageAdGateway");
        this.f21520a = jhVar;
        this.f21521b = ebVar;
        this.f21522c = idVar;
        this.f21523d = igVar;
        m23504c();
    }

    /* renamed from: com.ogury.ed.internal.ik$a */
    public static final class C8330a extends C8363ji {

        /* renamed from: a */
        final /* synthetic */ C8329ik f21527a;

        C8330a(C8329ik ikVar) {
            this.f21527a = ikVar;
        }

        /* renamed from: a */
        public final void mo53747a() {
            C8329ik.m23503b(this.f21527a.f21520a, this.f21527a.f21521b);
            this.f21527a.m23506d();
        }

        /* renamed from: b */
        public final void mo53676b(WebView webView, String str) {
            C8467mq.m23881b(webView, "webView");
            C8467mq.m23881b(str, "url");
            this.f21527a.f21525f = true;
            this.f21527a.m23512g();
        }

        /* renamed from: b */
        public final void mo53748b() {
            if (!this.f21527a.f21525f) {
                this.f21527a.m23508e();
            }
        }

        /* renamed from: a */
        public final void mo53195a(WebView webView) {
            C8467mq.m23881b(webView, "webView");
            this.f21527a.f21526g = true;
            this.f21527a.m23512g();
        }
    }

    /* renamed from: c */
    private final void m23504c() {
        this.f21520a.setClientAdapter(new C8330a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m23506d() {
        C8331il ilVar = this.f21524e;
        if (ilVar != null) {
            ilVar.mo53750a(this.f21521b);
        }
        m23510f();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m23508e() {
        C8147di diVar = C8147di.f21106a;
        C8147di.m22716a((C8146dh) new C8157dl("loaded_error", this.f21521b));
        C8331il ilVar = this.f21524e;
        if (ilVar != null) {
            ilVar.mo53751b();
        }
        m23510f();
    }

    /* renamed from: f */
    private final void m23510f() {
        this.f21520a.setWebViewClient((WebViewClient) null);
        this.f21520a.setClientAdapter((C8363ji) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m23512g() {
        if (this.f21526g && this.f21525f) {
            C8147di diVar = C8147di.f21106a;
            C8147di.m22716a((C8146dh) new C8157dl("loaded", this.f21521b));
            C8320id.m23473a(new C8319ic(new WeakReference(this.f21523d), this.f21520a, this.f21521b));
            C8331il ilVar = this.f21524e;
            if (ilVar != null) {
                ilVar.mo53749a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m23503b(WebView webView, C8185eb ebVar) {
        C8268gr.m23220f(webView);
        C8147di diVar = C8147di.f21106a;
        C8147di.m22716a((C8146dh) new C8157dl("loaded_error", ebVar));
    }

    /* renamed from: a */
    public final void mo53744a(C8331il ilVar) {
        C8467mq.m23881b(ilVar, "loadCallback");
        this.f21524e = ilVar;
        C8365jk.m23713a(this.f21520a, this.f21521b);
    }

    /* renamed from: a */
    public final boolean mo53745a() {
        return this.f21525f;
    }

    /* renamed from: b */
    public final void mo53746b() {
        this.f21524e = null;
        m23510f();
        C8268gr.m23220f(this.f21520a);
    }
}
