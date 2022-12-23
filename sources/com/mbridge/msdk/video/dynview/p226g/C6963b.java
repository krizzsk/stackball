package com.mbridge.msdk.video.dynview.p226g;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.foundation.tools.C6366u;

/* renamed from: com.mbridge.msdk.video.dynview.g.b */
/* compiled from: MBridgeUIAnim */
public final class C6963b {
    /* renamed from: a */
    public final void mo48474a(final View view, long j) {
        ValueAnimator valueAnimator;
        int h = (int) ((float) C6366u.m16224h(view.getContext().getApplicationContext()));
        if (view.getLayoutParams().width == 0) {
            valueAnimator = ValueAnimator.ofInt(new int[]{0, h});
        } else {
            valueAnimator = ValueAnimator.ofInt(new int[]{h, 0});
        }
        valueAnimator.setDuration(j);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.setLayoutParams(layoutParams);
            }
        });
        valueAnimator.start();
    }

    /* renamed from: b */
    public final void mo48476b(final View view, long j) {
        if (view != null) {
            view.setAlpha(1.0f);
            view.animate().alpha(0.0f).setDuration(j).setListener(new Animator.AnimatorListener() {
                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    View view = view;
                    if (view != null && (view instanceof ViewGroup)) {
                        ((ViewGroup) view).removeAllViews();
                    }
                }

                public final void onAnimationCancel(Animator animator) {
                    View view = view;
                    if (view != null && (view instanceof ViewGroup)) {
                        ((ViewGroup) view).removeAllViews();
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public final void mo48478c(View view, long j) {
        if (view != null) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).setDuration(j);
        }
    }

    /* renamed from: a */
    public final void mo48473a(final View view, int i, int i2, long j) {
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{i, i2}).setDuration(j);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setPadding(0, 0, 0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                view.requestLayout();
            }
        });
        duration.start();
    }

    /* renamed from: a */
    public final void mo48472a(final View view, int i, int i2, int i3, int i4, long j) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view = view;
                if (view != null) {
                    view.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    view.requestLayout();
                }
            }
        });
        ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{i3, i4});
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view = view;
                if (view != null) {
                    view.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    view.requestLayout();
                    if (view.getVisibility() != 0) {
                        view.setVisibility(0);
                    }
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofInt, ofInt2});
        animatorSet.setDuration(j);
        animatorSet.start();
    }

    /* renamed from: a */
    private PropertyValuesHolder m17567a(Property property, float f) {
        float f2 = f - 0.2f;
        float f3 = f + 0.3f;
        return PropertyValuesHolder.ofKeyframe(property, new Keyframe[]{Keyframe.ofFloat(0.0f, f), Keyframe.ofFloat(0.1f, f - 0.4f), Keyframe.ofFloat(0.2f, f2), Keyframe.ofFloat(0.3f, f3), Keyframe.ofFloat(0.4f, f2), Keyframe.ofFloat(0.5f, f3), Keyframe.ofFloat(0.6f, f - 0.1f), Keyframe.ofFloat(0.7f, f3), Keyframe.ofFloat(0.8f, f), Keyframe.ofFloat(0.9f, 0.1f + f), Keyframe.ofFloat(1.0f, f)});
    }

    /* renamed from: b */
    private PropertyValuesHolder m17568b(Property property, float f) {
        float f2 = -2.0f * f;
        float f3 = f * 2.0f;
        return PropertyValuesHolder.ofKeyframe(property, new Keyframe[]{Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.1f, f2), Keyframe.ofFloat(0.2f, f2), Keyframe.ofFloat(0.3f, f3), Keyframe.ofFloat(0.4f, f2), Keyframe.ofFloat(0.5f, f3), Keyframe.ofFloat(0.6f, f2), Keyframe.ofFloat(0.7f, f3), Keyframe.ofFloat(0.8f, f2), Keyframe.ofFloat(0.9f, f3), Keyframe.ofFloat(1.0f, 0.0f)});
    }

    /* renamed from: c */
    private PropertyValuesHolder m17569c(Property property, float f) {
        float f2 = f - 0.4f;
        return PropertyValuesHolder.ofKeyframe(property, new Keyframe[]{Keyframe.ofFloat(0.0f, f), Keyframe.ofFloat(0.1f, f2), Keyframe.ofFloat(0.2f, f2), Keyframe.ofFloat(0.3f, f), Keyframe.ofFloat(0.4f, f), Keyframe.ofFloat(0.5f, f), Keyframe.ofFloat(0.6f, f), Keyframe.ofFloat(0.7f, f), Keyframe.ofFloat(0.8f, f), Keyframe.ofFloat(0.9f, f), Keyframe.ofFloat(1.0f, f)});
    }

    /* renamed from: a */
    public final ObjectAnimator mo48471a(View view) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{m17567a(View.SCALE_X, 1.0f), m17567a(View.SCALE_Y, 1.0f), m17568b(View.ROTATION_X, 5.0f)}).setDuration(2000);
        duration.setRepeatCount(-1);
        return duration;
    }

    /* renamed from: b */
    public final ObjectAnimator mo48475b(View view) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{m17569c(View.SCALE_X, 1.0f), m17569c(View.SCALE_Y, 1.0f)}).setDuration(2000);
        duration.setRepeatCount(-1);
        return duration;
    }

    /* renamed from: c */
    public final ObjectAnimator mo48477c(View view) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{m17568b(View.ROTATION, 2.0f)}).setDuration(900);
        duration.setRepeatCount(-1);
        return duration;
    }
}
