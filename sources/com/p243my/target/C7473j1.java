package com.p243my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.audio.AacUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p243my.target.C7305a5;
import com.p243my.target.C7311a9;
import com.p243my.target.C7409g0;
import com.p243my.target.C7524l3;
import com.p243my.target.C7599p3;
import com.p243my.target.C7644s0;
import com.p243my.target.C7749y4;
import com.p243my.target.C7772z4;
import com.p243my.target.ads.MyTargetView;
import com.p243my.target.common.models.VideoData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.my.target.j1 */
public final class C7473j1 implements C7644s0 {

    /* renamed from: a */
    public final C7599p3 f18806a;

    /* renamed from: b */
    public final MyTargetView f18807b;

    /* renamed from: c */
    public final C7523l2 f18808c;

    /* renamed from: d */
    public final Context f18809d;

    /* renamed from: e */
    public final C7772z4.C7773a f18810e = new C7476c(this);

    /* renamed from: f */
    public final ArrayList<C7303a3> f18811f;

    /* renamed from: g */
    public final C7311a9 f18812g;

    /* renamed from: h */
    public final C7409g0 f18813h;

    /* renamed from: i */
    public final C7524l3.C7525a f18814i;

    /* renamed from: j */
    public C7772z4 f18815j;

    /* renamed from: k */
    public C7644s0.C7645a f18816k;

    /* renamed from: l */
    public boolean f18817l;

    /* renamed from: m */
    public C7524l3 f18818m;

    /* renamed from: com.my.target.j1$a */
    public class C7474a extends C7311a9.C7314c {

        /* renamed from: a */
        public final /* synthetic */ C7768z1 f18819a;

        public C7474a(C7768z1 z1Var) {
            this.f18819a = z1Var;
        }

        /* renamed from: a */
        public void mo49625a() {
            C7374e0.m18989a("Ad shown, banner Id = " + this.f18819a.getId());
            if (C7473j1.this.f18818m != null) {
                C7473j1.this.f18818m.mo50800b();
                C7473j1.this.f18818m.mo50802b(C7473j1.this.f18809d);
            }
            if (C7473j1.this.f18816k != null) {
                C7473j1.this.f18816k.mo50637d();
            }
        }
    }

    /* renamed from: com.my.target.j1$b */
    public class C7475b implements C7409g0.C7411b {
        public C7475b() {
        }

        /* renamed from: a */
        public void mo49488a(Context context) {
            C7473j1.this.mo50576g();
        }
    }

    /* renamed from: com.my.target.j1$c */
    public static class C7476c implements C7772z4.C7773a {

        /* renamed from: a */
        public final C7473j1 f18822a;

        public C7476c(C7473j1 j1Var) {
            this.f18822a = j1Var;
        }

        /* renamed from: a */
        public void mo50582a(WebView webView) {
            this.f18822a.mo50568a(webView);
        }

        /* renamed from: a */
        public void mo50583a(C7768z1 z1Var) {
            this.f18822a.mo50570a(z1Var);
        }

        /* renamed from: a */
        public void mo50584a(C7768z1 z1Var, String str) {
            this.f18822a.mo50571a(z1Var, str);
        }
    }

    /* renamed from: com.my.target.j1$d */
    public static class C7477d implements C7305a5.C7306a {

        /* renamed from: a */
        public final C7473j1 f18823a;

        public C7477d(C7473j1 j1Var) {
            this.f18823a = j1Var;
        }

        public void onLoad() {
            this.f18823a.mo50579k();
        }

        public void onNoAd(String str) {
            this.f18823a.mo50572a(str);
        }
    }

    /* renamed from: com.my.target.j1$e */
    public static class C7478e implements C7749y4.C7753d {

        /* renamed from: a */
        public final C7473j1 f18824a;

        public C7478e(C7473j1 j1Var) {
            this.f18824a = j1Var;
        }

        /* renamed from: a */
        public void mo50585a() {
            this.f18824a.mo50577h();
        }

        /* renamed from: a */
        public void mo50586a(float f, float f2, C7523l2 l2Var, Context context) {
            this.f18824a.mo50567a(f, f2, context);
        }

        /* renamed from: a */
        public void mo50587a(String str, C7523l2 l2Var, Context context) {
            this.f18824a.mo50573a(str, l2Var, context);
        }

        /* renamed from: b */
        public void mo50588b() {
            this.f18824a.mo50578j();
        }

        public void onLoad() {
            this.f18824a.mo50579k();
        }

