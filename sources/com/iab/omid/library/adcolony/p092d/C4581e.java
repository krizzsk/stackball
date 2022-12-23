package com.iab.omid.library.adcolony.p092d;

import android.text.TextUtils;
import com.iab.omid.library.adcolony.Omid;
import com.iab.omid.library.adcolony.adsession.C4560a;
import com.iab.omid.library.adcolony.adsession.CreativeType;
import com.iab.omid.library.adcolony.adsession.ImpressionType;
import com.iab.omid.library.adcolony.adsession.Owner;

/* renamed from: com.iab.omid.library.adcolony.d.e */
public class C4581e {
    /* renamed from: a */
    public static void m9610a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: a */
    public static void m9611a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
        if (owner == Owner.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (creativeType == CreativeType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (impressionType == ImpressionType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: a */
    public static void m9612a(C4560a aVar) {
        if (aVar.mo38548f()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: a */
    public static void m9613a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m9614a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m9615a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static void m9616b(C4560a aVar) {
        if (aVar.mo38549g()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: c */
    public static void m9617c(C4560a aVar) {
        m9622h(aVar);
        m9616b(aVar);
    }

    /* renamed from: d */
    public static void m9618d(C4560a aVar) {
        if (aVar.getAdSessionStatePublisher().mo38637c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* renamed from: e */
    public static void m9619e(C4560a aVar) {
        if (aVar.getAdSessionStatePublisher().mo38638d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }

    /* renamed from: f */
    public static void m9620f(C4560a aVar) {
        if (!aVar.mo38550h()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* renamed from: g */
    public static void m9621g(C4560a aVar) {
        if (!aVar.mo38551i()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    /* renamed from: h */
    private static void m9622h(C4560a aVar) {
        if (!aVar.mo38548f()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }
}
