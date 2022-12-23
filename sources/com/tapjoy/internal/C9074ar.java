package com.tapjoy.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: com.tapjoy.internal.ar */
public final class C9074ar extends C9073aq {

    /* renamed from: a */
    private final LinkedHashMap f22364a = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: b */
    private int f22365b = 10;

    /* renamed from: a */
    private void m24309a() {
        int size = this.f22364a.size() - this.f22365b;
        if (size > 0) {
            Iterator it = this.f22364a.entrySet().iterator();
            while (size > 0 && it.hasNext()) {
                size--;
                it.next();
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public final void mo57771a(Object obj, Object obj2) {
        super.mo57771a(obj, obj2);
        m24309a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C9070ao mo57772a(Object obj, boolean z) {
        C9068am amVar = (C9068am) this.f22364a.get(obj);
        if (amVar != null || !z) {
            return amVar;
        }
        C9068am amVar2 = new C9068am(obj);
        this.f22364a.put(obj, amVar2);
        m24309a();
        return amVar2;
    }
}
