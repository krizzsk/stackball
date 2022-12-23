package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.concurrent.Semaphore;

/* renamed from: com.yandex.metrica.impl.ob.Bn */
public final class C10146Bn {

    /* renamed from: g */
    private static final HashMap<String, C10146Bn> f24417g = new HashMap<>();

    /* renamed from: a */
    private final String f24418a;

    /* renamed from: b */
    private FileLock f24419b;

    /* renamed from: c */
    private FileChannel f24420c;

    /* renamed from: d */
    private final File f24421d;

    /* renamed from: e */
    private RandomAccessFile f24422e;

    /* renamed from: f */
    private Semaphore f24423f = new Semaphore(1, true);

    private C10146Bn(Context context, String str) {
        File file;
        String str2 = str + ".lock";
        this.f24418a = str2;
        File cacheDir = context.getCacheDir();
        File file2 = null;
        if (cacheDir == null) {
            file = null;
        } else {
            file = new File(cacheDir, "appmetrica_locks");
        }
        if (file != null) {
            file.mkdirs();
        }
        this.f24421d = file != null ? new File(file, str2) : file2;
    }

    /* renamed from: a */
    public static synchronized C10146Bn m26078a(Context context, String str) {
        C10146Bn bn;
        synchronized (C10146Bn.class) {
            HashMap<String, C10146Bn> hashMap = f24417g;
            bn = hashMap.get(str);
            if (bn == null) {
                bn = new C10146Bn(context, str);
                hashMap.put(str, bn);
            }
        }
        return bn;
    }

    /* renamed from: b */
    public synchronized void mo61120b() {
        this.f24423f.release();
        if (this.f24423f.availablePermits() > 0) {
            C10823V0.m27966a(this.f24419b);
            C10796U2.m27888a((Closeable) this.f24420c);
            C10796U2.m27888a((Closeable) this.f24422e);
            this.f24420c = null;
            this.f24422e = null;
        }
    }

    /* renamed from: a */
    public synchronized void mo61119a() throws Throwable {
        this.f24423f.acquire();
        if (this.f24421d != null) {
            if (this.f24420c == null) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f24421d, "rw");
                this.f24422e = randomAccessFile;
                this.f24420c = randomAccessFile.getChannel();
            }
            this.f24419b = this.f24420c.lock();
        } else {
            throw new IllegalStateException("Lock file is null");
        }
    }
}
