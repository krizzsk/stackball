package com.iab.omid.library.inmobi.p102b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.inmobi.adsession.C4660a;
import com.iab.omid.library.inmobi.p101a.C4656b;
import com.iab.omid.library.inmobi.p101a.C4657c;
import com.iab.omid.library.inmobi.p101a.C4658d;
import com.iab.omid.library.inmobi.p101a.C4659e;
import com.iab.omid.library.inmobi.p102b.C4663b;
import com.iab.omid.library.inmobi.walking.TreeWalker;

/* renamed from: com.iab.omid.library.inmobi.b.e */
public class C4669e implements C4657c, C4663b.C4665a {

    /* renamed from: a */
    private static C4669e f10523a;

    /* renamed from: b */
    private float f10524b = 0.0f;

    /* renamed from: c */
    private final C4659e f10525c;

    /* renamed from: d */
    private final C4656b f10526d;

    /* renamed from: e */
    private C4658d f10527e;

    /* renamed from: f */
    private C4662a f10528f;

    public C4669e(C4659e eVar, C4656b bVar) {
        this.f10525c = eVar;
        this.f10526d = bVar;
    }

    /* renamed from: a */
    public static C4669e m10008a() {
        if (f10523a == null) {
            f10523a = new C4669e(new C4659e(), new C4656b());
        }
        return f10523a;
    }

    /* renamed from: e */
    private C4662a m10009e() {
        if (this.f10528f == null) {
            this.f10528f = C4662a.m9971a();
        }
        return this.f10528f;
    }

    /* renamed from: a */
    public void mo38889a(float f) {
        this.f10524b = f;
        for (C4660a adSessionStatePublisher : m10009e().mo38950c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo38988a(f);
        }
    }

    /* renamed from: a */
    public void mo38977a(Context context) {
        this.f10527e = this.f10525c.mo38893a(new Handler(), context, this.f10526d.mo38888a(), this);
    }

    /* renamed from: a */
    public void mo38959a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo39010a();
        } else {
            TreeWalker.getInstance().mo39013c();
        }
    }

    /* renamed from: b */
    public void mo38978b() {
        C4663b.m9978a().mo38954a((C4663b.C4665a) this);
        C4663b.m9978a().mo38955b();
        if (C4663b.m9978a().mo38957d()) {
            TreeWalker.getInstance().mo39010a();
        }
        this.f10527e.mo38890a();
    }

    /* renamed from: c */
    public void mo38979c() {
        TreeWalker.getInstance().mo39012b();
        C4663b.m9978a().mo38956c();
        this.f10527e.mo38891b();
    }

    /* renamed from: d */
    public float mo38980d() {
        return this.f10524b;
    }
}
