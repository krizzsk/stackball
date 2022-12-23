package com.tapjoy.internal;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tapjoy.internal.cu */
public final class C9140cu {

    /* renamed from: a */
    public final C9143cx f22458a;

    /* renamed from: b */
    final WebView f22459b = null;

    /* renamed from: c */
    public final List f22460c;

    /* renamed from: d */
    final String f22461d;

    /* renamed from: e */
    public final String f22462e;

    /* renamed from: f */
    public final C9141cv f22463f;

    private C9140cu(C9143cx cxVar, String str, List list, String str2) {
        C9141cv cvVar;
        ArrayList arrayList = new ArrayList();
        this.f22460c = arrayList;
        this.f22458a = cxVar;
        this.f22461d = str;
        if (list != null) {
            arrayList.addAll(list);
            cvVar = C9141cv.NATIVE;
        } else {
            cvVar = C9141cv.HTML;
        }
        this.f22463f = cvVar;
        this.f22462e = str2;
    }

    /* renamed from: a */
    public static C9140cu m24479a(C9143cx cxVar, String str, List list, String str2) {
        C9166do.m24543a((Object) cxVar, "Partner is null");
        C9166do.m24543a((Object) str, "OM SDK JS script content is null");
        C9166do.m24543a((Object) list, "VerificationScriptResources is null");
        if (str2.length() <= 256) {
            return new C9140cu(cxVar, str, list, str2);
        }
        throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
    }
}
