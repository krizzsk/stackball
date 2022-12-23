package com.tapjoy.internal;

import com.appsflyer.ServerParameters;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.tapjoy.internal.hr */
public final class C9382hr extends C9381hq {

    /* renamed from: d */
    public static final C9093bi f23249d = new C9093bi() {
        /* renamed from: a */
        public final /* synthetic */ Object mo57847a(C9101bn bnVar) {
            return new C9382hr(bnVar);
        }
    };

    /* renamed from: a */
    public ArrayList f23250a = new ArrayList();

    /* renamed from: b */
    public Map f23251b;

    /* renamed from: c */
    public float f23252c;

    public C9382hr(C9101bn bnVar) {
        bnVar.mo57868h();
        String str = null;
        String str2 = null;
        while (bnVar.mo57870j()) {
            String l = bnVar.mo57872l();
            if ("layouts".equals(l)) {
                bnVar.mo57854a((List) this.f23250a, C9403ia.f23320d);
            } else if (ServerParameters.META.equals(l)) {
                this.f23251b = bnVar.mo57860d();
            } else if ("max_show_time".equals(l)) {
                this.f23252c = (float) bnVar.mo57876p();
            } else if ("ad_content".equals(l)) {
                str = bnVar.mo57857b();
            } else if (TapjoyConstants.TJC_REDIRECT_URL.equals(l)) {
                str2 = bnVar.mo57857b();
            } else {
                bnVar.mo57879s();
            }
        }
        bnVar.mo57869i();
        ArrayList arrayList = this.f23250a;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C9403ia iaVar = (C9403ia) it.next();
                if (iaVar.f23323c != null) {
                    Iterator it2 = iaVar.f23323c.iterator();
                    while (it2.hasNext()) {
                        C9400hz hzVar = (C9400hz) it2.next();
                        if (hzVar.f23314i == null) {
                            hzVar.f23314i = str;
                        }
                        if (hzVar.f23313h == null) {
                            hzVar.f23313h = str2;
                        }
                    }
                }
            }
        }
    }
}
