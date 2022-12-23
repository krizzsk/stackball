package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.instream.InstreamAdBinder;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public final class te0 {

    /* renamed from: b */
    private static final Object f40298b = new Object();

    /* renamed from: c */
    private static volatile te0 f40299c;

    /* renamed from: a */
    private final Map<View, InstreamAdBinder> f40300a = new WeakHashMap();

    private te0() {
    }

    /* renamed from: a */
    public static te0 m42325a() {
        if (f40299c == null) {
            synchronized (f40298b) {
                if (f40299c == null) {
                    f40299c = new te0();
                }
            }
        }
        return f40299c;
    }

    /* renamed from: a */
    public InstreamAdBinder mo70170a(View view) {
        InstreamAdBinder instreamAdBinder;
        synchronized (f40298b) {
            instreamAdBinder = this.f40300a.get(view);
        }
        return instreamAdBinder;
    }

    /* renamed from: a */
    public void mo70171a(View view, InstreamAdBinder instreamAdBinder) {
        synchronized (f40298b) {
            this.f40300a.put(view, instreamAdBinder);
        }
    }

    /* renamed from: a */
    public boolean mo70172a(InstreamAdBinder instreamAdBinder) {
        boolean z;
        synchronized (f40298b) {
            Iterator<Map.Entry<View, InstreamAdBinder>> it = this.f40300a.entrySet().iterator();
            z = false;
            while (it.hasNext()) {
                if (instreamAdBinder == ((InstreamAdBinder) it.next().getValue())) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }
}
