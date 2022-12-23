package com.yandex.mobile.ads.exo.trackselection;

import android.util.Pair;
import com.yandex.mobile.ads.exo.C12178d;
import com.yandex.mobile.ads.exo.C12270q;
import com.yandex.mobile.ads.exo.RendererConfiguration;
import com.yandex.mobile.ads.exo.source.C12287f;
import com.yandex.mobile.ads.exo.source.TrackGroup;
import com.yandex.mobile.ads.exo.source.TrackGroupArray;
import com.yandex.mobile.ads.impl.ih1;
import com.yandex.mobile.ads.impl.k40;
import com.yandex.mobile.ads.impl.le1;
import com.yandex.mobile.ads.impl.u31;
import com.yandex.mobile.ads.impl.wn0;

/* renamed from: com.yandex.mobile.ads.exo.trackselection.c */
public abstract class C12328c extends C12334f {

    /* renamed from: com.yandex.mobile.ads.exo.trackselection.c$a */
    public static final class C12329a {

        /* renamed from: a */
        private final int f30300a;

        /* renamed from: b */
        private final int[] f30301b;

        /* renamed from: c */
        private final TrackGroupArray[] f30302c;

        C12329a(int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.f30301b = iArr;
            this.f30302c = trackGroupArrayArr;
            this.f30300a = iArr.length;
        }

        /* renamed from: a */
        public int mo65398a() {
            return this.f30300a;
        }

        /* renamed from: b */
        public TrackGroupArray mo65400b(int i) {
            return this.f30302c[i];
        }

        /* renamed from: a */
        public int mo65399a(int i) {
            return this.f30301b[i];
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Pair<RendererConfiguration[], C12330d[]> mo65354a(C12329a aVar, int[][][] iArr, int[] iArr2) throws k40;

    /* renamed from: a */
    public final void mo65397a(Object obj) {
        C12329a aVar = (C12329a) obj;
    }

    /* renamed from: a */
    public final le1 mo65396a(C12178d[] dVarArr, TrackGroupArray trackGroupArray, C12287f.C12288a aVar, C12270q qVar) throws k40 {
        int[] iArr;
        C12178d[] dVarArr2 = dVarArr;
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        int[] iArr2 = new int[(dVarArr2.length + 1)];
        int length = dVarArr2.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length][];
        int[][][] iArr3 = new int[(dVarArr2.length + 1)][][];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = trackGroupArray2.f30063b;
            trackGroupArr[i2] = new TrackGroup[i3];
            iArr3[i2] = new int[i3][];
        }
        int length2 = dVarArr2.length;
        int[] iArr4 = new int[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            iArr4[i4] = dVarArr2[i4].mo64794A();
        }
        int i5 = 0;
        while (i5 < trackGroupArray2.f30063b) {
            TrackGroup a = trackGroupArray2.mo65240a(i5);
            boolean z = wn0.m43727d(a.mo65232a(i).f29530j) == 4;
            int length3 = dVarArr2.length;
            int i6 = 0;
            int i7 = 0;
            boolean z2 = true;
            while (i6 < dVarArr2.length) {
                C12178d dVar = dVarArr2[i6];
                int i8 = 0;
                while (i < a.f30059b) {
                    i8 = Math.max(i8, dVar.mo64795a(a.mo65232a(i)) & 7);
                    i++;
                }
                boolean z3 = iArr2[i6] == 0;
                if (i8 > i7 || (i8 == i7 && z && !z2 && z3)) {
                    z2 = z3;
                    i7 = i8;
                    length3 = i6;
                }
                i6++;
                TrackGroupArray trackGroupArray3 = trackGroupArray;
                i = 0;
            }
            if (length3 == dVarArr2.length) {
                iArr = new int[a.f30059b];
            } else {
                C12178d dVar2 = dVarArr2[length3];
                int[] iArr5 = new int[a.f30059b];
                for (int i9 = 0; i9 < a.f30059b; i9++) {
                    iArr5[i9] = dVar2.mo64795a(a.mo65232a(i9));
                }
                iArr = iArr5;
            }
            int i10 = iArr2[length3];
            trackGroupArr[length3][i10] = a;
            iArr3[length3][i10] = iArr;
            iArr2[length3] = iArr2[length3] + 1;
            i5++;
            trackGroupArray2 = trackGroupArray;
            i = 0;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[dVarArr2.length];
        int[] iArr6 = new int[dVarArr2.length];
        for (int i11 = 0; i11 < dVarArr2.length; i11++) {
            int i12 = iArr2[i11];
            trackGroupArrayArr[i11] = new TrackGroupArray((TrackGroup[]) ih1.m37383a((T[]) trackGroupArr[i11], i12));
            iArr3[i11] = (int[][]) ih1.m37383a((T[]) iArr3[i11], i12);
            iArr6[i11] = dVarArr2[i11].mo64820o();
        }
        C12329a aVar2 = new C12329a(iArr6, trackGroupArrayArr, iArr4, iArr3, new TrackGroupArray((TrackGroup[]) ih1.m37383a((T[]) trackGroupArr[dVarArr2.length], iArr2[dVarArr2.length])));
        Pair<RendererConfiguration[], C12330d[]> a2 = mo65354a(aVar2, iArr3, iArr4);
        return new le1((u31[]) a2.first, (C12330d[]) a2.second, aVar2);
    }
}
