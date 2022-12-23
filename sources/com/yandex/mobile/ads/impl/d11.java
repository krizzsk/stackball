package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

class d11 {

    /* renamed from: a */
    private final C14643t f32343a = new C14643t();

    /* renamed from: b */
    private final a11 f32344b = new a11();

    d11() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo66390a(Context context, List<z01> list) {
        Context a = this.f32343a.mo70078a(context);
        if (a == null) {
            return false;
        }
        for (z01 a2 : list) {
            if (m34971a(a, a2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m34971a(Context context, z01 z01) {
        try {
            context.startActivity(this.f32344b.mo65650a(z01));
            return true;
        } catch (Exception unused) {
            z01.getClass();
            return false;
        }
    }
}
