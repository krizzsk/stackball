package com.iab.omid.library.oguryco.p116d;

import android.text.TextUtils;
import com.iab.omid.library.oguryco.Omid;
import com.iab.omid.library.oguryco.adsession.C4758a;
import com.iab.omid.library.oguryco.adsession.CreativeType;
import com.iab.omid.library.oguryco.adsession.ImpressionType;
import com.iab.omid.library.oguryco.adsession.Owner;

/* renamed from: com.iab.omid.library.oguryco.d.e */
public class C4780e {
    /* renamed from: a */
    public static void m10494a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: a */
    public static void m10495a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
        if (owner == Owner.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (creativeType == CreativeType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (impressionType == ImpressionType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: a */
    public static void m10496a(C4758a aVar) {
        if (aVar.mo39282f()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: a */
    public static void m10497a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m10498a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m10499a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static void m10500b(C4758a aVar) {
        if (aVar.mo39283g()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: c */
    public static void m10501c(C4758a aVar) {
        m10506h(aVar);
        m10500b(aVar);
    }

    /* renamed from: d */
    public static void m10502d(C4758a aVar) {
        if (aVar.getAdSessionStatePublisher().mo39397c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* renamed from: e */
    public static void m10503e(C4758a aVar) {
        if (aVar.getAdSessionStatePublisher().mo39398d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }

    /* renamed from: f */
    public static void m10504f(C4758a aVar) {
        if (!aVar.mo39284h()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* renamed from: g */
    public static void m10505g(C4758a aVar) {
        if (!aVar.mo39285i()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    /* renamed from: h */
    private static void m10506h(C4758a aVar) {
        if (!aVar.mo39282f()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }
}
