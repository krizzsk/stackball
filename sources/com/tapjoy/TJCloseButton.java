package com.tapjoy;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Handler;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;

public class TJCloseButton extends ImageButton {

    /* renamed from: a */
    private static final String f21985a = TJCloseButton.class.getSimpleName();

    /* renamed from: b */
    private ClosePosition f21986b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f21987c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f21988d;

    public enum ClosePosition {
        TOP_LEFT(new int[]{10, 9}),
        TOP_CENTER(new int[]{10, 14}),
        TOP_RIGHT(new int[]{10, 11}),
        CENTER(new int[]{13}),
        BOTTOM_LEFT(new int[]{12, 9}),
        BOTTOM_CENTER(new int[]{12, 14}),
        BOTTOM_RIGHT(new int[]{12, 11});
        

        /* renamed from: a */
        final RelativeLayout.LayoutParams f21992a;

        private ClosePosition(int[] iArr) {
            this.f21992a = new RelativeLayout.LayoutParams(-2, -2);
            for (int addRule : iArr) {
                this.f21992a.addRule(addRule);
            }
            int deviceScreenDensityScale = (int) (TapjoyConnectCore.getDeviceScreenDensityScale() * -10.0f);
            this.f21992a.setMargins(0, deviceScreenDensityScale, deviceScreenDensityScale, 0);
        }
    }

    public TJCloseButton(Context context) {
        this(context, ClosePosition.TOP_RIGHT);
    }

    public TJCloseButton(Context context, ClosePosition closePosition) {
        super(context);
        this.f21987c = true;
        this.f21986b = closePosition;
        Bitmap loadBitmapFromJar = TapjoyUtil.loadBitmapFromJar("tj_close_button.png", context);
        if (loadBitmapFromJar == null) {
            try {
                loadBitmapFromJar = BitmapFactory.decodeResource(context.getResources(), context.getResources().getIdentifier("tj_close_button", "drawable", context.getPackageName()));
            } catch (Exception unused) {
                TapjoyLog.m24278w(f21985a, "Could not find close button asset");
            }
        }
        setImageBitmap(loadBitmapFromJar);
        setBackgroundColor(ViewCompat.MEASURED_SIZE_MASK);
        setLayoutParams(this.f21986b.f21992a);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        if (Build.VERSION.SDK_INT >= 12) {
            setAlpha(0.0f);
            setVisibility(0);
            this.f21988d = true;
            setClickable(false);
            new Handler().postDelayed(new Runnable() {
                public final void run() {
                    TJCloseButton.this.animate().alpha(1.0f).setDuration(500).setListener(new Animator.AnimatorListener() {
                        public final void onAnimationRepeat(Animator animator) {
                        }

                        public final void onAnimationStart(Animator animator) {
                        }

                        public final void onAnimationCancel(Animator animator) {
                            TJCloseButton.this.setClickable(TJCloseButton.this.f21987c);
                            boolean unused = TJCloseButton.this.f21988d = false;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            TJCloseButton.this.setClickable(TJCloseButton.this.f21987c);
                            boolean unused = TJCloseButton.this.f21988d = false;
                        }
                    });
                }
            }, 2000);
        }
    }

    /* access modifiers changed from: package-private */
    public void setClickableRequested(boolean z) {
        this.f21987c = z;
        if (!this.f21988d) {
            setClickable(z);
        }
    }
}
