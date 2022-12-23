package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.fullscreen.template.view.PriorityLinearLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class cl0 {

    /* renamed from: a */
    private final PriorityLinearLayout f31969a;

    /* renamed from: b */
    private final List<dl0> f31970b = new ArrayList();

    public cl0(PriorityLinearLayout priorityLinearLayout) {
        this.f31969a = priorityLinearLayout;
    }

    /* renamed from: a */
    public void mo66327a() {
        dl0 dl0;
        this.f31970b.clear();
        for (int i = 0; i < this.f31969a.getChildCount(); i++) {
            ViewGroup.LayoutParams layoutParams = this.f31969a.mo65473a(i).getLayoutParams();
            if (layoutParams instanceof PriorityLinearLayout.C12346a) {
                dl0 = ((PriorityLinearLayout.C12346a) layoutParams).mo65477a();
            } else {
                dl0 = new dl0(0);
            }
            dl0.f32704c = i;
            this.f31970b.add(dl0);
        }
        Collections.sort(this.f31970b);
    }

    /* renamed from: a */
    public View mo66326a(int i) {
        if (i >= this.f31970b.size()) {
            return null;
        }
        return this.f31969a.mo65473a(this.f31970b.get(i).f32704c);
    }
}
