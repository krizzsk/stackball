package com.p243my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.p243my.tracker.ads.AdEvent;
import com.p243my.tracker.miniapps.MiniAppEvent;
import com.p243my.tracker.obfuscated.C7820j0;
import com.p243my.tracker.obfuscated.C7828m;
import com.p243my.tracker.obfuscated.C7872t;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.m */
public final class C7828m {

    /* renamed from: a */
    final Map<Integer, Long> f19941a = new HashMap();

    /* renamed from: b */
    final C7880v0 f19942b;

    /* renamed from: c */
    final Context f19943c;

    /* renamed from: d */
    final C7829a f19944d;

    /* renamed from: e */
    C7807d0 f19945e;

    /* renamed from: f */
    long f19946f = 0;

    /* renamed from: com.my.tracker.obfuscated.m$a */
    public interface C7829a {
        /* renamed from: a */
        void mo52188a();

        /* renamed from: a */
        void mo52189a(String str);
    }

    /* renamed from: com.my.tracker.obfuscated.m$b */
    public interface C7830b {
        /* renamed from: a */
        void mo52113a(List<C7866q0> list);
    }

    private C7828m(C7880v0 v0Var, C7829a aVar, Context context) {
        this.f19942b = v0Var;
        this.f19944d = aVar;
        this.f19943c = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C7828m m21279a(C7880v0 v0Var, C7829a aVar, Context context) {
        return new C7828m(v0Var, aVar, context);
    }

    /* renamed from: a */
    private static Map<String, String> m21280a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return new HashMap(map);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21281a(int i, byte[] bArr, boolean z, boolean z2, long j, Runnable runnable) {
        if (!m21300a(this.f19945e) && this.f19945e.mo52253a(i, bArr, z, z2, j)) {
            mo52365b();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21282a(long j) {
        if (!m21300a(this.f19945e)) {
            boolean d = this.f19945e.mo52278d(j, C7823k0.m21211a(this.f19943c).mo52331m());
            if (this.f19945e.mo52254a(j)) {
                d = true;
            }
            if (d) {
                mo52371c();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21283a(long j, float f) {
        if (!m21300a(this.f19945e) && !m21299a(25, j)) {
            long j2 = (long) (f * 1000.0f);
            this.f19945e.mo52255a(j2, C7875t0.m21542b(j));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21284a(long j, float f, float f2, float f3) {
        if (!m21300a(this.f19945e) && !m21299a(27, j)) {
            long b = C7875t0.m21542b(j);
            this.f19945e.mo52256a((long) (f * 1000.0f), (long) (f2 * 1000.0f), (long) (f3 * 1000.0f), b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21285a(long j, String str, C7820j0.C7821a aVar, long j2) {
        if (!m21300a(this.f19945e) && this.f19945e.mo52257a(j, str, aVar, j2)) {
            C7823k0.m21211a(this.f19943c).mo52309b(j2);
            this.f19946f = j2;
            mo52365b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21286a(AdEvent adEvent, long j) {
        if (!m21300a(this.f19945e) && this.f19945e.mo52258a(adEvent, j)) {
            mo52365b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21287a(MiniAppEvent miniAppEvent, long j) {
        if (!m21300a(this.f19945e) && !m21301a(miniAppEvent.name) && !m21308b(miniAppEvent.eventParams) && this.f19945e.mo52259a(miniAppEvent, j)) {
            mo52365b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21288a(C7830b bVar, List list) {
        if (m21300a(this.f19945e)) {
            bVar.mo52113a(Collections.EMPTY_LIST);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f19945e.mo52249a((C7866q0) it.next());
        }
        bVar.mo52113a(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21289a(String str, String str2, long j) {
        if (!m21300a(this.f19945e) && this.f19945e.mo52261a(str, str2, j)) {
            mo52365b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21290a(String str, String str2, long j, long j2, long j3) {
        if (!m21300a(this.f19945e) && this.f19945e.mo52262a(str, str2, j, j2, j3)) {
            mo52365b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21291a(String str, String str2, long j, Runnable runnable) {
        if (!m21300a(this.f19945e)) {
            if (this.f19945e.mo52272b(str, str2, j)) {
                mo52365b();
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21292a(String str, String str2, String str3, String str4, String str5, long j) {
        long j2 = j;
        if (!m21300a(this.f19945e) && this.f19945e.mo52263a(str, str2, str3, str4, str5, j)) {
            C7823k0.m21211a(this.f19943c).mo52309b(j2);
            this.f19946f = j2;
            mo52365b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21293a(List list) {
        if (!m21300a(this.f19945e)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C7866q0 q0Var = (C7866q0) it.next();
                this.f19945e.mo52260a(q0Var, (Map<String, String>) null);
                this.f19945e.mo52269b(q0Var);
            }
            mo52365b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21294a(Map map, int i, long j) {
        if (!m21300a(this.f19945e) && !m21308b((Map<String, String>) map) && this.f19945e.mo52251a(i, (Map<String, String>) map, j)) {
            mo52365b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21295a(Map map, long j) {
        if (!m21300a(this.f19945e) && !m21308b((Map<String, String>) map) && this.f19945e.mo52266a((Map<String, String>) map, j)) {
            mo52365b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21296a(Map map, String str, long j) {
        if (!m21300a(this.f19945e) && !m21308b((Map<String, String>) map) && !m21301a(str) && this.f19945e.mo52265a(str, (Map<String, String>) map, j)) {
            mo52365b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21297a(Map map, String str, String str2, long j) {
        if (!m21300a(this.f19945e) && !m21308b((Map<String, String>) map) && this.f19945e.mo52264a(str, str2, (Map<String, String>) map, j)) {
            mo52365b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21298a(Map map, JSONObject jSONObject, String str, long j, JSONObject jSONObject2, Map map2) {
        if (!m21300a(this.f19945e) && !m21308b((Map<String, String>) map)) {
            if (this.f19945e.mo52260a(C7866q0.m21508a(jSONObject, str, j).mo52490a(jSONObject2), (Map<String, String>) map2)) {
                mo52365b();
            }
        }
    }

    /* renamed from: a */
    private boolean m21299a(int i, long j) {
        Long l = this.f19941a.get(Integer.valueOf(i));
        if (l == null || j - l.longValue() >= 800) {
            this.f19941a.put(Integer.valueOf(i), Long.valueOf(j));
            return false;
        }
        C7877u0.m21547a(String.format(Locale.ENGLISH, "EventTracker: event with type %d was throttled", new Object[]{Integer.valueOf(i)}));
        return true;
    }

    /* renamed from: a */
    static boolean m21300a(C7807d0 d0Var) {
        if (d0Var != null) {
            return false;
        }
        C7877u0.m21551b("EventTracker error: repository is null");
        return true;
    }

    /* renamed from: a */
    static boolean m21301a(String str) {
        if (str == null || str.length() <= 255) {
            return false;
        }
        C7877u0.m21551b("EventTracker error: length of the string " + str + " is more than " + 255 + ", event ignored");
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m21302b(long j, float f) {
        if (!m21300a(this.f19945e) && !m21299a(28, j)) {
            long j2 = (long) (f * 1000.0f);
            this.f19945e.mo52270b(j2, C7875t0.m21542b(j));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m21303b(long j, float f, float f2, float f3) {
        if (!m21300a(this.f19945e) && !m21299a(26, j)) {
            long b = C7875t0.m21542b(j);
            this.f19945e.mo52271b((long) (f * 1000.0f), (long) (f2 * 1000.0f), (long) (f3 * 1000.0f), b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m21304b(C7830b bVar) {
        bVar.mo52113a(m21300a(this.f19945e) ? Collections.EMPTY_LIST : this.f19945e.mo52267b());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m21305b(String str, String str2, long j, long j2, long j3) {
        if (!m21300a(this.f19945e) && this.f19945e.mo52273b(str, str2, j, j2, j3)) {
            mo52365b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m21306b(Map map, long j) {
        if (!m21300a(this.f19945e) && !m21308b((Map<String, String>) map) && this.f19945e.mo52275b((Map<String, String>) map, j)) {
            mo52365b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m21307b(Map map, String str, String str2, long j) {
        if (!m21300a(this.f19945e) && !m21308b((Map<String, String>) map) && this.f19945e.mo52274b(str, str2, (Map<String, String>) map, j)) {
            mo52365b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0010  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m21308b(java.util.Map<java.lang.String, java.lang.String> r2) {
        /*
            if (r2 == 0) goto L_0x0030
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x000a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = m21301a((java.lang.String) r1)
            if (r1 != 0) goto L_0x002e
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = m21301a((java.lang.String) r0)
            if (r0 == 0) goto L_0x000a
        L_0x002e:
            r2 = 1
            return r2
        L_0x0030:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.tracker.obfuscated.C7828m.m21308b(java.util.Map):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m21309c(long j, float f) {
        if (!m21300a(this.f19945e) && !m21299a(29, j)) {
            long j2 = (long) (f * 1000.0f);
            this.f19945e.mo52277c(j2, C7875t0.m21542b(j));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m21310e() {
        if (!m21300a(this.f19945e)) {
            mo52371c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m21311f() {
        if (this.f19945e != null) {
            C7877u0.m21551b("EventTracker error: tracker has already been initialized");
            return;
        }
        C7807d0 a = C7807d0.m21136a(this.f19942b, this.f19943c);
        this.f19945e = a;
        if (!m21300a(a)) {
            this.f19946f = C7823k0.m21211a(this.f19943c).mo52325j();
            mo52365b();
        }
    }

    /* renamed from: a */
    public void mo52348a() {
        C7806d.m21130a(new Runnable() {
            public final void run() {
                C7828m.this.m21310e();
            }
        });
    }

    /* renamed from: a */
    public void mo52349a(float f) {
        C7806d.m21130a(new Runnable(System.currentTimeMillis(), f) {
            public final /* synthetic */ long f$1;
            public final /* synthetic */ float f$2;

            {
                this.f$1 = r2;
                this.f$2 = r4;
            }

            public final void run() {
                C7828m.this.m21283a(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    public void mo52350a(float f, float f2, float f3) {
        C7806d.m21130a(new Runnable(System.currentTimeMillis(), f, f2, f3) {
            public final /* synthetic */ long f$1;
            public final /* synthetic */ float f$2;
            public final /* synthetic */ float f$3;
            public final /* synthetic */ float f$4;

            {
                this.f$1 = r2;
                this.f$2 = r4;
                this.f$3 = r5;
                this.f$4 = r6;
            }

            public final void run() {
                C7828m.this.m21284a(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    /* renamed from: a */
    public void mo52351a(int i, Map<String, String> map) {
        C7806d.m21130a(new Runnable(m21280a(map), i, C7875t0.m21540a()) {
            public final /* synthetic */ Map f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ long f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C7828m.this.m21294a(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* renamed from: a */
    public void mo52352a(int i, byte[] bArr, boolean z, boolean z2, Runnable runnable) {
        C7806d.m21130a(new Runnable(i, bArr, z, z2, C7875t0.m21540a(), runnable) {
            public final /* synthetic */ int f$1;
            public final /* synthetic */ byte[] f$2;
            public final /* synthetic */ boolean f$3;
            public final /* synthetic */ boolean f$4;
            public final /* synthetic */ long f$5;
            public final /* synthetic */ Runnable f$6;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r8;
            }

            public final void run() {
                C7828m.this.m21281a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
            }
        });
    }

    /* renamed from: a */
    public void mo52353a(long j, String str, C7820j0.C7821a aVar) {
        C7806d.m21130a(new Runnable(j, str, aVar, C7875t0.m21540a()) {
            public final /* synthetic */ long f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ C7820j0.C7821a f$3;
            public final /* synthetic */ long f$4;

            {
                this.f$1 = r2;
                this.f$2 = r4;
                this.f$3 = r5;
                this.f$4 = r6;
            }

            public final void run() {
                C7828m.this.m21285a(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    /* renamed from: a */
    public void mo52354a(AdEvent adEvent) {
        C7806d.m21130a(new Runnable(adEvent, C7875t0.m21540a()) {
            public final /* synthetic */ AdEvent f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C7828m.this.m21286a(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    public void mo52355a(MiniAppEvent miniAppEvent) {
        C7806d.m21130a(new Runnable(miniAppEvent, C7875t0.m21540a()) {
            public final /* synthetic */ MiniAppEvent f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C7828m.this.m21287a(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    public void mo52356a(C7830b bVar) {
        C7806d.m21130a(new Runnable(bVar) {
            public final /* synthetic */ C7828m.C7830b f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C7828m.this.m21304b(this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo52357a(String str, String str2) {
        C7806d.m21130a(new Runnable(str, str2, C7875t0.m21540a()) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ long f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C7828m.this.m21289a(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* renamed from: a */
    public void mo52358a(String str, String str2, long j, long j2) {
        C7806d.m21130a(new Runnable(str, str2, j, j2, C7875t0.m21540a()) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ long f$3;
            public final /* synthetic */ long f$4;
            public final /* synthetic */ long f$5;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r6;
                this.f$5 = r8;
            }

            public final void run() {
                C7828m.this.m21290a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
            }
        });
    }

    /* renamed from: a */
    public void mo52359a(String str, String str2, Runnable runnable) {
        C7806d.m21130a(new Runnable(str, str2, C7875t0.m21540a(), runnable) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ long f$3;
            public final /* synthetic */ Runnable f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r6;
            }

            public final void run() {
                C7828m.this.m21291a(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    /* renamed from: a */
    public void mo52360a(String str, String str2, String str3, String str4, String str5) {
        C7806d.m21130a(new Runnable(str, str2, str3, str4, str5, C7875t0.m21540a()) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ String f$4;
            public final /* synthetic */ String f$5;
            public final /* synthetic */ long f$6;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
            }

            public final void run() {
                C7828m.this.m21292a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
            }
        });
    }

    /* renamed from: a */
    public void mo52361a(String str, String str2, Map<String, String> map) {
        C7806d.m21130a(new Runnable(m21280a(map), str, str2, C7875t0.m21540a()) {
            public final /* synthetic */ Map f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ long f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                C7828m.this.m21297a(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    /* renamed from: a */
    public void mo52362a(String str, Map<String, String> map) {
        C7806d.m21130a(new Runnable(m21280a(map), str, C7875t0.m21540a()) {
            public final /* synthetic */ Map f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ long f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C7828m.this.m21296a(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* renamed from: a */
    public void mo52363a(List<C7866q0> list, C7830b bVar) {
        C7806d.m21130a(new Runnable(bVar, list) {
            public final /* synthetic */ C7828m.C7830b f$1;
            public final /* synthetic */ List f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C7828m.this.m21288a(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    public void mo52364a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map<String, String> map) {
        C7806d.m21130a(new Runnable(m21280a(map), jSONObject2, str, C7875t0.m21540a(), jSONObject, map) {
            public final /* synthetic */ Map f$1;
            public final /* synthetic */ JSONObject f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ long f$4;
            public final /* synthetic */ JSONObject f$5;
            public final /* synthetic */ Map f$6;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r7;
                this.f$6 = r8;
            }

            public final void run() {
                C7828m.this.m21298a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo52365b() {
        int e;
        C7807d0 d0Var = this.f19945e;
        if (d0Var != null) {
            if (d0Var.mo52248a() != 0 || ((e = this.f19942b.mo52536e()) > 0 && C7875t0.m21540a() - this.f19946f <= ((long) e))) {
                mo52371c();
            }
        }
    }

    /* renamed from: b */
    public void mo52366b(float f) {
        C7806d.m21130a(new Runnable(System.currentTimeMillis(), f) {
            public final /* synthetic */ long f$1;
            public final /* synthetic */ float f$2;

            {
                this.f$1 = r2;
                this.f$2 = r4;
            }

            public final void run() {
                C7828m.this.m21302b(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: b */
    public void mo52367b(float f, float f2, float f3) {
        C7806d.m21130a(new Runnable(System.currentTimeMillis(), f, f2, f3) {
            public final /* synthetic */ long f$1;
            public final /* synthetic */ float f$2;
            public final /* synthetic */ float f$3;
            public final /* synthetic */ float f$4;

            {
                this.f$1 = r2;
                this.f$2 = r4;
                this.f$3 = r5;
                this.f$4 = r6;
            }

            public final void run() {
                C7828m.this.m21303b(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    /* renamed from: b */
    public void mo52368b(String str, String str2, long j, long j2) {
        C7806d.m21130a(new Runnable(str, str2, j, j2, C7875t0.m21540a()) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ long f$3;
            public final /* synthetic */ long f$4;
            public final /* synthetic */ long f$5;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r6;
                this.f$5 = r8;
            }

            public final void run() {
                C7828m.this.m21305b(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
            }
        });
    }

    /* renamed from: b */
    public void mo52369b(String str, String str2, Map<String, String> map) {
        C7806d.m21130a(new Runnable(m21280a(map), str, str2, C7875t0.m21540a()) {
            public final /* synthetic */ Map f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ long f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                C7828m.this.m21307b(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    /* renamed from: b */
    public void mo52370b(List<C7866q0> list) {
        C7806d.m21130a(new Runnable(list) {
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C7828m.this.m21293a(this.f$1);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo52371c() {
        if (this.f19945e != null) {
            this.f19944d.mo52188a();
            C7872t.C7874b<String> c = this.f19945e.mo52276c();
            if (c != null) {
                String a = c.mo52504a();
                if (!TextUtils.isEmpty(a)) {
                    this.f19944d.mo52189a(a);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo52372c(float f) {
        C7806d.m21130a(new Runnable(System.currentTimeMillis(), f) {
            public final /* synthetic */ long f$1;
            public final /* synthetic */ float f$2;

            {
                this.f$1 = r2;
                this.f$2 = r4;
            }

            public final void run() {
                C7828m.this.m21309c(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: c */
    public void mo52373c(Map<String, String> map) {
        C7806d.m21130a(new Runnable(m21280a(map), C7875t0.m21540a()) {
            public final /* synthetic */ Map f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C7828m.this.m21295a(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: d */
    public void mo52374d() {
        C7806d.m21130a(new Runnable() {
            public final void run() {
                C7828m.this.m21311f();
            }
        });
    }

    /* renamed from: d */
    public void mo52375d(Map<String, String> map) {
        C7806d.m21130a(new Runnable(m21280a(map), C7875t0.m21540a()) {
            public final /* synthetic */ Map f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C7828m.this.m21306b(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: g */
    public void mo52376g() {
        C7806d.m21130a(new Runnable(C7875t0.m21540a()) {
            public final /* synthetic */ long f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C7828m.this.m21282a(this.f$1);
            }
        });
    }
}
