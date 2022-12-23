package com.yandex.metrica.impl.p265ob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Ye */
public class C10958Ye {

    /* renamed from: g */
    private static Map<C10533N0, Integer> f26348g;

    /* renamed from: h */
    private static final C10958Ye f26349h = new C10958Ye(new C11381jf(), new C11427kf(), new C11282gf(), new C11348if(), new C11041af(), new C11082bf());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C11208ef f26350a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C11529mf f26351b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C10841Ve f26352c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C10991Ze f26353d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C11151df f26354e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C11242ff f26355f;

    /* renamed from: com.yandex.metrica.impl.ob.Ye$b */
    public static class C10960b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C11208ef f26356a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C11529mf f26357b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C10841Ve f26358c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C10991Ze f26359d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C11151df f26360e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C11242ff f26361f;

        private C10960b(C10958Ye ye) {
            this.f26356a = ye.f26350a;
            this.f26357b = ye.f26351b;
            this.f26358c = ye.f26352c;
            this.f26359d = ye.f26353d;
            this.f26360e = ye.f26354e;
            this.f26361f = ye.f26355f;
        }

        /* renamed from: a */
        public C10960b mo62543a(C11208ef efVar) {
            this.f26356a = efVar;
            return this;
        }

        /* renamed from: a */
        public C10960b mo62545a(C11529mf mfVar) {
            this.f26357b = mfVar;
            return this;
        }

        /* renamed from: a */
        public C10960b mo62540a(C10841Ve ve) {
            this.f26358c = ve;
            return this;
        }

        /* renamed from: a */
        public C10960b mo62541a(C10991Ze ze) {
            this.f26359d = ze;
            return this;
        }

        /* renamed from: a */
        public C10960b mo62542a(C11151df dfVar) {
            this.f26360e = dfVar;
            return this;
        }

        /* renamed from: a */
        public C10960b mo62544a(C11242ff ffVar) {
            this.f26361f = ffVar;
            return this;
        }

        /* renamed from: a */
        public C10958Ye mo62546a() {
            return new C10958Ye(this);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(C10533N0.FIRST_OCCURRENCE, 1);
        hashMap.put(C10533N0.NON_FIRST_OCCURENCE, 0);
        hashMap.put(C10533N0.UNKNOWN, -1);
        f26348g = Collections.unmodifiableMap(hashMap);
    }

    private C10958Ye(C10960b bVar) {
        this(bVar.f26356a, bVar.f26357b, bVar.f26358c, bVar.f26359d, bVar.f26360e, bVar.f26361f);
    }

