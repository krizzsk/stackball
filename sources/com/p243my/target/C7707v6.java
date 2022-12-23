package com.p243my.target;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;

/* renamed from: com.my.target.v6 */
public interface C7707v6 {

    /* renamed from: com.my.target.v6$a */
    public interface C7708a {
        /* renamed from: a */
        void mo50109a(int i, Context context);

        /* renamed from: a */
        void mo50111a(View view, int i);

        /* renamed from: a */
        void mo50113a(int[] iArr, Context context);
    }

    void dispose();

    Parcelable getState();

    int[] getVisibleCardNumbers();

    void restoreState(Parcelable parcelable);

    void setPromoCardSliderListener(C7708a aVar);
}
