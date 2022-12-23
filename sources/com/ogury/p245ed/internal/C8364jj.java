package com.ogury.p245ed.internal;

import android.graphics.Bitmap;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;

/* renamed from: com.ogury.ed.internal.jj */
public final class C8364jj extends C8292hk {

    /* renamed from: b */
    private final C8362jh f21614b;

    /* renamed from: c */
    private C8363ji f21615c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8364jj(C8362jh jhVar) {
        super((byte) 0);
        C8467mq.m23881b(jhVar, "mraidWebView");
        this.f21614b = jhVar;
    }

    /* renamed from: a */
    public final void mo53840a(C8363ji jiVar) {
        this.f21615c = jiVar;
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C8467mq.m23881b(webView, "view");
        C8467mq.m23881b(str, "url");
        C8363ji jiVar = this.f21615c;
        if (jiVar != null) {
            jiVar.mo53675a(webView, str);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        C8467mq.m23881b(webView, "view");
        C8467mq.m23881b(str, "url");
        C8363ji jiVar = this.f21615c;
        if (jiVar != null) {
            jiVar.mo53676b(webView, str);
        }
    }

    /* renamed from: a */
    public final void mo53614a(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder("onReceivedError ");
        sb.append(i);
        sb.append(" description ");
        sb.append(str);
        sb.append(" ulr ");
        sb.append(str2);
        C8363ji jiVar = this.f21615c;
        if (jiVar != null) {
            jiVar.mo53748b();
        }
    }

    /* renamed from: b */
    public final boolean mo53615b(WebView webView, String str) {
        C8467mq.m23881b(webView, "view");
        C8467mq.m23881b(str, "url");
        this.f21614b.mo53804b(str);
        C8363ji jiVar = this.f21615c;
        Boolean valueOf = jiVar == null ? null : Boolean.valueOf(jiVar.mo53678d(webView, str));
        if (valueOf == null) {
            return super.mo53615b(webView, str);
        }
        return valueOf.booleanValue();
    }

    /* renamed from: a */
    public final void mo53660a(String str) {
        C8467mq.m23881b(str, "url");
        this.f21614b.mo53802a(str);
    }

    /* renamed from: a */
    public final WebResourceResponse mo53613a(WebView webView, String str) {
        C8467mq.m23881b(webView, "view");
        C8467mq.m23881b(str, "url");
        C8363ji jiVar = this.f21615c;
        if (jiVar != null) {
            jiVar.mo53677c(webView, str);
        }
        C8363ji jiVar2 = this.f21615c;
        boolean z = true;
        if (jiVar2 == null || !jiVar2.mo53739a(str)) {
            z = false;
        }
        if (z) {
            return m23705b();
        }
        return super.mo53613a(webView, str);
    }

    /* renamed from: a */
    public final void mo53658a() {
        C8363ji jiVar = this.f21615c;
        if (jiVar != null) {
            jiVar.mo53748b();
        }
    }

    /* renamed from: b */
    private static WebResourceResponse m23705b() {
        byte[] bytes = "".getBytes(C8506nz.f21713a);
        C8467mq.m23878a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        return new WebResourceResponse("text/image", "UTF-8", new ByteArrayInputStream(bytes));
    }
}
