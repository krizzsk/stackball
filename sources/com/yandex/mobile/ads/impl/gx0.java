package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.audio.OpusUtil;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.mb1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class gx0 extends mb1 {

    /* renamed from: o */
    private static final byte[] f34166o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n */
    private boolean f34167n;

    gx0() {
    }

    /* renamed from: b */
    public static boolean m36717b(fy0 fy0) {
        int a = fy0.mo67098a();
        byte[] bArr = f34166o;
        if (a < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        fy0.mo67104a(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo67362a(boolean z) {
        super.mo67362a(z);
        if (z) {
            this.f34167n = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo67361a(fy0 fy0) {
        byte[] bArr = fy0.f33778a;
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
        return mo68644b(((long) b3) * ((long) (i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo67363a(fy0 fy0, long j, mb1.C13968b bVar) {
        fy0 fy02 = fy0;
        boolean z = true;
        if (!this.f34167n) {
            byte[] copyOf = Arrays.copyOf(fy02.f33778a, fy0.mo67107c());
            byte b = copyOf[9] & 255;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            m36716a(arrayList, ((copyOf[11] & 255) << 8) | (copyOf[10] & 255));
            m36716a(arrayList, 3840);
            bVar.f37301a = Format.m31683a((String) null, "audio/opus", (String) null, -1, -1, (int) b, (int) OpusUtil.SAMPLE_RATE, -1, (List<byte[]>) arrayList, (DrmInitData) null, 0, (String) null);
            this.f34167n = true;
            return true;
        }
        if (fy0.mo67113f() != 1332770163) {
            z = false;
        }
        fy02.mo67112e(0);
        return z;
    }

    /* renamed from: a */
    private void m36716a(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i) * 1000000000) / 48000).array());
    }
}
