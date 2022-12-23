package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public class ca1 extends RecyclerView {

    /* renamed from: b */
    public static final C12715a f31859b = new C12715a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private int f31860a;

    /* renamed from: com.yandex.mobile.ads.impl.ca1$a */
    public static final class C12715a {
        private C12715a() {
        }

        public /* synthetic */ C12715a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static final boolean m34650a(C12715a aVar, int i) {
            return i > 0;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ca1$b */
    public final class C12716b {

        /* renamed from: a */
        private final int f31861a;

        /* renamed from: b */
        private final int f31862b;

        /* renamed from: c */
        private final int f31863c;

        /* renamed from: d */
        private final int f31864d;

        public C12716b(ca1 ca1, int i, View view, View view2) {
            Intrinsics.checkNotNullParameter(ca1, "this$0");
            Intrinsics.checkNotNullParameter(view, "firstView");
            Intrinsics.checkNotNullParameter(view2, "lastView");
            int intValue = ((i - ((Number) ca1.m34648a(ca1, Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight()))).intValue()) / 2) + ((Number) ca1.m34648a(ca1, Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight()))).intValue();
            int intValue2 = ((Number) ca1.m34648a(ca1, Integer.valueOf(view2.getLeft()), Integer.valueOf(view2.getTop()))).intValue();
            this.f31863c = intValue2;
            int intValue3 = ((Number) ca1.m34648a(ca1, Integer.valueOf(view.getRight()), Integer.valueOf(view.getBottom()))).intValue();
            this.f31864d = intValue3;
            this.f31861a = intValue2 - ((i - ((Number) ca1.m34648a(ca1, Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()))).intValue()) / 2);
            this.f31862b = intValue3 - intValue;
        }

        /* renamed from: a */
        public final int mo66237a() {
            return this.f31862b;
        }

        /* renamed from: b */
        public final int mo66238b() {
            return this.f31861a;
        }

        /* renamed from: c */
        public final int mo66239c() {
            return this.f31864d;
        }

        /* renamed from: d */
        public final int mo66240d() {
            return this.f31863c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ca1$c */
    public static final class C12717c implements View.OnLayoutChangeListener {

        /* renamed from: b */
        final /* synthetic */ ca1 f31865b;

        /* renamed from: c */
        final /* synthetic */ int f31866c;

        public C12717c(ca1 ca1, int i) {
            this.f31865b = ca1;
            this.f31866c = i;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.removeOnLayoutChangeListener(this);
            ca1 ca1 = this.f31865b;
            ca1.post(new C12718d(ca1, this.f31866c));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ca1$d */
    static final class C12718d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ca1 f31867b;

        /* renamed from: c */
        final /* synthetic */ int f31868c;

        C12718d(ca1 ca1, int i) {
            this.f31867b = ca1;
            this.f31868c = i;
        }

        public final void run() {
            this.f31867b.scrollToPosition(this.f31868c);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ca1(Context context) {
        this(context, (AttributeSet) null, 0, 6);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ca1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ca1(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    public static final Object m34648a(ca1 ca1, Object obj, Object obj2) {
        return ca1.f31860a == 0 ? obj : obj2;
    }

    public boolean fling(int i, int i2) {
        int i3;
        boolean z = getLayoutManager() instanceof LinearLayoutManager;
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            int i4 = -1;
            if (findLastCompletelyVisibleItemPosition == -1) {
                findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            }
            View findViewByPosition = linearLayoutManager.findViewByPosition(findLastCompletelyVisibleItemPosition);
            int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            if (findFirstCompletelyVisibleItemPosition == -1) {
                findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            }
            View findViewByPosition2 = linearLayoutManager.findViewByPosition(findFirstCompletelyVisibleItemPosition);
            if (findViewByPosition2 == null || findViewByPosition == null) {
                return false;
            }
            int intValue = ((Number) m34649a(Integer.valueOf(getWidth()), Integer.valueOf(getHeight()))).intValue();
            C12716b bVar = new C12716b(this, intValue, findViewByPosition2, findViewByPosition);
            if (Math.abs(((Number) m34649a(Integer.valueOf(i), Integer.valueOf(i2))).intValue()) < 1000) {
                int i5 = intValue / 2;
                if (bVar.mo66240d() > i5) {
                    i3 = bVar.mo66237a();
                } else if (bVar.mo66239c() < i5) {
                    i3 = bVar.mo66238b();
                } else if (C12715a.m34650a(f31859b, i)) {
                    i3 = bVar.mo66237a();
                } else {
                    i3 = bVar.mo66238b();
                }
            } else if (C12715a.m34650a(f31859b, i)) {
                i3 = bVar.mo66238b();
            } else {
                i3 = bVar.mo66237a();
            }
            if (i3 != 0) {
                i4 = i3;
            } else if (C12715a.m34650a(f31859b, i)) {
                i4 = 1;
            }
            if (this.f31860a == 0) {
                smoothScrollBy(i4, 0);
            } else {
                smoothScrollBy(0, i4);
            }
            return true;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
    }

    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        if (i == 0) {
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            if (layoutManager != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                if (findFirstCompletelyVisibleItemPosition != 0) {
                    int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                    RecyclerView.Adapter adapter = getAdapter();
                    if (findLastCompletelyVisibleItemPosition != (adapter == null ? 0 : adapter.getItemCount()) - 1) {
                        if (findFirstCompletelyVisibleItemPosition == -1) {
                            findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                        }
                        if (findLastCompletelyVisibleItemPosition == -1) {
                            findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                        }
                        View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstCompletelyVisibleItemPosition);
                        View findViewByPosition2 = linearLayoutManager.findViewByPosition(findLastCompletelyVisibleItemPosition);
                        if (findViewByPosition != null && findViewByPosition2 != null) {
                            int intValue = ((Number) m34649a(Integer.valueOf(getWidth()), Integer.valueOf(getHeight()))).intValue();
                            C12716b bVar = new C12716b(this, intValue, findViewByPosition, findViewByPosition2);
                            if (findFirstCompletelyVisibleItemPosition != findLastCompletelyVisibleItemPosition) {
                                int i2 = intValue / 4;
                                if (bVar.mo66240d() > i2) {
                                    if (this.f31860a == 0) {
                                        smoothScrollBy(bVar.mo66237a(), 0);
                                    } else {
                                        smoothScrollBy(0, bVar.mo66237a());
                                    }
                                } else if (bVar.mo66239c() >= i2) {
                                } else {
                                    if (this.f31860a == 0) {
                                        smoothScrollBy(bVar.mo66238b(), 0);
                                    } else {
                                        smoothScrollBy(0, bVar.mo66238b());
                                    }
                                }
                            } else if (this.f31860a == 0) {
                                smoothScrollBy(bVar.mo66238b(), 0);
                            } else {
                                smoothScrollBy(0, bVar.mo66238b());
                            }
                        }
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            }
        }
    }

    public void scrollToPosition(int i) {
        if (!isLayoutFrozen()) {
            stopScroll();
            if (getLayoutManager() != null) {
                if (!(getLayoutManager() instanceof LinearLayoutManager)) {
                    RecyclerView.LayoutManager layoutManager = getLayoutManager();
                    Intrinsics.checkNotNull(layoutManager);
                    layoutManager.scrollToPosition(i);
                    awakenScrollBars();
                    return;
                }
                RecyclerView.Adapter adapter = getAdapter();
                if ((adapter == null ? 0 : adapter.getItemCount()) > 0) {
                    RecyclerView.LayoutManager layoutManager2 = getLayoutManager();
                    if (layoutManager2 != null) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager2;
                        int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                        if (findFirstCompletelyVisibleItemPosition == -1) {
                            findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                        }
                        View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstCompletelyVisibleItemPosition);
                        if (findViewByPosition == null) {
                            linearLayoutManager.scrollToPositionWithOffset(i, 0);
                            addOnLayoutChangeListener(new C12717c(this, i));
                            return;
                        }
                        linearLayoutManager.scrollToPositionWithOffset(i, (((Number) m34649a(Integer.valueOf(getWidth()), Integer.valueOf(getHeight()))).intValue() - ((Number) m34649a(Integer.valueOf(findViewByPosition.getWidth()), Integer.valueOf(findViewByPosition.getHeight()))).intValue()) / 2);
                        awakenScrollBars();
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                }
            }
        }
    }

    public final void setOrientation(int i) {
        this.f31860a = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ca1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    private final <T> T m34649a(T t, T t2) {
        return this.f31860a == 0 ? t : t2;
    }
}
