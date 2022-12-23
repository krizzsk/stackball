package com.inmobi.media;

import com.inmobi.ads.viewsv2.NativeRecyclerViewAdapter;

/* renamed from: com.inmobi.media.em */
/* compiled from: NativeScrollableDataSourceFactory */
final class C5180em {
    /* renamed from: a */
    public static C5179el m11854a(byte b, C5016bj bjVar, C5162eh ehVar) {
        if (b == 0) {
            return new C5156ef(bjVar, ehVar);
        }
        if (b != 1) {
            return null;
        }
        try {
            return new NativeRecyclerViewAdapter(bjVar, ehVar);
        } catch (NoClassDefFoundError e) {
            C5327gw.m12263a((byte) 1, "InMobi", "Error rendering ad! RecyclerView not found. Please check if the recyclerview support library was included");
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return null;
        }
    }
}
