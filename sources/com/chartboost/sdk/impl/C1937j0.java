package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.chartboost.sdk.Libraries.C1830i;
import com.chartboost.sdk.Libraries.CBUtility;

/* renamed from: com.chartboost.sdk.impl.j0 */
public class C1937j0 extends C1948m0 {

    /* renamed from: d */
    private LinearLayout f4932d;

    /* renamed from: e */
    private C1963o1 f4933e;

    /* renamed from: f */
    private TextView f4934f;

    public C1937j0(Context context, C1927i0 i0Var) {
        super(context, i0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo14617a() {
        Context context = getContext();
        int round = Math.round(getContext().getResources().getDisplayMetrics().density * 8.0f);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f4932d = linearLayout;
        linearLayout.setOrientation(0);
        this.f4932d.setGravity(17);
        int a = CBUtility.m4000a(36, context);
        C1963o1 o1Var = new C1963o1(context);
        this.f4933e = o1Var;
        o1Var.setPadding(round, round, round, round);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a, a);
        this.f4933e.setScaleType(ImageView.ScaleType.FIT_CENTER);
        TextView textView = new TextView(context);
        this.f4934f = textView;
        textView.setPadding(round / 2, round, round, round);
        this.f4934f.setTextColor(-15264491);
        this.f4934f.setTextSize(2, 16.0f);
        this.f4934f.setTypeface((Typeface) null, 1);
        this.f4934f.setGravity(17);
        this.f4932d.addView(this.f4933e, layoutParams);
        this.f4932d.addView(this.f4934f, new LinearLayout.LayoutParams(-2, -1));
        return this.f4932d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo14619b() {
        return 48;
    }

    /* renamed from: a */
    public void mo14648a(C1830i iVar) {
        this.f4933e.mo14746a(iVar);
        this.f4933e.setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    /* renamed from: a */
    public void mo14649a(String str) {
        this.f4934f.setText(str);
    }
}
