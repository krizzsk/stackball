package com.yandex.metrica.impl.p265ob;

import com.tapjoy.TJAdUnitConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ij */
public class C11354ij {
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(79:8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|(1:85)(1:86)|87|89)(1:91)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0010 */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a A[Catch:{ all -> 0x016d }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo63051a(com.yandex.metrica.impl.p265ob.C11885vj r5, com.yandex.metrica.impl.p265ob.C11993ym.C11994a r6) {
        /*
            r4 = this;
            com.yandex.metrica.impl.ob.kg$i r0 = new com.yandex.metrica.impl.ob.kg$i
            r0.<init>()
            java.lang.String r1 = "features"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x016d }
            r2.<init>()     // Catch:{ all -> 0x016d }
            java.lang.Object r2 = r6.get(r1)     // Catch:{ all -> 0x0010 }
        L_0x0010:
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch:{ all -> 0x016d }
            java.lang.String r6 = "list"
            org.json.JSONObject r6 = r2.optJSONObject(r6)     // Catch:{ all -> 0x016d }
            if (r6 == 0) goto L_0x016d
            com.yandex.metrica.impl.ob.si$a r1 = new com.yandex.metrica.impl.ob.si$a     // Catch:{ all -> 0x016d }
            r1.<init>()     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "easy_collecting"
            boolean r3 = r0.f27469b     // Catch:{ all -> 0x016d }
            boolean r2 = r4.m29236a(r6, r2, r3)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si$a r1 = r1.mo63665d((boolean) r2)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "egress"
            boolean r3 = r0.f27492y     // Catch:{ all -> 0x016d }
            boolean r2 = r4.m29236a(r6, r2, r3)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si$a r1 = r1.mo63666e((boolean) r2)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "package_info"
            boolean r3 = r0.f27470c     // Catch:{ all -> 0x016d }
            boolean r2 = r4.m29236a(r6, r2, r3)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si$a r1 = r1.mo63674m((boolean) r2)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "permissions_collecting"
            boolean r3 = r0.f27471d     // Catch:{ all -> 0x016d }
            boolean r2 = r4.m29236a(r6, r2, r3)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si$a r1 = r1.mo63675n((boolean) r2)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "features_collecting"
            boolean r3 = r0.f27472e     // Catch:{ all -> 0x016d }
            boolean r2 = r4.m29236a(r6, r2, r3)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si$a r1 = r1.mo63667f((boolean) r2)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "sdk_list"
            boolean r3 = r0.f27478k     // Catch:{ all -> 0x016d }
            boolean r2 = r4.m29236a(r6, r2, r3)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si$a r1 = r1.mo63676o((boolean) r2)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "google_aid"
            boolean r3 = r0.f27473f     // Catch:{ all -> 0x016d }
            boolean r2 = r4.m29236a(r6, r2, r3)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si$a r1 = r1.mo63668g((boolean) r2)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "throttling"
            boolean r3 = r0.f27487t     // Catch:{ all -> 0x016d }
            boolean r2 = r4.m29236a(r6, r2, r3)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si$a r1 = r1.mo63678q((boolean) r2)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "wifi_around"
            boolean r3 = r0.f27474g     // Catch:{ all -> 0x016d }
            boolean r2 = r4.m29236a(r6, r2, r3)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si$a r1 = r1.mo63684w((boolean) r2)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "wifi_connected"
            boolean r3 = r0.f27475h     // Catch:{ all -> 0x016d }
            boolean r2 = r4.m29236a(r6, r2, r3)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si$a r1 = r1.mo63685x((boolean) r2)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "cells_around"
            boolean r3 = r0.f27476i     // Catch:{ all -> 0x016d }
            boolean r2 = r4.m29236a(r6, r2, r3)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si$a r1 = r1.mo63664c((boolean) r2)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "sim_info"
            boolean r3 = r0.f27477j     // Catch:{ all -> 0x016d }
            boolean r2 = r4.m29236a(r6, r2, r3)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si$a r1 = r1.mo63677p((boolean) r2)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "identity_light_collecting"
            boolean r3 = r0.f27479l     // Catch:{ all -> 0x016d }
            boolean r2 = r4.m29236a(r6, r2, r3)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si$a r1 = r1.mo63671j((boolean) r2)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "location_collecting"
            boolean r3 = r0.f27480m     // Catch:{ all -> 0x016d }
            boolean r2 = r4.m29236a(r6, r2, r3)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si$a r1 = r1.mo63673l((boolean) r2)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "lbs_collecting"
            boolean r3 = r0.f27481n     // Catch:{ all -> 0x016d }
            boolean r2 = r4.m29236a(r6, r2, r3)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si$a r1 = r1.mo63672k((boolean) r2)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "gpl_collecting"
            boolean r3 = r0.f27483p     // Catch:{ all -> 0x016d }
            boolean r2 = r4.m29236a(r6, r2, r3)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si$a r1 = r1.mo63669h((boolean) r2)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "wakeup"
            boolean r3 = r0.f27482o     // Catch:{ all -> 0x016d }
            boolean r2 = r4.m29236a(r6, r2, r3)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si$a r1 = r1.mo63683v((boolean) r2)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "ui_parsing"
            boolean r3 = r0.f27484q     // Catch:{ all -> 0x016d }
            boolean r2 = r4.m29236a(r6, r2, r3)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si$a r1 = r1.mo63681t((boolean) r2)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "ui_event_sending"
            boolean r3 = r0.f27485r     // Catch:{ all -> 0x016d }
            boolean r2 = r4.m29236a(r6, r2, r3)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si$a r1 = r1.mo63680s((boolean) r2)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "ui_raw_event_sending"
            boolean r3 = r0.f27485r     // Catch:{ all -> 0x016d }
            boolean r2 = r4.m29236a(r6, r2, r3)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si$a r1 = r1.mo63682u((boolean) r2)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "ui_collecting_for_bridge"
            boolean r3 = r0.f27486s     // Catch:{ all -> 0x016d }
            boolean r2 = r4.m29236a(r6, r2, r3)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si$a r1 = r1.mo63679r((boolean) r2)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "cell_additional_info"
            boolean r3 = r0.f27488u     // Catch:{ all -> 0x016d }
            boolean r2 = r4.m29236a(r6, r2, r3)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si$a r1 = r1.mo63661a((boolean) r2)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "cell_additional_info_connected_only"
            boolean r3 = r0.f27489v     // Catch:{ all -> 0x016d }
            boolean r2 = r4.m29236a(r6, r2, r3)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si$a r1 = r1.mo63663b((boolean) r2)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "huawei_oaid"
            boolean r0 = r0.f27491x     // Catch:{ all -> 0x016d }
            boolean r0 = r4.m29236a(r6, r2, r0)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si$a r0 = r1.mo63670i((boolean) r0)     // Catch:{ all -> 0x016d }
            java.lang.String r1 = "ssl_pinning"
            boolean r2 = r6.has(r1)     // Catch:{ all -> 0x016d }
            if (r2 == 0) goto L_0x0156
            org.json.JSONObject r1 = r6.getJSONObject(r1)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "enabled"
            boolean r1 = r1.getBoolean(r2)     // Catch:{ all -> 0x016d }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x016d }
            goto L_0x0157
        L_0x0156:
            r1 = 0
        L_0x0157:
            com.yandex.metrica.impl.ob.si$a r0 = r0.mo63660a((java.lang.Boolean) r1)     // Catch:{ all -> 0x016d }
            com.yandex.metrica.impl.ob.si r1 = new com.yandex.metrica.impl.ob.si     // Catch:{ all -> 0x016d }
            r1.<init>(r0)     // Catch:{ all -> 0x016d }
            java.lang.String r0 = "socket"
            r2 = 0
            boolean r6 = r4.m29236a(r6, r0, r2)     // Catch:{ all -> 0x016d }
            r5.mo63950a((boolean) r6)     // Catch:{ all -> 0x016d }
            r5.mo63941a((com.yandex.metrica.impl.p265ob.C11761si) r1)     // Catch:{ all -> 0x016d }
        L_0x016d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11354ij.mo63051a(com.yandex.metrica.impl.ob.vj, com.yandex.metrica.impl.ob.ym$a):void");
    }

    /* renamed from: a */
    private boolean m29236a(JSONObject jSONObject, String str, boolean z) throws JSONException {
        Boolean valueOf = jSONObject.has(str) ? Boolean.valueOf(jSONObject.getJSONObject(str).getBoolean(TJAdUnitConstants.String.ENABLED)) : null;
        Boolean valueOf2 = Boolean.valueOf(z);
        if (valueOf == null) {
            valueOf = valueOf2;
        }
        return valueOf.booleanValue();
    }
}
