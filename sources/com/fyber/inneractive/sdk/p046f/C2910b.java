package com.fyber.inneractive.sdk.p046f;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.p049h.C2967m;
import com.fyber.inneractive.sdk.p049h.C2968n;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.C3662m;
import com.fyber.inneractive.sdk.util.C3670q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.fyber.inneractive.sdk.f.b */
public final class C2910b<T extends C3018e> extends C2909a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f6918a = "24";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f6919b = "3";
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f6920d = "24";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String f6921e = "3";
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final String f6922f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final UnitDisplayType f6923g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final T f6924h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final InneractiveAdRequest f6925i;

    /* renamed from: j */
    private JSONArray f6926j;

    public C2910b(T t, InneractiveAdRequest inneractiveAdRequest, String str, UnitDisplayType unitDisplayType, JSONArray jSONArray) {
        super("send_metric_report");
        this.f6924h = t;
        this.f6925i = inneractiveAdRequest;
        this.f6922f = str;
        this.f6923g = unitDisplayType;
        this.f6926j = jSONArray;
    }

    /* renamed from: b */
    public final void mo18362b() {
        final C2915f a = C2912c.m6513a().mo18364a(this.f6922f);
        final Map<String, Long> i = a.mo18373i();
        if (!a.mo18372h()) {
            IAlog.m9034b("MetricCreativeReporter: Metric data not valid, data: %s", C2912c.m6513a().mo18364a(this.f6922f).toString());
            return;
        }
        C2912c a2 = C2912c.m6513a();
        a2.f6931a.remove(this.f6922f);
        C3662m.m9138a(new Runnable() {
            public final void run() {
                String str;
                int i;
                int i2;
                IAlog.m9034b("MetricCreativeReporter: sendMetricEvent()", new Object[0]);
                if (C2910b.this.f6922f != null && C2910b.this.f6923g != null) {
                    if (C2910b.this.f6923g == UnitDisplayType.BANNER || C2910b.this.f6923g == UnitDisplayType.MRECT || C2910b.this.f6923g.isFullscreenUnit()) {
                        IAlog.m9034b("MetricCreativeReporter: sendMetricEvent(), collectorData: data: %s", a.toString());
                        if (C2910b.this.f6923g == UnitDisplayType.BANNER || C2910b.this.f6923g == UnitDisplayType.MRECT) {
                            String a = IAConfigManager.m5929c().f6586a.mo18048a("ad_metrics_interval_banner", C2910b.f6918a);
                            String a2 = IAConfigManager.m5929c().f6586a.mo18048a("ad_metrics_limit_banner", C2910b.f6919b);
                            i2 = C3670q.m9151a(a, 24);
                            i = C3670q.m9151a(a2, 3);
                            str = "LastSentMetricsBanner";
                        } else {
                            String a3 = IAConfigManager.m5929c().f6586a.mo18048a("ad_metrics_interval_interstitial", C2910b.f6920d);
                            String a4 = IAConfigManager.m5929c().f6586a.mo18048a("ad_metrics_limit_interstitial", C2910b.f6921e);
                            i2 = C3670q.m9151a(a3, 24);
                            i = C3670q.m9151a(a4, 3);
                            str = "LastSentMetricsInterstitial";
                        }
                        Application p = C3657l.m9125p();
                        if (p != null) {
                            SharedPreferences sharedPreferences = p.getSharedPreferences("IAConfigPrefs", 0);
                            JSONArray jSONArray = new JSONArray();
                            try {
                                jSONArray = new JSONArray(sharedPreferences.getString(str, "[]"));
                            } catch (JSONException unused) {
                            }
                            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                            if (C2910b.this.mo18092a() && !C2909a.m6501a(i2, i, jSONArray, copyOnWriteArrayList)) {
                                copyOnWriteArrayList.add(Long.valueOf(System.currentTimeMillis()));
                                C2910b bVar = C2910b.this;
                                C2910b.m6504a(bVar, bVar.f6925i, C2910b.this.f6924h, i);
                            }
                            sharedPreferences.edit().putString(str, new JSONArray(copyOnWriteArrayList).toString()).apply();
                            return;
                        }
                        return;
                    }
                    IAlog.m9034b("Unit display type %s is not supported for metric event", C2910b.this.f6923g.value());
                }
            }
        });
    }

    /* renamed from: a */
    static /* synthetic */ void m6504a(C2910b bVar, InneractiveAdRequest inneractiveAdRequest, C3018e eVar, Map map) {
        try {
            C2968n.C2969a aVar = new C2968n.C2969a(C2967m.METRIC_MEASUREMENTS_EVENT, inneractiveAdRequest, eVar, bVar.f6926j);
            C2968n.C2971b bVar2 = new C2968n.C2971b();
            for (String str : map.keySet()) {
                bVar2.mo18438a(str, map.get(str));
            }
            aVar.mo18433a(bVar2);
            aVar.mo18436b((String) null);
        } catch (Exception unused) {
        }
    }
}
