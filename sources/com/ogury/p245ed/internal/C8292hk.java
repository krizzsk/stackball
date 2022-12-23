package com.ogury.p245ed.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;

/* renamed from: com.ogury.ed.internal.hk */
public abstract class C8292hk extends C8267gq {

    /* renamed from: a */
    public static final C8293a f21412a = new C8293a((byte) 0);

    /* renamed from: e */
    private static final WebResourceResponse f21413e;

    /* renamed from: b */
    private C8195ek f21414b;

    /* renamed from: c */
    private final Handler f21415c;

    /* renamed from: d */
    private C8289hh f21416d;

    /* renamed from: a */
    public abstract void mo53658a();

    /* renamed from: a */
    public abstract void mo53660a(String str);

    /* renamed from: b */
    public boolean mo53615b(WebView webView, String str) {
        C8467mq.m23881b(webView, "view");
        C8467mq.m23881b(str, "url");
        return true;
    }

    private C8292hk() {
        this.f21414b = null;
        this.f21415c = new Handler(Looper.getMainLooper());
        this.f21416d = C8289hh.f21409a;
    }

    public /* synthetic */ C8292hk(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo53659a(C8195ek ekVar) {
        this.f21414b = ekVar;
    }

    /* renamed from: com.ogury.ed.internal.hk$a */
    public static final class C8293a {
        public /* synthetic */ C8293a(byte b) {
            this();
        }

        private C8293a() {
        }
    }

    static {
        byte[] bytes = "".getBytes(C8506nz.f21713a);
        C8467mq.m23878a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        f21413e = new WebResourceResponse("text/image", "UTF-8", new ByteArrayInputStream(bytes));
    }

    /* renamed from: a */
    public WebResourceResponse mo53613a(WebView webView, String str) {
        C8467mq.m23881b(webView, "view");
        C8467mq.m23881b(str, "url");
        if (C8294hl.m23327a(str)) {
            this.f21415c.post(new Runnable(str, this) {
                public final /* synthetic */ String f$0;
                public final /* synthetic */ C8292hk f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    C8292hk.m23320a(this.f$0, this.f$1);
                }
            });
            return f21413e;
        } else if (m23321b(str)) {
            return m23318a(webView);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m23320a(String str, C8292hk hkVar) {
        C8467mq.m23881b(str, "$url");
        C8467mq.m23881b(hkVar, "this$0");
        C8264gn.m23206a(str);
        hkVar.mo53660a(str);
    }

    /* renamed from: a */
    private final WebResourceResponse m23318a(WebView webView) {
        Context context = webView.getContext();
        C8467mq.m23878a((Object) context, "view.context");
        WebResourceResponse a = C8289hh.m23314a(context, this.f21414b);
        if (a != null) {
            return a;
        }
        this.f21415c.post(new Runnable() {
            public final void run() {
                C8292hk.m23319a(C8292hk.this);
            }
        });
        return f21413e;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m23319a(C8292hk hkVar) {
        C8467mq.m23881b(hkVar, "this$0");
        hkVar.mo53658a();
    }

    /* renamed from: b */
    private static boolean m23321b(String str) {
        return C8467mq.m23880a((Object) "mraid.js", (Object) Uri.parse(str).getLastPathSegment());
    }
}
