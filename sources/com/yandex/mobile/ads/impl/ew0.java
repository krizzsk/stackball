package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.io.IOException;

final class ew0 {

    /* renamed from: a */
    public int f33166a;

    /* renamed from: b */
    public long f33167b;

    /* renamed from: c */
    public int f33168c;

    /* renamed from: d */
    public int f33169d;

    /* renamed from: e */
    public int f33170e;

    /* renamed from: f */
    public final int[] f33171f = new int[255];

    /* renamed from: g */
    private final fy0 f33172g = new fy0(255);

    ew0() {
    }

    /* renamed from: a */
    public void mo66879a() {
        this.f33166a = 0;
        this.f33167b = 0;
        this.f33168c = 0;
        this.f33169d = 0;
        this.f33170e = 0;
    }

    /* renamed from: a */
    public boolean mo66880a(C13416ik ikVar, boolean z) throws IOException, InterruptedException {
        this.f33172g.mo67134z();
        mo66879a();
        if (!(ikVar.mo67804a() == -1 || ikVar.mo67804a() - ikVar.mo67808b() >= 27) || !ikVar.mo67806a(this.f33172g.f33778a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        } else if (this.f33172g.mo67128t() != 1332176723) {
            if (z) {
                return false;
            }
            throw new jy0("expected OggS capture pattern at begin of page");
        } else if (this.f33172g.mo67126r() == 0) {
            this.f33166a = this.f33172g.mo67126r();
            this.f33167b = this.f33172g.mo67118j();
            this.f33172g.mo67119k();
            this.f33172g.mo67119k();
            this.f33172g.mo67119k();
            int r = this.f33172g.mo67126r();
            this.f33168c = r;
            this.f33169d = r + 27;
            this.f33172g.mo67134z();
            ikVar.mo67806a(this.f33172g.f33778a, 0, this.f33168c, false);
            for (int i = 0; i < this.f33168c; i++) {
                this.f33171f[i] = this.f33172g.mo67126r();
                this.f33170e += this.f33171f[i];
            }
            return true;
        } else if (z) {
            return false;
        } else {
            throw new jy0("unsupported bit stream revision");
        }
    }
}
