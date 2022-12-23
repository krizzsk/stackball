package com.iab.omid.library.ironsrc.adsession;

import com.iab.omid.library.ironsrc.p110d.C4725b;
import com.iab.omid.library.ironsrc.p110d.C4729e;
import com.smaato.sdk.video.vast.model.StaticResource;
import org.json.JSONObject;

public class AdSessionConfiguration {
    private final CreativeType creativeType;
    private final Owner impressionOwner;
    private final ImpressionType impressionType;
    private final boolean isolateVerificationScripts;
    private final Owner mediaEventsOwner;

    private AdSessionConfiguration(CreativeType creativeType2, ImpressionType impressionType2, Owner owner, Owner owner2, boolean z) {
        this.creativeType = creativeType2;
        this.impressionType = impressionType2;
        this.impressionOwner = owner;
        if (owner2 == null) {
            this.mediaEventsOwner = Owner.NONE;
        } else {
            this.mediaEventsOwner = owner2;
        }
        this.isolateVerificationScripts = z;
    }

    public static AdSessionConfiguration createAdSessionConfiguration(CreativeType creativeType2, ImpressionType impressionType2, Owner owner, Owner owner2, boolean z) {
        C4729e.m10268a((Object) creativeType2, "CreativeType is null");
        C4729e.m10268a((Object) impressionType2, "ImpressionType is null");
        C4729e.m10268a((Object) owner, "Impression owner is null");
        C4729e.m10266a(owner, creativeType2, impressionType2);
        return new AdSessionConfiguration(creativeType2, impressionType2, owner, owner2, z);
    }

    public boolean isNativeImpressionOwner() {
        return Owner.NATIVE == this.impressionOwner;
    }

    public boolean isNativeMediaEventsOwner() {
        return Owner.NATIVE == this.mediaEventsOwner;
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        C4725b.m10252a(jSONObject, "impressionOwner", this.impressionOwner);
        C4725b.m10252a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
        C4725b.m10252a(jSONObject, StaticResource.CREATIVE_TYPE, this.creativeType);
        C4725b.m10252a(jSONObject, "impressionType", this.impressionType);
        C4725b.m10252a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }
}
