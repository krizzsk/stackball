package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.mbridge.msdk.video.dynview.p225f.C6960b;

public class MBridgeTextView extends AppCompatTextView {
    private CharSequence originalText = "";
    private C6960b roundButtonDrawable;
    private float spacing = 0.0f;

    public MBridgeTextView(Context context) {
        super(context);
        init(context, (AttributeSet) null, 0);
    }

    public MBridgeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        init(context, attributeSet, 0);
    }

    public MBridgeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet, i);
    }

    public void setBackgroundColor(int i) {
        this.roundButtonDrawable.setColor(i);
    }

    public void setStrokeData(int i, int i2) {
        this.roundButtonDrawable.mo48470a(i, i2);
    }

    public void setGradient(int i, GradientDrawable.Orientation orientation, int[] iArr) {
        this.roundButtonDrawable.setGradientType(i);
        this.roundButtonDrawable.setOrientation(orientation);
        this.roundButtonDrawable.setColors(iArr);
    }

    public void setStrokeColors(int i) {
        this.roundButtonDrawable.mo48469a(i);
    }

    public void setRadius(int i) {
        this.roundButtonDrawable.setCornerRadius((float) i);
    }

    public void setEachCornerRadius(int i, int i2, int i3, int i4) {
        float f = (float) i;
        float f2 = (float) i2;
        float f3 = (float) i3;
        float f4 = (float) i4;
        this.roundButtonDrawable.setCornerRadii(new float[]{f, f, f2, f2, f3, f3, f4, f4});
    }

    public void setSpacing(float f) {
        this.spacing = f;
        applySpacing();
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.spacing == 0.0f) {
            super.setText(charSequence, bufferType);
            return;
        }
        this.originalText = charSequence;
        applySpacing();
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        C6960b a = C6960b.m17561a(context, attributeSet, i);
        this.roundButtonDrawable = a;
        setBackgroundKeepingPadding(this, a);
    }

    private static void setBackgroundKeepingPadding(View view, Drawable drawable) {
        int[] iArr = {view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom()};
        view.setBackground(drawable);
        view.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    private void applySpacing() {
        if (this.originalText != null) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < this.originalText.length()) {
                sb.append(this.originalText.charAt(i));
                int i2 = i + 1;
                if (i2 < this.originalText.length()) {
                    if (isEnglish(this.originalText.charAt(i) + "")) {
                        if (isEnglish(this.originalText.charAt(i2) + "")) {
                        }
                    }
                    sb.append(" ");
                }
                i = i2;
            }
            SpannableString spannableString = new SpannableString(sb.toString());
            if (sb.toString().length() > 1) {
                for (int i3 = 1; i3 < sb.toString().length(); i3 += 2) {
                    spannableString.setSpan(new ScaleXSpan((this.spacing + 1.0f) / 10.0f), i3, i3 + 1, 33);
                }
            }
            super.setText(spannableString, TextView.BufferType.SPANNABLE);
        }
    }

    public static boolean isEnglish(String str) {
        return str.matches("^[a-zA-Z]*");
    }
}
