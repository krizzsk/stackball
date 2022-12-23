package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.mobile.ads.C12066R;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Intrinsics;

public class lj0 extends C13283h9 implements kj0 {

    /* renamed from: g */
    private c10 f36678g;

    /* renamed from: h */
    private Drawable f36679h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lj0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public void mo68440a(Future<?> future) {
        Intrinsics.checkNotNullParameter(future, "task");
        setTag(C12066R.C12068id.bitmap_load_references_tag, future);
    }

    public void buildDrawingCache(boolean z) {
        c10 c10 = this.f36678g;
        if (c10 != null) {
            c10.mo66182a(z);
        }
        super.buildDrawingCache(z);
    }

    /* renamed from: d */
    public void mo68239d() {
        setTag(C12066R.C12068id.bitmap_load_references_tag, (Object) null);
    }

    /* renamed from: e */
    public boolean mo68240e() {
        return Intrinsics.areEqual(getTag(C12066R.C12068id.image_loaded_flag), (Object) Boolean.TRUE);
    }

    /* renamed from: f */
    public Future<?> mo68442f() {
        Object tag = getTag(C12066R.C12068id.bitmap_load_references_tag);
        if (tag instanceof Future) {
            return (Future) tag;
        }
        return null;
    }

    /* renamed from: g */
    public void mo68443g() {
        setTag(C12066R.C12068id.image_loaded_flag, Boolean.TRUE);
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable invalidateDrawable;
        Intrinsics.checkNotNullParameter(drawable, "dr");
        c10 c10 = this.f36678g;
        if (!(c10 == null || (invalidateDrawable = c10.invalidateDrawable(drawable)) == null)) {
            drawable = invalidateDrawable;
        }
        super.invalidateDrawable(drawable);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c10 c10 = this.f36678g;
        if (c10 != null) {
            c10.onAttachedToWindow();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c10 c10 = this.f36678g;
        if (c10 != null) {
            c10.onDetachedFromWindow();
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "changedView");
        c10 c10 = this.f36678g;
        if (c10 != null && !c10.mo66183a(view, i)) {
            super.onVisibilityChanged(view, i);
        }
    }

    public void setDelegate(c10 c10) {
        this.f36678g = c10;
    }

    public final void setExternalImage(Drawable drawable) {
        this.f36679h = drawable;
        invalidate();
    }

    public void setImage(Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    public void setImageBitmap(Bitmap bitmap) {
        if (this.f36679h == null) {
            super.setImageBitmap(bitmap);
            return;
        }
        Drawable drawable = getDrawable();
        Drawable drawable2 = this.f36679h;
        if (drawable != drawable2) {
            super.setImageDrawable(drawable2);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        if (this.f36679h == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawable2 = getDrawable();
        Drawable drawable3 = this.f36679h;
        if (drawable2 != drawable3) {
            super.setImageDrawable(drawable3);
        }
    }

    public void setPlaceholder(Drawable drawable) {
        setImageDrawable(drawable);
    }

    public void setPreview(Drawable drawable) {
        setImageDrawable(drawable);
    }

    public void unscheduleDrawable(Drawable drawable) {
        c10 c10 = this.f36678g;
        if (c10 != null) {
            c10.mo66181a(drawable);
        }
        super.unscheduleDrawable(drawable);
    }

    public void setImage(Drawable drawable) {
        setImageDrawable(drawable);
        if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable) && this.f36679h == null) {
            ((AnimatedImageDrawable) drawable).start();
        }
    }

    public void setPreview(Bitmap bitmap) {
        setImageBitmap(bitmap);
    }
}
