package com.ironsource.sdk.controller;

import android.content.Context;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.p143a.C5821a;
import com.ironsource.sdk.p143a.C5825d;
import com.ironsource.sdk.p143a.C5826e;
import com.ironsource.sdk.p143a.C5827f;
import com.ironsource.sdk.p150g.C6007c;
import com.ironsource.sdk.p150g.C6008d;
import com.ironsource.sdk.p150g.C6014e;
import com.ironsource.sdk.p151h.C6016a;
import com.ironsource.sdk.p151h.C6017b;
import com.ironsource.sdk.p151h.C6021d;
import com.ironsource.sdk.p153j.C6032d;
import com.ironsource.sdk.p153j.C6033e;
import com.ironsource.sdk.p153j.p154a.C6027b;
import com.ironsource.sdk.p153j.p154a.C6028c;
import com.ironsource.sdk.p153j.p154a.C6029d;
import com.ironsource.sdk.p155k.C6037b;
import com.ironsource.sdk.service.C6049a;
import com.ironsource.sdk.service.C6055e;
import com.ironsource.sdk.utils.Logger;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.g */
public class C5868g implements C5862e, C5898m {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Handler f14319g = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public C5898m f14320a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f14321b = C5868g.class.getSimpleName();

    /* renamed from: c */
    private C6008d.C6010b f14322c = C6008d.C6010b.None;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public CountDownTimer f14323d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C5858b f14324e = new C5858b("NativeCommandExecutor");

    /* renamed from: f */
    private final C5858b f14325f = new C5858b("ControllerCommandsExecutor");

    public C5868g(Context context, C5860c cVar, C6055e eVar, C5893j jVar) {
        final Context context2 = context;
        final C5860c cVar2 = cVar;
        final C6055e eVar2 = eVar;
        final C5893j jVar2 = jVar;
        f14319g.post(new Runnable() {
            public final void run() {
                try {
                    C5898m unused = C5868g.this.f14320a = C5868g.m14499a(C5868g.this, context2, cVar2, eVar2, jVar2);
                    CountDownTimer unused2 = C5868g.this.f14323d = new CountDownTimer(200000, 1000) {
                        public final void onFinish() {
                            Logger.m14957i(C5868g.this.f14321b, "Global Controller Timer Finish");
                            C5868g.this.m14506i();
                            C5868g.f14319g.post(new Runnable() {
                                public final void run() {
                                    C5868g.m14501a(C5868g.this, "controller html - download timeout");
                                }
                            });
                        }

                        public final void onTick(long j) {
                            String a = C5868g.this.f14321b;
                            Logger.m14957i(a, "Global Controller Timer Tick " + j);
                        }
                    }.start();
                    C5923w wVar = (C5923w) C5868g.this.f14320a;
                    C5863f fVar = wVar.f14513m;
                    C5825d.m14394a(C5827f.f14178s, (Map<String, Object>) new C5821a().mo42154a("generalmessage", Integer.valueOf(fVar.f14299b)).f14151a);
                    fVar.f14298a = System.currentTimeMillis();
                    if (wVar.f14513m.mo42255b()) {
                        wVar.mo42334a(1);
                    }
                    C5868g.this.f14324e.mo42242a();
                    C5868g.this.f14324e.mo42244b();
                } catch (Exception e) {
                    C5868g.m14501a(C5868g.this, Log.getStackTraceString(e));
                }
            }
        });
    }

    /* renamed from: a */
    static /* synthetic */ C5923w m14499a(C5868g gVar, Context context, C5860c cVar, C6055e eVar, C5893j jVar) {
        C5825d.m14393a(C5827f.f14161b);
        C5923w wVar = new C5923w(context, jVar, cVar, gVar);
        C6017b bVar = new C6017b(context, C6037b.m14886a(wVar.f14512l), new C6016a(), new C6021d(C6037b.m14886a(wVar.f14512l).f14793b));
        wVar.f14518r = new C5920u(context, eVar);
        wVar.f14516p = new C5914q(context);
        wVar.f14517q = new C5916r(context);
        wVar.f14519s = new C5894k(context);
        wVar.f14520t = new C5856a(cVar);
        C5856a aVar = wVar.f14520t;
        if (wVar.f14522v == null) {
            wVar.f14522v = new C5977x() {
                /* renamed from: a */
                public final void mo42363a(String str, JSONObject jSONObject) {
                    C5923w.this.mo42342b(C5923w.m14639b(str, jSONObject.toString()));
                }
            };
        }
        aVar.f14282a = wVar.f14522v;
        wVar.f14521u = new C5896l(C6037b.m14886a(wVar.f14512l).f14793b, bVar);
        return wVar;
    }

