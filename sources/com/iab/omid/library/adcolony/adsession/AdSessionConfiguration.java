package com.iab.omid.library.adcolony.adsession;

import com.iab.omid.library.adcolony.p092d.C4577b;
import com.iab.omid.library.adcolony.p092d.C4581e;
import com.smaato.sdk.video.vast.model.StaticResource;
import org.json.JSONObject;

public class AdSessionConfiguration {

    /* renamed from: a */
    private final Owner f10228a;

    /* renamed from: b */
    private final Owner f10229b;

    /* renamed from: c */
    private final boolean f10230c;

    /* renamed from: d */
    private final CreativeType f10231d;

    /* renamed from: e */
    private final ImpressionType f10232e;

    private AdSessionConfiguration(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z) {
        this.f10231d = creativeType;
        this.f10232e = impressionType;
        this.f10228a = owner;
        if (owner2 == null) {
            this.f10229b = Owner.NONE;
        } else {
            this.f10229b = owner2;
        }
        this.f10230c = z;
    }

    public static AdSessionConfiguration createAdSessionConfiguration(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z) {
        C4581e.m9613a((Object) creativeType, "CreativeType is null");
        C4581e.m9613a((Object) impressionType, "ImpressionType is null");
        C4581e.m9613a((Object) owner, "Impression owner is null");
        C4581e.m9611a(owner, creativeType, impressionType);
        return new AdSessionConfiguration(creativeType, impressionType, owner, owner2, z);
    }

    public boolean isNativeImpressionOwner() {
        return Owner.NATIVE == this.f10228a;
    }

    public boolean isNativeMediaEventsOwner() {
        return Owner.NATIVE == this.f10229b;
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        C4577b.m9597a(jSONObject, "impressionOwner", this.f10228a);
        C4577b.m9597a(jSONObject, "mediaEventsOwner", this.f10229b);
        C4577b.m9597a(jSONObject, StaticResource.CREATIVE_TYPE, this.f10231d);
        C4577b.m9597a(jSONObject, "impressionType", this.f10232e);
        C4577b.m9597a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f10230c));
        return jSONObject;
    }
}
