package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.impl.ke1;
import java.io.EOFException;
import java.io.IOException;

public final class l20 implements ke1 {
    /* renamed from: a */
    public int mo65335a(C13416ik ikVar, int i, boolean z) throws IOException, InterruptedException {
        int c = ikVar.mo67810c(i);
        if (c != -1) {
            return c;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    public void mo65337a(long j, int i, int i2, int i3, ke1.C13702a aVar) {
    }

    /* renamed from: a */
    public void mo65339a(Format format) {
    }

    /* renamed from: a */
    public void mo65341a(fy0 fy0, int i) {
        fy0.mo67114f(i);
    }
}
