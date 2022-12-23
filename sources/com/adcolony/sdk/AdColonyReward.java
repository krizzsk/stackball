package com.adcolony.sdk;

import com.mbridge.msdk.foundation.entity.CampaignEx;

public class AdColonyReward {

    /* renamed from: a */
    private int f157a;

    /* renamed from: b */
    private String f158b;

    /* renamed from: c */
    private String f159c;

    /* renamed from: d */
    private boolean f160d;

    AdColonyReward(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        this.f157a = C0894y.m1163d(b, CampaignEx.JSON_KEY_REWARD_AMOUNT);
        this.f158b = C0894y.m1169h(b, CampaignEx.JSON_KEY_REWARD_NAME);
        this.f160d = C0894y.m1155b(b, "success");
        this.f159c = C0894y.m1169h(b, "zone_id");
    }

    public int getRewardAmount() {
        return this.f157a;
    }

    public String getRewardName() {
        return this.f158b;
    }

    public String getZoneID() {
        return this.f159c;
    }

    public boolean success() {
        return this.f160d;
    }
}
