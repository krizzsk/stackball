package com.yandex.mobile.ads.impl;

import java.util.List;

public final class o20 extends s81 {

    /* renamed from: n */
    private final p20 f38058n;

    public o20(List<byte[]> list) {
        super("DvbDecoder");
        fy0 fy0 = new fy0(list.get(0));
        this.f38058n = new p20(fy0.mo67132x(), fy0.mo67132x());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public yb1 mo65718a(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f38058n.mo69301d();
        }
        return new q20(this.f38058n.mo69300a(bArr, i));
    }
}
