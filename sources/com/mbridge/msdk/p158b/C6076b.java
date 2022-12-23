package com.mbridge.msdk.p158b;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.p162a.p163a.C6121a;
import com.mbridge.msdk.foundation.tools.C6368w;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mbridge.msdk.b.b */
/* compiled from: SettingManager */
public class C6076b {

    /* renamed from: a */
    public static final String f14944a = C6076b.class.getSimpleName();

    /* renamed from: b */
    private static C6076b f14945b = null;

    /* renamed from: c */
    private static HashMap<String, C6086d> f14946c = new HashMap<>();

    /* renamed from: d */
    private static C6072a f14947d = null;

    private C6076b() {
    }

    /* renamed from: a */
    public static synchronized C6076b m15089a() {
        C6076b bVar;
        synchronized (C6076b.class) {
            if (f14945b == null) {
                f14945b = new C6076b();
            }
            bVar = f14945b;
        }
        return bVar;
    }

    /* renamed from: a */
    public final boolean mo42745a(String str) {
        C6072a b = mo42749b(str);
        if (b == null) {
            return true;
        }
        return b.mo42736y() + (b.mo42735x() * 1000) <= System.currentTimeMillis();
    }

    /* renamed from: a */
    public final boolean mo42746a(String str, int i, String str2) {
        try {
            Context d = C6122a.m15302b().mo42895d();
            String str3 = str + "_" + i + "_" + str2;
            long currentTimeMillis = System.currentTimeMillis();
            long j = 0;
            long longValue = ((Long) C6368w.m16234b(d, str3, 0L)).longValue();
            C6072a b = mo42749b(str);
            if (b == null) {
                b = m15089a().mo42748b();
            } else {
                j = longValue;
            }
            if (j + (b.mo42728r() * 1000) > currentTimeMillis) {
                return false;
            }
            C6368w.m16233a(d, str3, Long.valueOf(currentTimeMillis));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo42747a(String str, String str2) {
        C6072a b = mo42749b(str2);
        if (mo42745a(str2) && mo42746a(str2, 1, str)) {
            new C6083c().mo42766a(C6122a.m15302b().mo42895d(), str2, C6122a.m15302b().mo42897f());
        }
        C6086d e = mo42755e(str2, str);
        if (!(b == null || e == null)) {
            if (e.mo42796v() + (b.mo42730t() * 1000) > System.currentTimeMillis()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void mo42750b(String str, String str2) {
        C6121a.m15293a().mo42880a(str, str2);
        C6072a b = C6072a.m15000b(str2);
        f14947d = b;
        if (b != null) {
            b.mo42663H();
        }
    }

    /* renamed from: b */
    public final C6072a mo42749b(String str) {
        if (f14947d == null) {
            try {
                C6072a b = C6072a.m15000b(C6121a.m15293a().mo42882b(str));
                f14947d = b;
                if (b != null) {
                    b.mo42663H();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return f14947d;
    }

    /* renamed from: c */
    public final String mo42752c(String str) {
        if (str == null) {
            return "";
        }
        try {
            String b = C6121a.m15293a().mo42882b(str);
            return b == null ? "" : b;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return "";
        }
    }

    /* renamed from: a */
    public static void m15090a(Context context, String str) {
        try {
            Map<String, ?> all = context.getSharedPreferences("mbridge", 0).getAll();
            for (String next : all.keySet()) {
                if (next.startsWith(str + "_")) {
                    f14946c.put(next, C6086d.m15132b((String) all.get(next)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public final C6086d mo42751c(String str, String str2) {
        C6086d e = mo42755e(str, str2);
        return e == null ? C6086d.m15138m() : e;
    }

    /* renamed from: e */
    public final C6086d mo42755e(String str, String str2) {
        C6086d g = m15091g(str, str2);
        if (g != null && g.mo42784j() == 0) {
            g.mo42776c(1);
        }
        return g;
    }

    /* renamed from: g */
    private C6086d m15091g(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = C6122a.m15302b().mo42896e();
        }
        String str3 = str + "_" + str2;
        C6086d dVar = null;
        if (f14946c.containsKey(str3)) {
            return f14946c.get(str3);
        }
        try {
            dVar = C6086d.m15132b(C6121a.m15293a().mo42882b(str3));
            f14946c.put(str3, dVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dVar;
    }

    /* renamed from: f */
    public final C6086d mo42757f(String str, String str2) {
        return m15091g(str, str2);
    }

    /* renamed from: a */
    public final void mo42744a(String str, String str2, String str3) {
        String str4 = str + "_" + str2;
        C6121a.m15293a().mo42880a(str4, str3);
        f14946c.put(str4, C6086d.m15132b(str3));
    }

    /* renamed from: d */
    public final String mo42754d(String str) {
        C6121a a = C6121a.m15293a();
        return a.mo42882b("ivreward_" + str);
    }

    /* renamed from: e */
    public final void mo42756e(String str) {
        C6121a a = C6121a.m15293a();
        a.mo42883c("ivreward_" + str);
    }

    /* renamed from: b */
    public final C6072a mo42748b() {
        C6072a aVar = new C6072a();
        aVar.mo42719l(1);
        aVar.mo42697c(true);
        aVar.mo42695c(3600);
        aVar.mo42701d(0);
        aVar.mo42693b(false);
        aVar.mo42686a(false);
        aVar.mo42684a(7200);
        aVar.mo42685a("mbridge");
        aVar.mo42715j(1);
        aVar.mo42692b(1800);
        aVar.mo42717k(259200);
        aVar.mo42705e(10);
        aVar.mo42704e(1);
        aVar.mo42700d(1);
        aVar.mo42707f(1);
        aVar.mo42709g(0);
        aVar.mo42711h(1);
        aVar.mo42713i(-1);
        aVar.mo42691b(0);
        aVar.mo42696c("https://cdn-adn-https.rayjump.com/cdn-adn/v2/portal/19/08/20/11/06/5d5b63cb457e2.js");
        aVar.mo42683a(120);
        aVar.mo42702d(false);
        aVar.mo42721m(0);
        aVar.mo42723n(120);
        aVar.mo42725o(1);
        return aVar;
    }

    /* renamed from: d */
    public final C6086d mo42753d(String str, String str2) {
        C6086d g = m15091g(str, str2);
        return g == null ? C6086d.m15138m() : g;
    }
}
