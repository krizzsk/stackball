package com.applovin.impl.adview;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.utils.C1521i;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.adview.s */
public class C1151s {

    /* renamed from: a */
    private final int f2115a;

    /* renamed from: b */
    private final int f2116b;

    /* renamed from: c */
    private final int f2117c;

    /* renamed from: d */
    private final int f2118d;

    /* renamed from: e */
    private final boolean f2119e;

    /* renamed from: f */
    private final int f2120f;

    /* renamed from: g */
    private final int f2121g;

    /* renamed from: h */
    private final int f2122h;

    /* renamed from: i */
    private final float f2123i;

    /* renamed from: j */
    private final float f2124j;

    public C1151s(JSONObject jSONObject, C1469j jVar) {
        C1505q v = jVar.mo13139v();
        v.mo13279c("VideoButtonProperties", "Updating video button properties with JSON = " + C1521i.m3497e(jSONObject));
        this.f2115a = C1521i.m3485b(jSONObject, "width", 64, jVar);
        this.f2116b = C1521i.m3485b(jSONObject, "height", 7, jVar);
        this.f2117c = C1521i.m3485b(jSONObject, "margin", 20, jVar);
        this.f2118d = C1521i.m3485b(jSONObject, "gravity", 85, jVar);
        this.f2119e = C1521i.m3463a(jSONObject, "tap_to_fade", (Boolean) false, jVar).booleanValue();
        this.f2120f = C1521i.m3485b(jSONObject, "tap_to_fade_duration_milliseconds", (int) TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL, jVar);
        this.f2121g = C1521i.m3485b(jSONObject, "fade_in_duration_milliseconds", (int) TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL, jVar);
        this.f2122h = C1521i.m3485b(jSONObject, "fade_out_duration_milliseconds", (int) TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL, jVar);
        this.f2123i = C1521i.m3460a(jSONObject, "fade_in_delay_seconds", 1.0f, jVar);
        this.f2124j = C1521i.m3460a(jSONObject, "fade_out_delay_seconds", 6.0f, jVar);
    }

    /* renamed from: a */
    public int mo12054a() {
        return this.f2115a;
    }

    /* renamed from: b */
    public int mo12055b() {
        return this.f2116b;
    }

    /* renamed from: c */
    public int mo12056c() {
        return this.f2117c;
    }

    /* renamed from: d */
    public int mo12057d() {
        return this.f2118d;
    }

    /* renamed from: e */
    public boolean mo12058e() {
        return this.f2119e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1151s sVar = (C1151s) obj;
        return this.f2115a == sVar.f2115a && this.f2116b == sVar.f2116b && this.f2117c == sVar.f2117c && this.f2118d == sVar.f2118d && this.f2119e == sVar.f2119e && this.f2120f == sVar.f2120f && this.f2121g == sVar.f2121g && this.f2122h == sVar.f2122h && Float.compare(sVar.f2123i, this.f2123i) == 0 && Float.compare(sVar.f2124j, this.f2124j) == 0;
    }

    /* renamed from: f */
    public long mo12060f() {
        return (long) this.f2120f;
    }

    /* renamed from: g */
    public long mo12061g() {
        return (long) this.f2121g;
    }

    /* renamed from: h */
    public long mo12062h() {
        return (long) this.f2122h;
    }

    public int hashCode() {
        int i = ((((((((((((((this.f2115a * 31) + this.f2116b) * 31) + this.f2117c) * 31) + this.f2118d) * 31) + (this.f2119e ? 1 : 0)) * 31) + this.f2120f) * 31) + this.f2121g) * 31) + this.f2122h) * 31;
        float f = this.f2123i;
        int i2 = 0;
        int floatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f2124j;
        if (f2 != 0.0f) {
            i2 = Float.floatToIntBits(f2);
        }
        return floatToIntBits + i2;
    }

    /* renamed from: i */
    public float mo12064i() {
        return this.f2123i;
    }

    /* renamed from: j */
    public float mo12065j() {
        return this.f2124j;
    }

    public String toString() {
        return "VideoButtonProperties{widthPercentOfScreen=" + this.f2115a + ", heightPercentOfScreen=" + this.f2116b + ", margin=" + this.f2117c + ", gravity=" + this.f2118d + ", tapToFade=" + this.f2119e + ", tapToFadeDurationMillis=" + this.f2120f + ", fadeInDurationMillis=" + this.f2121g + ", fadeOutDurationMillis=" + this.f2122h + ", fadeInDelay=" + this.f2123i + ", fadeOutDelay=" + this.f2124j + '}';
    }
}
