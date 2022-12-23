package com.ironsource.sdk.utils;

import java.util.HashMap;
import java.util.Map;

public class IronSourceQaProperties {

    /* renamed from: a */
    private static IronSourceQaProperties f14831a;

    /* renamed from: b */
    private static Map<String, String> f14832b = new HashMap();

    private IronSourceQaProperties() {
    }

    public static IronSourceQaProperties getInstance() {
        if (f14831a == null) {
            f14831a = new IronSourceQaProperties();
        }
        return f14831a;
    }

    public static boolean isInitialized() {
        return f14831a != null;
    }

    public Map<String, String> getParameters() {
        return f14832b;
    }

    public void setQaParameter(String str, String str2) {
        if (str != null && str2 != null) {
            f14832b.put(str, str2);
        }
    }
}
