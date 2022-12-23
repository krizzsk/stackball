package com.p243my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.p243my.target.C7657s7;
import com.p243my.target.common.models.ImageData;
import com.p243my.target.common.models.VideoData;

/* renamed from: com.my.target.w7 */
public class C7724w7 extends C7678t7 {
    public C7724w7(View view, View view2, C7657s7.C7658a aVar, View view3, C7740x7 x7Var, Context context) {
        super(view, view2, aVar, view3, x7Var, context);
        addView(this.f19408a);
        addView(this.f19414g);
        addView(this.f19415h);
        addView(this.f19419l);
        addView(view2);
    }

    /* renamed from: a */
    public final void mo51804a(int i, int i2) {
        this.f19424q.setVisibility(8);
        this.f19425r.setVisibility(8);
        this.f19421n.setVisibility(8);
        this.f19411d.setVisibility(0);
        if (mo51598a(i)) {
            this.f19426s.setVisibility(0);
            this.f19422o.setVisibility(8);
            C7761y8.m20937a(this.f19426s, i, i2, Integer.MIN_VALUE);
            int[] iArr = new int[2];
            View view = this.f19402J;
            iArr[0] = view != null ? view.getMeasuredWidth() : 0;
            iArr[1] = this.f19416i.getMeasuredWidth();
            int a = i - C7761y8.m20933a(iArr);
            C7761y8.m20937a(this.f19411d, a, a, Integer.MIN_VALUE);
        } else {
            this.f19426s.setVisibility(8);
            this.f19422o.setVisibility(0);
            C7761y8.m20937a(this.f19411d, i, i2, Integer.MIN_VALUE);
        }
        C7761y8.m20937a(this.f19422o, this.f19411d.getMeasuredWidth(), this.f19411d.getMeasuredHeight(), 1073741824);
    }

