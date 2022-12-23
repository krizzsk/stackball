package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.C15418d;
import com.yandex.mobile.ads.instream.C15419e;

/* renamed from: com.yandex.mobile.ads.impl.j4 */
public class C13473j4 {

    /* renamed from: a */
    private final oz0 f35123a;

    /* renamed from: b */
    private final oj1 f35124b;

    /* renamed from: c */
    private final f11 f35125c;

    /* renamed from: d */
    private C13377i4 f35126d;

    /* renamed from: e */
    private C13377i4 f35127e;

    /* renamed from: f */
    private C13377i4 f35128f;

    public C13473j4(Context context, ng0 ng0, gf0 gf0, vf0 vf0, C15419e eVar, C15418d dVar, oj1 oj1) {
        this.f35124b = oj1;
        this.f35125c = new f11(eVar);
        this.f35123a = new oz0(context, ng0, gf0, vf0, eVar, dVar);
    }

    /* renamed from: a */
    public C13377i4 mo67921a() {
        if (this.f35127e == null) {
            this.f35127e = m37659a(this.f35123a.mo69286a());
        }
        return this.f35127e;
    }

    /* renamed from: b */
    public C13377i4 mo67922b() {
        C13679k4 b;
        if (this.f35128f == null && (b = this.f35123a.mo69287b()) != null) {
            this.f35128f = m37659a(b);
        }
        return this.f35128f;
    }

    /* renamed from: c */
    public C13377i4 mo67923c() {
        C13679k4 c;
        if (this.f35126d == null && this.f35125c.mo66908a() && (c = this.f35123a.mo69288c()) != null) {
            this.f35126d = m37659a(c);
        }
        return this.f35126d;
    }

    /* renamed from: a */
    private C13377i4 m37659a(C13679k4 k4Var) {
        C13377i4 i4Var = new C13377i4(k4Var);
        i4Var.mo67718a(this.f35124b);
        return i4Var;
    }
}
