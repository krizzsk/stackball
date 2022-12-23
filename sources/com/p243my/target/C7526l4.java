package com.p243my.target;

import android.content.Context;
import android.view.View;
import com.p243my.target.C7409g0;
import com.p243my.target.C7596p1;
import com.p243my.target.C7605p4;
import java.util.List;

/* renamed from: com.my.target.l4 */
public class C7526l4 implements C7605p4 {

    /* renamed from: a */
    public final C7605p4.C7606a f18942a;

    /* renamed from: b */
    public final C7439h6 f18943b;

    /* renamed from: c */
    public C7432h0 f18944c;

    /* renamed from: com.my.target.l4$a */
    public class C7527a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C7596p1 f18945a;

        public C7527a(C7596p1 p1Var) {
            this.f18945a = p1Var;
        }

        public void onClick(View view) {
            C7526l4.this.mo50807a(view.getContext(), this.f18945a);
        }
    }

    /* renamed from: com.my.target.l4$b */
    public class C7528b implements C7409g0.C7411b {

        /* renamed from: a */
        public final /* synthetic */ C7768z1 f18947a;

        public C7528b(C7768z1 z1Var) {
            this.f18947a = z1Var;
        }

        /* renamed from: a */
        public void mo49488a(Context context) {
            C7526l4.this.f18942a.mo51333a(this.f18947a, context);
        }
    }

    public C7526l4(C7439h6 h6Var, C7605p4.C7606a aVar) {
        this.f18943b = h6Var;
        this.f18942a = aVar;
    }

    /* renamed from: a */
    public static C7526l4 m19699a(Context context, C7605p4.C7606a aVar) {
        return new C7526l4(new C7439h6(context), aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19701a(View view) {
        this.f18942a.mo51332a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19702a(C7377e2 e2Var, View view) {
        this.f18942a.mo51335a(e2Var, (String) null, view.getContext());
    }

    /* renamed from: a */
    public void mo50705a() {
    }

    /* renamed from: a */
    public void mo50807a(Context context, C7596p1 p1Var) {
        C7432h0 h0Var = this.f18944c;
        if (h0Var == null || !h0Var.mo50266c()) {
            C7432h0 h0Var2 = this.f18944c;
            if (h0Var2 == null) {
                C7534l8.m19712a(p1Var.mo51317b(), context);
            } else {
                h0Var2.mo50260a(context);
            }
        }
    }

    /* renamed from: a */
    public void mo50808a(C7377e2 e2Var) {
        this.f18943b.mo50304a(e2Var.getOptimalLandscapeImage(), e2Var.getOptimalPortraitImage(), e2Var.getCloseIcon());
        this.f18943b.setAgeRestrictions(e2Var.getAgeRestrictions());
        this.f18943b.getImageView().setOnClickListener(new View.OnClickListener(e2Var) {
            public final /* synthetic */ C7377e2 f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C7526l4.this.m19702a(this.f$1, view);
            }
        });
        this.f18943b.getCloseButton().setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C7526l4.this.m19701a(view);
            }
        });
        mo50809a((C7768z1) e2Var);
        this.f18942a.mo51334a((C7768z1) e2Var, (View) this.f18943b);
    }

    /* renamed from: a */
    public final void mo50809a(C7768z1 z1Var) {
        C7596p1 adChoices = z1Var.getAdChoices();
        if (adChoices != null) {
            this.f18943b.mo50305a(adChoices, new C7527a(adChoices));
            List<C7596p1.C7597a> a = adChoices.mo51315a();
            if (a != null) {
                C7432h0 a2 = C7432h0.m19222a(a);
                this.f18944c = a2;
                a2.mo50261a((C7409g0.C7411b) new C7528b(z1Var));
            }
        }
    }

    /* renamed from: b */
    public void mo50711b() {
    }

    public void destroy() {
    }

    /* renamed from: e */
    public void mo50717e() {
    }

    public View getCloseButton() {
        return this.f18943b.getCloseButton();
    }

    /* renamed from: j */
    public View mo50719j() {
        return this.f18943b;
    }
}
