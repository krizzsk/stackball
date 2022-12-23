package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

class yq1 {

    /* renamed from: a */
    private final uq1 f42909a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<lj1> f42910b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public r41<List<lj1>> f42911c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f42912d;

    yq1(Context context, ai1 ai1) {
        this.f42909a = new uq1(context, ai1);
    }

    /* renamed from: b */
    static /* synthetic */ int m44388b(yq1 yq1) {
        int i = yq1.f42912d;
        yq1.f42912d = i - 1;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71108a(Context context, List<lj1> list, r41<List<lj1>> r41) {
        if (list.isEmpty()) {
            r41.mo66590a(this.f42910b);
            return;
        }
        this.f42911c = r41;
        for (lj1 a : list) {
            this.f42912d++;
            this.f42909a.mo70391a(context, a, new C15265b());
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.yq1$b */
    private class C15265b implements r41<List<lj1>> {
        private C15265b() {
        }

        /* renamed from: a */
        public void mo66590a(Object obj) {
            yq1.m44388b(yq1.this);
            yq1.this.f42910b.addAll((List) obj);
            m44392a();
        }

        /* renamed from: a */
        public void mo66589a(wj1 wj1) {
            yq1.m44388b(yq1.this);
            m44392a();
        }

        /* renamed from: a */
        private void m44392a() {
            if (yq1.this.f42912d == 0 && yq1.this.f42911c != null) {
                yq1.this.f42911c.mo66590a(yq1.this.f42910b);
            }
        }
    }
}
