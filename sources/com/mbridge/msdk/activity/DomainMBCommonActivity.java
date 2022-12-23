package com.mbridge.msdk.activity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6364t;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.out.NativeListener;

public class DomainMBCommonActivity extends Activity {

    /* renamed from: a */
    String f14867a = "";

    /* renamed from: b */
    private CampaignEx f14868b;

    /* renamed from: c */
    private BrowserView f14869c;

    /* renamed from: d */
    private BrowserView.C6378a f14870d = new BrowserView.C6378a() {
        /* renamed from: a */
        public final void mo42646a(WebView webView, String str, Bitmap bitmap) {
        }

        /* renamed from: a */
        public final void mo42645a() {
            DomainMBCommonActivity.this.finish();
        }

        /* renamed from: a */
        public final boolean mo42647a(WebView webView, String str) {
            C6361q.m16158d("MBCommonActivity", "shouldOverrideUrlLoading  " + str);
            if (C6364t.C6365a.m16180a(str) && C6364t.C6365a.m16179a(DomainMBCommonActivity.this, str, (NativeListener.NativeTrackingListener) null)) {
                DomainMBCommonActivity.this.finish();
            }
            return DomainMBCommonActivity.this.m14988a(webView, str);
        }
    };

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (C6122a.m15302b().mo42895d() == null) {
            C6122a.m15302b().mo42886a(getApplicationContext());
        }
        String stringExtra = getIntent().getStringExtra("url");
        this.f14867a = stringExtra;
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f14868b = (CampaignEx) getIntent().getSerializableExtra("mvcommon");
            BrowserView browserView = new BrowserView((Context) this, this.f14868b);
            this.f14869c = browserView;
            browserView.setListener(this.f14870d);
            this.f14869c.loadUrl(this.f14867a);
            BrowserView browserView2 = this.f14869c;
            if (browserView2 != null) {
                setContentView(browserView2);
                return;
            }
            return;
        }
        Toast.makeText(this, "Error: no data", 0).show();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        BrowserView browserView = this.f14869c;
        if (browserView != null) {
            browserView.destroy();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d A[Catch:{ all -> 0x005e, all -> 0x00ae }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e A[Catch:{ all -> 0x005e, all -> 0x00ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0090 A[Catch:{ all -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0094  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m14988a(android.webkit.WebView r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "http"
            java.lang.String r1 = "MBCommonActivity"
            r2 = 0
            boolean r3 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x00ae }
            if (r3 == 0) goto L_0x000c
            return r2
        L_0x000c:
            android.net.Uri r3 = android.net.Uri.parse(r10)     // Catch:{ all -> 0x00ae }
            java.lang.String r4 = r3.getScheme()     // Catch:{ all -> 0x00ae }
            boolean r4 = r4.equals(r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r5 = "https"
            r6 = 1
            if (r4 != 0) goto L_0x002a
            java.lang.String r4 = r3.getScheme()     // Catch:{ all -> 0x00ae }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ae }
            if (r4 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r4 = 0
            goto L_0x002b
        L_0x002a:
            r4 = 1
        L_0x002b:
            if (r4 == 0) goto L_0x002e
            return r2
        L_0x002e:
            java.lang.String r3 = r3.getScheme()     // Catch:{ all -> 0x00ae }
            java.lang.String r4 = "intent"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x00ae }
            if (r3 == 0) goto L_0x009e
            android.content.Intent r3 = android.content.Intent.parseUri(r10, r6)     // Catch:{ all -> 0x00ae }
            java.lang.String r4 = r3.getPackage()     // Catch:{ all -> 0x005e }
            boolean r7 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x005e }
            if (r7 != 0) goto L_0x0066
            android.content.pm.PackageManager r7 = r8.getPackageManager()     // Catch:{ all -> 0x005e }
            android.content.Intent r4 = r7.getLaunchIntentForPackage(r4)     // Catch:{ all -> 0x005e }
            if (r4 == 0) goto L_0x0066
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r3.setFlags(r4)     // Catch:{ all -> 0x005e }
            r8.startActivityForResult(r3, r2)     // Catch:{ all -> 0x005e }
            r8.finish()     // Catch:{ all -> 0x005e }
            return r6
        L_0x005e:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x00ae }
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r1, r4)     // Catch:{ all -> 0x00ae }
        L_0x0066:
            java.lang.String r4 = "browser_fallback_url"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch:{ all -> 0x0096 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0096 }
            if (r4 != 0) goto L_0x009e
            android.net.Uri r4 = android.net.Uri.parse(r10)     // Catch:{ all -> 0x0096 }
            java.lang.String r7 = r4.getScheme()     // Catch:{ all -> 0x0096 }
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x0096 }
            if (r0 != 0) goto L_0x008d
            java.lang.String r0 = r4.getScheme()     // Catch:{ all -> 0x0096 }
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x008b
            goto L_0x008d
        L_0x008b:
            r0 = 0
            goto L_0x008e
        L_0x008d:
            r0 = 1
        L_0x008e:
            if (r0 == 0) goto L_0x0094
            r9.loadUrl(r3)     // Catch:{ all -> 0x0096 }
            return r2
        L_0x0094:
            r10 = r3
            goto L_0x009e
        L_0x0096:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00ae }
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r1, r9)     // Catch:{ all -> 0x00ae }
        L_0x009e:
            boolean r9 = com.mbridge.msdk.click.C6103b.m15229d(r8, r10)     // Catch:{ all -> 0x00ae }
            if (r9 == 0) goto L_0x00ad
            java.lang.String r9 = "openDeepLink"
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r1, r9)     // Catch:{ all -> 0x00ae }
            r8.finish()     // Catch:{ all -> 0x00ae }
            return r6
        L_0x00ad:
            return r2
        L_0x00ae:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.activity.DomainMBCommonActivity.m14988a(android.webkit.WebView, java.lang.String):boolean");
    }
}
