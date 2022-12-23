package com.applovin.impl.adview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.applovin.impl.adview.h */
public abstract class C1086h extends View {

    /* renamed from: a */
    protected float f1959a = 1.0f;

    /* renamed from: b */
    protected final Context f1960b;

    /* renamed from: com.applovin.impl.adview.h$a */
    public enum C1087a {
        WHITE_ON_BLACK(0),
        WHITE_ON_TRANSPARENT(1),
        INVISIBLE(2);
        

        /* renamed from: d */
        private final int f1965d;

        private C1087a(int i) {
            this.f1965d = i;
        }

        /* renamed from: a */
        public int mo11956a() {
            return this.f1965d;
        }
    }

    protected C1086h(Context context) {
        super(context);
        this.f1960b = context;
    }

    /* renamed from: a */
    public static C1086h m1600a(C1087a aVar, Context context) {
        return aVar.equals(C1087a.INVISIBLE) ? new C1147p(context) : aVar.equals(C1087a.WHITE_ON_TRANSPARENT) ? new C1148q(context) : new C1156w(context);
    }

    /* renamed from: a */
    public void mo11952a(int i) {
        setViewScale(((float) i) / 30.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) getSize();
            layoutParams.height = (int) getSize();
        }
    }

    public float getSize() {
        return this.f1959a * 30.0f;
    }

    public abstract C1087a getStyle();

    public void setViewScale(float f) {
        this.f1959a = f;
    }
}
