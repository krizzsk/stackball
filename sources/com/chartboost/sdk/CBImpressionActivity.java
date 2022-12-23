package com.chartboost.sdk;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.C1838c;
import com.chartboost.sdk.Model.CBError;

public class CBImpressionActivity extends Activity {

    /* renamed from: a */
    final Handler f4355a;

    /* renamed from: b */
    final C1883d f4356b;

    public CBImpressionActivity() {
        C1883d dVar = null;
        this.f4355a = C2022j.m4955b() != null ? C2022j.m4955b().f5206B : null;
        this.f4356b = C2022j.m4955b() != null ? C2022j.m4955b().f5207C : dVar;
    }

    public void onAttachedToWindow() {
        View decorView;
        try {
            super.onAttachedToWindow();
            Window window = getWindow();
            if (window != null && (decorView = window.getDecorView()) != null && !decorView.isHardwareAccelerated() && this.f4356b != null) {
                CBLogging.m3993b("CBImpressionActivity", "The activity passed down is not hardware accelerated, so Chartboost cannot show ads");
                C1838c f = this.f4356b.mo14497f();
                if (f != null) {
                    f.mo14273a(CBError.CBImpressionError.HARDWARE_ACCELERATION_DISABLED);
                }
                finish();
            }
        } catch (Exception e) {
            CBLogging.m3993b("CBImpressionActivity", "onAttachedToWindow: " + e.toString());
        }
    }

    public void onBackPressed() {
        try {
            if (this.f4356b == null || !this.f4356b.mo14500i()) {
                super.onBackPressed();
            }
        } catch (Exception e) {
            CBLogging.m3993b("CBImpressionActivity", "onBackPressed: " + e.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if ((getIntent() != null && !getIntent().getBooleanExtra("isChartboost", false)) || this.f4355a == null || this.f4356b == null) {
            CBLogging.m3993b("CBImpressionActivity", "This activity cannot be called from outside chartboost SDK");
            finish();
            return;
        }
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(0);
        }
        this.f4356b.mo14485a(this);
        setContentView(new RelativeLayout(this));
        CBLogging.m3991a("CBImpressionActivity", "Impression Activity onCreate() called");
        try {
            this.f4356b.mo14501j();
        } catch (Exception e) {
            CBLogging.m3993b("CBImpressionActivity", "onCreate: " + e.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        try {
            if (this.f4356b != null) {
                this.f4356b.mo14490c((Activity) this);
            }
            super.onDestroy();
        } catch (Exception e) {
            CBLogging.m3993b("CBImpressionActivity", "onDestroy: " + e.toString());
        } catch (Throwable th) {
            super.onDestroy();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        try {
            super.onPause();
            if (this.f4356b != null) {
                this.f4356b.mo14488b((Activity) this);
                this.f4356b.mo14502k();
            }
        } catch (Exception e) {
            CBLogging.m3993b("CBImpressionActivity", "onPause: " + e.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        try {
            super.onResume();
            if (this.f4356b != null) {
                this.f4356b.mo14488b((Activity) this);
                this.f4356b.mo14503l();
            }
        } catch (Exception e) {
            CBLogging.m3993b("CBImpressionActivity", "onResume: " + e.toString());
        }
        Chartboost.setActivityAttrs(this);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        try {
            super.onStart();
            if (this.f4356b != null) {
                this.f4356b.mo14493d((Activity) this);
            }
        } catch (Exception e) {
            CBLogging.m3993b("CBImpressionActivity", "onStart: " + e.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        try {
            super.onStop();
            if (this.f4356b != null) {
                this.f4356b.mo14495e((Activity) this);
            }
        } catch (Exception e) {
            CBLogging.m3993b("CBImpressionActivity", "onStop: " + e.toString());
        }
    }
}
