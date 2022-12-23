package com.mbridge.msdk.mbsignalcommon.p205a;

import android.util.Base64;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbsignalcommon.a.a */
/* compiled from: H5ReportManager */
public class C6528a {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final String f16288c = C6528a.class.getSimpleName();

    /* renamed from: a */
    int f16289a = 0;

    /* renamed from: b */
    int f16290b = 1;

    /* renamed from: d */
    private String f16291d = "handlerNativeResult";

    /* renamed from: com.mbridge.msdk.mbsignalcommon.a.a$a */
    /* compiled from: H5ReportManager */
    private static final class C6530a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C6528a f16293a = new C6528a();
    }

    /* renamed from: a */
    public static C6528a m16770a() {
        return C6530a.f16293a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0198, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0199, code lost:
        com.mbridge.msdk.foundation.tools.C6361q.m16154a(f16288c, r0.getMessage());
        m16771a(r1.f16290b, "exception: " + r0.getMessage(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        com.mbridge.msdk.foundation.tools.C6361q.m16158d(f16288c, r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c3, code lost:
        r6 = r3.optJSONObject(1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:2:0x000c, B:29:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0174 A[Catch:{ all -> 0x0186 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c9 A[Catch:{ Exception -> 0x009b, all -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cf A[Catch:{ Exception -> 0x009b, all -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d9 A[Catch:{ Exception -> 0x009b, all -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00df A[Catch:{ Exception -> 0x009b, all -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e9 A[Catch:{ Exception -> 0x009b, all -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ef A[Catch:{ Exception -> 0x009b, all -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f9 A[Catch:{ Exception -> 0x009b, all -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ff A[Catch:{ Exception -> 0x009b, all -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0109 A[Catch:{ Exception -> 0x009b, all -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010f A[Catch:{ Exception -> 0x009b, all -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0119 A[Catch:{ Exception -> 0x009b, all -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0120 A[Catch:{ Exception -> 0x009b, all -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x012b A[Catch:{ Exception -> 0x009b, all -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0132 A[Catch:{ Exception -> 0x009b, all -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x013e A[Catch:{ Exception -> 0x009b, all -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0145 A[Catch:{ Exception -> 0x009b, all -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0151 A[Catch:{ Exception -> 0x009b, all -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0158 A[Catch:{ Exception -> 0x009b, all -> 0x0198 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44404a(java.lang.Object r22, java.lang.String r23, org.json.JSONArray r24, int r25) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r0 = r23
            r3 = r24
            java.lang.String r4 = "called reporter failed, params empty"
            if (r3 != 0) goto L_0x0012
            int r0 = r1.f16290b     // Catch:{ all -> 0x0198 }
            r1.m16771a(r0, r4, r2)     // Catch:{ all -> 0x0198 }
            return
        L_0x0012:
            int r5 = r24.length()     // Catch:{ all -> 0x0198 }
            if (r5 != 0) goto L_0x001e
            int r0 = r1.f16290b     // Catch:{ all -> 0x0198 }
            r1.m16771a(r0, r4, r2)     // Catch:{ all -> 0x0198 }
            return
        L_0x001e:
            java.lang.String r4 = "reportMessageR"
            boolean r4 = r4.equalsIgnoreCase(r0)     // Catch:{ all -> 0x0198 }
            r6 = 0
            r7 = 1
            java.lang.String r8 = "value"
            if (r4 == 0) goto L_0x00a7
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ all -> 0x0198 }
            r0.<init>()     // Catch:{ all -> 0x0198 }
            r4 = 0
        L_0x0030:
            int r9 = r5 + -1
            java.lang.String r10 = "="
            java.lang.String r11 = "key"
            if (r4 >= r9) goto L_0x0057
            org.json.JSONObject r9 = r3.optJSONObject(r4)     // Catch:{ all -> 0x0198 }
            if (r9 == 0) goto L_0x0054
            java.lang.String r11 = r9.optString(r11)     // Catch:{ all -> 0x0198 }
            r0.append(r11)     // Catch:{ all -> 0x0198 }
            r0.append(r10)     // Catch:{ all -> 0x0198 }
            java.lang.Object r9 = r9.opt(r8)     // Catch:{ all -> 0x0198 }
            r0.append(r9)     // Catch:{ all -> 0x0198 }
            java.lang.String r9 = "&"
            r0.append(r9)     // Catch:{ all -> 0x0198 }
        L_0x0054:
            int r4 = r4 + 1
            goto L_0x0030
        L_0x0057:
            org.json.JSONObject r3 = r3.optJSONObject(r9)     // Catch:{ all -> 0x0198 }
            if (r3 == 0) goto L_0x006e
            java.lang.String r4 = r3.optString(r11)     // Catch:{ all -> 0x0198 }
            r0.append(r4)     // Catch:{ all -> 0x0198 }
            r0.append(r10)     // Catch:{ all -> 0x0198 }
            java.lang.Object r3 = r3.opt(r8)     // Catch:{ all -> 0x0198 }
            r0.append(r3)     // Catch:{ all -> 0x0198 }
        L_0x006e:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0198 }
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ all -> 0x0198 }
            android.content.Context r3 = r3.mo42895d()     // Catch:{ all -> 0x0198 }
            if (r3 == 0) goto L_0x0190
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0198 }
            if (r4 != 0) goto L_0x0190
            com.mbridge.msdk.foundation.same.report.d.a r4 = new com.mbridge.msdk.foundation.same.report.d.a     // Catch:{ Exception -> 0x009b }
            r4.<init>(r3)     // Catch:{ Exception -> 0x009b }
            com.mbridge.msdk.foundation.same.net.h.d r0 = com.mbridge.msdk.foundation.same.report.C6323d.m16026a((java.lang.String) r0, (android.content.Context) r3)     // Catch:{ Exception -> 0x009b }
            com.mbridge.msdk.foundation.same.net.g.d r3 = com.mbridge.msdk.foundation.same.net.p178g.C6280d.m15868c()     // Catch:{ Exception -> 0x009b }
            java.lang.String r3 = r3.f15565a     // Catch:{ Exception -> 0x009b }
            com.mbridge.msdk.mbsignalcommon.a.a$1 r5 = new com.mbridge.msdk.mbsignalcommon.a.a$1     // Catch:{ Exception -> 0x009b }
            r5.<init>()     // Catch:{ Exception -> 0x009b }
            r4.mo43867c(r6, r3, r0, r5)     // Catch:{ Exception -> 0x009b }
            goto L_0x0190
        L_0x009b:
            r0 = move-exception
            java.lang.String r3 = f16288c     // Catch:{ all -> 0x0198 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0198 }
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r3, r0)     // Catch:{ all -> 0x0198 }
            goto L_0x0190
        L_0x00a7:
            java.lang.String r4 = "reportMessageD"
            boolean r0 = r4.equalsIgnoreCase(r0)     // Catch:{ all -> 0x0198 }
            if (r0 == 0) goto L_0x0190
            java.lang.String r0 = ""
            if (r5 <= 0) goto L_0x00bf
            org.json.JSONObject r4 = r3.optJSONObject(r6)     // Catch:{ all -> 0x0198 }
            if (r4 == 0) goto L_0x00bf
            java.lang.String r4 = r4.getString(r8)     // Catch:{ all -> 0x0198 }
            r10 = r4
            goto L_0x00c0
        L_0x00bf:
            r10 = r0
        L_0x00c0:
            r4 = -1
            if (r5 <= r7) goto L_0x00cf
            org.json.JSONObject r6 = r3.optJSONObject(r7)     // Catch:{ all -> 0x0198 }
            if (r6 == 0) goto L_0x00cf
            int r6 = r6.getInt(r8)     // Catch:{ all -> 0x0198 }
            r11 = r6
            goto L_0x00d0
        L_0x00cf:
            r11 = -1
        L_0x00d0:
            r6 = 2
            if (r5 <= r6) goto L_0x00df
            org.json.JSONObject r6 = r3.optJSONObject(r6)     // Catch:{ all -> 0x0198 }
            if (r6 == 0) goto L_0x00df
            int r6 = r6.getInt(r8)     // Catch:{ all -> 0x0198 }
            r12 = r6
            goto L_0x00e0
        L_0x00df:
            r12 = -1
        L_0x00e0:
            r6 = 3
            if (r5 <= r6) goto L_0x00ef
            org.json.JSONObject r6 = r3.optJSONObject(r6)     // Catch:{ all -> 0x0198 }
            if (r6 == 0) goto L_0x00ef
            int r6 = r6.getInt(r8)     // Catch:{ all -> 0x0198 }
            r13 = r6
            goto L_0x00f0
        L_0x00ef:
            r13 = -1
        L_0x00f0:
            r6 = 4
            if (r5 <= r6) goto L_0x00ff
            org.json.JSONObject r6 = r3.optJSONObject(r6)     // Catch:{ all -> 0x0198 }
            if (r6 == 0) goto L_0x00ff
            int r6 = r6.getInt(r8)     // Catch:{ all -> 0x0198 }
            r14 = r6
            goto L_0x0100
        L_0x00ff:
            r14 = -1
        L_0x0100:
            r6 = 5
            if (r5 <= r6) goto L_0x010f
            org.json.JSONObject r6 = r3.optJSONObject(r6)     // Catch:{ all -> 0x0198 }
            if (r6 == 0) goto L_0x010f
            java.lang.String r6 = r6.getString(r8)     // Catch:{ all -> 0x0198 }
            r15 = r6
            goto L_0x0110
        L_0x010f:
            r15 = r0
        L_0x0110:
            r6 = 6
            if (r5 <= r6) goto L_0x0120
            org.json.JSONObject r6 = r3.optJSONObject(r6)     // Catch:{ all -> 0x0198 }
            if (r6 == 0) goto L_0x0120
            java.lang.String r6 = r6.getString(r8)     // Catch:{ all -> 0x0198 }
            r16 = r6
            goto L_0x0122
        L_0x0120:
            r16 = r0
        L_0x0122:
            r6 = 7
            if (r5 <= r6) goto L_0x0132
            org.json.JSONObject r6 = r3.optJSONObject(r6)     // Catch:{ all -> 0x0198 }
            if (r6 == 0) goto L_0x0132
            int r6 = r6.getInt(r8)     // Catch:{ all -> 0x0198 }
            r17 = r6
            goto L_0x0134
        L_0x0132:
            r17 = -1
        L_0x0134:
            r6 = 8
            if (r5 <= r6) goto L_0x0145
            org.json.JSONObject r6 = r3.optJSONObject(r6)     // Catch:{ all -> 0x0198 }
            if (r6 == 0) goto L_0x0145
            java.lang.String r6 = r6.getString(r8)     // Catch:{ all -> 0x0198 }
            r18 = r6
            goto L_0x0147
        L_0x0145:
            r18 = r0
        L_0x0147:
            r6 = 9
            if (r5 <= r6) goto L_0x0158
            org.json.JSONObject r6 = r3.optJSONObject(r6)     // Catch:{ all -> 0x0198 }
            if (r6 == 0) goto L_0x0158
            int r4 = r6.getInt(r8)     // Catch:{ all -> 0x0198 }
            r19 = r4
            goto L_0x015a
        L_0x0158:
            r19 = -1
        L_0x015a:
            r4 = 10
            if (r5 <= r4) goto L_0x0168
            org.json.JSONObject r3 = r3.optJSONObject(r4)     // Catch:{ all -> 0x0198 }
            if (r3 == 0) goto L_0x0168
            java.lang.String r0 = r3.getString(r8)     // Catch:{ all -> 0x0198 }
        L_0x0168:
            r20 = r0
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ all -> 0x0186 }
            android.content.Context r0 = r0.mo42895d()     // Catch:{ all -> 0x0186 }
            if (r0 == 0) goto L_0x0190
            com.mbridge.msdk.foundation.entity.m r3 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ all -> 0x0186 }
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0186 }
            com.mbridge.msdk.foundation.db.f r0 = com.mbridge.msdk.foundation.p164db.C6148f.m15420a((android.content.Context) r0)     // Catch:{ all -> 0x0186 }
            com.mbridge.msdk.foundation.db.p r0 = com.mbridge.msdk.foundation.p164db.C6158p.m15475a((com.mbridge.msdk.foundation.p164db.C6146e) r0)     // Catch:{ all -> 0x0186 }
            r0.mo43039a((com.mbridge.msdk.foundation.entity.C6203m) r3)     // Catch:{ all -> 0x0186 }
            goto L_0x0190
        L_0x0186:
            r0 = move-exception
            java.lang.String r3 = f16288c     // Catch:{ all -> 0x0198 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0198 }
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r3, r0)     // Catch:{ all -> 0x0198 }
        L_0x0190:
            int r0 = r1.f16289a     // Catch:{ all -> 0x0198 }
            java.lang.String r3 = "called reporter success"
            r1.m16771a(r0, r3, r2)     // Catch:{ all -> 0x0198 }
            goto L_0x01bc
        L_0x0198:
            r0 = move-exception
            java.lang.String r3 = f16288c
            java.lang.String r4 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r3, r4)
            int r3 = r1.f16290b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "exception: "
            r4.append(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.m16771a(r3, r0, r2)
        L_0x01bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbsignalcommon.p205a.C6528a.mo44404a(java.lang.Object, java.lang.String, org.json.JSONArray, int):void");
    }

    /* renamed from: a */
    private void m16771a(int i, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put("message", str);
            C6563g.m16891a().mo44523a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e) {
            C6361q.m16154a(f16288c, e.getMessage());
        } catch (Throwable th) {
            C6361q.m16154a(f16288c, th.getMessage());
        }
    }
}
