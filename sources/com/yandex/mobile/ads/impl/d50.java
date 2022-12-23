package com.yandex.mobile.ads.impl;

import android.graphics.RectF;

public class d50 implements vh0 {

    /* renamed from: b */
    private final RectF f32385b;

    /* renamed from: c */
    private final int f32386c;

    public d50(int i, RectF rectF) {
        this.f32386c = i;
        this.f32385b = rectF;
    }

    /* renamed from: a */
    public String mo66428a() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.f32386c);
        RectF rectF = this.f32385b;
        if (rectF != null) {
            str = String.format("{x:%s,y:%s,width:%s,height:%s}", new Object[]{Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.width()), Float.valueOf(rectF.height())});
        } else {
            str = null;
        }
        objArr[1] = str;
        return String.format("exposure:{exposedPercentage:%s,visibleRectangle:%s,occlusionRectangles:[]}", objArr);
    }
}
