package com.chartboost.sdk.impl;

import com.chartboost.sdk.C2026k;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Networking.C1851c;
import com.chartboost.sdk.Networking.C1852d;
import com.chartboost.sdk.Networking.C1854f;
import com.chartboost.sdk.Networking.C1856h;
import java.io.File;
import java.util.HashMap;

/* renamed from: com.chartboost.sdk.impl.m */
class C1947m extends C1851c<Void> {

    /* renamed from: j */
    private final C1952n f4992j;

    /* renamed from: k */
    private final C1856h f4993k;

    /* renamed from: l */
    final C1942l f4994l;

    C1947m(C1952n nVar, C1856h hVar, C1942l lVar, File file) {
        super("GET", lVar.f4976d, 2, file);
        this.f4568i = 1;
        this.f4992j = nVar;
        this.f4993k = hVar;
        this.f4994l = lVar;
    }

    /* renamed from: a */
    public C1852d mo14330a() {
        HashMap hashMap = new HashMap();
        hashMap.put("X-Chartboost-App", C2026k.f5253j);
        hashMap.put("X-Chartboost-Client", CBUtility.m4013e());
        hashMap.put("X-Chartboost-Reachability", Integer.toString(this.f4993k.mo14338b()));
        return new C1852d(hashMap, (byte[]) null, (String) null);
    }

    /* renamed from: a */
    public void mo14333a(Void voidR, C1854f fVar) {
        this.f4992j.mo14708a(this, (CBError) null, (C1854f) null);
    }

    /* renamed from: a */
    public void mo14332a(CBError cBError, C1854f fVar) {
        this.f4992j.mo14708a(this, cBError, fVar);
    }
}
