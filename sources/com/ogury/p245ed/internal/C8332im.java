package com.ogury.p245ed.internal;

import android.webkit.WebView;
import java.util.regex.Pattern;

/* renamed from: com.ogury.ed.internal.im */
public final class C8332im implements C8337iq {

    /* renamed from: a */
    private final C8362jh f21528a;

    /* renamed from: b */
    private final C8185eb f21529b;

    /* renamed from: c */
    private C8331il f21530c;

    /* renamed from: d */
    private final Pattern f21531d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f21532e;

    public C8332im(C8362jh jhVar, C8185eb ebVar) {
        C8467mq.m23881b(jhVar, "webView");
        C8467mq.m23881b(ebVar, "ad");
        this.f21528a = jhVar;
        this.f21529b = ebVar;
        this.f21531d = Pattern.compile(ebVar.mo53377t());
        m23527c();
    }

    /* renamed from: com.ogury.ed.internal.im$a */
    public static final class C8333a extends C8325ih {

        /* renamed from: a */
        final /* synthetic */ C8332im f21533a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8333a(C8332im imVar, Pattern pattern) {
            super(pattern);
            this.f21533a = imVar;
            C8467mq.m23878a((Object) pattern, "whitelistPattern");
        }

        /* renamed from: a */
        public final void mo53747a() {
            this.f21533a.m23528d();
        }

        /* renamed from: b */
        public final void mo53676b(WebView webView, String str) {
            C8467mq.m23881b(webView, "webView");
            C8467mq.m23881b(str, "url");
            this.f21533a.f21532e = true;
            this.f21533a.m23528d();
        }

        /* renamed from: b */
        public final void mo53748b() {
            this.f21533a.m23528d();
        }
    }

    /* renamed from: c */
    private final void m23527c() {
        this.f21528a.setClientAdapter(new C8333a(this, this.f21531d));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m23528d() {
        C8331il ilVar = this.f21530c;
        if (ilVar != null) {
            ilVar.mo53749a();
        }
        m23529e();
        C8268gr.m23220f(this.f21528a);
    }

    /* renamed from: e */
    private final void m23529e() {
        C8362jh jhVar = this.f21528a;
        Pattern pattern = this.f21531d;
        C8467mq.m23878a((Object) pattern, "whitelistPattern");
        jhVar.setClientAdapter(new C8325ih(pattern));
    }

    /* renamed from: a */
    public final void mo53744a(C8331il ilVar) {
        C8467mq.m23881b(ilVar, "loadCallback");
        this.f21530c = ilVar;
        if (this.f21529b.mo53376s()) {
            this.f21528a.getSettings().setJavaScriptEnabled(false);
        }
        this.f21528a.loadUrl(this.f21529b.mo53375r());
    }

    /* renamed from: b */
    public final void mo53746b() {
        this.f21530c = null;
        m23529e();
        C8268gr.m23220f(this.f21528a);
    }

    /* renamed from: a */
    public final boolean mo53745a() {
        return this.f21532e;
    }
}
