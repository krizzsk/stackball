package com.ogury.p244cm;

import android.content.Context;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.share.internal.ShareConstants;
import com.ogury.core.OguryError;
import com.ogury.p244cm.internal.abaac;
import com.ogury.p244cm.internal.abbbb;
import com.ogury.p244cm.internal.babca;
import com.ogury.p244cm.internal.bbabc;

/* renamed from: com.ogury.cm.aaaaa */
public final class aaaaa extends WebViewClient {

    /* renamed from: a */
    private abaac f20233a = new abaac();

    /* renamed from: b */
    private boolean f20234b;

    /* renamed from: c */
    private Context f20235c;

    /* renamed from: d */
    private final abbbb f20236d;

    public aaaaa(Context context, abbbb abbbb) {
        bbabc.m22051b(context, "context");
        bbabc.m22051b(abbbb, "consentCallback");
        this.f20235c = context;
        this.f20236d = abbbb;
    }

    /* renamed from: a */
    private final void m21636a(String str) {
        if (!this.f20234b) {
            this.f20234b = true;
            abbbb abbbb = this.f20236d;
            if (str == null) {
                str = "";
            }
            abbbb.mo52605a(new OguryError(1003, str));
            Context context = this.f20235c;
            if (!(context instanceof ConsentActivity)) {
                return;
            }
            if (context != null) {
                ((ConsentActivity) context).finish();
                return;
            }
            throw new babca("null cannot be cast to non-null type com.ogury.cm.ConsentActivity");
        }
    }

    /* renamed from: a */
    private final boolean m21637a(String str, WebView webView) {
        if (this.f20234b) {
            return true;
        }
        this.f20233a.mo52666a(str, this.f20235c, this.f20236d, webView);
        return true;
    }

    /* renamed from: a */
    public final void mo52598a(Context context) {
        bbabc.m22051b(context, "context");
        this.f20235c = context;
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        m21636a(str);
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        bbabc.m22051b(webView, "view");
        bbabc.m22051b(webResourceRequest, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        bbabc.m22051b(webResourceError, "error");
        m21636a(webResourceError.getDescription().toString());
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        bbabc.m22051b(webView, "view");
        bbabc.m22051b(webResourceRequest, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        return null;
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        bbabc.m22051b(webView, "view");
        bbabc.m22051b(str, "url");
        return null;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        bbabc.m22051b(webView, "view");
        bbabc.m22051b(webResourceRequest, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        String uri = webResourceRequest.getUrl().toString();
        bbabc.m22048a((Object) uri, "request.url.toString()");
        return m21637a(uri, webView);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        bbabc.m22051b(webView, "view");
        bbabc.m22051b(str, "url");
        return m21637a(str, webView);
    }
}
