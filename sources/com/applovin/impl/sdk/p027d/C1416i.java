package com.applovin.impl.sdk.p027d;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1473k;

/* renamed from: com.applovin.impl.sdk.d.i */
public class C1416i extends C1392a {

    /* renamed from: a */
    private final C1417a f3315a;

    /* renamed from: com.applovin.impl.sdk.d.i$a */
    public interface C1417a {
        /* renamed from: a */
        void mo12575a(C1473k.C1475a aVar);
    }

    public C1416i(C1469j jVar, C1417a aVar) {
        super("TaskCollectAdvertisingId", jVar);
        this.f3315a = aVar;
    }

    public void run() {
        this.f3315a.mo12575a(this.f3279b.mo13074N().mo13152d());
    }
}
