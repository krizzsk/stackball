package com.p243my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: com.my.target.y6 */
public class C7759y6 extends FrameLayout {

    /* renamed from: a */
    public final ImageView f19716a;

    public C7759y6(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f19716a = imageView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(imageView, layoutParams);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f19716a.setImageBitmap(bitmap);
    }
}
