package com.yandex.mobile.ads.impl;

import android.util.Log;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.ke1;
import com.yandex.mobile.ads.impl.tf1;

public final class oc0 implements a30 {

    /* renamed from: a */
    private final fy0 f38144a = new fy0(10);

    /* renamed from: b */
    private ke1 f38145b;

    /* renamed from: c */
    private boolean f38146c;

    /* renamed from: d */
    private long f38147d;

    /* renamed from: e */
    private int f38148e;

    /* renamed from: f */
    private int f38149f;

    /* renamed from: a */
    public void mo65661a() {
        this.f38146c = false;
    }

    /* renamed from: b */
    public void mo65665b() {
        int i;
        if (this.f38146c && (i = this.f38148e) != 0 && this.f38149f == i) {
            this.f38145b.mo65337a(this.f38147d, 1, i, 0, (ke1.C13702a) null);
            this.f38146c = false;
        }
    }

    /* renamed from: a */
    public void mo65664a(x50 x50, tf1.C14678d dVar) {
        dVar.mo70177a();
        ke1 a = x50.mo65304a(dVar.mo70179c(), 4);
        this.f38145b = a;
        a.mo65339a(Format.m31686a(dVar.mo70178b(), "application/id3", (String) null, -1, (DrmInitData) null));
    }

    /* renamed from: a */
    public void mo65662a(long j, int i) {
        if ((i & 4) != 0) {
            this.f38146c = true;
            this.f38147d = j;
            this.f38148e = 0;
            this.f38149f = 0;
        }
    }

    /* renamed from: a */
    public void mo65663a(fy0 fy0) {
        if (this.f38146c) {
            int a = fy0.mo67098a();
            int i = this.f38149f;
            if (i < 10) {
                int min = Math.min(a, 10 - i);
                System.arraycopy(fy0.f33778a, fy0.mo67105b(), this.f38144a.f33778a, this.f38149f, min);
                if (this.f38149f + min == 10) {
                    this.f38144a.mo67112e(0);
                    if (73 == this.f38144a.mo67126r() && 68 == this.f38144a.mo67126r() && 51 == this.f38144a.mo67126r()) {
                        this.f38144a.mo67114f(3);
                        this.f38148e = this.f38144a.mo67125q() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f38146c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a, this.f38148e - this.f38149f);
            this.f38145b.mo65341a(fy0, min2);
            this.f38149f += min2;
        }
    }
}
