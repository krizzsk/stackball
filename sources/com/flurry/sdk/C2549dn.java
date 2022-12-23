package com.flurry.sdk;

import com.flurry.sdk.C2548dm;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.flurry.sdk.dn */
public abstract class C2549dn<ReportInfo extends C2548dm> {

    /* renamed from: a */
    private static final String f6003a = C2549dn.class.getSimpleName();

    /* renamed from: b */
    protected static long f6004b = TapjoyConstants.TIMER_INCREMENT;

    /* renamed from: c */
    public boolean f6005c;

    /* renamed from: d */
    protected long f6006d;

    /* renamed from: e */
    public final Runnable f6007e = new C2621eo() {
        /* renamed from: a */
        public final void mo17573a() {
            C2549dn.this.m5539b();
        }
    };

    /* renamed from: f */
    public final C2510cv<C2467bx> f6008f = new C2510cv<C2467bx>() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo17521a(C2509cu cuVar) {
            if (((C2467bx) cuVar).f5758a) {
                C2549dn.this.m5539b();
            }
        }
    };

    /* renamed from: g */
    private final int f6009g = Integer.MAX_VALUE;

    /* renamed from: h */
    private final C2508ct<List<ReportInfo>> f6010h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final List<ReportInfo> f6011i = new ArrayList();

    /* renamed from: j */
    private int f6012j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C2508ct<List<ReportInfo>> mo17576a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo17577a(ReportInfo reportinfo);

    public C2549dn() {
        C2511cw.m5419a().mo17723a("com.flurry.android.sdk.NetworkStateEvent", this.f6008f);
        this.f6010h = mo17576a();
        this.f6006d = f6004b;
        this.f6012j = -1;
        C2494ck.m5371a().mo17685b(new C2621eo() {
            /* renamed from: a */
            public final void mo17573a() {
                C2549dn dnVar = C2549dn.this;
                dnVar.mo17578a(dnVar.f6011i);
                C2549dn.this.m5539b();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo17578a(List<ReportInfo> list) {
        C2619em.m5697a();
        List a = this.f6010h.mo17716a();
        if (a != null) {
            list.addAll(a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m5539b() {
        if (!this.f6005c) {
            if (this.f6012j >= 0) {
                C2530db.m5474a(3, f6003a, "Transmit is in progress");
                return;
            }
            m5540c();
            if (this.f6011i.isEmpty()) {
                this.f6006d = f6004b;
                this.f6012j = -1;
                return;
            }
            this.f6012j = 0;
            C2494ck.m5371a().mo17685b(new C2621eo() {
                /* renamed from: a */
                public final void mo17573a() {
                    C2549dn.this.m5542d();
                }
            });
        }
    }

    /* renamed from: c */
    private synchronized void m5540c() {
        Iterator<ReportInfo> it = this.f6011i.iterator();
        while (it.hasNext()) {
            C2548dm dmVar = (C2548dm) it.next();
            if (dmVar.f5998o) {
                String str = f6003a;
                C2530db.m5474a(3, str, "Url transmitted - " + dmVar.f6000q + " Attempts: " + dmVar.f5999p);
                it.remove();
            } else if (dmVar.f5999p > dmVar.f6002s) {
                String str2 = f6003a;
                C2530db.m5474a(3, str2, "Exceeded max no of attempts - " + dmVar.f6000q + " Attempts: " + dmVar.f5999p);
                it.remove();
            } else if (System.currentTimeMillis() > dmVar.f5997n && dmVar.f5999p > 0) {
                String str3 = f6003a;
                C2530db.m5474a(3, str3, "Expired: Time expired - " + dmVar.f6000q + " Attempts: " + dmVar.f5999p);
                it.remove();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public synchronized void m5542d() {
        C2619em.m5697a();
        C2548dm dmVar = null;
        if (C2468by.m5319a().f5763c) {
            while (true) {
                if (this.f6012j >= this.f6011i.size()) {
                    break;
                }
                List<ReportInfo> list = this.f6011i;
                int i = this.f6012j;
                this.f6012j = i + 1;
                C2548dm dmVar2 = (C2548dm) list.get(i);
                if (!dmVar2.f5998o) {
                    dmVar = dmVar2;
                    break;
                }
            }
        } else {
            C2530db.m5474a(3, f6003a, "Network is not available, aborting transmission");
        }
        if (dmVar == null) {
            m5543e();
        } else {
            mo17577a(dmVar);
        }
    }

    /* renamed from: e */
    private synchronized void m5543e() {
        m5540c();
        mo17579b(this.f6011i);
        if (this.f6005c) {
            C2530db.m5474a(3, f6003a, "Reporter paused");
            this.f6006d = f6004b;
        } else if (this.f6011i.isEmpty()) {
            C2530db.m5474a(3, f6003a, "All reports sent successfully");
            this.f6006d = f6004b;
        } else {
            this.f6006d <<= 1;
            C2530db.m5474a(3, f6003a, "One or more reports failed to send, backing off: " + this.f6006d + "ms");
            C2494ck.m5371a().mo17684a(this.f6007e, this.f6006d);
        }
        this.f6012j = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public synchronized void mo17579b(List<ReportInfo> list) {
        C2619em.m5697a();
        this.f6010h.mo17717a(new ArrayList(list));
    }

    /* renamed from: b */
    public final synchronized void mo17771b(ReportInfo reportinfo) {
        if (reportinfo != null) {
            this.f6011i.add(reportinfo);
            C2494ck.m5371a().mo17685b(new C2621eo() {
                /* renamed from: a */
                public final void mo17573a() {
                    C2549dn.this.m5539b();
                }
            });
        }
    }

    /* renamed from: d */
    public final synchronized void mo17773d(ReportInfo reportinfo) {
        reportinfo.mo17580a();
        C2494ck.m5371a().mo17685b(new C2621eo() {
            /* renamed from: a */
            public final void mo17573a() {
                C2549dn.this.m5542d();
            }
        });
    }

    /* renamed from: c */
    public final synchronized void mo17772c(ReportInfo reportinfo) {
        reportinfo.f5998o = true;
        C2494ck.m5371a().mo17685b(new C2621eo() {
            /* renamed from: a */
            public final void mo17573a() {
                C2549dn.this.m5542d();
            }
        });
    }
}
