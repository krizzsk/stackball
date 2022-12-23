package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.C12066R;

public class t60 extends un1<ImageView, r60> {

    /* renamed from: c */
    private final ed0 f40239c;

    public t60(ImageView imageView, ed0 ed0) {
        super(imageView);
        this.f40239c = ed0;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo65825a(View view, Object obj) {
        ImageView imageView = (ImageView) view;
        r60 r60 = (r60) obj;
        return true;
    }

    /* renamed from: b */
    public void mo65826b(View view, Object obj) {
        ImageView imageView = (ImageView) view;
        hd0 a = ((r60) obj).mo69697a();
        if (a != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                imageView.setForeground((Drawable) null);
            }
            imageView.setBackground((Drawable) null);
            Bitmap a2 = this.f40239c.mo66167a(a);
            if (a2 == null) {
                imageView.setImageDrawable(imageView.getResources().getDrawable(C12066R.C12067drawable.yandex_ads_internal_default_adtune_feedback_icon));
            } else {
                imageView.setImageBitmap(a2);
            }
        }
    }
}
