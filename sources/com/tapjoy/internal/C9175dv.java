package com.tapjoy.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import com.tapjoy.internal.C9158di;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.dv */
public final class C9175dv implements C9158di.C9159a {

    /* renamed from: a */
    public static Handler f22543a = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private static C9175dv f22544c = new C9175dv();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static Handler f22545d = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f22546j = new Runnable() {
        public final void run() {
            C9175dv.m24565b(C9175dv.m24560a());
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f22547k = new Runnable() {
        public final void run() {
            if (C9175dv.f22545d != null) {
                C9175dv.f22545d.post(C9175dv.f22546j);
                C9175dv.f22545d.postDelayed(C9175dv.f22547k, 200);
            }
        }
    };

    /* renamed from: b */
    public List f22548b = new ArrayList();

    /* renamed from: e */
    private int f22549e;

    /* renamed from: f */
    private C9160dj f22550f = new C9160dj();

    /* renamed from: g */
    private C9179dw f22551g = new C9179dw();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C9189ed f22552h = new C9189ed(new C9184dz());

    /* renamed from: i */
    private long f22553i;

    C9175dv() {
    }

    /* renamed from: a */
    public static C9175dv m24560a() {
        return f22544c;
    }

    /* renamed from: a */
    private void m24562a(long j) {
        if (this.f22548b.size() > 0) {
            Iterator it = this.f22548b.iterator();
            while (it.hasNext()) {
                it.next();
                TimeUnit.NANOSECONDS.toMillis(j);
            }
        }
    }

    /* renamed from: a */
    private void m24563a(View view, C9158di diVar, JSONObject jSONObject, int i) {
        diVar.mo57957a(view, jSONObject, this, i == C9190ee.f22581a);
    }

    /* renamed from: b */
    public static void m24564b() {
        if (f22545d == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f22545d = handler;
            handler.post(f22546j);
            f22545d.postDelayed(f22547k, 200);
        }
    }

    /* renamed from: c */
    public static void m24566c() {
        Handler handler = f22545d;
        if (handler != null) {
            handler.removeCallbacks(f22547k);
            f22545d = null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo57958a(android.view.View r7, com.tapjoy.internal.C9158di r8, org.json.JSONObject r9) {
        /*
            r6 = this;
            java.lang.String r0 = com.tapjoy.internal.C9167dp.m24548c(r7)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            if (r0 != 0) goto L_0x000e
            return
        L_0x000e:
            com.tapjoy.internal.dw r0 = r6.f22551g
            java.util.HashSet r3 = r0.f22558d
            boolean r3 = r3.contains(r7)
            if (r3 == 0) goto L_0x001b
            int r0 = com.tapjoy.internal.C9190ee.f22581a
            goto L_0x0024
        L_0x001b:
            boolean r0 = r0.f22562h
            if (r0 == 0) goto L_0x0022
            int r0 = com.tapjoy.internal.C9190ee.f22582b
            goto L_0x0024
        L_0x0022:
            int r0 = com.tapjoy.internal.C9190ee.f22583c
        L_0x0024:
            int r3 = com.tapjoy.internal.C9190ee.f22583c
            if (r0 != r3) goto L_0x0029
            return
        L_0x0029:
            org.json.JSONObject r3 = r8.mo57956a(r7)
            com.tapjoy.internal.C9163dm.m24537a((org.json.JSONObject) r9, (org.json.JSONObject) r3)
            com.tapjoy.internal.dw r9 = r6.f22551g
            java.util.HashMap r4 = r9.f22555a
            int r4 = r4.size()
            r5 = 0
            if (r4 != 0) goto L_0x003d
            r4 = r5
            goto L_0x004c
        L_0x003d:
            java.util.HashMap r4 = r9.f22555a
            java.lang.Object r4 = r4.get(r7)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x004c
            java.util.HashMap r9 = r9.f22555a
            r9.remove(r7)
        L_0x004c:
            if (r4 == 0) goto L_0x0056
            com.tapjoy.internal.C9163dm.m24534a((org.json.JSONObject) r3, (java.lang.String) r4)
            com.tapjoy.internal.dw r9 = r6.f22551g
            r9.f22562h = r2
            r1 = 1
        L_0x0056:
            if (r1 != 0) goto L_0x007e
            com.tapjoy.internal.dw r9 = r6.f22551g
            java.util.HashMap r1 = r9.f22557c
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0063
            goto L_0x0076
        L_0x0063:
            java.util.HashMap r1 = r9.f22557c
            java.lang.Object r1 = r1.get(r7)
            r5 = r1
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            if (r5 == 0) goto L_0x0076
            java.util.HashMap r9 = r9.f22557c
            r9.remove(r7)
            java.util.Collections.sort(r5)
        L_0x0076:
            if (r5 == 0) goto L_0x007b
            com.tapjoy.internal.C9163dm.m24536a((org.json.JSONObject) r3, (java.util.List) r5)
        L_0x007b:
            r6.m24563a(r7, r8, r3, r0)
        L_0x007e:
            int r7 = r6.f22549e
            int r7 = r7 + r2
            r6.f22549e = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9175dv.mo57958a(android.view.View, com.tapjoy.internal.di, org.json.JSONObject):void");
    }

    /* renamed from: b */
    static /* synthetic */ void m24565b(C9175dv dvVar) {
        String str;
        dvVar.f22549e = 0;
        dvVar.f22553i = System.nanoTime();
        C9179dw dwVar = dvVar.f22551g;
        C9150dd a = C9150dd.m24507a();
        if (a != null) {
            for (C9145cz czVar : Collections.unmodifiableCollection(a.f22500b)) {
                View c = czVar.mo57930c();
                if (czVar.mo57931d()) {
                    String str2 = czVar.f22483f;
                    if (c != null) {
                        if (!c.hasWindowFocus()) {
                            str = "noWindowFocus";
                        } else {
                            HashSet hashSet = new HashSet();
                            View view = c;
                            while (true) {
                                if (view == null) {
                                    dwVar.f22558d.addAll(hashSet);
                                    str = null;
                                    break;
                                }
                                String c2 = C9167dp.m24548c(view);
                                if (c2 != null) {
                                    str = c2;
                                    break;
                                }
                                hashSet.add(view);
                                ViewParent parent = view.getParent();
                                view = parent instanceof View ? (View) parent : null;
                            }
                        }
                        if (str == null) {
                            dwVar.f22559e.add(str2);
                            dwVar.f22555a.put(c, str2);
                            dwVar.mo57972a(czVar);
                        } else {
                            dwVar.f22560f.add(str2);
                            dwVar.f22556b.put(str2, c);
                            dwVar.f22561g.put(str2, str);
                        }
                    } else {
                        dwVar.f22560f.add(str2);
                        dwVar.f22561g.put(str2, "noAdView");
                    }
                }
            }
        }
        long nanoTime = System.nanoTime();
        C9161dk dkVar = dvVar.f22550f.f22521b;
        if (dvVar.f22551g.f22560f.size() > 0) {
            Iterator it = dvVar.f22551g.f22560f.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                JSONObject a2 = dkVar.mo57956a((View) null);
                View view2 = (View) dvVar.f22551g.f22556b.get(str3);
                C9162dl dlVar = dvVar.f22550f.f22520a;
                String str4 = (String) dvVar.f22551g.f22561g.get(str3);
                if (str4 != null) {
                    JSONObject a3 = dlVar.mo57956a(view2);
                    C9163dm.m24534a(a3, str3);
                    C9163dm.m24539b(a3, str4);
                    C9163dm.m24537a(a2, a3);
                }
                C9163dm.m24533a(a2);
                HashSet hashSet2 = new HashSet();
                hashSet2.add(str3);
                C9189ed edVar = dvVar.f22552h;
                edVar.f22579a.mo57978a(new C9187eb(edVar, hashSet2, a2, nanoTime));
            }
        }
        if (dvVar.f22551g.f22559e.size() > 0) {
            JSONObject a4 = dkVar.mo57956a((View) null);
            dvVar.m24563a((View) null, dkVar, a4, C9190ee.f22581a);
            C9163dm.m24533a(a4);
            C9189ed edVar2 = dvVar.f22552h;
            edVar2.f22579a.mo57978a(new C9188ec(edVar2, dvVar.f22551g.f22559e, a4, nanoTime));
        } else {
            dvVar.f22552h.mo57982b();
        }
        C9179dw dwVar2 = dvVar.f22551g;
        dwVar2.f22555a.clear();
        dwVar2.f22556b.clear();
        dwVar2.f22557c.clear();
        dwVar2.f22558d.clear();
        dwVar2.f22559e.clear();
        dwVar2.f22560f.clear();
        dwVar2.f22561g.clear();
        dwVar2.f22562h = false;
        dvVar.m24562a(System.nanoTime() - dvVar.f22553i);
    }
}
