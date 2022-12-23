package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.C12043l;
import com.yandex.metrica.C12046p;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: com.yandex.metrica.impl.ob.f3 */
public final class C11228f3 {

    /* renamed from: a */
    static C11750sg f26867a = new C11750sg(C10941Y.m28234g().mo62499c(), new C11791tg());

    /* renamed from: a */
    public static void m28916a(Context context, IIdentifierCallback iIdentifierCallback, List<String> list) {
        f26867a.mo63641a(context, iIdentifierCallback, list);
    }

    /* renamed from: b */
    public static Future<String> m28922b() {
        return f26867a.mo63647b();
    }

    /* renamed from: c */
    public static String m28923c(Context context) {
        return f26867a.mo63648c(context);
    }

    /* renamed from: d */
    public static String m28925d(Context context) {
        return f26867a.mo63650d(context);
    }

    /* renamed from: a */
    public static boolean m28920a() {
        return f26867a.mo63645a();
    }

    /* renamed from: b */
    public static String m28921b(Context context) {
        return f26867a.mo63646b(context);
    }

    /* renamed from: c */
    public static Future<Boolean> m28924c() {
        return f26867a.mo63649c();
    }

    /* renamed from: d */
    public static void m28926d() {
        f26867a.mo63651d();
    }

    /* renamed from: a */
    public static String m28913a(Context context) {
        return f26867a.mo63639a(context);
    }

    /* renamed from: a */
    public static void m28915a(int i, String str, String str2, Map<String, String> map) {
        f26867a.mo63640a(i, str, str2, map);
    }

    /* renamed from: a */
    public static String m28914a(String str) {
        f26867a.getClass();
        return C10122B2.m26042c(str);
    }

    /* renamed from: a */
    public static String m28912a(int i) {
        f26867a.getClass();
        return C11363j1.m29251a(i);
    }

    /* renamed from: a */
    public static YandexMetricaConfig m28910a(YandexMetricaConfig yandexMetricaConfig, String str) {
        f26867a.getClass();
        return C12043l.m31129a(yandexMetricaConfig).mo64250a((List<String>) Collections.singletonList(str)).mo64253a();
    }

    /* renamed from: a */
    public static YandexMetricaConfig m28911a(YandexMetricaConfig yandexMetricaConfig, List<String> list) {
        f26867a.getClass();
        return C12043l.m31129a(yandexMetricaConfig).mo64250a(list).mo64253a();
    }

    /* renamed from: a */
    public static void m28918a(Context context, boolean z) {
        f26867a.mo63643a(context, z);
    }

    /* renamed from: a */
    public static void m28919a(C12046p.Ucc ucc, boolean z) {
        f26867a.mo63644a(ucc, z);
    }

    /* renamed from: a */
    public static void m28917a(Context context, Map<String, Object> map) {
        f26867a.mo63642a(context, map);
    }
}
