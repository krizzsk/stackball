package com.yandex.metrica.billing.p263v4.library;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.yandex.metrica.billing_interface.C10074f;
import com.yandex.metrica.impl.p265ob.C11614p;
import com.yandex.metrica.impl.p265ob.C11667q;
import com.yandex.metrica.impl.p265ob.C11698r;
import com.yandex.metrica.impl.p265ob.C11727s;
import com.yandex.metrica.impl.p265ob.C11771t;
import com.yandex.metrica.impl.p265ob.C11800u;
import com.yandex.metrica.impl.p265ob.C11830v;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.billing.v4.library.c */
public final class C10066c implements C11698r, C11667q {

    /* renamed from: a */
    private C11614p f24190a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f24191b;

    /* renamed from: c */
    private final Executor f24192c;

    /* renamed from: d */
    private final Executor f24193d;

    /* renamed from: e */
    private final C11771t f24194e;

    /* renamed from: f */
    private final C11727s f24195f;

    /* renamed from: g */
    private final C11830v f24196g;

    /* renamed from: com.yandex.metrica.billing.v4.library.c$a */
    public static final class C10067a extends C10074f {

        /* renamed from: a */
        final /* synthetic */ C10066c f24197a;

        /* renamed from: b */
        final /* synthetic */ C11614p f24198b;

        C10067a(C10066c cVar, C11614p pVar) {
            this.f24197a = cVar;
            this.f24198b = pVar;
        }

        /* renamed from: a */
        public void mo60938a() {
            BillingClient build = BillingClient.newBuilder(this.f24197a.f24191b).setListener(new PurchasesUpdatedListenerImpl()).enablePendingPurchases().build();
            Intrinsics.checkNotNullExpressionValue(build, "BillingClient\n          …                 .build()");
            build.startConnection(new BillingClientStateListenerImpl(this.f24198b, build, this.f24197a));
        }
    }

    public C10066c(Context context, Executor executor, Executor executor2, C11800u uVar, C11771t tVar, C11727s sVar, C11830v vVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "workerExecutor");
        Intrinsics.checkNotNullParameter(executor2, "uiExecutor");
        Intrinsics.checkNotNullParameter(uVar, "billingInfoStorage");
        Intrinsics.checkNotNullParameter(tVar, "billingInfoSender");
        Intrinsics.checkNotNullParameter(sVar, "billingInfoManager");
        Intrinsics.checkNotNullParameter(vVar, "updatePolicy");
        this.f24191b = context;
        this.f24192c = executor;
        this.f24193d = executor2;
        this.f24194e = tVar;
        this.f24195f = sVar;
        this.f24196g = vVar;
    }

    /* renamed from: b */
    public void mo60945b() {
        C11614p pVar = this.f24190a;
        if (pVar != null) {
            this.f24193d.execute(new C10067a(this, pVar));
        }
    }

    /* renamed from: c */
    public Executor mo60946c() {
        return this.f24193d;
    }

    /* renamed from: d */
    public C11771t mo60947d() {
        return this.f24194e;
    }

    /* renamed from: e */
    public C11727s mo60948e() {
        return this.f24195f;
    }

    /* renamed from: f */
    public C11830v mo60949f() {
        return this.f24196g;
    }

    /* renamed from: a */
    public synchronized void mo60944a(C11614p pVar) {
        this.f24190a = pVar;
    }

    /* renamed from: a */
    public Executor mo60943a() {
        return this.f24192c;
    }
}
