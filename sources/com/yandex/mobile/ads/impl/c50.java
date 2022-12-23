package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.yandex.mobile.ads.impl.qo1;

public class c50 {

    /* renamed from: a */
    private final qo1 f31809a = new qo1();

    /* renamed from: a */
    public <T extends View & qo1.C14402a> b50 mo66204a(T t) {
        int i;
        RectF rectF = null;
        if (this.f31809a.mo69624a(t)) {
            i = lo1.m38866a((View) t);
            Rect rect = new Rect();
            if (t.getLocalVisibleRect(rect)) {
                rect.offset(t.getLeft(), t.getTop());
            } else {
                rect = null;
            }
            Context context = t.getContext();
            if (rect != null) {
                int i2 = rect.left;
                int i3 = lo1.f36769b;
                int round = Math.round(((float) i2) / context.getResources().getDisplayMetrics().density);
                int round2 = Math.round(((float) rect.top) / context.getResources().getDisplayMetrics().density);
                int round3 = Math.round(((float) rect.right) / context.getResources().getDisplayMetrics().density);
                int round4 = Math.round(((float) rect.bottom) / context.getResources().getDisplayMetrics().density);
                int i4 = round4 - round2;
                if (round3 - round > 0 && i4 > 0) {
                    rectF = new RectF((float) round, (float) round2, (float) round3, (float) round4);
                }
            }
        } else {
            i = 0;
        }
        return new b50(i, rectF);
    }
}
