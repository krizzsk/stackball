package com.fyber.inneractive.sdk.player.p059c.p061b;

import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;

/* renamed from: com.fyber.inneractive.sdk.player.c.b.b */
public final class C3222b {

    /* renamed from: a */
    public byte[] f8110a;

    /* renamed from: b */
    public byte[] f8111b;

    /* renamed from: c */
    public int f8112c;

    /* renamed from: d */
    public int[] f8113d;

    /* renamed from: e */
    public int[] f8114e;

    /* renamed from: f */
    public int f8115f;

    /* renamed from: g */
    public int f8116g;

    /* renamed from: h */
    public int f8117h;

    /* renamed from: i */
    public final MediaCodec.CryptoInfo f8118i;

    /* renamed from: j */
    public final C3223a f8119j;

    public C3222b() {
        C3223a aVar = null;
        this.f8118i = C3560t.f9655a >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.f8119j = C3560t.f9655a >= 24 ? new C3223a(this.f8118i, (byte) 0) : aVar;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.b.b$a */
    private static final class C3223a {

        /* renamed from: a */
        public final MediaCodec.CryptoInfo f8120a;

        /* renamed from: b */
        public final MediaCodec.CryptoInfo.Pattern f8121b;

        /* synthetic */ C3223a(MediaCodec.CryptoInfo cryptoInfo, byte b) {
            this(cryptoInfo);
        }

        private C3223a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f8120a = cryptoInfo;
            this.f8121b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }
}
