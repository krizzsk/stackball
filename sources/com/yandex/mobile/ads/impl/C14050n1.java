package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.n1 */
class C14050n1 {
    C14050n1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<og0> mo68879a(String str, List<og0> list) {
        ArrayList arrayList = new ArrayList();
        for (og0 next : list) {
            if (m39799a(next, str)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private boolean m39799a(og0 og0, String str) {
        if (!og0.getType().equals(str)) {
            return false;
        }
        return InstreamAdBreakPosition.Type.POSITION.equals(og0.getAdBreakPosition().getPositionType());
    }
}
