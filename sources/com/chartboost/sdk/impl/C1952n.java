package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.C1828g;
import com.chartboost.sdk.Libraries.C1832j;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.C1837b;
import com.chartboost.sdk.Model.C1844h;
import com.chartboost.sdk.Networking.C1855g;
import com.chartboost.sdk.Networking.C1856h;
import java.io.File;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.chartboost.sdk.impl.n */
public class C1952n {

    /* renamed from: a */
    private final Executor f5007a;

    /* renamed from: b */
    private final C1855g f5008b;

    /* renamed from: c */
    private final C1856h f5009c;

    /* renamed from: d */
    private final AtomicReference<C1844h> f5010d;

    /* renamed from: e */
    private final C1832j f5011e;

    /* renamed from: f */
    private final C1828g f5012f;

    /* renamed from: g */
    int f5013g = 1;

    /* renamed from: h */
    private C1947m f5014h = null;

    /* renamed from: i */
    private final PriorityQueue<C1942l> f5015i;

    /* renamed from: com.chartboost.sdk.impl.n$a */
    class C1953a implements Comparator<File> {
        C1953a(C1952n nVar) {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            return Long.valueOf(file.lastModified()).compareTo(Long.valueOf(file2.lastModified()));
        }
    }

    public C1952n(Executor executor, C1828g gVar, C1855g gVar2, C1856h hVar, AtomicReference<C1844h> atomicReference, C1832j jVar) {
        this.f5007a = executor;
        this.f5012f = gVar;
        this.f5008b = gVar2;
        this.f5009c = hVar;
        this.f5010d = atomicReference;
        this.f5011e = jVar;
        this.f5015i = new PriorityQueue<>();
    }

    /* renamed from: d */
    private void m4721d() {
        C1942l poll;
        C1942l peek;
        if (!(this.f5014h == null || (peek = this.f5015i.peek()) == null)) {
            C1947m mVar = this.f5014h;
            if (mVar.f4994l.f4974b > peek.f4974b && mVar.mo14334b()) {
                this.f5015i.add(this.f5014h.f4994l);
                this.f5014h = null;
            }
        }
        while (this.f5014h == null && (poll = this.f5015i.poll()) != null) {
            if (poll.f4979g.get() > 0) {
                File file = new File(this.f5012f.mo14234a().f4393a, poll.f4977e);
                if (file.exists() || file.mkdirs() || file.isDirectory()) {
                    File file2 = new File(file, poll.f4975c);
                    if (file2.exists()) {
                        this.f5012f.mo14240c(file2);
                        poll.mo14689a(this.f5007a, true);
                    } else {
                        C1947m mVar2 = new C1947m(this, this.f5009c, poll, file2);
                        this.f5014h = mVar2;
                        this.f5008b.mo14335a(mVar2);
                    }
                } else {
                    CBLogging.m3993b("Downloader", "Unable to create directory " + file.getPath());
                    poll.mo14689a(this.f5007a, false);
                }
            }
        }
        if (this.f5014h != null) {
            if (this.f5013g != 2) {
                CBLogging.m3991a("Downloader", "Change state to DOWNLOADING");
                this.f5013g = 2;
            }
        } else if (this.f5013g != 1) {
            CBLogging.m3991a("Downloader", "Change state to IDLE");
            this.f5013g = 1;
        }
    }

