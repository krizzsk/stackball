package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.c7 */
public class C11104c7 implements Runnable {

    /* renamed from: a */
    private final File f26646a;

    /* renamed from: b */
    private final C10820Um<File> f26647b;

    /* renamed from: c */
    private final C11122cn f26648c;

    public C11104c7(Context context, File file, C10820Um<File> um) {
        this(file, um, C11122cn.m28662a(context));
    }

    public void run() {
        File[] listFiles;
        if (this.f26646a.exists() && this.f26646a.isDirectory() && (listFiles = this.f26646a.listFiles()) != null) {
            for (File file : listFiles) {
                C11054an a = this.f26648c.mo62737a(file.getName());
                try {
                    a.mo62656a();
                    this.f26647b.mo61092b(file);
                } catch (Throwable unused) {
                }
                a.mo62658c();
            }
        }
    }

    C11104c7(File file, C10820Um<File> um, C11122cn cnVar) {
        this.f26646a = file;
        this.f26647b = um;
        this.f26648c = cnVar;
    }
}
