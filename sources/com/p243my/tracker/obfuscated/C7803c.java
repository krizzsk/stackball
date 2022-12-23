package com.p243my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.my.tracker.obfuscated.c */
public final class C7803c {

    /* renamed from: a */
    private List<C7804a> f19845a = Collections.EMPTY_LIST;

    /* renamed from: b */
    private List<PackageInfo> f19846b;

    /* renamed from: c */
    private String f19847c;

    /* renamed from: d */
    private boolean f19848d = false;

    /* renamed from: com.my.tracker.obfuscated.c$a */
    public static final class C7804a {

        /* renamed from: a */
        public final String f19849a;

        /* renamed from: b */
        public final long f19850b;

        C7804a(String str, long j) {
            this.f19849a = str;
            this.f19850b = j;
        }
    }

    C7803c() {
    }

    /* renamed from: a */
    private static String m21124a(List<C7804a> list) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (C7804a next : list) {
            if (z) {
                sb.append(",");
            } else {
                z = true;
            }
            sb.append(next.f19849a);
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static List<C7804a> m21125b(List<PackageInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (PackageInfo next : list) {
            ApplicationInfo applicationInfo = next.applicationInfo;
            if ((applicationInfo.flags & 1) == 0) {
                arrayList.add(new C7804a(applicationInfo.packageName, C7875t0.m21542b(next.firstInstallTime)));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo52244a(Context context) {
        String str;
        this.f19848d = false;
        List<PackageInfo> list = this.f19846b;
        if (list != null && !list.isEmpty()) {
            List<C7804a> b = m21125b(this.f19846b);
            this.f19845a = b;
            String a = m21124a(b);
            if (!TextUtils.isEmpty(a)) {
                String e = C7823k0.m21211a(context).mo52315e();
                String a2 = C7822k.m21210a(a);
                this.f19847c = a2;
                if (e.equals(a2)) {
                    str = "Apps hash did not changed";
                } else {
                    this.f19848d = true;
                    str = "Apps hash changed";
                }
                C7877u0.m21547a(str);
            }
        }
    }

    /* renamed from: a */
    public void mo52245a(C7831m0 m0Var, Context context) {
        if (this.f19848d && !this.f19845a.isEmpty()) {
            m0Var.mo52393a(this.f19845a);
        }
    }

    /* renamed from: b */
    public void mo52246b(Context context) {
        if (this.f19848d) {
            C7823k0.m21211a(context).mo52322h(this.f19847c);
            this.f19848d = false;
        }
    }

    /* renamed from: c */
    public void mo52247c(List<PackageInfo> list) {
        this.f19846b = list;
    }
}
