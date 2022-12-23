package com.ironsource.mediationsdk.p137a;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a.c */
public class C5641c {

    /* renamed from: a */
    private int f13340a = -1;

    /* renamed from: b */
    private long f13341b = -1;

    /* renamed from: c */
    private JSONObject f13342c;

    public C5641c(int i, long j, JSONObject jSONObject) {
        this.f13340a = i;
        this.f13341b = j;
        this.f13342c = jSONObject;
    }

    public C5641c(int i, JSONObject jSONObject) {
        this.f13340a = i;
        this.f13341b = System.currentTimeMillis();
        if (jSONObject == null) {
            this.f13342c = new JSONObject();
        } else {
            this.f13342c = jSONObject;
        }
    }

    /* renamed from: a */
    static C5633a m13791a(String str, int i) {
        if ("ironbeast".equals(str)) {
            return new C5643e(i);
        }
        if ("outcome".equals(str)) {
            return new C5644f(i);
        }
        if (i == 2) {
            return new C5643e(i);
        }
        if (i == 3) {
            return new C5644f(i);
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
        logger.log(ironSourceTag, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i + ")", 2);
        return null;
    }

    /* renamed from: a */
    public int mo41706a() {
        return this.f13340a;
    }

    /* renamed from: a */
    public void mo41707a(int i) {
        this.f13340a = i;
    }

    /* renamed from: a */
    public void mo41708a(String str, Object obj) {
        try {
            this.f13342c.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public long mo41709b() {
        return this.f13341b;
    }

    /* renamed from: c */
    public String mo41710c() {
        return this.f13342c.toString();
    }

    /* renamed from: d */
    public JSONObject mo41711d() {
        return this.f13342c;
    }
}
