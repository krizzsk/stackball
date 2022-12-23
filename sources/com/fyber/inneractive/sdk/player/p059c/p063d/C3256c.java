package com.fyber.inneractive.sdk.player.p059c.p063d;

import com.fyber.inneractive.sdk.player.p059c.p063d.p064a.C3239b;
import com.fyber.inneractive.sdk.player.p059c.p063d.p065b.C3250d;
import com.fyber.inneractive.sdk.player.p059c.p063d.p066c.C3258b;
import com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3330e;
import com.fyber.inneractive.sdk.player.p059c.p063d.p067d.C3335g;
import com.fyber.inneractive.sdk.player.p059c.p063d.p068e.C3347c;
import com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3364a;
import com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3367c;
import com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3385p;
import com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3392u;
import com.fyber.inneractive.sdk.player.p059c.p063d.p070g.C3401a;
import java.lang.reflect.Constructor;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.c */
public final class C3256c implements C3271i {

    /* renamed from: a */
    private static final Constructor<? extends C3268f> f8304a;

    /* renamed from: b */
    private int f8305b;

    /* renamed from: c */
    private int f8306c;

    /* renamed from: d */
    private int f8307d;

    /* renamed from: e */
    private int f8308e = 1;

    /* renamed from: f */
    private int f8309f;

    static {
        Constructor<? extends U> constructor;
        try {
            constructor = Class.forName("com.fyber.inneractive.sdk.player.exoplayer2.ext.flac.FlacExtractor").asSubclass(C3268f.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            constructor = null;
        }
        f8304a = constructor;
    }

    /* renamed from: a */
    public final synchronized C3268f[] mo19002a() {
        C3268f[] fVarArr;
        fVarArr = new C3268f[(f8304a == null ? 11 : 12)];
        fVarArr[0] = new C3250d(this.f8305b);
        fVarArr[1] = new C3330e(this.f8306c);
        fVarArr[2] = new C3335g();
        fVarArr[3] = new C3258b(this.f8307d);
        fVarArr[4] = new C3367c();
        fVarArr[5] = new C3364a();
        fVarArr[6] = new C3392u(this.f8308e, this.f8309f);
        fVarArr[7] = new C3239b();
        fVarArr[8] = new C3347c();
        fVarArr[9] = new C3385p();
        fVarArr[10] = new C3401a();
        if (f8304a != null) {
            try {
                fVarArr[11] = (C3268f) f8304a.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }
        return fVarArr;
    }
}
