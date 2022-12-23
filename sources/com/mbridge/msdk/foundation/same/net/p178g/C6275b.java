package com.mbridge.msdk.foundation.same.net.p178g;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.foundation.same.net.p174c.C6245b;
import com.mbridge.msdk.foundation.same.net.p179h.C6287d;
import com.mbridge.msdk.foundation.tools.C6369x;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.net.g.b */
/* compiled from: HttpUtils */
public class C6275b {

    /* renamed from: a */
    private static final String f15556a = C6275b.class.getSimpleName();

    /* renamed from: a */
    public static String m15857a(List<C6245b> list) {
        C6245b b = m15860b(list, "Content-Type");
        if (b != null) {
            String b2 = b.mo43826b();
            if (!TextUtils.isEmpty(b2)) {
                String[] split = b2.split(";");
                for (int i = 1; i < split.length; i++) {
                    String[] split2 = split[i].trim().split("=");
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        return split2[1];
                    }
                }
            }
        }
        return "UTF-8";
    }

    /* renamed from: b */
    private static C6245b m15860b(List<C6245b> list, String str) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                C6245b bVar = list.get(i);
                if (bVar != null && str.equals(bVar.mo43825a())) {
                    return bVar;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m15858a(List<C6245b> list, String str) {
        C6245b b = m15860b(list, str);
        return b != null ? b.mo43826b() : "";
    }

    /* renamed from: b */
    public static boolean m15861b(List<C6245b> list) {
        return TextUtils.equals(m15858a(list, HttpHeaders.CONTENT_ENCODING), "gzip");
    }

    /* renamed from: a */
    public static void m15859a(C6287d dVar, String str, String str2) {
        if (dVar != null) {
            try {
                if (C6369x.m16235a(str)) {
                    return;
                }
                if (!C6369x.m16235a(str2)) {
                    dVar.mo43870a(str, str2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
