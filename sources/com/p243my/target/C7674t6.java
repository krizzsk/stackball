package com.p243my.target;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p243my.target.C7636r6;
import com.p243my.target.C7653s6;
import com.p243my.target.C7707v6;
import java.util.List;

/* renamed from: com.my.target.t6 */
public class C7674t6 extends RecyclerView implements C7693u6 {

    /* renamed from: a */
    public final C7677c f19385a;

    /* renamed from: b */
    public final C7653s6.C7656c f19386b;

    /* renamed from: c */
    public final C7653s6 f19387c;

    /* renamed from: d */
    public boolean f19388d;

    /* renamed from: e */
    public C7707v6.C7708a f19389e;

    /* renamed from: com.my.target.t6$b */
    public class C7676b implements C7653s6.C7656c {
        public C7676b() {
        }

        public void onCardRender(int i) {
            if (C7674t6.this.f19389e != null) {
                C7674t6.this.f19389e.mo50109a(i, C7674t6.this.getContext());
            }
        }

        public void onClick(View view) {
            View findContainingItemView;
            int position;
            if (!C7674t6.this.f19388d && C7674t6.this.isClickable() && (findContainingItemView = C7674t6.this.f19385a.findContainingItemView(view)) != null && C7674t6.this.f19389e != null && (position = C7674t6.this.f19385a.getPosition(findContainingItemView)) >= 0) {
                C7674t6.this.f19389e.mo50111a(findContainingItemView, position);
            }
        }
    }

    /* renamed from: com.my.target.t6$c */
    public static class C7677c extends LinearLayoutManager {

        /* renamed from: a */
        public C7636r6.C7637a f19391a;

        /* renamed from: b */
        public int f19392b;

        public C7677c(Context context) {
            super(context, 0, false);
        }

        /* renamed from: a */
        public void mo51596a(int i) {
            this.f19392b = i;
        }

        /* renamed from: a */
        public void mo51597a(C7636r6.C7637a aVar) {
            this.f19391a = aVar;
        }

        public void measureChildWithMargins(View view, int i, int i2) {
            int i3;
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            int width = getWidth();
            if (getHeight() > 0 && width > 0) {
                if (getItemViewType(view) == 1) {
                    i3 = this.f19392b;
                } else if (getItemViewType(view) == 2) {
                    layoutParams.leftMargin = this.f19392b;
                    super.measureChildWithMargins(view, i, i2);
                } else {
                    i3 = this.f19392b;
                    layoutParams.leftMargin = i3;
                }
                layoutParams.rightMargin = i3;
                super.measureChildWithMargins(view, i, i2);
            }
        }

        public void onLayoutCompleted(RecyclerView.State state) {
            super.onLayoutCompleted(state);
            C7636r6.C7637a aVar = this.f19391a;
            if (aVar != null) {
                aVar.mo49443a();
            }
        }
    }

    public C7674t6(Context context) {
        this(context, (AttributeSet) null);
    }

    public C7674t6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7674t6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19386b = new C7676b();
        C7677c cVar = new C7677c(context);
        this.f19385a = cVar;
        cVar.mo51596a(C7761y8.m20931a(4, context));
        this.f19387c = new C7653s6(getContext());
        setHasFixedSize(true);
    }

    private void setCardLayoutManager(C7677c cVar) {
        cVar.mo51597a((C7636r6.C7637a) new C7636r6.C7637a() {
            /* renamed from: a */
            public final void mo49443a() {
                C7674t6.this.mo51592a();
            }
        });
        super.setLayoutManager(cVar);
    }

    /* renamed from: a */
    public final void mo51592a() {
        C7707v6.C7708a aVar = this.f19389e;
        if (aVar != null) {
            aVar.mo50113a(getVisibleCardNumbers(), getContext());
        }
    }

    public void dispose() {
        this.f19387c.mo51508a();
    }

    public Parcelable getState() {
        return this.f19385a.onSaveInstanceState();
    }

    public View getView() {
        return this;
    }

    public int[] getVisibleCardNumbers() {
        int findFirstVisibleItemPosition = this.f19385a.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = this.f19385a.findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition < 0 || findLastVisibleItemPosition < 0) {
            return new int[0];
        }
        if (C7311a9.m18721a(this.f19385a.findViewByPosition(findFirstVisibleItemPosition)) < 50.0d) {
            findFirstVisibleItemPosition++;
        }
        if (C7311a9.m18721a(this.f19385a.findViewByPosition(findLastVisibleItemPosition)) < 50.0d) {
            findLastVisibleItemPosition--;
        }
        if (findFirstVisibleItemPosition > findLastVisibleItemPosition) {
            return new int[0];
        }
        if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
            return new int[]{findFirstVisibleItemPosition};
        }
        int i = (findLastVisibleItemPosition - findFirstVisibleItemPosition) + 1;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = findFirstVisibleItemPosition;
            findFirstVisibleItemPosition++;
        }
        return iArr;
    }

    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        boolean z = i != 0;
        this.f19388d = z;
        if (!z) {
            mo51592a();
        }
    }

    public void restoreState(Parcelable parcelable) {
        this.f19385a.onRestoreInstanceState(parcelable);
    }

    public void setPromoCardSliderListener(C7707v6.C7708a aVar) {
        this.f19389e = aVar;
    }

    public void setupCards(List<C7453i2> list) {
        this.f19387c.mo51512a(list);
        if (isClickable()) {
            this.f19387c.mo51511a(this.f19386b);
        }
        setCardLayoutManager(this.f19385a);
        swapAdapter(this.f19387c, true);
    }
}
