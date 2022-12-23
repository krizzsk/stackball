package com.fyber.inneractive.sdk.player.p059c.p063d.p068e;

import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.p062c.C3227a;
import com.fyber.inneractive.sdk.player.p059c.p063d.p068e.C3353h;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import com.google.android.exoplayer2.audio.OpusUtil;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.e.g */
final class C3352g extends C3353h {

    /* renamed from: a */
    private static final int f8871a = C3560t.m8893e("Opus");

    /* renamed from: d */
    private static final byte[] f8872d = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: e */
    private boolean f8873e;

    C3352g() {
    }

    /* renamed from: b */
    public static boolean m8299b(C3548k kVar) {
        int b = kVar.mo19383b();
        byte[] bArr = f8872d;
        if (b < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        kVar.mo19382a(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, f8872d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo19141a(boolean z) {
        super.mo19141a(z);
        if (z) {
            this.f8873e = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo19140a(C3548k kVar) {
        byte[] bArr = kVar.f9625a;
        byte b = bArr[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = bArr[1] & 63;
        }
        int i = b >> 3;
        int i2 = i & 3;
        return mo19151b((long) (b3 * (i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo19142a(C3548k kVar, long j, C3353h.C3354a aVar) throws IOException, InterruptedException {
        boolean z = true;
        if (!this.f8873e) {
            byte[] copyOf = Arrays.copyOf(kVar.f9625a, kVar.f9627c);
            byte b = copyOf[9] & 255;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            m8298a(arrayList, ((copyOf[11] & 255) << 8) | (copyOf[10] & 255));
            m8298a(arrayList, 3840);
            aVar.f8887a = C3290h.m8115a((String) null, "audio/opus", -1, -1, b, OpusUtil.SAMPLE_RATE, arrayList, (C3227a) null, (String) null);
            this.f8873e = true;
            return true;
        }
        if (kVar.mo19396j() != f8871a) {
            z = false;
        }
        kVar.mo19386c(0);
        return z;
    }

    /* renamed from: a */
    private static void m8298a(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i) * 1000000000) / 48000).array());
    }
}
