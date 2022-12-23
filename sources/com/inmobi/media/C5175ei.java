package com.inmobi.media;

import android.media.MediaPlayer;

/* renamed from: com.inmobi.media.ei */
/* compiled from: NativeMediaPlayer */
public final class C5175ei extends MediaPlayer {

    /* renamed from: d */
    private static final Object f11889d = new Object();

    /* renamed from: e */
    private static C5175ei f11890e;

    /* renamed from: f */
    private static int f11891f = 0;

    /* renamed from: a */
    public int f11892a = 0;

    /* renamed from: b */
    public int f11893b = 0;

    /* renamed from: c */
    private C5175ei f11894c;

    /* renamed from: a */
    public static C5175ei m11850a() {
        synchronized (f11889d) {
            if (f11890e == null) {
                return new C5175ei();
            }
            C5175ei eiVar = f11890e;
            f11890e = eiVar.f11894c;
            eiVar.f11894c = null;
            f11891f--;
            return eiVar;
        }
    }

    /* renamed from: b */
    public final void mo40470b() {
        if (!(3 == this.f11892a)) {
            synchronized (f11889d) {
                if (f11891f < 5) {
                    this.f11894c = f11890e;
                    f11890e = this;
                    f11891f++;
                }
            }
        }
    }
}
