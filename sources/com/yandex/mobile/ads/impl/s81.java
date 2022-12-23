package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;

public abstract class s81 extends p81<cc1, dc1, ac1> implements zb1 {
    protected s81(String str) {
        super(new cc1[2], new dc1[2]);
        mo69330a(1024);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract yb1 mo65718a(byte[] bArr, int i, boolean z) throws ac1;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Exception mo69329a(C14387qj qjVar, kx0 kx0, boolean z) {
        cc1 cc1 = (cc1) qjVar;
        dc1 dc1 = (dc1) kx0;
        try {
            ByteBuffer byteBuffer = cc1.f39147d;
            byteBuffer.getClass();
            yb1 a = mo65718a(byteBuffer.array(), byteBuffer.limit(), z);
            dc1.mo66556a(cc1.f39149f, a, cc1.f31888i);
            dc1.mo71016c(Integer.MIN_VALUE);
            return null;
        } catch (ac1 e) {
            return e;
        }
    }

    /* renamed from: a */
    public void mo69357a(long j) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C14387qj mo69332c() {
        return new cc1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public kx0 mo69333d() {
        return new t81(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69904a(dc1 dc1) {
        mo69331a(dc1);
    }
}
