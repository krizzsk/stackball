package com.yandex.metrica;

import android.location.Location;
import com.yandex.metrica.impl.p265ob.C10796U2;
import com.yandex.metrica.impl.p265ob.C11726ro;
import com.yandex.metrica.impl.p265ob.C11829uo;
import com.yandex.metrica.impl.p265ob.C11833v1;
import com.yandex.metrica.impl.p265ob.C11891vo;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class YandexMetricaConfig {
    public final String apiKey;
    public final Boolean appOpenTrackingEnabled;
    public final String appVersion;
    public final Boolean crashReporting;
    public final Map<String, String> errorEnvironment;
    public final Boolean firstActivationAsUpdate;
    public final Location location;
    public final Boolean locationTracking;
    public final Boolean logs;
    public final Integer maxReportsInDatabaseCount;
    public final Boolean nativeCrashReporting;
    public final PreloadInfo preloadInfo;
    public final Boolean revenueAutoTrackingEnabled;
    public final Integer sessionTimeout;
    public final Boolean sessionsAutoTrackingEnabled;
    public final Boolean statisticsSending;
    public final String userProfileID;

    public static class Builder {

        /* renamed from: r */
        private static final C11829uo<String> f24051r = new C11726ro(new C11891vo());
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f24052a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f24053b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Integer f24054c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Boolean f24055d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Boolean f24056e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Location f24057f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public Boolean f24058g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public Boolean f24059h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public PreloadInfo f24060i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public Boolean f24061j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public Boolean f24062k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public Integer f24063l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public LinkedHashMap<String, String> f24064m = new LinkedHashMap<>();
        /* access modifiers changed from: private */

        /* renamed from: n */
        public String f24065n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public Boolean f24066o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public Boolean f24067p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public Boolean f24068q;

        protected Builder(String str) {
            ((C11726ro) f24051r).mo61590a(str);
            this.f24052a = str;
        }

        public YandexMetricaConfig build() {
            return new YandexMetricaConfig(this);
        }

        public Builder handleFirstActivationAsUpdate(boolean z) {
            this.f24061j = Boolean.valueOf(z);
            return this;
        }

        public Builder withAppOpenTrackingEnabled(boolean z) {
            this.f24068q = Boolean.valueOf(z);
            return this;
        }

        public Builder withAppVersion(String str) {
            this.f24053b = str;
            return this;
        }

        public Builder withCrashReporting(boolean z) {
            this.f24055d = Boolean.valueOf(z);
            return this;
        }

        public Builder withErrorEnvironmentValue(String str, String str2) {
            this.f24064m.put(str, str2);
            return this;
        }

        public Builder withLocation(Location location) {
            this.f24057f = location;
            return this;
        }

        public Builder withLocationTracking(boolean z) {
            this.f24058g = Boolean.valueOf(z);
            return this;
        }

        public Builder withLogs() {
            this.f24059h = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i) {
            this.f24063l = Integer.valueOf(i);
            return this;
        }

        public Builder withNativeCrashReporting(boolean z) {
            this.f24056e = Boolean.valueOf(z);
            return this;
        }

        public Builder withPreloadInfo(PreloadInfo preloadInfo) {
            this.f24060i = preloadInfo;
            return this;
        }

        public Builder withRevenueAutoTrackingEnabled(boolean z) {
            this.f24066o = Boolean.valueOf(z);
            return this;
        }

        public Builder withSessionTimeout(int i) {
            this.f24054c = Integer.valueOf(i);
            return this;
        }

        public Builder withSessionsAutoTrackingEnabled(boolean z) {
            this.f24067p = Boolean.valueOf(z);
            return this;
        }

        public Builder withStatisticsSending(boolean z) {
            this.f24062k = Boolean.valueOf(z);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f24065n = str;
            return this;
        }
    }

    protected YandexMetricaConfig(Builder builder) {
        this.apiKey = builder.f24052a;
        this.appVersion = builder.f24053b;
        this.sessionTimeout = builder.f24054c;
        this.crashReporting = builder.f24055d;
        this.nativeCrashReporting = builder.f24056e;
        this.location = builder.f24057f;
        this.locationTracking = builder.f24058g;
        this.logs = builder.f24059h;
        this.preloadInfo = builder.f24060i;
        this.firstActivationAsUpdate = builder.f24061j;
        this.statisticsSending = builder.f24062k;
        this.maxReportsInDatabaseCount = builder.f24063l;
        this.errorEnvironment = Collections.unmodifiableMap(builder.f24064m);
        this.userProfileID = builder.f24065n;
        this.revenueAutoTrackingEnabled = builder.f24066o;
        this.sessionsAutoTrackingEnabled = builder.f24067p;
        this.appOpenTrackingEnabled = builder.f24068q;
    }

    public static Builder createBuilderFromConfig(YandexMetricaConfig yandexMetricaConfig) {
        Builder newConfigBuilder = newConfigBuilder(yandexMetricaConfig.apiKey);
        if (C10796U2.m27891a((Object) yandexMetricaConfig.appVersion)) {
            newConfigBuilder.withAppVersion(yandexMetricaConfig.appVersion);
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.sessionTimeout)) {
            newConfigBuilder.withSessionTimeout(yandexMetricaConfig.sessionTimeout.intValue());
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.crashReporting)) {
            newConfigBuilder.withCrashReporting(yandexMetricaConfig.crashReporting.booleanValue());
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.nativeCrashReporting)) {
            newConfigBuilder.withNativeCrashReporting(yandexMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.location)) {
            newConfigBuilder.withLocation(yandexMetricaConfig.location);
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.locationTracking)) {
            newConfigBuilder.withLocationTracking(yandexMetricaConfig.locationTracking.booleanValue());
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.logs) && yandexMetricaConfig.logs.booleanValue()) {
            newConfigBuilder.withLogs();
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.preloadInfo)) {
            newConfigBuilder.withPreloadInfo(yandexMetricaConfig.preloadInfo);
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.firstActivationAsUpdate)) {
            newConfigBuilder.handleFirstActivationAsUpdate(yandexMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.statisticsSending)) {
            newConfigBuilder.withStatisticsSending(yandexMetricaConfig.statisticsSending.booleanValue());
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.maxReportsInDatabaseCount)) {
            newConfigBuilder.withMaxReportsInDatabaseCount(yandexMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.errorEnvironment)) {
            for (Map.Entry next : yandexMetricaConfig.errorEnvironment.entrySet()) {
                newConfigBuilder.withErrorEnvironmentValue((String) next.getKey(), (String) next.getValue());
            }
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.userProfileID)) {
            newConfigBuilder.withUserProfileID(yandexMetricaConfig.userProfileID);
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.revenueAutoTrackingEnabled)) {
            newConfigBuilder.withRevenueAutoTrackingEnabled(yandexMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.sessionsAutoTrackingEnabled)) {
            newConfigBuilder.withSessionsAutoTrackingEnabled(yandexMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.appOpenTrackingEnabled)) {
            newConfigBuilder.withAppOpenTrackingEnabled(yandexMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        return newConfigBuilder;
    }

    public static YandexMetricaConfig fromJson(String str) {
        return new C11833v1().mo63815a(str);
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str);
    }

    public String toJson() {
        return new C11833v1().mo63816a(this);
    }

    protected YandexMetricaConfig(YandexMetricaConfig yandexMetricaConfig) {
        this.apiKey = yandexMetricaConfig.apiKey;
        this.appVersion = yandexMetricaConfig.appVersion;
        this.sessionTimeout = yandexMetricaConfig.sessionTimeout;
        this.crashReporting = yandexMetricaConfig.crashReporting;
        this.nativeCrashReporting = yandexMetricaConfig.nativeCrashReporting;
        this.location = yandexMetricaConfig.location;
        this.locationTracking = yandexMetricaConfig.locationTracking;
        this.logs = yandexMetricaConfig.logs;
        this.preloadInfo = yandexMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = yandexMetricaConfig.firstActivationAsUpdate;
        this.statisticsSending = yandexMetricaConfig.statisticsSending;
        this.maxReportsInDatabaseCount = yandexMetricaConfig.maxReportsInDatabaseCount;
        this.errorEnvironment = yandexMetricaConfig.errorEnvironment;
        this.userProfileID = yandexMetricaConfig.userProfileID;
        this.revenueAutoTrackingEnabled = yandexMetricaConfig.revenueAutoTrackingEnabled;
        this.sessionsAutoTrackingEnabled = yandexMetricaConfig.sessionsAutoTrackingEnabled;
        this.appOpenTrackingEnabled = yandexMetricaConfig.appOpenTrackingEnabled;
    }
}
