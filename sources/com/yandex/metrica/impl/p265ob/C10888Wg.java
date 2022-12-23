package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10813Ug;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Wg */
public class C10888Wg implements C10813Ug.C10814a {

    /* renamed from: a */
    private final Set<C10224Eg> f26169a;

    /* renamed from: b */
    private boolean f26170b;

    /* renamed from: c */
    private C10255Fg f26171c;

    public C10888Wg() {
        this(C10619P0.m27164i().mo61887o());
    }

    /* renamed from: a */
    public synchronized void mo62363a(C10255Fg fg) {
        this.f26171c = fg;
        this.f26170b = true;
        for (C10224Eg a : this.f26169a) {
            a.mo61194a(this.f26171c);
        }
        this.f26169a.clear();
    }

    C10888Wg(C10813Ug ug) {
        this.f26169a = new HashSet();
        ug.mo62361a((C10854Vg) new C11046ah(this));
        ug.mo62362b();
    }

    /* renamed from: a */
    public synchronized void mo62452a(C10224Eg eg) {
        this.f26169a.add(eg);
        if (this.f26170b) {
            eg.mo61194a(this.f26171c);
            this.f26169a.remove(eg);
        }
    }
}
