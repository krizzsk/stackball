package com.mbridge.msdk.video.dynview.endcard.p224a;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.video.dynview.endcard.a.a */
/* compiled from: ExposeMonitor */
public final class C6940a {

    /* renamed from: a */
    private C6942b f17097a;

    /* renamed from: b */
    private boolean f17098b = true;

    /* renamed from: c */
    private RecyclerView f17099c;

    /* renamed from: d */
    private boolean f17100d = false;

    /* renamed from: e */
    private List<Integer> f17101e = new ArrayList();

    /* renamed from: a */
    public final void mo48449a(RecyclerView recyclerView, C6942b bVar) {
        this.f17097a = bVar;
        this.f17099c = recyclerView;
        if (recyclerView != null && recyclerView.getVisibility() == 0) {
            this.f17099c.addOnScrollListener(new RecyclerView.OnScrollListener() {
            });
        }
    }

    /* renamed from: a */
    public final void mo48448a() {
        RecyclerView recyclerView = this.f17099c;
        if (recyclerView != null) {
            recyclerView.removeAllViews();
            this.f17099c = null;
        }
        List<Integer> list = this.f17101e;
        if (list != null) {
            list.clear();
        }
        if (this.f17097a != null) {
            this.f17097a = null;
        }
    }
}
