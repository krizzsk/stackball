package com.mbridge.msdk.mbbanner.view;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.mbbanner.common.p197b.C6468a;
import com.mbridge.msdk.mbsignalcommon.base.C6535b;
import com.mbridge.msdk.p158b.p160b.C6077a;
import java.util.List;

/* renamed from: com.mbridge.msdk.mbbanner.view.a */
/* compiled from: BannerWebViewClient */
public final class C6510a extends C6535b {

    /* renamed from: a */
    String f16251a;

    /* renamed from: b */
    List<CampaignEx> f16252b;

    /* renamed from: c */
    C6468a f16253c;

    /* renamed from: d */
    private final String f16254d = "BannerWebViewClient";

    public C6510a(String str, List<CampaignEx> list, C6468a aVar) {
        this.f16251a = str;
        this.f16252b = list;
        this.f16253c = aVar;
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            StringBuilder sb = new StringBuilder("javascript:");
            sb.append(C6077a.m15106a().mo42759b());
            if (Build.VERSION.SDK_INT <= 19) {
                webView.loadUrl(sb.toString());
            } else {
                webView.evaluateJavascript(sb.toString(), new ValueCallback<String>() {
                    public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
                        String str = (String) obj;
                    }
                });
            }
        } catch (Throwable th) {
            C6361q.m16155a("BannerWebViewClient", "onPageStarted", th);
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            if (this.f16252b.size() > 1) {
                C6122a.m15302b().mo42895d().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            if (this.f16253c != null) {
                this.f16253c.mo44297a(false, str);
            }
            return true;
        } catch (Throwable th) {
            C6361q.m16155a("BannerWebViewClient", "shouldOverrideUrlLoading", th);
            return false;
        }
    }
}
