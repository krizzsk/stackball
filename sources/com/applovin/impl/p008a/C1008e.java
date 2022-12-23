package com.applovin.impl.p008a;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1560t;

/* renamed from: com.applovin.impl.a.e */
public class C1008e {

    /* renamed from: a */
    private C1009a f1691a;

    /* renamed from: b */
    private Uri f1692b;

    /* renamed from: c */
    private String f1693c;

    /* renamed from: com.applovin.impl.a.e$a */
    public enum C1009a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private C1008e() {
    }

    /* renamed from: a */
    static C1008e m1346a(C1560t tVar, C1008e eVar, C1469j jVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (jVar != null) {
            if (eVar == null) {
                try {
                    eVar = new C1008e();
                } catch (Throwable th) {
                    jVar.mo13139v().mo13278b("VastNonVideoResource", "Error occurred while initializing", th);
                    return null;
                }
            }
            if (eVar.f1692b == null && !C1553o.m3554b(eVar.f1693c)) {
                String a = m1347a(tVar, "StaticResource");
                if (URLUtil.isValidUrl(a)) {
                    eVar.f1692b = Uri.parse(a);
                    eVar.f1691a = C1009a.STATIC;
                    return eVar;
                }
                String a2 = m1347a(tVar, "IFrameResource");
                if (C1553o.m3554b(a2)) {
                    eVar.f1691a = C1009a.IFRAME;
                    if (URLUtil.isValidUrl(a2)) {
                        eVar.f1692b = Uri.parse(a2);
                    } else {
                        eVar.f1693c = a2;
                    }
                    return eVar;
                }
                String a3 = m1347a(tVar, "HTMLResource");
                if (C1553o.m3554b(a3)) {
                    eVar.f1691a = C1009a.HTML;
                    if (URLUtil.isValidUrl(a3)) {
                        eVar.f1692b = Uri.parse(a3);
                    } else {
                        eVar.f1693c = a3;
                    }
                }
            }
            return eVar;
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* renamed from: a */
    private static String m1347a(C1560t tVar, String str) {
        C1560t b = tVar.mo13358b(str);
        if (b != null) {
            return b.mo13361c();
        }
        return null;
    }

    /* renamed from: a */
    public C1009a mo11711a() {
        return this.f1691a;
    }

    /* renamed from: a */
    public void mo11712a(Uri uri) {
        this.f1692b = uri;
    }

    /* renamed from: a */
    public void mo11713a(String str) {
        this.f1693c = str;
    }

    /* renamed from: b */
    public Uri mo11714b() {
        return this.f1692b;
    }

    /* renamed from: c */
    public String mo11715c() {
        return this.f1693c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1008e)) {
            return false;
        }
        C1008e eVar = (C1008e) obj;
        if (this.f1691a != eVar.f1691a) {
            return false;
        }
        Uri uri = this.f1692b;
        if (uri == null ? eVar.f1692b != null : !uri.equals(eVar.f1692b)) {
            return false;
        }
        String str = this.f1693c;
        String str2 = eVar.f1693c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        C1009a aVar = this.f1691a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.f1692b;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.f1693c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "VastNonVideoResource{type=" + this.f1691a + ", resourceUri=" + this.f1692b + ", resourceContents='" + this.f1693c + '\'' + '}';
    }
}
