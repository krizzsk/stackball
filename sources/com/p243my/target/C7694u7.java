package com.p243my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.p243my.target.C7657s7;

/* renamed from: com.my.target.u7 */
public class C7694u7 extends C7678t7 {

    /* renamed from: P */
    public final int f19490P;

    public C7694u7(boolean z, View view, View view2, C7657s7.C7658a aVar, View view3, C7740x7 x7Var, Context context) {
        super(view, view2, aVar, view3, x7Var, context);
        this.f19490P = z ? 0 : 1;
    }

    /* renamed from: a */
    public final void mo51683a(int i, int i2) {
        this.f19424q.setVisibility(8);
        this.f19425r.setVisibility(8);
        this.f19421n.setVisibility(8);
        this.f19411d.setVisibility(0);
        this.f19422o.setVisibility(0);
        C7761y8.m20937a(this.f19411d, i, i2, Integer.MIN_VALUE);
        C7761y8.m20937a(this.f19422o, this.f19411d.getMeasuredWidth(), this.f19411d.getMeasuredHeight(), 1073741824);
    }

    /* renamed from: a */
    public final void mo51684a(int i, int i2, int i3, int i4) {
        int i5;
        View view;
        if (this.f19410c.getVisibility() == 0) {
            view = this.f19410c;
            i5 = this.f19400H - this.f19396D;
        } else {
            view = this.f19427t;
            i5 = this.f19400H;
        }
        C7761y8.m20945b(view, i2 + i5, (i3 - i) - i5);
        C7761y8.m20954e(this.f19411d, i4, i);
        C7761y8.m20954e(this.f19402J, this.f19411d.getTop(), 0);
        this.f19421n.layout(0, 0, 0, 0);
        View view2 = this.f19422o;
        View view3 = this.f19402J;
        if (view3 != null) {
            i4 = view3.getBottom();
        }
        C7761y8.m20951c(view2, i4, 0);
        C7761y8.m20952d(this.f19418k, this.f19411d.getTop() - this.f19433z, i3 - this.f19400H);
    }

