package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.Player;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.io.IOException;

public class l40 {

    /* renamed from: a */
    private final C15146x4 f36511a;

    /* renamed from: b */
    private final C14735u2 f36512b;

    /* renamed from: c */
    private final C13472j3 f36513c;

    /* renamed from: d */
    private final C12952e3 f36514d;

    /* renamed from: e */
    private final C13189gc f36515e;

    /* renamed from: f */
    private final r40 f36516f;

    /* renamed from: g */
    private final C14742u5 f36517g = new C14742u5();

    /* renamed from: h */
    private final Handler f36518h = new Handler(Looper.getMainLooper());

    public l40(C13189gc gcVar, C15029w4 w4Var, C13472j3 j3Var, r40 r40) {
        this.f36512b = w4Var.mo70632a();
        this.f36511a = w4Var.mo70633b();
        this.f36514d = w4Var.mo70634c();
        this.f36513c = j3Var;
        this.f36515e = gcVar;
        this.f36516f = r40;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m38574a(int i, int i2, long j) {
        if (SystemClock.elapsedRealtime() - j < 200) {
            Player a = this.f36516f.mo69687a();
            if (a == null || a.getDuration() == -9223372036854775807L) {
                this.f36518h.postDelayed(new Runnable(i, i2, j) {
                    public final /* synthetic */ int f$1;
                    public final /* synthetic */ int f$2;
                    public final /* synthetic */ long f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        l40.this.m38574a(this.f$1, this.f$2, this.f$3);
                    }
                }, 20);
            } else {
                m38576b(i, i2);
            }
        } else {
            m38576b(i, i2);
        }
    }

    /* renamed from: a */
    public void mo68327a(int i, int i2) {
        m38574a(i, i2, SystemClock.elapsedRealtime());
    }

    /* renamed from: a */
    private void m38575a(int i, int i2, IOException iOException) {
        this.f36514d.mo66747a(this.f36514d.mo66746a().withAdLoadError(i, i2));
        VideoAd a = this.f36512b.mo70277a(new C14436r2(i, i2));
        if (a != null) {
            this.f36511a.mo70825a(a, qf0.ERROR);
            this.f36513c.onError(a, this.f36517g.mo70291c(iOException));
        }
    }

    /* renamed from: b */
    private void m38576b(int i, int i2) {
        VideoAd a = this.f36512b.mo70277a(new C14436r2(i, i2));
        if (a != null) {
            this.f36511a.mo70825a(a, qf0.PREPARED);
            this.f36513c.onAdPrepared(a);
        }
    }

    /* renamed from: b */
    public void mo68328b(int i, int i2, IOException iOException) {
        if (this.f36516f.mo69690b() && this.f36515e.mo67228b()) {
            try {
                m38575a(i, i2, iOException);
            } catch (RuntimeException unused) {
            }
        }
    }
}
