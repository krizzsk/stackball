package com.p243my.target;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.p243my.target.C7409g0;
import com.p243my.target.C7589o7;
import com.p243my.target.C7596p1;
import com.p243my.target.C7605p4;
import com.p243my.target.C7649s4;
import com.p243my.target.C7657s7;
import com.p243my.target.C7720w4;
import com.p243my.target.common.models.ImageData;
import com.p243my.target.common.models.VideoData;
import java.util.List;

/* renamed from: com.my.target.u4 */
public final class C7688u4 implements C7605p4, C7657s7.C7658a, C7649s4.C7650a, C7589o7.C7590a, C7720w4.C7721a {

    /* renamed from: a */
    public final C7399f2 f19469a;

    /* renamed from: b */
    public final C7690b f19470b;

    /* renamed from: c */
    public final C7657s7 f19471c;

    /* renamed from: d */
    public final C7691c f19472d;

    /* renamed from: e */
    public final C7628q7 f19473e;

    /* renamed from: f */
    public final Handler f19474f;

    /* renamed from: g */
    public final Runnable f19475g = new Runnable() {
        public final void run() {
            C7688u4.this.mo51673s();
        }
    };

    /* renamed from: h */
    public C7562n4 f19476h;

    /* renamed from: i */
    public C7432h0 f19477i;

    /* renamed from: j */
    public C7689a f19478j = C7689a.DISABLED;

    /* renamed from: k */
    public long f19479k;

    /* renamed from: l */
    public long f19480l;

    /* renamed from: m */
    public boolean f19481m;

    /* renamed from: n */
    public boolean f19482n;

    /* renamed from: com.my.target.u4$a */
    public enum C7689a {
        DISABLED,
        RULED_BY_POST,
        RULED_BY_VIDEO
    }

    /* renamed from: com.my.target.u4$b */
    public interface C7690b extends C7605p4.C7606a {
        /* renamed from: a */
        void mo51678a(Context context);
    }

    /* renamed from: com.my.target.u4$c */
    public static class C7691c implements Runnable {

        /* renamed from: a */
        public final C7688u4 f19487a;

        public C7691c(C7688u4 u4Var) {
            this.f19487a = u4Var;
        }

        public void run() {
            if (this.f19487a.mo51672r()) {
                this.f19487a.mo51674t();
            } else {
                this.f19487a.mo51676v();
            }
        }
    }

    public C7688u4(C7565n7 n7Var, C7399f2 f2Var, C7690b bVar) {
        this.f19469a = f2Var;
        this.f19470b = bVar;
        this.f19474f = n7Var.mo51014d();
        C7628q7 e = n7Var.mo51015e();
        this.f19473e = e;
        e.setColor(f2Var.getPromoStyleSettings().mo51720h());
        C7589o7 a = n7Var.mo51005a((C7589o7.C7590a) this);
        a.setBanner(f2Var);
        C7413g2<VideoData> videoBanner = f2Var.getVideoBanner();
        List<C7342c2> interstitialAdCards = f2Var.getInterstitialAdCards();
        if (!interstitialAdCards.isEmpty()) {
            C7388e8 c = n7Var.mo51013c();
            n7Var.mo51009a(c, interstitialAdCards, (C7720w4.C7721a) this);
            this.f19471c = n7Var.mo51007a(f2Var, a.mo51305a(), e.mo51439a(), c, this);
        } else if (videoBanner != null) {
            C7757y5 b = n7Var.mo51012b();
            C7657s7 a2 = n7Var.mo51007a(f2Var, a.mo51305a(), e.mo51439a(), b, this);
            this.f19471c = a2;
            b.mo51888a(videoBanner.getWidth(), videoBanner.getHeight());
            this.f19476h = n7Var.mo51004a(videoBanner, b, (C7649s4.C7650a) this);
            e.setMaxTime(videoBanner.getDuration());
            ImageData preview = videoBanner.getPreview();
            a2.setBackgroundImage(preview == null ? f2Var.getImage() : preview);
        } else {
            C7657s7 a3 = n7Var.mo51007a(f2Var, a.mo51305a(), e.mo51439a(), (View) null, this);
            this.f19471c = a3;
            a3.mo51524f();
            a3.setBackgroundImage(f2Var.getImage());
        }
        this.f19471c.setBanner(f2Var);
        this.f19472d = new C7691c(this);
        mo51667a(f2Var);
        bVar.mo51334a((C7768z1) f2Var, this.f19471c.mo51515a());
        mo51668a(f2Var.getAdChoices());
    }

