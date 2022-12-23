package com.yandex.metrica;

import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.impl.p265ob.C10796U2;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.i */
public class C10086i extends ReporterConfig {

    /* renamed from: a */
    public final Integer f24283a;

    /* renamed from: b */
    public final Integer f24284b;

    /* renamed from: c */
    public final Map<String, String> f24285c;

    /* renamed from: com.yandex.metrica.i$a */
    public static class C10087a {

        /* renamed from: a */
        ReporterConfig.Builder f24286a;

        /* renamed from: b */
        Integer f24287b;

        /* renamed from: c */
        Integer f24288c;

        /* renamed from: d */
        LinkedHashMap<String, String> f24289d = new LinkedHashMap<>();

        public C10087a(String str) {
            this.f24286a = ReporterConfig.newConfigBuilder(str);
        }

        /* renamed from: a */
        public C10087a mo61030a(int i) {
            this.f24286a.withMaxReportsInDatabaseCount(i);
            return this;
        }

        /* renamed from: a */
        public C10086i mo61031a() {
            return new C10086i(this);
        }
    }

    C10086i(C10087a aVar) {
        super(aVar.f24286a);
        this.f24284b = aVar.f24287b;
        this.f24283a = aVar.f24288c;
        LinkedHashMap<String, String> linkedHashMap = aVar.f24289d;
        this.f24285c = linkedHashMap == null ? null : Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: a */
    public static C10086i m25952a(ReporterConfig reporterConfig) {
        return new C10086i(reporterConfig);
    }

    /* renamed from: a */
    public static C10087a m25950a(C10086i iVar) {
        C10087a aVar = new C10087a(iVar.apiKey);
        if (C10796U2.m27891a((Object) iVar.sessionTimeout)) {
            aVar.f24286a.withSessionTimeout(iVar.sessionTimeout.intValue());
        }
        if (C10796U2.m27891a((Object) iVar.logs) && iVar.logs.booleanValue()) {
            aVar.f24286a.withLogs();
        }
        if (C10796U2.m27891a((Object) iVar.statisticsSending)) {
            aVar.f24286a.withStatisticsSending(iVar.statisticsSending.booleanValue());
        }
        if (C10796U2.m27891a((Object) iVar.maxReportsInDatabaseCount)) {
            aVar.f24286a.withMaxReportsInDatabaseCount(iVar.maxReportsInDatabaseCount.intValue());
        }
        if (C10796U2.m27891a((Object) iVar.f24283a)) {
            aVar.f24288c = Integer.valueOf(iVar.f24283a.intValue());
        }
        if (C10796U2.m27891a((Object) iVar.f24284b)) {
            aVar.f24287b = Integer.valueOf(iVar.f24284b.intValue());
        }
        if (C10796U2.m27891a((Object) iVar.f24285c)) {
            for (Map.Entry next : iVar.f24285c.entrySet()) {
                aVar.f24289d.put((String) next.getKey(), (String) next.getValue());
            }
        }
        if (C10796U2.m27891a((Object) iVar.userProfileID)) {
            aVar.f24286a.withUserProfileID(iVar.userProfileID);
        }
        return aVar;
    }

    private C10086i(ReporterConfig reporterConfig) {
        super(reporterConfig);
        if (reporterConfig instanceof C10086i) {
            C10086i iVar = (C10086i) reporterConfig;
            this.f24283a = iVar.f24283a;
            this.f24284b = iVar.f24284b;
            this.f24285c = iVar.f24285c;
            return;
        }
        this.f24283a = null;
        this.f24284b = null;
        this.f24285c = null;
    }

    /* renamed from: a */
    public static C10087a m25951a(String str) {
        return new C10087a(str);
    }
}
