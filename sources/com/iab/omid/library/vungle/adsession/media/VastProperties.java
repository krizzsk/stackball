package com.iab.omid.library.vungle.adsession.media;

import com.iab.omid.library.vungle.p128d.C4876c;
import com.iab.omid.library.vungle.p128d.C4878e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f10938a;

    /* renamed from: b */
    private final Float f10939b;

    /* renamed from: c */
    private final boolean f10940c;

    /* renamed from: d */
    private final Position f10941d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f10938a = z;
        this.f10939b = f;
        this.f10940c = z2;
        this.f10941d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C4878e.m10925a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C4878e.m10925a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo39676a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f10938a);
            if (this.f10938a) {
                jSONObject.put("skipOffset", this.f10939b);
            }
            jSONObject.put("autoPlay", this.f10940c);
            jSONObject.put("position", this.f10941d);
        } catch (JSONException e) {
            C4876c.m10920a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f10941d;
    }

    public Float getSkipOffset() {
        return this.f10939b;
    }

    public boolean isAutoPlay() {
        return this.f10940c;
    }

    public boolean isSkippable() {
        return this.f10938a;
    }
}
