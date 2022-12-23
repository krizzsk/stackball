package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.Menu;
import android.view.View;
import android.widget.PopupMenu;
import java.lang.reflect.Field;
import java.util.List;

public class sa1 {

    /* renamed from: a */
    private m01 f39905a = new m01();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public PopupMenu mo69925a(View view, ed0 ed0, List<ha1> list) {
        PopupMenu popupMenu;
        Context context = view.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            popupMenu = new PopupMenu(context, view, 5);
        } else {
            popupMenu = new PopupMenu(context, view);
        }
        this.f39905a.getClass();
        if (i >= 29) {
            popupMenu.setForceShowIcon(true);
        } else {
            Object obj = null;
            try {
                Field declaredField = popupMenu.getClass().getDeclaredField("mPopup");
                declaredField.setAccessible(true);
                obj = declaredField.get(popupMenu);
                declaredField.setAccessible(false);
            } catch (Exception unused) {
            }
            if (obj != null) {
                try {
                    obj.getClass().getMethod("setForceShowIcon", new Class[]{Boolean.TYPE}).invoke(obj, new Object[]{Boolean.TRUE});
                } catch (Exception unused2) {
                }
            }
        }
        Menu menu = popupMenu.getMenu();
        Context context2 = view.getContext();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ja1 c = list.get(i2).mo67506c();
            menu.add(0, i2, i2, c.mo67958b()).setIcon(new BitmapDrawable(context2.getResources(), ed0.mo66167a(c.mo67957a())));
        }
        return popupMenu;
    }
}
