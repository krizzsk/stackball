package com.p243my.target;

import com.p243my.target.common.models.AudioData;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.my.target.s2 */
public class C7647s2 extends C7618q2 {

    /* renamed from: b */
    public final HashMap<String, C7686u2<AudioData>> f19313b;

    public C7647s2() {
        HashMap<String, C7686u2<AudioData>> hashMap = new HashMap<>();
        this.f19313b = hashMap;
        hashMap.put(InstreamAdBreakType.PREROLL, C7686u2.m20549a(InstreamAdBreakType.PREROLL));
        hashMap.put(InstreamAdBreakType.PAUSEROLL, C7686u2.m20549a(InstreamAdBreakType.PAUSEROLL));
        hashMap.put(InstreamAdBreakType.MIDROLL, C7686u2.m20549a(InstreamAdBreakType.MIDROLL));
        hashMap.put("postroll", C7686u2.m20549a("postroll"));
    }

    /* renamed from: e */
    public static C7647s2 m20304e() {
        return new C7647s2();
    }

    /* renamed from: a */
    public int mo51416a() {
        int i = 0;
        for (C7686u2<AudioData> a : this.f19313b.values()) {
            i += a.mo51416a();
        }
        return i;
    }

    /* renamed from: a */
    public C7686u2<AudioData> mo51479a(String str) {
        return this.f19313b.get(str);
    }

    /* renamed from: c */
    public ArrayList<C7686u2<AudioData>> mo51480c() {
        return new ArrayList<>(this.f19313b.values());
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo51481d() {
        /*
            r3 = this;
            java.util.HashMap<java.lang.String, com.my.target.u2<com.my.target.common.models.AudioData>> r0 = r3.f19313b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7647s2.mo51481d():boolean");
    }
}
