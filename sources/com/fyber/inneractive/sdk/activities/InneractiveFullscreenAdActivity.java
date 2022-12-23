package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fyber.inneractive.sdk.C2677R;
import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.p034a.p035a.C2742b;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.p045e.C2900c;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.C3662m;
import com.fyber.inneractive.sdk.util.IAlog;

public class InneractiveFullscreenAdActivity extends Activity implements C2900c.C2901a {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";

    /* renamed from: a */
    boolean f6374a = false;

    /* renamed from: b */
    private ViewGroup f6375b;

    /* renamed from: c */
    private View f6376c;

    /* renamed from: d */
    private View f6377d;

    /* renamed from: e */
    private View f6378e;

    /* renamed from: f */
    private InneractiveAdSpot f6379f;

    /* renamed from: g */
    private C2900c f6380g;

    /* renamed from: h */
    private int f6381h = 0;

    /* renamed from: i */
    private int f6382i = 0;

    /* renamed from: j */
    private int f6383j = 0;

    public interface FullScreenRendererProvider {
        C2900c getFullscreenRenderer();
    }

    public interface OnInneractiveFullscreenAdDestroyListener {
        void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5877a() {
        if (Build.VERSION.SDK_INT >= 19) {
            View decorView = getWindow().getDecorView();
            if ((decorView.getSystemUiVisibility() & 2) == 0) {
                decorView.setSystemUiVisibility(2818);
            }
            decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
                public final void onSystemUiVisibilityChange(int i) {
                    if ((i & 2) == 0) {
                        C3662m.m9137a().postDelayed(new Runnable() {
                            public final void run() {
                                if (!InneractiveFullscreenAdActivity.this.isFinishing()) {
                                    InneractiveFullscreenAdActivity.this.m5877a();
                                }
                            }
                        }, 3000);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void initWindowFeatures(C2900c cVar) {
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().addFlags(2);
        }
        if (cVar != null && cVar.mo18273q()) {
            setTheme(16973831);
            if (Build.VERSION.SDK_INT >= 19) {
                requestWindowFeature(67108864);
                requestWindowFeature(134217728);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                requestWindowFeature(Integer.MIN_VALUE);
            }
        }
        m5877a();
        C2809u h = this.f6379f.getAdContent().mo18131h();
        if (h.mo18070g() != null) {
            Orientation d = h.mo18070g().mo18076d();
            setActivityOrientation(d.allowOrientationChange, d);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            m5877a();
        }
    }

    public void setActivityOrientation(boolean z, Orientation orientation) {
        if (z && orientation.equals(Orientation.USER)) {
            setRequestedOrientation(13);
        } else if (z && orientation.equals(Orientation.NONE)) {
            setRequestedOrientation(getRequestedOrientation());
        } else if (orientation.equals(Orientation.LANDSCAPE)) {
            setRequestedOrientation(6);
        } else if (orientation.equals(Orientation.PORTRAIT)) {
            setRequestedOrientation(7);
        } else {
            int i = getResources().getConfiguration().orientation;
            if (i == 1) {
                setRequestedOrientation(7);
            } else if (i == 2) {
                setRequestedOrientation(6);
            }
        }
    }

    public boolean isCloseButtonDisplay() {
        return this.f6376c.getVisibility() == 0;
    }

    public void destroy() {
        if (!isFinishing() && this.f6375b != null) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        ViewGroup viewGroup = this.f6375b;
        InneractiveUnitController inneractiveUnitController = null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f6375b = null;
        }
        InneractiveAdSpot inneractiveAdSpot = this.f6379f;
        if (inneractiveAdSpot != null) {
            inneractiveUnitController = inneractiveAdSpot.getSelectedUnitController();
        }
        if (inneractiveUnitController != null && (inneractiveUnitController instanceof OnInneractiveFullscreenAdDestroyListener)) {
            ((OnInneractiveFullscreenAdDestroyListener) inneractiveUnitController).onActivityDestroyed(this);
        }
        m5879b();
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            m5879b();
            return;
        }
        C2900c cVar = this.f6380g;
        if (cVar != null) {
            cVar.mo18197w();
        }
    }

    /* renamed from: b */
    private void m5879b() {
        C2900c cVar = this.f6380g;
        if (cVar != null) {
            cVar.mo18263j();
            this.f6380g.destroy();
            this.f6380g = null;
        }
    }

    public boolean wasDismissedByUser() {
        return this.f6374a;
    }

    public void onResume() {
        super.onResume();
        C2900c cVar = this.f6380g;
        if (cVar != null) {
            cVar.mo18198x();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f6380g == null) {
            return;
        }
        if (configuration.orientation != this.f6381h) {
            this.f6381h = configuration.orientation;
            this.f6380g.mo18264k();
        } else if (this.f6382i != configuration.screenHeightDp || this.f6383j != configuration.screenWidthDp) {
            this.f6382i = configuration.screenHeightDp;
            this.f6383j = configuration.screenWidthDp;
            this.f6380g.mo18264k();
        }
    }

    public void onBackPressed() {
        C2900c cVar = this.f6380g;
        if (cVar == null || !cVar.mo18262i()) {
            super.onBackPressed();
        }
    }

    public ViewGroup getLayout() {
        return this.f6375b;
    }

    public void dismissAd(boolean z) {
        this.f6374a = z;
        finish();
    }

    public void showCloseButton(boolean z, boolean z2) {
        if (z) {
            this.f6376c.setAlpha(0.0f);
        }
        this.f6377d.setBackgroundResource(C2677R.C2678drawable.ia_round_overlay_bg_with_close);
        if (z2) {
            double a = ((C2742b) this.f6379f.getAdContent().mo18132i().mo18010a(C2742b.class)).mo17980a("close_btn_padding", 0.0d);
            int intrinsicWidth = ((GradientDrawable) ((LayerDrawable) getResources().getDrawable(C2677R.C2678drawable.ia_round_overlay_bg_with_close)).findDrawableByLayerId(C2677R.C2679id.ia_close_button_background_item)).getIntrinsicWidth();
            int i = ((int) ((((double) intrinsicWidth) * a) / 100.0d)) / 2;
            IAlog.m9034b("%s: closeButton original width: %sdp, padding perc: %s, padding: %sdp", IAlog.m9029a((Object) this), Integer.valueOf(C3657l.m9106a(intrinsicWidth)), Double.valueOf(a), Integer.valueOf(C3657l.m9106a(i)));
            this.f6376c.setPadding(i, 0, 0, i);
        }
        ((TextView) this.f6377d).setText("");
        this.f6376c.setEnabled(true);
        this.f6376c.setVisibility(0);
    }

    public void showAdditionalCloseButton() {
        this.f6378e.setAlpha(0.0f);
        this.f6378e.setEnabled(true);
        this.f6378e.setVisibility(0);
    }

    public void updateCloseCountdown(int i) {
        if (i > 0) {
            ((TextView) this.f6377d).setText(Integer.toString(i));
        }
    }

    public void showCloseCountdown() {
        this.f6377d.setBackgroundResource(C2677R.C2678drawable.ia_round_overlay_bg);
        this.f6376c.setEnabled(false);
        this.f6376c.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0056, code lost:
        if (r1.getAdContent() != null) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r1 = "spotId"
            java.lang.String r0 = r0.getStringExtra(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0022
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = com.fyber.inneractive.sdk.util.IAlog.m9029a((java.lang.Object) r8)
            r0[r5] = r1
            java.lang.String r1 = "%sSpot id must be provided as an extra before calling createActivity with InneractiveInterstitialAdActivty"
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r1, r0)
            goto L_0x0059
        L_0x0022:
            com.fyber.inneractive.sdk.external.InneractiveAdSpotManager r1 = com.fyber.inneractive.sdk.external.InneractiveAdSpotManager.get()
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r1 = r1.getSpot(r0)
            if (r1 != 0) goto L_0x003b
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r7 = com.fyber.inneractive.sdk.util.IAlog.m9029a((java.lang.Object) r8)
            r6[r5] = r7
            r6[r4] = r0
            java.lang.String r0 = "%sSpot id %s cannot be found in spot manager!"
            com.fyber.inneractive.sdk.util.IAlog.m9037e(r0, r6)
        L_0x003b:
            if (r1 == 0) goto L_0x0050
            com.fyber.inneractive.sdk.d.g r0 = r1.getAdContent()
            if (r0 != 0) goto L_0x0050
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r6 = com.fyber.inneractive.sdk.util.IAlog.m9029a((java.lang.Object) r8)
            r0[r5] = r6
            java.lang.String r6 = "%sSpot does not have a content. Cannot start activity"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r6, r0)
        L_0x0050:
            if (r1 == 0) goto L_0x0059
            com.fyber.inneractive.sdk.d.g r0 = r1.getAdContent()
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r1 = r2
        L_0x005a:
            r8.f6379f = r1
            if (r1 == 0) goto L_0x0073
            com.fyber.inneractive.sdk.d.g r0 = r1.getAdContent()
            if (r0 == 0) goto L_0x0073
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r0 = r8.f6379f
            com.fyber.inneractive.sdk.d.g r0 = r0.getAdContent()
            com.fyber.inneractive.sdk.config.u r0 = r0.mo18131h()
            if (r0 != 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r0 = 0
            goto L_0x0074
        L_0x0073:
            r0 = 1
        L_0x0074:
            if (r0 == 0) goto L_0x007d
            super.onCreate(r9)
            r8.finish()
            return
        L_0x007d:
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r0 = r8.f6379f
            com.fyber.inneractive.sdk.external.InneractiveUnitController r0 = r0.getSelectedUnitController()
            if (r0 == 0) goto L_0x019b
            boolean r1 = r0 instanceof com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.FullScreenRendererProvider
            if (r1 != 0) goto L_0x008b
            goto L_0x019b
        L_0x008b:
            com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity$FullScreenRendererProvider r0 = (com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.FullScreenRendererProvider) r0
            com.fyber.inneractive.sdk.e.c r0 = r0.getFullscreenRenderer()
            r8.f6380g = r0
            r8.initWindowFeatures(r0)
            super.onCreate(r9)
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.String r0 = com.fyber.inneractive.sdk.util.IAlog.m9029a((java.lang.Object) r8)
            r9[r5] = r0
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r0 = r8.f6379f
            java.lang.String r0 = r0.getLocalUniqueId()
            r9[r4] = r0
            java.lang.String r0 = "%sInterstitial for spot id %s created"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r0, r9)
            android.content.res.Resources r9 = r8.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            int r9 = r9.orientation
            r8.f6381h = r9
            android.content.res.Resources r9 = r8.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            int r9 = r9.screenHeightDp
            r8.f6382i = r9
            android.content.res.Resources r9 = r8.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            int r9 = r9.screenWidthDp
            r8.f6383j = r9
            com.fyber.inneractive.sdk.e.c r9 = r8.f6380g
            if (r9 == 0) goto L_0x0190
            int r9 = com.fyber.inneractive.sdk.C2677R.layout.ia_fullscreen_activity     // Catch:{ all -> 0x0143 }
            r8.setContentView(r9)     // Catch:{ all -> 0x0143 }
            int r9 = com.fyber.inneractive.sdk.C2677R.C2679id.ia_ad_content
            android.view.View r9 = r8.findViewById(r9)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r8.f6375b = r9
            int r9 = com.fyber.inneractive.sdk.C2677R.C2679id.ia_ll_close_button
            android.view.View r9 = r8.findViewById(r9)
            r8.f6376c = r9
            int r9 = com.fyber.inneractive.sdk.C2677R.C2679id.ia_tv_close_button
            android.view.View r9 = r8.findViewById(r9)
            r8.f6377d = r9
            android.view.View r9 = r8.f6376c
            r0 = 8
            r9.setVisibility(r0)
            int r9 = com.fyber.inneractive.sdk.C2677R.C2679id.ia_iv_additional_close_button
            android.view.View r9 = r8.findViewById(r9)
            r8.f6378e = r9
            r9.setVisibility(r0)
            com.fyber.inneractive.sdk.e.c r9 = r8.f6380g
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r0 = r8.f6379f
            r9.initialize(r0)
            com.fyber.inneractive.sdk.e.c r9 = r8.f6380g     // Catch:{ AdDisplayError -> 0x0131 }
            r9.mo18185a(r8, r8)     // Catch:{ AdDisplayError -> 0x0131 }
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r9 = r8.f6379f
            com.fyber.inneractive.sdk.d.g r9 = r9.getAdContent()
            r9.mo18134j()
            android.view.View r9 = r8.f6376c
            com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity$1 r0 = new com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity$1
            r0.<init>()
            r9.setOnClickListener(r0)
            android.view.View r9 = r8.f6378e
            com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity$2 r0 = new com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity$2
            r0.<init>()
            r9.setOnClickListener(r0)
            return
        L_0x0131:
            r9 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r9 = r9.getMessage()
            r0[r5] = r9
            java.lang.String r9 = "Interstitial Activity: %s"
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r9, r0)
            r8.finish()
            return
        L_0x0143:
            r9 = move-exception
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r0 = r8.f6379f
            com.fyber.inneractive.sdk.d.g r0 = r0.getAdContent()
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r0 = r0.mo18130g()
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r1 = r8.f6379f
            com.fyber.inneractive.sdk.d.g r1 = r1.getAdContent()
            com.fyber.inneractive.sdk.j.e r1 = r1.mo18129f()
            java.lang.String r3 = com.fyber.inneractive.sdk.util.C3670q.m9160b((java.lang.Throwable) r9)
            com.fyber.inneractive.sdk.h.n$a r4 = new com.fyber.inneractive.sdk.h.n$a
            com.fyber.inneractive.sdk.h.m r5 = com.fyber.inneractive.sdk.p049h.C2967m.CAUGHT_EXCEPTION
            r4.<init>((com.fyber.inneractive.sdk.p049h.C2967m) r5, (com.fyber.inneractive.sdk.external.InneractiveAdRequest) r0, (com.fyber.inneractive.sdk.p051j.C3018e) r1)
            com.fyber.inneractive.sdk.h.n$b r0 = new com.fyber.inneractive.sdk.h.n$b
            r0.<init>()
            java.lang.Class r1 = r9.getClass()
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "exception_name"
            com.fyber.inneractive.sdk.h.n$b r0 = r0.mo18438a(r5, r1)
            java.lang.String r9 = r9.getMessage()
            java.lang.String r1 = "description"
            com.fyber.inneractive.sdk.h.n$b r9 = r0.mo18438a(r1, r9)
            java.lang.String r0 = "stack_trace"
            com.fyber.inneractive.sdk.h.n$b r9 = r9.mo18438a(r0, r3)
            r4.mo18433a((com.fyber.inneractive.sdk.p049h.C2968n.C2971b) r9)
            r4.mo18436b(r2)
            r8.finish()
            return
        L_0x0190:
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.String r0 = "Interstitial Activity: Could not find an appropriate full screen ad renderer for content!"
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r0, r9)
            r8.finish()
            return
        L_0x019b:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = com.fyber.inneractive.sdk.util.IAlog.m9029a((java.lang.Object) r8)
            r0[r5] = r1
            java.lang.String r1 = "%sno appropriate unit controller found for full screen ad. Aborting"
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r1, r0)
            super.onCreate(r9)
            r8.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.onCreate(android.os.Bundle):void");
    }
}
