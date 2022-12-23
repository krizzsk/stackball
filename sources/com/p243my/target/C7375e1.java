package com.p243my.target;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.p243my.target.C7524l3;
import com.p243my.target.C7644s0;
import com.p243my.target.C7765z0;
import com.p243my.target.ads.MyTargetView;
import com.p243my.target.common.MyTargetPrivacy;
import com.p243my.target.mediation.MediationAdapter;
import com.p243my.target.mediation.MediationStandardAdAdapter;
import com.p243my.target.mediation.MyTargetStandardAdAdapter;
import java.util.List;

/* renamed from: com.my.target.e1 */
public class C7375e1 extends C7765z0<MediationStandardAdAdapter> implements C7644s0 {

    /* renamed from: k */
    public final MyTargetView f18490k;

    /* renamed from: l */
    public C7644s0.C7645a f18491l;

    /* renamed from: com.my.target.e1$a */
    public class C7376a implements MediationStandardAdAdapter.MediationStandardAdListener {

        /* renamed from: a */
        public final C7560n2 f18492a;

        public C7376a(C7560n2 n2Var) {
            this.f18492a = n2Var;
        }

        public void onClick(MediationStandardAdAdapter mediationStandardAdAdapter) {
            C7375e1 e1Var = C7375e1.this;
            if (e1Var.f19731d == mediationStandardAdAdapter) {
                Context l = e1Var.mo51914l();
                if (l != null) {
                    C7741x8.m20827c((List<C7328b3>) this.f18492a.mo50972h().mo49800a("click"), l);
                }
                C7644s0.C7645a aVar = C7375e1.this.f18491l;
                if (aVar != null) {
                    aVar.onClick();
                }
            }
        }

        public void onLoad(View view, MediationStandardAdAdapter mediationStandardAdAdapter) {
            if (C7375e1.this.f19731d == mediationStandardAdAdapter) {
                C7374e0.m18989a("MediationStandardAdEngine: data from " + this.f18492a.mo50966b() + " ad network loaded successfully");
                C7375e1.this.mo51910a(this.f18492a, true);
                C7375e1.this.mo50045a(view);
                C7644s0.C7645a aVar = C7375e1.this.f18491l;
                if (aVar != null) {
                    aVar.onLoad();
                }
            }
        }

        public void onNoAd(String str, MediationStandardAdAdapter mediationStandardAdAdapter) {
            if (C7375e1.this.f19731d == mediationStandardAdAdapter) {
                C7374e0.m18989a("MediationStandardAdEngine: no data from " + this.f18492a.mo50966b() + " ad network");
                C7375e1.this.mo51910a(this.f18492a, false);
            }
        }

        public void onShow(MediationStandardAdAdapter mediationStandardAdAdapter) {
            C7375e1 e1Var = C7375e1.this;
            if (e1Var.f19731d == mediationStandardAdAdapter) {
                Context l = e1Var.mo51914l();
                if (l != null) {
                    C7741x8.m20827c((List<C7328b3>) this.f18492a.mo50972h().mo49800a("playbackStarted"), l);
                }
                C7644s0.C7645a aVar = C7375e1.this.f18491l;
                if (aVar != null) {
                    aVar.mo50637d();
                }
            }
        }
    }

    public C7375e1(MyTargetView myTargetView, C7541m2 m2Var, C7298a aVar, C7524l3.C7525a aVar2) {
        super(m2Var, aVar, aVar2);
        this.f18490k = myTargetView;
    }

    /* renamed from: a */
    public static C7375e1 m18992a(MyTargetView myTargetView, C7541m2 m2Var, C7298a aVar, C7524l3.C7525a aVar2) {
        return new C7375e1(myTargetView, m2Var, aVar, aVar2);
    }

    /* renamed from: a */
    public void mo50044a() {
    }

    /* renamed from: a */
    public void mo50045a(View view) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        view.setLayoutParams(layoutParams);
        this.f18490k.removeAllViews();
        this.f18490k.addView(view);
    }

    /* renamed from: a */
    public void mo50046a(MyTargetView.AdSize adSize) {
    }

    /* renamed from: a */
    public void mo49536a(MediationStandardAdAdapter mediationStandardAdAdapter, C7560n2 n2Var, Context context) {
        C7765z0.C7766a a = C7765z0.C7766a.m20974a(n2Var.mo50969e(), n2Var.mo50968d(), n2Var.mo50967c(), this.f19728a.getCustomParams().getAge(), this.f19728a.getCustomParams().getGender(), MyTargetPrivacy.currentPrivacy());
        if (mediationStandardAdAdapter instanceof MyTargetStandardAdAdapter) {
            C7618q2 g = n2Var.mo50971g();
            if (g instanceof C7731x2) {
                ((MyTargetStandardAdAdapter) mediationStandardAdAdapter).setSection((C7731x2) g);
            }
        }
        try {
            mediationStandardAdAdapter.load(a, this.f18490k.getSize(), new C7376a(n2Var), context);
        } catch (Throwable th) {
            C7374e0.m18990b("MediationStandardAdEngine error: " + th.toString());
        }
    }

    /* renamed from: a */
    public void mo50048a(C7644s0.C7645a aVar) {
        this.f18491l = aVar;
    }

    /* renamed from: a */
    public boolean mo49539a(MediationAdapter mediationAdapter) {
        return mediationAdapter instanceof MediationStandardAdAdapter;
    }

    /* renamed from: b */
    public void mo50049b() {
    }

    public void destroy() {
        if (this.f19731d == null) {
            C7374e0.m18990b("MediationStandardAdEngine error: can't destroy ad, adapter is not set");
            return;
        }
        this.f18490k.removeAllViews();
        try {
            ((MediationStandardAdAdapter) this.f19731d).destroy();
        } catch (Throwable th) {
            C7374e0.m18990b("MediationStandardAdEngine error: " + th.toString());
        }
        this.f19731d = null;
    }

    /* renamed from: e */
    public void mo50051e() {
    }

    /* renamed from: f */
    public void mo50052f() {
    }

    /* renamed from: i */
    public void mo50053i() {
        super.mo51911b(this.f18490k.getContext());
    }

    /* renamed from: j */
    public void mo49542j() {
        C7644s0.C7645a aVar = this.f18491l;
        if (aVar != null) {
            aVar.onNoAd("No data for available ad networks");
        }
    }

    /* renamed from: n */
    public MediationStandardAdAdapter mo49543k() {
        return new MyTargetStandardAdAdapter();
    }
}
