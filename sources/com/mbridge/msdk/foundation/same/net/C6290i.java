package com.mbridge.msdk.foundation.same.net;

import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.foundation.same.net.p172a.C6240a;
import com.mbridge.msdk.foundation.same.net.p177f.C6271b;
import com.mbridge.msdk.foundation.same.net.p177f.C6272c;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mbridge.msdk.foundation.same.net.i */
/* compiled from: Request */
public abstract class C6290i<T> implements Comparable<C6290i<T>> {

    /* renamed from: c */
    private static final String f15610c = C6290i.class.getSimpleName();

    /* renamed from: a */
    protected ConcurrentHashMap<String, String> f15611a = new ConcurrentHashMap<>();

    /* renamed from: b */
    protected C6263e<T> f15612b = null;

    /* renamed from: d */
    private final int f15613d;

    /* renamed from: e */
    private final String f15614e;

    /* renamed from: f */
    private Integer f15615f;

    /* renamed from: g */
    private C6291j f15616g;

    /* renamed from: h */
    private boolean f15617h = false;

    /* renamed from: i */
    private C6294l f15618i;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C6293k<T> mo43837a(C6272c cVar);

    /* renamed from: e */
    public byte[] mo43844e() {
        return null;
    }

    /* renamed from: g */
    public int mo43839g() {
        return 2;
    }

    public /* synthetic */ int compareTo(Object obj) {
        C6290i iVar = (C6290i) obj;
        int g = mo43839g();
        int g2 = iVar.mo43839g();
        return g == g2 ? this.f15615f.intValue() - iVar.f15615f.intValue() : g2 - g;
    }

    public C6290i(int i, String str, C6263e<T> eVar) {
        this.f15614e = str;
        this.f15613d = i;
        this.f15612b = eVar;
        this.f15618i = new C6241b();
    }

    public C6290i(int i, String str) {
        this.f15614e = str;
        this.f15613d = i;
        this.f15618i = new C6241b();
    }

    /* renamed from: a */
    public final int mo43873a() {
        return this.f15613d;
    }

    /* renamed from: a */
    public final void mo43879a(C6263e<T> eVar) {
        this.f15612b = eVar;
    }

    /* renamed from: a */
    public final C6290i<?> mo43876a(C6294l lVar) {
        this.f15618i = lVar;
        return this;
    }

    /* renamed from: a */
    public final void mo43881a(String str) {
        C6291j jVar = this.f15616g;
        if (jVar != null) {
            jVar.mo43895b(this);
        }
    }

    /* renamed from: a */
    public final C6290i<?> mo43875a(C6291j jVar) {
        this.f15616g = jVar;
        return this;
    }

    /* renamed from: a */
    public final C6290i<?> mo43874a(int i) {
        this.f15615f = Integer.valueOf(i);
        return this;
    }

    /* renamed from: b */
    public final String mo43883b() {
        return this.f15614e;
    }

    /* renamed from: c */
    public final boolean mo43884c() {
        return this.f15617h;
    }

    /* renamed from: d */
    public final Map<String, String> mo43886d() {
        return this.f15611a;
    }

    /* renamed from: f */
    public final void mo43887f() {
        mo43882a(HttpHeaders.CONNECTION, "close");
        mo43882a("Charset", "UTF-8");
    }

