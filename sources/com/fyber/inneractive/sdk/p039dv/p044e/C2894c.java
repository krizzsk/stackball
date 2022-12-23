package com.fyber.inneractive.sdk.p039dv.p044e;

import android.app.Activity;
import com.fyber.inneractive.sdk.C2680a;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.p037d.C2836g;
import com.fyber.inneractive.sdk.p037d.C2847l;
import com.fyber.inneractive.sdk.p039dv.p043d.C2878a;
import com.fyber.inneractive.sdk.p045e.C2900c;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.dv.e.c */
public final class C2894c extends C2847l<C2680a, InneractiveFullscreenAdEventsListener> implements C2878a, C2900c {

    /* renamed from: l */
    private C2900c.C2902b f6850l;

    /* renamed from: m */
    private boolean f6851m = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo18183a(long j) {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo18187a(C2836g gVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo18188b(C2836g gVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ boolean mo18189c(C2836g gVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo18190e() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final long mo18191f() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo18192g() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo18193h() {
        return false;
    }

    /* renamed from: i */
    public final boolean mo18262i() {
        return false;
    }

    /* renamed from: j */
    public final void mo18263j() {
    }

    /* renamed from: k */
    public final void mo18264k() {
    }

    /* renamed from: a */
    public final void mo18185a(C2900c.C2901a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError {
        super.mo18185a(aVar, activity);
        if (activity == null) {
            IAlog.m9036d("%sYou must pass activity in order to show rewarded", IAlog.m9029a((Object) this));
            throw new InneractiveUnitController.AdDisplayError("No activity context");
        } else if (this.f6749b == null || ((C2680a) this.f6749b).mo18228e() == null) {
            IAlog.m9036d("%sad content is null aborting", IAlog.m9029a((Object) this));
            throw new InneractiveUnitController.AdDisplayError("Ad content is null");
        } else {
            ((C2680a) this.f6749b).mo17884a(this, activity);
        }
    }

    /* renamed from: a */
    public final void mo18261a(C2900c.C2902b bVar) {
        this.f6850l = bVar;
    }

    /* renamed from: a */
    public final void mo18230a() {
        mo18148n();
    }

    /* renamed from: b */
    public final void mo18254b() {
        if (this.f6749b != null) {
            mo18138a((C3018e) ((C2680a) this.f6749b).mo18227c());
        }
        mo18147m();
    }

    /* renamed from: c */
    public final void mo18255c() {
        C2900c.C2902b bVar = this.f6850l;
        if (bVar != null) {
            bVar.mo18274a();
            mo18145g_();
        }
    }

    /* renamed from: d */
    public final void mo18256d() {
        if (!this.f6851m && this.f6750c != null) {
            this.f6851m = true;
            ((InneractiveFullscreenAdEventsListener) this.f6750c).onAdDismissed(this.f6748a);
        }
    }
}
