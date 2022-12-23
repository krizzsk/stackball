package com.yandex.mobile.ads.impl;

import android.text.Layout;

final class yf1 {

    /* renamed from: a */
    private String f42834a;

    /* renamed from: b */
    private int f42835b;

    /* renamed from: c */
    private boolean f42836c;

    /* renamed from: d */
    private int f42837d;

    /* renamed from: e */
    private boolean f42838e;

    /* renamed from: f */
    private int f42839f = -1;

    /* renamed from: g */
    private int f42840g = -1;

    /* renamed from: h */
    private int f42841h = -1;

    /* renamed from: i */
    private int f42842i = -1;

    /* renamed from: j */
    private int f42843j = -1;

    /* renamed from: k */
    private float f42844k;

    /* renamed from: l */
    private String f42845l;

    /* renamed from: m */
    private Layout.Alignment f42846m;

    /* renamed from: a */
    public yf1 mo71059a(boolean z) {
        C13479j9.m37708b(true);
        this.f42841h = z ? 1 : 0;
        return this;
    }

    /* renamed from: b */
    public yf1 mo71063b(boolean z) {
        C13479j9.m37708b(true);
        this.f42842i = z ? 1 : 0;
        return this;
    }

    /* renamed from: c */
    public yf1 mo71065c(boolean z) {
        C13479j9.m37708b(true);
        this.f42839f = z ? 1 : 0;
        return this;
    }

    /* renamed from: d */
    public yf1 mo71068d(boolean z) {
        C13479j9.m37708b(true);
        this.f42840g = z ? 1 : 0;
        return this;
    }

    /* renamed from: e */
    public int mo71069e() {
        return this.f42843j;
    }

    /* renamed from: f */
    public String mo71070f() {
        return this.f42845l;
    }

    /* renamed from: g */
    public int mo71071g() {
        int i = this.f42841h;
        if (i == -1 && this.f42842i == -1) {
            return -1;
        }
        int i2 = 0;
        int i3 = i == 1 ? 1 : 0;
        if (this.f42842i == 1) {
            i2 = 2;
        }
        return i3 | i2;
    }

    /* renamed from: h */
    public Layout.Alignment mo71072h() {
        return this.f42846m;
    }

    /* renamed from: i */
    public boolean mo71073i() {
        return this.f42838e;
    }

    /* renamed from: j */
    public boolean mo71074j() {
        return this.f42836c;
    }

    /* renamed from: k */
    public boolean mo71075k() {
        return this.f42839f == 1;
    }

    /* renamed from: l */
    public boolean mo71076l() {
        return this.f42840g == 1;
    }

    /* renamed from: a */
    public yf1 mo71058a(String str) {
        C13479j9.m37708b(true);
        this.f42834a = str;
        return this;
    }

    /* renamed from: b */
    public int mo71060b() {
        if (this.f42836c) {
            return this.f42835b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    /* renamed from: c */
    public String mo71066c() {
        return this.f42834a;
    }

    /* renamed from: d */
    public float mo71067d() {
        return this.f42844k;
    }

    /* renamed from: c */
    public yf1 mo71064c(int i) {
        this.f42843j = i;
        return this;
    }

    /* renamed from: a */
    public int mo71053a() {
        if (this.f42838e) {
            return this.f42837d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    /* renamed from: b */
    public yf1 mo71061b(int i) {
        C13479j9.m37708b(true);
        this.f42835b = i;
        this.f42836c = true;
        return this;
    }

    /* renamed from: a */
    public yf1 mo71055a(int i) {
        this.f42837d = i;
        this.f42838e = true;
        return this;
    }

    /* renamed from: b */
    public yf1 mo71062b(String str) {
        this.f42845l = str;
        return this;
    }

    /* renamed from: a */
    public yf1 mo71057a(yf1 yf1) {
        if (yf1 != null) {
            if (!this.f42836c && yf1.f42836c) {
                int i = yf1.f42835b;
                C13479j9.m37708b(true);
                this.f42835b = i;
                this.f42836c = true;
            }
            if (this.f42841h == -1) {
                this.f42841h = yf1.f42841h;
            }
            if (this.f42842i == -1) {
                this.f42842i = yf1.f42842i;
            }
            if (this.f42834a == null) {
                this.f42834a = yf1.f42834a;
            }
            if (this.f42839f == -1) {
                this.f42839f = yf1.f42839f;
            }
            if (this.f42840g == -1) {
                this.f42840g = yf1.f42840g;
            }
            if (this.f42846m == null) {
                this.f42846m = yf1.f42846m;
            }
            if (this.f42843j == -1) {
                this.f42843j = yf1.f42843j;
                this.f42844k = yf1.f42844k;
            }
            if (!this.f42838e && yf1.f42838e) {
                this.f42837d = yf1.f42837d;
                this.f42838e = true;
            }
        }
        return this;
    }

    /* renamed from: a */
    public yf1 mo71056a(Layout.Alignment alignment) {
        this.f42846m = alignment;
        return this;
    }

    /* renamed from: a */
    public yf1 mo71054a(float f) {
        this.f42844k = f;
        return this;
    }
}
