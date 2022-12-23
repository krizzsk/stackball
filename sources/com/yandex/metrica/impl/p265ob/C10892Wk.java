package com.yandex.metrica.impl.p265ob;

import android.util.Pair;
import com.yandex.metrica.impl.p265ob.C10893Wl;

/* renamed from: com.yandex.metrica.impl.ob.Wk */
class C10892Wk {

    /* renamed from: a */
    private final C10939Xm<C10937Xk, Pair<Boolean, C10893Wl.C10895b>> f26176a;

    /* renamed from: b */
    private final int f26177b;

    C10892Wk(int i, int i2) {
        this.f26176a = new C10967Yk(i);
        this.f26177b = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo62458a(int i, String str, boolean z, C10893Wl.C10895b bVar) {
        if (str.length() <= this.f26177b) {
            this.f26176a.mo62494a(new C10937Xk(i, str), new Pair(Boolean.valueOf(z), bVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Pair<Boolean, C10893Wl.C10895b> mo62456a(int i, String str) {
        if (str.length() > this.f26177b) {
            return null;
        }
        return this.f26176a.mo62493a(new C10937Xk(i, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo62457a() {
        this.f26176a.mo62495a();
    }
}
