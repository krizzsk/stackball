package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.iq1;
import java.util.ArrayList;
import java.util.Collections;

public final class qo0 extends s81 {

    /* renamed from: n */
    private final fy0 f39200n = new fy0();

    /* renamed from: o */
    private final iq1.C13435b f39201o = new iq1.C13435b();

    public qo0() {
        super("Mp4WebvttDecoder");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public yb1 mo65718a(byte[] bArr, int i, boolean z) throws ac1 {
        this.f39200n.mo67103a(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.f39200n.mo67098a() > 0) {
            if (this.f39200n.mo67098a() >= 8) {
                int f = this.f39200n.mo67113f();
                if (this.f39200n.mo67113f() == 1987343459) {
                    fy0 fy0 = this.f39200n;
                    iq1.C13435b bVar = this.f39201o;
                    int i2 = f - 8;
                    bVar.mo67880b();
                    while (i2 > 0) {
                        if (i2 >= 8) {
                            int f2 = fy0.mo67113f();
                            int f3 = fy0.mo67113f();
                            int i3 = f2 - 8;
                            String a = ih1.m37376a(fy0.f33778a, fy0.mo67105b(), i3);
                            fy0.mo67114f(i3);
                            i2 = (i2 - 8) - i3;
                            if (f3 == 1937011815) {
                                jq1.m37948a(a, bVar);
                            } else if (f3 == 1885436268) {
                                jq1.m37950a((String) null, a.trim(), bVar, Collections.emptyList());
                            }
                        } else {
                            throw new ac1("Incomplete vtt cue box header found.");
                        }
                    }
                    arrayList.add(bVar.mo67876a());
                } else {
                    this.f39200n.mo67114f(f - 8);
                }
            } else {
                throw new ac1("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new ro0(arrayList);
    }
}
