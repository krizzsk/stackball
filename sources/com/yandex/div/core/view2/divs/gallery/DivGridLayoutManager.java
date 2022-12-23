package com.yandex.div.core.view2.divs.gallery;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.yandex.mobile.ads.impl.C13111fs;
import com.yandex.mobile.ads.impl.C13232gs;
import com.yandex.mobile.ads.impl.C13332hn;
import com.yandex.mobile.ads.impl.C13440is;
import com.yandex.mobile.ads.impl.C13513jm;
import com.yandex.mobile.ads.impl.C15177xl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72091bv = {1, 0, 3}, mo72092d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, mo72093d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivGridLayoutManager;", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "Lcom/yandex/mobile/ads/impl/is;", "Lcom/yandex/mobile/ads/impl/jm;", "divView", "Landroidx/recyclerview/widget/RecyclerView;", "view", "Lcom/yandex/mobile/ads/impl/fs;", "div", "", "orientation", "<init>", "(Lcom/yandex/mobile/ads/impl/jm;Landroidx/recyclerview/widget/RecyclerView;Lcom/yandex/mobile/ads/impl/fs;I)V", "div_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
public final class DivGridLayoutManager extends StaggeredGridLayoutManager implements C13440is {

    /* renamed from: a */
    private final C13513jm f23997a;

    /* renamed from: b */
    private final RecyclerView f23998b;

    /* renamed from: c */
    private final C13111fs f23999c;

    /* renamed from: d */
    private final ArrayList<View> f24000d;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r0 = r0.mo66924a(r3.mo66388b());
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DivGridLayoutManager(com.yandex.mobile.ads.impl.C13513jm r3, androidx.recyclerview.widget.RecyclerView r4, com.yandex.mobile.ads.impl.C13111fs r5, int r6) {
        /*
            r2 = this;
            java.lang.String r0 = "divView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "div"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r0 = r5.f33651h
            if (r0 != 0) goto L_0x0014
            goto L_0x0020
        L_0x0014:
            com.yandex.mobile.ads.impl.j50 r1 = r3.mo66388b()
            java.lang.Object r0 = r0.mo66924a((com.yandex.mobile.ads.impl.j50) r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L_0x0022
        L_0x0020:
            r0 = 1
            goto L_0x0026
        L_0x0022:
            int r0 = r0.intValue()
        L_0x0026:
            r2.<init>(r0, r6)
            r2.f23997a = r3
            r2.f23998b = r4
            r2.f23999c = r5
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f24000d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.gallery.DivGridLayoutManager.<init>(com.yandex.mobile.ads.impl.jm, androidx.recyclerview.widget.RecyclerView, com.yandex.mobile.ads.impl.fs, int):void");
    }

    /* renamed from: a */
    public RecyclerView mo60765a() {
        return this.f23998b;
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
        return this.f23999c;
    }

    /* renamed from: b */
    public /* synthetic */ void mo60776b(View view, int i, int i2, int i3, int i4) {
        C13440is.CC.$default$b(this, view, i, i2, i3, i4);
    }

    /* renamed from: c */
    public List<C15177xl> mo60777c() {
        RecyclerView.Adapter adapter = this.f23998b.getAdapter();
        List<C15177xl> list = null;
        C13232gs.C13233a aVar = adapter instanceof C13232gs.C13233a ? (C13232gs.C13233a) adapter : null;
        if (aVar != null) {
            list = aVar.mo67642a();
        }
        return list == null ? this.f23999c.f33660q : list;
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
        return this.f23997a;
    }

    /* renamed from: f */
    public int mo60780f() {
        int[] iArr = new int[getItemCount()];
        findFirstVisibleItemPositions(iArr);
        return ArraysKt.first(iArr);
    }

    /* renamed from: g */
    public ArrayList<View> mo60781g() {
        return this.f24000d;
    }

    /* renamed from: h */
    public int mo60782h() {
        int[] iArr = new int[getItemCount()];
        findLastVisibleItemPositions(iArr);
        return ArraysKt.last(iArr);
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
