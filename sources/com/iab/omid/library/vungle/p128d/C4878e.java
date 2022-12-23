package com.iab.omid.library.vungle.p128d;

import android.text.TextUtils;
import com.iab.omid.library.vungle.Omid;
import com.iab.omid.library.vungle.adsession.C4857a;
import com.iab.omid.library.vungle.adsession.CreativeType;
import com.iab.omid.library.vungle.adsession.ImpressionType;
import com.iab.omid.library.vungle.adsession.Owner;

/* renamed from: com.iab.omid.library.vungle.d.e */
public class C4878e {
    /* renamed from: a */
    public static void m10922a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: a */
    public static void m10923a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
        if (owner == Owner.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (creativeType == CreativeType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (impressionType == ImpressionType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: a */
    public static void m10924a(C4857a aVar) {
        if (aVar.mo39656f()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: a */
    public static void m10925a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m10926a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m10927a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static void m10928b(C4857a aVar) {
        if (aVar.mo39657g()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: c */
    public static void m10929c(C4857a aVar) {
        m10934h(aVar);
        m10928b(aVar);
    }

    /* renamed from: d */
    public static void m10930d(C4857a aVar) {
        if (aVar.getAdSessionStatePublisher().mo39753c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* renamed from: e */
    public static void m10931e(C4857a aVar) {
        if (aVar.getAdSessionStatePublisher().mo39754d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }

    /* renamed from: f */
    public static void m10932f(C4857a aVar) {
        if (!aVar.mo39658h()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* renamed from: g */
    public static void m10933g(C4857a aVar) {
        if (!aVar.mo39659i()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    /* renamed from: h */
    private static void m10934h(C4857a aVar) {
        if (!aVar.mo39656f()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }
}
