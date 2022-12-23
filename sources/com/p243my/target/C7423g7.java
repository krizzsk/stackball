package com.p243my.target;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.p243my.target.common.views.StarsRatingView;
import java.util.HashMap;

/* renamed from: com.my.target.g7 */
public class C7423g7 extends ViewGroup implements View.OnTouchListener {

    /* renamed from: a */
    public final C7506k6 f18653a;

    /* renamed from: b */
    public final TextView f18654b;

    /* renamed from: c */
    public final TextView f18655c;

    /* renamed from: d */
    public final Button f18656d;

    /* renamed from: e */
    public final C7761y8 f18657e;

    /* renamed from: f */
    public final StarsRatingView f18658f;

    /* renamed from: g */
    public final TextView f18659g;

    /* renamed from: h */
    public final HashMap<View, Boolean> f18660h = new HashMap<>();

    /* renamed from: i */
    public final boolean f18661i;

    /* renamed from: j */
    public View.OnClickListener f18662j;

    /* renamed from: k */
    public int f18663k;

    /* renamed from: l */
    public int f18664l;

    /* renamed from: m */
    public int f18665m;

    public C7423g7(boolean z, Context context) {
        super(context);
        this.f18661i = z;
        this.f18657e = C7761y8.m20950c(context);
        this.f18653a = new C7506k6(context);
        this.f18654b = new TextView(context);
        this.f18655c = new TextView(context);
        this.f18656d = new Button(context);
        this.f18658f = new StarsRatingView(context);
        this.f18659g = new TextView(context);
        mo50231a();
    }

