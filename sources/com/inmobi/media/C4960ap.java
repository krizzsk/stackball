package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.appsflyer.internal.referrer.Payload;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.smaato.sdk.video.vast.model.C8937Ad;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ap */
/* compiled from: AdStore */
public class C4960ap {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String f11245e = C4960ap.class.getSimpleName();

    /* renamed from: a */
    public final C4965a f11246a;

    /* renamed from: b */
    public final C4955an f11247b;

    /* renamed from: c */
    public long f11248c = 0;

    /* renamed from: d */
    public final C4980au f11249d = new C4980au() {
        /* renamed from: a */
        public final void mo40113a(C4951aj ajVar) {
            C4960ap.this.f11251g.mo40113a(ajVar);
            String unused = C4960ap.f11245e;
            C4955an unused2 = C4960ap.this.f11247b;
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C4960ap.this.f11246a.mo40117a(C4960ap.this.f11247b, false);
                }
            });
        }

        /* renamed from: b */
        public final void mo40114b(C4951aj ajVar) {
            C4960ap.this.f11251g.mo40114b(ajVar);
            String unused = C4960ap.f11245e;
            C4955an unused2 = C4960ap.this.f11247b;
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C4960ap.this.f11246a.mo40117a(C4960ap.this.f11247b, true);
                }
            });
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C5006bb f11250f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C4980au f11251g = new C4980au() {
        /* renamed from: a */
        public final void mo40113a(C4951aj ajVar) {
            String unused = C4960ap.f11245e;
            if (ajVar == null) {
            }
        }

        /* renamed from: b */
        public final void mo40114b(C4951aj ajVar) {
            String unused = C4960ap.f11245e;
            if (ajVar != null) {
                Set<C5005ba> set = ajVar.f11210b;
                for (C4949ai next : ajVar.f11209a) {
                    if (!next.f11198j) {
                        String a = C4960ap.m11248a((Set) set, next);
                        HashMap hashMap = new HashMap();
                        hashMap.put(Payload.LATENCY, Long.valueOf(next.f11189a));
                        hashMap.put("size", Float.valueOf((((float) C5362hv.m12398a(next.f11193e)) * 1.0f) / 1024.0f));
                        hashMap.put("assetType", a);
                        hashMap.put("networkType", C5342he.m12330b());
                        hashMap.put(C8937Ad.AD_TYPE, C4960ap.this.f11247b.mo40078k());
                        C4960ap.this.f11250f.mo40159b("AssetDownloaded", hashMap);
                    }
                }
            }
            String unused2 = C4960ap.f11245e;
            C4955an unused3 = C4960ap.this.f11247b;
        }
    };

    /* renamed from: com.inmobi.media.ap$a */
    /* compiled from: AdStore */
    public interface C4965a {
        /* renamed from: a */
        void mo40117a(C4955an anVar, boolean z);
    }

    public C4960ap(C4965a aVar, C5006bb bbVar, C4955an anVar) {
        this.f11246a = aVar;
        this.f11250f = bbVar;
        this.f11247b = anVar;
    }

    /* renamed from: a */
    public final C4958ao mo40110a(C5038by byVar, C5074ck ckVar) throws C5007bc {
        try {
            return mo40111a(new JSONObject(byVar.f11499a.mo40625b()), ckVar);
        } catch (JSONException unused) {
            throw new C5007bc(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    /* renamed from: a */
    public final C4958ao mo40111a(JSONObject jSONObject, C5074ck ckVar) throws C5007bc {
        C4958ao b = m11251b(jSONObject, ckVar);
        if (b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - this.f11248c));
            hashMap.put(C8937Ad.AD_TYPE, this.f11247b.mo40078k());
            hashMap.put("networkType", C5342he.m12330b());
            this.f11250f.mo40159b("ServerFill", hashMap);
            if (!b.mo40100c() || b.mo40108k() != null) {
                return b;
            }
            throw new C5007bc(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
        throw new C5007bc(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
    }

    /* renamed from: b */
    private C4958ao m11251b(JSONObject jSONObject, C5074ck ckVar) {
        try {
            String trim = jSONObject.optString("winningAdSetId").trim();
            JSONArray jSONArray = jSONObject.getJSONArray("adSets");
            String string = jSONObject.getString(C4958ao.KEY_REQUEST_ID);
            if (jSONArray.length() != 0) {
                C4958ao a = C4958ao.m11230a(jSONArray.getJSONObject(0), this.f11247b.mo40070e(), this.f11247b.mo40078k(), string, ckVar);
                if (a != null) {
                    return a;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 3);
                mo40112a((Map<String, Object>) hashMap);
                return null;
            } else if (!TextUtils.isEmpty(trim)) {
                return null;
            } else {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - this.f11248c));
                hashMap2.put(C8937Ad.AD_TYPE, this.f11247b.mo40078k());
                hashMap2.put("networkType", C5342he.m12330b());
                this.f11250f.mo40159b("ServerNoFill", hashMap2);
                throw new C5007bc(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NO_FILL));
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final void mo40112a(Map<String, Object> map) {
        map.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - this.f11248c));
        map.put(C8937Ad.AD_TYPE, this.f11247b.mo40078k());
        map.put("networkType", C5342he.m12330b());
        this.f11250f.mo40159b("ServerError", map);
    }

    /* renamed from: a */
    public static void m11249a(C5037bx bxVar) {
        if (bxVar != null) {
            Map<String, String> map = bxVar.f11495d;
            if (map == null) {
                map = new HashMap<>();
            }
            bxVar.f11495d = map;
        }
    }

    /* renamed from: a */
    static /* synthetic */ String m11248a(Set set, C4949ai aiVar) {
        String str;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C5005ba baVar = (C5005ba) it.next();
            if (baVar.f11356b.equals(aiVar.f11192d)) {
                byte b = baVar.f11355a;
                if (b == 0) {
                    str = "video";
                } else if (b == 1) {
                    str = "gif";
                } else if (b != 2) {
                    return "";
                } else {
                    str = "image";
                }
                return str;
            }
        }
        return "";
    }
}
