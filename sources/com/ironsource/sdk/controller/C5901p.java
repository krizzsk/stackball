package com.ironsource.sdk.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.ironsource.sdk.p150g.C6007c;
import com.ironsource.sdk.p150g.C6008d;
import com.ironsource.sdk.p153j.C6033e;
import com.ironsource.sdk.p153j.p154a.C6027b;
import com.ironsource.sdk.p153j.p154a.C6028c;
import com.ironsource.sdk.p153j.p154a.C6029d;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.p */
public final class C5901p implements C5898m {

    /* renamed from: b */
    private static final Handler f14415b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public String f14416a = "";

    C5901p(final C5862e eVar) {
        f14415b.post(new Runnable() {
            public final void run() {
                eVar.mo42251b();
            }
        });
    }

    /* renamed from: a */
    public final void mo42259a(Context context) {
    }

    /* renamed from: a */
    public final void mo42260a(C6007c cVar, final Map<String, String> map, final C6027b bVar) {
        if (bVar != null) {
            f14415b.post(new Runnable() {
                public final void run() {
                    bVar.mo42520d((String) map.get("demandSourceName"), C5901p.this.f14416a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo42261a(final C6007c cVar, Map<String, String> map, final C6028c cVar2) {
        if (cVar2 != null) {
            f14415b.post(new Runnable() {
                public final void run() {
                    cVar2.mo42511b(cVar.f14737b, C5901p.this.f14416a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo42263a(final String str, final C6028c cVar) {
        if (cVar != null) {
            f14415b.post(new Runnable() {
                public final void run() {
                    cVar.mo42511b(str, C5901p.this.f14416a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo42264a(String str, String str2, C6007c cVar, C6027b bVar) {
        if (bVar != null) {
            bVar.mo42492a(C6008d.C6013e.Banner, cVar.f14737b, this.f14416a);
        }
    }

    /* renamed from: a */
    public final void mo42265a(String str, String str2, final C6007c cVar, final C6028c cVar2) {
        if (cVar2 != null) {
            f14415b.post(new Runnable() {
                public final void run() {
                    cVar2.mo42492a(C6008d.C6013e.Interstitial, cVar.f14737b, C5901p.this.f14416a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo42266a(String str, String str2, final C6007c cVar, final C6029d dVar) {
        if (dVar != null) {
            f14415b.post(new Runnable() {
                public final void run() {
                    dVar.mo42492a(C6008d.C6013e.RewardedVideo, cVar.f14737b, C5901p.this.f14416a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo42267a(String str, String str2, final C6033e eVar) {
        if (eVar != null) {
            f14415b.post(new Runnable() {
                public final void run() {
                    eVar.onGetOWCreditsFailed(C5901p.this.f14416a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo42268a(String str, String str2, Map<String, String> map, final C6033e eVar) {
        if (eVar != null) {
            f14415b.post(new Runnable() {
                public final void run() {
                    eVar.onOfferwallInitFail(C5901p.this.f14416a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo42269a(Map<String, String> map, final C6033e eVar) {
        if (eVar != null) {
            f14415b.post(new Runnable() {
                public final void run() {
                    eVar.onOWShowFail(C5901p.this.f14416a);
                    eVar.onOfferwallInitFail(C5901p.this.f14416a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo42270a(JSONObject jSONObject) {
    }

    /* renamed from: a */
    public final void mo42271a(final JSONObject jSONObject, final C6028c cVar) {
        if (cVar != null) {
            f14415b.post(new Runnable() {
                public final void run() {
                    cVar.mo42516c(jSONObject.optString("demandSourceName"), C5901p.this.f14416a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo42272a(final JSONObject jSONObject, final C6029d dVar) {
        if (dVar != null) {
            f14415b.post(new Runnable() {
                public final void run() {
                    dVar.mo42497a(jSONObject.optString("demandSourceName"), C5901p.this.f14416a);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo42273b(Context context) {
    }

    /* renamed from: b */
    public final void mo42274b(final C6007c cVar, Map<String, String> map, final C6028c cVar2) {
        if (cVar2 != null) {
            f14415b.post(new Runnable() {
                public final void run() {
                    cVar2.mo42516c(cVar.f14737b, C5901p.this.f14416a);
                }
            });
        }
    }

    /* renamed from: c */
    public final C6008d.C6011c mo42275c() {
        return C6008d.C6011c.Native;
    }

    /* renamed from: c */
    public final boolean mo42276c(String str) {
        return false;
    }

    /* renamed from: d */
    public final void mo42277d() {
    }

    public final void destroy() {
    }

    /* renamed from: e */
    public final void mo42279e() {
    }

    /* renamed from: f */
    public final void mo42280f() {
    }

    /* renamed from: g */
    public final void mo42281g() {
    }
}
