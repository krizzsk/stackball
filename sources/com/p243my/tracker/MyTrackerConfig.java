package com.p243my.tracker;

import android.content.pm.PackageInfo;
import com.p243my.tracker.config.AntiFraudConfig;
import com.p243my.tracker.obfuscated.C7880v0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import okhttp3.OkHttpClient;

/* renamed from: com.my.tracker.MyTrackerConfig */
public final class MyTrackerConfig {
    private final C7880v0 trackerConfig;

    /* renamed from: com.my.tracker.MyTrackerConfig$InstalledPackagesProvider */
    public interface InstalledPackagesProvider {
        List<PackageInfo> getInstalledPackages();
    }

    /* renamed from: com.my.tracker.MyTrackerConfig$OkHttpClientProvider */
    public interface OkHttpClientProvider {
        OkHttpClient getOkHttpClient();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.my.tracker.MyTrackerConfig$Region */
    public @interface Region {

        /* renamed from: EU */
        public static final int f19770EU = 1;

        /* renamed from: RU */
        public static final int f19771RU = 0;
    }

    private MyTrackerConfig(C7880v0 v0Var) {
        this.trackerConfig = v0Var;
    }

    static MyTrackerConfig newConfig(C7880v0 v0Var) {
        return new MyTrackerConfig(v0Var);
    }

    public AntiFraudConfig getAntiFraudConfig() {
        return this.trackerConfig.mo52516a();
    }

    public int getBufferingPeriod() {
        return this.trackerConfig.mo52533d();
    }

    public int getForcingPeriod() {
        return this.trackerConfig.mo52536e();
    }

    public String getId() {
        return this.trackerConfig.mo52538f();
    }

    public int getLaunchTimeout() {
        return this.trackerConfig.mo52541h();
    }

    @Deprecated
    public String getVendorAppPackage() {
        return this.trackerConfig.mo52545l();
    }

    public boolean isAutotrackingPurchaseEnabled() {
        return this.trackerConfig.mo52546m();
    }

    public boolean isTrackingEnvironmentEnabled() {
        return this.trackerConfig.mo52547n();
    }

    public boolean isTrackingLaunchEnabled() {
        return this.trackerConfig.mo52548o();
    }

    public boolean isTrackingLocationEnabled() {
        return this.trackerConfig.mo52549p();
    }

    public boolean isTrackingPreinstallEnabled() {
        return this.trackerConfig.mo52550q();
    }

    public boolean isTrackingPreinstallThirdPartyEnabled() {
        return this.trackerConfig.mo52551r();
    }

    public void setAntiFraudConfig(AntiFraudConfig antiFraudConfig) {
        this.trackerConfig.mo52521a(antiFraudConfig);
    }

    public MyTrackerConfig setAutotrackingPurchaseEnabled(boolean z) {
        this.trackerConfig.mo52524a(z);
        return this;
    }

    public MyTrackerConfig setBufferingPeriod(int i) {
        this.trackerConfig.mo52517a(i);
        return this;
    }

    @Deprecated
    public MyTrackerConfig setDefaultVendorAppPackage() {
        this.trackerConfig.mo52552t();
        return this;
    }

    public MyTrackerConfig setForcingPeriod(int i) {
        this.trackerConfig.mo52526b(i);
        return this;
    }

    public MyTrackerConfig setInstalledPackagesProvider(InstalledPackagesProvider installedPackagesProvider) {
        this.trackerConfig.mo52519a(installedPackagesProvider);
        return this;
    }

    public MyTrackerConfig setLaunchTimeout(int i) {
        this.trackerConfig.mo52530c(i);
        return this;
    }

    public MyTrackerConfig setOkHttpClientProvider(OkHttpClientProvider okHttpClientProvider) {
        this.trackerConfig.mo52520a(okHttpClientProvider);
        return this;
    }

    public MyTrackerConfig setProxyHost(String str) {
        this.trackerConfig.mo52527b(str);
        return this;
    }

    public MyTrackerConfig setRegion(int i) {
        this.trackerConfig.mo52534d(i);
        return this;
    }

    public MyTrackerConfig setTrackingEnvironmentEnabled(boolean z) {
        this.trackerConfig.mo52528b(z);
        return this;
    }

    public MyTrackerConfig setTrackingLaunchEnabled(boolean z) {
        this.trackerConfig.mo52532c(z);
        return this;
    }

    public MyTrackerConfig setTrackingLocationEnabled(boolean z) {
        this.trackerConfig.mo52535d(z);
        return this;
    }

    public MyTrackerConfig setTrackingPreinstallEnabled(boolean z) {
        this.trackerConfig.mo52537e(z);
        return this;
    }

    public MyTrackerConfig setTrackingPreinstallThirdPartyEnabled(boolean z) {
        this.trackerConfig.mo52539f(z);
        return this;
    }

    @Deprecated
    public MyTrackerConfig setVendorAppPackage(String str) {
        this.trackerConfig.mo52531c(str);
        return this;
    }
}
