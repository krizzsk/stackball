package com.yandex.metrica.impl.p265ob;

import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.b7 */
public class C11069b7<Output> implements Runnable {

    /* renamed from: a */
    private final File f26583a;

    /* renamed from: b */
    private final C10864Vm<File, Output> f26584b;

    /* renamed from: c */
    private final C10820Um<File> f26585c;

    /* renamed from: d */
    private final C10820Um<Output> f26586d;

    public C11069b7(File file, C10864Vm<File, Output> vm, C10820Um<File> um, C10820Um<Output> um2) {
        this.f26583a = file;
        this.f26584b = vm;
        this.f26585c = um;
        this.f26586d = um2;
    }

    public void run() {
        if (this.f26583a.exists()) {
            try {
                Output a = this.f26584b.mo61128a(this.f26583a);
                if (a != null) {
                    this.f26586d.mo61092b(a);
                }
            } catch (Throwable unused) {
            }
            this.f26585c.mo61092b(this.f26583a);
        }
    }
}
