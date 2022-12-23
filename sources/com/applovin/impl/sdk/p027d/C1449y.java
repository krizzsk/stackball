package com.applovin.impl.sdk.p027d;

import android.text.TextUtils;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.network.C1484a;
import com.applovin.impl.sdk.network.C1488b;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p025b.C1370d;
import com.applovin.impl.sdk.p027d.C1435s;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.d.y */
public abstract class C1449y<T> extends C1392a implements C1484a.C1487c<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1488b<T> f3411a;

    /* renamed from: c */
    private final C1484a.C1487c<T> f3412c;

    /* renamed from: d */
    protected C1484a.C1485a f3413d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C1435s.C1437a f3414e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C1369c<String> f3415f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1369c<String> f3416g;

    public C1449y(C1488b<T> bVar, C1469j jVar) {
        this(bVar, jVar, false);
    }

    public C1449y(C1488b<T> bVar, final C1469j jVar, boolean z) {
        super("TaskRepeatRequest", jVar, z);
        this.f3414e = C1435s.C1437a.BACKGROUND;
        this.f3415f = null;
        this.f3416g = null;
        if (bVar != null) {
            this.f3411a = bVar;
            this.f3413d = new C1484a.C1485a();
            this.f3412c = new C1484a.C1487c<T>() {
                /* renamed from: a */
                public void mo12144a(int i) {
                    C1369c cVar;
                    C1449y yVar;
                    boolean z = false;
                    boolean z2 = i < 200 || i >= 500;
                    boolean z3 = i == 429;
                    if (i != -103) {
                        z = true;
                    }
                    if (z && (z2 || z3)) {
                        String f = C1449y.this.f3411a.mo13187f();
                        if (C1449y.this.f3411a.mo13192j() > 0) {
                            C1449y yVar2 = C1449y.this;
                            yVar2.mo12947c("Unable to send request due to server failure (code " + i + "). " + C1449y.this.f3411a.mo13192j() + " attempts left, retrying in " + TimeUnit.MILLISECONDS.toSeconds((long) C1449y.this.f3411a.mo13194l()) + " seconds...");
                            int j = C1449y.this.f3411a.mo13192j() - 1;
                            C1449y.this.f3411a.mo13179a(j);
                            if (j == 0) {
                                C1449y yVar3 = C1449y.this;
                                yVar3.m2981c(yVar3.f3415f);
                                if (C1553o.m3554b(f) && f.length() >= 4) {
                                    C1449y.this.f3411a.mo13180a(f);
                                    C1449y yVar4 = C1449y.this;
                                    yVar4.mo12946b("Switching to backup endpoint " + f);
                                }
                            }
                            C1435s K = jVar.mo13071K();
                            C1449y yVar5 = C1449y.this;
                            K.mo13015a(yVar5, yVar5.f3414e, (long) C1449y.this.f3411a.mo13194l());
                            return;
                        }
                        if (f == null || !f.equals(C1449y.this.f3411a.mo13178a())) {
                            yVar = C1449y.this;
                            cVar = yVar.f3415f;
                        } else {
                            yVar = C1449y.this;
                            cVar = yVar.f3416g;
                        }
                        yVar.m2981c(cVar);
                    }
                    C1449y.this.mo12144a(i);
                }

                /* renamed from: a */
                public void mo12145a(T t, int i) {
                    C1449y.this.f3411a.mo13179a(0);
                    C1449y.this.mo12145a(t, i);
                }
            };
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public <ST> void m2981c(C1369c<ST> cVar) {
        if (cVar != null) {
            C1370d C = mo12948d().mo13064C();
            C.mo12844a((C1369c<?>) cVar, (Object) cVar.mo12839b());
            C.mo12847b();
        }
    }

    /* renamed from: a */
    public abstract void mo12144a(int i);

    /* renamed from: a */
    public void mo13035a(C1369c<String> cVar) {
        this.f3415f = cVar;
    }

    /* renamed from: a */
    public void mo13036a(C1435s.C1437a aVar) {
        this.f3414e = aVar;
    }

    /* renamed from: a */
    public abstract void mo12145a(T t, int i);

    /* renamed from: b */
    public void mo13037b(C1369c<String> cVar) {
        this.f3416g = cVar;
    }

    public void run() {
        int i;
        C1484a J = mo12948d().mo13070J();
        if (!mo12948d().mo13119c() && !mo12948d().mo13120d()) {
            mo12949d("AppLovin SDK is disabled: please check your connection");
            C1505q.m3345i("AppLovinSdk", "AppLovin SDK is disabled: please check your connection");
            i = -22;
        } else if (!C1553o.m3554b(this.f3411a.mo13178a()) || this.f3411a.mo13178a().length() < 4) {
            mo12949d("Task has an invalid or null request endpoint.");
            i = AppLovinErrorCodes.INVALID_URL;
        } else {
            if (TextUtils.isEmpty(this.f3411a.mo13181b())) {
                this.f3411a.mo13182b(this.f3411a.mo13185e() != null ? "POST" : "GET");
            }
            J.mo13170a(this.f3411a, this.f3413d, this.f3412c);
            return;
        }
        mo12144a(i);
    }
}
