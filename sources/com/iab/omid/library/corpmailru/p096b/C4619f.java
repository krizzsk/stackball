package com.iab.omid.library.corpmailru.p096b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.corpmailru.adsession.C4610a;
import com.iab.omid.library.corpmailru.p095a.C4606b;
import com.iab.omid.library.corpmailru.p095a.C4607c;
import com.iab.omid.library.corpmailru.p095a.C4608d;
import com.iab.omid.library.corpmailru.p095a.C4609e;
import com.iab.omid.library.corpmailru.p096b.C4613b;
import com.iab.omid.library.corpmailru.walking.TreeWalker;

/* renamed from: com.iab.omid.library.corpmailru.b.f */
public class C4619f implements C4607c, C4613b.C4614a {

    /* renamed from: a */
    private static C4619f f10411a;

    /* renamed from: b */
    private float f10412b = 0.0f;

    /* renamed from: c */
    private final C4609e f10413c;

    /* renamed from: d */
    private final C4606b f10414d;

    /* renamed from: e */
    private C4608d f10415e;

    /* renamed from: f */
    private C4612a f10416f;

    public C4619f(C4609e eVar, C4606b bVar) {
        this.f10413c = eVar;
        this.f10414d = bVar;
    }

    /* renamed from: a */
    public static C4619f m9785a() {
        if (f10411a == null) {
            f10411a = new C4619f(new C4609e(), new C4606b());
        }
        return f10411a;
    }

    /* renamed from: e */
    private C4612a m9786e() {
        if (this.f10416f == null) {
            this.f10416f = C4612a.m9745a();
        }
        return this.f10416f;
    }

    /* renamed from: a */
    public void mo38690a(float f) {
        this.f10412b = f;
        for (C4610a adSessionStatePublisher : m9786e().mo38766c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo38816a(f);
        }
    }

    /* renamed from: a */
    public void mo38805a(Context context) {
        this.f10415e = this.f10413c.mo38694a(new Handler(), context, this.f10414d.mo38689a(), this);
    }

    /* renamed from: a */
    public void mo38781a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo38841a();
        } else {
            TreeWalker.getInstance().mo38844c();
        }
    }

    /* renamed from: b */
    public void mo38806b() {
        C4613b.m9752a().mo38770a((C4613b.C4614a) this);
        C4613b.m9752a().mo38771b();
        TreeWalker.getInstance().mo38841a();
        this.f10415e.mo38691a();
    }

    /* renamed from: c */
    public void mo38807c() {
        TreeWalker.getInstance().mo38843b();
        C4613b.m9752a().mo38772c();
        this.f10415e.mo38692b();
    }

    /* renamed from: d */
    public float mo38808d() {
        return this.f10412b;
    }
}
