package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C14593sh;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.yandex.mobile.ads.impl.wd */
public final class C15041wd {

    /* renamed from: a */
    public static final C14586sd f41954a = $$Lambda$wd$g83nFlTDykNKEmV7iW4bgFYB98.INSTANCE;

    /* renamed from: com.yandex.mobile.ads.impl.wd$a */
    public interface C15042a {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static String m43577a(C13504jj jjVar) {
        String str = jjVar.f35329h;
        return str != null ? str : jjVar.f35322a.toString();
    }

    /* renamed from: com.yandex.mobile.ads.impl.wd$b */
    private static final class C15043b {

        /* renamed from: a */
        private final C15042a f41955a;

        /* renamed from: b */
        private long f41956b;

        /* renamed from: c */
        private long f41957c;

        public C15043b(C15042a aVar) {
            this.f41955a = aVar;
        }

        /* renamed from: a */
        public void mo70673a(long j, long j2) {
            this.f41956b = j;
            this.f41957c = j2;
            ((C14667td) this.f41955a).mo70155a(j, j2, 0);
        }

        /* renamed from: b */
        public void mo70674b(long j) {
            if (this.f41956b == -1 && j != -1) {
                this.f41956b = j;
                ((C14667td) this.f41955a).mo70155a(j, this.f41957c, 0);
            }
        }

