package com.chartboost.sdk.impl;

import com.chartboost.sdk.C1883d;
import com.chartboost.sdk.C2022j;
import com.chartboost.sdk.Model.C1838c;
import com.chartboost.sdk.Model.C1839d;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Tracking.C1868a;
import com.chartboost.sdk.Tracking.C1874e;
import com.chartboost.sdk.impl.C1913g;

/* renamed from: com.chartboost.sdk.impl.f */
class C1910f implements C1839d {

    /* renamed from: a */
    private final C1913g f4797a;

    /* renamed from: b */
    private final C1920h f4798b;

    C1910f(C1913g gVar, C1920h hVar) {
        this.f4797a = gVar;
        this.f4798b = hVar;
    }

    /* renamed from: d */
    private boolean m4517d(C1838c cVar) {
        return m4518e(cVar);
    }

    /* renamed from: e */
    private boolean m4518e(C1838c cVar) {
        return (this.f4797a.f4819o.f4748a != 0 || cVar.f4448a == 1 || cVar.f4464q.f4422b == 1) ? false : true;
    }

    /* renamed from: f */
    private void m4519f(C1838c cVar) {
        if (m4517d(cVar)) {
            mo14302c(cVar);
        }
    }

    /* renamed from: a */
    public void mo14299a(C1838c cVar) {
        C1913g gVar = this.f4797a;
        gVar.getClass();
        C1920h hVar = this.f4798b;
        this.f4797a.f4805a.execute(new C1913g.C1915b(7, hVar.f4852b, hVar, (CBError.CBImpressionError) null));
    }

    /* renamed from: b */
    public void mo14301b(C1838c cVar) {
        cVar.f4449b = 1;
        if (this.f4797a.f4819o.mo14558a(this.f4798b.f4852b)) {
            this.f4797a.f4815k.mo14489b(cVar);
            m4519f(cVar);
            return;
        }
        C1913g gVar = this.f4797a;
        gVar.getClass();
        C1920h hVar = this.f4798b;
        this.f4797a.f4805a.execute(new C1913g.C1915b(7, hVar.f4852b, hVar, (CBError.CBImpressionError) null));
    }

    /* renamed from: c */
    public void mo14302c(C1838c cVar) {
        cVar.f4473z = true;
        C1913g gVar = this.f4797a;
        gVar.getClass();
        C1920h hVar = this.f4798b;
        this.f4797a.f4805a.execute(new C1913g.C1915b(5, hVar.f4852b, hVar, (CBError.CBImpressionError) null));
    }

    /* renamed from: a */
    public void mo14300a(C1838c cVar, CBError.CBImpressionError cBImpressionError) {
        String str;
        String str2;
        C1883d dVar = this.f4797a.f4815k;
        dVar.getClass();
        C1883d.C1884a aVar = new C1883d.C1884a(11);
        aVar.f4700c = cVar;
        C2022j.m4961e(aVar);
        C1913g gVar = this.f4797a;
        gVar.getClass();
        C1920h hVar = this.f4798b;
        this.f4797a.f4805a.execute(new C1913g.C1915b(6, hVar.f4852b, hVar, cBImpressionError));
        if (cVar != null) {
            str2 = cVar.f4460m;
            str = cVar.f4450c.f4749b;
        } else {
            str = "";
            str2 = str;
        }
        C1874e.m4311e(new C1868a("show_unexpected_dismiss_error", "", str, str2));
    }
}
