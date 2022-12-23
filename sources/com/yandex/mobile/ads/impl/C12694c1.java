package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;

/* renamed from: com.yandex.mobile.ads.impl.c1 */
final class C12694c1 {
    C12694c1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C13156g1 mo66180a(String str) {
        C13156g1 g1Var = C13156g1.STANDALONE;
        if (str == null) {
            return g1Var;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -318297696) {
            if (hashCode != 757909789) {
                if (hashCode == 1055572677 && str.equals(InstreamAdBreakType.MIDROLL)) {
                    c = 2;
                }
            } else if (str.equals("postroll")) {
                c = 1;
            }
        } else if (str.equals(InstreamAdBreakType.PREROLL)) {
            c = 0;
        }
        if (c == 0) {
            return C13156g1.PREROLL;
        }
        if (c == 1) {
            return C13156g1.POSTROLL;
        }
        if (c != 2) {
            return g1Var;
        }
        return C13156g1.MIDROLL;
    }
}
