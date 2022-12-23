package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;

public class rg1 extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    private final g10 f39453a;

    /* renamed from: b */
    private final String f39454b;

    /* renamed from: c */
    private final C13440is f39455c;

    public rg1(String str, g10 g10, C13440is isVar) {
        this.f39453a = g10;
        this.f39454b = str;
        this.f39455c = isVar;
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        int f = this.f39455c.mo60780f();
        RecyclerView.ViewHolder findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(f);
        this.f39453a.mo67146a(this.f39454b, new z80(f, findViewHolderForLayoutPosition != null ? findViewHolderForLayoutPosition.itemView.getLeft() : 0));
    }
}
