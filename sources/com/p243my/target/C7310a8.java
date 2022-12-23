package com.p243my.target;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p243my.target.C7782z7;
import com.p243my.target.common.models.ImageData;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.my.target.a8 */
public final class C7310a8 extends LinearLayout implements View.OnTouchListener, C7782z7 {

    /* renamed from: a */
    public final C7506k6 f18316a;

    /* renamed from: b */
    public final TextView f18317b;

    /* renamed from: c */
    public final TextView f18318c;

    /* renamed from: d */
    public final Button f18319d;

    /* renamed from: e */
    public final C7740x7 f18320e;

    /* renamed from: f */
    public final Set<View> f18321f = new HashSet();

    /* renamed from: g */
    public final int f18322g;

    /* renamed from: h */
    public final int f18323h;

    /* renamed from: i */
    public final int f18324i;

    /* renamed from: j */
    public C7782z7.C7783a f18325j;

    /* renamed from: k */
    public ImageData f18326k;

    /* renamed from: l */
    public boolean f18327l;

    public C7310a8(Context context, C7698v1 v1Var, C7740x7 x7Var) {
        super(context);
        setOrientation(1);
        this.f18320e = x7Var;
        this.f18316a = new C7506k6(context);
        this.f18317b = new TextView(context);
        this.f18318c = new TextView(context);
        this.f18319d = new Button(context);
        this.f18322g = x7Var.mo51837a(C7740x7.f19615Q);
        this.f18323h = x7Var.mo51837a(C7740x7.f19627f);
        this.f18324i = x7Var.mo51837a(C7740x7.f19603E);
        mo49613a(v1Var);
    }

    private void setClickArea(C7631r1 r1Var) {
        setOnTouchListener(this);
        this.f18316a.setOnTouchListener(this);
        this.f18317b.setOnTouchListener(this);
        this.f18318c.setOnTouchListener(this);
        this.f18319d.setOnTouchListener(this);
        this.f18321f.clear();
        if (r1Var.f19290o) {
            this.f18327l = true;
            return;
        }
        if (r1Var.f19284i) {
            this.f18321f.add(this.f18319d);
        } else {
            this.f18319d.setEnabled(false);
            this.f18321f.remove(this.f18319d);
        }
        if (r1Var.f19289n) {
            this.f18321f.add(this);
        } else {
            this.f18321f.remove(this);
        }
        if (r1Var.f19278c) {
            this.f18321f.add(this.f18317b);
        } else {
            this.f18321f.remove(this.f18317b);
        }
        if (r1Var.f19279d) {
            this.f18321f.add(this.f18318c);
        } else {
            this.f18321f.remove(this.f18318c);
        }
        if (r1Var.f19281f) {
            this.f18321f.add(this.f18316a);
        } else {
            this.f18321f.remove(this.f18316a);
        }
    }

    /* renamed from: a */
    public View mo49611a() {
        return this;
    }

    /* renamed from: a */
    public final void mo49612a(int i, int i2) {
        this.f18316a.measure(i, i2);
        if (this.f18317b.getVisibility() == 0) {
            this.f18317b.measure(i, i2);
        }
        if (this.f18318c.getVisibility() == 0) {
            this.f18318c.measure(i, i2);
        }
        if (this.f18319d.getVisibility() == 0) {
            C7761y8.m20937a(this.f18319d, this.f18316a.getMeasuredWidth() - (this.f18320e.mo51837a(C7740x7.f19611M) * 2), this.f18322g, 1073741824);
        }
    }