        public void onNoAd(String str) {
            this.f18824a.mo50572a(str);
        }
    }

    public C7473j1(MyTargetView myTargetView, C7523l2 l2Var, C7524l3.C7525a aVar) {
        this.f18807b = myTargetView;
        this.f18808c = l2Var;
        this.f18809d = myTargetView.getContext();
        this.f18814i = aVar;
        ArrayList<C7303a3> arrayList = new ArrayList<>();
        this.f18811f = arrayList;
        arrayList.addAll(l2Var.getStatHolder().mo49807c());
        this.f18812g = C7311a9.m18722a(l2Var.getViewability(), l2Var.getStatHolder());
        this.f18813h = C7409g0.m19159a(l2Var.getAdChoices());
        this.f18806a = C7599p3.m20069a(l2Var, 1, (C7413g2<VideoData>) null, myTargetView.getContext());
    }

    /* renamed from: a */
    public static C7473j1 m19467a(MyTargetView myTargetView, C7523l2 l2Var, C7524l3.C7525a aVar) {
        return new C7473j1(myTargetView, l2Var, aVar);
    }

    /* renamed from: a */
    public void mo50044a() {
        C7772z4 z4Var = this.f18815j;
        if (z4Var != null) {
            z4Var.mo49732a();
        }
        this.f18817l = true;
        this.f18812g.mo49623b(this.f18807b);
    }

    /* renamed from: a */
    public void mo50567a(float f, float f2, Context context) {
        if (!this.f18811f.isEmpty()) {
            float f3 = f2 - f;
            ArrayList arrayList = new ArrayList();
            Iterator<C7303a3> it = this.f18811f.iterator();
            while (it.hasNext()) {
                C7303a3 next = it.next();
                float e = next.mo49575e();
                if (e < 0.0f && next.mo49574d() >= 0.0f) {
                    e = (f2 / 100.0f) * next.mo49574d();
                }
                if (e >= 0.0f && e <= f3) {
                    arrayList.add(next);
                    it.remove();
                }
            }
            C7741x8.m20827c((List<C7328b3>) arrayList, context);
        }
    }

    /* renamed from: a */
    public void mo50568a(WebView webView) {
        C7772z4 z4Var;
        if (this.f18806a != null && (z4Var = this.f18815j) != null) {
            C7363d6 view = z4Var.getView();
            this.f18806a.mo51324a((View) webView, new C7599p3.C7602c(view.getAdChoicesView(), 3));
            this.f18806a.mo51329c();
        }
    }

    /* renamed from: a */
    public void mo50046a(MyTargetView.AdSize adSize) {
        C7772z4 z4Var = this.f18815j;
        if (z4Var != null) {
            z4Var.getView().mo49994a(adSize.getWidthPixels(), adSize.getHeightPixels());
        }
    }

