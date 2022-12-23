package com.flurry.sdk;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.flurry.sdk.do */
public abstract class C2558do {

    /* renamed from: a */
    protected final String f6021a;

    /* renamed from: b */
    protected String f6022b = "defaultDataKey_";

    /* renamed from: c */
    Set<String> f6023c = new HashSet();

    /* renamed from: d */
    C2571dq f6024d;

    /* renamed from: e */
    private C2510cv<C2467bx> f6025e = new C2510cv<C2467bx>() {
        /* renamed from: a */
        public final /* synthetic */ void mo17521a(C2509cu cuVar) {
            C2467bx bxVar = (C2467bx) cuVar;
            String str = C2558do.this.f6021a;
            C2530db.m5474a(4, str, "onNetworkStateChanged : isNetworkEnable = " + bxVar.f5758a);
            if (bxVar.f5758a) {
                C2558do.this.mo17778d();
            }
        }
    };

    /* renamed from: com.flurry.sdk.do$a */
    public interface C2565a {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo17625a(byte[] bArr, String str, String str2);

    public C2558do(final String str, String str2) {
        this.f6021a = str2;
        C2511cw.m5419a().mo17723a("com.flurry.android.sdk.NetworkStateEvent", this.f6025e);
        C2494ck.m5371a().mo17685b(new C2621eo() {
            /* renamed from: a */
            public final void mo17573a() {
                C2558do.this.f6024d = new C2571dq(str);
            }
        });
    }

    /* renamed from: b */
    public final void mo17775b(final byte[] bArr, final String str, final String str2) {
        if (bArr == null || bArr.length == 0) {
            C2530db.m5474a(6, this.f6021a, "Report that has to be sent is EMPTY or NULL");
            return;
        }
        C2494ck.m5371a().mo17685b(new C2621eo() {
            /* renamed from: a */
            public final void mo17573a() {
                C2558do.this.mo17777c(bArr, str, str2);
            }
        });
        mo17774b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo17774b() {
        C2494ck.m5371a().mo17685b(new C2621eo() {

            /* renamed from: a */
            final /* synthetic */ C2565a f6033a = null;

            /* renamed from: a */
            public final void mo17573a() {
                C2558do.this.mo17776c();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo17776c() {
        if (!C2468by.m5319a().f5763c) {
            C2530db.m5474a(5, this.f6021a, "Reports were not sent! No Internet connection!");
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>(this.f6024d.f6048c.keySet());
        if (arrayList.isEmpty()) {
            C2530db.m5474a(4, this.f6021a, "No more reports to send.");
            return;
        }
        for (String str : arrayList) {
            if (m5559a()) {
                List<String> a = this.f6024d.mo17781a(str);
                String str2 = this.f6021a;
                C2530db.m5474a(4, str2, "Number of not sent blocks = " + a.size());
                for (String next : a) {
                    if (!this.f6023c.contains(next)) {
                        if (!m5559a()) {
                            break;
                        }
                        C2566dp a2 = C2566dp.m5575b(next).mo17716a();
                        if (a2 == null) {
                            C2530db.m5474a(6, this.f6021a, "Internal ERROR! Cannot read!");
                            this.f6024d.mo17783a(next, str);
                        } else {
                            byte[] bArr = a2.f6041b;
                            if (bArr == null || bArr.length == 0) {
                                C2530db.m5474a(6, this.f6021a, "Internal ERROR! Report is empty!");
                                this.f6024d.mo17783a(next, str);
                            } else {
                                C2530db.m5474a(5, this.f6021a, "Reading block info ".concat(String.valueOf(next)));
                                this.f6023c.add(next);
                                mo17625a(bArr, next, str);
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private boolean m5559a() {
        return m5560e() <= 5;
    }

    /* renamed from: e */
    private int m5560e() {
        return this.f6023c.size();
    }

    /* renamed from: d */
    public final void mo17778d() {
        mo17774b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17624a(final String str, final String str2, int i) {
        C2494ck.m5371a().mo17685b(new C2621eo() {
            /* renamed from: a */
            public final void mo17573a() {
                if (!C2558do.this.f6024d.mo17783a(str, str2)) {
                    String str = C2558do.this.f6021a;
                    C2530db.m5474a(6, str, "Internal error. Block wasn't deleted with id = " + str);
                }
                if (!C2558do.this.f6023c.remove(str)) {
                    String str2 = C2558do.this.f6021a;
                    C2530db.m5474a(6, str2, "Internal error. Block with id = " + str + " was not in progress state");
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo17777c(byte[] bArr, String str, String str2) {
        String str3 = this.f6022b + str + "_" + str2;
        C2566dp dpVar = new C2566dp(bArr);
        String str4 = dpVar.f6040a;
        C2566dp.m5575b(str4).mo17717a(dpVar);
        C2530db.m5474a(5, this.f6021a, "Saving Block File " + str4 + " at " + C2494ck.m5371a().f5832a.getFileStreamPath(C2566dp.m5574a(str4)));
        this.f6024d.mo17782a(dpVar, str3);
    }
}
