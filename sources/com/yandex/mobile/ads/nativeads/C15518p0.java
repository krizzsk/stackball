package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.util.Pair;
import com.yandex.mobile.ads.base.C12135y;
import com.yandex.mobile.ads.impl.d71;
import com.yandex.mobile.ads.impl.k81;
import com.yandex.mobile.ads.impl.l71;
import com.yandex.mobile.ads.impl.l91;
import com.yandex.mobile.ads.impl.nt0;
import com.yandex.mobile.ads.impl.wu0;
import java.util.Iterator;

/* renamed from: com.yandex.mobile.ads.nativeads.p0 */
class C15518p0 extends C15549u {

    /* renamed from: d */
    private final C15500i0 f43931d;

    /* renamed from: e */
    private final l71 f43932e;

    public C15518p0(C15500i0 i0Var, C15493g0 g0Var, l71 l71) {
        super(g0Var);
        this.f43931d = i0Var;
        this.f43932e = l71;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Pair<C12135y.C12136a, String> mo71732a(Context context, int i, boolean z, boolean z2) {
        d71 a = this.f43932e.mo68362a(context);
        if (!(a == null || a.mo66475w())) {
            return new Pair<>(C12135y.C12136a.SUCCESS, (Object) null);
        }
        return super.mo71732a(context, i, z, z2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C12135y mo71733a(Context context, C12135y.C12136a aVar, boolean z, int i) {
        boolean z2;
        C12135y yVar;
        if (aVar == C12135y.C12136a.SUCCESS) {
            Iterator<C15526t> it = this.f43931d.mo71677c().iterator();
            while (true) {
                z2 = true;
                boolean z3 = false;
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                C15526t next = it.next();
                if (next instanceof C15504k0) {
                    C15504k0 k0Var = (C15504k0) next;
                    nt0 c = k0Var.mo71694c();
                    wu0 d = k0Var.mo71695d();
                    d71 a = this.f43932e.mo68362a(context);
                    boolean z4 = a == null || a.mo66475w();
                    Iterator<k81> it2 = d.mo70760e().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z3 = true;
                            break;
                        }
                        int c2 = z4 ? it2.next().mo68163c() : i;
                        if (z) {
                            yVar = ((C15549u) c).mo71919b(context, c2);
                        } else {
                            yVar = ((C15549u) c).mo69078a(context, c2);
                        }
                        if (yVar.mo64680e() != C12135y.C12136a.SUCCESS) {
                            break;
                        }
                    }
                    if (z3) {
                        break;
                    }
                }
            }
            if (!z2) {
                aVar = C12135y.C12136a.NO_VISIBLE_ADS;
            }
        }
        return new C12135y(aVar, new l91());
    }
}
