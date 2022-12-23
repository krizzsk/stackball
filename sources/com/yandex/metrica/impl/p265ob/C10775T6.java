package com.yandex.metrica.impl.p265ob;

import android.os.FileObserver;
import android.text.TextUtils;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.T6 */
public class C10775T6 extends FileObserver {

    /* renamed from: a */
    private final C10820Um<File> f25843a;

    /* renamed from: b */
    private final File f25844b;

    /* renamed from: c */
    private final C10442L0 f25845c;

    public C10775T6(File file, C10820Um<File> um) {
        this(file, um, new C10442L0());
    }

    public void onEvent(int i, String str) {
        if (i == 8 && !TextUtils.isEmpty(str)) {
            C10820Um<File> um = this.f25843a;
            C10442L0 l0 = this.f25845c;
            File file = this.f25844b;
            l0.getClass();
            um.mo61092b(new File(file, str));
        }
    }

    C10775T6(File file, C10820Um<File> um, C10442L0 l0) {
        super(file.getAbsolutePath(), 8);
        this.f25843a = um;
        this.f25844b = file;
        this.f25845c = l0;
    }
}
