package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.id3.C12248a;
import java.io.EOFException;
import java.io.IOException;

public final class nc0 {

    /* renamed from: a */
    private final fy0 f37793a = new fy0(10);

    /* renamed from: a */
    public Metadata mo69023a(C13416ik ikVar, C12248a.C12249a aVar) throws IOException, InterruptedException {
        Metadata metadata = null;
        int i = 0;
        while (true) {
            try {
                ikVar.mo67806a(this.f37793a.f33778a, 0, 10, false);
                this.f37793a.mo67112e(0);
                if (this.f37793a.mo67129u() != 4801587) {
                    break;
                }
                this.f37793a.mo67114f(3);
                int q = this.f37793a.mo67125q();
                int i2 = q + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f37793a.f33778a, 0, bArr, 0, 10);
                    ikVar.mo67806a(bArr, 10, q, false);
                    metadata = new C12248a(aVar).mo65104a(bArr, i2);
                } else {
                    ikVar.mo67805a(q, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        ikVar.mo67812d();
        ikVar.mo67805a(i, false);
        return metadata;
    }
}
