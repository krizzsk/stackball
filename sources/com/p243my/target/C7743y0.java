package com.p243my.target;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p243my.target.C7311a9;
import com.p243my.target.C7593p0;
import com.p243my.target.C7599p3;
import com.p243my.target.C7605p4;
import com.p243my.target.C7667t4;
import com.p243my.target.C7688u4;
import com.p243my.target.C7733x4;
import com.p243my.target.ads.Reward;
import com.p243my.target.common.MyTargetActivity;
import com.p243my.target.common.models.VideoData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.my.target.y0 */
public final class C7743y0 extends C7697v0 {

    /* renamed from: g */
    public final C7665t2 f19651g;

    /* renamed from: h */
    public final ArrayList<C7303a3> f19652h;

    /* renamed from: i */
    public final boolean f19653i;

    /* renamed from: j */
    public C7399f2 f19654j;

    /* renamed from: k */
    public WeakReference<C7605p4> f19655k;

    /* renamed from: l */
    public C7311a9 f19656l;

    /* renamed from: m */
    public C7599p3 f19657m;

    /* renamed from: com.my.target.y0$a */
    public class C7744a extends C7311a9.C7314c {

        /* renamed from: a */
        public final /* synthetic */ View f19658a;

        public C7744a(View view) {
            this.f19658a = view;
        }

        /* renamed from: a */
        public void mo49625a() {
            View closeButton;
            super.mo49625a();
            C7599p3 p3Var = C7743y0.this.f19657m;
            if (p3Var != null && !p3Var.mo51328b()) {
                C7743y0.this.f19657m.mo51324a(this.f19658a, new C7599p3.C7602c[0]);
                C7605p4 e = C7743y0.this.mo51857e();
                if (!(e == null || (closeButton = e.getCloseButton()) == null)) {
                    C7743y0.this.f19657m.mo51326a(new C7599p3.C7602c(closeButton, 0));
                }
                C7743y0.this.f19657m.mo51329c();
            }
        }
    }

    /* renamed from: com.my.target.y0$b */
    public static class C7745b implements C7667t4.C7670c, C7733x4.C7734a, C7688u4.C7690b {

        /* renamed from: a */
        public final C7743y0 f19660a;

        public C7745b(C7743y0 y0Var) {
            this.f19660a = y0Var;
        }

        /* renamed from: a */
        public void mo51332a() {
            this.f19660a.mo51858f();
        }

        /* renamed from: a */
        public void mo51584a(Context context) {
            this.f19660a.mo51854b(context);
        }

        /* renamed from: a */
        public void mo51759a(WebView webView) {
            this.f19660a.mo51848a(webView);
        }

        /* renamed from: a */
        public void mo51760a(C7768z1 z1Var, float f, float f2, Context context) {
            this.f19660a.mo51847a(f, f2, context);
        }

        /* renamed from: a */
        public void mo51333a(C7768z1 z1Var, Context context) {
            this.f19660a.mo51702a(z1Var, context);
        }

        /* renamed from: a */
        public void mo51334a(C7768z1 z1Var, View view) {
            this.f19660a.mo51852a(z1Var, view);
        }

        /* renamed from: a */
        public void mo51335a(C7768z1 z1Var, String str, Context context) {
            if (z1Var != null) {
                this.f19660a.mo51853a(z1Var, str, context);
            }
        }

        /* renamed from: b */
        public void mo51761b(Context context) {
        }

        /* renamed from: b */
        public void mo51762b(C7768z1 z1Var, String str, Context context) {
            this.f19660a.mo51856b(z1Var, str, context);
        }

        public void onNoAd(String str) {
        }
    }

    public C7743y0(C7399f2 f2Var, C7665t2 t2Var, boolean z, C7593p0.C7594a aVar) {
        super(aVar);
        this.f19654j = f2Var;
        this.f19651g = t2Var;
        this.f19653i = z;
        ArrayList<C7303a3> arrayList = new ArrayList<>();
        this.f19652h = arrayList;
        arrayList.addAll(f2Var.getStatHolder().mo49807c());
    }

    /* renamed from: a */
    public static C7743y0 m20837a(C7399f2 f2Var, C7665t2 t2Var, boolean z, C7593p0.C7594a aVar) {
        return new C7743y0(f2Var, t2Var, z, aVar);
    }

