package com.applovin.impl.mediation;

import android.content.Context;
import android.os.Bundle;
import com.applovin.impl.mediation.p020b.C1223a;
import com.applovin.impl.mediation.p020b.C1227e;
import com.applovin.impl.mediation.p020b.C1230g;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;

public class MaxAdapterParametersImpl implements MaxAdapterInitializationParameters, MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters {

    /* renamed from: a */
    private Bundle f2150a;

    /* renamed from: b */
    private boolean f2151b;

    /* renamed from: c */
    private boolean f2152c;

    /* renamed from: d */
    private boolean f2153d;

    /* renamed from: e */
    private boolean f2154e;

    /* renamed from: f */
    private String f2155f;

    /* renamed from: g */
    private String f2156g;

    /* renamed from: h */
    private MaxAdFormat f2157h;

    private MaxAdapterParametersImpl() {
    }

    /* renamed from: a */
    static MaxAdapterParametersImpl m1825a(C1223a aVar, Context context) {
        MaxAdapterParametersImpl a = m1826a((C1227e) aVar, context);
        a.f2155f = aVar.mo12288e();
        a.f2156g = aVar.mo12287d();
        return a;
    }

    /* renamed from: a */
    static MaxAdapterParametersImpl m1826a(C1227e eVar, Context context) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f2151b = eVar.mo12352a(context);
        maxAdapterParametersImpl.f2152c = eVar.mo12358b(context);
        maxAdapterParametersImpl.f2153d = eVar.mo12363c(context);
        maxAdapterParametersImpl.f2150a = eVar.mo12341M();
        maxAdapterParametersImpl.f2154e = eVar.mo12339K();
        return maxAdapterParametersImpl;
    }

    /* renamed from: a */
    static MaxAdapterParametersImpl m1827a(C1230g gVar, MaxAdFormat maxAdFormat, Context context) {
        MaxAdapterParametersImpl a = m1826a((C1227e) gVar, context);
        a.f2157h = maxAdFormat;
        return a;
    }

    public MaxAdFormat getAdFormat() {
        return this.f2157h;
    }

    public String getBidResponse() {
        return this.f2156g;
    }

    public Bundle getServerParameters() {
        return this.f2150a;
    }

    public String getThirdPartyAdPlacementId() {
        return this.f2155f;
    }

    public boolean hasUserConsent() {
        return this.f2151b;
    }

    public boolean isAgeRestrictedUser() {
        return this.f2152c;
    }

    public boolean isDoNotSell() {
        return this.f2153d;
    }

    public boolean isTesting() {
        return this.f2154e;
    }
}
