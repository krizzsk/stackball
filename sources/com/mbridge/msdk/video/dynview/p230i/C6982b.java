package com.mbridge.msdk.video.dynview.p230i;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.tools.C6347k;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.video.dynview.C6925b;
import com.mbridge.msdk.video.dynview.p218a.C6924a;
import com.mbridge.msdk.video.dynview.p226g.C6963b;
import com.mbridge.msdk.video.dynview.widget.MBridgeFramLayout;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.video.dynview.widget.MBridgeRelativeLayout;
import com.mbridge.msdk.video.dynview.widget.MBridgeTextView;
import com.mbridge.msdk.video.module.MBridgeClickCTAView;
import com.mbridge.msdk.video.widget.SoundImageView;

/* renamed from: com.mbridge.msdk.video.dynview.i.b */
/* compiled from: UIEnergizeWrapper */
public final class C6982b {

    /* renamed from: a */
    private String f17206a = "mbridge_top_play_bg";

    /* renamed from: b */
    private String f17207b = "mbridge_top_finger_bg";

    /* renamed from: c */
    private String f17208c = "mbridge_bottom_play_bg";

    /* renamed from: d */
    private String f17209d = "mbridge_bottom_finger_bg";

    /* renamed from: e */
    private String f17210e = "mbridge_tv_count";

    /* renamed from: f */
    private String f17211f = "mbridge_sound_switch";

    /* renamed from: g */
    private String f17212g = "mbridge_top_control";

    /* renamed from: h */
    private String f17213h = "mbridge_tv_title";

    /* renamed from: i */
    private String f17214i = "mbridge_tv_desc";

    /* renamed from: j */
    private String f17215j = "mbridge_tv_install";

    /* renamed from: k */
    private String f17216k = "mbridge_sv_starlevel";

    /* renamed from: l */
    private String f17217l = "mbridge_tv_cta";

    /* renamed from: m */
    private String f17218m = "mbridge_native_ec_controller";

    /* renamed from: n */
    private String f17219n = "mbridge_reward_shape_choice_rl";

