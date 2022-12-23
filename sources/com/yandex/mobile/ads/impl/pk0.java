package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdView;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public final class pk0 {

    /* renamed from: b */
    private static final Object f38636b = new Object();

    /* renamed from: c */
    private static volatile pk0 f38637c;

    /* renamed from: a */
    private final Map<InstreamAdView, jk0> f38638a = new WeakHashMap();

    private pk0() {
    }

    /* renamed from: a */
    public static pk0 m40793a() {
        if (f38637c == null) {
            synchronized (f38636b) {
                if (f38637c == null) {
                    f38637c = new pk0();
                }
            }
        }
        return f38637c;
    }

    /* renamed from: a */
    public jk0 mo69375a(InstreamAdView instreamAdView) {
        jk0 jk0;
        synchronized (f38636b) {
            jk0 = this.f38638a.get(instreamAdView);
        }
        return jk0;
    }

    /* renamed from: a */
    public void mo69376a(InstreamAdView instreamAdView, jk0 jk0) {
        synchronized (f38636b) {
            this.f38638a.put(instreamAdView, jk0);
        }
    }

    /* renamed from: a */
    public boolean mo69377a(jk0 jk0) {
        boolean z;
        synchronized (f38636b) {
            Iterator<Map.Entry<InstreamAdView, jk0>> it = this.f38638a.entrySet().iterator();
            z = false;
            while (it.hasNext()) {
                if (jk0 == ((jk0) it.next().getValue())) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }
}
