package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

public class gs0 implements View.OnTouchListener, View.OnClickListener {

    /* renamed from: a */
    private final C12381af f34116a;

    /* renamed from: b */
    private final sr0 f34117b = sr0.m42127a();

    public gs0(Context context, View.OnClickListener onClickListener) {
        this.f34116a = new C12381af(context, onClickListener);
    }

    public void onClick(View view) {
        this.f34116a.onClick(view);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f34117b.mo70046b(view, motionEvent);
        return this.f34116a.onTouch(view, motionEvent);
    }
}