        /* renamed from: a */
        public void mo70672a(long j) {
            long j2 = this.f41957c + j;
            this.f41957c = j2;
            ((C14667td) this.f41955a).mo70155a(this.f41956b, j2, j);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0100 A[Catch:{ IOException -> 0x00ed, all -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010d A[Catch:{ IOException -> 0x00ed, all -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0123 A[Catch:{ IOException -> 0x00ed, all -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x016e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0153 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m43578a(com.yandex.mobile.ads.impl.C13504jj r32, com.yandex.mobile.ads.impl.C12966ed r33, com.yandex.mobile.ads.impl.C13325hj r34, com.yandex.mobile.ads.impl.C15041wd.C15042a r35, java.util.concurrent.atomic.AtomicBoolean r36) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r1 = r32
            r8 = r33
            com.yandex.mobile.ads.impl.jd r9 = new com.yandex.mobile.ads.impl.jd
            r10 = 0
            r0 = r34
            r9.<init>(r8, r0, r10)
            r11 = 131072(0x20000, float:1.83671E-40)
            byte[] r12 = new byte[r11]
            com.yandex.mobile.ads.impl.sd r0 = f41954a
            java.lang.String r13 = r0.mo65605a(r1)
            com.yandex.mobile.ads.impl.wd$b r14 = new com.yandex.mobile.ads.impl.wd$b
            r2 = r35
            r14.<init>(r2)
            java.lang.String r0 = r0.mo65605a(r1)
            long r2 = r1.f35326e
            long r15 = m43576a(r1, r8, r0)
            r17 = 0
            r19 = r2
            r21 = r15
            r23 = r17
        L_0x002f:
            r25 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = -1
            int r2 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x0068
            int r27 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r27 == 0) goto L_0x0041
            r28 = r21
            goto L_0x0043
        L_0x0041:
            r28 = r25
        L_0x0043:
            r2 = r33
            r3 = r0
            r4 = r19
            r10 = r6
            r6 = r28
            long r2 = r2.mo66811b(r3, r4, r6)
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 <= 0) goto L_0x0056
            long r23 = r23 + r2
            goto L_0x005c
        L_0x0056:
            long r2 = -r2
            int r4 = (r2 > r25 ? 1 : (r2 == r25 ? 0 : -1))
            if (r4 != 0) goto L_0x005c
            goto L_0x0069
        L_0x005c:
            long r19 = r19 + r2
            if (r27 != 0) goto L_0x0062
            r2 = r17
        L_0x0062:
            long r21 = r21 - r2
            r10 = 0
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x002f
        L_0x0068:
            r10 = r6
        L_0x0069:
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            java.lang.Long r2 = java.lang.Long.valueOf(r23)
            android.util.Pair r0 = android.util.Pair.create(r0, r2)
            java.lang.Object r2 = r0.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.lang.Object r4 = r0.second
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r14.mo70673a(r2, r4)
            java.lang.Object r0 = r0.first
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            long r4 = r1.f35326e
            r15 = 1
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            r19 = r2
            r21 = r4
            if (r0 != 0) goto L_0x009e
            r16 = 1
            goto L_0x00a0
        L_0x009e:
            r16 = 0
        L_0x00a0:
            int r0 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x016e
            m43579a((java.util.concurrent.atomic.AtomicBoolean) r36)
            if (r16 == 0) goto L_0x00ac
            r6 = r25
            goto L_0x00ae
        L_0x00ac:
            r6 = r19
        L_0x00ae:
            r2 = r33
            r3 = r13
            r4 = r21
            long r2 = r2.mo66811b(r3, r4, r6)
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x00be
            r4 = 0
            goto L_0x0162
        L_0x00be:
            long r6 = -r2
            int r0 = (r6 > r25 ? 1 : (r6 == r25 ? 0 : -1))
            if (r0 != 0) goto L_0x00c5
            r2 = r10
            goto L_0x00c6
        L_0x00c5:
            r2 = r6
        L_0x00c6:
            int r0 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            r23 = r6
            if (r0 != 0) goto L_0x00ce
            r4 = 1
            goto L_0x00cf
        L_0x00ce:
            r4 = 0
        L_0x00cf:
            long r5 = r1.f35326e
            long r5 = r21 - r5
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00d9
            long r2 = r2 + r5
            goto L_0x00da
        L_0x00d9:
            r2 = r10
        L_0x00da:
            m43579a((java.util.concurrent.atomic.AtomicBoolean) r36)
            int r7 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x00fb
            long r10 = r2 - r5
            com.yandex.mobile.ads.impl.jj r0 = r1.mo68006a(r5, r10)     // Catch:{ IOException -> 0x00ed }
            long r10 = r9.mo65275a((com.yandex.mobile.ads.impl.C13504jj) r0)     // Catch:{ IOException -> 0x00ed }
            r0 = 1
            goto L_0x00fe
        L_0x00ed:
            r0 = move-exception
            if (r4 == 0) goto L_0x00fa
            boolean r10 = m43580a((java.io.IOException) r0)     // Catch:{ all -> 0x010b }
            if (r10 == 0) goto L_0x00fa
            com.yandex.mobile.ads.impl.ih1.m37378a((com.yandex.mobile.ads.impl.C13325hj) r9)     // Catch:{ all -> 0x010b }
            goto L_0x00fb
        L_0x00fa:
            throw r0     // Catch:{ all -> 0x010b }
        L_0x00fb:
            r0 = 0
            r10 = -1
        L_0x00fe:
            if (r0 != 0) goto L_0x010d
            r10 = -1
            com.yandex.mobile.ads.impl.jj r0 = r1.mo68006a(r5, r10)     // Catch:{ all -> 0x010b }
            long r27 = r9.mo65275a((com.yandex.mobile.ads.impl.C13504jj) r0)     // Catch:{ all -> 0x010b }
            goto L_0x0113
        L_0x010b:
            r0 = move-exception
            goto L_0x014f
        L_0x010d:
            r30 = r10
            r10 = -1
            r27 = r30
        L_0x0113:
            if (r4 == 0) goto L_0x011e
            int r0 = (r27 > r10 ? 1 : (r27 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x011e
            long r10 = r5 + r27
            r14.mo70674b(r10)     // Catch:{ all -> 0x010b }
        L_0x011e:
            r10 = r5
        L_0x011f:
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0153
            m43579a((java.util.concurrent.atomic.AtomicBoolean) r36)     // Catch:{ all -> 0x010b }
            if (r7 == 0) goto L_0x0135
            r4 = 131072(0x20000, float:1.83671E-40)
            long r0 = (long) r4     // Catch:{ all -> 0x010b }
            r34 = r5
            long r4 = r2 - r10
            long r0 = java.lang.Math.min(r0, r4)     // Catch:{ all -> 0x010b }
            int r1 = (int) r0     // Catch:{ all -> 0x010b }
            goto L_0x0139
        L_0x0135:
            r34 = r5
            r1 = 131072(0x20000, float:1.83671E-40)
        L_0x0139:
            r4 = 0
            int r0 = r9.mo65274a(r12, r4, r1)     // Catch:{ all -> 0x010b }
            r1 = -1
            if (r0 != r1) goto L_0x0145
            r14.mo70674b(r10)     // Catch:{ all -> 0x010b }
            goto L_0x0156
        L_0x0145:
            long r0 = (long) r0     // Catch:{ all -> 0x010b }
            long r10 = r10 + r0
            r14.mo70672a(r0)     // Catch:{ all -> 0x010b }
            r1 = r32
            r5 = r34
            goto L_0x011f
        L_0x014f:
            com.yandex.mobile.ads.impl.ih1.m37378a((com.yandex.mobile.ads.impl.C13325hj) r9)
            throw r0
        L_0x0153:
            r34 = r5
            r4 = 0
        L_0x0156:
            long r10 = r10 - r34
            com.yandex.mobile.ads.impl.ih1.m37378a((com.yandex.mobile.ads.impl.C13325hj) r9)
            int r0 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r0 >= 0) goto L_0x0160
            goto L_0x016e
        L_0x0160:
            r2 = r23
        L_0x0162:
            long r21 = r21 + r2
            if (r16 != 0) goto L_0x0168
            long r19 = r19 - r2
        L_0x0168:
            r1 = r32
            r10 = -1
            goto L_0x00a0
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C15041wd.m43578a(com.yandex.mobile.ads.impl.jj, com.yandex.mobile.ads.impl.ed, com.yandex.mobile.ads.impl.hj, com.yandex.mobile.ads.impl.wd$a, java.util.concurrent.atomic.AtomicBoolean):void");
    }

    /* renamed from: a */
    private static long m43576a(C13504jj jjVar, C12966ed edVar, String str) {
        long j = jjVar.f35328g;
        if (j != -1) {
            return j;
        }
        long a = C14593sh.CC.m41975a(edVar.mo66805a(str));
        if (a == -1) {
            return -1;
        }
        return a - jjVar.f35326e;
    }

    /* renamed from: a */
    static boolean m43580a(IOException iOException) {
        Throwable th;
        while (th != null) {
            if ((th instanceof C13415ij) && ((C13415ij) th).f34891b == 0) {
                return true;
            }
            Throwable cause = th.getCause();
            th = iOException;
            th = cause;
        }
        return false;
    }

    /* renamed from: a */
    private static void m43579a(AtomicBoolean atomicBoolean) throws InterruptedException {
        if (Thread.interrupted() || (atomicBoolean != null && atomicBoolean.get())) {
            throw new InterruptedException();
        }
    }
}
