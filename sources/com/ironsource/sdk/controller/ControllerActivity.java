package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import com.ironsource.environment.C5527g;
import com.ironsource.sdk.controller.C5923w;
import com.ironsource.sdk.p143a.C5821a;
import com.ironsource.sdk.p143a.C5825d;
import com.ironsource.sdk.p143a.C5827f;
import com.ironsource.sdk.p145c.C5844d;
import com.ironsource.sdk.p146d.C5980b;
import com.ironsource.sdk.p150g.C6005b;
import com.ironsource.sdk.p150g.C6008d;
import com.ironsource.sdk.p152i.C6023a;
import com.ironsource.sdk.p153j.C6035g;
import com.ironsource.sdk.utils.C6062d;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;

public class ControllerActivity extends Activity implements C5922v, C6035g {

    /* renamed from: a */
    private static final String f14244a = ControllerActivity.class.getSimpleName();

    /* renamed from: b */
    private static String f14245b = "removeWebViewContainerView | mContainer is null";

    /* renamed from: c */
    private static String f14246c = "removeWebViewContainerView | view is null";
    public int currentRequestedRotation = -1;

    /* renamed from: d */
    private String f14247d;

    /* renamed from: e */
    private C5923w f14248e;

    /* renamed from: f */
    private RelativeLayout f14249f;

    /* renamed from: g */
    private FrameLayout f14250g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f14251h = false;

