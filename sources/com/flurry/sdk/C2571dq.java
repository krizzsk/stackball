package com.flurry.sdk;

import com.flurry.sdk.C2577dr;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.flurry.sdk.dq */
public class C2571dq {

    /* renamed from: a */
    public static final Integer f6045a = 50;

    /* renamed from: d */
    private static final String f6046d = C2571dq.class.getSimpleName();

    /* renamed from: b */
    String f6047b;

    /* renamed from: c */
    LinkedHashMap<String, List<String>> f6048c;

    public C2571dq(String str) {
        String str2 = str + "Main";
        this.f6047b = str2;
        m5582b(str2);
    }

    /* renamed from: b */
    private void m5582b(String str) {
        this.f6048c = new LinkedHashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        if (m5583c(str)) {
            List<String> d = m5584d(str);
            if (d != null && d.size() > 0) {
                arrayList.addAll(d);
                for (String e : arrayList) {
                    m5585e(e);
                }
            }
            m5586f(str);
        } else {
            List<C2577dr> list = (List) new C2508ct(C2494ck.m5371a().f5832a.getFileStreamPath(m5587g(this.f6047b)), str, 1, new C2592dz<List<C2577dr>>() {
                /* renamed from: a */
                public final C2587dw<List<C2577dr>> mo17575a(int i) {
                    return new C2584dv(new C2577dr.C2578a());
                }
            }).mo17716a();
            if (list == null) {
                C2530db.m5486c(f6046d, "New main file also not found. returning..");
                return;
            }
            for (C2577dr drVar : list) {
                arrayList.add(drVar.f6054a);
            }
        }
        for (String str2 : arrayList) {
            this.f6048c.put(str2, m5588h(str2));
        }
    }

