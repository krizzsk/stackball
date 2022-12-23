package com.yandex.mobile.ads.impl;

import android.os.ConditionVariable;
import android.util.Log;
import com.yandex.mobile.ads.impl.C12966ed;
import com.yandex.mobile.ads.impl.C14593sh;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public final class n81 implements C12966ed {

    /* renamed from: k */
    private static final HashSet<File> f37664k = new HashSet<>();

    /* renamed from: a */
    private final File f37665a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C14094nd f37666b;

    /* renamed from: c */
    private final C15303zd f37667c;

    /* renamed from: d */
    private final C14271pd f37668d;

    /* renamed from: e */
    private final HashMap<String, ArrayList<C12966ed.C12968b>> f37669e;

    /* renamed from: f */
    private final Random f37670f;

    /* renamed from: g */
    private final boolean f37671g;

    /* renamed from: h */
    private long f37672h;

    /* renamed from: i */
    private long f37673i;

    /* renamed from: j */
    private C12966ed.C12967a f37674j;

    /* renamed from: com.yandex.mobile.ads.impl.n81$a */
    class C14062a extends Thread {

        /* renamed from: b */
        final /* synthetic */ ConditionVariable f37675b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14062a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f37675b = conditionVariable;
        }

        public void run() {
            synchronized (n81.this) {
                this.f37675b.open();
                n81.m39868a(n81.this);
                n81.this.f37666b.getClass();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public n81(File file, C14094nd ndVar, C13859lj ljVar, byte[] bArr, boolean z, boolean z2) {
        this(file, ndVar, new C15303zd(ljVar, file, (byte[]) null, z, z2), (ljVar == null || z2) ? null : new C14271pd(ljVar));
    }

    /* renamed from: c */
    private void m39874c(C14752ud udVar) {
        C15242yd a = this.f37667c.mo71194a(udVar.f40629b);
        if (a != null && a.mo71030a(udVar)) {
            this.f37673i -= udVar.f40631d;
            if (this.f37668d != null) {
                String name = udVar.f40633f.getName();
                try {
                    this.f37668d.mo69354a(name);
                } catch (IOException unused) {
                    Log.w("SimpleCache", "Failed to remove file index entry for: " + name);
                }
            }
            this.f37667c.mo71203d(a.f42808b);
            ArrayList arrayList = this.f37669e.get(udVar.f40629b);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((C12966ed.C12968b) arrayList.get(size)).mo66814a(this, udVar);
                }
            }
            ((yi0) this.f37666b).mo66814a((C12966ed) this, udVar);
        }
    }

    /* renamed from: a */
    public synchronized long mo66804a() {
        C13479j9.m37708b(true);
        return this.f37673i;
    }

    /* renamed from: b */
    public synchronized void mo68933b() throws C12966ed.C12967a {
        C12966ed.C12967a aVar = this.f37674j;
        if (aVar != null) {
            throw aVar;
        }
    }

    /* renamed from: a */
    public synchronized C14752ud mo66806a(String str, long j) throws InterruptedException, C12966ed.C12967a {
        C14752ud b;
        C13479j9.m37708b(true);
        mo68933b();
        while (true) {
            b = mo66812b(str, j);
            if (b == null) {
                wait();
            }
        }
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008b, code lost:
        return r11;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.yandex.mobile.ads.impl.C14752ud mo66812b(java.lang.String r10, long r11) throws com.yandex.mobile.ads.impl.C12966ed.C12967a {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 1
            com.yandex.mobile.ads.impl.C13479j9.m37708b((boolean) r0)     // Catch:{ all -> 0x00a0 }
            r9.mo68933b()     // Catch:{ all -> 0x00a0 }
            com.yandex.mobile.ads.impl.zd r1 = r9.f37667c     // Catch:{ all -> 0x00a0 }
            com.yandex.mobile.ads.impl.yd r1 = r1.mo71194a((java.lang.String) r10)     // Catch:{ all -> 0x00a0 }
            if (r1 != 0) goto L_0x0015
            com.yandex.mobile.ads.impl.o81 r11 = com.yandex.mobile.ads.impl.o81.m40312b(r10, r11)     // Catch:{ all -> 0x00a0 }
            goto L_0x002e
        L_0x0015:
            com.yandex.mobile.ads.impl.o81 r2 = r1.mo71025a((long) r11)     // Catch:{ all -> 0x00a0 }
            boolean r3 = r2.f40632e     // Catch:{ all -> 0x00a0 }
            if (r3 == 0) goto L_0x002d
            java.io.File r3 = r2.f40633f     // Catch:{ all -> 0x00a0 }
            long r3 = r3.length()     // Catch:{ all -> 0x00a0 }
            long r5 = r2.f40631d     // Catch:{ all -> 0x00a0 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x002d
            r9.m39873c()     // Catch:{ all -> 0x00a0 }
            goto L_0x0015
        L_0x002d:
            r11 = r2
        L_0x002e:
            boolean r12 = r11.f40632e     // Catch:{ all -> 0x00a0 }
            if (r12 == 0) goto L_0x008c
            boolean r12 = r9.f37671g     // Catch:{ all -> 0x00a0 }
            if (r12 != 0) goto L_0x0037
            goto L_0x008a
        L_0x0037:
            java.io.File r12 = r11.f40633f     // Catch:{ all -> 0x00a0 }
            r12.getClass()     // Catch:{ all -> 0x00a0 }
            java.lang.String r2 = r12.getName()     // Catch:{ all -> 0x00a0 }
            long r3 = r11.f40631d     // Catch:{ all -> 0x00a0 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00a0 }
            r12 = 0
            com.yandex.mobile.ads.impl.pd r1 = r9.f37668d     // Catch:{ all -> 0x00a0 }
            if (r1 == 0) goto L_0x0058
            r5 = r7
            r1.mo69355a(r2, r3, r5)     // Catch:{ IOException -> 0x0050 }
            goto L_0x0059
        L_0x0050:
            java.lang.String r1 = "SimpleCache"
            java.lang.String r2 = "Failed to update index with new touch timestamp."
            android.util.Log.w(r1, r2)     // Catch:{ all -> 0x00a0 }
            goto L_0x0059
        L_0x0058:
            r12 = 1
        L_0x0059:
            com.yandex.mobile.ads.impl.zd r1 = r9.f37667c     // Catch:{ all -> 0x00a0 }
            com.yandex.mobile.ads.impl.yd r10 = r1.mo71194a((java.lang.String) r10)     // Catch:{ all -> 0x00a0 }
            com.yandex.mobile.ads.impl.o81 r10 = r10.mo71026a(r11, r7, r12)     // Catch:{ all -> 0x00a0 }
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.yandex.mobile.ads.impl.ed$b>> r12 = r9.f37669e     // Catch:{ all -> 0x00a0 }
            java.lang.String r1 = r11.f40629b     // Catch:{ all -> 0x00a0 }
            java.lang.Object r12 = r12.get(r1)     // Catch:{ all -> 0x00a0 }
            java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch:{ all -> 0x00a0 }
            if (r12 == 0) goto L_0x0082
            int r1 = r12.size()     // Catch:{ all -> 0x00a0 }
            int r1 = r1 - r0
        L_0x0074:
            if (r1 < 0) goto L_0x0082
            java.lang.Object r0 = r12.get(r1)     // Catch:{ all -> 0x00a0 }
            com.yandex.mobile.ads.impl.ed$b r0 = (com.yandex.mobile.ads.impl.C12966ed.C12968b) r0     // Catch:{ all -> 0x00a0 }
            r0.mo66815a(r9, r11, r10)     // Catch:{ all -> 0x00a0 }
            int r1 = r1 + -1
            goto L_0x0074
        L_0x0082:
            com.yandex.mobile.ads.impl.nd r12 = r9.f37666b     // Catch:{ all -> 0x00a0 }
            com.yandex.mobile.ads.impl.yi0 r12 = (com.yandex.mobile.ads.impl.yi0) r12     // Catch:{ all -> 0x00a0 }
            r12.mo66815a(r9, r11, r10)     // Catch:{ all -> 0x00a0 }
            r11 = r10
        L_0x008a:
            monitor-exit(r9)
            return r11
        L_0x008c:
            com.yandex.mobile.ads.impl.zd r12 = r9.f37667c     // Catch:{ all -> 0x00a0 }
            com.yandex.mobile.ads.impl.yd r10 = r12.mo71200c(r10)     // Catch:{ all -> 0x00a0 }
            boolean r12 = r10.mo71033d()     // Catch:{ all -> 0x00a0 }
            if (r12 != 0) goto L_0x009d
            r10.mo71028a((boolean) r0)     // Catch:{ all -> 0x00a0 }
            monitor-exit(r9)
            return r11
        L_0x009d:
            r10 = 0
            monitor-exit(r9)
            return r10
        L_0x00a0:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.n81.mo66812b(java.lang.String, long):com.yandex.mobile.ads.impl.ud");
    }

    n81(File file, C14094nd ndVar, C15303zd zdVar, C14271pd pdVar) {
        if (m39872b(file)) {
            this.f37665a = file;
            this.f37666b = ndVar;
            this.f37667c = zdVar;
            this.f37668d = pdVar;
            this.f37669e = new HashMap<>();
            this.f37670f = new Random();
            ndVar.getClass();
            this.f37671g = true;
            this.f37672h = -1;
            ConditionVariable conditionVariable = new ConditionVariable();
            new C14062a("SimpleCache.initialize()", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }

    /* renamed from: a */
    public synchronized File mo66807a(String str, long j, long j2) throws C12966ed.C12967a {
        C15242yd a;
        File file;
        C13479j9.m37708b(true);
        mo68933b();
        a = this.f37667c.mo71194a(str);
        a.getClass();
        C13479j9.m37708b(a.mo71033d());
        if (!this.f37665a.exists()) {
            this.f37665a.mkdirs();
            m39873c();
        }
        ((yi0) this.f37666b).mo71088a(this, str, j, j2);
        file = new File(this.f37665a, Integer.toString(this.f37670f.nextInt(10)));
        if (!file.exists()) {
            file.mkdir();
        }
        return o81.m40311a(file, a.f42807a, j, System.currentTimeMillis());
    }

    /* renamed from: c */
    private void m39873c() {
        ArrayList arrayList = new ArrayList();
        for (C15242yd b : this.f37667c.mo71199b()) {
            Iterator<o81> it = b.mo71031b().iterator();
            while (it.hasNext()) {
                C14752ud next = it.next();
                if (next.f40633f.length() != next.f40631d) {
                    arrayList.add(next);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            m39874c((C14752ud) arrayList.get(i));
        }
    }

    /* renamed from: a */
    public synchronized void mo66809a(File file, long j) throws C12966ed.C12967a {
        boolean z = true;
        C13479j9.m37708b(true);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            o81 a = o81.m40308a(file, j, -9223372036854775807L, this.f37667c);
            a.getClass();
            C15242yd a2 = this.f37667c.mo71194a(a.f40629b);
            a2.getClass();
            C13479j9.m37708b(a2.mo71033d());
            long a3 = C14593sh.CC.m41975a(a2.mo71024a());
            if (a3 != -1) {
                if (a.f40630c + a.f40631d > a3) {
                    z = false;
                }
                C13479j9.m37708b(z);
            }
            if (this.f37668d != null) {
                try {
                    this.f37668d.mo69355a(file.getName(), a.f40631d, a.f40634g);
                } catch (IOException e) {
                    throw new C12966ed.C12967a((Throwable) e);
                } catch (IOException e2) {
                    throw new C12966ed.C12967a((Throwable) e2);
                }
            }
            m39869a(a);
            this.f37667c.mo71202d();
            notifyAll();
        }
    }

    /* renamed from: b */
    public synchronized void mo66813b(C14752ud udVar) {
        C13479j9.m37708b(true);
        C15242yd a = this.f37667c.mo71194a(udVar.f40629b);
        a.getClass();
        C13479j9.m37708b(a.mo71033d());
        a.mo71028a(false);
        this.f37667c.mo71203d(a.f42808b);
        notifyAll();
    }

    /* renamed from: b */
    public synchronized long mo66811b(String str, long j, long j2) {
        C15242yd a;
        C13479j9.m37708b(true);
        a = this.f37667c.mo71194a(str);
        return a != null ? a.mo71023a(j, j2) : -j2;
    }

    /* renamed from: b */
    private static synchronized boolean m39872b(File file) {
        boolean add;
        synchronized (n81.class) {
            add = f37664k.add(file.getAbsoluteFile());
        }
        return add;
    }

    /* renamed from: a */
    public synchronized void mo66808a(C14752ud udVar) {
        C13479j9.m37708b(true);
        m39874c(udVar);
    }

    /* renamed from: a */
    public synchronized void mo66810a(String str, C14680th thVar) throws C12966ed.C12967a {
        mo68933b();
        this.f37667c.mo71197a(str, thVar);
        try {
            this.f37667c.mo71202d();
        } catch (IOException e) {
            throw new C12966ed.C12967a((Throwable) e);
        }
    }

    /* renamed from: a */
    public synchronized C14593sh mo66805a(String str) {
        C13479j9.m37708b(true);
        return this.f37667c.mo71198b(str);
    }

    /* renamed from: a */
    static void m39868a(n81 n81) {
        long j;
        if (n81.f37665a.exists() || n81.f37665a.mkdirs()) {
            File[] listFiles = n81.f37665a.listFiles();
            if (listFiles == null) {
                String str = "Failed to list cache directory files: " + n81.f37665a;
                Log.e("SimpleCache", str);
                n81.f37674j = new C12966ed.C12967a(str);
                return;
            }
            int length = listFiles.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    j = -1;
                    break;
                }
                File file = listFiles[i];
                String name = file.getName();
                if (name.endsWith(".uid")) {
                    try {
                        j = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                        break;
                    } catch (NumberFormatException unused) {
                        Log.e("SimpleCache", "Malformed UID file: " + file);
                        file.delete();
                    }
                } else {
                    i++;
                }
            }
            n81.f37672h = j;
            if (j == -1) {
                try {
                    n81.f37672h = m39867a(n81.f37665a);
                } catch (IOException e) {
                    String str2 = "Failed to create cache UID: " + n81.f37665a;
                    bk0.m34269a("SimpleCache", str2, e);
                    n81.f37674j = new C12966ed.C12967a(str2, e);
                    return;
                }
            }
            try {
                n81.f37667c.mo71196a(n81.f37672h);
                C14271pd pdVar = n81.f37668d;
                if (pdVar != null) {
                    pdVar.mo69353a(n81.f37672h);
                    Map<String, C14179od> a = n81.f37668d.mo69352a();
                    n81.m39870a(n81.f37665a, true, listFiles, a);
                    n81.f37668d.mo69356a((Set<String>) ((HashMap) a).keySet());
                } else {
                    n81.m39870a(n81.f37665a, true, listFiles, (Map<String, C14179od>) null);
                }
                n81.f37667c.mo71201c();
                try {
                    n81.f37667c.mo71202d();
                } catch (IOException e2) {
                    bk0.m34269a("SimpleCache", "Storing index file failed", e2);
                }
            } catch (IOException e3) {
                String str3 = "Failed to initialize cache indices: " + n81.f37665a;
                bk0.m34269a("SimpleCache", str3, e3);
                n81.f37674j = new C12966ed.C12967a(str3, e3);
            }
        } else {
            String str4 = "Failed to create cache directory: " + n81.f37665a;
            Log.e("SimpleCache", str4);
            n81.f37674j = new C12966ed.C12967a(str4);
        }
    }

    /* renamed from: a */
    private void m39870a(File file, boolean z, File[] fileArr, Map<String, C14179od> map) {
        if (fileArr != null && fileArr.length != 0) {
            for (File file2 : fileArr) {
                String name = file2.getName();
                if (z && name.indexOf(46) == -1) {
                    m39870a(file2, false, file2.listFiles(), map);
                } else if (!z || (!name.startsWith(CachedContentIndex.FILE_NAME) && !name.endsWith(".uid"))) {
                    long j = -1;
                    long j2 = -9223372036854775807L;
                    C14179od remove = map != null ? map.remove(name) : null;
                    if (remove != null) {
                        j = remove.f38150a;
                        j2 = remove.f38151b;
                    }
                    o81 a = o81.m40308a(file2, j, j2, this.f37667c);
                    if (a != null) {
                        m39869a(a);
                    } else {
                        file2.delete();
                    }
                }
            }
        } else if (!z) {
            file.delete();
        }
    }

    /* renamed from: a */
    private void m39869a(o81 o81) {
        this.f37667c.mo71200c(o81.f40629b).mo71027a(o81);
        this.f37673i += o81.f40631d;
        ArrayList arrayList = this.f37669e.get(o81.f40629b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C12966ed.C12968b) arrayList.get(size)).mo66816b(this, o81);
            }
        }
        ((yi0) this.f37666b).mo66816b(this, o81);
    }

    /* renamed from: a */
    private static long m39867a(File file) throws IOException {
        long j;
        long nextLong = new SecureRandom().nextLong();
        if (nextLong == Long.MIN_VALUE) {
            j = 0;
        } else {
            j = Math.abs(nextLong);
        }
        String l = Long.toString(j, 16);
        File file2 = new File(file, l + ".uid");
        if (file2.createNewFile()) {
            return j;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }
}
