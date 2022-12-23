package com.ironsource.mediationsdk;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerListener;

public class IronSourceBannerLayout extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public View f12977a;

    /* renamed from: b */
    private ISBannerSize f12978b;

    /* renamed from: c */
    private String f12979c;

    /* renamed from: d */
    private Activity f12980d;

    /* renamed from: e */
    private boolean f12981e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f12982f = false;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public BannerListener f12983g;

    public IronSourceBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f12980d = activity;
        this.f12978b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final IronSourceBannerLayout mo41462a() {
        IronSourceBannerLayout ironSourceBannerLayout = new IronSourceBannerLayout(this.f12980d, this.f12978b);
        ironSourceBannerLayout.setBannerListener(this.f12983g);
        ironSourceBannerLayout.setPlacementName(this.f12979c);
        return ironSourceBannerLayout;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41463a(final View view, final FrameLayout.LayoutParams layoutParams) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                IronSourceBannerLayout.this.removeAllViews();
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
                View unused = IronSourceBannerLayout.this.f12977a = view;
                IronSourceBannerLayout.this.addView(view, 0, layoutParams);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41464a(final IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.CALLBACK;
        ironLog.info("error=" + ironSourceError);
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                if (IronSourceBannerLayout.this.f12982f) {
                    IronSourceBannerLayout.this.f12983g.onBannerAdLoadFailed(ironSourceError);
                    return;
                }
                try {
                    if (IronSourceBannerLayout.this.f12977a != null) {
                        IronSourceBannerLayout.this.removeView(IronSourceBannerLayout.this.f12977a);
                        View unused = IronSourceBannerLayout.this.f12977a = null;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (IronSourceBannerLayout.this.f12983g != null) {
                    IronSourceBannerLayout.this.f12983g.onBannerAdLoadFailed(ironSourceError);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41465a(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash - " + str);
        if (this.f12983g != null && !this.f12982f) {
            IronLog.CALLBACK.info("");
            this.f12983g.onBannerAdLoaded();
        }
        this.f12982f = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo41466b() {
        this.f12981e = true;
        this.f12983g = null;
        this.f12980d = null;
        this.f12978b = null;
        this.f12979c = null;
        this.f12977a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo41467c() {
        if (this.f12983g != null) {
            IronLog.CALLBACK.info("");
            this.f12983g.onBannerAdClicked();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo41468d() {
        if (this.f12983g != null) {
            IronLog.CALLBACK.info("");
            this.f12983g.onBannerAdScreenPresented();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo41469e() {
        if (this.f12983g != null) {
            IronLog.CALLBACK.info("");
            this.f12983g.onBannerAdScreenDismissed();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo41470f() {
        if (this.f12983g != null) {
            IronLog.CALLBACK.info("");
            this.f12983g.onBannerAdLeftApplication();
        }
    }

    public Activity getActivity() {
        return this.f12980d;
    }

    public BannerListener getBannerListener() {
        return this.f12983g;
    }

    public View getBannerView() {
        return this.f12977a;
    }

    public String getPlacementName() {
        return this.f12979c;
    }

    public ISBannerSize getSize() {
        return this.f12978b;
    }

    public boolean isDestroyed() {
        return this.f12981e;
    }

    public void removeBannerListener() {
        IronLog.API.info("");
        this.f12983g = null;
    }

    public void setBannerListener(BannerListener bannerListener) {
        IronLog.API.info("");
        this.f12983g = bannerListener;
    }

    public void setPlacementName(String str) {
        this.f12979c = str;
    }
}
