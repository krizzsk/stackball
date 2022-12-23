package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.model.reward.ClientSideReward;
import com.yandex.mobile.ads.rewarded.C15558a;
import com.yandex.mobile.ads.rewarded.Reward;

/* renamed from: com.yandex.mobile.ads.impl.if */
public class C13408if implements d61 {

    /* renamed from: a */
    private final ks1 f34844a;

    /* renamed from: b */
    private final C15558a f34845b;

    public C13408if(ClientSideReward clientSideReward, C15558a aVar) {
        this.f34845b = aVar;
        this.f34844a = new ks1(clientSideReward.mo64552c(), clientSideReward.mo64553d());
    }

    /* renamed from: a */
    public void mo66233a() {
        this.f34845b.mo71959b((Reward) this.f34844a);
    }
}
