package com.yandex.metrica.impl.p265ob;

import android.location.Location;
import android.os.Bundle;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.C10086i;
import com.yandex.metrica.C12043l;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Pj */
public class C10646Pj implements C11126d1 {
    /* renamed from: a */
    public C10868W0 mo61929a(C10086i iVar) {
        return new C10527Mj();
    }

    /* renamed from: a */
    public String mo61930a() {
        return null;
    }

    /* renamed from: a */
    public void mo61558a(int i, Bundle bundle) {
    }

    /* renamed from: a */
    public void mo61671a(Location location) {
    }

    /* renamed from: a */
    public void mo61931a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
    }

    /* renamed from: a */
    public void mo61932a(DeferredDeeplinkListener deferredDeeplinkListener) {
    }

    /* renamed from: a */
    public void mo61933a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
    }

    /* renamed from: a */
    public void mo61935a(YandexMetricaConfig yandexMetricaConfig, C12043l lVar) {
    }

    /* renamed from: a */
    public void mo61678a(boolean z) {
    }

    /* renamed from: b */
    public C10906X0 mo61836b() {
        return new C10577Nj();
    }

    /* renamed from: b */
    public void mo61681b(boolean z) {
    }

    /* renamed from: c */
    public String mo61936c() {
        return null;
    }

    /* renamed from: c */
    public void mo61937c(C10086i iVar) {
    }

    /* renamed from: c */
    public void mo61682c(String str, String str2) {
    }

    /* renamed from: d */
    public C11773t1 mo61938d() {
        return new C11773t1(new C10435Kj());
    }

    public void setStatisticsSending(boolean z) {
    }

    public void setUserProfileID(String str) {
    }

    /* renamed from: a */
    public void mo61934a(IIdentifierCallback iIdentifierCallback, List<String> list) {
        iIdentifierCallback.onRequestError(IIdentifierCallback.Reason.UNKNOWN);
    }
}
