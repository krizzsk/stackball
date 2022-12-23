package com.adcolony.sdk;

import android.content.Context;
import android.os.StatFs;
import com.adcolony.sdk.C0580a0;
import java.io.File;

/* renamed from: com.adcolony.sdk.q0 */
class C0783q0 {

    /* renamed from: a */
    private String f1293a;

    /* renamed from: b */
    private String f1294b;

    /* renamed from: c */
    private String f1295c;

    /* renamed from: d */
    private String f1296d;

    /* renamed from: e */
    private File f1297e;

    /* renamed from: f */
    private File f1298f;

    /* renamed from: g */
    private File f1299g;

    C0783q0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public double mo9825a(String str) {
        try {
            StatFs statFs = new StatFs(str);
            return (double) (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()));
        } catch (RuntimeException unused) {
            return 0.0d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo9828b() {
        return this.f1295c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo9829c() {
        return this.f1294b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo9830d() {
        return this.f1296d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo9831e() {
        C0693i c = C0578a.m143c();
        this.f1293a = mo9832f() + "/adc3/";
        this.f1294b = this.f1293a + "media/";
        File file = new File(this.f1294b);
        this.f1297e = file;
        if (!file.isDirectory()) {
            this.f1297e.delete();
            this.f1297e.mkdirs();
        }
        if (!this.f1297e.isDirectory()) {
            c.mo9595b(true);
            return false;
        } else if (mo9825a(this.f1294b) < 2.097152E7d) {
            new C0580a0.C0581a().mo9419a("Not enough memory available at media path, disabling AdColony.").mo9421a(C0580a0.f189g);
            c.mo9595b(true);
            return false;
        } else {
            this.f1295c = mo9832f() + "/adc3/data/";
            File file2 = new File(this.f1295c);
            this.f1298f = file2;
            if (!file2.isDirectory()) {
                this.f1298f.delete();
            }
            this.f1298f.mkdirs();
            this.f1296d = this.f1293a + "tmp/";
            File file3 = new File(this.f1296d);
            this.f1299g = file3;
            if (!file3.isDirectory()) {
                this.f1299g.delete();
                this.f1299g.mkdirs();
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo9832f() {
        Context b = C0578a.m141b();
        if (b == null) {
            return "";
        }
        return b.getFilesDir().getAbsolutePath();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C0897z0 mo9833g() {
        if (!new File(mo9826a() + "AppVersion").exists()) {
            return C0894y.m1151b();
        }
        return C0894y.m1161c(mo9826a() + "AppVersion");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo9834h() {
        File file = this.f1297e;
        if (file == null || this.f1298f == null || this.f1299g == null) {
            return false;
        }
        if (!file.isDirectory()) {
            this.f1297e.delete();
        }
        if (!this.f1298f.isDirectory()) {
            this.f1298f.delete();
        }
        if (!this.f1299g.isDirectory()) {
            this.f1299g.delete();
        }
        this.f1297e.mkdirs();
        this.f1298f.mkdirs();
        this.f1299g.mkdirs();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9827a(C0897z0 z0Var) {
        C0894y.m1170i(z0Var, mo9826a() + "AppVersion");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo9826a() {
        return this.f1293a;
    }
}
