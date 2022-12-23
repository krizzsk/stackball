package com.p243my.target;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.my.target.h7 */
public class C7440h7 extends LinearLayoutManager {

    /* renamed from: a */
    public final int f18702a;

    /* renamed from: b */
    public int f18703b;

    /* renamed from: c */
    public C7441a f18704c;

    /* renamed from: d */
    public int f18705d;

    /* renamed from: e */
    public int f18706e;

    /* renamed from: f */
    public int f18707f;

    /* renamed from: g */
    public int f18708g;

    /* renamed from: com.my.target.h7$a */
    public interface C7441a {
        /* renamed from: a */
        void mo49453a();
    }

    public C7440h7(Context context) {
        super(context, 0, false);
        this.f18702a = C7761y8.m20950c(context).mo51902b(4);
    }

    /* renamed from: a */
    public void mo50310a(int i) {
        this.f18703b = i;
    }

    /* renamed from: a */
    public void mo50311a(C7441a aVar) {
        this.f18704c = aVar;
    }

    /* renamed from: a */
    public boolean mo50312a(View view) {
        int findFirstCompletelyVisibleItemPosition = findFirstCompletelyVisibleItemPosition();
        int position = getPosition(view);
        return findFirstCompletelyVisibleItemPosition <= position && position <= findLastCompletelyVisibleItemPosition();
    }

    public void measureChildWithMargins(View view, int i, int i2) {
        int height = getHeight();
        int width = getWidth();
        if (height != this.f18708g || width != this.f18707f || this.f18705d <= 0 || this.f18706e <= 0) {
            view.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
            float width2 = ((float) getWidth()) / ((float) view.getMeasuredWidth());
            this.f18705d = width2 > 1.0f ? (int) (((double) ((float) width)) / (Math.floor((double) width2) + 0.5d)) : (int) (((float) width) / 1.5f);
            this.f18706e = height;
            this.f18707f = width;
            this.f18708g = height;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (view != getChildAt(0)) {
            layoutParams.leftMargin = C7761y8.m20931a(this.f18703b / 2, view.getContext());
        }
        if (view != getChildAt(getChildCount())) {
            layoutParams.rightMargin = C7761y8.m20931a(this.f18703b / 2, view.getContext());
        }
        int childMeasureSpec = LinearLayoutManager.getChildMeasureSpec(width, getWidthMode(), 0, this.f18705d, canScrollHorizontally());
        int heightMode = getHeightMode();
        int i3 = this.f18702a;
        view.measure(childMeasureSpec, LinearLayoutManager.getChildMeasureSpec(height, heightMode, i3, height - (i3 * 2), canScrollVertically()));
    }

    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        C7441a aVar = this.f18704c;
        if (aVar != null) {
            aVar.mo49453a();
        }
    }
}
