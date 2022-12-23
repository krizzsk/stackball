package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBreakQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class mk0<T> {

    /* renamed from: a */
    private final nk0 f37431a;

    public mk0(Context context, InstreamAd instreamAd) {
        this.f37431a = new nk0(context, instreamAd);
    }

    /* renamed from: a */
    public InstreamAdBreakQueue<T> mo68710a(gk0<T> gk0, String str) {
        List<hk0> a = this.f37431a.mo69041a(str);
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = ((ArrayList) a).iterator();
        while (it.hasNext()) {
            arrayDeque.add(gk0.mo67316a((hk0) it.next()));
        }
        return new lk0(arrayDeque);
    }
}
