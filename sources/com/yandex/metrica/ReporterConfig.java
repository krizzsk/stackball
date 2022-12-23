package com.yandex.metrica;

import com.yandex.metrica.impl.p265ob.C10796U2;
import com.yandex.metrica.impl.p265ob.C11726ro;
import com.yandex.metrica.impl.p265ob.C11829uo;
import com.yandex.metrica.impl.p265ob.C11891vo;

public class ReporterConfig {
    public final String apiKey;
    public final Boolean logs;
    public final Integer maxReportsInDatabaseCount;
    public final Integer sessionTimeout;
    public final Boolean statisticsSending;
    public final String userProfileID;

    public static class Builder {

        /* renamed from: g */
        private static final C11829uo<String> f24034g = new C11726ro(new C11891vo());
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f24035a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Integer f24036b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Boolean f24037c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Boolean f24038d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Integer f24039e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f24040f;

        Builder(String str) {
            ((C11726ro) f24034g).mo61590a(str);
            this.f24035a = str;
        }

        public ReporterConfig build() {
            return new ReporterConfig(this);
        }

        public Builder withLogs() {
            this.f24037c = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i) {
            this.f24039e = Integer.valueOf(i);
            return this;
        }

        public Builder withSessionTimeout(int i) {
            this.f24036b = Integer.valueOf(i);
            return this;
        }

        public Builder withStatisticsSending(boolean z) {
            this.f24038d = Boolean.valueOf(z);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f24040f = str;
            return this;
        }
    }

    ReporterConfig(Builder builder) {
        this.apiKey = builder.f24035a;
        this.sessionTimeout = builder.f24036b;
        this.logs = builder.f24037c;
        this.statisticsSending = builder.f24038d;
        this.maxReportsInDatabaseCount = builder.f24039e;
        this.userProfileID = builder.f24040f;
    }

    public static Builder createBuilderFromConfig(ReporterConfig reporterConfig) {
        Builder newConfigBuilder = newConfigBuilder(reporterConfig.apiKey);
        if (C10796U2.m27891a((Object) reporterConfig.sessionTimeout)) {
            newConfigBuilder.withSessionTimeout(reporterConfig.sessionTimeout.intValue());
        }
        if (C10796U2.m27891a((Object) reporterConfig.logs) && reporterConfig.logs.booleanValue()) {
            newConfigBuilder.withLogs();
        }
        if (C10796U2.m27891a((Object) reporterConfig.statisticsSending)) {
            newConfigBuilder.withStatisticsSending(reporterConfig.statisticsSending.booleanValue());
        }
        if (C10796U2.m27891a((Object) reporterConfig.maxReportsInDatabaseCount)) {
            newConfigBuilder.withMaxReportsInDatabaseCount(reporterConfig.maxReportsInDatabaseCount.intValue());
        }
        if (C10796U2.m27891a((Object) reporterConfig.userProfileID)) {
            newConfigBuilder.withUserProfileID(reporterConfig.userProfileID);
        }
        return newConfigBuilder;
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str);
    }

    ReporterConfig(ReporterConfig reporterConfig) {
        this.apiKey = reporterConfig.apiKey;
        this.sessionTimeout = reporterConfig.sessionTimeout;
        this.logs = reporterConfig.logs;
        this.statisticsSending = reporterConfig.statisticsSending;
        this.maxReportsInDatabaseCount = reporterConfig.maxReportsInDatabaseCount;
        this.userProfileID = reporterConfig.userProfileID;
    }
}
