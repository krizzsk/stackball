package com.iab.omid.library.smaato.adsession;

import com.iab.omid.library.smaato.p122d.C4825b;
import com.iab.omid.library.smaato.p122d.C4829e;
import org.json.JSONObject;

public class AdSessionConfiguration {
    private final Owner impressionOwner;
    private final boolean isolateVerificationScripts;
    private final Owner videoEventsOwner;

    private AdSessionConfiguration(Owner owner, Owner owner2, boolean z) {
        this.impressionOwner = owner;
        if (owner2 == null) {
            this.videoEventsOwner = Owner.NONE;
        } else {
            this.videoEventsOwner = owner2;
        }
        this.isolateVerificationScripts = z;
    }

    @Deprecated
    public static AdSessionConfiguration createAdSessionConfiguration(Owner owner, Owner owner2) {
        return createAdSessionConfiguration(owner, owner2, true);
    }

    public static AdSessionConfiguration createAdSessionConfiguration(Owner owner, Owner owner2, boolean z) {
        C4829e.m10712a((Object) owner, "Impression owner is null");
        C4829e.m10710a(owner);
        return new AdSessionConfiguration(owner, owner2, z);
    }

    public boolean isNativeImpressionOwner() {
        return Owner.NATIVE == this.impressionOwner;
    }

    public boolean isNativeVideoEventsOwner() {
        return Owner.NATIVE == this.videoEventsOwner;
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        C4825b.m10696a(jSONObject, "impressionOwner", this.impressionOwner);
        C4825b.m10696a(jSONObject, "videoEventsOwner", this.videoEventsOwner);
        C4825b.m10696a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }
}
