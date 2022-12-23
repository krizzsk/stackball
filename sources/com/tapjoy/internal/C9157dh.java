package com.tapjoy.internal;

import com.tapjoy.internal.C9151de;
import java.util.Collections;

/* renamed from: com.tapjoy.internal.dh */
public final class C9157dh implements C9134co, C9151de.C9153a {

    /* renamed from: c */
    private static C9157dh f22514c;

    /* renamed from: a */
    public float f22515a = 0.0f;

    /* renamed from: b */
    public C9135cp f22516b;

    /* renamed from: d */
    private final C9136cq f22517d;

    /* renamed from: e */
    private final C9133cn f22518e;

    /* renamed from: f */
    private C9150dd f22519f;

    private C9157dh(C9136cq cqVar, C9133cn cnVar) {
        this.f22517d = cqVar;
        this.f22518e = cnVar;
    }

    /* renamed from: a */
    public static C9157dh m24521a() {
        if (f22514c == null) {
            f22514c = new C9157dh(new C9136cq(), new C9133cn());
        }
        return f22514c;
    }

    /* renamed from: a */
    public final void mo57951a(boolean z) {
        C9175dv.m24560a();
        if (z) {
            C9175dv.m24564b();
        } else {
            C9175dv.m24566c();
        }
    }

    /* renamed from: a */
    public final void mo57920a(float f) {
        this.f22515a = f;
        if (this.f22519f == null) {
            this.f22519f = C9150dd.m24507a();
        }
        for (C9145cz czVar : Collections.unmodifiableCollection(this.f22519f.f22500b)) {
            czVar.f22480c.mo57960a(f);
        }
    }
}
