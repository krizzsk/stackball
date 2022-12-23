package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import com.yandex.metrica.PreloadInfo;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Pe */
public class C10640Pe {

    /* renamed from: a */
    private C10459Le f25424a;

    public C10640Pe(PreloadInfo preloadInfo, C10380Im im, boolean z) {
        if (preloadInfo == null) {
            return;
        }
        if (!TextUtils.isEmpty(preloadInfo.getTrackingId())) {
            this.f25424a = new C10459Le(preloadInfo.getTrackingId(), new JSONObject(preloadInfo.getAdditionalParams()), true, z, C10202E0.APP);
        } else if (im.mo64227c()) {
            im.mo64219a("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(20:2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0032 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo61925a(org.json.JSONObject r6) {
        /*
            r5 = this;
            com.yandex.metrica.impl.ob.Le r0 = r5.f25424a
            if (r0 == 0) goto L_0x0035
            java.lang.String r1 = "preloadInfo"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0035 }
            r2.<init>()     // Catch:{ all -> 0x0035 }
            java.lang.String r3 = "trackingId"
            java.lang.String r4 = r0.f25109a     // Catch:{ all -> 0x0032 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "additionalParams"
            org.json.JSONObject r4 = r0.f25110b     // Catch:{ all -> 0x0032 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "wasSet"
            boolean r4 = r0.f25111c     // Catch:{ all -> 0x0032 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "autoTracking"
            boolean r4 = r0.f25112d     // Catch:{ all -> 0x0032 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "source"
            com.yandex.metrica.impl.ob.E0 r0 = r0.f25113e     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = r0.mo61214a()     // Catch:{ all -> 0x0032 }
            r2.put(r3, r0)     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r6.put(r1, r2)     // Catch:{ all -> 0x0035 }
        L_0x0035:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10640Pe.mo61925a(org.json.JSONObject):org.json.JSONObject");
    }
}
