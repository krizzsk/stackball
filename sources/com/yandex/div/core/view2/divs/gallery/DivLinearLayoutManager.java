package com.yandex.div.core.view2.divs.gallery;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.impl.C13111fs;
import com.yandex.mobile.ads.impl.C13232gs;
import com.yandex.mobile.ads.impl.C13332hn;
import com.yandex.mobile.ads.impl.C13440is;
import com.yandex.mobile.ads.impl.C13513jm;
import com.yandex.mobile.ads.impl.C15177xl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72091bv = {1, 0, 3}, mo72092d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, mo72093d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lcom/yandex/mobile/ads/impl/is;", "Lcom/yandex/mobile/ads/impl/jm;", "divView", "Landroidx/recyclerview/widget/RecyclerView;", "view", "Lcom/yandex/mobile/ads/impl/fs;", "div", "", "orientation", "<init>", "(Lcom/yandex/mobile/ads/impl/jm;Landroidx/recyclerview/widget/RecyclerView;Lcom/yandex/mobile/ads/impl/fs;I)V", "div_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
public final class DivLinearLayoutManager extends LinearLayoutManager implements C13440is {

    /* renamed from: a */
    private final C13513jm f24001a;

    /* renamed from: b */
    private final RecyclerView f24002b;

    /* renamed from: c */
    private final C13111fs f24003c;

    /* renamed from: d */
    private final ArrayList<View> f24004d = new ArrayList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DivLinearLayoutManager(C13513jm jmVar, RecyclerView recyclerView, C13111fs fsVar, int i) {
        super(recyclerView.getContext(), i, false);
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        Intrinsics.checkNotNullParameter(recyclerView, "view");
        Intrinsics.checkNotNullParameter(fsVar, "div");
        this.f24001a = jmVar;
        this.f24002b = recyclerView;
        this.f24003c = fsVar;
    }

    /* renamed from: a */
    public RecyclerView mo60765a() {
        return this.f24002b;
    }

    /* renamed from: a */
    public /* synthetic */ C13332hn mo60766a(C15177xl xlVar) {
        return C13440is.CC.$default$a((C13440is) this, xlVar);
    }

    /* renamed from: a */
    public /* synthetic */ void mo60770a(View view, boolean z) {
        C13440is.CC.$default$a((C13440is) this, view, z);
    }

    /* renamed from: a */
    public /* synthetic */ void mo60771a(RecyclerView.Recycler recycler) {
        C13440is.CC.$default$a((C13440is) this, recycler);
    }

    /* renamed from: a */
    public /* synthetic */ void mo60772a(RecyclerView.State state) {
        C13440is.CC.$default$a((C13440is) this, state);
    }

    /* renamed from: a */
    public /* synthetic */ void mo60773a(RecyclerView recyclerView) {
        C13440is.CC.$default$a((C13440is) this, recyclerView);
    }

    /* renamed from: a */
    public /* synthetic */ void mo60774a(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        C13440is.CC.$default$a((C13440is) this, recyclerView, recycler);
    }

    /* renamed from: b */
    public C13111fs mo60775b() {
        return this.f24003c;
    }

    /* renamed from: b */
    public /* synthetic */ void mo60776b(View view, int i, int i2, int i3, int i4) {
        C13440is.CC.$default$b(this, view, i, i2, i3, i4);
    }

    /* renamed from: c */
    public List<C15177xl> mo60777c() {
        RecyclerView.Adapter adapter = this.f24002b.getAdapter();
        List<C15177xl> list = null;
        C13232gs.C13233a aVar = adapter instanceof C13232gs.C13233a ? (C13232gs.C13233a) adapter : null;
        if (aVar != null) {
            list = aVar.mo67642a();
        }
        return list == null ? this.f24003c.f33660q : list;
    }

    /* renamed from: d */
    public int mo60778d() {
        return getWidth();
    }

    public void detachView(View view) {
        Intrinsics.checkNotNullParameter(view, "child");
        super.detachView(view);
        Intrinsics.checkNotNullParameter(view, "child");
        mo60770a(view, true);
    }

    public void detachViewAt(int i) {
        super.detachViewAt(i);
        View childAt = getChildAt(i);
        if (childAt != null) {
            mo60770a(childAt, true);
        }
    }

    /* renamed from: e */
    public C13513jm mo60779e() {
        return this.f24001a;
    }

    /* renamed from: f */
    public int mo60780f() {
        return findFirstVisibleItemPosition();
    }

    /* renamed from: g */
    public ArrayList<View> mo60781g() {
        return this.f24004d;
    }

    /* renamed from: h */
    public int mo60782h() {
        return findLastVisibleItemPosition();
    }

    public void layoutDecorated(View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(view, "child");
        super.layoutDecorated(view, i, i2, i3, i4);
        Intrinsics.checkNotNullParameter(view, "child");
        C13440is.CC.m37563a(this, view, false, 2, (Object) null);
    }

    public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(view, "child");
        mo60776b(view, i, i2, i3, i4);
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "view");
        super.onAttachedToWindow(recyclerView);
        mo60773a(recyclerView);
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        Intrinsics.checkNotNullParameter(recyclerView, "view");
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        super.onDetachedFromWindow(recyclerView, recycler);
        mo60774a(recyclerView, recycler);
    }

    public void onLayoutCompleted(RecyclerView.State state) {
        mo60772a(state);
        super.onLayoutCompleted(state);
    }

    public void removeAndRecycleAllViews(RecyclerView.Recycler recycler) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        mo60771a(recycler);
        super.removeAndRecycleAllViews(recycler);
    }

    public void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "child");
        super.removeView(view);
        Intrinsics.checkNotNullParameter(view, "child");
        mo60770a(view, true);
    }

    public void removeViewAt(int i) {
        super.removeViewAt(i);
        View childAt = getChildAt(i);
        if (childAt != null) {
            mo60770a(childAt, true);
        }
    }

    /* renamed from: a */
    public void mo60769a(View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(view, "child");
        super.layoutDecoratedWithMargins(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    public int mo60764a(View view) {
        Intrinsics.checkNotNullParameter(view, "child");
        return getPosition(view);
    }

    /* renamed from: a */
    public void mo60767a(int i) {
        scrollToPosition(i);
    }

    /* renamed from: a */
    public void mo60768a(int i, int i2) {
        scrollToPositionWithOffset(i, i2);
    }
}
