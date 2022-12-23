package com.iab.omid.library.adcolony.adsession.media;

import com.iab.omid.library.adcolony.p092d.C4579c;
import com.iab.omid.library.adcolony.p092d.C4581e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f10275a;

    /* renamed from: b */
    private final Float f10276b;

    /* renamed from: c */
    private final boolean f10277c;

    /* renamed from: d */
    private final Position f10278d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f10275a = z;
        this.f10276b = f;
        this.f10277c = z2;
        this.f10278d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C4581e.m9613a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C4581e.m9613a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo38568a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f10275a);
            if (this.f10275a) {
                jSONObject.put("skipOffset", this.f10276b);
            }
            jSONObject.put("autoPlay", this.f10277c);
            jSONObject.put("position", this.f10278d);
        } catch (JSONException e) {
            C4579c.m9608a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f10278d;
    }

    public Float getSkipOffset() {
        return this.f10276b;
    }

    public boolean isAutoPlay() {
        return this.f10277c;
    }

    public boolean isSkippable() {
        return this.f10275a;
    }
}
