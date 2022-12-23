package com.mbridge.msdk.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.same.report.C6323d;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.mbsignalcommon.p206b.C6532b;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.video.signal.factory.C7158b;
import com.mbridge.msdk.videocommon.download.C7191g;
import com.mbridge.msdk.videocommon.download.C7200h;
import com.mbridge.msdk.videocommon.p239d.C7177b;
import com.mbridge.msdk.videocommon.p239d.C7179c;

public class MBridgeAlertWebview extends MBridgeH5EndCardView {
    /* access modifiers changed from: private */

    /* renamed from: u */
    public String f17272u;

    public MBridgeAlertWebview(Context context) {
        super(context);
    }

    public MBridgeAlertWebview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo48573a() {
        if (TextUtils.isEmpty(this.f17353r)) {
            return "";
        }
        C7177b.m18135a().mo49108a(C6122a.m15302b().mo42896e(), this.f17353r, false);
        String str = C7179c.f17915a;
        this.f17272u = str;
        return !TextUtils.isEmpty(str) ? C7191g.m18286a().mo49220b(this.f17272u) : "";
    }

    public void preLoadData(C7158b bVar) {
        String a = mo48573a();
        if (!this.f17279f || this.f17275b == null || TextUtils.isEmpty(a)) {
            this.f17278e.mo48315a(101, "");
            return;
        }
        BrowserView.MBDownloadListener mBDownloadListener = new BrowserView.MBDownloadListener(this.f17275b);
        mBDownloadListener.setTitle(this.f17275b.getAppName());
        this.f17348m.setDownloadListener(mBDownloadListener);
        this.f17348m.setCampaignId(this.f17275b.getId());
        setCloseVisible(8);
        this.f17348m.setApiManagerJSFactory(bVar);
        this.f17348m.setWebViewListener(new C6532b() {
            /* renamed from: a */
            public final void mo44023a(WebView webView, String str) {
                super.mo44023a(webView, str);
                C6361q.m16158d("MBridgeAlertWebview", "finish+" + str);
                C6563g.m16891a().mo44522a(webView, "onSignalCommunication", "");
            }

            /* renamed from: a */
            public final void mo44021a(WebView webView, int i, String str, String str2) {
                super.mo44021a(webView, i, str, str2);
                C6361q.m16158d("MBridgeAlertWebview", "onReceivedError");
                if (!MBridgeAlertWebview.this.f17352q) {
                    C6361q.m16154a(MBridgeBaseView.TAG, "onReceivedError,url:" + str2);
                    C6323d.m16035a(MBridgeAlertWebview.this.f17274a, MBridgeAlertWebview.this.f17275b, MBridgeAlertWebview.this.f17272u, MBridgeAlertWebview.this.f17353r, 2, str);
                    MBridgeAlertWebview.this.f17352q = true;
                }
            }

            /* renamed from: a */
            public final void mo44020a(WebView webView, int i) {
                String str;
                super.mo44020a(webView, i);
                C6361q.m16158d("MBridgeAlertWebview", "readyState  :  " + i);
                if (!MBridgeAlertWebview.this.f17352q) {
                    MBridgeAlertWebview mBridgeAlertWebview = MBridgeAlertWebview.this;
                    boolean z = true;
                    if (i != 1) {
                        z = false;
                    }
                    mBridgeAlertWebview.f17351p = z;
                    if (MBridgeAlertWebview.this.f17351p) {
                        str = "readyState state is " + i;
                    } else {
                        str = "";
                    }
                    C6323d.m16035a(MBridgeAlertWebview.this.f17274a, MBridgeAlertWebview.this.f17275b, MBridgeAlertWebview.this.f17272u, MBridgeAlertWebview.this.f17353r, i, str);
                }
            }
        });
        setHtmlSource(C7200h.m18303a().mo49224b(a));
        this.f17351p = false;
        if (TextUtils.isEmpty(this.f17350o)) {
            C6361q.m16154a(MBridgeBaseView.TAG, "load url:" + a);
            this.f17348m.loadUrl(a);
        } else {
            C6361q.m16154a(MBridgeBaseView.TAG, "load html...");
            this.f17348m.loadDataWithBaseURL(a, this.f17350o, WebRequest.CONTENT_TYPE_HTML, "UTF-8", (String) null);
        }
        this.f17348m.setBackgroundColor(0);
        setBackgroundColor(0);
    }

    public void webviewshow() {
        if (this.f17346k != null) {
            this.f17346k.setBackgroundColor(0);
        }
        super.webviewshow();
        C6323d.m16033a(this.f17274a, this.f17275b, this.f17272u, this.f17353r, 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final RelativeLayout.LayoutParams mo48574b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }
}