    /* renamed from: b */
    public static C10958Ye m28297b() {
        return f26349h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00da A[SYNTHETIC, Splitter:B:47:0x00da] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0156  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.impl.p265ob.C10842Vf.C10847d.C10848a mo62539a(com.yandex.metrica.impl.p265ob.C10926Xe r8, com.yandex.metrica.impl.p265ob.C11384jh r9) {
        /*
            r7 = this;
            com.yandex.metrica.impl.ob.Vf$d$a r0 = new com.yandex.metrica.impl.ob.Vf$d$a
            r0.<init>()
            com.yandex.metrica.impl.ob.ff r1 = r7.f26355f
            java.lang.Integer r2 = r8.f26271o
            java.lang.String r3 = r8.f26272p
            java.lang.String r4 = r8.f26265i
            java.lang.String r5 = r8.f26264h
            com.yandex.metrica.impl.ob.Vf$d$a$b r1 = r1.mo62231a(r2, r3, r4, r5)
            com.yandex.metrica.impl.ob.df r2 = r7.f26354e
            java.lang.String r3 = r8.f26263g
            com.yandex.metrica.impl.ob.Vf$b r2 = r2.mo62129a(r3)
            java.lang.String r3 = r8.f26269m
            r4 = 0
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0062 }
            if (r5 != 0) goto L_0x0062
            com.yandex.metrica.k r3 = com.yandex.metrica.impl.p265ob.C11327i.m29166a((java.lang.String) r3)     // Catch:{ all -> 0x0062 }
            com.yandex.metrica.impl.ob.Vf$d$a$a r5 = new com.yandex.metrica.impl.ob.Vf$d$a$a     // Catch:{ all -> 0x0062 }
            r5.<init>()     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = r3.mo64241c()     // Catch:{ all -> 0x0062 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0062 }
            if (r6 != 0) goto L_0x003d
            java.lang.String r6 = r3.mo64241c()     // Catch:{ all -> 0x0062 }
            r5.f26069b = r6     // Catch:{ all -> 0x0062 }
        L_0x003d:
            java.lang.String r6 = r3.mo64239b()     // Catch:{ all -> 0x0062 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0062 }
            if (r6 != 0) goto L_0x004d
            java.lang.String r6 = r3.mo64239b()     // Catch:{ all -> 0x0062 }
            r5.f26070c = r6     // Catch:{ all -> 0x0062 }
        L_0x004d:
            java.util.Map r6 = r3.mo64236a()     // Catch:{ all -> 0x0062 }
            boolean r6 = com.yandex.metrica.impl.p265ob.C10796U2.m27897b((java.util.Map) r6)     // Catch:{ all -> 0x0062 }
            if (r6 != 0) goto L_0x0063
            java.util.Map r3 = r3.mo64236a()     // Catch:{ all -> 0x0062 }
            java.lang.String r3 = com.yandex.metrica.impl.p265ob.C11993ym.m30997g(r3)     // Catch:{ all -> 0x0062 }
            r5.f26071d = r3     // Catch:{ all -> 0x0062 }
            goto L_0x0063
        L_0x0062:
            r5 = r4
        L_0x0063:
            if (r1 == 0) goto L_0x0067
            r0.f26052h = r1
        L_0x0067:
            if (r2 == 0) goto L_0x006b
            r0.f26051g = r2
        L_0x006b:
            com.yandex.metrica.impl.ob.ef r1 = r7.f26350a
            java.lang.String r2 = r8.f26257a
            java.lang.String r1 = r1.mo62300a(r2)
            if (r1 == 0) goto L_0x0077
            r0.f26049e = r1
        L_0x0077:
            com.yandex.metrica.impl.ob.mf r1 = r7.f26351b
            byte[] r9 = r1.mo61983a(r8, r9)
            r0.f26050f = r9
            java.lang.String r9 = r8.f26268l
            if (r9 == 0) goto L_0x0085
            r0.f26053i = r9
        L_0x0085:
            if (r5 == 0) goto L_0x0089
            r0.f26054j = r5
        L_0x0089:
            com.yandex.metrica.impl.ob.Ze r9 = r7.f26353d
            java.lang.Integer r9 = r9.mo62579a(r8)
            if (r9 == 0) goto L_0x0097
            int r9 = r9.intValue()
            r0.f26048d = r9
        L_0x0097:
            java.lang.Integer r9 = r8.f26259c
            if (r9 == 0) goto L_0x00a2
            int r9 = r9.intValue()
            long r1 = (long) r9
            r0.f26046b = r1
        L_0x00a2:
            java.lang.Integer r9 = r8.f26260d
            if (r9 == 0) goto L_0x00ad
            int r9 = r9.intValue()
            long r1 = (long) r9
            r0.f26060p = r1
        L_0x00ad:
            java.lang.Integer r9 = r8.f26261e
            if (r9 == 0) goto L_0x00b8
            int r9 = r9.intValue()
            long r1 = (long) r9
            r0.f26061q = r1
        L_0x00b8:
            java.lang.Long r9 = r8.f26262f
            if (r9 == 0) goto L_0x00c2
            long r1 = r9.longValue()
            r0.f26047c = r1
        L_0x00c2:
            java.lang.Integer r9 = r8.f26270n
            if (r9 == 0) goto L_0x00cc
            int r9 = r9.intValue()
            r0.f26055k = r9
        L_0x00cc:
            com.yandex.metrica.impl.ob.Ve r9 = r7.f26352c
            com.yandex.metrica.impl.ob.mn r1 = r8.f26274r
            int r9 = r9.mo62380a(r1)
            r0.f26056l = r9
            java.lang.String r9 = r8.f26263g
            if (r9 == 0) goto L_0x00f3
            com.yandex.metrica.impl.ob.ym$a r1 = new com.yandex.metrica.impl.ob.ym$a     // Catch:{ all -> 0x00f3 }
            r1.<init>(r9)     // Catch:{ all -> 0x00f3 }
            com.yandex.metrica.impl.ob.t7 r9 = new com.yandex.metrica.impl.ob.t7     // Catch:{ all -> 0x00f3 }
            r9.<init>()     // Catch:{ all -> 0x00f3 }
            java.lang.String r2 = "enabled"
            boolean r1 = r1.getBoolean(r2)     // Catch:{ all -> 0x00f3 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x00f3 }
            int r9 = r9.mo62559a((java.lang.Boolean) r1)     // Catch:{ all -> 0x00f3 }
            goto L_0x00f4
        L_0x00f3:
            r9 = -1
        L_0x00f4:
            r0.f26057m = r9
            java.lang.String r9 = r8.f26273q
            if (r9 == 0) goto L_0x0100
            byte[] r9 = r9.getBytes()
            r0.f26058n = r9
        L_0x0100:
            com.yandex.metrica.impl.ob.N0 r9 = r8.f26275s
            if (r9 == 0) goto L_0x010d
            java.util.Map<com.yandex.metrica.impl.ob.N0, java.lang.Integer> r1 = f26348g
            java.lang.Object r9 = r1.get(r9)
            r4 = r9
            java.lang.Integer r4 = (java.lang.Integer) r4
        L_0x010d:
            if (r4 == 0) goto L_0x0115
            int r9 = r4.intValue()
            r0.f26059o = r9
        L_0x0115:
            com.yandex.metrica.impl.ob.M$b$a r9 = r8.f26276t
            if (r9 == 0) goto L_0x011f
            int r9 = com.yandex.metrica.impl.p265ob.C11127d2.m28678a((com.yandex.metrica.impl.p265ob.C10474M.C10476b.C10477a) r9)
            r0.f26062r = r9
        L_0x011f:
            r9 = 3
            com.yandex.metrica.impl.ob.Wc$a r1 = r8.f26277u
            if (r1 == 0) goto L_0x0128
            int r9 = com.yandex.metrica.impl.p265ob.C11127d2.m28679a((com.yandex.metrica.impl.p265ob.C10883Wc.C10884a) r1)
        L_0x0128:
            java.lang.Integer r1 = r8.f26278v
            if (r1 == 0) goto L_0x0132
            int r1 = r1.intValue()
            r0.f26064t = r1
        L_0x0132:
            r0.f26063s = r9
            java.lang.Integer r9 = r8.f26279w
            if (r9 != 0) goto L_0x013a
            r9 = 0
            goto L_0x013e
        L_0x013a:
            int r9 = r9.intValue()
        L_0x013e:
            r0.f26065u = r9
            com.yandex.metrica.impl.ob.I0 r9 = r8.f26280x
            if (r9 == 0) goto L_0x0148
            int r9 = r9.f24858a
            r0.f26066v = r9
        L_0x0148:
            java.lang.Boolean r9 = r8.f26281y
            if (r9 == 0) goto L_0x0152
            boolean r9 = r9.booleanValue()
            r0.f26067w = r9
        L_0x0152:
            java.lang.Integer r8 = r8.f26282z
            if (r8 == 0) goto L_0x015d
            int r8 = r8.intValue()
            long r8 = (long) r8
            r0.f26068x = r8
        L_0x015d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10958Ye.mo62539a(com.yandex.metrica.impl.ob.Xe, com.yandex.metrica.impl.ob.jh):com.yandex.metrica.impl.ob.Vf$d$a");
    }

    private C10958Ye(C11208ef efVar, C11529mf mfVar, C10841Ve ve, C10991Ze ze, C11151df dfVar, C11242ff ffVar) {
        this.f26350a = efVar;
        this.f26351b = mfVar;
        this.f26352c = ve;
        this.f26353d = ze;
        this.f26354e = dfVar;
        this.f26355f = ffVar;
    }

    /* renamed from: a */
    public static C10960b m28295a() {
        return new C10960b();
    }
}
