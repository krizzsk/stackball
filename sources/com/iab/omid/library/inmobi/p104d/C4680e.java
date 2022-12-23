package com.iab.omid.library.inmobi.p104d;

import android.text.TextUtils;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.C4660a;
import com.iab.omid.library.inmobi.adsession.Owner;

/* renamed from: com.iab.omid.library.inmobi.d.e */
public class C4680e {
    /* renamed from: a */
    public static void m10051a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: a */
    public static void m10052a(Owner owner) {
        if (owner.equals(Owner.NONE)) {
            throw new IllegalArgumentException("Impression owner is none");
        }
    }

    /* renamed from: a */
    public static void m10053a(C4660a aVar) {
        if (aVar.mo38925e()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: a */
    public static void m10054a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m10055a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m10056a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static void m10057b(C4660a aVar) {
        if (aVar.mo38926f()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: c */
    public static void m10058c(C4660a aVar) {
        m10063h(aVar);
        m10057b(aVar);
    }

    /* renamed from: d */
    public static void m10059d(C4660a aVar) {
        if (aVar.getAdSessionStatePublisher().mo39001c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* renamed from: e */
    public static void m10060e(C4660a aVar) {
        if (aVar.getAdSessionStatePublisher().mo39002d() != null) {
            throw new IllegalStateException("VideoEvents already exists for AdSession");
        }
    }

    /* renamed from: f */
    public static void m10061f(C4660a aVar) {
        if (!aVar.mo38927g()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* renamed from: g */
    public static void m10062g(C4660a aVar) {
        if (!aVar.mo38928h()) {
            throw new IllegalStateException("Cannot create VideoEvents for JavaScript AdSession");
        }
    }

    /* renamed from: h */
    private static void m10063h(C4660a aVar) {
        if (!aVar.mo38925e()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }
}
