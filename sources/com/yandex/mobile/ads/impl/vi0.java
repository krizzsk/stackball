package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;

public class vi0<V extends ViewGroup> {

    /* renamed from: a */
    private final Context f41292a;

    /* renamed from: b */
    private final ViewGroup f41293b;

    /* renamed from: c */
    private final ui0<V> f41294c;

    /* renamed from: d */
    private final ti0<V> f41295d = new ti0<>();

    /* renamed from: e */
    private final si0<V> f41296e = new si0<>();

    public vi0(Context context, ViewGroup viewGroup, List<ri0<V>> list) {
        this.f41292a = context;
        this.f41293b = viewGroup;
        this.f41294c = new ui0<>(list);
    }

    /* renamed from: a */
    public boolean mo70492a() {
        V a;
        ri0<V> a2 = this.f41294c.mo70350a(this.f41292a);
        if (a2 == null || (a = this.f41295d.mo70187a(this.f41293b, a2)) == null) {
            return false;
        }
        this.f41296e.mo70000a(this.f41293b, a, a2);
        return true;
    }

    /* renamed from: b */
    public void mo70493b() {
        this.f41296e.mo69999a(this.f41293b);
    }
}
