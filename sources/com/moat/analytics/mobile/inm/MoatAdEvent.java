package com.moat.analytics.mobile.inm;

import java.util.HashMap;
import java.util.Map;

public class MoatAdEvent {
    public static final Double VOLUME_MUTED = Double.valueOf(0.0d);
    public static final Double VOLUME_UNMUTED = Double.valueOf(1.0d);

    /* renamed from: a */
    static final Integer f18082a = Integer.MIN_VALUE;

    /* renamed from: e */
    private static final Double f18083e = Double.valueOf(Double.NaN);

    /* renamed from: b */
    Integer f18084b;

    /* renamed from: c */
    Double f18085c;

    /* renamed from: d */
    MoatAdEventType f18086d;

    /* renamed from: f */
    private final Double f18087f;

    /* renamed from: g */
    private final Long f18088g;

    public MoatAdEvent(MoatAdEventType moatAdEventType) {
        this(moatAdEventType, f18082a, f18083e);
    }

    public MoatAdEvent(MoatAdEventType moatAdEventType, Integer num) {
        this(moatAdEventType, num, f18083e);
    }

    public MoatAdEvent(MoatAdEventType moatAdEventType, Integer num, Double d) {
        this.f18088g = Long.valueOf(System.currentTimeMillis());
        this.f18086d = moatAdEventType;
        this.f18085c = d;
        this.f18084b = num;
        this.f18087f = Double.valueOf(C7264s.m18552a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<String, Object> mo49274a() {
        HashMap hashMap = new HashMap();
        hashMap.put("adVolume", this.f18085c);
        hashMap.put("playhead", this.f18084b);
        hashMap.put("aTimeStamp", this.f18088g);
        hashMap.put("type", this.f18086d.toString());
        hashMap.put("deviceVolume", this.f18087f);
        return hashMap;
    }
}