    /* renamed from: a */
    public void mo51847a(float f, float f2, Context context) {
        if (!this.f19652h.isEmpty()) {
            float f3 = f2 - f;
            ArrayList arrayList = new ArrayList();
            Iterator<C7303a3> it = this.f19652h.iterator();
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
    public void mo51848a(WebView webView) {
        C7599p3 p3Var = this.f19657m;
        if (p3Var != null && p3Var.mo51328b()) {
            this.f19657m.mo51324a((View) webView, new C7599p3.C7602c[0]);
            C7605p4 e = mo51857e();
            if (e != null) {
                View closeButton = e.getCloseButton();
                if (closeButton != null) {
                    this.f19657m.mo51326a(new C7599p3.C7602c(closeButton, 0));
                }
                this.f19657m.mo51329c();
            }
        }
    }

    /* renamed from: a */
    public final void mo51849a(C7327b2 b2Var, ViewGroup viewGroup) {
        C7605p4 e = mo51857e();
        if (e != null) {
            e.destroy();
        }
        if (b2Var instanceof C7359d2) {
            viewGroup.removeAllViews();
            mo51855b(b2Var, viewGroup);
        } else if (b2Var instanceof C7377e2) {
            viewGroup.removeAllViews();
            mo51850a((C7377e2) b2Var, viewGroup);
        } else if (b2Var instanceof C7399f2) {
            viewGroup.removeAllViews();
            mo51851a((C7399f2) b2Var, viewGroup);
        }
    }

    /* renamed from: a */
    public final void mo51850a(C7377e2 e2Var, ViewGroup viewGroup) {
        C7599p3 p3Var = this.f19657m;
        if (p3Var != null) {
            p3Var.mo51319a();
        }
        this.f19657m = C7599p3.m20069a(e2Var, 2, (C7413g2<VideoData>) null, viewGroup.getContext());
        C7526l4 a = C7526l4.m19699a(viewGroup.getContext(), (C7605p4.C7606a) new C7745b(this));
        this.f19655k = new WeakReference<>(a);
        a.mo50808a(e2Var);
        viewGroup.addView(a.mo50719j(), new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public final void mo51851a(C7399f2 f2Var, ViewGroup viewGroup) {
        C7667t4 t4Var;
        C7599p3 p3Var = this.f19657m;
        if (p3Var != null) {
            p3Var.mo51319a();
        }
        C7413g2<VideoData> videoBanner = f2Var.getVideoBanner();
        this.f19657m = C7599p3.m20069a(f2Var, videoBanner != null ? 3 : 2, videoBanner, viewGroup.getContext());
        if (f2Var.getStyle() != 2) {
            C7552m7 a = C7552m7.m19850a(this.f19657m, viewGroup.getContext());
            a.mo50893a(this.f19653i);
            t4Var = C7667t4.m20443a(a, f2Var, new C7745b(this), viewGroup.getContext());
        } else {
            C7565n7 a2 = C7565n7.m19937a(f2Var.getPromoStyleSettings(), this.f19657m, viewGroup.getContext());
            a2.mo51011a(this.f19653i);
            C7688u4 a3 = C7688u4.m20571a(a2, f2Var, new C7745b(this));
            a3.mo51675u();
            t4Var = a3;
        }
        this.f19655k = new WeakReference<>(t4Var);
        viewGroup.addView(t4Var.mo50719j(), new FrameLayout.LayoutParams(-1, -1));
        this.f19654j = f2Var;
    }

    /* renamed from: a */
    public void mo51852a(C7768z1 z1Var, View view) {
        C7311a9 a9Var = this.f19656l;
        if (a9Var != null) {
            a9Var.mo49622b();
        }
        C7311a9 a = C7311a9.m18722a(z1Var.getViewability(), z1Var.getStatHolder());
        this.f19656l = a;
        a.mo49620a((C7311a9.C7314c) new C7744a(view));
        if (this.f19494b) {
            this.f19656l.mo49623b(view);
        }
        C7374e0.m18989a("Ad shown, banner Id = " + z1Var.getId());
        C7741x8.m20827c((List<C7328b3>) z1Var.getStatHolder().mo49800a("playbackStarted"), view.getContext());
    }

    /* renamed from: a */
    public void mo51853a(C7768z1 z1Var, String str, Context context) {
        if (mo51857e() != null) {
            C7424g8 a = C7424g8.m19196a();
            if (TextUtils.isEmpty(str)) {
                a.mo50243a(z1Var, context);
            } else {
                a.mo50244a(z1Var, str, context);
            }
            boolean z = z1Var instanceof C7342c2;
            if (z) {
                C7741x8.m20827c((List<C7328b3>) this.f19654j.getStatHolder().mo49800a("click"), context);
            }
            this.f19493a.onClick();
            if ((z || (z1Var instanceof C7399f2)) && this.f19654j.isCloseOnClick()) {
                dismiss();
            }
        }
    }

    /* renamed from: b */
    public void mo51854b(Context context) {
        this.f19493a.onVideoCompleted();
        if (!this.f19495c) {
            this.f19495c = true;
            C7741x8.m20827c((List<C7328b3>) this.f19654j.getStatHolder().mo49800a("reward"), context);
            C7593p0.C7595b a = mo51701a();
            if (a != null) {
                a.onReward(Reward.getDefault());
            }
        }
        C7327b2 endCard = this.f19654j.getEndCard();
        ViewParent viewParent = null;
        C7605p4 e = mo51857e();
        if (e != null) {
            viewParent = e.mo50719j().getParent();
        }
        if (endCard != null && (viewParent instanceof ViewGroup)) {
            mo51849a(endCard, (ViewGroup) viewParent);
        }
    }

    /* renamed from: b */
    public final void mo51855b(C7327b2 b2Var, ViewGroup viewGroup) {
        C7599p3 p3Var = this.f19657m;
        if (p3Var != null) {
            p3Var.mo51319a();
        }
        this.f19657m = C7599p3.m20069a(b2Var, 2, (C7413g2<VideoData>) null, viewGroup.getContext());
        C7733x4 a = CampaignEx.JSON_KEY_MRAID.equals(b2Var.getType()) ? C7583o4.m20000a(viewGroup.getContext()) : C7499k4.m19580a(viewGroup.getContext());
        this.f19655k = new WeakReference<>(a);
        a.mo50709a((C7733x4.C7734a) new C7745b(this));
        a.mo50708a(this.f19651g, (C7359d2) b2Var);
        viewGroup.addView(a.mo50719j(), new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: b */
    public void mo51856b(C7768z1 z1Var, String str, Context context) {
        C7741x8.m20827c((List<C7328b3>) z1Var.getStatHolder().mo49800a(str), context);
    }

    /* renamed from: b */
    public boolean mo51703b() {
        return this.f19654j.isAllowBackButton();
    }

    /* renamed from: e */
    public C7605p4 mo51857e() {
        WeakReference<C7605p4> weakReference = this.f19655k;
        if (weakReference != null) {
            return (C7605p4) weakReference.get();
        }
        return null;
    }

    /* renamed from: f */
    public void mo51858f() {
        dismiss();
    }

    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        super.onActivityCreate(myTargetActivity, intent, frameLayout);
        mo51851a(this.f19654j, (ViewGroup) frameLayout);
    }

    public void onActivityDestroy() {
        super.onActivityDestroy();
        WeakReference<C7605p4> weakReference = this.f19655k;
        if (weakReference != null) {
            C7605p4 p4Var = (C7605p4) weakReference.get();
            if (p4Var != null) {
                View j = p4Var.mo50719j();
                ViewParent parent = j.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(j);
                }
                p4Var.destroy();
            }
            this.f19655k.clear();
            this.f19655k = null;
        }
        C7311a9 a9Var = this.f19656l;
        if (a9Var != null) {
            a9Var.mo49622b();
            this.f19656l = null;
        }
        C7599p3 p3Var = this.f19657m;
        if (p3Var != null) {
            p3Var.mo51319a();
        }
    }

    public void onActivityPause() {
        super.onActivityPause();
        C7605p4 e = mo51857e();
        if (e != null) {
            e.mo50711b();
        }
        C7311a9 a9Var = this.f19656l;
        if (a9Var != null) {
            a9Var.mo49622b();
        }
    }

    public void onActivityResume() {
        super.onActivityResume();
        C7605p4 e = mo51857e();
        if (e != null) {
            e.mo50705a();
            C7311a9 a9Var = this.f19656l;
            if (a9Var != null) {
                a9Var.mo49623b(e.mo50719j());
            }
        }
    }

    public void onActivityStop() {
        super.onActivityStop();
        C7605p4 e = mo51857e();
        if (e != null) {
            e.mo50717e();
        }
    }
}
