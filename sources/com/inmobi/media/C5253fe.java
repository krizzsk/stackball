package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.tapjoy.TJAdUnitConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.fe */
/* compiled from: ConfigNetworkResponse */
final class C5253fe {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f12031b = C5253fe.class.getSimpleName();

    /* renamed from: a */
    Map<String, C5254a> f12032a = new HashMap();

    /* renamed from: c */
    private Map<String, C5238ex> f12033c;

    /* renamed from: d */
    private C5300gd f12034d;

    /* renamed from: e */
    private C5248fa f12035e;

    /* renamed from: f */
    private long f12036f;

    /* renamed from: a */
    private static boolean m12026a(int i) {
        return 500 <= i && i < 600;
    }

    C5253fe(C5252fd fdVar, C5300gd gdVar, long j) {
        this.f12033c = fdVar.f12030c;
        this.f12034d = gdVar;
        this.f12036f = j;
        m12028c();
    }

    /* renamed from: c */
    private void m12028c() {
        if (!this.f12034d.mo40624a()) {
            try {
                JSONObject jSONObject = new JSONObject(this.f12034d.mo40625b());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (this.f12033c.get(next) != null) {
                        this.f12032a.put(next, new C5254a(jSONObject2, this.f12033c.get(next)));
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("name", m12025a(this.f12033c));
                C5309gl.m12169a().mo40652a("ConfigFetched", (Map<String, Object>) hashMap);
            } catch (JSONException e) {
                this.f12035e = new C5248fa((byte) 2, e.getLocalizedMessage());
                HashMap hashMap2 = new HashMap();
                hashMap2.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 1);
                hashMap2.put("name", m12025a(this.f12033c));
                hashMap2.put("networkType", C5342he.m12330b());
                C5309gl.m12169a().mo40652a("InvalidConfig", (Map<String, Object>) hashMap2);
            }
        } else {
            for (Map.Entry next2 : this.f12033c.entrySet()) {
                C5254a aVar = new C5254a((JSONObject) null, (C5238ex) next2.getValue());
                aVar.f12039c = new C5248fa((byte) 0, "Network error in fetching config.");
                this.f12032a.put(next2.getKey(), aVar);
            }
            this.f12035e = new C5248fa((byte) 0, this.f12034d.f12145a.f12121b);
            HashMap hashMap3 = new HashMap();
            hashMap3.put(IronSourceConstants.EVENTS_ERROR_CODE, String.valueOf(this.f12034d.f12145a.f12120a));
            hashMap3.put("name", m12025a(this.f12033c));
            hashMap3.put("networkType", C5342he.m12330b());
            C5309gl.m12169a().mo40652a("InvalidConfig", (Map<String, Object>) hashMap3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo40576a() {
        C5300gd gdVar = this.f12034d;
        if (gdVar == null || gdVar.f12145a == null) {
            return false;
        }
        return this.f12034d.f12145a.f12120a == -7 || m12026a(this.f12034d.f12145a.f12120a);
    }

    /* renamed from: com.inmobi.media.fe$a */
    /* compiled from: ConfigNetworkResponse */
    public static class C5254a {

        /* renamed from: a */
        int f12037a;

        /* renamed from: b */
        C5238ex f12038b;

        /* renamed from: c */
        C5248fa f12039c;

        C5254a(JSONObject jSONObject, C5238ex exVar) {
            this.f12038b = exVar;
            if (jSONObject != null) {
                try {
                    int i = jSONObject.getInt("status");
                    int i2 = TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL;
                    if (i == 200) {
                        i2 = 200;
                    } else if (i == 304) {
                        i2 = ErrorCode.INLINE_AD_DISPLAY_TIMEOUT_ERROR;
                    } else if (i == 404) {
                        i2 = 404;
                    } else if (i != 500) {
                        i2 = -1;
                    }
                    this.f12037a = i2;
                    if (i2 == 200) {
                        C5238ex a = C5238ex.m11981a(this.f12038b.mo40557b(), jSONObject.getJSONObject("content"), this.f12038b.mo40564g());
                        if (a != null) {
                            this.f12038b = a;
                        }
                        if (this.f12038b == null || !this.f12038b.mo40559d()) {
                            this.f12039c = new C5248fa((byte) 2, "The received config has failed validation.");
                            String unused = C5253fe.f12031b;
                            this.f12038b.mo40557b();
                        }
                    } else if (i2 == 304) {
                        String unused2 = C5253fe.f12031b;
                        this.f12038b.mo40557b();
                    } else {
                        this.f12039c = new C5248fa((byte) 1, "Internal error");
                        String unused3 = C5253fe.f12031b;
                        this.f12038b.mo40557b();
                    }
                } catch (JSONException e) {
                    this.f12039c = new C5248fa((byte) 2, e.getLocalizedMessage());
                    String unused4 = C5253fe.f12031b;
                    this.f12038b.mo40557b();
                }
            }
        }

        /* renamed from: a */
        public final boolean mo40577a() {
            return this.f12039c != null;
        }
    }

    /* renamed from: a */
    private static String m12025a(Map<String, C5238ex> map) {
        StringBuilder sb = new StringBuilder();
        for (String append : map.keySet()) {
            sb.append(append);
            sb.append(",");
        }
        return "[" + sb.substring(0, sb.length() - 1) + "]";
    }
}
