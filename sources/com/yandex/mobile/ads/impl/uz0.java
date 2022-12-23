package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;

public class uz0 {

    /* renamed from: a */
    private final C12952e3 f41159a;

    /* renamed from: b */
    private final nj0 f41160b;

    /* renamed from: c */
    private final yz0 f41161c;

    public uz0(C12952e3 e3Var, u01 u01, cm1 cm1, yz0 yz0) {
        this.f41159a = e3Var;
        this.f41161c = yz0;
        this.f41160b = new nj0(u01, cm1);
    }

    /* renamed from: a */
    private boolean m42994a(Player player, int i) {
        if (i == 2 && !player.isPlayingAd()) {
            AdPlaybackState a = this.f41159a.mo66746a();
            int a2 = this.f41160b.mo69034a(a);
            if (a2 == -1) {
                return false;
            }
            AdPlaybackState.AdGroup adGroup = a.adGroups[a2];
            int i2 = adGroup.count;
            if (i2 == -1 || i2 == 0 || adGroup.states[0] == 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo70423b(Player player, int i) {
        if (m42994a(player, i)) {
            this.f41161c.mo71137a(player.getPlayWhenReady(), i);
        }
    }
}
