package com.tapjoy;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class TJImageButton extends ImageButton {

    /* renamed from: a */
    private Bitmap f22058a;

    /* renamed from: b */
    private Bitmap f22059b;

    public TJImageButton(Context context) {
        super(context);
    }

    public TJImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TJImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TJImageButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setEnabledImageBitmap(Bitmap bitmap) {
        this.f22058a = bitmap;
    }

    public void setDisableImageBitmap(Bitmap bitmap) {
        this.f22059b = bitmap;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setImageBitmap(z ? this.f22058a : this.f22059b);
    }
}
