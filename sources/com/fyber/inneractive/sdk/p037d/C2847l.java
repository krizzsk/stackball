package com.fyber.inneractive.sdk.p037d;

import android.app.Activity;
import android.os.CountDownTimer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener;
import com.fyber.inneractive.sdk.p037d.C2836g;
import com.fyber.inneractive.sdk.p045e.C2900c;
import com.fyber.inneractive.sdk.p049h.C2967m;
import com.fyber.inneractive.sdk.p049h.C2968n;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.util.C3640ao;
import com.fyber.inneractive.sdk.util.C3662m;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.d.l */
public abstract class C2847l<AdContent extends C2836g, EventsListener extends InneractiveUnitController.EventsListener> extends C2837h<AdContent, EventsListener> implements C2900c {

    /* renamed from: h */
    protected C2900c.C2901a f6782h;

    /* renamed from: i */
    protected boolean f6783i = false;

    /* renamed from: j */
    protected long f6784j;

    /* renamed from: k */
    public CountDownTimer f6785k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Runnable f6786l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Runnable f6787m;

    /* renamed from: n */
    private C3640ao f6788n;

    /* renamed from: o */
    private boolean f6789o = false;

    /* renamed from: a */
    public abstract long mo18183a(long j);

    /* renamed from: a */
    public abstract boolean mo18187a(AdContent adcontent);

    /* renamed from: b */
    public abstract boolean mo18188b(AdContent adcontent);

    /* renamed from: c */
    public abstract boolean mo18189c(AdContent adcontent);

    /* renamed from: e */
    public abstract boolean mo18190e();

    /* renamed from: f */
    public abstract long mo18191f();

    /* renamed from: g */
    public abstract boolean mo18192g();

    /* renamed from: h */
    public abstract boolean mo18193h();

    public void initialize(InneractiveAdSpot inneractiveAdSpot) {
        super.initialize(inneractiveAdSpot);
    }

