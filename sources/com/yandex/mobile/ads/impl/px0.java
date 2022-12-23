package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class px0 {

    /* renamed from: a */
    private final rx0 f38886a = new rx0();

    /* renamed from: b */
    private final qx0 f38887b = new qx0();

    /* renamed from: c */
    private final ox0 f38888c = new ox0();

    /* renamed from: d */
    private final l71 f38889d = l71.m38631c();

    /* renamed from: a */
    public int mo69452a(View view, Rect rect) {
        d71 a = this.f38889d.mo68362a(view.getContext());
        if (a == null || !a.mo66442G()) {
            return 0;
        }
        List<View> a2 = this.f38886a.mo69832a(view);
        this.f38887b.getClass();
        ArrayList arrayList = new ArrayList();
        for (View globalVisibleRect : a2) {
            Rect rect2 = new Rect();
            if (globalVisibleRect.getGlobalVisibleRect(rect2)) {
                arrayList.add(rect2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Rect rect3 = (Rect) it.next();
            int i = rect3.left;
            int i2 = rect.left;
            rect3.left = Math.min(Math.max(i, i2), rect.right);
            int i3 = rect3.top;
            int i4 = rect.top;
            rect3.top = Math.min(Math.max(i3, i4), rect.bottom);
            int i5 = rect3.right;
            int i6 = rect.left;
            rect3.right = Math.min(Math.max(i5, i6), rect.right);
            int i7 = rect3.bottom;
            int i8 = rect.top;
            rect3.bottom = Math.min(Math.max(i7, i8), rect.bottom);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Rect rect4 = (Rect) it2.next();
            if (rect4.width() > 0 && rect4.height() > 0) {
                arrayList2.add(rect4);
            }
        }
        int size = arrayList2.size();
        List list = arrayList2;
        if (size > 100) {
            list = arrayList2.subList(0, 100);
        }
        return this.f38888c.mo69282a(rect, list);
    }
}
