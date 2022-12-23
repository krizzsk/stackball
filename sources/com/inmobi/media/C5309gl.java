package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.media.C5239ey;
import com.p243my.target.ads.Reward;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.gl */
/* compiled from: TelemetryComponent */
public class C5309gl implements C5290fx {

    /* renamed from: a */
    public static AtomicBoolean f12168a = new AtomicBoolean(false);

    /* renamed from: b */
    public static double f12169b = Math.random();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f12170d = C5309gl.class.getSimpleName();

    /* renamed from: h */
    private static final ArrayList<String> f12171h = new ArrayList<>(Arrays.asList(new String[]{"AdLoadSuccessful", "AdLoadFailed", "ServerFill", "ServerNoFill", "ServerError", "AssetDownloaded"}));

    /* renamed from: c */
    public C5284fu f12172c;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C5271fm f12173e;

    /* renamed from: f */
    private C5312gm f12174f;

    /* renamed from: g */
    private String f12175g;

    /* renamed from: com.inmobi.media.gl$a */
    /* compiled from: TelemetryComponent */
    static class C5311a {

        /* renamed from: a */
        static final C5309gl f12179a = new C5309gl((byte) 0);
    }

    /* synthetic */ C5309gl(byte b) {
        this();
    }

    /* renamed from: a */
    public static C5309gl m12169a() {
        return C5311a.f12179a;
    }

    /* renamed from: b */
    public final void mo40653b() {
        f12168a.set(false);
        C5271fm fmVar = (C5271fm) C5239ey.m11987a("telemetry", C5314go.m12211f(), (C5239ey.C5242c) null);
        this.f12173e = fmVar;
        this.f12175g = fmVar.telemetryUrl;
        if (this.f12174f.mo40594a() > 0) {
            m12174e();
        }
    }

    private C5309gl() {
        this.f12174f = new C5312gm();
        C5271fm fmVar = (C5271fm) C5238ex.m11980a("telemetry", (String) null);
        this.f12173e = fmVar;
        this.f12175g = fmVar.telemetryUrl;
    }

    /* renamed from: a */
    public final void mo40652a(final String str, final Map<String, Object> map) {
        C5314go.m12195a((Runnable) new Runnable() {
            public final void run() {
                String unused = C5309gl.f12170d;
                try {
                    C5313gn gnVar = new C5313gn(str);
                    if (!map.isEmpty() && str.equals("AssetDownloaded")) {
                        for (Map.Entry entry : map.entrySet()) {
                            if ("assetType".equals(entry.getKey())) {
                                if ("image".equals(entry.getKey()) && !C5309gl.this.f12173e.assetReporting.image) {
                                    String unused2 = C5309gl.f12170d;
                                    return;
                                } else if ("gif".equals(entry.getKey()) && !C5309gl.this.f12173e.assetReporting.gif) {
                                    String unused3 = C5309gl.f12170d;
                                    return;
                                } else if ("video".equals(entry.getKey()) && !C5309gl.this.f12173e.assetReporting.video) {
                                    String unused4 = C5309gl.f12170d;
                                    return;
                                }
                            }
                        }
                    }
                    map.put("eventType", gnVar.f12182b);
                    map.put("eventId", UUID.randomUUID().toString());
                    gnVar.f12184d = map.toString();
                    C5309gl.m12171a(C5309gl.this, gnVar);
                } catch (Exception unused5) {
                    String unused6 = C5309gl.f12170d;
                }
            }
        });
    }

    /* renamed from: a */
    private void m12172a(C5313gn gnVar) {
        if (this.f12173e.base.enabled) {
            int a = (this.f12174f.mo40594a() + 1) - this.f12173e.maxEventsToPersist;
            if (a > 0) {
                C5312gm gmVar = this.f12174f;
                C5306gi a2 = C5306gi.m12146a();
                List<ContentValues> a3 = a2.mo40636a("telemetry", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, "ts ASC", String.valueOf(a));
                ArrayList arrayList = new ArrayList();
                for (ContentValues next : a3) {
                    next.getAsString("id");
                    arrayList.add(Integer.valueOf(Integer.parseInt(next.getAsString("id"))));
                }
                gmVar.mo40595a((List<Integer>) arrayList);
                a2.mo40641b();
            }
            C5312gm.m12179a(gnVar);
        }
    }

    /* renamed from: e */
    private void m12174e() {
        if (!f12168a.get()) {
            C5281fr e = this.f12173e.mo40588e();
            e.f12070e = this.f12175g;
            e.f12067b = Reward.DEFAULT;
            C5284fu fuVar = this.f12172c;
            if (fuVar == null) {
                this.f12172c = new C5284fu(this.f12174f, this, e);
            } else {
                fuVar.mo40604a(e);
            }
            this.f12172c.mo40607a(Reward.DEFAULT, true);
        }
    }

    /* renamed from: c */
    public final C5283ft mo40592c() {
        List<C5313gn> list;
        if (C5342he.m12326a() != 1) {
            list = C5312gm.m12178a(this.f12173e.networkType.others.maxBatchSize);
        } else {
            list = C5312gm.m12178a(this.f12173e.networkType.wifi.maxBatchSize);
        }
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (C5313gn gnVar : list) {
                arrayList.add(Integer.valueOf(gnVar.f12181a));
            }
            String a = m12170a(list);
            if (a != null) {
                return new C5283ft(arrayList, a);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m12170a(List<C5313gn> list) {
        try {
            HashMap hashMap = new HashMap();
            String str = "";
            hashMap.put("im-accid", C5314go.m12213g() != null ? C5314go.m12213g() : str);
            if (C5314go.m12215h() != null) {
                str = C5314go.m12215h();
            }
            hashMap.put("as-accid", str);
            hashMap.put("version", "4.0.0");
            hashMap.put("mk-version", C5315gp.m12222a());
            hashMap.put("u-appbid", C5340hd.m12324a().f12229a);
            JSONObject jSONObject = new JSONObject(hashMap);
            JSONArray jSONArray = new JSONArray();
            for (C5313gn next : list) {
                if (!next.mo40655a().trim().isEmpty()) {
                    jSONArray.put(new JSONObject(next.mo40655a()));
                }
            }
            jSONObject.put("payload", jSONArray);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m12171a(C5309gl glVar, C5313gn gnVar) {
        if (!glVar.f12173e.base.enabled) {
            return;
        }
        if (glVar.f12173e.disableAllGeneralEvents && !glVar.f12173e.priorityEvents.contains(gnVar.f12182b)) {
            return;
        }
        if (f12171h.contains(gnVar.f12182b) && f12169b < glVar.f12173e.samplingFactor) {
            return;
        }
        if ("CrashEventOccurred".equals(gnVar.f12182b)) {
            glVar.m12172a(gnVar);
            return;
        }
        glVar.m12172a(gnVar);
        glVar.m12174e();
    }
}
