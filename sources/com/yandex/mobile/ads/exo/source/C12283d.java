package com.yandex.mobile.ads.exo.source;

import android.net.Uri;
import com.yandex.mobile.ads.exo.source.C12295h;
import com.yandex.mobile.ads.impl.C13325hj;
import com.yandex.mobile.ads.impl.C13479j9;
import com.yandex.mobile.ads.impl.C13504jj;
import com.yandex.mobile.ads.impl.af1;
import com.yandex.mobile.ads.impl.fy0;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.exo.source.d */
final class C12283d implements C13325hj {

    /* renamed from: a */
    private final C13325hj f30080a;

    /* renamed from: b */
    private final int f30081b;

    /* renamed from: c */
    private final C12284a f30082c;

    /* renamed from: d */
    private final byte[] f30083d;

    /* renamed from: e */
    private int f30084e;

    /* renamed from: com.yandex.mobile.ads.exo.source.d$a */
    public interface C12284a {
    }

    public C12283d(C13325hj hjVar, int i, C12284a aVar) {
        C13479j9.m37705a(i > 0);
        this.f30080a = hjVar;
        this.f30081b = i;
        this.f30082c = aVar;
        this.f30083d = new byte[1];
        this.f30084e = i;
    }

    /* renamed from: a */
    public void mo65277a(af1 af1) {
        this.f30080a.mo65277a(af1);
    }

    /* renamed from: b */
    public Map<String, List<String>> mo65278b() {
        return this.f30080a.mo65278b();
    }

    public void close() throws IOException {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public long mo65275a(C13504jj jjVar) throws IOException {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public int mo65274a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f30084e == 0) {
            boolean z = false;
            if (this.f30080a.mo65274a(this.f30083d, 0, 1) != -1) {
                int i3 = (this.f30083d[0] & 255) << 4;
                if (i3 != 0) {
                    byte[] bArr2 = new byte[i3];
                    int i4 = i3;
                    int i5 = 0;
                    while (true) {
                        if (i4 <= 0) {
                            while (i3 > 0 && bArr2[i3 - 1] == 0) {
                                i3--;
                            }
                            if (i3 > 0) {
                                ((C12295h.C12296a) this.f30082c).mo65317a(new fy0(bArr2, i3));
                            }
                        } else {
                            int a = this.f30080a.mo65274a(bArr2, i5, i4);
                            if (a == -1) {
                                break;
                            }
                            i5 += a;
                            i4 -= a;
                        }
                    }
                }
                z = true;
            }
            if (!z) {
                return -1;
            }
            this.f30084e = this.f30081b;
        }
        int a2 = this.f30080a.mo65274a(bArr, i, Math.min(this.f30084e, i2));
        if (a2 != -1) {
            this.f30084e -= a2;
        }
        return a2;
    }

    /* renamed from: a */
    public Uri mo65276a() {
        return this.f30080a.mo65276a();
    }
}
