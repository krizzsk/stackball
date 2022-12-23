package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.fk */
/* compiled from: RootConfig */
public class C5261fk extends C5238ex {
    private static final long DEFAULT_EXPIRY = 86400;
    private static final String DEFAULT_FALLBACK_URL = "https://config.inmobi.com/config-server/v1/config/secure.cfg";
    private static final int DEFAULT_MAX_RETRIES = 3;
    private static final int DEFAULT_RETRY_INTERVAL = 60;
    private static final String DEFAULT_URL = "";
    private static final int DEFAULT_WAIT_TIME = 3;
    private static final Object sAcquisitionLock = new Object();
    private List<C5263a> components = new ArrayList();
    private C5264b gdpr = new C5264b();
    C5265c latestSdkInfo = new C5265c();
    private int maxRetries = 3;
    private boolean monetizationDisabled = false;
    private int retryInterval = 60;
    int waitTime = 3;

    /* renamed from: com.inmobi.media.fk$a */
    /* compiled from: RootConfig */
    public static final class C5263a {
        /* access modifiers changed from: package-private */
        public long expiry;
        /* access modifiers changed from: package-private */
        public String fallbackUrl = C5261fk.DEFAULT_FALLBACK_URL;
        /* access modifiers changed from: package-private */
        public String type;
        /* access modifiers changed from: package-private */
        public String url;
    }

    /* renamed from: com.inmobi.media.fk$b */
    /* compiled from: RootConfig */
    public static final class C5264b {
        boolean transmitRequest = true;
    }

    /* renamed from: com.inmobi.media.fk$c */
    /* compiled from: RootConfig */
    public static final class C5265c {
        String url = C5315gp.m12230e();
        String version = C5315gp.m12226b();
    }

    /* renamed from: b */
    public String mo40557b() {
        return "root";
    }

    /* renamed from: a */
    public static C5352hm<C5261fk> m12041a() {
        return new C5352hm().mo40709a(new C5357hr("components", C5261fk.class), (C5356hq) new C5354ho(new Constructor<List<C5263a>>() {
            public final /* synthetic */ Object construct() {
                return new ArrayList();
            }
        }, C5263a.class));
    }

    C5261fk(String str) {
        super(str);
    }

    /* renamed from: a */
    public boolean mo40581a(C5261fk fkVar) {
        return ((mo40564g() == null && fkVar.mo40564g() == null) || (mo40564g() != null && mo40564g().equals(fkVar.mo40564g()))) && fkVar.maxRetries == this.maxRetries && fkVar.retryInterval == this.retryInterval && fkVar.waitTime == this.waitTime && fkVar.monetizationDisabled == this.monetizationDisabled;
    }

