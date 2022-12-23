package com.iab.omid.library.adcolony.p090b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.adcolony.adsession.C4560a;
import com.iab.omid.library.adcolony.p089a.C4556b;
import com.iab.omid.library.adcolony.p089a.C4557c;
import com.iab.omid.library.adcolony.p089a.C4558d;
import com.iab.omid.library.adcolony.p089a.C4559e;
import com.iab.omid.library.adcolony.p090b.C4563b;
import com.iab.omid.library.adcolony.walking.TreeWalker;

/* renamed from: com.iab.omid.library.adcolony.b.f */
public class C4569f implements C4557c, C4563b.C4564a {

    /* renamed from: f */
    private static C4569f f10298f;

    /* renamed from: a */
    private float f10299a = 0.0f;

    /* renamed from: b */
    private final C4559e f10300b;

    /* renamed from: c */
    private final C4556b f10301c;

    /* renamed from: d */
    private C4558d f10302d;

    /* renamed from: e */
    private C4562a f10303e;

    public C4569f(C4559e eVar, C4556b bVar) {
        this.f10300b = eVar;
        this.f10301c = bVar;
    }

    /* renamed from: a */
    public static C4569f m9562a() {
        if (f10298f == null) {
            f10298f = new C4569f(new C4559e(), new C4556b());
        }
        return f10298f;
    }

    /* renamed from: e */
    private C4562a m9563e() {
        if (this.f10303e == null) {
            this.f10303e = C4562a.m9524a();
        }
        return this.f10303e;
    }

    /* renamed from: a */
    public void mo38504a(float f) {
        this.f10299a = f;
        for (C4560a adSessionStatePublisher : m9563e().mo38580c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo38622a(f);
        }
    }

    /* renamed from: a */
    public void mo38611a(Context context) {
        this.f10302d = this.f10300b.mo38508a(new Handler(), context, this.f10301c.mo38503a(), this);
    }

    /* renamed from: b */
    public void mo38612b() {
        C4563b.m9531a().mo38584a((C4563b.C4564a) this);
        C4563b.m9531a().mo38585b();
        if (C4563b.m9531a().mo38587d()) {
            TreeWalker.getInstance().mo38647a();
        }
        this.f10302d.mo38505a();
    }

    /* renamed from: c */
    public void mo38613c() {
        TreeWalker.getInstance().mo38649b();
        C4563b.m9531a().mo38586c();
        this.f10302d.mo38506b();
    }

    /* renamed from: d */
    public float mo38614d() {
        return this.f10299a;
    }
}
