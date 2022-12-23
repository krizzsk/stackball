package com.yandex.metrica.impl.p265ob;

import android.app.NotificationManager;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.profile.UserProfile;
import com.yandex.metrica.profile.UserProfileUpdate;
import com.yandex.metrica.rtm.wrapper.C12053d;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.J */
public abstract class C10382J implements C10736S0 {

    /* renamed from: n */
    private static final Collection<Integer> f24929n = new HashSet(Arrays.asList(new Integer[]{14, 15}));

    /* renamed from: o */
    private static final C11829uo<C11042ag> f24930o = new C10383a();

    /* renamed from: a */
    protected final Context f24931a;

    /* renamed from: b */
    protected final C11414k2 f24932b;

    /* renamed from: c */
    protected final C10380Im f24933c;

    /* renamed from: d */
    protected final C11959xm f24934d;

    /* renamed from: e */
    protected final C10246F7 f24935e;

    /* renamed from: f */
    protected final C10100A7 f24936f;

    /* renamed from: g */
    protected final C11809u7 f24937g;

    /* renamed from: h */
    private final C11739s7 f24938h;

    /* renamed from: i */
    protected final C11544n2 f24939i;

    /* renamed from: j */
    private C11477l1 f24940j;

    /* renamed from: k */
    private final C10348Hm f24941k;

    /* renamed from: l */
    private final C10415K0 f24942l;

    /* renamed from: m */
    private final C11027a7 f24943m;

    /* renamed from: com.yandex.metrica.impl.ob.J$a */
    class C10383a implements C11829uo<C11042ag> {
        C10383a() {
        }

