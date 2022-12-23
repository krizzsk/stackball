package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.hw */
public abstract class C13354hw<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    /* renamed from: a */
    private final C13513jm f34581a;

    /* renamed from: b */
    private final List<C15177xl> f34582b;

    public C13354hw(List<? extends C15177xl> list, C13513jm jmVar) {
        Intrinsics.checkNotNullParameter(list, "divs");
        Intrinsics.checkNotNullParameter(jmVar, "div2View");
        this.f34581a = jmVar;
        this.f34582b = CollectionsKt.toMutableList(list);
    }

    /* renamed from: a */
    public final List<C15177xl> mo67642a() {
        return this.f34582b;
    }

    /* renamed from: a */
    public final boolean mo67643a(C12660bw bwVar) {
        Intrinsics.checkNotNullParameter(bwVar, "divPatchCache");
        if (bwVar.mo66130a(this.f34581a.mo68037g()) == null) {
            return false;
        }
        for (int i = 0; i < this.f34582b.size(); i++) {
            String c = this.f34582b.get(i).mo70911b().mo66144c();
            if (c != null) {
                bwVar.mo66131a(this.f34581a.mo68037g(), c);
            }
        }
        return false;
    }
}
