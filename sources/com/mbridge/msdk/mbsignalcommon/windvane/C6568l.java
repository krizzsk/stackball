package com.mbridge.msdk.mbsignalcommon.windvane;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.same.p168c.C6215a;
import com.mbridge.msdk.foundation.same.p168c.C6216b;
import com.mbridge.msdk.mbsignalcommon.base.C6535b;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.l */
/* compiled from: WindVaneWebViewClient */
public final class C6568l extends C6535b {

    /* renamed from: b */
    public static boolean f16386b = true;

    /* renamed from: a */
    protected String f16387a = null;

    /* renamed from: c */
    private int f16388c = 0;

    /* renamed from: d */
    private C6560d f16389d;

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f16387a = str;
        C6560d dVar = this.f16389d;
        if (dVar != null) {
            dVar.mo44060a(webView, str, bitmap);
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse a = m16907a(str);
        if (a != null) {
            return a;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    /* renamed from: a */
    private WebResourceResponse m16907a(String str) {
        Bitmap a;
        try {
            if (TextUtils.isEmpty(str) || !C6566j.m16903d(str) || (a = C6216b.m15729a(C6122a.m15302b().mo42895d()).mo43784a(str)) == null || a.isRecycled()) {
                return null;
            }
            return new WebResourceResponse(C6566j.m16904e(str), "utf-8", C6215a.m15728a(a));
        } catch (Throwable unused) {
            return null;
        }
    }
}
