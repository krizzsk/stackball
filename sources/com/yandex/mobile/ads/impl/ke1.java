package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.Format;
import java.io.IOException;
import java.util.Arrays;

public interface ke1 {

    /* renamed from: com.yandex.mobile.ads.impl.ke1$a */
    public static final class C13702a {

        /* renamed from: a */
        public final int f36112a;

        /* renamed from: b */
        public final byte[] f36113b;

        /* renamed from: c */
        public final int f36114c;

        /* renamed from: d */
        public final int f36115d;

        public C13702a(int i, byte[] bArr, int i2, int i3) {
            this.f36112a = i;
            this.f36113b = bArr;
            this.f36114c = i2;
            this.f36115d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C13702a.class != obj.getClass()) {
                return false;
            }
            C13702a aVar = (C13702a) obj;
            if (this.f36112a == aVar.f36112a && this.f36114c == aVar.f36114c && this.f36115d == aVar.f36115d && Arrays.equals(this.f36113b, aVar.f36113b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f36112a * 31) + Arrays.hashCode(this.f36113b)) * 31) + this.f36114c) * 31) + this.f36115d;
        }
    }

    /* renamed from: a */
    int mo65335a(C13416ik ikVar, int i, boolean z) throws IOException, InterruptedException;

    /* renamed from: a */
    void mo65337a(long j, int i, int i2, int i3, C13702a aVar);

    /* renamed from: a */
    void mo65339a(Format format);

    /* renamed from: a */
    void mo65341a(fy0 fy0, int i);
}
