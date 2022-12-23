package com.yandex.metrica.impl.p265ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Le */
public class C10459Le implements C10235F0 {

    /* renamed from: a */
    public final String f25109a;

    /* renamed from: b */
    public final JSONObject f25110b;

    /* renamed from: c */
    public final boolean f25111c;

    /* renamed from: d */
    public final boolean f25112d;

    /* renamed from: e */
    public final C10202E0 f25113e;

    public C10459Le(String str, JSONObject jSONObject, boolean z, boolean z2, C10202E0 e0) {
        this.f25109a = str;
        this.f25110b = jSONObject;
        this.f25111c = z;
        this.f25112d = z2;
        this.f25113e = e0;
    }

    /* renamed from: a */
    public C10202E0 mo61253a() {
        return this.f25113e;
    }

    public String toString() {
        return "PreloadInfoState{trackingId='" + this.f25109a + '\'' + ", additionalParameters=" + this.f25110b + ", wasSet=" + this.f25111c + ", autoTrackingEnabled=" + this.f25112d + ", source=" + this.f25113e + '}';
    }
}
