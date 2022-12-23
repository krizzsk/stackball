package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;

/* renamed from: com.yandex.mobile.ads.impl.ri */
public final class C14463ri {

    /* renamed from: a */
    public byte[] f39464a;

    /* renamed from: b */
    public int[] f39465b;

    /* renamed from: c */
    public int[] f39466c;

    /* renamed from: d */
    private final MediaCodec.CryptoInfo f39467d;

    /* renamed from: e */
    private final C14465b f39468e;

    /* renamed from: com.yandex.mobile.ads.impl.ri$b */
    private static final class C14465b {

        /* renamed from: a */
        private final MediaCodec.CryptoInfo f39469a;

        /* renamed from: b */
        private final MediaCodec.CryptoInfo.Pattern f39470b;

        /* renamed from: a */
        static void m41591a(C14465b bVar, int i, int i2) {
            bVar.f39470b.set(i, i2);
            bVar.f39469a.setPattern(bVar.f39470b);
        }

        private C14465b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f39469a = cryptoInfo;
            this.f39470b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public C14463ri() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f39467d = cryptoInfo;
        this.f39468e = ih1.f34858a >= 24 ? new C14465b(cryptoInfo) : null;
    }

    /* renamed from: a */
    public void mo69767a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f39465b = iArr;
        this.f39466c = iArr2;
        this.f39464a = bArr2;
        MediaCodec.CryptoInfo cryptoInfo = this.f39467d;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (ih1.f34858a >= 24) {
            C14465b.m41591a(this.f39468e, i3, i4);
        }
    }

    /* renamed from: a */
    public MediaCodec.CryptoInfo mo69766a() {
        return this.f39467d;
    }
}
