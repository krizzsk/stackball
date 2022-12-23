package com.yandex.mobile.ads.impl;

import android.util.LruCache;

public class u40 extends LruCache<ck1, w40> {
    public u40(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        ck1 ck1 = (ck1) obj;
        w40 w40 = (w40) obj2;
        w40 w402 = (w40) obj3;
        if (w40 != null) {
            w40.mo70649j();
        }
    }
}
