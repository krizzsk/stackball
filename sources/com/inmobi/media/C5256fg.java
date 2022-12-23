package com.inmobi.media;

import com.inmobi.media.C5258fi;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.fg */
/* compiled from: CrashConfig */
public class C5256fg extends C5238ex {
    private static final boolean DEFAULT_CATCH_ENABLED = false;
    private static final boolean DEFAULT_CRASH_ENABLED = false;
    private static final long DEFAULT_EVENT_TTL_SEC = 259200;
    private static final long DEFAULT_INGESTION_LATENCY_SEC = 86400;
    private static final int DEFAULT_MAX_BATCH_SIZE = 2;
    private static final int DEFAULT_MAX_EVENTS_TO_PERSIST = 50;
    private static final int DEFAULT_MAX_RETRIES = 3;
    private static final int DEFAULT_MIN_BATCH_SIZE = 1;
    private static final long DEFAULT_PROCESSING_INTERVAL_SEC = 60;
    private static final long DEFAULT_RETRY_INTERVAL_SEC = 10;
    private static final String DEFAULT_URL = "https://crash-metrics.sdk.inmobi.com/trace";
    public boolean catchEnabled = false;
    public boolean crashEnabled = false;
    public long eventTTL = DEFAULT_EVENT_TTL_SEC;
    public int maxEventsToPersist = 50;
    public int maxRetryCount = 3;
    public C5258fi networkType;
    public long processingInterval = DEFAULT_PROCESSING_INTERVAL_SEC;
    public long txLatency = DEFAULT_INGESTION_LATENCY_SEC;
    public String url = DEFAULT_URL;

    /* renamed from: b */
    public String mo40557b() {
        return "crashReporting";
    }

    /* renamed from: a */
    public static C5352hm<C5256fg> m12031a() {
        return new C5352hm<>();
    }

    C5256fg(String str) {
        super(str);
        C5258fi fiVar = new C5258fi();
        this.networkType = fiVar;
        fiVar.wifi = new C5258fi.C5259a();
        this.networkType.wifi.retryInterval = DEFAULT_RETRY_INTERVAL_SEC;
        this.networkType.wifi.minBatchSize = 1;
        this.networkType.wifi.maxBatchSize = 2;
        this.networkType.others = new C5258fi.C5259a();
        this.networkType.others.retryInterval = DEFAULT_RETRY_INTERVAL_SEC;
        this.networkType.others.minBatchSize = 1;
        this.networkType.others.maxBatchSize = 2;
    }

    /* renamed from: d */
    public boolean mo40559d() {
        if (this.url.trim().length() != 0 && (this.url.startsWith("http://") || this.url.startsWith("https://"))) {
            long j = this.txLatency;
            if (j < this.processingInterval || j > this.eventTTL || !this.networkType.mo40578a(this.maxEventsToPersist) || this.processingInterval <= 0 || this.maxRetryCount < 0 || this.txLatency <= 0 || this.eventTTL <= 0 || this.maxEventsToPersist <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public JSONObject mo40558c() {
        return new C5352hm().mo40711a(this);
    }
}
