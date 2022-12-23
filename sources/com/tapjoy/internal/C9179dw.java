package com.tapjoy.internal;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.tapjoy.internal.dw */
public final class C9179dw {

    /* renamed from: a */
    final HashMap f22555a = new HashMap();

    /* renamed from: b */
    final HashMap f22556b = new HashMap();

    /* renamed from: c */
    final HashMap f22557c = new HashMap();

    /* renamed from: d */
    final HashSet f22558d = new HashSet();

    /* renamed from: e */
    final HashSet f22559e = new HashSet();

    /* renamed from: f */
    final HashSet f22560f = new HashSet();

    /* renamed from: g */
    final HashMap f22561g = new HashMap();

    /* renamed from: h */
    boolean f22562h;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo57972a(C9145cz czVar) {
        for (C9168dq dqVar : czVar.f22479b) {
            View view = (View) dqVar.get();
            if (view != null) {
                ArrayList arrayList = (ArrayList) this.f22557c.get(view);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f22557c.put(view, arrayList);
                }
                arrayList.add(czVar.f22483f);
            }
        }
    }
}
