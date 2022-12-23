package com.yandex.metrica.billing.p262v3.library;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.yandex.metrica.billing_interface.C10074f;
import com.yandex.metrica.impl.p265ob.C11614p;
import com.yandex.metrica.impl.p265ob.C11667q;
import com.yandex.metrica.impl.p265ob.C11698r;
import com.yandex.metrica.impl.p265ob.C11727s;
import com.yandex.metrica.impl.p265ob.C11771t;
import com.yandex.metrica.impl.p265ob.C11830v;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.billing.v3.library.c */
public class C10051c implements C11698r, C11667q {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f24132a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f24133b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Executor f24134c;

    /* renamed from: d */
    private final C11727s f24135d;

    /* renamed from: e */
    private final C11830v f24136e;

    /* renamed from: f */
    private final C11771t f24137f;

    /* renamed from: g */
    private C11614p f24138g;

    /* renamed from: com.yandex.metrica.billing.v3.library.c$a */
    class C10052a extends C10074f {

        /* renamed from: a */
        final /* synthetic */ C11614p f24139a;

        C10052a(C11614p pVar) {
            this.f24139a = pVar;
        }

        /* renamed from: a */
        public void mo60938a() {
            BillingClient build = BillingClient.newBuilder(C10051c.this.f24132a).setListener(new PurchasesUpdatedListenerImpl()).enablePendingPurchases().build();
            build.startConnection(new BillingClientStateListenerImpl(this.f24139a, C10051c.this.f24133b, C10051c.this.f24134c, build, C10051c.this, new C10050b(build)));
        }
    }

    public C10051c(Context context, Executor executor, Executor executor2, C11727s sVar, C11830v vVar, C11771t tVar) {
        this.f24132a = context;
        this.f24133b = executor;
        this.f24134c = executor2;
        this.f24135d = sVar;
        this.f24136e = vVar;
        this.f24137f = tVar;
    }

    /* renamed from: d */
    public C11771t mo60947d() {
        return this.f24137f;
    }

    /* renamed from: e */
    public C11727s mo60948e() {
        return this.f24135d;
    }

    /* renamed from: f */
    public C11830v mo60949f() {
        return this.f24136e;
    }

    /* renamed from: a */
    public synchronized void mo60944a(C11614p pVar) {
        this.f24138g = pVar;
    }

    /* renamed from: b */
    public void mo60945b() throws Throwable {
        C11614p pVar = this.f24138g;
        if (pVar != null) {
            this.f24134c.execute(new C10052a(pVar));
        }
    }

    /* renamed from: c */
    public Executor mo60946c() {
        return this.f24134c;
    }

    /* renamed from: a */
    public Executor mo60943a() {
        return this.f24133b;
    }
}
