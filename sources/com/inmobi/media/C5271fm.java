package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import com.inmobi.media.C5258fi;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.fm */
/* compiled from: TelemetryConfig */
public class C5271fm extends C5238ex {
    private static final boolean DEFAULT_DISABLE_GENERAL_EVENTS = false;
    private static final long DEFAULT_EVENT_TTL_SEC = 604800;
    private static final long DEFAULT_INGESTION_LATENCY_SEC = 86400;
    private static final boolean DEFAULT_IS_ENABLED = true;
    private static final int DEFAULT_MAX_BATCH_SIZE = 20;
    private static final int DEFAULT_MAX_EVENTS_TO_PERSIST = 1000;
    private static final int DEFAULT_MAX_RETRIES = 1;
    private static final int DEFAULT_MIN_BATCH_SIZE = 5;
    private static final List<String> DEFAULT_PRIORITY_LIST = m12063h();
    private static final long DEFAULT_PROCESSING_INTERVAL_SEC = 30;
    private static final long DEFAULT_RETRY_INTERVAL_SEC = 60;
    private static final double DEFAULT_SAMPLING_FACTOR = 0.0d;
    private static final String DEFAULT_URL = "https://telemetry.sdk.inmobi.com/metrics";
    public C5273a assetReporting;
    public C5274b base = new C5274b();
    public boolean disableAllGeneralEvents = false;
    private long eventTTL = DEFAULT_EVENT_TTL_SEC;
    public int maxEventsToPersist = 1000;
    private int maxRetryCount = 1;
    public C5258fi networkType;
    public List<String> priorityEvents = DEFAULT_PRIORITY_LIST;
    private long processingInterval = DEFAULT_PROCESSING_INTERVAL_SEC;
    public double samplingFactor = DEFAULT_SAMPLING_FACTOR;
    public String telemetryUrl = DEFAULT_URL;
    private long txLatency = DEFAULT_INGESTION_LATENCY_SEC;

    /* renamed from: com.inmobi.media.fm$a */
    /* compiled from: TelemetryConfig */
    public static final class C5273a {
        public boolean gif;
        public boolean image;
        public boolean video;
    }

    /* renamed from: b */
    public String mo40557b() {
        return "telemetry";
    }

    /* renamed from: a */
    public static C5352hm<C5271fm> m12062a() {
        return new C5352hm().mo40709a(new C5357hr("priorityEvents", C5271fm.class), (C5356hq) new C5354ho(new Constructor<List<String>>() {
            public final /* synthetic */ Object construct() {
                return new LinkedList();
            }
        }, String.class));
    }

    /* renamed from: h */
    private static List<String> m12063h() {
        LinkedList linkedList = new LinkedList();
        linkedList.add("SessionStarted");
        linkedList.add("ServerFill");
        linkedList.add("ServerNoFill");
        linkedList.add("ServerError");
        linkedList.add("AdLoadFailed");
        linkedList.add("AdLoadSuccessful");
        linkedList.add("BlockAutoRedirection");
        linkedList.add("AssetDownloaded");
        linkedList.add("CrashEventOccurred");
        linkedList.add("InvalidConfig");
        linkedList.add("ConfigFetched");
        linkedList.add("SdkInitialized");
        linkedList.add("AdGetSignalsFailed");
        linkedList.add("AdGetSignalsSucceeded");
        linkedList.add("AdShowFailed");
        return linkedList;
    }

    C5271fm(String str) {
        super(str);
        C5258fi fiVar = new C5258fi();
        this.networkType = fiVar;
        fiVar.wifi = new C5258fi.C5259a();
        this.networkType.wifi.retryInterval = DEFAULT_RETRY_INTERVAL_SEC;
        this.networkType.wifi.minBatchSize = 5;
        this.networkType.wifi.maxBatchSize = 20;
        this.networkType.others = new C5258fi.C5259a();
        this.networkType.others.retryInterval = DEFAULT_RETRY_INTERVAL_SEC;
        this.networkType.others.minBatchSize = 5;
        this.networkType.others.maxBatchSize = 20;
        C5273a aVar = new C5273a();
        aVar.video = true;
        aVar.image = false;
        aVar.gif = false;
        this.assetReporting = aVar;
        DEFAULT_PRIORITY_LIST.clear();
        DEFAULT_PRIORITY_LIST.addAll(m12063h());
    }

    /* renamed from: d */
    public boolean mo40559d() {
        if (this.telemetryUrl.trim().length() != 0 && (this.telemetryUrl.startsWith("http://") || this.telemetryUrl.startsWith("https://"))) {
            long j = this.txLatency;
            if (j < this.processingInterval || j > this.eventTTL || !this.networkType.mo40578a(this.maxEventsToPersist) || this.processingInterval <= 0 || this.maxRetryCount < 0 || this.txLatency <= 0 || this.eventTTL <= 0 || this.maxEventsToPersist <= 0 || this.samplingFactor < DEFAULT_SAMPLING_FACTOR) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public JSONObject mo40558c() {
        return m12062a().mo40711a(this);
    }

    /* renamed from: e */
    public final C5281fr mo40588e() {
        return new C5281fr(this.maxRetryCount, this.eventTTL, this.processingInterval, this.txLatency, this.networkType.wifi.minBatchSize, this.networkType.wifi.maxBatchSize, this.networkType.others.minBatchSize, this.networkType.others.maxBatchSize, this.networkType.wifi.retryInterval, this.networkType.others.retryInterval);
    }

    /* renamed from: com.inmobi.media.fm$b */
    /* compiled from: TelemetryConfig */
    public static final class C5274b {
        public boolean enabled;

        private C5274b() {
            this.enabled = true;
        }
    }
}
