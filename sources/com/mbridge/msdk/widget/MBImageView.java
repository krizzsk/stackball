package com.mbridge.msdk.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.same.p168c.C6216b;
import com.mbridge.msdk.foundation.same.p168c.C6219c;

public class MBImageView extends ImageView {

    /* renamed from: a */
    private Bitmap f18069a = null;

    /* renamed from: b */
    private String f18070b;

    public MBImageView(Context context) {
        super(context);
    }

    public MBImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setImageUrl(String str) {
        this.f18070b = str;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f18069a;
        if (bitmap == null || !bitmap.isRecycled()) {
            super.onDraw(canvas);
        } else if (getContext() != null) {
            C6216b.m15729a(getContext()).mo43786a(this.f18070b, (C6219c) new C6219c() {
                public final void onFailedLoad(String str, String str2) {
                }

                public final void onSuccessLoad(Bitmap bitmap, String str) {
                    MBImageView.this.setImageBitmap(bitmap);
                }
            });
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f18069a = bitmap;
        if (bitmap == null || !bitmap.isRecycled()) {
            super.setImageBitmap(bitmap);
            return;
        }
        this.f18069a = null;
        super.setImageBitmap((Bitmap) null);
    }
}
