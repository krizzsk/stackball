package com.ogury.p245ed.internal;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;

/* renamed from: com.ogury.ed.internal.jk */
public final class C8365jk {
    /* renamed from: a */
    public static final void m23714a(C8362jh jhVar, String str) {
        C8467mq.m23881b(jhVar, "<this>");
        C8467mq.m23881b(str, "javascript");
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(C8296hn.m23337b(jhVar));
            sb.append(" >> ");
            sb.append(str);
            jhVar.loadUrl(C8467mq.m23873a("javascript:", (Object) str));
        } catch (Throwable th) {
            C8129da daVar = C8129da.f21066a;
            C8129da.m22652a(th);
        }
    }

    /* renamed from: a */
    public static final void m23713a(C8362jh jhVar, C8185eb ebVar) {
        C8467mq.m23881b(jhVar, "<this>");
        C8467mq.m23881b(ebVar, "ad");
        boolean z = true;
        String h = ebVar.mo53355h().length() > 0 ? ebVar.mo53355h() : "http://ads-test.st.ogury.com/";
        if (ebVar.mo53341c().length() <= 0) {
            z = false;
        }
        try {
            jhVar.loadDataWithBaseURL(h, z ? ebVar.mo53341c() : "The ad contains no ad_content", WebRequest.CONTENT_TYPE_HTML, "UTF-8", (String) null);
        } catch (Throwable th) {
            C8129da daVar = C8129da.f21066a;
            C8129da.m22652a(th);
        }
    }

    /* renamed from: a */
    public static final C8362jh m23712a(Context context, C8185eb ebVar) {
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(ebVar, "ad");
        try {
            C8362jh jhVar = new C8362jh(context, ebVar);
            jhVar.setBackgroundColor(0);
            if (Build.VERSION.SDK_INT >= 19) {
                jhVar.setLayerType(2, (Paint) null);
            }
            return jhVar;
        } catch (Throwable th) {
            C8129da daVar = C8129da.f21066a;
            C8129da.m22652a(th);
            return null;
        }
    }
}
