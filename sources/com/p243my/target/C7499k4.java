package com.p243my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import com.p243my.target.C7409g0;
import com.p243my.target.C7596p1;
import com.p243my.target.C7733x4;
import com.p243my.target.C7774z5;
import com.p243my.target.common.models.ImageData;
import java.util.List;

/* renamed from: com.my.target.k4 */
public class C7499k4 implements C7774z5.C7775a, C7733x4 {

    /* renamed from: a */
    public final C7774z5 f18881a;

    /* renamed from: b */
    public final C7422g6 f18882b;

    /* renamed from: c */
    public final FrameLayout f18883c;

    /* renamed from: d */
    public final Handler f18884d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    public final C7722w5 f18885e;

    /* renamed from: f */
    public C7504e f18886f;

    /* renamed from: g */
    public C7503d f18887g;

    /* renamed from: h */
    public C7733x4.C7734a f18888h;

    /* renamed from: i */
    public long f18889i;

    /* renamed from: j */
    public long f18890j;

    /* renamed from: k */
    public C7359d2 f18891k;

    /* renamed from: l */
    public long f18892l;

    /* renamed from: m */
    public long f18893m;

    /* renamed from: n */
    public C7432h0 f18894n;

    /* renamed from: com.my.target.k4$a */
    public class C7500a implements View.OnClickListener {
        public C7500a() {
        }

        public void onClick(View view) {
            C7499k4.this.mo50713c();
        }
    }

    /* renamed from: com.my.target.k4$b */
    public class C7501b implements C7409g0.C7411b {

        /* renamed from: a */
        public final /* synthetic */ C7768z1 f18896a;

        public C7501b(C7768z1 z1Var) {
            this.f18896a = z1Var;
        }

        /* renamed from: a */
        public void mo49488a(Context context) {
            if (C7499k4.this.f18888h != null) {
                C7499k4.this.f18888h.mo51333a(this.f18896a, context);
            }
        }
    }

    /* renamed from: com.my.target.k4$c */
    public static class C7502c implements View.OnClickListener {

        /* renamed from: a */
        public final C7499k4 f18898a;

        public C7502c(C7499k4 k4Var) {
            this.f18898a = k4Var;
        }

        public void onClick(View view) {
            C7733x4.C7734a d = this.f18898a.mo50715d();
            if (d != null) {
                d.mo51332a();
            }
        }
    }

    /* renamed from: com.my.target.k4$d */
    public static class C7503d implements Runnable {

        /* renamed from: a */
        public final C7499k4 f18899a;

        public C7503d(C7499k4 k4Var) {
            this.f18899a = k4Var;
        }

        public void run() {
            C7733x4.C7734a d = this.f18899a.mo50715d();
            if (d != null) {
                d.mo51761b(this.f18899a.f18883c.getContext());
            }
        }
    }

    /* renamed from: com.my.target.k4$e */
    public static class C7504e implements Runnable {

        /* renamed from: a */
        public final C7422g6 f18900a;

        public C7504e(C7422g6 g6Var) {
            this.f18900a = g6Var;
        }

        public void run() {
            C7374e0.m18989a("banner became just closeable");
            this.f18900a.setVisibility(0);
        }
    }

