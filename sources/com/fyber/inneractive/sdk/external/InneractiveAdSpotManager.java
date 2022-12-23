package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.p037d.C2840i;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InneractiveAdSpotManager {

    /* renamed from: a */
    Map<String, InneractiveAdSpot> f6883a;

    /* renamed from: com.fyber.inneractive.sdk.external.InneractiveAdSpotManager$a */
    private static class C2907a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static InneractiveAdSpotManager f6884a = new InneractiveAdSpotManager((byte) 0);
    }

    /* synthetic */ InneractiveAdSpotManager(byte b) {
        this();
    }

    private InneractiveAdSpotManager() {
        this.f6883a = new ConcurrentHashMap();
    }

    public static InneractiveAdSpotManager get() {
        return C2907a.f6884a;
    }

    public InneractiveAdSpot createSpot() {
        C2840i iVar = new C2840i();
        this.f6883a.put(iVar.getLocalUniqueId(), iVar);
        return iVar;
    }

    public void bindSpot(InneractiveAdSpot inneractiveAdSpot) {
        this.f6883a.put(inneractiveAdSpot.getLocalUniqueId(), inneractiveAdSpot);
    }

    public void removeSpot(InneractiveAdSpot inneractiveAdSpot) {
        Map<String, InneractiveAdSpot> map = this.f6883a;
        if (map != null) {
            map.remove(inneractiveAdSpot.getLocalUniqueId());
        }
    }

    public static void destroy() {
        Map<String, InneractiveAdSpot> map = get().f6883a;
        for (String str : map.keySet()) {
            InneractiveAdSpot inneractiveAdSpot = map.get(str);
            if (inneractiveAdSpot != null) {
                inneractiveAdSpot.destroy();
            }
        }
        map.clear();
    }

    public InneractiveAdSpot getSpot(String str) {
        return this.f6883a.get(str);
    }
}
