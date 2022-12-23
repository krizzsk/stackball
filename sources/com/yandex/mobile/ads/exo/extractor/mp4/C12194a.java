package com.yandex.mobile.ads.exo.extractor.mp4;

import com.yandex.mobile.ads.impl.fy0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.exo.extractor.mp4.a */
abstract class C12194a {

    /* renamed from: a */
    public final int f29600a;

    /* renamed from: com.yandex.mobile.ads.exo.extractor.mp4.a$a */
    static final class C12195a extends C12194a {

        /* renamed from: b */
        public final long f29601b;

        /* renamed from: c */
        public final List<C12196b> f29602c = new ArrayList();

        /* renamed from: d */
        public final List<C12195a> f29603d = new ArrayList();

        public C12195a(int i, long j) {
            super(i);
            this.f29601b = j;
        }

        /* renamed from: c */
        public C12195a mo64882c(int i) {
            int size = this.f29603d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C12195a aVar = this.f29603d.get(i2);
                if (aVar.f29600a == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: d */
        public C12196b mo64883d(int i) {
            int size = this.f29602c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C12196b bVar = this.f29602c.get(i2);
                if (bVar.f29600a == i) {
                    return bVar;
                }
            }
            return null;
        }

        public String toString() {
            return C12194a.m31798a(this.f29600a) + " leaves: " + Arrays.toString(this.f29602c.toArray()) + " containers: " + Arrays.toString(this.f29603d.toArray());
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.extractor.mp4.a$b */
    static final class C12196b extends C12194a {

        /* renamed from: b */
        public final fy0 f29604b;

        public C12196b(int i, fy0 fy0) {
            super(i);
            this.f29604b = fy0;
        }
    }

    public C12194a(int i) {
        this.f29600a = i;
    }

    /* renamed from: a */
    public static String m31798a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    /* renamed from: b */
    public static int m31799b(int i) {
        return (i >> 24) & 255;
    }

    public String toString() {
        return m31798a(this.f29600a);
    }
}
