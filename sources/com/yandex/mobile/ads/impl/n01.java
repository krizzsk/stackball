package com.yandex.mobile.ads.impl;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.impl.i60;
import com.yandex.mobile.ads.nativeads.C15501j;
import java.util.List;

class n01 implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a */
    private final k41 f37619a;

    /* renamed from: b */
    private final C12356a5 f37620b;

    /* renamed from: c */
    private final List<i60.C13382a> f37621c;

    /* renamed from: d */
    private final C15501j f37622d;

    n01(C12356a5 a5Var, List<i60.C13382a> list, k41 k41, C15501j jVar) {
        this.f37621c = list;
        this.f37620b = a5Var;
        this.f37619a = k41;
        this.f37622d = jVar;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId >= this.f37621c.size()) {
            return true;
        }
        this.f37620b.mo65674a(this.f37621c.get(itemId).mo67738b());
        ((C13198gf) this.f37619a).mo67276a(h41.C13276b.FEEDBACK);
        this.f37622d.mo71679a();
        return true;
    }
}
