package com.iab.omid.library.adcolony.p090b;

import android.content.Context;
import com.iab.omid.library.adcolony.adsession.C4560a;

/* renamed from: com.iab.omid.library.adcolony.b.b */
public class C4563b {

    /* renamed from: e */
    private static C4563b f10283e = new C4563b();

    /* renamed from: a */
    private Context f10284a;

    /* renamed from: b */
    private boolean f10285b;

    /* renamed from: c */
    private boolean f10286c;

    /* renamed from: d */
    private C4564a f10287d;

    /* renamed from: com.iab.omid.library.adcolony.b.b$a */
    public interface C4564a {
    }

    private C4563b() {
    }

    /* renamed from: a */
    public static C4563b m9531a() {
        return f10283e;
    }

    /* renamed from: e */
    private void m9532e() {
        boolean z = !this.f10286c;
        for (C4560a adSessionStatePublisher : C4562a.m9524a().mo38578b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo38634a(z);
        }
    }

    /* renamed from: a */
    public void mo38583a(Context context) {
        this.f10284a = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo38584a(C4564a aVar) {
        this.f10287d = aVar;
    }

    /* renamed from: b */
    public void mo38585b() {
        this.f10285b = true;
        m9532e();
    }

    /* renamed from: c */
    public void mo38586c() {
        this.f10285b = false;
        this.f10286c = false;
        this.f10287d = null;
    }

    /* renamed from: d */
    public boolean mo38587d() {
        return !this.f10286c;
    }
}
