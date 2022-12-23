package com.yandex.metrica.impl.p265ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Ul */
public class C10819Ul {

    /* renamed from: a */
    private final C10616Om f25967a;

    /* renamed from: b */
    private final C10868W0 f25968b;

    /* renamed from: c */
    private final C10115Al f25969c;

    /* renamed from: d */
    private final boolean f25970d;

    /* renamed from: e */
    private boolean f25971e;

    /* renamed from: f */
    private long f25972f;

    public C10819Ul(boolean z) {
        this(z, new C10580Nm(), C10611Oh.m27142a(), new C10115Al());
    }

    /* renamed from: a */
    public void mo62368a() {
        long a = this.f25967a.mo61840a();
        C10868W0 w0 = this.f25968b;
        C10115Al al = this.f25969c;
        long j = a - this.f25972f;
        boolean z = this.f25970d;
        boolean z2 = this.f25971e;
        al.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time_millis", j).put("force", z).put("rescanned", z2);
        } catch (Throwable unused) {
        }
        w0.reportEvent("ui_parsing_bridge_time", jSONObject.toString());
    }

    /* renamed from: b */
    public void mo62370b() {
        this.f25972f = this.f25967a.mo61840a();
    }

    C10819Ul(boolean z, C10616Om om, C10868W0 w0, C10115Al al) {
        this.f25971e = false;
        this.f25970d = z;
        this.f25967a = om;
        this.f25968b = w0;
        this.f25969c = al;
    }

    /* renamed from: a */
    public void mo62369a(boolean z) {
        this.f25971e = z;
    }
}
