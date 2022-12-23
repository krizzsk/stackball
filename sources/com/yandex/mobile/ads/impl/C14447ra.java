package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yandex.mobile.ads.impl.ra */
public class C14447ra {

    /* renamed from: a */
    private final Object f39399a = new Object();

    /* renamed from: b */
    private final C14373qa f39400b;

    /* renamed from: c */
    private final List<C14749ua> f39401c = new CopyOnWriteArrayList();

    public C14447ra(y71 y71) {
        this.f39400b = new C14373qa(y71);
    }

    /* renamed from: a */
    public void mo69710a(Context context, C14661ta taVar, C14749ua uaVar) {
        synchronized (this.f39399a) {
            if (this.f39400b.mo69563a(context)) {
                synchronized (this.f39399a) {
                    this.f39401c.add(uaVar);
                    ((C14568s8) taVar).mo69903b(uaVar);
                }
            } else {
                uaVar.mo64609a((String) null);
            }
        }
    }

    /* renamed from: a */
    public void mo69711a(C14661ta taVar) {
        synchronized (this.f39399a) {
            for (C14749ua a : this.f39401c) {
                ((C14568s8) taVar).mo69902a(a);
            }
            this.f39401c.clear();
        }
    }
}
