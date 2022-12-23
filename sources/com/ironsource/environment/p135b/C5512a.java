package com.ironsource.environment.p135b;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.ServerParameters;
import com.ironsource.environment.C5505a;
import com.ironsource.environment.C5527g;
import com.ironsource.p133c.C5499a;
import com.vungle.warren.VungleApiClient;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ironsource.environment.b.a */
public final class C5512a {

    /* renamed from: a */
    public ConcurrentHashMap<String, Object> f12712a;

    /* renamed from: b */
    AtomicBoolean f12713b;

    /* renamed from: c */
    AtomicBoolean f12714c;

    /* renamed from: com.ironsource.environment.b.a$a */
    public static class C5515a {

        /* renamed from: a */
        public static volatile C5512a f12719a = new C5512a((byte) 0);
    }

    private C5512a() {
        this.f12713b = new AtomicBoolean(false);
        this.f12714c = new AtomicBoolean(false);
        this.f12712a = new ConcurrentHashMap<>();
    }

    /* synthetic */ C5512a(byte b) {
        this();
    }

    /* renamed from: b */
    private void m13092b(final Context context) {
        if (!this.f12713b.get()) {
            try {
                this.f12713b.set(true);
                new Thread(new Runnable() {
                    public final void run() {
                        try {
                            C5512a aVar = C5512a.this;
                            Context context = context;
                            if (context != null) {
                                try {
                                    String[] a = C5527g.m13136a(context);
                                    String str = a[0];
                                    Boolean valueOf = Boolean.valueOf(a[1]);
                                    if (!TextUtils.isEmpty(str)) {
                                        aVar.mo41237a(VungleApiClient.GAID, str);
                                        aVar.mo41237a(ServerParameters.LAT_KEY, valueOf);
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        C5512a.this.f12713b.set(false);
                    }
                }).start();
            } catch (Exception e) {
                e.printStackTrace();
                this.f12713b.set(false);
            }
        }
    }

    /* renamed from: a */
    public void mo41236a(Context context) {
        if (context != null) {
            m13092b(context);
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                mo41237a(ServerParameters.LANG, language.toUpperCase());
            }
            String c = C5527g.m13140c();
            if (!TextUtils.isEmpty(c)) {
                mo41237a("tz", c);
            }
            String a = C5499a.m13042a(context);
            if (!TextUtils.isEmpty(a) && !a.equals("none")) {
                mo41237a("connt", a);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                mo41237a("vpn", Boolean.valueOf(C5499a.m13047c(context)));
            }
            String k = C5527g.m13158k(context);
            if (!TextUtils.isEmpty(k)) {
                mo41237a("icc", k);
            }
            mo41237a("vol", Float.valueOf(C5527g.m13161m(context)));
            mo41237a("dfs", String.valueOf(C5527g.m13168p()));
            mo41237a("scrnw", Integer.valueOf(C5527g.m13157k()));
            mo41237a("scrnh", Integer.valueOf(C5527g.m13159l()));
            mo41237a("ltime", String.valueOf(C5527g.m13131a()));
            mo41237a("tzoff", String.valueOf(C5527g.m13137b()));
            mo41237a("mcc", Integer.valueOf(C5505a.C55061.m13080c(context)));
            mo41237a("mnc", Integer.valueOf(C5505a.C55061.m13083d(context)));
            mo41237a("sdcrd", Boolean.valueOf(C5527g.m13143d()));
            mo41237a("chrg", Boolean.valueOf(C5527g.m13148f(context)));
            mo41237a("chrgt", Integer.valueOf(C5527g.m13149g(context)));
            mo41237a("apm", Boolean.valueOf(C5527g.m13152h(context)));
            mo41237a("owp", Boolean.valueOf(C5527g.m13154i(context)));
            mo41237a("rt", Boolean.valueOf(C5527g.m13156j()));
            mo41237a("sscl", String.valueOf(C5527g.m13165o()));
            mo41237a("bat", Integer.valueOf(C5527g.m13178w(context)));
            mo41237a("lpm", Boolean.valueOf(C5527g.m13179x(context)));
            mo41237a("apor", C5527g.m13166o(context));
            mo41237a("ua", C5527g.m13171r());
        }
    }

    /* renamed from: a */
    public void mo41237a(String str, Object obj) {
        if (str != null && obj != null) {
            try {
                if (obj instanceof Boolean) {
                    obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                }
                this.f12712a.put(str, obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
