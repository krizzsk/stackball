package com.chartboost.sdk.Tracking;

import com.chartboost.sdk.Tracking.C1878i;

/* renamed from: com.chartboost.sdk.Tracking.f */
public class C1875f extends C1878i {
    public C1875f(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
        mo14460a(C1878i.C1879a.INFO);
        if ("cache_finish_success".equals(str) || "cache_finish_failure".equals(str) || "show_finish_success".equals(str) || "show_finish_failure".equals(str)) {
            mo14462a(true);
        }
    }
}
