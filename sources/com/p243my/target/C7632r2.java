package com.p243my.target;

import com.p243my.target.common.models.VideoData;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.my.target.r2 */
public class C7632r2 extends C7618q2 {

    /* renamed from: b */
    public final HashMap<String, C7686u2<VideoData>> f19292b;

    public C7632r2() {
        HashMap<String, C7686u2<VideoData>> hashMap = new HashMap<>();
        this.f19292b = hashMap;
        hashMap.put(InstreamAdBreakType.PREROLL, C7686u2.m20551c(InstreamAdBreakType.PREROLL));
        hashMap.put(InstreamAdBreakType.PAUSEROLL, C7686u2.m20551c(InstreamAdBreakType.PAUSEROLL));
        hashMap.put(InstreamAdBreakType.MIDROLL, C7686u2.m20551c(InstreamAdBreakType.MIDROLL));
        hashMap.put("postroll", C7686u2.m20551c("postroll"));
    }

    /* renamed from: e */
    public static C7632r2 m20230e() {
        return new C7632r2();
    }

    /* renamed from: a */
    public int mo51416a() {
        int i = 0;
        for (C7686u2<VideoData> a : this.f19292b.values()) {
            i += a.mo51416a();
        }
        return i;
    }

    /* renamed from: a */
    public C7686u2<VideoData> mo51445a(String str) {
        return this.f19292b.get(str);
    }

    /* renamed from: c */
    public ArrayList<C7686u2<VideoData>> mo51446c() {
        return new ArrayList<>(this.f19292b.values());
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo51447d() {
        /*
            r3 = this;
            java.util.HashMap<java.lang.String, com.my.target.u2<com.my.target.common.models.VideoData>> r0 = r3.f19292b
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0024
            java.lang.Object r1 = r0.next()
            com.my.target.u2 r1 = (com.p243my.target.C7686u2) r1
            int r2 = r1.mo51416a()
            if (r2 > 0) goto L_0x0022
            boolean r1 = r1.mo51663i()
            if (r1 == 0) goto L_0x000a
        L_0x0022:
            r0 = 1
            return r0
        L_0x0024:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7632r2.mo51447d():boolean");
    }
}
