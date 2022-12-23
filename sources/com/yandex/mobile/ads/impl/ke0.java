package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;

public class ke0 extends LinearLayout {

    /* renamed from: a */
    private final C14393ql f36107a = new C14393ql();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C12583bd f36108b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public TextView f36109c;

    /* renamed from: d */
    private final View.OnClickListener f36110d = new C13701a();

    /* renamed from: com.yandex.mobile.ads.impl.ke0$a */
    class C13701a implements View.OnClickListener {
        C13701a() {
        }

        public void onClick(View view) {
            boolean z = !ke0.this.f36108b.isSelected();
            ke0.this.f36108b.setSelected(z);
            ke0.this.f36109c.setVisibility(z ? 0 : 8);
        }
    }

    public ke0(Context context) {
        super(context);
        m38309a(context);
    }

    public void setDescription(String str) {
        this.f36109c.setText(str);
    }

    /* renamed from: a */
    private void m38309a(Context context) {
        setOrientation(0);
        int a = this.f36107a.mo69618a(context, 4.0f);
        setPadding(a, a, a, a);
        C12583bd bdVar = new C12583bd(context, this.f36107a);
        this.f36108b = bdVar;
        bdVar.setOnClickListener(this.f36110d);
        addView(this.f36108b);
        this.f36109c = new TextView(context);
        int a2 = this.f36107a.mo69618a(context, 3.0f);
        this.f36109c.setPadding(a2, a2, a2, a2);
        int a3 = this.f36107a.mo69618a(context, 2.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(a3, SupportMenu.CATEGORY_MASK);
        this.f36109c.setBackgroundDrawable(gradientDrawable);
        addView(this.f36109c);
        int a4 = this.f36107a.mo69618a(context, 2.0f);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f36109c.getLayoutParams();
        layoutParams.setMargins(a4, 0, a4, a4);
        this.f36109c.setLayoutParams(layoutParams);
        this.f36109c.setVisibility(8);
    }
}
