package com.inmobi.media;

import android.graphics.Canvas;
import android.graphics.Movie;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.inmobi.media.C5149eb;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: com.inmobi.media.ec */
/* compiled from: GifMovieObject */
public final class C5151ec implements C5149eb {

    /* renamed from: a */
    int f11823a = 0;

    /* renamed from: b */
    private Movie f11824b;

    /* renamed from: c */
    private long f11825c;

    /* renamed from: d */
    private volatile boolean f11826d = false;

    /* renamed from: e */
    private C5149eb.C5150a f11827e;

    /* renamed from: a */
    public final void mo40418a() {
    }

    public C5151ec(String str) throws IOException {
        File file = new File(str);
        byte[] bArr = new byte[((int) file.length())];
        FileInputStream fileInputStream = new FileInputStream(file);
        int read = fileInputStream.read(bArr);
        fileInputStream.close();
        Movie decodeByteArray = Movie.decodeByteArray(bArr, 0, read);
        this.f11824b = decodeByteArray;
        if (decodeByteArray == null) {
            throw new IllegalStateException("Cannot decode gif byte array");
        }
    }

    /* renamed from: a */
    public final void mo40421a(boolean z) {
        this.f11826d = z;
        if (!this.f11826d) {
            this.f11825c = SystemClock.uptimeMillis() - ((long) this.f11823a);
        }
        C5149eb.C5150a aVar = this.f11827e;
        if (aVar != null) {
            aVar.mo40434a();
        }
    }

    /* renamed from: b */
    public final int mo40422b() {
        return this.f11824b.width();
    }

    /* renamed from: c */
    public final int mo40423c() {
        return this.f11824b.height();
    }

    /* renamed from: a */
    public final void mo40419a(Canvas canvas, float f, float f2) {
        this.f11824b.draw(canvas, f, f2);
        if (this.f11823a + 20 >= this.f11824b.duration()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C5151ec.this.f11823a = 0;
                    C5151ec.this.mo40421a(false);
                }
            });
        }
    }

    /* renamed from: d */
    public final boolean mo40424d() {
        return !this.f11826d;
    }

    /* renamed from: e */
    public final void mo40425e() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f11825c == 0) {
            this.f11825c = uptimeMillis;
        }
        int duration = this.f11824b.duration();
        if (duration == 0) {
            duration = 1000;
        }
        int i = (int) ((uptimeMillis - this.f11825c) % ((long) duration));
        this.f11823a = i;
        this.f11824b.setTime(i);
    }

    /* renamed from: a */
    public final void mo40420a(C5149eb.C5150a aVar) {
        this.f11827e = aVar;
    }
}
