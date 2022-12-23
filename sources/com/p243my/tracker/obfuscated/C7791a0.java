package com.p243my.tracker.obfuscated;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.p243my.tracker.ads.AdEvent;
import com.p243my.tracker.miniapps.MiniAppEvent;
import com.p243my.tracker.obfuscated.C7828m;
import com.p243my.tracker.plugins.MyTrackerPluginConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.a0 */
public final class C7791a0 {

    /* renamed from: a */
    final AtomicBoolean f19805a = new AtomicBoolean();

    /* renamed from: b */
    final C7880v0 f19806b;

    /* renamed from: c */
    final Application f19807c;

    /* renamed from: d */
    final C7828m f19808d;

    /* renamed from: e */
    final C7788a f19809e;

    /* renamed from: f */
    final C7808e f19810f;

    /* renamed from: g */
    final C7816i f19811g;

    /* renamed from: h */
    final C7862p0 f19812h;

    /* renamed from: i */
    final C7868r0 f19813i;

    /* renamed from: j */
    C7817i0 f19814j;

    /* renamed from: com.my.tracker.obfuscated.a0$a */
    final class C7792a implements C7828m.C7829a {
        C7792a() {
        }

        /* renamed from: a */
        public void mo52188a() {
            C7791a0.this.f19809e.mo52163e();
        }

        /* renamed from: a */
        public void mo52189a(String str) {
            C7791a0.this.f19810f.mo52282b(str);
        }
    }

    C7791a0(C7880v0 v0Var, Application application) {
        this.f19806b = v0Var;
        this.f19807c = application;
        C7877u0.m21553c("MyTracker created, version: 3.0.7");
        C7828m a = C7828m.m21279a(v0Var, (C7828m.C7829a) new C7792a(), (Context) application);
        this.f19808d = a;
        C7868r0 a2 = C7868r0.m21519a(a, v0Var.mo52516a(), application);
        this.f19813i = a2;
        this.f19809e = C7788a.m21040a(a, v0Var, a2, application);
        this.f19810f = C7808e.m21169a(v0Var, (Context) application);
        this.f19811g = C7816i.m21189a(a);
        this.f19812h = C7862p0.m21485a(a, (Context) application);
    }

    /* renamed from: a */
    public static C7791a0 m21052a(String str, C7880v0 v0Var, Application application) {
        v0Var.mo52523a(str);
        return new C7791a0(v0Var, application);
    }

    /* renamed from: a */
    public String mo52172a(Intent intent) {
        return this.f19811g.mo52290a(intent);
    }

    /* renamed from: a */
    public void mo52173a() {
        if (!mo52187b()) {
            this.f19808d.mo52348a();
        }
    }

    /* renamed from: a */
    public void mo52174a(int i, Intent intent) {
        if (!mo52187b()) {
            if (!this.f19806b.mo52546m()) {
                C7877u0.m21547a("MyTracker: autotrackingPurchase is disabled, you should enable it before using onActivityResult(*) method");
            } else {
                this.f19812h.mo52478a(i, intent);
            }
        }
    }

    /* renamed from: a */
    public void mo52175a(int i, List<Object> list) {
        if (!mo52187b()) {
            if (!this.f19806b.mo52546m()) {
                C7877u0.m21547a("MyTracker: autotrackingPurchase is disabled, you should enable it before using onPurchasesUpdated(*) method");
            } else {
                this.f19812h.mo52479a(i, list);
            }
        }
    }

    /* renamed from: a */
    public void mo52176a(int i, Map<String, String> map) {
        if (!mo52187b()) {
            this.f19808d.mo52351a(i, map);
        }
    }

    /* renamed from: a */
    public void mo52177a(Activity activity) {
        if (!mo52187b()) {
            this.f19809e.mo52162d(activity);
        }
    }

    /* renamed from: a */
    public void mo52178a(AdEvent adEvent) {
        if (!mo52187b()) {
            this.f19808d.mo52354a(adEvent);
        }
    }

    /* renamed from: a */
    public void mo52179a(MiniAppEvent miniAppEvent) {
        if (!mo52187b()) {
            this.f19808d.mo52355a(miniAppEvent);
        }
    }

    /* renamed from: a */
    public void mo52180a(String str, String str2, Map<String, String> map) {
        if (!mo52187b()) {
            this.f19808d.mo52361a(str, str2, map);
        }
    }

    /* renamed from: a */
    public void mo52181a(String str, Map<String, String> map) {
        if (!mo52187b()) {
            this.f19808d.mo52362a(str, map);
        }
    }

    /* renamed from: a */
    public void mo52182a(List<MyTrackerPluginConfig> list) {
        if (!this.f19805a.compareAndSet(false, true)) {
            C7877u0.m21547a("MyTracker: tracker has already been initialized");
            return;
        }
        C7877u0.m21553c("MyTracker is initialized with id: " + this.f19806b.mo52538f());
        C7885z.m21612c(this.f19807c);
        this.f19808d.mo52374d();
        C7881w.m21599a(this.f19806b, this.f19808d, this.f19813i, (Context) this.f19807c);
        C7864q.m21496a(this.f19808d, this.f19810f, (Context) this.f19807c);
        C7878v.m21554a(this.f19808d, this.f19810f, this.f19807c);
        this.f19809e.mo52158a();
        this.f19812h.mo52477a();
        if (!list.isEmpty()) {
            C7817i0 a = C7817i0.m21191a(this.f19808d, this.f19807c);
            this.f19814j = a;
            a.mo52291a(list);
        }
    }

    /* renamed from: a */
    public void mo52183a(Map<String, String> map) {
        if (!mo52187b()) {
            this.f19808d.mo52373c(map);
        }
    }

    /* renamed from: a */
    public void mo52184a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map<String, String> map) {
        if (!mo52187b()) {
            if (this.f19806b.mo52546m()) {
                C7877u0.m21547a("MyTracker: autotrackingPurchase is enabled, you mustn't use trackPurchase(*) method");
            } else {
                this.f19812h.mo52481a(jSONObject, jSONObject2, str, map);
            }
        }
    }

    /* renamed from: b */
    public void mo52185b(String str, String str2, Map<String, String> map) {
        if (!mo52187b()) {
            this.f19808d.mo52369b(str, str2, map);
        }
    }

    /* renamed from: b */
    public void mo52186b(Map<String, String> map) {
        if (!mo52187b()) {
            this.f19808d.mo52375d(map);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo52187b() {
        boolean z = !this.f19805a.get();
        if (z) {
            C7877u0.m21551b("MyTracker error: tracker hasn't been initialized");
        }
        return z;
    }
}
