package com.yandex.mobile.ads.impl;

import com.p243my.target.ads.Reward;
import org.json.JSONObject;

public enum jo1 implements vh0 {
    f35418c(Reward.DEFAULT),
    LOADING("loading"),
    HIDDEN("hidden");
    

    /* renamed from: b */
    private final String f35422b;

    private jo1(String str) {
        this.f35422b = str;
    }

    /* renamed from: a */
    public String mo66428a() {
        return String.format("state: %s", new Object[]{JSONObject.quote(this.f35422b)});
    }
}
