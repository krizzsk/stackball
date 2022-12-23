package com.yandex.mobile.ads.impl;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.yandex.mobile.ads.nativeads.C15501j;
import java.util.List;

public class ma1 implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a */
    private final ze1 f37274a;

    /* renamed from: b */
    private final yq0 f37275b;

    /* renamed from: c */
    private final List<ha1> f37276c;

    /* renamed from: d */
    private final C15501j f37277d;

    /* renamed from: e */
    private final fx0 f37278e;

    ma1(ze1 ze1, yq0 yq0, List<ha1> list, C15501j jVar, fx0 fx0) {
        this.f37274a = ze1;
        this.f37275b = yq0;
        this.f37276c = list;
        this.f37277d = jVar;
        this.f37278e = fx0;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId >= this.f37276c.size()) {
            return true;
        }
        ha1 ha1 = this.f37276c.get(itemId);
        ej0 a = ha1.mo67504a();
        ex0 a2 = this.f37278e.mo67096a(this.f37275b.mo71106a(ha1.mo67505b(), "social_action"));
        this.f37277d.mo71680a(a);
        this.f37274a.mo71215a(a.mo66836c());
        a2.mo66882a(a.mo66837d());
        return true;
    }
}
