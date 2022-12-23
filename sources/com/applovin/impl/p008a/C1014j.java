package com.applovin.impl.p008a;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.utils.C1517e;
import com.applovin.impl.sdk.utils.C1519g;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1560t;
import com.facebook.internal.security.CertificateUtil;
import com.smaato.sdk.video.vast.model.Linear;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.smaato.sdk.video.vast.model.VideoClicks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.a.j */
public class C1014j {

    /* renamed from: a */
    private List<C1017k> f1709a = Collections.EMPTY_LIST;

    /* renamed from: b */
    private List<String> f1710b = Collections.EMPTY_LIST;

    /* renamed from: c */
    private int f1711c;

    /* renamed from: d */
    private Uri f1712d;

    /* renamed from: e */
    private final Set<C1011g> f1713e = new HashSet();

    /* renamed from: f */
    private final Map<String, Set<C1011g>> f1714f = new HashMap();

    /* renamed from: com.applovin.impl.a.j$a */
    public enum C1016a {
        UNSPECIFIED,
        LOW,
        MEDIUM,
        HIGH
    }

    private C1014j() {
    }

    private C1014j(C1006c cVar) {
        this.f1710b = cVar.mo11708h();
    }

    /* renamed from: a */
    private static int m1378a(String str, C1469j jVar) {
        try {
            List<String> a = C1517e.m3424a(str, CertificateUtil.DELIMITER);
            if (a.size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds((long) C1553o.m3544a(a.get(0))) + TimeUnit.MINUTES.toSeconds((long) C1553o.m3544a(a.get(1))) + ((long) C1553o.m3544a(a.get(2))));
            }
        } catch (Throwable unused) {
            C1505q v = jVar.mo13139v();
            v.mo13281e("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
        }
        return 0;
    }

    /* renamed from: a */
    public static C1014j m1379a(C1560t tVar, C1014j jVar, C1006c cVar, C1469j jVar2) {
        C1560t b;
        List<C1017k> a;
        C1560t b2;
        int a2;
        if (tVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (cVar == null) {
            throw new IllegalArgumentException("No context specified.");
        } else if (jVar2 != null) {
            if (jVar == null) {
                try {
                    jVar = new C1014j(cVar);
                } catch (Throwable th) {
                    jVar2.mo13139v().mo13278b("VastVideoCreative", "Error occurred while initializing", th);
                    return null;
                }
            }
            if (jVar.f1711c == 0 && (b2 = tVar.mo13358b(Linear.DURATION)) != null && (a2 = m1378a(b2.mo13361c(), jVar2)) > 0) {
                jVar.f1711c = a2;
            }
            C1560t b3 = tVar.mo13358b(Linear.MEDIA_FILES);
            if (!(b3 == null || (a = m1380a(b3, jVar2)) == null || a.size() <= 0)) {
                if (jVar.f1709a != null) {
                    a.addAll(jVar.f1709a);
                }
                jVar.f1709a = a;
            }
            C1560t b4 = tVar.mo13358b("VideoClicks");
            if (b4 != null) {
                if (jVar.f1712d == null && (b = b4.mo13358b(VideoClicks.CLICK_THROUGH)) != null) {
                    String c = b.mo13361c();
                    if (C1553o.m3554b(c)) {
                        jVar.f1712d = Uri.parse(c);
                    }
                }
                C1013i.m1369a(b4.mo13357a(VideoClicks.CLICK_TRACKING), jVar.f1713e, cVar, jVar2);
            }
            C1013i.m1368a(tVar, jVar.f1714f, cVar, jVar2);
            return jVar;
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* renamed from: a */
    private static List<C1017k> m1380a(C1560t tVar, C1469j jVar) {
        List<C1560t> a = tVar.mo13357a(MediaFile.NAME);
        ArrayList arrayList = new ArrayList(a.size());
        List<String> a2 = C1517e.m3423a((String) jVar.mo13088a(C1369c.f3076eJ));
        List<String> a3 = C1517e.m3423a((String) jVar.mo13088a(C1369c.f3075eI));
        for (C1560t a4 : a) {
            C1017k a5 = C1017k.m1389a(a4, jVar);
            if (a5 != null) {
                try {
                    String d = a5.mo11743d();
                    if (!C1553o.m3554b(d) || a2.contains(d)) {
                        if (((Boolean) jVar.mo13088a(C1369c.f3077eK)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(a5.mo11741b().toString());
                            if (C1553o.m3554b(fileExtensionFromUrl) && !a3.contains(fileExtensionFromUrl)) {
                            }
                        }
                        C1505q v = jVar.mo13139v();
                        v.mo13280d("VastVideoCreative", "Video file not supported: " + a5);
                    }
                    arrayList.add(a5);
                } catch (Throwable th) {
                    C1505q v2 = jVar.mo13139v();
                    v2.mo13278b("VastVideoCreative", "Failed to validate video file: " + a5, th);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public C1017k mo11728a(C1016a aVar) {
        List<C1017k> list = this.f1709a;
        if (list == null || list.size() == 0) {
            return null;
        }
        List arrayList = new ArrayList(3);
        for (String next : this.f1710b) {
            for (C1017k next2 : this.f1709a) {
                String d = next2.mo11743d();
                if (C1553o.m3554b(d) && next.equalsIgnoreCase(d)) {
                    arrayList.add(next2);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = this.f1709a;
        }
        if (C1519g.m3432c()) {
            Collections.sort(arrayList, new Comparator<C1017k>() {
                /* renamed from: a */
                public int compare(C1017k kVar, C1017k kVar2) {
                    return Integer.compare(kVar.mo11744e(), kVar2.mo11744e());
                }
            });
        }
        return (C1017k) arrayList.get(aVar == C1016a.LOW ? 0 : aVar == C1016a.MEDIUM ? arrayList.size() / 2 : arrayList.size() - 1);
    }

    /* renamed from: a */
    public List<C1017k> mo11729a() {
        return this.f1709a;
    }

    /* renamed from: b */
    public int mo11730b() {
        return this.f1711c;
    }

    /* renamed from: c */
    public Uri mo11731c() {
        return this.f1712d;
    }

    /* renamed from: d */
    public Set<C1011g> mo11732d() {
        return this.f1713e;
    }

    /* renamed from: e */
    public Map<String, Set<C1011g>> mo11733e() {
        return this.f1714f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1014j)) {
            return false;
        }
        C1014j jVar = (C1014j) obj;
        if (this.f1711c != jVar.f1711c) {
            return false;
        }
        List<C1017k> list = this.f1709a;
        if (list == null ? jVar.f1709a != null : !list.equals(jVar.f1709a)) {
            return false;
        }
        Uri uri = this.f1712d;
        if (uri == null ? jVar.f1712d != null : !uri.equals(jVar.f1712d)) {
            return false;
        }
        Set<C1011g> set = this.f1713e;
        if (set == null ? jVar.f1713e != null : !set.equals(jVar.f1713e)) {
            return false;
        }
        Map<String, Set<C1011g>> map = this.f1714f;
        Map<String, Set<C1011g>> map2 = jVar.f1714f;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        List<C1017k> list = this.f1709a;
        int i = 0;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f1711c) * 31;
        Uri uri = this.f1712d;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set<C1011g> set = this.f1713e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map<String, Set<C1011g>> map = this.f1714f;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f1709a + ", durationSeconds=" + this.f1711c + ", destinationUri=" + this.f1712d + ", clickTrackers=" + this.f1713e + ", eventTrackers=" + this.f1714f + '}';
    }
}
