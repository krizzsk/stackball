package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.media.C5239ey;
import com.inmobi.media.C5266fl;
import com.inmobi.media.C5363hw;
import java.util.UUID;

/* renamed from: com.inmobi.media.hz */
/* compiled from: SignalsComponent */
public class C5371hz {

    /* renamed from: a */
    private static final String f12301a = C5371hz.class.getSimpleName();

    /* renamed from: b */
    private C5363hw f12302b;

    /* renamed from: c */
    private boolean f12303c;

    /* renamed from: com.inmobi.media.hz$a */
    /* compiled from: SignalsComponent */
    static class C5372a {

        /* renamed from: a */
        static final C5371hz f12304a = new C5371hz((byte) 0);
    }

    /* synthetic */ C5371hz(byte b) {
        this();
    }

    /* renamed from: a */
    public static C5371hz m12430a() {
        return C5372a.f12304a;
    }

    private C5371hz() {
    }

    /* renamed from: b */
    public final synchronized void mo40735b() {
        C5239ey.m11987a("signals", C5314go.m12211f(), (C5239ey.C5242c) null);
        C5349hk a = C5349hk.m12370a();
        a.f12265d = m12431d().sessionEnabled;
        if (!a.f12265d) {
            a.f12262a = null;
            a.f12263b = 0;
            a.f12264c = 0;
        }
        C5369hy a2 = C5369hy.m12420a();
        C5371hz hzVar = C5372a.f12304a;
        if (m12431d().sessionEnabled) {
            C5349hk.m12370a().f12262a = UUID.randomUUID().toString();
            C5349hk.m12370a().f12263b = System.currentTimeMillis();
            C5349hk.m12370a().f12264c = 0;
            a2.f12299f = SystemClock.elapsedRealtime();
            a2.f12294a = 0;
            a2.f12295b = 0;
            a2.f12296c = 0;
            a2.f12297d = 0;
            a2.f12298e = 0;
            a2.f12299f = 0;
        }
        if (m12433f()) {
            m12434g();
        }
        if (m12432e()) {
            C5365hx.m12407a().mo40725b();
        }
    }

    /* renamed from: c */
    public final synchronized void mo40736c() {
        C5369hy.m12420a();
        C5369hy.m12421b();
        if (this.f12303c) {
            this.f12303c = false;
            if (this.f12302b != null) {
                C5363hw hwVar = this.f12302b;
                boolean unused = hwVar.f12283a.f12284a = true;
                C5363hw.C5364a aVar = hwVar.f12283a;
                C5371hz hzVar = C5372a.f12304a;
                aVar.sendEmptyMessageDelayed(2, (long) (m12431d().stopRequestTimeout * 1000));
            }
        }
        C5365hx a = C5365hx.m12407a();
        if (C5365hx.m12411c()) {
            if (a.f12287a != null) {
                a.f12287a.removeUpdates(a);
            }
            if (a.f12288b != null) {
                a.f12288b.disconnect();
            }
        }
        a.f12288b = null;
    }

    /* renamed from: a */
    public static C5266fl.C5269b m12429a(String str) {
        return ((C5266fl) C5239ey.m11987a("signals", str, (C5239ey.C5242c) null)).ice;
    }

    /* renamed from: d */
    public static C5266fl.C5269b m12431d() {
        return ((C5266fl) C5239ey.m11987a("signals", C5314go.m12211f(), (C5239ey.C5242c) null)).ice;
    }

    /* renamed from: g */
    private synchronized void m12434g() {
        if (!this.f12303c) {
            this.f12303c = true;
            if (this.f12302b == null) {
                this.f12302b = new C5363hw();
            }
            this.f12302b.mo40723a();
        }
    }

    /* renamed from: e */
    static boolean m12432e() {
        String m = C5314go.m12220m();
        C5382ig b = C5384ii.m12471b();
        String e = b != null ? b.mo40745e() : null;
        return (m == null || m12429a(m).locationEnabled) && (e == null || b.mo40741a()) && (!(b != null && b.mo40744d()) || m12429a(e).locationEnabled);
    }

    /* renamed from: f */
    public static boolean m12433f() {
        String m = C5314go.m12220m();
        C5382ig b = C5384ii.m12471b();
        String e = b != null ? b.mo40745e() : null;
        return (m == null || m12429a(m).f12045w.vwe) && (e == null || b.mo40742b()) && (!(b != null && b.mo40744d()) || m12429a(e).f12045w.vwe);
    }
}
