package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.chartboost.sdk.C1887f;

/* renamed from: com.chartboost.sdk.impl.l0 */
public class C1943l0 extends LinearLayout {

    /* renamed from: a */
    final C1927i0 f4983a;

    /* renamed from: b */
    private LinearLayout f4984b;

    /* renamed from: c */
    private C1963o1 f4985c;

    /* renamed from: d */
    private TextView f4986d;

    /* renamed from: e */
    final C1967p1 f4987e;

    /* renamed from: f */
    private int f4988f = Integer.MIN_VALUE;

    /* renamed from: com.chartboost.sdk.impl.l0$a */
    class C1944a extends C1967p1 {
        C1944a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo14620a(MotionEvent motionEvent) {
            C1943l0.this.f4987e.setEnabled(false);
            C1943l0.this.f4983a.mo14532i().mo14644g();
        }
    }

    public C1943l0(Context context, C1927i0 i0Var) {
        super(context);
        this.f4983a = i0Var;
        int round = Math.round(context.getResources().getDisplayMetrics().density * 8.0f);
        setOrientation(1);
        setGravity(17);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f4984b = linearLayout;
        linearLayout.setGravity(17);
        this.f4984b.setOrientation(0);
        this.f4984b.setPadding(round, round, round, round);
        C1963o1 o1Var = new C1963o1(context);
        this.f4985c = o1Var;
        o1Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f4985c.setPadding(0, 0, round, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        i0Var.mo14624a(layoutParams, i0Var.f4901N, 1.0f);
        TextView textView = new TextView(getContext());
        this.f4986d = textView;
        textView.setTextColor(-1);
        this.f4986d.setTypeface((Typeface) null, 1);
        this.f4986d.setGravity(17);
        this.f4986d.setTextSize(2, C1887f.m4400b(context) ? 26.0f : 16.0f);
        this.f4984b.addView(this.f4985c, layoutParams);
        this.f4984b.addView(this.f4986d, new LinearLayout.LayoutParams(-2, -2));
        C1944a aVar = new C1944a(getContext());
        this.f4987e = aVar;
        aVar.setContentDescription("CBWatch");
        this.f4987e.setPadding(0, 0, 0, round);
        this.f4987e.mo14756a(ImageView.ScaleType.FIT_CENTER);
        this.f4987e.setPadding(round, round, round, round);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        i0Var.mo14624a(layoutParams2, i0Var.f4900M, 1.0f);
        this.f4985c.mo14746a(i0Var.f4901N);
        this.f4987e.mo14757a(i0Var.f4900M);
        addView(this.f4984b, new LinearLayout.LayoutParams(-2, -2));
        addView(this.f4987e, layoutParams2);
        mo14691a();
    }

    /* renamed from: a */
    public void mo14693a(boolean z) {
        setBackgroundColor(z ? ViewCompat.MEASURED_STATE_MASK : this.f4988f);
    }

    /* renamed from: a */
    public void mo14692a(String str, int i) {
        this.f4986d.setText(str);
        this.f4988f = i;
        mo14693a(this.f4983a.mo14635t());
    }

    /* renamed from: a */
    public void mo14691a() {
        mo14693a(this.f4983a.mo14635t());
    }
}
