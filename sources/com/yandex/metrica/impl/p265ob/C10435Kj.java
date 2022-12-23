package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import android.location.Location;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.impl.p265ob.C11962y;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Kj */
public class C10435Kj extends C10527Mj implements C10794U0 {
    /* renamed from: a */
    public void mo61570a(int i, String str, String str2, Map<String, String> map) {
    }

    /* renamed from: a */
    public void mo61670a(Activity activity) {
    }

    /* renamed from: a */
    public void mo61671a(Location location) {
    }

    /* renamed from: a */
    public void mo61672a(C10615Ol ol, boolean z) {
        ol.onError("Device user is in locked state");
    }

    /* renamed from: a */
    public void mo61673a(C10908X2 x2) {
    }

    /* renamed from: a */
    public void mo61571a(C11189e7 e7Var) {
    }

    /* renamed from: a */
    public void mo61573a(C11624p7 p7Var) {
    }

    /* renamed from: a */
    public void mo61674a(C11962y.C11965c cVar) {
    }

    /* renamed from: a */
    public void mo61675a(String str) {
    }

    /* renamed from: a */
    public void mo61574a(String str, String str2) {
    }

    /* renamed from: a */
    public void mo61575a(String str, JSONObject jSONObject) {
    }

    /* renamed from: a */
    public void mo61676a(String str, boolean z) {
    }

    /* renamed from: a */
    public void mo61677a(JSONObject jSONObject) {
    }

    /* renamed from: a */
    public void mo61678a(boolean z) {
    }

    /* renamed from: b */
    public void mo61577b() {
    }

    /* renamed from: b */
    public void mo61679b(Activity activity) {
    }

    /* renamed from: b */
    public void mo61579b(String str) {
    }

    /* renamed from: b */
    public void mo61022b(String str, String str2) {
    }

    /* renamed from: b */
    public void mo61680b(JSONObject jSONObject) {
    }

    /* renamed from: b */
    public void mo61681b(boolean z) {
    }

    /* renamed from: c */
    public void mo61580c(String str) {
    }

    /* renamed from: c */
    public void mo61682c(String str, String str2) {
    }

    /* renamed from: d */
    public void mo61023d(String str, String str2) {
    }

    public void pauseSession() {
    }

    public void reportECommerce(ECommerceEvent eCommerceEvent) {
    }

    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
    }

    public void reportError(String str, String str2) {
    }

    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
    }

    public void reportError(String str, String str2, Throwable th) {
    }

    public void reportError(String str, Throwable th) {
    }

    public void reportEvent(String str) {
    }

    public void reportEvent(String str, String str2) {
    }

    public void reportEvent(String str, Map map) {
    }

    public void reportRevenue(Revenue revenue) {
    }

    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
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
