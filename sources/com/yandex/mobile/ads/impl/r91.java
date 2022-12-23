package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class r91 {

    /* renamed from: h */
    private static final Comparator<C14446b> f39387h = $$Lambda$r91$Tycm9rhpuMm1Ni4Dx8VmY6q5Cc.INSTANCE;

    /* renamed from: i */
    private static final Comparator<C14446b> f39388i = $$Lambda$r91$WonDkt4h7wysmFTBaoHkFgdnjPE.INSTANCE;

    /* renamed from: a */
    private final int f39389a;

    /* renamed from: b */
    private final ArrayList<C14446b> f39390b = new ArrayList<>();

    /* renamed from: c */
    private final C14446b[] f39391c = new C14446b[5];

    /* renamed from: d */
    private int f39392d = -1;

    /* renamed from: e */
    private int f39393e;

    /* renamed from: f */
    private int f39394f;

    /* renamed from: g */
    private int f39395g;

    /* renamed from: com.yandex.mobile.ads.impl.r91$b */
    private static class C14446b {

        /* renamed from: a */
        public int f39396a;

        /* renamed from: b */
        public int f39397b;

        /* renamed from: c */
        public float f39398c;

        private C14446b() {
        }
    }

    public r91(int i) {
        this.f39389a = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m41504a(C14446b bVar, C14446b bVar2) {
        return bVar.f39396a - bVar2.f39396a;
    }

    /* renamed from: a */
    public void mo69708a() {
        this.f39390b.clear();
        this.f39392d = -1;
        this.f39393e = 0;
        this.f39394f = 0;
    }

    /* renamed from: a */
    public void mo69709a(int i, float f) {
        C14446b bVar;
        if (this.f39392d != 1) {
            Collections.sort(this.f39390b, f39387h);
            this.f39392d = 1;
        }
        int i2 = this.f39395g;
        if (i2 > 0) {
            C14446b[] bVarArr = this.f39391c;
            int i3 = i2 - 1;
            this.f39395g = i3;
            bVar = bVarArr[i3];
        } else {
            bVar = new C14446b();
        }
        int i4 = this.f39393e;
        this.f39393e = i4 + 1;
        bVar.f39396a = i4;
        bVar.f39397b = i;
        bVar.f39398c = f;
        this.f39390b.add(bVar);
        this.f39394f += i;
        while (true) {
            int i5 = this.f39394f;
            int i6 = this.f39389a;
            if (i5 > i6) {
                int i7 = i5 - i6;
                C14446b bVar2 = this.f39390b.get(0);
                int i8 = bVar2.f39397b;
                if (i8 <= i7) {
                    this.f39394f -= i8;
                    this.f39390b.remove(0);
                    int i9 = this.f39395g;
                    if (i9 < 5) {
                        C14446b[] bVarArr2 = this.f39391c;
                        this.f39395g = i9 + 1;
                        bVarArr2[i9] = bVar2;
                    }
                } else {
                    bVar2.f39397b = i8 - i7;
                    this.f39394f -= i7;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public float mo69707a(float f) {
        if (this.f39392d != 0) {
            Collections.sort(this.f39390b, f39388i);
            this.f39392d = 0;
        }
        float f2 = f * ((float) this.f39394f);
        int i = 0;
        for (int i2 = 0; i2 < this.f39390b.size(); i2++) {
            C14446b bVar = this.f39390b.get(i2);
            i += bVar.f39397b;
            if (((float) i) >= f2) {
                return bVar.f39398c;
            }
        }
        if (this.f39390b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<C14446b> arrayList = this.f39390b;
        return arrayList.get(arrayList.size() - 1).f39398c;
    }
}
