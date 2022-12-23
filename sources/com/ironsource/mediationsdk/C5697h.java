package com.ironsource.mediationsdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.mediationsdk.h */
public final class C5697h {

    /* renamed from: a */
    private ConcurrentHashMap<String, ArrayList<C5698a>> f13579a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private int f13580b;

    /* renamed from: com.ironsource.mediationsdk.h$a */
    public enum C5698a {
        ISAuctionPerformanceDidntAttemptToLoad,
        ISAuctionPerformanceFailedToLoad,
        ISAuctionPerformanceLoadedSuccessfully,
        ISAuctionPerformanceFailedToShow,
        ISAuctionPerformanceShowedSuccessfully,
        ISAuctionPerformanceNotPartOfWaterfall
    }

    public C5697h(List<String> list, int i) {
        this.f13580b = i;
        for (String put : list) {
            ArrayList arrayList = new ArrayList();
            this.f13579a.put(put, arrayList);
        }
    }

    /* renamed from: a */
    public final String mo41854a(String str) {
        ArrayList arrayList = this.f13579a.get(str);
        String str2 = "";
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            StringBuilder sb = new StringBuilder();
            while (true) {
                sb.append(str2);
                sb.append(((C5698a) it.next()).ordinal());
                str2 = sb.toString();
                if (!it.hasNext()) {
                    break;
                }
                str2 = str2 + ",";
                sb = new StringBuilder();
            }
        }
        return str2;
    }

    /* renamed from: a */
    public final void mo41855a(ConcurrentHashMap<String, C5698a> concurrentHashMap) {
        if (this.f13580b != 0) {
            for (String next : this.f13579a.keySet()) {
                C5698a aVar = C5698a.ISAuctionPerformanceNotPartOfWaterfall;
                if (concurrentHashMap.containsKey(next)) {
                    aVar = concurrentHashMap.get(next);
                }
                ArrayList arrayList = this.f13579a.get(next);
                if (this.f13580b != -1 && arrayList.size() == this.f13580b) {
                    arrayList.remove(0);
                }
                arrayList.add(aVar);
            }
        }
    }
}
