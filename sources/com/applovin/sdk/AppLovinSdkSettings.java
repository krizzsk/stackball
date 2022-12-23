package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.utils.C1557r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppLovinSdkSettings {

    /* renamed from: a */
    private boolean f3921a;

    /* renamed from: b */
    private long f3922b;

    /* renamed from: c */
    private boolean f3923c;

    /* renamed from: d */
    private final Map<String, String> f3924d;

    /* renamed from: e */
    private List<String> f3925e;
    private final Map<String, Object> localSettings;

    public AppLovinSdkSettings() {
        this((Context) null);
    }

    public AppLovinSdkSettings(Context context) {
        this.localSettings = new HashMap();
        this.f3924d = new HashMap();
        this.f3925e = Collections.emptyList();
        this.f3921a = C1557r.m3607a(context);
        this.f3922b = -1;
    }

    @Deprecated
    public long getBannerAdRefreshSeconds() {
        return this.f3922b;
    }

    public List<String> getTestDeviceAdvertisingIds() {
        return this.f3925e;
    }

    public boolean isMuted() {
        return this.f3923c;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f3921a;
    }

    @Deprecated
    public void setBannerAdRefreshSeconds(long j) {
        this.f3922b = j;
    }

    public void setMuted(boolean z) {
        this.f3923c = z;
    }

    public void setTestDeviceAdvertisingIds(List<String> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (String next : list) {
                if (next == null || next.length() != 36) {
                    C1505q.m3345i("AppLovinSdkSettings", "Unable to set test device advertising id (" + next + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
                } else {
                    arrayList.add(next);
                }
            }
            this.f3925e = arrayList;
            return;
        }
        this.f3925e = Collections.emptyList();
    }

    public void setVerboseLogging(boolean z) {
        if (C1557r.m3605a()) {
            C1505q.m3345i("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already or AppLovinSdkSettings was initialized without a context.");
        } else {
            this.f3921a = z;
        }
    }

    public String toString() {
        return "AppLovinSdkSettings{isVerboseLoggingEnabled=" + this.f3921a + ", muted=" + this.f3923c + ", testDeviceAdvertisingIds=" + this.f3925e.toString() + '}';
    }
}
