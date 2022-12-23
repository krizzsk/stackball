package com.fyber.inneractive.sdk.player.p057a;

import android.content.Context;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.p049h.C2972o;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.player.p057a.C3106c;
import com.fyber.inneractive.sdk.player.p057a.C3123g;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.C3669p;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.fyber.inneractive.sdk.player.a.n */
public final class C3143n implements C3106c.C3112c {

    /* renamed from: g */
    private static final C3143n f7765g = new C3143n();

    /* renamed from: a */
    public Context f7766a;

    /* renamed from: b */
    public Thread f7767b;

    /* renamed from: c */
    public Runnable f7768c = new Runnable() {
        public final void run() {
            File a = C3143n.m7414a(C3143n.this.f7766a, "fyb.vamp.vid.cache");
            if (a != null) {
                try {
                    IAlog.m9034b("VideoCache opening the cache in directory - %s", a);
                    C3106c unused = C3143n.this.f7769d = C3106c.m7333a(a);
                    C3143n.this.f7769d.mo18686d();
                    C3106c unused2 = C3143n.this.f7769d = C3106c.m7333a(a);
                    IAlog.m9034b("VideoCache opened the cache in directory - %s current size is %d", a, Long.valueOf(C3143n.this.f7769d.mo18679a()));
                    C3143n.this.f7769d.f7640c = C3143n.this;
                    boolean unused3 = C3143n.this.f7770e = true;
                    Thread unused4 = C3143n.this.f7767b = null;
                } catch (Throwable th) {
                    C2972o.m6654a("Failed to open cache directory", th.getMessage(), (InneractiveAdRequest) null, (C3018e) null);
                    IAlog.m9032a("Failed to open cache directory", th, new Object[0]);
                }
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C3106c f7769d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f7770e = false;

    /* renamed from: f */
    private List<String> f7771f = new CopyOnWriteArrayList();

    /* renamed from: a */
    public static C3143n m7413a() {
        return f7765g;
    }

    private C3143n() {
    }

    /* renamed from: a */
    private static boolean m7417a(File file) {
        return file != null && file.getFreeSpace() > 52428800;
    }

    /* renamed from: a */
    public static File m7414a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        if (C3657l.m9125p() != null && C3657l.m9123d("android.permission.WRITE_EXTERNAL_STORAGE") && "mounted".equals(C3657l.m9134y())) {
            String y = C3657l.m9134y();
            if (("mounted".equals(y) || "mounted_ro".equals(y)) && m7417a(context.getExternalCacheDir())) {
                return new File(context.getExternalCacheDir(), str);
            }
        }
        if (m7417a(context.getCacheDir())) {
            return new File(context.getCacheDir(), str);
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo18736b() {
        boolean z;
        if (!this.f7770e || !C3119f.m7377a().f7696e) {
            return false;
        }
        if (!C3669p.m9149a()) {
            if (Build.VERSION.SDK_INT >= 23) {
                NetworkSecurityPolicy instance = NetworkSecurityPolicy.getInstance();
                z = Build.VERSION.SDK_INT >= 24 ? instance.isCleartextTrafficPermitted("127.0.0.1") : instance.isCleartextTrafficPermitted();
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C3123g mo18734a(int i, String str, C2767s sVar, C3123g.C3134e eVar) {
        C3123g a = C3123g.m7383a(this.f7769d, str, i, sVar, eVar);
        this.f7771f.add(a.mo18720d());
        return a;
    }

    /* renamed from: a */
    public static String m7416a(C3103a aVar) {
        C3119f a = C3119f.m7377a();
        if (!a.f7696e || !aVar.mo18675b()) {
            return null;
        }
        a.f7697f.add(aVar);
        String name = aVar.mo18672a().getName();
        if (name.contains(".")) {
            name = name.split("[.]{1}")[0];
        }
        return String.format(Locale.ENGLISH, "http://%s:%d/%s?_t=%d", new Object[]{"127.0.0.1", Integer.valueOf(a.f7694c), name, Long.valueOf(System.currentTimeMillis())});
    }

    /* renamed from: b */
    public final void mo18735b(String str) {
        C3103a aVar;
        C3119f a = C3119f.m7377a();
        Iterator<C3103a> it = a.f7697f.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
            if (aVar.f7630g.equalsIgnoreCase(str)) {
                break;
            }
        }
        if (aVar != null) {
            a.f7697f.remove(aVar);
        }
        this.f7771f.remove(str);
    }

    /* renamed from: a */
    public final boolean mo18700a(String str) {
        for (String equalsIgnoreCase : this.f7771f) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return false;
            }
        }
        for (C3103a a : C3119f.m7377a().f7697f) {
            if (a.mo18672a().getName().contains(str)) {
                IAlog.m9033a(String.format("MediaCacheStreamer found %s which is in use, rejecting eviction", new Object[]{str}), new Object[0]);
                return false;
            }
        }
        return true;
    }
}