    /* renamed from: i */
    private String f14252i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Handler f14253j = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Runnable f14254k = new Runnable() {
        public final void run() {
            ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(ControllerActivity.this.f14251h));
        }
    };

    /* renamed from: l */
    private RelativeLayout.LayoutParams f14255l = new RelativeLayout.LayoutParams(-1, -1);

    /* renamed from: m */
    private C6005b f14256m;

    /* renamed from: n */
    private boolean f14257n;

    /* renamed from: o */
    private boolean f14258o;

    /* renamed from: a */
    private void m14458a() {
        Logger.m14957i(f14244a, "clearWebviewController");
        C5923w wVar = this.f14248e;
        if (wVar == null) {
            Logger.m14957i(f14244a, "clearWebviewController, null");
            return;
        }
        wVar.f14510j = C5923w.C5973g.Gone;
        this.f14248e.f14514n = null;
        this.f14248e.f14524x = null;
        this.f14248e.mo42338a(this.f14252i, "onDestroy");
    }

    /* renamed from: a */
    private void m14459a(String str) {
        if (str == null) {
            return;
        }
        if ("landscape".equalsIgnoreCase(str)) {
            m14462b();
        } else if ("portrait".equalsIgnoreCase(str)) {
            m14464c();
        } else if ("device".equalsIgnoreCase(str)) {
            if (C5527g.m13172r(this)) {
                setRequestedOrientation(1);
            }
        } else if (getRequestedOrientation() == -1) {
            setRequestedOrientation(4);
        }
    }

    /* renamed from: b */
    private void m14462b() {
        int l = C5527g.m13160l(this);
        Logger.m14957i(f14244a, "setInitiateLandscapeOrientation");
        if (l == 0) {
            Logger.m14957i(f14244a, "ROTATION_0");
            setRequestedOrientation(0);
        } else if (l == 2) {
            Logger.m14957i(f14244a, "ROTATION_180");
            setRequestedOrientation(8);
        } else if (l == 3) {
            Logger.m14957i(f14244a, "ROTATION_270 Right Landscape");
            setRequestedOrientation(8);
        } else if (l == 1) {
            Logger.m14957i(f14244a, "ROTATION_90 Left Landscape");
            setRequestedOrientation(0);
        } else {
            Logger.m14957i(f14244a, "No Rotation");
        }
    }

    /* renamed from: c */
    private void m14464c() {
        int l = C5527g.m13160l(this);
        Logger.m14957i(f14244a, "setInitiatePortraitOrientation");
        if (l == 0) {
            Logger.m14957i(f14244a, "ROTATION_0");
            setRequestedOrientation(1);
        } else if (l == 2) {
            Logger.m14957i(f14244a, "ROTATION_180");
            setRequestedOrientation(9);
        } else if (l == 1) {
            Logger.m14957i(f14244a, "ROTATION_270 Right Landscape");
            setRequestedOrientation(1);
        } else if (l == 3) {
            Logger.m14957i(f14244a, "ROTATION_90 Left Landscape");
            setRequestedOrientation(1);
        } else {
            Logger.m14957i(f14244a, "No Rotation");
        }
    }

    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    public void onBackPressed() {
        Logger.m14957i(f14244a, "onBackPressed");
        new C6023a();
        if (!C6023a.m14869a(this)) {
            super.onBackPressed();
        }
    }

    public void onCloseRequested() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Logger.m14957i(f14244a, "onCreate");
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            C5923w wVar = (C5923w) C5980b.m14743a((Context) this).f14640a.f14320a;
            this.f14248e = wVar;
            wVar.f14509i.setId(1);
            this.f14248e.f14524x = this;
            this.f14248e.f14514n = this;
            Intent intent = getIntent();
            this.f14252i = intent.getStringExtra("productType");
            this.f14251h = intent.getBooleanExtra("immersive", false);
            this.f14247d = intent.getStringExtra("adViewId");
            this.f14257n = false;
            this.f14258o = intent.getBooleanExtra("ctrWVPauseResume", false);
            if (this.f14251h) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
                    public final void onSystemUiVisibilityChange(int i) {
                        if ((i & InputDeviceCompat.SOURCE_TOUCHSCREEN) == 0) {
                            ControllerActivity.this.f14253j.removeCallbacks(ControllerActivity.this.f14254k);
                            ControllerActivity.this.f14253j.postDelayed(ControllerActivity.this.f14254k, 500);
                        }
                    }
                });
                runOnUiThread(this.f14254k);
            }
            if (!TextUtils.isEmpty(this.f14252i) && C6008d.C6013e.OfferWall.toString().equalsIgnoreCase(this.f14252i)) {
                if (bundle != null) {
                    C6005b bVar = (C6005b) bundle.getParcelable("state");
                    if (bVar != null) {
                        this.f14256m = bVar;
                        this.f14248e.mo42335a(bVar);
                    }
                    finish();
                } else {
                    this.f14256m = this.f14248e.f14515o;
                }
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f14249f = relativeLayout;
            setContentView(relativeLayout, this.f14255l);
            String str = this.f14247d;
            this.f14250g = !(!TextUtils.isEmpty(str) && !str.equals(Integer.toString(1))) ? this.f14248e.f14509i : C6062d.m14984a(getApplicationContext(), C5844d.m14444a().mo42194a(str));
            if (this.f14249f.findViewById(1) == null && this.f14250g.getParent() != null) {
                finish();
            }
            Intent intent2 = getIntent();
            String stringExtra = intent2.getStringExtra("orientation_set_flag");
            intent2.getIntExtra("rotation_set_flag", 0);
            m14459a(stringExtra);
            this.f14249f.addView(this.f14250g, this.f14255l);
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        Logger.m14957i(f14244a, "onDestroy");
        try {
            if (this.f14249f != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f14250g.getParent();
                View findViewById = this.f14247d == null ? viewGroup2.findViewById(1) : C5844d.m14444a().mo42194a(this.f14247d);
                if (findViewById != null) {
                    if (isFinishing() && (viewGroup = (ViewGroup) findViewById.getParent()) != null) {
                        viewGroup.removeView(findViewById);
                    }
                    viewGroup2.removeView(this.f14250g);
                    if (!this.f14257n) {
                        Logger.m14957i(f14244a, "onDestroy | destroyedFromBackground");
                        m14458a();
                        return;
                    }
                    return;
                }
                throw new Exception(f14246c);
            }
            throw new Exception(f14245b);
        } catch (Exception e) {
            C5825d.m14394a(C5827f.f14176q, (Map<String, Object>) new C5821a().mo42154a("callfailreason", e.getMessage()).f14151a);
            String str = f14244a;
            Logger.m14957i(str, "removeWebViewContainerView fail " + e.getMessage());
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.f14248e.f14508h != null) {
                this.f14248e.f14507g.onHideCustomView();
                return true;
            }
        }
        if (this.f14251h && (i == 25 || i == 24)) {
            this.f14253j.removeCallbacks(this.f14254k);
            this.f14253j.postDelayed(this.f14254k, 500);
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onOrientationChanged(String str, int i) {
        m14459a(str);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        String str = f14244a;
        Logger.m14957i(str, "onPause, isFinishing=" + isFinishing());
        try {
            ((AudioManager) getSystemService("audio")).abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        C5923w wVar = this.f14248e;
        if (wVar != null) {
            wVar.mo42273b((Context) this);
            if (!this.f14258o) {
                this.f14248e.mo42347i();
            }
            this.f14248e.mo42339a(false, "main");
            this.f14248e.mo42338a(this.f14252i, "onPause");
        }
        if (isFinishing()) {
            this.f14257n = true;
            m14458a();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        Logger.m14957i(f14244a, "onResume");
        C5923w wVar = this.f14248e;
        if (wVar != null) {
            wVar.mo42259a((Context) this);
            if (!this.f14258o) {
                this.f14248e.mo42348j();
            }
            this.f14248e.mo42339a(true, "main");
            this.f14248e.mo42338a(this.f14252i, "onResume");
        }
        ((AudioManager) getSystemService("audio")).requestAudioFocus((AudioManager.OnAudioFocusChangeListener) null, 3, 2);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.f14252i) && C6008d.C6013e.OfferWall.toString().equalsIgnoreCase(this.f14252i)) {
            this.f14256m.f14724d = true;
            bundle.putParcelable("state", this.f14256m);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        Logger.m14957i(f14244a, "onStart");
        this.f14248e.mo42338a(this.f14252i, "onStart");
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        Logger.m14957i(f14244a, "onStop");
        this.f14248e.mo42338a(this.f14252i, "onStop");
    }

    /* access modifiers changed from: protected */
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.m14957i(f14244a, "onUserLeaveHint");
        this.f14248e.mo42338a(this.f14252i, "onUserLeaveHint");
    }

    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f14251h && z) {
            runOnUiThread(this.f14254k);
        }
    }

    public void setRequestedOrientation(int i) {
        if (this.currentRequestedRotation != i) {
            String str = f14244a;
            Logger.m14957i(str, "Rotation: Req = " + i + " Curr = " + this.currentRequestedRotation);
            this.currentRequestedRotation = i;
            super.setRequestedOrientation(i);
        }
    }

    public void toggleKeepScreen(boolean z) {
        runOnUiThread(z ? new Runnable() {
            public final void run() {
                ControllerActivity.this.getWindow().addFlags(128);
            }
        } : new Runnable() {
            public final void run() {
                ControllerActivity.this.getWindow().clearFlags(128);
            }
        });
    }
}
