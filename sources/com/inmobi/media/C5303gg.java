package com.inmobi.media;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.inmobi.media.gg */
/* compiled from: WebViewNetworkTask */
public class C5303gg {

    /* renamed from: d */
    private static final String f12151d = C5303gg.class.getSimpleName();

    /* renamed from: a */
    public C5299gc f12152a;

    /* renamed from: b */
    public WebViewClient f12153b;

    /* renamed from: c */
    public C5304a f12154c;

    public C5303gg(C5299gc gcVar, WebViewClient webViewClient) {
        this.f12153b = webViewClient;
        this.f12152a = gcVar;
    }

    /* renamed from: com.inmobi.media.gg$a */
    /* compiled from: WebViewNetworkTask */
    public class C5304a extends WebView {

        /* renamed from: a */
        public boolean f12155a;

        public C5304a(Context context) {
            super(context);
        }

        public final void destroy() {
            this.f12155a = true;
            super.destroy();
        }
    }
}
