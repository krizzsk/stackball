package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class pg0 {

    /* renamed from: a */
    private final Context f38608a;

    /* renamed from: b */
    private final ve0 f38609b = new ve0();

    public pg0(Context context) {
        this.f38608a = context.getApplicationContext();
    }

    /* renamed from: a */
    public og0 mo69367a(C12563b1 b1Var, List<lj1> list) {
        InstreamAdBreakPosition a;
        String c = b1Var.mo65934c();
        if (c == null || (a = this.f38609b.mo70478a(b1Var.mo65937f())) == null) {
            return null;
        }
        List<ck1<T>> a2 = new fk1(this.f38608a, new tg0(a)).mo67025a(list);
        ArrayList arrayList = (ArrayList) a2;
        if (arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((VideoAd) ((ck1) it.next()).mo66323c());
        }
        return new og0(a2, arrayList2, c, b1Var, a);
    }
}
