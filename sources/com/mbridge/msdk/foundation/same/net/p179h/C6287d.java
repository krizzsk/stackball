package com.mbridge.msdk.foundation.same.net.p179h;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.p174c.C6244a;
import com.mbridge.msdk.foundation.tools.C6361q;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.Typography;

/* renamed from: com.mbridge.msdk.foundation.same.net.h.d */
/* compiled from: CommonRequestParams */
public final class C6287d {

    /* renamed from: a */
    public static String f15598a = CampaignUnit.JSON_KEY_SESSION_ID;

    /* renamed from: b */
    public static String f15599b = "d";

    /* renamed from: c */
    public static String f15600c = "e";

    /* renamed from: d */
    public static String f15601d = InneractiveMediationDefs.GENDER_FEMALE;

    /* renamed from: e */
    public static String f15602e = "g";

    /* renamed from: f */
    public static String f15603f = "h";

    /* renamed from: g */
    public static String f15604g = "i";

    /* renamed from: h */
    private static final String f15605h = C6287d.class.getSimpleName();

    /* renamed from: i */
    private Map<String, String> f15606i = new LinkedHashMap();

    /* renamed from: j */
    private Map<String, C6244a> f15607j = new LinkedHashMap();

    /* renamed from: a */
    public final void mo43870a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && str2 != null) {
            this.f15606i.put(str, str2);
        }
    }

    /* renamed from: a */
    public final String mo43868a() {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry next : this.f15606i.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(Typography.amp);
                }
                sb.append(URLEncoder.encode((String) next.getKey(), "UTF-8"));
                sb.append("=");
                sb.append(URLEncoder.encode((String) next.getValue(), "UTF-8"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo43869a(String str) {
        this.f15606i.remove(str);
        this.f15607j.remove(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(28);
        try {
            for (Map.Entry next : this.f15606i.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(Typography.amp);
                }
                sb.append(URLEncoder.encode((String) next.getKey(), "UTF-8"));
                sb.append('=');
                sb.append(URLEncoder.encode((String) next.getValue(), "UTF-8"));
            }
            for (Map.Entry next2 : this.f15607j.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(Typography.amp);
                }
                sb.append(URLEncoder.encode((String) next2.getKey(), "UTF-8"));
                sb.append('=');
                sb.append(URLEncoder.encode("FILE_NAME_" + ((C6244a) next2.getValue()).mo43824a().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException e) {
            C6361q.m16158d(f15605h, e.getMessage());
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final Map<String, String> mo43871b() {
        return this.f15606i;
    }
}
