package com.applovin.impl.p008a;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1560t;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.Locale;

/* renamed from: com.applovin.impl.a.k */
public class C1017k {

    /* renamed from: a */
    private Uri f1721a;

    /* renamed from: b */
    private Uri f1722b;

    /* renamed from: c */
    private C1018a f1723c;

    /* renamed from: d */
    private String f1724d;

    /* renamed from: e */
    private int f1725e;

    /* renamed from: f */
    private int f1726f;

    /* renamed from: g */
    private int f1727g;

    /* renamed from: com.applovin.impl.a.k$a */
    public enum C1018a {
        Progressive,
        Streaming
    }

    private C1017k() {
    }

    /* renamed from: a */
    private static C1018a m1388a(String str) {
        if (C1553o.m3554b(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return C1018a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return C1018a.Streaming;
            }
        }
        return C1018a.Progressive;
    }

    /* renamed from: a */
    public static C1017k m1389a(C1560t tVar, C1469j jVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (jVar != null) {
            try {
                String c = tVar.mo13361c();
                if (URLUtil.isValidUrl(c)) {
                    Uri parse = Uri.parse(c);
                    C1017k kVar = new C1017k();
                    kVar.f1721a = parse;
                    kVar.f1722b = parse;
                    kVar.f1727g = C1553o.m3544a(tVar.mo13359b().get(MediaFile.BITRATE));
                    kVar.f1723c = m1388a(tVar.mo13359b().get(MediaFile.DELIVERY));
                    kVar.f1726f = C1553o.m3544a(tVar.mo13359b().get("height"));
                    kVar.f1725e = C1553o.m3544a(tVar.mo13359b().get("width"));
                    kVar.f1724d = tVar.mo13359b().get("type").toLowerCase(Locale.ENGLISH);
                    return kVar;
                }
                jVar.mo13139v().mo13281e("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            } catch (Throwable th) {
                jVar.mo13139v().mo13278b("VastVideoFile", "Error occurred while initializing", th);
                return null;
            }
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* renamed from: a */
    public Uri mo11739a() {
        return this.f1721a;
    }

    /* renamed from: a */
    public void mo11740a(Uri uri) {
        this.f1722b = uri;
    }

    /* renamed from: b */
    public Uri mo11741b() {
        return this.f1722b;
    }

    /* renamed from: c */
    public boolean mo11742c() {
        return this.f1723c == C1018a.Streaming;
    }

    /* renamed from: d */
    public String mo11743d() {
        return this.f1724d;
    }

    /* renamed from: e */
    public int mo11744e() {
        return this.f1727g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1017k)) {
            return false;
        }
        C1017k kVar = (C1017k) obj;
        if (this.f1725e != kVar.f1725e || this.f1726f != kVar.f1726f || this.f1727g != kVar.f1727g) {
            return false;
        }
        Uri uri = this.f1721a;
        if (uri == null ? kVar.f1721a != null : !uri.equals(kVar.f1721a)) {
            return false;
        }
        Uri uri2 = this.f1722b;
        if (uri2 == null ? kVar.f1722b != null : !uri2.equals(kVar.f1722b)) {
            return false;
        }
        if (this.f1723c != kVar.f1723c) {
            return false;
        }
        String str = this.f1724d;
        String str2 = kVar.f1724d;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        Uri uri = this.f1721a;
        int i = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f1722b;
        int hashCode2 = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        C1018a aVar = this.f1723c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f1724d;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((((hashCode3 + i) * 31) + this.f1725e) * 31) + this.f1726f) * 31) + this.f1727g;
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f1721a + ", videoUri=" + this.f1722b + ", deliveryType=" + this.f1723c + ", fileType='" + this.f1724d + '\'' + ", width=" + this.f1725e + ", height=" + this.f1726f + ", bitrate=" + this.f1727g + '}';
    }
}