        /* renamed from: a */
        public C11770so mo61590a(Object obj) {
            if (C10796U2.m27894a((T[]) ((C11042ag) obj).f26522b)) {
                return C11770so.m30372a(this, "attributes list is empty");
            }
            return C11770so.m30371a(this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.J$b */
    static final class C10384b {

        /* renamed from: a */
        private static final C11829uo<Revenue> f24944a = new C11996yo();

        /* renamed from: a */
        public static C11829uo<Revenue> m26633a() {
            return f24944a;
        }
    }

    C10382J(Context context, C11544n2 n2Var, C11414k2 k2Var, C10415K0 k0, C10348Hm hm, C12053d dVar, C11915wh whVar, C10246F7 f7, C10100A7 a7, C11809u7 u7Var, C11739s7 s7Var, C11027a7 a7Var) {
        this.f24931a = context.getApplicationContext();
        this.f24939i = n2Var;
        this.f24932b = k2Var;
        this.f24942l = k0;
        this.f24935e = f7;
        this.f24936f = a7;
        this.f24937g = u7Var;
        this.f24938h = s7Var;
        this.f24943m = a7Var;
        C10380Im b = C12038zm.m31087b(k2Var.mo62272b().mo60794a());
        this.f24933c = b;
        k2Var.mo63172a(new C10473Ln(b, "Crash Environment"));
        C11959xm a = C12038zm.m31086a(k2Var.mo62272b().mo60794a());
        this.f24934d = a;
        if (C11327i.m29171a(k2Var.mo62272b().mo60817p())) {
            b.mo64229e();
            a.mo64229e();
        }
        this.f24941k = hm;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo61572a(C11477l1 l1Var) {
        this.f24940j = l1Var;
    }

    /* renamed from: b */
    public void mo61022b(String str, String str2) {
        C10380Im im = this.f24933c;
        List<Integer> list = C10385J0.f24953i;
        this.f24939i.mo63341a((C11411k0) new C10734S(str2, str, C11413k1.EVENT_TYPE_STATBOX.mo63170b(), 0, im), this.f24932b);
        if (this.f24933c.mo64227c()) {
            StringBuilder sb = new StringBuilder("Statbox event received ");
            sb.append(" with name: ");
            sb.append(mo61585f(str));
            sb.append(" with value: ");
            String f = mo61585f(str2);
            if (f.length() > 100) {
                sb.append(f.substring(0, 100));
                sb.append("...");
            } else {
                sb.append(f);
            }
            this.f24933c.mo64223b(sb.toString());
        }
    }

    /* renamed from: c */
    public void mo61581c(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f24932b.f27371c.mo61414a(str, str2);
        } else if (this.f24933c.mo64227c()) {
            this.f24933c.mo64226c("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
        }
    }

    /* renamed from: d */
    public void mo61023d(String str, String str2) {
        List<Integer> list = C10385J0.f24953i;
        this.f24939i.mo63341a(new C11411k0(str2, str, C11413k1.EVENT_TYPE_DIAGNOSTIC.mo63170b(), new C10580Nm()), this.f24932b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo61583e(String str) {
        this.f24939i.mo63361e();
        this.f24940j.mo63252b();
        C11544n2 n2Var = this.f24939i;
        C10380Im im = this.f24933c;
        List<Integer> list = C10385J0.f24953i;
        n2Var.mo63341a((C11411k0) new C10734S("", str, C11413k1.EVENT_TYPE_START.mo63170b(), im), this.f24932b);
        this.f24932b.mo63178h();
    }

    /* renamed from: f */
    public void mo61586f() {
        this.f24939i.mo63354b(this.f24932b);
    }

    public IPluginReporter getPluginExtension() {
        return this;
    }

    public void pauseSession() {
        if (this.f24933c.mo64227c()) {
            this.f24933c.mo64223b("Pause session");
        }
        mo61582d((String) null);
    }

    public void reportECommerce(ECommerceEvent eCommerceEvent) {
        if (this.f24933c.mo64227c()) {
            C10380Im im = this.f24933c;
            im.mo64223b("E-commerce event received: " + eCommerceEvent.getPublicDescription());
        }
        this.f24939i.mo63337a((C10250Fb) eCommerceEvent, this.f24932b);
    }

    public void reportError(String str, Throwable th) {
        C11372j7 j7Var = new C11372j7(str, m26611a(th));
        C11544n2 n2Var = this.f24939i;
        byte[] a = C11169e.m28804a((C11169e) this.f24936f.mo61050b(j7Var));
        C10380Im im = this.f24933c;
        List<Integer> list = C10385J0.f24953i;
        n2Var.mo63341a((C11411k0) new C10734S(a, str, C11413k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF.mo63170b(), im), this.f24932b);
        if (this.f24933c.mo64227c()) {
            this.f24933c.mo64220a("Error received: %s", mo61585f(str));
        }
    }

    public void reportEvent(String str) {
        if (this.f24933c.mo64227c() && this.f24933c.mo64227c()) {
            this.f24933c.mo64223b("Event received: " + mo61585f(str));
        }
        C10380Im im = this.f24933c;
        List<Integer> list = C10385J0.f24953i;
        this.f24939i.mo63341a((C11411k0) new C10734S("", str, C11413k1.EVENT_TYPE_REGULAR.mo63170b(), 0, im), this.f24932b);
    }

    public void reportRevenue(Revenue revenue) {
        C11770so a = C10384b.m26633a().mo61590a(revenue);
        if (a.mo63695b()) {
            this.f24939i.mo63343a(new C11670q2(revenue, this.f24933c), this.f24932b);
            if (this.f24933c.mo64227c()) {
                StringBuilder sb = new StringBuilder("Revenue received ");
                sb.append("for productID: ");
                sb.append(mo61585f(revenue.productID));
                sb.append(" of quantity: ");
                Integer num = revenue.quantity;
                if (num != null) {
                    sb.append(num);
                } else {
                    sb.append("<null>");
                }
                sb.append(" with price");
                if (revenue.priceMicros != null) {
                    sb.append(" (in micros): ");
                    sb.append(revenue.priceMicros);
                } else {
                    sb.append(": ");
                    sb.append(revenue.price);
                }
                sb.append(" ");
                sb.append(revenue.currency);
                this.f24933c.mo64223b(sb.toString());
            }
        } else if (this.f24933c.mo64227c()) {
            C10380Im im = this.f24933c;
            im.mo64225c("Passed revenue is not valid. Reason: " + a.mo63694a());
        }
    }

    public void reportUnhandledException(Throwable th) {
        C11624p7 a = C11675q7.m30082a(th, new C11189e7((C11520m7) null, (List<C11520m7>) null, ((C10197Dm) this.f24941k).mo61204b()), (List<StackTraceElement>) null, this.f24942l.mo61640a(), this.f24942l.mo61641b());
        this.f24939i.mo63355b(a, this.f24932b);
        mo61578b(a);
    }

    public void reportUserProfile(UserProfile userProfile) {
        C10313Gf gf = new C10313Gf();
        for (UserProfileUpdate<? extends C10339Hf> userProfileUpdatePatcher : userProfile.getUserProfileUpdates()) {
            C11985yf yfVar = (C11985yf) userProfileUpdatePatcher.getUserProfileUpdatePatcher();
            yfVar.mo64149a(this.f24933c);
            yfVar.mo61115a(gf);
        }
        C11042ag c = gf.mo61396c();
        C11770so a = f24930o.mo61590a(c);
        if (a.mo63695b()) {
            this.f24939i.mo63340a(c, this.f24932b);
            if (this.f24933c.mo64227c()) {
                this.f24933c.mo64223b(new StringBuilder("User profile received").toString());
            }
        } else if (this.f24933c.mo64227c()) {
            C10380Im im = this.f24933c;
            im.mo64225c("UserInfo wasn't sent because " + a.mo63694a());
        }
    }

    public void resumeSession() {
        mo61583e((String) null);
        if (this.f24933c.mo64227c()) {
            this.f24933c.mo64223b("Resume session");
        }
    }

    public void sendEventsBuffer() {
        C11544n2 n2Var = this.f24939i;
        C11413k1 k1Var = C11413k1.EVENT_TYPE_PURGE_BUFFER;
        C10380Im im = this.f24933c;
        List<Integer> list = C10385J0.f24953i;
        n2Var.mo63341a((C11411k0) new C10734S("", "", k1Var.mo63170b(), 0, im), this.f24932b);
    }

    public void setStatisticsSending(boolean z) {
        this.f24932b.mo62272b().mo60802c(z);
    }

    public void setUserProfileID(String str) {
        this.f24939i.mo63357b(str, this.f24932b);
        if (this.f24933c.mo64227c()) {
            this.f24933c.mo64223b("Set user profile ID: " + mo61585f(str));
        }
    }

    /* renamed from: a */
    public void mo61576a(Map<String, String> map) {
        if (!C10796U2.m27897b((Map) map)) {
            for (Map.Entry next : map.entrySet()) {
                mo61581c((String) next.getKey(), (String) next.getValue());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo61585f(String str) {
        if (str == null) {
            return "<null>";
        }
        return str.isEmpty() ? "<empty>" : str;
    }

    /* renamed from: a */
    public void mo61570a(int i, String str, String str2, Map<String, String> map) {
        HashMap hashMap;
        boolean z = true;
        if (f24929n.contains(Integer.valueOf(i)) || i < 1 || i > 99) {
            z = false;
        }
        if (!z) {
            if (map == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(map);
            }
            C10380Im im = this.f24933c;
            List<Integer> list = C10385J0.f24953i;
            this.f24939i.mo63341a(new C10734S(str2, str, C11413k1.EVENT_TYPE_CUSTOM_EVENT.mo63170b(), i, im).mo63148c(C11993ym.m30997g(hashMap)), this.f24932b);
        }
    }

    /* renamed from: c */
    public void mo61580c(String str) {
        this.f24939i.mo63347a(str, this.f24932b);
        if (this.f24933c.mo64227c()) {
            this.f24933c.mo64223b("Error received: native");
        }
    }

    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        String b;
        C11624p7 a = this.f24943m.mo62637a(pluginErrorDetails);
        C11544n2 n2Var = this.f24939i;
        C11555n7 n7Var = a.f27898a;
        String str = "";
        if (!(n7Var == null || (b = n7Var.mo63366b()) == null)) {
            str = b;
        }
        byte[] a2 = C11169e.m28804a((C11169e) this.f24935e.mo61050b(a));
        C10380Im im = this.f24933c;
        List<Integer> list = C10385J0.f24953i;
        n2Var.mo63341a((C11411k0) new C10734S(a2, str, C11413k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.mo63170b(), im), this.f24932b);
        if (this.f24933c.mo64227c()) {
            this.f24933c.mo64220a("Crash from plugin received: %s", mo61585f(pluginErrorDetails.getMessage()));
        }
    }

    public void reportEvent(String str, String str2) {
        if (this.f24933c.mo64227c()) {
            m26612e(str, str2);
        }
        C10380Im im = this.f24933c;
        List<Integer> list = C10385J0.f24953i;
        this.f24939i.mo63341a((C11411k0) new C10734S(str2, str, C11413k1.EVENT_TYPE_REGULAR.mo63170b(), 0, im), this.f24932b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo61582d(String str) {
        if (!this.f24932b.mo62678f()) {
            this.f24939i.mo63360d();
            this.f24940j.mo63251a();
            this.f24932b.mo63177g();
            C11544n2 n2Var = this.f24939i;
            C10380Im im = this.f24933c;
            List<Integer> list = C10385J0.f24953i;
            n2Var.mo63341a((C11411k0) new C10734S("", str, C11413k1.EVENT_TYPE_UPDATE_FOREGROUND_TIME.mo63170b(), 0, im), this.f24932b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo61578b(C11624p7 p7Var) {
        if (this.f24933c.mo64227c()) {
            this.f24933c.mo64223b("Unhandled exception received: " + p7Var.toString());
        }
    }

    /* renamed from: b */
    public void mo61577b() {
        Integer num;
        C11544n2 n2Var = this.f24939i;
        Context context = this.f24931a;
        C11411k0 k0Var = new C11411k0();
        k0Var.f27298a = "";
        C10619P0 i = C10619P0.m27164i();
        Intrinsics.checkNotNullExpressionValue(i, "GlobalServiceLocator.getInstance()");
        C10474M d = i.mo61877d();
        Intrinsics.checkNotNullExpressionValue(d, "GlobalServiceLocator.get…nce().batteryInfoProvider");
        Integer a = d.mo61750a();
        long elapsedRealtime = SystemClock.elapsedRealtime() / 1000;
        if (C10796U2.m27890a(23)) {
            try {
                Object systemService = context.getSystemService("notification");
                if (systemService != null) {
                    num = Integer.valueOf(((NotificationManager) systemService).getCurrentInterruptionFilter());
                    JSONObject put = new JSONObject().put("dfid", new JSONObject().putOpt("battery", a).put("boot_time_seconds", elapsedRealtime).putOpt("notification_filter", num));
                    Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n           …tionFilter)\n            )");
                    k0Var.f27302e = C11413k1.EVENT_TYPE_IDENTITY_LIGHT.mo63170b();
                    k0Var.f27299b = put.toString();
                    n2Var.mo63341a(k0Var, this.f24932b);
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            } catch (Throwable unused) {
            }
        }
        num = null;
        JSONObject put2 = new JSONObject().put("dfid", new JSONObject().putOpt("battery", a).put("boot_time_seconds", elapsedRealtime).putOpt("notification_filter", num));
        Intrinsics.checkNotNullExpressionValue(put2, "JSONObject()\n           …tionFilter)\n            )");
        k0Var.f27302e = C11413k1.EVENT_TYPE_IDENTITY_LIGHT.mo63170b();
        k0Var.f27299b = put2.toString();
        n2Var.mo63341a(k0Var, this.f24932b);
    }

    /* renamed from: b */
    public void mo61579b(String str) {
        this.f24939i.mo63341a(C11411k0.m29413a(str), this.f24932b);
    }

    public void reportError(String str, String str2) {
        reportError(str, str2, (Throwable) null);
    }

    public void reportError(String str, String str2, Throwable th) {
        this.f24939i.mo63341a(C10385J0.m26638a(str2, C11169e.m28804a((C11169e) this.f24937g.mo61050b(new C11307h7(new C11372j7(str2, m26611a(th)), str))), this.f24933c), this.f24932b);
        if (this.f24933c.mo64227c()) {
            this.f24933c.mo64220a("Error received: id: %s, message: %s", mo61585f(str), mo61585f(str2));
        }
    }

    /* renamed from: e */
    private void m26612e(String str, String str2) {
        if (this.f24933c.mo64227c()) {
            this.f24933c.mo64223b("Event received: " + mo61585f(str) + ". With value: " + mo61585f(str2));
        }
    }

    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        C11027a7 a7Var = this.f24943m;
        a7Var.getClass();
        this.f24939i.mo63341a(C10385J0.m26638a(str, C11169e.m28804a((C11169e) this.f24936f.mo61050b(new C11372j7(str, pluginErrorDetails != null ? a7Var.mo62637a(pluginErrorDetails) : null))), this.f24933c), this.f24932b);
        if (this.f24933c.mo64227c()) {
            this.f24933c.mo64220a("Error from plugin received: %s", mo61585f(str));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo61584e() {
        boolean z = !this.f24932b.mo62678f();
        if (z) {
            C10380Im im = this.f24933c;
            List<Integer> list = C10385J0.f24953i;
            this.f24939i.mo63341a((C11411k0) new C10734S("", "", C11413k1.EVENT_TYPE_UPDATE_FOREGROUND_TIME.mo63170b(), 0, im), this.f24932b);
        }
        return z;
    }

    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        C11027a7 a7Var = this.f24943m;
        a7Var.getClass();
        this.f24939i.mo63341a(C10385J0.m26638a(str2, C11169e.m28804a((C11169e) this.f24937g.mo61050b(new C11307h7(new C11372j7(str2, pluginErrorDetails != null ? a7Var.mo62637a(pluginErrorDetails) : null), str))), this.f24933c), this.f24932b);
        if (this.f24933c.mo64227c()) {
            this.f24933c.mo64220a("Error with identifier: %s from plugin received: %s", str, mo61585f(str2));
        }
    }

    /* renamed from: a */
    private C11624p7 m26611a(Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        Throwable th2;
        List list = null;
        if (th == null) {
            stackTraceElementArr = null;
            th2 = null;
        } else if (th instanceof C10742S6) {
            stackTraceElementArr = th.getStackTrace();
            th2 = null;
        } else {
            th2 = th;
            stackTraceElementArr = null;
        }
        C11189e7 e7Var = new C11189e7((C11520m7) null, (List<C11520m7>) null, ((C10197Dm) this.f24941k).mo61204b());
        if (stackTraceElementArr != null) {
            list = Arrays.asList(stackTraceElementArr);
        }
        return C11675q7.m30082a(th2, e7Var, list, this.f24942l.mo61640a(), this.f24942l.mo61641b());
    }

    /* renamed from: a */
    public void mo61573a(C11624p7 p7Var) {
        this.f24939i.mo63342a(p7Var, this.f24932b);
        mo61578b(p7Var);
    }

    /* renamed from: a */
    public void mo61571a(C11189e7 e7Var) {
        C11233f7 f7Var = new C11233f7(e7Var, this.f24942l.mo61640a(), this.f24942l.mo61641b());
        C11544n2 n2Var = this.f24939i;
        byte[] a = C11169e.m28804a((C11169e) this.f24938h.mo61050b(f7Var));
        C10380Im im = this.f24933c;
        List<Integer> list = C10385J0.f24953i;
        n2Var.mo63341a((C11411k0) new C10734S(a, "", C11413k1.EVENT_TYPE_ANR.mo63170b(), im), this.f24932b);
    }

    public void reportEvent(String str, Map<String, Object> map) {
        String str2 = null;
        HashMap hashMap = C10796U2.m27897b((Map) map) ? null : new HashMap(map);
        C11544n2 n2Var = this.f24939i;
        C10380Im im = this.f24933c;
        List<Integer> list = C10385J0.f24953i;
        n2Var.mo63335a((C11411k0) new C10734S("", str, C11413k1.EVENT_TYPE_REGULAR.mo63170b(), 0, im), this.f24932b, (Map<String, Object>) hashMap);
        if (this.f24933c.mo64227c()) {
            if (hashMap != null) {
                str2 = hashMap.toString();
            }
            m26612e(str, str2);
        }
    }

    /* renamed from: a */
    public void mo61575a(String str, JSONObject jSONObject) {
        C11544n2 n2Var = this.f24939i;
        C11411k0 k0Var = new C11411k0();
        k0Var.f27298a = str;
        k0Var.f27302e = C11413k1.EVENT_TYPE_APPMETRICA_DIAGNOSTICS.mo63170b();
        k0Var.f27299b = jSONObject.toString();
        n2Var.mo63341a(k0Var, this.f24932b);
    }

    /* renamed from: a */
    public void mo61574a(String str, String str2) {
        m26612e(str, str2);
        C10380Im im = this.f24933c;
        List<Integer> list = C10385J0.f24953i;
        this.f24939i.mo63341a(new C10734S(str2, str, C11413k1.EVENT_TYPE_REGULAR.mo63170b(), 0, im).mo63139a(C10351I0.JS), this.f24932b);
    }
}
