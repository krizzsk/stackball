package com.p243my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.SimpleExoPlayer;

/* renamed from: com.my.target.y5 */
public class C7757y5 extends FrameLayout {

    /* renamed from: a */
    public final TextureView f19710a;

    /* renamed from: b */
    public SurfaceView f19711b;

    /* renamed from: c */
    public int f19712c;

    /* renamed from: d */
    public int f19713d;

    /* renamed from: e */
    public C7758a f19714e;

    /* renamed from: f */
    public int f19715f;

    /* renamed from: com.my.target.y5$a */
    public interface C7758a {
        /* renamed from: p */
        void mo50016p();
    }

    public C7757y5(Context context) {
        super(context);
        this.f19710a = new TextureView(context);
        mo51887a();
    }

    /* renamed from: a */
    public final void mo51887a() {
        View view;
        C7761y8.m20947b(this.f19710a, "ad_video");
        if (getChildAt(0) != null) {
            removeViewAt(0);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        if (this.f19715f == 0) {
            view = this.f19710a;
        } else {
            if (this.f19711b == null) {
                this.f19711b = new SurfaceView(getContext());
            }
            view = this.f19711b;
        }
        addView(view, layoutParams);
    }

    /* renamed from: a */
    public void mo51888a(int i, int i2) {
        this.f19712c = i;
        this.f19713d = i2;
        requestLayout();
        invalidate();
    }

    public Bitmap getScreenShot() {
        if (this.f19715f == 1) {
            return null;
        }
        try {
            return this.f19710a.getBitmap(getWidth(), getHeight());
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public TextureView getTextureView() {
        return this.f19710a;
    }

    public void onAttachedToWindow() {
        C7758a aVar;
        super.onAttachedToWindow();
        if (!C7761y8.m20942a((View) this) && (aVar = this.f19714e) != null) {
            aVar.mo50016p();
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i4 = this.f19712c;
        if (i4 <= 0 || (i3 = this.f19713d) <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        float f = ((float) i4) / ((float) i3);
        if (mode == 0 && mode2 == 0) {
            size = i4;
            size2 = i3;
        } else {
            if (mode == 0) {
                size = (int) (((float) size2) * f);
            } else if (mode2 == 0) {
                size2 = (int) (((float) size) / f);
            } else if (C7489j8.m19522a(f, 1.0f) >= 0) {
                i4 = size;
                i3 = size2;
                size2 = (int) (((float) size) / f);
            } else {
                i4 = size;
                i3 = size2;
                size = (int) (((float) size2) * f);
            }
            i4 = size;
            i3 = size2;
        }
        this.f19710a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        SurfaceView surfaceView = this.f19711b;
        if (surfaceView != null) {
            surfaceView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(i4, i3);
    }

    public void setAdVideoViewListener(C7758a aVar) {
        this.f19714e = aVar;
    }

    public void setExoPlayer(SimpleExoPlayer simpleExoPlayer) {
        if (simpleExoPlayer != null) {
            int i = this.f19715f;
            if (i == 0) {
                simpleExoPlayer.setVideoSurfaceView((SurfaceView) null);
                simpleExoPlayer.setVideoTextureView(this.f19710a);
            } else if (i == 1) {
                simpleExoPlayer.setVideoTextureView((TextureView) null);
                simpleExoPlayer.setVideoSurfaceView(this.f19711b);
            }
        }
    }

    public void setViewMode(int i) {
        if (this.f19715f != i) {
            this.f19715f = i;
            mo51887a();
        }
    }
}
