package com.mbridge.msdk.widget;

import android.view.View;
import java.util.Calendar;

/* renamed from: com.mbridge.msdk.widget.a */
/* compiled from: MBridgeNoDoubleClick */
public abstract class C7215a implements View.OnClickListener {

    /* renamed from: a */
    private long f18072a = 0;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo48366a(View view);

    public void onClick(View view) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this.f18072a > 2000) {
            this.f18072a = timeInMillis;
            mo48366a(view);
        }
    }
}
