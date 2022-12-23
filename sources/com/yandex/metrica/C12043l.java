package com.yandex.metrica;

import android.location.Location;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.impl.p265ob.C10796U2;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.yandex.metrica.l */
public class C12043l extends YandexMetricaConfig {

    /* renamed from: a */
    public final String f28945a;

    /* renamed from: b */
    public final Map<String, String> f28946b;

    /* renamed from: c */
    public final String f28947c;

    /* renamed from: d */
    public final List<String> f28948d;

    /* renamed from: e */
    public final Integer f28949e;

    /* renamed from: f */
    public final Integer f28950f;

    /* renamed from: g */
    public final Integer f28951g;

    /* renamed from: h */
    public final Map<String, String> f28952h;

    /* renamed from: i */
    public final Boolean f28953i;

    /* renamed from: j */
    public final Boolean f28954j;

    /* renamed from: k */
    public final Boolean f28955k;

    /* renamed from: l */
    public final C10079f f28956l;

    /* renamed from: com.yandex.metrica.l$b */
    public static final class C12045b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public YandexMetricaConfig.Builder f28957a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f28958b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public List<String> f28959c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Integer f28960d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Map<String, String> f28961e;

        /* renamed from: f */
        public String f28962f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public Integer f28963g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public Integer f28964h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public LinkedHashMap<String, String> f28965i = new LinkedHashMap<>();
        /* access modifiers changed from: private */

        /* renamed from: j */
        public Boolean f28966j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public Boolean f28967k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public Boolean f28968l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public C10079f f28969m;

        protected C12045b(String str) {
            this.f28957a = YandexMetricaConfig.newConfigBuilder(str);
        }

        /* renamed from: c */
        static /* synthetic */ void m31133c(C12045b bVar) {
        }

        /* renamed from: f */
        static /* synthetic */ void m31136f(C12045b bVar) {
        }

        /* renamed from: c */
        public C12045b mo64260c(String str) {
            this.f28957a.withUserProfileID(str);
            return this;
        }

        /* renamed from: f */
        public C12045b mo64266f(boolean z) {
            this.f28957a.withNativeCrashReporting(z);
            return this;
        }

        /* renamed from: a */
        public C12045b mo64248a(String str) {
            this.f28957a.withAppVersion(str);
            return this;
        }

