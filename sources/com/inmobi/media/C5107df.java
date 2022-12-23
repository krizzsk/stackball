package com.inmobi.media;

import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import com.inmobi.media.C5120dk;
import com.inmobi.media.C5220ev;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.inmobi.media.df */
/* compiled from: ImpressionTracker */
class C5107df {

    /* renamed from: d */
    private static final String f11703d = C5107df.class.getSimpleName();

    /* renamed from: a */
    final C5120dk f11704a;
    /* access modifiers changed from: package-private */

    /* renamed from: b */
    public final Map<View, C5110b> f11705b;

    /* renamed from: c */
    final Handler f11706c;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Map<View, C5110b> f11707e;

    /* renamed from: f */
    private final C5111c f11708f;

    /* renamed from: g */
    private final long f11709g;

    /* renamed from: h */
    private C5120dk.C5123c f11710h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C5109a f11711i;

    /* renamed from: com.inmobi.media.df$a */
    /* compiled from: ImpressionTracker */
    interface C5109a {
        /* renamed from: a */
        void mo40389a(View view, Object obj);
    }

    /* renamed from: com.inmobi.media.df$b */
    /* compiled from: ImpressionTracker */
    static class C5110b {

        /* renamed from: a */
        Object f11713a;

        /* renamed from: b */
        int f11714b;

        /* renamed from: c */
        int f11715c;

        /* renamed from: d */
        long f11716d = Long.MAX_VALUE;

        C5110b(Object obj, int i, int i2) {
            this.f11713a = obj;
            this.f11714b = i;
            this.f11715c = i2;
        }
    }

    C5107df(C5220ev.C5234k kVar, C5120dk dkVar, C5109a aVar) {
        this(new WeakHashMap(), new WeakHashMap(), dkVar, new Handler(), kVar, aVar);
    }

    private C5107df(Map<View, C5110b> map, Map<View, C5110b> map2, C5120dk dkVar, Handler handler, C5220ev.C5234k kVar, C5109a aVar) {
        this.f11707e = map;
        this.f11705b = map2;
        this.f11704a = dkVar;
        this.f11709g = (long) kVar.impressionPollIntervalMillis;
        C51081 r1 = new C5120dk.C5123c() {
            /* renamed from: a */
            public final void mo40388a(List<View> list, List<View> list2) {
                for (View next : list) {
                    C5110b bVar = (C5110b) C5107df.this.f11707e.get(next);
                    if (bVar == null) {
                        C5107df.this.m11625a(next);
                    } else {
                        C5110b bVar2 = (C5110b) C5107df.this.f11705b.get(next);
                        if (bVar2 == null || !bVar.f11713a.equals(bVar2.f11713a)) {
                            bVar.f11716d = SystemClock.uptimeMillis();
                            C5107df.this.f11705b.put(next, bVar);
                        }
                    }
                }
                for (View remove : list2) {
                    C5107df.this.f11705b.remove(remove);
                }
                C5107df.this.m11631d();
            }
        };
        this.f11710h = r1;
        this.f11704a.f11742c = r1;
        this.f11706c = handler;
        this.f11708f = new C5111c(this);
        this.f11711i = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40384a(View view, Object obj, int i, int i2) {
        C5110b bVar = this.f11707e.get(view);
        if (bVar == null || !bVar.f11713a.equals(obj)) {
            m11625a(view);
            C5110b bVar2 = new C5110b(obj, i, i2);
            this.f11707e.put(view, bVar2);
            this.f11704a.mo40400a(view, obj, bVar2.f11714b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11625a(View view) {
        this.f11707e.remove(view);
        this.f11705b.remove(view);
        this.f11704a.mo40398a(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40385a(Object obj) {
        View view;
        Iterator<Map.Entry<View, C5110b>> it = this.f11707e.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                view = null;
                break;
            }
            Map.Entry next = it.next();
            if (((C5110b) next.getValue()).f11713a.equals(obj)) {
                view = (View) next.getKey();
                break;
            }
        }
        if (view != null) {
            m11625a(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40383a() {
        for (Map.Entry next : this.f11707e.entrySet()) {
            this.f11704a.mo40400a((View) next.getKey(), ((C5110b) next.getValue()).f11713a, ((C5110b) next.getValue()).f11714b);
        }
        m11631d();
        this.f11704a.mo40380d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo40386b() {
        return !this.f11707e.isEmpty();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m11631d() {
        if (!this.f11706c.hasMessages(0)) {
            this.f11706c.postDelayed(this.f11708f, this.f11709g);
        }
    }

    /* renamed from: com.inmobi.media.df$c */
    /* compiled from: ImpressionTracker */
    static class C5111c implements Runnable {

        /* renamed from: a */
        private final ArrayList<View> f11717a = new ArrayList<>();

        /* renamed from: b */
        private WeakReference<C5107df> f11718b;

        C5111c(C5107df dfVar) {
            this.f11718b = new WeakReference<>(dfVar);
        }

        public final void run() {
            C5107df dfVar = (C5107df) this.f11718b.get();
            if (dfVar != null) {
                for (Map.Entry entry : dfVar.f11705b.entrySet()) {
                    View view = (View) entry.getKey();
                    C5110b bVar = (C5110b) entry.getValue();
                    if (C5107df.m11627a(bVar.f11716d, bVar.f11715c) && this.f11718b.get() != null) {
                        dfVar.f11711i.mo40389a(view, bVar.f11713a);
                        this.f11717a.add(view);
                    }
                }
                Iterator<View> it = this.f11717a.iterator();
                while (it.hasNext()) {
                    dfVar.m11625a(it.next());
                }
                this.f11717a.clear();
                if (!dfVar.f11705b.isEmpty()) {
                    dfVar.m11631d();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo40387c() {
        this.f11707e.clear();
        this.f11705b.clear();
        this.f11704a.mo40402f();
        this.f11706c.removeMessages(0);
        this.f11704a.mo40381e();
        this.f11710h = null;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m11627a(long j, int i) {
        return SystemClock.uptimeMillis() - j >= ((long) i);
    }
}
