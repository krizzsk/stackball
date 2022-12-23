package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.base.model.reward.ClientSideReward;
import com.yandex.mobile.ads.base.model.reward.RewardData;
import com.yandex.mobile.ads.base.model.reward.ServerSideReward;
import java.util.ArrayList;
import java.util.Map;

public class s51 {

    /* renamed from: a */
    private final C13040fb f39858a = new C13040fb();

    /* renamed from: a */
    public RewardData mo69888a(fv0 fv0) {
        Integer num;
        Map<String, String> map = fv0.f33757c;
        String str = map.get(wb0.YMAD_REWARD_AMOUNT.mo70671a());
        int i = C13278h5.f34274b;
        ServerSideReward serverSideReward = null;
        try {
            num = Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            num = null;
        }
        String str2 = map.get(wb0.YMAD_REWARD_TYPE.mo70671a());
        String a = str2 != null ? this.f39858a.mo66949a(str2) : null;
        ClientSideReward clientSideReward = (num == null || TextUtils.isEmpty(a)) ? null : new ClientSideReward(num.intValue(), a);
        ArrayList arrayList = (ArrayList) p90.m40710b(map, wb0.YMAD_REWARD_URL);
        String str3 = arrayList.isEmpty() ? null : (String) arrayList.get(0);
        if (!TextUtils.isEmpty(str3)) {
            serverSideReward = new ServerSideReward(str3);
        }
        return new RewardData.C12113b().mo64565a(clientSideReward).mo64566a(serverSideReward).mo64567a(p90.m40709a(map, wb0.YMAD_SERVER_SIDE_REWARD, false)).mo64568a();
    }
}
