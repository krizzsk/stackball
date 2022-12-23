package com.yandex.mobile.ads.impl;

import java.util.Comparator;

/* renamed from: com.yandex.mobile.ads.impl.o1 */
class C14160o1 {

    /* renamed from: com.yandex.mobile.ads.impl.o1$b */
    private static class C14162b implements Comparator<og0> {
        private C14162b() {
        }

        public int compare(Object obj, Object obj2) {
            int i = ((((og0) obj).getAdBreakPosition().getValue() - ((og0) obj2).getAdBreakPosition().getValue()) > 0 ? 1 : ((((og0) obj).getAdBreakPosition().getValue() - ((og0) obj2).getAdBreakPosition().getValue()) == 0 ? 0 : -1));
            if (i < 0) {
                return -1;
            }
            return i > 0 ? 1 : 0;
        }
    }

    C14160o1() {
    }
}
