package com.yandex.metrica;

import android.content.Context;
import com.yandex.metrica.impl.p265ob.C11228f3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.p */
public final class C12046p {

    /* renamed from: a */
    private static final List<String> f28970a = Arrays.asList(new String[]{"yandex_mobile_metrica_uuid", "yandex_mobile_metrica_device_id", "appmetrica_device_id_hash", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url"});

    /* renamed from: com.yandex.metrica.p$Ucc */
    public interface Ucc {
        void onError(String str);

        void onResult(JSONObject jSONObject);
    }

    /* renamed from: a */
    public static void m31173a(Context context, IIdentifierCallback iIdentifierCallback, List<String> list) {
        C11228f3.m28916a(context, iIdentifierCallback, new ArrayList(list));
    }

    @Deprecated
    public static YandexMetricaConfig cpcwh(YandexMetricaConfig yandexMetricaConfig, String str) {
        return C11228f3.m28910a(yandexMetricaConfig, str);
    }

    public static String gcni(Context context) {
        return C11228f3.m28913a(context);
    }

    public static String gdid(Context context) {
        return C11228f3.m28921b(context);
    }

    public static String gmsvn(int i) {
        return C11228f3.m28912a(i);
    }

    public static void guc(Ucc ucc, boolean z) {
        C11228f3.m28919a(ucc, z);
    }

    public static String guid(Context context) {
        return C11228f3.m28925d(context);
    }

    public static boolean iifa() {
        return C11228f3.m28920a();
    }

    public static String mpn(Context context) {
        return C11228f3.m28923c(context);
    }

    public static String pgai() {
        try {
            return (String) ((FutureTask) C11228f3.m28922b()).get();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean plat() {
        try {
            return (Boolean) ((FutureTask) C11228f3.m28924c()).get();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void rce(int i, String str, String str2, Map<String, String> map) {
        C11228f3.m28915a(i, str, str2, map);
    }

    public static void rlse(Context context, Map<String, Object> map) {
        C11228f3.m28917a(context, map);
    }

    public static void seb() {
        C11228f3.m28926d();
    }

    public static void slte(Context context, boolean z) {
        C11228f3.m28918a(context, z);
    }

    /* renamed from: u */
    public static String m31175u(String str) {
        return C11228f3.m28914a(str);
    }

    /* renamed from: a */
    public static void m31174a(Context context, IIdentifierCallback iIdentifierCallback, String... strArr) {
        m31173a(context, iIdentifierCallback, (List<String>) Arrays.asList(strArr));
    }

    /* renamed from: a */
    public static void m31172a(Context context, IIdentifierCallback iIdentifierCallback) {
        m31173a(context, iIdentifierCallback, f28970a);
    }
}
