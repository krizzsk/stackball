package com.yandex.metrica.impl.p265ob;

import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;

/* renamed from: com.yandex.metrica.impl.ob.E8 */
public class C10214E8 {

    /* renamed from: a */
    private final C10628P8 f24548a;

    /* renamed from: b */
    private final C10628P8 f24549b;

    /* renamed from: c */
    private final SparseArray<C10628P8> f24550c;

    /* renamed from: d */
    private final C10247F8 f24551d;

    /* renamed from: com.yandex.metrica.impl.ob.E8$b */
    public static class C10216b {
        /* renamed from: a */
        public C10214E8 mo61224a(String str, C10628P8 p8, C10628P8 p82, SparseArray<C10628P8> sparseArray, C10247F8 f8) {
            return new C10214E8(str, p8, p82, sparseArray, f8);
        }
    }

    /* renamed from: a */
    public void mo61220a(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f24548a.mo61054a(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0011 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo61222b(android.database.sqlite.SQLiteDatabase r2) {
        /*
            r1 = this;
            com.yandex.metrica.impl.ob.F8 r0 = r1.f24551d     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0016
            com.yandex.metrica.impl.ob.G8 r0 = (com.yandex.metrica.impl.p265ob.C10305G8) r0
            boolean r0 = r0.mo61355a(r2)     // Catch:{ all -> 0x0016 }
            if (r0 != 0) goto L_0x0016
            com.yandex.metrica.impl.ob.P8 r0 = r1.f24549b     // Catch:{ all -> 0x0016 }
            r0.mo61054a(r2)     // Catch:{ all -> 0x0011 }
        L_0x0011:
            com.yandex.metrica.impl.ob.P8 r0 = r1.f24548a     // Catch:{ all -> 0x0016 }
            r0.mo61054a(r2)     // Catch:{ all -> 0x0016 }
        L_0x0016:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10214E8.mo61222b(android.database.sqlite.SQLiteDatabase):void");
    }

    private C10214E8(String str, C10628P8 p8, C10628P8 p82, SparseArray<C10628P8> sparseArray, C10247F8 f8) {
        this.f24548a = p8;
        this.f24549b = p82;
        this.f24550c = sparseArray;
        this.f24551d = f8;
    }

    /* renamed from: a */
    public void mo61221a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i > i2) {
            try {
                this.f24549b.mo61054a(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            try {
                this.f24548a.mo61054a(sQLiteDatabase);
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo61223b(android.database.sqlite.SQLiteDatabase r4, int r5, int r6) {
        /*
            r3 = this;
            r0 = 1
            if (r6 <= r5) goto L_0x0017
            r1 = 0
            int r5 = r5 + r0
        L_0x0005:
            if (r5 > r6) goto L_0x0018
            android.util.SparseArray<com.yandex.metrica.impl.ob.P8> r2 = r3.f24550c     // Catch:{ all -> 0x0017 }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ all -> 0x0017 }
            com.yandex.metrica.impl.ob.P8 r2 = (com.yandex.metrica.impl.p265ob.C10628P8) r2     // Catch:{ all -> 0x0017 }
            if (r2 == 0) goto L_0x0014
            r2.mo61054a(r4)     // Catch:{ all -> 0x0017 }
        L_0x0014:
            int r5 = r5 + 1
            goto L_0x0005
        L_0x0017:
            r1 = 1
        L_0x0018:
            com.yandex.metrica.impl.ob.F8 r5 = r3.f24551d
            com.yandex.metrica.impl.ob.G8 r5 = (com.yandex.metrica.impl.p265ob.C10305G8) r5
            boolean r5 = r5.mo61355a(r4)
            r5 = r5 ^ r0
            r5 = r5 | r1
            if (r5 == 0) goto L_0x002e
            com.yandex.metrica.impl.ob.P8 r5 = r3.f24549b
            r5.mo61054a(r4)     // Catch:{ all -> 0x0029 }
        L_0x0029:
            com.yandex.metrica.impl.ob.P8 r5 = r3.f24548a
            r5.mo61054a(r4)     // Catch:{ all -> 0x002e }
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10214E8.mo61223b(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