    /* renamed from: a */
    public final void mo51805a(int i, int i2, int i3, int i4) {
        int i5;
        View view;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        if (this.f19410c.getVisibility() == 0) {
            view = this.f19410c;
            i5 = this.f19400H - this.f19396D;
        } else {
            view = this.f19427t;
            i5 = this.f19400H;
        }
        C7761y8.m20945b(view, i7 + i5, (i8 - i6) - i5);
        if (mo51598a(i8 - i6)) {
            C7506k6 k6Var = this.f19416i;
            C7761y8.m20938a((View) k6Var, i6, i7, k6Var.getMeasuredWidth() + i6, i9);
            View view2 = this.f19402J;
            C7761y8.m20938a(view2, i6, i7, (view2 != null ? view2.getMeasuredWidth() : 0) + i6, i9);
            View view3 = this.f19402J;
            int left = view3 != null ? view3.getLeft() : this.f19416i.getLeft();
            View view4 = this.f19402J;
            int right = view4 != null ? view4.getRight() : this.f19416i.getRight();
            View view5 = this.f19402J;
            int bottom = view5 != null ? view5.getBottom() : this.f19416i.getBottom();
            View view6 = this.f19402J;
            int top = view6 != null ? view6.getTop() : this.f19416i.getTop();
            int i10 = this.f19400H;
            int a = C7761y8.m20933a(right, this.f19416i.getRight()) + this.f19400H;
            int a2 = C7761y8.m20933a(this.f19417j.getMeasuredHeight(), this.f19426s.getMeasuredHeight());
            int i11 = this.f19396D;
            C7761y8.m20935a(i10, a, a2 + i11, i11, this.f19417j, this.f19426s);
            this.f19420m.layout(left, top, right, bottom);
            this.f19411d.layout(C7761y8.m20933a(right, this.f19416i.getRight()), i7, i8, i9);
            this.f19421n.layout(0, 0, 0, 0);
            int max = Math.max(this.f19416i.getRight(), right);
            int i12 = this.f19400H - this.f19396D;
            C7761y8.m20952d(this.f19408a, i9 - i12, max - i12);
            this.f19413f.mo51531a(false);
            C7761y8.m20951c(this.f19422o, i9, this.f19411d.getLeft());
            C7761y8.m20945b(this.f19418k, this.f19400H, this.f19410c.getVisibility() == 0 ? (this.f19410c.getLeft() - this.f19433z) + this.f19396D : this.f19427t.getVisibility() == 0 ? this.f19427t.getLeft() - this.f19433z : i8 - this.f19400H);
            return;
        }
        C7506k6 k6Var2 = this.f19417j;
        int i13 = this.f19400H;
        C7761y8.m20951c(k6Var2, i13, i13);
        C7761y8.m20954e(this.f19411d, i9 - i7, i6);
        C7761y8.m20938a((View) this.f19416i, i6, i7, i8, i9);
        C7761y8.m20938a(this.f19402J, i6, i7, i8, i9);
        this.f19420m.layout(this.f19416i.getLeft(), this.f19416i.getTop(), this.f19416i.getRight(), this.f19416i.getBottom());
        this.f19421n.layout(0, 0, 0, 0);
        C7761y8.m20951c(this.f19422o, this.f19411d.getTop(), this.f19411d.getLeft());
        int top2 = this.f19411d.getTop();
        int i14 = this.f19433z;
        int i15 = this.f19396D;
        C7761y8.m20952d(this.f19408a, top2 - (i14 - i15), i8 - (this.f19400H - i15));
        C7761y8.m20952d(this.f19418k, this.f19408a.getTop() - (this.f19433z - this.f19396D), i8 - this.f19400H);
        this.f19413f.mo51531a(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0067, code lost:
        if (android.text.TextUtils.isEmpty(r10.f19425r.getText()) == false) goto L_0x008d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51806b(int r11, int r12) {
        /*
            r10 = this;
            android.view.View r0 = r10.f19411d
            r1 = 0
            r0.setVisibility(r1)
            android.view.View r0 = r10.f19421n
            r0.setVisibility(r1)
            android.view.View r0 = r10.f19422o
            r0.setVisibility(r1)
            android.widget.TextView r0 = r10.f19426s
            r2 = 8
            r0.setVisibility(r2)
            android.view.View r0 = r10.f19411d
            int r3 = r10.f19395C
            int r3 = r11 - r3
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            com.p243my.target.C7761y8.m20937a(r0, r3, r12, r4)
            android.view.View r0 = r10.f19421n
            android.view.View r3 = r10.f19411d
            int r3 = r3.getMeasuredHeight()
            r5 = 1073741824(0x40000000, float:2.0)
            com.p243my.target.C7761y8.m20937a(r0, r11, r3, r5)
            r0 = 2
            int[] r0 = new int[r0]
            android.view.View r3 = r10.f19402J
            if (r3 == 0) goto L_0x003b
            int r3 = r3.getMeasuredHeight()
            goto L_0x003c
        L_0x003b:
            r3 = 0
        L_0x003c:
            r0[r1] = r3
            com.my.target.k6 r3 = r10.f19416i
            int r3 = r3.getMeasuredHeight()
            r6 = 1
            r0[r6] = r3
            int r0 = com.p243my.target.C7761y8.m20933a((int[]) r0)
            double r6 = (double) r0
            r8 = 4609884578576439706(0x3ff999999999999a, double:1.6)
            double r6 = r6 * r8
            double r8 = (double) r12
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x006a
            android.widget.TextView r0 = r10.f19424q
            r0.setVisibility(r2)
            android.widget.TextView r0 = r10.f19425r
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0098
            goto L_0x008d
        L_0x006a:
            android.widget.TextView r0 = r10.f19424q
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x007c
            android.widget.TextView r0 = r10.f19424q
            r0.setVisibility(r1)
            goto L_0x0081
        L_0x007c:
            android.widget.TextView r0 = r10.f19424q
            r0.setVisibility(r2)
        L_0x0081:
            android.widget.TextView r0 = r10.f19425r
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0093
        L_0x008d:
            android.widget.TextView r0 = r10.f19425r
            r0.setVisibility(r1)
            goto L_0x0098
        L_0x0093:
            android.widget.TextView r0 = r10.f19425r
            r0.setVisibility(r2)
        L_0x0098:
            int r0 = r10.f19433z
            int r1 = r0 * 2
            int r0 = r0 * 4
            int r0 = r11 - r0
            com.my.target.w5 r2 = r10.f19418k
            int r2 = r2.getMeasuredWidth()
            int r0 = r0 - r2
            com.my.target.k6 r2 = r10.f19417j
            int r2 = r2.getMeasuredWidth()
            int r0 = r0 - r2
            android.widget.Button r2 = r10.f19423p
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            int r3 = r10.f19399G
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r2.measure(r0, r3)
            android.widget.TextView r0 = r10.f19424q
            int r2 = r11 - r1
            int r1 = r12 - r1
            com.p243my.target.C7761y8.m20937a(r0, r2, r1, r4)
            android.widget.TextView r0 = r10.f19425r
            com.p243my.target.C7761y8.m20937a(r0, r2, r1, r4)
            android.view.View r0 = r10.f19422o
            com.p243my.target.C7761y8.m20937a(r0, r11, r12, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7724w7.mo51806b(int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01b4  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51807b(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            com.my.target.f6 r0 = r10.f19410c
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0010
            com.my.target.f6 r0 = r10.f19410c
            int r1 = r10.f19433z
            int r2 = r10.f19396D
            int r1 = r1 - r2
            goto L_0x0014
        L_0x0010:
            com.my.target.n6 r0 = r10.f19427t
            int r1 = r10.f19433z
        L_0x0014:
            int r2 = r12 + r1
            int r3 = r13 - r11
            int r3 = r3 - r1
            com.p243my.target.C7761y8.m20945b(r0, r2, r3)
            android.view.View r0 = r10.f19411d
            com.p243my.target.C7761y8.m20951c(r0, r12, r11)
            android.widget.Button r0 = r10.f19423p
            int r1 = r10.f19397E
            int r1 = r14 - r1
            int r2 = r0.getMeasuredHeight()
            int r1 = r1 - r2
            int r2 = r10.f19397E
            int r2 = r14 - r2
            r3 = 0
            com.p243my.target.C7761y8.m20938a((android.view.View) r0, (int) r3, (int) r1, (int) r13, (int) r2)
            android.view.View r0 = r10.f19402J
            com.p243my.target.C7761y8.m20938a((android.view.View) r0, (int) r11, (int) r12, (int) r13, (int) r14)
            com.my.target.k6 r0 = r10.f19416i
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x004e
            com.my.target.k6 r0 = r10.f19416i
            int r0 = r0.getMeasuredHeight()
            if (r0 <= 0) goto L_0x004e
            com.my.target.k6 r0 = r10.f19416i
            com.p243my.target.C7761y8.m20938a((android.view.View) r0, (int) r11, (int) r12, (int) r13, (int) r14)
        L_0x004e:
            android.view.View r12 = r10.f19402J
            if (r12 == 0) goto L_0x0057
            int r12 = r12.getLeft()
            goto L_0x0058
        L_0x0057:
            r12 = 0
        L_0x0058:
            android.view.View r0 = r10.f19402J
            if (r0 == 0) goto L_0x0061
            int r0 = r0.getTop()
            goto L_0x0062
        L_0x0061:
            r0 = 0
        L_0x0062:
            r1 = 2
            int[] r2 = new int[r1]
            android.view.View r4 = r10.f19402J
            if (r4 == 0) goto L_0x006e
            int r4 = r4.getRight()
            goto L_0x006f
        L_0x006e:
            r4 = 0
        L_0x006f:
            r2[r3] = r4
            com.my.target.k6 r4 = r10.f19416i
            int r4 = r4.getRight()
            r5 = 1
            r2[r5] = r4
            int r2 = com.p243my.target.C7761y8.m20933a((int[]) r2)
            int[] r4 = new int[r1]
            android.view.View r6 = r10.f19402J
            if (r6 == 0) goto L_0x0089
            int r6 = r6.getBottom()
            goto L_0x008a
        L_0x0089:
            r6 = 0
        L_0x008a:
            r4[r3] = r6
            com.my.target.k6 r6 = r10.f19416i
            int r6 = r6.getBottom()
            r4[r5] = r6
            int r4 = com.p243my.target.C7761y8.m20933a((int[]) r4)
            android.view.View r6 = r10.f19420m
            r6.layout(r12, r0, r2, r4)
            android.widget.TextView r12 = r10.f19425r
            int r12 = r12.getMeasuredHeight()
            int r0 = r10.f19433z
            int r0 = r0 / r1
            int r12 = r12 + r0
            android.widget.TextView r0 = r10.f19424q
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00b9
            int r0 = r10.f19433z
            android.widget.TextView r2 = r10.f19424q
            int r2 = r2.getMeasuredHeight()
            int r0 = r0 + r2
            int r12 = r12 + r0
        L_0x00b9:
            int r0 = r10.f19433z
            int r2 = r13 - r11
            int r6 = r0 * 2
            int r6 = r2 - r6
            android.widget.TextView r7 = r10.f19424q
            int r7 = r7.getMeasuredWidth()
            int r6 = r6 - r7
            int r6 = r6 / r1
            int r0 = r0 + r6
            int r6 = r10.f19433z
            int r7 = r6 * 2
            int r2 = r2 - r7
            android.widget.TextView r7 = r10.f19425r
            int r7 = r7.getMeasuredWidth()
            int r2 = r2 - r7
            int r2 = r2 / r1
            int r6 = r6 + r2
            int[] r2 = new int[r1]
            com.my.target.k6 r7 = r10.f19416i
            int r7 = r7.getBottom()
            r2[r3] = r7
            r2[r5] = r4
            int r2 = com.p243my.target.C7761y8.m20933a((int[]) r2)
            android.widget.Button r7 = r10.f19423p
            int r7 = r7.getTop()
            int r7 = r7 - r2
            if (r12 >= r7) goto L_0x0119
            android.widget.Button r7 = r10.f19423p
            int r7 = r7.getTop()
            int r7 = r7 - r2
            int r7 = r7 - r12
            int r7 = r7 / r1
            int r2 = r2 + r7
            android.widget.TextView r12 = r10.f19424q
            com.p243my.target.C7761y8.m20951c(r12, r2, r0)
            android.widget.TextView r12 = r10.f19425r
            int[] r0 = new int[r1]
            r0[r3] = r2
            android.widget.TextView r1 = r10.f19424q
            int r1 = r1.getBottom()
            int r2 = r10.f19401I
            int r1 = r1 + r2
            r0[r5] = r1
            int r0 = com.p243my.target.C7761y8.m20933a((int[]) r0)
            com.p243my.target.C7761y8.m20951c(r12, r0, r6)
            goto L_0x012c
        L_0x0119:
            android.widget.Button r12 = r10.f19423p
            int r12 = r12.getTop()
            int r0 = r10.f19433z
            int r12 = r12 - r0
            android.widget.TextView r0 = r10.f19425r
            com.p243my.target.C7761y8.m20954e(r0, r12, r6)
            android.widget.TextView r12 = r10.f19424q
            r12.layout(r3, r3, r3, r3)
        L_0x012c:
            android.widget.TextView r12 = r10.f19424q
            int r12 = r12.getTop()
            if (r12 <= 0) goto L_0x013b
            android.widget.TextView r12 = r10.f19424q
        L_0x0136:
            int r12 = r12.getTop()
            goto L_0x014c
        L_0x013b:
            android.widget.TextView r12 = r10.f19425r
            int r12 = r12.getTop()
            if (r12 <= 0) goto L_0x0146
            android.widget.TextView r12 = r10.f19425r
            goto L_0x0136
        L_0x0146:
            android.widget.Button r12 = r10.f19423p
            int r12 = r12.getTop()
        L_0x014c:
            int r0 = r10.f19433z
            int r12 = r12 - r0
            android.view.View r0 = r10.f19421n
            android.view.View r1 = r10.f19411d
            int r1 = r1.getTop()
            android.view.View r2 = r10.f19411d
            int r2 = r2.getLeft()
            com.p243my.target.C7761y8.m20951c(r0, r1, r2)
            android.view.View r0 = r10.f19422o
            com.p243my.target.C7761y8.m20951c(r0, r12, r11)
            android.view.View r11 = r10.f19422o
            int r11 = r11.getTop()
            com.my.target.k6 r12 = r10.f19416i
            int r12 = r12.getBottom()
            int r12 = java.lang.Math.max(r4, r12)
            int r11 = java.lang.Math.min(r11, r12)
            int r12 = r10.f19433z
            int r0 = r10.f19396D
            int r12 = r12 - r0
            int r11 = r11 - r12
            com.my.target.f6 r0 = r10.f19408a
            int r12 = r13 - r12
            com.p243my.target.C7761y8.m20952d(r0, r11, r12)
            com.my.target.s7$a r11 = r10.f19413f
            com.my.target.k6 r12 = r10.f19416i
            int r12 = r12.getBottom()
            android.view.View r0 = r10.f19422o
            int r0 = r0.getTop()
            int r12 = r12 - r0
            double r0 = (double) r12
            com.my.target.k6 r12 = r10.f19416i
            int r12 = r12.getMeasuredHeight()
            double r6 = (double) r12
            r8 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            double r6 = r6 * r8
            int r12 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r12 <= 0) goto L_0x01a9
            r3 = 1
        L_0x01a9:
            r11.mo51531a((boolean) r3)
            android.view.View r11 = r10.f19412e
            int r11 = r11.getVisibility()
            if (r11 != 0) goto L_0x01ba
            android.view.View r11 = r10.f19412e
            int r14 = r11.getTop()
        L_0x01ba:
            com.my.target.w5 r11 = r10.f19418k
            int r12 = r10.f19433z
            int r0 = r14 - r12
            int r13 = r13 - r12
            com.p243my.target.C7761y8.m20952d(r11, r0, r13)
            com.my.target.k6 r11 = r10.f19417j
            int r12 = r10.f19433z
            int r14 = r14 - r12
            com.p243my.target.C7761y8.m20954e(r11, r14, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7724w7.mo51807b(int, int, int, int):void");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f19412e.getVisibility() == 0) {
            C7761y8.m20954e(this.f19412e, i4 - i2, i);
        }
        if (i3 - i < i4 - i2) {
            mo51807b(i, i2, i3, i4);
        } else {
            mo51805a(i, i2, i3, i4);
        }
        View view = this.f19402J;
        int left = view != null ? view.getLeft() : this.f19416i.getLeft();
        View view2 = this.f19402J;
        int top = view2 != null ? view2.getTop() : this.f19416i.getTop();
        int[] iArr = new int[2];
        View view3 = this.f19402J;
        iArr[0] = view3 != null ? view3.getRight() : 0;
        iArr[1] = this.f19416i.getRight();
        int a = C7761y8.m20933a(iArr);
        int[] iArr2 = new int[2];
        View view4 = this.f19402J;
        iArr2[0] = view4 != null ? view4.getBottom() : 0;
        iArr2[1] = this.f19416i.getBottom();
        int a2 = C7761y8.m20933a(iArr2);
        if (this.f19419l.getVisibility() == 0) {
            C7761y8.m20938a((View) this.f19419l, left, top, a, a2);
        }
        if (this.f19414g.getVisibility() == 0) {
            if (this.f19415h.getVisibility() != 0) {
                C7761y8.m20938a((View) this.f19414g, left, top, a, a2);
                return;
            }
            int measuredWidth = left + (((a - left) - ((this.f19414g.getMeasuredWidth() + this.f19433z) + this.f19415h.getMeasuredWidth())) / 2);
            int measuredHeight = top + (((a2 - top) - this.f19414g.getMeasuredHeight()) / 2);
            C7761y8.m20951c(this.f19414g, measuredHeight, measuredWidth);
            C7761y8.m20951c(this.f19415h, measuredHeight, this.f19414g.getRight() + this.f19433z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r0 = r5.f19403K
            if (r0 <= 0) goto L_0x0030
            int r1 = r5.f19404L
            if (r1 <= 0) goto L_0x0030
            float r0 = (float) r0
            float r1 = (float) r1
            float r2 = r0 / r1
            float r3 = (float) r6
            float r0 = r3 / r0
            float r4 = (float) r7
            float r1 = r4 / r1
            float r1 = java.lang.Math.min(r0, r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x002c
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x002c
            float r3 = r3 / r2
            int r0 = (int) r3
            r1 = r0
            r0 = r6
            goto L_0x0032
        L_0x002c:
            float r4 = r4 * r2
            int r0 = (int) r4
            goto L_0x0031
        L_0x0030:
            r0 = r6
        L_0x0031:
            r1 = r7
        L_0x0032:
            android.view.View r2 = r5.f19402J
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            com.p243my.target.C7761y8.m20937a(r2, r0, r1, r3)
            com.my.target.k6 r2 = r5.f19416i
            com.p243my.target.C7761y8.m20937a(r2, r0, r1, r3)
            android.view.View r2 = r5.f19420m
            r4 = 1073741824(0x40000000, float:2.0)
            com.p243my.target.C7761y8.m20937a(r2, r0, r1, r4)
            com.my.target.k6 r0 = r5.f19417j
            int r1 = r5.f19398F
            com.p243my.target.C7761y8.m20937a(r0, r1, r1, r3)
            com.my.target.f6 r0 = r5.f19408a
            int r1 = r5.f19395C
            int r2 = r5.f19396D
            int r2 = r2 * 2
            int r1 = r1 + r2
            com.p243my.target.C7761y8.m20937a(r0, r1, r1, r4)
            com.my.target.f6 r0 = r5.f19410c
            int r1 = r5.f19395C
            int r2 = r5.f19396D
            int r2 = r2 * 2
            int r1 = r1 + r2
            com.p243my.target.C7761y8.m20937a(r0, r1, r1, r4)
            com.my.target.n6 r0 = r5.f19427t
            int r1 = r5.f19395C
            com.p243my.target.C7761y8.m20937a(r0, r1, r1, r4)
            com.my.target.w5 r0 = r5.f19418k
            int r1 = r5.f19395C
            int r2 = r5.f19396D
            int r2 = r2 * 2
            int r1 = r1 + r2
            com.p243my.target.C7761y8.m20937a(r0, r1, r1, r4)
            if (r6 >= r7) goto L_0x007d
            r5.mo51806b(r6, r7)
            goto L_0x0080
        L_0x007d:
            r5.mo51804a(r6, r7)
        L_0x0080:
            com.my.target.y6 r0 = r5.f19414g
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00aa
            com.my.target.y6 r0 = r5.f19414g
            int r1 = r5.f19393A
            com.p243my.target.C7761y8.m20937a(r0, r1, r1, r4)
            android.widget.Button r0 = r5.f19415h
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00aa
            android.widget.Button r0 = r5.f19415h
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r3)
            com.my.target.y6 r2 = r5.f19414g
            int r2 = r2.getMeasuredHeight()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r4)
            r0.measure(r1, r2)
        L_0x00aa:
            android.widget.ProgressBar r0 = r5.f19419l
            int r1 = r5.f19393A
            com.p243my.target.C7761y8.m20937a(r0, r1, r1, r4)
            android.view.View r0 = r5.f19412e
            int r1 = r5.f19394B
            com.p243my.target.C7761y8.m20937a(r0, r6, r1, r4)
            r5.setMeasuredDimension(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7724w7.onMeasure(int, int):void");
    }

    public void setBanner(C7399f2 f2Var) {
        String str;
        C7404f6 f6Var;
        ImageData image;
        Bitmap bitmap;
        super.setBanner(f2Var);
        C7413g2<VideoData> videoBanner = f2Var.getVideoBanner();
        if (videoBanner != null) {
            this.f19412e.setVisibility(0);
            this.f19408a.setVisibility(0);
            this.f19408a.setOnClickListener(this);
            if (videoBanner.isAutoMute()) {
                this.f19408a.mo50150a(this.f19429v, false);
                f6Var = this.f19408a;
                str = "sound_off";
            } else {
                this.f19408a.mo50150a(this.f19428u, false);
                f6Var = this.f19408a;
                str = "sound_on";
            }
            f6Var.setContentDescription(str);
            this.f19414g.setImageBitmap(this.f19430w);
            this.f19406N = 0;
            View view = this.f19402J;
            if (view != null) {
                view.setOnClickListener(this);
            }
            this.f19420m.setOnClickListener(this);
            VideoData mediaData = videoBanner.getMediaData();
            ImageData preview = videoBanner.getPreview();
            if (mediaData != null) {
                this.f19403K = mediaData.getWidth();
                this.f19404L = mediaData.getHeight();
            }
            if ((this.f19403K <= 0 || this.f19404L <= 0) && preview != null) {
                this.f19403K = preview.getWidth();
                this.f19404L = preview.getHeight();
            }
            if ((this.f19403K <= 0 || this.f19404L <= 0) && (image = f2Var.getImage()) != null) {
                this.f19403K = image.getWidth();
                int height = image.getHeight();
                this.f19404L = height;
                if ((this.f19403K <= 0 || height <= 0) && (bitmap = image.getBitmap()) != null) {
                    this.f19403K = bitmap.getWidth();
                    this.f19404L = bitmap.getHeight();
                }
            }
        }
    }
}