    /* renamed from: a */
    static /* synthetic */ void m14501a(C5868g gVar, String str) {
        C5825d.m14394a(C5827f.f14162c, (Map<String, Object>) new C5821a().mo42154a("callfailreason", str).f14151a);
        C5901p pVar = new C5901p(gVar);
        gVar.f14320a = pVar;
        pVar.f14416a = str;
        gVar.f14324e.mo42242a();
        gVar.f14324e.mo42244b();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m14506i() {
        C5898m mVar = this.f14320a;
        if (mVar != null && (mVar instanceof C5923w)) {
            mVar.destroy();
            this.f14320a = null;
        }
    }

    /* renamed from: j */
    private boolean m14507j() {
        return C6008d.C6010b.Ready.equals(this.f14322c);
    }

    /* renamed from: a */
    public final void mo42249a() {
        this.f14322c = C6008d.C6010b.Loaded;
    }

    /* renamed from: a */
    public final void mo42259a(Context context) {
        if (m14507j()) {
            this.f14320a.mo42259a(context);
        }
    }

    /* renamed from: a */
    public final void mo42260a(final C6007c cVar, final Map<String, String> map, final C6027b bVar) {
        this.f14325f.mo42243a(new Runnable() {
            public final void run() {
                C5868g.this.f14320a.mo42260a(cVar, (Map<String, String>) map, bVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo42261a(final C6007c cVar, final Map<String, String> map, final C6028c cVar2) {
        this.f14325f.mo42243a(new Runnable() {
            public final void run() {
                C5821a a = new C5821a().mo42154a("demandsourcename", cVar.f14736a).mo42154a("producttype", C5826e.m14395a(cVar, C6008d.C6013e.Interstitial)).mo42154a("isbiddinginstance", Boolean.valueOf(C5826e.m14396a(cVar)));
                C6049a aVar = C6049a.f14820a;
                C5825d.m14394a(C5827f.f14168i, (Map<String, Object>) a.mo42154a("custom_c", Long.valueOf(C6049a.m14921c(cVar.f14737b))).f14151a);
                C5868g.this.f14320a.mo42261a(cVar, (Map<String, String>) map, cVar2);
            }
        });
    }

    /* renamed from: a */
    public final void mo42262a(Runnable runnable) {
        this.f14324e.mo42243a(runnable);
    }

    /* renamed from: a */
    public final void mo42250a(final String str) {
        C5825d.m14394a(C5827f.f14171l, (Map<String, Object>) new C5821a().mo42154a("callfailreason", str).f14151a);
        C6032d initListener = IronSourceNetwork.getInitListener();
        if (initListener != null) {
            initListener.onFail(new C6014e(1001, str));
        }
        CountDownTimer countDownTimer = this.f14323d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        m14506i();
        f14319g.post(new Runnable() {
            public final void run() {
                C5868g.m14501a(C5868g.this, str);
            }
        });
    }

    /* renamed from: a */
    public final void mo42263a(final String str, final C6028c cVar) {
        this.f14325f.mo42243a(new Runnable() {
            public final void run() {
                C5868g.this.f14320a.mo42263a(str, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo42264a(String str, String str2, C6007c cVar, C6027b bVar) {
        final String str3 = str;
        final String str4 = str2;
        final C6007c cVar2 = cVar;
        final C6027b bVar2 = bVar;
        this.f14325f.mo42243a(new Runnable() {
            public final void run() {
                C5868g.this.f14320a.mo42264a(str3, str4, cVar2, bVar2);
            }
        });
    }

    /* renamed from: a */
    public final void mo42265a(String str, String str2, C6007c cVar, C6028c cVar2) {
        final String str3 = str;
        final String str4 = str2;
        final C6007c cVar3 = cVar;
        final C6028c cVar4 = cVar2;
        this.f14325f.mo42243a(new Runnable() {
            public final void run() {
                C5868g.this.f14320a.mo42265a(str3, str4, cVar3, cVar4);
            }
        });
    }

    /* renamed from: a */
    public final void mo42266a(String str, String str2, C6007c cVar, C6029d dVar) {
        final String str3 = str;
        final String str4 = str2;
        final C6007c cVar2 = cVar;
        final C6029d dVar2 = dVar;
        this.f14325f.mo42243a(new Runnable() {
            public final void run() {
                C5868g.this.f14320a.mo42266a(str3, str4, cVar2, dVar2);
            }
        });
    }

    /* renamed from: a */
    public final void mo42267a(final String str, final String str2, final C6033e eVar) {
        this.f14325f.mo42243a(new Runnable() {
            public final void run() {
                C5868g.this.f14320a.mo42267a(str, str2, eVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo42268a(String str, String str2, Map<String, String> map, C6033e eVar) {
        final String str3 = str;
        final String str4 = str2;
        final Map<String, String> map2 = map;
        final C6033e eVar2 = eVar;
        this.f14325f.mo42243a(new Runnable() {
            public final void run() {
                C5868g.this.f14320a.mo42268a(str3, str4, (Map<String, String>) map2, eVar2);
            }
        });
    }

    /* renamed from: a */
    public final void mo42269a(final Map<String, String> map, final C6033e eVar) {
        this.f14325f.mo42243a(new Runnable() {
            public final void run() {
                C5868g.this.f14320a.mo42269a((Map<String, String>) map, eVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo42270a(final JSONObject jSONObject) {
        this.f14325f.mo42243a(new Runnable() {
            public final void run() {
                C5868g.this.f14320a.mo42270a(jSONObject);
            }
        });
    }

    /* renamed from: a */
    public final void mo42271a(final JSONObject jSONObject, final C6028c cVar) {
        this.f14325f.mo42243a(new Runnable() {
            public final void run() {
                C5868g.this.f14320a.mo42271a(jSONObject, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo42272a(final JSONObject jSONObject, final C6029d dVar) {
        this.f14325f.mo42243a(new Runnable() {
            public final void run() {
                C5868g.this.f14320a.mo42272a(jSONObject, dVar);
            }
        });
    }

    /* renamed from: b */
    public final void mo42251b() {
        if (C6008d.C6011c.Web.equals(mo42275c())) {
            C5825d.m14393a(C5827f.f14163d);
            C6032d initListener = IronSourceNetwork.getInitListener();
            if (initListener != null) {
                initListener.onSuccess();
            }
        }
        this.f14322c = C6008d.C6010b.Ready;
        CountDownTimer countDownTimer = this.f14323d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f14325f.mo42242a();
        this.f14325f.mo42244b();
        this.f14320a.mo42281g();
    }

    /* renamed from: b */
    public final void mo42273b(Context context) {
        if (m14507j()) {
            this.f14320a.mo42273b(context);
        }
    }

    /* renamed from: b */
    public final void mo42274b(final C6007c cVar, final Map<String, String> map, final C6028c cVar2) {
        this.f14325f.mo42243a(new Runnable() {
            public final void run() {
                C5868g.this.f14320a.mo42274b(cVar, map, cVar2);
            }
        });
    }

    /* renamed from: b */
    public final void mo42252b(final String str) {
        C5825d.m14394a(C5827f.f14181v, (Map<String, Object>) new C5821a().mo42154a("generalmessage", str).f14151a);
        CountDownTimer countDownTimer = this.f14323d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        f14319g.post(new Runnable() {
            public final void run() {
                C5868g.this.m14506i();
                C5868g.m14501a(C5868g.this, str);
            }
        });
    }

    /* renamed from: c */
    public final C6008d.C6011c mo42275c() {
        return this.f14320a.mo42275c();
    }

    /* renamed from: c */
    public final boolean mo42276c(String str) {
        if (!m14507j()) {
            return false;
        }
        return this.f14320a.mo42276c(str);
    }

    /* renamed from: d */
    public final void mo42277d() {
        this.f14325f.mo42243a(new Runnable() {
            public final void run() {
                C5868g.this.f14320a.mo42277d();
            }
        });
    }

    public void destroy() {
        CountDownTimer countDownTimer = this.f14323d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f14323d = null;
        f14319g.post(new Runnable() {
            public final void run() {
                if (C5868g.this.f14320a != null) {
                    C5868g.this.f14320a.destroy();
                    C5898m unused = C5868g.this.f14320a = null;
                }
            }
        });
    }

    /* renamed from: e */
    public final void mo42279e() {
        if (m14507j()) {
            this.f14320a.mo42279e();
        }
    }

    /* renamed from: f */
    public final void mo42280f() {
        if (m14507j()) {
            this.f14320a.mo42280f();
        }
    }

    @Deprecated
    /* renamed from: g */
    public final void mo42281g() {
    }
}
