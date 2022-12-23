package com.flurry.sdk;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.flurry.sdk.de */
public final class C2533de {

    /* renamed from: a */
    private static final String f5943a = C2533de.class.getSimpleName();

    /* renamed from: b */
    private static final Map<Class<? extends C2534df>, C2531dc> f5944b = new LinkedHashMap();

    /* renamed from: d */
    private static List<C2534df> f5945d = new ArrayList();

    /* renamed from: e */
    private static List<String> f5946e;

    /* renamed from: c */
    private final Map<Class<? extends C2534df>, C2534df> f5947c = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList();
        f5946e = arrayList;
        arrayList.add("com.flurry.android.marketing.core.FlurryMarketingCoreModule");
        f5946e.add("com.flurry.android.marketing.FlurryMarketingModule");
        f5946e.add("com.flurry.android.config.killswitch.FlurryKillSwitchModule");
        f5946e.add("com.flurry.android.nativecrash.FlurryNativeCrashModule");
        f5946e.add("com.flurry.android.FlurryAdModule");
        f5946e.add("com.flurry.android.ymadlite.YahooAdModule");
    }

    /* renamed from: a */
    public static void m5493a(Class<? extends C2534df> cls) {
        if (cls != null) {
            synchronized (f5944b) {
                f5944b.put(cls, new C2531dc(cls));
            }
        }
    }

    /* renamed from: a */
    public static void m5492a(C2534df dfVar) {
        if (dfVar != null) {
            boolean z = false;
            Iterator<C2534df> it = f5945d.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().getClass().getSimpleName().equals(dfVar.getClass().getSimpleName())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                f5945d.add(dfVar);
                return;
            }
            String str = f5943a;
            C2530db.m5474a(3, str, dfVar + " has been register already as addOn module");
            return;
        }
        C2530db.m5490e(f5943a, "Module is null, cannot register it");
    }

    /* renamed from: a */
    public static void m5491a() {
        synchronized (f5944b) {
            f5944b.clear();
        }
    }

    /* renamed from: a */
    public final synchronized void mo17747a(Context context) {
        ArrayList<C2531dc> arrayList;
        if (context == null) {
            C2530db.m5474a(5, f5943a, "Null context.");
            return;
        }
        synchronized (f5944b) {
            arrayList = new ArrayList<>(f5944b.values());
        }
        for (C2531dc dcVar : arrayList) {
            try {
                if (dcVar.f5941a != null && Build.VERSION.SDK_INT >= dcVar.f5942b) {
                    C2534df dfVar = (C2534df) dcVar.f5941a.newInstance();
                    dfVar.init(context);
                    this.f5947c.put(dcVar.f5941a, dfVar);
                }
            } catch (Exception e) {
                String str = f5943a;
                C2530db.m5475a(5, str, "Flurry Module for class " + dcVar.f5941a + " is not available:", e);
            }
        }
        for (C2534df next : f5945d) {
            try {
                next.init(context);
                this.f5947c.put(next.getClass(), next);
            } catch (C2532dd e2) {
                C2530db.m5482b(f5943a, e2.getMessage());
            }
        }
        C2599ed.m5642a().mo17803a(context);
        C2499co.m5389a();
    }

    /* renamed from: b */
    public final synchronized void mo17749b() {
        C2499co.m5392b();
        C2599ed.m5647b();
        List<C2534df> c = m5495c();
        for (int size = c.size() - 1; size >= 0; size--) {
            try {
                this.f5947c.remove(c.get(size).getClass()).destroy();
            } catch (Exception e) {
                C2530db.m5475a(5, f5943a, "Error destroying module:", e);
            }
        }
    }

    /* renamed from: c */
    private List<C2534df> m5495c() {
        ArrayList arrayList;
        synchronized (this.f5947c) {
            arrayList = new ArrayList(this.f5947c.values());
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C2534df mo17748b(Class<? extends C2534df> cls) {
        C2534df dfVar;
        if (cls == null) {
            return null;
        }
        synchronized (this.f5947c) {
            dfVar = this.f5947c.get(cls);
        }
        if (dfVar != null) {
            return dfVar;
        }
        throw new IllegalStateException("Module was not registered/initialized. ".concat(String.valueOf(cls)));
    }

    /* renamed from: a */
    public static boolean m5494a(String str) {
        return f5946e.contains(str);
    }
}
