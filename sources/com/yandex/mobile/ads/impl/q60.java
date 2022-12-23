package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.PopupMenu;
import com.yandex.mobile.ads.impl.i60;
import com.yandex.mobile.ads.nativeads.C15501j;
import com.yandex.mobile.ads.nativeads.C15550v;
import java.util.List;

public class q60 {

    /* renamed from: a */
    private final C14645t1 f39009a;

    /* renamed from: b */
    private final k41 f39010b;

    /* renamed from: c */
    private final C15550v f39011c;

    /* renamed from: d */
    private final p60 f39012d = new p60();

    /* renamed from: e */
    private final C15501j f39013e;

    public q60(C14645t1 t1Var, k41 k41, C15550v vVar, C15501j jVar) {
        this.f39009a = t1Var;
        this.f39010b = k41;
        this.f39011c = vVar;
        this.f39013e = jVar;
    }

    /* renamed from: a */
    public void mo69498a(Context context, i60 i60) {
        PopupMenu popupMenu;
        ImageView g = this.f39011c.mo71929h().mo71626g();
        if (g != null) {
            List<i60.C13382a> b = i60.mo67736b();
            if (!b.isEmpty()) {
                try {
                    C12356a5 a5Var = new C12356a5(context, this.f39009a);
                    this.f39012d.getClass();
                    if (Build.VERSION.SDK_INT >= 19) {
                        popupMenu = new PopupMenu(context, g, 5);
                    } else {
                        popupMenu = new PopupMenu(context, g);
                    }
                    Menu menu = popupMenu.getMenu();
                    for (int i = 0; i < b.size(); i++) {
                        menu.add(0, i, 0, b.get(i).mo67737a());
                    }
                    popupMenu.setOnMenuItemClickListener(new n01(a5Var, b, this.f39010b, this.f39013e));
                    popupMenu.show();
                } catch (Exception unused) {
                }
            }
        }
    }
}
