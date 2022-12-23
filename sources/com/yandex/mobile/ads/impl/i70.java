package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.mb1;
import java.io.IOException;
import java.util.Arrays;

final class i70 extends mb1 {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public k70 f34754n;

    /* renamed from: o */
    private C13384a f34755o;

    i70() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo67362a(boolean z) {
        super.mo67362a(z);
        if (z) {
            this.f34754n = null;
            this.f34755o = null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.i70$a */
    private class C13384a implements fw0 {

        /* renamed from: a */
        private long f34756a = -1;

        /* renamed from: b */
        private long f34757b = -1;

        public C13384a() {
        }

        /* renamed from: a */
        public long mo67092a(C13416ik ikVar) throws IOException, InterruptedException {
            long j = this.f34757b;
            if (j < 0) {
                return -1;
            }
            long j2 = -(j + 2);
            this.f34757b = -1;
            return j2;
        }

        /* renamed from: b */
        public void mo67747b(long j) {
            this.f34756a = j;
        }

        /* renamed from: a */
        public void mo67094a(long j) {
            i70.this.f34754n.f36009k.getClass();
            long[] jArr = i70.this.f34754n.f36009k.f36011a;
            this.f34757b = jArr[ih1.m37388b(jArr, j, true, true)];
        }

        /* renamed from: a */
        public s71 mo67093a() {
            C13479j9.m37708b(this.f34756a != -1);
            return new j70(i70.this.f34754n, this.f34756a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo67361a(fy0 fy0) {
        byte[] bArr = fy0.f33778a;
        if (!(bArr[0] == -1)) {
            return -1;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            fy0.mo67114f(4);
            fy0.mo67133y();
        }
        int a = g70.m36493a(fy0, i);
        fy0.mo67112e(0);
        return (long) a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo67363a(fy0 fy0, long j, mb1.C13968b bVar) {
        byte[] bArr = fy0.f33778a;
        if (this.f34754n == null) {
            this.f34754n = new k70(bArr, 17);
            bVar.f37301a = this.f34754n.mo68149a(Arrays.copyOfRange(bArr, 9, fy0.mo67107c()), (Metadata) null);
        } else if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            this.f34755o = new C13384a();
            this.f34754n = this.f34754n.mo68151a(h70.m36812a(fy0));
        } else {
            if (bArr[0] == -1) {
                C13384a aVar = this.f34755o;
                if (aVar != null) {
                    aVar.mo67747b(j);
                    bVar.f37302b = this.f34755o;
                }
                return false;
            }
        }
        return true;
    }
}
