package com.p243my.target;

import android.content.Context;
import com.p243my.target.C7524l3;
import com.p243my.target.common.MyTargetPrivacy;
import com.p243my.target.mediation.MediationAdConfig;
import com.p243my.target.mediation.MediationAdapter;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.target.z0 */
public abstract class C7765z0<T extends MediationAdapter> {

    /* renamed from: a */
    public final C7298a f19728a;

    /* renamed from: b */
    public final C7524l3.C7525a f19729b;

    /* renamed from: c */
    public final C7541m2 f19730c;

    /* renamed from: d */
    public T f19731d;

    /* renamed from: e */
    public WeakReference<Context> f19732e;

    /* renamed from: f */
    public C7710v8 f19733f;

    /* renamed from: g */
    public C7765z0<T>.b f19734g;

    /* renamed from: h */
    public String f19735h;

    /* renamed from: i */
    public C7524l3 f19736i;

    /* renamed from: j */
    public float f19737j;

    /* renamed from: com.my.target.z0$a */
    public static class C7766a implements MediationAdConfig {

        /* renamed from: a */
        public final String f19738a;

        /* renamed from: b */
        public final String f19739b;

        /* renamed from: c */
        public final int f19740c;

        /* renamed from: d */
        public final int f19741d;

        /* renamed from: e */
        public final Map<String, String> f19742e;

        /* renamed from: f */
        public final MyTargetPrivacy f19743f;

        public C7766a(String str, String str2, Map<String, String> map, int i, int i2, MyTargetPrivacy myTargetPrivacy) {
            this.f19738a = str;
            this.f19739b = str2;
            this.f19742e = map;
            this.f19741d = i;
            this.f19740c = i2;
            this.f19743f = myTargetPrivacy;
        }

        /* renamed from: a */
        public static C7766a m20974a(String str, String str2, Map<String, String> map, int i, int i2, MyTargetPrivacy myTargetPrivacy) {
            return new C7766a(str, str2, map, i, i2, myTargetPrivacy);
        }

        public int getAge() {
            return this.f19741d;
        }

        public int getGender() {
            return this.f19740c;
        }

        public String getPayload() {
            return this.f19739b;
        }

        public String getPlacementId() {
            return this.f19738a;
        }

        public MyTargetPrivacy getPrivacy() {
            return this.f19743f;
        }

        public Map<String, String> getServerParams() {
            return this.f19742e;
        }

        public boolean isUserAgeRestricted() {
            return this.f19743f.userAgeRestricted;
        }

        public boolean isUserConsent() {
            Boolean bool = this.f19743f.userConsent;
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        }

        public boolean isUserConsentSpecified() {
            return this.f19743f.userConsent != null;
        }
    }

    /* renamed from: com.my.target.z0$b */
    public final class C7767b implements Runnable {

        /* renamed from: a */
        public final C7560n2 f19744a;

        public C7767b(C7560n2 n2Var) {
            this.f19744a = n2Var;
        }

        public void run() {
            C7374e0.m18989a("MediationEngine: timeout for " + this.f19744a.mo50966b() + " ad network");
            Context l = C7765z0.this.mo51914l();
            if (l != null) {
                C7765z0.this.mo51909a(this.f19744a, "networkTimeout", l);
            }
            C7765z0.this.mo51910a(this.f19744a, false);
        }
    }

    public C7765z0(C7541m2 m2Var, C7298a aVar, C7524l3.C7525a aVar2) {
        this.f19730c = m2Var;
        this.f19728a = aVar;
        this.f19729b = aVar2;
    }

    /* renamed from: a */
    public final T mo51907a(C7560n2 n2Var) {
        return "myTarget".equals(n2Var.mo50966b()) ? mo49543k() : mo51908a(n2Var.mo50960a());
    }

    /* renamed from: a */
    public final T mo51908a(String str) {
        try {
            return (MediationAdapter) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            C7374e0.m18990b("MediationEngine error: " + th.toString());
            return null;
        }
    }

    /* renamed from: a */
    public abstract void mo49536a(T t, C7560n2 n2Var, Context context);

    /* renamed from: a */
    public void mo51909a(C7560n2 n2Var, String str, Context context) {
        C7741x8.m20827c((List<C7328b3>) n2Var.mo50972h().mo49800a(str), context);
    }

    /* renamed from: a */
    public void mo51910a(C7560n2 n2Var, boolean z) {
        C7765z0<T>.b bVar = this.f19734g;
        if (bVar != null && bVar.f19744a == n2Var) {
            Context l = mo51914l();
            C7524l3 l3Var = this.f19736i;
            if (!(l3Var == null || l == null)) {
                l3Var.mo50800b();
                this.f19736i.mo50802b(l);
            }
            C7710v8 v8Var = this.f19733f;
            if (v8Var != null) {
                v8Var.mo51750b(this.f19734g);
                this.f19733f.close();
                this.f19733f = null;
            }
            this.f19734g = null;
            if (z) {
                this.f19735h = n2Var.mo50966b();
                this.f19737j = n2Var.mo50970f();
                if (l != null) {
                    mo51909a(n2Var, "networkFilled", l);
                    return;
                }
                return;
            }
            mo51915m();
        }
    }

    /* renamed from: a */
    public abstract boolean mo49539a(MediationAdapter mediationAdapter);

    /* renamed from: b */
    public void mo51911b(Context context) {
        this.f19732e = new WeakReference<>(context);
        mo51915m();
    }

    /* renamed from: c */
    public String mo51912c() {
        return this.f19735h;
    }

    /* renamed from: d */
    public float mo51913d() {
        return this.f19737j;
    }

    /* renamed from: j */
    public abstract void mo49542j();

    /* renamed from: k */
    public abstract T mo49543k();

    /* renamed from: l */
    public Context mo51914l() {
        WeakReference<Context> weakReference = this.f19732e;
        if (weakReference == null) {
            return null;
        }
        return (Context) weakReference.get();
    }

    /* renamed from: m */
    public final void mo51915m() {
        T t = this.f19731d;
        if (t != null) {
            try {
                t.destroy();
            } catch (Throwable th) {
                C7374e0.m18990b("MediationEngine error: " + th.toString());
            }
            this.f19731d = null;
        }
        Context l = mo51914l();
        if (l == null) {
            C7374e0.m18990b("MediationEngine: can't configure next ad network, context is null");
            return;
        }
        C7560n2 d = this.f19730c.mo50849d();
        if (d == null) {
            C7374e0.m18989a("MediationEngine: no ad networks available");
            mo49542j();
            return;
        }
        C7374e0.m18989a("MediationEngine: prepare adapter for " + d.mo50966b() + " ad network");
        T a = mo51907a(d);
        this.f19731d = a;
        if (a == null || !mo49539a((MediationAdapter) a)) {
            C7374e0.m18990b("MediationEngine: can't create adapter, class " + d.mo50960a() + " not found or invalid");
            mo51909a(d, "networkAdapterInvalid", l);
            mo51915m();
            return;
        }
        C7374e0.m18989a("MediationEngine: adapter created");
        this.f19736i = this.f19729b.mo50804a(d.mo50966b(), d.mo50970f());
        C7710v8 v8Var = this.f19733f;
        if (v8Var != null) {
            v8Var.close();
        }
        int i = d.mo50973i();
        if (i > 0) {
            this.f19734g = new C7767b(d);
            C7710v8 a2 = C7710v8.m20686a(i);
            this.f19733f = a2;
            a2.mo51748a((Runnable) this.f19734g);
        } else {
            this.f19734g = null;
        }
        mo51909a(d, "networkRequested", l);
        mo49536a(this.f19731d, d, l);
    }
}
