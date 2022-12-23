package com.mbridge.msdk.mbbanner.common.p198c;

import android.content.Context;
import android.os.Handler;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.mbbanner.common.p196a.C6465b;
import com.mbridge.msdk.mbbanner.common.p196a.C6466c;
import com.mbridge.msdk.mbbanner.common.p197b.C6469b;
import com.mbridge.msdk.mbbanner.common.p197b.C6471d;
import com.mbridge.msdk.mbbanner.common.util.C6505a;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.p158b.C6086d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mbridge.msdk.mbbanner.common.c.a */
/* compiled from: BannerLoadManager */
public class C6482a {

    /* renamed from: a */
    private static final String f16157a = C6482a.class.getSimpleName();

    /* renamed from: h */
    private static volatile C6482a f16158h;

    /* renamed from: b */
    private Context f16159b = C6122a.m15302b().mo42895d();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6505a f16160c = new C6505a();

    /* renamed from: d */
    private Map<String, C6466c> f16161d = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Map<String, Boolean> f16162e = new ConcurrentHashMap();

    /* renamed from: f */
    private Map<String, Handler> f16163f = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Map<String, Integer> f16164g = new ConcurrentHashMap();

    /* renamed from: a */
    public static C6482a m16648a() {
        if (f16158h == null) {
            synchronized (C6482a.class) {
                if (f16158h == null) {
                    f16158h = new C6482a();
                }
            }
        }
        return f16158h;
    }

    private C6482a() {
    }

    /* renamed from: a */
    public final void mo44319a(String str, String str2, final C6465b bVar, C6469b bVar2) {
        C6466c cVar;
        if (this.f16159b == null) {
            this.f16160c.mo44347a(bVar2, "Banner Context == null!", str2);
        } else if (bVar == null || bVar2 == null) {
            this.f16160c.mo44347a(bVar2, "Banner request parameters or callback empty!", str2);
        } else {
            synchronized (m16648a()) {
                if (this.f16162e == null || !this.f16162e.containsKey(str2) || !this.f16162e.get(str2).booleanValue()) {
                    this.f16162e.put(str2, true);
                    if (this.f16161d.containsKey(str2)) {
                        cVar = this.f16161d.get(str2);
                    } else {
                        C6086d e = C6076b.m15089a().mo42755e(C6122a.m15302b().mo42896e(), str2);
                        if (e == null) {
                            e = C6086d.m15134d(str2);
                        }
                        C6466c cVar2 = new C6466c(str2, "", 0, e.mo42797w() * 1);
                        this.f16161d.put(str2, cVar2);
                        cVar = cVar2;
                    }
                    new C6485b(this.f16159b, cVar, bVar2, this.f16160c).mo44324a(str, str2, bVar, (C6471d) new C6471d() {
                        /* renamed from: a */
                        public final void mo44299a(String str) {
                            synchronized (C6482a.m16648a()) {
                                bVar.mo44282a("");
                                C6482a.this.f16162e.put(str, false);
                            }
                        }
                    });
                    return;
                }
                this.f16160c.mo44347a(bVar2, "Current unit is loading!", str2);
            }
        }
    }

    /* renamed from: b */
    public final void mo44321b(String str, String str2, C6465b bVar, C6469b bVar2) {
        Handler handler;
        if (bVar != null && bVar.mo44283b() > 0) {
            if (this.f16163f.containsKey(str2)) {
                handler = this.f16163f.get(str2);
            } else {
                handler = new Handler();
                this.f16163f.put(str2, handler);
            }
            final String str3 = str2;
            final C6469b bVar3 = bVar2;
            final String str4 = str;
            final C6465b bVar4 = bVar;
            C64842 r1 = new Runnable() {
                public final void run() {
                    int intValue;
                    if (C6482a.this.f16162e != null && C6482a.this.f16162e.containsKey(str3) && ((Boolean) C6482a.this.f16162e.get(str3)).booleanValue()) {
                        return;
                    }
                    if (!C6482a.this.f16164g.containsKey(str3) || !((intValue = ((Integer) C6482a.this.f16164g.get(str3)).intValue()) == 2 || intValue == 4)) {
                        C6482a.this.mo44319a(str4, str3, bVar4, bVar3);
                    } else if (C6482a.this.f16160c != null) {
                        C6482a.this.f16160c.mo44347a(bVar3, "banner load failed because env is exception", str3);
                    }
                }
            };
            handler.removeCallbacksAndMessages((Object) null);
            handler.postDelayed(r1, (long) bVar.mo44283b());
        }
    }

    /* renamed from: a */
    public final void mo44318a(String str) {
        if (this.f16163f.containsKey(str)) {
            this.f16163f.get(str).removeCallbacksAndMessages((Object) null);
            this.f16163f.remove(str);
        }
    }

    /* renamed from: a */
    public final void mo44317a(int i, String str, String str2, C6465b bVar, C6469b bVar2) {
        int intValue = this.f16164g.containsKey(str2) ? this.f16164g.get(str2).intValue() : 0;
        if (i == 1) {
            if (this.f16163f.containsKey(str2)) {
                this.f16163f.get(str2).removeCallbacksAndMessages((Object) null);
            }
            this.f16164g.put(str2, Integer.valueOf(i));
        } else if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    if (intValue == 0) {
                        this.f16164g.put(str2, 0);
                        return;
                    }
                    if (this.f16163f.containsKey(str2)) {
                        this.f16163f.get(str2).removeCallbacksAndMessages((Object) null);
                    }
                    this.f16164g.put(str2, Integer.valueOf(i));
                }
            } else if (intValue == 2 || intValue == 4) {
                this.f16164g.put(str2, 1);
                mo44321b(str, str2, bVar, bVar2);
            }
        } else if (intValue == 1) {
            if (this.f16163f.containsKey(str2)) {
                this.f16163f.get(str2).removeCallbacksAndMessages((Object) null);
            }
            this.f16164g.put(str2, Integer.valueOf(i));
        }
    }

    /* renamed from: b */
    public final void mo44320b() {
        Map<String, C6466c> map = this.f16161d;
        if (map != null) {
            map.clear();
        }
        Map<String, Boolean> map2 = this.f16162e;
        if (map2 != null) {
            map2.clear();
        }
        Map<String, Handler> map3 = this.f16163f;
        if (map3 != null) {
            for (Map.Entry next : map3.entrySet()) {
                if (next.getValue() != null) {
                    ((Handler) next.getValue()).removeCallbacksAndMessages((Object) null);
                }
            }
            this.f16163f.clear();
        }
        Map<String, Integer> map4 = this.f16164g;
        if (map4 != null) {
            map4.clear();
        }
    }
}
