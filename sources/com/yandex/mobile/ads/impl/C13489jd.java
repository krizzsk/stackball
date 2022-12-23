package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.yandex.mobile.ads.impl.C12966ed;
import com.yandex.mobile.ads.impl.C14593sh;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.jd */
public final class C13489jd implements C13325hj {

    /* renamed from: a */
    private final C12966ed f35224a;

    /* renamed from: b */
    private final C13325hj f35225b;

    /* renamed from: c */
    private final C13325hj f35226c;

    /* renamed from: d */
    private final C13325hj f35227d;

    /* renamed from: e */
    private final C14586sd f35228e;

    /* renamed from: f */
    private final C13490a f35229f;

    /* renamed from: g */
    private final boolean f35230g;

    /* renamed from: h */
    private final boolean f35231h;

    /* renamed from: i */
    private final boolean f35232i;

    /* renamed from: j */
    private C13325hj f35233j;

    /* renamed from: k */
    private boolean f35234k;

    /* renamed from: l */
    private Uri f35235l;

    /* renamed from: m */
    private Uri f35236m;

    /* renamed from: n */
    private int f35237n;

    /* renamed from: o */
    private byte[] f35238o;

    /* renamed from: p */
    private Map<String, String> f35239p;

    /* renamed from: q */
    private int f35240q;

    /* renamed from: r */
    private String f35241r;

    /* renamed from: s */
    private long f35242s;

    /* renamed from: t */
    private long f35243t;

    /* renamed from: u */
    private C14752ud f35244u;

    /* renamed from: v */
    private boolean f35245v;

    /* renamed from: w */
    private boolean f35246w;

    /* renamed from: x */
    private long f35247x;

    /* renamed from: y */
    private long f35248y;

    /* renamed from: com.yandex.mobile.ads.impl.jd$a */
    public interface C13490a {
        /* renamed from: a */
        void mo67973a(int i);

        /* renamed from: a */
        void mo67974a(long j, long j2);
    }

    public C13489jd(C12966ed edVar, C13325hj hjVar, int i) {
        this(edVar, hjVar, new x60(), new C13312hd(edVar, CacheDataSink.DEFAULT_FRAGMENT_SIZE), i, (C13490a) null);
    }

    /* renamed from: c */
    private void m37754c() throws IOException {
        C13325hj hjVar = this.f35233j;
        if (hjVar != null) {
            try {
                hjVar.close();
            } finally {
                this.f35233j = null;
                this.f35234k = false;
                C14752ud udVar = this.f35244u;
                if (udVar != null) {
                    this.f35224a.mo66813b(udVar);
                    this.f35244u = null;
                }
            }
        }
    }

    /* renamed from: d */
    private boolean m37755d() {
        return this.f35233j == this.f35225b;
    }

    /* renamed from: e */
    private void m37756e() throws IOException {
        this.f35243t = 0;
        if (this.f35233j == this.f35226c) {
            C14680th thVar = new C14680th();
            C14680th.m42345a(thVar, this.f35242s);
            this.f35224a.mo66810a(this.f35241r, thVar);
        }
    }

    /* renamed from: a */
    public void mo65277a(af1 af1) {
        this.f35225b.mo65277a(af1);
        this.f35227d.mo65277a(af1);
    }

    /* renamed from: b */
    public Map<String, List<String>> mo65278b() {
        if (!m37755d()) {
            return this.f35227d.mo65278b();
        }
        return Collections.emptyMap();
    }

    public void close() throws IOException {
        this.f35235l = null;
        this.f35236m = null;
        this.f35237n = 1;
        this.f35238o = null;
        this.f35239p = Collections.emptyMap();
        this.f35240q = 0;
        this.f35242s = 0;
        this.f35241r = null;
        C13490a aVar = this.f35229f;
        if (aVar != null && this.f35247x > 0) {
            aVar.mo67974a(this.f35224a.mo66804a(), this.f35247x);
            this.f35247x = 0;
        }
        try {
            m37754c();
        } catch (Throwable th) {
            if (m37755d() || (th instanceof C12966ed.C12967a)) {
                this.f35245v = true;
            }
            throw th;
        }
    }

    public C13489jd(C12966ed edVar, C13325hj hjVar, C13325hj hjVar2, C13207gj gjVar, int i, C13490a aVar) {
        this(edVar, hjVar, hjVar2, gjVar, i, (C13490a) null, (C14586sd) null);
    }

