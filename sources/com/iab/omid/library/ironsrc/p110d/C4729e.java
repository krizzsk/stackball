package com.iab.omid.library.ironsrc.p110d;

import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.C4708a;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;

/* renamed from: com.iab.omid.library.ironsrc.d.e */
public class C4729e {
    /* renamed from: a */
    public static void m10265a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: a */
    public static void m10266a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
        if (owner == Owner.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (creativeType == CreativeType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (impressionType == ImpressionType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: a */
    public static void m10267a(C4708a aVar) {
        if (aVar.mo39094f()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: a */
    public static void m10268a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m10269a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m10270a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static void m10271b(C4708a aVar) {
        if (aVar.mo39095g()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: c */
    public static void m10272c(C4708a aVar) {
        m10277h(aVar);
        m10271b(aVar);
    }

    /* renamed from: d */
    public static void m10273d(C4708a aVar) {
        if (aVar.getAdSessionStatePublisher().mo39183c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* renamed from: e */
    public static void m10274e(C4708a aVar) {
        if (aVar.getAdSessionStatePublisher().mo39184d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }

    /* renamed from: f */
    public static void m10275f(C4708a aVar) {
        if (!aVar.mo39096h()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* renamed from: g */
    public static void m10276g(C4708a aVar) {
        if (!aVar.mo39097i()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    /* renamed from: h */
    private static void m10277h(C4708a aVar) {
        if (!aVar.mo39094f()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }
}
