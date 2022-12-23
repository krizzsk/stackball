package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.ad0;
import com.yandex.mobile.ads.impl.mv0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class xc0 {

    /* renamed from: a */
    private final o60 f42491a = new o60();

    /* renamed from: b */
    private final i81 f42492b;

    /* renamed from: c */
    private final C15238y9 f42493c;

    /* renamed from: d */
    private final ga1 f42494d;

    /* renamed from: e */
    private final ad0 f42495e;

    /* renamed from: f */
    private final mv0.C14023c f42496f;

    /* renamed from: com.yandex.mobile.ads.impl.xc0$a */
    static class C15160a {

        /* renamed from: a */
        private final Handler f42497a = new Handler(Looper.getMainLooper());
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final ad0 f42498b;

        /* renamed from: c */
        private final AtomicInteger f42499c;

        /* renamed from: d */
        private final Set<hd0> f42500d;

        /* renamed from: e */
        private final pd0 f42501e;

        /* renamed from: f */
        private final mn0 f42502f;

        /* renamed from: com.yandex.mobile.ads.impl.xc0$a$a */
        class C15161a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ String f42503b;

            /* renamed from: c */
            final /* synthetic */ Map f42504c;

            /* renamed from: d */
            final /* synthetic */ hd0 f42505d;

            /* renamed from: e */
            final /* synthetic */ int f42506e;

            /* renamed from: f */
            final /* synthetic */ int f42507f;

            /* renamed from: com.yandex.mobile.ads.impl.xc0$a$a$a */
            class C15162a implements ad0.C12379e {
                C15162a() {
                }

                /* renamed from: a */
                public void mo64579a(op1 op1) {
                    C15161a aVar = C15161a.this;
                    C15160a.m44008a(C15160a.this, aVar.f42504c);
                }

                /* renamed from: a */
                public void mo65735a(ad0.C12378d dVar, boolean z) {
                    String d = C15161a.this.f42505d.mo67524d();
                    Bitmap b = dVar.mo65734b();
                    if (b != null) {
                        if (d != null) {
                            C15161a.this.f42504c.put(d, b);
                        }
                        C15161a aVar = C15161a.this;
                        C15160a.m44008a(C15160a.this, aVar.f42504c);
                    }
                }
            }

            C15161a(String str, Map map, hd0 hd0, int i, int i2) {
                this.f42503b = str;
                this.f42504c = map;
                this.f42505d = hd0;
                this.f42506e = i;
                this.f42507f = i2;
            }

            public void run() {
                C15160a.this.f42498b.mo65722a(this.f42503b, (ad0.C12379e) new C15162a(), this.f42506e, this.f42507f);
            }
        }

        C15160a(ad0 ad0, Set<hd0> set, pd0 pd0) {
            this.f42498b = ad0;
            this.f42500d = set;
            this.f42501e = pd0;
            this.f42499c = new AtomicInteger(set.size());
            this.f42502f = new mn0();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo70874a() {
            HashMap hashMap = new HashMap();
            for (hd0 next : this.f42500d) {
                String d = next.mo67524d();
                int a = next.mo67516a();
                int e = next.mo67525e();
                int a2 = next.mo67516a();
                int e2 = next.mo67525e();
                this.f42502f.getClass();
                Runtime runtime = Runtime.getRuntime();
                if (((float) Runtime.getRuntime().maxMemory()) - (((float) runtime.totalMemory()) - ((float) runtime.freeMemory())) >= ((float) ((a2 * e2) * 4)) + 1048576.0f) {
                    this.f42497a.post(new C15161a(d, hashMap, next, e, a));
                } else if (this.f42499c.decrementAndGet() == 0) {
                    this.f42501e.mo66874a(hashMap);
                }
            }
        }

        /* renamed from: a */
        static void m44008a(C15160a aVar, Map map) {
            if (aVar.f42499c.decrementAndGet() == 0) {
                aVar.f42501e.mo66874a(map);
            }
        }
    }

    public xc0(Context context) {
        this.f42492b = new i81(context);
        this.f42493c = new C15238y9();
        this.f42494d = new ga1();
        mv0 c = mv0.m39740c(context);
        this.f42495e = c.mo68859a();
        this.f42496f = c.mo68860b();
    }

    /* renamed from: a */
    public void mo70873a(Set<hd0> set, pd0 pd0) {
        if (set.size() == 0) {
            pd0.mo66874a(Collections.emptyMap());
        } else {
            new C15160a(this.f42495e, set, pd0).mo70874a();
        }
    }

    /* renamed from: a */
    public void mo70872a(Map<String, Bitmap> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Bitmap bitmap = (Bitmap) next.getValue();
            if (bitmap != null) {
                this.f42496f.mo68863a(str, bitmap);
            }
        }
    }

    /* renamed from: a */
    public Set<hd0> mo70871a(List<pq0> list) {
        hd0 a;
        HashSet hashSet = new HashSet();
        for (pq0 next : list) {
            hashSet.addAll(this.f42493c.mo71011a(next));
            this.f42491a.getClass();
            ArrayList arrayList = new ArrayList();
            C13690k9 b = next.mo69406b("feedback");
            if (!(b == null || !(b.mo68169d() instanceof r60) || (a = ((r60) b.mo68169d()).mo69697a()) == null)) {
                arrayList.add(a);
            }
            hashSet.addAll(arrayList);
            hashSet.addAll(this.f42492b.mo67751a(next));
            hashSet.addAll(this.f42494d.mo67221a(next));
        }
        return hashSet;
    }
}