    /* renamed from: a */
    public byte[] mo43838a(C6271b bVar, C6243c cVar) throws IOException, C6240a {
        return bVar.mo43854c() != null ? m15901a(bVar) : new byte[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x005f A[SYNTHETIC, Splitter:B:37:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0067 A[Catch:{ IOException -> 0x0063 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] m15901a(com.mbridge.msdk.foundation.same.net.p177f.C6271b r6) throws java.io.IOException, com.mbridge.msdk.foundation.same.net.p172a.C6240a {
        /*
            r5 = this;
            r0 = 0
            java.io.InputStream r1 = r6.mo43854c()     // Catch:{ all -> 0x005b }
            java.util.List r6 = r6.mo43853b()     // Catch:{ all -> 0x0056 }
            boolean r6 = com.mbridge.msdk.foundation.same.net.p178g.C6275b.m15861b(r6)     // Catch:{ all -> 0x0056 }
            if (r6 == 0) goto L_0x0019
            boolean r6 = r1 instanceof java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0056 }
            if (r6 != 0) goto L_0x0019
            java.util.zip.GZIPInputStream r6 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0056 }
            r6.<init>(r1)     // Catch:{ all -> 0x0056 }
            r1 = r6
        L_0x0019:
            if (r1 == 0) goto L_0x004f
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0056 }
            r6.<init>()     // Catch:{ all -> 0x0056 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x004a }
        L_0x0024:
            int r2 = r1.read(r0)     // Catch:{ all -> 0x004a }
            r3 = -1
            if (r2 == r3) goto L_0x0030
            r3 = 0
            r6.write(r0, r3, r2)     // Catch:{ all -> 0x004a }
            goto L_0x0024
        L_0x0030:
            byte[] r0 = r6.toByteArray()     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x003c
            r1.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x003c
        L_0x003a:
            r6 = move-exception
            goto L_0x0040
        L_0x003c:
            r6.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x0049
        L_0x0040:
            java.lang.String r1 = f15610c
            java.lang.String r6 = r6.getMessage()
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r1, r6)
        L_0x0049:
            return r0
        L_0x004a:
            r0 = move-exception
            r4 = r1
            r1 = r6
            r6 = r0
            goto L_0x0059
        L_0x004f:
            com.mbridge.msdk.foundation.same.net.a.a r6 = new com.mbridge.msdk.foundation.same.net.a.a     // Catch:{ all -> 0x0056 }
            r2 = 7
            r6.<init>(r2, r0)     // Catch:{ all -> 0x0056 }
            throw r6     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r6 = move-exception
            r4 = r1
            r1 = r0
        L_0x0059:
            r0 = r4
            goto L_0x005d
        L_0x005b:
            r6 = move-exception
            r1 = r0
        L_0x005d:
            if (r0 == 0) goto L_0x0065
            r0.close()     // Catch:{ IOException -> 0x0063 }
            goto L_0x0065
        L_0x0063:
            r0 = move-exception
            goto L_0x006b
        L_0x0065:
            if (r1 == 0) goto L_0x0074
            r1.close()     // Catch:{ IOException -> 0x0063 }
            goto L_0x0074
        L_0x006b:
            java.lang.String r1 = f15610c
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r1, r0)
        L_0x0074:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.C6290i.m15901a(com.mbridge.msdk.foundation.same.net.f.b):byte[]");
    }

    /* renamed from: h */
    public final int mo43888h() {
        return this.f15618i.mo43816a();
    }

    /* renamed from: a */
    public final void mo43880a(C6293k<T> kVar) {
        C6263e<T> eVar = this.f15612b;
        if (eVar != null) {
            eVar.mo43799a(kVar);
        }
    }

    /* renamed from: a */
    public final void mo43878a(C6240a aVar) {
        C6263e<T> eVar = this.f15612b;
        if (eVar != null) {
            eVar.mo43798a(aVar);
        }
    }

    /* renamed from: i */
    public final void mo43889i() {
        C6263e<T> eVar = this.f15612b;
        if (eVar != null) {
            eVar.mo43843c();
        }
    }

    /* renamed from: j */
    public final void mo43890j() {
        C6263e<T> eVar = this.f15612b;
        if (eVar != null) {
            eVar.mo43842a();
        }
    }

    /* renamed from: k */
    public final void mo43891k() {
        C6263e<T> eVar = this.f15612b;
        if (eVar != null) {
            eVar.mo43800b();
        }
    }

    /* renamed from: l */
    public final void mo43892l() {
        C6263e<T> eVar = this.f15612b;
        if (eVar != null) {
            eVar.mo43845d();
        }
    }

    /* renamed from: a */
    public final void mo43877a(long j, long j2) {
        C6263e<T> eVar = this.f15612b;
        if (eVar != null) {
            eVar.mo43797a(j, j2);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15617h ? "[X] " : "[ ] ");
        sb.append(this.f15614e);
        sb.append(" ");
        sb.append(mo43839g());
        sb.append(" ");
        sb.append(this.f15615f);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo43882a(String str, String str2) {
        this.f15611a.remove(str);
        this.f15611a.put(str, str2);
    }
}