    public C7499k4(Context context) {
        C7774z5 z5Var = new C7774z5(context);
        this.f18881a = z5Var;
        C7422g6 g6Var = new C7422g6(context);
        this.f18882b = g6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18883c = frameLayout;
        g6Var.setContentDescription("Close");
        C7761y8.m20947b(g6Var, "close_button");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = GravityCompat.END;
        g6Var.setVisibility(8);
        g6Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 1;
        z5Var.setLayoutParams(layoutParams2);
        frameLayout.addView(z5Var);
        if (g6Var.getParent() == null) {
            frameLayout.addView(g6Var);
        }
        Bitmap a = C7607p5.m20092a(C7761y8.m20950c(context).mo51902b(28));
        if (a != null) {
            g6Var.mo50226a(a, false);
        }
        C7722w5 w5Var = new C7722w5(context);
        this.f18885e = w5Var;
        int a2 = C7761y8.m20931a(10, context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(a2, a2, a2, a2);
        frameLayout.addView(w5Var, layoutParams3);
    }

    /* renamed from: a */
    public static C7499k4 m19580a(Context context) {
        return new C7499k4(context);
    }

    /* renamed from: a */
    public void mo50705a() {
        long j = this.f18890j;
        if (j > 0) {
            mo50707a(j);
        }
        long j2 = this.f18893m;
        if (j2 > 0) {
            mo50712b(j2);
        }
    }

    /* renamed from: a */
    public void mo50706a(int i) {
        this.f18883c.removeView(this.f18881a);
        this.f18881a.mo49584a(i);
    }

    /* renamed from: a */
    public final void mo50707a(long j) {
        C7504e eVar = this.f18886f;
        if (eVar != null) {
            this.f18884d.removeCallbacks(eVar);
            this.f18889i = System.currentTimeMillis();
            this.f18884d.postDelayed(this.f18886f, j);
        }
    }

    /* renamed from: a */
    public void mo49734a(WebView webView) {
        C7733x4.C7734a aVar = this.f18888h;
        if (aVar != null) {
            aVar.mo51759a(webView);
        }
    }

    /* renamed from: a */
    public void mo50708a(C7665t2 t2Var, C7359d2 d2Var) {
        this.f18891k = d2Var;
        this.f18881a.setBannerWebViewListener(this);
        String source = d2Var.getSource();
        if (source != null) {
            this.f18881a.setData(source);
            ImageData closeIcon = d2Var.getCloseIcon();
            if (closeIcon != null) {
                this.f18882b.mo50226a(closeIcon.getBitmap(), false);
            }
            this.f18882b.setOnClickListener(new C7502c(this));
            if (d2Var.getAllowCloseDelay() > 0.0f) {
                C7374e0.m18989a("banner will be allowed to close in " + d2Var.getAllowCloseDelay() + " seconds");
                this.f18886f = new C7504e(this.f18882b);
                long allowCloseDelay = (long) (d2Var.getAllowCloseDelay() * 1000.0f);
                this.f18890j = allowCloseDelay;
                mo50707a(allowCloseDelay);
            } else {
                C7374e0.m18989a("banner is allowed to close");
                this.f18882b.setVisibility(0);
            }
            float timeToReward = d2Var.getTimeToReward();
            if (timeToReward > 0.0f) {
                this.f18887g = new C7503d(this);
                long j = ((long) timeToReward) * 1000;
                this.f18893m = j;
                mo50712b(j);
            }
            mo50710a((C7768z1) d2Var);
            C7733x4.C7734a aVar = this.f18888h;
            if (aVar != null) {
                aVar.mo51334a((C7768z1) d2Var, mo50719j());
                return;
            }
            return;
        }
        mo50714c("failed to load, null source");
    }

    /* renamed from: a */
    public void mo50709a(C7733x4.C7734a aVar) {
        this.f18888h = aVar;
    }

    /* renamed from: a */
    public final void mo50710a(C7768z1 z1Var) {
        C7596p1 adChoices = z1Var.getAdChoices();
        if (adChoices == null) {
            this.f18885e.setVisibility(8);
            return;
        }
        this.f18885e.setImageBitmap(adChoices.mo51318c().getBitmap());
        this.f18885e.setOnClickListener(new C7500a());
        List<C7596p1.C7597a> a = adChoices.mo51315a();
        if (a != null) {
            C7432h0 a2 = C7432h0.m19222a(a);
            this.f18894n = a2;
            a2.mo50261a((C7409g0.C7411b) new C7501b(z1Var));
        }
    }

    /* renamed from: a */
    public void mo49737a(String str) {
        mo50714c(str);
    }

    /* renamed from: b */
    public void mo50711b() {
        if (this.f18889i > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f18889i;
            if (currentTimeMillis > 0) {
                long j = this.f18890j;
                if (currentTimeMillis < j) {
                    this.f18890j = j - currentTimeMillis;
                }
            }
            this.f18890j = 0;
        }
        if (this.f18892l > 0) {
            long currentTimeMillis2 = System.currentTimeMillis() - this.f18892l;
            if (currentTimeMillis2 > 0) {
                long j2 = this.f18893m;
                if (currentTimeMillis2 < j2) {
                    this.f18893m = j2 - currentTimeMillis2;
                }
            }
            this.f18893m = 0;
        }
        C7503d dVar = this.f18887g;
        if (dVar != null) {
            this.f18884d.removeCallbacks(dVar);
        }
        C7504e eVar = this.f18886f;
        if (eVar != null) {
            this.f18884d.removeCallbacks(eVar);
        }
    }

    /* renamed from: b */
    public final void mo50712b(long j) {
        C7503d dVar = this.f18887g;
        if (dVar != null) {
            this.f18884d.removeCallbacks(dVar);
            this.f18892l = System.currentTimeMillis();
            this.f18884d.postDelayed(this.f18887g, j);
        }
    }

    /* renamed from: b */
    public void mo49740b(String str) {
        C7733x4.C7734a aVar = this.f18888h;
        if (aVar != null) {
            aVar.mo51335a(this.f18891k, str, mo50719j().getContext());
        }
    }

    /* renamed from: c */
    public void mo50713c() {
        C7596p1 adChoices;
        C7359d2 d2Var = this.f18891k;
        if (d2Var != null && (adChoices = d2Var.getAdChoices()) != null) {
            C7432h0 h0Var = this.f18894n;
            if (h0Var == null || !h0Var.mo50266c()) {
                Context context = mo50719j().getContext();
                if (h0Var == null) {
                    C7534l8.m19712a(adChoices.mo51317b(), context);
                } else {
                    h0Var.mo50260a(context);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo50714c(String str) {
        C7733x4.C7734a aVar = this.f18888h;
        if (aVar != null) {
            aVar.onNoAd(str);
        }
    }

    /* renamed from: d */
    public C7733x4.C7734a mo50715d() {
        return this.f18888h;
    }

    public void destroy() {
        mo50706a(0);
    }

    /* renamed from: e */
    public void mo50717e() {
    }

    public View getCloseButton() {
        return this.f18882b;
    }

    /* renamed from: j */
    public View mo50719j() {
        return this.f18883c;
    }
}
