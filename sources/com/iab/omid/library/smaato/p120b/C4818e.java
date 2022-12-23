package com.iab.omid.library.smaato.p120b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.smaato.adsession.C4809a;
import com.iab.omid.library.smaato.p119a.C4805b;
import com.iab.omid.library.smaato.p119a.C4806c;
import com.iab.omid.library.smaato.p119a.C4807d;
import com.iab.omid.library.smaato.p119a.C4808e;
import com.iab.omid.library.smaato.p120b.C4812b;
import com.iab.omid.library.smaato.walking.TreeWalker;

/* renamed from: com.iab.omid.library.smaato.b.e */
public class C4818e implements C4806c, C4812b.C4814a {

    /* renamed from: a */
    private static C4818e f10860a;

    /* renamed from: b */
    private float f10861b = 0.0f;

    /* renamed from: c */
    private final C4808e f10862c;

    /* renamed from: d */
    private final C4805b f10863d;

    /* renamed from: e */
    private C4807d f10864e;

    /* renamed from: f */
    private C4811a f10865f;

    public C4818e(C4808e eVar, C4805b bVar) {
        this.f10862c = eVar;
        this.f10863d = bVar;
    }

    /* renamed from: a */
    public static C4818e m10668a() {
        if (f10860a == null) {
            f10860a = new C4818e(new C4808e(), new C4805b());
        }
        return f10860a;
    }

    /* renamed from: e */
    private C4811a m10669e() {
        if (this.f10865f == null) {
            this.f10865f = C4811a.m10631a();
        }
        return this.f10865f;
    }

    /* renamed from: a */
    public void mo39455a(float f) {
        this.f10861b = f;
        for (C4809a adSessionStatePublisher : m10669e().mo39516c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo39553a(f);
        }
    }

    /* renamed from: a */
    public void mo39543a(Context context) {
        this.f10864e = this.f10862c.mo39459a(new Handler(), context, this.f10863d.mo39454a(), this);
    }

    /* renamed from: a */
    public void mo39525a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo39575a();
        } else {
            TreeWalker.getInstance().mo39578c();
        }
    }

    /* renamed from: b */
    public void mo39544b() {
        C4812b.m10638a().mo39520a((C4812b.C4814a) this);
        C4812b.m10638a().mo39521b();
        if (C4812b.m10638a().mo39523d()) {
            TreeWalker.getInstance().mo39575a();
        }
        this.f10864e.mo39456a();
    }

    /* renamed from: c */
    public void mo39545c() {
        TreeWalker.getInstance().mo39577b();
        C4812b.m10638a().mo39522c();
        this.f10864e.mo39457b();
    }

    /* renamed from: d */
    public float mo39546d() {
        return this.f10861b;
    }
}
