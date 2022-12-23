package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.chartboost.sdk.Libraries.C1830i;

/* renamed from: com.chartboost.sdk.impl.o1 */
public class C1963o1 extends ImageView {

    /* renamed from: a */
    private C1830i f5050a = null;

    /* renamed from: b */
    protected TextView f5051b = null;

    public C1963o1(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo14746a(C1830i iVar) {
        if (iVar != null && iVar.mo14248e() && this.f5050a != iVar) {
            this.f5050a = iVar;
            setImageDrawable(new BitmapDrawable(iVar.mo14245b()));
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mo14745a(canvas);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f5050a = null;
        setImageDrawable(new BitmapDrawable(bitmap));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14745a(Canvas canvas) {
        TextView textView = this.f5051b;
        if (textView != null) {
            textView.layout(0, 0, canvas.getWidth(), canvas.getHeight());
            this.f5051b.setEnabled(isEnabled());
            this.f5051b.setSelected(isSelected());
            if (isFocused()) {
                this.f5051b.requestFocus();
            } else {
                this.f5051b.clearFocus();
            }
            this.f5051b.setPressed(isPressed());
            this.f5051b.draw(canvas);
        }
    }
}
