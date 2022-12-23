package com.google.ads.mediation.customevent;

import com.google.ads.mediation.MediationServerParameters;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class CustomEventServerParameters extends MediationServerParameters {
    @MediationServerParameters.Parameter(name = "class_name", required = true)
    public String className;
    @MediationServerParameters.Parameter(name = "label", required = true)
    public String label;
    @MediationServerParameters.Parameter(name = "parameter", required = false)
    public String parameter = null;
}
