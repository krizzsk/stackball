package com.yandex.metrica.impl.p265ob;

import android.location.Location;

/* renamed from: com.yandex.metrica.impl.ob.Fc */
public class C10251Fc extends C11125d0<Location> {

    /* renamed from: b */
    private final C11239fd f24684b;

    public C10251Fc(C11125d0<Location> d0Var, C11239fd fdVar) {
        super(d0Var);
        this.f24684b = fdVar;
    }

    /* renamed from: b */
    public void mo61325b(Object obj) {
        Location location = (Location) obj;
        if (location != null) {
            this.f24684b.mo61901b(location);
        }
    }
}
