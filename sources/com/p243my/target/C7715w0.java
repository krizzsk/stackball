package com.p243my.target;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.audio.AacUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p243my.target.C7593p0;
import com.p243my.target.C7599p3;
import com.p243my.target.C7733x4;
import com.p243my.target.ads.Reward;
import com.p243my.target.common.MyTargetActivity;
import com.p243my.target.common.models.VideoData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.my.target.w0 */
public final class C7715w0 extends C7697v0 {

    /* renamed from: g */
    public final C7359d2 f19531g;

    /* renamed from: h */
    public final C7665t2 f19532h;

    /* renamed from: i */
    public final ArrayList<C7303a3> f19533i;

    /* renamed from: j */
    public WeakReference<C7733x4> f19534j;

    /* renamed from: k */
    public C7311a9 f19535k;

    /* renamed from: l */
    public C7599p3 f19536l;

    /* renamed from: com.my.target.w0$a */
    public static class C7716a implements C7733x4.C7734a {

        /* renamed from: a */
        public final C7715w0 f19537a;

        /* renamed from: b */
        public final C7359d2 f19538b;

        /* renamed from: c */
        public final C7593p0.C7594a f19539c;

        public C7716a(C7715w0 w0Var, C7359d2 d2Var, C7593p0.C7594a aVar) {
            this.f19537a = w0Var;
            this.f19538b = d2Var;
            this.f19539c = aVar;
        }

        /* renamed from: a */
        public void mo51332a() {
            this.f19537a.dismiss();
        }

        /* renamed from: a */
        public void mo51759a(WebView webView) {
            this.f19537a.mo51754a(webView);
        }

        /* renamed from: a */
        public void mo51760a(C7768z1 z1Var, float f, float f2, Context context) {
            this.f19537a.mo51752a(f, f2, context);
        }

        /* renamed from: a */
        public void mo51333a(C7768z1 z1Var, Context context) {
            this.f19537a.mo51702a(z1Var, context);
        }

        /* renamed from: a */
        public void mo51334a(C7768z1 z1Var, View view) {
            C7374e0.m18989a("Ad shown, banner Id = " + this.f19538b.getId());
            this.f19537a.mo51755a(z1Var, view);
        }

        /* renamed from: a */
        public void mo51335a(C7768z1 z1Var, String str, Context context) {
            C7424g8 a = C7424g8.m19196a();
            if (TextUtils.isEmpty(str)) {
                a.mo50243a(this.f19538b, context);
            } else {
                a.mo50244a((C7768z1) this.f19538b, str, context);
            }
            this.f19539c.onClick();
        }

        /* renamed from: b */
        public void mo51761b(Context context) {
            this.f19537a.mo51757b(context);
        }

        /* renamed from: b */
        public void mo51762b(C7768z1 z1Var, String str, Context context) {
            this.f19537a.mo51756a(z1Var, str, context);
        }

        public void onNoAd(String str) {
            this.f19537a.dismiss();
        }
    }

    public C7715w0(C7359d2 d2Var, C7665t2 t2Var, C7593p0.C7594a aVar) {
        super(aVar);
        this.f19531g = d2Var;
        this.f19532h = t2Var;
        ArrayList<C7303a3> arrayList = new ArrayList<>();
        this.f19533i = arrayList;
        arrayList.addAll(d2Var.getStatHolder().mo49807c());
    }

    /* renamed from: a */
    public static C7715w0 m20697a(C7359d2 d2Var, C7665t2 t2Var, C7593p0.C7594a aVar) {
        return new C7715w0(d2Var, t2Var, aVar);
    }

