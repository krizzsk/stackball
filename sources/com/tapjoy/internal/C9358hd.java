package com.tapjoy.internal;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.hd */
public final class C9358hd {

    /* renamed from: a */
    private final File f23160a;

    public C9358hd(File file) {
        this.f23160a = file;
    }

    /* renamed from: a */
    public final synchronized boolean mo58298a() {
        FileOutputStream fileOutputStream;
        if (mo58299b() != null) {
            return false;
        }
        try {
            File file = this.f23160a;
            String uuid = UUID.randomUUID().toString();
            fileOutputStream = new FileOutputStream(file);
            C9091bg.m24335a((OutputStream) fileOutputStream, uuid);
            C9476jz.m25460a(fileOutputStream);
            if (mo58299b() != null) {
                return true;
            }
            return false;
        } catch (IOException e) {
            try {
                this.f23160a.delete();
                throw e;
            } catch (IOException unused) {
                return false;
            }
        } catch (Throwable th) {
            C9476jz.m25460a(fileOutputStream);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: b */
    public final String mo58299b() {
        if (!this.f23160a.exists()) {
            return null;
        }
        try {
            String a = C9091bg.m24334a(this.f23160a, C9066ak.f22357c);
            if (a.length() > 0) {
                return a;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }
}
