package com.tapjoy.internal;

import android.os.SystemClock;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.gf */
public abstract class C9314gf {
    @Nullable

    /* renamed from: a */
    static Set f23037a = null;

    /* renamed from: b */
    private static final ThreadLocal f23038b = new ThreadLocal() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return new HashMap();
        }
    };

    /* renamed from: c */
    private static C9314gf f23039c;

    /* renamed from: d */
    private static volatile boolean f23040d = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo58192a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo58193a(long j);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo58194a(long j, String str, @Nullable String str2, @Nullable Map map);

    /* renamed from: a */
    public static void m24957a(C9318gh ghVar) {
        if (f23039c == null) {
            f23039c = ghVar;
            if (f23040d) {
                ghVar.mo58193a(C9503v.m25545b());
            }
        }
    }

    /* renamed from: a */
    public static void m24962a(boolean z) {
        if (f23040d != z) {
            f23040d = z;
            C9314gf gfVar = f23039c;
            if (gfVar == null) {
                return;
            }
            if (z) {
                gfVar.mo58193a(C9503v.m25545b());
            } else {
                gfVar.mo58192a();
            }
        }
    }

    /* renamed from: a */
    public static void m24961a(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            f23037a = null;
        } else {
            f23037a = new HashSet(collection);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m24964b(String str, @Nullable String str2, @Nullable Map map) {
        C9314gf gfVar;
        Set set = f23037a;
        if ((set == null || !set.contains(str)) && f23040d && (gfVar = f23039c) != null) {
            gfVar.mo58194a(C9503v.m25545b(), str, str2, map);
        }
    }

    /* renamed from: a */
    public static void m24960a(String str, @Nullable TreeMap treeMap, @Nullable Map map) {
        m24964b(str, treeMap != null ? C9092bh.m24336a((Object) treeMap) : null, map);
    }

    /* renamed from: a */
    public static C9316a m24956a(String str) {
        C9316a a = new C9316a(str).mo58196a();
        ((Map) f23038b.get()).put(str, a);
        return a;
    }

    /* renamed from: b */
    public static C9316a m24963b(String str) {
        C9316a aVar = (C9316a) ((Map) f23038b.get()).remove(str);
        return aVar != null ? aVar.mo58201b() : new C9316a(str);
    }

    /* renamed from: c */
    public static C9316a m24965c(String str) {
        return (C9316a) ((Map) f23038b.get()).get(str);
    }

    /* renamed from: d */
    public static C9316a m24966d(String str) {
        return (C9316a) ((Map) f23038b.get()).remove(str);
    }

    /* renamed from: a */
    public static void m24958a(String str, C9316a aVar) {
        if (aVar == null) {
            return;
        }
        if (str.equals(aVar.f23041a)) {
            ((Map) f23038b.get()).put(str, aVar);
        } else {
            String str2 = aVar.f23041a;
        }
    }

    /* renamed from: e */
    public static C9316a m24967e(String str) {
        return new C9316a(str);
    }

    /* renamed from: com.tapjoy.internal.gf$a */
    public static final class C9316a {

        /* renamed from: a */
        final String f23041a;

        /* renamed from: b */
        private final TreeMap f23042b = new TreeMap();

        /* renamed from: c */
        private final Map f23043c = new HashMap();

        /* renamed from: d */
        private volatile long f23044d;

        C9316a(String str) {
            this.f23041a = str;
        }

        /* renamed from: a */
        public final C9316a mo58196a() {
            try {
                this.f23044d = SystemClock.elapsedRealtime();
            } catch (NullPointerException unused) {
                this.f23044d = -1;
            }
            return this;
        }

        /* renamed from: b */
        public final C9316a mo58201b() {
            long j = this.f23044d;
            if (j != -1) {
                try {
                    mo58198a("spent_time", SystemClock.elapsedRealtime() - j);
                } catch (NullPointerException unused) {
                }
            }
            return this;
        }

        /* renamed from: a */
        public final C9316a mo58199a(String str, Object obj) {
            this.f23042b.put(str, obj);
            return this;
        }

        /* renamed from: a */
        public final C9316a mo58200a(Map map) {
            if (map != null) {
                this.f23042b.putAll(map);
            }
            return this;
        }

        /* renamed from: a */
        public final C9316a mo58197a(String str) {
            this.f23042b.put("failure", str);
            return this;
        }

        /* renamed from: b */
        public final C9316a mo58202b(String str) {
            this.f23042b.put("misuse", str);
            return this;
        }

        /* renamed from: a */
        public final C9316a mo58198a(String str, long j) {
            this.f23043c.put(str, Long.valueOf(j));
            return this;
        }

        /* renamed from: b */
        public final C9316a mo58203b(Map map) {
            if (map != null) {
                this.f23043c.putAll(map);
            }
            return this;
        }

        /* renamed from: c */
        public final void mo58204c() {
            String str = this.f23041a;
            Map map = null;
            String a = this.f23042b.size() > 0 ? C9092bh.m24336a((Object) this.f23042b) : null;
            if (this.f23043c.size() > 0) {
                map = this.f23043c;
            }
            C9314gf.m24964b(str, a, map);
        }
    }
}
