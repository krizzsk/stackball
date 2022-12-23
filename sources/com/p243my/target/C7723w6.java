package com.p243my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.p243my.target.common.views.StarsRatingView;
import java.util.HashMap;

/* renamed from: com.my.target.w6 */
public class C7723w6 extends FrameLayout implements View.OnTouchListener {

    /* renamed from: a */
    public final TextView f19559a;

    /* renamed from: b */
    public final TextView f19560b;

    /* renamed from: c */
    public final TextView f19561c;

    /* renamed from: d */
    public final LinearLayout f19562d;

    /* renamed from: e */
    public final LinearLayout f19563e;

    /* renamed from: f */
    public final TextView f19564f;

    /* renamed from: g */
    public final StarsRatingView f19565g;

    /* renamed from: h */
    public final TextView f19566h;

    /* renamed from: i */
    public final C7761y8 f19567i;

    /* renamed from: j */
    public final boolean f19568j;

    /* renamed from: k */
    public final HashMap<View, Boolean> f19569k = new HashMap<>();

    /* renamed from: l */
    public String f19570l;

    /* renamed from: m */
    public View.OnClickListener f19571m;

    public C7723w6(Context context, C7761y8 y8Var, boolean z) {
        super(context);
        TextView textView = new TextView(context);
        this.f19559a = textView;
        this.f19560b = new TextView(context);
        TextView textView2 = new TextView(context);
        this.f19561c = textView2;
        this.f19562d = new LinearLayout(context);
        TextView textView3 = new TextView(context);
        this.f19564f = textView3;
        StarsRatingView starsRatingView = new StarsRatingView(context);
        this.f19565g = starsRatingView;
        TextView textView4 = new TextView(context);
        this.f19566h = textView4;
        this.f19563e = new LinearLayout(context);
        C7761y8.m20947b(textView, "title_text");
        C7761y8.m20947b(textView2, "description_text");
        C7761y8.m20947b(textView3, "disclaimer_text");
        C7761y8.m20947b(starsRatingView, "stars_view");
        C7761y8.m20947b(textView4, "votes_text");
        this.f19567i = y8Var;
        this.f19568j = z;
    }

    /* renamed from: a */
    public void mo51800a(C7631r1 r1Var, View.OnClickListener onClickListener) {
        HashMap<View, Boolean> hashMap;
        boolean z;
        TextView textView;
        if (r1Var.f19290o) {
            setOnClickListener(onClickListener);
            C7761y8.m20936a((View) this, -1, -3806472);
            return;
        }
        this.f19571m = onClickListener;
        this.f19559a.setOnTouchListener(this);
        this.f19560b.setOnTouchListener(this);
        this.f19561c.setOnTouchListener(this);
        this.f19565g.setOnTouchListener(this);
        this.f19566h.setOnTouchListener(this);
        setOnTouchListener(this);
        this.f19569k.put(this.f19559a, Boolean.valueOf(r1Var.f19278c));
        if ("store".equals(this.f19570l)) {
            hashMap = this.f19569k;
            textView = this.f19560b;
            z = r1Var.f19288m;
        } else {
            hashMap = this.f19569k;
            textView = this.f19560b;
            z = r1Var.f19287l;
        }
        hashMap.put(textView, Boolean.valueOf(z));
        this.f19569k.put(this.f19561c, Boolean.valueOf(r1Var.f19279d));
        this.f19569k.put(this.f19565g, Boolean.valueOf(r1Var.f19282g));
        this.f19569k.put(this.f19566h, Boolean.valueOf(r1Var.f19283h));
        this.f19569k.put(this, Boolean.valueOf(r1Var.f19289n));
    }

