package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import androidx.core.internal.view.SupportMenu;
import com.yandex.mobile.ads.base.C12135y;
import java.util.WeakHashMap;

class ie0 {

    /* renamed from: a */
    private final zo1 f34828a = new zo1();

    /* renamed from: b */
    private final C14879vc f34829b = new C14879vc();

    /* renamed from: c */
    private final C14393ql f34830c = new C14393ql();

    /* renamed from: d */
    private final WeakHashMap<FrameLayout, C14751uc> f34831d = new WeakHashMap<>();

    /* renamed from: e */
    private final WeakHashMap<FrameLayout, ke0> f34832e = new WeakHashMap<>();

    ie0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo67777a(C12135y yVar, FrameLayout frameLayout, boolean z) {
        C14751uc ucVar = this.f34831d.get(frameLayout);
        if (ucVar == null) {
            ucVar = new C14751uc(frameLayout.getContext(), this.f34830c);
            this.f34831d.put(frameLayout, ucVar);
            frameLayout.addView(ucVar);
        }
        this.f34829b.getClass();
        ucVar.setColor(z ? SupportMenu.CATEGORY_MASK : -16711936);
        if (z) {
            ke0 ke0 = this.f34832e.get(frameLayout);
            if (ke0 == null) {
                ke0 = new ke0(frameLayout.getContext());
                this.f34832e.put(frameLayout, ke0);
                frameLayout.addView(ke0);
            }
            ke0.setDescription(this.f34828a.mo71269a(yVar));
            return;
        }
        ke0 ke02 = this.f34832e.get(frameLayout);
        if (ke02 != null) {
            this.f34832e.remove(frameLayout);
            frameLayout.removeView(ke02);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo67776a(FrameLayout frameLayout) {
        C14751uc ucVar = this.f34831d.get(frameLayout);
        if (ucVar != null) {
            this.f34831d.remove(frameLayout);
            frameLayout.removeView(ucVar);
        }
        ke0 ke0 = this.f34832e.get(frameLayout);
        if (ke0 != null) {
            this.f34832e.remove(frameLayout);
            frameLayout.removeView(ke0);
        }
    }
}
