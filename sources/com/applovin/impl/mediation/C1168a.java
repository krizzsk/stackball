package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.mediation.p020b.C1225c;
import com.applovin.impl.sdk.C1326a;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.utils.C1512a;

/* renamed from: com.applovin.impl.mediation.a */
public class C1168a extends C1512a {

    /* renamed from: a */
    private final C1326a f2182a;

    /* renamed from: b */
    private final C1505q f2183b;

    /* renamed from: c */
    private C1169a f2184c;

    /* renamed from: d */
    private C1225c f2185d;

    /* renamed from: e */
    private int f2186e;

    /* renamed from: f */
    private boolean f2187f;

    /* renamed from: com.applovin.impl.mediation.a$a */
    public interface C1169a {
        /* renamed from: a */
        void mo12143a(C1225c cVar);
    }

    C1168a(C1469j jVar) {
        this.f2183b = jVar.mo13139v();
        this.f2182a = jVar.mo13086Z();
    }

    /* renamed from: a */
    public void mo12141a() {
        this.f2183b.mo13277b("AdActivityObserver", "Cancelling...");
        this.f2182a.mo12604b(this);
        this.f2184c = null;
        this.f2185d = null;
        this.f2186e = 0;
        this.f2187f = false;
    }

    /* renamed from: a */
    public void mo12142a(C1225c cVar, C1169a aVar) {
        C1505q qVar = this.f2183b;
        qVar.mo13277b("AdActivityObserver", "Starting for ad " + cVar.getAdUnitId() + "...");
        mo12141a();
        this.f2184c = aVar;
        this.f2185d = cVar;
        this.f2182a.mo12602a(this);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.f2187f) {
            this.f2187f = true;
        }
        this.f2186e++;
        this.f2183b.mo13277b("AdActivityObserver", "Created Activity: " + activity + ", counter is " + this.f2186e);
    }

    public void onActivityDestroyed(Activity activity) {
        if (this.f2187f) {
            this.f2186e--;
            this.f2183b.mo13277b("AdActivityObserver", "Destroyed Activity: " + activity + ", counter is " + this.f2186e);
            if (this.f2186e <= 0) {
                this.f2183b.mo13277b("AdActivityObserver", "Last ad Activity destroyed");
                if (this.f2184c != null) {
                    this.f2183b.mo13277b("AdActivityObserver", "Invoking callback...");
                    this.f2184c.mo12143a(this.f2185d);
                }
                mo12141a();
            }
        }
    }
}
