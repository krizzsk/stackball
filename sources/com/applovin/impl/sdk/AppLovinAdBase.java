package com.applovin.impl.sdk;

import android.text.TextUtils;
import com.applovin.impl.sdk.p024ad.C1346b;
import com.applovin.impl.sdk.p024ad.C1349d;
import com.applovin.impl.sdk.p024ad.C1361h;
import com.applovin.impl.sdk.p024ad.C1363j;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Arrays;
import org.json.JSONObject;

public abstract class AppLovinAdBase implements C1363j, AppLovinAd {

    /* renamed from: a */
    private final int f2553a;
    protected final JSONObject adObject;
    protected final Object adObjectLock;

    /* renamed from: b */
    private C1349d f2554b;

    /* renamed from: c */
    private final long f2555c;

    /* renamed from: d */
    private C1361h f2556d;
    protected final JSONObject fullResponse;
    protected final Object fullResponseLock;
    /* access modifiers changed from: protected */
    public final C1469j sdk;
    protected final C1346b source;

    protected AppLovinAdBase(JSONObject jSONObject, JSONObject jSONObject2, C1346b bVar, C1469j jVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        } else if (jSONObject2 == null) {
            throw new IllegalArgumentException("No response specified");
        } else if (jVar != null) {
            this.adObject = jSONObject;
            this.fullResponse = jSONObject2;
            this.source = bVar;
            this.sdk = jVar;
            this.adObjectLock = new Object();
            this.fullResponseLock = new Object();
            this.f2555c = System.currentTimeMillis();
            char[] charArray = jSONObject.toString().toCharArray();
            Arrays.sort(charArray);
            this.f2553a = new String(charArray).hashCode();
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    /* access modifiers changed from: protected */
    public boolean containsKeyForAdObject(String str) {
        boolean has;
        synchronized (this.adObjectLock) {
            has = this.adObject.has(str);
        }
        return has;
    }

    public boolean equals(Object obj) {
        AppLovinAd b;
        if ((obj instanceof C1361h) && (b = ((C1361h) obj).mo12831b()) != null) {
            obj = b;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppLovinAdBase appLovinAdBase = (AppLovinAdBase) obj;
        C1349d dVar = this.f2554b;
        if (dVar == null ? appLovinAdBase.f2554b == null : dVar.equals(appLovinAdBase.f2554b)) {
            return this.source == appLovinAdBase.source && this.f2553a == appLovinAdBase.f2553a;
        }
        return false;
    }

    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1);
    }

    public String getAdValue(String str) {
        JSONObject jsonObjectFromAdObject;
        if (!TextUtils.isEmpty(str) && (jsonObjectFromAdObject = getJsonObjectFromAdObject("ad_values", (JSONObject) null)) != null && jsonObjectFromAdObject.length() > 0) {
            return C1521i.m3487b(jsonObjectFromAdObject, str, (String) null, this.sdk);
        }
        return null;
    }

    public C1349d getAdZone() {
        C1349d dVar = this.f2554b;
        if (dVar != null) {
            if (dVar.mo12715c() != null && this.f2554b.mo12716d() != null) {
                return this.f2554b;
            }
            if (getSize() == null && getType() == null) {
                return this.f2554b;
            }
        }
        C1349d a = C1349d.m2453a(getSize(), getType(), getStringFromFullResponse("zone_id", (String) null), this.sdk);
        this.f2554b = a;
        return a;
    }

    /* access modifiers changed from: protected */
    public boolean getBooleanFromAdObject(String str, Boolean bool) {
        boolean booleanValue;
        synchronized (this.adObjectLock) {
            booleanValue = C1521i.m3463a(this.adObject, str, bool, this.sdk).booleanValue();
        }
        return booleanValue;
    }

    /* access modifiers changed from: protected */
    public boolean getBooleanFromFullResponse(String str, boolean z) {
        boolean booleanValue;
        synchronized (this.fullResponseLock) {
            booleanValue = C1521i.m3463a(this.fullResponse, str, Boolean.valueOf(z), this.sdk).booleanValue();
        }
        return booleanValue;
    }

    public String getClCode() {
        String stringFromAdObject = getStringFromAdObject("clcode", "");
        return C1553o.m3554b(stringFromAdObject) ? stringFromAdObject : getStringFromFullResponse("clcode", "");
    }

    public long getCreatedAtMillis() {
        return this.f2555c;
    }

    public C1361h getDummyAd() {
        return this.f2556d;
    }

