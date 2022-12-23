package com.p243my.target;

import android.content.Context;
import com.p243my.target.C7524l3;
import com.p243my.target.C7593p0;
import com.p243my.target.C7765z0;
import com.p243my.target.ads.Reward;
import com.p243my.target.common.MyTargetPrivacy;
import com.p243my.target.mediation.MediationAdapter;
import com.p243my.target.mediation.MediationInterstitialAdAdapter;
import com.p243my.target.mediation.MyTargetInterstitialAdAdapter;
import java.util.List;

/* renamed from: com.my.target.a1 */
public class C7300a1 extends C7765z0<MediationInterstitialAdAdapter> implements C7593p0 {

    /* renamed from: k */
    public final C7593p0.C7594a f18303k;

    /* renamed from: l */
    public C7593p0.C7595b f18304l;

    /* renamed from: com.my.target.a1$a */
    public class C7301a implements MediationInterstitialAdAdapter.MediationInterstitialAdListener {

        /* renamed from: a */
        public final C7560n2 f18305a;

        public C7301a(C7560n2 n2Var) {
            this.f18305a = n2Var;
        }

        public void onClick(MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            C7300a1 a1Var = C7300a1.this;
            if (a1Var.f19731d == mediationInterstitialAdAdapter) {
                Context l = a1Var.mo51914l();
                if (l != null) {
                    C7741x8.m20827c((List<C7328b3>) this.f18305a.mo50972h().mo49800a("click"), l);
                }
                C7300a1.this.f18303k.onClick();
            }
        }

        public void onDismiss(MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            C7300a1 a1Var = C7300a1.this;
            if (a1Var.f19731d == mediationInterstitialAdAdapter) {
                a1Var.f18303k.onDismiss();
            }
        }

        public void onDisplay(MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            C7300a1 a1Var = C7300a1.this;
            if (a1Var.f19731d == mediationInterstitialAdAdapter) {
                Context l = a1Var.mo51914l();
                if (l != null) {
                    C7741x8.m20827c((List<C7328b3>) this.f18305a.mo50972h().mo49800a("playbackStarted"), l);
                }
                C7300a1.this.f18303k.onDisplay();
            }
        }

        public void onLoad(MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            if (C7300a1.this.f19731d == mediationInterstitialAdAdapter) {
                C7374e0.m18989a("MediationInterstitialAdEngine: data from " + this.f18305a.mo50966b() + " ad network loaded successfully");
                C7300a1.this.mo51910a(this.f18305a, true);
                C7300a1.this.f18303k.onLoad();
            }
        }

        public void onNoAd(String str, MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            if (C7300a1.this.f19731d == mediationInterstitialAdAdapter) {
                C7374e0.m18989a("MediationInterstitialAdEngine: no data from " + this.f18305a.mo50966b() + " ad network");
                C7300a1.this.mo51910a(this.f18305a, false);
            }
        }

        public void onVideoCompleted(MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            C7300a1 a1Var = C7300a1.this;
            if (a1Var.f19731d == mediationInterstitialAdAdapter) {
                a1Var.f18303k.onVideoCompleted();
                Context l = C7300a1.this.mo51914l();
                if (l != null) {
                    C7741x8.m20827c((List<C7328b3>) this.f18305a.mo50972h().mo49800a("reward"), l);
                }
                C7593p0.C7595b o = C7300a1.this.mo49545o();
                if (o != null) {
                    o.onReward(Reward.getDefault());
                }
            }
        }
    }

    public C7300a1(C7541m2 m2Var, C7298a aVar, C7524l3.C7525a aVar2, C7593p0.C7594a aVar3) {
        super(m2Var, aVar, aVar2);
        this.f18303k = aVar3;
    }

    /* renamed from: a */
    public static C7300a1 m18683a(C7541m2 m2Var, C7298a aVar, C7524l3.C7525a aVar2, C7593p0.C7594a aVar3) {
        return new C7300a1(m2Var, aVar, aVar2, aVar3);
    }

    /* renamed from: a */
    public void mo49535a(Context context) {
        T t = this.f19731d;
        if (t == null) {
            C7374e0.m18990b("MediationInterstitialAdEngine error: can't show ad, adapter is not set");
            return;
        }
        try {
            ((MediationInterstitialAdAdapter) t).show(context);
        } catch (Throwable th) {
            C7374e0.m18990b("MediationInterstitialAdEngine error: " + th.toString());
        }
    }

    /* renamed from: a */
    public void mo49536a(MediationInterstitialAdAdapter mediationInterstitialAdAdapter, C7560n2 n2Var, Context context) {
        C7765z0.C7766a a = C7765z0.C7766a.m20974a(n2Var.mo50969e(), n2Var.mo50968d(), n2Var.mo50967c(), this.f19728a.getCustomParams().getAge(), this.f19728a.getCustomParams().getGender(), MyTargetPrivacy.currentPrivacy());
        if (mediationInterstitialAdAdapter instanceof MyTargetInterstitialAdAdapter) {
            C7618q2 g = n2Var.mo50971g();
            if (g instanceof C7665t2) {
                ((MyTargetInterstitialAdAdapter) mediationInterstitialAdAdapter).setSection((C7665t2) g);
            }
        }
        try {
            mediationInterstitialAdAdapter.load(a, new C7301a(n2Var), context);
        } catch (Throwable th) {
            C7374e0.m18990b("MediationInterstitialAdEngine error: " + th.toString());
        }
    }

    /* renamed from: a */
    public void mo49538a(C7593p0.C7595b bVar) {
        this.f18304l = bVar;
    }

    /* renamed from: a */
    public boolean mo49539a(MediationAdapter mediationAdapter) {
        return mediationAdapter instanceof MediationInterstitialAdAdapter;
    }

    public void destroy() {
        T t = this.f19731d;
        if (t == null) {
            C7374e0.m18990b("MediationInterstitialAdEngine error: can't destroy ad, adapter is not set");
            return;
        }
        try {
            ((MediationInterstitialAdAdapter) t).destroy();
        } catch (Throwable th) {
            C7374e0.m18990b("MediationInterstitialAdEngine error: " + th.toString());
        }
        this.f19731d = null;
    }

    public void dismiss() {
        T t = this.f19731d;
        if (t == null) {
            C7374e0.m18990b("MediationInterstitialAdEngine error: can't dismiss ad, adapter is not set");
            return;
        }
        try {
            ((MediationInterstitialAdAdapter) t).dismiss();
        } catch (Throwable th) {
            C7374e0.m18990b("MediationInterstitialAdEngine error: " + th.toString());
        }
    }

    /* renamed from: j */
    public void mo49542j() {
        this.f18303k.onNoAd("No data for available ad networks");
    }

    /* renamed from: n */
    public MediationInterstitialAdAdapter mo49543k() {
        return new MyTargetInterstitialAdAdapter();
    }

    /* renamed from: o */
    public C7593p0.C7595b mo49545o() {
        return this.f18304l;
    }
}
