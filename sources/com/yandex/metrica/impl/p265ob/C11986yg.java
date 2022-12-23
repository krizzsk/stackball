package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.YandexMetricaConfig;

/* renamed from: com.yandex.metrica.impl.ob.yg */
public class C11986yg extends C10138Bg {

    /* renamed from: i */
    private static final C11829uo<YandexMetricaConfig> f28786i = new C11726ro(new C11697qo("Config"));

    /* renamed from: j */
    private static final C11829uo<String> f28787j = new C11726ro(new C11666po("Native crash"));

    /* renamed from: k */
    private static final C11829uo<Activity> f28788k = new C11726ro(new C11697qo("Activity"));

    /* renamed from: l */
    private static final C11829uo<Intent> f28789l = new C11726ro(new C11697qo("Intent"));

    /* renamed from: m */
    private static final C11829uo<Application> f28790m = new C11726ro(new C11697qo("Application"));

    /* renamed from: n */
    private static final C11829uo<Context> f28791n = new C11726ro(new C11697qo("Context"));

    /* renamed from: o */
    private static final C11829uo<Object> f28792o = new C11726ro(new C11697qo("Deeplink listener"));

    /* renamed from: p */
    private static final C11829uo<AppMetricaDeviceIDListener> f28793p = new C11726ro(new C11697qo("DeviceID listener"));

    /* renamed from: q */
    private static final C11829uo<ReporterConfig> f28794q = new C11726ro(new C11697qo("Reporter Config"));

    /* renamed from: r */
    private static final C11829uo<String> f28795r = new C11726ro(new C11666po("Deeplink"));

    /* renamed from: s */
    private static final C11829uo<String> f28796s = new C11726ro(new C11666po("Referral url"));

    /* renamed from: t */
    private static final C11829uo<String> f28797t = new C11726ro(new C11891vo());

    /* renamed from: u */
    private static final C11829uo<String> f28798u = new C11726ro(new C11697qo("Key"));

    /* renamed from: v */
    private static final C11829uo<WebView> f28799v = new C11726ro(new C11697qo("WebView"));

    /* renamed from: w */
    private static final C11829uo<String> f28800w = new C11666po("value");

    /* renamed from: x */
    private static final C11829uo<String> f28801x = new C11666po("name");

    /* renamed from: a */
    public void mo64154a(Application application) {
        ((C11726ro) f28790m).mo61590a(application);
    }

    /* renamed from: b */
    public void mo64165b(Context context) {
        ((C11726ro) f28791n).mo61590a(context);
    }

    /* renamed from: c */
    public void mo64167c(String str) {
        ((C11726ro) f28787j).mo61590a(str);
    }

    /* renamed from: d */
    public void mo64168d(String str) {
        ((C11726ro) f28798u).mo61590a(str);
    }

    /* renamed from: e */
    public void mo64169e(String str) {
        ((C11726ro) f28795r).mo61590a(str);
    }

    /* renamed from: f */
    public boolean mo64170f(String str) {
        return ((C11666po) f28801x).mo61590a(str).mo63695b();
    }

    /* renamed from: g */
    public boolean mo64171g(String str) {
        return ((C11666po) f28800w).mo61590a(str).mo63695b();
    }

    /* renamed from: a */
    public void mo64159a(Intent intent) {
        ((C11726ro) f28789l).mo61590a(intent);
    }

    /* renamed from: c */
    public void mo64166c(Activity activity) {
        ((C11726ro) f28788k).mo61590a(activity);
    }

    /* renamed from: a */
    public void mo64164a(String str) {
        ((C11726ro) f28796s).mo61590a(str);
    }

    /* renamed from: a */
    public void mo64155a(Context context) {
        ((C11726ro) f28791n).mo61590a(context);
    }

    /* renamed from: a */
    public void mo64163a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        ((C11726ro) f28792o).mo61590a(deferredDeeplinkParametersListener);
    }

    /* renamed from: a */
    public void mo64162a(DeferredDeeplinkListener deferredDeeplinkListener) {
        ((C11726ro) f28792o).mo61590a(deferredDeeplinkListener);
    }

    /* renamed from: a */
    public void mo64161a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        ((C11726ro) f28793p).mo61590a(appMetricaDeviceIDListener);
    }

    /* renamed from: a */
    public void mo64158a(Context context, String str) {
        ((C11726ro) f28791n).mo61590a(context);
        ((C11726ro) f28797t).mo61590a(str);
    }

    /* renamed from: a */
    public void mo64156a(Context context, ReporterConfig reporterConfig) {
        ((C11726ro) f28791n).mo61590a(context);
        ((C11726ro) f28794q).mo61590a(reporterConfig);
    }

    /* renamed from: a */
    public void mo64157a(Context context, YandexMetricaConfig yandexMetricaConfig) {
        ((C11726ro) f28791n).mo61590a(context);
        ((C11726ro) f28786i).mo61590a(yandexMetricaConfig);
    }

    /* renamed from: a */
    public void mo64160a(WebView webView) {
        ((C11726ro) f28799v).mo61590a(webView);
    }
}
