package com.p243my.target;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.my.target.k7 */
public class C7507k7 extends LinearSnapHelper {

    /* renamed from: a */
    public final DecelerateInterpolator f18902a;

    /* renamed from: b */
    public int f18903b;

    /* renamed from: c */
    public boolean f18904c = false;

    /* renamed from: d */
    public float f18905d = 60.0f;

    /* renamed from: e */
    public int f18906e = -1;

    /* renamed from: f */
    public float f18907f = -1.0f;

    /* renamed from: g */
    public OrientationHelper f18908g;

    /* renamed from: h */
    public OrientationHelper f18909h;

    /* renamed from: i */
    public RecyclerView f18910i;

    /* renamed from: com.my.target.k7$a */
    public class C7508a extends LinearSmoothScroller {
        public C7508a(Context context) {
            super(context);
        }

        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return C7507k7.this.f18905d / ((float) displayMetrics.densityDpi);
        }

        public int calculateTimeForDeceleration(int i) {
            return (int) Math.ceil(((double) calculateTimeForScrolling(i)) / 0.3d);
        }

        public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
            if (C7507k7.this.f18910i != null && C7507k7.this.f18910i.getLayoutManager() != null) {
                C7507k7 k7Var = C7507k7.this;
                int[] calculateDistanceToFinalSnap = k7Var.calculateDistanceToFinalSnap(k7Var.f18910i.getLayoutManager(), view);
                int i = calculateDistanceToFinalSnap[0];
                int i2 = calculateDistanceToFinalSnap[1];
                int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                if (calculateTimeForDeceleration > 0) {
                    action.update(i, i2, calculateTimeForDeceleration, C7507k7.this.f18902a);
                }
            }
        }
    }

    public C7507k7(int i) {
        this.f18903b = i;
        this.f18902a = new DecelerateInterpolator(1.7f);
    }

    /* renamed from: a */
    public final int mo50732a() {
        int width;
        RecyclerView recyclerView = this.f18910i;
        if (recyclerView == null) {
            return Integer.MAX_VALUE;
        }
        if (this.f18907f != -1.0f) {
            if (this.f18908g != null) {
                width = recyclerView.getHeight();
            } else if (this.f18909h == null) {
                return Integer.MAX_VALUE;
            } else {
                width = recyclerView.getWidth();
            }
            return (int) (((float) width) * this.f18907f);
        }
        int i = this.f18906e;
        if (i != -1) {
            return i;
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public final int mo50733a(View view, OrientationHelper orientationHelper) {
        int i;
        int i2;
        if (!this.f18904c) {
            int decoratedEnd = orientationHelper.getDecoratedEnd(view);
            if (decoratedEnd < orientationHelper.getEnd() - ((orientationHelper.getEnd() - orientationHelper.getEndAfterPadding()) / 2)) {
                return decoratedEnd - orientationHelper.getEndAfterPadding();
            }
            i2 = orientationHelper.getDecoratedEnd(view);
            i = orientationHelper.getEnd();
        } else {
            i2 = orientationHelper.getDecoratedEnd(view);
            i = orientationHelper.getEndAfterPadding();
        }
        return i2 - i;
    }

    /* renamed from: a */
    public final View mo50734a(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper, int i, boolean z) {
        View view = null;
        if (layoutManager.getChildCount() != 0 && (layoutManager instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (z && mo50739a(linearLayoutManager)) {
                return null;
            }
            int i2 = Integer.MAX_VALUE;
            int startAfterPadding = layoutManager.getClipToPadding() ? orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2) : orientationHelper.getEnd() / 2;
            boolean z2 = i == 8388611;
            for (int i3 = 0; i3 < linearLayoutManager.getChildCount(); i3++) {
                View childAt = linearLayoutManager.getChildAt(i3);
                int abs = Math.abs(z2 ? !this.f18904c ? orientationHelper.getDecoratedStart(childAt) : orientationHelper.getStartAfterPadding() - orientationHelper.getDecoratedStart(childAt) : (orientationHelper.getDecoratedStart(childAt) + (orientationHelper.getDecoratedMeasurement(childAt) / 2)) - startAfterPadding);
                if (abs < i2) {
                    view = childAt;
                    i2 = abs;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    public final View mo50735a(RecyclerView.LayoutManager layoutManager, boolean z) {
        OrientationHelper orientationHelper;
        OrientationHelper orientationHelper2;
        int i = this.f18903b;
        if (i == 17) {
            return mo50734a(layoutManager, getHorizontalHelper(layoutManager), 17, z);
        }
        if (i != 48) {
            if (i == 80) {
                orientationHelper2 = getVerticalHelper(layoutManager);
            } else if (i == 8388611) {
                orientationHelper = getHorizontalHelper(layoutManager);
            } else if (i != 8388613) {
                return null;
            } else {
                orientationHelper2 = getHorizontalHelper(layoutManager);
            }
            return mo50734a(layoutManager, orientationHelper2, GravityCompat.END, z);
        }
        orientationHelper = getVerticalHelper(layoutManager);
        return mo50734a(layoutManager, orientationHelper, GravityCompat.START, z);
    }

    /* renamed from: a */
    public void mo50736a(int i) {
        mo50737a(i, Boolean.TRUE);
    }

    /* renamed from: a */
    public void mo50737a(int i, Boolean bool) {
        if (this.f18903b != i) {
            this.f18903b = i;
            mo50738a(bool);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = r3.f18910i.getLayoutManager();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50738a(java.lang.Boolean r4) {
        /*
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r3.f18910i
            if (r0 == 0) goto L_0x0036
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            if (r0 != 0) goto L_0x000b
            goto L_0x0036
        L_0x000b:
            androidx.recyclerview.widget.RecyclerView r0 = r3.f18910i
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            r1 = 0
            android.view.View r2 = r3.mo50735a((androidx.recyclerview.widget.RecyclerView.LayoutManager) r0, (boolean) r1)
            if (r2 == 0) goto L_0x0036
            int[] r0 = r3.calculateDistanceToFinalSnap(r0, r2)
            boolean r4 = r4.booleanValue()
            r2 = 1
            if (r4 == 0) goto L_0x002d
            androidx.recyclerview.widget.RecyclerView r4 = r3.f18910i
            r1 = r0[r1]
            r0 = r0[r2]
            r4.smoothScrollBy(r1, r0)
            goto L_0x0036
        L_0x002d:
            androidx.recyclerview.widget.RecyclerView r4 = r3.f18910i
            r1 = r0[r1]
            r0 = r0[r2]
            r4.scrollBy(r1, r0)
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7507k7.mo50738a(java.lang.Boolean):void");
    }

    /* renamed from: a */
    public final boolean mo50739a(LinearLayoutManager linearLayoutManager) {
        return ((linearLayoutManager.getReverseLayout() || this.f18903b != 8388611) && (!linearLayoutManager.getReverseLayout() || this.f18903b != 8388613) && ((linearLayoutManager.getReverseLayout() || this.f18903b != 48) && (!linearLayoutManager.getReverseLayout() || this.f18903b != 80))) ? this.f18903b == 17 ? linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0 || linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1 : linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0 : linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1;
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        if (recyclerView != null) {
            recyclerView.setOnFlingListener((RecyclerView.OnFlingListener) null);
            this.f18910i = recyclerView;
        } else {
            this.f18910i = null;
        }
        try {
            super.attachToRecyclerView(recyclerView);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final int mo50740b(View view, OrientationHelper orientationHelper) {
        boolean z = this.f18904c;
        int decoratedStart = orientationHelper.getDecoratedStart(view);
        return (z || decoratedStart >= orientationHelper.getStartAfterPadding() / 2) ? decoratedStart - orientationHelper.getStartAfterPadding() : decoratedStart;
    }

    /* renamed from: b */
    public void mo50741b(int i) {
        RecyclerView recyclerView;
        RecyclerView.SmoothScroller createScroller;
        if (i != -1 && (recyclerView = this.f18910i) != null && recyclerView.getLayoutManager() != null && (createScroller = createScroller(this.f18910i.getLayoutManager())) != null) {
            createScroller.setTargetPosition(i);
            this.f18910i.getLayoutManager().startSmoothScroll(createScroller);
        }
    }

    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int i = this.f18903b;
        if (i == 17) {
            return super.calculateDistanceToFinalSnap(layoutManager, view);
        }
        int[] iArr = new int[2];
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return iArr;
        }
        OrientationHelper horizontalHelper = getHorizontalHelper((LinearLayoutManager) layoutManager);
        if (i == 8388611) {
            iArr[0] = mo50740b(view, horizontalHelper);
        } else {
            iArr[0] = mo50733a(view, horizontalHelper);
        }
        return iArr;
    }

    public int[] calculateScrollDistance(int i, int i2) {
        if (this.f18910i == null || ((this.f18908g == null && this.f18909h == null) || (this.f18906e == -1 && this.f18907f == -1.0f))) {
            return super.calculateScrollDistance(i, i2);
        }
        Scroller scroller = new Scroller(this.f18910i.getContext(), new DecelerateInterpolator());
        int a = mo50732a();
        int i3 = -a;
        scroller.fling(0, 0, i, i2, i3, a, i3, a);
        return new int[]{scroller.getFinalX(), scroller.getFinalY()};
    }

    public RecyclerView.SmoothScroller createScroller(RecyclerView.LayoutManager layoutManager) {
        RecyclerView recyclerView;
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (recyclerView = this.f18910i) == null) {
            return null;
        }
        return new C7508a(recyclerView.getContext());
    }

    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        return mo50735a(layoutManager, true);
    }

    public final OrientationHelper getHorizontalHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f18909h;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.f18909h = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.f18909h;
    }

    public final OrientationHelper getVerticalHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f18908g;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.f18908g = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.f18908g;
    }
}
