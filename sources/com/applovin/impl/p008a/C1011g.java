package com.applovin.impl.p008a;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.utils.C1517e;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1560t;
import com.facebook.internal.security.CertificateUtil;
import com.tapjoy.TJAdUnitConstants;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.a.g */
public class C1011g {

    /* renamed from: a */
    private String f1701a;

    /* renamed from: b */
    private String f1702b;

    /* renamed from: c */
    private String f1703c;

    /* renamed from: d */
    private long f1704d = -1;

    /* renamed from: e */
    private int f1705e = -1;

    private C1011g() {
    }

    /* renamed from: a */
    private static int m1354a(String str, C1006c cVar) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if (TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE.equalsIgnoreCase(str)) {
            return 25;
        }
        if ("midpoint".equalsIgnoreCase(str)) {
            return 50;
        }
        if (TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE.equalsIgnoreCase(str)) {
            return 75;
        }
        if (!"complete".equalsIgnoreCase(str)) {
            return -1;
        }
        if (cVar != null) {
            return cVar.mo11709i();
        }
        return 95;
    }

    /* renamed from: a */
    public static C1011g m1355a(C1560t tVar, C1006c cVar, C1469j jVar) {
        TimeUnit timeUnit;
        long seconds;
        if (tVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (jVar != null) {
            try {
                String c = tVar.mo13361c();
                if (C1553o.m3554b(c)) {
                    C1011g gVar = new C1011g();
                    gVar.f1703c = c;
                    gVar.f1701a = tVar.mo13359b().get("id");
                    gVar.f1702b = tVar.mo13359b().get("event");
                    gVar.f1705e = m1354a(gVar.mo11722a(), cVar);
                    String str = tVar.mo13359b().get("offset");
                    if (C1553o.m3554b(str)) {
                        String trim = str.trim();
                        if (trim.contains("%")) {
                            gVar.f1705e = C1553o.m3544a(trim.substring(0, trim.length() - 1));
                        } else if (trim.contains(CertificateUtil.DELIMITER)) {
                            List<String> a = C1517e.m3424a(trim, CertificateUtil.DELIMITER);
                            int size = a.size();
                            if (size > 0) {
                                long j = 0;
                                int i = size - 1;
                                for (int i2 = i; i2 >= 0; i2--) {
                                    String str2 = a.get(i2);
                                    if (C1553o.m3556d(str2)) {
                                        int parseInt = Integer.parseInt(str2);
                                        if (i2 == i) {
                                            seconds = (long) parseInt;
                                        } else {
                                            if (i2 == size - 2) {
                                                timeUnit = TimeUnit.MINUTES;
                                            } else if (i2 == size - 3) {
                                                timeUnit = TimeUnit.HOURS;
                                            }
                                            seconds = timeUnit.toSeconds((long) parseInt);
                                        }
                                        j += seconds;
                                    }
                                }
                                gVar.f1704d = j;
                                gVar.f1705e = -1;
                            }
                        } else {
                            jVar.mo13139v().mo13281e("VastTracker", "Unable to parse time offset from rawOffsetString = " + trim);
                        }
                    }
                    return gVar;
                }
                jVar.mo13139v().mo13281e("VastTracker", "Unable to create tracker. Could not find URL.");
                return null;
            } catch (Throwable th) {
                jVar.mo13139v().mo13278b("VastTracker", "Error occurred while initializing", th);
                return null;
            }
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* renamed from: a */
    public String mo11722a() {
        return this.f1702b;
    }

    /* renamed from: a */
    public boolean mo11723a(long j, int i) {
        boolean z = this.f1704d >= 0;
        boolean z2 = j >= this.f1704d;
        boolean z3 = this.f1705e >= 0;
        boolean z4 = i >= this.f1705e;
        if (!z || !z2) {
            return z3 && z4;
        }
        return true;
    }

    /* renamed from: b */
    public String mo11724b() {
        return this.f1703c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1011g)) {
            return false;
        }
        C1011g gVar = (C1011g) obj;
        if (this.f1704d != gVar.f1704d || this.f1705e != gVar.f1705e) {
            return false;
        }
        String str = this.f1701a;
        if (str == null ? gVar.f1701a != null : !str.equals(gVar.f1701a)) {
            return false;
        }
        String str2 = this.f1702b;
        if (str2 == null ? gVar.f1702b == null : str2.equals(gVar.f1702b)) {
            return this.f1703c.equals(gVar.f1703c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f1701a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f1702b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        long j = this.f1704d;
        return ((((((hashCode + i) * 31) + this.f1703c.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f1705e;
    }

    public String toString() {
        return "VastTracker{identifier='" + this.f1701a + '\'' + ", event='" + this.f1702b + '\'' + ", uriString='" + this.f1703c + '\'' + ", offsetSeconds=" + this.f1704d + ", offsetPercent=" + this.f1705e + '}';
    }
}
