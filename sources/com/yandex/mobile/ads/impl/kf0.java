package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.C15419e;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class kf0 {

    /* renamed from: a */
    private final C15419e f36116a;

    /* renamed from: com.yandex.mobile.ads.impl.kf0$b */
    private static class C13705b implements Comparator<g01> {
        private C13705b() {
        }

        public int compare(Object obj, Object obj2) {
            g01 g01 = (g01) obj;
            g01 g012 = (g01) obj2;
            if (g01.equals(g012)) {
                return 0;
            }
            String type = g01.mo67142a().getType();
            String type2 = g012.mo67142a().getType();
            return (!type.equals(InstreamAdBreakType.PREROLL) && (type2.equals(InstreamAdBreakType.PREROLL) || type.equals("postroll") || (!type2.equals("postroll") && g01.mo67143b() >= g012.mo67143b()))) ? 1 : -1;
        }
    }

    public kf0(C15419e eVar) {
        this.f36116a = eVar;
    }

    /* renamed from: a */
    public jf0 mo68205a(List<og0> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (og0 next : list) {
            if (InstreamAdBreakType.MIDROLL.equals(next.getType())) {
                arrayList2.add(next);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            og0 og0 = (og0) it.next();
            InstreamAdBreakPosition adBreakPosition = og0.getAdBreakPosition();
            long value = adBreakPosition.getValue();
            if (InstreamAdBreakPosition.Type.PERCENTS.equals(adBreakPosition.getPositionType())) {
                value = tk0.m42363a((float) value, this.f36116a.mo71342b());
            }
            arrayList.add(new g01(og0, value));
        }
        Collections.sort(arrayList, new C13705b());
        return new jf0(arrayList, m38315a(list, InstreamAdBreakType.PREROLL), m38315a(list, "postroll"));
    }

    /* renamed from: a */
    private og0 m38315a(List<og0> list, String str) {
        for (og0 next : list) {
            if (str.equals(next.getType())) {
                return next;
            }
        }
        return null;
    }
}
