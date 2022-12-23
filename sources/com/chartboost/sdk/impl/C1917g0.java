package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;

/* renamed from: com.chartboost.sdk.impl.g0 */
public class C1917g0 extends C1948m0 {

    /* renamed from: d */
    private LinearLayout f4844d;

    /* renamed from: e */
    private LinearLayout f4845e;

    /* renamed from: f */
    private C1963o1 f4846f;

    /* renamed from: g */
    private C1967p1 f4847g;

    /* renamed from: h */
    private TextView f4848h;

    /* renamed from: i */
    private TextView f4849i;

    /* renamed from: com.chartboost.sdk.impl.g0$a */
    class C1918a extends C1967p1 {
        C1918a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo14620a(MotionEvent motionEvent) {
            C1917g0.this.f4995a.mo14532i().mo14638b(motionEvent.getX(), motionEvent.getY(), (float) super.getWidth(), (float) super.getHeight());
        }
    }

    public C1917g0(Context context, C1927i0 i0Var) {
        super(context, i0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo14617a() {
        Context context = getContext();
        int round = Math.round(getContext().getResources().getDisplayMetrics().density * 6.0f);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f4844d = linearLayout;
        linearLayout.setOrientation(0);
        this.f4844d.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f4845e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f4845e.setGravity(8388627);
        C1963o1 o1Var = new C1963o1(context);
        this.f4846f = o1Var;
        o1Var.setPadding(round, round, round, round);
        if (this.f4995a.f4903P.mo14248e()) {
            this.f4846f.mo14746a(this.f4995a.f4903P);
        }
        C1918a aVar = new C1918a(context);
        this.f4847g = aVar;
        aVar.setPadding(round, round, round, round);
        if (this.f4995a.f4904Q.mo14248e()) {
            this.f4847g.mo14757a(this.f4995a.f4904Q);
        }
        TextView textView = new TextView(getContext());
        this.f4848h = textView;
        textView.setTextColor(-15264491);
        this.f4848h.setTypeface((Typeface) null, 1);
        this.f4848h.setGravity(GravityCompat.START);
        this.f4848h.setPadding(round, round, round, round / 2);
        TextView textView2 = new TextView(getContext());
        this.f4849i = textView2;
        textView2.setTextColor(-15264491);
        this.f4849i.setTypeface((Typeface) null, 1);
        this.f4849i.setGravity(GravityCompat.START);
        this.f4849i.setPadding(round, 0, round, round);
        this.f4848h.setTextSize(2, 14.0f);
        this.f4849i.setTextSize(2, 11.0f);
        this.f4845e.addView(this.f4848h);
        this.f4845e.addView(this.f4849i);
        this.f4844d.addView(this.f4846f);
        this.f4844d.addView(this.f4845e, new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.f4844d.addView(this.f4847g);
        return this.f4844d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo14619b() {
        return 72;
    }

    /* renamed from: a */
    public void mo14618a(String str, String str2) {
        this.f4848h.setText(str);
        this.f4849i.setText(str2);
    }
}