    /* renamed from: c */
    private synchronized boolean m5583c(String str) {
        File fileStreamPath;
        fileStreamPath = C2494ck.m5371a().f5832a.getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str)));
        String str2 = f6046d;
        C2530db.m5474a(5, str2, "isOldIndexFilePresent: for " + str + fileStreamPath.exists());
        return fileStreamPath.exists();
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List<java.lang.String>] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.util.List<java.lang.String>] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.util.List<java.lang.String> m5584d(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.flurry.sdk.C2619em.m5697a()     // Catch:{ all -> 0x00de }
            java.lang.String r0 = f6046d     // Catch:{ all -> 0x00de }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00de }
            java.lang.String r2 = "Reading Index File for "
            r1.<init>(r2)     // Catch:{ all -> 0x00de }
            r1.append(r9)     // Catch:{ all -> 0x00de }
            java.lang.String r2 = " file name:"
            r1.append(r2)     // Catch:{ all -> 0x00de }
            com.flurry.sdk.ck r2 = com.flurry.sdk.C2494ck.m5371a()     // Catch:{ all -> 0x00de }
            android.content.Context r2 = r2.f5832a     // Catch:{ all -> 0x00de }
            java.lang.String r3 = ".FlurrySenderIndex.info."
            java.lang.String r4 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00de }
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x00de }
            java.io.File r2 = r2.getFileStreamPath(r3)     // Catch:{ all -> 0x00de }
            r1.append(r2)     // Catch:{ all -> 0x00de }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00de }
            r2 = 5
            com.flurry.sdk.C2530db.m5474a((int) r2, (java.lang.String) r0, (java.lang.String) r1)     // Catch:{ all -> 0x00de }
            com.flurry.sdk.ck r0 = com.flurry.sdk.C2494ck.m5371a()     // Catch:{ all -> 0x00de }
            android.content.Context r0 = r0.f5832a     // Catch:{ all -> 0x00de }
            java.lang.String r1 = ".FlurrySenderIndex.info."
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00de }
            java.lang.String r1 = r1.concat(r3)     // Catch:{ all -> 0x00de }
            java.io.File r0 = r0.getFileStreamPath(r1)     // Catch:{ all -> 0x00de }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x00de }
            r3 = 0
            if (r1 == 0) goto L_0x00d5
            java.lang.String r1 = f6046d     // Catch:{ all -> 0x00de }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00de }
            java.lang.String r5 = "Reading Index File for "
            r4.<init>(r5)     // Catch:{ all -> 0x00de }
            r4.append(r9)     // Catch:{ all -> 0x00de }
            java.lang.String r9 = " Found file."
            r4.append(r9)     // Catch:{ all -> 0x00de }
            java.lang.String r9 = r4.toString()     // Catch:{ all -> 0x00de }
            com.flurry.sdk.C2530db.m5474a((int) r2, (java.lang.String) r1, (java.lang.String) r9)     // Catch:{ all -> 0x00de }
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ all -> 0x00c1 }
            r9.<init>(r0)     // Catch:{ all -> 0x00c1 }
            java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch:{ all -> 0x00c1 }
            r0.<init>(r9)     // Catch:{ all -> 0x00c1 }
            int r9 = r0.readUnsignedShort()     // Catch:{ all -> 0x00bd }
            if (r9 != 0) goto L_0x007c
            com.flurry.sdk.C2619em.m5698a((java.io.Closeable) r0)     // Catch:{ all -> 0x00de }
            monitor-exit(r8)
            return r3
        L_0x007c:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00bd }
            r1.<init>(r9)     // Catch:{ all -> 0x00bd }
            r2 = 0
        L_0x0082:
            if (r2 >= r9) goto L_0x00b4
            int r3 = r0.readUnsignedShort()     // Catch:{ all -> 0x00bb }
            r4 = 4
            java.lang.String r5 = f6046d     // Catch:{ all -> 0x00bb }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bb }
            java.lang.String r7 = "read iter "
            r6.<init>(r7)     // Catch:{ all -> 0x00bb }
            r6.append(r2)     // Catch:{ all -> 0x00bb }
            java.lang.String r7 = " dataLength = "
            r6.append(r7)     // Catch:{ all -> 0x00bb }
            r6.append(r3)     // Catch:{ all -> 0x00bb }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00bb }
            com.flurry.sdk.C2530db.m5474a((int) r4, (java.lang.String) r5, (java.lang.String) r6)     // Catch:{ all -> 0x00bb }
            byte[] r3 = new byte[r3]     // Catch:{ all -> 0x00bb }
            r0.readFully(r3)     // Catch:{ all -> 0x00bb }
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x00bb }
            r4.<init>(r3)     // Catch:{ all -> 0x00bb }
            r1.add(r4)     // Catch:{ all -> 0x00bb }
            int r2 = r2 + 1
            goto L_0x0082
        L_0x00b4:
            r0.readUnsignedShort()     // Catch:{ all -> 0x00bb }
            com.flurry.sdk.C2619em.m5698a((java.io.Closeable) r0)     // Catch:{ all -> 0x00de }
            goto L_0x00ce
        L_0x00bb:
            r9 = move-exception
            goto L_0x00bf
        L_0x00bd:
            r9 = move-exception
            r1 = r3
        L_0x00bf:
            r3 = r0
            goto L_0x00c3
        L_0x00c1:
            r9 = move-exception
            r1 = r3
        L_0x00c3:
            r0 = 6
            java.lang.String r2 = f6046d     // Catch:{ all -> 0x00d0 }
            java.lang.String r4 = "Error when loading persistent file"
            com.flurry.sdk.C2530db.m5475a(r0, r2, r4, r9)     // Catch:{ all -> 0x00d0 }
            com.flurry.sdk.C2619em.m5698a((java.io.Closeable) r3)     // Catch:{ all -> 0x00de }
        L_0x00ce:
            r3 = r1
            goto L_0x00dc
        L_0x00d0:
            r9 = move-exception
            com.flurry.sdk.C2619em.m5698a((java.io.Closeable) r3)     // Catch:{ all -> 0x00de }
            throw r9     // Catch:{ all -> 0x00de }
        L_0x00d5:
            java.lang.String r9 = f6046d     // Catch:{ all -> 0x00de }
            java.lang.String r0 = "Agent cache file doesn't exist."
            com.flurry.sdk.C2530db.m5474a((int) r2, (java.lang.String) r9, (java.lang.String) r0)     // Catch:{ all -> 0x00de }
        L_0x00dc:
            monitor-exit(r8)
            return r3
        L_0x00de:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2571dq.m5584d(java.lang.String):java.util.List");
    }

    /* renamed from: e */
    private void m5585e(String str) {
        List<String> d = m5584d(str);
        if (d == null) {
            C2530db.m5486c(f6046d, "No old file to replace");
            return;
        }
        for (String next : d) {
            byte[] i = m5589i(next);
            if (i == null) {
                C2530db.m5474a(6, f6046d, "File does not exist");
            } else {
                m5581a(next, i);
                C2619em.m5697a();
                String str2 = f6046d;
                C2530db.m5474a(5, str2, "Deleting  block File for " + next + " file name:" + C2494ck.m5371a().f5832a.getFileStreamPath(".flurrydatasenderblock.".concat(String.valueOf(next))));
                File fileStreamPath = C2494ck.m5371a().f5832a.getFileStreamPath(".flurrydatasenderblock.".concat(String.valueOf(next)));
                if (fileStreamPath.exists()) {
                    boolean delete = fileStreamPath.delete();
                    String str3 = f6046d;
                    C2530db.m5474a(5, str3, "Found file for " + next + ". Deleted - " + delete);
                }
            }
        }
        m5580a(str, d, ".YFlurrySenderIndex.info.");
        m5586f(str);
    }

    /* renamed from: f */
    private static void m5586f(String str) {
        C2619em.m5697a();
        String str2 = f6046d;
        C2530db.m5474a(5, str2, "Deleting Index File for " + str + " file name:" + C2494ck.m5371a().f5832a.getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str))));
        File fileStreamPath = C2494ck.m5371a().f5832a.getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str)));
        if (fileStreamPath.exists()) {
            boolean delete = fileStreamPath.delete();
            String str3 = f6046d;
            C2530db.m5474a(5, str3, "Found file for " + str + ". Deleted - " + delete);
        }
    }

    /* renamed from: g */
    private static String m5587g(String str) {
        return ".YFlurrySenderIndex.info.".concat(String.valueOf(str));
    }

    /* renamed from: h */
    private synchronized List<String> m5588h(String str) {
        ArrayList arrayList;
        C2619em.m5697a();
        String str2 = f6046d;
        C2530db.m5474a(5, str2, "Reading Index File for " + str + " file name:" + C2494ck.m5371a().f5832a.getFileStreamPath(m5587g(str)));
        arrayList = new ArrayList();
        for (C2577dr drVar : (List) new C2508ct(C2494ck.m5371a().f5832a.getFileStreamPath(m5587g(str)), ".YFlurrySenderIndex.info.", 1, new C2592dz<List<C2577dr>>() {
            /* renamed from: a */
            public final C2587dw<List<C2577dr>> mo17575a(int i) {
                return new C2584dv(new C2577dr.C2578a());
            }
        }).mo17716a()) {
            arrayList.add(drVar.f6054a);
        }
        return arrayList;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.io.DataInputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m5589i(java.lang.String r7) {
        /*
            com.flurry.sdk.C2619em.m5697a()
            java.lang.String r0 = f6046d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Reading block File for "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r2 = " file name:"
            r1.append(r2)
            com.flurry.sdk.ck r2 = com.flurry.sdk.C2494ck.m5371a()
            android.content.Context r2 = r2.f5832a
            java.lang.String r3 = java.lang.String.valueOf(r7)
            java.lang.String r4 = ".flurrydatasenderblock."
            java.lang.String r3 = r4.concat(r3)
            java.io.File r2 = r2.getFileStreamPath(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 5
            com.flurry.sdk.C2530db.m5474a((int) r2, (java.lang.String) r0, (java.lang.String) r1)
            com.flurry.sdk.ck r0 = com.flurry.sdk.C2494ck.m5371a()
            android.content.Context r0 = r0.f5832a
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r1 = r4.concat(r1)
            java.io.File r0 = r0.getFileStreamPath(r1)
            boolean r1 = r0.exists()
            r3 = 0
            if (r1 == 0) goto L_0x009d
            java.lang.String r1 = f6046d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Reading Index File for "
            r4.<init>(r5)
            r4.append(r7)
            java.lang.String r7 = " Found file."
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            com.flurry.sdk.C2530db.m5474a((int) r2, (java.lang.String) r1, (java.lang.String) r7)
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ all -> 0x0089 }
            r7.<init>(r0)     // Catch:{ all -> 0x0089 }
            java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch:{ all -> 0x0089 }
            r0.<init>(r7)     // Catch:{ all -> 0x0089 }
            int r7 = r0.readUnsignedShort()     // Catch:{ all -> 0x0084 }
            if (r7 != 0) goto L_0x0078
            com.flurry.sdk.C2619em.m5698a((java.io.Closeable) r0)
            return r3
        L_0x0078:
            byte[] r3 = new byte[r7]     // Catch:{ all -> 0x0084 }
            r0.readFully(r3)     // Catch:{ all -> 0x0084 }
            r0.readUnsignedShort()     // Catch:{ all -> 0x0084 }
            com.flurry.sdk.C2619em.m5698a((java.io.Closeable) r0)
            goto L_0x00a5
        L_0x0084:
            r7 = move-exception
            r6 = r3
            r3 = r0
            r0 = r6
            goto L_0x008b
        L_0x0089:
            r7 = move-exception
            r0 = r3
        L_0x008b:
            r1 = 6
            java.lang.String r2 = f6046d     // Catch:{ all -> 0x0098 }
            java.lang.String r4 = "Error when loading persistent file"
            com.flurry.sdk.C2530db.m5475a(r1, r2, r4, r7)     // Catch:{ all -> 0x0098 }
            com.flurry.sdk.C2619em.m5698a((java.io.Closeable) r3)
            r3 = r0
            goto L_0x00a5
        L_0x0098:
            r7 = move-exception
            com.flurry.sdk.C2619em.m5698a((java.io.Closeable) r3)
            throw r7
        L_0x009d:
            r7 = 4
            java.lang.String r0 = f6046d
            java.lang.String r1 = "Agent cache file doesn't exist."
            com.flurry.sdk.C2530db.m5474a((int) r7, (java.lang.String) r0, (java.lang.String) r1)
        L_0x00a5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2571dq.m5589i(java.lang.String):byte[]");
    }

    /* renamed from: a */
    private synchronized void m5581a(String str, byte[] bArr) {
        C2619em.m5697a();
        String str2 = f6046d;
        C2530db.m5474a(5, str2, "Saving Block File for " + str + " file name:" + C2494ck.m5371a().f5832a.getFileStreamPath(C2566dp.m5574a(str)));
        C2566dp.m5575b(str).mo17717a(new C2566dp(bArr));
    }

    /* renamed from: a */
    private synchronized void m5580a(String str, List<String> list, String str2) {
        C2619em.m5697a();
        String str3 = f6046d;
        C2530db.m5474a(5, str3, "Saving Index File for " + str + " file name:" + C2494ck.m5371a().f5832a.getFileStreamPath(m5587g(str)));
        C2508ct ctVar = new C2508ct(C2494ck.m5371a().f5832a.getFileStreamPath(m5587g(str)), str2, 1, new C2592dz<List<C2577dr>>() {
            /* renamed from: a */
            public final C2587dw<List<C2577dr>> mo17575a(int i) {
                return new C2584dv(new C2577dr.C2578a());
            }
        });
        ArrayList arrayList = new ArrayList();
        for (String drVar : list) {
            arrayList.add(new C2577dr(drVar));
        }
        ctVar.mo17717a(arrayList);
    }

    /* renamed from: a */
    public final synchronized void mo17782a(C2566dp dpVar, String str) {
        boolean z;
        C2530db.m5474a(4, f6046d, "addBlockInfo".concat(String.valueOf(str)));
        String str2 = dpVar.f6040a;
        List list = this.f6048c.get(str);
        if (list == null) {
            C2530db.m5474a(4, f6046d, "New Data Key");
            list = new LinkedList();
            z = true;
        } else {
            z = false;
        }
        list.add(str2);
        if (list.size() > f6045a.intValue()) {
            C2566dp.m5575b((String) list.get(0)).mo17718b();
            list.remove(0);
        }
        this.f6048c.put(str, list);
        m5580a(str, list, ".YFlurrySenderIndex.info.");
        if (z) {
            m5579a();
        }
    }

    /* renamed from: a */
    private synchronized void m5579a() {
        LinkedList linkedList = new LinkedList(this.f6048c.keySet());
        new C2508ct(C2494ck.m5371a().f5832a.getFileStreamPath(m5587g(this.f6047b)), ".YFlurrySenderIndex.info.", 1, new C2592dz<List<C2577dr>>() {
            /* renamed from: a */
            public final C2587dw<List<C2577dr>> mo17575a(int i) {
                return new C2584dv(new C2577dr.C2578a());
            }
        }).mo17718b();
        if (!linkedList.isEmpty()) {
            m5580a(this.f6047b, linkedList, this.f6047b);
        }
    }

    /* renamed from: a */
    public final boolean mo17783a(String str, String str2) {
        boolean z;
        List list = this.f6048c.get(str2);
        if (list != null) {
            C2566dp.m5575b(str).mo17718b();
            z = list.remove(str);
        } else {
            z = false;
        }
        if (list == null || list.isEmpty()) {
            m5590j(str2);
        } else {
            this.f6048c.put(str2, list);
            m5580a(str2, list, ".YFlurrySenderIndex.info.");
        }
        return z;
    }

    /* renamed from: j */
    private synchronized boolean m5590j(String str) {
        boolean b;
        C2619em.m5697a();
        C2508ct ctVar = new C2508ct(C2494ck.m5371a().f5832a.getFileStreamPath(m5587g(str)), ".YFlurrySenderIndex.info.", 1, new C2592dz<List<C2577dr>>() {
            /* renamed from: a */
            public final C2587dw<List<C2577dr>> mo17575a(int i) {
                return new C2584dv(new C2577dr.C2578a());
            }
        });
        List<String> a = mo17781a(str);
        if (a != null) {
            String str2 = f6046d;
            C2530db.m5474a(4, str2, "discardOutdatedBlocksForDataKey: notSentBlocks = " + a.size());
            for (String next : a) {
                C2566dp.m5575b(next).mo17718b();
                C2530db.m5474a(4, f6046d, "discardOutdatedBlocksForDataKey: removed block = ".concat(String.valueOf(next)));
            }
        }
        this.f6048c.remove(str);
        b = ctVar.mo17718b();
        m5579a();
        return b;
    }

    /* renamed from: a */
    public final List<String> mo17781a(String str) {
        return this.f6048c.get(str);
    }
}