    /* renamed from: a */
    public synchronized void mo14707a(int i, Map<String, C1837b> map, AtomicInteger atomicInteger, C1936j jVar, String str) {
        synchronized (this) {
            long b = this.f5011e.mo14255b();
            AtomicInteger atomicInteger2 = new AtomicInteger();
            AtomicReference atomicReference = new AtomicReference(jVar);
            for (C1837b next : map.values()) {
                long j = b;
                long j2 = b;
                C1942l lVar = r2;
                C1942l lVar2 = new C1942l(this.f5011e, i, next.f4442b, next.f4443c, next.f4441a, atomicInteger, atomicReference, j, atomicInteger2, str);
                this.f5015i.add(lVar);
                atomicReference = atomicReference;
                b = j2;
            }
            int i2 = this.f5013g;
            if (i2 == 1 || i2 == 2) {
                m4721d();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x013d A[Catch:{ Exception -> 0x018d }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x017e A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo14710b() {
        /*
            r24 = this;
            r1 = r24
            monitor-enter(r24)
            int r0 = r1.f5013g     // Catch:{ all -> 0x01aa }
            r2 = 1
            if (r0 == r2) goto L_0x000a
            monitor-exit(r24)
            return
        L_0x000a:
            java.lang.String r0 = "Downloader"
            java.lang.String r3 = "########### Trimming the disk cache"
            com.chartboost.sdk.Libraries.CBLogging.m3991a(r0, r3)     // Catch:{ Exception -> 0x018d }
            com.chartboost.sdk.Libraries.g r0 = r1.f5012f     // Catch:{ Exception -> 0x018d }
            com.chartboost.sdk.Libraries.h r0 = r0.mo14234a()     // Catch:{ Exception -> 0x018d }
            java.io.File r0 = r0.f4393a     // Catch:{ Exception -> 0x018d }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x018d }
            r3.<init>()     // Catch:{ Exception -> 0x018d }
            java.lang.String[] r4 = r0.list()     // Catch:{ Exception -> 0x018d }
            if (r4 == 0) goto L_0x0065
            int r6 = r4.length     // Catch:{ Exception -> 0x018d }
            if (r6 <= 0) goto L_0x0065
            int r6 = r4.length     // Catch:{ Exception -> 0x018d }
            r7 = 0
        L_0x0029:
            if (r7 >= r6) goto L_0x0065
            r8 = r4[r7]     // Catch:{ Exception -> 0x018d }
            java.lang.String r9 = "requests"
            boolean r9 = r8.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x018d }
            if (r9 != 0) goto L_0x0062
            java.lang.String r9 = "track"
            boolean r9 = r8.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x018d }
            if (r9 != 0) goto L_0x0062
            java.lang.String r9 = "session"
            boolean r9 = r8.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x018d }
            if (r9 != 0) goto L_0x0062
            java.lang.String r9 = "videoCompletionEvents"
            boolean r9 = r8.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x018d }
            if (r9 != 0) goto L_0x0062
            java.lang.String r9 = "."
            boolean r9 = r8.contains(r9)     // Catch:{ Exception -> 0x018d }
            if (r9 == 0) goto L_0x0056
            goto L_0x0062
        L_0x0056:
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x018d }
            r9.<init>(r0, r8)     // Catch:{ Exception -> 0x018d }
            java.util.ArrayList r8 = com.chartboost.sdk.Libraries.CBUtility.m4001a((java.io.File) r9, (boolean) r2)     // Catch:{ Exception -> 0x018d }
            r3.addAll(r8)     // Catch:{ Exception -> 0x018d }
        L_0x0062:
            int r7 = r7 + 1
            goto L_0x0029
        L_0x0065:
            int r0 = r3.size()     // Catch:{ Exception -> 0x018d }
            java.io.File[] r4 = new java.io.File[r0]     // Catch:{ Exception -> 0x018d }
            r3.toArray(r4)     // Catch:{ Exception -> 0x018d }
            if (r0 <= r2) goto L_0x0078
            com.chartboost.sdk.impl.n$a r3 = new com.chartboost.sdk.impl.n$a     // Catch:{ Exception -> 0x018d }
            r3.<init>(r1)     // Catch:{ Exception -> 0x018d }
            java.util.Arrays.sort(r4, r3)     // Catch:{ Exception -> 0x018d }
        L_0x0078:
            if (r0 <= 0) goto L_0x0187
            java.util.concurrent.atomic.AtomicReference<com.chartboost.sdk.Model.h> r3 = r1.f5010d     // Catch:{ Exception -> 0x018d }
            java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x018d }
            com.chartboost.sdk.Model.h r3 = (com.chartboost.sdk.Model.C1844h) r3     // Catch:{ Exception -> 0x018d }
            int r6 = r3.f4532m     // Catch:{ Exception -> 0x018d }
            long r6 = (long) r6     // Catch:{ Exception -> 0x018d }
            com.chartboost.sdk.Libraries.g r8 = r1.f5012f     // Catch:{ Exception -> 0x018d }
            com.chartboost.sdk.Libraries.g r9 = r1.f5012f     // Catch:{ Exception -> 0x018d }
            com.chartboost.sdk.Libraries.h r9 = r9.mo14234a()     // Catch:{ Exception -> 0x018d }
            java.io.File r9 = r9.f4396d     // Catch:{ Exception -> 0x018d }
            long r8 = r8.mo14233a((java.io.File) r9)     // Catch:{ Exception -> 0x018d }
            com.chartboost.sdk.Libraries.j r10 = r1.f5011e     // Catch:{ Exception -> 0x018d }
            long r10 = r10.mo14254a()     // Catch:{ Exception -> 0x018d }
            java.util.List<java.lang.String> r12 = r3.f4523d     // Catch:{ Exception -> 0x018d }
            java.lang.String r13 = "Downloader"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018d }
            r14.<init>()     // Catch:{ Exception -> 0x018d }
            java.lang.String r15 = "Total local file count:"
            r14.append(r15)     // Catch:{ Exception -> 0x018d }
            r14.append(r0)     // Catch:{ Exception -> 0x018d }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x018d }
            com.chartboost.sdk.Libraries.CBLogging.m3991a(r13, r14)     // Catch:{ Exception -> 0x018d }
            java.lang.String r13 = "Downloader"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018d }
            r14.<init>()     // Catch:{ Exception -> 0x018d }
            java.lang.String r15 = "Video Folder Size in bytes :"
            r14.append(r15)     // Catch:{ Exception -> 0x018d }
            r14.append(r8)     // Catch:{ Exception -> 0x018d }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x018d }
            com.chartboost.sdk.Libraries.CBLogging.m3991a(r13, r14)     // Catch:{ Exception -> 0x018d }
            java.lang.String r13 = "Downloader"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018d }
            r14.<init>()     // Catch:{ Exception -> 0x018d }
            java.lang.String r15 = "Max Bytes allowed:"
            r14.append(r15)     // Catch:{ Exception -> 0x018d }
            r14.append(r6)     // Catch:{ Exception -> 0x018d }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x018d }
            com.chartboost.sdk.Libraries.CBLogging.m3991a(r13, r14)     // Catch:{ Exception -> 0x018d }
            r13 = 0
        L_0x00de:
            if (r13 >= r0) goto L_0x0187
            r14 = r4[r13]     // Catch:{ Exception -> 0x018d }
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x018d }
            long r16 = r14.lastModified()     // Catch:{ Exception -> 0x018d }
            r18 = r6
            long r5 = r10 - r16
            long r5 = r15.toDays(r5)     // Catch:{ Exception -> 0x018d }
            int r7 = r3.f4534o     // Catch:{ Exception -> 0x018d }
            r16 = r3
            long r2 = (long) r7     // Catch:{ Exception -> 0x018d }
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x00fb
            r2 = 1
            goto L_0x00fc
        L_0x00fb:
            r2 = 0
        L_0x00fc:
            java.lang.String r3 = r14.getName()     // Catch:{ Exception -> 0x018d }
            java.lang.String r5 = ".tmp"
            boolean r3 = r3.endsWith(r5)     // Catch:{ Exception -> 0x018d }
            java.io.File r5 = r14.getParentFile()     // Catch:{ Exception -> 0x018d }
            java.lang.String r6 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x018d }
            java.lang.String r7 = "/videos"
            boolean r6 = r6.contains(r7)     // Catch:{ Exception -> 0x018d }
            int r7 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r7 <= 0) goto L_0x011c
            if (r6 == 0) goto L_0x011c
            r7 = 1
            goto L_0x011d
        L_0x011c:
            r7 = 0
        L_0x011d:
            long r20 = r14.length()     // Catch:{ Exception -> 0x018d }
            r22 = 0
            int r17 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r17 == 0) goto L_0x013a
            if (r3 != 0) goto L_0x013a
            if (r2 != 0) goto L_0x013a
            java.lang.String r2 = r5.getName()     // Catch:{ Exception -> 0x018d }
            boolean r2 = r12.contains(r2)     // Catch:{ Exception -> 0x018d }
            if (r2 != 0) goto L_0x013a
            if (r7 == 0) goto L_0x0138
            goto L_0x013a
        L_0x0138:
            r2 = 0
            goto L_0x013b
        L_0x013a:
            r2 = 1
        L_0x013b:
            if (r2 == 0) goto L_0x017e
            if (r6 == 0) goto L_0x0144
            long r2 = r14.length()     // Catch:{ Exception -> 0x018d }
            long r8 = r8 - r2
        L_0x0144:
            java.lang.String r2 = "Downloader"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018d }
            r3.<init>()     // Catch:{ Exception -> 0x018d }
            java.lang.String r5 = "Deleting file at path:"
            r3.append(r5)     // Catch:{ Exception -> 0x018d }
            java.lang.String r5 = r14.getPath()     // Catch:{ Exception -> 0x018d }
            r3.append(r5)     // Catch:{ Exception -> 0x018d }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x018d }
            com.chartboost.sdk.Libraries.CBLogging.m3991a(r2, r3)     // Catch:{ Exception -> 0x018d }
            boolean r2 = r14.delete()     // Catch:{ Exception -> 0x018d }
            if (r2 != 0) goto L_0x017e
            java.lang.String r2 = "Downloader"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018d }
            r3.<init>()     // Catch:{ Exception -> 0x018d }
            java.lang.String r5 = "Unable to delete "
            r3.append(r5)     // Catch:{ Exception -> 0x018d }
            java.lang.String r5 = r14.getPath()     // Catch:{ Exception -> 0x018d }
            r3.append(r5)     // Catch:{ Exception -> 0x018d }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x018d }
            com.chartboost.sdk.Libraries.CBLogging.m3993b(r2, r3)     // Catch:{ Exception -> 0x018d }
        L_0x017e:
            int r13 = r13 + 1
            r3 = r16
            r6 = r18
            r2 = 1
            goto L_0x00de
        L_0x0187:
            com.chartboost.sdk.Libraries.g r0 = r1.f5012f     // Catch:{ Exception -> 0x018d }
            r0.mo14236b()     // Catch:{ Exception -> 0x018d }
            goto L_0x01a8
        L_0x018d:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01aa }
            r2.<init>()     // Catch:{ all -> 0x01aa }
            java.lang.String r3 = "reduceCacheSize: "
            r2.append(r3)     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01aa }
            r2.append(r0)     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01aa }
            java.lang.String r2 = "Downloader"
            com.chartboost.sdk.Libraries.CBLogging.m3993b(r2, r0)     // Catch:{ all -> 0x01aa }
        L_0x01a8:
            monitor-exit(r24)
            return
        L_0x01aa:
            r0 = move-exception
            monitor-exit(r24)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C1952n.mo14710b():void");
    }

    /* renamed from: c */
    public synchronized void mo14711c() {
        int i = this.f5013g;
        if (i == 3) {
            CBLogging.m3991a("Downloader", "Change state to DOWNLOADING");
            this.f5013g = 2;
        } else if (i == 4) {
            CBLogging.m3991a("Downloader", "Change state to IDLE");
            this.f5013g = 1;
            m4721d();
        }
    }

    /* renamed from: a */
    public synchronized void mo14709a(AtomicInteger atomicInteger) {
        atomicInteger.set(-10000);
        if (this.f5013g == 2) {
            if ((this.f5014h.f4994l.f4979g == atomicInteger) && this.f5014h.mo14334b()) {
                this.f5014h = null;
                m4721d();
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo14706a() {
        int i = this.f5013g;
        if (i == 1) {
            CBLogging.m3991a("Downloader", "Change state to PAUSED");
            this.f5013g = 4;
        } else if (i == 2) {
            if (this.f5014h.mo14334b()) {
                this.f5015i.add(this.f5014h.f4994l);
                this.f5014h = null;
                CBLogging.m3991a("Downloader", "Change state to PAUSED");
                this.f5013g = 4;
            } else {
                CBLogging.m3991a("Downloader", "Change state to PAUSING");
                this.f5013g = 3;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f4, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo14708a(com.chartboost.sdk.impl.C1947m r7, com.chartboost.sdk.Model.CBError r8, com.chartboost.sdk.Networking.C1854f r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.f5013g     // Catch:{ all -> 0x00f5 }
            r1 = 2
            r2 = 3
            if (r0 == r1) goto L_0x000b
            if (r0 == r2) goto L_0x000b
            goto L_0x00f3
        L_0x000b:
            com.chartboost.sdk.impl.m r0 = r6.f5014h     // Catch:{ all -> 0x00f5 }
            if (r7 == r0) goto L_0x0011
            monitor-exit(r6)
            return
        L_0x0011:
            com.chartboost.sdk.impl.l r0 = r7.f4994l     // Catch:{ all -> 0x00f5 }
            r1 = 0
            r6.f5014h = r1     // Catch:{ all -> 0x00f5 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x00f5 }
            long r3 = r7.f4565f     // Catch:{ all -> 0x00f5 }
            long r3 = r1.toMillis(r3)     // Catch:{ all -> 0x00f5 }
            java.util.concurrent.atomic.AtomicInteger r1 = r0.f4982j     // Catch:{ all -> 0x00f5 }
            int r4 = (int) r3     // Catch:{ all -> 0x00f5 }
            r1.addAndGet(r4)     // Catch:{ all -> 0x00f5 }
            java.util.concurrent.Executor r1 = r6.f5007a     // Catch:{ all -> 0x00f5 }
            if (r8 != 0) goto L_0x002a
            r3 = 1
            goto L_0x002b
        L_0x002a:
            r3 = 0
        L_0x002b:
            r0.mo14689a(r1, r3)     // Catch:{ all -> 0x00f5 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x00f5 }
            long r3 = r7.f4566g     // Catch:{ all -> 0x00f5 }
            r1.toMillis(r3)     // Catch:{ all -> 0x00f5 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x00f5 }
            long r3 = r7.f4567h     // Catch:{ all -> 0x00f5 }
            r1.toMillis(r3)     // Catch:{ all -> 0x00f5 }
            if (r8 != 0) goto L_0x0058
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r7.<init>()     // Catch:{ all -> 0x00f5 }
            java.lang.String r8 = "Downloaded "
            r7.append(r8)     // Catch:{ all -> 0x00f5 }
            java.lang.String r8 = r0.f4976d     // Catch:{ all -> 0x00f5 }
            r7.append(r8)     // Catch:{ all -> 0x00f5 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00f5 }
            java.lang.String r8 = "Downloader"
            com.chartboost.sdk.Libraries.CBLogging.m3991a(r8, r7)     // Catch:{ all -> 0x00f5 }
            goto L_0x00e1
        L_0x0058:
            java.lang.String r1 = ""
            com.chartboost.sdk.impl.l r7 = r7.f4994l     // Catch:{ all -> 0x00f5 }
            if (r7 == 0) goto L_0x0060
            java.lang.String r1 = r7.f4978f     // Catch:{ all -> 0x00f5 }
        L_0x0060:
            java.lang.String r7 = r8.getErrorDesc()     // Catch:{ all -> 0x00f5 }
            java.lang.String r8 = "Downloader"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r3.<init>()     // Catch:{ all -> 0x00f5 }
            java.lang.String r4 = "Failed to download "
            r3.append(r4)     // Catch:{ all -> 0x00f5 }
            java.lang.String r4 = r0.f4976d     // Catch:{ all -> 0x00f5 }
            r3.append(r4)     // Catch:{ all -> 0x00f5 }
            if (r9 == 0) goto L_0x008b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r4.<init>()     // Catch:{ all -> 0x00f5 }
            java.lang.String r5 = " Status code="
            r4.append(r5)     // Catch:{ all -> 0x00f5 }
            int r9 = r9.f4574a     // Catch:{ all -> 0x00f5 }
            r4.append(r9)     // Catch:{ all -> 0x00f5 }
            java.lang.String r9 = r4.toString()     // Catch:{ all -> 0x00f5 }
            goto L_0x008d
        L_0x008b:
            java.lang.String r9 = ""
        L_0x008d:
            r3.append(r9)     // Catch:{ all -> 0x00f5 }
            if (r7 == 0) goto L_0x00a4
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r9.<init>()     // Catch:{ all -> 0x00f5 }
            java.lang.String r4 = " Error message="
            r9.append(r4)     // Catch:{ all -> 0x00f5 }
            r9.append(r7)     // Catch:{ all -> 0x00f5 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00f5 }
            goto L_0x00a6
        L_0x00a4:
            java.lang.String r9 = ""
        L_0x00a6:
            r3.append(r9)     // Catch:{ all -> 0x00f5 }
            java.lang.String r9 = r3.toString()     // Catch:{ all -> 0x00f5 }
            com.chartboost.sdk.Libraries.CBLogging.m3991a(r8, r9)     // Catch:{ all -> 0x00f5 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r8.<init>()     // Catch:{ all -> 0x00f5 }
            java.lang.String r9 = "Name: "
            r8.append(r9)     // Catch:{ all -> 0x00f5 }
            java.lang.String r9 = r0.f4975c     // Catch:{ all -> 0x00f5 }
            r8.append(r9)     // Catch:{ all -> 0x00f5 }
            java.lang.String r9 = " Url: "
            r8.append(r9)     // Catch:{ all -> 0x00f5 }
            java.lang.String r9 = r0.f4976d     // Catch:{ all -> 0x00f5 }
            r8.append(r9)     // Catch:{ all -> 0x00f5 }
            java.lang.String r9 = " Error: "
            r8.append(r9)     // Catch:{ all -> 0x00f5 }
            r8.append(r7)     // Catch:{ all -> 0x00f5 }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x00f5 }
            com.chartboost.sdk.Tracking.c r8 = new com.chartboost.sdk.Tracking.c     // Catch:{ all -> 0x00f5 }
            java.lang.String r9 = "cache_asset_download_error"
            java.lang.String r0 = ""
            r8.<init>(r9, r7, r1, r0)     // Catch:{ all -> 0x00f5 }
            com.chartboost.sdk.Tracking.C1874e.m4311e(r8)     // Catch:{ all -> 0x00f5 }
        L_0x00e1:
            int r7 = r6.f5013g     // Catch:{ all -> 0x00f5 }
            if (r7 != r2) goto L_0x00f0
            java.lang.String r7 = "Downloader"
            java.lang.String r8 = "Change state to PAUSED"
            com.chartboost.sdk.Libraries.CBLogging.m3991a(r7, r8)     // Catch:{ all -> 0x00f5 }
            r7 = 4
            r6.f5013g = r7     // Catch:{ all -> 0x00f5 }
            goto L_0x00f3
        L_0x00f0:
            r6.m4721d()     // Catch:{ all -> 0x00f5 }
        L_0x00f3:
            monitor-exit(r6)
            return
        L_0x00f5:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C1952n.mo14708a(com.chartboost.sdk.impl.m, com.chartboost.sdk.Model.CBError, com.chartboost.sdk.Networking.f):void");
    }
}
