package com.iab.omid.library.corpmailru.adsession.media;

import com.iab.omid.library.corpmailru.p098d.C4629c;
import com.iab.omid.library.corpmailru.p098d.C4631e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f10389a;

    /* renamed from: b */
    private final Float f10390b;

    /* renamed from: c */
    private final boolean f10391c;

    /* renamed from: d */
    private final Position f10392d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f10389a = z;
        this.f10390b = f;
        this.f10391c = z2;
        this.f10392d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C4631e.m9837a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C4631e.m9837a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject mo38754a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f10389a);
            if (this.f10389a) {
                jSONObject.put("skipOffset", this.f10390b);
            }
            jSONObject.put("autoPlay", this.f10391c);
            jSONObject.put("position", this.f10392d);
        } catch (JSONException e) {
            C4629c.m9832a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f10392d;
    }

    public Float getSkipOffset() {
        return this.f10390b;
    }

    public boolean isAutoPlay() {
        return this.f10391c;
    }

    public boolean isSkippable() {
        return this.f10389a;
    }
}
