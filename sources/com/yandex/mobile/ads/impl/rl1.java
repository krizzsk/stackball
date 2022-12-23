package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

class rl1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f39502a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final xq1 f39503b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ql1 f39504c = new ql1();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final List<lj1> f39505d = new ArrayList();

    rl1(Context context, ai1 ai1) {
        this.f39502a = context.getApplicationContext();
        this.f39503b = new xq1(context, ai1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo69783a(List<lj1> list, r41<List<lj1>> r41) {
        pl1 a = this.f39504c.mo69621a(list);
        this.f39505d.addAll(a.mo69384a());
        this.f39503b.mo70935a(this.f39502a, a.mo69385b(), new C14476a(r41));
    }

    /* renamed from: com.yandex.mobile.ads.impl.rl1$a */
    private class C14476a implements r41<List<lj1>> {

        /* renamed from: a */
        private final r41<List<lj1>> f39506a;

        C14476a(r41<List<lj1>> r41) {
            this.f39506a = r41;
        }

        /* renamed from: a */
        public void mo66590a(Object obj) {
            pl1 a = rl1.this.f39504c.mo69621a((List) obj);
            rl1.this.f39505d.addAll(a.mo69384a());
            List<lj1> b = a.mo69385b();
            if (b.isEmpty()) {
                m41639a();
            } else {
                rl1.this.f39503b.mo70935a(rl1.this.f39502a, b, this);
            }
        }

        /* renamed from: a */
        public void mo66589a(wj1 wj1) {
            m41639a();
        }

        /* renamed from: a */
        private void m41639a() {
            if (rl1.this.f39505d.isEmpty()) {
                this.f39506a.mo66589a(wj1.m43662a(new e30()));
                return;
            }
            this.f39506a.mo66590a(rl1.this.f39505d);
        }
    }
}
