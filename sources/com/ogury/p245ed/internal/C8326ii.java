package com.ogury.p245ed.internal;

import android.webkit.WebView;

/* renamed from: com.ogury.ed.internal.ii */
public final class C8326ii {

    /* renamed from: a */
    public static final C8327a f21516a = new C8327a((byte) 0);

    /* renamed from: b */
    private String f21517b = "";

    /* renamed from: c */
    private int f21518c = -1;

    /* renamed from: com.ogury.ed.internal.ii$a */
    public static final class C8327a {
        public /* synthetic */ C8327a(byte b) {
            this();
        }

        private C8327a() {
        }
    }

    /* renamed from: a */
    public final void mo53740a(WebView webView) {
        C8467mq.m23881b(webView, "webView");
        if (this.f21517b.length() == 0) {
            String userAgentString = webView.getSettings().getUserAgentString();
            C8467mq.m23878a((Object) userAgentString, "webView.settings.userAgentString");
            this.f21517b = userAgentString;
            m23495b();
        }
    }

    /* renamed from: b */
    private final void m23495b() {
        int a = C8516oc.m23955a((CharSequence) this.f21517b, "chrome/", 0, true);
        if (a != -1) {
            int i = a + 7;
            try {
                String str = this.f21517b;
                int i2 = i + 2;
                if (str != null) {
                    String substring = str.substring(i, i2);
                    C8467mq.m23878a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    this.f21518c = Integer.parseInt(substring);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (Throwable th) {
                C8261gl.m23201a(th);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo53741a() {
        return this.f21518c <= 57;
    }
}
