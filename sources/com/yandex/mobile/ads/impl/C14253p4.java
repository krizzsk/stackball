package com.yandex.mobile.ads.impl;

import com.smaato.sdk.video.vast.model.StaticResource;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.p4 */
public class C14253p4 {

    /* renamed from: a */
    private final sx0 f38516a;

    /* renamed from: b */
    private final sx0 f38517b;

    /* renamed from: c */
    private final boolean f38518c;

    /* renamed from: d */
    private final C14280pi f38519d;

    /* renamed from: e */
    private final yd0 f38520e;

    private C14253p4(C14280pi piVar, yd0 yd0, sx0 sx0, sx0 sx02, boolean z) {
        this.f38519d = piVar;
        this.f38520e = yd0;
        this.f38516a = sx0;
        if (sx02 == null) {
            this.f38517b = sx0.NONE;
        } else {
            this.f38517b = sx02;
        }
        this.f38518c = z;
    }

    /* renamed from: a */
    public static C14253p4 m40668a(C14280pi piVar, yd0 yd0, sx0 sx0, sx0 sx02, boolean z) {
        if (sx0 == sx0.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (piVar == C14280pi.DEFINED_BY_JAVASCRIPT && sx0 == sx0.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (yd0 != yd0.DEFINED_BY_JAVASCRIPT || sx0 != sx0.NATIVE) {
            return new C14253p4(piVar, yd0, sx0, sx02, z);
        } else {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: a */
    public boolean mo69315a() {
        return sx0.NATIVE == this.f38516a;
    }

    /* renamed from: b */
    public boolean mo69316b() {
        return sx0.NATIVE == this.f38517b;
    }

    /* renamed from: c */
    public JSONObject mo69317c() {
        JSONObject jSONObject = new JSONObject();
        ft1.m36312a(jSONObject, "impressionOwner", this.f38516a);
        ft1.m36312a(jSONObject, "mediaEventsOwner", this.f38517b);
        ft1.m36312a(jSONObject, StaticResource.CREATIVE_TYPE, this.f38519d);
        ft1.m36312a(jSONObject, "impressionType", this.f38520e);
        ft1.m36312a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f38518c));
        return jSONObject;
    }
}
