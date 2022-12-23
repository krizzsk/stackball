package com.mbridge.msdk.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.URLUtil;
import android.webkit.WebView;
import com.mbridge.msdk.click.C6103b;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6364t;
import com.mbridge.msdk.mbsignalcommon.base.C6534a;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.video.signal.factory.C7158b;

public class MBridgeLandingPageView extends MBridgeH5EndCardView {
    public MBridgeLandingPageView(Context context) {
        super(context);
    }

    public MBridgeLandingPageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void init(Context context) {
        super.init(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo48573a() {
        if (this.f17275b != null) {
            return C6103b.m15223a(this.f17275b.getClickURL(), "-999", "-999");
        }
        return null;
    }

    public void preLoadData(C7158b bVar) {
        if (this.f17279f) {
            this.f17348m.setFilter(new C7005a());
        }
        super.preLoadData(bVar);
        setVisibility(0);
        setCloseVisible(0);
    }

    public void webviewshow() {
        try {
            C6361q.m16154a(MBridgeBaseView.TAG, "webviewshow");
            C6563g.m16891a().mo44522a((WebView) this.f17348m, "webviewshow", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeLandingPageView$a */
    private static final class C7005a implements C6534a {
        private C7005a() {
        }

        /* renamed from: a */
        public final boolean mo44425a(String str) {
            if (TextUtils.isEmpty(str) || URLUtil.isNetworkUrl(str)) {
                return false;
            }
            C6364t.m16177b(C6122a.m15302b().mo42895d(), str, (NativeListener.NativeTrackingListener) null);
            return true;
        }
    }
}
