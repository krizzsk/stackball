package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.profile.UserProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Nh */
public class C10552Nh implements C10868W0, IPluginReporter {

    /* renamed from: a */
    private final List<C10406Jh> f25252a = new ArrayList();

    /* renamed from: b */
    private volatile C10868W0 f25253b;

    /* renamed from: com.yandex.metrica.impl.ob.Nh$a */
    class C10553a implements C10406Jh {

        /* renamed from: a */
        final /* synthetic */ String f25254a;

        /* renamed from: b */
        final /* synthetic */ String f25255b;

        C10553a(C10552Nh nh, String str, String str2) {
            this.f25254a = str;
            this.f25255b = str2;
        }

        /* renamed from: a */
        public void mo61631a(C10868W0 w0) {
            w0.mo61023d(this.f25254a, this.f25255b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$b */
    class C10554b implements C10406Jh {
        C10554b(C10552Nh nh) {
        }

        /* renamed from: a */
        public void mo61631a(C10868W0 w0) {
            w0.sendEventsBuffer();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$c */
    class C10555c implements C10406Jh {

        /* renamed from: a */
        final /* synthetic */ C11624p7 f25256a;

        C10555c(C10552Nh nh, C11624p7 p7Var) {
            this.f25256a = p7Var;
        }

        /* renamed from: a */
        public void mo61631a(C10868W0 w0) {
            w0.mo61573a(this.f25256a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$d */
    class C10556d implements C10406Jh {

        /* renamed from: a */
        final /* synthetic */ String f25257a;

        C10556d(C10552Nh nh, String str) {
            this.f25257a = str;
        }

        /* renamed from: a */
        public void mo61631a(C10868W0 w0) {
            w0.reportEvent(this.f25257a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$e */
    class C10557e implements C10406Jh {

        /* renamed from: a */
        final /* synthetic */ String f25258a;

        /* renamed from: b */
        final /* synthetic */ String f25259b;

        C10557e(C10552Nh nh, String str, String str2) {
            this.f25258a = str;
            this.f25259b = str2;
        }

        /* renamed from: a */
        public void mo61631a(C10868W0 w0) {
            w0.reportEvent(this.f25258a, this.f25259b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$f */
    class C10558f implements C10406Jh {

        /* renamed from: a */
        final /* synthetic */ String f25260a;

        /* renamed from: b */
        final /* synthetic */ Map f25261b;

        C10558f(C10552Nh nh, String str, Map map) {
            this.f25260a = str;
            this.f25261b = map;
        }

        /* renamed from: a */
        public void mo61631a(C10868W0 w0) {
            w0.reportEvent(this.f25260a, (Map<String, Object>) this.f25261b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$g */
    class C10559g implements C10406Jh {

        /* renamed from: a */
        final /* synthetic */ String f25262a;

        /* renamed from: b */
        final /* synthetic */ Throwable f25263b;

        C10559g(C10552Nh nh, String str, Throwable th) {
            this.f25262a = str;
            this.f25263b = th;
        }

        /* renamed from: a */
        public void mo61631a(C10868W0 w0) {
            w0.reportError(this.f25262a, this.f25263b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$h */
    class C10560h implements C10406Jh {

        /* renamed from: a */
        final /* synthetic */ String f25264a;

        /* renamed from: b */
        final /* synthetic */ String f25265b;

        /* renamed from: c */
        final /* synthetic */ Throwable f25266c;

        C10560h(C10552Nh nh, String str, String str2, Throwable th) {
            this.f25264a = str;
            this.f25265b = str2;
            this.f25266c = th;
        }

        /* renamed from: a */
        public void mo61631a(C10868W0 w0) {
            w0.reportError(this.f25264a, this.f25265b, this.f25266c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$i */
    class C10561i implements C10406Jh {

        /* renamed from: a */
        final /* synthetic */ Throwable f25267a;

        C10561i(C10552Nh nh, Throwable th) {
            this.f25267a = th;
        }

        /* renamed from: a */
        public void mo61631a(C10868W0 w0) {
            w0.reportUnhandledException(this.f25267a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$j */
    class C10562j implements C10406Jh {
        C10562j(C10552Nh nh) {
        }

        /* renamed from: a */
        public void mo61631a(C10868W0 w0) {
            w0.resumeSession();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$k */
    class C10563k implements C10406Jh {
        C10563k(C10552Nh nh) {
        }

        /* renamed from: a */
        public void mo61631a(C10868W0 w0) {
            w0.pauseSession();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$l */
    class C10564l implements C10406Jh {

        /* renamed from: a */
        final /* synthetic */ String f25268a;

        C10564l(C10552Nh nh, String str) {
            this.f25268a = str;
        }

        /* renamed from: a */
        public void mo61631a(C10868W0 w0) {
            w0.setUserProfileID(this.f25268a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$m */
    class C10565m implements C10406Jh {

        /* renamed from: a */
        final /* synthetic */ UserProfile f25269a;

        C10565m(C10552Nh nh, UserProfile userProfile) {
            this.f25269a = userProfile;
        }

        /* renamed from: a */
        public void mo61631a(C10868W0 w0) {
            w0.reportUserProfile(this.f25269a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$n */
    class C10566n implements C10406Jh {

        /* renamed from: a */
        final /* synthetic */ C11189e7 f25270a;

        C10566n(C10552Nh nh, C11189e7 e7Var) {
            this.f25270a = e7Var;
        }

        /* renamed from: a */
        public void mo61631a(C10868W0 w0) {
            w0.mo61571a(this.f25270a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$o */
    class C10567o implements C10406Jh {

        /* renamed from: a */
        final /* synthetic */ Revenue f25271a;

        C10567o(C10552Nh nh, Revenue revenue) {
            this.f25271a = revenue;
        }

        /* renamed from: a */
        public void mo61631a(C10868W0 w0) {
            w0.reportRevenue(this.f25271a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$p */
    class C10568p implements C10406Jh {

        /* renamed from: a */
        final /* synthetic */ ECommerceEvent f25272a;

        C10568p(C10552Nh nh, ECommerceEvent eCommerceEvent) {
            this.f25272a = eCommerceEvent;
        }

        /* renamed from: a */
        public void mo61631a(C10868W0 w0) {
            w0.reportECommerce(this.f25272a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$q */
    class C10569q implements C10406Jh {

        /* renamed from: a */
        final /* synthetic */ boolean f25273a;

        C10569q(C10552Nh nh, boolean z) {
            this.f25273a = z;
        }

        /* renamed from: a */
        public void mo61631a(C10868W0 w0) {
            w0.setStatisticsSending(this.f25273a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$r */
    class C10570r implements C10406Jh {

        /* renamed from: a */
        final /* synthetic */ PluginErrorDetails f25274a;

        C10570r(C10552Nh nh, PluginErrorDetails pluginErrorDetails) {
            this.f25274a = pluginErrorDetails;
        }

        /* renamed from: a */
        public void mo61631a(C10868W0 w0) {
            w0.getPluginExtension().reportUnhandledException(this.f25274a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$s */
    class C10571s implements C10406Jh {

        /* renamed from: a */
        final /* synthetic */ PluginErrorDetails f25275a;

        /* renamed from: b */
        final /* synthetic */ String f25276b;

        C10571s(C10552Nh nh, PluginErrorDetails pluginErrorDetails, String str) {
            this.f25275a = pluginErrorDetails;
            this.f25276b = str;
        }

        /* renamed from: a */
        public void mo61631a(C10868W0 w0) {
            w0.getPluginExtension().reportError(this.f25275a, this.f25276b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$t */
    class C10572t implements C10406Jh {

        /* renamed from: a */
        final /* synthetic */ String f25277a;

        /* renamed from: b */
        final /* synthetic */ String f25278b;

        /* renamed from: c */
        final /* synthetic */ PluginErrorDetails f25279c;

        C10572t(C10552Nh nh, String str, String str2, PluginErrorDetails pluginErrorDetails) {
            this.f25277a = str;
            this.f25278b = str2;
            this.f25279c = pluginErrorDetails;
        }

        /* renamed from: a */
        public void mo61631a(C10868W0 w0) {
            w0.getPluginExtension().reportError(this.f25277a, this.f25278b, this.f25279c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$u */
    class C10573u implements C10406Jh {
        C10573u(C10552Nh nh) {
        }

        /* renamed from: a */
        public void mo61631a(C10868W0 w0) {
            w0.mo61577b();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$v */
    class C10574v implements C10406Jh {

        /* renamed from: a */
        final /* synthetic */ String f25280a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f25281b;

        C10574v(C10552Nh nh, String str, JSONObject jSONObject) {
            this.f25280a = str;
            this.f25281b = jSONObject;
        }

        /* renamed from: a */
        public void mo61631a(C10868W0 w0) {
            w0.mo61575a(this.f25280a, this.f25281b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Nh$w */
    class C10575w implements C10406Jh {

        /* renamed from: a */
        final /* synthetic */ String f25282a;

        /* renamed from: b */
        final /* synthetic */ String f25283b;

        C10575w(C10552Nh nh, String str, String str2) {
            this.f25282a = str;
            this.f25283b = str2;
        }

        /* renamed from: a */
        public void mo61631a(C10868W0 w0) {
            w0.mo61022b(this.f25282a, this.f25283b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo61819a(Context context) {
        this.f25253b = C11684qg.m30108a().mo63547a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
        for (C10406Jh a : this.f25252a) {
            a.mo61631a(this.f25253b);
        }
        this.f25252a.clear();
    }

    /* renamed from: b */
    public void mo61577b() {
        m27024a((C10406Jh) new C10573u(this));
    }

    /* renamed from: d */
    public void mo61023d(String str, String str2) {
        m27024a((C10406Jh) new C10553a(this, str, str2));
    }

    public IPluginReporter getPluginExtension() {
        return this;
    }

    public void pauseSession() {
        m27024a((C10406Jh) new C10563k(this));
    }

    public void reportECommerce(ECommerceEvent eCommerceEvent) {
        m27024a((C10406Jh) new C10568p(this, eCommerceEvent));
    }

    public void reportError(String str, Throwable th) {
        m27024a((C10406Jh) new C10559g(this, str, th));
    }

    public void reportEvent(String str) {
        m27024a((C10406Jh) new C10556d(this, str));
    }

    public void reportRevenue(Revenue revenue) {
        m27024a((C10406Jh) new C10567o(this, revenue));
    }

    public void reportUnhandledException(Throwable th) {
        m27024a((C10406Jh) new C10561i(this, th));
    }

    public void reportUserProfile(UserProfile userProfile) {
        m27024a((C10406Jh) new C10565m(this, userProfile));
    }

    public void resumeSession() {
        m27024a((C10406Jh) new C10562j(this));
    }

    public void sendEventsBuffer() {
        m27024a((C10406Jh) new C10554b(this));
    }

    public void setStatisticsSending(boolean z) {
        m27024a((C10406Jh) new C10569q(this, z));
    }

    public void setUserProfileID(String str) {
        m27024a((C10406Jh) new C10564l(this, str));
    }

    /* renamed from: b */
    public void mo61022b(String str, String str2) {
        m27024a((C10406Jh) new C10575w(this, str, str2));
    }

    public void reportError(String str, String str2) {
        m27024a((C10406Jh) new C10560h(this, str, str2, (Throwable) null));
    }

    public void reportEvent(String str, String str2) {
        m27024a((C10406Jh) new C10557e(this, str, str2));
    }

    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        m27024a((C10406Jh) new C10570r(this, pluginErrorDetails));
    }

    public void reportError(String str, String str2, Throwable th) {
        m27024a((C10406Jh) new C10560h(this, str, str2, th));
    }

    public void reportEvent(String str, Map<String, Object> map) {
        m27024a((C10406Jh) new C10558f(this, str, map));
    }

    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        m27024a((C10406Jh) new C10571s(this, pluginErrorDetails, str));
    }

    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        m27024a((C10406Jh) new C10572t(this, str, str2, pluginErrorDetails));
    }

    /* renamed from: a */
    public void mo61573a(C11624p7 p7Var) {
        m27024a((C10406Jh) new C10555c(this, p7Var));
    }

    /* renamed from: a */
    public void mo61571a(C11189e7 e7Var) {
        m27024a((C10406Jh) new C10566n(this, e7Var));
    }

    /* renamed from: a */
    public void mo61575a(String str, JSONObject jSONObject) {
        m27024a((C10406Jh) new C10574v(this, str, jSONObject));
    }

    /* renamed from: a */
    private synchronized void m27024a(C10406Jh jh) {
        if (this.f25253b == null) {
            this.f25252a.add(jh);
        } else {
            jh.mo61631a(this.f25253b);
        }
    }
}
