package com.adcolony.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.adcolony.sdk.b */
class C0585b extends Activity {

    /* renamed from: k */
    static final int f200k = 0;

    /* renamed from: l */
    static final int f201l = 1;

    /* renamed from: a */
    C0589c f202a;

    /* renamed from: b */
    String f203b;

    /* renamed from: c */
    int f204c = -1;

    /* renamed from: d */
    int f205d;

    /* renamed from: e */
    boolean f206e;

    /* renamed from: f */
    boolean f207f;

    /* renamed from: g */
    boolean f208g;

    /* renamed from: h */
    boolean f209h;

    /* renamed from: i */
    boolean f210i;

    /* renamed from: j */
    boolean f211j;

    /* renamed from: com.adcolony.sdk.b$a */
    class C0586a implements C0685f0 {
        C0586a() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0585b.this.mo9361a(d0Var);
        }
    }

    C0585b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9424a(boolean z) {
        Iterator<Map.Entry<Integer, C0857v0>> it = this.f202a.mo9471m().entrySet().iterator();
        while (it.hasNext() && !isFinishing()) {
            C0857v0 v0Var = (C0857v0) it.next().getValue();
            if (!v0Var.mo9927f() && v0Var.mo9923b().isPlaying()) {
                v0Var.mo9928h();
            }
        }
        AdColonyInterstitial k = C0578a.m143c().mo9607k();
        if (k != null && k.mo9342j() && k.mo9334f().mo9694c() != null && z && this.f210i) {
            k.mo9334f().mo9691a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9425b(boolean z) {
        for (Map.Entry<Integer, C0857v0> value : this.f202a.mo9471m().entrySet()) {
            C0857v0 v0Var = (C0857v0) value.getValue();
            if (!v0Var.mo9927f() && !v0Var.mo9923b().isPlaying() && !C0578a.m143c().mo9612p().mo9784b()) {
                v0Var.mo9929i();
            }
        }
        AdColonyInterstitial k = C0578a.m143c().mo9607k();
        if (k != null && k.mo9342j() && k.mo9334f().mo9694c() != null) {
            if ((!z || !this.f210i) && this.f211j) {
                k.mo9334f().mo9691a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
            }
        }
    }

    public void onBackPressed() {
        C0897z0 b = C0894y.m1151b();
        C0894y.m1148a(b, "id", this.f202a.mo9441a());
        new C0645d0("AdSession.on_back_button", this.f202a.mo9469k(), b).mo9536d();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this instanceof AdColonyInterstitialActivity) {
            mo9422a();
        } else {
            ((AdColonyAdViewActivity) this).mo9248c();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C0578a.m145e() || C0578a.m143c().mo9609m() == null) {
            finish();
            return;
        }
        C0693i c = C0578a.m143c();
        this.f208g = false;
        C0589c m = c.mo9609m();
        this.f202a = m;
        m.mo9455d(false);
        if (C0849u0.m947g()) {
            this.f202a.mo9455d(true);
        }
        this.f203b = this.f202a.mo9441a();
        this.f205d = this.f202a.mo9469k();
        boolean multiWindowEnabled = c.mo9620x().getMultiWindowEnabled();
        this.f209h = multiWindowEnabled;
        if (multiWindowEnabled) {
            getWindow().addFlags(2048);
            getWindow().clearFlags(1024);
        } else {
            getWindow().addFlags(1024);
            getWindow().clearFlags(2048);
        }
        requestWindowFeature(1);
        getWindow().getDecorView().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        if (c.mo9620x().getKeepScreenOn()) {
            getWindow().addFlags(128);
        }
        ViewParent parent = this.f202a.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f202a);
        }
        setContentView(this.f202a);
        this.f202a.mo9465i().add(C0578a.m135a("AdSession.finish_fullscreen_ad", (C0685f0) new C0586a(), true));
        this.f202a.mo9467j().add("AdSession.finish_fullscreen_ad");
        mo9423a(this.f204c);
        if (!this.f202a.mo9473o()) {
            C0897z0 b = C0894y.m1151b();
            C0894y.m1148a(b, "id", this.f202a.mo9441a());
            C0894y.m1156b(b, "screen_width", this.f202a.mo9453d());
            C0894y.m1156b(b, "screen_height", this.f202a.mo9447b());
            new C0645d0("AdSession.on_fullscreen_ad_started", this.f202a.mo9469k(), b).mo9536d();
            this.f202a.mo9457e(true);
            return;
        }
        mo9422a();
    }

    public void onDestroy() {
        super.onDestroy();
        if (C0578a.m145e() && this.f202a != null && !this.f206e) {
            if ((Build.VERSION.SDK_INT < 24 || !C0849u0.m947g()) && !this.f202a.mo9477q()) {
                C0897z0 b = C0894y.m1151b();
                C0894y.m1148a(b, "id", this.f202a.mo9441a());
                new C0645d0("AdSession.on_error", this.f202a.mo9469k(), b).mo9536d();
                this.f208g = true;
            }
        }
    }

    public void onPause() {
        super.onPause();
        mo9424a(this.f207f);
        this.f207f = false;
    }

    public void onResume() {
        super.onResume();
        mo9422a();
        mo9425b(this.f207f);
        this.f207f = true;
        this.f211j = true;
    }

    public void onWindowFocusChanged(boolean z) {
        if (z && this.f207f) {
            C0578a.m143c().mo9569A().mo9794b(true);
            mo9425b(this.f207f);
            this.f210i = true;
        } else if (!z && this.f207f) {
            C0578a.m143c().mo9569A().mo9792a(true);
            mo9424a(this.f207f);
            this.f210i = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9422a() {
        Rect rect;
        C0693i c = C0578a.m143c();
        if (this.f202a == null) {
            this.f202a = c.mo9609m();
        }
        C0589c cVar = this.f202a;
        if (cVar != null) {
            cVar.mo9455d(false);
            if (C0849u0.m947g()) {
                this.f202a.mo9455d(true);
            }
            if (this.f209h) {
                rect = c.mo9611o().mo9755t();
            } else {
                rect = c.mo9611o().mo9754s();
            }
            if (rect.width() > 0 && rect.height() > 0) {
                C0897z0 b = C0894y.m1151b();
                C0897z0 b2 = C0894y.m1151b();
                float o = c.mo9611o().mo9750o();
                C0894y.m1156b(b2, "width", (int) (((float) rect.width()) / o));
                C0894y.m1156b(b2, "height", (int) (((float) rect.height()) / o));
                C0894y.m1156b(b2, "app_orientation", C0849u0.m938d(C0849u0.m945f()));
                C0894y.m1156b(b2, "x", 0);
                C0894y.m1156b(b2, "y", 0);
                C0894y.m1148a(b2, "ad_session_id", this.f202a.mo9441a());
                C0894y.m1156b(b, "screen_width", rect.width());
                C0894y.m1156b(b, "screen_height", rect.height());
                C0894y.m1148a(b, "ad_session_id", this.f202a.mo9441a());
                C0894y.m1156b(b, "id", this.f202a.mo9450c());
                this.f202a.setLayoutParams(new FrameLayout.LayoutParams(rect.width(), rect.height()));
                this.f202a.mo9449b(rect.width());
                this.f202a.mo9442a(rect.height());
                new C0645d0("MRAID.on_size_change", this.f202a.mo9469k(), b2).mo9536d();
                new C0645d0("AdContainer.on_orientation_change", this.f202a.mo9469k(), b).mo9536d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9361a(C0645d0 d0Var) {
        int d = C0894y.m1163d(d0Var.mo9532b(), "status");
        if ((d == 5 || d == 0 || d == 6 || d == 1) && !this.f206e) {
            C0693i c = C0578a.m143c();
            C0763o p = c.mo9612p();
            c.mo9598d(d0Var);
            if (p.mo9782a() != null) {
                p.mo9782a().dismiss();
                p.mo9783a((AlertDialog) null);
            }
            if (!this.f208g) {
                finish();
            }
            this.f206e = true;
            ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            c.mo9601e(false);
            C0897z0 b = C0894y.m1151b();
            C0894y.m1148a(b, "id", this.f202a.mo9441a());
            new C0645d0("AdSession.on_close", this.f202a.mo9469k(), b).mo9536d();
            c.mo9590a((C0589c) null);
            c.mo9588a((AdColonyInterstitial) null);
            c.mo9585a((AdColonyAdView) null);
            C0578a.m143c().mo9597d().mo9509f().remove(this.f202a.mo9441a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9423a(int i) {
        if (i == 0) {
            setRequestedOrientation(7);
        } else if (i != 1) {
            setRequestedOrientation(4);
        } else {
            setRequestedOrientation(6);
        }
        this.f204c = i;
    }
}
