package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.p110d.C4727c;
import com.iab.omid.library.ironsrc.p110d.C4729e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f10604a;

    /* renamed from: b */
    private final Float f10605b;

    /* renamed from: c */
    private final boolean f10606c;

    /* renamed from: d */
    private final Position f10607d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f10604a = z;
        this.f10605b = f;
        this.f10606c = z2;
        this.f10607d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C4729e.m10268a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C4729e.m10268a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public final JSONObject mo39114a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f10604a);
            if (this.f10604a) {
                jSONObject.put("skipOffset", this.f10605b);
            }
            jSONObject.put("autoPlay", this.f10606c);
            jSONObject.put("position", this.f10607d);
        } catch (JSONException e) {
            C4727c.m10263a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public final Position getPosition() {
        return this.f10607d;
    }

    public final Float getSkipOffset() {
        return this.f10605b;
    }

    public final boolean isAutoPlay() {
        return this.f10606c;
    }

    public final boolean isSkippable() {
        return this.f10604a;
    }
}
