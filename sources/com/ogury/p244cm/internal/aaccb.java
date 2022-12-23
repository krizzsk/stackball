package com.ogury.p244cm.internal;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.ogury.cm.internal.aaccb */
public final class aaccb extends aacca {

    /* renamed from: com.ogury.cm.internal.aaccb$aaaaa */
    static final class aaaaa extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ aaccb f20371a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f20372b;

        /* renamed from: c */
        final /* synthetic */ Context f20373c;

        /* renamed from: d */
        final /* synthetic */ acabc f20374d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaaa(aaccb aaccb, CountDownLatch countDownLatch, Context context, acabc acabc) {
            super(0);
            this.f20371a = aaccb;
            this.f20372b = countDownLatch;
            this.f20373c = context;
            this.f20374d = acabc;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo52622a() {
            this.f20372b.await();
            this.f20371a.mo52656a().mo52611a(this.f20373c, this.f20374d, this.f20372b);
            return babcc.f20603a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aaccb(aacbc aacbc) {
        super(aacbc);
        bbabc.m22051b(aacbc, "requestScheduler");
    }

    /* renamed from: a */
    public final void mo52657a(Context context, acabc acabc, CountDownLatch countDownLatch) {
        bbabc.m22051b(context, "context");
        bbabc.m22051b(acabc, "requestType");
        bbabc.m22051b(countDownLatch, "countDownLatch");
        mo52656a().mo52613a(context, countDownLatch);
        bacbb.m22034a(false, false, (ClassLoader) null, (String) null, 0, new aaaaa(this, countDownLatch, context, acabc), 31, (Object) null);
    }
}
