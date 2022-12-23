package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzawr;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzk extends WebViewClient {
    private final /* synthetic */ zzl zzbmn;

    zzk(zzl zzl) {
        this.zzbmn = zzl;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.zzbmn.zzkm())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            if (this.zzbmn.zzbmt != null) {
                try {
                    this.zzbmn.zzbmt.onAdFailedToLoad(3);
                } catch (RemoteException e) {
                    zzawr.zze("#007 Could not call remote method.", e);
                }
            }
            this.zzbmn.zzbn(0);
            return true;
        } else if (str.startsWith("gmsg://scriptLoadFailed")) {
            if (this.zzbmn.zzbmt != null) {
                try {
                    this.zzbmn.zzbmt.onAdFailedToLoad(0);
                } catch (RemoteException e2) {
                    zzawr.zze("#007 Could not call remote method.", e2);
                }
            }
            this.zzbmn.zzbn(0);
            return true;
        } else if (str.startsWith("gmsg://adResized")) {
            if (this.zzbmn.zzbmt != null) {
                try {
                    this.zzbmn.zzbmt.onAdLoaded();
                } catch (RemoteException e3) {
                    zzawr.zze("#007 Could not call remote method.", e3);
                }
            }
            this.zzbmn.zzbn(this.zzbmn.zzbo(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            if (this.zzbmn.zzbmt != null) {
                try {
                    this.zzbmn.zzbmt.onAdLeftApplication();
                } catch (RemoteException e4) {
                    zzawr.zze("#007 Could not call remote method.", e4);
                }
            }
            this.zzbmn.zzbq(this.zzbmn.zzbp(str));
            return true;
        }
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.zzbmn.zzbmt != null) {
            try {
                this.zzbmn.zzbmt.onAdFailedToLoad(0);
            } catch (RemoteException e) {
                zzawr.zze("#007 Could not call remote method.", e);
            }
        }
    }
}
