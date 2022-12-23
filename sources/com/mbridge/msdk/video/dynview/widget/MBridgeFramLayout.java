package com.mbridge.msdk.video.dynview.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class MBridgeFramLayout extends FrameLayout {

    /* renamed from: a */
    private AnimatorSet f17220a;

    public MBridgeFramLayout(Context context) {
        super(context);
    }

    public MBridgeFramLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeFramLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.f17220a = animatorSet;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f17220a;
        if (animatorSet != null) {
            try {
                animatorSet.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f17220a;
        if (animatorSet != null) {
            try {
                animatorSet.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
