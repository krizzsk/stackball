package com.fyber.inneractive.sdk.util;

/* renamed from: com.fyber.inneractive.sdk.util.y */
final class C3701y {

    /* renamed from: a */
    private transient C3702a[] f10010a;

    /* renamed from: b */
    private transient int f10011b;

    /* renamed from: c */
    private int f10012c;

    /* renamed from: d */
    private float f10013d;

    /* renamed from: com.fyber.inneractive.sdk.util.y$a */
    private static class C3702a {

        /* renamed from: a */
        int f10014a;

        /* renamed from: b */
        int f10015b;

        /* renamed from: c */
        Object f10016c;

        /* renamed from: d */
        C3702a f10017d;

        protected C3702a(int i, int i2, Object obj, C3702a aVar) {
            this.f10014a = i;
            this.f10015b = i2;
            this.f10016c = obj;
            this.f10017d = aVar;
        }
    }

    public C3701y() {
        this((byte) 0);
    }

    private C3701y(byte b) {
        this.f10013d = 0.75f;
        this.f10010a = new C3702a[20];
        this.f10012c = 15;
    }

    /* renamed from: a */
    public final Object mo19604a(int i, Object obj) {
        C3702a[] aVarArr = this.f10010a;
        int i2 = i & Integer.MAX_VALUE;
        int length = i2 % aVarArr.length;
        for (C3702a aVar = aVarArr[length]; aVar != null; aVar = aVar.f10017d) {
            if (aVar.f10014a == i) {
                Object obj2 = aVar.f10016c;
                aVar.f10016c = obj;
                return obj2;
            }
        }
        if (this.f10011b >= this.f10012c) {
            C3702a[] aVarArr2 = this.f10010a;
            int length2 = aVarArr2.length;
            int i3 = (length2 * 2) + 1;
            C3702a[] aVarArr3 = new C3702a[i3];
            this.f10012c = (int) (((float) i3) * this.f10013d);
            this.f10010a = aVarArr3;
            while (true) {
                int i4 = length2 - 1;
                if (length2 <= 0) {
                    break;
                }
                C3702a aVar2 = aVarArr2[i4];
                while (aVar2 != null) {
                    C3702a aVar3 = aVar2.f10017d;
                    int i5 = (aVar2.f10014a & Integer.MAX_VALUE) % i3;
                    aVar2.f10017d = aVarArr3[i5];
                    aVarArr3[i5] = aVar2;
                    aVar2 = aVar3;
                }
                length2 = i4;
            }
            aVarArr = this.f10010a;
            length = i2 % aVarArr.length;
        }
        aVarArr[length] = new C3702a(i, i, obj, aVarArr[length]);
        this.f10011b++;
        return null;
    }
}
