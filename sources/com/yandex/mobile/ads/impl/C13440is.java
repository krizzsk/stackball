package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.C12066R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

/* renamed from: com.yandex.mobile.ads.impl.is */
public interface C13440is {
    /* renamed from: a */
    int mo60764a(View view);

    /* renamed from: a */
    RecyclerView mo60765a();

    /* renamed from: a */
    C13332hn mo60766a(C15177xl xlVar);

    /* renamed from: a */
    void mo60767a(int i);

    /* renamed from: a */
    void mo60768a(int i, int i2);

    /* renamed from: a */
    void mo60769a(View view, int i, int i2, int i3, int i4);

    /* renamed from: a */
    void mo60770a(View view, boolean z);

    /* renamed from: a */
    void mo60771a(RecyclerView.Recycler recycler);

    /* renamed from: a */
    void mo60772a(RecyclerView.State state);

    /* renamed from: a */
    void mo60773a(RecyclerView recyclerView);

    /* renamed from: a */
    void mo60774a(RecyclerView recyclerView, RecyclerView.Recycler recycler);

    /* renamed from: b */
    C13111fs mo60775b();

    /* renamed from: b */
    void mo60776b(View view, int i, int i2, int i3, int i4);

    /* renamed from: c */
    List<C15177xl> mo60777c();

    /* renamed from: d */
    int mo60778d();

    /* renamed from: e */
    C13513jm mo60779e();

    /* renamed from: f */
    int mo60780f();

    /* renamed from: g */
    ArrayList<View> mo60781g();

    /* renamed from: h */
    int mo60782h();

    /* renamed from: com.yandex.mobile.ads.impl.is$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(C13440is _this, RecyclerView.State state) {
            Iterator<View> it = _this.mo60781g().iterator();
            while (it.hasNext()) {
                View next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "child");
                _this.mo60776b(next, next.getLeft(), next.getTop(), next.getRight(), next.getBottom());
            }
            _this.mo60781g().clear();
        }

        public static void $default$b(C13440is _this, View view, int i, int i2, int i3, int i4) {
            C15177xl xlVar;
            int i5;
            C13440is isVar = _this;
            View view2 = view;
            Intrinsics.checkNotNullParameter(view, "child");
            int measuredHeight = _this.mo60765a().getMeasuredHeight();
            try {
                List<C15177xl> c = _this.mo60777c();
                Object tag = view.getTag(C12066R.C12068id.div_gallery_item_index);
                if (tag != null) {
                    xlVar = c.get(((Integer) tag).intValue());
                    int ordinal = _this.mo60766a(xlVar).ordinal();
                    if (ordinal == 1) {
                        i5 = (measuredHeight - view.getMeasuredHeight()) / 2;
                    } else if (ordinal != 2) {
                        i5 = 0;
                    } else {
                        i5 = measuredHeight - view.getMeasuredHeight();
                    }
                    if (i5 < 0) {
                        _this.mo60769a(view, i, i2, i3, i4);
                        _this.mo60781g().add(view);
                        return;
                    }
                    _this.mo60769a(view, i, i2 + i5, i3, i4 + i5);
                    m37563a(_this, view, false, 2, (Object) null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            } catch (Exception unused) {
                xlVar = null;
            }
        }

        public static void $default$a(C13440is _this, RecyclerView.Recycler recycler) {
            Intrinsics.checkNotNullParameter(recycler, "recycler");
            RecyclerView a = _this.mo60765a();
            int childCount = a.getChildCount();
            if (childCount > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    View childAt = a.getChildAt(i);
                    Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
                    _this.mo60770a(childAt, true);
                    if (i2 < childCount) {
                        i = i2;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m37563a(C13440is isVar, View view, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            isVar.mo60770a(view, z);
        }

        public static void $default$a(C13440is _this, View view, boolean z) {
            View view2;
            Intrinsics.checkNotNullParameter(view, "child");
            int a = _this.mo60764a(view);
            if (a != -1) {
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null && (view2 = (View) SequencesKt.firstOrNull(ViewGroupKt.getChildren(viewGroup))) != null) {
                    C15177xl xlVar = _this.mo60777c().get(a);
                    if (z) {
                        s10 d = _this.mo60779e().mo68038h().mo65806d();
                        Intrinsics.checkNotNullExpressionValue(d, "divView.div2Component.visibilityActionTracker");
                        s10.m41777a(d, _this.mo60779e(), (View) null, xlVar, (List) null, 8, (Object) null);
                        _this.mo60779e().mo68026a(view2);
                        return;
                    }
                    s10 d2 = _this.mo60779e().mo68038h().mo65806d();
                    Intrinsics.checkNotNullExpressionValue(d2, "divView.div2Component.visibilityActionTracker");
                    s10.m41777a(d2, _this.mo60779e(), view2, xlVar, (List) null, 8, (Object) null);
                    _this.mo60779e().mo68027a(view2, xlVar);
                }
            }
        }

        public static C13332hn $default$a(C13440is _this, C15177xl xlVar) {
            C14697tn b;
            f50<C13332hn> b2;
            j50 b3 = _this.mo60779e().mo66388b();
            if (xlVar != null && (b = xlVar.mo70911b()) != null && (b2 = b.mo66143b()) != null) {
                return b2.mo66924a(b3);
            }
            int ordinal = _this.mo60775b().f33653j.mo66924a(b3).ordinal();
            if (ordinal == 1) {
                return C13332hn.CENTER;
            }
            if (ordinal != 2) {
                return C13332hn.TOP;
            }
            return C13332hn.BOTTOM;
        }

        public static void $default$a(C13440is _this, RecyclerView recyclerView) {
            Intrinsics.checkNotNullParameter(recyclerView, "view");
            int childCount = recyclerView.getChildCount();
            if (childCount > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    View childAt = recyclerView.getChildAt(i);
                    Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
                    m37563a(_this, childAt, false, 2, (Object) null);
                    if (i2 < childCount) {
                        i = i2;
                    } else {
                        return;
                    }
                }
            }
        }

        public static void $default$a(C13440is _this, RecyclerView recyclerView, RecyclerView.Recycler recycler) {
            Intrinsics.checkNotNullParameter(recyclerView, "view");
            Intrinsics.checkNotNullParameter(recycler, "recycler");
            int childCount = recyclerView.getChildCount();
            if (childCount > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    View childAt = recyclerView.getChildAt(i);
                    Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
                    _this.mo60770a(childAt, true);
                    if (i2 < childCount) {
                        i = i2;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
