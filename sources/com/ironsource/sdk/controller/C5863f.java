package com.ironsource.sdk.controller;

import com.ironsource.sdk.p143a.C5821a;
import com.ironsource.sdk.p143a.C5825d;
import com.ironsource.sdk.p143a.C5827f;
import com.ironsource.sdk.p151h.C6020c;
import com.ironsource.sdk.p155k.C6037b;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.f */
final class C5863f {

    /* renamed from: a */
    long f14298a;

    /* renamed from: b */
    int f14299b;

    /* renamed from: c */
    int f14300c;

    /* renamed from: d */
    C5867b f14301d = C5867b.NONE;

    /* renamed from: e */
    private String f14302e;

    /* renamed from: f */
    private String f14303f;

    /* renamed from: g */
    private C6037b f14304g;

    /* renamed from: com.ironsource.sdk.controller.f$2 */
    static /* synthetic */ class C58652 {

        /* renamed from: a */
        static final /* synthetic */ int[] f14306a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|(2:1|2)|3|5|6|7|8|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
        static {
            /*
                int[] r0 = com.ironsource.sdk.controller.C5863f.C5866a.m14496a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14306a = r0
                r1 = 1
                int r2 = com.ironsource.sdk.controller.C5863f.C5866a.f14307a     // Catch:{ NoSuchFieldError -> 0x000f }
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                int[] r2 = f14306a     // Catch:{ NoSuchFieldError -> 0x0016 }
                int r3 = com.ironsource.sdk.controller.C5863f.C5866a.f14308b     // Catch:{ NoSuchFieldError -> 0x0016 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                int[] r1 = f14306a     // Catch:{ NoSuchFieldError -> 0x001d }
                int r2 = com.ironsource.sdk.controller.C5863f.C5866a.f14309c     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 3
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C5863f.C58652.<clinit>():void");
        }
    }

    /* renamed from: com.ironsource.sdk.controller.f$a */
    public enum C5866a {
        ;
        

        /* renamed from: a */
        public static final int f14307a = 1;

        /* renamed from: b */
        public static final int f14308b = 2;

        /* renamed from: c */
        public static final int f14309c = 3;

        static {
            f14310d = new int[]{1, 2, 3};
        }

        /* renamed from: a */
        public static int[] m14496a() {
            return (int[]) f14310d.clone();
        }
    }

    /* renamed from: com.ironsource.sdk.controller.f$b */
    public enum C5867b {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);
        

        /* renamed from: g */
        int f14318g;

        private C5867b(int i) {
            this.f14318g = i;
        }
    }

    C5863f(JSONObject jSONObject, String str, String str2, C6037b bVar) {
        int optInt = jSONObject.optInt("controllerSourceStrategy", -1);
        this.f14299b = optInt;
        this.f14300c = optInt != 1 ? optInt != 2 ? C5866a.f14307a : C5866a.f14309c : C5866a.f14308b;
        this.f14302e = str;
        this.f14303f = str2;
        this.f14304g = bVar;
    }

    /* renamed from: a */
    private void m14485a(C6020c cVar) {
        if (!this.f14304g.mo42580b()) {
            this.f14304g.mo42578a(cVar, this.f14303f);
        }
    }

    /* renamed from: f */
    private C6020c m14486f() {
        return new C6020c(this.f14302e, "mobileController.html");
    }

    /* renamed from: g */
    private C6020c m14487g() {
        return new C6020c(this.f14302e, "next_mobileController.html");
    }

    /* renamed from: h */
    private C6020c m14488h() {
        return new C6020c(this.f14302e, "fallback_mobileController.html");
    }

    /* renamed from: i */
    private void m14489i() {
        try {
            C6020c f = m14486f();
            if (f.exists()) {
                C6020c h = m14488h();
                if (h.exists()) {
                    h.delete();
                }
                IronSourceStorageUtils.renameFile(f.getPath(), h.getPath());
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo42253a(C5867b bVar) {
        C5821a a = new C5821a().mo42154a("generalmessage", Integer.valueOf(this.f14299b)).mo42154a("controllersource", Integer.valueOf(bVar.f14318g));
        if (this.f14298a > 0) {
            a.mo42154a("timingvalue", Long.valueOf(System.currentTimeMillis() - this.f14298a));
        }
        C5825d.m14394a(C5827f.f14179t, (Map<String, Object>) a.f14151a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo42254a() {
        return this.f14301d != C5867b.NONE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo42255b() {
        C6020c cVar;
        int i = C58652.f14306a[this.f14300c - 1];
        if (i == 1) {
            IronSourceStorageUtils.deleteFile(m14486f());
            cVar = new C6020c(this.f14302e, SDKUtils.getFileName(this.f14303f));
        } else if (i != 2) {
            if (i == 3) {
                try {
                    C6020c f = m14486f();
                    C6020c g = m14487g();
                    if (!g.exists() && !f.exists()) {
                        m14485a(new C6020c(this.f14302e, SDKUtils.getFileName(this.f14303f)));
                        return false;
                    } else if (g.exists() || !f.exists()) {
                        m14489i();
                        if (IronSourceStorageUtils.renameFile(m14487g().getPath(), m14486f().getPath())) {
                            C5867b bVar = C5867b.PREPARED_CONTROLLER_LOADED;
                            this.f14301d = bVar;
                            mo42253a(bVar);
                            mo42256c();
                            m14485a(new C6020c(this.f14302e, g.getName()));
                            return true;
                        } else if (mo42257d()) {
                            C5867b bVar2 = C5867b.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                            this.f14301d = bVar2;
                            mo42253a(bVar2);
                            m14485a(new C6020c(this.f14302e, g.getName()));
                            return true;
                        } else {
                            m14485a(new C6020c(this.f14302e, SDKUtils.getFileName(this.f14303f)));
                        }
                    } else {
                        C5867b bVar3 = C5867b.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                        this.f14301d = bVar3;
                        mo42253a(bVar3);
                        m14485a(new C6020c(this.f14302e, g.getName()));
                        return true;
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        } else {
            m14489i();
            cVar = new C6020c(this.f14302e, SDKUtils.getFileName(this.f14303f));
        }
        m14485a(cVar);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo42256c() {
        IronSourceStorageUtils.deleteFile(m14488h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo42257d() {
        try {
            if (!m14488h().exists()) {
                return false;
            }
            return IronSourceStorageUtils.renameFile(m14488h().getPath(), m14486f().getPath());
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final JSONObject mo42258e() {
        return new JSONObject() {
            {
                putOpt("controllerSourceStrategy", Integer.valueOf(C5863f.this.f14299b));
                putOpt("controllerSourceCode", Integer.valueOf(C5863f.this.f14301d.f14318g));
            }
        };
    }
}
