package com.p243my.target;

import android.content.Context;
import com.p243my.target.C7524l3;
import com.p243my.target.C7593p0;
import com.p243my.target.C7765z0;
import com.p243my.target.ads.Reward;
import com.p243my.target.common.MyTargetPrivacy;
import com.p243my.target.mediation.MediationAdapter;
import com.p243my.target.mediation.MediationRewardedAdAdapter;
import com.p243my.target.mediation.MyTargetRewardedAdAdapter;
import java.util.List;

/* renamed from: com.my.target.d1 */
public class C7357d1 extends C7765z0<MediationRewardedAdAdapter> implements C7593p0 {

    /* renamed from: k */
    public final C7593p0.C7594a f18441k;

    /* renamed from: l */
    public C7593p0.C7595b f18442l;

    /* renamed from: com.my.target.d1$a */
    public class C7358a implements MediationRewardedAdAdapter.MediationRewardedAdListener {

        /* renamed from: a */
        public final C7560n2 f18443a;

        public C7358a(C7560n2 n2Var) {
            this.f18443a = n2Var;
        }

        public void onClick(MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            C7357d1 d1Var = C7357d1.this;
            if (d1Var.f19731d == mediationRewardedAdAdapter) {
                Context l = d1Var.mo51914l();
                if (l != null) {
                    C7741x8.m20827c((List<C7328b3>) this.f18443a.mo50972h().mo49800a("click"), l);
                }
                C7357d1.this.f18441k.onClick();
            }
        }

        public void onDismiss(MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            C7357d1 d1Var = C7357d1.this;
            if (d1Var.f19731d == mediationRewardedAdAdapter) {
                d1Var.f18441k.onDismiss();
            }
        }

        public void onDisplay(MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            C7357d1 d1Var = C7357d1.this;
            if (d1Var.f19731d == mediationRewardedAdAdapter) {
                Context l = d1Var.mo51914l();
                if (l != null) {
                    C7741x8.m20827c((List<C7328b3>) this.f18443a.mo50972h().mo49800a("playbackStarted"), l);
                }
                C7357d1.this.f18441k.onDisplay();
            }
        }

        public void onLoad(MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            if (C7357d1.this.f19731d == mediationRewardedAdAdapter) {
                C7374e0.m18989a("MediationRewardedAdEngine: data from " + this.f18443a.mo50966b() + " ad network loaded successfully");
                C7357d1.this.mo51910a(this.f18443a, true);
                C7357d1.this.f18441k.onLoad();
            }
        }

        public void onNoAd(String str, MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            if (C7357d1.this.f19731d == mediationRewardedAdAdapter) {
                C7374e0.m18989a("MediationRewardedAdEngine: no data from " + this.f18443a.mo50966b() + " ad network");
                C7357d1.this.mo51910a(this.f18443a, false);
            }
        }

        public void onReward(Reward reward, MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            C7357d1 d1Var = C7357d1.this;
            if (d1Var.f19731d == mediationRewardedAdAdapter) {
                Context l = d1Var.mo51914l();
                if (l != null) {
                    C7741x8.m20827c((List<C7328b3>) this.f18443a.mo50972h().mo49800a("reward"), l);
                }
                C7593p0.C7595b o = C7357d1.this.mo49980o();
                if (o != null) {
                    o.onReward(reward);
                }
            }
        }
    }

    public C7357d1(C7541m2 m2Var, C7298a aVar, C7524l3.C7525a aVar2, C7593p0.C7594a aVar3) {
        super(m2Var, aVar, aVar2);
        this.f18441k = aVar3;
    }

    /* renamed from: a */
    public static C7357d1 m18918a(C7541m2 m2Var, C7298a aVar, C7524l3.C7525a aVar2, C7593p0.C7594a aVar3) {
        return new C7357d1(m2Var, aVar, aVar2, aVar3);
    }

    /* renamed from: a */
    public void mo49535a(Context context) {
        T t = this.f19731d;
        if (t == null) {
            C7374e0.m18990b("MediationRewardedAdEngine error: can't show ad, adapter is not set");
            return;
        }
        try {
            ((MediationRewardedAdAdapter) t).show(context);
        } catch (Throwable th) {
            C7374e0.m18990b("MediationRewardedAdEngine error: " + th.toString());
        }
    }

    /* renamed from: a */
    public void mo49536a(MediationRewardedAdAdapter mediationRewardedAdAdapter, C7560n2 n2Var, Context context) {
        C7765z0.C7766a a = C7765z0.C7766a.m20974a(n2Var.mo50969e(), n2Var.mo50968d(), n2Var.mo50967c(), this.f19728a.getCustomParams().getAge(), this.f19728a.getCustomParams().getGender(), MyTargetPrivacy.currentPrivacy());
        if (mediationRewardedAdAdapter instanceof MyTargetRewardedAdAdapter) {
            C7618q2 g = n2Var.mo50971g();
            if (g instanceof C7665t2) {
                ((MyTargetRewardedAdAdapter) mediationRewardedAdAdapter).setSection((C7665t2) g);
            }
        }
        try {
            mediationRewardedAdAdapter.load(a, new C7358a(n2Var), context);
        } catch (Throwable th) {
            C7374e0.m18990b("MediationRewardedAdEngine error: " + th.toString());
        }
    }

    /* renamed from: a */
    public void mo49538a(C7593p0.C7595b bVar) {
        this.f18442l = bVar;
    }

    /* renamed from: a */
    public boolean mo49539a(MediationAdapter mediationAdapter) {
        return mediationAdapter instanceof MediationRewardedAdAdapter;
    }

    public void destroy() {
        T t = this.f19731d;
        if (t == null) {
            C7374e0.m18990b("MediationRewardedAdEngine error: can't destroy ad, adapter is not set");
            return;
        }
        try {
            ((MediationRewardedAdAdapter) t).destroy();
        } catch (Throwable th) {
            C7374e0.m18990b("MediationRewardedAdEngine error: " + th.toString());
        }
        this.f19731d = null;
    }

    public void dismiss() {
        T t = this.f19731d;
        if (t == null) {
            C7374e0.m18990b("MediationRewardedAdEngine error: can't dismiss ad, adapter is not set");
            return;
        }
        try {
            ((MediationRewardedAdAdapter) t).dismiss();
        } catch (Throwable th) {
            C7374e0.m18990b("MediationRewardedAdEngine error: " + th.toString());
        }
    }

    /* renamed from: j */
    public void mo49542j() {
        this.f18441k.onNoAd("No data for available ad networks");
    }

    /* renamed from: n */
    public MediationRewardedAdAdapter mo49543k() {
        return new MyTargetRewardedAdAdapter();
    }

    /* renamed from: o */
    public C7593p0.C7595b mo49980o() {
        return this.f18442l;
    }
}
