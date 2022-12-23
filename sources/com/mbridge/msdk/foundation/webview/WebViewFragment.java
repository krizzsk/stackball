package com.mbridge.msdk.foundation.webview;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.fragment.BaseFragment;
import com.mbridge.msdk.foundation.tools.C6364t;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.out.NativeListener;

public class WebViewFragment extends BaseFragment {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        BrowserView browserView = new BrowserView(getActivity());
        browserView.loadUrl(getActivity().getIntent().getExtras().getString(NotificationCompat.CATEGORY_MESSAGE));
        browserView.setListener(new BrowserView.C6378a() {
            /* renamed from: a */
            public final boolean mo42647a(WebView webView, String str) {
                return false;
            }

            /* renamed from: a */
            public final void mo42645a() {
                WebViewFragment.this.getActivity().finish();
            }

            /* renamed from: a */
            public final void mo42646a(WebView webView, String str, Bitmap bitmap) {
                if (C6364t.C6365a.m16180a(str) && C6364t.C6365a.m16179a(WebViewFragment.this.getActivity().getApplicationContext(), str, (NativeListener.NativeTrackingListener) null)) {
                    WebViewFragment.this.getActivity().finish();
                }
            }
        });
        return browserView;
    }
}
