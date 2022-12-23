package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;

public class c01 {

    /* renamed from: a */
    private final r40 f31782a;

    /* renamed from: b */
    private Float f31783b;

    public c01(r40 r40) {
        this.f31782a = r40;
    }

    /* renamed from: a */
    public void mo66178a(float f) {
        if (this.f31783b == null) {
            this.f31783b = mo66177a();
        }
        Player a = this.f31782a.mo69687a();
        if (a != null) {
            a.setVolume(f);
        }
    }

    /* renamed from: b */
    public void mo66179b() {
        Float f = this.f31783b;
        if (f != null) {
            float floatValue = f.floatValue();
            Player a = this.f31782a.mo69687a();
            if (a != null) {
                a.setVolume(floatValue);
            }
        }
        this.f31783b = null;
    }

    /* renamed from: a */
    public Float mo66177a() {
        Player a = this.f31782a.mo69687a();
        if (a != null) {
            return Float.valueOf(a.getVolume());
        }
        return null;
    }
}
