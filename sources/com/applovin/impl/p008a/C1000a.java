package com.applovin.impl.p008a;

import android.net.Uri;
import com.applovin.impl.p008a.C1014j;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p024ad.C1346b;
import com.applovin.impl.sdk.p024ad.C1355g;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p026c.C1374a;
import com.applovin.impl.sdk.utils.C1517e;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1557r;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.a.a */
public class C1000a extends C1355g {

    /* renamed from: a */
    private final String f1632a;

    /* renamed from: b */
    private final String f1633b;

    /* renamed from: c */
    private final C1010f f1634c;

    /* renamed from: d */
    private final long f1635d;

    /* renamed from: e */
    private final C1014j f1636e;

    /* renamed from: f */
    private final C1005b f1637f;

    /* renamed from: g */
    private final String f1638g;

    /* renamed from: h */
    private final Set<C1011g> f1639h;

    /* renamed from: i */
    private final Set<C1011g> f1640i;

    /* renamed from: com.applovin.impl.a.a$a */
    public static class C1002a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public JSONObject f1641a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public JSONObject f1642b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C1346b f1643c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C1469j f1644d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public long f1645e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f1646f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f1647g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C1010f f1648h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C1014j f1649i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C1005b f1650j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public Set<C1011g> f1651k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public Set<C1011g> f1652l;

        private C1002a() {
        }

        /* renamed from: a */
        public C1002a mo11681a(long j) {
            this.f1645e = j;
            return this;
        }

        /* renamed from: a */
        public C1002a mo11682a(C1005b bVar) {
            this.f1650j = bVar;
            return this;
        }

        /* renamed from: a */
        public C1002a mo11683a(C1010f fVar) {
            this.f1648h = fVar;
            return this;
        }

        /* renamed from: a */
        public C1002a mo11684a(C1014j jVar) {
            this.f1649i = jVar;
            return this;
        }

        /* renamed from: a */
        public C1002a mo11685a(C1346b bVar) {
            this.f1643c = bVar;
            return this;
        }

        /* renamed from: a */
        public C1002a mo11686a(C1469j jVar) {
            if (jVar != null) {
                this.f1644d = jVar;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        /* renamed from: a */
        public C1002a mo11687a(String str) {
            this.f1646f = str;
            return this;
        }

        /* renamed from: a */
        public C1002a mo11688a(Set<C1011g> set) {
            this.f1651k = set;
            return this;
        }

        /* renamed from: a */
        public C1002a mo11689a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f1641a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        /* renamed from: a */
        public C1000a mo11690a() {
            return new C1000a(this);
        }

        /* renamed from: b */
        public C1002a mo11691b(String str) {
            this.f1647g = str;
            return this;
        }

        /* renamed from: b */
        public C1002a mo11692b(Set<C1011g> set) {
            this.f1652l = set;
            return this;
        }

        /* renamed from: b */
        public C1002a mo11693b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f1642b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }
    }

    /* renamed from: com.applovin.impl.a.a$b */
    public enum C1003b {
        COMPANION_AD,
        VIDEO
    }

    /* renamed from: com.applovin.impl.a.a$c */
    public enum C1004c {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        ERROR
    }

    private C1000a(C1002a aVar) {
        super(aVar.f1641a, aVar.f1642b, aVar.f1643c, aVar.f1644d);
        this.f1632a = aVar.f1646f;
        this.f1634c = aVar.f1648h;
        this.f1633b = aVar.f1647g;
        this.f1636e = aVar.f1649i;
        this.f1637f = aVar.f1650j;
        this.f1639h = aVar.f1651k;
        this.f1640i = aVar.f1652l;
        Uri f = mo11668f();
        this.f1638g = f != null ? f.toString() : "";
        this.f1635d = aVar.f1645e;
    }

