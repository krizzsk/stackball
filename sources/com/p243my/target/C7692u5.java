package com.p243my.target;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p243my.target.common.models.ImageData;

/* renamed from: com.my.target.u5 */
public class C7692u5 extends LinearLayout {

    /* renamed from: a */
    public final TextView f19488a;

    /* renamed from: b */
    public final C7506k6 f19489b;

    public C7692u5(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.f19488a = textView;
        C7506k6 k6Var = new C7506k6(context);
        this.f19489b = k6Var;
        C7761y8 c = C7761y8.m20950c(context);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1157627904, -1157627904});
        gradientDrawable.setStroke(c.mo51901a(1.0f), -1157627904);
        gradientDrawable.setCornerRadius((float) c.mo51901a(10.0f));
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1157627904, -1157627904});
        gradientDrawable2.setStroke(c.mo51901a(1.0f), -1157627904);
        gradientDrawable2.setCornerRadius((float) c.mo51901a(10.0f));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
        int b = c.mo51902b(6);
        int b2 = c.mo51902b(12);
        textView.setTextColor(-1);
        textView.setTextSize(18.0f);
        textView.setMaxLines(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int a = C7761y8.m20931a(32, context);
        setPadding(b2, b, b2, b);
        setBackgroundDrawable(stateListDrawable);
        setGravity(16);
        setOrientation(0);
        C7761y8.m20947b(k6Var, "ctc_icon");
        addView(k6Var, a, a);
        C7761y8.m20947b(textView, "ctc_text");
        addView(textView, new LinearLayout.LayoutParams(-2, -2));
    }

    /* renamed from: a */
    public void mo51680a(String str, ImageData imageData) {
        this.f19488a.setText(str);
        this.f19489b.setImageData(imageData);
        ((LinearLayout.LayoutParams) this.f19488a.getLayoutParams()).leftMargin = imageData == null ? 0 : C7761y8.m20931a(4, getContext()) * 2;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
