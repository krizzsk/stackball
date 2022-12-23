package com.fyber.inneractive.sdk.player.p059c.p063d.p069f;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.p062c.C3227a;
import com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3396v;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.f.e */
public final class C3370e implements C3396v.C3399c {

    /* renamed from: a */
    private final int f8967a;

    /* renamed from: b */
    private final List<C3290h> f8968b;

    public C3370e() {
        this(0);
    }

    public C3370e(int i) {
        this(i, Collections.emptyList());
    }

    private C3370e(int i, List<C3290h> list) {
        this.f8967a = i;
        if (!m8354a(32) && list.isEmpty()) {
            list = Collections.singletonList(C3290h.m8120a((String) null, "application/cea-608", 0, (String) null, (C3227a) null));
        }
        this.f8968b = list;
    }

    /* renamed from: a */
    public final SparseArray<C3396v> mo19162a() {
        return new SparseArray<>();
    }

    /* renamed from: a */
    public final C3396v mo19163a(int i, C3396v.C3398b bVar) {
        if (i == 2) {
            return new C3384o(new C3374i());
        }
        if (i == 3 || i == 4) {
            return new C3384o(new C3382m(bVar.f9167b));
        }
        if (i != 15) {
            if (i == 21) {
                return new C3384o(new C3381l());
            }
            if (i != 27) {
                if (i == 36) {
                    return new C3384o(new C3379k(m8353a(bVar)));
                }
                if (i == 89) {
                    return new C3384o(new C3372g(bVar.f9168c));
                }
                if (i != 138) {
                    if (i != 129) {
                        if (i != 130) {
                            if (i != 134) {
                                if (i != 135) {
                                    return null;
                                }
                            } else if (m8354a(16)) {
                                return null;
                            } else {
                                return new C3389r(new C3391t());
                            }
                        }
                    }
                    return new C3384o(new C3366b(bVar.f9167b));
                }
                return new C3384o(new C3371f(bVar.f9167b));
            } else if (m8354a(4)) {
                return null;
            } else {
                return new C3384o(new C3376j(m8353a(bVar), m8354a(1), m8354a(8)));
            }
        } else if (m8354a(2)) {
            return null;
        } else {
            return new C3384o(new C3369d(false, bVar.f9167b));
        }
    }

    /* renamed from: a */
    private C3390s m8353a(C3396v.C3398b bVar) {
        String str;
        if (m8354a(32)) {
            return new C3390s(this.f8968b);
        }
        C3548k kVar = new C3548k(bVar.f9169d);
        List<C3290h> list = this.f8968b;
        while (kVar.mo19383b() > 0) {
            int d = kVar.mo19387d();
            int d2 = kVar.f9626b + kVar.mo19387d();
            if (d == 134) {
                list = new ArrayList<>();
                int d3 = kVar.mo19387d() & 31;
                for (int i = 0; i < d3; i++) {
                    String e = kVar.mo19390e(3);
                    int d4 = kVar.mo19387d();
                    int i2 = 1;
                    if ((d4 & 128) != 0) {
                        i2 = d4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                    }
                    list.add(C3290h.m8118a((String) null, str, 0, e, i2));
                    kVar.mo19388d(2);
                }
            }
            kVar.mo19386c(d2);
        }
        return new C3390s(list);
    }

    /* renamed from: a */
    private boolean m8354a(int i) {
        return (i & this.f8967a) != 0;
    }
}
