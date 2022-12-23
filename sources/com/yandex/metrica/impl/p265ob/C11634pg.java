package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.C10086i;
import com.yandex.metrica.C12041j;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.pg */
public class C11634pg implements C10868W0 {

    /* renamed from: a */
    private final C11791tg f27921a;

    /* renamed from: b */
    private final C10138Bg f27922b;

    /* renamed from: c */
    private final C11769sn f27923c;

    /* renamed from: d */
    private final Context f27924d;

    /* renamed from: e */
    private final C11949xg f27925e;

    /* renamed from: f */
    private final C10086i f27926f;

    /* renamed from: g */
    private final C12041j f27927g;

    /* renamed from: h */
    private final C11601og f27928h;

    /* renamed from: com.yandex.metrica.impl.ob.pg$a */
    class C11635a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f27929a;

        /* renamed from: b */
        final /* synthetic */ String f27930b;

        C11635a(String str, String str2) {
            this.f27929a = str;
            this.f27930b = str2;
        }

        public void run() {
            C11634pg.this.mo63488a().mo61022b(this.f27929a, this.f27930b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$b */
    class C11636b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f27932a;

        /* renamed from: b */
        final /* synthetic */ String f27933b;

        C11636b(String str, String str2) {
            this.f27932a = str;
            this.f27933b = str2;
        }

        public void run() {
            C11634pg.this.mo63488a().mo61023d(this.f27932a, this.f27933b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$c */
    class C11637c implements C10971Ym<C10868W0> {

        /* renamed from: a */
        final /* synthetic */ C11791tg f27935a;

        /* renamed from: b */
        final /* synthetic */ Context f27936b;

        /* renamed from: c */
        final /* synthetic */ C10086i f27937c;

        C11637c(C11791tg tgVar, Context context, C10086i iVar) {
            this.f27935a = tgVar;
            this.f27936b = context;
            this.f27937c = iVar;
        }

        /* renamed from: a */
        public Object mo62554a() {
            C11791tg tgVar = this.f27935a;
            Context context = this.f27936b;
            C10086i iVar = this.f27937c;
            tgVar.getClass();
            return C11479l3.m29684a(context).mo63255a(iVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$d */
    class C11638d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f27938a;

        C11638d(String str) {
            this.f27938a = str;
        }

        public void run() {
            C11634pg.this.mo63488a().reportEvent(this.f27938a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$e */
    class C11639e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f27940a;

        /* renamed from: b */
        final /* synthetic */ String f27941b;

        C11639e(String str, String str2) {
            this.f27940a = str;
            this.f27941b = str2;
        }

        public void run() {
            C11634pg.this.mo63488a().reportEvent(this.f27940a, this.f27941b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$f */
    class C11640f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f27943a;

        /* renamed from: b */
        final /* synthetic */ List f27944b;

        C11640f(String str, List list) {
            this.f27943a = str;
            this.f27944b = list;
        }

        public void run() {
            C11634pg.this.mo63488a().reportEvent(this.f27943a, (Map<String, Object>) C10796U2.m27884a(this.f27944b));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$g */
    class C11641g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f27946a;

        /* renamed from: b */
        final /* synthetic */ Throwable f27947b;

        C11641g(String str, Throwable th) {
            this.f27946a = str;
            this.f27947b = th;
        }

        public void run() {
            C11634pg.this.mo63488a().reportError(this.f27946a, this.f27947b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$h */
    class C11642h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f27949a;

        /* renamed from: b */
        final /* synthetic */ String f27950b;

        /* renamed from: c */
        final /* synthetic */ Throwable f27951c;

        C11642h(String str, String str2, Throwable th) {
            this.f27949a = str;
            this.f27950b = str2;
            this.f27951c = th;
        }

        public void run() {
            C11634pg.this.mo63488a().reportError(this.f27949a, this.f27950b, this.f27951c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$i */
    class C11643i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Throwable f27953a;

        C11643i(Throwable th) {
            this.f27953a = th;
        }

        public void run() {
            C11634pg.this.mo63488a().reportUnhandledException(this.f27953a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$j */
    class C11644j implements Runnable {
        C11644j() {
        }

        public void run() {
            C11634pg.this.mo63488a().resumeSession();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$k */
    class C11645k implements Runnable {
        C11645k() {
        }

        public void run() {
            C11634pg.this.mo63488a().pauseSession();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$l */
    class C11646l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f27957a;

        C11646l(String str) {
            this.f27957a = str;
        }

        public void run() {
            C11634pg.this.mo63488a().setUserProfileID(this.f27957a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$m */
    class C11647m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11624p7 f27959a;

        C11647m(C11624p7 p7Var) {
            this.f27959a = p7Var;
        }

        public void run() {
            C11634pg.this.mo63488a().mo61573a(this.f27959a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$n */
    class C11648n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UserProfile f27961a;

        C11648n(UserProfile userProfile) {
            this.f27961a = userProfile;
        }

        public void run() {
            C11634pg.this.mo63488a().reportUserProfile(this.f27961a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$o */
    class C11649o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Revenue f27963a;

        C11649o(Revenue revenue) {
            this.f27963a = revenue;
        }

        public void run() {
            C11634pg.this.mo63488a().reportRevenue(this.f27963a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$p */
    class C11650p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ECommerceEvent f27965a;

        C11650p(ECommerceEvent eCommerceEvent) {
            this.f27965a = eCommerceEvent;
        }

        public void run() {
            C11634pg.this.mo63488a().reportECommerce(this.f27965a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$q */
    class C11651q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f27967a;

        C11651q(boolean z) {
            this.f27967a = z;
        }

        public void run() {
            C11634pg.this.mo63488a().setStatisticsSending(this.f27967a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$r */
    class C11652r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10086i f27969a;

        C11652r(C10086i iVar) {
            this.f27969a = iVar;
        }

        public void run() {
            C11634pg.m30043a(C11634pg.this, this.f27969a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$s */
    class C11653s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10086i f27971a;

        C11653s(C10086i iVar) {
            this.f27971a = iVar;
        }

        public void run() {
            C11634pg.m30043a(C11634pg.this, this.f27971a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$t */
    class C11654t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11189e7 f27973a;

        C11654t(C11189e7 e7Var) {
            this.f27973a = e7Var;
        }

        public void run() {
            C11634pg.this.mo63488a().mo61571a(this.f27973a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$u */
    class C11655u implements Runnable {
        C11655u() {
        }

        public void run() {
            C11634pg.this.mo63488a().mo61577b();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$v */
    class C11656v implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f27976a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f27977b;

        C11656v(String str, JSONObject jSONObject) {
            this.f27976a = str;
            this.f27977b = jSONObject;
        }

        public void run() {
            C11634pg.this.mo63488a().mo61575a(this.f27976a, this.f27977b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pg$w */
    class C11657w implements Runnable {
        C11657w() {
        }

        public void run() {
            C11634pg.this.mo63488a().sendEventsBuffer();
        }
    }

    public C11634pg(C11769sn snVar, Context context, String str) {
        this(snVar, context.getApplicationContext(), str, new C11791tg());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C10868W0 mo63488a() {
        C11791tg tgVar = this.f27921a;
        Context context = this.f27924d;
        C10086i iVar = this.f27926f;
        tgVar.getClass();
        return C11479l3.m29684a(context).mo63255a(iVar);
    }

    /* renamed from: b */
    public void mo61577b() {
        this.f27927g.getClass();
        ((C11725rn) this.f27923c).execute(new C11655u());
    }

    /* renamed from: d */
    public void mo63490d(String str) {
        C10086i a = new C10086i.C10087a(str).mo61031a();
        this.f27927g.getClass();
        ((C11725rn) this.f27923c).execute(new C11652r(a));
    }

    public IPluginReporter getPluginExtension() {
        return this.f27928h;
    }

    public void pauseSession() {
        this.f27922b.getClass();
        this.f27927g.getClass();
        ((C11725rn) this.f27923c).execute(new C11645k());
    }

    public void reportECommerce(ECommerceEvent eCommerceEvent) {
        this.f27922b.reportECommerce(eCommerceEvent);
        this.f27927g.getClass();
        ((C11725rn) this.f27923c).execute(new C11650p(eCommerceEvent));
    }

    public void reportError(String str, Throwable th) {
        this.f27922b.reportError(str, th);
        this.f27927g.getClass();
        if (th == null) {
            th = new C10742S6();
            th.fillInStackTrace();
        }
        ((C11725rn) this.f27923c).execute(new C11641g(str, th));
    }

    public void reportEvent(String str) {
        this.f27922b.reportEvent(str);
        this.f27927g.getClass();
        ((C11725rn) this.f27923c).execute(new C11638d(str));
    }

    public void reportRevenue(Revenue revenue) {
        this.f27922b.reportRevenue(revenue);
        this.f27927g.getClass();
        ((C11725rn) this.f27923c).execute(new C11649o(revenue));
    }

    public void reportUnhandledException(Throwable th) {
        this.f27922b.reportUnhandledException(th);
        this.f27927g.getClass();
        ((C11725rn) this.f27923c).execute(new C11643i(th));
    }

    public void reportUserProfile(UserProfile userProfile) {
        this.f27922b.reportUserProfile(userProfile);
        this.f27927g.getClass();
        ((C11725rn) this.f27923c).execute(new C11648n(userProfile));
    }

    public void resumeSession() {
        this.f27922b.getClass();
        this.f27927g.getClass();
        ((C11725rn) this.f27923c).execute(new C11644j());
    }

    public void sendEventsBuffer() {
        this.f27922b.getClass();
        this.f27927g.getClass();
        ((C11725rn) this.f27923c).execute(new C11657w());
    }

    public void setStatisticsSending(boolean z) {
        this.f27922b.getClass();
        this.f27927g.getClass();
        ((C11725rn) this.f27923c).execute(new C11651q(z));
    }

    public void setUserProfileID(String str) {
        this.f27922b.getClass();
        this.f27927g.getClass();
        ((C11725rn) this.f27923c).execute(new C11646l(str));
    }

    private C11634pg(C11769sn snVar, Context context, String str, C11791tg tgVar) {
        this(snVar, context, new C10138Bg(), tgVar, new C11949xg(), new C12041j(tgVar, new C10908X2()), C10086i.m25951a(str).mo61031a());
    }

    /* renamed from: b */
    public void mo61022b(String str, String str2) {
        this.f27922b.getClass();
        this.f27927g.getClass();
        ((C11725rn) this.f27923c).execute(new C11635a(str, str2));
    }

    public void reportEvent(String str, String str2) {
        this.f27922b.reportEvent(str, str2);
        this.f27927g.getClass();
        ((C11725rn) this.f27923c).execute(new C11639e(str, str2));
    }

    /* renamed from: d */
    public void mo61023d(String str, String str2) {
        this.f27922b.mo61023d(str, str2);
        this.f27927g.getClass();
        ((C11725rn) this.f27923c).execute(new C11636b(str, str2));
    }

    public void reportEvent(String str, Map<String, Object> map) {
        this.f27922b.reportEvent(str, map);
        this.f27927g.getClass();
        List<Map.Entry<String, Object>> a = C10796U2.m27882a(map);
        ((C11725rn) this.f27923c).execute(new C11640f(str, a));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C11634pg(com.yandex.metrica.impl.p265ob.C11769sn r10, android.content.Context r11, com.yandex.metrica.impl.p265ob.C10138Bg r12, com.yandex.metrica.impl.p265ob.C11791tg r13, com.yandex.metrica.impl.p265ob.C11949xg r14, com.yandex.metrica.C12041j r15, com.yandex.metrica.C10086i r16) {
        /*
            r9 = this;
            com.yandex.metrica.impl.ob.og r8 = new com.yandex.metrica.impl.ob.og
            com.yandex.metrica.impl.ob.zg r0 = r12.mo61062a()
            com.yandex.metrica.impl.ob.pg$c r1 = new com.yandex.metrica.impl.ob.pg$c
            r2 = r11
            r4 = r13
            r7 = r16
            r1.<init>(r13, r11, r7)
            r3 = r10
            r6 = r15
            r8.<init>(r0, r15, r10, r1)
            r0 = r9
            r1 = r10
            r3 = r12
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11634pg.<init>(com.yandex.metrica.impl.ob.sn, android.content.Context, com.yandex.metrica.impl.ob.Bg, com.yandex.metrica.impl.ob.tg, com.yandex.metrica.impl.ob.xg, com.yandex.metrica.j, com.yandex.metrica.i):void");
    }

    C11634pg(C11769sn snVar, Context context, C10138Bg bg, C11791tg tgVar, C11949xg xgVar, C12041j jVar, C10086i iVar, C11601og ogVar) {
        this.f27923c = snVar;
        this.f27924d = context;
        this.f27922b = bg;
        this.f27921a = tgVar;
        this.f27925e = xgVar;
        this.f27927g = jVar;
        this.f27926f = iVar;
        this.f27928h = ogVar;
    }

    /* renamed from: a */
    public void mo61573a(C11624p7 p7Var) {
        this.f27927g.getClass();
        ((C11725rn) this.f27923c).execute(new C11647m(p7Var));
    }

    /* renamed from: a */
    public void mo61571a(C11189e7 e7Var) {
        this.f27927g.getClass();
        ((C11725rn) this.f27923c).execute(new C11654t(e7Var));
    }

    /* renamed from: a */
    public void mo61575a(String str, JSONObject jSONObject) {
        this.f27927g.getClass();
        ((C11725rn) this.f27923c).execute(new C11656v(str, jSONObject));
    }

    /* renamed from: a */
    public void mo63489a(C10086i iVar) {
        C10086i a = this.f27925e.mo64078a(iVar);
        this.f27927g.getClass();
        ((C11725rn) this.f27923c).execute(new C11653s(a));
    }

    /* renamed from: a */
    static void m30043a(C11634pg pgVar, C10086i iVar) {
        C11791tg tgVar = pgVar.f27921a;
        Context context = pgVar.f27924d;
        tgVar.getClass();
        C11479l3.m29684a(context).mo63265c(iVar);
    }

    public void reportError(String str, String str2) {
        reportError(str, str2, (Throwable) null);
    }

    public void reportError(String str, String str2, Throwable th) {
        this.f27922b.reportError(str, str2, th);
        ((C11725rn) this.f27923c).execute(new C11642h(str, str2, th));
    }
}
