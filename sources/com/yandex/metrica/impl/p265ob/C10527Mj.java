package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Mj */
class C10527Mj implements C10868W0 {

    /* renamed from: a */
    private final C10467Lj f25223a = new C10467Lj();

    C10527Mj() {
    }

    /* renamed from: a */
    public void mo61571a(C11189e7 e7Var) {
    }

    /* renamed from: a */
    public void mo61573a(C11624p7 p7Var) {
    }

    /* renamed from: a */
    public void mo61575a(String str, JSONObject jSONObject) {
    }

    /* renamed from: b */
    public void mo61577b() {
    }

    /* renamed from: b */
    public void mo61022b(String str, String str2) {
    }

    /* renamed from: d */
    public void mo61023d(String str, String str2) {
    }

    public IPluginReporter getPluginExtension() {
        return this.f25223a;
    }

    public void pauseSession() {
    }

    public void reportECommerce(ECommerceEvent eCommerceEvent) {
    }

    public void reportError(String str, String str2) {
    }

    public void reportError(String str, String str2, Throwable th) {
    }

    public void reportError(String str, Throwable th) {
    }

    public void reportEvent(String str) {
    }

    public void reportEvent(String str, String str2) {
    }

    public void reportEvent(String str, Map<String, Object> map) {
    }

    public void reportRevenue(Revenue revenue) {
    }

    public void reportUnhandledException(Throwable th) {
    }

    public void reportUserProfile(UserProfile userProfile) {
    }

    public void resumeSession() {
    }

    public void sendEventsBuffer() {
    }

    public void setStatisticsSending(boolean z) {
    }

    public void setUserProfileID(String str) {
    }
}
