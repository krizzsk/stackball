package com.iab.omid.library.oguryco.adsession.media;

import com.iab.omid.library.oguryco.p116d.C4778c;
import com.iab.omid.library.oguryco.p116d.C4780e;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f10718a;

    /* renamed from: b */
    private final Float f10719b;

    /* renamed from: c */
    private final boolean f10720c;

    /* renamed from: d */
    private final Position f10721d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f10718a = z;
        this.f10719b = f;
        this.f10720c = z2;
        this.f10721d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C4780e.m10497a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C4780e.m10497a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public final JSONObject mo39303a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f10718a);
            if (this.f10718a) {
                jSONObject.put("skipOffset", this.f10719b);
            }
            jSONObject.put("autoPlay", this.f10720c);
            jSONObject.put("position", this.f10721d);
        } catch (JSONException e) {
            C4778c.m10492a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public final Position getPosition() {
        return this.f10721d;
    }

    public final Float getSkipOffset() {
        return this.f10719b;
    }

    public final boolean isAutoPlay() {
        return this.f10720c;
    }

    public final boolean isSkippable() {
        return this.f10718a;
    }
}