    /* renamed from: a */
    public final void mo48501a(View view) {
        if (view != null && (view instanceof MBridgeFramLayout)) {
            MBridgeFramLayout mBridgeFramLayout = (MBridgeFramLayout) view;
            AnimatorSet animatorSet = new AnimatorSet();
            if (view.getContext() != null) {
                ImageView imageView = (ImageView) view.findViewById(m17612a(this.f17206a));
                ImageView imageView2 = (ImageView) view.findViewById(m17612a(this.f17207b));
                ImageView imageView3 = (ImageView) view.findViewById(m17612a(this.f17208c));
                ImageView imageView4 = (ImageView) view.findViewById(m17612a(this.f17209d));
                ObjectAnimator objectAnimator = null;
                ObjectAnimator a = imageView != null ? new C6963b().mo48471a(imageView) : null;
                ObjectAnimator b = imageView2 != null ? new C6963b().mo48475b(imageView2) : null;
                ObjectAnimator a2 = imageView3 != null ? new C6963b().mo48471a(imageView3) : null;
                if (imageView4 != null) {
                    objectAnimator = new C6963b().mo48475b(imageView4);
                }
                if (a != null && a2 != null && b != null && objectAnimator != null) {
                    animatorSet.playTogether(new Animator[]{a, a2, b, objectAnimator});
                    mBridgeFramLayout.setAnimatorSet(animatorSet);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo48502a(View view, C6925b bVar) {
        if (view != null) {
            Context context = view.getContext();
            if (context != null) {
                MBridgeTextView mBridgeTextView = (MBridgeTextView) view.findViewById(m17612a(this.f17210e));
                if (mBridgeTextView != null) {
                    mBridgeTextView.setRadius(C6366u.m16203b(context, 12.0f));
                    mBridgeTextView.setBackgroundColor(Color.parseColor("#60000000"));
                    mBridgeTextView.setTextColor(Color.parseColor("#ffFFFFFF"));
                    mBridgeTextView.setTextSize(11.0f);
                    mBridgeTextView.setStrokeData(C6366u.m16203b(context, 2.0f), Color.parseColor("#60e3eaec"));
                }
                SoundImageView soundImageView = (SoundImageView) view.findViewById(m17612a(this.f17211f));
                int b = C6366u.m16203b(context, 60.0f);
                int b2 = C6366u.m16203b(context, 10.0f);
                if (soundImageView != null) {
                    bVar.mo48424e();
                    ((RelativeLayout.LayoutParams) soundImageView.getLayoutParams()).setMargins(b2, 0, 0, b);
                }
                FrameLayout frameLayout = (FrameLayout) view.findViewById(m17612a(this.f17212g));
                int b3 = C6366u.m16203b(context, 10.0f);
                if (frameLayout != null) {
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    if (bVar.mo48424e() == 2) {
                        layoutParams.setMargins(C6924a.f17066a, b3, C6924a.f17066a, 0);
                    } else {
                        layoutParams.setMargins(b3, C6924a.f17066a, b3, 0);
                    }
                    frameLayout.setLayoutParams(layoutParams);
                }
            }
            if (bVar != null && bVar.mo48425f() != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) bVar.mo48425f().getLayoutParams();
                layoutParams2.setMargins(0, 0, 0, 0);
                bVar.mo48425f().setLayoutParams(layoutParams2);
            }
        }
    }

    /* renamed from: b */
    public final void mo48503b(View view, C6925b bVar) {
        Context context;
        int i;
        if (view != null && bVar != null && (context = view.getContext()) != null) {
            if (bVar.mo48424e() == 1) {
                view.setBackground(context.getResources().getDrawable(C6347k.m16084a(context, this.f17219n, "drawable")));
                TextView textView = (TextView) view.findViewById(m17612a(this.f17213h));
                if (textView != null) {
                    textView.setTextColor(Color.parseColor("#FF000000"));
                }
                TextView textView2 = (TextView) view.findViewById(m17612a(this.f17214i));
                if (textView2 != null) {
                    textView2.setTextColor(Color.parseColor("#FF000000"));
                }
                i = C6366u.m16203b(context, 2.0f);
            } else {
                i = C6366u.m16203b(context, 10.0f);
                view.getBackground().setAlpha(100);
            }
            int b = C6366u.m16203b(context, 8.0f);
            MBridgeTextView mBridgeTextView = (MBridgeTextView) view.findViewById(m17612a(this.f17215j));
            if (mBridgeTextView != null) {
                mBridgeTextView.setGradient(0, GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#ff99cc00"), Color.parseColor("#ff6d9b00")});
                mBridgeTextView.setTextColor(Color.parseColor("#FFFFFF"));
                mBridgeTextView.setRadius(C6366u.m16203b(context, 15.0f));
                mBridgeTextView.setTextSize(15.0f);
                mBridgeTextView.setSpacing(4.0f);
                if (bVar.mo48425f() != null && (bVar.mo48425f() instanceof MBridgeClickCTAView)) {
                    ((MBridgeClickCTAView) bVar.mo48425f()).setObjectAnimator(new C6963b().mo48477c(mBridgeTextView));
                }
            }
            if (view.getLayoutParams() == null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(i, i, i, b);
                layoutParams.height = C6366u.m16203b(context, 60.0f);
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: c */
    public final void mo48504c(View view, C6925b bVar) {
        if (view != null && bVar != null) {
            Context context = view.getContext();
            if (context != null) {
                MBridgeLevelLayoutView mBridgeLevelLayoutView = (MBridgeLevelLayoutView) view.findViewById(m17612a(this.f17216k));
                if (mBridgeLevelLayoutView != null) {
                    if (bVar.mo48424e() == 1) {
                        mBridgeLevelLayoutView.setOrientation(1);
                    } else {
                        mBridgeLevelLayoutView.setOrientation(0);
                    }
                }
                RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(m17612a(this.f17218m));
                int b = C6366u.m16203b(context, 10.0f);
                if (relativeLayout != null) {
                    if (bVar.mo48424e() == 1) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.setMargins(b, C6924a.f17066a, b, b);
                        relativeLayout.setLayoutParams(layoutParams);
                    } else {
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                        layoutParams2.setMargins(C6924a.f17066a, b, C6924a.f17066a, b);
                        relativeLayout.setLayoutParams(layoutParams2);
                    }
                }
                MBridgeTextView mBridgeTextView = (MBridgeTextView) view.findViewById(m17612a(this.f17217l));
                if (mBridgeTextView != null) {
                    mBridgeTextView.setGradient(0, GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#ff99cc00"), Color.parseColor("#ff6d9b00")});
                    mBridgeTextView.setStrokeData(C6366u.m16203b(context, 0.5f), Color.parseColor("#ff99cc00"));
                    mBridgeTextView.setTextColor(Color.parseColor("#FFFFFF"));
                    mBridgeTextView.setRadius(C6366u.m16203b(context, 25.0f));
                    mBridgeTextView.setTextSize(21.0f);
                    mBridgeTextView.setSpacing(5.0f);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new Animator[]{new C6963b().mo48477c(mBridgeTextView)});
                    if (view instanceof MBridgeFramLayout) {
                        ((MBridgeFramLayout) view).setAnimatorSet(animatorSet);
                    }
                    if (view instanceof MBridgeRelativeLayout) {
                        ((MBridgeRelativeLayout) view).setAnimatorSet(animatorSet);
                    }
                }
            }
            new C6963b().mo48478c(view, 500);
        }
    }

    /* renamed from: a */
    private int m17612a(String str) {
        return C6347k.m16084a(C6122a.m15302b().mo42895d(), str, "id");
    }
}
