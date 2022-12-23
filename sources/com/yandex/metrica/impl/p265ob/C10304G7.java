package com.yandex.metrica.impl.p265ob;

import android.os.FileObserver;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.G7 */
public class C10304G7 {

    /* renamed from: a */
    private final FileObserver f24756a;

    /* renamed from: b */
    private final File f24757b;

    /* renamed from: c */
    private final C10801U6 f24758c;

    public C10304G7(File file, C10820Um<File> um) {
        this(new C10775T6(file, um), file, new C10801U6());
    }

    /* renamed from: a */
    public void mo61354a() {
        this.f24758c.mo62349a(this.f24757b);
        this.f24756a.startWatching();
    }

    C10304G7(FileObserver fileObserver, File file, C10801U6 u6) {
        this.f24756a = fileObserver;
        this.f24757b = file;
        this.f24758c = u6;
    }
}