    /* renamed from: b */
    public final void mo51685b(int i, int i2) {
        this.f19411d.setVisibility(0);
        this.f19421n.setVisibility(0);
        C7761y8.m20937a(this.f19411d, i - this.f19395C, i2, Integer.MIN_VALUE);
        C7761y8.m20937a(this.f19421n, i, this.f19411d.getMeasuredHeight(), 1073741824);
        if (!TextUtils.isEmpty(this.f19424q.getText())) {
            this.f19424q.setVisibility(0);
        } else {
            this.f19424q.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f19425r.getText())) {
            this.f19425r.setVisibility(0);
        } else {
            this.f19425r.setVisibility(8);
        }
        if (this.f19490P == 0) {
            int i3 = this.f19433z;
            int i4 = i3 * 2;
            this.f19423p.measure(View.MeasureSpec.makeMeasureSpec(((i - (i3 * 4)) - this.f19418k.getMeasuredWidth()) - this.f19417j.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f19399G, 1073741824));
            int i5 = i - i4;
            int i6 = i2 - i4;
            C7761y8.m20937a(this.f19424q, i5, i6, Integer.MIN_VALUE);
            C7761y8.m20937a(this.f19425r, i5, i6, Integer.MIN_VALUE);
            this.f19422o.setVisibility(0);
            C7761y8.m20937a(this.f19422o, i, i2, 1073741824);
            return;
        }
        this.f19422o.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo51686b(int i, int i2, int i3, int i4) {
        int i5;
        View view;
        int i6;
        if (this.f19410c.getVisibility() == 0) {
            view = this.f19410c;
            i5 = this.f19433z - this.f19396D;
        } else {
            view = this.f19427t;
            i5 = this.f19433z;
        }
        C7761y8.m20945b(view, i2 + i5, (i3 - i) - i5);
        C7761y8.m20951c(this.f19411d, i2, i);
        int measuredHeight = (i4 - this.f19417j.getMeasuredHeight()) - this.f19433z;
        Button button = this.f19423p;
        C7761y8.m20938a((View) button, 0, measuredHeight - button.getMeasuredHeight(), i3, measuredHeight);
        if (this.f19490P == 1) {
            C7761y8.m20938a(this.f19402J, i, this.f19411d.getBottom(), i3, i4);
        }
        int top = this.f19423p.getTop() - this.f19433z;
        TextView textView = this.f19425r;
        C7761y8.m20938a((View) textView, 0, top - textView.getMeasuredHeight(), i3, top);
        int top2 = (this.f19425r.getVisibility() == 0 ? this.f19425r.getTop() : top + this.f19425r.getMeasuredHeight()) - this.f19433z;
        TextView textView2 = this.f19424q;
        C7761y8.m20938a((View) textView2, 0, top2 - textView2.getMeasuredHeight(), i3, top2);
        if (this.f19490P == 0) {
            C7761y8.m20938a(this.f19402J, i, this.f19411d.getBottom(), i3, this.f19425r.getTop());
            View view2 = this.f19402J;
            if (view2 != null) {
                i6 = view2.getBottom();
                C7761y8.m20951c(this.f19421n, this.f19411d.getTop(), this.f19411d.getLeft());
                C7761y8.m20951c(this.f19422o, i6, i);
                C7722w5 w5Var = this.f19418k;
                int i7 = this.f19433z;
                C7761y8.m20952d(w5Var, i4 - i7, i3 - i7);
                C7506k6 k6Var = this.f19417j;
                int i8 = this.f19400H;
                C7761y8.m20954e(k6Var, i4 - i8, i8);
            }
        }
        i6 = i4;
        C7761y8.m20951c(this.f19421n, this.f19411d.getTop(), this.f19411d.getLeft());
        C7761y8.m20951c(this.f19422o, i6, i);
        C7722w5 w5Var2 = this.f19418k;
        int i72 = this.f19433z;
        C7761y8.m20952d(w5Var2, i4 - i72, i3 - i72);
        C7506k6 k6Var2 = this.f19417j;
        int i82 = this.f19400H;
        C7761y8.m20954e(k6Var2, i4 - i82, i82);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (i3 - i < i4 - i2) {
            mo51686b(i, i2, i3, i4);
        } else {
            mo51684a(i, i2, i3, i4);
        }
    }

    public void onMeasure(int i, int i2) {
        View view;
        int measuredHeight;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size < size2) {
            mo51685b(size, size2);
            int i4 = this.f19490P;
            if (i4 == 1) {
                view = this.f19402J;
                measuredHeight = size2 - this.f19421n.getMeasuredHeight();
                i3 = this.f19433z * 2;
            } else if (i4 == 0) {
                view = this.f19402J;
                measuredHeight = (((size2 - this.f19411d.getMeasuredHeight()) - this.f19424q.getMeasuredHeight()) - this.f19423p.getMeasuredHeight()) - this.f19425r.getMeasuredHeight();
                i3 = this.f19433z * 8;
            }
            C7761y8.m20937a(view, size, measuredHeight - i3, Integer.MIN_VALUE);
        } else {
            mo51683a(size, size2);
            C7761y8.m20937a(this.f19402J, size, (size2 - this.f19411d.getMeasuredHeight()) - (this.f19433z * 2), 1073741824);
        }
        C7564n6 n6Var = this.f19427t;
        int i5 = this.f19395C;
        C7761y8.m20937a(n6Var, i5, i5, 1073741824);
        C7404f6 f6Var = this.f19410c;
        int i6 = this.f19395C + (this.f19396D * 2);
        C7761y8.m20937a(f6Var, i6, i6, 1073741824);
        C7722w5 w5Var = this.f19418k;
        int i7 = this.f19395C + (this.f19396D * 2);
        C7761y8.m20937a(w5Var, i7, i7, 1073741824);
        setMeasuredDimension(size, size2);
    }

    public void setBanner(C7399f2 f2Var) {
        super.setBanner(f2Var);
        this.f19413f.mo51531a(true);
        View view = this.f19402J;
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
