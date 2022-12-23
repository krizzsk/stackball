package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.impl.p265ob.C10910X3;
import com.yandex.metrica.impl.p265ob.C11369j4;
import com.yandex.metrica.impl.p265ob.C11517m4;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.r4 */
public class C11703r4<COMPONENT extends C11517m4 & C11369j4> implements Object, C10466Li {

    /* renamed from: a */
    private final Context f28047a;

    /* renamed from: b */
    private final C11101c4 f28048b;

    /* renamed from: c */
    private final C10359I4<COMPONENT> f28049c;

    /* renamed from: d */
    private final C10757Si f28050d;

    /* renamed from: e */
    private final C11902w4 f28051e;

    /* renamed from: f */
    private COMPONENT f28052f;

    /* renamed from: g */
    private C11416k4 f28053g;

    /* renamed from: h */
    private List<C10466Li> f28054h = new ArrayList();

    /* renamed from: i */
    private final C11132d4<C10210E4> f28055i;

    public C11703r4(Context context, C11101c4 c4Var, C10910X3 x3, C11902w4 w4Var, C10359I4<COMPONENT> i4, C11132d4<C10210E4> d4Var, C10258Fi fi) {
        this.f28047a = context;
        this.f28048b = c4Var;
        this.f28051e = w4Var;
        this.f28049c = i4;
        this.f28055i = d4Var;
        this.f28050d = fi.mo61330a(context, c4Var, x3.f26219a);
        fi.mo61331a(c4Var, (C10466Li) this);
    }

    /* renamed from: a */
    public void mo63569a(C11411k0 k0Var, C10910X3 x3) {
        COMPONENT component;
        ((C10771T4) m30145a()).mo62277b();
        if (C10385J0.m26639a(k0Var.mo63161n())) {
            component = m30145a();
        } else {
            if (this.f28052f == null) {
                synchronized (this) {
                    COMPONENT a = this.f28049c.mo61094a(this.f28047a, this.f28048b, this.f28051e.mo64010a(), this.f28050d);
                    this.f28052f = a;
                    this.f28054h.add(a);
                }
            }
            component = this.f28052f;
        }
        if (!C10385J0.m26642b(k0Var.mo63161n())) {
            C10910X3.C10911a aVar = x3.f26220b;
            synchronized (this) {
                this.f28051e.mo64011a(aVar);
                C11416k4 k4Var = this.f28053g;
                if (k4Var != null) {
                    ((C10771T4) k4Var).mo62275a(aVar);
                }
                COMPONENT component2 = this.f28052f;
                if (component2 != null) {
                    component2.mo62275a(aVar);
                }
            }
        }
        component.mo62276a(k0Var);
    }

    /* renamed from: b */
    public synchronized void mo63570b(C10210E4 e4) {
        this.f28055i.mo62743b(e4);
    }

    /* renamed from: a */
    public synchronized void mo63567a(C10210E4 e4) {
        this.f28055i.mo62742a(e4);
    }

    /* renamed from: a */
    private C11416k4 m30145a() {
        if (this.f28053g == null) {
            synchronized (this) {
                C11416k4 b = this.f28049c.mo61095b(this.f28047a, this.f28048b, this.f28051e.mo64010a(), this.f28050d);
                this.f28053g = b;
                this.f28054h.add(b);
            }
        }
        return this.f28053g;
    }

    /* renamed from: a */
    public synchronized void mo61738a(C10675Qi qi) {
        for (C10466Li a : this.f28054h) {
            a.mo61738a(qi);
        }
    }

    /* renamed from: a */
    public synchronized void mo61737a(C10342Hi hi, C10675Qi qi) {
        for (C10466Li a : this.f28054h) {
            a.mo61737a(hi, qi);
        }
    }

    /* renamed from: a */
    public void mo63568a(C10910X3 x3) {
        this.f28050d.mo62237a(x3.f26219a);
        C10910X3.C10911a aVar = x3.f26220b;
        synchronized (this) {
            this.f28051e.mo64011a(aVar);
            C11416k4 k4Var = this.f28053g;
            if (k4Var != null) {
                ((C10771T4) k4Var).mo62275a(aVar);
            }
            COMPONENT component = this.f28052f;
            if (component != null) {
                component.mo62275a(aVar);
            }
        }
    }
}
