package com.tapjoy.internal;

import android.support.p003v4.media.session.PlaybackStateCompat;

/* renamed from: com.tapjoy.internal.iz */
final class C9441iz {

    /* renamed from: a */
    static C9440iy f23471a;

    /* renamed from: b */
    static long f23472b;

    private C9441iz() {
    }

    /* renamed from: a */
    static C9440iy m25385a() {
        synchronized (C9441iz.class) {
            if (f23471a == null) {
                return new C9440iy();
            }
            C9440iy iyVar = f23471a;
            f23471a = iyVar.f23469f;
            iyVar.f23469f = null;
            f23472b -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            return iyVar;
        }
    }

    /* renamed from: a */
    static void m25386a(C9440iy iyVar) {
        if (iyVar.f23469f != null || iyVar.f23470g != null) {
            throw new IllegalArgumentException();
        } else if (!iyVar.f23467d) {
            synchronized (C9441iz.class) {
                if (f23472b + PlaybackStateCompat.ACTION_PLAY_FROM_URI <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                    f23472b += PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                    iyVar.f23469f = f23471a;
                    iyVar.f23466c = 0;
                    iyVar.f23465b = 0;
                    f23471a = iyVar;
                }
            }
        }
    }
}
