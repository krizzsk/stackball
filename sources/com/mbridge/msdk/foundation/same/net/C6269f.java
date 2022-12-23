package com.mbridge.msdk.foundation.same.net;

import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.C6197g;
import com.mbridge.msdk.foundation.same.net.p172a.C6240a;
import com.mbridge.msdk.foundation.same.net.p178g.C6276c;
import com.mbridge.msdk.foundation.same.report.p180a.C6304a;
import com.mbridge.msdk.foundation.tools.C6361q;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.net.f */
/* compiled from: Listener */
public class C6269f<T> implements C6263e<T> {

    /* renamed from: a */
    private long f15541a;

    /* renamed from: b */
    private C6304a f15542b = null;

    /* renamed from: d */
    public String f15543d = "";

    /* renamed from: e */
    public String f15544e = "";

    /* renamed from: f */
    public int f15545f = 0;

    /* renamed from: a */
    public void mo43797a(long j, long j2) {
    }

    /* renamed from: a */
    public void mo43798a(C6240a aVar) {
    }

    /* renamed from: b */
    public void mo43800b() {
    }

    /* renamed from: c */
    public void mo43843c() {
    }

    /* renamed from: d */
    public final void mo43845d() {
    }

    /* renamed from: a */
    public void mo43842a() {
        this.f15541a = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo43799a(C6293k<T> kVar) {
        try {
            String str = C6122a.m15302b().mo42896e() + "_" + this.f15544e + "_" + this.f15543d + "_" + this.f15545f;
            if (kVar.f15627a instanceof JSONObject) {
                C6276c.m15863a().mo43856a(str, ((JSONObject) kVar.f15627a).optInt("status"), ((JSONObject) kVar.f15627a).toString(), System.currentTimeMillis());
            }
            if (kVar.f15627a instanceof String) {
                C6276c.m15863a().mo43856a(str, new JSONObject((String) kVar.f15627a).optInt("status"), (String) kVar.f15627a, System.currentTimeMillis());
            }
        } catch (Exception e) {
            C6361q.m16158d("Listener", e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo43849a(long j) {
        C6304a aVar = new C6304a(new C6197g());
        this.f15542b = aVar;
        aVar.mo43919b(this.f15543d);
        this.f15542b.mo43916a(1);
        C6304a aVar2 = this.f15542b;
        aVar2.mo43917a((j - this.f15541a) + "");
    }

    /* renamed from: a */
    public final void mo43848a(int i) {
        C6304a aVar = this.f15542b;
        if (aVar != null) {
            aVar.mo43918b(i);
            this.f15542b.mo43915a();
        }
    }

    /* renamed from: b */
    public final void mo43850b(int i) {
        C6304a aVar = this.f15542b;
        if (aVar != null) {
            aVar.mo43920c(i);
        }
    }
}
