package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.C13045fd;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.yandex.mobile.ads.impl.sl */
public class C14603sl implements C13045fd {

    /* renamed from: a */
    private final Map<String, C14605b> f40015a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b */
    private long f40016b = 0;

    /* renamed from: c */
    private final C14607d f40017c;

    /* renamed from: d */
    private final int f40018d;

    /* renamed from: com.yandex.mobile.ads.impl.sl$a */
    class C14604a implements C14607d {

        /* renamed from: a */
        final /* synthetic */ File f40019a;

        C14604a(C14603sl slVar, File file) {
            this.f40019a = file;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sl$d */
    public interface C14607d {
    }

    public C14603sl(File file, int i) {
        this.f40017c = new C14604a(this, file);
        this.f40018d = i;
    }

    /* renamed from: c */
    private String m42042c(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length).hashCode());
        return valueOf + String.valueOf(str.substring(length).hashCode());
    }

    /* renamed from: a */
    public synchronized C13045fd.C13046a mo66989a(String str) {
        C14606c cVar;
        C14605b bVar = this.f40015a.get(str);
        if (bVar == null) {
            return null;
        }
        File b = mo70019b(str);
        try {
            cVar = new C14606c(new BufferedInputStream(new FileInputStream(b)), b.length());
            C14605b a = C14605b.m42048a(cVar);
            if (!TextUtils.equals(str, a.f40021b)) {
                pp1.m40899b("%s: key=%s, found=%s", b.getAbsolutePath(), str, a.f40021b);
                C14605b remove = this.f40015a.remove(str);
                if (remove != null) {
                    this.f40016b -= remove.f40020a;
                }
                cVar.close();
                return null;
            }
            C13045fd.C13046a a2 = bVar.mo70020a(m42039a(cVar, cVar.mo70022b()));
            cVar.close();
            return a2;
        } catch (IOException e) {
            pp1.m40899b("%s: %s", b.getAbsolutePath(), e.toString());
            synchronized (this) {
                boolean delete = mo70019b(str).delete();
                C14605b remove2 = this.f40015a.remove(str);
                if (remove2 != null) {
                    this.f40016b -= remove2.f40020a;
                }
                if (!delete) {
                    pp1.m40899b("Could not delete cache entry for key=%s, filename=%s", str, m42042c(str));
                }
                return null;
            }
        } catch (Throwable th) {
            cVar.close();
            throw th;
        }
    }

    /* renamed from: b */
    public File mo70019b(String str) {
        return new File(((C14604a) this.f40017c).f40019a, m42042c(str));
    }

    /* renamed from: com.yandex.mobile.ads.impl.sl$c */
    static class C14606c extends FilterInputStream {

        /* renamed from: b */
        private final long f40028b;

        /* renamed from: c */
        private long f40029c;

        C14606c(InputStream inputStream, long j) {
            super(inputStream);
            this.f40028b = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public long mo70022b() {
            return this.f40028b - this.f40029c;
        }

        public int read() throws IOException {
            int read = super.read();
            if (read != -1) {
                this.f40029c++;
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.f40029c += (long) read;
            }
            return read;
        }
    }

