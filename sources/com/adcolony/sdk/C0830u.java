package com.adcolony.sdk;

import com.adcolony.sdk.C0580a0;
import com.google.android.exoplayer2.C3716C;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.zip.GZIPInputStream;

/* renamed from: com.adcolony.sdk.u */
class C0830u {

    /* renamed from: a */
    private LinkedList<Runnable> f1422a = new LinkedList<>();

    /* renamed from: b */
    private boolean f1423b;

    /* renamed from: com.adcolony.sdk.u$a */
    class C0831a implements C0685f0 {

        /* renamed from: com.adcolony.sdk.u$a$a */
        class C0832a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0645d0 f1425a;

            C0832a(C0645d0 d0Var) {
                this.f1425a = d0Var;
            }

            public void run() {
                boolean unused = C0830u.this.m882g(this.f1425a);
                C0830u.this.m863a();
            }
        }

        C0831a() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0830u.this.m866a((Runnable) new C0832a(d0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.u$b */
    class C0833b implements C0685f0 {

        /* renamed from: com.adcolony.sdk.u$b$a */
        class C0834a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0645d0 f1428a;

            C0834a(C0645d0 d0Var) {
                this.f1428a = d0Var;
            }

            public void run() {
                boolean unused = C0830u.this.m868a(this.f1428a, new File(C0894y.m1169h(this.f1428a.mo9532b(), "filepath")));
                C0830u.this.m863a();
            }
        }

        C0833b() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0830u.this.m866a((Runnable) new C0834a(d0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.u$c */
    class C0835c implements C0685f0 {

        /* renamed from: com.adcolony.sdk.u$c$a */
        class C0836a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0645d0 f1431a;

            C0836a(C0645d0 d0Var) {
                this.f1431a = d0Var;
            }

            public void run() {
                boolean unused = C0830u.this.m877d(this.f1431a);
                C0830u.this.m863a();
            }
        }

        C0835c() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0830u.this.m866a((Runnable) new C0836a(d0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.u$d */
    class C0837d implements C0685f0 {

        /* renamed from: com.adcolony.sdk.u$d$a */
        class C0838a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0645d0 f1434a;

            C0838a(C0645d0 d0Var) {
                this.f1434a = d0Var;
            }

            public void run() {
                String unused = C0830u.this.m878e(this.f1434a);
                C0830u.this.m863a();
            }
        }

        C0837d() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0830u.this.m866a((Runnable) new C0838a(d0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.u$e */
    class C0839e implements C0685f0 {

        /* renamed from: com.adcolony.sdk.u$e$a */
        class C0840a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0645d0 f1437a;

            C0840a(C0645d0 d0Var) {
                this.f1437a = d0Var;
            }

            public void run() {
                boolean unused = C0830u.this.m880f(this.f1437a);
                C0830u.this.m863a();
            }
        }

        C0839e() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0830u.this.m866a((Runnable) new C0840a(d0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.u$f */
    class C0841f implements C0685f0 {

        /* renamed from: com.adcolony.sdk.u$f$a */
        class C0842a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0645d0 f1440a;

            C0842a(C0645d0 d0Var) {
                this.f1440a = d0Var;
            }

            public void run() {
                boolean unused = C0830u.this.m872b(this.f1440a);
                C0830u.this.m863a();
            }
        }

        C0841f() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0830u.this.m866a((Runnable) new C0842a(d0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.u$g */
    class C0843g implements C0685f0 {

        /* renamed from: com.adcolony.sdk.u$g$a */
        class C0844a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0645d0 f1443a;

            C0844a(C0645d0 d0Var) {
                this.f1443a = d0Var;
            }

            public void run() {
                boolean unused = C0830u.this.m874c(this.f1443a);
                C0830u.this.m863a();
            }
        }

        C0843g() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0830u.this.m866a((Runnable) new C0844a(d0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.u$h */
    class C0845h implements C0685f0 {

        /* renamed from: com.adcolony.sdk.u$h$a */
        class C0846a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0645d0 f1446a;

            C0846a(C0645d0 d0Var) {
                this.f1446a = d0Var;
            }

            public void run() {
                boolean unused = C0830u.this.m884h(this.f1446a);
                C0830u.this.m863a();
            }
        }

        C0845h() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0830u.this.m866a((Runnable) new C0846a(d0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.u$i */
    class C0847i implements C0685f0 {

        /* renamed from: com.adcolony.sdk.u$i$a */
        class C0848a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0645d0 f1449a;

            C0848a(C0645d0 d0Var) {
                this.f1449a = d0Var;
            }

            public void run() {
                boolean unused = C0830u.this.m867a(this.f1449a);
                C0830u.this.m863a();
            }
        }

        C0847i() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0830u.this.m866a((Runnable) new C0848a(d0Var));
        }
    }

    C0830u() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m874c(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        String h = C0894y.m1169h(b, "filepath");
        C0578a.m143c().mo9571C().mo9834h();
        C0897z0 b2 = C0894y.m1151b();
        try {
            int d = C0894y.m1163d(b, "offset");
            int d2 = C0894y.m1163d(b, "size");
            boolean b3 = C0894y.m1155b(b, "gunzip");
            String h2 = C0894y.m1169h(b, "output_filepath");
            InputStream r0Var = new C0795r0(new FileInputStream(h), d, d2);
            if (b3) {
                r0Var = new GZIPInputStream(r0Var, 1024);
            }
            if (h2.equals("")) {
                StringBuilder sb = new StringBuilder(r0Var.available());
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = r0Var.read(bArr, 0, 1024);
                    if (read < 0) {
                        break;
                    }
                    sb.append(new String(bArr, 0, read, C3716C.ISO88591_NAME));
                }
                C0894y.m1156b(b2, "size", sb.length());
                C0894y.m1148a(b2, "data", sb.toString());
            } else {
                FileOutputStream fileOutputStream = new FileOutputStream(h2);
                byte[] bArr2 = new byte[1024];
                int i = 0;
                while (true) {
                    int read2 = r0Var.read(bArr2, 0, 1024);
                    if (read2 < 0) {
                        break;
                    }
                    fileOutputStream.write(bArr2, 0, read2);
                    i += read2;
                }
                fileOutputStream.close();
                C0894y.m1156b(b2, "size", i);
            }
            r0Var.close();
            C0894y.m1158b(b2, "success", true);
            d0Var.mo9530a(b2).mo9536d();
            return true;
        } catch (IOException unused) {
            C0894y.m1158b(b2, "success", false);
            d0Var.mo9530a(b2).mo9536d();
            return false;
        } catch (OutOfMemoryError unused2) {
            new C0580a0.C0581a().mo9419a("Out of memory error - disabling AdColony.").mo9421a(C0580a0.f191i);
            C0578a.m143c().mo9595b(true);
            C0894y.m1158b(b2, "success", false);
            d0Var.mo9530a(b2).mo9536d();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m877d(C0645d0 d0Var) {
        String h = C0894y.m1169h(d0Var.mo9532b(), "filepath");
        C0578a.m143c().mo9571C().mo9834h();
        C0897z0 b = C0894y.m1151b();
        String[] list = new File(h).list();
        if (list != null) {
            C0895y0 a = C0894y.m1134a();
            for (String str : list) {
                C0897z0 b2 = C0894y.m1151b();
                C0894y.m1148a(b2, "filename", str);
                if (new File(h + str).isDirectory()) {
                    C0894y.m1158b(b2, "is_folder", true);
                } else {
                    C0894y.m1158b(b2, "is_folder", false);
                }
                C0894y.m1142a(a, b2);
            }
            C0894y.m1158b(b, "success", true);
            C0894y.m1146a(b, "entries", a);
            d0Var.mo9530a(b).mo9536d();
            return true;
        }
        C0894y.m1158b(b, "success", false);
        d0Var.mo9530a(b).mo9536d();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public String m878e(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        String h = C0894y.m1169h(b, "filepath");
        String h2 = C0894y.m1169h(b, "encoding");
        boolean z = h2 != null && h2.equals("utf8");
        C0578a.m143c().mo9571C().mo9834h();
        C0897z0 b2 = C0894y.m1151b();
        try {
            StringBuilder a = mo9895a(h, z);
            C0894y.m1158b(b2, "success", true);
            C0894y.m1148a(b2, "data", a.toString());
            d0Var.mo9530a(b2).mo9536d();
            return a.toString();
        } catch (IOException unused) {
            C0894y.m1158b(b2, "success", false);
            d0Var.mo9530a(b2).mo9536d();
            return "";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m880f(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        String h = C0894y.m1169h(b, "filepath");
        String h2 = C0894y.m1169h(b, "new_filepath");
        C0578a.m143c().mo9571C().mo9834h();
        C0897z0 b2 = C0894y.m1151b();
        try {
            if (new File(h).renameTo(new File(h2))) {
                C0894y.m1158b(b2, "success", true);
                d0Var.mo9530a(b2).mo9536d();
                return true;
            }
            C0894y.m1158b(b2, "success", false);
            d0Var.mo9530a(b2).mo9536d();
            return false;
        } catch (Exception unused) {
            C0894y.m1158b(b2, "success", false);
            d0Var.mo9530a(b2).mo9536d();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m882g(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        String h = C0894y.m1169h(b, "filepath");
        String h2 = C0894y.m1169h(b, "data");
        boolean equals = C0894y.m1169h(b, "encoding").equals("utf8");
        C0578a.m143c().mo9571C().mo9834h();
        C0897z0 b2 = C0894y.m1151b();
        try {
            mo9896a(h, h2, equals);
            C0894y.m1158b(b2, "success", true);
            d0Var.mo9530a(b2).mo9536d();
            return true;
        } catch (IOException unused) {
            C0894y.m1158b(b2, "success", false);
            d0Var.mo9530a(b2).mo9536d();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00f7, code lost:
        new com.adcolony.sdk.C0580a0.C0581a().mo9419a("Out of memory error - disabling AdColony.").mo9421a(com.adcolony.sdk.C0580a0.f191i);
        com.adcolony.sdk.C0578a.m143c().mo9595b(true);
        com.adcolony.sdk.C0894y.m1158b(r5, "success", false);
        r0.mo9530a(r5).mo9536d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x011a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x011b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ExcHandler: OutOfMemoryError (unused java.lang.OutOfMemoryError), SYNTHETIC, Splitter:B:1:0x0029] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m884h(com.adcolony.sdk.C0645d0 r20) {
        /*
            r19 = this;
            r0 = r20
            java.lang.String r1 = "success"
            com.adcolony.sdk.z0 r2 = r20.mo9532b()
            java.lang.String r3 = "filepath"
            java.lang.String r3 = com.adcolony.sdk.C0894y.m1169h(r2, r3)
            java.lang.String r4 = "bundle_path"
            java.lang.String r4 = com.adcolony.sdk.C0894y.m1169h(r2, r4)
            java.lang.String r5 = "bundle_filenames"
            com.adcolony.sdk.y0 r2 = com.adcolony.sdk.C0894y.m1136a((com.adcolony.sdk.C0897z0) r2, (java.lang.String) r5)
            com.adcolony.sdk.i r5 = com.adcolony.sdk.C0578a.m143c()
            com.adcolony.sdk.q0 r5 = r5.mo9571C()
            r5.mo9834h()
            com.adcolony.sdk.z0 r5 = com.adcolony.sdk.C0894y.m1151b()
            java.io.File r8 = new java.io.File     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r8.<init>(r4)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            java.lang.String r10 = "r"
            r9.<init>(r8, r10)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r10 = 32
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r9.readInt()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            int r11 = r9.readInt()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            com.adcolony.sdk.y0 r12 = new com.adcolony.sdk.y0     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r12.<init>()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r13 = 1024(0x400, float:1.435E-42)
            byte[] r14 = new byte[r13]     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r15 = 0
        L_0x004a:
            if (r15 >= r11) goto L_0x00dd
            int r16 = r15 * 44
            int r6 = r16 + 8
            r17 = r8
            long r7 = (long) r6     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r9.seek(r7)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r9.read(r10)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r9.readInt()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            int r6 = r9.readInt()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            int r7 = r9.readInt()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r12.mo10049q(r7)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00b3 }
            r8.<init>()     // Catch:{ JSONException -> 0x00b3 }
            r8.append(r3)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.Object r13 = r2.mo10020a((int) r15)     // Catch:{ JSONException -> 0x00b3 }
            r8.append(r13)     // Catch:{ JSONException -> 0x00b3 }
            java.lang.String r8 = r8.toString()     // Catch:{ JSONException -> 0x00b3 }
            r18 = r2
            r13 = r3
            long r2 = (long) r6
            r9.seek(r2)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2.<init>(r8)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            int r3 = r7 / 1024
            int r7 = r7 % 1024
            r6 = 0
        L_0x008b:
            if (r6 >= r3) goto L_0x009d
            r16 = r3
            r3 = 1024(0x400, float:1.435E-42)
            r8 = 0
            r9.read(r14, r8, r3)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2.write(r14, r8, r3)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            int r6 = r6 + 1
            r3 = r16
            goto L_0x008b
        L_0x009d:
            r3 = 1024(0x400, float:1.435E-42)
            r8 = 0
            r9.read(r14, r8, r7)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2.write(r14, r8, r7)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2.close()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            int r15 = r15 + 1
            r3 = r13
            r8 = r17
            r2 = r18
            r13 = 1024(0x400, float:1.435E-42)
            goto L_0x004a
        L_0x00b3:
            com.adcolony.sdk.a0$a r2 = new com.adcolony.sdk.a0$a     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2.<init>()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            java.lang.String r3 = "Couldn't extract file name at index "
            com.adcolony.sdk.a0$a r2 = r2.mo9419a((java.lang.String) r3)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            com.adcolony.sdk.a0$a r2 = r2.mo9417a((int) r15)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            java.lang.String r3 = " unpacking ad unit bundle at "
            com.adcolony.sdk.a0$a r2 = r2.mo9419a((java.lang.String) r3)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            com.adcolony.sdk.a0$a r2 = r2.mo9419a((java.lang.String) r4)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            com.adcolony.sdk.a0 r3 = com.adcolony.sdk.C0580a0.f191i     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2.mo9421a((com.adcolony.sdk.C0580a0) r3)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2 = 0
            com.adcolony.sdk.C0894y.m1158b((com.adcolony.sdk.C0897z0) r5, (java.lang.String) r1, (boolean) r2)     // Catch:{ IOException -> 0x011c, OutOfMemoryError -> 0x00f7 }
            com.adcolony.sdk.d0 r3 = r0.mo9530a((com.adcolony.sdk.C0897z0) r5)     // Catch:{ IOException -> 0x011c, OutOfMemoryError -> 0x00f7 }
            r3.mo9536d()     // Catch:{ IOException -> 0x011c, OutOfMemoryError -> 0x00f7 }
            return r2
        L_0x00dd:
            r17 = r8
            r9.close()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r17.delete()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2 = 1
            com.adcolony.sdk.C0894y.m1158b((com.adcolony.sdk.C0897z0) r5, (java.lang.String) r1, (boolean) r2)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            java.lang.String r2 = "file_sizes"
            com.adcolony.sdk.C0894y.m1146a((com.adcolony.sdk.C0897z0) r5, (java.lang.String) r2, (com.adcolony.sdk.C0895y0) r12)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            com.adcolony.sdk.d0 r2 = r0.mo9530a((com.adcolony.sdk.C0897z0) r5)     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r2.mo9536d()     // Catch:{ IOException -> 0x011b, OutOfMemoryError -> 0x00f7 }
            r0 = 1
            return r0
        L_0x00f7:
            com.adcolony.sdk.a0$a r2 = new com.adcolony.sdk.a0$a
            r2.<init>()
            java.lang.String r3 = "Out of memory error - disabling AdColony."
            com.adcolony.sdk.a0$a r2 = r2.mo9419a((java.lang.String) r3)
            com.adcolony.sdk.a0 r3 = com.adcolony.sdk.C0580a0.f191i
            r2.mo9421a((com.adcolony.sdk.C0580a0) r3)
            com.adcolony.sdk.i r2 = com.adcolony.sdk.C0578a.m143c()
            r3 = 1
            r2.mo9595b((boolean) r3)
            r2 = 0
            com.adcolony.sdk.C0894y.m1158b((com.adcolony.sdk.C0897z0) r5, (java.lang.String) r1, (boolean) r2)
            com.adcolony.sdk.d0 r0 = r0.mo9530a((com.adcolony.sdk.C0897z0) r5)
            r0.mo9536d()
            return r2
        L_0x011b:
            r2 = 0
        L_0x011c:
            com.adcolony.sdk.a0$a r3 = new com.adcolony.sdk.a0$a
            r3.<init>()
            java.lang.String r6 = "Failed to find or open ad unit bundle at path: "
            com.adcolony.sdk.a0$a r3 = r3.mo9419a((java.lang.String) r6)
            com.adcolony.sdk.a0$a r3 = r3.mo9419a((java.lang.String) r4)
            com.adcolony.sdk.a0 r4 = com.adcolony.sdk.C0580a0.f192j
            r3.mo9421a((com.adcolony.sdk.C0580a0) r4)
            com.adcolony.sdk.C0894y.m1158b((com.adcolony.sdk.C0897z0) r5, (java.lang.String) r1, (boolean) r2)
            com.adcolony.sdk.d0 r0 = r0.mo9530a((com.adcolony.sdk.C0897z0) r5)
            r0.mo9536d()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0830u.m884h(com.adcolony.sdk.d0):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9898b() {
        C0578a.m139a("FileSystem.save", (C0685f0) new C0831a());
        C0578a.m139a("FileSystem.delete", (C0685f0) new C0833b());
        C0578a.m139a("FileSystem.listing", (C0685f0) new C0835c());
        C0578a.m139a("FileSystem.load", (C0685f0) new C0837d());
        C0578a.m139a("FileSystem.rename", (C0685f0) new C0839e());
        C0578a.m139a("FileSystem.exists", (C0685f0) new C0841f());
        C0578a.m139a("FileSystem.extract", (C0685f0) new C0843g());
        C0578a.m139a("FileSystem.unpack_bundle", (C0685f0) new C0845h());
        C0578a.m139a("FileSystem.create_directory", (C0685f0) new C0847i());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9896a(String str, String str2, boolean z) throws IOException {
        BufferedWriter bufferedWriter;
        if (z) {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str), "UTF-8"));
        } else {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str)));
        }
        bufferedWriter.write(str2);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m868a(C0645d0 d0Var, File file) {
        C0578a.m143c().mo9571C().mo9834h();
        C0897z0 b = C0894y.m1151b();
        if (mo9897a(file)) {
            C0894y.m1158b(b, "success", true);
            d0Var.mo9530a(b).mo9536d();
            return true;
        }
        C0894y.m1158b(b, "success", false);
        d0Var.mo9530a(b).mo9536d();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo9897a(File file) {
        try {
            if (!file.isDirectory()) {
                return file.delete();
            }
            if (file.list().length == 0) {
                return file.delete();
            }
            String[] list = file.list();
            if (list.length > 0) {
                return mo9897a(new File(file, list[0]));
            }
            if (file.list().length == 0) {
                return file.delete();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public StringBuilder mo9895a(String str, boolean z) throws IOException {
        BufferedReader bufferedReader;
        File file = new File(str);
        StringBuilder sb = new StringBuilder((int) file.length());
        if (z) {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath()), "UTF-8"));
        } else {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath())));
        }
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append("\n");
            } else {
                bufferedReader.close();
                return sb;
            }
        }
    }

    /* renamed from: a */
    private boolean m871a(String str) {
        return new File(str).exists();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m867a(C0645d0 d0Var) {
        String h = C0894y.m1169h(d0Var.mo9532b(), "filepath");
        C0578a.m143c().mo9571C().mo9834h();
        C0897z0 b = C0894y.m1151b();
        try {
            if (new File(h).mkdir()) {
                C0894y.m1158b(b, "success", true);
                d0Var.mo9530a(b).mo9536d();
                return true;
            }
            C0894y.m1158b(b, "success", false);
            return false;
        } catch (Exception unused) {
            C0894y.m1158b(b, "success", false);
            d0Var.mo9530a(b).mo9536d();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m866a(Runnable runnable) {
        if (!this.f1422a.isEmpty() || this.f1423b) {
            this.f1422a.push(runnable);
            return;
        }
        this.f1423b = true;
        runnable.run();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m863a() {
        this.f1423b = false;
        if (!this.f1422a.isEmpty()) {
            this.f1423b = true;
            this.f1422a.removeLast().run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m872b(C0645d0 d0Var) {
        String h = C0894y.m1169h(d0Var.mo9532b(), "filepath");
        C0578a.m143c().mo9571C().mo9834h();
        C0897z0 b = C0894y.m1151b();
        try {
            boolean a = m871a(h);
            C0894y.m1158b(b, IronSourceConstants.EVENTS_RESULT, a);
            C0894y.m1158b(b, "success", true);
            d0Var.mo9530a(b).mo9536d();
            return a;
        } catch (Exception e) {
            C0894y.m1158b(b, IronSourceConstants.EVENTS_RESULT, false);
            C0894y.m1158b(b, "success", false);
            d0Var.mo9530a(b).mo9536d();
            e.printStackTrace();
            return false;
        }
    }
}
