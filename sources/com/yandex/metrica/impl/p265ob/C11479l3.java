package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.location.Location;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.C10086i;
import com.yandex.metrica.C12043l;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.yandex.metrica.impl.ob.l3 */
public class C11479l3 implements C10942Y0 {

    /* renamed from: f */
    private static volatile C11479l3 f27633f = null;

    /* renamed from: g */
    private static volatile boolean f27634g = false;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f27635a;

    /* renamed from: b */
    private final C11415k3 f27636b;

    /* renamed from: c */
    private final FutureTask<C11126d1> f27637c;

    /* renamed from: d */
    private final C11098c1 f27638d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C11696qn f27639e;

    /* renamed from: com.yandex.metrica.impl.ob.l3$a */
    class C11480a implements Callable<C11126d1> {
        C11480a() {
        }

        public Object call() throws Exception {
            return C11479l3.m29683a(C11479l3.this);
        }
    }

    private C11479l3(Context context, C11415k3 k3Var, C11696qn qnVar) {
        this(context, k3Var, k3Var.mo63179a(context, qnVar), qnVar);
    }

    /* renamed from: a */
    public static C11479l3 m29684a(Context context) {
        if (f27633f == null) {
            synchronized (C11479l3.class) {
                if (f27633f == null) {
                    f27633f = new C11479l3(context.getApplicationContext(), new C11415k3(), C10941Y.m28234g().mo62500d());
                    C11479l3 l3Var = f27633f;
                    l3Var.f27639e.mo63561b().execute(new C11515m3(l3Var));
                }
            }
        }
        return f27633f;
    }

    /* renamed from: f */
    private static C11899w1 m29693f() {
        if (m29696i()) {
            return f27633f.m29694g();
        }
        return C10941Y.m28234g().mo62502f();
    }

    /* renamed from: g */
    private C11126d1 m29694g() {
        try {
            return this.f27637c.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: h */
    public static synchronized boolean m29695h() {
        boolean z;
        synchronized (C11479l3.class) {
            z = f27634g;
        }
        return z;
    }

    /* renamed from: i */
    public static synchronized boolean m29696i() {
        boolean z;
        synchronized (C11479l3.class) {
            z = (f27633f == null || !f27633f.f27637c.isDone() || f27633f.m29694g().mo61938d() == null) ? false : true;
        }
        return z;
    }

    /* renamed from: j */
    public static synchronized void m29697j() {
        synchronized (C11479l3.class) {
            f27634g = true;
        }
    }

    /* renamed from: k */
    public static C11479l3 m29698k() {
        return f27633f;
    }

    /* renamed from: d */
    public C11773t1 mo63266d() {
        return m29694g().mo61938d();
    }

    /* renamed from: e */
    public C11489lc mo63267e() {
        return this.f27638d.mo61868d();
    }

    /* renamed from: b */
    public static void m29690b(boolean z) {
        m29693f().mo61678a(z);
    }

    /* renamed from: c */
    public static void m29692c(boolean z) {
        m29693f().setStatisticsSending(z);
    }

    C11479l3(Context context, C11415k3 k3Var, C11098c1 c1Var, C11696qn qnVar) {
        this.f27635a = context;
        this.f27636b = k3Var;
        this.f27638d = c1Var;
        this.f27639e = qnVar;
        FutureTask<C11126d1> futureTask = new FutureTask<>(new C11480a());
        this.f27637c = futureTask;
        qnVar.mo63561b().execute(futureTask);
    }

    /* renamed from: b */
    public void mo63263b(C12043l lVar) {
        this.f27638d.mo61864a(lVar, this);
    }

    /* renamed from: c */
    public void mo63265c(C10086i iVar) {
        m29694g().mo61937c(iVar);
    }

    /* renamed from: b */
    public void mo63262b(YandexMetricaConfig yandexMetricaConfig, C12043l lVar) {
        m29694g().mo61935a(yandexMetricaConfig, lVar);
    }

    /* renamed from: c */
    public String mo63264c() {
        return m29694g().mo61936c();
    }

    /* renamed from: b */
    public void mo63261b(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        m29694g().mo61931a(appMetricaDeviceIDListener);
    }

    /* renamed from: b */
    public C10906X0 mo61836b() {
        return m29694g().mo61836b();
    }

    /* renamed from: a */
    public static void m29685a(Location location) {
        m29693f().mo61671a(location);
    }

    /* renamed from: a */
    public static void m29688a(boolean z) {
        m29693f().mo61681b(z);
    }

    /* renamed from: a */
    public static void m29687a(String str, String str2) {
        m29693f().mo61682c(str, str2);
    }

    /* renamed from: a */
    public static void m29686a(String str) {
        m29693f().setUserProfileID(str);
    }

    /* renamed from: a */
    public void mo63258a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        m29694g().mo61933a(deferredDeeplinkParametersListener);
    }

    /* renamed from: a */
    public void mo63257a(DeferredDeeplinkListener deferredDeeplinkListener) {
        m29694g().mo61932a(deferredDeeplinkListener);
    }

    /* renamed from: a */
    public C10868W0 mo63255a(C10086i iVar) {
        return m29694g().mo61929a(iVar);
    }

    /* renamed from: a */
    public String mo63256a() {
        return m29694g().mo61930a();
    }

    /* renamed from: a */
    public void mo63259a(IIdentifierCallback iIdentifierCallback, List<String> list) {
        m29694g().mo61934a(iIdentifierCallback, list);
    }

    /* renamed from: a */
    public void mo63260a(Map<String, Object> map) {
        this.f27638d.mo61865a(map);
    }

    /* renamed from: a */
    static C11126d1 m29683a(C11479l3 l3Var) {
        return l3Var.f27636b.mo63180a(l3Var.f27635a, l3Var.f27638d);
    }
}
