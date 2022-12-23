package com.applovin.mediation.adapters;

import android.content.Context;
import android.os.Bundle;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinSdk;

public abstract class MediationAdapterBase implements MaxAdapter {
    private boolean alwaysRewardUser;
    private final C1505q mLogger;
    private final C1469j mSdk;
    private final String mTag = getClass().getSimpleName();
    private final AppLovinSdk mWrappingSdk;
    private MaxReward reward;

    public MediationAdapterBase(AppLovinSdk appLovinSdk) {
        this.mWrappingSdk = appLovinSdk;
        C1469j a = C1557r.m3585a(appLovinSdk);
        this.mSdk = a;
        this.mLogger = a.mo13139v();
    }

    protected static String mediationTag() {
        return "AppLovinSdk_" + AppLovinSdk.VERSION;
    }

    /* access modifiers changed from: protected */
    public void checkActivities(Context context, Class<?>... clsArr) {
    }

    /* access modifiers changed from: protected */
    public void checkExistence(Class<?>... clsArr) {
        if (clsArr != null && clsArr.length > 0) {
            for (Class<?> cls : clsArr) {
                log("Found: " + cls.getName());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void configureReward(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        this.alwaysRewardUser = BundleUtils.getBoolean("always_reward_user", maxAdapterResponseParameters.isTesting(), serverParameters);
        int i = BundleUtils.getInt("amount", 0, serverParameters);
        String string = BundleUtils.getString("currency", "", serverParameters);
        log("Creating reward: " + i + " " + string);
        this.reward = MaxReward.create(i, string);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo13522d(String str) {
        this.mLogger.mo13277b(this.mTag, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo13523e(String str) {
        this.mLogger.mo13281e(this.mTag, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo13524e(String str, Throwable th) {
        this.mLogger.mo13278b(this.mTag, str, th);
    }

    /* access modifiers changed from: protected */
    public MaxReward getReward() {
        MaxReward maxReward = this.reward;
        return maxReward != null ? maxReward : MaxReward.createDefault();
    }

    /* access modifiers changed from: package-private */
    public String getVersionString(Class cls, String str) {
        String b = C1557r.m3616b(cls, str);
        if (b == null) {
            log("Failed to retrieve version string.");
        }
        return b;
    }

    /* access modifiers changed from: protected */
    public AppLovinSdk getWrappingSdk() {
        return this.mWrappingSdk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo13528i(String str) {
        this.mLogger.mo13279c(this.mTag, str);
    }

    /* access modifiers changed from: protected */
    public void log(String str) {
        this.mLogger.mo13279c(this.mTag, str);
    }

    /* access modifiers changed from: protected */
    public void log(String str, Throwable th) {
        this.mLogger.mo13278b(this.mTag, str, th);
    }

    /* access modifiers changed from: protected */
    public boolean shouldAlwaysRewardUser() {
        return this.alwaysRewardUser;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo13532w(String str) {
        this.mLogger.mo13280d(this.mTag, str);
    }
}
