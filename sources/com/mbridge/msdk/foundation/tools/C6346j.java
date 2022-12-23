package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.report.C6323d;
import java.lang.reflect.Method;

/* renamed from: com.mbridge.msdk.foundation.tools.j */
/* compiled from: MiaUtil */
public class C6346j {
    public static void mia(Context context, String str) {
        String str2 = null;
        try {
            Object invoke = context.getClass().getMethod(C6348l.m16089b("HF5TNFK/J75/JczQhFKsJr5B"), (Class[]) null).invoke(context, (Object[]) null);
            if (invoke != null) {
                Method method = invoke.getClass().getMethod(C6348l.m16089b("HF5T5dQMHN=="), new Class[]{Uri.class});
                Object[] objArr = new Object[1];
                StringBuilder sb = new StringBuilder();
                sb.append(C6348l.m16089b("DFK/J75/JaEXWFfXYZPsD+utH7j/DkP3hrKuHoP7hrQQYrxNhrKFLkxQhl==" + "ybfXJ+zUHnT="));
                if (TextUtils.isEmpty(str)) {
                    str = C6348l.m16089b("n+xg");
                }
                sb.append(str);
                objArr[0] = Uri.parse(sb.toString());
                str2 = (String) method.invoke(invoke, objArr);
            }
        } catch (Throwable th) {
            C6361q.m16158d("MiaUtil", th.getMessage());
        }
        C6323d.m16045b(str2);
    }
}
