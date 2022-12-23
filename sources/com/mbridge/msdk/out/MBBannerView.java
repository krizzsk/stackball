package com.mbridge.msdk.out;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.mbbanner.p195a.C6461a;

public class MBBannerView extends RelativeLayout {
    private String bidToken;
    /* access modifiers changed from: private */
    public C6461a controller;
    private boolean hadAttached;
    private boolean isVisible;
    private BannerAdListener mBannerAdListener;
    private MBridgeIds mBridgeIds;

    public MBBannerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MBBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.hadAttached = false;
        this.isVisible = false;
    }

    public void init(BannerSize bannerSize, String str, String str2) {
        this.mBridgeIds = new MBridgeIds(str, str2);
        String d = C6366u.m16217d(str2);
        if (!TextUtils.isEmpty(d)) {
            C6366u.m16198a(str2, d);
        }
        C6461a aVar = new C6461a(this, bannerSize, str, str2);
        this.controller = aVar;
        aVar.mo44256c(this.isVisible);
        this.controller.mo44254b(this.hadAttached);
    }

    public String getRequestId() {
        C6461a aVar = this.controller;
        return aVar != null ? aVar.mo44246a() : "";
    }

    public void updateBannerSize(BannerSize bannerSize) {
        C6461a aVar = this.controller;
        if (aVar != null) {
            aVar.mo44250a(bannerSize);
        }
    }

    public void setRefreshTime(int i) {
        C6461a aVar = this.controller;
        if (aVar != null && i >= 0) {
            aVar.mo44247a(i);
        }
    }

    public void setAllowShowCloseBtn(boolean z) {
        C6461a aVar = this.controller;
        if (aVar != null) {
            aVar.mo44252a(z);
        }
    }

    public void load() {
        C6461a aVar = this.controller;
        if (aVar != null) {
            aVar.mo44254b(this.hadAttached);
            this.controller.mo44251a("");
            return;
        }
        BannerAdListener bannerAdListener = this.mBannerAdListener;
        if (bannerAdListener != null) {
            bannerAdListener.onLoadFailed(this.mBridgeIds, "banner controler init error，please check it");
        }
    }

    public void loadFromBid(String str) {
        this.bidToken = str;
        if (this.controller == null) {
            BannerAdListener bannerAdListener = this.mBannerAdListener;
            if (bannerAdListener != null) {
                bannerAdListener.onLoadFailed(this.mBridgeIds, "banner controler init error，please check it");
            }
        } else if (!TextUtils.isEmpty(str)) {
            this.controller.mo44254b(this.hadAttached);
            this.controller.mo44247a(0);
            this.controller.mo44251a(str);
        } else {
            BannerAdListener bannerAdListener2 = this.mBannerAdListener;
            if (bannerAdListener2 != null) {
                bannerAdListener2.onLoadFailed(this.mBridgeIds, "banner token is null or empty，please check it");
            }
        }
    }

    public void setBannerAdListener(BannerAdListener bannerAdListener) {
        this.mBannerAdListener = bannerAdListener;
        C6461a aVar = this.controller;
        if (aVar != null) {
            aVar.mo44249a(bannerAdListener);
        }
    }

    public void release() {
        if (this.mBannerAdListener != null) {
            this.mBannerAdListener = null;
        }
        C6461a aVar = this.controller;
        if (aVar != null) {
            aVar.mo44249a((BannerAdListener) null);
            this.controller.mo44253b();
        }
        removeAllViews();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateAttachedState(true);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        updateAttachedState(false);
    }

    private void updateAttachedState(boolean z) {
        this.hadAttached = z;
        C6461a aVar = this.controller;
        if (aVar != null) {
            aVar.mo44254b(z);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.isVisible = i == 0;
        C6461a aVar = this.controller;
        if (aVar == null) {
            return;
        }
        if (i == 0) {
            delayedNotify();
        } else {
            aVar.mo44256c(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.isVisible = i == 0;
        C6461a aVar = this.controller;
        if (aVar == null) {
            return;
        }
        if (i == 0) {
            delayedNotify();
        } else {
            aVar.mo44256c(false);
        }
    }

    private void delayedNotify() {
        postDelayed(new Runnable() {
            public void run() {
                if (MBBannerView.this.controller != null) {
                    MBBannerView.this.controller.mo44256c(true);
                }
            }
        }, 200);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C6461a aVar = this.controller;
        if (aVar != null) {
            aVar.mo44248a(i, i2, i3, i4);
        }
    }

    public void onPause() {
        if (this.controller != null && TextUtils.isEmpty(this.bidToken)) {
            this.controller.mo44257d();
        }
    }

    public void onResume() {
        if (this.controller != null && TextUtils.isEmpty(this.bidToken)) {
            this.controller.mo44258e();
        }
    }
}