    /* renamed from: a */
    public final void mo49613a(C7698v1 v1Var) {
        this.f18319d.setTransformationMethod((TransformationMethod) null);
        this.f18319d.setSingleLine();
        this.f18319d.setTextSize(1, (float) this.f18320e.mo51837a(C7740x7.f19641t));
        this.f18319d.setEllipsize(TextUtils.TruncateAt.END);
        this.f18319d.setGravity(17);
        this.f18319d.setIncludeFontPadding(false);
        Button button = this.f18319d;
        int i = this.f18323h;
        button.setPadding(i, 0, i, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        C7740x7 x7Var = this.f18320e;
        int i2 = C7740x7.f19611M;
        layoutParams.leftMargin = x7Var.mo51837a(i2);
        layoutParams.rightMargin = this.f18320e.mo51837a(i2);
        layoutParams.topMargin = this.f18324i;
        layoutParams.gravity = 1;
        this.f18319d.setLayoutParams(layoutParams);
        C7761y8.m20946b(this.f18319d, v1Var.mo51712d(), v1Var.mo51716f(), this.f18320e.mo51837a(C7740x7.f19633l));
        this.f18319d.setTextColor(v1Var.mo51714e());
        this.f18317b.setTextSize(1, (float) this.f18320e.mo51837a(C7740x7.f19612N));
        this.f18317b.setTextColor(v1Var.mo51725k());
        this.f18317b.setIncludeFontPadding(false);
        TextView textView = this.f18317b;
        C7740x7 x7Var2 = this.f18320e;
        int i3 = C7740x7.f19610L;
        textView.setPadding(x7Var2.mo51837a(i3), 0, this.f18320e.mo51837a(i3), 0);
        this.f18317b.setTypeface((Typeface) null, 1);
        this.f18317b.setLines(this.f18320e.mo51837a(C7740x7.f19599A));
        this.f18317b.setEllipsize(TextUtils.TruncateAt.END);
        this.f18317b.setGravity(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = this.f18323h;
        this.f18317b.setLayoutParams(layoutParams2);
        this.f18318c.setTextColor(v1Var.mo51724j());
        this.f18318c.setIncludeFontPadding(false);
        this.f18318c.setLines(this.f18320e.mo51837a(C7740x7.f19600B));
        this.f18318c.setTextSize(1, (float) this.f18320e.mo51837a(C7740x7.f19613O));
        this.f18318c.setEllipsize(TextUtils.TruncateAt.END);
        this.f18318c.setPadding(this.f18320e.mo51837a(i3), 0, this.f18320e.mo51837a(i3), 0);
        this.f18318c.setGravity(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        this.f18318c.setLayoutParams(layoutParams3);
        C7761y8.m20947b(this, "card_view");
        C7761y8.m20947b(this.f18317b, "card_title_text");
        C7761y8.m20947b(this.f18318c, "card_description_text");
        C7761y8.m20947b(this.f18319d, "card_cta_button");
        C7761y8.m20947b(this.f18316a, "card_image");
        addView(this.f18316a);
        addView(this.f18317b);
        addView(this.f18318c);
        addView(this.f18319d);
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        mo49612a(i, i2);
        if (getMeasuredHeight() <= 0 || getMeasuredWidth() <= 0 || getMeasuredWidth() != size) {
            int measuredWidth = this.f18316a.getMeasuredWidth();
            int measuredHeight = this.f18316a.getMeasuredHeight();
            if (size <= size2) {
                measuredHeight = getPaddingBottom() + 0 + getPaddingTop();
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    measuredHeight = measuredHeight + childAt.getMeasuredHeight() + childAt.getPaddingTop() + childAt.getPaddingBottom() + layoutParams.topMargin + layoutParams.bottomMargin;
                }
            }
            setMeasuredDimension(measuredWidth, measuredHeight);
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            boolean z = false;
            if (action == 1) {
                setBackgroundColor(0);
                this.f18319d.setPressed(false);
                C7782z7.C7783a aVar = this.f18325j;
                if (aVar != null) {
                    if (this.f18327l || this.f18321f.contains(view)) {
                        z = true;
                    }
                    aVar.mo51454a(z);
                }
            } else if (action == 3) {
                setBackgroundColor(0);
                this.f18319d.setPressed(false);
            }
        } else if (this.f18327l || this.f18321f.contains(view)) {
            Button button = this.f18319d;
            if (view == button) {
                button.setPressed(true);
            } else {
                setBackgroundColor(-13421773);
            }
        }
        return true;
    }

    public void setBanner(C7342c2 c2Var) {
        if (c2Var != null) {
            ImageData image = c2Var.getImage();
            this.f18326k = image;
            if (image != null) {
                this.f18316a.setPlaceholderDimensions(image.getWidth(), this.f18326k.getHeight());
                C7509k8.m19623b(this.f18326k, this.f18316a);
            }
            if (c2Var.isImageOnly()) {
                this.f18317b.setVisibility(8);
                this.f18318c.setVisibility(8);
                this.f18319d.setVisibility(8);
            } else {
                this.f18317b.setVisibility(0);
                this.f18318c.setVisibility(0);
                this.f18319d.setVisibility(0);
                this.f18317b.setText(c2Var.getTitle());
                this.f18318c.setText(c2Var.getDescription());
                this.f18319d.setText(c2Var.getCtaText());
            }
            setClickArea(c2Var.getClickArea());
            return;
        }
        this.f18321f.clear();
        ImageData imageData = this.f18326k;
        if (imageData != null) {
            C7509k8.m19619a(imageData, (ImageView) this.f18316a);
        }
        this.f18316a.setPlaceholderDimensions(0, 0);
        this.f18317b.setVisibility(8);
        this.f18318c.setVisibility(8);
        this.f18319d.setVisibility(8);
    }

    public void setListener(C7782z7.C7783a aVar) {
        this.f18325j = aVar;
    }
}
