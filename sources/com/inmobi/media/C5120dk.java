package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.inmobi.media.dk */
/* compiled from: VisibilityTracker */
public abstract class C5120dk {

    /* renamed from: a */
    private static final String f11740a = C5120dk.class.getSimpleName();

    /* renamed from: b */
    boolean f11741b;

    /* renamed from: c */
    public C5123c f11742c;

    /* renamed from: d */
    private final ArrayList<View> f11743d;

    /* renamed from: e */
    private long f11744e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Map<View, C5124d> f11745f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C5121a f11746g;

    /* renamed from: h */
    private final C5122b f11747h;

    /* renamed from: i */
    private final Handler f11748i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f11749j;

    /* renamed from: com.inmobi.media.dk$a */
    /* compiled from: VisibilityTracker */
    public interface C5121a {
        /* renamed from: a */
        boolean mo40396a(View view, View view2, int i, Object obj);
    }

    /* renamed from: com.inmobi.media.dk$c */
    /* compiled from: VisibilityTracker */
    public interface C5123c {
        /* renamed from: a */
        void mo40388a(List<View> list, List<View> list2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo40377a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo40378b();

    /* renamed from: com.inmobi.media.dk$d */
    /* compiled from: VisibilityTracker */
    static class C5124d {

        /* renamed from: a */
        int f11753a;

        /* renamed from: b */
        long f11754b;

        /* renamed from: c */
        View f11755c;

        /* renamed from: d */
        Object f11756d;

        C5124d() {
        }
    }

    C5120dk(C5121a aVar) {
        this(new WeakHashMap(10), aVar, new Handler(Looper.getMainLooper()));
    }

    private C5120dk(Map<View, C5124d> map, C5121a aVar, Handler handler) {
        this.f11744e = 0;
        this.f11741b = true;
        this.f11745f = map;
        this.f11746g = aVar;
        this.f11748i = handler;
        this.f11747h = new C5122b(this);
        this.f11743d = new ArrayList<>(50);
    }

    /* renamed from: c */
    public void mo40379c() {
        this.f11747h.run();
        this.f11748i.removeCallbacksAndMessages((Object) null);
        this.f11749j = false;
        this.f11741b = true;
    }

    /* renamed from: d */
    public void mo40380d() {
        this.f11741b = false;
        mo40404h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40400a(View view, Object obj, int i) {
        mo40399a(view, view, obj, i);
    }

    /* renamed from: a */
    public final void mo40399a(View view, View view2, Object obj, int i) {
        C5124d dVar = this.f11745f.get(view2);
        if (dVar == null) {
            dVar = new C5124d();
            this.f11745f.put(view2, dVar);
            this.f11744e++;
        }
        dVar.f11753a = i;
        dVar.f11754b = this.f11744e;
        dVar.f11755c = view;
        dVar.f11756d = obj;
        long j = this.f11744e;
        if (j % 50 == 0) {
            m11671a(j - 50);
        }
        if (1 == this.f11745f.size()) {
            mo40380d();
        }
    }

    /* renamed from: a */
    private void m11671a(long j) {
        for (Map.Entry next : this.f11745f.entrySet()) {
            if (((C5124d) next.getValue()).f11754b < j) {
                this.f11743d.add(next.getKey());
            }
        }
        Iterator<View> it = this.f11743d.iterator();
        while (it.hasNext()) {
            mo40398a(it.next());
        }
        this.f11743d.clear();
    }

    /* renamed from: a */
    public final void mo40398a(View view) {
        if (this.f11745f.remove(view) != null) {
            this.f11744e--;
            if (this.f11745f.size() == 0) {
                mo40379c();
            }
        }
    }

    /* renamed from: f */
    public final void mo40402f() {
        this.f11745f.clear();
        this.f11748i.removeMessages(0);
        this.f11749j = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.view.View} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40401a(java.lang.Object r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            r0 = 0
            java.util.Map<android.view.View, com.inmobi.media.dk$d> r1 = r4.f11745f
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x000e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x002f
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            com.inmobi.media.dk$d r3 = (com.inmobi.media.C5120dk.C5124d) r3
            java.lang.Object r3 = r3.f11756d
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x000e
            java.lang.Object r5 = r2.getKey()
            r0 = r5
            android.view.View r0 = (android.view.View) r0
        L_0x002f:
            if (r0 == 0) goto L_0x0034
            r4.mo40398a((android.view.View) r0)
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5120dk.mo40401a(java.lang.Object):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo40403g() {
        return !this.f11745f.isEmpty();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo40381e() {
        mo40402f();
        this.f11742c = null;
        this.f11741b = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo40404h() {
        if (!this.f11749j && !this.f11741b) {
            this.f11749j = true;
            this.f11748i.postDelayed(this.f11747h, (long) mo40377a());
        }
    }

    /* renamed from: com.inmobi.media.dk$b */
    /* compiled from: VisibilityTracker */
    static class C5122b implements Runnable {

        /* renamed from: a */
        private final ArrayList<View> f11750a = new ArrayList<>();

        /* renamed from: b */
        private final ArrayList<View> f11751b = new ArrayList<>();

        /* renamed from: c */
        private WeakReference<C5120dk> f11752c;

        C5122b(C5120dk dkVar) {
            this.f11752c = new WeakReference<>(dkVar);
        }

        public final void run() {
            C5123c d;
            C5120dk dkVar = (C5120dk) this.f11752c.get();
            if (dkVar != null) {
                boolean unused = dkVar.f11749j = false;
                for (Map.Entry entry : dkVar.f11745f.entrySet()) {
                    View view = (View) entry.getKey();
                    int i = ((C5124d) entry.getValue()).f11753a;
                    if (dkVar.f11746g.mo40396a(((C5124d) entry.getValue()).f11755c, view, i, ((C5124d) entry.getValue()).f11756d)) {
                        this.f11750a.add(view);
                    } else {
                        this.f11751b.add(view);
                    }
                }
            }
            if (!(dkVar == null || (d = dkVar.f11742c) == null)) {
                d.mo40388a(this.f11750a, this.f11751b);
            }
            this.f11750a.clear();
            this.f11751b.clear();
            if (dkVar != null) {
                dkVar.mo40378b();
            }
        }
    }
}
