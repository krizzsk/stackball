package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class p20 {

    /* renamed from: h */
    private static final byte[] f38447h = {0, 7, 8, Ascii.f10109SI};

    /* renamed from: i */
    private static final byte[] f38448i = {0, 119, -120, -1};

    /* renamed from: j */
    private static final byte[] f38449j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a */
    private final Paint f38450a;

    /* renamed from: b */
    private final Paint f38451b;

    /* renamed from: c */
    private final Canvas f38452c = new Canvas();

    /* renamed from: d */
    private final C14244b f38453d = new C14244b(719, 575, 0, 719, 0, 575);

    /* renamed from: e */
    private final C14243a f38454e = new C14243a(0, m40646a(), m40647b(), m40648c());

    /* renamed from: f */
    private final C14250h f38455f;

    /* renamed from: g */
    private Bitmap f38456g;

    /* renamed from: com.yandex.mobile.ads.impl.p20$a */
    private static final class C14243a {

        /* renamed from: a */
        public final int f38457a;

        /* renamed from: b */
        public final int[] f38458b;

        /* renamed from: c */
        public final int[] f38459c;

        /* renamed from: d */
        public final int[] f38460d;

        public C14243a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f38457a = i;
            this.f38458b = iArr;
            this.f38459c = iArr2;
            this.f38460d = iArr3;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.p20$b */
    private static final class C14244b {

        /* renamed from: a */
        public final int f38461a;

        /* renamed from: b */
        public final int f38462b;

        /* renamed from: c */
        public final int f38463c;

        /* renamed from: d */
        public final int f38464d;

        /* renamed from: e */
        public final int f38465e;

        /* renamed from: f */
        public final int f38466f;

        public C14244b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f38461a = i;
            this.f38462b = i2;
            this.f38463c = i3;
            this.f38464d = i4;
            this.f38465e = i5;
            this.f38466f = i6;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.p20$c */
    private static final class C14245c {

        /* renamed from: a */
        public final int f38467a;

        /* renamed from: b */
        public final boolean f38468b;

        /* renamed from: c */
        public final byte[] f38469c;

        /* renamed from: d */
        public final byte[] f38470d;

        public C14245c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f38467a = i;
            this.f38468b = z;
            this.f38469c = bArr;
            this.f38470d = bArr2;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.p20$d */
    private static final class C14246d {

        /* renamed from: a */
        public final int f38471a;

        /* renamed from: b */
        public final int f38472b;

        /* renamed from: c */
        public final SparseArray<C14247e> f38473c;

        public C14246d(int i, int i2, int i3, SparseArray<C14247e> sparseArray) {
            this.f38471a = i2;
            this.f38472b = i3;
            this.f38473c = sparseArray;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.p20$e */
    private static final class C14247e {

        /* renamed from: a */
        public final int f38474a;

        /* renamed from: b */
        public final int f38475b;

        public C14247e(int i, int i2) {
            this.f38474a = i;
            this.f38475b = i2;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.p20$f */
    private static final class C14248f {

        /* renamed from: a */
        public final int f38476a;

        /* renamed from: b */
        public final boolean f38477b;

        /* renamed from: c */
        public final int f38478c;

        /* renamed from: d */
        public final int f38479d;

        /* renamed from: e */
        public final int f38480e;

        /* renamed from: f */
        public final int f38481f;

        /* renamed from: g */
        public final int f38482g;

        /* renamed from: h */
        public final int f38483h;

        /* renamed from: i */
        public final int f38484i;

        /* renamed from: j */
        public final SparseArray<C14249g> f38485j;

        public C14248f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<C14249g> sparseArray) {
            this.f38476a = i;
            this.f38477b = z;
            this.f38478c = i2;
            this.f38479d = i3;
            this.f38480e = i5;
            this.f38481f = i6;
            this.f38482g = i7;
            this.f38483h = i8;
            this.f38484i = i9;
            this.f38485j = sparseArray;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.p20$g */
    private static final class C14249g {

        /* renamed from: a */
        public final int f38486a;

        /* renamed from: b */
        public final int f38487b;

        public C14249g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f38486a = i3;
            this.f38487b = i4;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.p20$h */
    private static final class C14250h {

        /* renamed from: a */
        public final int f38488a;

        /* renamed from: b */
        public final int f38489b;

        /* renamed from: c */
        public final SparseArray<C14248f> f38490c = new SparseArray<>();

        /* renamed from: d */
        public final SparseArray<C14243a> f38491d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C14245c> f38492e = new SparseArray<>();

        /* renamed from: f */
        public final SparseArray<C14243a> f38493f = new SparseArray<>();

        /* renamed from: g */
        public final SparseArray<C14245c> f38494g = new SparseArray<>();

        /* renamed from: h */
        public C14244b f38495h;

        /* renamed from: i */
        public C14246d f38496i;

        public C14250h(int i, int i2) {
            this.f38488a = i;
            this.f38489b = i2;
        }
    }

    public p20(int i, int i2) {
        Paint paint = new Paint();
        this.f38450a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.f38451b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        this.f38455f = new C14250h(i, i2);
    }

    /* renamed from: a */
    private static int m40641a(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* renamed from: a */
    public List<C14683ti> mo69300a(byte[] bArr, int i) {
        int i2;
        int i3;
        SparseArray<C14249g> sparseArray;
        SparseArray<C14247e> sparseArray2;
        int[] iArr;
        C14248f fVar;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        ey0 ey0 = new ey0(bArr, i);
        while (ey0.mo66891b() >= 48 && ey0.mo66886a(8) == 15) {
            C14250h hVar = this.f38455f;
            int a = ey0.mo66886a(8);
            int a2 = ey0.mo66886a(16);
            int a3 = ey0.mo66886a(16);
            int d = ey0.mo66896d() + a3;
            if (a3 * 8 > ey0.mo66891b()) {
                Log.w("DvbParser", "Data field length exceeds limit");
                ey0.mo66897d(ey0.mo66891b());
            } else {
                switch (a) {
                    case 16:
                        if (a2 == hVar.f38488a) {
                            C14246d dVar = hVar.f38496i;
                            int a4 = ey0.mo66886a(8);
                            int a5 = ey0.mo66886a(4);
                            int a6 = ey0.mo66886a(2);
                            ey0.mo66897d(2);
                            int i10 = a3 - 2;
                            SparseArray sparseArray3 = new SparseArray();
                            while (i10 > 0) {
                                int a7 = ey0.mo66886a(8);
                                ey0.mo66897d(8);
                                i10 -= 6;
                                sparseArray3.put(a7, new C14247e(ey0.mo66886a(16), ey0.mo66886a(16)));
                            }
                            C14246d dVar2 = new C14246d(a4, a5, a6, sparseArray3);
                            if (a6 == 0) {
                                if (!(dVar == null || dVar.f38471a == a5)) {
                                    hVar.f38496i = dVar2;
                                    break;
                                }
                            } else {
                                hVar.f38496i = dVar2;
                                hVar.f38490c.clear();
                                hVar.f38491d.clear();
                                hVar.f38492e.clear();
                                break;
                            }
                        }
                        break;
                    case 17:
                        C14246d dVar3 = hVar.f38496i;
                        if (a2 == hVar.f38488a && dVar3 != null) {
                            int a8 = ey0.mo66886a(8);
                            ey0.mo66897d(4);
                            boolean f = ey0.mo66900f();
                            ey0.mo66897d(3);
                            int a9 = ey0.mo66886a(16);
                            int a10 = ey0.mo66886a(16);
                            int a11 = ey0.mo66886a(3);
                            int a12 = ey0.mo66886a(3);
                            ey0.mo66897d(2);
                            int a13 = ey0.mo66886a(8);
                            int a14 = ey0.mo66886a(8);
                            int a15 = ey0.mo66886a(4);
                            int a16 = ey0.mo66886a(2);
                            ey0.mo66897d(2);
                            int i11 = a3 - 10;
                            SparseArray sparseArray4 = new SparseArray();
                            while (i11 > 0) {
                                int a17 = ey0.mo66886a(16);
                                int a18 = ey0.mo66886a(2);
                                int a19 = ey0.mo66886a(2);
                                int a20 = ey0.mo66886a(12);
                                ey0.mo66897d(4);
                                int a21 = ey0.mo66886a(12);
                                i11 -= 6;
                                if (a18 == 1 || a18 == 2) {
                                    i11 -= 2;
                                    i5 = ey0.mo66886a(8);
                                    i4 = ey0.mo66886a(8);
                                } else {
                                    i5 = 0;
                                    i4 = 0;
                                }
                                sparseArray4.put(a17, new C14249g(a18, a19, a20, a21, i5, i4));
                            }
                            C14248f fVar2 = new C14248f(a8, f, a9, a10, a11, a12, a13, a14, a15, a16, sparseArray4);
                            if (dVar3.f38472b == 0 && (fVar = hVar.f38490c.get(a8)) != null) {
                                SparseArray<C14249g> sparseArray5 = fVar.f38485j;
                                for (int i12 = 0; i12 < sparseArray5.size(); i12++) {
                                    fVar2.f38485j.put(sparseArray5.keyAt(i12), sparseArray5.valueAt(i12));
                                }
                            }
                            hVar.f38490c.put(fVar2.f38476a, fVar2);
                            break;
                        }
                    case 18:
                        if (a2 != hVar.f38488a) {
                            if (a2 == hVar.f38489b) {
                                C14243a a22 = m40642a(ey0, a3);
                                hVar.f38493f.put(a22.f38457a, a22);
                                break;
                            }
                        } else {
                            C14243a a23 = m40642a(ey0, a3);
                            hVar.f38491d.put(a23.f38457a, a23);
                            break;
                        }
                        break;
                    case 19:
                        if (a2 != hVar.f38488a) {
                            if (a2 == hVar.f38489b) {
                                C14245c a24 = m40643a(ey0);
                                hVar.f38494g.put(a24.f38467a, a24);
                                break;
                            }
                        } else {
                            C14245c a25 = m40643a(ey0);
                            hVar.f38492e.put(a25.f38467a, a25);
                            break;
                        }
                        break;
                    case 20:
                        if (a2 == hVar.f38488a) {
                            ey0.mo66897d(4);
                            boolean f2 = ey0.mo66900f();
                            ey0.mo66897d(3);
                            int a26 = ey0.mo66886a(16);
                            int a27 = ey0.mo66886a(16);
                            if (f2) {
                                int a28 = ey0.mo66886a(16);
                                i8 = ey0.mo66886a(16);
                                i7 = ey0.mo66886a(16);
                                i9 = a28;
                                i6 = ey0.mo66886a(16);
                            } else {
                                i8 = a26;
                                i6 = a27;
                                i9 = 0;
                                i7 = 0;
                            }
                            hVar.f38495h = new C14244b(a26, a27, i9, i8, i7, i6);
                            break;
                        }
                        break;
                }
                ey0.mo66899e(d - ey0.mo66896d());
            }
        }
        C14250h hVar2 = this.f38455f;
        C14246d dVar4 = hVar2.f38496i;
        if (dVar4 == null) {
            return Collections.emptyList();
        }
        C14244b bVar = hVar2.f38495h;
        if (bVar == null) {
            bVar = this.f38453d;
        }
        Bitmap bitmap = this.f38456g;
        if (!(bitmap != null && bVar.f38461a + 1 == bitmap.getWidth() && bVar.f38462b + 1 == this.f38456g.getHeight())) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f38461a + 1, bVar.f38462b + 1, Bitmap.Config.ARGB_8888);
            this.f38456g = createBitmap;
            this.f38452c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C14247e> sparseArray6 = dVar4.f38473c;
        int i13 = 0;
        while (i13 < sparseArray6.size()) {
            this.f38452c.save();
            C14247e valueAt = sparseArray6.valueAt(i13);
            C14248f fVar3 = this.f38455f.f38490c.get(sparseArray6.keyAt(i13));
            int i14 = valueAt.f38474a + bVar.f38463c;
            int i15 = valueAt.f38475b + bVar.f38465e;
            this.f38452c.clipRect(i14, i15, Math.min(fVar3.f38478c + i14, bVar.f38464d), Math.min(fVar3.f38479d + i15, bVar.f38466f));
            C14243a aVar = this.f38455f.f38491d.get(fVar3.f38481f);
            if (aVar == null && (aVar = this.f38455f.f38493f.get(fVar3.f38481f)) == null) {
                aVar = this.f38454e;
            }
            SparseArray<C14249g> sparseArray7 = fVar3.f38485j;
            int i16 = 0;
            while (i16 < sparseArray7.size()) {
                int keyAt = sparseArray7.keyAt(i16);
                C14249g valueAt2 = sparseArray7.valueAt(i16);
                C14245c cVar = this.f38455f.f38492e.get(keyAt);
                if (cVar == null) {
                    cVar = this.f38455f.f38494g.get(keyAt);
                }
                if (cVar != null) {
                    Paint paint = cVar.f38468b ? null : this.f38450a;
                    int i17 = fVar3.f38480e;
                    int i18 = valueAt2.f38486a + i14;
                    int i19 = valueAt2.f38487b + i15;
                    sparseArray2 = sparseArray6;
                    Canvas canvas = this.f38452c;
                    sparseArray = sparseArray7;
                    if (i17 == 3) {
                        iArr = aVar.f38460d;
                    } else if (i17 == 2) {
                        iArr = aVar.f38459c;
                    } else {
                        iArr = aVar.f38458b;
                    }
                    i3 = i13;
                    int[] iArr2 = iArr;
                    int i20 = i17;
                    int i21 = i18;
                    Paint paint2 = paint;
                    Canvas canvas2 = canvas;
                    m40644a(cVar.f38469c, iArr2, i20, i21, i19, paint2, canvas2);
                    m40644a(cVar.f38470d, iArr2, i20, i21, i19 + 1, paint2, canvas2);
                } else {
                    sparseArray2 = sparseArray6;
                    i3 = i13;
                    sparseArray = sparseArray7;
                }
                i16++;
                sparseArray6 = sparseArray2;
                sparseArray7 = sparseArray;
                i13 = i3;
            }
            SparseArray<C14247e> sparseArray8 = sparseArray6;
            int i22 = i13;
            if (fVar3.f38477b) {
                int i23 = fVar3.f38480e;
                if (i23 == 3) {
                    i2 = aVar.f38460d[fVar3.f38482g];
                } else if (i23 == 2) {
                    i2 = aVar.f38459c[fVar3.f38483h];
                } else {
                    i2 = aVar.f38458b[fVar3.f38484i];
                }
                this.f38451b.setColor(i2);
                this.f38452c.drawRect((float) i14, (float) i15, (float) (fVar3.f38478c + i14), (float) (fVar3.f38479d + i15), this.f38451b);
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(this.f38456g, i14, i15, fVar3.f38478c, fVar3.f38479d);
            float f3 = (float) i14;
            float f4 = (float) bVar.f38461a;
            float f5 = f3 / f4;
            float f6 = (float) i15;
            float f7 = (float) bVar.f38462b;
            arrayList.add(new C14683ti(createBitmap2, f5, 0, f6 / f7, 0, ((float) fVar3.f38478c) / f4, ((float) fVar3.f38479d) / f7));
            this.f38452c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f38452c.restore();
            i13 = i22 + 1;
            sparseArray6 = sparseArray8;
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: d */
    public void mo69301d() {
        C14250h hVar = this.f38455f;
        hVar.f38490c.clear();
        hVar.f38491d.clear();
        hVar.f38492e.clear();
        hVar.f38493f.clear();
        hVar.f38494g.clear();
        hVar.f38495h = null;
        hVar.f38496i = null;
    }

    /* renamed from: b */
    private static int[] m40647b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m40641a(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = 127;
                int i3 = (i & 1) != 0 ? 127 : 0;
                int i4 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m40641a(255, i3, i4, i2);
            }
        }
        return iArr;
    }

    /* renamed from: c */
    private static int[] m40648c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i2 = 255;
            if (i < 8) {
                int i3 = (i & 1) != 0 ? 255 : 0;
                int i4 = (i & 2) != 0 ? 255 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m40641a(63, i3, i4, i2);
            } else {
                int i5 = i & 136;
                int i6 = 170;
                int i7 = 85;
                if (i5 == 0) {
                    int i8 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i9 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = m40641a(255, i8, i9, i7 + i6);
                } else if (i5 != 8) {
                    int i10 = 43;
                    if (i5 == 128) {
                        int i11 = ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0);
                        int i12 = ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        int i13 = i10 + 127;
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m40641a(255, i11, i12, i13 + i7);
                    } else if (i5 == 136) {
                        int i14 = ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0);
                        int i15 = ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m40641a(255, i14, i15, i10 + i7);
                    }
                } else {
                    int i16 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i17 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = m40641a(127, i16, i17, i7 + i6);
                }
            }
        }
        return iArr;
    }

    /* renamed from: a */
    private static C14243a m40642a(ey0 ey0, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ey0 ey02 = ey0;
        int i7 = 8;
        int a = ey02.mo66886a(8);
        ey02.mo66897d(8);
        int i8 = 2;
        int i9 = i - 2;
        int[] a2 = m40646a();
        int[] b = m40647b();
        int[] c = m40648c();
        while (i9 > 0) {
            int a3 = ey02.mo66886a(i7);
            int a4 = ey02.mo66886a(i7);
            int i10 = i9 - 2;
            int[] iArr = (a4 & 128) != 0 ? a2 : (a4 & 64) != 0 ? b : c;
            if ((a4 & 1) != 0) {
                i5 = ey02.mo66886a(i7);
                i4 = ey02.mo66886a(i7);
                i3 = ey02.mo66886a(i7);
                i2 = ey02.mo66886a(i7);
                i6 = i10 - 4;
            } else {
                i3 = ey02.mo66886a(4) << 4;
                i6 = i10 - 2;
                int a5 = ey02.mo66886a(4) << 4;
                i2 = ey02.mo66886a(i8) << 6;
                i5 = ey02.mo66886a(6) << i8;
                i4 = a5;
            }
            if (i5 == 0) {
                i4 = 0;
                i3 = 0;
                i2 = 255;
            }
            double d = (double) i5;
            int i11 = a;
            double d2 = (double) (i4 - 128);
            double d3 = (double) (i3 - 128);
            int i12 = (int) (d + (d3 * 1.772d));
            int i13 = ih1.f34858a;
            iArr[a3] = m40641a((byte) (255 - (i2 & 255)), Math.max(0, Math.min((int) (d + (1.402d * d2)), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min(i12, 255)));
            i9 = i6;
            a = i11;
            i7 = 8;
            i8 = 2;
        }
        return new C14243a(a, a2, b, c);
    }

    /* renamed from: a */
    private static C14245c m40643a(ey0 ey0) {
        byte[] bArr;
        int a = ey0.mo66886a(16);
        ey0.mo66897d(4);
        int a2 = ey0.mo66886a(2);
        boolean f = ey0.mo66900f();
        ey0.mo66897d(1);
        byte[] bArr2 = null;
        if (a2 == 1) {
            ey0.mo66897d(ey0.mo66886a(8) * 16);
        } else if (a2 == 0) {
            int a3 = ey0.mo66886a(16);
            int a4 = ey0.mo66886a(16);
            if (a3 > 0) {
                bArr2 = new byte[a3];
                ey0.mo66893b(bArr2, 0, a3);
            }
            if (a4 > 0) {
                bArr = new byte[a4];
                ey0.mo66893b(bArr, 0, a4);
                return new C14245c(a, f, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C14245c(a, f, bArr2, bArr);
    }

    /* renamed from: a */
    private static int[] m40646a() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v45, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r2v13, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v13, types: [byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ef A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0224 A[LOOP:3: B:84:0x0170->B:113:0x0224, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0146 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x021e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0119 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014c A[LOOP:2: B:37:0x00ac->B:71:0x014c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x017f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m40644a(byte[] r24, int[] r25, int r26, int r27, int r28, android.graphics.Paint r29, android.graphics.Canvas r30) {
        /*
            r0 = r24
            r1 = r26
            r8 = r29
            com.yandex.mobile.ads.impl.ey0 r9 = new com.yandex.mobile.ads.impl.ey0
            int r2 = r0.length
            r9.<init>(r0, r2)
            r2 = r27
            r10 = r28
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0013:
            int r3 = r9.mo66891b()
            if (r3 == 0) goto L_0x022f
            r14 = 8
            int r3 = r9.mo66886a((int) r14)
            r4 = 240(0xf0, float:3.36E-43)
            if (r3 == r4) goto L_0x0229
            r15 = 3
            r7 = 4
            r16 = 0
            r6 = 1
            r5 = 2
            switch(r3) {
                case 16: goto L_0x0154;
                case 17: goto L_0x009b;
                case 18: goto L_0x0041;
                default: goto L_0x002c;
            }
        L_0x002c:
            switch(r3) {
                case 32: goto L_0x003c;
                case 33: goto L_0x0037;
                case 34: goto L_0x0030;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x0013
        L_0x0030:
            r3 = 16
            byte[] r12 = m40645a(r3, r14, r9)
            goto L_0x0013
        L_0x0037:
            byte[] r11 = m40645a(r7, r14, r9)
            goto L_0x0013
        L_0x003c:
            byte[] r13 = m40645a(r7, r7, r9)
            goto L_0x0013
        L_0x0041:
            r15 = r2
            r2 = 0
        L_0x0043:
            int r3 = r9.mo66886a((int) r14)
            if (r3 == 0) goto L_0x004e
            r17 = r2
            r18 = 1
            goto L_0x0074
        L_0x004e:
            boolean r3 = r9.mo66900f()
            r4 = 7
            if (r3 != 0) goto L_0x0067
            int r3 = r9.mo66886a((int) r4)
            if (r3 == 0) goto L_0x0061
            r17 = r2
            r18 = r3
            r3 = 0
            goto L_0x0074
        L_0x0061:
            r3 = 0
            r17 = 1
            r18 = 0
            goto L_0x0074
        L_0x0067:
            int r3 = r9.mo66886a((int) r4)
            int r4 = r9.mo66886a((int) r14)
            r17 = r2
            r18 = r3
            r3 = r4
        L_0x0074:
            if (r18 == 0) goto L_0x008f
            if (r8 == 0) goto L_0x008f
            r2 = r25[r3]
            r8.setColor(r2)
            float r3 = (float) r15
            float r4 = (float) r10
            int r2 = r15 + r18
            float r5 = (float) r2
            int r2 = r10 + 1
            float r7 = (float) r2
            r2 = r30
            r0 = 1
            r6 = r7
            r7 = r29
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0090
        L_0x008f:
            r0 = 1
        L_0x0090:
            int r15 = r15 + r18
            if (r17 == 0) goto L_0x0097
            r2 = r15
            goto L_0x0013
        L_0x0097:
            r2 = r17
            r6 = 1
            goto L_0x0043
        L_0x009b:
            r0 = 1
            if (r1 != r15) goto L_0x00a8
            if (r12 != 0) goto L_0x00a5
            byte[] r3 = f38449j
            r17 = r3
            goto L_0x00aa
        L_0x00a5:
            r17 = r12
            goto L_0x00aa
        L_0x00a8:
            r17 = 0
        L_0x00aa:
            r6 = r2
            r2 = 0
        L_0x00ac:
            int r3 = r9.mo66886a((int) r7)
            if (r3 == 0) goto L_0x00b8
            r18 = r2
        L_0x00b4:
            r19 = 1
            goto L_0x0117
        L_0x00b8:
            boolean r3 = r9.mo66900f()
            if (r3 != 0) goto L_0x00d2
            int r3 = r9.mo66886a((int) r15)
            if (r3 == 0) goto L_0x00cc
            int r3 = r3 + 2
            r18 = r2
            r19 = r3
            r3 = 0
            goto L_0x0117
        L_0x00cc:
            r3 = 0
            r18 = 1
        L_0x00cf:
            r19 = 0
            goto L_0x0117
        L_0x00d2:
            boolean r3 = r9.mo66900f()
            if (r3 != 0) goto L_0x00e7
            int r3 = r9.mo66886a((int) r5)
            int r3 = r3 + r7
            int r4 = r9.mo66886a((int) r7)
        L_0x00e1:
            r18 = r2
            r19 = r3
            r3 = r4
            goto L_0x0117
        L_0x00e7:
            int r3 = r9.mo66886a((int) r5)
            if (r3 == 0) goto L_0x0113
            if (r3 == r0) goto L_0x010d
            if (r3 == r5) goto L_0x0102
            if (r3 == r15) goto L_0x00f7
            r18 = r2
            r3 = 0
            goto L_0x00cf
        L_0x00f7:
            int r3 = r9.mo66886a((int) r14)
            int r3 = r3 + 25
            int r4 = r9.mo66886a((int) r7)
            goto L_0x00e1
        L_0x0102:
            int r3 = r9.mo66886a((int) r7)
            int r3 = r3 + 9
            int r4 = r9.mo66886a((int) r7)
            goto L_0x00e1
        L_0x010d:
            r18 = r2
            r3 = 0
            r19 = 2
            goto L_0x0117
        L_0x0113:
            r18 = r2
            r3 = 0
            goto L_0x00b4
        L_0x0117:
            if (r19 == 0) goto L_0x013f
            if (r8 == 0) goto L_0x013f
            if (r17 == 0) goto L_0x011f
            byte r3 = r17[r3]
        L_0x011f:
            r2 = r25[r3]
            r8.setColor(r2)
            float r3 = (float) r6
            float r4 = (float) r10
            int r2 = r6 + r19
            float r2 = (float) r2
            int r5 = r10 + 1
            float r5 = (float) r5
            r20 = r2
            r2 = r30
            r21 = r5
            r14 = 2
            r5 = r20
            r20 = r6
            r6 = r21
            r7 = r29
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0142
        L_0x013f:
            r20 = r6
            r14 = 2
        L_0x0142:
            int r6 = r20 + r19
            if (r18 == 0) goto L_0x014c
            r9.mo66894c()
            r2 = r6
            goto L_0x0013
        L_0x014c:
            r2 = r18
            r5 = 2
            r7 = 4
            r14 = 8
            goto L_0x00ac
        L_0x0154:
            r0 = 1
            r14 = 2
            if (r1 != r15) goto L_0x0162
            if (r11 != 0) goto L_0x015f
            byte[] r3 = f38448i
        L_0x015c:
            r17 = r3
            goto L_0x016e
        L_0x015f:
            r17 = r11
            goto L_0x016e
        L_0x0162:
            if (r1 != r14) goto L_0x016c
            if (r13 != 0) goto L_0x0169
            byte[] r3 = f38447h
            goto L_0x015c
        L_0x0169:
            r17 = r13
            goto L_0x016e
        L_0x016c:
            r17 = 0
        L_0x016e:
            r7 = r2
            r6 = 0
        L_0x0170:
            int r2 = r9.mo66886a((int) r14)
            if (r2 == 0) goto L_0x017f
            r19 = r6
        L_0x0178:
            r4 = 4
            r5 = 8
            r18 = 1
            goto L_0x01ed
        L_0x017f:
            boolean r2 = r9.mo66900f()
            if (r2 == 0) goto L_0x0197
            int r2 = r9.mo66886a((int) r15)
            int r2 = r2 + r15
            int r3 = r9.mo66886a((int) r14)
            r18 = r2
            r2 = r3
            r19 = r6
            r4 = 4
            r5 = 8
            goto L_0x01ed
        L_0x0197:
            boolean r2 = r9.mo66900f()
            if (r2 == 0) goto L_0x01a1
            r19 = r6
            r2 = 0
            goto L_0x0178
        L_0x01a1:
            int r2 = r9.mo66886a((int) r14)
            if (r2 == 0) goto L_0x01e5
            if (r2 == r0) goto L_0x01dc
            if (r2 == r14) goto L_0x01c9
            if (r2 == r15) goto L_0x01b6
            r19 = r6
            r2 = 0
            r4 = 4
            r5 = 8
            r18 = 0
            goto L_0x01ed
        L_0x01b6:
            r5 = 8
            int r2 = r9.mo66886a((int) r5)
            int r2 = r2 + 29
            int r3 = r9.mo66886a((int) r14)
            r18 = r2
            r2 = r3
            r19 = r6
            r4 = 4
            goto L_0x01ed
        L_0x01c9:
            r4 = 4
            r5 = 8
            int r2 = r9.mo66886a((int) r4)
            int r2 = r2 + 12
            int r3 = r9.mo66886a((int) r14)
            r18 = r2
            r2 = r3
            r19 = r6
            goto L_0x01ed
        L_0x01dc:
            r4 = 4
            r5 = 8
            r19 = r6
            r2 = 0
            r18 = 2
            goto L_0x01ed
        L_0x01e5:
            r4 = 4
            r5 = 8
            r2 = 0
            r18 = 0
            r19 = 1
        L_0x01ed:
            if (r18 == 0) goto L_0x0215
            if (r8 == 0) goto L_0x0215
            if (r17 == 0) goto L_0x01f5
            byte r2 = r17[r2]
        L_0x01f5:
            r2 = r25[r2]
            r8.setColor(r2)
            float r3 = (float) r7
            float r6 = (float) r10
            int r2 = r7 + r18
            float r2 = (float) r2
            int r0 = r10 + 1
            float r0 = (float) r0
            r21 = r2
            r2 = r30
            r22 = 4
            r4 = r6
            r23 = 8
            r5 = r21
            r6 = r0
            r0 = r7
            r7 = r29
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x021a
        L_0x0215:
            r0 = r7
            r22 = 4
            r23 = 8
        L_0x021a:
            int r7 = r0 + r18
            if (r19 == 0) goto L_0x0224
            r9.mo66894c()
            r2 = r7
            goto L_0x0013
        L_0x0224:
            r6 = r19
            r0 = 1
            goto L_0x0170
        L_0x0229:
            int r10 = r10 + 2
            r2 = r27
            goto L_0x0013
        L_0x022f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.p20.m40644a(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    /* renamed from: a */
    private static byte[] m40645a(int i, int i2, ey0 ey0) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ey0.mo66886a(i2);
        }
        return bArr;
    }
}
