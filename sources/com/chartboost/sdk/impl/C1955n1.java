package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import com.chartboost.sdk.Model.C1836a;

/* renamed from: com.chartboost.sdk.impl.n1 */
public final class C1955n1 extends View {

    /* renamed from: a */
    private boolean f5018a = false;

    public C1955n1(Context context) {
        super(context);
        setFocusable(false);
        setBackgroundColor(-1442840576);
    }

    /* renamed from: a */
    public void mo14717a(C1950m1 m1Var, C1836a aVar) {
        if (!this.f5018a) {
            m1Var.mo14704a(true, (View) this, aVar);
            this.f5018a = true;
        }
    }
}