    public long getFetchLatencyMillis() {
        return getLongFromFullResponse("ad_fetch_latency_millis", -1);
    }

    public long getFetchResponseSize() {
        return getLongFromFullResponse("ad_fetch_response_size", -1);
    }

    /* access modifiers changed from: protected */
    public float getFloatFromAdObject(String str, float f) {
        float a;
        synchronized (this.adObjectLock) {
            a = C1521i.m3460a(this.adObject, str, f, this.sdk);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    public float getFloatFromFullResponse(String str, float f) {
        float a;
        synchronized (this.fullResponseLock) {
            a = C1521i.m3460a(this.fullResponse, str, f, this.sdk);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    public int getIntFromAdObject(String str, int i) {
        int b;
        synchronized (this.adObjectLock) {
            b = C1521i.m3485b(this.adObject, str, i, this.sdk);
        }
        return b;
    }

    /* access modifiers changed from: protected */
    public int getIntFromFullResponse(String str, int i) {
        int b;
        synchronized (this.fullResponseLock) {
            b = C1521i.m3485b(this.fullResponse, str, i, this.sdk);
        }
        return b;
    }

    /* access modifiers changed from: protected */
    public JSONObject getJsonObjectFromAdObject(String str, JSONObject jSONObject) {
        JSONObject b;
        synchronized (this.adObjectLock) {
            b = C1521i.m3492b(this.adObject, str, jSONObject, this.sdk);
        }
        return b;
    }

    /* access modifiers changed from: protected */
    public JSONObject getJsonObjectFromFullResponse(String str, JSONObject jSONObject) {
        JSONObject b;
        synchronized (this.fullResponseLock) {
            b = C1521i.m3492b(this.fullResponse, str, jSONObject, this.sdk);
        }
        return b;
    }

    /* access modifiers changed from: protected */
    public long getLongFromAdObject(String str, long j) {
        long a;
        synchronized (this.adObjectLock) {
            a = C1521i.m3461a(this.adObject, str, j, this.sdk);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    public long getLongFromFullResponse(String str, long j) {
        long a;
        synchronized (this.fullResponseLock) {
            a = C1521i.m3461a(this.fullResponse, str, j, this.sdk);
        }
        return a;
    }

    public String getPrimaryKey() {
        return getStringFromAdObject("pk", "NA");
    }

    public C1469j getSdk() {
        return this.sdk;
    }

    public String getSecondaryKey1() {
        return getStringFromAdObject("sk1", (String) null);
    }

    public String getSecondaryKey2() {
        return getStringFromAdObject("sk2", (String) null);
    }

    public AppLovinAdSize getSize() {
        return AppLovinAdSize.fromString(getStringFromFullResponse("ad_size", (String) null));
    }

    public C1346b getSource() {
        return this.source;
    }

    /* access modifiers changed from: protected */
    public String getStringFromAdObject(String str, String str2) {
        String b;
        synchronized (this.adObjectLock) {
            b = C1521i.m3487b(this.adObject, str, str2, this.sdk);
        }
        return b;
    }

    /* access modifiers changed from: protected */
    public String getStringFromFullResponse(String str, String str2) {
        String b;
        synchronized (this.fullResponseLock) {
            b = C1521i.m3487b(this.fullResponse, str, str2, this.sdk);
        }
        return b;
    }

    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(getStringFromFullResponse("ad_type", (String) null));
    }

    public String getZoneId() {
        if (getAdZone().mo12724j()) {
            return null;
        }
        return getStringFromFullResponse("zone_id", (String) null);
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", false);
    }

    public boolean hasVideoUrl() {
        this.sdk.mo13139v().mo13281e("AppLovinAdBase", "Attempting to invoke hasVideoUrl() from base ad class");
        return false;
    }

    public int hashCode() {
        return this.f2553a;
    }

    public boolean isVideoAd() {
        return this.adObject.has("is_video_ad") ? getBooleanFromAdObject("is_video_ad", false) : hasVideoUrl();
    }

    public void setDummyAd(C1361h hVar) {
        this.f2556d = hVar;
    }

    public void setHasShown(boolean z) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("shown", z);
            }
        } catch (Throwable unused) {
        }
    }

    public boolean shouldCancelHtmlCachingIfShown() {
        return getBooleanFromAdObject("chcis", false);
    }

    public String toString() {
        return "AppLovinAd{adIdNumber" + getAdIdNumber() + ", source=" + getSource() + ", zoneId='" + getZoneId() + "'" + '}';
    }
}
