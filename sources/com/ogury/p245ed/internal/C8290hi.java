package com.ogury.p245ed.internal;

import com.smaato.sdk.video.vast.model.Creative;
import p269io.presage.common.network.models.RewardItem;

/* renamed from: com.ogury.ed.internal.hi */
public final class C8290hi extends C8287hf {

    /* renamed from: a */
    private final RewardItem f21411a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8290hi(String str, RewardItem rewardItem) {
        super(str, rewardItem.getName());
        C8467mq.m23881b(str, Creative.AD_ID);
        C8467mq.m23881b(rewardItem, "rewardItem");
        this.f21411a = rewardItem;
    }

    /* renamed from: a */
    public final RewardItem mo53656a() {
        return this.f21411a;
    }
}
