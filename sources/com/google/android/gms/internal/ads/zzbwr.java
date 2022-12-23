package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzbwr implements zzrv {
    private zzdnt zzfoq;

    public final void zza(Activity activity, WebView webView) {
        try {
            this.zzfoq = new zzdnt(activity, webView);
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
            sb.append(" Failed to initialize the internal ArWebView: ");
            sb.append(valueOf);
            zzawr.zzfa(sb.toString());
        }
    }

    public final void zzc(String str, String str2) {
        if (this.zzfoq == null) {
            zzawr.zzfa("ArWebView is not initialized.");
        } else {
            zzdnt.getWebView().loadDataWithBaseURL(str, str2, WebRequest.CONTENT_TYPE_HTML, "UTF-8", (String) null);
        }
    }

    public final WebView getWebView() {
        if (this.zzfoq == null) {
            return null;
        }
        return zzdnt.getWebView();
    }

    public final View getView() {
        return this.zzfoq;
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.zzfoq != null) {
            zzdnt.onPageStarted(webView, str, bitmap);
        }
    }
}