    /* renamed from: a */
    public void mo51801a(boolean z) {
        int i;
        int i2;
        this.f19563e.setOrientation(1);
        this.f19563e.setGravity(1);
        this.f19559a.setGravity(1);
        this.f19559a.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.leftMargin = this.f19567i.mo51902b(8);
        layoutParams.rightMargin = this.f19567i.mo51902b(8);
        this.f19559a.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        this.f19560b.setLayoutParams(layoutParams2);
        this.f19560b.setLines(1);
        this.f19560b.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        this.f19561c.setGravity(1);
        this.f19561c.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        if (z) {
            this.f19561c.setTextSize(2, 12.0f);
            this.f19561c.setLines(2);
            this.f19561c.setEllipsize(TextUtils.TruncateAt.END);
            layoutParams3.topMargin = 0;
            layoutParams3.leftMargin = this.f19567i.mo51902b(4);
            i = this.f19567i.mo51902b(4);
        } else {
            this.f19561c.setTextSize(2, 16.0f);
            layoutParams3.topMargin = this.f19567i.mo51902b(8);
            layoutParams3.leftMargin = this.f19567i.mo51902b(16);
            i = this.f19567i.mo51902b(16);
        }
        layoutParams3.rightMargin = i;
        layoutParams3.gravity = 1;
        this.f19561c.setLayoutParams(layoutParams3);
        this.f19562d.setOrientation(0);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        this.f19562d.setLayoutParams(layoutParams4);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(this.f19567i.mo51902b(73), this.f19567i.mo51902b(12));
        layoutParams5.topMargin = this.f19567i.mo51902b(4);
        layoutParams5.rightMargin = this.f19567i.mo51902b(4);
        this.f19565g.setLayoutParams(layoutParams5);
        this.f19566h.setTextColor(-6710887);
        this.f19566h.setTextSize(2, 14.0f);
        this.f19564f.setTextColor(-6710887);
        this.f19564f.setGravity(1);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 1;
        if (z) {
            layoutParams6.leftMargin = this.f19567i.mo51902b(4);
            i2 = this.f19567i.mo51902b(4);
        } else {
            layoutParams6.leftMargin = this.f19567i.mo51902b(16);
            i2 = this.f19567i.mo51902b(16);
        }
        layoutParams6.rightMargin = i2;
        layoutParams6.gravity = 1;
        this.f19564f.setLayoutParams(layoutParams6);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams7.gravity = 17;
        addView(this.f19563e, layoutParams7);
        this.f19563e.addView(this.f19559a);
        this.f19563e.addView(this.f19560b);
        this.f19563e.addView(this.f19562d);
        this.f19563e.addView(this.f19561c);
        this.f19563e.addView(this.f19564f);
        this.f19562d.addView(this.f19565g);
        this.f19562d.addView(this.f19566h);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f19569k.containsKey(view)) {
            return false;
        }
        if (!this.f19569k.get(view).booleanValue()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setBackgroundColor(-3806472);
        } else if (action == 1) {
            setBackgroundColor(-1);
            View.OnClickListener onClickListener = this.f19571m;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        } else if (action == 3) {
            setBackgroundColor(-1);
        }
        return true;
    }

    public void setBanner(C7399f2 f2Var) {
        int i;
        TextView textView;
        float f;
        this.f19570l = f2Var.getNavigationType();
        this.f19559a.setText(f2Var.getTitle());
        this.f19561c.setText(f2Var.getDescription());
        this.f19565g.setRating(f2Var.getRating());
        this.f19566h.setText(String.valueOf(f2Var.getVotes()));
        if ("store".equals(f2Var.getNavigationType())) {
            C7761y8.m20947b(this.f19560b, "category_text");
            String category = f2Var.getCategory();
            String subCategory = f2Var.getSubCategory();
            String str = "";
            if (!TextUtils.isEmpty(category)) {
                str = str + category;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(subCategory)) {
                str = str + ", ";
            }
            if (!TextUtils.isEmpty(subCategory)) {
                str = str + subCategory;
            }
            if (!TextUtils.isEmpty(str)) {
                this.f19560b.setText(str);
                this.f19560b.setVisibility(0);
            } else {
                this.f19560b.setVisibility(8);
            }
            this.f19562d.setVisibility(0);
            this.f19562d.setGravity(16);
            if (f2Var.getRating() > 0.0f) {
                this.f19565g.setVisibility(0);
                if (f2Var.getVotes() > 0) {
                    this.f19566h.setVisibility(0);
                    textView = this.f19560b;
                    i = -3355444;
                }
            } else {
                this.f19565g.setVisibility(8);
            }
            this.f19566h.setVisibility(8);
            textView = this.f19560b;
            i = -3355444;
        } else {
            C7761y8.m20947b(this.f19560b, "domain_text");
            this.f19562d.setVisibility(8);
            this.f19560b.setText(f2Var.getDomain());
            this.f19562d.setVisibility(8);
            textView = this.f19560b;
            i = -16733198;
        }
        textView.setTextColor(i);
        if (TextUtils.isEmpty(f2Var.getDisclaimer())) {
            this.f19564f.setVisibility(8);
        } else {
            this.f19564f.setVisibility(0);
            this.f19564f.setText(f2Var.getDisclaimer());
        }
        if (this.f19568j) {
            this.f19559a.setTextSize(2, 32.0f);
            this.f19561c.setTextSize(2, 24.0f);
            f = 18.0f;
            this.f19564f.setTextSize(2, 18.0f);
        } else {
            this.f19559a.setTextSize(2, 20.0f);
            f = 16.0f;
            this.f19561c.setTextSize(2, 16.0f);
            this.f19564f.setTextSize(2, 14.0f);
        }
        this.f19560b.setTextSize(2, f);
    }
}
