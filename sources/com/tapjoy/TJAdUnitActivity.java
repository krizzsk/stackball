package com.tapjoy;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.appsflyer.internal.referrer.Payload;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.C9277fm;
import com.tapjoy.internal.C9285fq;
import com.tapjoy.internal.C9326gn;
import com.tapjoy.internal.C9344gz;

public class TJAdUnitActivity extends Activity implements View.OnClickListener {

    /* renamed from: c */
    private static TJAdUnitActivity f21917c;
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public TJAdUnit f21918a;

    /* renamed from: b */
    private final Handler f21919b = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private TJPlacementData f21920d;

    /* renamed from: e */
    private TJAdUnitSaveStateData f21921e = new TJAdUnitSaveStateData();

    /* renamed from: f */
    private RelativeLayout f21922f = null;

    /* renamed from: g */
    private TJCloseButton f21923g;

    /* renamed from: h */
    private ProgressBar f21924h;

    /* renamed from: i */
    private boolean f21925i = false;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        TapjoyLog.m24273d("TJAdUnitActivity", "TJAdUnitActivity onCreate: " + bundle);
        super.onCreate(bundle);
        f21917c = this;
        if (bundle != null) {
            TJAdUnitSaveStateData tJAdUnitSaveStateData = (TJAdUnitSaveStateData) bundle.getSerializable("ad_unit_bundle");
            this.f21921e = tJAdUnitSaveStateData;
            if (tJAdUnitSaveStateData != null && tJAdUnitSaveStateData.isVideoComplete) {
                TapjoyLog.m24273d("TJAdUnitActivity", "finishing TJAdUnitActivity");
                finish();
                return;
            }
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null || extras.getSerializable(TJAdUnitConstants.EXTRA_TJ_PLACEMENT_DATA) == null) {
            TapjoyLog.m24274e("TJAdUnitActivity", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Failed to launch AdUnit Activity"));
            finish();
            return;
        }
        TJPlacementData tJPlacementData = (TJPlacementData) extras.getSerializable(TJAdUnitConstants.EXTRA_TJ_PLACEMENT_DATA);
        this.f21920d = tJPlacementData;
        if (tJPlacementData.getContentViewId() != null) {
            TapjoyConnectCore.viewWillOpen(this.f21920d.getContentViewId(), 1);
        }
        if (TJPlacementManager.m24216a(this.f21920d.getKey()) != null) {
            this.f21918a = TJPlacementManager.m24216a(this.f21920d.getKey()).getAdUnit();
        } else {
            this.f21918a = new TJAdUnit();
            this.f21918a.setAdContentTracker(new C9277fm(this.f21920d.getPlacementName(), this.f21920d.getPlacementType()));
        }
        if (!this.f21918a.hasCalledLoad()) {
            TapjoyLog.m24273d("TJAdUnitActivity", "No content loaded for ad unit -- loading now");
            this.f21918a.load(this.f21920d, false, this);
        }
        this.f21918a.setAdUnitActivity(this);
        if (Build.VERSION.SDK_INT < 11) {
            setTheme(16973829);
        } else {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().setFlags(16777216, 16777216);
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.f21922f = relativeLayout;
        relativeLayout.setLayoutParams(layoutParams);
        this.f21922f.setBackgroundColor(0);
        TJWebView backgroundWebView = this.f21918a.getBackgroundWebView();
        backgroundWebView.setLayoutParams(layoutParams);
        if (backgroundWebView.getParent() != null) {
            ((ViewGroup) backgroundWebView.getParent()).removeView(backgroundWebView);
        }
        TJWebView webView = this.f21918a.getWebView();
        webView.setLayoutParams(layoutParams);
        if (webView.getParent() != null) {
            ((ViewGroup) webView.getParent()).removeView(webView);
        }
        this.f21922f.addView(backgroundWebView);
        VideoView videoView = this.f21918a.getVideoView();
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        if (videoView.getParent() != null) {
            ((ViewGroup) videoView.getParent()).removeView(videoView);
        }
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setGravity(17);
        linearLayout.addView(videoView, new LinearLayout.LayoutParams(-1, -1));
        this.f21922f.addView(linearLayout, layoutParams2);
        this.f21922f.addView(webView);
        this.f21924h = new ProgressBar(this, (AttributeSet) null, 16842874);
        if (this.f21920d.hasProgressSpinner()) {
            setProgressSpinnerVisibility(true);
        } else {
            setProgressSpinnerVisibility(false);
        }
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(13);
        this.f21924h.setLayoutParams(layoutParams3);
        this.f21922f.addView(this.f21924h);
        TJCloseButton tJCloseButton = new TJCloseButton(this);
        this.f21923g = tJCloseButton;
        tJCloseButton.setOnClickListener(this);
        this.f21922f.addView(this.f21923g);
        setContentView(this.f21922f);
        this.f21918a.setVisible(true);
        TJCorePlacement a = TJPlacementManager.m24216a(this.f21920d.getKey());
        if (a != null) {
            String str = TJCorePlacement.f21996a;
            TapjoyLog.m24276i(str, "Content shown for placement " + a.f21999c.getPlacementName());
            a.f22002f.mo58153a();
            TJPlacement a2 = a.mo57525a("SHOW");
            if (a2 != null && a2.getListener() != null) {
                a2.getListener().onContentShow(a2);
            }
        }
    }

    public void setCloseButtonVisibility(boolean z) {
        if (z) {
            this.f21923g.setVisibility(0);
        } else {
            this.f21923g.setVisibility(4);
        }
    }

    public void setCloseButtonClickable(boolean z) {
        this.f21923g.setClickableRequested(z);
    }

    public void setProgressSpinnerVisibility(boolean z) {
        if (z) {
            this.f21924h.setVisibility(0);
        } else {
            this.f21924h.setVisibility(4);
        }
    }

    public void onBackPressed() {
        handleClose();
    }

    public void handleClose() {
        handleClose(false);
    }

    public void handleClose(boolean z) {
        if (!this.f21918a.getCloseRequested()) {
            TapjoyLog.m24273d("TJAdUnitActivity", TJAdUnitConstants.String.CLOSE_REQUESTED);
            this.f21918a.closeRequested(z);
            this.f21919b.postDelayed(new Runnable() {
                public final void run() {
                    if (TJAdUnitActivity.this.f21918a.getCloseRequested()) {
                        TapjoyLog.m24273d("TJAdUnitActivity", "Did not receive callback from content. Closing ad.");
                        TJAdUnitActivity.this.finish();
                    }
                }
            }, 1000);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        TJPlacement a;
        super.onDestroy();
        f21917c = null;
        TapjoyLog.m24273d("TJAdUnitActivity", "onDestroy");
        TJAdUnit tJAdUnit = this.f21918a;
        if (tJAdUnit != null) {
            tJAdUnit.destroy();
        }
        TJPlacementData tJPlacementData = this.f21920d;
        if (tJPlacementData != null && tJPlacementData.isBaseActivity()) {
            if (this.f21920d.getContentViewId() != null) {
                TapjoyConnectCore.viewDidClose(this.f21920d.getContentViewId());
            }
            TJCorePlacement a2 = TJPlacementManager.m24216a(this.f21920d.getKey());
            if (a2 != null && (a = a2.mo57525a("SHOW")) != null && a.getListener() != null) {
                String str = TJCorePlacement.f21996a;
                TapjoyLog.m24276i(str, "Content dismissed for placement " + a2.f21999c.getPlacementName());
                C9285fq fqVar = a2.f22002f.f22972a;
                if (fqVar != null) {
                    fqVar.f22963b.clear();
                }
                if (a != null && a.f22060a != null) {
                    a.f22060a.onContentDismiss(a);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        TapjoyLog.m24273d("TJAdUnitActivity", "onResume");
        super.onResume();
        if (this.f21918a.isLockedOrientation()) {
            setRequestedOrientation(this.f21918a.getLockedOrientation());
        }
        this.f21918a.resume(this.f21921e);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        TapjoyLog.m24273d("TJAdUnitActivity", "onStart");
        if (C9344gz.m25060a().f23124n) {
            this.f21925i = true;
            C9326gn.m25004a(this);
        }
        if (!this.f21920d.isBaseActivity()) {
            setResult(-1, getIntent());
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        TapjoyLog.m24273d("TJAdUnitActivity", "onPause");
        this.f21918a.pause();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TapjoyLog.m24273d("TJAdUnitActivity", "onSaveInstanceState");
        this.f21921e.seekTime = this.f21918a.getVideoSeekTime();
        this.f21921e.isVideoComplete = this.f21918a.isVideoComplete();
        this.f21921e.isVideoMuted = this.f21918a.isMuted();
        bundle.putSerializable("ad_unit_bundle", this.f21921e);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        if (this.f21925i) {
            this.f21925i = false;
            C9326gn.m25009b(this);
        }
        super.onStop();
        TapjoyLog.m24273d("TJAdUnitActivity", "onStop");
    }

    public void showErrorDialog() {
        if (isFinishing()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AlertDialog.Builder(this, 16974394).setMessage("An error occured. Please try again later.").setPositiveButton(Payload.RESPONSE_OK, new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    TJAdUnitActivity.this.handleClose();
                    dialogInterface.cancel();
                }
            }).create().show();
        } else {
            new AlertDialog.Builder(this).setMessage("An error occured. Please try again later.").setPositiveButton(Payload.RESPONSE_OK, new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    TJAdUnitActivity.this.handleClose();
                    dialogInterface.cancel();
                }
            }).create().show();
        }
    }

    public void onClick(View view) {
        handleClose();
    }

    /* renamed from: a */
    static void m24162a() {
        TJAdUnitActivity tJAdUnitActivity = f21917c;
        if (tJAdUnitActivity != null) {
            tJAdUnitActivity.handleClose(true);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f21918a.notifyOrientationChanged();
    }
}
