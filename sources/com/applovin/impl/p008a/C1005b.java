package com.applovin.impl.p008a;

import android.net.Uri;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1560t;
import com.smaato.sdk.video.vast.model.Companion;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.a.b */
public class C1005b {

    /* renamed from: a */
    private int f1663a;

    /* renamed from: b */
    private int f1664b;

    /* renamed from: c */
    private Uri f1665c;

    /* renamed from: d */
    private C1008e f1666d;

    /* renamed from: e */
    private Set<C1011g> f1667e = new HashSet();

    /* renamed from: f */
    private Map<String, Set<C1011g>> f1668f = new HashMap();

    private C1005b() {
    }

    /* renamed from: a */
    public static C1005b m1331a(C1560t tVar, C1005b bVar, C1006c cVar, C1469j jVar) {
        C1560t b;
        if (tVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (jVar != null) {
            if (bVar == null) {
                try {
                    bVar = new C1005b();
                } catch (Throwable th) {
                    jVar.mo13139v().mo13278b("VastCompanionAd", "Error occurred while initializing", th);
                    return null;
                }
            }
            if (bVar.f1663a == 0 && bVar.f1664b == 0) {
                int a = C1553o.m3544a(tVar.mo13359b().get("width"));
                int a2 = C1553o.m3544a(tVar.mo13359b().get("height"));
                if (a > 0 && a2 > 0) {
                    bVar.f1663a = a;
                    bVar.f1664b = a2;
                }
            }
            bVar.f1666d = C1008e.m1346a(tVar, bVar.f1666d, jVar);
            if (bVar.f1665c == null && (b = tVar.mo13358b(Companion.COMPANION_CLICK_THROUGH)) != null) {
                String c = b.mo13361c();
                if (C1553o.m3554b(c)) {
                    bVar.f1665c = Uri.parse(c);
                }
            }
            C1013i.m1369a(tVar.mo13357a(Companion.COMPANION_CLICK_TRACKING), bVar.f1667e, cVar, jVar);
            C1013i.m1368a(tVar, bVar.f1668f, cVar, jVar);
            return bVar;
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* renamed from: a */
    public Uri mo11694a() {
        return this.f1665c;
    }

    /* renamed from: b */
    public C1008e mo11695b() {
        return this.f1666d;
    }

    /* renamed from: c */
    public Set<C1011g> mo11696c() {
        return this.f1667e;
    }

    /* renamed from: d */
    public Map<String, Set<C1011g>> mo11697d() {
        return this.f1668f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1005b)) {
            return false;
        }
        C1005b bVar = (C1005b) obj;
        if (this.f1663a != bVar.f1663a || this.f1664b != bVar.f1664b) {
            return false;
        }
        Uri uri = this.f1665c;
        if (uri == null ? bVar.f1665c != null : !uri.equals(bVar.f1665c)) {
            return false;
        }
        C1008e eVar = this.f1666d;
        if (eVar == null ? bVar.f1666d != null : !eVar.equals(bVar.f1666d)) {
            return false;
        }
        Set<C1011g> set = this.f1667e;
        if (set == null ? bVar.f1667e != null : !set.equals(bVar.f1667e)) {
            return false;
        }
        Map<String, Set<C1011g>> map = this.f1668f;
        Map<String, Set<C1011g>> map2 = bVar.f1668f;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        int i = ((this.f1663a * 31) + this.f1664b) * 31;
        Uri uri = this.f1665c;
        int i2 = 0;
        int hashCode = (i + (uri != null ? uri.hashCode() : 0)) * 31;
        C1008e eVar = this.f1666d;
        int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        Set<C1011g> set = this.f1667e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map<String, Set<C1011g>> map = this.f1668f;
        if (map != null) {
            i2 = map.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f1663a + ", height=" + this.f1664b + ", destinationUri=" + this.f1665c + ", nonVideoResource=" + this.f1666d + ", clickTrackers=" + this.f1667e + ", eventTrackers=" + this.f1668f + '}';
    }
}
