package com.iab.omid.library.vungle.p126b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.vungle.adsession.C4857a;
import com.iab.omid.library.vungle.p125a.C4853b;
import com.iab.omid.library.vungle.p125a.C4854c;
import com.iab.omid.library.vungle.p125a.C4855d;
import com.iab.omid.library.vungle.p125a.C4856e;
import com.iab.omid.library.vungle.p126b.C4860b;
import com.iab.omid.library.vungle.walking.TreeWalker;

/* renamed from: com.iab.omid.library.vungle.b.f */
public class C4866f implements C4854c, C4860b.C4861a {

    /* renamed from: a */
    private static C4866f f10960a;

    /* renamed from: b */
    private float f10961b = 0.0f;

    /* renamed from: c */
    private final C4856e f10962c;

    /* renamed from: d */
    private final C4853b f10963d;

    /* renamed from: e */
    private C4855d f10964e;

    /* renamed from: f */
    private C4859a f10965f;

    public C4866f(C4856e eVar, C4853b bVar) {
        this.f10962c = eVar;
        this.f10963d = bVar;
    }

    /* renamed from: a */
    public static C4866f m10873a() {
        if (f10960a == null) {
            f10960a = new C4866f(new C4856e(), new C4853b());
        }
        return f10960a;
    }

    /* renamed from: e */
    private C4859a m10874e() {
        if (this.f10965f == null) {
            this.f10965f = C4859a.m10833a();
        }
        return this.f10965f;
    }

    /* renamed from: a */
    public void mo39612a(float f) {
        this.f10961b = f;
        for (C4857a adSessionStatePublisher : m10874e().mo39688c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo39738a(f);
        }
    }

    /* renamed from: a */
    public void mo39727a(Context context) {
        this.f10964e = this.f10962c.mo39616a(new Handler(), context, this.f10963d.mo39611a(), this);
    }

    /* renamed from: a */
    public void mo39703a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo39763a();
        } else {
            TreeWalker.getInstance().mo39766c();
        }
    }

    /* renamed from: b */
    public void mo39728b() {
        C4860b.m10840a().mo39692a((C4860b.C4861a) this);
        C4860b.m10840a().mo39693b();
        TreeWalker.getInstance().mo39763a();
        this.f10964e.mo39613a();
    }

    /* renamed from: c */
    public void mo39729c() {
        TreeWalker.getInstance().mo39765b();
        C4860b.m10840a().mo39694c();
        this.f10964e.mo39614b();
    }

    /* renamed from: d */
    public float mo39730d() {
        return this.f10961b;
    }
}
