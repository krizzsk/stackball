package com.tapjoy.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tapjoy.internal.iq */
public final class C9429iq extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a */
    private boolean f23436a;

    /* renamed from: b */
    private float f23437b = 1.0f;

    /* renamed from: c */
    private View f23438c;

    /* renamed from: d */
    private View f23439d;

    /* renamed from: e */
    private FrameLayout f23440e;

    /* renamed from: f */
    private ImageView f23441f;

    /* renamed from: g */
    private C9423in f23442g;

    /* renamed from: h */
    private C9390hu f23443h;

    /* renamed from: i */
    private C9430a f23444i;

    /* renamed from: com.tapjoy.internal.iq$a */
    public interface C9430a {
        /* renamed from: a */
        void mo58302a();

        /* renamed from: a */
        void mo58303a(C9384hs hsVar);

        /* renamed from: b */
        void mo58304b();
    }

    public C9429iq(Context context, C9390hu huVar, C9430a aVar) {
        super(context);
        this.f23443h = huVar;
        this.f23444i = aVar;
        Context context2 = getContext();
        View view = new View(context2);
        this.f23438c = view;
        boolean z = true;
        view.setId(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.f23438c, layoutParams);
        this.f23439d = new View(context2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(0, 0);
        layoutParams2.addRule(13);
        addView(this.f23439d, layoutParams2);
        this.f23440e = new FrameLayout(context2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(0, 0);
        layoutParams3.addRule(13);
        addView(this.f23440e, layoutParams3);
        ImageView imageView = new ImageView(context2);
        this.f23441f = imageView;
        imageView.setOnClickListener(this);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(0, 0);
        layoutParams4.addRule(7, this.f23438c.getId());
        layoutParams4.addRule(6, this.f23438c.getId());
        addView(this.f23441f, layoutParams4);
        if (this.f23443h.f23286m != null) {
            C9392hv hvVar = this.f23443h.f23286m;
            if (hvVar.f23288a == null || (hvVar.f23289b == null && hvVar.f23290c == null)) {
                z = false;
            }
            if (z) {
                C9423in inVar = new C9423in(context2);
                this.f23442g = inVar;
                inVar.setOnClickListener(this);
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(0, 0);
                layoutParams5.addRule(5, this.f23439d.getId());
                layoutParams5.addRule(8, this.f23439d.getId());
                addView(this.f23442g, layoutParams5);
            }
        }
        this.f23441f.setImageBitmap(huVar.f23276c.f23297b);
        if (this.f23442g != null && huVar.f23286m != null && huVar.f23286m.f23288a != null) {
            this.f23442g.setImageBitmap(huVar.f23286m.f23288a.f23297b);
        }
    }

    public final void setLandscape(boolean z) {
        Bitmap bitmap;
        ArrayList arrayList;
        Bitmap bitmap2;
        this.f23436a = z;
        if (z) {
            bitmap = this.f23443h.f23275b.f23297b;
            bitmap2 = this.f23443h.f23279f.f23297b;
            arrayList = this.f23443h.f23283j;
        } else {
            bitmap = this.f23443h.f23274a.f23297b;
            bitmap2 = this.f23443h.f23278e.f23297b;
            arrayList = this.f23443h.f23282i;
        }
        C9053ab.m24286a(this.f23438c, new BitmapDrawable((Resources) null, bitmap));
        C9053ab.m24286a(this.f23439d, new BitmapDrawable((Resources) null, bitmap2));
        if (this.f23440e.getChildCount() > 0) {
            this.f23440e.removeAllViews();
        }
        Context context = getContext();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = new View(context);
            view.setTag((C9384hs) it.next());
            view.setOnClickListener(this);
            this.f23440e.addView(view, new FrameLayout.LayoutParams(0, 0, 51));
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        Point point;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.f23436a) {
            this.f23437b = Math.min(((float) size) / 480.0f, ((float) size2) / 320.0f);
        } else {
            this.f23437b = Math.min(((float) size) / 320.0f, ((float) size2) / 480.0f);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f23438c.getLayoutParams();
        int i4 = 480;
        layoutParams.width = m25304a(this.f23436a ? 480 : 320);
        if (this.f23436a) {
            i4 = 320;
        }
        layoutParams.height = m25304a(i4);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f23439d.getLayoutParams();
        int i5 = 448;
        layoutParams2.width = m25304a(this.f23436a ? 448 : 290);
        if (this.f23436a) {
            i5 = 290;
        }
        layoutParams2.height = m25304a(i5);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f23440e.getLayoutParams();
        layoutParams3.width = layoutParams2.width;
        layoutParams3.height = layoutParams2.height;
        for (View view : C9054ac.m24287a(this.f23440e)) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view.getLayoutParams();
            Rect rect = ((C9384hs) view.getTag()).f23254a;
            layoutParams4.width = m25304a(rect.width());
            layoutParams4.height = m25304a(rect.height());
            layoutParams4.leftMargin = m25304a(rect.left);
            layoutParams4.topMargin = m25304a(rect.top);
        }
        int i6 = 0;
        int a = m25304a(0);
        this.f23441f.setPadding(a, a, a, a);
        RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.f23441f.getLayoutParams();
        layoutParams5.width = m25304a(30);
        layoutParams5.height = layoutParams5.width;
        int i7 = -a;
        layoutParams5.rightMargin = m25304a(this.f23443h.f23277d.x) + i7;
        layoutParams5.topMargin = i7 + m25304a(this.f23443h.f23277d.y);
        if (this.f23442g != null) {
            int i8 = 16;
            int a2 = m25304a(this.f23436a ? 16 : 15);
            if (this.f23436a) {
                i8 = 15;
            }
            int a3 = m25304a(i8);
            this.f23442g.setPadding(a, a, a, a);
            RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) this.f23442g.getLayoutParams();
            layoutParams6.width = m25304a(26);
            layoutParams6.height = layoutParams6.width;
            if (this.f23443h.f23286m != null) {
                if (this.f23436a) {
                    C9392hv hvVar = this.f23443h.f23286m;
                    if (hvVar.f23289b == null) {
                        point = hvVar.f23290c;
                    } else {
                        point = hvVar.f23289b;
                    }
                } else {
                    C9392hv hvVar2 = this.f23443h.f23286m;
                    if (hvVar2.f23290c == null) {
                        point = hvVar2.f23289b;
                    } else {
                        point = hvVar2.f23290c;
                    }
                }
                if (point != null) {
                    i6 = point.x;
                    i3 = point.y;
                    layoutParams6.leftMargin = a2 + m25304a(i6);
                    layoutParams6.topMargin = a3 + m25304a(i3);
                }
            }
            i3 = 0;
            layoutParams6.leftMargin = a2 + m25304a(i6);
            layoutParams6.topMargin = a3 + m25304a(i3);
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    private int m25304a(int i) {
        return (int) (((float) i) * this.f23437b);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public final void onClick(View view) {
        C9423in inVar;
        if (view == this.f23441f) {
            this.f23444i.mo58302a();
        } else if (view != null && view == (inVar = this.f23442g)) {
            inVar.f23409a = !inVar.f23409a;
            inVar.mo58363a();
            inVar.invalidate();
            this.f23444i.mo58304b();
        } else if (view.getTag() instanceof C9384hs) {
            this.f23444i.mo58303a((C9384hs) view.getTag());
        }
    }
}
