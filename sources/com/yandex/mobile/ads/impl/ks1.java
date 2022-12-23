package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.rewarded.Reward;

public class ks1 implements Reward {

    /* renamed from: a */
    private final int f36407a;

    /* renamed from: b */
    private final String f36408b;

    public ks1(int i, String str) {
        this.f36407a = i;
        this.f36408b = str;
    }

    public int getAmount() {
        return this.f36407a;
    }

    public String getType() {
        return this.f36408b;
    }
}
