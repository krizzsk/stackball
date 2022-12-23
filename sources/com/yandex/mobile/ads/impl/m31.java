package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class m31 extends RecyclerView.RecycledViewPool {

    /* renamed from: a */
    private final k31 f37178a;

    /* renamed from: b */
    private final Set<RecyclerView.ViewHolder> f37179b = new LinkedHashSet();

    public m31(k31 k31) {
        Intrinsics.checkNotNullParameter(k31, "releaseViewVisitor");
        this.f37178a = k31;
    }

    public void clear() {
        super.clear();
        for (RecyclerView.ViewHolder viewHolder : this.f37179b) {
            k31 k31 = this.f37178a;
            View view = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "viewHolder.itemView");
            i10.m37254a(k31, view);
        }
        this.f37179b.clear();
    }

    public RecyclerView.ViewHolder getRecycledView(int i) {
        RecyclerView.ViewHolder recycledView = super.getRecycledView(i);
        if (recycledView == null) {
            return null;
        }
        this.f37179b.remove(recycledView);
        return recycledView;
    }

    public void putRecycledView(RecyclerView.ViewHolder viewHolder) {
        super.putRecycledView(viewHolder);
        if (viewHolder != null) {
            this.f37179b.add(viewHolder);
        }
    }
}
