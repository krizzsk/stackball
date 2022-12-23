package com.ogury.p245ed.internal;

import java.lang.reflect.Field;
import p269io.presage.common.AdConfig;

/* renamed from: com.ogury.ed.internal.ft */
public final class C8239ft {
    /* renamed from: a */
    public static final void m23149a(AdConfig adConfig, String str) {
        C8467mq.m23881b(str, "campaignId");
        if (adConfig != null) {
            Field declaredField = adConfig.getClass().getDeclaredField("campaignId");
            C8467mq.m23878a((Object) declaredField, "this::class.java.getDeclaredField(\"campaignId\")");
            declaredField.setAccessible(true);
            declaredField.set(adConfig, str);
        }
    }

    /* renamed from: b */
    public static final void m23150b(AdConfig adConfig, String str) {
        C8467mq.m23881b(str, "creativeId");
        if (adConfig != null) {
            Field declaredField = adConfig.getClass().getDeclaredField("creativeId");
            C8467mq.m23878a((Object) declaredField, "this::class.java.getDeclaredField(\"creativeId\")");
            declaredField.setAccessible(true);
            declaredField.set(adConfig, str);
        }
    }
}
