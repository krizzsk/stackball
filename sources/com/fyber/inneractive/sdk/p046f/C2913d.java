package com.fyber.inneractive.sdk.p046f;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.f.d */
public final class C2913d implements C2915f {

    /* renamed from: a */
    private Long f6933a = null;

    /* renamed from: b */
    private Long f6934b = null;

    /* renamed from: c */
    private Long f6935c = null;

    /* renamed from: d */
    private Long f6936d = null;

    /* renamed from: e */
    private Long f6937e = null;

    /* renamed from: f */
    private Long f6938f = null;

    /* renamed from: g */
    private Long f6939g = null;

    /* renamed from: h */
    public final boolean mo18372h() {
        return true;
    }

    C2913d() {
    }

    /* renamed from: a */
    public final Long mo18365a() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f6933a = valueOf;
        return valueOf;
    }

    /* renamed from: b */
    public final Long mo18366b() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f6934b = valueOf;
        return valueOf;
    }

    /* renamed from: c */
    public final Long mo18367c() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f6935c = valueOf;
        return valueOf;
    }

    /* renamed from: d */
    public final Long mo18368d() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f6936d = valueOf;
        return valueOf;
    }

    /* renamed from: e */
    public final Long mo18369e() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f6937e = valueOf;
        return valueOf;
    }

    /* renamed from: f */
    public final Long mo18370f() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f6938f = valueOf;
        return valueOf;
    }

    /* renamed from: g */
    public final Long mo18371g() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f6939g = valueOf;
        return valueOf;
    }

    /* renamed from: i */
    public final Map<String, Long> mo18373i() {
        HashMap hashMap = new HashMap();
        Long l = this.f6934b;
        if (!(l == null || this.f6933a == null)) {
            hashMap.put("sdk_init_network_req", Long.valueOf(l.longValue() - this.f6933a.longValue()));
        }
        Long l2 = this.f6935c;
        if (!(l2 == null || this.f6934b == null)) {
            hashMap.put("sdk_got_server_res", Long.valueOf(l2.longValue() - this.f6934b.longValue()));
        }
        Long l3 = this.f6936d;
        if (!(l3 == null || this.f6935c == null)) {
            hashMap.put("sdk_parsed_res", Long.valueOf(l3.longValue() - this.f6935c.longValue()));
        }
        Long l4 = this.f6937e;
        if (!(l4 == null || this.f6936d == null)) {
            hashMap.put("ad_loaded_result", Long.valueOf(l4.longValue() - this.f6936d.longValue()));
        }
        Long l5 = this.f6938f;
        if (!(l5 == null || this.f6937e == null)) {
            hashMap.put("publisher_notified", Long.valueOf(l5.longValue() - this.f6937e.longValue()));
        }
        Long l6 = this.f6939g;
        if (!(l6 == null || this.f6933a == null)) {
            hashMap.put("roundtrip", Long.valueOf(l6.longValue() - this.f6933a.longValue()));
        }
        return hashMap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MetricsCollectorData{");
        if (!(this.f6933a == null || this.f6934b == null)) {
            sb.append(" sdk_init_network_req=");
            sb.append(this.f6934b.longValue() - this.f6933a.longValue());
        }
        if (!(this.f6935c == null || this.f6934b == null)) {
            sb.append(", sdk_got_server_res=");
            sb.append(this.f6935c.longValue() - this.f6934b.longValue());
        }
        if (!(this.f6936d == null || this.f6935c == null)) {
            sb.append(", sdk_parsed_res=");
            sb.append(this.f6936d.longValue() - this.f6935c.longValue());
        }
        if (!(this.f6937e == null || this.f6936d == null)) {
            sb.append(", ad_loaded_result=");
            sb.append(this.f6937e.longValue() - this.f6936d.longValue());
        }
        if (!(this.f6938f == null || this.f6937e == null)) {
            sb.append(", publisher_notified=");
            sb.append(this.f6938f.longValue() - this.f6937e.longValue());
        }
        if (!(this.f6939g == null || this.f6933a == null)) {
            sb.append(", roundtrip=");
            sb.append(this.f6939g.longValue() - this.f6933a.longValue());
        }
        sb.append(" }");
        return sb.toString();
    }
}
