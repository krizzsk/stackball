package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.facebook.internal.NativeProtocol;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p243my.target.ads.Reward;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.mediation.base.C15434a;
import com.yandex.mobile.ads.mediation.base.C15435b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class om0<T extends C15434a, L> {

    /* renamed from: a */
    private final C14645t1 f38271a;

    /* renamed from: b */
    private final C15230y2 f38272b;

    /* renamed from: c */
    private final rm0<T, L> f38273c;

    /* renamed from: d */
    private final wm0 f38274d;

    /* renamed from: e */
    private final pm0<T> f38275e;

    /* renamed from: f */
    private final C15435b f38276f = new C15435b();

    /* renamed from: g */
    private final ty0 f38277g;

    /* renamed from: h */
    private nm0<T> f38278h;

    public om0(C14645t1 t1Var, C15230y2 y2Var, rm0<T, L> rm0, wm0 wm0, pm0<T> pm0, ty0 ty0) {
        this.f38271a = t1Var;
        this.f38272b = y2Var;
        this.f38273c = rm0;
        this.f38277g = ty0;
        this.f38275e = pm0;
        this.f38274d = wm0;
    }

    /* renamed from: a */
    public void mo69207a(Context context) {
        nm0<T> nm0 = this.f38278h;
        if (nm0 != null) {
            try {
                this.f38273c.mo69785a(nm0.mo69061a());
            } catch (Throwable th) {
                m40459a(context, th, this.f38278h.mo69063b());
            }
        }
    }

    /* renamed from: b */
    public nm0 mo69212b() {
        return this.f38278h;
    }

    /* renamed from: c */
    public void mo69216c(Context context) {
        mo69211a(context, (Map<String, Object>) new HashMap());
    }

    /* renamed from: d */
    public void mo69220d(Context context, Map<String, Object> map) {
        nm0<T> nm0 = this.f38278h;
        if (nm0 != null) {
            this.f38274d.mo70726e(context, nm0.mo69063b(), map);
        }
    }

    /* renamed from: e */
    public void mo69221e(Context context) {
        mo69217c(context, new HashMap());
    }

    /* renamed from: f */
    public void mo69223f(Context context) {
        nm0<T> nm0 = this.f38278h;
        if (nm0 != null) {
            this.f38274d.mo70719a(context, nm0.mo69063b());
        }
    }

    /* renamed from: b */
    public void mo69215b(Context context, Map<String, Object> map) {
        nm0<T> nm0 = this.f38278h;
        if (nm0 != null) {
            hn0 b = nm0.mo69063b();
            List<String> f = b.mo67575f();
            if (f != null) {
                for (String a : f) {
                    new C12356a5(context, this.f38271a).mo65674a(a);
                }
            }
            this.f38274d.mo70725d(context, b, map);
        }
    }

    /* renamed from: c */
    public void mo69217c(Context context, Map<String, Object> map) {
        nm0<T> nm0 = this.f38278h;
        if (nm0 != null) {
            List<String> b = nm0.mo69063b().mo67570b();
            C12356a5 a5Var = new C12356a5(context, this.f38271a);
            if (b != null) {
                for (String a : b) {
                    a5Var.mo65674a(a);
                }
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.put("status", "success");
        m40460f(context, hashMap);
    }

    /* renamed from: e */
    public void mo69222e(Context context, Map<String, Object> map) {
        nm0<T> nm0 = this.f38278h;
        if (nm0 != null) {
            this.f38274d.mo70723b(context, nm0.mo69063b(), map);
        }
    }

    /* renamed from: f */
    private void m40460f(Context context, Map<String, Object> map) {
        nm0<T> nm0 = this.f38278h;
        if (nm0 != null) {
            map.putAll(this.f38276f.mo71388a(nm0.mo69061a()));
            this.f38274d.mo70728g(context, this.f38278h.mo69063b(), map);
        }
    }

    /* renamed from: d */
    public void mo69219d(Context context) {
        mo69215b(context, new HashMap());
    }

    /* renamed from: a */
    public void mo69210a(Context context, L l) {
        nm0<T> a = this.f38275e.mo69388a(context);
        this.f38278h = a;
        if (a != null) {
            this.f38272b.mo70970b(C15139x2.ADAPTER_LOADING);
            hn0 b = this.f38278h.mo69063b();
            this.f38274d.mo70722b(context, b);
            try {
                this.f38273c.mo69784a(context, this.f38278h.mo69061a(), l, this.f38278h.mo69062a(context), this.f38278h.mo69064c());
            } catch (Throwable th) {
                m40459a(context, th, b);
                m40458a();
                mo69210a(context, l);
            }
        } else {
            this.f38277g.mo70256a();
        }
    }

    /* renamed from: b */
    public void mo69214b(Context context, C12350a2 a2Var, L l) {
        m40458a();
        HashMap hashMap = new HashMap();
        hashMap.put("status", "error");
        hashMap.put("error_code", Integer.valueOf(a2Var.mo65651a()));
        hashMap.put(NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION, a2Var.mo65652b());
        m40460f(context, hashMap);
        mo69207a(context);
        mo69210a(context, l);
    }

    /* renamed from: c */
    public boolean mo69218c() {
        nm0<T> nm0 = this.f38278h;
        if (nm0 != null) {
            return nm0.mo69061a().shouldTrackImpressionAutomatically();
        }
        return true;
    }

    /* renamed from: b */
    public void mo69213b(Context context) {
        if (this.f38278h != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("status", "success");
            this.f38274d.mo70727f(context, this.f38278h.mo69063b(), hashMap);
        }
    }

    /* renamed from: a */
    public void mo69211a(Context context, Map<String, Object> map) {
        nm0<T> nm0 = this.f38278h;
        if (nm0 != null) {
            hn0 b = nm0.mo69063b();
            List<String> e = b.mo67573e();
            if (e != null) {
                for (String a : e) {
                    new C12356a5(context, this.f38271a).mo65674a(a);
                }
            }
            HashMap hashMap = new HashMap(map);
            hashMap.put("click_type", Reward.DEFAULT);
            this.f38274d.mo70724c(context, b, hashMap);
        }
    }

    /* renamed from: a */
    public void mo69209a(Context context, C12350a2 a2Var, L l) {
        if (this.f38278h != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("status", "error");
            hashMap.put("error_code", Integer.valueOf(a2Var.mo65651a()));
            this.f38274d.mo70727f(context, this.f38278h.mo69063b(), hashMap);
        }
        mo69207a(context);
        mo69210a(context, l);
    }

    /* renamed from: a */
    private void m40459a(Context context, Throwable th, hn0 hn0) {
        HashMap hashMap = new HashMap();
        hashMap.put("exception_in_adapter", th.toString());
        HashMap hashMap2 = new HashMap();
        hashMap2.put(IronSourceConstants.EVENTS_ERROR_REASON, hashMap);
        this.f38274d.mo70721a(context, hn0, (Map<String, Object>) hashMap2);
    }

    /* renamed from: a */
    public void mo69208a(Context context, AdResponse<String> adResponse) {
        nm0<T> nm0 = this.f38278h;
        if (nm0 != null) {
            this.f38274d.mo70720a(context, nm0.mo69063b(), (AdResponse) adResponse);
        }
    }

    /* renamed from: a */
    private void m40458a() {
        nm0<T> nm0 = this.f38278h;
        this.f38272b.mo70966a(C15139x2.ADAPTER_LOADING, (gz0) new C14056n5(h41.C13277c.ERROR, nm0 != null ? nm0.mo69063b().mo67571c() : null));
    }
}