    /* renamed from: a */
    public void mo51752a(float f, float f2, Context context) {
        if (!this.f19533i.isEmpty()) {
            float f3 = f2 - f;
            ArrayList arrayList = new ArrayList();
            Iterator<C7303a3> it = this.f19533i.iterator();
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
    public final void mo51753a(ViewGroup viewGroup) {
        this.f19536l = C7599p3.m20069a(this.f19531g, 1, (C7413g2<VideoData>) null, viewGroup.getContext());
        C7733x4 a = CampaignEx.JSON_KEY_MRAID.equals(this.f19531g.getType()) ? C7583o4.m20000a(viewGroup.getContext()) : C7499k4.m19580a(viewGroup.getContext());
        this.f19534j = new WeakReference<>(a);
        a.mo50709a((C7733x4.C7734a) new C7716a(this, this.f19531g, this.f19493a));
        a.mo50708a(this.f19532h, this.f19531g);
        viewGroup.addView(a.mo50719j(), new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public void mo51754a(WebView webView) {
        C7733x4 e;
        if (this.f19536l != null && (e = mo51758e()) != null) {
            this.f19536l.mo51324a((View) webView, new C7599p3.C7602c[0]);
            View closeButton = e.getCloseButton();
            if (closeButton != null) {
                this.f19536l.mo51326a(new C7599p3.C7602c(closeButton, 0));
            }
            this.f19536l.mo51329c();
        }
    }

    /* renamed from: a */
    public void mo51755a(C7768z1 z1Var, View view) {
        C7311a9 a9Var = this.f19535k;
        if (a9Var != null) {
            a9Var.mo49622b();
        }
        C7311a9 a = C7311a9.m18722a(this.f19531g.getViewability(), this.f19531g.getStatHolder());
        this.f19535k = a;
        if (this.f19494b) {
            a.mo49623b(view);
        }
        C7374e0.m18989a("Ad shown, banner Id = " + z1Var.getId());
        C7741x8.m20827c((List<C7328b3>) z1Var.getStatHolder().mo49800a("playbackStarted"), view.getContext());
    }

    /* renamed from: a */
    public void mo51756a(C7768z1 z1Var, String str, Context context) {
        C7741x8.m20827c((List<C7328b3>) z1Var.getStatHolder().mo49800a(str), context);
    }

    /* renamed from: b */
    public void mo51757b(Context context) {
        if (!this.f19495c) {
            this.f19495c = true;
            this.f19493a.onVideoCompleted();
            C7741x8.m20827c((List<C7328b3>) this.f19531g.getStatHolder().mo49800a("reward"), context);
            C7593p0.C7595b a = mo51701a();
            if (a != null) {
                a.onReward(Reward.getDefault());
            }
        }
    }

    /* renamed from: b */
    public boolean mo51703b() {
        return this.f19531g.isAllowBackButton();
    }

    /* renamed from: e */
    public C7733x4 mo51758e() {
        WeakReference<C7733x4> weakReference = this.f19534j;
        if (weakReference != null) {
            return (C7733x4) weakReference.get();
        }
        return null;
    }

    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        super.onActivityCreate(myTargetActivity, intent, frameLayout);
        mo51753a((ViewGroup) frameLayout);
    }

    public void onActivityDestroy() {
        C7733x4 x4Var;
        super.onActivityDestroy();
        C7311a9 a9Var = this.f19535k;
        if (a9Var != null) {
            a9Var.mo49622b();
            this.f19535k = null;
        }
        C7599p3 p3Var = this.f19536l;
        if (p3Var != null) {
            p3Var.mo51319a();
        }
        WeakReference<C7733x4> weakReference = this.f19534j;
        if (!(weakReference == null || (x4Var = (C7733x4) weakReference.get()) == null)) {
            x4Var.mo50706a(this.f19536l != null ? AacUtil.AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND : 0);
        }
        this.f19534j = null;
    }

    public void onActivityPause() {
        C7733x4 x4Var;
        super.onActivityPause();
        WeakReference<C7733x4> weakReference = this.f19534j;
        if (!(weakReference == null || (x4Var = (C7733x4) weakReference.get()) == null)) {
            x4Var.mo50711b();
        }
        C7311a9 a9Var = this.f19535k;
        if (a9Var != null) {
            a9Var.mo49622b();
        }
    }

    public void onActivityResume() {
        C7733x4 x4Var;
        super.onActivityResume();
        WeakReference<C7733x4> weakReference = this.f19534j;
        if (weakReference != null && (x4Var = (C7733x4) weakReference.get()) != null) {
            x4Var.mo50705a();
            C7311a9 a9Var = this.f19535k;
            if (a9Var != null) {
                a9Var.mo49623b(x4Var.mo50719j());
            }
        }
    }
}
