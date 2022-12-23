package com.ogury.p245ed.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.ogury.p245ed.internal.C8020aj;
import java.util.List;

/* renamed from: com.ogury.ed.internal.cf */
public final class C8097cf {

    /* renamed from: a */
    public static final C8097cf f21017a = new C8097cf();

    /* renamed from: b */
    private static final C8069bn f21018b = new C8069bn();

    /* renamed from: c */
    private static C8233fn f21019c = C8233fn.f21330a;

    private C8097cf() {
    }

    /* renamed from: a */
    public static void m22570a(Activity activity, C8095cd cdVar, C8105ck ckVar) {
        C8467mq.m23881b(activity, "activity");
        C8467mq.m23881b(cdVar, "publisherActivityFilter");
        C8467mq.m23881b(ckVar, "publisherFragmentFilter");
        Application application = activity.getApplication();
        C8467mq.m23878a((Object) application, "application");
        C8248g gVar = new C8248g(application);
        C8086bw a = new C8087bx(cdVar, ckVar, C8106cl.f21036a, f21019c).mo53252a(activity, gVar, new C8020aj.C8021a(application, gVar, C8042as.f20907a, false).mo53189p());
        if (!(a instanceof C8074br)) {
            C8250ga gaVar = C8250ga.f21371a;
            C8250ga.m23181b("Cannot log whitelisted activities when using fragment filter");
            return;
        }
        m22571a(activity, ((C8074br) a).mo53227a());
    }

    /* renamed from: a */
    private static void m22571a(Context context, C8073bq bqVar) {
        List<Activity> a = C8069bn.m22484a(context);
        C8250ga gaVar = C8250ga.f21371a;
        C8250ga.m23181b("Displaying whitelisted activities");
        boolean z = true;
        for (Activity next : a) {
            if (bqVar.mo53226b(next)) {
                z = false;
                C8250ga gaVar2 = C8250ga.f21371a;
                C8250ga.m23181b(C8467mq.m23873a("Whitelisted: ", (Object) next.getClass().getName()));
            }
        }
        if (z) {
            C8250ga gaVar3 = C8250ga.f21371a;
            C8250ga.m23181b("No activity is whitelisted");
        }
    }
}
