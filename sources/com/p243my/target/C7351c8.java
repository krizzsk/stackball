package com.p243my.target;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.my.target.c8 */
public class C7351c8 extends LinearLayoutManager {

    /* renamed from: a */
    public C7352a f18440a;

    /* renamed from: com.my.target.c8$a */
    public interface C7352a {
        /* renamed from: a */
        void mo49847a();
    }

    public C7351c8(Context context) {
        super(context, 0, false);
    }

    /* renamed from: a */
    public void mo49846a(C7352a aVar) {
        this.f18440a = aVar;
    }

    public void measureChildWithMargins(View view, int i, int i2) {
        int a = C7761y8.m20931a(10, view.getContext());
        if (getPosition(view) > 0) {
            ((RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin = a;
            ((RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(((int) (((float) getWidth()) * 0.7f)) - a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
        int measuredHeight = view.getMeasuredHeight();
        if (measuredHeight > getHeight()) {
            view.measure(View.MeasureSpec.makeMeasureSpec(((int) (((float) getWidth()) * (((((float) getHeight()) - ((float) (a * 2))) * 0.7f) / ((float) measuredHeight)))) - a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
        }
    }

    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        C7352a aVar = this.f18440a;
        if (aVar != null) {
            aVar.mo49847a();
        }
    }
}