    /* renamed from: a */
    public final void mo50569a(C7363d6 d6Var) {
        if (this.f18815j != null) {
            MyTargetView.AdSize size = this.f18807b.getSize();
            this.f18815j.getView().mo49994a(size.getWidthPixels(), size.getHeightPixels());
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        d6Var.setLayoutParams(layoutParams);
        this.f18807b.removeAllViews();
        this.f18807b.addView(d6Var);
        if (this.f18808c.getAdChoices() != null) {
            this.f18813h.mo50162a(d6Var.getAdChoicesView(), new C7475b());
        }
    }

    /* renamed from: a */
    public void mo50048a(C7644s0.C7645a aVar) {
        this.f18816k = aVar;
    }

    /* renamed from: a */
    public void mo50570a(C7768z1 z1Var) {
        this.f18812g.mo49622b();
        this.f18812g.mo49620a((C7311a9.C7314c) new C7474a(z1Var));
        if (this.f18817l) {
            this.f18812g.mo49623b(this.f18807b);
        }
        C7741x8.m20827c((List<C7328b3>) z1Var.getStatHolder().mo49800a("playbackStarted"), this.f18807b.getContext());
    }

    /* renamed from: a */
    public void mo50571a(C7768z1 z1Var, String str) {
        C7644s0.C7645a aVar = this.f18816k;
        if (aVar != null) {
            aVar.onClick();
        }
        C7424g8 a = C7424g8.m19196a();
        if (TextUtils.isEmpty(str)) {
            a.mo50243a(z1Var, this.f18807b.getContext());
        } else {
            a.mo50244a(z1Var, str, this.f18807b.getContext());
        }
    }

    /* renamed from: a */
    public void mo50572a(String str) {
        C7644s0.C7645a aVar = this.f18816k;
        if (aVar != null) {
            aVar.onNoAd(str);
        }
    }

    /* renamed from: a */
    public void mo50573a(String str, C7523l2 l2Var, Context context) {
        C7741x8.m20827c((List<C7328b3>) l2Var.getStatHolder().mo49800a(str), context);
    }

    /* renamed from: b */
    public void mo50049b() {
        C7772z4 z4Var = this.f18815j;
        if (z4Var != null) {
            z4Var.mo49739b();
        }
        this.f18817l = false;
        this.f18812g.mo49622b();
    }

    /* renamed from: c */
    public String mo50574c() {
        return "myTarget";
    }

    /* renamed from: d */
    public float mo50575d() {
        return 0.0f;
    }

    public void destroy() {
        this.f18812g.mo49622b();
        this.f18813h.mo50160a();
        C7599p3 p3Var = this.f18806a;
        if (p3Var != null) {
            p3Var.mo51319a();
        }
        C7772z4 z4Var = this.f18815j;
        if (z4Var != null) {
            z4Var.mo49733a(this.f18806a != null ? AacUtil.AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND : 0);
            this.f18815j = null;
        }
    }

    /* renamed from: e */
    public void mo50051e() {
        C7772z4 z4Var = this.f18815j;
        if (z4Var != null) {
            z4Var.mo49738a(this.f18806a == null);
        }
    }

    /* renamed from: f */
    public void mo50052f() {
        this.f18817l = true;
        C7772z4 z4Var = this.f18815j;
        if (z4Var != null) {
            z4Var.mo49743f();
        }
    }

    /* renamed from: g */
    public void mo50576g() {
        C7741x8.m20827c((List<C7328b3>) this.f18808c.getStatHolder().mo49800a("closedByUser"), this.f18809d);
        C7644s0.C7645a aVar = this.f18816k;
        if (aVar != null) {
            aVar.mo50636c();
        }
    }

    /* renamed from: h */
    public void mo50577h() {
        C7644s0.C7645a aVar = this.f18816k;
        if (aVar != null) {
            aVar.mo50634a();
        }
    }

    /* renamed from: i */
    public void mo50053i() {
        this.f18818m = this.f18814i.mo50806b();
        if (CampaignEx.JSON_KEY_MRAID.equals(this.f18808c.getType())) {
            mo50580l();
        } else {
            mo50581m();
        }
    }

    /* renamed from: j */
    public void mo50578j() {
        C7644s0.C7645a aVar = this.f18816k;
        if (aVar != null) {
            aVar.mo50635b();
        }
    }

    /* renamed from: k */
    public void mo50579k() {
        C7644s0.C7645a aVar = this.f18816k;
        if (aVar != null) {
            aVar.onLoad();
        }
    }

    /* renamed from: l */
    public final void mo50580l() {
        C7749y4 y4Var;
        C7772z4 z4Var = this.f18815j;
        if (z4Var instanceof C7749y4) {
            y4Var = (C7749y4) z4Var;
        } else {
            if (z4Var != null) {
                z4Var.mo49736a((C7772z4.C7773a) null);
                this.f18815j.mo49733a(this.f18806a != null ? AacUtil.AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND : 0);
            }
            y4Var = C7749y4.m20872a((ViewGroup) this.f18807b);
            y4Var.mo49736a(this.f18810e);
            this.f18815j = y4Var;
            mo50569a(y4Var.getView());
        }
        y4Var.mo51870a((C7749y4.C7753d) new C7478e(this));
        y4Var.mo49735a(this.f18808c);
    }

    /* renamed from: m */
    public final void mo50581m() {
        C7305a5 a5Var;
        C7772z4 z4Var = this.f18815j;
        if (z4Var instanceof C7330b5) {
            a5Var = (C7305a5) z4Var;
        } else {
            if (z4Var != null) {
                z4Var.mo49736a((C7772z4.C7773a) null);
                this.f18815j.mo49733a(this.f18806a != null ? AacUtil.AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND : 0);
            }
            a5Var = C7330b5.m18782a(this.f18809d);
            a5Var.mo49736a(this.f18810e);
            this.f18815j = a5Var;
            mo50569a(a5Var.getView());
        }
        a5Var.mo49581a(new C7477d(this));
        a5Var.mo49735a(this.f18808c);
    }
}
