package com.yandex.metrica.impl.p265ob;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import com.yandex.metrica.MetricaService;

/* renamed from: com.yandex.metrica.impl.ob.z1 */
public class C12000z1 implements C11968y1 {

    /* renamed from: a */
    private C11769sn f28826a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C11968y1 f28827b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C11575o1 f28828c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f28829d;

    /* renamed from: com.yandex.metrica.impl.ob.z1$a */
    class C12001a extends C10439Km {

        /* renamed from: a */
        final /* synthetic */ Bundle f28830a;

        C12001a(Bundle bundle) {
            this.f28830a = bundle;
        }

        /* renamed from: a */
        public void mo61690a() throws Exception {
            C12000z1.this.f28827b.mo61088b(this.f28830a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$b */
    class C12002b extends C10439Km {

        /* renamed from: a */
        final /* synthetic */ Bundle f28832a;

        C12002b(Bundle bundle) {
            this.f28832a = bundle;
        }

        /* renamed from: a */
        public void mo61690a() throws Exception {
            C12000z1.this.f28827b.mo61082a(this.f28832a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$c */
    class C12003c extends C10439Km {

        /* renamed from: a */
        final /* synthetic */ Configuration f28834a;

        C12003c(Configuration configuration) {
            this.f28834a = configuration;
        }

        /* renamed from: a */
        public void mo61690a() throws Exception {
            C12000z1.this.f28827b.onConfigurationChanged(this.f28834a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$d */
    class C12004d extends C10439Km {
        C12004d() {
        }

        /* renamed from: a */
        public void mo61690a() {
            synchronized (C12000z1.this) {
                if (C12000z1.this.f28829d) {
                    C12000z1.this.f28828c.mo63395e();
                    C12000z1.this.f28827b.mo61077a();
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$e */
    class C12005e extends C10439Km {

        /* renamed from: a */
        final /* synthetic */ Intent f28837a;

        /* renamed from: b */
        final /* synthetic */ int f28838b;

        C12005e(Intent intent, int i) {
            this.f28837a = intent;
            this.f28838b = i;
        }

        /* renamed from: a */
        public void mo61690a() {
            C12000z1.this.f28827b.mo61080a(this.f28837a, this.f28838b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$f */
    class C12006f extends C10439Km {

        /* renamed from: a */
        final /* synthetic */ Intent f28840a;

        /* renamed from: b */
        final /* synthetic */ int f28841b;

        /* renamed from: c */
        final /* synthetic */ int f28842c;

        C12006f(Intent intent, int i, int i2) {
            this.f28840a = intent;
            this.f28841b = i;
            this.f28842c = i2;
        }

        /* renamed from: a */
        public void mo61690a() {
            C12000z1.this.f28827b.mo61081a(this.f28840a, this.f28841b, this.f28842c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$g */
    class C12007g extends C10439Km {

        /* renamed from: a */
        final /* synthetic */ Intent f28844a;

        C12007g(Intent intent) {
            this.f28844a = intent;
        }

        /* renamed from: a */
        public void mo61690a() {
            C12000z1.this.f28827b.mo61079a(this.f28844a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$h */
    class C12008h extends C10439Km {

        /* renamed from: a */
        final /* synthetic */ Intent f28846a;

        C12008h(Intent intent) {
            this.f28846a = intent;
        }

        /* renamed from: a */
        public void mo61690a() {
            C12000z1.this.f28827b.mo61089c(this.f28846a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$i */
    class C12009i extends C10439Km {

        /* renamed from: a */
        final /* synthetic */ Intent f28848a;

        C12009i(Intent intent) {
            this.f28848a = intent;
        }

        /* renamed from: a */
        public void mo61690a() {
            C12000z1.this.f28827b.mo61087b(this.f28848a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$j */
    class C12010j extends C10439Km {

        /* renamed from: a */
        final /* synthetic */ String f28850a;

        /* renamed from: b */
        final /* synthetic */ int f28851b;

        /* renamed from: c */
        final /* synthetic */ String f28852c;

        /* renamed from: d */
        final /* synthetic */ Bundle f28853d;

        C12010j(String str, int i, String str2, Bundle bundle) {
            this.f28850a = str;
            this.f28851b = i;
            this.f28852c = str2;
            this.f28853d = bundle;
        }

        /* renamed from: a */
        public void mo61690a() throws RemoteException {
            C12000z1.this.f28827b.mo61085a(this.f28850a, this.f28851b, this.f28852c, this.f28853d);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$k */
    class C12011k extends C10439Km {

        /* renamed from: a */
        final /* synthetic */ Bundle f28855a;

        C12011k(Bundle bundle) {
            this.f28855a = bundle;
        }

        /* renamed from: a */
        public void mo61690a() throws Exception {
            C12000z1.this.f28827b.reportData(this.f28855a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$l */
    class C12012l extends C10439Km {

        /* renamed from: a */
        final /* synthetic */ int f28857a;

        /* renamed from: b */
        final /* synthetic */ Bundle f28858b;

        C12012l(int i, Bundle bundle) {
            this.f28857a = i;
            this.f28858b = bundle;
        }

        /* renamed from: a */
        public void mo61690a() throws Exception {
            C12000z1.this.f28827b.mo61078a(this.f28857a, this.f28858b);
        }
    }

    public C12000z1(C11968y1 y1Var) {
        this(C10619P0.m27164i().mo61891s().mo64210d(), y1Var, C10619P0.m27164i().mo61882j());
    }

    public void onConfigurationChanged(Configuration configuration) {
        ((C11725rn) this.f28826a).execute(new C12003c(configuration));
    }

    public void reportData(Bundle bundle) {
        ((C11725rn) this.f28826a).execute(new C12011k(bundle));
    }

    /* renamed from: a */
    public synchronized void mo61077a() {
        this.f28829d = true;
        ((C11725rn) this.f28826a).execute(new C12004d());
    }

    /* renamed from: b */
    public void mo61087b(Intent intent) {
        ((C11725rn) this.f28826a).execute(new C12009i(intent));
    }

    /* renamed from: c */
    public void mo61089c(Intent intent) {
        ((C11725rn) this.f28826a).execute(new C12008h(intent));
    }

    /* renamed from: b */
    public void mo61086b() {
        ((C11725rn) this.f28826a).mo63617d();
        synchronized (this) {
            this.f28828c.mo63396f();
            this.f28829d = false;
        }
        this.f28827b.mo61086b();
    }

    /* renamed from: a */
    public void mo61080a(Intent intent, int i) {
        ((C11725rn) this.f28826a).execute(new C12005e(intent, i));
    }

    C12000z1(C11769sn snVar, C11968y1 y1Var, C11575o1 o1Var) {
        this.f28829d = false;
        this.f28826a = snVar;
        this.f28827b = y1Var;
        this.f28828c = o1Var;
    }

    /* renamed from: a */
    public void mo61081a(Intent intent, int i, int i2) {
        ((C11725rn) this.f28826a).execute(new C12006f(intent, i, i2));
    }

    /* renamed from: a */
    public void mo61079a(Intent intent) {
        ((C11725rn) this.f28826a).execute(new C12007g(intent));
    }

    /* renamed from: a */
    public void mo61085a(String str, int i, String str2, Bundle bundle) {
        ((C11725rn) this.f28826a).execute(new C12010j(str, i, str2, bundle));
    }

    /* renamed from: a */
    public void mo61078a(int i, Bundle bundle) {
        ((C11725rn) this.f28826a).execute(new C12012l(i, bundle));
    }

    /* renamed from: a */
    public void mo61082a(Bundle bundle) {
        ((C11725rn) this.f28826a).execute(new C12002b(bundle));
    }

    /* renamed from: a */
    public void mo61083a(MetricaService.C10026e eVar) {
        this.f28827b.mo61083a(eVar);
    }

    /* renamed from: b */
    public void mo61088b(Bundle bundle) {
        ((C11725rn) this.f28826a).execute(new C12001a(bundle));
    }
}
