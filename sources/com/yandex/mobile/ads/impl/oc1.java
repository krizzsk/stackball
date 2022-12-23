package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.yandex.mobile.ads.C12066R;
import kotlin.jvm.internal.Intrinsics;

public final class oc1 extends LinearLayout {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public oc1(Context context) {
        this(context, (AttributeSet) null, 2);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oc1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setId(C12066R.C12068id.div_tabbed_tab_title_item);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        setGravity(0);
    }

    public /* synthetic */ oc1(Context context, AttributeSet attributeSet, int i) {
        this(context, (AttributeSet) null);
    }
}
