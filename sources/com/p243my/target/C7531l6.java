package com.p243my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: com.my.target.l6 */
public class C7531l6 extends ViewGroup {

    /* renamed from: a */
    public final TextView f18950a;

    /* renamed from: b */
    public final C7331b6 f18951b;

    /* renamed from: c */
    public final int f18952c;

    /* renamed from: d */
    public final int f18953d;

    public C7531l6(Context context) {
        super(context);
        C7761y8 c = C7761y8.m20950c(context);
        TextView textView = new TextView(context);
        this.f18950a = textView;
        C7331b6 b6Var = new C7331b6(context);
        this.f18951b = b6Var;
        b6Var.setLines(1);
        textView.setTextSize(2, 18.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextColor(-1);
        this.f18952c = c.mo51902b(4);
        this.f18953d = c.mo51902b(2);
        C7761y8.m20947b(textView, "title_text");
        C7761y8.m20947b(b6Var, "age_bordering");
        addView(textView);
        addView(b6Var);
    }

    public TextView getLeftText() {
        return this.f18950a;
    }

    public C7331b6 getRightBorderedView() {
        return this.f18951b;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f18950a.getMeasuredWidth();
        int measuredHeight = this.f18950a.getMeasuredHeight();
        int measuredWidth2 = this.f18951b.getMeasuredWidth();
        int measuredHeight2 = this.f18951b.getMeasuredHeight();
        int measuredHeight3 = getMeasuredHeight();
        int i5 = (measuredHeight3 - measuredHeight) / 2;
        int i6 = (measuredHeight3 - measuredHeight2) / 2;
        int i7 = this.f18952c + measuredWidth;
        this.f18950a.layout(0, i5, measuredWidth, measuredHeight + i5);
        this.f18951b.layout(i7, i6, measuredWidth2 + i7, measuredHeight2 + i6);
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f18951b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2 - (this.f18953d * 2), Integer.MIN_VALUE));
        int i3 = size / 2;
        if (this.f18951b.getMeasuredWidth() > i3) {
            this.f18951b.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2 - (this.f18953d * 2), Integer.MIN_VALUE));
        }
        this.f18950a.measure(View.MeasureSpec.makeMeasureSpec((size - this.f18951b.getMeasuredWidth()) - this.f18952c, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2 - (this.f18953d * 2), Integer.MIN_VALUE));
        setMeasuredDimension(this.f18950a.getMeasuredWidth() + this.f18951b.getMeasuredWidth() + this.f18952c, Math.max(this.f18950a.getMeasuredHeight(), this.f18951b.getMeasuredHeight()));
    }
}
