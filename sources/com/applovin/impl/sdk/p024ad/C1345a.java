package com.applovin.impl.sdk.p024ad;

import android.net.Uri;
import com.applovin.impl.adview.C1086h;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1553o;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.a */
public final class C1345a extends C1355g {

    /* renamed from: a */
    private final String f2706a = mo11663b();

    /* renamed from: b */
    private final String f2707b = mo12699g();

    /* renamed from: c */
    private final String f2708c = m2431aQ();

    public C1345a(JSONObject jSONObject, JSONObject jSONObject2, C1346b bVar, C1469j jVar) {
        super(jSONObject, jSONObject2, bVar, jVar);
    }

    /* renamed from: aQ */
    private String m2431aQ() {
        return getStringFromAdObject("stream_url", "");
    }

    /* renamed from: a */
    public void mo11655a() {
        synchronized (this.adObjectLock) {
            C1521i.m3477a(this.adObject, TJAdUnitConstants.String.HTML, this.f2706a, this.sdk);
            C1521i.m3477a(this.adObject, "stream_url", this.f2708c, this.sdk);
        }
    }

    /* renamed from: a */
    public void mo12696a(Uri uri) {
        synchronized (this.adObjectLock) {
            C1521i.m3477a(this.adObject, "video", uri.toString(), this.sdk);
        }
    }

    /* renamed from: a */
    public void mo12697a(String str) {
        synchronized (this.adObjectLock) {
            C1521i.m3477a(this.adObject, TJAdUnitConstants.String.HTML, str, this.sdk);
        }
    }

    /* renamed from: b */
    public String mo11663b() {
        String b;
        synchronized (this.adObjectLock) {
            b = C1521i.m3487b(this.adObject, TJAdUnitConstants.String.HTML, (String) null, this.sdk);
        }
        return b;
    }

    /* renamed from: c */
    public String mo11664c() {
        return this.f2707b;
    }

    /* renamed from: d */
    public boolean mo11665d() {
        return this.adObject.has("stream_url");
    }

    /* renamed from: e */
    public void mo12698e() {
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    /* renamed from: f */
    public Uri mo11668f() {
        String aQ = m2431aQ();
        if (C1553o.m3554b(aQ)) {
            return Uri.parse(aQ);
        }
        String g = mo12699g();
        if (C1553o.m3554b(g)) {
            return Uri.parse(g);
        }
        return null;
    }

    /* renamed from: g */
    public String mo12699g() {
        return getStringFromAdObject("video", "");
    }

    /* renamed from: h */
    public Uri mo11671h() {
        String stringFromAdObject = getStringFromAdObject("click_url", "");
        if (C1553o.m3554b(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean hasVideoUrl() {
        return mo11668f() != null;
    }

    /* renamed from: i */
    public Uri mo11674i() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        return C1553o.m3554b(stringFromAdObject) ? Uri.parse(stringFromAdObject) : mo11671h();
    }

    /* renamed from: j */
    public float mo12700j() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    /* renamed from: k */
    public boolean mo12701k() {
        return getBooleanFromAdObject("close_button_graphic_hidden", false);
    }

    /* renamed from: l */
    public boolean mo12702l() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", false);
        }
        return true;
    }

    /* renamed from: m */
    public C1086h.C1087a mo12703m() {
        return mo12767a(getIntFromAdObject("expandable_style", C1086h.C1087a.INVISIBLE.mo11956a()));
    }
}
