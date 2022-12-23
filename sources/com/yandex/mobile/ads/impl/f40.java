package com.yandex.mobile.ads.impl;

import androidx.core.app.NotificationCompat;
import com.facebook.appevents.integrity.IntegrityManager;
import com.yandex.mobile.ads.impl.n61;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

public final class f40 {

    /* renamed from: a */
    private final b31 f33217a;

    /* renamed from: b */
    private final C14563s5 f33218b;

    /* renamed from: c */
    private final x21 f33219c;

    /* renamed from: d */
    private final b40 f33220d;

    /* renamed from: e */
    private n61.C14058a f33221e;

    /* renamed from: f */
    private n61 f33222f;

    /* renamed from: g */
    private int f33223g;

    /* renamed from: h */
    private int f33224h;

    /* renamed from: i */
    private int f33225i;

    /* renamed from: j */
    private k61 f33226j;

    public f40(b31 b31, C14563s5 s5Var, x21 x21, b40 b40) {
        Intrinsics.checkNotNullParameter(b31, "connectionPool");
        Intrinsics.checkNotNullParameter(s5Var, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        Intrinsics.checkNotNullParameter(x21, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(b40, "eventListener");
        this.f33217a = b31;
        this.f33218b = s5Var;
        this.f33219c = x21;
        this.f33220d = b40;
    }

    /* renamed from: a */
    public final C14563s5 mo66916a() {
        return this.f33218b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo66919b() {
        /*
            r5 = this;
            int r0 = r5.f33223g
            if (r0 != 0) goto L_0x000e
            int r1 = r5.f33224h
            if (r1 != 0) goto L_0x000e
            int r1 = r5.f33225i
            if (r1 != 0) goto L_0x000e
            r0 = 0
            return r0
        L_0x000e:
            com.yandex.mobile.ads.impl.k61 r1 = r5.f33226j
            r2 = 1
            if (r1 == 0) goto L_0x0014
            return r2
        L_0x0014:
            r1 = 0
            if (r0 > r2) goto L_0x0055
            int r0 = r5.f33224h
            if (r0 > r2) goto L_0x0055
            int r0 = r5.f33225i
            if (r0 <= 0) goto L_0x0020
            goto L_0x0055
        L_0x0020:
            com.yandex.mobile.ads.impl.x21 r0 = r5.f33219c
            com.yandex.mobile.ads.impl.y21 r0 = r0.mo70802d()
            if (r0 != 0) goto L_0x0029
            goto L_0x0055
        L_0x0029:
            monitor-enter(r0)
            int r3 = r0.mo70982e()     // Catch:{ all -> 0x0052 }
            if (r3 == 0) goto L_0x0032
            monitor-exit(r0)
            goto L_0x0055
        L_0x0032:
            com.yandex.mobile.ads.impl.k61 r3 = r0.mo70988k()     // Catch:{ all -> 0x0052 }
            com.yandex.mobile.ads.impl.s5 r3 = r3.mo68140a()     // Catch:{ all -> 0x0052 }
            com.yandex.mobile.ads.impl.fc0 r3 = r3.mo69885k()     // Catch:{ all -> 0x0052 }
            com.yandex.mobile.ads.impl.s5 r4 = r5.f33218b     // Catch:{ all -> 0x0052 }
            com.yandex.mobile.ads.impl.fc0 r4 = r4.mo69885k()     // Catch:{ all -> 0x0052 }
            boolean r3 = com.yandex.mobile.ads.impl.jh1.m37828a((com.yandex.mobile.ads.impl.fc0) r3, (com.yandex.mobile.ads.impl.fc0) r4)     // Catch:{ all -> 0x0052 }
            if (r3 != 0) goto L_0x004c
            monitor-exit(r0)
            goto L_0x0055
        L_0x004c:
            com.yandex.mobile.ads.impl.k61 r3 = r0.mo70988k()     // Catch:{ all -> 0x0052 }
            monitor-exit(r0)
            goto L_0x0056
        L_0x0052:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0055:
            r3 = r1
        L_0x0056:
            if (r3 == 0) goto L_0x005b
            r5.f33226j = r3
            return r2
        L_0x005b:
            com.yandex.mobile.ads.impl.n61$a r0 = r5.f33221e
            if (r0 != 0) goto L_0x0060
            goto L_0x0068
        L_0x0060:
            boolean r0 = r0.mo68896b()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x0068:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x0071
            return r2
        L_0x0071:
            com.yandex.mobile.ads.impl.n61 r0 = r5.f33222f
            if (r0 != 0) goto L_0x0076
            return r2
        L_0x0076:
            boolean r0 = r0.mo68893a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.f40.mo66919b():boolean");
    }

    /* renamed from: a */
    public final e40 mo66915a(hw0 hw0, c31 c31) {
        Intrinsics.checkNotNullParameter(hw0, "client");
        Intrinsics.checkNotNullParameter(c31, "chain");
        try {
            int c = c31.mo66195c();
            int e = c31.mo66197e();
            int g = c31.mo66199g();
            hw0.getClass();
            return m35891a(c, e, g, 0, hw0.mo67664v(), !Intrinsics.areEqual((Object) c31.mo66198f().mo68567f(), (Object) "GET")).mo70971a(hw0, c31);
        } catch (m61 e2) {
            mo66917a(e2.mo68583b());
            throw e2;
        } catch (IOException e3) {
            mo66917a(e3);
            throw new m61(e3);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x017e A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.yandex.mobile.ads.impl.y21 m35891a(int r15, int r16, int r17, int r18, boolean r19, boolean r20) throws java.io.IOException {
        /*
            r14 = this;
            r1 = r14
        L_0x0001:
            com.yandex.mobile.ads.impl.x21 r0 = r1.f33219c
            boolean r0 = r0.mo70805g()
            if (r0 != 0) goto L_0x01bd
            com.yandex.mobile.ads.impl.x21 r0 = r1.f33219c
            com.yandex.mobile.ads.impl.y21 r2 = r0.mo70802d()
            r0 = 1
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x006e
            monitor-enter(r2)
            boolean r5 = r2.mo70981d()     // Catch:{ all -> 0x006b }
            if (r5 != 0) goto L_0x0030
            com.yandex.mobile.ads.impl.k61 r5 = r2.mo70988k()     // Catch:{ all -> 0x006b }
            com.yandex.mobile.ads.impl.s5 r5 = r5.mo68140a()     // Catch:{ all -> 0x006b }
            com.yandex.mobile.ads.impl.fc0 r5 = r5.mo69885k()     // Catch:{ all -> 0x006b }
            boolean r5 = r14.mo66918a((com.yandex.mobile.ads.impl.fc0) r5)     // Catch:{ all -> 0x006b }
            if (r5 != 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r5 = r4
            goto L_0x0036
        L_0x0030:
            com.yandex.mobile.ads.impl.x21 r5 = r1.f33219c     // Catch:{ all -> 0x006b }
            java.net.Socket r5 = r5.mo70806h()     // Catch:{ all -> 0x006b }
        L_0x0036:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x006b }
            monitor-exit(r2)
            com.yandex.mobile.ads.impl.x21 r6 = r1.f33219c
            com.yandex.mobile.ads.impl.y21 r6 = r6.mo70802d()
            if (r6 == 0) goto L_0x0053
            if (r5 != 0) goto L_0x0044
            r3 = 1
        L_0x0044:
            if (r3 == 0) goto L_0x0047
            goto L_0x0090
        L_0x0047:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Check failed."
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0053:
            if (r5 != 0) goto L_0x0056
            goto L_0x0059
        L_0x0056:
            com.yandex.mobile.ads.impl.jh1.m37827a((java.net.Socket) r5)
        L_0x0059:
            com.yandex.mobile.ads.impl.b40 r5 = r1.f33220d
            com.yandex.mobile.ads.impl.x21 r6 = r1.f33219c
            r5.getClass()
            java.lang.String r5 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            java.lang.String r5 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            goto L_0x006e
        L_0x006b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x006e:
            r1.f33223g = r3
            r1.f33224h = r3
            r1.f33225i = r3
            com.yandex.mobile.ads.impl.b31 r2 = r1.f33217a
            com.yandex.mobile.ads.impl.s5 r5 = r1.f33218b
            com.yandex.mobile.ads.impl.x21 r6 = r1.f33219c
            boolean r2 = r2.mo65961a(r5, r6, r4, r3)
            if (r2 == 0) goto L_0x0094
            com.yandex.mobile.ads.impl.x21 r2 = r1.f33219c
            com.yandex.mobile.ads.impl.y21 r2 = r2.mo70802d()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            com.yandex.mobile.ads.impl.b40 r3 = r1.f33220d
            com.yandex.mobile.ads.impl.x21 r4 = r1.f33219c
            r3.mo65964a((com.yandex.mobile.ads.impl.C12380ae) r4, (com.yandex.mobile.ads.impl.C13205gh) r2)
        L_0x0090:
            r3 = r20
            goto L_0x0178
        L_0x0094:
            com.yandex.mobile.ads.impl.k61 r2 = r1.f33226j
            if (r2 == 0) goto L_0x009f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r1.f33226j = r4
        L_0x009d:
            r5 = r4
            goto L_0x0104
        L_0x009f:
            com.yandex.mobile.ads.impl.n61$a r2 = r1.f33221e
            if (r2 == 0) goto L_0x00b6
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            boolean r2 = r2.mo68896b()
            if (r2 == 0) goto L_0x00b6
            com.yandex.mobile.ads.impl.n61$a r2 = r1.f33221e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            com.yandex.mobile.ads.impl.k61 r2 = r2.mo68897c()
            goto L_0x009d
        L_0x00b6:
            com.yandex.mobile.ads.impl.n61 r2 = r1.f33222f
            if (r2 != 0) goto L_0x00d1
            com.yandex.mobile.ads.impl.n61 r2 = new com.yandex.mobile.ads.impl.n61
            com.yandex.mobile.ads.impl.s5 r5 = r1.f33218b
            com.yandex.mobile.ads.impl.x21 r6 = r1.f33219c
            com.yandex.mobile.ads.impl.hw0 r6 = r6.mo70800c()
            com.yandex.mobile.ads.impl.l61 r6 = r6.mo67656n()
            com.yandex.mobile.ads.impl.x21 r7 = r1.f33219c
            com.yandex.mobile.ads.impl.b40 r8 = r1.f33220d
            r2.<init>(r5, r6, r7, r8)
            r1.f33222f = r2
        L_0x00d1:
            com.yandex.mobile.ads.impl.n61$a r2 = r2.mo68894c()
            r1.f33221e = r2
            java.util.List r5 = r2.mo68895a()
            com.yandex.mobile.ads.impl.x21 r6 = r1.f33219c
            boolean r6 = r6.mo70805g()
            if (r6 != 0) goto L_0x01b5
            com.yandex.mobile.ads.impl.b31 r6 = r1.f33217a
            com.yandex.mobile.ads.impl.s5 r7 = r1.f33218b
            com.yandex.mobile.ads.impl.x21 r8 = r1.f33219c
            boolean r3 = r6.mo65961a(r7, r8, r5, r3)
            if (r3 == 0) goto L_0x0100
            com.yandex.mobile.ads.impl.x21 r2 = r1.f33219c
            com.yandex.mobile.ads.impl.y21 r2 = r2.mo70802d()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            com.yandex.mobile.ads.impl.b40 r3 = r1.f33220d
            com.yandex.mobile.ads.impl.x21 r4 = r1.f33219c
            r3.mo65964a((com.yandex.mobile.ads.impl.C12380ae) r4, (com.yandex.mobile.ads.impl.C13205gh) r2)
            goto L_0x0090
        L_0x0100:
            com.yandex.mobile.ads.impl.k61 r2 = r2.mo68897c()
        L_0x0104:
            com.yandex.mobile.ads.impl.y21 r3 = new com.yandex.mobile.ads.impl.y21
            com.yandex.mobile.ads.impl.b31 r6 = r1.f33217a
            r3.<init>(r6, r2)
            com.yandex.mobile.ads.impl.x21 r6 = r1.f33219c
            r6.mo70799b((com.yandex.mobile.ads.impl.y21) r3)
            com.yandex.mobile.ads.impl.x21 r12 = r1.f33219c     // Catch:{ all -> 0x01ae }
            com.yandex.mobile.ads.impl.b40 r13 = r1.f33220d     // Catch:{ all -> 0x01ae }
            r6 = r3
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = r19
            r6.mo70973a(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01ae }
            com.yandex.mobile.ads.impl.x21 r6 = r1.f33219c
            r6.mo70799b((com.yandex.mobile.ads.impl.y21) r4)
            com.yandex.mobile.ads.impl.x21 r4 = r1.f33219c
            com.yandex.mobile.ads.impl.hw0 r4 = r4.mo70800c()
            com.yandex.mobile.ads.impl.l61 r4 = r4.mo67656n()
            com.yandex.mobile.ads.impl.k61 r6 = r3.mo70988k()
            r4.mo68359a(r6)
            com.yandex.mobile.ads.impl.b31 r4 = r1.f33217a
            com.yandex.mobile.ads.impl.s5 r6 = r1.f33218b
            com.yandex.mobile.ads.impl.x21 r7 = r1.f33219c
            boolean r4 = r4.mo65961a(r6, r7, r5, r0)
            if (r4 == 0) goto L_0x0160
            com.yandex.mobile.ads.impl.x21 r4 = r1.f33219c
            com.yandex.mobile.ads.impl.y21 r4 = r4.mo70802d()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r1.f33226j = r2
            java.net.Socket r2 = r3.mo70989l()
            com.yandex.mobile.ads.impl.jh1.m37827a((java.net.Socket) r2)
            com.yandex.mobile.ads.impl.b40 r2 = r1.f33220d
            com.yandex.mobile.ads.impl.x21 r3 = r1.f33219c
            r2.mo65964a((com.yandex.mobile.ads.impl.C12380ae) r3, (com.yandex.mobile.ads.impl.C13205gh) r4)
            r3 = r20
            r2 = r4
            goto L_0x0178
        L_0x0160:
            monitor-enter(r3)
            com.yandex.mobile.ads.impl.b31 r2 = r1.f33217a     // Catch:{ all -> 0x01ab }
            r2.mo65963b(r3)     // Catch:{ all -> 0x01ab }
            com.yandex.mobile.ads.impl.x21 r2 = r1.f33219c     // Catch:{ all -> 0x01ab }
            r2.mo70795a((com.yandex.mobile.ads.impl.y21) r3)     // Catch:{ all -> 0x01ab }
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x01ab }
            monitor-exit(r3)
            com.yandex.mobile.ads.impl.b40 r2 = r1.f33220d
            com.yandex.mobile.ads.impl.x21 r4 = r1.f33219c
            r2.mo65964a((com.yandex.mobile.ads.impl.C12380ae) r4, (com.yandex.mobile.ads.impl.C13205gh) r3)
            r2 = r3
            goto L_0x0090
        L_0x0178:
            boolean r4 = r2.mo70977a((boolean) r3)
            if (r4 == 0) goto L_0x017f
            return r2
        L_0x017f:
            r2.mo70987j()
            com.yandex.mobile.ads.impl.k61 r2 = r1.f33226j
            if (r2 == 0) goto L_0x0188
            goto L_0x0001
        L_0x0188:
            com.yandex.mobile.ads.impl.n61$a r2 = r1.f33221e
            if (r2 != 0) goto L_0x018e
            r2 = 1
            goto L_0x0192
        L_0x018e:
            boolean r2 = r2.mo68896b()
        L_0x0192:
            if (r2 == 0) goto L_0x0196
            goto L_0x0001
        L_0x0196:
            com.yandex.mobile.ads.impl.n61 r2 = r1.f33222f
            if (r2 != 0) goto L_0x019b
            goto L_0x019f
        L_0x019b:
            boolean r0 = r2.mo68893a()
        L_0x019f:
            if (r0 == 0) goto L_0x01a3
            goto L_0x0001
        L_0x01a3:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "exhausted all routes"
            r0.<init>(r2)
            throw r0
        L_0x01ab:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x01ae:
            r0 = move-exception
            com.yandex.mobile.ads.impl.x21 r2 = r1.f33219c
            r2.mo70799b((com.yandex.mobile.ads.impl.y21) r4)
            throw r0
        L_0x01b5:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x01bd:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.f40.m35891a(int, int, int, int, boolean, boolean):com.yandex.mobile.ads.impl.y21");
    }

    /* renamed from: a */
    public final void mo66917a(IOException iOException) {
        Intrinsics.checkNotNullParameter(iOException, "e");
        this.f33226j = null;
        if ((iOException instanceof nb1) && ((nb1) iOException).f37792b == o30.REFUSED_STREAM) {
            this.f33223g++;
        } else if (iOException instanceof C13412ih) {
            this.f33224h++;
        } else {
            this.f33225i++;
        }
    }

    /* renamed from: a */
    public final boolean mo66918a(fc0 fc0) {
        Intrinsics.checkNotNullParameter(fc0, "url");
        fc0 k = this.f33218b.mo69885k();
        return fc0.mo66961i() == k.mo66961i() && Intrinsics.areEqual((Object) fc0.mo66958g(), (Object) k.mo66958g());
    }
}
