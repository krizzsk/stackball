package com.yandex.mobile.ads.exo.trackselection;

import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.source.TrackGroup;
import com.yandex.mobile.ads.exo.trackselection.C12330d;
import com.yandex.mobile.ads.impl.C13479j9;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.yandex.mobile.ads.exo.trackselection.b */
public abstract class C12325b implements C12330d {

    /* renamed from: a */
    protected final TrackGroup f30295a;

    /* renamed from: b */
    protected final int f30296b;

    /* renamed from: c */
    protected final int[] f30297c;

    /* renamed from: d */
    private final Format[] f30298d;

    /* renamed from: e */
    private int f30299e;

    /* renamed from: com.yandex.mobile.ads.exo.trackselection.b$b */
    private static final class C12327b implements Comparator<Format> {
        private C12327b() {
        }

        public int compare(Object obj, Object obj2) {
            return ((Format) obj2).f29526f - ((Format) obj).f29526f;
        }
    }

    public C12325b(TrackGroup trackGroup, int... iArr) {
        int i = 0;
        C13479j9.m37708b(iArr.length > 0);
        this.f30295a = (TrackGroup) C13479j9.m37703a(trackGroup);
        int length = iArr.length;
        this.f30296b = length;
        this.f30298d = new Format[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f30298d[i2] = trackGroup.mo65232a(iArr[i2]);
        }
        Arrays.sort(this.f30298d, new C12327b());
        this.f30297c = new int[this.f30296b];
        while (true) {
            int i3 = this.f30296b;
            if (i < i3) {
                this.f30297c[i] = trackGroup.mo65231a(this.f30298d[i]);
                i++;
            } else {
                long[] jArr = new long[i3];
                return;
            }
        }
    }

    /* renamed from: a */
    public final TrackGroup mo65387a() {
        return this.f30295a;
    }

    /* renamed from: a */
    public void mo65381a(float f) {
    }

    /* renamed from: b */
    public final int mo65388b(int i) {
        return this.f30297c[i];
    }

    /* renamed from: d */
    public final int mo65390d() {
        return this.f30297c.length;
    }

    /* renamed from: e */
    public void mo65384e() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C12325b bVar = (C12325b) obj;
        if (this.f30295a != bVar.f30295a || !Arrays.equals(this.f30297c, bVar.f30297c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo65392f() {
    }

    /* renamed from: g */
    public /* synthetic */ void mo65393g() {
        C12330d.CC.$default$g(this);
    }

    public int hashCode() {
        if (this.f30299e == 0) {
            this.f30299e = (System.identityHashCode(this.f30295a) * 31) + Arrays.hashCode(this.f30297c);
        }
        return this.f30299e;
    }

    /* renamed from: a */
    public final Format mo65386a(int i) {
        return this.f30298d[i];
    }

    /* renamed from: b */
    public final Format mo65389b() {
        return this.f30298d[mo65383c()];
    }
}
