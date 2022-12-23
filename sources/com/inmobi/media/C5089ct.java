package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

/* renamed from: com.inmobi.media.ct */
/* compiled from: VastProcessor */
public class C5089ct {

    /* renamed from: b */
    private static final String f11664b = C5089ct.class.getSimpleName();

    /* renamed from: a */
    public ExecutorService f11665a;

    /* renamed from: c */
    private HashMap<String, List<WeakReference<C5093cu>>> f11666c;

    /* renamed from: com.inmobi.media.ct$a */
    /* compiled from: VastProcessor */
    static final class C5092a {

        /* renamed from: a */
        static final C5089ct f11675a = new C5089ct((byte) 0);
    }

    /* synthetic */ C5089ct(byte b) {
        this();
    }

    /* renamed from: a */
    public static C5089ct m11560a() {
        return C5092a.f11675a;
    }

    private C5089ct() {
        this.f11665a = Executors.newCachedThreadPool(new C5326gv(f11664b));
        this.f11666c = new HashMap<>(2);
    }

    /* renamed from: a */
    private synchronized boolean m11563a(String str, C5093cu cuVar) {
        List list = this.f11666c.get(str);
        if (list != null) {
            list.add(new WeakReference(cuVar));
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WeakReference(cuVar));
        this.f11666c.put(str, arrayList);
        return true;
    }

    /* renamed from: a */
    private synchronized void m11561a(final C4948ah ahVar, final boolean z) {
        List<WeakReference> remove = this.f11666c.remove(ahVar.mo40036f());
        if (remove != null) {
            for (WeakReference weakReference : remove) {
                final C5093cu cuVar = (C5093cu) weakReference.get();
                if (cuVar != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            cuVar.mo39953a(ahVar, z);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m11562a(C5089ct ctVar, C4948ah ahVar, C5220ev evVar, C5093cu cuVar) {
        try {
            if (ctVar.m11563a(ahVar.mo40036f(), cuVar)) {
                C4948ah a = C4953al.m11178a(ahVar, evVar);
                if (a == null) {
                    ctVar.m11561a(ahVar, false);
                } else {
                    ctVar.m11561a(a, true);
                }
            }
        } catch (JSONException unused) {
            ctVar.m11561a(ahVar, false);
        }
    }
}
