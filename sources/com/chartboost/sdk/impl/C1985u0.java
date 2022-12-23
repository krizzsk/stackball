package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Model.C1842g;
import com.chartboost.sdk.Networking.C1852d;
import com.chartboost.sdk.Networking.NetworkHelper;
import com.chartboost.sdk.Tracking.C1869b;
import com.chartboost.sdk.Tracking.C1878i;
import com.chartboost.sdk.impl.C1965p0;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;

/* renamed from: com.chartboost.sdk.impl.u0 */
public class C1985u0 extends C1965p0 {

    /* renamed from: o */
    private final C1878i f5099o;

    /* renamed from: p */
    private final C1869b f5100p;

    /* renamed from: q */
    private C1981t0 f5101q;

    public C1985u0(String str, C1878i iVar, C1869b bVar) {
        this(NetworkHelper.m4169a(str), NetworkHelper.m4171b(str), (C1965p0.C1966a) null, iVar, bVar, new C1981t0());
    }

    /* renamed from: a */
    public C1852d mo14330a() {
        String a = this.f5101q.mo14797a(this.f5099o, this.f5100p);
        HashMap hashMap = new HashMap();
        hashMap.put(HttpHeaders.ACCEPT, WebRequest.CONTENT_TYPE_JSON);
        hashMap.put("X-Chartboost-Client", CBUtility.m4013e());
        hashMap.put("X-Chartboost-API", "8.2.1");
        return new C1852d(hashMap, a.getBytes(), WebRequest.CONTENT_TYPE_JSON);
    }

    public C1985u0(String str, String str2, C1965p0.C1966a aVar, C1878i iVar, C1869b bVar, C1981t0 t0Var) {
        super(str, str2, (C1842g) null, 2, aVar);
        this.f5055m = false;
        this.f5099o = iVar;
        this.f5100p = bVar;
        this.f5101q = t0Var;
    }
}
