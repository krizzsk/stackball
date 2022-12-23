package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.core.p006os.HandlerCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

public class s10 {

    /* renamed from: a */
    private final mo1 f39800a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final o10 f39801b;

    /* renamed from: c */
    private final Handler f39802c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private final v10 f39803d = new v10();

    /* renamed from: e */
    private final WeakHashMap<View, C15177xl> f39804e = new WeakHashMap<>();

    /* renamed from: f */
    private boolean f39805f;

    /* renamed from: g */
    private final Runnable f39806g = new Runnable() {
        public final void run() {
            s10.m41779b(s10.this);
        }
    };

    @Inject
    public s10(mo1 mo1, o10 o10) {
        Intrinsics.checkNotNullParameter(mo1, "viewVisibilityCalculator");
        Intrinsics.checkNotNullParameter(o10, "visibilityActionDispatcher");
        this.f39800a = mo1;
        this.f39801b = o10;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m41779b(s10 s10) {
        Intrinsics.checkNotNullParameter(s10, "this$0");
        s10.f39801b.mo69096a(s10.f39804e);
        s10.f39805f = false;
    }

    /* renamed from: a */
    public static /* synthetic */ void m41777a(s10 s10, C13513jm jmVar, View view, C15177xl xlVar, List list, int i, Object obj) {
        s10.mo69850a(jmVar, view, xlVar, (i & 8) != 0 ? C14175ob.m40334a(xlVar.mo70911b()) : null);
    }

    /* renamed from: a */
    public void mo69850a(C13513jm jmVar, View view, C15177xl xlVar, List<? extends m10> list) {
        int i;
        boolean z;
        Intrinsics.checkNotNullParameter(jmVar, "scope");
        Intrinsics.checkNotNullParameter(xlVar, "div");
        Intrinsics.checkNotNullParameter(list, "visibilityActions");
        if (!list.isEmpty()) {
            if (view == null) {
                i = 0;
            } else {
                i = this.f39800a.mo68844a(view);
                if (i > 0) {
                    this.f39804e.put(view, xlVar);
                } else {
                    this.f39804e.remove(view);
                }
                if (!this.f39805f) {
                    this.f39805f = true;
                    this.f39802c.post(this.f39806g);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T next : list) {
                Long valueOf = Long.valueOf((long) ((m10) next).f37158g.mo66924a(jmVar.mo66388b()).intValue());
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(valueOf, obj);
                }
                ((List) obj).add(next);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                long longValue = ((Number) entry.getKey()).longValue();
                List list2 = (List) entry.getValue();
                ArrayList<m10> arrayList = new ArrayList<>(list2.size());
                for (Object next2 : list2) {
                    m10 m10 = (m10) next2;
                    boolean z2 = i >= m10.f37159h.mo66924a(jmVar.mo66388b()).intValue();
                    C14889vg a = this.f39803d.mo70437a(C15049wg.m43640a(jmVar, m10));
                    if (view == null || a != null || !z2) {
                        if ((view == null || a != null || z2) && (view == null || a == null || !z2)) {
                            if (view != null && a != null && !z2) {
                                m41778a(a);
                            } else if (view == null && a != null) {
                                m41778a(a);
                            }
                        }
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(next2);
                    }
                }
                if ((!arrayList.isEmpty()) && view != null) {
                    HashMap hashMap = new HashMap(arrayList.size(), 1.0f);
                    for (m10 m102 : arrayList) {
                        C14889vg a2 = C15049wg.m43640a(jmVar, m102);
                        ii0 ii0 = ii0.f34887a;
                        Pair pair = TuplesKt.m45515to(a2, m102);
                        hashMap.put(pair.getFirst(), pair.getSecond());
                    }
                    this.f39803d.mo70438a((Map<C14889vg, m10>) hashMap);
                    HandlerCompat.postDelayed(this.f39802c, new r10(this, jmVar, view, hashMap), hashMap, longValue);
                }
            }
        }
    }

    /* renamed from: a */
    private void m41778a(C14889vg vgVar) {
        ii0 ii0 = ii0.f34887a;
        Map<C14889vg, m10> b = this.f39803d.mo70439b(vgVar);
        if (b != null) {
            b.remove(vgVar);
            if (b.isEmpty()) {
                this.f39802c.removeCallbacksAndMessages(b);
                this.f39803d.mo70440b(b);
            }
        }
    }
}
