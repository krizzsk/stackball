package com.applovin.impl.adview;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.C1086h;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p024ad.C1345a;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p026c.C1382d;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.adview.k */
class C1093k extends Dialog implements C1092j {

    /* renamed from: a */
    private final Activity f1976a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1469j f1977b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1505q f1978c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1072c f1979d;

    /* renamed from: e */
    private final C1345a f1980e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public RelativeLayout f1981f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1086h f1982g;

    C1093k(C1345a aVar, C1072c cVar, Activity activity, C1469j jVar) {
        super(activity, 16973840);
        if (aVar == null) {
            throw new IllegalArgumentException("No ad specified");
        } else if (cVar == null) {
            throw new IllegalArgumentException("No main view specified");
        } else if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (activity != null) {
            this.f1977b = jVar;
            this.f1978c = jVar.mo13139v();
            this.f1976a = activity;
            this.f1979d = cVar;
            this.f1980e = aVar;
            requestWindowFeature(1);
            setCancelable(false);
        } else {
            throw new IllegalArgumentException("No activity specified");
        }
    }

    /* renamed from: a */
    private int m1619a(int i) {
        return AppLovinSdkUtils.dpToPx(this.f1976a, i);
    }

    /* renamed from: a */
    private void m1621a(C1086h.C1087a aVar) {
        if (this.f1982g != null) {
            this.f1978c.mo13280d("ExpandedAdDialog", "Attempting to create duplicate close button");
            return;
        }
        C1086h a = C1086h.m1600a(aVar, this.f1976a);
        this.f1982g = a;
        a.setVisibility(8);
        this.f1982g.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C1093k.this.m1624c();
            }
        });
        this.f1982g.setClickable(false);
        int a2 = m1619a(((Integer) this.f1977b.mo13088a(C1369c.f3003co)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a2, a2);
        layoutParams.addRule(10);
        int i = 9;
        layoutParams.addRule(((Boolean) this.f1977b.mo13088a(C1369c.f3006cr)).booleanValue() ? 9 : 11);
        this.f1982g.mo11952a(a2);
        int a3 = m1619a(((Integer) this.f1977b.mo13088a(C1369c.f3005cq)).intValue());
        int a4 = m1619a(((Integer) this.f1977b.mo13088a(C1369c.f3004cp)).intValue());
        layoutParams.setMargins(a4, a3, a4, 0);
        this.f1981f.addView(this.f1982g, layoutParams);
        this.f1982g.bringToFront();
        int a5 = m1619a(((Integer) this.f1977b.mo13088a(C1369c.f3007cs)).intValue());
        View view = new View(this.f1976a);
        view.setBackgroundColor(0);
        int i2 = a2 + a5;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i2, i2);
        layoutParams2.addRule(10);
        if (!((Boolean) this.f1977b.mo13088a(C1369c.f3006cr)).booleanValue()) {
            i = 11;
        }
        layoutParams2.addRule(i);
        layoutParams2.setMargins(a4 - m1619a(5), a3 - m1619a(5), a4 - m1619a(5), 0);
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C1093k.this.f1982g.isClickable()) {
                    C1093k.this.f1982g.performClick();
                }
            }
        });
        this.f1981f.addView(view, layoutParams2);
        view.bringToFront();
    }

    /* renamed from: b */
    private void m1623b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f1979d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f1976a);
        this.f1981f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f1981f.setBackgroundColor(-1157627904);
        this.f1981f.addView(this.f1979d);
        if (!this.f1980e.mo12702l()) {
            m1621a(this.f1980e.mo12703m());
            m1626d();
        }
        setContentView(this.f1981f);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m1624c() {
        this.f1979d.mo11890a("javascript:al_onCloseTapped();", (Runnable) new Runnable() {
            public void run() {
                C1093k.this.dismiss();
            }
        });
    }

    /* renamed from: d */
    private void m1626d() {
        this.f1976a.runOnUiThread(new Runnable() {
            public void run() {
                try {
                    if (C1093k.this.f1982g == null) {
                        C1093k.this.m1624c();
                    }
                    C1093k.this.f1982g.setVisibility(0);
                    C1093k.this.f1982g.bringToFront();
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(((Long) C1093k.this.f1977b.mo13088a(C1369c.f3002cn)).longValue());
                    alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
                        public void onAnimationEnd(Animation animation) {
                            C1093k.this.f1982g.setClickable(true);
                        }

                        public void onAnimationRepeat(Animation animation) {
                        }

                        public void onAnimationStart(Animation animation) {
                        }
                    });
                    C1093k.this.f1982g.startAnimation(alphaAnimation);
                } catch (Throwable th) {
                    C1093k.this.f1978c.mo13278b("ExpandedAdDialog", "Unable to fade in close button", th);
                    C1093k.this.m1624c();
                }
            }
        });
    }

    /* renamed from: a */
    public C1345a mo11965a() {
        return this.f1980e;
    }

    public void dismiss() {
        C1382d statsManagerHelper = this.f1979d.getStatsManagerHelper();
        if (statsManagerHelper != null) {
            statsManagerHelper.mo12906e();
        }
        this.f1976a.runOnUiThread(new Runnable() {
            public void run() {
                C1093k.this.f1981f.removeView(C1093k.this.f1979d);
                C1093k.super.dismiss();
            }
        });
    }

    public void onBackPressed() {
        this.f1979d.mo11890a("javascript:al_onBackPressed();", (Runnable) new Runnable() {
            public void run() {
                C1093k.this.dismiss();
            }
        });
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m1623b();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f1976a.getWindow().getAttributes().flags, this.f1976a.getWindow().getAttributes().flags);
                if (this.f1980e.mo12741A()) {
                    window.addFlags(16777216);
                    return;
                }
                return;
            }
            this.f1978c.mo13281e("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
        } catch (Throwable th) {
            this.f1978c.mo13278b("ExpandedAdDialog", "Setting window flags failed.", th);
        }
    }
}