    public C13489jd(C12966ed edVar, C13325hj hjVar, C13325hj hjVar2, C13207gj gjVar, int i, C13490a aVar, C14586sd sdVar) {
        this.f35239p = Collections.emptyMap();
        this.f35224a = edVar;
        this.f35225b = hjVar2;
        this.f35228e = C15041wd.f41954a;
        boolean z = false;
        this.f35230g = (i & 1) != 0;
        this.f35231h = (i & 2) != 0;
        this.f35232i = (i & 4) != 0 ? true : z;
        this.f35227d = hjVar;
        if (gjVar != null) {
            this.f35226c = new dd1(hjVar, gjVar);
        } else {
            this.f35226c = null;
        }
        this.f35229f = aVar;
    }

    /* renamed from: a */
    public long mo65275a(C13504jj jjVar) throws IOException {
        int i;
        C13490a aVar;
        try {
            String a = this.f35228e.mo65605a(jjVar);
            this.f35241r = a;
            Uri uri = jjVar.f35322a;
            this.f35235l = uri;
            Uri uri2 = null;
            String a2 = ((C12742ck) this.f35224a.mo66805a(a)).mo66313a(ContentMetadata.KEY_REDIRECTED_URI, (String) null);
            if (a2 != null) {
                uri2 = Uri.parse(a2);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.f35236m = uri;
            this.f35237n = jjVar.f35323b;
            this.f35238o = jjVar.f35324c;
            this.f35239p = jjVar.f35325d;
            this.f35240q = jjVar.f35330i;
            this.f35242s = jjVar.f35327f;
            if (!this.f35231h || !this.f35245v) {
                i = (!this.f35232i || jjVar.f35328g != -1) ? -1 : 1;
            } else {
                i = 0;
            }
            boolean z = i != -1;
            this.f35246w = z;
            if (z && (aVar = this.f35229f) != null) {
                aVar.mo67973a(i);
            }
            long j = jjVar.f35328g;
            if (j == -1) {
                if (!this.f35246w) {
                    long a3 = C14593sh.CC.m41975a(this.f35224a.mo66805a(this.f35241r));
                    this.f35243t = a3;
                    if (a3 != -1) {
                        long j2 = a3 - jjVar.f35327f;
                        this.f35243t = j2;
                        if (j2 <= 0) {
                            throw new C13415ij(0);
                        }
                    }
                    m37753a(false);
                    return this.f35243t;
                }
            }
            this.f35243t = j;
            m37753a(false);
            return this.f35243t;
        } catch (Throwable th) {
            if (m37755d() || (th instanceof C12966ed.C12967a)) {
                this.f35245v = true;
            }
            throw th;
        }
    }

    /* renamed from: a */
    public int mo65274a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f35243t == 0) {
            return -1;
        }
        try {
            if (this.f35242s >= this.f35248y) {
                m37753a(true);
            }
            int a = this.f35233j.mo65274a(bArr, i, i2);
            if (a != -1) {
                if (m37755d()) {
                    this.f35247x += (long) a;
                }
                long j = (long) a;
                this.f35242s += j;
                long j2 = this.f35243t;
                if (j2 != -1) {
                    this.f35243t = j2 - j;
                }
            } else if (this.f35234k) {
                m37756e();
            } else {
                long j3 = this.f35243t;
                if (j3 <= 0) {
                    if (j3 == -1) {
                    }
                }
                m37754c();
                m37753a(false);
                return mo65274a(bArr, i, i2);
            }
            return a;
        } catch (IOException e) {
            if (!this.f35234k || !C15041wd.m43580a(e)) {
                if (m37755d() || (e instanceof C12966ed.C12967a)) {
                    this.f35245v = true;
                }
                throw e;
            }
            m37756e();
            return -1;
        } catch (Throwable th) {
            if (m37755d() || (th instanceof C12966ed.C12967a)) {
                this.f35245v = true;
            }
            throw th;
        }
    }

    /* renamed from: a */
    public Uri mo65276a() {
        return this.f35236m;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m37753a(boolean r23) throws java.io.IOException {
        /*
            r22 = this;
            r1 = r22
            boolean r0 = r1.f35246w
            if (r0 == 0) goto L_0x0008
            r0 = 0
            goto L_0x002e
        L_0x0008:
            boolean r0 = r1.f35230g
            if (r0 == 0) goto L_0x0024
            com.yandex.mobile.ads.impl.ed r0 = r1.f35224a     // Catch:{ InterruptedException -> 0x0017 }
            java.lang.String r3 = r1.f35241r     // Catch:{ InterruptedException -> 0x0017 }
            long r4 = r1.f35242s     // Catch:{ InterruptedException -> 0x0017 }
            com.yandex.mobile.ads.impl.ud r0 = r0.mo66806a((java.lang.String) r3, (long) r4)     // Catch:{ InterruptedException -> 0x0017 }
            goto L_0x002e
        L_0x0017:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
        L_0x0024:
            com.yandex.mobile.ads.impl.ed r0 = r1.f35224a
            java.lang.String r3 = r1.f35241r
            long r4 = r1.f35242s
            com.yandex.mobile.ads.impl.ud r0 = r0.mo66812b(r3, r4)
        L_0x002e:
            r4 = -1
            r6 = 1
            if (r0 != 0) goto L_0x005a
            com.yandex.mobile.ads.impl.hj r7 = r1.f35227d
            com.yandex.mobile.ads.impl.jj r21 = new com.yandex.mobile.ads.impl.jj
            android.net.Uri r9 = r1.f35235l
            int r10 = r1.f35237n
            byte[] r11 = r1.f35238o
            long r14 = r1.f35242s
            long r12 = r1.f35243t
            java.lang.String r8 = r1.f35241r
            int r2 = r1.f35240q
            java.util.Map<java.lang.String, java.lang.String> r3 = r1.f35239p
            r18 = r8
            r8 = r21
            r16 = r12
            r12 = r14
            r19 = r2
            r20 = r3
            r8.<init>(r9, r10, r11, r12, r14, r16, r18, r19, r20)
        L_0x0055:
            r2 = r0
            r0 = r21
            goto L_0x00d1
        L_0x005a:
            boolean r2 = r0.f40632e
            if (r2 == 0) goto L_0x008d
            java.io.File r2 = r0.f40633f
            android.net.Uri r8 = android.net.Uri.fromFile(r2)
            long r2 = r1.f35242s
            long r9 = r0.f40630c
            long r12 = r2 - r9
            long r2 = r0.f40631d
            long r2 = r2 - r12
            long r9 = r1.f35243t
            int r7 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0077
            long r2 = java.lang.Math.min(r2, r9)
        L_0x0077:
            r14 = r2
            com.yandex.mobile.ads.impl.jj r21 = new com.yandex.mobile.ads.impl.jj
            long r10 = r1.f35242s
            java.lang.String r2 = r1.f35241r
            int r3 = r1.f35240q
            r9 = 0
            r7 = r21
            r16 = r2
            r17 = r3
            r7.<init>(r8, r9, r10, r12, r14, r16, r17)
            com.yandex.mobile.ads.impl.hj r7 = r1.f35225b
            goto L_0x0055
        L_0x008d:
            long r2 = r0.f40631d
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x0095
            r7 = 1
            goto L_0x0096
        L_0x0095:
            r7 = 0
        L_0x0096:
            if (r7 == 0) goto L_0x009b
            long r2 = r1.f35243t
            goto L_0x00a5
        L_0x009b:
            long r7 = r1.f35243t
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x00a5
            long r2 = java.lang.Math.min(r2, r7)
        L_0x00a5:
            r15 = r2
            com.yandex.mobile.ads.impl.jj r21 = new com.yandex.mobile.ads.impl.jj
            android.net.Uri r8 = r1.f35235l
            int r9 = r1.f35237n
            byte[] r10 = r1.f35238o
            long r13 = r1.f35242s
            java.lang.String r2 = r1.f35241r
            int r3 = r1.f35240q
            java.util.Map<java.lang.String, java.lang.String> r11 = r1.f35239p
            r7 = r21
            r19 = r11
            r11 = r13
            r17 = r2
            r18 = r3
            r7.<init>(r8, r9, r10, r11, r13, r15, r17, r18, r19)
            com.yandex.mobile.ads.impl.hj r7 = r1.f35226c
            if (r7 == 0) goto L_0x00c7
            goto L_0x0055
        L_0x00c7:
            com.yandex.mobile.ads.impl.hj r7 = r1.f35227d
            com.yandex.mobile.ads.impl.ed r2 = r1.f35224a
            r2.mo66813b(r0)
            r0 = r21
            r2 = 0
        L_0x00d1:
            boolean r3 = r1.f35246w
            if (r3 != 0) goto L_0x00e0
            com.yandex.mobile.ads.impl.hj r3 = r1.f35227d
            if (r7 != r3) goto L_0x00e0
            long r8 = r1.f35242s
            r10 = 102400(0x19000, double:5.05923E-319)
            long r8 = r8 + r10
            goto L_0x00e5
        L_0x00e0:
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00e5:
            r1.f35248y = r8
            if (r23 == 0) goto L_0x010c
            com.yandex.mobile.ads.impl.hj r3 = r1.f35233j
            com.yandex.mobile.ads.impl.hj r8 = r1.f35227d
            if (r3 != r8) goto L_0x00f1
            r3 = 1
            goto L_0x00f2
        L_0x00f1:
            r3 = 0
        L_0x00f2:
            com.yandex.mobile.ads.impl.C13479j9.m37708b((boolean) r3)
            com.yandex.mobile.ads.impl.hj r3 = r1.f35227d
            if (r7 != r3) goto L_0x00fa
            return
        L_0x00fa:
            r22.m37754c()     // Catch:{ all -> 0x00fe }
            goto L_0x010c
        L_0x00fe:
            r0 = move-exception
            r3 = r0
            boolean r0 = r2.mo70333a()
            if (r0 == 0) goto L_0x010b
            com.yandex.mobile.ads.impl.ed r0 = r1.f35224a
            r0.mo66813b(r2)
        L_0x010b:
            throw r3
        L_0x010c:
            if (r2 == 0) goto L_0x0116
            boolean r3 = r2.mo70333a()
            if (r3 == 0) goto L_0x0116
            r1.f35244u = r2
        L_0x0116:
            r1.f35233j = r7
            long r2 = r0.f35328g
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0120
            r2 = 1
            goto L_0x0121
        L_0x0120:
            r2 = 0
        L_0x0121:
            r1.f35234k = r2
            long r2 = r7.mo65275a((com.yandex.mobile.ads.impl.C13504jj) r0)
            com.yandex.mobile.ads.impl.th r0 = new com.yandex.mobile.ads.impl.th
            r0.<init>()
            boolean r7 = r1.f35234k
            if (r7 == 0) goto L_0x013c
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x013c
            r1.f35243t = r2
            long r4 = r1.f35242s
            long r4 = r4 + r2
            com.yandex.mobile.ads.impl.C14680th.m42345a((com.yandex.mobile.ads.impl.C14680th) r0, (long) r4)
        L_0x013c:
            boolean r2 = r22.m37755d()
            r2 = r2 ^ r6
            if (r2 == 0) goto L_0x015b
            com.yandex.mobile.ads.impl.hj r2 = r1.f35233j
            android.net.Uri r2 = r2.mo65276a()
            r1.f35236m = r2
            android.net.Uri r3 = r1.f35235l
            boolean r2 = r3.equals(r2)
            r2 = r2 ^ r6
            if (r2 == 0) goto L_0x0157
            android.net.Uri r2 = r1.f35236m
            goto L_0x0158
        L_0x0157:
            r2 = 0
        L_0x0158:
            com.yandex.mobile.ads.impl.C14680th.m42346a((com.yandex.mobile.ads.impl.C14680th) r0, (android.net.Uri) r2)
        L_0x015b:
            com.yandex.mobile.ads.impl.hj r2 = r1.f35233j
            com.yandex.mobile.ads.impl.hj r3 = r1.f35226c
            if (r2 != r3) goto L_0x0163
            r3 = 1
            goto L_0x0164
        L_0x0163:
            r3 = 0
        L_0x0164:
            if (r3 == 0) goto L_0x016d
            com.yandex.mobile.ads.impl.ed r2 = r1.f35224a
            java.lang.String r3 = r1.f35241r
            r2.mo66810a((java.lang.String) r3, (com.yandex.mobile.ads.impl.C14680th) r0)
        L_0x016d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13489jd.m37753a(boolean):void");
    }
}