    /* renamed from: b */
    private void m42041b() {
        if (this.f40016b >= ((long) this.f40018d)) {
            if (pp1.f38780b) {
                pp1.m40901d("Pruning old cache entries.", new Object[0]);
            }
            long j = this.f40016b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator<Map.Entry<String, C14605b>> it = this.f40015a.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                C14605b bVar = (C14605b) it.next().getValue();
                if (mo70019b(bVar.f40021b).delete()) {
                    this.f40016b -= bVar.f40020a;
                } else {
                    String str = bVar.f40021b;
                    pp1.m40899b("Could not delete cache entry for key=%s, filename=%s", str, m42042c(str));
                }
                it.remove();
                i++;
                if (((float) this.f40016b) < ((float) this.f40018d) * 0.9f) {
                    break;
                }
            }
            if (pp1.f38780b) {
                pp1.m40901d("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.f40016b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sl$b */
    static class C14605b {

        /* renamed from: a */
        long f40020a;

        /* renamed from: b */
        final String f40021b;

        /* renamed from: c */
        final String f40022c;

        /* renamed from: d */
        final long f40023d;

        /* renamed from: e */
        final long f40024e;

        /* renamed from: f */
        final long f40025f;

        /* renamed from: g */
        final long f40026g;

        /* renamed from: h */
        final List<n90> f40027h;

        private C14605b(String str, String str2, long j, long j2, long j3, long j4, List<n90> list) {
            this.f40021b = str;
            this.f40022c = "".equals(str2) ? null : str2;
            this.f40023d = j;
            this.f40024e = j2;
            this.f40025f = j3;
            this.f40026g = j4;
            this.f40027h = list;
        }

        /* renamed from: a */
        private static List<n90> m42049a(C13045fd.C13046a aVar) {
            List<n90> list = aVar.f33326h;
            if (list != null) {
                return list;
            }
            Map<String, String> map = aVar.f33325g;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry next : map.entrySet()) {
                arrayList.add(new n90((String) next.getKey(), (String) next.getValue()));
            }
            return arrayList;
        }

        C14605b(String str, C13045fd.C13046a aVar) {
            this(str, aVar.f33320b, aVar.f33321c, aVar.f33322d, aVar.f33323e, aVar.f33324f, m42049a(aVar));
        }

        /* renamed from: a */
        static C14605b m42048a(C14606c cVar) throws IOException {
            C14606c cVar2 = cVar;
            if (C14603sl.m42034a((InputStream) cVar) == 538247942) {
                String str = new String(C14603sl.m42039a(cVar2, C14603sl.m42040b((InputStream) cVar)), "UTF-8");
                String str2 = new String(C14603sl.m42039a(cVar2, C14603sl.m42040b((InputStream) cVar)), "UTF-8");
                long b = C14603sl.m42040b((InputStream) cVar);
                long b2 = C14603sl.m42040b((InputStream) cVar);
                long b3 = C14603sl.m42040b((InputStream) cVar);
                long b4 = C14603sl.m42040b((InputStream) cVar);
                int a = C14603sl.m42034a((InputStream) cVar);
                if (a >= 0) {
                    List emptyList = a == 0 ? Collections.emptyList() : new ArrayList();
                    int i = 0;
                    while (i < a) {
                        emptyList.add(new n90(new String(C14603sl.m42039a(cVar2, C14603sl.m42040b((InputStream) cVar)), "UTF-8").intern(), new String(C14603sl.m42039a(cVar2, C14603sl.m42040b((InputStream) cVar)), "UTF-8").intern()));
                        i++;
                        b4 = b4;
                        b3 = b3;
                    }
                    long j = b3;
                    long j2 = b4;
                    return new C14605b(str, str2, b, b2, b3, b4, emptyList);
                }
                throw new IOException("readHeaderList size=" + a);
            }
            throw new IOException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C13045fd.C13046a mo70020a(byte[] bArr) {
            C13045fd.C13046a aVar = new C13045fd.C13046a();
            aVar.f33319a = bArr;
            aVar.f33320b = this.f40022c;
            aVar.f33321c = this.f40023d;
            aVar.f33322d = this.f40024e;
            aVar.f33323e = this.f40025f;
            aVar.f33324f = this.f40026g;
            List<n90> list = this.f40027h;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (n90 next : list) {
                treeMap.put(next.mo68936a(), next.mo68937b());
            }
            aVar.f33325g = treeMap;
            aVar.f33326h = Collections.unmodifiableList(this.f40027h);
            return aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo70021a(OutputStream outputStream) {
            try {
                C14603sl.m42035a(outputStream, 538247942);
                C14603sl.m42037a(outputStream, this.f40021b);
                String str = this.f40022c;
                if (str == null) {
                    str = "";
                }
                C14603sl.m42037a(outputStream, str);
                C14603sl.m42036a(outputStream, this.f40023d);
                C14603sl.m42036a(outputStream, this.f40024e);
                C14603sl.m42036a(outputStream, this.f40025f);
                C14603sl.m42036a(outputStream, this.f40026g);
                List<n90> list = this.f40027h;
                if (list != null) {
                    C14603sl.m42035a(outputStream, list.size());
                    for (n90 next : list) {
                        C14603sl.m42037a(outputStream, next.mo68936a());
                        C14603sl.m42037a(outputStream, next.mo68937b());
                    }
                } else {
                    C14603sl.m42035a(outputStream, 0);
                }
                outputStream.flush();
                return true;
            } catch (IOException e) {
                pp1.m40899b("%s", e.toString());
                return false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0058 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo66990a() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.yandex.mobile.ads.impl.sl$d r0 = r9.f40017c     // Catch:{ all -> 0x0060 }
            com.yandex.mobile.ads.impl.sl$a r0 = (com.yandex.mobile.ads.impl.C14603sl.C14604a) r0     // Catch:{ all -> 0x0060 }
            java.io.File r0 = r0.f40019a     // Catch:{ all -> 0x0060 }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x0060 }
            r2 = 0
            if (r1 != 0) goto L_0x0024
            boolean r1 = r0.mkdirs()     // Catch:{ all -> 0x0060 }
            if (r1 != 0) goto L_0x0022
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0060 }
            r1[r2] = r0     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = "Unable to create cache dir %s"
            com.yandex.mobile.ads.impl.pp1.m40900c(r0, r1)     // Catch:{ all -> 0x0060 }
        L_0x0022:
            monitor-exit(r9)
            return
        L_0x0024:
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x002c
            monitor-exit(r9)
            return
        L_0x002c:
            int r1 = r0.length     // Catch:{ all -> 0x0060 }
        L_0x002d:
            if (r2 >= r1) goto L_0x005e
            r3 = r0[r2]     // Catch:{ all -> 0x0060 }
            long r4 = r3.length()     // Catch:{ IOException -> 0x0058 }
            com.yandex.mobile.ads.impl.sl$c r6 = new com.yandex.mobile.ads.impl.sl$c     // Catch:{ IOException -> 0x0058 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0058 }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0058 }
            r8.<init>(r3)     // Catch:{ IOException -> 0x0058 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0058 }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x0058 }
            com.yandex.mobile.ads.impl.sl$b r7 = com.yandex.mobile.ads.impl.C14603sl.C14605b.m42048a((com.yandex.mobile.ads.impl.C14603sl.C14606c) r6)     // Catch:{ all -> 0x0053 }
            r7.f40020a = r4     // Catch:{ all -> 0x0053 }
            java.lang.String r4 = r7.f40021b     // Catch:{ all -> 0x0053 }
            r9.m42038a((java.lang.String) r4, (com.yandex.mobile.ads.impl.C14603sl.C14605b) r7)     // Catch:{ all -> 0x0053 }
            r6.close()     // Catch:{ IOException -> 0x0058 }
            goto L_0x005b
        L_0x0053:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0058 }
            throw r4     // Catch:{ IOException -> 0x0058 }
        L_0x0058:
            r3.delete()     // Catch:{ all -> 0x0060 }
        L_0x005b:
            int r2 = r2 + 1
            goto L_0x002d
        L_0x005e:
            monitor-exit(r9)
            return
        L_0x0060:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14603sl.mo66990a():void");
    }

    /* renamed from: b */
    static long m42040b(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            long j = ((((long) read) & 255) << 0) | 0;
            int read2 = inputStream.read();
            if (read2 != -1) {
                long j2 = j | ((((long) read2) & 255) << 8);
                int read3 = inputStream.read();
                if (read3 != -1) {
                    long j3 = j2 | ((((long) read3) & 255) << 16);
                    int read4 = inputStream.read();
                    if (read4 != -1) {
                        long j4 = j3 | ((((long) read4) & 255) << 24);
                        int read5 = inputStream.read();
                        if (read5 != -1) {
                            long j5 = j4 | ((((long) read5) & 255) << 32);
                            int read6 = inputStream.read();
                            if (read6 != -1) {
                                long j6 = j5 | ((((long) read6) & 255) << 40);
                                int read7 = inputStream.read();
                                if (read7 != -1) {
                                    long j7 = j6 | ((((long) read7) & 255) << 48);
                                    int read8 = inputStream.read();
                                    if (read8 != -1) {
                                        return ((((long) read8) & 255) << 56) | j7;
                                    }
                                    throw new EOFException();
                                }
                                throw new EOFException();
                            }
                            throw new EOFException();
                        }
                        throw new EOFException();
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    /* renamed from: a */
    public synchronized void mo66992a(String str, boolean z) {
        C13045fd.C13046a a = mo66989a(str);
        if (a != null) {
            a.f33324f = 0;
            if (z) {
                a.f33323e = 0;
            }
            mo66991a(str, a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        if (r0.delete() == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        com.yandex.mobile.ads.impl.pp1.m40899b("Could not clean up file %s", r0.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        if (((com.yandex.mobile.ads.impl.C14603sl.C14604a) r7.f40017c).f40019a.exists() == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0082, code lost:
        com.yandex.mobile.ads.impl.pp1.m40899b("Re-initializing cache after external clearing.", new java.lang.Object[0]);
        r7.f40015a.clear();
        r7.f40016b = 0;
        mo66990a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0096, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0063 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo66991a(java.lang.String r8, com.yandex.mobile.ads.impl.C13045fd.C13046a r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            long r0 = r7.f40016b     // Catch:{ all -> 0x0097 }
            byte[] r2 = r9.f33319a     // Catch:{ all -> 0x0097 }
            int r3 = r2.length     // Catch:{ all -> 0x0097 }
            long r3 = (long) r3     // Catch:{ all -> 0x0097 }
            long r0 = r0 + r3
            int r3 = r7.f40018d     // Catch:{ all -> 0x0097 }
            long r4 = (long) r3     // Catch:{ all -> 0x0097 }
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x001d
            int r0 = r2.length     // Catch:{ all -> 0x0097 }
            float r0 = (float) r0
            float r1 = (float) r3
            r2 = 1063675494(0x3f666666, float:0.9)
            float r1 = r1 * r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x001d
            monitor-exit(r7)
            return
        L_0x001d:
            java.io.File r0 = r7.mo70019b((java.lang.String) r8)     // Catch:{ all -> 0x0097 }
            r1 = 1
            r2 = 0
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0063 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0063 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0063 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0063 }
            com.yandex.mobile.ads.impl.sl$b r4 = new com.yandex.mobile.ads.impl.sl$b     // Catch:{ IOException -> 0x0063 }
            r4.<init>(r8, r9)     // Catch:{ IOException -> 0x0063 }
            boolean r5 = r4.mo70021a((java.io.OutputStream) r3)     // Catch:{ IOException -> 0x0063 }
            if (r5 == 0) goto L_0x004d
            byte[] r9 = r9.f33319a     // Catch:{ IOException -> 0x0063 }
            r3.write(r9)     // Catch:{ IOException -> 0x0063 }
            r3.close()     // Catch:{ IOException -> 0x0063 }
            long r5 = r0.length()     // Catch:{ IOException -> 0x0063 }
            r4.f40020a = r5     // Catch:{ IOException -> 0x0063 }
            r7.m42038a((java.lang.String) r8, (com.yandex.mobile.ads.impl.C14603sl.C14605b) r4)     // Catch:{ IOException -> 0x0063 }
            r7.m42041b()     // Catch:{ IOException -> 0x0063 }
            goto L_0x0095
        L_0x004d:
            r3.close()     // Catch:{ IOException -> 0x0063 }
            java.lang.String r8 = "Failed to write header for %s"
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x0063 }
            java.lang.String r3 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x0063 }
            r9[r2] = r3     // Catch:{ IOException -> 0x0063 }
            com.yandex.mobile.ads.impl.pp1.m40899b(r8, r9)     // Catch:{ IOException -> 0x0063 }
            java.io.IOException r8 = new java.io.IOException     // Catch:{ IOException -> 0x0063 }
            r8.<init>()     // Catch:{ IOException -> 0x0063 }
            throw r8     // Catch:{ IOException -> 0x0063 }
        L_0x0063:
            boolean r8 = r0.delete()     // Catch:{ all -> 0x0097 }
            if (r8 != 0) goto L_0x0076
            java.lang.Object[] r8 = new java.lang.Object[r1]     // Catch:{ all -> 0x0097 }
            java.lang.String r9 = r0.getAbsolutePath()     // Catch:{ all -> 0x0097 }
            r8[r2] = r9     // Catch:{ all -> 0x0097 }
            java.lang.String r9 = "Could not clean up file %s"
            com.yandex.mobile.ads.impl.pp1.m40899b(r9, r8)     // Catch:{ all -> 0x0097 }
        L_0x0076:
            com.yandex.mobile.ads.impl.sl$d r8 = r7.f40017c     // Catch:{ all -> 0x0097 }
            com.yandex.mobile.ads.impl.sl$a r8 = (com.yandex.mobile.ads.impl.C14603sl.C14604a) r8     // Catch:{ all -> 0x0097 }
            java.io.File r8 = r8.f40019a     // Catch:{ all -> 0x0097 }
            boolean r8 = r8.exists()     // Catch:{ all -> 0x0097 }
            if (r8 != 0) goto L_0x0095
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x0097 }
            java.lang.String r9 = "Re-initializing cache after external clearing."
            com.yandex.mobile.ads.impl.pp1.m40899b(r9, r8)     // Catch:{ all -> 0x0097 }
            java.util.Map<java.lang.String, com.yandex.mobile.ads.impl.sl$b> r8 = r7.f40015a     // Catch:{ all -> 0x0097 }
            r8.clear()     // Catch:{ all -> 0x0097 }
            r8 = 0
            r7.f40016b = r8     // Catch:{ all -> 0x0097 }
            r7.mo66990a()     // Catch:{ all -> 0x0097 }
        L_0x0095:
            monitor-exit(r7)
            return
        L_0x0097:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14603sl.mo66991a(java.lang.String, com.yandex.mobile.ads.impl.fd$a):void");
    }

    /* renamed from: a */
    private void m42038a(String str, C14605b bVar) {
        if (!this.f40015a.containsKey(str)) {
            this.f40016b += bVar.f40020a;
        } else {
            this.f40016b += bVar.f40020a - this.f40015a.get(str).f40020a;
        }
        this.f40015a.put(str, bVar);
    }

    /* renamed from: a */
    static byte[] m42039a(C14606c cVar, long j) throws IOException {
        long b = cVar.mo70022b();
        if (j >= 0 && j <= b) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(cVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + b);
    }

    /* renamed from: a */
    static int m42034a(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            int i = (read << 0) | 0;
            int read2 = inputStream.read();
            if (read2 != -1) {
                int i2 = i | (read2 << 8);
                int read3 = inputStream.read();
                if (read3 != -1) {
                    int i3 = i2 | (read3 << 16);
                    int read4 = inputStream.read();
                    if (read4 != -1) {
                        return (read4 << 24) | i3;
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    /* renamed from: a */
    static void m42035a(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* renamed from: a */
    static void m42036a(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) ((int) (j >>> 0)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: a */
    static void m42037a(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        m42036a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }
}
