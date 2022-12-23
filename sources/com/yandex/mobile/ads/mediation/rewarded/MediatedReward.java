package com.yandex.mobile.ads.mediation.rewarded;

import com.yandex.mobile.ads.rewarded.Reward;

final class MediatedReward implements Reward {

    /* renamed from: a */
    private final int f43691a;

    /* renamed from: b */
    private final String f43692b;

    public MediatedReward(int i, String str) {
        this.f43691a = i;
        this.f43692b = str;
    }

    public int getAmount() {
        return this.f43691a;
    }

    public String getType() {
        return this.f43692b;
    }
}
