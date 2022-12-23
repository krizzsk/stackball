package com.iab.omid.library.oguryco.p114b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.oguryco.adsession.C4758a;
import com.iab.omid.library.oguryco.p113a.C4754b;
import com.iab.omid.library.oguryco.p113a.C4755c;
import com.iab.omid.library.oguryco.p113a.C4756d;
import com.iab.omid.library.oguryco.p113a.C4757e;
import com.iab.omid.library.oguryco.p114b.C4761b;
import com.iab.omid.library.oguryco.walking.TreeWalker;

/* renamed from: com.iab.omid.library.oguryco.b.f */
public class C4768f implements C4755c, C4761b.C4763a {

    /* renamed from: a */
    private static C4768f f10748a;

    /* renamed from: b */
    private float f10749b = 0.0f;

    /* renamed from: c */
    private final C4757e f10750c;

    /* renamed from: d */
    private final C4754b f10751d;

    /* renamed from: e */
    private C4756d f10752e;

    /* renamed from: f */
    private C4760a f10753f;

    public C4768f(C4757e eVar, C4754b bVar) {
        this.f10750c = eVar;
        this.f10751d = bVar;
    }

    /* renamed from: a */
    public static C4768f m10445a() {
        if (f10748a == null) {
            f10748a = new C4768f(new C4757e(), new C4754b());
        }
        return f10748a;
    }

    /* renamed from: e */
    private C4760a m10446e() {
        if (this.f10753f == null) {
            this.f10753f = C4760a.m10402a();
        }
        return this.f10753f;
    }

    /* renamed from: a */
    public void mo39236a(float f) {
        this.f10749b = f;
        for (C4758a adSessionStatePublisher : m10446e().mo39338c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo39382a(f);
        }
    }

    /* renamed from: a */
    public void mo39371a(Context context) {
        this.f10752e = this.f10750c.mo39240a(new Handler(), context, this.f10751d.mo39235a(), this);
    }

    /* renamed from: a */
    public void mo39347a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo39407a();
        } else {
            TreeWalker.getInstance().mo39410c();
        }
    }

    /* renamed from: b */
    public void mo39372b() {
        C4761b.m10409a().mo39342a((C4761b.C4763a) this);
        C4761b.m10409a().mo39343b();
        if (C4761b.m10409a().mo39345d()) {
            TreeWalker.getInstance().mo39407a();
        }
        this.f10752e.mo39237a();
    }

    /* renamed from: c */
    public void mo39373c() {
        TreeWalker.getInstance().mo39409b();
        C4761b.m10409a().mo39344c();
        this.f10752e.mo39238b();
    }

    /* renamed from: d */
    public float mo39374d() {
        return this.f10749b;
    }
}
