package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10667Qd;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: com.yandex.metrica.impl.ob.Th */
class C10786Th implements C10667Qd.C10668a {

    /* renamed from: a */
    final /* synthetic */ C10226Ei f25877a;

    /* renamed from: b */
    final /* synthetic */ File f25878b;

    /* renamed from: c */
    final /* synthetic */ C11211ei f25879c;

    /* renamed from: d */
    final /* synthetic */ C10815Uh f25880d;

    C10786Th(C10815Uh uh, C10226Ei ei, File file, C11211ei eiVar) {
        this.f25880d = uh;
        this.f25877a = ei;
        this.f25878b = file;
        this.f25879c = eiVar;
    }

    /* renamed from: a */
    public void mo61064a(String str, byte[] bArr) {
        FileOutputStream fileOutputStream;
        C10815Uh.m27947a(this.f25880d, this.f25877a.f24601i);
        C10815Uh.m27949c(this.f25880d);
        this.f25880d.f25960e.mo61506a(str);
        C10815Uh uh = this.f25880d;
        File file = this.f25878b;
        uh.getClass();
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            fileOutputStream = null;
        }
        C10796U2.m27888a((Closeable) fileOutputStream);
        this.f25879c.mo62835a(this.f25878b);
    }

    /* renamed from: b */
    public String mo61065b() {
        return this.f25880d.f25960e.mo61513b();
    }

    /* renamed from: c */
    public void mo61066c() {
        C10815Uh.m27947a(this.f25880d, this.f25877a.f24600h);
        C10815Uh.m27949c(this.f25880d);
    }

    /* renamed from: a */
    public void mo61063a() {
        C10815Uh.m27947a(this.f25880d, this.f25877a.f24601i);
        C10815Uh.m27949c(this.f25880d);
        this.f25879c.mo62835a(this.f25878b);
    }
}
