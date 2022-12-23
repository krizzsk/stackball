package com.yandex.mobile.ads.impl;

import android.support.p003v4.media.session.PlaybackStateCompat;
import com.yandex.mobile.ads.impl.C13184ga;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class va1 implements C13184ga {

    /* renamed from: b */
    private int f41222b;

    /* renamed from: c */
    private float f41223c = 1.0f;

    /* renamed from: d */
    private float f41224d = 1.0f;

    /* renamed from: e */
    private C13184ga.C13185a f41225e;

    /* renamed from: f */
    private C13184ga.C13185a f41226f;

    /* renamed from: g */
    private C13184ga.C13185a f41227g;

    /* renamed from: h */
    private C13184ga.C13185a f41228h;

    /* renamed from: i */
    private boolean f41229i;

    /* renamed from: j */
    private ua1 f41230j;

    /* renamed from: k */
    private ByteBuffer f41231k;

    /* renamed from: l */
    private ShortBuffer f41232l;

    /* renamed from: m */
    private ByteBuffer f41233m;

    /* renamed from: n */
    private long f41234n;

    /* renamed from: o */
    private long f41235o;

    /* renamed from: p */
    private boolean f41236p;

    public va1() {
        C13184ga.C13185a aVar = C13184ga.C13185a.f33913e;
        this.f41225e = aVar;
        this.f41226f = aVar;
        this.f41227g = aVar;
        this.f41228h = aVar;
        ByteBuffer byteBuffer = C13184ga.f33912a;
        this.f41231k = byteBuffer;
        this.f41232l = byteBuffer.asShortBuffer();
        this.f41233m = byteBuffer;
        this.f41222b = -1;
    }

    /* renamed from: a */
    public float mo70463a(float f) {
        int i = ih1.f34858a;
        float max = Math.max(0.1f, Math.min(f, 8.0f));
        if (this.f41224d != max) {
            this.f41224d = max;
            this.f41229i = true;
        }
        return max;
    }

    /* renamed from: b */
    public float mo70465b(float f) {
        int i = ih1.f34858a;
        float max = Math.max(0.1f, Math.min(f, 8.0f));
        if (this.f41223c != max) {
            this.f41223c = max;
            this.f41229i = true;
        }
        return max;
    }

    /* renamed from: c */
    public boolean mo67216c() {
        return this.f41226f.f33914a != -1 && (Math.abs(this.f41223c - 1.0f) >= 0.01f || Math.abs(this.f41224d - 1.0f) >= 0.01f || this.f41226f.f33914a != this.f41225e.f33914a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f41230j;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo67217e() {
        /*
            r1 = this;
            boolean r0 = r1.f41236p
            if (r0 == 0) goto L_0x0010
            com.yandex.mobile.ads.impl.ua1 r0 = r1.f41230j
            if (r0 == 0) goto L_0x000e
            int r0 = r0.mo70311b()
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.va1.mo67217e():boolean");
    }

    public void flush() {
        if (mo67216c()) {
            C13184ga.C13185a aVar = this.f41225e;
            this.f41227g = aVar;
            C13184ga.C13185a aVar2 = this.f41226f;
            this.f41228h = aVar2;
            if (this.f41229i) {
                this.f41230j = new ua1(aVar.f33914a, aVar.f33915b, this.f41223c, this.f41224d, aVar2.f33914a);
            } else {
                ua1 ua1 = this.f41230j;
                if (ua1 != null) {
                    ua1.mo70309a();
                }
            }
        }
        this.f41233m = C13184ga.f33912a;
        this.f41234n = 0;
        this.f41235o = 0;
        this.f41236p = false;
    }

    /* renamed from: g */
    public void mo67219g() {
        this.f41223c = 1.0f;
        this.f41224d = 1.0f;
        C13184ga.C13185a aVar = C13184ga.C13185a.f33913e;
        this.f41225e = aVar;
        this.f41226f = aVar;
        this.f41227g = aVar;
        this.f41228h = aVar;
        ByteBuffer byteBuffer = C13184ga.f33912a;
        this.f41231k = byteBuffer;
        this.f41232l = byteBuffer.asShortBuffer();
        this.f41233m = byteBuffer;
        this.f41222b = -1;
        this.f41229i = false;
        this.f41230j = null;
        this.f41234n = 0;
        this.f41235o = 0;
        this.f41236p = false;
    }

    /* renamed from: a */
    public long mo70464a(long j) {
        long j2 = this.f41235o;
        if (j2 < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            return (long) (((double) this.f41223c) * ((double) j));
        }
        int i = this.f41228h.f33914a;
        int i2 = this.f41227g.f33914a;
        if (i == i2) {
            return ih1.m37369a(j, this.f41234n, j2);
        }
        return ih1.m37369a(j, this.f41234n * ((long) i), j2 * ((long) i2));
    }

    /* renamed from: b */
    public void mo67215b() {
        ua1 ua1 = this.f41230j;
        if (ua1 != null) {
            ua1.mo70313d();
        }
        this.f41236p = true;
    }

    /* renamed from: a */
    public C13184ga.C13185a mo67212a(C13184ga.C13185a aVar) throws C13184ga.C13186b {
        if (aVar.f33916c == 2) {
            int i = this.f41222b;
            if (i == -1) {
                i = aVar.f33914a;
            }
            this.f41225e = aVar;
            C13184ga.C13185a aVar2 = new C13184ga.C13185a(i, aVar.f33915b, 2);
            this.f41226f = aVar2;
            this.f41229i = true;
            return aVar2;
        }
        throw new C13184ga.C13186b(aVar);
    }

    /* renamed from: a */
    public void mo67214a(ByteBuffer byteBuffer) {
        ua1 ua1 = this.f41230j;
        ua1.getClass();
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f41234n += (long) remaining;
            ua1.mo70312b(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int b = ua1.mo70311b();
        if (b > 0) {
            if (this.f41231k.capacity() < b) {
                ByteBuffer order = ByteBuffer.allocateDirect(b).order(ByteOrder.nativeOrder());
                this.f41231k = order;
                this.f41232l = order.asShortBuffer();
            } else {
                this.f41231k.clear();
                this.f41232l.clear();
            }
            ua1.mo70310a(this.f41232l);
            this.f41235o += (long) b;
            this.f41231k.limit(b);
            this.f41233m = this.f41231k;
        }
    }

    /* renamed from: a */
    public ByteBuffer mo67213a() {
        ByteBuffer byteBuffer = this.f41233m;
        this.f41233m = C13184ga.f33912a;
        return byteBuffer;
    }
}
