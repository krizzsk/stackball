package com.iab.omid.library.ironsrc.p108b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.ironsrc.adsession.C4708a;
import com.iab.omid.library.ironsrc.p107a.C4704b;
import com.iab.omid.library.ironsrc.p107a.C4705c;
import com.iab.omid.library.ironsrc.p107a.C4706d;
import com.iab.omid.library.ironsrc.p107a.C4707e;
import com.iab.omid.library.ironsrc.p108b.C4711b;
import com.iab.omid.library.ironsrc.walking.TreeWalker;

/* renamed from: com.iab.omid.library.ironsrc.b.f */
public class C4717f implements C4705c, C4711b.C4712a {

    /* renamed from: a */
    private static C4717f f10627a;

    /* renamed from: b */
    private float f10628b = 0.0f;

    /* renamed from: c */
    private final C4707e f10629c;

    /* renamed from: d */
    private final C4704b f10630d;

    /* renamed from: e */
    private C4706d f10631e;

    /* renamed from: f */
    private C4710a f10632f;

    public C4717f(C4707e eVar, C4704b bVar) {
        this.f10629c = eVar;
        this.f10630d = bVar;
    }

    /* renamed from: a */
    public static C4717f m10217a() {
        if (f10627a == null) {
            f10627a = new C4717f(new C4707e(), new C4704b());
        }
        return f10627a;
    }

    /* renamed from: e */
    private C4710a m10218e() {
        if (this.f10632f == null) {
            this.f10632f = C4710a.m10179a();
        }
        return this.f10632f;
    }

    /* renamed from: a */
    public void mo39050a(float f) {
        this.f10628b = f;
        for (C4708a adSessionStatePublisher : m10218e().mo39126c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo39168a(f);
        }
    }

    /* renamed from: a */
    public void mo39157a(Context context) {
        this.f10631e = this.f10629c.mo39054a(new Handler(), context, this.f10630d.mo39049a(), this);
    }

    /* renamed from: b */
    public void mo39158b() {
        C4711b.m10186a().mo39130a((C4711b.C4712a) this);
        C4711b.m10186a().mo39131b();
        if (C4711b.m10186a().mo39133d()) {
            TreeWalker.getInstance().mo39193a();
        }
        this.f10631e.mo39051a();
    }

    /* renamed from: c */
    public void mo39159c() {
        TreeWalker.getInstance().mo39195b();
        C4711b.m10186a().mo39132c();
        this.f10631e.mo39052b();
    }

    /* renamed from: d */
    public float mo39160d() {
        return this.f10628b;
    }
}