    /* renamed from: a */
    public void mo18185a(C2900c.C2901a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError {
        if (this.f6748a == null) {
            IAlog.m9036d("%sYou must set the spot to render before calling renderAd", IAlog.m9029a((Object) this));
            throw new InneractiveUnitController.AdDisplayError("No spot ad to render");
        } else if (aVar != null) {
            this.f6782h = aVar;
        } else {
            IAlog.m9036d("%srenderAd called with a null activity!", IAlog.m9029a((Object) this));
            throw new InneractiveUnitController.AdDisplayError("Activity is null");
        }
    }

    public void destroy() {
        if (this.f6786l != null) {
            C3662m.m9137a().removeCallbacks(this.f6786l);
            this.f6786l = null;
        }
        if (this.f6787m != null) {
            C3662m.m9137a().removeCallbacks(this.f6787m);
            this.f6787m = null;
        }
        C2900c.C2901a aVar = this.f6782h;
        if (aVar != null) {
            aVar.destroy();
        }
        this.f6782h = null;
        CountDownTimer countDownTimer = this.f6785k;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f6785k = null;
        }
        C3640ao aoVar = this.f6788n;
        if (aoVar != null) {
            aoVar.f9916b = null;
            this.f6788n = null;
        }
        super.destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18186a(boolean z) {
        C2968n.C2969a aVar;
        this.f6783i = true;
        if (z) {
            if (this.f6749b == null) {
                aVar = new C2968n.C2969a(C2967m.FAIL_SAFE_ACTIVATED, (InneractiveAdRequest) null, (C3018e) null, (JSONArray) null);
            } else {
                aVar = new C2968n.C2969a(C2967m.FAIL_SAFE_ACTIVATED, this.f6749b.mo18130g(), this.f6749b.mo18129f(), this.f6749b.mo18132i().mo18013b());
            }
            aVar.mo18433a(new C2968n.C2971b().mo18438a("is_endcard", Boolean.valueOf(mo18190e())));
            aVar.mo18436b((String) null);
        }
        C2900c.C2901a aVar2 = this.f6782h;
        if (aVar2 != null) {
            aVar2.showCloseButton(z, mo18193h());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo18194t() {
        this.f6783i = true;
        C2900c.C2901a aVar = this.f6782h;
        if (aVar != null) {
            aVar.showAdditionalCloseButton();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18184a(int i) {
        C2900c.C2901a aVar = this.f6782h;
        if (aVar != null) {
            aVar.updateCloseCountdown(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo18195u() {
        final boolean z;
        final boolean z2;
        boolean z3;
        if (this.f6786l == null) {
            this.f6784j = mo18191f();
            if (this.f6749b != null) {
                z3 = mo18189c(this.f6749b);
                z2 = mo18187a(this.f6749b);
                z = mo18188b(this.f6749b);
            } else {
                z3 = false;
                z2 = false;
                z = false;
            }
            final long j = this.f6784j;
            this.f6786l = new Runnable() {
                public final void run() {
                    if (C2847l.this.mo18192g()) {
                        Runnable unused = C2847l.this.f6787m = new Runnable() {
                            public final void run() {
                                IAlog.m9034b("%sshowing fallback x transparent state is %s", IAlog.m9029a((Object) C2847l.this), Boolean.valueOf(z2));
                                C2847l.this.mo18186a(!z2);
                                if (z) {
                                    C2847l.this.mo18194t();
                                }
                                Runnable unused = C2847l.this.f6787m = null;
                            }
                        };
                        long a = C2847l.this.mo18183a(j);
                        C2847l.m6267a(C2847l.this, a);
                        IAlog.m9034b("%sad contains custom close. Will show transparent x in %d", IAlog.m9029a((Object) C2847l.this), Long.valueOf(a));
                        Runnable unused2 = C2847l.this.f6786l = null;
                        return;
                    }
                    IAlog.m9034b("%sad does not contain custom close. Showing close button", IAlog.m9029a((Object) C2847l.this));
                    C2847l.this.mo18186a(false);
                }
            };
            IAlog.m9034b("%senabling close with delay %d", IAlog.m9029a((Object) this), Long.valueOf(this.f6784j));
            if (!z3 || mo18192g()) {
                mo18196v();
            } else if (z3) {
                C2900c.C2901a aVar = this.f6782h;
                if (aVar != null) {
                    aVar.showCloseCountdown();
                }
                C28502 r0 = new CountDownTimer(this.f6784j + 100) {
                    public final void onTick(long j) {
                        C2847l.this.mo18184a(((int) j) / 1000);
                    }

                    public final void onFinish() {
                        if (C2847l.this.f6785k != null) {
                            C2847l.this.f6785k.cancel();
                        }
                        C2847l.this.mo18186a(false);
                    }
                };
                this.f6785k = r0;
                r0.start();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo18196v() {
        if (!this.f6789o) {
            this.f6789o = true;
            C3640ao aoVar = new C3640ao(TimeUnit.MILLISECONDS, this.f6784j);
            this.f6788n = aoVar;
            aoVar.f9916b = new C3640ao.C3642b() {
                /* renamed from: a */
                public final void mo18022a() {
                    C3662m.m9137a().post(C2847l.this.f6786l);
                    C2847l.m6269c(C2847l.this);
                }
            };
            this.f6788n.mo19562a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo18148n() {
        super.mo18148n();
    }

    /* renamed from: w */
    public void mo18197w() {
        C3640ao aoVar = this.f6788n;
        if (aoVar != null) {
            aoVar.mo19564b();
        }
    }

    /* renamed from: x */
    public void mo18198x() {
        C3640ao aoVar = this.f6788n;
        if (aoVar != null) {
            aoVar.mo19565c();
        }
    }

    /* renamed from: s */
    public final int mo18152s() {
        C2900c.C2901a aVar = this.f6782h;
        if (aVar == null || aVar.getLayout() == null) {
            return 1;
        }
        return this.f6782h.getLayout().getHeight();
    }

    /* renamed from: r */
    public final int mo18151r() {
        C2900c.C2901a aVar = this.f6782h;
        if (aVar == null || aVar.getLayout() == null) {
            return 1;
        }
        return this.f6782h.getLayout().getWidth();
    }

    /* renamed from: a */
    static /* synthetic */ void m6267a(C2847l lVar, long j) {
        C3640ao aoVar = new C3640ao(TimeUnit.MILLISECONDS, j);
        lVar.f6788n = aoVar;
        aoVar.f9916b = new C3640ao.C3642b() {
            /* renamed from: a */
            public final void mo18022a() {
                if (C2847l.this.f6787m != null) {
                    C3662m.m9137a().post(C2847l.this.f6787m);
                }
                C2847l.m6269c(C2847l.this);
            }
        };
        lVar.f6788n.mo19562a();
    }

    /* renamed from: c */
    static /* synthetic */ void m6269c(C2847l lVar) {
        C3640ao aoVar = lVar.f6788n;
        if (aoVar != null) {
            aoVar.f9916b = null;
            lVar.f6788n = null;
        }
    }
}
