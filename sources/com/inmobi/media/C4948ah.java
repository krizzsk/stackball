package com.inmobi.media;

import android.text.TextUtils;
import com.inmobi.ads.AdMetaInfo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ah */
/* compiled from: Ad */
public class C4948ah {
    private static final long INVALID_AD_EXPIRY = -1;
    private static final String TAG = C4948ah.class.getSimpleName();
    private static final String WIN_BEACON = "win_beacon";
    private String adAuctionMeta;
    private boolean applyBitmap;
    JSONArray assetUrls;
    private String bidBundle;
    private boolean canLoadBeforeShow;
    String impressionId;
    JSONObject mAdContent;
    String mAdType;
    float mBid;
    long mExpiryDurationInMillis;
    long mInsertionTimestampInMillis;
    boolean mIsPreloadWebView;
    private String mWebVast;
    String markupType;
    private String pubContent;
    private JSONArray trackers;
    JSONObject transaction;

    public C4948ah() {
        this.markupType = "unknown";
        this.mWebVast = "";
        this.adAuctionMeta = null;
        this.impressionId = "";
        this.canLoadBeforeShow = true;
        this.pubContent = "";
        this.applyBitmap = false;
        this.trackers = null;
        this.mInsertionTimestampInMillis = System.currentTimeMillis();
    }

    C4948ah(C4948ah ahVar, JSONArray jSONArray) {
        this.markupType = "unknown";
        this.mWebVast = "";
        this.adAuctionMeta = null;
        this.impressionId = "";
        this.canLoadBeforeShow = true;
        this.pubContent = "";
        this.applyBitmap = false;
        this.trackers = null;
        C5352hm.m12373a((Object) ahVar, (Object) this);
        this.assetUrls = jSONArray;
    }

    /* renamed from: a */
    public String mo40028a() {
        return this.bidBundle;
    }

    /* renamed from: b */
    public final String mo40032b() {
        return this.mAdType;
    }

    /* renamed from: c */
    public final JSONObject mo40033c() {
        return this.mAdContent;
    }

    /* renamed from: d */
    public String mo40034d() {
        return this.mWebVast;
    }

    /* renamed from: e */
    public boolean mo40035e() {
        return this.mIsPreloadWebView;
    }

    /* renamed from: f */
    public final String mo40036f() {
        return this.impressionId;
    }

    /* renamed from: g */
    public AdMetaInfo mo40037g() {
        return new AdMetaInfo(mo40051u(), this.transaction);
    }

    /* renamed from: w */
    private long m11143w() {
        long j = this.mExpiryDurationInMillis;
        if (j == -1) {
            return -1;
        }
        return this.mInsertionTimestampInMillis + j;
    }

    /* renamed from: a */
    public boolean mo40031a(long j) {
        long j2;
        if (m11143w() == -1) {
            j2 = (this.mInsertionTimestampInMillis + TimeUnit.SECONDS.toMillis(j)) - System.currentTimeMillis();
        } else {
            j2 = m11143w() - System.currentTimeMillis();
        }
        return j2 < 0;
    }

    /* renamed from: h */
    public final Set<C5005ba> mo40038h() {
        HashSet hashSet = new HashSet();
        try {
            if (this.assetUrls != null) {
                for (int i = 0; i < this.assetUrls.length(); i++) {
                    JSONObject jSONObject = new JSONObject(this.assetUrls.getString(i));
                    byte b = (byte) jSONObject.getInt("type");
                    String optString = jSONObject.optString("url");
                    if (!TextUtils.isEmpty(optString)) {
                        hashSet.add(new C5005ba(b, optString));
                    }
                }
            }
            return hashSet;
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return hashSet;
        }
    }

    /* renamed from: i */
    public final String mo40039i() {
        return this.markupType;
    }

    /* renamed from: a */
    public void mo40029a(String str) {
        this.mWebVast = str;
    }

    /* renamed from: j */
    public float mo40040j() {
        return this.mBid;
    }

    /* renamed from: k */
    public String mo40041k() {
        return this.pubContent;
    }

    /* renamed from: l */
    public boolean mo40042l() {
        return this.canLoadBeforeShow;
    }

    /* renamed from: m */
    public JSONObject mo40043m() {
        return this.transaction;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40030a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.pubContent = this.pubContent.replace(next, jSONObject.getString(next));
            }
        }
        String str = this.pubContent;
        if ("inmobiJson".equals(mo40039i())) {
            this.mAdContent.put("pubContent", new JSONObject(str));
        } else {
            this.mAdContent.put("pubContent", str);
        }
    }

    /* renamed from: n */
    public JSONArray mo40044n() {
        return this.mAdContent.optJSONArray("trackingEvents");
    }

    /* renamed from: o */
    public String mo40045o() {
        return this.mAdContent.optString("baseEventUrl", (String) null);
    }

    /* renamed from: p */
    public Long mo40046p() {
        try {
            if (this.mAdContent.has("asPlcId")) {
                return Long.valueOf(this.mAdContent.getLong("asPlcId"));
            }
            return null;
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return null;
        }
    }

    /* renamed from: q */
    public long mo40047q() {
        return this.mAdContent.optLong("lineItemId", Long.MIN_VALUE);
    }

    /* renamed from: r */
    public String mo40048r() {
        return this.adAuctionMeta;
    }

    /* renamed from: s */
    public boolean mo40049s() {
        return this.applyBitmap;
    }

    /* renamed from: b */
    public static Map<String, String> m11142b(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("rewards")) {
            return null;
        }
        HashMap hashMap = new HashMap();
        JSONObject optJSONObject = jSONObject.optJSONObject("rewards");
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, optJSONObject.getString(next));
            }
        }
        return hashMap;
    }

    /* renamed from: t */
    public Map<String, String> mo40050t() {
        try {
            return m11142b(this.mAdContent.getJSONObject("pubContent"));
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return null;
        }
    }

    /* renamed from: u */
    public String mo40051u() {
        return this.mAdContent.optString("creativeId");
    }

    /* renamed from: v */
    public List<String> mo40052v() {
        JSONArray optJSONArray;
        if (this.trackers == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        int i = 0;
        while (i < this.trackers.length()) {
            try {
                JSONObject jSONObject = this.trackers.getJSONObject(i);
                if (WIN_BEACON.equals(jSONObject.optString("type")) && (optJSONArray = jSONObject.optJSONArray("url")) != null) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        linkedList.add(optJSONArray.getString(i2));
                    }
                }
                i++;
            } catch (JSONException unused) {
                return null;
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList;
    }
}
