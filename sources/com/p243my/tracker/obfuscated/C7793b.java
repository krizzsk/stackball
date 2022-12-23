package com.p243my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.my.tracker.obfuscated.b */
public final class C7793b {

    /* renamed from: a */
    boolean f19816a = false;

    /* renamed from: b */
    final AtomicReference<String> f19817b = new AtomicReference<>();

    /* renamed from: c */
    final AtomicReference<Integer> f19818c = new AtomicReference<>(-1);

    /* renamed from: com.my.tracker.obfuscated.b$a */
    public static final class C7794a {

        /* renamed from: a */
        public static final boolean f19819a = true;
    }

    C7793b() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21071a(C7823k0 k0Var, AppSetIdInfo appSetIdInfo) {
        int scope = appSetIdInfo.getScope();
        if (scope != this.f19818c.getAndSet(Integer.valueOf(scope)).intValue()) {
            k0Var.mo52301a(scope);
        }
        String id = appSetIdInfo.getId();
        if (!id.equals(this.f19817b.getAndSet(id))) {
            k0Var.mo52318f(id);
            C7877u0.m21547a("AppSetIdProvider: new id value has been received: " + id);
        }
        synchronized (this.f19817b) {
            this.f19817b.notify();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52190a() {
        try {
            String str = this.f19817b.get();
            if (!TextUtils.isEmpty(str)) {
                C7877u0.m21547a("AppSetIdProvider: app set id has been collected, value: " + str);
                return;
            }
            synchronized (this.f19817b) {
                this.f19817b.wait(300);
            }
            C7877u0.m21547a("AppSetIdProvider: timeout for collecting id has exceeded");
        } catch (Throwable th) {
            C7877u0.m21548a("AppSetIdProvider: attempt to block thread retrieving app set id finished unsuccessfully", th);
        }
    }

    /* renamed from: a */
    public void mo52191a(Context context) {
        if (!this.f19816a) {
            mo52193b(context);
            this.f19816a = true;
        }
    }

    /* renamed from: a */
    public void mo52192a(C7831m0 m0Var, Context context) {
        StringBuilder sb;
        String str;
        if (TextUtils.isEmpty(this.f19817b.get()) || this.f19818c.get().intValue() == -1) {
            sb = new StringBuilder();
            sb.append("AppSetIdProvider: App Set ID ");
            sb.append(this.f19817b.get());
            sb.append(" and Scope ");
            sb.append(this.f19818c.get());
            str = " were not sent due to its values";
        } else {
            m0Var.mo52386a(this.f19817b.get(), this.f19818c.get().intValue());
            sb = new StringBuilder();
            sb.append("AppSetIdProvider: App Set ID ");
            sb.append(this.f19817b.get());
            sb.append(" and Scope ");
            sb.append(this.f19818c.get());
            str = " set to proto builder successfully";
        }
        sb.append(str);
        C7877u0.m21547a(sb.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo52193b(Context context) {
        C7823k0 a = C7823k0.m21211a(context);
        this.f19817b.set(a.mo52310c());
        if (!C7794a.f19819a) {
            C7877u0.m21547a("AppSetIdProvider: app set library is not available");
            return;
        }
        try {
            AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(C7806d.f19853c, new OnSuccessListener(a) {
                public final /* synthetic */ C7823k0 f$1;

                {
                    this.f$1 = r2;
                }

                public final void onSuccess(Object obj) {
                    C7793b.this.m21071a(this.f$1, (AppSetIdInfo) obj);
                }
            });
        } catch (Throwable th) {
            C7877u0.m21548a("AppSetIdProvider: error occurred while trying to access app set id info", th);
        }
        mo52190a();
    }

    /* renamed from: c */
    public void mo52194c(Context context) {
    }
}
