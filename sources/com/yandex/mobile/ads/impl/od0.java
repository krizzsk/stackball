package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

public class od0 extends un1<ImageView, hd0> {

    /* renamed from: c */
    private final ed0 f38152c;

    /* renamed from: d */
    private final ld0 f38153d;

    /* renamed from: e */
    private final v91 f38154e = new v91();

    public od0(ImageView imageView, ed0 ed0) {
        super(imageView);
        this.f38152c = ed0;
        this.f38153d = new ld0(ed0);
    }

    /* renamed from: a */
    public void mo65866a(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageDrawable((Drawable) null);
        this.f38154e.mo70459a(imageView);
        super.mo65866a(imageView);
    }

    /* renamed from: b */
    public void mo65826b(View view, Object obj) {
        ImageView imageView = (ImageView) view;
        hd0 hd0 = (hd0) obj;
        Bitmap a = this.f38152c.mo66167a(hd0);
        if (a == null) {
            return;
        }
        if (hd0.mo67523c() != null) {
            this.f38154e.mo70460a(imageView, hd0, a);
        } else {
            imageView.setImageBitmap(a);
        }
    }

    /* renamed from: a */
    public boolean mo65825a(View view, Object obj) {
        Drawable drawable = ((ImageView) view).getDrawable();
        return this.f38153d.mo68406a(drawable, (hd0) obj);
    }

    /* renamed from: a */
    public void mo69134a(ImageView imageView) {
        imageView.setImageDrawable((Drawable) null);
        this.f38154e.mo70459a(imageView);
        super.mo65866a(imageView);
    }

    /* renamed from: a */
    public void mo69135a(ImageView imageView, hd0 hd0) {
        Bitmap a = this.f38152c.mo66167a(hd0);
        if (a == null) {
            return;
        }
        if (hd0.mo67523c() != null) {
            this.f38154e.mo70460a(imageView, hd0, a);
        } else {
            imageView.setImageBitmap(a);
        }
    }
}
