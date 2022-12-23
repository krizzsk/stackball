package com.p243my.target.nativeads.views;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.p243my.target.C7296R;
import com.p243my.target.C7331b6;
import com.p243my.target.C7374e0;
import com.p243my.target.C7725w8;
import com.p243my.target.C7761y8;
import com.p243my.target.common.views.StarsRatingView;
import com.p243my.target.nativeads.banners.NativeBanner;

/* renamed from: com.my.target.nativeads.views.NativeBannerAdView */
public class NativeBannerAdView extends ViewGroup {
    private static final int STANDARD_BLUE = -16748844;
    private static final int STANDARD_GREY = -6710887;
    private final int adChoicesHeight;
    private final TextView advertTextView;
    private final int advertisingLabelLeftMargin;
    private final TextView ageTextView;
    private final LinearLayout centerLayout;
    private final Button ctaButton;
    private final int ctaHeight;
    private final TextView disclaimerTextView;
    private final IconAdView iconAdView;
    private final int iconDimensions;
    private final int innerMargins;
    private final StarsRatingView ratingView;
    private final int smallMargin;
    private final TextView titleTextView;
    private final LinearLayout topLayout;
    private final TextView urlTextView;
    private final TextView votesTextView;

    public NativeBannerAdView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NativeBannerAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NativeBannerAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C7331b6 b6Var = new C7331b6(context2);
        this.ageTextView = b6Var;
        TextView textView = new TextView(context2);
        this.advertTextView = textView;
        IconAdView iconAdView2 = new IconAdView(context2);
        this.iconAdView = iconAdView2;
        TextView textView2 = new TextView(context2);
        this.titleTextView = textView2;
        TextView textView3 = new TextView(context2);
        this.urlTextView = textView3;
        StarsRatingView starsRatingView = new StarsRatingView(context2);
        this.ratingView = starsRatingView;
        TextView textView4 = new TextView(context2);
        this.votesTextView = textView4;
        TextView textView5 = new TextView(context2);
        this.disclaimerTextView = textView5;
        Button button = new Button(context2);
        this.ctaButton = button;
        LinearLayout linearLayout = new LinearLayout(context2);
        this.centerLayout = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.topLayout = linearLayout2;
        LinearLayout linearLayout3 = new LinearLayout(context2);
        C7761y8 c = C7761y8.m20950c(context);
        setId(C7296R.C7297id.nativeads_ad_view);
        b6Var.setId(C7296R.C7297id.nativeads_age_restrictions);
        textView.setId(C7296R.C7297id.nativeads_advertising);
        iconAdView2.setId(C7296R.C7297id.nativeads_icon);
        textView2.setId(C7296R.C7297id.nativeads_title);
        textView3.setId(C7296R.C7297id.nativeads_domain);
        starsRatingView.setId(C7296R.C7297id.nativeads_rating);
        textView4.setId(C7296R.C7297id.nativeads_votes);
        textView5.setId(C7296R.C7297id.nativeads_disclaimer);
        button.setId(C7296R.C7297id.nativeads_call_to_action);
        C7761y8.m20947b(textView4, "votes_text");
        int b = c.mo51902b(4);
        setPadding(b, b, b, b);
        IconAdView iconAdView3 = iconAdView2;
        this.smallMargin = c.mo51902b(2);
        int b2 = c.mo51902b(4);
        this.advertisingLabelLeftMargin = b2;
        this.iconDimensions = c.mo51902b(54);
        this.adChoicesHeight = c.mo51902b(20);
        int b3 = c.mo51902b(12);
        LinearLayout linearLayout4 = linearLayout3;
        int b4 = c.mo51902b(10);
        this.ctaHeight = c.mo51902b(40);
        LinearLayout linearLayout5 = linearLayout;
        this.innerMargins = c.mo51902b(4);
        button.setPadding(b4, 0, b4, 0);
        button.setTransformationMethod((TransformationMethod) null);
        button.setMaxEms(8);
        button.setLines(1);
        button.setEllipsize(TextUtils.TruncateAt.END);
        button.setTextColor(STANDARD_BLUE);
        button.setTextSize(2, 16.0f);
        C7761y8.m20936a((View) this, -1, -3806472);
        LinearLayout linearLayout6 = linearLayout2;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, 0});
        gradientDrawable.setStroke(c.mo51901a(1.5f), STANDARD_BLUE);
        gradientDrawable.setCornerRadius((float) c.mo51902b(2));
        StarsRatingView starsRatingView2 = starsRatingView;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-3806472, -3806472});
        gradientDrawable2.setStroke(c.mo51901a(1.5f), STANDARD_BLUE);
        gradientDrawable2.setCornerRadius((float) c.mo51902b(2));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
        if (Build.VERSION.SDK_INT >= 16) {
            button.setBackground(stateListDrawable);
        } else {
            button.setBackgroundDrawable(stateListDrawable);
        }
        setClickable(true);
        b6Var.setTextColor(STANDARD_GREY);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(0);
        gradientDrawable3.setStroke(1, -13421773);
        int b5 = c.mo51902b(2);
        b6Var.setBackgroundDrawable(gradientDrawable3);
        b6Var.setGravity(17);
        b6Var.setPadding(b5, 0, 0, 0);
        b6Var.setBackgroundColor(0);
        b6Var.setMaxEms(10);
        b6Var.setLines(1);
        b6Var.setTextSize(2, 10.0f);
        textView.setTextSize(2, 10.0f);
        textView.setTextColor(STANDARD_GREY);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(b2, 0, 0, 0);
        textView2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView2.setTextSize(2, 16.0f);
        textView2.setTypeface((Typeface) null, 1);
        textView2.setMaxLines(2);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setTextColor(STANDARD_GREY);
        textView3.setTextSize(2, 14.0f);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setIncludeFontPadding(false);
        textView4.setTextColor(STANDARD_GREY);
        textView4.setTextSize(2, 12.0f);
        textView4.setLines(1);
        textView4.setEllipsize(TextUtils.TruncateAt.END);
        textView4.setPadding(c.mo51902b(4), 0, 0, 0);
        textView5.setTextColor(STANDARD_GREY);
        textView5.setTextSize(2, 12.0f);
        textView5.setMaxLines(2);
        textView5.setEllipsize(TextUtils.TruncateAt.END);
        StarsRatingView starsRatingView3 = starsRatingView2;
        starsRatingView3.setStarSize(b3);
        LinearLayout linearLayout7 = linearLayout6;
        linearLayout7.setOrientation(0);
        linearLayout7.setGravity(16);
        LinearLayout linearLayout8 = linearLayout5;
        linearLayout8.setOrientation(1);
        LinearLayout linearLayout9 = linearLayout4;
        linearLayout9.setOrientation(0);
        linearLayout9.setGravity(16);
        addView(iconAdView3);
        addView(button);
        addView(linearLayout8);
        addView(linearLayout7);
        linearLayout7.addView(b6Var);
        linearLayout7.addView(textView);
        linearLayout8.addView(textView2);
        linearLayout8.addView(linearLayout9);
        linearLayout8.addView(textView5);
        linearLayout9.addView(textView3);
        linearLayout9.addView(starsRatingView3);
        linearLayout9.addView(textView4);
        C7725w8.m20771f();
    }

    private void setText(String str, TextView textView) {
        int i;
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public TextView getAdvertisingTextView() {
        return this.advertTextView;
    }

    public TextView getAgeRestrictionTextView() {
        return this.ageTextView;
    }

    public Button getCtaButtonView() {
        return this.ctaButton;
    }

    public TextView getDisclaimerTextView() {
        return this.disclaimerTextView;
    }

    public TextView getDomainTextView() {
        return this.urlTextView;
    }

    public IconAdView getIconImageView() {
        return this.iconAdView;
    }

    public StarsRatingView getStarsRatingView() {
        return this.ratingView;
    }

    public TextView getTitleTextView() {
        return this.titleTextView;
    }

    public TextView getVotesTextView() {
        return this.votesTextView;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        C7761y8.m20951c(this.topLayout, paddingTop, paddingLeft);
        int a = C7761y8.m20933a(this.iconAdView.getMeasuredHeight(), this.centerLayout.getMeasuredHeight(), this.ctaButton.getMeasuredHeight());
        int bottom = this.topLayout.getBottom() + this.innerMargins;
        int a2 = ((C7761y8.m20933a(this.iconAdView.getMeasuredHeight(), this.centerLayout.getMeasuredHeight()) - this.ctaButton.getMeasuredHeight()) / 2) + this.topLayout.getMeasuredHeight();
        int i5 = this.adChoicesHeight;
        if (a2 < i5) {
            bottom = paddingTop + i5;
        }
        C7761y8.m20951c(this.iconAdView, ((a - this.iconAdView.getMeasuredHeight()) / 2) + bottom, paddingLeft);
        C7761y8.m20945b(this.ctaButton, ((a - this.ctaButton.getMeasuredHeight()) / 2) + bottom, getMeasuredWidth() - getPaddingRight());
        C7761y8.m20951c(this.centerLayout, bottom + ((a - this.centerLayout.getMeasuredHeight()) / 2), C7761y8.m20933a(this.iconAdView.getRight() + this.innerMargins, paddingLeft));
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        C7761y8.m20937a(this.topLayout, paddingLeft - this.advertisingLabelLeftMargin, paddingTop, Integer.MIN_VALUE);
        this.iconAdView.measure(View.MeasureSpec.makeMeasureSpec(this.iconDimensions, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.iconDimensions, Integer.MIN_VALUE));
        this.ctaButton.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.ctaHeight, 1073741824));
        C7761y8.m20937a(this.centerLayout, ((paddingLeft - this.iconAdView.getMeasuredWidth()) - this.ctaButton.getMeasuredWidth()) - (this.innerMargins * 2), (paddingTop - this.topLayout.getMeasuredHeight()) - this.smallMargin, Integer.MIN_VALUE);
        int measuredHeight = this.topLayout.getMeasuredHeight() + this.innerMargins;
        int a = ((C7761y8.m20933a(this.iconAdView.getMeasuredHeight(), this.centerLayout.getMeasuredHeight()) - this.ctaButton.getMeasuredHeight()) / 2) + this.topLayout.getMeasuredHeight();
        int i3 = this.adChoicesHeight;
        if (a < i3) {
            measuredHeight = i3;
        }
        setMeasuredDimension(size, measuredHeight + C7761y8.m20933a(this.centerLayout.getMeasuredHeight(), this.iconAdView.getMeasuredHeight(), this.ctaButton.getMeasuredHeight()) + getPaddingTop() + getPaddingBottom());
    }

    public void setupView(NativeBanner nativeBanner) {
        if (nativeBanner != null) {
            C7374e0.m18989a("Setup banner");
            if (nativeBanner.getIcon() != null) {
                this.iconAdView.setVisibility(0);
            } else {
                this.iconAdView.setVisibility(8);
            }
            if ("web".equals(nativeBanner.getNavigationType())) {
                setText(nativeBanner.getDomain(), this.urlTextView);
                this.ratingView.setVisibility(8);
                this.votesTextView.setVisibility(8);
            } else if ("store".equals(nativeBanner.getNavigationType())) {
                if (nativeBanner.getRating() <= 0.0f || nativeBanner.getRating() > 5.0f) {
                    this.ratingView.setVisibility(8);
                } else {
                    this.ratingView.setRating(nativeBanner.getRating());
                    this.ratingView.setVisibility(0);
                    setText(String.valueOf(nativeBanner.getVotes()), this.votesTextView);
                    this.urlTextView.setVisibility(8);
                    if (nativeBanner.getVotes() > 0) {
                        this.votesTextView.setVisibility(0);
                    } else {
                        this.votesTextView.setVisibility(8);
                    }
                    C7761y8.m20947b(this.votesTextView, "votes_text");
                }
            }
            setText(nativeBanner.getTitle(), this.titleTextView);
            setText(nativeBanner.getAdvertisingLabel(), this.advertTextView);
            setText(nativeBanner.getCtaText(), this.ctaButton);
            setText(nativeBanner.getAgeRestrictions(), this.ageTextView);
            setText(nativeBanner.getDisclaimer(), this.disclaimerTextView);
        }
    }
}