        /* renamed from: b */
        public C12045b mo64258b(boolean z) {
            this.f28968l = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: c */
        public C12045b mo64259c(int i) {
            this.f28964h = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C12045b mo64263d(boolean z) {
            this.f28957a.withCrashReporting(z);
            return this;
        }

        /* renamed from: e */
        public C12045b mo64264e(int i) {
            this.f28957a.withSessionTimeout(i);
            return this;
        }

        /* renamed from: g */
        public C12045b mo64267g(boolean z) {
            this.f28967k = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: h */
        public C12045b mo64268h(boolean z) {
            this.f28957a.withRevenueAutoTrackingEnabled(z);
            return this;
        }

        /* renamed from: i */
        public C12045b mo64269i(boolean z) {
            this.f28957a.withSessionsAutoTrackingEnabled(z);
            return this;
        }

        /* renamed from: j */
        public C12045b mo64270j(boolean z) {
            this.f28957a.withStatisticsSending(z);
            return this;
        }

        /* renamed from: a */
        public C12045b mo64245a(Location location) {
            this.f28957a.withLocation(location);
            return this;
        }

        /* renamed from: b */
        public C12045b mo64254b() {
            this.f28957a.withLogs();
            return this;
        }

        /* renamed from: c */
        public C12045b mo64261c(boolean z) {
            this.f28957a.withAppOpenTrackingEnabled(z);
            return this;
        }

        /* renamed from: d */
        public C12045b mo64262d(int i) {
            this.f28957a.withMaxReportsInDatabaseCount(i);
            return this;
        }

        /* renamed from: e */
        public C12045b mo64265e(boolean z) {
            this.f28957a.withLocationTracking(z);
            return this;
        }

        /* renamed from: a */
        public C12045b mo64250a(List<String> list) {
            this.f28959c = list;
            return this;
        }

        /* renamed from: b */
        public C12045b mo64257b(String str, String str2) {
            this.f28957a.withErrorEnvironmentValue(str, str2);
            return this;
        }

        /* renamed from: a */
        public C12045b mo64244a(int i) {
            if (i >= 0) {
                this.f28960d = Integer.valueOf(i);
                return this;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", new Object[]{"App Build Number"}));
        }

        /* renamed from: b */
        public C12045b mo64256b(String str) {
            this.f28958b = str;
            return this;
        }

        /* renamed from: b */
        public C12045b mo64255b(int i) {
            this.f28963g = Integer.valueOf(i);
            return this;
        }

        /* renamed from: a */
        public C12045b mo64251a(Map<String, String> map, Boolean bool) {
            this.f28966j = bool;
            this.f28961e = map;
            return this;
        }

        /* renamed from: a */
        public C12045b mo64246a(PreloadInfo preloadInfo) {
            this.f28957a.withPreloadInfo(preloadInfo);
            return this;
        }

        /* renamed from: a */
        public C12045b mo64252a(boolean z) {
            this.f28957a.handleFirstActivationAsUpdate(z);
            return this;
        }

        /* renamed from: a */
        public C12045b mo64249a(String str, String str2) {
            this.f28965i.put(str, str2);
            return this;
        }

        /* renamed from: a */
        public C12045b mo64247a(C10079f fVar) {
            this.f28969m = fVar;
            return this;
        }

        /* renamed from: a */
        public C12043l mo64253a() {
            return new C12043l(this);
        }
    }

    /* renamed from: a */
    public static C12045b m31130a(String str) {
        return new C12045b(str);
    }

    public C12043l(YandexMetricaConfig yandexMetricaConfig) {
        super(yandexMetricaConfig);
        this.f28945a = null;
        this.f28946b = null;
        this.f28949e = null;
        this.f28950f = null;
        this.f28951g = null;
        this.f28947c = null;
        this.f28952h = null;
        this.f28953i = null;
        this.f28954j = null;
        this.f28948d = null;
        this.f28955k = null;
        this.f28956l = null;
    }

    /* renamed from: a */
    public static C12045b m31129a(YandexMetricaConfig yandexMetricaConfig) {
        C12045b bVar = new C12045b(yandexMetricaConfig.apiKey);
        if (C10796U2.m27891a((Object) yandexMetricaConfig.appVersion)) {
            bVar.mo64248a(yandexMetricaConfig.appVersion);
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.sessionTimeout)) {
            bVar.mo64264e(yandexMetricaConfig.sessionTimeout.intValue());
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.crashReporting)) {
            bVar.mo64263d(yandexMetricaConfig.crashReporting.booleanValue());
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.nativeCrashReporting)) {
            bVar.mo64266f(yandexMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.location)) {
            bVar.mo64245a(yandexMetricaConfig.location);
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.locationTracking)) {
            bVar.mo64265e(yandexMetricaConfig.locationTracking.booleanValue());
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.logs) && yandexMetricaConfig.logs.booleanValue()) {
            bVar.mo64254b();
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.preloadInfo)) {
            bVar.mo64246a(yandexMetricaConfig.preloadInfo);
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.firstActivationAsUpdate)) {
            bVar.mo64252a(yandexMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.statisticsSending)) {
            bVar.mo64270j(yandexMetricaConfig.statisticsSending.booleanValue());
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.maxReportsInDatabaseCount)) {
            bVar.mo64262d(yandexMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.errorEnvironment)) {
            for (Map.Entry next : yandexMetricaConfig.errorEnvironment.entrySet()) {
                bVar.mo64257b((String) next.getKey(), (String) next.getValue());
            }
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.userProfileID)) {
            bVar.mo64260c(yandexMetricaConfig.userProfileID);
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.revenueAutoTrackingEnabled)) {
            bVar.mo64268h(yandexMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.sessionsAutoTrackingEnabled)) {
            bVar.mo64269i(yandexMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (C10796U2.m27891a((Object) yandexMetricaConfig.appOpenTrackingEnabled)) {
            bVar.mo64261c(yandexMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (yandexMetricaConfig instanceof C12043l) {
            C12043l lVar = (C12043l) yandexMetricaConfig;
            if (C10796U2.m27891a((Object) lVar.f28948d)) {
                bVar.mo64250a(lVar.f28948d);
            }
            if (C10796U2.m27891a((Object) lVar.f28956l)) {
                bVar.mo64247a(lVar.f28956l);
            }
            C10796U2.m27891a((Object) null);
        }
        return bVar;
    }

    private C12043l(C12045b bVar) {
        super(bVar.f28957a);
        List<String> list;
        this.f28949e = bVar.f28960d;
        List h = bVar.f28959c;
        Map<String, String> map = null;
        if (h == null) {
            list = null;
        } else {
            list = Collections.unmodifiableList(h);
        }
        this.f28948d = list;
        this.f28945a = bVar.f28958b;
        Map j = bVar.f28961e;
        this.f28946b = j != null ? Collections.unmodifiableMap(j) : map;
        this.f28951g = bVar.f28964h;
        this.f28950f = bVar.f28963g;
        this.f28947c = bVar.f28962f;
        this.f28952h = Collections.unmodifiableMap(bVar.f28965i);
        this.f28953i = bVar.f28966j;
        this.f28954j = bVar.f28967k;
        C12045b.m31133c(bVar);
        this.f28955k = bVar.f28968l;
        this.f28956l = bVar.f28969m;
        C12045b.m31136f(bVar);
    }
}
