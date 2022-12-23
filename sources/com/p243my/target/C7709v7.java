package com.p243my.target;

import android.content.Context;
import android.view.View;
import com.p243my.target.C7657s7;

/* renamed from: com.my.target.v7 */
public class C7709v7 extends C7678t7 {
    public C7709v7(View view, View view2, C7657s7.C7658a aVar, View view3, C7740x7 x7Var, Context context) {
        super(view, view2, aVar, view3, x7Var, context);
    }

    /* renamed from: a */
    public final void mo51741a(int i, int i2) {
        this.f19424q.setVisibility(8);
        this.f19425r.setVisibility(8);
        this.f19421n.setVisibility(8);
        this.f19411d.setVisibility(0);
        if (mo51598a(i)) {
            this.f19426s.setVisibility(0);
            C7761y8.m20937a(this.f19426s, i, i2, Integer.MIN_VALUE);
            this.f19422o.setVisibility(8);
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
    public final void mo51742a(int i, int i2, int i3, int i4) {
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
        if (mo51598a(i3 - i)) {
            C7506k6 k6Var = this.f19416i;
            C7761y8.m20938a((View) k6Var, i, i2, k6Var.getMeasuredWidth() + i, i4);
            int a = C7761y8.m20933a(this.f19417j.getMeasuredHeight(), this.f19426s.getMeasuredHeight());
            int i6 = this.f19396D;
            C7761y8.m20935a(this.f19400H, this.f19416i.getRight() + this.f19400H, a + i6, i6, this.f19417j, this.f19426s);
            View view2 = this.f19402J;
            C7761y8.m20938a(view2, i, i2, (view2 != null ? view2.getMeasuredWidth() : 0) + i, i4);
            this.f19411d.layout(this.f19416i.getRight(), i2, i3, i4);
            this.f19421n.layout(0, 0, 0, 0);
            this.f19413f.mo51531a(false);
            int left = this.f19410c.getVisibility() == 0 ? (this.f19410c.getLeft() - this.f19433z) + this.f19396D : this.f19427t.getVisibility() == 0 ? this.f19427t.getLeft() - this.f19433z : i3 - this.f19400H;
            C7761y8.m20945b(this.f19418k, this.f19400H, left);
            C7761y8.m20945b(this.f19418k, this.f19400H, left);
            return;
        }
        C7506k6 k6Var2 = this.f19417j;
        int i7 = this.f19400H;
        C7761y8.m20951c(k6Var2, i7, i7);
        C7761y8.m20954e(this.f19411d, i4 - i2, i);
        C7761y8.m20938a((View) this.f19416i, i, i2, i3, i4);
        C7761y8.m20938a(this.f19402J, i, i2, i3, i4);
        this.f19420m.layout(this.f19416i.getLeft(), this.f19416i.getTop(), this.f19416i.getRight(), this.f19416i.getBottom());
        this.f19421n.layout(0, 0, 0, 0);
        C7761y8.m20951c(this.f19422o, this.f19411d.getTop(), this.f19411d.getLeft());
        this.f19413f.mo51531a(true);
        C7761y8.m20952d(this.f19418k, this.f19411d.getTop() - this.f19433z, i3 - this.f19400H);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0051, code lost:
        if (android.text.TextUtils.isEmpty(r10.f19425r.getText()) == false) goto L_0x0077;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51743b(int r11, int r12) {
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
            com.my.target.k6 r0 = r10.f19416i
            int r0 = r0.getMeasuredHeight()
            double r6 = (double) r0
            r8 = 4609884578576439706(0x3ff999999999999a, double:1.6)
            double r6 = r6 * r8
            double r8 = (double) r12
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0054
            android.widget.TextView r0 = r10.f19424q
            r0.setVisibility(r2)
            android.widget.TextView r0 = r10.f19425r
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0082
            goto L_0x0077
        L_0x0054:
            android.widget.TextView r0 = r10.f19424q
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0066
            android.widget.TextView r0 = r10.f19424q
            r0.setVisibility(r1)
            goto L_0x006b
        L_0x0066:
            android.widget.TextView r0 = r10.f19424q
            r0.setVisibility(r2)
        L_0x006b:
            android.widget.TextView r0 = r10.f19425r
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x007d
        L_0x0077:
            android.widget.TextView r0 = r10.f19425r
            r0.setVisibility(r1)
            goto L_0x0082
        L_0x007d:
            android.widget.TextView r0 = r10.f19425r
            r0.setVisibility(r2)
        L_0x0082:
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
            com.my.target.n6 r11 = r10.f19427t
            int r12 = r10.f19395C
            com.p243my.target.C7761y8.m20937a(r11, r12, r12, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7709v7.mo51743b(int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x011b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51744b(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            com.my.target.f6 r0 = r9.f19410c
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0010
            com.my.target.f6 r0 = r9.f19410c
            int r1 = r9.f19433z
            int r2 = r9.f19396D
            int r1 = r1 - r2
            goto L_0x0014
        L_0x0010:
            com.my.target.n6 r0 = r9.f19427t
            int r1 = r9.f19433z
        L_0x0014:
            int r2 = r11 + r1
            int r3 = r12 - r10
            int r3 = r3 - r1
            com.p243my.target.C7761y8.m20945b(r0, r2, r3)
            android.view.View r0 = r9.f19411d
            com.p243my.target.C7761y8.m20951c(r0, r11, r10)
            android.widget.Button r0 = r9.f19423p
            int r1 = r9.f19397E
            int r1 = r13 - r1
            int r2 = r0.getMeasuredHeight()
            int r1 = r1 - r2
            int r2 = r9.f19397E
            int r2 = r13 - r2
            r3 = 0
            com.p243my.target.C7761y8.m20938a((android.view.View) r0, (int) r3, (int) r1, (int) r12, (int) r2)
            com.my.target.k6 r0 = r9.f19416i
            com.p243my.target.C7761y8.m20938a((android.view.View) r0, (int) r10, (int) r11, (int) r12, (int) r13)
            android.widget.TextView r11 = r9.f19425r
            int r11 = r11.getMeasuredHeight()
            int r0 = r9.f19433z
            r1 = 2
            int r0 = r0 / r1
            int r11 = r11 + r0
            android.widget.TextView r0 = r9.f19424q
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0056
            int r0 = r9.f19433z
            android.widget.TextView r2 = r9.f19424q
            int r2 = r2.getMeasuredHeight()
            int r0 = r0 + r2
            int r11 = r11 + r0
        L_0x0056:
            int r0 = r9.f19433z
            int r2 = r12 - r10
            int r4 = r0 * 2
            int r4 = r2 - r4
            android.widget.TextView r5 = r9.f19424q
            int r5 = r5.getMeasuredWidth()
            int r4 = r4 - r5
            int r4 = r4 / r1
            int r0 = r0 + r4
            int r4 = r9.f19433z
            int r5 = r4 * 2
            int r2 = r2 - r5
            android.widget.TextView r5 = r9.f19425r
            int r5 = r5.getMeasuredWidth()
            int r2 = r2 - r5
            int r2 = r2 / r1
            int r4 = r4 + r2
            com.my.target.k6 r2 = r9.f19416i
            int r2 = r2.getBottom()
            android.widget.Button r5 = r9.f19423p
            int r5 = r5.getTop()
            int r5 = r5 - r2
            r6 = 1
            if (r11 >= r5) goto L_0x00ad
            android.widget.Button r5 = r9.f19423p
            int r5 = r5.getTop()
            int r5 = r5 - r2
            int r5 = r5 - r11
            int r5 = r5 / r1
            int r2 = r2 + r5
            android.widget.TextView r11 = r9.f19424q
            com.p243my.target.C7761y8.m20951c(r11, r2, r0)
            android.widget.TextView r11 = r9.f19425r
            int[] r0 = new int[r1]
            r0[r3] = r2
            android.widget.TextView r1 = r9.f19424q
            int r1 = r1.getBottom()
            int r2 = r9.f19401I
            int r1 = r1 + r2
            r0[r6] = r1
            int r0 = com.p243my.target.C7761y8.m20933a((int[]) r0)
            com.p243my.target.C7761y8.m20951c(r11, r0, r4)
            goto L_0x00c0
        L_0x00ad:
            android.widget.Button r11 = r9.f19423p
            int r11 = r11.getTop()
            int r0 = r9.f19433z
            int r11 = r11 - r0
            android.widget.TextView r0 = r9.f19425r
            com.p243my.target.C7761y8.m20954e(r0, r11, r4)
            android.widget.TextView r11 = r9.f19424q
            r11.layout(r3, r3, r3, r3)
        L_0x00c0:
            android.widget.TextView r11 = r9.f19424q
            int r11 = r11.getTop()
            if (r11 <= 0) goto L_0x00cf
            android.widget.TextView r11 = r9.f19424q
        L_0x00ca:
            int r11 = r11.getTop()
            goto L_0x00e0
        L_0x00cf:
            android.widget.TextView r11 = r9.f19425r
            int r11 = r11.getTop()
            if (r11 <= 0) goto L_0x00da
            android.widget.TextView r11 = r9.f19425r
            goto L_0x00ca
        L_0x00da:
            android.widget.Button r11 = r9.f19423p
            int r11 = r11.getTop()
        L_0x00e0:
            int r0 = r9.f19433z
            int r11 = r11 - r0
            android.view.View r0 = r9.f19421n
            android.view.View r1 = r9.f19411d
            int r1 = r1.getTop()
            android.view.View r2 = r9.f19411d
            int r2 = r2.getLeft()
            com.p243my.target.C7761y8.m20951c(r0, r1, r2)
            android.view.View r0 = r9.f19422o
            com.p243my.target.C7761y8.m20951c(r0, r11, r10)
            com.my.target.s7$a r10 = r9.f19413f
            com.my.target.k6 r11 = r9.f19416i
            int r11 = r11.getBottom()
            android.view.View r0 = r9.f19422o
            int r0 = r0.getTop()
            int r11 = r11 - r0
            double r0 = (double) r11
            com.my.target.k6 r11 = r9.f19416i
            int r11 = r11.getMeasuredHeight()
            double r4 = (double) r11
            r7 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            double r4 = r4 * r7
            int r11 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r11 <= 0) goto L_0x011c
            r3 = 1
        L_0x011c:
            r10.mo51531a((boolean) r3)
            com.my.target.w5 r10 = r9.f19418k
            int r11 = r9.f19433z
            int r0 = r13 - r11
            int r12 = r12 - r11
            com.p243my.target.C7761y8.m20952d(r10, r0, r12)
            com.my.target.k6 r10 = r9.f19417j
            int r11 = r9.f19433z
            int r13 = r13 - r11
            com.p243my.target.C7761y8.m20954e(r10, r13, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7709v7.mo51744b(int, int, int, int):void");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (i3 - i < i4 - i2) {
            mo51744b(i, i2, i3, i4);
        } else {
            mo51742a(i, i2, i3, i4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0067  */
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
            com.my.target.k6 r2 = r5.f19416i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            com.p243my.target.C7761y8.m20937a(r2, r0, r1, r3)
            com.my.target.k6 r0 = r5.f19417j
            int r1 = r5.f19398F
            com.p243my.target.C7761y8.m20937a(r0, r1, r1, r3)
            com.my.target.f6 r0 = r5.f19410c
            int r1 = r5.f19395C
            int r2 = r5.f19396D
            int r2 = r2 * 2
            int r1 = r1 + r2
            r2 = 1073741824(0x40000000, float:2.0)
            com.p243my.target.C7761y8.m20937a(r0, r1, r1, r2)
            com.my.target.n6 r0 = r5.f19427t
            int r1 = r5.f19395C
            com.p243my.target.C7761y8.m20937a(r0, r1, r1, r2)
            com.my.target.w5 r0 = r5.f19418k
            int r1 = r5.f19395C
            int r3 = r5.f19396D
            int r3 = r3 * 2
            int r1 = r1 + r3
            com.p243my.target.C7761y8.m20937a(r0, r1, r1, r2)
            if (r6 >= r7) goto L_0x0067
            r5.mo51743b(r6, r7)
            goto L_0x006a
        L_0x0067:
            r5.mo51741a(r6, r7)
        L_0x006a:
            r5.setMeasuredDimension(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7709v7.onMeasure(int, int):void");
    }

    public void setBanner(C7399f2 f2Var) {
        super.setBanner(f2Var);
        View view = this.f19402J;
        if (view != null) {
            view.setVisibility(8);
        }
        this.f19420m.setVisibility(8);
    }
}
