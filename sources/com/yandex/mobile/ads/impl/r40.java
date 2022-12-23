package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import java.util.HashSet;
import java.util.Set;

public class r40 {

    /* renamed from: a */
    private final Set<b01> f39364a = new HashSet();

    /* renamed from: b */
    private Player f39365b;

    /* renamed from: a */
    public void mo69689a(b01 b01) {
        this.f39364a.add(b01);
    }

    /* renamed from: b */
    public boolean mo69690b() {
        return this.f39365b != null;
    }

    /* renamed from: a */
    public void mo69688a(Player player) {
        this.f39365b = player;
        for (b01 a : this.f39364a) {
            a.mo65931a(player);
        }
    }

    /* renamed from: a */
    public Player mo69687a() {
        return this.f39365b;
    }
}
