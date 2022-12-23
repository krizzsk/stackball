package com.flurry.sdk;

import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.be */
public class C2403be implements C2587dw<C2333ae> {

    /* renamed from: a */
    private static final String f5551a = C2403be.class.getSimpleName();

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a5 A[SYNTHETIC, Splitter:B:15:0x00a5] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a9 A[Catch:{ JSONException -> 0x017b, all -> 0x0179 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00bf A[Catch:{ JSONException -> 0x017b, all -> 0x0179 }, LOOP:0: B:19:0x00b9->B:21:0x00bf, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0129 A[SYNTHETIC, Splitter:B:29:0x0129] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x012d A[Catch:{ JSONException -> 0x017b, all -> 0x0179 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x014a A[Catch:{ JSONException -> 0x017b, all -> 0x0179 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo17563a(java.io.OutputStream r10, java.lang.Object r11) throws java.io.IOException {
        /*
            r9 = this;
            com.flurry.sdk.ae r11 = (com.flurry.sdk.C2333ae) r11
            if (r10 == 0) goto L_0x0188
            if (r11 != 0) goto L_0x0008
            goto L_0x0188
        L_0x0008:
            com.flurry.sdk.be$1 r0 = new com.flurry.sdk.be$1
            r0.<init>(r10)
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            java.lang.String r1 = "project_key"
            java.lang.String r2 = r11.f5349a     // Catch:{ JSONException -> 0x017b }
            m5170a(r10, r1, r2)     // Catch:{ JSONException -> 0x017b }
            java.lang.String r1 = "bundle_id"
            java.lang.String r2 = r11.f5350b     // Catch:{ JSONException -> 0x017b }
            m5170a(r10, r1, r2)     // Catch:{ JSONException -> 0x017b }
            java.lang.String r1 = "app_version"
            java.lang.String r2 = r11.f5351c     // Catch:{ JSONException -> 0x017b }
            m5170a(r10, r1, r2)     // Catch:{ JSONException -> 0x017b }
            java.lang.String r1 = "sdk_version"
            int r2 = r11.f5352d     // Catch:{ JSONException -> 0x017b }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x017b }
            java.lang.String r1 = "platform"
            int r2 = r11.f5353e     // Catch:{ JSONException -> 0x017b }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x017b }
            java.lang.String r1 = "platform_version"
            java.lang.String r2 = r11.f5354f     // Catch:{ JSONException -> 0x017b }
            m5170a(r10, r1, r2)     // Catch:{ JSONException -> 0x017b }
            java.lang.String r1 = "limit_ad_tracking"
            boolean r2 = r11.f5355g     // Catch:{ JSONException -> 0x017b }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x017b }
            com.flurry.sdk.ah r1 = r11.f5356h     // Catch:{ JSONException -> 0x017b }
            java.lang.String r2 = "id"
            r3 = 0
            if (r1 == 0) goto L_0x00a0
            com.flurry.sdk.ah r1 = r11.f5356h     // Catch:{ JSONException -> 0x017b }
            com.flurry.sdk.ab r1 = r1.f5368a     // Catch:{ JSONException -> 0x017b }
            if (r1 == 0) goto L_0x00a0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x017b }
            r1.<init>()     // Catch:{ JSONException -> 0x017b }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x017b }
            r4.<init>()     // Catch:{ JSONException -> 0x017b }
            java.lang.String r5 = "model"
            com.flurry.sdk.ah r6 = r11.f5356h     // Catch:{ JSONException -> 0x017b }
            com.flurry.sdk.ab r6 = r6.f5368a     // Catch:{ JSONException -> 0x017b }
            java.lang.String r6 = r6.f5328a     // Catch:{ JSONException -> 0x017b }
            m5170a(r4, r5, r6)     // Catch:{ JSONException -> 0x017b }
            java.lang.String r5 = "brand"
            com.flurry.sdk.ah r6 = r11.f5356h     // Catch:{ JSONException -> 0x017b }
            com.flurry.sdk.ab r6 = r6.f5368a     // Catch:{ JSONException -> 0x017b }
            java.lang.String r6 = r6.f5329b     // Catch:{ JSONException -> 0x017b }
            m5170a(r4, r5, r6)     // Catch:{ JSONException -> 0x017b }
            com.flurry.sdk.ah r5 = r11.f5356h     // Catch:{ JSONException -> 0x017b }
            com.flurry.sdk.ab r5 = r5.f5368a     // Catch:{ JSONException -> 0x017b }
            java.lang.String r5 = r5.f5330c     // Catch:{ JSONException -> 0x017b }
            m5170a(r4, r2, r5)     // Catch:{ JSONException -> 0x017b }
            java.lang.String r5 = "device"
            com.flurry.sdk.ah r6 = r11.f5356h     // Catch:{ JSONException -> 0x017b }
            com.flurry.sdk.ab r6 = r6.f5368a     // Catch:{ JSONException -> 0x017b }
            java.lang.String r6 = r6.f5331d     // Catch:{ JSONException -> 0x017b }
            m5170a(r4, r5, r6)     // Catch:{ JSONException -> 0x017b }
            java.lang.String r5 = "product"
            com.flurry.sdk.ah r6 = r11.f5356h     // Catch:{ JSONException -> 0x017b }
            com.flurry.sdk.ab r6 = r6.f5368a     // Catch:{ JSONException -> 0x017b }
            java.lang.String r6 = r6.f5332e     // Catch:{ JSONException -> 0x017b }
            m5170a(r4, r5, r6)     // Catch:{ JSONException -> 0x017b }
            java.lang.String r5 = "version_release"
            com.flurry.sdk.ah r6 = r11.f5356h     // Catch:{ JSONException -> 0x017b }
            com.flurry.sdk.ab r6 = r6.f5368a     // Catch:{ JSONException -> 0x017b }
            java.lang.String r6 = r6.f5333f     // Catch:{ JSONException -> 0x017b }
            m5170a(r4, r5, r6)     // Catch:{ JSONException -> 0x017b }
            java.lang.String r5 = "com.flurry.proton.generated.avro.v2.AndroidTags"
            r1.put(r5, r4)     // Catch:{ JSONException -> 0x017b }
            goto L_0x00a1
        L_0x00a0:
            r1 = r3
        L_0x00a1:
            java.lang.String r4 = "device_tags"
            if (r1 == 0) goto L_0x00a9
            r10.put(r4, r1)     // Catch:{ JSONException -> 0x017b }
            goto L_0x00ae
        L_0x00a9:
            java.lang.Object r1 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x017b }
            r10.put(r4, r1)     // Catch:{ JSONException -> 0x017b }
        L_0x00ae:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x017b }
            r1.<init>()     // Catch:{ JSONException -> 0x017b }
            java.util.List<com.flurry.sdk.ag> r4 = r11.f5357i     // Catch:{ JSONException -> 0x017b }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ JSONException -> 0x017b }
        L_0x00b9:
            boolean r5 = r4.hasNext()     // Catch:{ JSONException -> 0x017b }
            if (r5 == 0) goto L_0x00da
            java.lang.Object r5 = r4.next()     // Catch:{ JSONException -> 0x017b }
            com.flurry.sdk.ag r5 = (com.flurry.sdk.C2335ag) r5     // Catch:{ JSONException -> 0x017b }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x017b }
            r6.<init>()     // Catch:{ JSONException -> 0x017b }
            java.lang.String r7 = "type"
            int r8 = r5.f5366a     // Catch:{ JSONException -> 0x017b }
            r6.put(r7, r8)     // Catch:{ JSONException -> 0x017b }
            java.lang.String r5 = r5.f5367b     // Catch:{ JSONException -> 0x017b }
            m5170a(r6, r2, r5)     // Catch:{ JSONException -> 0x017b }
            r1.put(r6)     // Catch:{ JSONException -> 0x017b }
            goto L_0x00b9
        L_0x00da:
            java.lang.String r2 = "device_ids"
            r10.put(r2, r1)     // Catch:{ JSONException -> 0x017b }
            com.flurry.sdk.al r1 = r11.f5358j     // Catch:{ JSONException -> 0x017b }
            if (r1 == 0) goto L_0x0125
            com.flurry.sdk.al r1 = r11.f5358j     // Catch:{ JSONException -> 0x017b }
            com.flurry.sdk.ak r1 = r1.f5376a     // Catch:{ JSONException -> 0x017b }
            if (r1 == 0) goto L_0x0125
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x017b }
            r3.<init>()     // Catch:{ JSONException -> 0x017b }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x017b }
            r1.<init>()     // Catch:{ JSONException -> 0x017b }
            java.lang.String r2 = "latitude"
            com.flurry.sdk.al r4 = r11.f5358j     // Catch:{ JSONException -> 0x017b }
            com.flurry.sdk.ak r4 = r4.f5376a     // Catch:{ JSONException -> 0x017b }
            double r4 = r4.f5373a     // Catch:{ JSONException -> 0x017b }
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch:{ JSONException -> 0x017b }
            r1.putOpt(r2, r4)     // Catch:{ JSONException -> 0x017b }
            java.lang.String r2 = "longitude"
            com.flurry.sdk.al r4 = r11.f5358j     // Catch:{ JSONException -> 0x017b }
            com.flurry.sdk.ak r4 = r4.f5376a     // Catch:{ JSONException -> 0x017b }
            double r4 = r4.f5374b     // Catch:{ JSONException -> 0x017b }
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch:{ JSONException -> 0x017b }
            r1.putOpt(r2, r4)     // Catch:{ JSONException -> 0x017b }
            java.lang.String r2 = "accuracy"
            com.flurry.sdk.al r4 = r11.f5358j     // Catch:{ JSONException -> 0x017b }
            com.flurry.sdk.ak r4 = r4.f5376a     // Catch:{ JSONException -> 0x017b }
            float r4 = r4.f5375c     // Catch:{ JSONException -> 0x017b }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ JSONException -> 0x017b }
            r1.putOpt(r2, r4)     // Catch:{ JSONException -> 0x017b }
            java.lang.String r2 = "com.flurry.proton.generated.avro.v2.Geolocation"
            r3.put(r2, r1)     // Catch:{ JSONException -> 0x017b }
        L_0x0125:
            java.lang.String r1 = "geo"
            if (r3 == 0) goto L_0x012d
            r10.put(r1, r3)     // Catch:{ JSONException -> 0x017b }
            goto L_0x0132
        L_0x012d:
            java.lang.Object r2 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x017b }
            r10.put(r1, r2)     // Catch:{ JSONException -> 0x017b }
        L_0x0132:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x017b }
            r1.<init>()     // Catch:{ JSONException -> 0x017b }
            com.flurry.sdk.ao r2 = r11.f5359k     // Catch:{ JSONException -> 0x017b }
            java.lang.String r3 = "publisher_user_id"
            if (r2 == 0) goto L_0x014a
            java.lang.String r2 = "string"
            com.flurry.sdk.ao r11 = r11.f5359k     // Catch:{ JSONException -> 0x017b }
            java.lang.String r11 = r11.f5387a     // Catch:{ JSONException -> 0x017b }
            m5170a(r1, r2, r11)     // Catch:{ JSONException -> 0x017b }
            r10.put(r3, r1)     // Catch:{ JSONException -> 0x017b }
            goto L_0x014f
        L_0x014a:
            java.lang.Object r11 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x017b }
            r10.put(r3, r11)     // Catch:{ JSONException -> 0x017b }
        L_0x014f:
            r11 = 5
            java.lang.String r1 = f5551a     // Catch:{ JSONException -> 0x017b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x017b }
            java.lang.String r3 = "Proton Request String: "
            r2.<init>(r3)     // Catch:{ JSONException -> 0x017b }
            java.lang.String r3 = r10.toString()     // Catch:{ JSONException -> 0x017b }
            r2.append(r3)     // Catch:{ JSONException -> 0x017b }
            java.lang.String r2 = r2.toString()     // Catch:{ JSONException -> 0x017b }
            com.flurry.sdk.C2530db.m5474a((int) r11, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ JSONException -> 0x017b }
            java.lang.String r10 = r10.toString()     // Catch:{ JSONException -> 0x017b }
            byte[] r10 = r10.getBytes()     // Catch:{ JSONException -> 0x017b }
            r0.write(r10)     // Catch:{ JSONException -> 0x017b }
            r0.flush()     // Catch:{ JSONException -> 0x017b }
            r0.close()
            return
        L_0x0179:
            r10 = move-exception
            goto L_0x0184
        L_0x017b:
            r10 = move-exception
            java.io.IOException r11 = new java.io.IOException     // Catch:{ all -> 0x0179 }
            java.lang.String r1 = "Invalid Json"
            r11.<init>(r1, r10)     // Catch:{ all -> 0x0179 }
            throw r11     // Catch:{ all -> 0x0179 }
        L_0x0184:
            r0.close()
            throw r10
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2403be.mo17563a(java.io.OutputStream, java.lang.Object):void");
    }

    /* renamed from: a */
    private static void m5170a(JSONObject jSONObject, String str, String str2) throws IOException, JSONException {
        if (str2 != null) {
            jSONObject.put(str, str2);
        } else {
            jSONObject.put(str, JSONObject.NULL);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo17562a(InputStream inputStream) throws IOException {
        throw new IOException("Deserialize not supported for request");
    }
}
