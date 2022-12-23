package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.YandexMetrica;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class sn0 {

    /* renamed from: c */
    private static final Object f40075c = new Object();

    /* renamed from: d */
    private static volatile sn0 f40076d;

    /* renamed from: a */
    private final IReporter f40077a;

    /* renamed from: b */
    private final C13836l7 f40078b;

    private sn0(IReporter iReporter, tn0 tn0, C13836l7 l7Var) {
        this.f40077a = iReporter;
        this.f40078b = l7Var;
        tn0.mo70207a(iReporter);
    }

    /* renamed from: a */
    private static sn0 m42089a(Context context) {
        String str = C13378i5.m37284b(context) ? "322a737a-a0ca-44e0-bc85-649b1c7c1db6" : "478cb909-6ad1-4e12-84cc-b3629a789f93";
        tn0 tn0 = new tn0(g71.m36498a());
        C13836l7 l7Var = new C13836l7();
        IReporter iReporter = null;
        try {
            YandexMetrica.activateReporter(context, ReporterConfig.newConfigBuilder(str).withStatisticsSending(tn0.mo70208a(context)).build());
            iReporter = YandexMetrica.getReporter(context, str);
        } catch (Throwable unused) {
        }
        return new sn0(iReporter, tn0, l7Var);
    }

    /* renamed from: b */
    public static sn0 m42091b(Context context) {
        if (f40076d == null) {
            synchronized (f40075c) {
                if (f40076d == null) {
                    f40076d = m42089a(context.getApplicationContext());
                }
            }
        }
        return f40076d;
    }

    /* renamed from: a */
    public void mo70035a(h41 h41) {
        this.f40078b.getClass();
        l71.m38631c().mo68369d();
        if (this.f40077a != null) {
            String b = h41.mo67413b();
            Map<String, Object> a = h41.mo67412a();
            try {
                m42090a(b, a);
                this.f40077a.reportEvent(b, a);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private void m42090a(String str, Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            hashMap.put((String) next.getKey(), Arrays.deepToString(new Object[]{next.getValue()}));
        }
        hashMap.toString();
    }
}
