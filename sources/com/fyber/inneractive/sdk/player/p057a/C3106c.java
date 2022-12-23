package com.fyber.inneractive.sdk.player.p057a;

import com.fyber.inneractive.sdk.util.IAlog;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.a.c */
final class C3106c implements Closeable {

    /* renamed from: a */
    static final Pattern f7637a = Pattern.compile("[a-z0-9_-]{1,120}");
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final OutputStream f7638q = new OutputStream() {
        public final void write(int i) throws IOException {
        }
    };

    /* renamed from: b */
    final LinkedHashMap<String, C3111b> f7639b = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: c */
    C3112c f7640c;

    /* renamed from: d */
    final ThreadPoolExecutor f7641d = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final File f7642e;

    /* renamed from: f */
    private final File f7643f;

    /* renamed from: g */
    private final File f7644g;

    /* renamed from: h */
    private final File f7645h;

    /* renamed from: i */
    private final int f7646i;

    /* renamed from: j */
    private long f7647j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final int f7648k;

    /* renamed from: l */
    private long f7649l = 0;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Writer f7650m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f7651n;

    /* renamed from: o */
    private long f7652o = 0;

    /* renamed from: p */
    private final Callable<Void> f7653p = new Callable<Void>() {
        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() throws java.lang.Exception {
            /*
                r3 = this;
                com.fyber.inneractive.sdk.player.a.c r0 = com.fyber.inneractive.sdk.player.p057a.C3106c.this
                monitor-enter(r0)
                com.fyber.inneractive.sdk.player.a.c r1 = com.fyber.inneractive.sdk.player.p057a.C3106c.this     // Catch:{ all -> 0x0027 }
                java.io.Writer r1 = r1.f7650m     // Catch:{ all -> 0x0027 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                return r2
            L_0x000e:
                com.fyber.inneractive.sdk.player.a.c r1 = com.fyber.inneractive.sdk.player.p057a.C3106c.this     // Catch:{ all -> 0x0027 }
                r1.m7351j()     // Catch:{ all -> 0x0027 }
                com.fyber.inneractive.sdk.player.a.c r1 = com.fyber.inneractive.sdk.player.p057a.C3106c.this     // Catch:{ all -> 0x0027 }
                boolean r1 = r1.m7350i()     // Catch:{ all -> 0x0027 }
                if (r1 == 0) goto L_0x0025
                com.fyber.inneractive.sdk.player.a.c r1 = com.fyber.inneractive.sdk.player.p057a.C3106c.this     // Catch:{ all -> 0x0027 }
                r1.m7349h()     // Catch:{ all -> 0x0027 }
                com.fyber.inneractive.sdk.player.a.c r1 = com.fyber.inneractive.sdk.player.p057a.C3106c.this     // Catch:{ all -> 0x0027 }
                int unused = r1.f7651n = 0     // Catch:{ all -> 0x0027 }
            L_0x0025:
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                return r2
            L_0x0027:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p057a.C3106c.C31071.call():java.lang.Void");
        }
    };

    /* renamed from: com.fyber.inneractive.sdk.player.a.c$c */
    public interface C3112c {
        /* renamed from: a */
        boolean mo18700a(String str);
    }

    private C3106c(File file) {
        this.f7642e = file;
        this.f7646i = 0;
        this.f7643f = new File(file, "journal");
        this.f7644g = new File(file, "journal.tmp");
        this.f7645h = new File(file, "journal.bkp");
        this.f7648k = 1;
        this.f7647j = 52428800;
    }

    /* renamed from: a */
    public static C3106c m7333a(File file) throws IOException {
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m7337a(file2, file3, false);
            }
        }
        C3106c cVar = new C3106c(file);
        if (cVar.f7643f.exists()) {
            try {
                cVar.m7346f();
                cVar.m7348g();
                return cVar;
            } catch (IOException e) {
                PrintStream printStream = System.out;
                printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                cVar.mo18686d();
            }
        }
        file.mkdirs();
        C3106c cVar2 = new C3106c(file);
        cVar2.m7349h();
        return cVar2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:52|53|(1:55)|(1:57)(1:58)|59|60) */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r12.f7651n = r2 - r12.f7639b.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0111, code lost:
        if (r1.f7758b == -1) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0113, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0114, code lost:
        if (r0 != false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0116, code lost:
        m7349h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011a, code lost:
        r12.f7650m = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r12.f7643f, true), com.fyber.inneractive.sdk.player.p057a.C3142m.f7763a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0132, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0106 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:61:0x0133=Splitter:B:61:0x0133, B:52:0x0106=Splitter:B:52:0x0106} */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7346f() throws java.io.IOException {
        /*
            r12 = this;
            java.lang.String r0 = ", "
            com.fyber.inneractive.sdk.player.a.l r1 = new com.fyber.inneractive.sdk.player.a.l
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r12.f7643f
            r2.<init>(r3)
            java.nio.charset.Charset r3 = com.fyber.inneractive.sdk.player.p057a.C3142m.f7763a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo18731a()     // Catch:{ all -> 0x015e }
            java.lang.String r3 = r1.mo18731a()     // Catch:{ all -> 0x015e }
            java.lang.String r4 = r1.mo18731a()     // Catch:{ all -> 0x015e }
            java.lang.String r5 = r1.mo18731a()     // Catch:{ all -> 0x015e }
            java.lang.String r6 = r1.mo18731a()     // Catch:{ all -> 0x015e }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x015e }
            if (r7 == 0) goto L_0x0133
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x015e }
            if (r7 == 0) goto L_0x0133
            int r7 = r12.f7646i     // Catch:{ all -> 0x015e }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x015e }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x015e }
            if (r4 == 0) goto L_0x0133
            int r4 = r12.f7648k     // Catch:{ all -> 0x015e }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x015e }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x015e }
            if (r4 == 0) goto L_0x0133
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x015e }
            if (r4 == 0) goto L_0x0133
            r0 = 0
            r2 = 0
        L_0x0056:
            r3 = 1
            r4 = -1
            java.lang.String r5 = r1.mo18731a()     // Catch:{ EOFException -> 0x0106 }
            r6 = 32
            int r7 = r5.indexOf(r6)     // Catch:{ EOFException -> 0x0106 }
            java.lang.String r8 = "unexpected journal line: "
            if (r7 == r4) goto L_0x00f4
            int r9 = r7 + 1
            int r6 = r5.indexOf(r6, r9)     // Catch:{ EOFException -> 0x0106 }
            if (r6 != r4) goto L_0x0083
            java.lang.String r9 = r5.substring(r9)     // Catch:{ EOFException -> 0x0106 }
            r10 = 6
            if (r7 != r10) goto L_0x0087
            java.lang.String r10 = "REMOVE"
            boolean r10 = r5.startsWith(r10)     // Catch:{ EOFException -> 0x0106 }
            if (r10 == 0) goto L_0x0087
            java.util.LinkedHashMap<java.lang.String, com.fyber.inneractive.sdk.player.a.c$b> r5 = r12.f7639b     // Catch:{ EOFException -> 0x0106 }
            r5.remove(r9)     // Catch:{ EOFException -> 0x0106 }
            goto L_0x00de
        L_0x0083:
            java.lang.String r9 = r5.substring(r9, r6)     // Catch:{ EOFException -> 0x0106 }
        L_0x0087:
            java.util.LinkedHashMap<java.lang.String, com.fyber.inneractive.sdk.player.a.c$b> r10 = r12.f7639b     // Catch:{ EOFException -> 0x0106 }
            java.lang.Object r10 = r10.get(r9)     // Catch:{ EOFException -> 0x0106 }
            com.fyber.inneractive.sdk.player.a.c$b r10 = (com.fyber.inneractive.sdk.player.p057a.C3106c.C3111b) r10     // Catch:{ EOFException -> 0x0106 }
            if (r10 != 0) goto L_0x009b
            com.fyber.inneractive.sdk.player.a.c$b r10 = new com.fyber.inneractive.sdk.player.a.c$b     // Catch:{ EOFException -> 0x0106 }
            r10.<init>(r12, r9, r0)     // Catch:{ EOFException -> 0x0106 }
            java.util.LinkedHashMap<java.lang.String, com.fyber.inneractive.sdk.player.a.c$b> r11 = r12.f7639b     // Catch:{ EOFException -> 0x0106 }
            r11.put(r9, r10)     // Catch:{ EOFException -> 0x0106 }
        L_0x009b:
            r9 = 5
            if (r6 == r4) goto L_0x00bd
            if (r7 != r9) goto L_0x00bd
            java.lang.String r11 = "CLEAN"
            boolean r11 = r5.startsWith(r11)     // Catch:{ EOFException -> 0x0106 }
            if (r11 == 0) goto L_0x00bd
            int r6 = r6 + 1
            java.lang.String r5 = r5.substring(r6)     // Catch:{ EOFException -> 0x0106 }
            java.lang.String r6 = " "
            java.lang.String[] r5 = r5.split(r6)     // Catch:{ EOFException -> 0x0106 }
            r10.f7663c = r3     // Catch:{ EOFException -> 0x0106 }
            r6 = 0
            r10.f7664d = r6     // Catch:{ EOFException -> 0x0106 }
            r10.mo18698a((java.lang.String[]) r5)     // Catch:{ EOFException -> 0x0106 }
            goto L_0x00de
        L_0x00bd:
            if (r6 != r4) goto L_0x00d1
            if (r7 != r9) goto L_0x00d1
            java.lang.String r9 = "DIRTY"
            boolean r9 = r5.startsWith(r9)     // Catch:{ EOFException -> 0x0106 }
            if (r9 == 0) goto L_0x00d1
            com.fyber.inneractive.sdk.player.a.c$a r5 = new com.fyber.inneractive.sdk.player.a.c$a     // Catch:{ EOFException -> 0x0106 }
            r5.<init>(r12, r10, r0)     // Catch:{ EOFException -> 0x0106 }
            r10.f7664d = r5     // Catch:{ EOFException -> 0x0106 }
            goto L_0x00de
        L_0x00d1:
            if (r6 != r4) goto L_0x00e2
            r6 = 4
            if (r7 != r6) goto L_0x00e2
            java.lang.String r6 = "READ"
            boolean r6 = r5.startsWith(r6)     // Catch:{ EOFException -> 0x0106 }
            if (r6 == 0) goto L_0x00e2
        L_0x00de:
            int r2 = r2 + 1
            goto L_0x0056
        L_0x00e2:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ EOFException -> 0x0106 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0106 }
            r7.<init>(r8)     // Catch:{ EOFException -> 0x0106 }
            r7.append(r5)     // Catch:{ EOFException -> 0x0106 }
            java.lang.String r5 = r7.toString()     // Catch:{ EOFException -> 0x0106 }
            r6.<init>(r5)     // Catch:{ EOFException -> 0x0106 }
            throw r6     // Catch:{ EOFException -> 0x0106 }
        L_0x00f4:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ EOFException -> 0x0106 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0106 }
            r7.<init>(r8)     // Catch:{ EOFException -> 0x0106 }
            r7.append(r5)     // Catch:{ EOFException -> 0x0106 }
            java.lang.String r5 = r7.toString()     // Catch:{ EOFException -> 0x0106 }
            r6.<init>(r5)     // Catch:{ EOFException -> 0x0106 }
            throw r6     // Catch:{ EOFException -> 0x0106 }
        L_0x0106:
            java.util.LinkedHashMap<java.lang.String, com.fyber.inneractive.sdk.player.a.c$b> r5 = r12.f7639b     // Catch:{ all -> 0x015e }
            int r5 = r5.size()     // Catch:{ all -> 0x015e }
            int r2 = r2 - r5
            r12.f7651n = r2     // Catch:{ all -> 0x015e }
            int r2 = r1.f7758b     // Catch:{ all -> 0x015e }
            if (r2 != r4) goto L_0x0114
            r0 = 1
        L_0x0114:
            if (r0 == 0) goto L_0x011a
            r12.m7349h()     // Catch:{ all -> 0x015e }
            goto L_0x012f
        L_0x011a:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x015e }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x015e }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x015e }
            java.io.File r5 = r12.f7643f     // Catch:{ all -> 0x015e }
            r4.<init>(r5, r3)     // Catch:{ all -> 0x015e }
            java.nio.charset.Charset r3 = com.fyber.inneractive.sdk.player.p057a.C3142m.f7763a     // Catch:{ all -> 0x015e }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x015e }
            r0.<init>(r2)     // Catch:{ all -> 0x015e }
            r12.f7650m = r0     // Catch:{ all -> 0x015e }
        L_0x012f:
            com.fyber.inneractive.sdk.player.p057a.C3142m.m7409a((java.io.Closeable) r1)
            return
        L_0x0133:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x015e }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x015e }
            java.lang.String r8 = "unexpected journal header: ["
            r7.<init>(r8)     // Catch:{ all -> 0x015e }
            r7.append(r2)     // Catch:{ all -> 0x015e }
            r7.append(r0)     // Catch:{ all -> 0x015e }
            r7.append(r3)     // Catch:{ all -> 0x015e }
            r7.append(r0)     // Catch:{ all -> 0x015e }
            r7.append(r5)     // Catch:{ all -> 0x015e }
            r7.append(r0)     // Catch:{ all -> 0x015e }
            r7.append(r6)     // Catch:{ all -> 0x015e }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x015e }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x015e }
            r4.<init>(r0)     // Catch:{ all -> 0x015e }
            throw r4     // Catch:{ all -> 0x015e }
        L_0x015e:
            r0 = move-exception
            com.fyber.inneractive.sdk.player.p057a.C3142m.m7409a((java.io.Closeable) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p057a.C3106c.m7346f():void");
    }

    /* renamed from: g */
    private void m7348g() throws IOException {
        m7339b(this.f7644g);
        Iterator<C3111b> it = this.f7639b.values().iterator();
        while (it.hasNext()) {
            C3111b next = it.next();
            int i = 0;
            if (next.f7664d == null) {
                while (i < this.f7648k) {
                    this.f7649l += next.f7662b[i];
                    i++;
                }
            } else {
                next.f7664d = null;
                while (i < this.f7648k) {
                    m7339b(next.mo18696a(i));
                    m7339b(next.mo18699b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: h */
    public synchronized void m7349h() throws IOException {
        if (this.f7650m != null) {
            this.f7650m.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f7644g), C3142m.f7763a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f7646i));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f7648k));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C3111b next : this.f7639b.values()) {
                if (next.f7664d != null) {
                    bufferedWriter.write("DIRTY " + next.f7661a + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.f7661a + next.mo18697a() + 10);
                }
            }
            bufferedWriter.close();
            if (this.f7643f.exists()) {
                m7337a(this.f7643f, this.f7645h, true);
            }
            m7337a(this.f7644g, this.f7643f, false);
            this.f7645h.delete();
            this.f7650m = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f7643f, true), C3142m.f7763a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* renamed from: b */
    private static void m7339b(File file) throws IOException {
        IAlog.m9033a("DiskLruCache deleteIfExists - %s", file);
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    private static void m7337a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m7339b(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|28|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r11.f7651n++;
        r11.f7650m.append("READ " + r12 + 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (m7350i() == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        r11.f7641d.submit(r11.f7653p);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        return new com.fyber.inneractive.sdk.player.p057a.C3106c.C3113d(r11, r12, r0.f7665e, r8, r0.f7662b, (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007d, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006c */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.fyber.inneractive.sdk.player.p057a.C3106c.C3113d mo18680a(java.lang.String r12) throws java.io.IOException {
        /*
            r11 = this;
            monitor-enter(r11)
            r11.mo18682b()     // Catch:{ all -> 0x007e }
            m7344e((java.lang.String) r12)     // Catch:{ all -> 0x007e }
            java.util.LinkedHashMap<java.lang.String, com.fyber.inneractive.sdk.player.a.c$b> r0 = r11.f7639b     // Catch:{ all -> 0x007e }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x007e }
            com.fyber.inneractive.sdk.player.a.c$b r0 = (com.fyber.inneractive.sdk.player.p057a.C3106c.C3111b) r0     // Catch:{ all -> 0x007e }
            r1 = 0
            if (r0 != 0) goto L_0x0014
            monitor-exit(r11)
            return r1
        L_0x0014:
            boolean r2 = r0.f7663c     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x001a
            monitor-exit(r11)
            return r1
        L_0x001a:
            int r2 = r11.f7648k     // Catch:{ all -> 0x007e }
            java.io.InputStream[] r8 = new java.io.InputStream[r2]     // Catch:{ all -> 0x007e }
            r2 = 0
            r3 = 0
        L_0x0020:
            int r4 = r11.f7648k     // Catch:{ FileNotFoundException -> 0x006c }
            if (r3 >= r4) goto L_0x0032
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x006c }
            java.io.File r5 = r0.mo18696a((int) r3)     // Catch:{ FileNotFoundException -> 0x006c }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x006c }
            r8[r3] = r4     // Catch:{ FileNotFoundException -> 0x006c }
            int r3 = r3 + 1
            goto L_0x0020
        L_0x0032:
            int r1 = r11.f7651n     // Catch:{ all -> 0x007e }
            int r1 = r1 + 1
            r11.f7651n = r1     // Catch:{ all -> 0x007e }
            java.io.Writer r1 = r11.f7650m     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            java.lang.String r3 = "READ "
            r2.<init>(r3)     // Catch:{ all -> 0x007e }
            r2.append(r12)     // Catch:{ all -> 0x007e }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x007e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x007e }
            r1.append(r2)     // Catch:{ all -> 0x007e }
            boolean r1 = r11.m7350i()     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x005d
            java.util.concurrent.ThreadPoolExecutor r1 = r11.f7641d     // Catch:{ all -> 0x007e }
            java.util.concurrent.Callable<java.lang.Void> r2 = r11.f7653p     // Catch:{ all -> 0x007e }
            r1.submit(r2)     // Catch:{ all -> 0x007e }
        L_0x005d:
            com.fyber.inneractive.sdk.player.a.c$d r1 = new com.fyber.inneractive.sdk.player.a.c$d     // Catch:{ all -> 0x007e }
            long r6 = r0.f7665e     // Catch:{ all -> 0x007e }
            long[] r9 = r0.f7662b     // Catch:{ all -> 0x007e }
            r10 = 0
            r3 = r1
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r8, r9, r10)     // Catch:{ all -> 0x007e }
            monitor-exit(r11)
            return r1
        L_0x006c:
            int r12 = r11.f7648k     // Catch:{ all -> 0x007e }
            if (r2 >= r12) goto L_0x007c
            r12 = r8[r2]     // Catch:{ all -> 0x007e }
            if (r12 == 0) goto L_0x007c
            r12 = r8[r2]     // Catch:{ all -> 0x007e }
            com.fyber.inneractive.sdk.player.p057a.C3142m.m7409a((java.io.Closeable) r12)     // Catch:{ all -> 0x007e }
            int r2 = r2 + 1
            goto L_0x006c
        L_0x007c:
            monitor-exit(r11)
            return r1
        L_0x007e:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p057a.C3106c.mo18680a(java.lang.String):com.fyber.inneractive.sdk.player.a.c$d");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final File mo18681b(String str) {
        mo18682b();
        m7344e(str);
        C3111b bVar = this.f7639b.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.mo18696a(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized C3109a mo18683c(String str) throws IOException {
        mo18682b();
        m7344e(str);
        C3111b bVar = this.f7639b.get(str);
        if (bVar == null) {
            bVar = new C3111b(this, str, (byte) 0);
            this.f7639b.put(str, bVar);
        } else if (bVar.f7664d != null) {
            return null;
        }
        C3109a aVar = new C3109a(this, bVar, (byte) 0);
        bVar.f7664d = aVar;
        Writer writer = this.f7650m;
        writer.write("DIRTY " + str + 10);
        this.f7650m.flush();
        return aVar;
    }

    /* renamed from: a */
    public final synchronized long mo18679a() {
        return this.f7649l;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public boolean m7350i() {
        int i = this.f7651n;
        return i >= 2000 && i >= this.f7639b.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008e, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo18687d(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r0 = "DiskLruCache remove %s"
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x008f }
            r3 = 0
            r2[r3] = r9     // Catch:{ all -> 0x008f }
            com.fyber.inneractive.sdk.util.IAlog.m9033a(r0, r2)     // Catch:{ all -> 0x008f }
            r8.mo18682b()     // Catch:{ all -> 0x008f }
            m7344e((java.lang.String) r9)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, com.fyber.inneractive.sdk.player.a.c$b> r0 = r8.f7639b     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x008f }
            com.fyber.inneractive.sdk.player.a.c$b r0 = (com.fyber.inneractive.sdk.player.p057a.C3106c.C3111b) r0     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x008d
            com.fyber.inneractive.sdk.player.a.c$a r2 = r0.f7664d     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0021
            goto L_0x008d
        L_0x0021:
            int r2 = r8.f7648k     // Catch:{ all -> 0x008f }
            if (r3 >= r2) goto L_0x005c
            java.io.File r2 = r0.mo18696a((int) r3)     // Catch:{ all -> 0x008f }
            boolean r4 = r2.exists()     // Catch:{ all -> 0x008f }
            if (r4 == 0) goto L_0x004a
            boolean r4 = r2.delete()     // Catch:{ all -> 0x008f }
            if (r4 == 0) goto L_0x0036
            goto L_0x004a
        L_0x0036:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "failed to delete "
            r0.<init>(r1)     // Catch:{ all -> 0x008f }
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008f }
            r9.<init>(r0)     // Catch:{ all -> 0x008f }
            throw r9     // Catch:{ all -> 0x008f }
        L_0x004a:
            long r4 = r8.f7649l     // Catch:{ all -> 0x008f }
            long[] r2 = r0.f7662b     // Catch:{ all -> 0x008f }
            r6 = r2[r3]     // Catch:{ all -> 0x008f }
            long r4 = r4 - r6
            r8.f7649l = r4     // Catch:{ all -> 0x008f }
            long[] r2 = r0.f7662b     // Catch:{ all -> 0x008f }
            r4 = 0
            r2[r3] = r4     // Catch:{ all -> 0x008f }
            int r3 = r3 + 1
            goto L_0x0021
        L_0x005c:
            int r0 = r8.f7651n     // Catch:{ all -> 0x008f }
            int r0 = r0 + r1
            r8.f7651n = r0     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r8.f7650m     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            java.lang.String r3 = "REMOVE "
            r2.<init>(r3)     // Catch:{ all -> 0x008f }
            r2.append(r9)     // Catch:{ all -> 0x008f }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x008f }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008f }
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, com.fyber.inneractive.sdk.player.a.c$b> r0 = r8.f7639b     // Catch:{ all -> 0x008f }
            r0.remove(r9)     // Catch:{ all -> 0x008f }
            boolean r9 = r8.m7350i()     // Catch:{ all -> 0x008f }
            if (r9 == 0) goto L_0x008b
            java.util.concurrent.ThreadPoolExecutor r9 = r8.f7641d     // Catch:{ all -> 0x008f }
            java.util.concurrent.Callable<java.lang.Void> r0 = r8.f7653p     // Catch:{ all -> 0x008f }
            r9.submit(r0)     // Catch:{ all -> 0x008f }
        L_0x008b:
            monitor-exit(r8)
            return r1
        L_0x008d:
            monitor-exit(r8)
            return r3
        L_0x008f:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p057a.C3106c.mo18687d(java.lang.String):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo18682b() {
        if (this.f7650m == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: c */
    public final synchronized void mo18684c() throws IOException {
        mo18682b();
        m7351j();
        this.f7650m.flush();
    }

    public final synchronized void close() throws IOException {
        if (this.f7650m != null) {
            Iterator it = new ArrayList(this.f7639b.values()).iterator();
            while (it.hasNext()) {
                C3111b bVar = (C3111b) it.next();
                if (bVar.f7664d != null) {
                    bVar.f7664d.mo18691b();
                }
            }
            m7351j();
            this.f7650m.close();
            this.f7650m = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m7351j() throws IOException {
        while (this.f7649l > this.f7647j) {
            String str = (String) this.f7639b.entrySet().iterator().next().getKey();
            C3112c cVar = this.f7640c;
            if (cVar == null) {
                mo18687d(str);
            } else if (cVar.mo18700a(str)) {
                mo18687d(str);
            } else {
                boolean z = false;
                for (String next : this.f7639b.keySet()) {
                    if (this.f7640c.mo18700a(next)) {
                        z |= mo18687d(next);
                    }
                }
                if (!z) {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo18686d() throws IOException {
        IAlog.m9033a("DiskLruCache delete cache", new Object[0]);
        close();
        C3142m.m7410a(this.f7642e);
    }

    /* renamed from: e */
    static void m7344e(String str) {
        if (!f7637a.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.a.c$d */
    public final class C3113d implements Closeable {

        /* renamed from: b */
        private final String f7668b;

        /* renamed from: c */
        private final long f7669c;

        /* renamed from: d */
        private final InputStream[] f7670d;

        /* renamed from: e */
        private final long[] f7671e;

        /* synthetic */ C3113d(C3106c cVar, String str, long j, InputStream[] inputStreamArr, long[] jArr, byte b) {
            this(str, j, inputStreamArr, jArr);
        }

        private C3113d(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f7668b = str;
            this.f7669c = j;
            this.f7670d = inputStreamArr;
            this.f7671e = jArr;
        }

        public final void close() {
            for (InputStream a : this.f7670d) {
                C3142m.m7409a((Closeable) a);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.a.c$a */
    public final class C3109a {

        /* renamed from: a */
        final C3111b f7655a;

        /* renamed from: b */
        final boolean[] f7656b;

        /* renamed from: c */
        boolean f7657c;

        /* renamed from: d */
        boolean f7658d;

        /* synthetic */ C3109a(C3106c cVar, C3111b bVar, byte b) {
            this(bVar);
        }

        private C3109a(C3111b bVar) {
            this.f7655a = bVar;
            this.f7656b = bVar.f7663c ? null : new boolean[C3106c.this.f7648k];
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0029 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.io.OutputStream mo18690a() throws java.io.IOException {
            /*
                r4 = this;
                com.fyber.inneractive.sdk.player.a.c r0 = com.fyber.inneractive.sdk.player.p057a.C3106c.this
                int r0 = r0.f7648k
                if (r0 <= 0) goto L_0x004d
                com.fyber.inneractive.sdk.player.a.c r0 = com.fyber.inneractive.sdk.player.p057a.C3106c.this
                monitor-enter(r0)
                com.fyber.inneractive.sdk.player.a.c$b r1 = r4.f7655a     // Catch:{ all -> 0x004a }
                com.fyber.inneractive.sdk.player.a.c$a r1 = r1.f7664d     // Catch:{ all -> 0x004a }
                if (r1 != r4) goto L_0x0044
                com.fyber.inneractive.sdk.player.a.c$b r1 = r4.f7655a     // Catch:{ all -> 0x004a }
                boolean r1 = r1.f7663c     // Catch:{ all -> 0x004a }
                r2 = 0
                if (r1 != 0) goto L_0x001d
                boolean[] r1 = r4.f7656b     // Catch:{ all -> 0x004a }
                r3 = 1
                r1[r2] = r3     // Catch:{ all -> 0x004a }
            L_0x001d:
                com.fyber.inneractive.sdk.player.a.c$b r1 = r4.f7655a     // Catch:{ all -> 0x004a }
                java.io.File r1 = r1.mo18699b((int) r2)     // Catch:{ all -> 0x004a }
                java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0029 }
                r3.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0029 }
                goto L_0x0037
            L_0x0029:
                com.fyber.inneractive.sdk.player.a.c r3 = com.fyber.inneractive.sdk.player.p057a.C3106c.this     // Catch:{ all -> 0x004a }
                java.io.File r3 = r3.f7642e     // Catch:{ all -> 0x004a }
                r3.mkdirs()     // Catch:{ all -> 0x004a }
                java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x003e }
                r3.<init>(r1)     // Catch:{ FileNotFoundException -> 0x003e }
            L_0x0037:
                com.fyber.inneractive.sdk.player.a.c$a$a r1 = new com.fyber.inneractive.sdk.player.a.c$a$a     // Catch:{ all -> 0x004a }
                r1.<init>(r4, r3, r2)     // Catch:{ all -> 0x004a }
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                return r1
            L_0x003e:
                java.io.OutputStream r1 = com.fyber.inneractive.sdk.player.p057a.C3106c.f7638q     // Catch:{ all -> 0x004a }
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                return r1
            L_0x0044:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004a }
                r1.<init>()     // Catch:{ all -> 0x004a }
                throw r1     // Catch:{ all -> 0x004a }
            L_0x004a:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                throw r1
            L_0x004d:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Expected index 0 to be greater than 0 and less than the maximum value count of "
                r1.<init>(r2)
                com.fyber.inneractive.sdk.player.a.c r2 = com.fyber.inneractive.sdk.player.p057a.C3106c.this
                int r2 = r2.f7648k
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p057a.C3106c.C3109a.mo18690a():java.io.OutputStream");
        }

        /* renamed from: b */
        public final void mo18691b() throws IOException {
            C3106c.this.m7335a(this, false);
        }

        /* renamed from: com.fyber.inneractive.sdk.player.a.c$a$a */
        private class C3110a extends FilterOutputStream {
            /* synthetic */ C3110a(C3109a aVar, OutputStream outputStream, byte b) {
                this(outputStream);
            }

            private C3110a(OutputStream outputStream) {
                super(outputStream);
            }

            public final void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C3109a.this.f7657c = true;
                }
            }

            public final void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C3109a.this.f7657c = true;
                }
            }

            public final void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C3109a.this.f7657c = true;
                }
            }

            public final void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C3109a.this.f7657c = true;
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.a.c$b */
    private final class C3111b {

        /* renamed from: a */
        final String f7661a;

        /* renamed from: b */
        final long[] f7662b;

        /* renamed from: c */
        boolean f7663c;

        /* renamed from: d */
        C3109a f7664d;

        /* renamed from: e */
        long f7665e;

        /* synthetic */ C3111b(C3106c cVar, String str, byte b) {
            this(str);
        }

        private C3111b(String str) {
            this.f7661a = str;
            this.f7662b = new long[C3106c.this.f7648k];
        }

        /* renamed from: a */
        public final String mo18697a() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f7662b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo18698a(String[] strArr) throws IOException {
            if (strArr.length == C3106c.this.f7648k) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f7662b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw m7363b(strArr);
                    }
                }
                return;
            }
            throw m7363b(strArr);
        }

        /* renamed from: b */
        private static IOException m7363b(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: a */
        public final File mo18696a(int i) {
            File g = C3106c.this.f7642e;
            return new File(g, this.f7661a + "." + i);
        }

        /* renamed from: b */
        public final File mo18699b(int i) {
            File g = C3106c.this.f7642e;
            return new File(g, this.f7661a + "." + i + ".tmp");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e9, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m7335a(com.fyber.inneractive.sdk.player.p057a.C3106c.C3109a r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            com.fyber.inneractive.sdk.player.a.c$b r0 = r10.f7655a     // Catch:{ all -> 0x00f0 }
            com.fyber.inneractive.sdk.player.a.c$a r1 = r0.f7664d     // Catch:{ all -> 0x00f0 }
            if (r1 != r10) goto L_0x00ea
            r1 = 0
            if (r11 == 0) goto L_0x0042
            boolean r2 = r0.f7663c     // Catch:{ all -> 0x00f0 }
            if (r2 != 0) goto L_0x0042
            r2 = 0
        L_0x000f:
            int r3 = r9.f7648k     // Catch:{ all -> 0x00f0 }
            if (r2 >= r3) goto L_0x0042
            boolean[] r3 = r10.f7656b     // Catch:{ all -> 0x00f0 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00f0 }
            if (r3 == 0) goto L_0x002b
            java.io.File r3 = r0.mo18699b((int) r2)     // Catch:{ all -> 0x00f0 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00f0 }
            if (r3 != 0) goto L_0x0028
            r10.mo18691b()     // Catch:{ all -> 0x00f0 }
            monitor-exit(r9)
            return
        L_0x0028:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002b:
            r10.mo18691b()     // Catch:{ all -> 0x00f0 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f0 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.<init>(r0)     // Catch:{ all -> 0x00f0 }
            r11.append(r2)     // Catch:{ all -> 0x00f0 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f0 }
            r10.<init>(r11)     // Catch:{ all -> 0x00f0 }
            throw r10     // Catch:{ all -> 0x00f0 }
        L_0x0042:
            int r10 = r9.f7648k     // Catch:{ all -> 0x00f0 }
            if (r1 >= r10) goto L_0x0072
            java.io.File r10 = r0.mo18699b((int) r1)     // Catch:{ all -> 0x00f0 }
            if (r11 == 0) goto L_0x006c
            boolean r2 = r10.exists()     // Catch:{ all -> 0x00f0 }
            if (r2 == 0) goto L_0x006f
            java.io.File r2 = r0.mo18696a((int) r1)     // Catch:{ all -> 0x00f0 }
            r10.renameTo(r2)     // Catch:{ all -> 0x00f0 }
            long[] r10 = r0.f7662b     // Catch:{ all -> 0x00f0 }
            r3 = r10[r1]     // Catch:{ all -> 0x00f0 }
            long r5 = r2.length()     // Catch:{ all -> 0x00f0 }
            long[] r10 = r0.f7662b     // Catch:{ all -> 0x00f0 }
            r10[r1] = r5     // Catch:{ all -> 0x00f0 }
            long r7 = r9.f7649l     // Catch:{ all -> 0x00f0 }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f7649l = r7     // Catch:{ all -> 0x00f0 }
            goto L_0x006f
        L_0x006c:
            m7339b((java.io.File) r10)     // Catch:{ all -> 0x00f0 }
        L_0x006f:
            int r1 = r1 + 1
            goto L_0x0042
        L_0x0072:
            int r10 = r9.f7651n     // Catch:{ all -> 0x00f0 }
            r1 = 1
            int r10 = r10 + r1
            r9.f7651n = r10     // Catch:{ all -> 0x00f0 }
            r10 = 0
            r0.f7664d = r10     // Catch:{ all -> 0x00f0 }
            boolean r10 = r0.f7663c     // Catch:{ all -> 0x00f0 }
            r10 = r10 | r11
            r2 = 10
            if (r10 == 0) goto L_0x00af
            r0.f7663c = r1     // Catch:{ all -> 0x00f0 }
            java.io.Writer r10 = r9.f7650m     // Catch:{ all -> 0x00f0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f0 }
            java.lang.String r3 = "CLEAN "
            r1.<init>(r3)     // Catch:{ all -> 0x00f0 }
            java.lang.String r3 = r0.f7661a     // Catch:{ all -> 0x00f0 }
            r1.append(r3)     // Catch:{ all -> 0x00f0 }
            java.lang.String r3 = r0.mo18697a()     // Catch:{ all -> 0x00f0 }
            r1.append(r3)     // Catch:{ all -> 0x00f0 }
            r1.append(r2)     // Catch:{ all -> 0x00f0 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f0 }
            r10.write(r1)     // Catch:{ all -> 0x00f0 }
            if (r11 == 0) goto L_0x00ce
            long r10 = r9.f7652o     // Catch:{ all -> 0x00f0 }
            r1 = 1
            long r1 = r1 + r10
            r9.f7652o = r1     // Catch:{ all -> 0x00f0 }
            r0.f7665e = r10     // Catch:{ all -> 0x00f0 }
            goto L_0x00ce
        L_0x00af:
            java.util.LinkedHashMap<java.lang.String, com.fyber.inneractive.sdk.player.a.c$b> r10 = r9.f7639b     // Catch:{ all -> 0x00f0 }
            java.lang.String r11 = r0.f7661a     // Catch:{ all -> 0x00f0 }
            r10.remove(r11)     // Catch:{ all -> 0x00f0 }
            java.io.Writer r10 = r9.f7650m     // Catch:{ all -> 0x00f0 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f0 }
            java.lang.String r1 = "REMOVE "
            r11.<init>(r1)     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = r0.f7661a     // Catch:{ all -> 0x00f0 }
            r11.append(r0)     // Catch:{ all -> 0x00f0 }
            r11.append(r2)     // Catch:{ all -> 0x00f0 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f0 }
            r10.write(r11)     // Catch:{ all -> 0x00f0 }
        L_0x00ce:
            java.io.Writer r10 = r9.f7650m     // Catch:{ all -> 0x00f0 }
            r10.flush()     // Catch:{ all -> 0x00f0 }
            long r10 = r9.f7649l     // Catch:{ all -> 0x00f0 }
            long r0 = r9.f7647j     // Catch:{ all -> 0x00f0 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00e1
            boolean r10 = r9.m7350i()     // Catch:{ all -> 0x00f0 }
            if (r10 == 0) goto L_0x00e8
        L_0x00e1:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f7641d     // Catch:{ all -> 0x00f0 }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f7653p     // Catch:{ all -> 0x00f0 }
            r10.submit(r11)     // Catch:{ all -> 0x00f0 }
        L_0x00e8:
            monitor-exit(r9)
            return
        L_0x00ea:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f0 }
            r10.<init>()     // Catch:{ all -> 0x00f0 }
            throw r10     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p057a.C3106c.m7335a(com.fyber.inneractive.sdk.player.a.c$a, boolean):void");
    }
}