    /* renamed from: a */
    public static C7688u4 m20571a(C7565n7 n7Var, C7399f2 f2Var, C7690b bVar) {
        return new C7688u4(n7Var, f2Var, bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m20572a(Context context) {
        mo51671q();
    }

    /* renamed from: a */
    public void mo50705a() {
        if (this.f19478j != C7689a.DISABLED && this.f19479k > 0) {
            mo51676v();
        }
        mo51677w();
    }

    /* renamed from: a */
    public void mo51495a(float f, float f2) {
        if (this.f19478j == C7689a.RULED_BY_VIDEO) {
            this.f19479k = (long) (((float) this.f19480l) - (1000.0f * f));
        }
        this.f19473e.setTimeChanged(f);
    }

    /* renamed from: a */
    public final void mo51667a(C7399f2 f2Var) {
        C7689a aVar;
        C7413g2<VideoData> videoBanner = f2Var.getVideoBanner();
        if (videoBanner != null && videoBanner.isAutoPlay()) {
            if (videoBanner.isAllowClose()) {
                long allowCloseDelay = (long) (videoBanner.getAllowCloseDelay() * 1000.0f);
                this.f19480l = allowCloseDelay;
                this.f19479k = allowCloseDelay;
                if (allowCloseDelay > 0) {
                    aVar = C7689a.RULED_BY_VIDEO;
                }
                mo51674t();
                return;
            }
            this.f19471c.mo51523e();
            return;
        } else if (f2Var.isAllowClose()) {
            long allowCloseDelay2 = (long) (f2Var.getAllowCloseDelay() * 1000.0f);
            this.f19480l = allowCloseDelay2;
            this.f19479k = allowCloseDelay2;
            if (allowCloseDelay2 > 0) {
                C7374e0.m18989a("banner will be allowed to close in " + this.f19479k + " millis");
                aVar = C7689a.RULED_BY_POST;
            } else {
                C7374e0.m18989a("banner is allowed to close");
                mo51674t();
                return;
            }
        } else {
            this.f19478j = C7689a.DISABLED;
            this.f19471c.mo51523e();
            return;
        }
        this.f19478j = aVar;
        mo51676v();
    }

    /* renamed from: a */
    public final void mo51668a(C7596p1 p1Var) {
        List<C7596p1.C7597a> a;
        if (p1Var != null && (a = p1Var.mo51315a()) != null) {
            C7432h0 a2 = C7432h0.m19222a(a);
            this.f19477i = a2;
            a2.mo50261a((C7409g0.C7411b) new C7409g0.C7411b() {
                /* renamed from: a */
                public final void mo49488a(Context context) {
                    C7688u4.this.m20572a(context);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo51530a(C7768z1 z1Var) {
        if (z1Var != null) {
            this.f19470b.mo51335a(z1Var, (String) null, mo50719j().getContext());
        } else {
            this.f19470b.mo51335a(this.f19469a, (String) null, mo50719j().getContext());
        }
    }

    /* renamed from: a */
    public void mo51531a(boolean z) {
        C7698v1 promoStyleSettings = this.f19469a.getPromoStyleSettings();
        int b = promoStyleSettings.mo51708b();
        int argb = Color.argb((int) (promoStyleSettings.mo51710c() * 255.0f), Color.red(b), Color.green(b), Color.blue(b));
        C7657s7 s7Var = this.f19471c;
        if (z) {
            b = argb;
        }
        s7Var.setPanelColor(b);
    }

    /* renamed from: b */
    public void mo50711b() {
        C7562n4 n4Var = this.f19476h;
        if (n4Var != null) {
            n4Var.mo50991i();
        }
        this.f19474f.removeCallbacks(this.f19472d);
        mo51677w();
    }

    /* renamed from: b */
    public void mo51532b(int i) {
        C7562n4 n4Var = this.f19476h;
        if (n4Var != null) {
            n4Var.mo50993q();
        }
        mo51677w();
    }

    /* renamed from: b */
    public void mo51669b(C7768z1 z1Var) {
        C7741x8.m20827c((List<C7328b3>) z1Var.getStatHolder().mo49800a("playbackStarted"), this.f19471c.mo51515a().getContext());
        C7741x8.m20827c((List<C7328b3>) z1Var.getStatHolder().mo49800a("show"), this.f19471c.mo51515a().getContext());
    }

    /* renamed from: c */
    public void mo51496c() {
        this.f19471c.mo51521c(false);
        this.f19471c.mo51518a(true);
        this.f19471c.mo51524f();
        this.f19471c.mo51519b(false);
        this.f19471c.mo51522d();
        this.f19473e.setVisible(false);
        mo51674t();
    }

    /* renamed from: c */
    public void mo51670c(C7768z1 z1Var) {
        C7741x8.m20827c((List<C7328b3>) z1Var.getStatHolder().mo49800a("render"), this.f19471c.mo51515a().getContext());
    }

    /* renamed from: d */
    public void mo51533d() {
        C7596p1 adChoices = this.f19469a.getAdChoices();
        if (adChoices != null) {
            mo51677w();
            C7432h0 h0Var = this.f19477i;
            if (h0Var == null || !h0Var.mo50266c()) {
                Context context = this.f19471c.mo51515a().getContext();
                C7432h0 h0Var2 = this.f19477i;
                if (h0Var2 == null) {
                    C7534l8.m19712a(adChoices.mo51317b(), context);
                } else {
                    h0Var2.mo50260a(context);
                }
            }
        }
    }

    public void destroy() {
        C7562n4 n4Var = this.f19476h;
        if (n4Var != null) {
            n4Var.destroy();
        }
        mo51677w();
    }

    /* renamed from: e */
    public void mo50717e() {
        C7562n4 n4Var = this.f19476h;
        if (n4Var != null) {
            n4Var.mo50991i();
        }
        mo51677w();
    }

    /* renamed from: f */
    public void mo51497f() {
        this.f19471c.mo51521c(true);
        this.f19471c.mo51517a(0, (String) null);
        this.f19471c.mo51519b(false);
    }

    /* renamed from: g */
    public void mo51498g() {
        this.f19471c.mo51521c(true);
        this.f19471c.mo51524f();
        this.f19471c.mo51518a(false);
        this.f19471c.mo51519b(true);
        this.f19473e.setVisible(true);
    }

    public View getCloseButton() {
        return this.f19471c.getCloseButton();
    }

    /* renamed from: h */
    public void mo51499h() {
        this.f19471c.mo51521c(false);
        this.f19471c.mo51518a(false);
        this.f19471c.mo51524f();
        this.f19471c.mo51519b(false);
    }

    /* renamed from: i */
    public void mo51534i() {
        C7562n4 n4Var = this.f19476h;
        if (n4Var != null) {
            n4Var.mo50988d();
        }
    }

    /* renamed from: j */
    public View mo50719j() {
        return this.f19471c.mo51515a();
    }

    /* renamed from: k */
    public void mo51500k() {
        this.f19471c.mo51521c(false);
        this.f19471c.mo51518a(false);
        this.f19471c.mo51524f();
        this.f19471c.mo51519b(false);
        this.f19473e.setVisible(true);
    }

    /* renamed from: l */
    public void mo51501l() {
        this.f19471c.mo51521c(true);
        this.f19471c.mo51517a(0, (String) null);
        this.f19471c.mo51519b(false);
        this.f19473e.setVisible(false);
    }

    /* renamed from: m */
    public void mo51535m() {
        C7562n4 n4Var = this.f19476h;
        if (n4Var != null) {
            n4Var.mo50990e();
        }
        mo51677w();
        this.f19470b.mo51332a();
    }

    /* renamed from: n */
    public void mo51536n() {
        mo51677w();
        String adIconClickLink = this.f19469a.getAdIconClickLink();
        if (adIconClickLink != null) {
            C7534l8.m19712a(adIconClickLink, this.f19471c.mo51515a().getContext());
        }
    }

    /* renamed from: o */
    public void mo51537o() {
        if (!this.f19482n) {
            this.f19471c.mo51521c(true);
            this.f19471c.mo51517a(1, (String) null);
            this.f19471c.mo51519b(false);
            mo51677w();
            this.f19474f.postDelayed(this.f19475g, 4000);
            this.f19481m = true;
        } else if (this.f19469a.getClickArea().f19281f) {
            mo51530a((C7768z1) null);
        }
    }

    public void onVideoCompleted() {
        C7413g2<VideoData> videoBanner = this.f19469a.getVideoBanner();
        if (videoBanner != null) {
            if (videoBanner.isAllowReplay()) {
                this.f19471c.mo51517a(2, !TextUtils.isEmpty(videoBanner.getReplayActionText()) ? videoBanner.getReplayActionText() : null);
                this.f19471c.mo51521c(true);
            } else {
                this.f19482n = true;
            }
        }
        this.f19471c.mo51518a(true);
        this.f19471c.mo51519b(false);
        this.f19473e.setVisible(false);
        this.f19473e.setTimeChanged(0.0f);
        this.f19470b.mo51678a(this.f19471c.mo51515a().getContext());
        mo51674t();
    }

    public void onVolumeChanged(float f) {
        this.f19471c.setSoundState(f != 0.0f);
    }

    /* renamed from: p */
    public void mo51538p() {
        if (this.f19481m) {
            mo51673s();
        }
    }

    /* renamed from: q */
    public void mo51671q() {
        C7562n4 n4Var = this.f19476h;
        if (n4Var != null) {
            n4Var.destroy();
        }
        mo51677w();
        this.f19470b.mo51333a((C7768z1) this.f19469a, mo50719j().getContext());
    }

    /* renamed from: r */
    public final boolean mo51672r() {
        C7689a aVar = this.f19478j;
        if (aVar == C7689a.DISABLED) {
            return true;
        }
        if (aVar == C7689a.RULED_BY_POST) {
            this.f19479k -= 200;
        }
        return this.f19479k <= 0;
    }

    /* renamed from: s */
    public final void mo51673s() {
        if (this.f19481m) {
            mo51677w();
            this.f19471c.mo51521c(false);
            this.f19471c.mo51524f();
            this.f19481m = false;
        }
    }

    /* renamed from: t */
    public final void mo51674t() {
        this.f19471c.mo51520c();
        this.f19474f.removeCallbacks(this.f19472d);
        this.f19478j = C7689a.DISABLED;
    }

    /* renamed from: u */
    public void mo51675u() {
        C7562n4 n4Var = this.f19476h;
        if (n4Var != null) {
            n4Var.mo50992k();
        }
    }

    /* renamed from: v */
    public final void mo51676v() {
        this.f19474f.removeCallbacks(this.f19472d);
        this.f19474f.postDelayed(this.f19472d, 200);
        float f = (float) this.f19480l;
        long j = this.f19479k;
        this.f19471c.mo51516a((int) ((j / 1000) + 1), (f - ((float) j)) / f);
    }

    /* renamed from: w */
    public final void mo51677w() {
        this.f19481m = false;
        this.f19474f.removeCallbacks(this.f19475g);
    }
}