    /* renamed from: c */
    public JSONObject mo40558c() {
        return m12041a().mo40711a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0093, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0097, code lost:
        if (r9.gdpr == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0099, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009b, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo40559d() {
        /*
            r9 = this;
            java.util.List<com.inmobi.media.fk$a> r0 = r9.components
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r9.maxRetries
            if (r0 < 0) goto L_0x009f
            int r0 = r9.retryInterval
            if (r0 < 0) goto L_0x009f
            int r0 = r9.waitTime
            if (r0 >= 0) goto L_0x0014
            goto L_0x009f
        L_0x0014:
            com.inmobi.media.fk$c r0 = r9.latestSdkInfo
            java.lang.String r0 = r0.version
            java.lang.String r0 = r0.trim()
            int r0 = r0.length()
            if (r0 == 0) goto L_0x009f
            com.inmobi.media.fk$c r0 = r9.latestSdkInfo
            java.lang.String r0 = r0.url
            java.lang.String r2 = "http://"
            boolean r0 = r0.startsWith(r2)
            if (r0 != 0) goto L_0x003b
            com.inmobi.media.fk$c r0 = r9.latestSdkInfo
            java.lang.String r0 = r0.url
            java.lang.String r2 = "https://"
            boolean r0 = r0.startsWith(r2)
            if (r0 != 0) goto L_0x003b
            goto L_0x009f
        L_0x003b:
            java.lang.Object r0 = sAcquisitionLock
            monitor-enter(r0)
            r2 = 0
        L_0x003f:
            java.util.List<com.inmobi.media.fk$a> r3 = r9.components     // Catch:{ all -> 0x009c }
            int r3 = r3.size()     // Catch:{ all -> 0x009c }
            if (r2 >= r3) goto L_0x0094
            java.util.List<com.inmobi.media.fk$a> r3 = r9.components     // Catch:{ all -> 0x009c }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x009c }
            com.inmobi.media.fk$a r3 = (com.inmobi.media.C5261fk.C5263a) r3     // Catch:{ all -> 0x009c }
            java.lang.String r4 = r3.type     // Catch:{ all -> 0x009c }
            java.lang.String r4 = r4.trim()     // Catch:{ all -> 0x009c }
            int r4 = r4.length()     // Catch:{ all -> 0x009c }
            if (r4 != 0) goto L_0x005d
            monitor-exit(r0)     // Catch:{ all -> 0x009c }
            return r1
        L_0x005d:
            long r4 = r3.expiry     // Catch:{ all -> 0x009c }
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0092
            long r4 = r3.expiry     // Catch:{ all -> 0x009c }
            r6 = 864000(0xd2f00, double:4.268727E-318)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x006f
            goto L_0x0092
        L_0x006f:
            java.lang.String r4 = r3.url     // Catch:{ all -> 0x009c }
            boolean r4 = m12042c(r4)     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x0079
            monitor-exit(r0)     // Catch:{ all -> 0x009c }
            return r1
        L_0x0079:
            java.lang.String r4 = "root"
            java.lang.String r5 = r3.type     // Catch:{ all -> 0x009c }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x008f
            java.lang.String r3 = r3.fallbackUrl     // Catch:{ all -> 0x009c }
            boolean r3 = m12042c(r3)     // Catch:{ all -> 0x009c }
            if (r3 == 0) goto L_0x008f
            monitor-exit(r0)     // Catch:{ all -> 0x009c }
            return r1
        L_0x008f:
            int r2 = r2 + 1
            goto L_0x003f
        L_0x0092:
            monitor-exit(r0)     // Catch:{ all -> 0x009c }
            return r1
        L_0x0094:
            monitor-exit(r0)     // Catch:{ all -> 0x009c }
            com.inmobi.media.fk$b r0 = r9.gdpr
            if (r0 == 0) goto L_0x009b
            r0 = 1
            return r0
        L_0x009b:
            return r1
        L_0x009c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009c }
            throw r1
        L_0x009f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5261fk.mo40559d():boolean");
    }

    /* renamed from: c */
    private static boolean m12042c(String str) {
        if (str == null || str.trim().length() == 0) {
            return true;
        }
        return !str.startsWith("http://") && !str.startsWith("https://");
    }

    /* renamed from: a */
    public long mo40580a(String str) {
        synchronized (sAcquisitionLock) {
            for (int i = 0; i < this.components.size(); i++) {
                C5263a aVar = this.components.get(i);
                if (str.equals(aVar.type)) {
                    long b = aVar.expiry;
                    return b;
                }
            }
            return DEFAULT_EXPIRY;
        }
    }

    /* renamed from: e */
    public int mo40583e() {
        return this.maxRetries;
    }

    /* renamed from: h */
    public int mo40584h() {
        return this.retryInterval;
    }

    /* renamed from: i */
    public boolean mo40585i() {
        return this.monetizationDisabled;
    }

    /* renamed from: j */
    public byte mo40586j() {
        C5264b bVar = this.gdpr;
        return (bVar == null || bVar.transmitRequest) ? (byte) 1 : 0;
    }

    /* renamed from: b */
    public String mo40582b(String str) {
        synchronized (sAcquisitionLock) {
            for (int i = 0; i < this.components.size(); i++) {
                C5263a aVar = this.components.get(i);
                if (str.equals(aVar.type)) {
                    String c = aVar.url;
                    return c;
                }
            }
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final String mo40587k() {
        synchronized (sAcquisitionLock) {
            for (C5263a next : this.components) {
                if ("root".equals(next.type)) {
                    String d = next.fallbackUrl;
                    return d;
                }
            }
            return DEFAULT_FALLBACK_URL;
        }
    }
}
