package com.applovin.impl.sdk.p027d;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.network.C1484a;
import com.applovin.impl.sdk.p023a.C1342c;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.utils.C1521i;
import com.facebook.internal.NativeProtocol;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.d.aa */
public abstract class C1393aa extends C1397ac {
    protected C1393aa(String str, C1469j jVar) {
        super(str, jVar);
    }

    /* renamed from: a */
    private JSONObject m2788a(C1342c cVar) {
        JSONObject i = mo12959i();
        C1521i.m3477a(i, IronSourceConstants.EVENTS_RESULT, cVar.mo12640b(), this.f3279b);
        Map<String, String> a = cVar.mo12639a();
        if (a != null) {
            C1521i.m3479a(i, NativeProtocol.WEB_DIALOG_PARAMS, new JSONObject(a), this.f3279b);
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C1342c mo12392b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo12393b(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo12394c();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo12953h() {
        return ((Integer) this.f3279b.mo13088a(C1369c.f2922bL)).intValue();
    }

    public void run() {
        C1342c b = mo12392b();
        if (b != null) {
            mo12958a(m2788a(b), new C1484a.C1487c<JSONObject>() {
                /* renamed from: a */
                public void mo12144a(int i) {
                    C1393aa.this.mo12390a(i);
                }

                /* renamed from: a */
                public void mo12145a(JSONObject jSONObject, int i) {
                    C1393aa.this.mo12393b(jSONObject);
                }
            });
        } else {
            mo12394c();
        }
    }
}