    /* renamed from: a */
    public final void mo50231a() {
        int i;
        C7761y8 y8Var;
        StarsRatingView starsRatingView;
        C7761y8.m20939a(this, 0, 0, -3355444, this.f18657e.mo51902b(1), 0);
        this.f18664l = this.f18657e.mo51902b(2);
        this.f18665m = this.f18657e.mo51902b(12);
        this.f18656d.setPadding(this.f18657e.mo51902b(15), this.f18657e.mo51902b(10), this.f18657e.mo51902b(15), this.f18657e.mo51902b(10));
        this.f18656d.setMinimumWidth(this.f18657e.mo51902b(100));
        this.f18656d.setTransformationMethod((TransformationMethod) null);
        this.f18656d.setSingleLine();
        if (this.f18661i) {
            this.f18656d.setTextSize(20.0f);
        } else {
            this.f18656d.setTextSize(18.0f);
        }
        this.f18656d.setEllipsize(TextUtils.TruncateAt.END);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f18656d.setElevation((float) this.f18657e.mo51902b(2));
        }
        this.f18663k = this.f18657e.mo51902b(12);
        C7761y8.m20946b(this.f18656d, -16733198, -16746839, this.f18657e.mo51902b(2));
        this.f18656d.setTextColor(-1);
        if (this.f18661i) {
            this.f18654b.setTextSize(20.0f);
        } else {
            this.f18654b.setTextSize(18.0f);
        }
        this.f18654b.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f18654b.setTypeface((Typeface) null, 1);
        this.f18654b.setLines(1);
        this.f18654b.setEllipsize(TextUtils.TruncateAt.END);
        this.f18655c.setTextColor(-7829368);
        this.f18655c.setLines(2);
        if (this.f18661i) {
            this.f18655c.setTextSize(20.0f);
        } else {
            this.f18655c.setTextSize(18.0f);
        }
        this.f18655c.setEllipsize(TextUtils.TruncateAt.END);
        if (this.f18661i) {
            starsRatingView = this.f18658f;
            y8Var = this.f18657e;
            i = 24;
        } else {
            starsRatingView = this.f18658f;
            y8Var = this.f18657e;
            i = 18;
        }
        starsRatingView.setStarSize(y8Var.mo51902b(i));
        this.f18658f.setStarsPadding((float) this.f18657e.mo51902b(4));
        C7761y8.m20947b(this, "card_view");
        C7761y8.m20947b(this.f18654b, "card_title_text");
        C7761y8.m20947b(this.f18655c, "card_description_text");
        C7761y8.m20947b(this.f18659g, "card_domain_text");
        C7761y8.m20947b(this.f18656d, "card_cta_button");
        C7761y8.m20947b(this.f18658f, "card_stars_view");
        C7761y8.m20947b(this.f18653a, "card_image");
        addView(this.f18653a);
        addView(this.f18655c);
        addView(this.f18654b);
        addView(this.f18656d);
        addView(this.f18658f);
        addView(this.f18659g);
    }

    /* renamed from: a */
    public final void mo50232a(int i, int i2, boolean z, int i3) {
        int i4 = this.f18664l * 2;
        int i5 = i2 - i4;
        int i6 = i - i4;
        if (z) {
            this.f18654b.measure(View.MeasureSpec.makeMeasureSpec(i, i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
            this.f18655c.measure(0, 0);
            this.f18658f.measure(0, 0);
            this.f18659g.measure(0, 0);
            this.f18656d.measure(0, 0);
            return;
        }
        this.f18654b.measure(View.MeasureSpec.makeMeasureSpec(i6 - (this.f18665m * 2), i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f18655c.measure(View.MeasureSpec.makeMeasureSpec(i6 - (this.f18665m * 2), i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f18658f.measure(View.MeasureSpec.makeMeasureSpec(i6, i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f18659g.measure(View.MeasureSpec.makeMeasureSpec(i6, i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f18656d.measure(View.MeasureSpec.makeMeasureSpec(i6 - (this.f18665m * 2), i3), View.MeasureSpec.makeMeasureSpec(i5 - (this.f18665m * 2), Integer.MIN_VALUE));
    }

    /* renamed from: a */
    public void mo50233a(View.OnClickListener onClickListener, C7631r1 r1Var) {
        this.f18662j = onClickListener;
        if (onClickListener == null || r1Var == null) {
            super.setOnClickListener((View.OnClickListener) null);
            this.f18656d.setOnClickListener((View.OnClickListener) null);
            return;
        }
        setOnTouchListener(this);
        this.f18653a.setOnTouchListener(this);
        this.f18654b.setOnTouchListener(this);
        this.f18655c.setOnTouchListener(this);
        this.f18658f.setOnTouchListener(this);
        this.f18659g.setOnTouchListener(this);
        this.f18656d.setOnTouchListener(this);
        boolean z = false;
        this.f18660h.put(this.f18653a, Boolean.valueOf(r1Var.f19281f || r1Var.f19290o));
        this.f18660h.put(this, Boolean.valueOf(r1Var.f19289n || r1Var.f19290o));
        this.f18660h.put(this.f18654b, Boolean.valueOf(r1Var.f19278c || r1Var.f19290o));
        this.f18660h.put(this.f18655c, Boolean.valueOf(r1Var.f19279d || r1Var.f19290o));
        this.f18660h.put(this.f18658f, Boolean.valueOf(r1Var.f19282g || r1Var.f19290o));
        this.f18660h.put(this.f18659g, Boolean.valueOf(r1Var.f19287l || r1Var.f19290o));
        HashMap<View, Boolean> hashMap = this.f18660h;
        Button button = this.f18656d;
        if (r1Var.f19284i || r1Var.f19290o) {
            z = true;
        }
        hashMap.put(button, Boolean.valueOf(z));
    }

    public Button getCtaButtonView() {
        return this.f18656d;
    }

    public TextView getDescriptionTextView() {
        return this.f18655c;
    }

    public TextView getDomainTextView() {
        return this.f18659g;
    }

    public StarsRatingView getRatingView() {
        return this.f18658f;
    }

    public C7506k6 getSmartImageView() {
        return this.f18653a;
    }

    public TextView getTitleTextView() {
        return this.f18654b;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = (i3 - i) - (this.f18664l * 2);
        boolean z2 = !this.f18661i && getResources().getConfiguration().orientation == 2;
        C7506k6 k6Var = this.f18653a;
        k6Var.layout(0, 0, k6Var.getMeasuredWidth(), this.f18653a.getMeasuredHeight());
        if (z2) {
            this.f18654b.setTypeface((Typeface) null, 1);
            this.f18654b.layout(0, this.f18653a.getBottom(), i5, this.f18653a.getBottom() + this.f18654b.getMeasuredHeight());
            C7761y8.m20936a((View) this, 0, 0);
            this.f18655c.layout(0, 0, 0, 0);
            this.f18656d.layout(0, 0, 0, 0);
            this.f18658f.layout(0, 0, 0, 0);
            this.f18659g.layout(0, 0, 0, 0);
            return;
        }
        this.f18654b.setTypeface((Typeface) null, 0);
        C7761y8.m20939a(this, 0, 0, -3355444, this.f18657e.mo51902b(1), 0);
        this.f18654b.layout(this.f18664l + this.f18665m, this.f18653a.getBottom(), this.f18654b.getMeasuredWidth() + this.f18664l + this.f18665m, this.f18653a.getBottom() + this.f18654b.getMeasuredHeight());
        this.f18655c.layout(this.f18664l + this.f18665m, this.f18654b.getBottom(), this.f18655c.getMeasuredWidth() + this.f18664l + this.f18665m, this.f18654b.getBottom() + this.f18655c.getMeasuredHeight());
        int measuredWidth = (i5 - this.f18656d.getMeasuredWidth()) / 2;
        Button button = this.f18656d;
        button.layout(measuredWidth, (i4 - button.getMeasuredHeight()) - this.f18665m, this.f18656d.getMeasuredWidth() + measuredWidth, i4 - this.f18665m);
        int measuredWidth2 = (i5 - this.f18658f.getMeasuredWidth()) / 2;
        this.f18658f.layout(measuredWidth2, (this.f18656d.getTop() - this.f18665m) - this.f18658f.getMeasuredHeight(), this.f18658f.getMeasuredWidth() + measuredWidth2, this.f18656d.getTop() - this.f18665m);
        int measuredWidth3 = (i5 - this.f18659g.getMeasuredWidth()) / 2;
        this.f18659g.layout(measuredWidth3, (this.f18656d.getTop() - this.f18659g.getMeasuredHeight()) - this.f18665m, this.f18659g.getMeasuredWidth() + measuredWidth3, this.f18656d.getTop() - this.f18665m);
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i5 = 0;
        boolean z = !this.f18661i && getResources().getConfiguration().orientation == 2;
        if (size != 0) {
            i5 = Integer.MIN_VALUE;
        }
        mo50232a(size, size2, z, i5);
        if (z) {
            i4 = size2 - this.f18654b.getMeasuredHeight();
            i3 = this.f18664l;
        } else {
            i4 = (((size2 - this.f18656d.getMeasuredHeight()) - (this.f18663k * 2)) - Math.max(this.f18658f.getMeasuredHeight(), this.f18659g.getMeasuredHeight())) - this.f18655c.getMeasuredHeight();
            i3 = this.f18654b.getMeasuredHeight();
        }
        int i6 = i4 - i3;
        if (i6 <= size) {
            size = i6;
        }
        this.f18653a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        setMeasuredDimension(size, size2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r10 == r11) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r10 == r11) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        com.p243my.target.C7761y8.m20939a(r9, 0, 0, -3355444, r9.f18657e.mo51902b(1), 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            r9 = this;
            java.util.HashMap<android.view.View, java.lang.Boolean> r0 = r9.f18660h
            boolean r0 = r0.containsKey(r10)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            java.util.HashMap<android.view.View, java.lang.Boolean> r0 = r9.f18660h
            java.lang.Object r0 = r0.get(r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r10.setClickable(r0)
            int r11 = r11.getAction()
            r2 = 1
            if (r11 == 0) goto L_0x004f
            if (r11 == r2) goto L_0x002d
            r3 = 3
            if (r11 == r3) goto L_0x0026
            goto L_0x005f
        L_0x0026:
            if (r0 == 0) goto L_0x005f
            android.widget.Button r11 = r9.f18656d
            if (r10 != r11) goto L_0x003e
            goto L_0x003a
        L_0x002d:
            android.view.View$OnClickListener r11 = r9.f18662j
            if (r11 == 0) goto L_0x0034
            r11.onClick(r10)
        L_0x0034:
            if (r0 == 0) goto L_0x005f
            android.widget.Button r11 = r9.f18656d
            if (r10 != r11) goto L_0x003e
        L_0x003a:
            r11.setPressed(r1)
            goto L_0x005f
        L_0x003e:
            com.my.target.y8 r10 = r9.f18657e
            int r7 = r10.mo51902b((int) r2)
            r4 = 0
            r5 = 0
            r6 = -3355444(0xffffffffffcccccc, float:NaN)
            r8 = 0
            r3 = r9
            com.p243my.target.C7761y8.m20939a(r3, r4, r5, r6, r7, r8)
            goto L_0x005f
        L_0x004f:
            if (r0 == 0) goto L_0x005f
            android.widget.Button r11 = r9.f18656d
            if (r10 != r11) goto L_0x0059
            r11.setPressed(r2)
            goto L_0x005f
        L_0x0059:
            r10 = -3806472(0xffffffffffc5eaf8, float:NaN)
            r9.setBackgroundColor(r10)
        L_0x005f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7423g7.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
