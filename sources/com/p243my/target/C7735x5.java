package com.p243my.target;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* renamed from: com.my.target.x5 */
public class C7735x5 extends RelativeLayout {

    /* renamed from: a */
    public final TextView f19588a;

    /* renamed from: b */
    public final View f19589b;

    /* renamed from: c */
    public String f19590c;

    /* renamed from: d */
    public C7736a f19591d;

    /* renamed from: com.my.target.x5$a */
    public interface C7736a {
        /* renamed from: a */
        void mo49448a();
    }

    public C7735x5(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.f19588a = textView;
        textView.setTextColor(-1);
        textView.setTypeface((Typeface) null, 1);
        textView.setTextSize(2, 20.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 8.0f, getContext().getResources().getDisplayMetrics());
        layoutParams.addRule(15);
        layoutParams.addRule(1, 256);
        addView(textView, layoutParams);
        setBackgroundColor(-7829368);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (C7761y8.m20928a() + 0.5f));
        layoutParams2.addRule(12);
        View view = new View(context);
        this.f19589b = view;
        view.setBackgroundColor(-10066330);
        addView(view, layoutParams2);
        C7422g6 g6Var = new C7422g6(context);
        g6Var.mo50226a(C7587o5.m20037a(), false);
        g6Var.setId(256);
        g6Var.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C7735x5.this.m20813a(view);
            }
        });
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = (int) TypedValue.applyDimension(1, 5.0f, getContext().getResources().getDisplayMetrics());
        layoutParams3.addRule(15);
        layoutParams3.addRule(9);
        g6Var.setLayoutParams(layoutParams3);
        addView(g6Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m20813a(View view) {
        C7736a aVar = this.f19591d;
        if (aVar != null) {
            aVar.mo49448a();
        }
    }

    public String getTitle() {
        return this.f19590c;
    }

    public void setMainColor(int i) {
        setBackgroundColor(i);
    }

    public void setOnCloseClickListener(C7736a aVar) {
        this.f19591d = aVar;
    }

    public void setStripeColor(int i) {
        this.f19589b.setBackgroundColor(i);
    }

    public void setTitle(String str) {
        this.f19590c = str;
        this.f19588a.setText(str);
    }

    public void setTitleColor(int i) {
        this.f19588a.setTextColor(i);
    }
}
