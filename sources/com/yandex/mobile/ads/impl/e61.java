package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.reward.ClientSideReward;
import com.yandex.mobile.ads.base.model.reward.RewardData;
import com.yandex.mobile.ads.base.model.reward.ServerSideReward;
import com.yandex.mobile.ads.rewarded.C15558a;

public class e61 {

    /* renamed from: a */
    private final C15558a f32919a;

    public e61(C15558a aVar) {
        this.f32919a = aVar;
    }

    /* renamed from: a */
    public d61 mo66771a(Context context, C14645t1 t1Var, AdResponse<String> adResponse) {
        RewardData A = adResponse != null ? adResponse.mo64410A() : null;
        if (A == null) {
            return null;
        }
        if (A.mo64561e()) {
            ServerSideReward d = A.mo64559d();
            if (d != null) {
                return new c81(context, t1Var, d);
            }
            return null;
        }
        ClientSideReward c = A.mo64558c();
        if (c != null) {
            return new C13408if(c, this.f32919a);
        }
        return null;
    }
}
