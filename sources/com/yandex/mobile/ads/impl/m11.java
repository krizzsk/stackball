package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;

public class m11 implements t11, b01 {

    /* renamed from: a */
    private final t11 f37161a;

    /* renamed from: b */
    private tz0 f37162b = tz0.f40532c;

    /* renamed from: c */
    private t11 f37163c;

    public m11(t11 t11) {
        this.f37161a = t11;
    }

    /* renamed from: a */
    public tz0 mo65690a() {
        t11 t11 = this.f37163c;
        if (t11 == null) {
            t11 = this.f37161a;
        }
        tz0 a = t11.mo65690a();
        this.f37162b = a;
        return a;
    }

    /* renamed from: a */
    public void mo65931a(Player player) {
        this.f37163c = player == null ? new a70(this.f37162b) : null;
    }
}
