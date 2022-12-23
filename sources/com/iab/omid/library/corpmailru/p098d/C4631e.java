package com.iab.omid.library.corpmailru.p098d;

import android.text.TextUtils;
import com.iab.omid.library.corpmailru.Omid;
import com.iab.omid.library.corpmailru.adsession.C4610a;
import com.iab.omid.library.corpmailru.adsession.CreativeType;
import com.iab.omid.library.corpmailru.adsession.ImpressionType;
import com.iab.omid.library.corpmailru.adsession.Owner;

/* renamed from: com.iab.omid.library.corpmailru.d.e */
public class C4631e {
    /* renamed from: a */
    public static void m9834a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: a */
    public static void m9835a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
        if (owner == Owner.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (creativeType == CreativeType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (impressionType == ImpressionType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: a */
    public static void m9836a(C4610a aVar) {
        if (aVar.mo38734f()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: a */
    public static void m9837a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m9838a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m9839a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static void m9840b(C4610a aVar) {
        if (aVar.mo38735g()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: c */
    public static void m9841c(C4610a aVar) {
        m9846h(aVar);
        m9840b(aVar);
    }

    /* renamed from: d */
    public static void m9842d(C4610a aVar) {
        if (aVar.getAdSessionStatePublisher().mo38831c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* renamed from: e */
    public static void m9843e(C4610a aVar) {
        if (aVar.getAdSessionStatePublisher().mo38832d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }

    /* renamed from: f */
    public static void m9844f(C4610a aVar) {
        if (!aVar.mo38736h()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* renamed from: g */
    public static void m9845g(C4610a aVar) {
        if (!aVar.mo38737i()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    /* renamed from: h */
    private static void m9846h(C4610a aVar) {
        if (!aVar.mo38734f()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }
}
