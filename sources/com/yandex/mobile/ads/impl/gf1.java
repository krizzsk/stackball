package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.yandex.mobile.ads.impl.vs1;
import com.yandex.mobile.ads.impl.ys1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class gf1 implements vs1.C14932a {

    /* renamed from: h */
    private static gf1 f33984h = new gf1();

    /* renamed from: i */
    private static Handler f33985i = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static Handler f33986j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f33987k = new C13200b();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Runnable f33988l = new C13201c();

    /* renamed from: a */
    private List<C13203e> f33989a = new ArrayList();

    /* renamed from: b */
    private int f33990b;

    /* renamed from: c */
    private final List<ws1> f33991c = new ArrayList();

    /* renamed from: d */
    private et1 f33992d = new et1();

    /* renamed from: e */
    private ys1 f33993e = new ys1();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ht1 f33994f = new ht1(new ot1());

    /* renamed from: g */
    private long f33995g;

    /* renamed from: com.yandex.mobile.ads.impl.gf1$a */
    class C13199a implements Runnable {
        C13199a() {
        }

        public void run() {
            gf1.this.f33994f.mo67627a();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gf1$b */
    static class C13200b implements Runnable {
        C13200b() {
        }

        public void run() {
            gf1.m36596b(gf1.m36600g());
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gf1$c */
    static class C13201c implements Runnable {
        C13201c() {
        }

        public void run() {
            if (gf1.f33986j != null) {
                gf1.f33986j.post(gf1.f33987k);
                gf1.f33986j.postDelayed(gf1.f33988l, 200);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.gf1$d */
    public interface C13202d extends C13203e {
        /* renamed from: b */
        void mo67301b(int i, long j);
    }

    /* renamed from: com.yandex.mobile.ads.impl.gf1$e */
    public interface C13203e {
        /* renamed from: a */
        void mo67302a(int i, long j);
    }

    gf1() {
    }

    /* renamed from: g */
    public static gf1 m36600g() {
        return f33984h;
    }

    /* renamed from: a */
    public void mo67294a() {
        if (f33986j == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f33986j = handler;
            handler.post(f33987k);
            f33986j.postDelayed(f33988l, 200);
        }
    }

    /* renamed from: b */
    public void mo67296b() {
        Handler handler = f33986j;
        if (handler != null) {
            handler.removeCallbacks(f33988l);
            f33986j = null;
        }
        this.f33989a.clear();
        f33985i.post(new C13199a());
    }

    /* renamed from: c */
    public void mo67297c() {
        Handler handler = f33986j;
        if (handler != null) {
            handler.removeCallbacks(f33988l);
            f33986j = null;
        }
    }

    /* renamed from: a */
    public void mo67295a(View view, vs1 vs1, JSONObject jSONObject, boolean z) {
        nt1 c;
        boolean z2;
        boolean z3;
        if ((zt1.m44789a(view) == null) && (c = this.f33993e.mo71118c(view)) != nt1.UNDERLYING_VIEW) {
            JSONObject a = vs1.mo68510a(view);
            int i = ft1.f33742d;
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                    jSONObject.put("childViews", optJSONArray);
                }
                optJSONArray.put(a);
            } catch (JSONException unused) {
            }
            String a2 = this.f33993e.mo71112a(view);
            if (a2 != null) {
                int i2 = ft1.f33742d;
                try {
                    a.put("adSessionId", a2);
                } catch (JSONException e) {
                    mt1.m39732a("Error with setting ad session id", e);
                }
                try {
                    a.put("hasWindowFocus", Boolean.valueOf(this.f33993e.mo71121d(view)));
                } catch (JSONException e2) {
                    mt1.m39732a("Error with setting not visible reason", e2);
                }
                this.f33993e.mo71122e();
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                ys1.C15273a b = this.f33993e.mo71116b(view);
                if (b != null) {
                    int i3 = ft1.f33742d;
                    kt1 a3 = b.mo71123a();
                    JSONArray jSONArray = new JSONArray();
                    for (String put : b.mo71125b()) {
                        jSONArray.put(put);
                    }
                    try {
                        a.put("isFriendlyObstructionFor", jSONArray);
                        a.put("friendlyObstructionClass", a3.mo68271b());
                        a.put("friendlyObstructionPurpose", a3.mo68272c());
                        a.put("friendlyObstructionReason", a3.mo68273d());
                    } catch (JSONException e3) {
                        mt1.m39732a("Error with setting friendly obstruction", e3);
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                vs1.mo68511a(view, a, this, c == nt1.PARENT_VIEW, z || z3);
            }
            this.f33990b++;
        }
    }

    /* renamed from: b */
    static void m36596b(gf1 gf1) {
        gf1.f33990b = 0;
        gf1.f33991c.clear();
        for (ts1 ts1 : us1.m42837a().mo70402c()) {
            ts1.getClass();
        }
        gf1.f33995g = System.nanoTime();
        gf1.f33993e.mo71119c();
        long nanoTime = System.nanoTime();
        vs1 a = gf1.f33992d.mo66875a();
        if (gf1.f33993e.mo71117b().size() > 0) {
            Iterator<String> it = gf1.f33993e.mo71117b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a2 = ((lt1) a).mo68510a((View) null);
                View b = gf1.f33993e.mo71115b(next);
                vs1 b2 = gf1.f33992d.mo66876b();
                String a3 = gf1.f33993e.mo71113a(next);
                if (a3 != null) {
                    JSONObject a4 = ((rt1) b2).mo68510a(b);
                    int i = ft1.f33742d;
                    try {
                        a4.put("adSessionId", next);
                    } catch (JSONException e) {
                        mt1.m39732a("Error with setting ad session id", e);
                    }
                    try {
                        a4.put("notVisibleReason", a3);
                    } catch (JSONException e2) {
                        mt1.m39732a("Error with setting not visible reason", e2);
                    }
                    try {
                        JSONArray optJSONArray = a2.optJSONArray("childViews");
                        if (optJSONArray == null) {
                            optJSONArray = new JSONArray();
                            a2.put("childViews", optJSONArray);
                        }
                        optJSONArray.put(a4);
                    } catch (JSONException unused) {
                    }
                }
                ft1.m36311a(a2);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                gf1.f33994f.mo67631b(a2, hashSet, nanoTime);
            }
        }
        if (gf1.f33993e.mo71114a().size() > 0) {
            lt1 lt1 = (lt1) a;
            JSONObject a5 = lt1.mo68510a((View) null);
            lt1.mo68511a((View) null, a5, gf1, true, false);
            ft1.m36311a(a5);
            gf1.f33994f.mo67629a(a5, gf1.f33993e.mo71114a(), nanoTime);
        } else {
            gf1.f33994f.mo67627a();
        }
        gf1.f33993e.mo71120d();
        long nanoTime2 = System.nanoTime() - gf1.f33995g;
        if (gf1.f33989a.size() > 0) {
            for (C13203e next2 : gf1.f33989a) {
                next2.mo67302a(gf1.f33990b, TimeUnit.NANOSECONDS.toMillis(nanoTime2));
                if (next2 instanceof C13202d) {
                    ((C13202d) next2).mo67301b(gf1.f33990b, nanoTime2);
                }
            }
        }
    }
}
