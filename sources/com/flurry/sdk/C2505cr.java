package com.flurry.sdk;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.zip.CRC32;

/* renamed from: com.flurry.sdk.cr */
public final class C2505cr extends MessageDigest {

    /* renamed from: a */
    private CRC32 f5867a = new CRC32();

    public C2505cr() {
        super("CRC");
    }

    /* access modifiers changed from: protected */
    public final void engineUpdate(byte b) {
        this.f5867a.update(b);
    }

    /* access modifiers changed from: protected */
    public final void engineUpdate(byte[] bArr, int i, int i2) {
        this.f5867a.update(bArr, i, i2);
    }

    /* access modifiers changed from: protected */
    public final byte[] engineDigest() {
        long value = this.f5867a.getValue();
        return new byte[]{(byte) ((int) ((-16777216 & value) >> 24)), (byte) ((int) ((16711680 & value) >> 16)), (byte) ((int) ((65280 & value) >> 8)), (byte) ((int) ((value & 255) >> 0))};
    }

    /* access modifiers changed from: protected */
    public final void engineReset() {
        this.f5867a.reset();
    }

    /* renamed from: a */
    public final byte[] mo17708a() {
        return engineDigest();
    }

    /* renamed from: b */
    public final int mo17709b() {
        return ByteBuffer.wrap(engineDigest()).getInt();
    }
}
