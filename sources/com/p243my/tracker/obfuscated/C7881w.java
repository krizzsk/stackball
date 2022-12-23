package com.p243my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.p243my.tracker.obfuscated.C7820j0;

/* renamed from: com.my.tracker.obfuscated.w */
public final class C7881w {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m21598a(Context context, C7880v0 v0Var, C7828m mVar, C7868r0 r0Var) {
        String str;
        char c;
        String str2;
        PackageInfo a = C7814h.m21185a(context);
        String str3 = "";
        if (a != null) {
            str3 = Build.VERSION.SDK_INT >= 28 ? Long.toString(a.getLongVersionCode()) : Integer.toString(a.versionCode);
            str = a.versionName;
        } else {
            str = str3;
        }
        C7823k0 a2 = C7823k0.m21211a(context);
        String a3 = a2.mo52300a();
        String f = v0Var.mo52538f();
        if (!f.equals(a2.mo52308b())) {
            C7877u0.m21547a("InstallHandler: tracking install");
            long b = a != null ? C7875t0.m21542b(a.firstInstallTime) : 0;
            C7820j0 a4 = C7820j0.m21203a(mVar, v0Var, context);
            C7820j0.C7821a a5 = a4.mo52295a();
            mVar.mo52353a(b, C7814h.m21186b(context), a5);
            if (a5 == null) {
                a4.mo52299c();
            }
            a2.mo52316e(f);
            c = 1;
        } else if (!str3.equals(a3)) {
            if (a3.isEmpty()) {
                str2 = "InstallHandler: tracking update";
            } else {
                str2 = "InstallHandler: tracking update from" + a3 + " to " + str3;
            }
            C7877u0.m21547a(str2);
            mVar.mo52360a(a2.mo52313d(), a3, str, str3, C7814h.m21186b(context));
            c = 2;
        } else {
            c = 0;
        }
        if (c == 0) {
            C7877u0.m21547a("InstallHandler: no install/update");
            r0Var.mo52498a(a2.mo52321h());
            return;
        }
        long a6 = C7875t0.m21540a();
        if (c == 1) {
            a2.mo52302a(a6);
            r0Var.mo52498a(a6);
        } else if (c == 2) {
            r0Var.mo52498a(a2.mo52321h());
        }
        a2.mo52314d(str3);
        a2.mo52320g(str);
        a2.mo52309b(a6);
    }

    /* renamed from: a */
    public static void m21599a(C7880v0 v0Var, C7828m mVar, C7868r0 r0Var, Context context) {
        C7806d.m21130a(new Runnable(context, v0Var, mVar, r0Var) {
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ C7880v0 f$1;
            public final /* synthetic */ C7828m f$2;
            public final /* synthetic */ C7868r0 f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C7881w.m21598a(this.f$0, this.f$1, this.f$2, this.f$3);
            }
        });
    }
}
