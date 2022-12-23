package com.yandex.metrica.impl.p265ob;

import android.net.Uri;
import com.yandex.metrica.impl.p265ob.C10089A;
import com.yandex.metrica.impl.p265ob.C10766T1;
import com.yandex.metrica.impl.p265ob.C10842Vf;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.j2 */
class C11365j2 extends C10795U1<C11687qh> {

    /* renamed from: A */
    private final C10650Pn<byte[]> f27144A;

    /* renamed from: B */
    private final C10380Im f27145B;

    /* renamed from: C */
    private C11384jh f27146C;

    /* renamed from: D */
    private final C10363I8 f27147D;

    /* renamed from: E */
    private final C10868W0 f27148E;

    /* renamed from: F */
    private int f27149F;

    /* renamed from: r */
    private final C11229f4 f27150r;

    /* renamed from: s */
    private final Map<String, String> f27151s;

    /* renamed from: t */
    private C11319hh f27152t;

    /* renamed from: u */
    C10842Vf f27153u;

    /* renamed from: v */
    C11782t8 f27154v;

    /* renamed from: w */
    List<Long> f27155w;

    /* renamed from: x */
    int f27156x;

    /* renamed from: y */
    int f27157y;

    /* renamed from: z */
    private C11367b f27158z;

    /* renamed from: com.yandex.metrica.impl.ob.j2$a */
    static final class C11366a {

        /* renamed from: a */
        final C10842Vf.C10847d f27159a;

        /* renamed from: b */
        final C10089A.C10090a f27160b;

        /* renamed from: c */
        final boolean f27161c;

