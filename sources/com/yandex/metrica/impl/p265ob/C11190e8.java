package com.yandex.metrica.impl.p265ob;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import com.yandex.metrica.impl.p264ac.CrashpadServiceHelper;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.e8 */
public class C11190e8 {

    /* renamed from: a */
    private final String f26801a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public LocalServerSocket f26802b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile boolean f26803c;

    /* renamed from: d */
    private final C11373j8 f26804d;

    /* renamed from: e */
    private final C10820Um<String> f26805e;

    /* renamed from: f */
    private final String f26806f;

    /* renamed from: g */
    private List<C10820Um<String>> f26807g;

    /* renamed from: h */
    private final Thread f26808h;

    /* renamed from: com.yandex.metrica.impl.ob.e8$a */
    class C11191a extends Thread {
        C11191a() {
        }

        public void run() {
            while (C11190e8.this.f26803c) {
                try {
                    LocalSocket accept = C11190e8.this.f26802b.accept();
                    byte[] bArr = new byte[256];
                    int read = accept.getInputStream().read(bArr);
                    accept.close();
                    byte[] bArr2 = new byte[read];
                    System.arraycopy(bArr, 0, bArr2, 0, read);
                    C11190e8.m28840a(C11190e8.this, new String(bArr2));
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e8$b */
    class C11192b implements C10820Um<String> {
        C11192b() {
        }

        /* renamed from: b */
        public void mo61092b(Object obj) {
            CrashpadServiceHelper.setUpServiceHelper((String) obj);
        }
    }

    public C11190e8(String str, String str2) {
        this(str, str2, C11373j8.m29280a(), new C11192b());
    }

    C11190e8(String str, String str2, C11373j8 j8Var, C10820Um<String> um) {
        this.f26803c = false;
        this.f26807g = new LinkedList();
        this.f26808h = new C11191a();
        this.f26801a = str;
        this.f26806f = str2;
        this.f26804d = j8Var;
        this.f26805e = um;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|(3:12|13|(1:15))|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0034 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo62812a(com.yandex.metrica.impl.p265ob.C10820Um<java.lang.String> r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.List<com.yandex.metrica.impl.ob.Um<java.lang.String>> r0 = r1.f26807g     // Catch:{ all -> 0x003a }
            r0.add(r2)     // Catch:{ all -> 0x003a }
            monitor-exit(r1)     // Catch:{ all -> 0x003a }
            boolean r2 = r1.f26803c
            if (r2 != 0) goto L_0x0039
            java.lang.String r2 = r1.f26806f
            if (r2 == 0) goto L_0x0039
            monitor-enter(r1)
            boolean r2 = r1.f26803c     // Catch:{ all -> 0x0036 }
            if (r2 != 0) goto L_0x0034
            com.yandex.metrica.impl.ob.j8 r2 = r1.f26804d     // Catch:{ all -> 0x0034 }
            boolean r2 = r2.mo63060b()     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x0034
            android.net.LocalServerSocket r2 = new android.net.LocalServerSocket     // Catch:{ all -> 0x0034 }
            java.lang.String r0 = r1.f26801a     // Catch:{ all -> 0x0034 }
            r2.<init>(r0)     // Catch:{ all -> 0x0034 }
            r1.f26802b = r2     // Catch:{ all -> 0x0034 }
            r2 = 1
            r1.f26803c = r2     // Catch:{ all -> 0x0034 }
            com.yandex.metrica.impl.ob.Um<java.lang.String> r2 = r1.f26805e     // Catch:{ all -> 0x0034 }
            java.lang.String r0 = r1.f26806f     // Catch:{ all -> 0x0034 }
            r2.mo61092b(r0)     // Catch:{ all -> 0x0034 }
            java.lang.Thread r2 = r1.f26808h     // Catch:{ all -> 0x0034 }
            r2.start()     // Catch:{ all -> 0x0034 }
        L_0x0034:
            monitor-exit(r1)     // Catch:{ all -> 0x0036 }
            goto L_0x0039
        L_0x0036:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0036 }
            throw r2
        L_0x0039:
            return
        L_0x003a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003a }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11190e8.mo62812a(com.yandex.metrica.impl.ob.Um):void");
    }

    /* renamed from: b */
    public synchronized void mo62813b(C10820Um<String> um) {
        this.f26807g.remove(um);
    }

    /* renamed from: a */
    static void m28840a(C11190e8 e8Var, String str) {
        synchronized (e8Var) {
            for (C10820Um<String> b : e8Var.f26807g) {
                b.mo61092b(str);
            }
        }
    }
}
