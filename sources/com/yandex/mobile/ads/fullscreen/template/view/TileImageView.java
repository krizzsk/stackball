package com.yandex.mobile.ads.fullscreen.template.view;

import android.content.Context;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.rd1;

public class TileImageView extends ImageView {
    public TileImageView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable != null ? new rd1(drawable, Shader.TileMode.REPEAT) : null);
    }

    public TileImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TileImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
