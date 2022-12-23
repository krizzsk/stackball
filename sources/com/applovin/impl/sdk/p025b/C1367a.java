package com.applovin.impl.sdk.p025b;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.utils.C1557r;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.b.a */
public class C1367a {

    /* renamed from: a */
    private final C1469j f2800a;

    /* renamed from: b */
    private final C1370d f2801b;

    /* renamed from: c */
    private final List<C1369c> f2802c = new ArrayList(25);

    /* renamed from: d */
    private final List<Object> f2803d = new ArrayList(25);

    /* renamed from: e */
    private final Object f2804e = new Object();

    public C1367a(C1370d dVar, C1469j jVar) {
        this.f2800a = jVar;
        this.f2801b = dVar;
        C1557r.m3599a(C1371e.f3156h, 25, jVar);
        m2631a(C1369c.f2886ac, true);
        m2631a(C1369c.f2984cV, true);
        m2631a(C1369c.f3119fa, true);
        m2631a(C1369c.f3120fb, true);
        m2631a(C1369c.f3122fd, true);
        m2631a(C1369c.f2848R, (Object) null);
        m2631a(C1369c.f2848R, (Object) null);
        m2631a(C1369c.f2848R, (Object) null);
        m2631a(C1369c.f2848R, (Object) null);
        m2631a(C1369c.f2848R, (Object) null);
        m2631a(C1369c.f2848R, (Object) null);
        m2631a(C1369c.f2848R, (Object) null);
        m2631a(C1369c.f2848R, (Object) null);
        m2631a(C1369c.f2848R, (Object) null);
        m2631a(C1369c.f2848R, (Object) null);
        m2631a(C1369c.f2848R, (Object) null);
        m2631a(C1369c.f2848R, (Object) null);
        m2631a(C1369c.f2848R, (Object) null);
        m2631a(C1369c.f2848R, (Object) null);
        m2631a(C1369c.f2848R, (Object) null);
        m2631a(C1369c.f2848R, (Object) null);
        m2631a(C1369c.f2848R, (Object) null);
        m2631a(C1369c.f2848R, (Object) null);
        m2631a(C1369c.f2848R, (Object) null);
        m2631a(C1369c.f2848R, (Object) null);
    }

    /* renamed from: a */
    private void m2631a(C1369c cVar, Object obj) {
        this.f2802c.add(cVar);
        this.f2803d.add(obj);
    }

    /* renamed from: a */
    public Object mo12835a(C1369c cVar) {
        synchronized (this.f2804e) {
            int indexOf = this.f2802c.indexOf(cVar);
            if (indexOf == -1) {
                return null;
            }
            Object obj = this.f2803d.get(indexOf);
            return obj;
        }
    }

    /* renamed from: a */
    public void mo12836a() {
        List<String> b = this.f2801b.mo12846b(C1369c.f2849S);
        int intValue = Integer.valueOf(C1557r.m3588a(C1371e.f3156h, this.f2800a)).intValue();
        int i = 0;
        while (i < 25) {
            C1369c cVar = this.f2802c.get(i);
            int i2 = i + 1;
            if (i2 != intValue || b.contains(cVar.mo12838a())) {
                C1505q v = this.f2800a.mo13139v();
                v.mo13277b("LocalSettingsProvider", "Disabling local setting: " + cVar.mo12838a());
                this.f2802c.set(i, C1369c.f2848R);
            }
            i = i2;
        }
        C1505q v2 = this.f2800a.mo13139v();
        v2.mo13277b("LocalSettingsProvider", "Enabled local settings: " + this.f2802c);
    }
}
