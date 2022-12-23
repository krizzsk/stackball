package com.chartboost.sdk.impl;

import com.chartboost.sdk.C2022j;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.C1844h;
import java.lang.ref.WeakReference;

/* renamed from: com.chartboost.sdk.impl.q */
public class C1971q {

    /* renamed from: a */
    private C1977s f5065a = null;

    /* renamed from: b */
    private C1984u f5066b = null;

    /* renamed from: c */
    private WeakReference<C1974r> f5067c;

    /* renamed from: d */
    private WeakReference<C1980t> f5068d;

    /* renamed from: e */
    private boolean f5069e = true;

    /* renamed from: c */
    private void m4778c() {
        WeakReference<C1980t> weakReference = this.f5068d;
        if (weakReference != null) {
            weakReference.clear();
            this.f5068d = null;
        }
    }

    /* renamed from: e */
    private C1844h.C1845a m4779e() {
        C1844h j;
        C2022j b = C2022j.m4955b();
        if (b == null || (j = b.mo14905j()) == null) {
            return null;
        }
        return j.mo14317a();
    }

    /* renamed from: a */
    public void mo14767a(C1974r rVar) {
        m4777b();
        this.f5067c = new WeakReference<>(rVar);
    }

    /* renamed from: b */
    public C1984u mo14770b(WeakReference<C1980t> weakReference, double d) {
        return new C1984u(weakReference, d);
    }

    /* renamed from: d */
    public boolean mo14771d() {
        return this.f5069e;
    }

    /* renamed from: f */
    public double mo14772f() {
        C1844h.C1845a e = m4779e();
        if (e != null) {
            return e.mo14321a();
        }
        return 30.0d;
    }

    /* renamed from: g */
    public double mo14773g() {
        C1844h.C1845a e = m4779e();
        if (e != null) {
            return e.mo14322b();
        }
        return 30.0d;
    }

    /* renamed from: h */
    public void mo14774h() {
        if (this.f5065a != null) {
            CBLogging.m3991a("BannerAutoRefreshManager", "Auto-refreshed is paused at: " + this.f5065a.mo14849c());
            this.f5065a.mo14851e();
        }
    }

    /* renamed from: i */
    public void mo14775i() {
        C1984u uVar = this.f5066b;
        if (uVar != null) {
            uVar.mo14851e();
        }
    }

    /* renamed from: j */
    public void mo14776j() {
        mo14780n();
        if (this.f5065a == null && this.f5069e && this.f5067c != null) {
            CBLogging.m3991a("BannerAutoRefreshManager", "Register auto refresh start");
            C1977s a = mo14765a(this.f5067c, mo14772f());
            this.f5065a = a;
            a.mo14853h();
        }
    }

    /* renamed from: k */
    public void mo14777k() {
        mo14781o();
        if (this.f5066b == null && this.f5069e && this.f5068d != null) {
            CBLogging.m3991a("BannerAutoRefreshManager", "Register timeout start");
            C1984u b = mo14770b(this.f5068d, mo14773g());
            this.f5066b = b;
            b.mo14853h();
        }
    }

    /* renamed from: l */
    public void mo14778l() {
        if (this.f5065a != null) {
            CBLogging.m3991a("BannerAutoRefreshManager", "Auto-refreshed is resumed at: " + this.f5065a.mo14849c());
            this.f5065a.mo14852g();
            return;
        }
        mo14776j();
    }

    /* renamed from: m */
    public void mo14779m() {
        if (this.f5066b != null) {
            CBLogging.m3991a("BannerAutoRefreshManager", "Timeout banner is resumed at: " + this.f5066b.mo14849c());
            this.f5066b.mo14852g();
        }
    }

    /* renamed from: n */
    public void mo14780n() {
        C1977s sVar = this.f5065a;
        if (sVar != null) {
            sVar.mo14788i();
            this.f5065a = null;
        }
    }

    /* renamed from: o */
    public void mo14781o() {
        C1984u uVar = this.f5066b;
        if (uVar != null) {
            uVar.mo14788i();
            this.f5066b = null;
        }
    }

    /* renamed from: b */
    private void m4777b() {
        WeakReference<C1974r> weakReference = this.f5067c;
        if (weakReference != null) {
            weakReference.clear();
            this.f5067c = null;
        }
    }

    /* renamed from: a */
    public void mo14768a(C1980t tVar) {
        m4778c();
        this.f5068d = new WeakReference<>(tVar);
    }

    /* renamed from: a */
    public C1977s mo14765a(WeakReference<C1974r> weakReference, double d) {
        return new C1977s(weakReference, d);
    }

    /* renamed from: a */
    public void mo14769a(boolean z) {
        this.f5069e = z;
        if (z) {
            mo14779m();
            mo14778l();
            return;
        }
        mo14775i();
        mo14774h();
    }

    /* renamed from: a */
    public void mo14766a() {
        m4777b();
        m4778c();
    }
}
