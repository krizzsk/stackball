package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.mediationsdk.model.p */
public final class C5733p {

    /* renamed from: b */
    private static C5733p f13789b;

    /* renamed from: a */
    private ArrayList<NetworkSettings> f13790a = new ArrayList<>();

    private C5733p() {
    }

    /* renamed from: a */
    public static synchronized C5733p m14114a() {
        C5733p pVar;
        synchronized (C5733p.class) {
            if (f13789b == null) {
                f13789b = new C5733p();
            }
            pVar = f13789b;
        }
        return pVar;
    }

    /* renamed from: a */
    public final NetworkSettings mo41985a(String str) {
        Iterator<NetworkSettings> it = this.f13790a.iterator();
        while (it.hasNext()) {
            NetworkSettings next = it.next();
            if (next.getProviderName().equals(str)) {
                return next;
            }
        }
        NetworkSettings networkSettings = new NetworkSettings(str);
        mo41986a(networkSettings);
        return networkSettings;
    }

    /* renamed from: a */
    public final void mo41986a(NetworkSettings networkSettings) {
        this.f13790a.add(networkSettings);
    }

    /* renamed from: b */
    public final void mo41987b() {
        Iterator<NetworkSettings> it = this.f13790a.iterator();
        while (it.hasNext()) {
            NetworkSettings next = it.next();
            if (next.isMultipleInstances() && !TextUtils.isEmpty(next.getProviderTypeForReflection())) {
                NetworkSettings a = mo41985a(next.getProviderDefaultInstance());
                next.setApplicationSettings(IronSourceUtils.mergeJsons(next.getApplicationSettings(), a.getApplicationSettings()));
                next.setInterstitialSettings(IronSourceUtils.mergeJsons(next.getInterstitialSettings(), a.getInterstitialSettings()));
                next.setRewardedVideoSettings(IronSourceUtils.mergeJsons(next.getRewardedVideoSettings(), a.getRewardedVideoSettings()));
                next.setBannerSettings(IronSourceUtils.mergeJsons(next.getBannerSettings(), a.getBannerSettings()));
            }
        }
    }

    /* renamed from: b */
    public final boolean mo41988b(String str) {
        Iterator<NetworkSettings> it = this.f13790a.iterator();
        while (it.hasNext()) {
            if (it.next().getProviderName().equals(str)) {
                return true;
            }
        }
        return false;
    }
}
