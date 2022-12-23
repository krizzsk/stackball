package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: com.yandex.metrica.impl.ob.bn */
public class C11093bn {

    /* renamed from: a */
    private final Context f26627a;

    /* renamed from: b */
    private final String f26628b;

    /* renamed from: c */
    private final C10442L0 f26629c;

    /* renamed from: d */
    private File f26630d;

    /* renamed from: e */
    private FileLock f26631e;

    /* renamed from: f */
    private RandomAccessFile f26632f;

    /* renamed from: g */
    private FileChannel f26633g;

    /* renamed from: h */
    private int f26634h;

    public C11093bn(Context context, String str) {
        this(context, str, new C10442L0());
    }

    /* renamed from: a */
    public synchronized void mo62712a() throws Throwable {
        File b = this.f26629c.mo61700b(this.f26627a.getFilesDir(), this.f26628b);
        this.f26630d = b;
        if (b != null) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f26630d, "rw");
            this.f26632f = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.f26633g = channel;
            if (this.f26634h == 0) {
                this.f26631e = channel.lock();
            }
            this.f26634h++;
        } else {
            throw new IllegalStateException("Cannot create lock file");
        }
    }

    /* renamed from: b */
    public synchronized void mo62713b() {
        File file = this.f26630d;
        if (file != null) {
            file.getAbsolutePath();
        }
        int i = this.f26634h - 1;
        this.f26634h = i;
        if (i == 0) {
            C10823V0.m27966a(this.f26631e);
        }
        C10796U2.m27888a((Closeable) this.f26632f);
        C10796U2.m27888a((Closeable) this.f26633g);
        this.f26632f = null;
        this.f26631e = null;
        this.f26633g = null;
    }

    /* renamed from: c */
    public synchronized void mo62714c() {
        mo62713b();
        File file = this.f26630d;
        if (file != null) {
            file.delete();
        }
    }

    C11093bn(Context context, String str, C10442L0 l0) {
        this.f26634h = 0;
        this.f26627a = context;
        this.f26628b = str + ".lock";
        this.f26629c = l0;
    }
}
