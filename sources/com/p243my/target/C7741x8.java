package com.p243my.target;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.my.target.x8 */
public class C7741x8 {

    /* renamed from: a */
    public static final C7741x8 f19650a = new C7741x8();

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m20822a(C7328b3 b3Var, Context context) {
        mo51842a(b3Var);
        String a = mo51841a(b3Var.mo49729b(), b3Var.mo49730c());
        if (a != null) {
            C7454i3.m19328d().mo50288b(a, (String) null, context);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m20823a(String str, Context context) {
        String a = mo51840a(str);
        if (a != null) {
            C7454i3.m19328d().mo50288b(a, (String) null, context);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m20824a(List list, Context context) {
        C7454i3 d = C7454i3.m19328d();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7328b3 b3Var = (C7328b3) it.next();
            mo51842a(b3Var);
            String a = mo51841a(b3Var.mo49729b(), b3Var.mo49730c());
            if (a != null) {
                d.mo50288b(a, (String) null, context);
            }
        }
    }

    /* renamed from: c */
    public static void m20825c(C7328b3 b3Var, Context context) {
        f19650a.mo51843b(b3Var, context);
    }

    /* renamed from: c */
    public static void m20826c(String str, Context context) {
        f19650a.mo51844b(str, context);
    }

    /* renamed from: c */
    public static void m20827c(List<C7328b3> list, Context context) {
        f19650a.mo51845b(list, context);
    }

    /* renamed from: a */
    public String mo51840a(String str) {
        return mo51841a(str, true);
    }

    /* renamed from: a */
    public String mo51841a(String str, boolean z) {
        if (z) {
            str = C7784z8.m21026a(str);
        }
        if (URLUtil.isNetworkUrl(str)) {
            return str;
        }
        C7374e0.m18989a("invalid stat url: " + str);
        return null;
    }

    /* renamed from: a */
    public final void mo51842a(C7328b3 b3Var) {
        String str;
        if (b3Var instanceof C7303a3) {
            str = "tracking progress stat value:" + ((C7303a3) b3Var).mo49575e() + " url:" + b3Var.mo49729b();
        } else if (b3Var instanceof C7769z2) {
            C7769z2 z2Var = (C7769z2) b3Var;
            str = "tracking ovv stat percent:" + z2Var.f18445d + " value:" + z2Var.mo51983e() + " ovv:" + z2Var.mo51984f() + " url:" + b3Var.mo49729b();
        } else if (b3Var instanceof C7747y2) {
            C7747y2 y2Var = (C7747y2) b3Var;
            str = "tracking mrc stat percent: percent " + y2Var.f18445d + " duration:" + y2Var.f19664e + " url:" + b3Var.mo49729b();
        } else {
            str = "tracking stat type:" + b3Var.mo49727a() + " url:" + b3Var.mo49729b();
        }
        C7374e0.m18989a(str);
    }

    /* renamed from: b */
    public void mo51843b(C7328b3 b3Var, Context context) {
        if (b3Var != null) {
            C7395f0.m19088b(new Runnable(b3Var, context.getApplicationContext()) {
                public final /* synthetic */ C7328b3 f$1;
                public final /* synthetic */ Context f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C7741x8.this.m20822a(this.f$1, this.f$2);
                }
            });
        }
    }

    /* renamed from: b */
    public void mo51844b(String str, Context context) {
        if (!TextUtils.isEmpty(str)) {
            C7395f0.m19088b(new Runnable(str, context.getApplicationContext()) {
                public final /* synthetic */ String f$1;
                public final /* synthetic */ Context f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C7741x8.this.m20823a(this.f$1, this.f$2);
                }
            });
        }
    }

    /* renamed from: b */
    public void mo51845b(List<C7328b3> list, Context context) {
        if (list != null && list.size() > 0) {
            C7395f0.m19088b(new Runnable(list, context.getApplicationContext()) {
                public final /* synthetic */ List f$1;
                public final /* synthetic */ Context f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C7741x8.this.m20824a(this.f$1, this.f$2);
                }
            });
        }
    }
}
