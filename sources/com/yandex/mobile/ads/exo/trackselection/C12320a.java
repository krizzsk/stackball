package com.yandex.mobile.ads.exo.trackselection;

import com.yandex.mobile.ads.exo.source.TrackGroup;
import com.yandex.mobile.ads.exo.trackselection.C12330d;
import com.yandex.mobile.ads.impl.C12579bb;
import com.yandex.mobile.ads.impl.C13479j9;
import com.yandex.mobile.ads.impl.C13493jf;
import com.yandex.mobile.ads.impl.d70;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: com.yandex.mobile.ads.exo.trackselection.a */
public class C12320a extends C12325b {

    /* renamed from: f */
    private final C12322b f30291f;

    /* renamed from: g */
    private final C13493jf f30292g;

    /* renamed from: com.yandex.mobile.ads.exo.trackselection.a$b */
    private interface C12322b {
    }

    /* renamed from: com.yandex.mobile.ads.exo.trackselection.a$c */
    private static final class C12323c implements C12322b {

        /* renamed from: a */
        private final C12579bb f30293a;

        C12323c(C12579bb bbVar, float f, long j) {
            this.f30293a = bbVar;
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.trackselection.a$d */
    public static class C12324d implements C12330d.C12332b {

        /* renamed from: a */
        private final C13493jf f30294a;

        public C12324d() {
            this(10000, 25000, 25000, 0.7f, 0.75f, 2000, C13493jf.f35273a);
        }

        /* renamed from: a */
        public final C12330d[] mo65385a(C12330d.C12331a[] aVarArr, C12579bb bbVar) {
            ArrayList arrayList;
            C12330d.C12331a[] aVarArr2 = aVarArr;
            C12330d[] dVarArr = new C12330d[aVarArr2.length];
            int i = 0;
            for (int i2 = 0; i2 < aVarArr2.length; i2++) {
                C12330d.C12331a aVar = aVarArr2[i2];
                if (aVar != null) {
                    int[] iArr = aVar.f30304b;
                    if (iArr.length == 1) {
                        dVarArr[i2] = new d70(aVar.f30303a, iArr[0], aVar.f30305c, aVar.f30306d);
                        int i3 = aVar.f30303a.mo65232a(aVar.f30304b[0]).f29526f;
                        if (i3 != -1) {
                            i += i3;
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (i4 < aVarArr2.length) {
                C12330d.C12331a aVar2 = aVarArr2[i4];
                if (aVar2 != null) {
                    int[] iArr2 = aVar2.f30304b;
                    if (iArr2.length > 1) {
                        long j = (long) 25000;
                        long j2 = j;
                        long j3 = j;
                        C12320a aVar3 = new C12320a(aVar2.f30303a, iArr2, new C12323c(bbVar, 0.7f, (long) i), (long) 10000, j2, j3, 0.75f, 2000, C13493jf.f35273a);
                        arrayList = arrayList2;
                        arrayList.add(aVar3);
                        dVarArr[i4] = aVar3;
                        i4++;
                        arrayList2 = arrayList;
                    }
                }
                arrayList = arrayList2;
                i4++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            if (arrayList3.size() > 1) {
                long[][] jArr = new long[arrayList3.size()][];
                for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                    C12320a aVar4 = (C12320a) arrayList3.get(i5);
                    jArr[i5] = new long[aVar4.f30297c.length];
                    int i6 = 0;
                    while (true) {
                        int[] iArr3 = aVar4.f30297c;
                        if (i6 >= iArr3.length) {
                            break;
                        }
                        jArr[i5][i6] = (long) aVar4.mo65386a((iArr3.length - i6) - 1).f29526f;
                        i6++;
                    }
                }
                long[][][] a = C12320a.m32455a(jArr);
                for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                    ((C12320a) arrayList3.get(i7)).mo65382b(a[i7]);
                }
            }
            return dVarArr;
        }

        public C12324d(int i, int i2, int i3, float f, float f2, long j, C13493jf jfVar) {
            this((C12579bb) null, i, i2, i3, f, f2, j, jfVar);
        }

        @Deprecated
        public C12324d(C12579bb bbVar, int i, int i2, int i3, float f, float f2, long j, C13493jf jfVar) {
            this.f30294a = jfVar;
        }
    }

    /* renamed from: a */
    static long[][][] m32455a(long[][] jArr) {
        int i;
        double d;
        long[][] jArr2 = jArr;
        int length = jArr2.length;
        double[][] dArr = new double[length][];
        for (int i2 = 0; i2 < jArr2.length; i2++) {
            dArr[i2] = new double[jArr2[i2].length];
            for (int i3 = 0; i3 < jArr2[i2].length; i3++) {
                dArr[i2][i3] = jArr2[i2][i3] == -1 ? 0.0d : Math.log((double) jArr2[i2][i3]);
            }
        }
        double[][] dArr2 = new double[length][];
        for (int i4 = 0; i4 < length; i4++) {
            dArr2[i4] = new double[(dArr[i4].length - 1)];
            if (dArr2[i4].length != 0) {
                double d2 = dArr[i4][dArr[i4].length - 1] - dArr[i4][0];
                int i5 = 0;
                while (i5 < dArr[i4].length - 1) {
                    int i6 = i5 + 1;
                    double d3 = (dArr[i4][i5] + dArr[i4][i6]) * 0.5d;
                    double[] dArr3 = dArr2[i4];
                    if (d2 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = (d3 - dArr[i4][0]) / d2;
                    }
                    dArr3[i5] = d;
                    i5 = i6;
                }
            }
        }
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            i7 += dArr2[i8].length;
        }
        int i9 = i7 + 3;
        int[] iArr = new int[3];
        iArr[2] = 2;
        iArr[1] = i9;
        iArr[0] = length;
        long[][][] jArr3 = (long[][][]) Array.newInstance(long.class, iArr);
        int[] iArr2 = new int[length];
        m32454a(jArr3, 1, jArr2, iArr2);
        int i10 = 2;
        while (true) {
            i = i9 - 1;
            if (i10 >= i) {
                break;
            }
            double d4 = Double.MAX_VALUE;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (iArr2[i12] + 1 != dArr[i12].length) {
                    double d5 = dArr2[i12][iArr2[i12]];
                    if (d5 < d4) {
                        i11 = i12;
                        d4 = d5;
                    }
                }
            }
            iArr2[i11] = iArr2[i11] + 1;
            m32454a(jArr3, i10, jArr2, iArr2);
            i10++;
        }
        for (long[][] jArr4 : jArr3) {
            int i13 = i9 - 2;
            jArr4[i][0] = jArr4[i13][0] * 2;
            jArr4[i][1] = jArr4[i13][1] * 2;
        }
        return jArr3;
    }

    /* renamed from: a */
    public void mo65381a(float f) {
    }

    /* renamed from: b */
    public void mo65382b(long[][] jArr) {
        ((C12323c) this.f30291f).getClass();
        C13479j9.m37705a(jArr.length >= 2);
    }

    /* renamed from: c */
    public int mo65383c() {
        return 0;
    }

    /* renamed from: e */
    public void mo65384e() {
    }

    private C12320a(TrackGroup trackGroup, int[] iArr, C12322b bVar, long j, long j2, long j3, float f, long j4, C13493jf jfVar) {
        super(trackGroup, iArr);
        this.f30291f = bVar;
        this.f30292g = jfVar;
    }

    /* renamed from: a */
    private static void m32454a(long[][][] jArr, int i, long[][] jArr2, int[] iArr) {
        long j = 0;
        for (int i2 = 0; i2 < jArr.length; i2++) {
            jArr[i2][i][1] = jArr2[i2][iArr[i2]];
            j += jArr[i2][i][1];
        }
        for (long[][] jArr3 : jArr) {
            jArr3[i][0] = j;
        }
    }
}
