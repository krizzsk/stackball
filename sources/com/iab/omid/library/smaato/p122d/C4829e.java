package com.iab.omid.library.smaato.p122d;

import android.text.TextUtils;
import com.iab.omid.library.smaato.Omid;
import com.iab.omid.library.smaato.adsession.C4809a;
import com.iab.omid.library.smaato.adsession.Owner;

/* renamed from: com.iab.omid.library.smaato.d.e */
public class C4829e {
    /* renamed from: a */
    public static void m10709a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: a */
    public static void m10710a(Owner owner) {
        if (owner.equals(Owner.NONE)) {
            throw new IllegalArgumentException("Impression owner is none");
        }
    }

    /* renamed from: a */
    public static void m10711a(C4809a aVar) {
        if (aVar.mo39491e()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: a */
    public static void m10712a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m10713a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m10714a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static void m10715b(C4809a aVar) {
        if (aVar.mo39492f()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: c */
    public static void m10716c(C4809a aVar) {
        m10721h(aVar);
        m10715b(aVar);
    }

    /* renamed from: d */
    public static void m10717d(C4809a aVar) {
        if (aVar.getAdSessionStatePublisher().mo39566c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* renamed from: e */
    public static void m10718e(C4809a aVar) {
        if (aVar.getAdSessionStatePublisher().mo39567d() != null) {
            throw new IllegalStateException("VideoEvents already exists for AdSession");
        }
    }

    /* renamed from: f */
    public static void m10719f(C4809a aVar) {
        if (!aVar.mo39493g()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* renamed from: g */
    public static void m10720g(C4809a aVar) {
        if (!aVar.mo39494h()) {
            throw new IllegalStateException("Cannot create VideoEvents for JavaScript AdSession");
        }
    }

    /* renamed from: h */
    private static void m10721h(C4809a aVar) {
        if (!aVar.mo39491e()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }
}
