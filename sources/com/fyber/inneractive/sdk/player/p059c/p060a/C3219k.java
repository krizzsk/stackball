package com.fyber.inneractive.sdk.player.p059c.p060a;

import com.fyber.inneractive.sdk.player.p059c.p060a.C3192c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.fyber.inneractive.sdk.player.c.a.k */
public final class C3219k implements C3192c {

    /* renamed from: b */
    float f8093b = 1.0f;

    /* renamed from: c */
    float f8094c = 1.0f;

    /* renamed from: d */
    long f8095d;

    /* renamed from: e */
    long f8096e;

    /* renamed from: f */
    private int f8097f = -1;

    /* renamed from: g */
    private int f8098g = -1;

    /* renamed from: h */
    private C3218j f8099h;

    /* renamed from: i */
    private ByteBuffer f8100i;

    /* renamed from: j */
    private ShortBuffer f8101j;

    /* renamed from: k */
    private ByteBuffer f8102k;

    /* renamed from: l */
    private boolean f8103l;

    /* renamed from: c */
    public final int mo18904c() {
        return 2;
    }

    public C3219k() {
        ByteBuffer byteBuffer = f7942a;
        this.f8100i = byteBuffer;
        this.f8101j = byteBuffer.asShortBuffer();
        this.f8102k = f7942a;
    }

    /* renamed from: a */
    public final boolean mo18902a(int i, int i2, int i3) throws C3192c.C3193a {
        if (i3 != 2) {
            throw new C3192c.C3193a(i, i2, i3);
        } else if (this.f8098g == i && this.f8097f == i2) {
            return false;
        } else {
            this.f8098g = i;
            this.f8097f = i2;
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo18901a() {
        return Math.abs(this.f8093b - 1.0f) >= 0.01f || Math.abs(this.f8094c - 1.0f) >= 0.01f;
    }

    /* renamed from: b */
    public final int mo18903b() {
        return this.f8097f;
    }

    /* renamed from: a */
    public final void mo18900a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f8095d += (long) remaining;
            C3218j jVar = this.f8099h;
            int remaining2 = asShortBuffer.remaining() / jVar.f8069a;
            jVar.mo18959a(remaining2);
            asShortBuffer.get(jVar.f8071c, jVar.f8075g * jVar.f8069a, ((jVar.f8069a * remaining2) * 2) / 2);
            jVar.f8075g += remaining2;
            jVar.mo18958a();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int i = this.f8099h.f8076h * this.f8097f * 2;
        if (i > 0) {
            if (this.f8100i.capacity() < i) {
                ByteBuffer order = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                this.f8100i = order;
                this.f8101j = order.asShortBuffer();
            } else {
                this.f8100i.clear();
                this.f8101j.clear();
            }
            C3218j jVar2 = this.f8099h;
            ShortBuffer shortBuffer = this.f8101j;
            int min = Math.min(shortBuffer.remaining() / jVar2.f8069a, jVar2.f8076h);
            shortBuffer.put(jVar2.f8072d, 0, jVar2.f8069a * min);
            jVar2.f8076h -= min;
            System.arraycopy(jVar2.f8072d, min * jVar2.f8069a, jVar2.f8072d, 0, jVar2.f8076h * jVar2.f8069a);
            this.f8096e += (long) i;
            this.f8100i.limit(i);
            this.f8102k = this.f8100i;
        }
    }

    /* renamed from: d */
    public final void mo18905d() {
        C3218j jVar = this.f8099h;
        int i = jVar.f8075g;
        int i2 = jVar.f8076h + ((int) ((((((float) i) / (jVar.f8073e / jVar.f8074f)) + ((float) jVar.f8077i)) / jVar.f8074f) + 0.5f));
        jVar.mo18959a((jVar.f8070b * 2) + i);
        for (int i3 = 0; i3 < jVar.f8070b * 2 * jVar.f8069a; i3++) {
            jVar.f8071c[(jVar.f8069a * i) + i3] = 0;
        }
        jVar.f8075g += jVar.f8070b * 2;
        jVar.mo18958a();
        if (jVar.f8076h > i2) {
            jVar.f8076h = i2;
        }
        jVar.f8075g = 0;
        jVar.f8078j = 0;
        jVar.f8077i = 0;
        this.f8103l = true;
    }

    /* renamed from: e */
    public final ByteBuffer mo18906e() {
        ByteBuffer byteBuffer = this.f8102k;
        this.f8102k = f7942a;
        return byteBuffer;
    }

    /* renamed from: f */
    public final boolean mo18907f() {
        if (!this.f8103l) {
            return false;
        }
        C3218j jVar = this.f8099h;
        return jVar == null || jVar.f8076h == 0;
    }

    /* renamed from: g */
    public final void mo18908g() {
        C3218j jVar = new C3218j(this.f8098g, this.f8097f);
        this.f8099h = jVar;
        jVar.f8073e = this.f8093b;
        this.f8099h.f8074f = this.f8094c;
        this.f8102k = f7942a;
        this.f8095d = 0;
        this.f8096e = 0;
        this.f8103l = false;
    }

    /* renamed from: h */
    public final void mo18909h() {
        this.f8099h = null;
        ByteBuffer byteBuffer = f7942a;
        this.f8100i = byteBuffer;
        this.f8101j = byteBuffer.asShortBuffer();
        this.f8102k = f7942a;
        this.f8097f = -1;
        this.f8098g = -1;
        this.f8095d = 0;
        this.f8096e = 0;
        this.f8103l = false;
    }
}
