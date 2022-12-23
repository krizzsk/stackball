package com.ogury.p244cm.internal;

import android.content.SharedPreferences;
import com.android.billingclient.api.Purchase;
import com.applovin.sdk.AppLovinEventTypes;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.baabc */
public final class baabc {

    /* renamed from: a */
    public static final baabc f20594a = new baabc();

    /* renamed from: b */
    private static SharedPreferences f20595b;

    private baabc() {
    }

    /* renamed from: a */
    public static String m22006a() {
        SharedPreferences sharedPreferences = f20595b;
        if (sharedPreferences == null) {
            bbabc.m22049a("sharedPref");
        }
        return sharedPreferences.getString("activePurchases", (String) null);
    }

    /* renamed from: a */
    public static void m22007a(SharedPreferences sharedPreferences) {
        bbabc.m22051b(sharedPreferences, "sharedPreferences");
        f20595b = sharedPreferences;
    }

    /* renamed from: a */
    public static void m22008a(baacb baacb) {
        bbabc.m22051b(baacb, AppLovinEventTypes.USER_VIEWED_PRODUCT);
        SharedPreferences sharedPreferences = f20595b;
        if (sharedPreferences == null) {
            bbabc.m22049a("sharedPref");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        bbabc.m22048a((Object) edit, "sharedPref.edit()");
        edit.putString("activeProduct", baacb.mo52780b());
        edit.apply();
    }

    /* renamed from: a */
    public static void m22009a(HashSet<Purchase> hashSet) {
        JSONArray jSONArray = new JSONArray();
        for (Purchase purchase : hashSet) {
            if (!(purchase.getSku() == null || purchase.getPurchaseToken() == null)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("productId", purchase.getSku());
                jSONObject.put("purchaseToken", purchase.getPurchaseToken());
                jSONArray.put(jSONObject);
            }
        }
        SharedPreferences sharedPreferences = f20595b;
        if (sharedPreferences == null) {
            bbabc.m22049a("sharedPref");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        bbabc.m22048a((Object) edit, "sharedPref.edit()");
        if (jSONArray.length() > 0) {
            edit.putString("activePurchases", jSONArray.toString());
        } else {
            edit = edit.remove("activePurchases");
        }
        edit.apply();
    }

    /* renamed from: b */
    public static String m22010b() {
        SharedPreferences sharedPreferences = f20595b;
        if (sharedPreferences == null) {
            bbabc.m22049a("sharedPref");
        }
        String string = sharedPreferences.getString("activeProduct", "");
        bbabc.m22048a((Object) string, "sharedPref.getString(ACTIVE_PRODUCT, \"\")");
        return string;
    }
}
