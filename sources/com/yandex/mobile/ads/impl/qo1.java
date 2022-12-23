package com.yandex.mobile.ads.impl;

import android.view.View;

public class qo1 {

    /* renamed from: com.yandex.mobile.ads.impl.qo1$a */
    public interface C14402a {
        /* renamed from: a */
        boolean mo66360a();
    }

    /* renamed from: a */
    public <T extends View & C14402a> boolean mo69624a(T t) {
        return ((C14402a) t).mo66360a() && t.hasWindowFocus() && !lo1.m38874d((View) t);
    }
}