        C11366a(C10842Vf.C10847d dVar, C10089A.C10090a aVar, boolean z) {
            this.f27159a = dVar;
            this.f27160b = aVar;
            this.f27161c = z;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.j2$b */
    static final class C11367b {

        /* renamed from: a */
        final List<C10842Vf.C10847d> f27162a;

        /* renamed from: b */
        final List<Long> f27163b;

        /* renamed from: c */
        final JSONObject f27164c;

        C11367b(List<C10842Vf.C10847d> list, List<Long> list2, JSONObject jSONObject) {
            this.f27162a = list;
            this.f27163b = list2;
            this.f27164c = jSONObject;
        }
    }

    public C11365j2(C11229f4 f4Var) {
        this(f4Var, f4Var.mo62876i(), f4Var.mo62884q(), f4Var.mo62889w());
    }

    /* renamed from: A */
    public boolean mo61729A() {
        return super.mo61729A() & (!mo62263m());
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo61730C() {
        m29253a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo61731D() {
        m29253a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo61643a(Uri.Builder builder) {
        ((C11687qh) this.f25817j).mo63550a(builder, this.f27146C);
    }

    /* renamed from: b */
    public C10766T1.C10767a mo61644b() {
        return C10766T1.C10767a.REPORT;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo61645b(Throwable th) {
    }

    /* renamed from: j */
    public C10167Ci mo61646j() {
        return this.f27150r.mo62880m().mo62789r();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:(1:61)(2:62|(2:119|64)(1:65))|66|(3:68|69|70)|71|72|(1:118)) */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a4, code lost:
        r7 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b0, code lost:
        r18 = r7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x019e */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01fd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01c8 A[EDGE_INSN: B:118:0x01c8->B:89:0x01c8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01e4 A[LOOP:2: B:97:0x01de->B:99:0x01e4, LOOP_END] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo61647o() {
        /*
            r19 = this;
            r8 = r19
            java.lang.String r9 = "protobuf_serialization_error"
            com.yandex.metrica.impl.ob.f4 r0 = r8.f27150r
            com.yandex.metrica.impl.ob.t8 r0 = r0.mo62876i()
            java.util.List r0 = r0.mo63714b()
            boolean r1 = r0.isEmpty()
            r10 = 0
            if (r1 == 0) goto L_0x0016
            return r10
        L_0x0016:
            java.lang.Object r0 = r0.get(r10)
            android.content.ContentValues r0 = (android.content.ContentValues) r0
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.f27151s
            r1.clear()
            java.util.Set r1 = r0.valueSet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0029:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.Map<java.lang.String, java.lang.String> r3 = r8.f27151s
            java.lang.Object r4 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = r2.toString()
            r3.put(r4, r2)
            goto L_0x0029
        L_0x0047:
            java.lang.String r1 = "report_request_parameters"
            java.lang.String r0 = r0.getAsString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0076
            com.yandex.metrica.impl.ob.ym$a r1 = new com.yandex.metrica.impl.ob.ym$a     // Catch:{ all -> 0x0067 }
            r1.<init>(r0)     // Catch:{ all -> 0x0067 }
            com.yandex.metrica.impl.ob.hh r0 = new com.yandex.metrica.impl.ob.hh     // Catch:{ all -> 0x0067 }
            r0.<init>(r1)     // Catch:{ all -> 0x0067 }
            r8.f27152t = r0     // Catch:{ all -> 0x0067 }
            T r1 = r8.f25817j     // Catch:{ all -> 0x0067 }
            com.yandex.metrica.impl.ob.qh r1 = (com.yandex.metrica.impl.p265ob.C11687qh) r1     // Catch:{ all -> 0x0067 }
            r1.mo63551a((com.yandex.metrica.impl.p265ob.C11319hh) r0)     // Catch:{ all -> 0x0067 }
            goto L_0x0084
        L_0x0067:
            com.yandex.metrica.impl.ob.hh r0 = new com.yandex.metrica.impl.ob.hh
            r0.<init>()
            r8.f27152t = r0
            T r1 = r8.f25817j
            com.yandex.metrica.impl.ob.qh r1 = (com.yandex.metrica.impl.p265ob.C11687qh) r1
            r1.mo63551a((com.yandex.metrica.impl.p265ob.C11319hh) r0)
            goto L_0x0084
        L_0x0076:
            com.yandex.metrica.impl.ob.hh r0 = new com.yandex.metrica.impl.ob.hh
            r0.<init>()
            r8.f27152t = r0
            T r1 = r8.f25817j
            com.yandex.metrica.impl.ob.qh r1 = (com.yandex.metrica.impl.p265ob.C11687qh) r1
            r1.mo63551a((com.yandex.metrica.impl.p265ob.C11319hh) r0)
        L_0x0084:
            com.yandex.metrica.impl.ob.f4 r0 = r8.f27150r
            com.yandex.metrica.impl.ob.jh r0 = r0.mo62880m()
            r8.f27146C = r0
            java.util.List r11 = r0.mo63074E()
            boolean r0 = com.yandex.metrica.impl.p265ob.C10796U2.m27896b((java.util.Collection) r11)
            if (r0 == 0) goto L_0x0097
            return r10
        L_0x0097:
            com.yandex.metrica.impl.ob.jh r0 = r8.f27146C
            java.util.List r0 = r0.mo63083N()
            r8.mo62251a((java.util.List<java.lang.String>) r0)
            com.yandex.metrica.impl.ob.jh r0 = r8.f27146C
            boolean r0 = r0.mo63089T()
            if (r0 == 0) goto L_0x02a7
            java.util.List r0 = r19.mo62254c()
            boolean r0 = com.yandex.metrica.impl.p265ob.C10796U2.m27896b((java.util.Collection) r0)
            if (r0 == 0) goto L_0x00b4
            goto L_0x02a7
        L_0x00b4:
            r1 = 0
            r8.f27155w = r1
            com.yandex.metrica.impl.ob.jh r0 = r8.f27146C
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r15 = 1
            com.yandex.metrica.impl.ob.t8 r3 = r8.f27154v     // Catch:{ all -> 0x01ce }
            java.util.Map<java.lang.String, java.lang.String> r4 = r8.f27151s     // Catch:{ all -> 0x01ce }
            android.database.Cursor r7 = r3.mo63706a((java.util.Map<java.lang.String, java.lang.String>) r4)     // Catch:{ all -> 0x01ce }
            if (r7 == 0) goto L_0x01bd
            r6 = r1
            r16 = r2
        L_0x00db:
            boolean r1 = r7.moveToNext()     // Catch:{ all -> 0x01b5 }
            if (r1 == 0) goto L_0x01b0
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x01b5 }
            r1.<init>()     // Catch:{ all -> 0x01b5 }
            com.yandex.metrica.impl.p265ob.C11327i.m29170a((android.database.Cursor) r7, (android.content.ContentValues) r1)     // Catch:{ all -> 0x00e9 }
        L_0x00e9:
            java.lang.String r2 = "id"
            java.lang.Long r5 = r1.getAsLong(r2)     // Catch:{ all -> 0x01b5 }
            if (r5 != 0) goto L_0x0112
            com.yandex.metrica.impl.ob.W0 r2 = r8.f27148E     // Catch:{ all -> 0x010c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x010c }
            r3.<init>()     // Catch:{ all -> 0x010c }
            java.lang.String r4 = "no session_id in values: "
            r3.append(r4)     // Catch:{ all -> 0x010c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x010c }
            r3.append(r1)     // Catch:{ all -> 0x010c }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x010c }
            r2.mo61023d(r9, r1)     // Catch:{ all -> 0x010c }
            goto L_0x00db
        L_0x010c:
            r0 = move-exception
            r1 = r7
            r2 = r16
            goto L_0x01cf
        L_0x0112:
            java.lang.String r2 = "type"
            java.lang.Integer r2 = r1.getAsInteger(r2)     // Catch:{ all -> 0x01b5 }
            com.yandex.metrica.impl.ob.z6 r3 = com.yandex.metrica.impl.p265ob.C12017z6.FOREGROUND     // Catch:{ all -> 0x01b5 }
            if (r2 == 0) goto L_0x0127
            int r2 = r2.intValue()     // Catch:{ all -> 0x010c }
            if (r2 == 0) goto L_0x0127
            if (r2 == r15) goto L_0x0125
            goto L_0x0127
        L_0x0125:
            com.yandex.metrica.impl.ob.z6 r3 = com.yandex.metrica.impl.p265ob.C12017z6.BACKGROUND     // Catch:{ all -> 0x010c }
        L_0x0127:
            com.yandex.metrica.impl.ob.Vf$f r1 = com.yandex.metrica.impl.p265ob.C11127d2.m28681a((android.content.ContentValues) r1)     // Catch:{ all -> 0x01b5 }
            int r2 = com.yandex.metrica.impl.p265ob.C11127d2.m28680a((com.yandex.metrica.impl.p265ob.C12017z6) r3)     // Catch:{ all -> 0x01b5 }
            java.lang.String r3 = r0.mo62783l()     // Catch:{ all -> 0x01b5 }
            com.yandex.metrica.impl.ob.Vf$d$b r4 = new com.yandex.metrica.impl.ob.Vf$d$b     // Catch:{ all -> 0x01b5 }
            r4.<init>()     // Catch:{ all -> 0x01b5 }
            r4.f26076b = r1     // Catch:{ all -> 0x01b5 }
            r4.f26077c = r3     // Catch:{ all -> 0x01b5 }
            r4.f26078d = r2     // Catch:{ all -> 0x01b5 }
            int r1 = r8.f27156x     // Catch:{ all -> 0x01b5 }
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = com.yandex.metrica.impl.p265ob.C11056b.m28533b((int) r15, (long) r2)     // Catch:{ all -> 0x01b5 }
            int r1 = r1 + r2
            r8.f27156x = r1     // Catch:{ all -> 0x01b5 }
            r2 = 2
            int r2 = com.yandex.metrica.impl.p265ob.C11056b.m28523a((int) r2, (com.yandex.metrica.impl.p265ob.C11169e) r4)     // Catch:{ all -> 0x01b5 }
            int r1 = r1 + r2
            r8.f27156x = r1     // Catch:{ all -> 0x01b5 }
            r2 = 250880(0x3d400, float:3.51558E-40)
            if (r1 < r2) goto L_0x015a
            goto L_0x01b0
        L_0x015a:
            long r2 = r5.longValue()     // Catch:{ all -> 0x01b5 }
            int r17 = r12.size()     // Catch:{ all -> 0x01b5 }
            r1 = r19
            r15 = r5
            r5 = r0
            r10 = r6
            r6 = r14
            r18 = r7
            r7 = r17
            com.yandex.metrica.impl.ob.j2$a r1 = r1.mo63059a(r2, r4, r5, r6, r7)     // Catch:{ all -> 0x01ae }
            if (r1 == 0) goto L_0x01a7
            if (r10 != 0) goto L_0x0177
            com.yandex.metrica.impl.ob.A$a r6 = r1.f27160b     // Catch:{ all -> 0x01ae }
            goto L_0x0181
        L_0x0177:
            com.yandex.metrica.impl.ob.A$a r2 = r1.f27160b     // Catch:{ all -> 0x01ae }
            boolean r2 = r10.equals(r2)     // Catch:{ all -> 0x01ae }
            if (r2 != 0) goto L_0x0180
            goto L_0x01b2
        L_0x0180:
            r6 = r10
        L_0x0181:
            r13.add(r15)     // Catch:{ all -> 0x01ae }
            com.yandex.metrica.impl.ob.Vf$d r2 = r1.f27159a     // Catch:{ all -> 0x01ae }
            r12.add(r2)     // Catch:{ all -> 0x01ae }
            com.yandex.metrica.impl.ob.A$a r2 = r1.f27160b     // Catch:{ all -> 0x01ae }
            java.lang.String r2 = r2.f24296a     // Catch:{ all -> 0x01ae }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x01ae }
            if (r2 != 0) goto L_0x019e
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x019e }
            com.yandex.metrica.impl.ob.A$a r3 = r1.f27160b     // Catch:{ all -> 0x019e }
            java.lang.String r3 = r3.f24296a     // Catch:{ all -> 0x019e }
            r2.<init>(r3)     // Catch:{ all -> 0x019e }
            r16 = r2
        L_0x019e:
            boolean r1 = r1.f27161c     // Catch:{ all -> 0x01a3 }
            if (r1 == 0) goto L_0x01a8
            goto L_0x01c8
        L_0x01a3:
            r0 = move-exception
            r7 = r18
            goto L_0x01d2
        L_0x01a7:
            r6 = r10
        L_0x01a8:
            r7 = r18
            r10 = 0
            r15 = 1
            goto L_0x00db
        L_0x01ae:
            r0 = move-exception
            goto L_0x01b8
        L_0x01b0:
            r18 = r7
        L_0x01b2:
            r2 = r16
            goto L_0x01c6
        L_0x01b5:
            r0 = move-exception
            r18 = r7
        L_0x01b8:
            r2 = r16
        L_0x01ba:
            r1 = r18
            goto L_0x01cf
        L_0x01bd:
            r18 = r7
            com.yandex.metrica.impl.ob.W0 r0 = r8.f27148E     // Catch:{ all -> 0x01cc }
            java.lang.String r1 = "no sessions cursor"
            r0.mo61023d(r9, r1)     // Catch:{ all -> 0x01cc }
        L_0x01c6:
            r16 = r2
        L_0x01c8:
            com.yandex.metrica.impl.p265ob.C10796U2.m27886a((android.database.Cursor) r18)
            goto L_0x01d8
        L_0x01cc:
            r0 = move-exception
            goto L_0x01ba
        L_0x01ce:
            r0 = move-exception
        L_0x01cf:
            r7 = r1
            r16 = r2
        L_0x01d2:
            r14.add(r0)     // Catch:{ all -> 0x02a1 }
            com.yandex.metrica.impl.p265ob.C10796U2.m27886a((android.database.Cursor) r7)
        L_0x01d8:
            r0 = r16
            java.util.Iterator r1 = r14.iterator()
        L_0x01de:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01f0
            java.lang.Object r2 = r1.next()
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            com.yandex.metrica.impl.ob.W0 r3 = r8.f27148E
            r3.reportError((java.lang.String) r9, (java.lang.Throwable) r2)
            goto L_0x01de
        L_0x01f0:
            com.yandex.metrica.impl.ob.j2$b r1 = new com.yandex.metrica.impl.ob.j2$b
            r1.<init>(r12, r13, r0)
            r8.f27158z = r1
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x01ff
            r1 = 0
            return r1
        L_0x01ff:
            com.yandex.metrica.impl.ob.I8 r0 = r8.f27147D
            int r0 = r0.mo61494i()
            r1 = 1
            int r0 = r0 + r1
            r8.f27149F = r0
            T r1 = r8.f25817j
            com.yandex.metrica.impl.ob.qh r1 = (com.yandex.metrica.impl.p265ob.C11687qh) r1
            long r2 = (long) r0
            r1.mo63549a((long) r2)
            com.yandex.metrica.impl.ob.j2$b r0 = r8.f27158z
            com.yandex.metrica.impl.ob.Vf r1 = new com.yandex.metrica.impl.ob.Vf
            r1.<init>()
            com.yandex.metrica.impl.ob.Vf$c r2 = new com.yandex.metrica.impl.ob.Vf$c
            r2.<init>()
            com.yandex.metrica.impl.ob.hh r3 = r8.f27152t
            java.lang.String r3 = r3.f27060b
            com.yandex.metrica.impl.ob.jh r4 = r8.f27146C
            java.lang.String r4 = r4.mo62795x()
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 == 0) goto L_0x022e
            r3 = r4
        L_0x022e:
            r2.f26025b = r3
            com.yandex.metrica.impl.ob.hh r3 = r8.f27152t
            java.lang.String r3 = r3.f27059a
            com.yandex.metrica.impl.ob.jh r4 = r8.f27146C
            java.lang.String r4 = r4.mo62778g()
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 == 0) goto L_0x0241
            r3 = r4
        L_0x0241:
            r2.f26026c = r3
            int r3 = r8.f27156x
            r4 = 4
            int r4 = com.yandex.metrica.impl.p265ob.C11056b.m28523a((int) r4, (com.yandex.metrica.impl.p265ob.C11169e) r2)
            int r3 = r3 + r4
            r8.f27156x = r3
            r1.f26009c = r2
            com.yandex.metrica.impl.ob.P0 r2 = com.yandex.metrica.impl.p265ob.C10619P0.m27164i()
            com.yandex.metrica.impl.ob.yk r2 = r2.mo61895w()
            com.yandex.metrica.impl.ob.i2 r3 = new com.yandex.metrica.impl.ob.i2
            r3.<init>(r8, r1)
            r2.mo62202a((com.yandex.metrica.impl.p265ob.C10143Bk) r3)
            java.util.List<com.yandex.metrica.impl.ob.Vf$d> r2 = r0.f27162a
            int r3 = r2.size()
            com.yandex.metrica.impl.ob.Vf$d[] r3 = new com.yandex.metrica.impl.p265ob.C10842Vf.C10847d[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            com.yandex.metrica.impl.ob.Vf$d[] r2 = (com.yandex.metrica.impl.p265ob.C10842Vf.C10847d[]) r2
            r1.f26008b = r2
            org.json.JSONObject r0 = r0.f27164c
            com.yandex.metrica.impl.ob.Vf$a[] r0 = r8.m29254a((org.json.JSONObject) r0)
            r1.f26010d = r0
            int r0 = r11.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r11.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r1.f26012f = r0
            int r0 = r8.f27156x
            r2 = 8
            int r2 = com.yandex.metrica.impl.p265ob.C11056b.m28534c(r2)
            int r0 = r0 + r2
            r8.f27156x = r0
            r8.f27153u = r1
            com.yandex.metrica.impl.ob.j2$b r0 = r8.f27158z
            java.util.List<java.lang.Long> r0 = r0.f27163b
            r8.f27155w = r0
            byte[] r0 = com.yandex.metrica.impl.p265ob.C11169e.m28804a((com.yandex.metrica.impl.p265ob.C11169e) r1)
            r8.mo62328c(r0)
            r1 = 1
            return r1
        L_0x02a1:
            r0 = move-exception
            r1 = r0
            com.yandex.metrica.impl.p265ob.C10796U2.m27886a((android.database.Cursor) r7)
            throw r1
        L_0x02a7:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11365j2.mo61647o():boolean");
    }

    /* renamed from: r */
    public boolean mo61648r() {
        boolean r = super.mo61648r();
        if (r && this.f27145B.mo64227c()) {
            for (int i = 0; i < this.f27158z.f27162a.size(); i++) {
                this.f27145B.mo61568a(this.f27158z.f27162a.get(i), "Event sent");
            }
        }
        return r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo61650t() {
        this.f27150r.mo62879l().mo62377c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public boolean mo62268v() {
        this.f27150r.mo62879l().mo62375a();
        return true;
    }

    /* renamed from: w */
    public void mo62269w() {
        this.f27150r.mo62876i().mo63707a();
        this.f27150r.mo62879l().mo62376b();
        super.mo62269w();
    }

    /* renamed from: x */
    public void mo62270x() {
        this.f27150r.mo62879l().mo62376b();
        super.mo62270x();
    }

    /* renamed from: a */
    private C10842Vf.C10843a[] m29254a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        C10842Vf.C10843a[] aVarArr = new C10842Vf.C10843a[length];
        Iterator<String> keys = jSONObject.keys();
        int i = 0;
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                C10842Vf.C10843a aVar = new C10842Vf.C10843a();
                aVar.f26014b = next;
                aVar.f26015c = jSONObject.getString(next);
                aVarArr[i] = aVar;
            } catch (Throwable unused) {
            }
            i++;
        }
        return aVarArr;
    }

    private C11365j2(C11229f4 f4Var, C11782t8 t8Var, C10380Im im, C10363I8 i8) {
        this(f4Var, im, t8Var, new C11687qh(), i8, new C10198Dn(1024000, "event value in ReportTask", im), C10611Oh.m27142a());
    }

    /* renamed from: a */
    private void m29253a(boolean z) {
        this.f27147D.mo61487c(this.f27149F);
        C10842Vf.C10847d[] dVarArr = this.f27153u.f26008b;
        for (int i = 0; i < dVarArr.length; i++) {
            try {
                C10842Vf.C10847d dVar = dVarArr[i];
                this.f27154v.mo63708a(this.f27155w.get(i).longValue(), C11127d2.m28684a(dVar.f26043c.f26078d).mo64185a(), dVar.f26044d.length, z);
                int i2 = C11127d2.f26677e;
            } catch (Throwable unused) {
            }
        }
        this.f27154v.mo63703a(this.f27150r.mo62887u().mo63818a());
    }

    C11365j2(C11229f4 f4Var, C10380Im im, C11782t8 t8Var, C11687qh qhVar, C10363I8 i8, C10198Dn dn, C10868W0 w0) {
        super(qhVar);
        this.f27151s = new LinkedHashMap();
        this.f27156x = 0;
        this.f27157y = -1;
        this.f27150r = f4Var;
        this.f27154v = t8Var;
        this.f27145B = im;
        this.f27144A = dn;
        this.f27147D = i8;
        this.f27148E = w0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0035 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052 A[Catch:{ all -> 0x0130 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x00f1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x00f2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x00f2 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.impl.p265ob.C11365j2.C11366a mo63059a(long r17, com.yandex.metrica.impl.p265ob.C10842Vf.C10847d.C10851b r19, com.yandex.metrica.impl.p265ob.C11384jh r20, java.util.List<java.lang.Throwable> r21, int r22) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r0 = r19
            r4 = r21
            com.yandex.metrica.impl.ob.Vf$d r5 = new com.yandex.metrica.impl.ob.Vf$d
            r5.<init>()
            r5.f26042b = r2
            r5.f26043c = r0
            int r0 = r0.f26078d
            com.yandex.metrica.impl.ob.z6 r0 = com.yandex.metrica.impl.p265ob.C11127d2.m28684a((int) r0)
            com.yandex.metrica.impl.ob.t8 r7 = r1.f27154v     // Catch:{ all -> 0x0132 }
            android.database.Cursor r2 = r7.mo63713b(r2, r0)     // Catch:{ all -> 0x0132 }
            if (r2 == 0) goto L_0x0113
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0130 }
            r3.<init>()     // Catch:{ all -> 0x0130 }
            r7 = 0
        L_0x0025:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0130 }
            r8 = 1
            r9 = 0
            if (r0 == 0) goto L_0x00f7
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x0130 }
            r10.<init>()     // Catch:{ all -> 0x0130 }
            com.yandex.metrica.impl.p265ob.C11327i.m29170a((android.database.Cursor) r2, (android.content.ContentValues) r10)     // Catch:{ all -> 0x0035 }
        L_0x0035:
            com.yandex.metrica.impl.ob.Xe r0 = new com.yandex.metrica.impl.ob.Xe     // Catch:{ all -> 0x0049 }
            r0.<init>(r10)     // Catch:{ all -> 0x0049 }
            com.yandex.metrica.impl.ob.k1 r11 = r0.f26266j     // Catch:{ all -> 0x0049 }
            com.yandex.metrica.impl.ob.Ye r11 = com.yandex.metrica.impl.p265ob.C11127d2.m28683a((com.yandex.metrica.impl.p265ob.C11413k1) r11)     // Catch:{ all -> 0x0049 }
            r12 = r20
            com.yandex.metrica.impl.ob.Vf$d$a r0 = r11.mo62539a(r0, r12)     // Catch:{ all -> 0x0047 }
            goto L_0x0050
        L_0x0047:
            r0 = move-exception
            goto L_0x004c
        L_0x0049:
            r0 = move-exception
            r12 = r20
        L_0x004c:
            r4.add(r0)     // Catch:{ all -> 0x0130 }
            r0 = 0
        L_0x0050:
            if (r0 == 0) goto L_0x00f2
            com.yandex.metrica.impl.ob.A$a r11 = new com.yandex.metrica.impl.ob.A$a     // Catch:{ all -> 0x0130 }
            java.lang.String r13 = "app_environment"
            java.lang.String r13 = r10.getAsString(r13)     // Catch:{ all -> 0x0130 }
            if (r13 != 0) goto L_0x005e
            java.lang.String r13 = ""
        L_0x005e:
            java.lang.String r14 = "app_environment_revision"
            java.lang.Long r10 = r10.getAsLong(r14)     // Catch:{ all -> 0x0130 }
            r14 = 0
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0130 }
            if (r10 != 0) goto L_0x006d
            r10 = r14
        L_0x006d:
            long r14 = r10.longValue()     // Catch:{ all -> 0x0130 }
            r11.<init>(r13, r14)     // Catch:{ all -> 0x0130 }
            if (r7 != 0) goto L_0x00a1
            int r7 = r1.f27157y     // Catch:{ all -> 0x0130 }
            if (r7 >= 0) goto L_0x009f
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ all -> 0x0097 }
            java.lang.String r10 = r11.f24296a     // Catch:{ all -> 0x0097 }
            r7.<init>(r10)     // Catch:{ all -> 0x0097 }
            com.yandex.metrica.impl.ob.Vf$a[] r7 = r1.m29254a((org.json.JSONObject) r7)     // Catch:{ all -> 0x0097 }
            if (r7 == 0) goto L_0x0097
            int r10 = r7.length     // Catch:{ all -> 0x0097 }
            r13 = 0
            r14 = 0
        L_0x008a:
            if (r13 >= r10) goto L_0x0098
            r15 = r7[r13]     // Catch:{ all -> 0x0097 }
            r6 = 7
            int r6 = com.yandex.metrica.impl.p265ob.C11056b.m28523a((int) r6, (com.yandex.metrica.impl.p265ob.C11169e) r15)     // Catch:{ all -> 0x0097 }
            int r14 = r14 + r6
            int r13 = r13 + 1
            goto L_0x008a
        L_0x0097:
            r14 = 0
        L_0x0098:
            r1.f27157y = r14     // Catch:{ all -> 0x0130 }
            int r6 = r1.f27156x     // Catch:{ all -> 0x0130 }
            int r6 = r6 + r14
            r1.f27156x = r6     // Catch:{ all -> 0x0130 }
        L_0x009f:
            r7 = r11
            goto L_0x00a8
        L_0x00a1:
            boolean r6 = r7.equals(r11)     // Catch:{ all -> 0x0130 }
            if (r6 != 0) goto L_0x00a8
            goto L_0x00f8
        L_0x00a8:
            com.yandex.metrica.impl.ob.Pn<byte[]> r6 = r1.f27144A     // Catch:{ all -> 0x0130 }
            byte[] r10 = r0.f26050f     // Catch:{ all -> 0x0130 }
            java.lang.Object r6 = r6.mo61205a(r10)     // Catch:{ all -> 0x0130 }
            byte[] r6 = (byte[]) r6     // Catch:{ all -> 0x0130 }
            byte[] r10 = r0.f26050f     // Catch:{ all -> 0x0130 }
            if (r10 == r6) goto L_0x00c8
            int r11 = r0.f26055k     // Catch:{ all -> 0x0130 }
            if (r10 != 0) goto L_0x00bc
            r10 = 0
            goto L_0x00bd
        L_0x00bc:
            int r10 = r10.length     // Catch:{ all -> 0x0130 }
        L_0x00bd:
            if (r6 != 0) goto L_0x00c1
            r13 = 0
            goto L_0x00c2
        L_0x00c1:
            int r13 = r6.length     // Catch:{ all -> 0x0130 }
        L_0x00c2:
            int r10 = r10 - r13
            int r11 = r11 + r10
            r0.f26055k = r11     // Catch:{ all -> 0x0130 }
            r0.f26050f = r6     // Catch:{ all -> 0x0130 }
        L_0x00c8:
            int r6 = r1.f27156x     // Catch:{ all -> 0x0130 }
            r10 = 3
            int r10 = com.yandex.metrica.impl.p265ob.C11056b.m28523a((int) r10, (com.yandex.metrica.impl.p265ob.C11169e) r0)     // Catch:{ all -> 0x0130 }
            int r6 = r6 + r10
            r1.f27156x = r6     // Catch:{ all -> 0x0130 }
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x0130 }
            if (r6 == 0) goto L_0x00dc
            if (r22 != 0) goto L_0x00dc
            r6 = 1
            goto L_0x00dd
        L_0x00dc:
            r6 = 0
        L_0x00dd:
            if (r6 == 0) goto L_0x00e6
            int r6 = r1.f27156x     // Catch:{ all -> 0x0130 }
            r10 = 1048576(0x100000, float:1.469368E-39)
            if (r6 < r10) goto L_0x00ee
            goto L_0x00ef
        L_0x00e6:
            int r6 = r1.f27156x     // Catch:{ all -> 0x0130 }
            r10 = 250880(0x3d400, float:3.51558E-40)
            if (r6 < r10) goto L_0x00ee
            goto L_0x00ef
        L_0x00ee:
            r8 = 0
        L_0x00ef:
            if (r8 == 0) goto L_0x00f2
            goto L_0x00f7
        L_0x00f2:
            r3.add(r0)     // Catch:{ all -> 0x0130 }
            goto L_0x0025
        L_0x00f7:
            r8 = 0
        L_0x00f8:
            int r0 = r3.size()     // Catch:{ all -> 0x0130 }
            if (r0 <= 0) goto L_0x012b
            int r0 = r3.size()     // Catch:{ all -> 0x0130 }
            com.yandex.metrica.impl.ob.Vf$d$a[] r0 = new com.yandex.metrica.impl.p265ob.C10842Vf.C10847d.C10848a[r0]     // Catch:{ all -> 0x0130 }
            java.lang.Object[] r0 = r3.toArray(r0)     // Catch:{ all -> 0x0130 }
            com.yandex.metrica.impl.ob.Vf$d$a[] r0 = (com.yandex.metrica.impl.p265ob.C10842Vf.C10847d.C10848a[]) r0     // Catch:{ all -> 0x0130 }
            r5.f26044d = r0     // Catch:{ all -> 0x0130 }
            com.yandex.metrica.impl.ob.j2$a r0 = new com.yandex.metrica.impl.ob.j2$a     // Catch:{ all -> 0x0130 }
            r0.<init>(r5, r7, r8)     // Catch:{ all -> 0x0130 }
            r6 = r0
            goto L_0x012c
        L_0x0113:
            com.yandex.metrica.impl.ob.W0 r0 = r1.f27148E     // Catch:{ all -> 0x0130 }
            java.lang.String r3 = "protobuf_serialization_error"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0130 }
            r6.<init>()     // Catch:{ all -> 0x0130 }
            java.lang.String r7 = "no reports cursor for session: "
            r6.append(r7)     // Catch:{ all -> 0x0130 }
            r6.append(r5)     // Catch:{ all -> 0x0130 }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x0130 }
            r0.mo61023d(r3, r5)     // Catch:{ all -> 0x0130 }
        L_0x012b:
            r6 = 0
        L_0x012c:
            com.yandex.metrica.impl.p265ob.C10796U2.m27886a((android.database.Cursor) r2)
            goto L_0x013b
        L_0x0130:
            r0 = move-exception
            goto L_0x0134
        L_0x0132:
            r0 = move-exception
            r2 = 0
        L_0x0134:
            r4.add(r0)     // Catch:{ all -> 0x013c }
            com.yandex.metrica.impl.p265ob.C10796U2.m27886a((android.database.Cursor) r2)
            r6 = 0
        L_0x013b:
            return r6
        L_0x013c:
            r0 = move-exception
            r3 = r0
            com.yandex.metrica.impl.p265ob.C10796U2.m27886a((android.database.Cursor) r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11365j2.mo63059a(long, com.yandex.metrica.impl.ob.Vf$d$b, com.yandex.metrica.impl.ob.jh, java.util.List, int):com.yandex.metrica.impl.ob.j2$a");
    }

    /* renamed from: a */
    public String mo61642a() {
        return C11365j2.class.getName() + "_" + this.f27150r.mo62872e().mo62715a();
    }
}
