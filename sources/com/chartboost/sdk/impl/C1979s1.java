package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.chartboost.sdk.C1887f;
import com.chartboost.sdk.Model.C1838c;

/* renamed from: com.chartboost.sdk.impl.s1 */
public class C1979s1 extends RelativeLayout {

    /* renamed from: a */
    private C1887f.C1889b f5084a;

    /* renamed from: b */
    private C1955n1 f5085b;

    /* renamed from: c */
    private C1955n1 f5086c;

    /* renamed from: d */
    private final C1838c f5087d;

    public C1979s1(Context context, C1838c cVar) {
        super(context);
        this.f5087d = cVar;
        if (cVar.f4464q.f4422b == 0) {
            C1955n1 n1Var = new C1955n1(context);
            this.f5085b = n1Var;
            addView(n1Var, new RelativeLayout.LayoutParams(-1, -1));
            C1955n1 n1Var2 = new C1955n1(context);
            this.f5086c = n1Var2;
            addView(n1Var2, new RelativeLayout.LayoutParams(-1, -1));
            this.f5086c.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo14789a() {
    }

    /* renamed from: b */
    public C1955n1 mo14790b() {
        return this.f5085b;
    }

    /* renamed from: c */
    public View mo14791c() {
        return this.f5084a;
    }

    /* renamed from: d */
    public C1838c mo14792d() {
        return this.f5087d;
    }

    /* renamed from: e */
    public boolean mo14793e() {
        C1887f.C1889b bVar = this.f5084a;
        return bVar != null && bVar.getVisibility() == 0;
    }

    /* renamed from: f */
    public void mo14794f() {
        if (this.f5084a == null) {
            C1887f.C1889b j = this.f5087d.mo14284j();
            this.f5084a = j;
            if (j != null) {
                addView(j, new RelativeLayout.LayoutParams(-1, -1));
                this.f5084a.mo14544b();
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        performClick();
        return true;
    }

    public boolean performClick() {
        super.performClick();
        return true;
    }
}