    /* renamed from: a */
    private Set<C1011g> m1277a(C1003b bVar, String[] strArr) {
        C1005b bVar2;
        C1014j jVar;
        if (strArr == null || strArr.length <= 0) {
            return Collections.emptySet();
        }
        Map<String, Set<C1011g>> map = null;
        if (bVar == C1003b.VIDEO && (jVar = this.f1636e) != null) {
            map = jVar.mo11733e();
        } else if (bVar == C1003b.COMPANION_AD && (bVar2 = this.f1637f) != null) {
            map = bVar2.mo11697d();
        }
        HashSet hashSet = new HashSet();
        if (map != null && !map.isEmpty()) {
            for (String str : strArr) {
                if (map.containsKey(str)) {
                    hashSet.addAll(map.get(str));
                }
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: aV */
    public static C1002a m1278aV() {
        return new C1002a();
    }

    /* renamed from: aW */
    private String m1279aW() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", (String) null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    /* renamed from: aX */
    private C1014j.C1016a m1280aX() {
        C1014j.C1016a[] values = C1014j.C1016a.values();
        int intValue = ((Integer) this.sdk.mo13088a(C1369c.f3078eL)).intValue();
        return (intValue < 0 || intValue >= values.length) ? C1014j.C1016a.UNSPECIFIED : values[intValue];
    }

    /* renamed from: aY */
    private Set<C1011g> m1281aY() {
        C1014j jVar = this.f1636e;
        return jVar != null ? jVar.mo11732d() : Collections.emptySet();
    }

    /* renamed from: aZ */
    private Set<C1011g> m1282aZ() {
        C1005b bVar = this.f1637f;
        return bVar != null ? bVar.mo11696c() : Collections.emptySet();
    }

    /* renamed from: a */
    public Set<C1011g> mo11653a(C1004c cVar, String str) {
        return mo11654a(cVar, new String[]{str});
    }

    /* renamed from: a */
    public Set<C1011g> mo11654a(C1004c cVar, String[] strArr) {
        C1505q v = this.sdk.mo13139v();
        v.mo13277b("VastAd", "Retrieving trackers of type '" + cVar + "' and events '" + strArr + "'...");
        if (cVar == C1004c.IMPRESSION) {
            return this.f1639h;
        }
        if (cVar == C1004c.VIDEO_CLICK) {
            return m1281aY();
        }
        if (cVar == C1004c.COMPANION_CLICK) {
            return m1282aZ();
        }
        if (cVar == C1004c.VIDEO) {
            return m1277a(C1003b.VIDEO, strArr);
        }
        if (cVar == C1004c.COMPANION) {
            return m1277a(C1003b.COMPANION_AD, strArr);
        }
        if (cVar == C1004c.ERROR) {
            return this.f1640i;
        }
        C1505q v2 = this.sdk.mo13139v();
        v2.mo13281e("VastAd", "Failed to retrieve trackers of invalid type '" + cVar + "' and events '" + strArr + "'");
        return Collections.emptySet();
    }

    /* renamed from: a */
    public void mo11655a() {
    }

    /* renamed from: a */
    public void mo11656a(String str) {
        synchronized (this.adObjectLock) {
            C1521i.m3477a(this.adObject, "html_template", str, this.sdk);
        }
    }

    /* renamed from: aQ */
    public boolean mo11657aQ() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", false);
    }

    /* renamed from: aR */
    public String mo11658aR() {
        return getStringFromAdObject("html_template", "");
    }

    /* renamed from: aS */
    public Uri mo11659aS() {
        String stringFromAdObject = getStringFromAdObject("html_template_url", (String) null);
        if (C1553o.m3554b(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    /* renamed from: aT */
    public boolean mo11660aT() {
        return getBooleanFromAdObject("cache_companion_ad", true);
    }

    /* renamed from: aU */
    public boolean mo11661aU() {
        return getBooleanFromAdObject("cache_video", true);
    }

    /* renamed from: az */
    public List<C1374a> mo11662az() {
        List<C1374a> a;
        synchronized (this.adObjectLock) {
            a = C1557r.m3595a("vimp_urls", this.adObject, getClCode(), C1517e.m3426a("{SOC}", String.valueOf(mo12808av())), m1279aW(), mo12771aA(), this.sdk);
        }
        return a;
    }

    /* renamed from: b */
    public boolean mo11663b() {
        return mo11665d();
    }

    /* renamed from: c */
    public String mo11664c() {
        return this.f1638g;
    }

    /* renamed from: d */
    public boolean mo11665d() {
        if (containsKeyForAdObject("vast_is_streaming")) {
            return getBooleanFromAdObject("vast_is_streaming", false);
        }
        C1017k l = mo11677l();
        return l != null && l.mo11742c();
    }

    /* renamed from: e */
    public C1003b mo11666e() {
        return "companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad")) ? C1003b.COMPANION_AD : C1003b.VIDEO;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1000a) || !super.equals(obj)) {
            return false;
        }
        C1000a aVar = (C1000a) obj;
        String str = this.f1632a;
        if (str == null ? aVar.f1632a != null : !str.equals(aVar.f1632a)) {
            return false;
        }
        String str2 = this.f1633b;
        if (str2 == null ? aVar.f1633b != null : !str2.equals(aVar.f1633b)) {
            return false;
        }
        C1010f fVar = this.f1634c;
        if (fVar == null ? aVar.f1634c != null : !fVar.equals(aVar.f1634c)) {
            return false;
        }
        C1014j jVar = this.f1636e;
        if (jVar == null ? aVar.f1636e != null : !jVar.equals(aVar.f1636e)) {
            return false;
        }
        C1005b bVar = this.f1637f;
        if (bVar == null ? aVar.f1637f != null : !bVar.equals(aVar.f1637f)) {
            return false;
        }
        Set<C1011g> set = this.f1639h;
        if (set == null ? aVar.f1639h != null : !set.equals(aVar.f1639h)) {
            return false;
        }
        Set<C1011g> set2 = this.f1640i;
        Set<C1011g> set3 = aVar.f1640i;
        return set2 != null ? set2.equals(set3) : set3 == null;
    }

    /* renamed from: f */
    public Uri mo11668f() {
        C1017k l = mo11677l();
        if (l != null) {
            return l.mo11741b();
        }
        return null;
    }

    /* renamed from: g */
    public boolean mo11669g() {
        return getBooleanFromAdObject("vast_immediate_ad_load", true);
    }

    public long getCreatedAtMillis() {
        return this.f1635d;
    }

    /* renamed from: h */
    public Uri mo11671h() {
        C1014j jVar = this.f1636e;
        if (jVar != null) {
            return jVar.mo11731c();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.mo11729a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasVideoUrl() {
        /*
            r2 = this;
            com.applovin.impl.a.j r0 = r2.f1636e
            r1 = 0
            if (r0 == 0) goto L_0x0012
            java.util.List r0 = r0.mo11729a()
            if (r0 == 0) goto L_0x0012
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0012
            r1 = 1
        L_0x0012:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.p008a.C1000a.hasVideoUrl():boolean");
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f1632a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1633b;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        C1010f fVar = this.f1634c;
        int hashCode4 = (hashCode3 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        C1014j jVar = this.f1636e;
        int hashCode5 = (hashCode4 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        C1005b bVar = this.f1637f;
        int hashCode6 = (hashCode5 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        Set<C1011g> set = this.f1639h;
        int hashCode7 = (hashCode6 + (set != null ? set.hashCode() : 0)) * 31;
        Set<C1011g> set2 = this.f1640i;
        if (set2 != null) {
            i = set2.hashCode();
        }
        return hashCode7 + i;
    }

    /* renamed from: i */
    public Uri mo11674i() {
        return mo11671h();
    }

    /* renamed from: j */
    public C1010f mo11675j() {
        return this.f1634c;
    }

    /* renamed from: k */
    public C1014j mo11676k() {
        return this.f1636e;
    }

    /* renamed from: l */
    public C1017k mo11677l() {
        C1014j jVar = this.f1636e;
        if (jVar != null) {
            return jVar.mo11728a(m1280aX());
        }
        return null;
    }

    /* renamed from: m */
    public C1005b mo11678m() {
        return this.f1637f;
    }

    public String toString() {
        return "VastAd{title='" + this.f1632a + '\'' + ", adDescription='" + this.f1633b + '\'' + ", systemInfo=" + this.f1634c + ", videoCreative=" + this.f1636e + ", companionAd=" + this.f1637f + ", impressionTrackers=" + this.f1639h + ", errorTrackers=" + this.f1640i + '}';
    }

    /* renamed from: z */
    public boolean mo11680z() {
        return mo11671h() != null;
    }
}
