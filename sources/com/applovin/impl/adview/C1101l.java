package com.applovin.impl.adview;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.C1086h;

/* renamed from: com.applovin.impl.adview.l */
public class C1101l extends FrameLayout {

    /* renamed from: a */
    private final C1086h f1990a;

    public C1101l(C1086h.C1087a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        C1086h a = C1086h.m1600a(aVar, activity);
        this.f1990a = a;
        addView(a);
    }

    /* renamed from: a */
    public void mo11978a(int i, int i2, int i3, int i4) {
        int i5 = i2 + i + i3;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i5;
            layoutParams.width = i5;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i5, i5));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i, i4);
        layoutParams2.setMargins(i3, i3, i3, 0);
        this.f1990a.setLayoutParams(layoutParams2);
        this.f1990a.mo11952a(i);
    }
}
