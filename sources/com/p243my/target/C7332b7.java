package com.p243my.target;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.p243my.target.common.models.ImageData;
import com.p243my.target.common.views.StarsRatingView;
import com.p243my.target.nativeads.views.MediaAdView;
import com.smaato.sdk.video.vast.model.ErrorCode;
import java.util.ArrayList;

/* renamed from: com.my.target.b7 */
public class C7332b7 extends ViewGroup {

    /* renamed from: a */
    public final TextView f18369a;

    /* renamed from: b */
    public final C7531l6 f18370b;

    /* renamed from: c */
    public final TextView f18371c;

    /* renamed from: d */
    public final LinearLayout f18372d;

    /* renamed from: e */
    public final StarsRatingView f18373e;

    /* renamed from: f */
    public final TextView f18374f;

    /* renamed from: g */
    public final TextView f18375g;

    /* renamed from: h */
    public final Button f18376h;

    /* renamed from: i */
    public final C7506k6 f18377i;

    /* renamed from: j */
    public final C7761y8 f18378j;

    /* renamed from: k */
    public final int f18379k;

    /* renamed from: l */
    public final int f18380l;

    /* renamed from: m */
    public final int f18381m;

    /* renamed from: com.my.target.b7$a */
    public class C7333a implements Animator.AnimatorListener {
        public C7333a() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            C7332b7.this.f18371c.setVisibility(8);
            C7332b7.this.f18369a.setVisibility(8);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.my.target.b7$b */
    public class C7334b implements Animator.AnimatorListener {
        public C7334b() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            if (C7332b7.this.f18372d.isEnabled()) {
                C7332b7.this.f18372d.setVisibility(8);
            }
            if (C7332b7.this.f18375g.isEnabled()) {
                C7332b7.this.f18375g.setVisibility(8);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public C7332b7(Context context, C7761y8 y8Var) {
        super(context);
        this.f18378j = y8Var;
        Button button = new Button(context);
        this.f18376h = button;
        C7761y8.m20947b(button, "cta_button");
        C7506k6 k6Var = new C7506k6(context);
        this.f18377i = k6Var;
        C7761y8.m20947b(k6Var, ViewHierarchyConstants.ICON_BITMAP);
        this.f18370b = new C7531l6(context);
        TextView textView = new TextView(context);
        this.f18369a = textView;
        C7761y8.m20947b(textView, "description_text");
        TextView textView2 = new TextView(context);
        this.f18371c = textView2;
        C7761y8.m20947b(textView2, "disclaimer_text");
        this.f18372d = new LinearLayout(context);
        StarsRatingView starsRatingView = new StarsRatingView(context);
        this.f18373e = starsRatingView;
        C7761y8.m20947b(starsRatingView, "stars_view");
        TextView textView3 = new TextView(context);
        this.f18374f = textView3;
        C7761y8.m20947b(textView3, "votes_text");
        TextView textView4 = new TextView(context);
        this.f18375g = textView4;
        C7761y8.m20947b(textView4, "domain_text");
        this.f18379k = y8Var.mo51902b(16);
        this.f18381m = y8Var.mo51902b(8);
        this.f18380l = y8Var.mo51902b(64);
    }

    /* renamed from: a */
    public void mo49751a() {
        setBackgroundColor(1711276032);
        this.f18369a.setTextColor(-2236963);
        this.f18369a.setEllipsize(TextUtils.TruncateAt.END);
        this.f18375g.setTextColor(-6710887);
        this.f18375g.setVisibility(8);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(1, -3355444);
        this.f18371c.setPadding(this.f18378j.mo51902b(4), this.f18378j.mo51902b(4), this.f18378j.mo51902b(4), this.f18378j.mo51902b(4));
        this.f18371c.setBackgroundDrawable(gradientDrawable);
        this.f18371c.setTextSize(2, 12.0f);
        this.f18371c.setTextColor(-3355444);
        this.f18371c.setVisibility(8);
        this.f18372d.setOrientation(0);
        this.f18372d.setGravity(16);
        this.f18372d.setVisibility(8);
        this.f18374f.setTextColor(-6710887);
        this.f18374f.setGravity(16);
        this.f18374f.setTextSize(2, 14.0f);
        this.f18376h.setPadding(this.f18378j.mo51902b(15), 0, this.f18378j.mo51902b(15), 0);
        this.f18376h.setMinimumWidth(this.f18378j.mo51902b(100));
        this.f18376h.setTransformationMethod((TransformationMethod) null);
        this.f18376h.setTextSize(2, 22.0f);
        this.f18376h.setMaxEms(10);
        this.f18376h.setSingleLine();
        this.f18376h.setEllipsize(TextUtils.TruncateAt.END);
        C7331b6 rightBorderedView = this.f18370b.getRightBorderedView();
        rightBorderedView.mo49746a(1, -7829368);
        rightBorderedView.setPadding(this.f18378j.mo51902b(2), 0, 0, 0);
        rightBorderedView.setTextColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
        rightBorderedView.mo49747a(1, MediaAdView.COLOR_PLACEHOLDER_GRAY, this.f18378j.mo51902b(3));
        rightBorderedView.setBackgroundColor(1711276032);
        this.f18373e.setStarSize(this.f18378j.mo51902b(12));
        this.f18372d.addView(this.f18373e);
        this.f18372d.addView(this.f18374f);
        this.f18372d.setVisibility(8);
        this.f18375g.setVisibility(8);
        addView(this.f18370b);
        addView(this.f18372d);
        addView(this.f18375g);
        addView(this.f18369a);
        addView(this.f18371c);
        addView(this.f18377i);
        addView(this.f18376h);
    }

    /* renamed from: a */
    public final void mo49752a(int i, View... viewArr) {
        int height = this.f18377i.getHeight();
        int height2 = getHeight();
        int width = this.f18376h.getWidth();
        int height3 = this.f18376h.getHeight();
        int width2 = this.f18377i.getWidth();
        this.f18377i.setPivotX(0.0f);
        this.f18377i.setPivotY(((float) height) / 2.0f);
        this.f18376h.setPivotX((float) width);
        this.f18376h.setPivotY(((float) height3) / 2.0f);
        float f = ((float) height2) * 0.3f;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f18376h, View.SCALE_X, new float[]{0.7f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f18376h, View.SCALE_Y, new float[]{0.7f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f18377i, View.SCALE_X, new float[]{0.7f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f18377i, View.SCALE_Y, new float[]{0.7f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f18369a, View.ALPHA, new float[]{0.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f18371c, View.ALPHA, new float[]{0.0f}));
        if (this.f18372d.isEnabled()) {
            arrayList.add(ObjectAnimator.ofFloat(this.f18372d, View.ALPHA, new float[]{1.0f}));
        }
        arrayList.add(ObjectAnimator.ofFloat(this, View.ALPHA, new float[]{0.6f}));
        float f2 = -(((float) width2) * 0.3f);
        arrayList.add(ObjectAnimator.ofFloat(this.f18370b, View.TRANSLATION_X, new float[]{f2}));
        arrayList.add(ObjectAnimator.ofFloat(this.f18372d, View.TRANSLATION_X, new float[]{f2}));
        arrayList.add(ObjectAnimator.ofFloat(this.f18375g, View.TRANSLATION_X, new float[]{f2}));
        arrayList.add(ObjectAnimator.ofFloat(this.f18369a, View.TRANSLATION_X, new float[]{f2}));
        arrayList.add(ObjectAnimator.ofFloat(this.f18371c, View.TRANSLATION_X, new float[]{f2}));
        arrayList.add(ObjectAnimator.ofFloat(this, View.TRANSLATION_Y, new float[]{f}));
        float f3 = (-f) / 2.0f;
        arrayList.add(ObjectAnimator.ofFloat(this.f18376h, View.TRANSLATION_Y, new float[]{f3}));
        arrayList.add(ObjectAnimator.ofFloat(this.f18377i, View.TRANSLATION_Y, new float[]{f3}));
        for (View ofFloat : viewArr) {
            arrayList.add(ObjectAnimator.ofFloat(ofFloat, View.TRANSLATION_Y, new float[]{f}));
        }
        if (this.f18372d.isEnabled()) {
            this.f18372d.setVisibility(0);
        }
        if (this.f18375g.isEnabled()) {
            this.f18375g.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new C7333a());
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration((long) i);
        animatorSet.start();
    }

    /* renamed from: a */
    public void mo49753a(C7631r1 r1Var, View.OnClickListener onClickListener) {
        if (r1Var.f19290o) {
            setOnClickListener(onClickListener);
            this.f18376h.setOnClickListener(onClickListener);
            return;
        }
        if (r1Var.f19284i) {
            this.f18376h.setOnClickListener(onClickListener);
        } else {
            this.f18376h.setEnabled(false);
        }
        if (r1Var.f19289n) {
            setOnClickListener(onClickListener);
        } else {
            setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f19278c) {
            this.f18370b.getLeftText().setOnClickListener(onClickListener);
        } else {
            this.f18370b.getLeftText().setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f19285j) {
            this.f18370b.getRightBorderedView().setOnClickListener(onClickListener);
        } else {
            this.f18370b.getRightBorderedView().setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f19280e) {
            this.f18377i.setOnClickListener(onClickListener);
        } else {
            this.f18377i.setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f19279d) {
            this.f18369a.setOnClickListener(onClickListener);
        } else {
            this.f18369a.setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f19282g) {
            this.f18373e.setOnClickListener(onClickListener);
        } else {
            this.f18373e.setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f19283h) {
            this.f18374f.setOnClickListener(onClickListener);
        } else {
            this.f18374f.setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f19287l) {
            this.f18375g.setOnClickListener(onClickListener);
        } else {
            this.f18375g.setOnClickListener((View.OnClickListener) null);
        }
    }

    /* renamed from: a */
    public void mo49754a(View... viewArr) {
        if (getVisibility() == 0) {
            mo49752a((int) ErrorCode.GENERAL_WRAPPER_ERROR, viewArr);
        }
    }

    /* renamed from: b */
    public void mo49755b(View... viewArr) {
        if (getVisibility() == 0) {
            mo49757d(viewArr);
        }
    }

    /* renamed from: c */
    public final void mo49756c(View... viewArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f18376h, View.SCALE_Y, new float[]{1.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f18376h, View.SCALE_X, new float[]{1.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f18377i, View.SCALE_Y, new float[]{1.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f18377i, View.SCALE_X, new float[]{1.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f18369a, View.ALPHA, new float[]{1.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f18371c, View.ALPHA, new float[]{1.0f}));
        if (this.f18372d.isEnabled()) {
            arrayList.add(ObjectAnimator.ofFloat(this.f18372d, View.ALPHA, new float[]{0.0f}));
        }
        arrayList.add(ObjectAnimator.ofFloat(this, View.ALPHA, new float[]{1.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f18370b, View.TRANSLATION_X, new float[]{0.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f18372d, View.TRANSLATION_X, new float[]{0.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f18375g, View.TRANSLATION_X, new float[]{0.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f18369a, View.TRANSLATION_X, new float[]{0.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f18371c, View.TRANSLATION_X, new float[]{0.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this, View.TRANSLATION_Y, new float[]{0.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f18376h, View.TRANSLATION_Y, new float[]{0.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f18377i, View.TRANSLATION_Y, new float[]{0.0f}));
        for (View ofFloat : viewArr) {
            arrayList.add(ObjectAnimator.ofFloat(ofFloat, View.TRANSLATION_Y, new float[]{0.0f}));
        }
        if (!TextUtils.isEmpty(this.f18371c.getText().toString())) {
            this.f18371c.setVisibility(0);
        }
        this.f18369a.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new C7334b());
        animatorSet.setDuration(300);
        animatorSet.start();
    }

    /* renamed from: d */
    public final void mo49757d(View... viewArr) {
        mo49752a(0, viewArr);
    }

    /* renamed from: e */
    public void mo49758e(View... viewArr) {
        mo49756c(viewArr);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredHeight2 = this.f18377i.getMeasuredHeight();
        int measuredWidth2 = this.f18377i.getMeasuredWidth();
        int i5 = (measuredHeight - measuredHeight2) / 2;
        C7506k6 k6Var = this.f18377i;
        int i6 = this.f18379k;
        k6Var.layout(i6, i5, i6 + measuredWidth2, measuredHeight2 + i5);
        int measuredWidth3 = this.f18376h.getMeasuredWidth();
        int measuredHeight3 = this.f18376h.getMeasuredHeight();
        int i7 = (measuredHeight - measuredHeight3) / 2;
        int i8 = this.f18379k;
        this.f18376h.layout((measuredWidth - measuredWidth3) - i8, i7, measuredWidth - i8, measuredHeight3 + i7);
        int i9 = this.f18379k;
        int i10 = measuredWidth2 + i9 + i9;
        C7531l6 l6Var = this.f18370b;
        l6Var.layout(i10, this.f18381m, l6Var.getMeasuredWidth() + i10, this.f18381m + this.f18370b.getMeasuredHeight());
        this.f18372d.layout(i10, this.f18370b.getBottom(), this.f18372d.getMeasuredWidth() + i10, this.f18370b.getBottom() + this.f18372d.getMeasuredHeight());
        this.f18375g.layout(i10, this.f18370b.getBottom(), this.f18375g.getMeasuredWidth() + i10, this.f18370b.getBottom() + this.f18375g.getMeasuredHeight());
        this.f18369a.layout(i10, this.f18370b.getBottom(), this.f18369a.getMeasuredWidth() + i10, this.f18370b.getBottom() + this.f18369a.getMeasuredHeight());
        this.f18371c.layout(i10, this.f18369a.getBottom(), this.f18371c.getMeasuredWidth() + i10, this.f18369a.getBottom() + this.f18371c.getMeasuredHeight());
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = size - (this.f18379k * 2);
        int size2 = (View.MeasureSpec.getSize(i2) / 4) - (this.f18381m * 2);
        int min = Math.min(size2, this.f18380l);
        this.f18377i.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        this.f18376h.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(min - (this.f18381m * 2), 1073741824));
        int measuredWidth = ((i3 - this.f18377i.getMeasuredWidth()) - this.f18376h.getMeasuredWidth()) - (this.f18379k * 2);
        this.f18370b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        this.f18372d.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        this.f18375g.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        this.f18369a.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2 - this.f18370b.getMeasuredHeight(), Integer.MIN_VALUE));
        this.f18371c.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int measuredHeight = this.f18370b.getMeasuredHeight() + Math.max(this.f18369a.getMeasuredHeight(), this.f18372d.getMeasuredHeight()) + (this.f18381m * 2);
        if (this.f18371c.getVisibility() == 0) {
            measuredHeight += this.f18371c.getMeasuredHeight();
        }
        setMeasuredDimension(size, Math.max(this.f18376h.getMeasuredHeight(), Math.max(this.f18377i.getMeasuredHeight(), measuredHeight)) + (this.f18381m * 2));
    }

    public void setBanner(C7399f2 f2Var) {
        this.f18370b.getLeftText().setText(f2Var.getTitle());
        this.f18369a.setText(f2Var.getDescription());
        String disclaimer = f2Var.getDisclaimer();
        if (!TextUtils.isEmpty(disclaimer)) {
            this.f18371c.setVisibility(0);
            this.f18371c.setText(disclaimer);
        } else {
            this.f18371c.setVisibility(8);
        }
        ImageData icon = f2Var.getIcon();
        if (icon != null) {
            this.f18377i.setVisibility(0);
            this.f18377i.setImageData(icon);
        } else {
            this.f18377i.setVisibility(8);
        }
        this.f18376h.setText(f2Var.getCtaText());
        if (!"".equals(f2Var.getAgeRestrictions())) {
            this.f18370b.getRightBorderedView().setText(f2Var.getAgeRestrictions());
        } else {
            this.f18370b.getRightBorderedView().setVisibility(8);
        }
        C7761y8.m20946b(this.f18376h, -16733198, -16746839, this.f18378j.mo51902b(2));
        this.f18376h.setTextColor(-1);
        if ("store".equals(f2Var.getNavigationType())) {
            if (f2Var.getVotes() == 0 || f2Var.getRating() <= 0.0f) {
                this.f18372d.setEnabled(false);
                this.f18372d.setVisibility(8);
            } else {
                this.f18372d.setEnabled(true);
                this.f18373e.setRating(f2Var.getRating());
                this.f18374f.setText(String.valueOf(f2Var.getVotes()));
            }
            this.f18375g.setEnabled(false);
        } else {
            String domain = f2Var.getDomain();
            if (!TextUtils.isEmpty(domain)) {
                this.f18375g.setEnabled(true);
                this.f18375g.setText(domain);
            } else {
                this.f18375g.setEnabled(false);
                this.f18375g.setVisibility(8);
            }
            this.f18372d.setEnabled(false);
        }
        if (f2Var.getVideoBanner() == null || !f2Var.getVideoBanner().isAutoPlay()) {
            this.f18372d.setVisibility(8);
            this.f18375g.setVisibility(8);
        }
    }
}
