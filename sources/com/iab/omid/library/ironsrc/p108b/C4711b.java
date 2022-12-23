package com.iab.omid.library.ironsrc.p108b;

import android.content.Context;
import com.iab.omid.library.ironsrc.adsession.C4708a;

/* renamed from: com.iab.omid.library.ironsrc.b.b */
public class C4711b {

    /* renamed from: a */
    private static C4711b f10612a = new C4711b();

    /* renamed from: b */
    private Context f10613b;

    /* renamed from: c */
    private boolean f10614c;

    /* renamed from: d */
    private boolean f10615d;

    /* renamed from: e */
    private C4712a f10616e;

    /* renamed from: com.iab.omid.library.ironsrc.b.b$a */
    public interface C4712a {
    }

    private C4711b() {
    }

    /* renamed from: a */
    public static C4711b m10186a() {
        return f10612a;
    }

    /* renamed from: e */
    private void m10187e() {
        boolean z = !this.f10615d;
        for (C4708a adSessionStatePublisher : C4710a.m10179a().mo39124b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo39180a(z);
        }
    }

    /* renamed from: a */
    public void mo39129a(Context context) {
        this.f10613b = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo39130a(C4712a aVar) {
        this.f10616e = aVar;
    }

    /* renamed from: b */
    public void mo39131b() {
        this.f10614c = true;
        m10187e();
    }

    /* renamed from: c */
    public void mo39132c() {
        this.f10614c = false;
        this.f10615d = false;
        this.f10616e = null;
    }

    /* renamed from: d */
    public boolean mo39133d() {
        return !this.f10615d;
    }
}
