package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p265ob.C10842Vf;
import java.util.Collection;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.i2 */
class C11331i2 implements C10143Bk {

    /* renamed from: a */
    final /* synthetic */ C10842Vf f27093a;

    /* renamed from: b */
    final /* synthetic */ C11365j2 f27094b;

    C11331i2(C11365j2 j2Var, C10842Vf vf) {
        this.f27094b = j2Var;
        this.f27093a = vf;
    }

    /* renamed from: a */
    public void mo61033a(C10114Ak ak) {
        C10842Vf vf = this.f27093a;
        List<C11825uk> c = ak.mo61070c();
        if (!C10796U2.m27896b((Collection) c)) {
            vf.f26011e = new C10842Vf.C10852e[c.size()];
            for (int i = 0; i < c.size(); i++) {
                C11825uk ukVar = c.get(i);
                C10842Vf.C10852e[] eVarArr = vf.f26011e;
                int i2 = C11127d2.f26677e;
                C10842Vf.C10852e eVar = new C10842Vf.C10852e();
                if (ukVar.mo63809b() != null) {
                    eVar.f26080b = ukVar.mo63809b().intValue();
                }
                if (ukVar.mo63810c() != null) {
                    eVar.f26081c = ukVar.mo63810c().intValue();
                }
                if (!TextUtils.isEmpty(ukVar.mo63808a())) {
                    eVar.f26082d = ukVar.mo63808a();
                }
                eVar.f26083e = ukVar.mo63811d();
                eVarArr[i] = eVar;
                this.f27094b.f27156x += C11056b.m28528a((C11169e) vf.f26011e[i]);
                this.f27094b.f27156x += C11056b.m28534c(10);
            }
        }
    }
}
