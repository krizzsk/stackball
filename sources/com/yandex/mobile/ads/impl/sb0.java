package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.impl.sa0;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;

public final class sb0 implements Closeable {

    /* renamed from: h */
    private static final Logger f39906h = Logger.getLogger(mb0.class.getName());

    /* renamed from: b */
    private final BufferedSink f39907b;

    /* renamed from: c */
    private final boolean f39908c;

    /* renamed from: d */
    private final Buffer f39909d;

    /* renamed from: e */
    private int f39910e = 16384;

    /* renamed from: f */
    private boolean f39911f;

    /* renamed from: g */
    private final sa0.C14575b f39912g;

    public sb0(BufferedSink bufferedSink, boolean z) {
        Intrinsics.checkNotNullParameter(bufferedSink, "sink");
        this.f39907b = bufferedSink;
        this.f39908c = z;
        Buffer buffer = new Buffer();
        this.f39909d = buffer;
        this.f39912g = new sa0.C14575b(0, false, buffer, 3);
    }

    /* renamed from: a */
    public final synchronized void mo69930a(e81 e81) throws IOException {
        Intrinsics.checkNotNullParameter(e81, "peerSettings");
        if (!this.f39911f) {
            this.f39910e = e81.mo66781b(this.f39910e);
            if (e81.mo66776a() != -1) {
                this.f39912g.mo69924b(e81.mo66776a());
            }
            mo69926a(0, 0, 4, 1);
            this.f39907b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: b */
    public final synchronized void mo69934b() throws IOException {
        if (this.f39911f) {
            throw new IOException("closed");
        } else if (this.f39908c) {
            Logger logger = f39906h;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(jh1.m37820a(Intrinsics.stringPlus(">> CONNECTION ", mb0.f37284b.hex()), new Object[0]));
            }
            this.f39907b.write(mb0.f37284b);
            this.f39907b.flush();
        }
    }

    /* renamed from: c */
    public final int mo69936c() {
        return this.f39910e;
    }

    public synchronized void close() throws IOException {
        this.f39911f = true;
        this.f39907b.close();
    }

    public final synchronized void flush() throws IOException {
        if (!this.f39911f) {
            this.f39907b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: b */
    public final synchronized void mo69935b(e81 e81) throws IOException {
        Intrinsics.checkNotNullParameter(e81, "settings");
        if (!this.f39911f) {
            int i = 0;
            mo69926a(0, e81.mo66784d() * 6, 4, 0);
            while (true) {
                int i2 = i + 1;
                if (e81.mo66783c(i)) {
                    this.f39907b.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                    this.f39907b.writeInt(e81.mo66777a(i));
                }
                if (i2 >= 10) {
                    this.f39907b.flush();
                } else {
                    i = i2;
                }
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo69928a(int i, o30 o30) throws IOException {
        Intrinsics.checkNotNullParameter(o30, IronSourceConstants.EVENTS_ERROR_CODE);
        if (!this.f39911f) {
            if (o30.mo69100a() != -1) {
                mo69926a(i, 4, 3, 0);
                this.f39907b.writeInt(o30.mo69100a());
                this.f39907b.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo69933a(boolean z, int i, Buffer buffer, int i2) throws IOException {
        if (!this.f39911f) {
            mo69926a(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                BufferedSink bufferedSink = this.f39907b;
                Intrinsics.checkNotNull(buffer);
                bufferedSink.write(buffer, (long) i2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: b */
    private final void m41885b(int i, long j) throws IOException {
        while (j > 0) {
            long min = Math.min((long) this.f39910e, j);
            j -= min;
            mo69926a(i, (int) min, 9, j == 0 ? 4 : 0);
            this.f39907b.write(this.f39909d, min);
        }
    }

    /* renamed from: a */
    public final synchronized void mo69931a(boolean z, int i, int i2) throws IOException {
        if (!this.f39911f) {
            mo69926a(0, 8, 6, z ? 1 : 0);
            this.f39907b.writeInt(i);
            this.f39907b.writeInt(i2);
            this.f39907b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo69929a(int i, o30 o30, byte[] bArr) throws IOException {
        Intrinsics.checkNotNullParameter(o30, IronSourceConstants.EVENTS_ERROR_CODE);
        Intrinsics.checkNotNullParameter(bArr, "debugData");
        if (!this.f39911f) {
            boolean z = false;
            if (o30.mo69100a() != -1) {
                mo69926a(0, bArr.length + 8, 7, 0);
                this.f39907b.writeInt(i);
                this.f39907b.writeInt(o30.mo69100a());
                if (bArr.length == 0) {
                    z = true;
                }
                if (!z) {
                    this.f39907b.write(bArr);
                }
                this.f39907b.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo69927a(int i, long j) throws IOException {
        if (!this.f39911f) {
            if (j != 0 && j <= 2147483647L) {
                mo69926a(i, 4, 8, 0);
                this.f39907b.writeInt((int) j);
                this.f39907b.flush();
            } else {
                throw new IllegalArgumentException(Intrinsics.stringPlus("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ", Long.valueOf(j)).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final void mo69926a(int i, int i2, int i3, int i4) throws IOException {
        Logger logger = f39906h;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(mb0.f37283a.mo68639a(false, i, i2, i3, i4));
        }
        boolean z = true;
        if (i2 <= this.f39910e) {
            if ((Integer.MIN_VALUE & i) != 0) {
                z = false;
            }
            if (z) {
                BufferedSink bufferedSink = this.f39907b;
                byte[] bArr = jh1.f35305a;
                Intrinsics.checkNotNullParameter(bufferedSink, "<this>");
                bufferedSink.writeByte((i2 >>> 16) & 255);
                bufferedSink.writeByte((i2 >>> 8) & 255);
                bufferedSink.writeByte(i2 & 255);
                this.f39907b.writeByte(i3 & 255);
                this.f39907b.writeByte(i4 & 255);
                this.f39907b.writeInt(i & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("reserved bit set: ", Integer.valueOf(i)).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f39910e + ": " + i2).toString());
    }

    /* renamed from: a */
    public final synchronized void mo69932a(boolean z, int i, List<o90> list) throws IOException {
        Intrinsics.checkNotNullParameter(list, "headerBlock");
        if (!this.f39911f) {
            this.f39912g.mo69922a(list);
            long size = this.f39909d.size();
            long min = Math.min((long) this.f39910e, size);
            int i2 = (size > min ? 1 : (size == min ? 0 : -1));
            int i3 = i2 == 0 ? 4 : 0;
            if (z) {
                i3 |= 1;
            }
            mo69926a(i, (int) min, 1, i3);
            this.f39907b.write(this.f39909d, min);
            if (i2 > 0) {
                m41885b(i, size - min);
            }
        } else {
            throw new IOException("closed");
        }
    }
}
