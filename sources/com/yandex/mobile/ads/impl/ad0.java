package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.c51;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ad0 {

    /* renamed from: a */
    private final u41 f30506a;

    /* renamed from: b */
    private final C12377c f30507b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final HashMap<String, C12376b> f30508c = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final HashMap<String, C12376b> f30509d = new HashMap<>();

    /* renamed from: e */
    private final Handler f30510e = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Runnable f30511f;

    /* renamed from: com.yandex.mobile.ads.impl.ad0$a */
    class C12375a implements Runnable {
        C12375a() {
        }

        public void run() {
            for (C12376b bVar : ad0.this.f30509d.values()) {
                for (C12378d dVar : bVar.f30516d) {
                    if (dVar.f30518b != null) {
                        if (bVar.mo65727a() == null) {
                            Bitmap unused = dVar.f30517a = bVar.f30514b;
                            dVar.f30518b.mo65735a(dVar, false);
                        } else {
                            dVar.f30518b.mo64579a(bVar.mo65727a());
                        }
                    }
                }
            }
            ad0.this.f30509d.clear();
            Runnable unused2 = ad0.this.f30511f = null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ad0$b */
    private static class C12376b {

        /* renamed from: a */
        private final l41<?> f30513a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Bitmap f30514b;

        /* renamed from: c */
        private op1 f30515c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final List<C12378d> f30516d;

        public C12376b(l41<?> l41, C12378d dVar) {
            ArrayList arrayList = new ArrayList();
            this.f30516d = arrayList;
            this.f30513a = l41;
            arrayList.add(dVar);
        }

        /* renamed from: b */
        public boolean mo65730b(C12378d dVar) {
            this.f30516d.remove(dVar);
            if (this.f30516d.size() != 0) {
                return false;
            }
            this.f30513a.mo66995a();
            return true;
        }

        /* renamed from: a */
        public void mo65729a(op1 op1) {
            this.f30515c = op1;
        }

        /* renamed from: a */
        public op1 mo65727a() {
            return this.f30515c;
        }

        /* renamed from: a */
        public void mo65728a(C12378d dVar) {
            this.f30516d.add(dVar);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ad0$c */
    public interface C12377c {
        /* renamed from: a */
        Bitmap mo65731a(String str);

        /* renamed from: a */
        void mo65732a(String str, Bitmap bitmap);
    }

    /* renamed from: com.yandex.mobile.ads.impl.ad0$d */
    public class C12378d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Bitmap f30517a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C12379e f30518b;

        /* renamed from: c */
        private final String f30519c;

        public C12378d(Bitmap bitmap, String str, String str2, C12379e eVar) {
            this.f30517a = bitmap;
            this.f30519c = str2;
            this.f30518b = eVar;
        }

        /* renamed from: a */
        public void mo65733a() {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("Must be invoked from the main thread.");
            } else if (this.f30518b != null) {
                C12376b bVar = (C12376b) ad0.this.f30508c.get(this.f30519c);
                if (bVar == null) {
                    C12376b bVar2 = (C12376b) ad0.this.f30509d.get(this.f30519c);
                    if (bVar2 != null) {
                        bVar2.mo65730b(this);
                        if (bVar2.f30516d.size() == 0) {
                            ad0.this.f30509d.remove(this.f30519c);
                        }
                    }
                } else if (bVar.mo65730b(this)) {
                    ad0.this.f30508c.remove(this.f30519c);
                }
            }
        }

        /* renamed from: b */
        public Bitmap mo65734b() {
            return this.f30517a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ad0$e */
    public interface C12379e extends c51.C12699a {
        /* renamed from: a */
        void mo65735a(C12378d dVar, boolean z);
    }

    public ad0(u41 u41, C12377c cVar) {
        this.f30506a = u41;
        this.f30507b = cVar;
    }

    /* renamed from: a */
    public String mo65723a(String str, int i, int i2, ImageView.ScaleType scaleType) {
        throw null;
    }

    /* renamed from: a */
    public C12378d mo65722a(String str, C12379e eVar, int i, int i2) {
        C12378d dVar;
        C12379e eVar2 = eVar;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            String a = mo65723a(str, i, i2, scaleType);
            Bitmap a2 = this.f30507b.mo65731a(a);
            if (a2 != null) {
                C12378d dVar2 = new C12378d(a2, str, (String) null, (C12379e) null);
                eVar2.mo65735a(dVar2, true);
                return dVar2;
            }
            C12378d dVar3 = new C12378d((Bitmap) null, str, a, eVar);
            eVar2.mo65735a(dVar3, true);
            C12376b bVar = this.f30508c.get(a);
            if (bVar == null) {
                bVar = this.f30509d.get(a);
            }
            if (bVar != null) {
                bVar.mo65728a(dVar3);
                dVar = dVar3;
            } else {
                dVar = dVar3;
                fd0 fd0 = new fd0(str, new yc0(this, a), i, i2, scaleType, Bitmap.Config.RGB_565, new zc0(this, a));
                this.f30506a.mo70284a(fd0);
                this.f30508c.put(a, new C12376b(fd0, dVar));
            }
            return dVar;
        }
        throw new IllegalStateException("Must be invoked from the main thread.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65724a(String str, Bitmap bitmap) {
        this.f30507b.mo65732a(str, bitmap);
        C12376b remove = this.f30508c.remove(str);
        if (remove != null) {
            Bitmap unused = remove.f30514b = bitmap;
            m33676a(str, remove);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65725a(String str, op1 op1) {
        C12376b remove = this.f30508c.remove(str);
        if (remove != null) {
            remove.mo65729a(op1);
            m33676a(str, remove);
        }
    }

    /* renamed from: a */
    private void m33676a(String str, C12376b bVar) {
        this.f30509d.put(str, bVar);
        if (this.f30511f == null) {
            C12375a aVar = new C12375a();
            this.f30511f = aVar;
            this.f30510e.postDelayed(aVar, (long) 100);
        }
    }
}
