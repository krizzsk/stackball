package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: com.yandex.mobile.ads.impl.af */
public class C12381af implements View.OnTouchListener, View.OnClickListener {

    /* renamed from: a */
    private final View.OnClickListener f30524a;

    /* renamed from: b */
    private final int f30525b;

    /* renamed from: c */
    private boolean f30526c;

    /* renamed from: d */
    private float f30527d;

    /* renamed from: e */
    private float f30528e;

    public C12381af(Context context, View.OnClickListener onClickListener) {
        this.f30524a = onClickListener;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f30525b = scaledTouchSlop * scaledTouchSlop;
    }

    public void onClick(View view) {
        this.f30524a.onClick(view);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int i = action & 255;
        if (i == 0) {
            this.f30527d = x;
            this.f30528e = y;
            this.f30526c = true;
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.f30526c = false;
                }
            } else if (this.f30526c) {
                int i2 = (int) (x - this.f30527d);
                int i3 = (int) (y - this.f30528e);
                if ((i2 * i2) + (i3 * i3) > this.f30525b) {
                    this.f30526c = false;
                }
            }
        } else if (!this.f30526c) {
            return true;
        } else {
            this.f30524a.onClick(view);
            return true;
        }
        return false;
    }
}
