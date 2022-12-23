package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class aq0 extends RecyclerView.Adapter<wp0> {

    /* renamed from: a */
    private final List<hd0> f30657a;

    /* renamed from: b */
    private final xp0 f30658b;

    public aq0(ed0 ed0, List<? extends hd0> list) {
        Intrinsics.checkNotNullParameter(ed0, "imageProvider");
        Intrinsics.checkNotNullParameter(list, "imageValues");
        this.f30657a = list;
        this.f30658b = new xp0(ed0);
    }

    public int getItemCount() {
        return this.f30657a.size();
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        wp0 wp0 = (wp0) viewHolder;
        Intrinsics.checkNotNullParameter(wp0, "holderImage");
        wp0.mo70735a(this.f30657a.get(i));
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return this.f30658b.mo70932a(viewGroup);
    }
}
