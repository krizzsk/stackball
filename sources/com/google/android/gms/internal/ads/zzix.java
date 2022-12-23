package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzix {

    /* renamed from: iv */
    public byte[] f10087iv;
    private byte[] key;
    private int mode;
    public int[] numBytesOfClearData;
    public int[] numBytesOfEncryptedData;
    private int numSubSamples;
    private int zzana;
    private int zzanb;
    private final MediaCodec.CryptoInfo zzanc;
    private final zziz zzand;

    public zzix() {
        zziz zziz = null;
        this.zzanc = zzov.SDK_INT >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.zzand = zzov.SDK_INT >= 24 ? new zziz(this.zzanc) : zziz;
    }

    public final void set(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.numSubSamples = i;
        this.numBytesOfClearData = iArr;
        this.numBytesOfEncryptedData = iArr2;
        this.key = bArr;
        this.f10087iv = bArr2;
        this.mode = i2;
        this.zzana = 0;
        this.zzanb = 0;
        if (zzov.SDK_INT >= 16) {
            this.zzanc.numSubSamples = this.numSubSamples;
            this.zzanc.numBytesOfClearData = this.numBytesOfClearData;
            this.zzanc.numBytesOfEncryptedData = this.numBytesOfEncryptedData;
            this.zzanc.key = this.key;
            this.zzanc.iv = this.f10087iv;
            this.zzanc.mode = this.mode;
            if (zzov.SDK_INT >= 24) {
                this.zzand.set(0, 0);
            }
        }
    }

    public final MediaCodec.CryptoInfo zzgl() {
        return this.zzanc;
    }
}
