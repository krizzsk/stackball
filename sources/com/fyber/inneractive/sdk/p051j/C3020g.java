package com.fyber.inneractive.sdk.p051j;

import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.p037d.p038a.C2820c;
import com.fyber.inneractive.sdk.p037d.p038a.C2823e;
import com.fyber.inneractive.sdk.p047g.p048a.C2916a;
import com.fyber.inneractive.sdk.p047g.p048a.C2921f;
import com.fyber.inneractive.sdk.p047g.p048a.C2928m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.j.g */
public final class C3020g extends C3018e {

    /* renamed from: D */
    C2823e f7425D;

    /* renamed from: E */
    public C2916a f7426E;

    /* renamed from: F */
    public Map<C2928m, C2820c> f7427F = new LinkedHashMap();

    /* renamed from: G */
    public List<C2921f> f7428G = new ArrayList();

    /* renamed from: H */
    String f7429H;

    /* renamed from: I */
    LinkedHashMap<String, String> f7430I = new LinkedHashMap<>();

    /* renamed from: a */
    public long f7431a;

    /* renamed from: a */
    public final InneractiveErrorCode mo18270a() {
        return mo18271a((InneractiveAdRequest) null, (C2767s) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cb A[LOOP:0: B:42:0x00c5->B:44:0x00cb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0101  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fyber.inneractive.sdk.external.InneractiveErrorCode mo18271a(com.fyber.inneractive.sdk.external.InneractiveAdRequest r8, com.fyber.inneractive.sdk.config.p034a.C2767s r9) {
        /*
            r7 = this;
            com.fyber.inneractive.sdk.d.a.f r0 = new com.fyber.inneractive.sdk.d.a.f
            r0.<init>()
            java.lang.String r0 = r7.f7409l
            java.lang.String r1 = "VastErrorInvalidFile"
            boolean r1 = r1.equals(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0028
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r0 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE
            com.fyber.inneractive.sdk.h.l r1 = com.fyber.inneractive.sdk.p049h.C2966l.VAST_ERROR_INVALID_RESPONSE
            java.lang.String r3 = r7.f7410m
            if (r3 == 0) goto L_0x0026
            com.fyber.inneractive.sdk.h.n$b r3 = new com.fyber.inneractive.sdk.h.n$b
            r3.<init>()
            java.lang.String r4 = r7.f7410m
            java.lang.String r5 = "exception"
            com.fyber.inneractive.sdk.h.n$b r3 = r3.mo18438a(r5, r4)
            goto L_0x0087
        L_0x0026:
            r3 = r2
            goto L_0x0087
        L_0x0028:
            java.lang.String r1 = "ErrorNoCompatibleMediaFile"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x003d
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r0 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE
            com.fyber.inneractive.sdk.h.l r1 = com.fyber.inneractive.sdk.p049h.C2966l.VAST_ERROR_NO_COMPATIBLE_MEDIA_FILE
            java.util.Map<com.fyber.inneractive.sdk.g.a.m, com.fyber.inneractive.sdk.d.a.c> r3 = r7.f7427F
            if (r3 == 0) goto L_0x0026
            com.fyber.inneractive.sdk.h.n$b r3 = com.fyber.inneractive.sdk.p037d.p038a.C2824f.m6174a(r3)
            goto L_0x0087
        L_0x003d:
            java.lang.String r1 = "VastErrorTooManyWrappers"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x005d
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r0 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE
            com.fyber.inneractive.sdk.h.l r1 = com.fyber.inneractive.sdk.p049h.C2966l.VAST_ERROR_TOO_MANY_WRAPPERS
            com.fyber.inneractive.sdk.h.n$b r3 = new com.fyber.inneractive.sdk.h.n$b
            r3.<init>()
            int r4 = com.fyber.inneractive.sdk.config.C2739a.m5961c()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "max"
            com.fyber.inneractive.sdk.h.n$b r3 = r3.mo18438a(r5, r4)
            goto L_0x0087
        L_0x005d:
            java.lang.String r1 = "ErrorNoMediaFiles"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x006a
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r0 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE
            com.fyber.inneractive.sdk.h.l r1 = com.fyber.inneractive.sdk.p049h.C2966l.VAST_ERROR_NO_MEDIA_FILES
            goto L_0x0026
        L_0x006a:
            java.lang.String r1 = "ErrorConfigurationMismatch"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0077
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r0 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH
            com.fyber.inneractive.sdk.h.l r1 = com.fyber.inneractive.sdk.p049h.C2966l.INTERNAL_CONFIG_MISMATCH
            goto L_0x0026
        L_0x0077:
            java.lang.String r1 = "VastErrorUnsecure"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0084
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r0 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE
            com.fyber.inneractive.sdk.h.l r1 = com.fyber.inneractive.sdk.p049h.C2966l.VAST_ERROR_UNSECURE_URL
            goto L_0x0026
        L_0x0084:
            r0 = r2
            r1 = r0
            r3 = r1
        L_0x0087:
            if (r1 == 0) goto L_0x009e
            com.fyber.inneractive.sdk.h.n$a r4 = new com.fyber.inneractive.sdk.h.n$a
            if (r9 != 0) goto L_0x008f
            r5 = r2
            goto L_0x0093
        L_0x008f:
            org.json.JSONArray r5 = r9.mo18013b()
        L_0x0093:
            r4.<init>((com.fyber.inneractive.sdk.p049h.C2966l) r1, (com.fyber.inneractive.sdk.external.InneractiveAdRequest) r8, (com.fyber.inneractive.sdk.p051j.C3018e) r7, (org.json.JSONArray) r5)
            if (r3 == 0) goto L_0x009b
            r4.mo18433a((com.fyber.inneractive.sdk.p049h.C2968n.C2971b) r3)
        L_0x009b:
            r4.mo18436b(r2)
        L_0x009e:
            java.util.List<com.fyber.inneractive.sdk.g.a.f> r1 = r7.f7428G
            if (r1 == 0) goto L_0x00e4
            int r3 = r1.size()
            if (r3 <= 0) goto L_0x00e4
            com.fyber.inneractive.sdk.h.n$a r3 = new com.fyber.inneractive.sdk.h.n$a
            com.fyber.inneractive.sdk.h.m r4 = com.fyber.inneractive.sdk.p049h.C2967m.VAST_EVENT_COMPANION_FILTERED
            if (r9 != 0) goto L_0x00b0
            r5 = r2
            goto L_0x00b4
        L_0x00b0:
            org.json.JSONArray r5 = r9.mo18013b()
        L_0x00b4:
            r3.<init>((com.fyber.inneractive.sdk.p049h.C2967m) r4, (com.fyber.inneractive.sdk.external.InneractiveAdRequest) r8, (com.fyber.inneractive.sdk.p051j.C3018e) r7, (org.json.JSONArray) r5)
            com.fyber.inneractive.sdk.h.n$b r4 = new com.fyber.inneractive.sdk.h.n$b
            r4.<init>()
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00c5:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00d9
            java.lang.Object r6 = r1.next()
            com.fyber.inneractive.sdk.g.a.f r6 = (com.fyber.inneractive.sdk.p047g.p048a.C2921f) r6
            org.json.JSONObject r6 = r6.mo18383a()
            r5.put(r6)
            goto L_0x00c5
        L_0x00d9:
            java.lang.String r1 = "companion_data"
            r4.mo18438a(r1, r5)
            r3.mo18433a((com.fyber.inneractive.sdk.p049h.C2968n.C2971b) r4)
            r3.mo18436b(r2)
        L_0x00e4:
            com.fyber.inneractive.sdk.g.a.a r1 = r7.f7426E
            r3 = 0
            if (r1 == 0) goto L_0x00f0
            java.util.PriorityQueue<com.fyber.inneractive.sdk.g.a.b> r1 = r1.f6945f
            int r1 = r1.size()
            goto L_0x00f1
        L_0x00f0:
            r1 = 0
        L_0x00f1:
            java.util.List<com.fyber.inneractive.sdk.g.a.f> r4 = r7.f7428G
            if (r4 == 0) goto L_0x00f9
            int r3 = r4.size()
        L_0x00f9:
            com.fyber.inneractive.sdk.h.n$a r4 = new com.fyber.inneractive.sdk.h.n$a
            com.fyber.inneractive.sdk.h.m r5 = com.fyber.inneractive.sdk.p049h.C2967m.NUMBER_OF_COMPANIONS
            if (r9 != 0) goto L_0x0101
            r9 = r2
            goto L_0x0105
        L_0x0101:
            org.json.JSONArray r9 = r9.mo18013b()
        L_0x0105:
            r4.<init>((com.fyber.inneractive.sdk.p049h.C2967m) r5, (com.fyber.inneractive.sdk.external.InneractiveAdRequest) r8, (com.fyber.inneractive.sdk.p051j.C3018e) r7, (org.json.JSONArray) r9)
            com.fyber.inneractive.sdk.h.n$b r8 = new com.fyber.inneractive.sdk.h.n$b
            r8.<init>()
            int r1 = r1 + r3
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "number_of_endcards"
            r8.mo18438a(r1, r9)
            r4.mo18433a((com.fyber.inneractive.sdk.p049h.C2968n.C2971b) r8)
            r4.mo18436b(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p051j.C3020g.mo18271a(com.fyber.inneractive.sdk.external.InneractiveAdRequest, com.fyber.inneractive.sdk.config.a.s):com.fyber.inneractive.sdk.external.InneractiveErrorCode");
    }
}
