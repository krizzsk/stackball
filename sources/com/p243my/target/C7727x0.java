package com.p243my.target;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p243my.target.C7311a9;
import com.p243my.target.C7593p0;
import com.p243my.target.C7599p3;
import com.p243my.target.C7605p4;
import com.p243my.target.common.MyTargetActivity;
import com.p243my.target.common.models.VideoData;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.my.target.x0 */
public final class C7727x0 extends C7697v0 {

    /* renamed from: g */
    public final C7377e2 f19573g;

    /* renamed from: h */
    public C7311a9 f19574h;

    /* renamed from: i */
    public WeakReference<C7526l4> f19575i;

    /* renamed from: j */
    public C7599p3 f19576j;

    /* renamed from: com.my.target.x0$a */
    public class C7728a extends C7311a9.C7314c {

        /* renamed from: a */
        public final /* synthetic */ View f19577a;

        public C7728a(View view) {
            this.f19577a = view;
        }

        /* renamed from: a */
        public void mo49625a() {
            View closeButton;
            super.mo49625a();
            if (C7727x0.this.f19576j != null) {
                C7727x0.this.f19576j.mo51324a(this.f19577a, new C7599p3.C7602c[0]);
                if (!(C7727x0.this.f19575i == null || (closeButton = ((C7526l4) C7727x0.this.f19575i.get()).getCloseButton()) == null)) {
                    C7727x0.this.f19576j.mo51326a(new C7599p3.C7602c(closeButton, 0));
                }
                C7727x0.this.f19576j.mo51329c();
            }
        }
    }

    /* renamed from: com.my.target.x0$b */
    public static class C7729b implements C7605p4.C7606a {

        /* renamed from: a */
        public final C7727x0 f19579a;

        public C7729b(C7727x0 x0Var) {
            this.f19579a = x0Var;
        }

        /* renamed from: a */
        public void mo51332a() {
            this.f19579a.mo51816e();
        }

        /* renamed from: a */
        public void mo51333a(C7768z1 z1Var, Context context) {
            this.f19579a.mo51702a(z1Var, context);
        }

        /* renamed from: a */
        public void mo51334a(C7768z1 z1Var, View view) {
            C7374e0.m18989a("Ad shown, banner Id = " + z1Var.getId());
            this.f19579a.mo51814a(z1Var, view);
        }

        /* renamed from: a */
        public void mo51335a(C7768z1 z1Var, String str, Context context) {
            this.f19579a.mo51815b(context);
        }
    }

    public C7727x0(C7377e2 e2Var, C7593p0.C7594a aVar) {
        super(aVar);
        this.f19573g = e2Var;
    }

    /* renamed from: a */
    public static C7727x0 m20779a(C7377e2 e2Var, C7593p0.C7594a aVar) {
        return new C7727x0(e2Var, aVar);
    }

    /* renamed from: a */
    public final void mo51813a(ViewGroup viewGroup) {
        this.f19576j = C7599p3.m20069a(this.f19573g, 2, (C7413g2<VideoData>) null, viewGroup.getContext());
        C7526l4 a = C7526l4.m19699a(viewGroup.getContext(), (C7605p4.C7606a) new C7729b(this));
        this.f19575i = new WeakReference<>(a);
        a.mo50808a(this.f19573g);
        viewGroup.addView(a.mo50719j(), new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public void mo51814a(C7768z1 z1Var, View view) {
        C7311a9 a9Var = this.f19574h;
        if (a9Var != null) {
            a9Var.mo49622b();
        }
        C7311a9 a = C7311a9.m18722a(this.f19573g.getViewability(), this.f19573g.getStatHolder());
        this.f19574h = a;
        a.mo49620a((C7311a9.C7314c) new C7728a(view));
        if (this.f19494b) {
            this.f19574h.mo49623b(view);
        }
        C7374e0.m18989a("Ad shown, banner Id = " + z1Var.getId());
        C7741x8.m20827c((List<C7328b3>) z1Var.getStatHolder().mo49800a("playbackStarted"), view.getContext());
    }

    /* renamed from: b */
    public void mo51815b(Context context) {
        C7424g8.m19196a().mo50243a(this.f19573g, context);
        this.f19493a.onClick();
        dismiss();
    }

    /* renamed from: b */
    public boolean mo51703b() {
        return this.f19573g.isAllowBackButton();
    }

    /* renamed from: e */
    public void mo51816e() {
        dismiss();
    }

    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        super.onActivityCreate(myTargetActivity, intent, frameLayout);
        mo51813a((ViewGroup) frameLayout);
    }

    public void onActivityDestroy() {
        super.onActivityDestroy();
        C7311a9 a9Var = this.f19574h;
        if (a9Var != null) {
            a9Var.mo49622b();
            this.f19574h = null;
        }
        C7599p3 p3Var = this.f19576j;
        if (p3Var != null) {
            p3Var.mo51319a();
        }
    }

    public void onActivityPause() {
        super.onActivityPause();
        C7311a9 a9Var = this.f19574h;
        if (a9Var != null) {
            a9Var.mo49622b();
        }
    }

    public void onActivityResume() {
        C7526l4 l4Var;
        C7311a9 a9Var;
        super.onActivityResume();
        WeakReference<C7526l4> weakReference = this.f19575i;
        if (weakReference != null && (l4Var = (C7526l4) weakReference.get()) != null && (a9Var = this.f19574h) != null) {
            a9Var.mo49623b(l4Var.mo50719j());
        }
    }
}
