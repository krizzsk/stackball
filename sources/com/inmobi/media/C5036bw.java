package com.inmobi.media;

import android.os.SystemClock;

/* renamed from: com.inmobi.media.bw */
/* compiled from: AdNetworkClient */
public final class C5036bw {

    /* renamed from: a */
    private static final String f11487a = C5036bw.class.getSimpleName();

    /* renamed from: b */
    private C5037bx f11488b;

    public C5036bw(C5037bx bxVar) {
        this.f11488b = bxVar;
    }

    /* renamed from: a */
    public final C5038by mo40206a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            C5300gd a = new C5301ge(this.f11488b).mo40629a();
            C5038by byVar = new C5038by(this.f11488b, a);
            try {
                C5369hy.m12420a().mo40732a(this.f11488b.mo40623h());
                C5369hy.m12420a().mo40733b(a.mo40628d());
                if (a.mo40624a()) {
                    return byVar;
                }
                C5369hy.m12420a().mo40734c(SystemClock.elapsedRealtime() - elapsedRealtime);
                return byVar;
            } catch (Exception unused) {
                return byVar;
            }
        } catch (Exception unused2) {
            return null;
        }
    }
}
