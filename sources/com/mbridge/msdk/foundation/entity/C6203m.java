package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C6129a;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.entity.m */
/* compiled from: VideoReportData */
public final class C6203m {

    /* renamed from: a */
    public static int f15357a = 1;

    /* renamed from: b */
    public static int f15358b;

    /* renamed from: A */
    private String f15359A;

    /* renamed from: B */
    private String f15360B;

    /* renamed from: C */
    private String f15361C;

    /* renamed from: D */
    private String f15362D;

    /* renamed from: E */
    private String f15363E;

    /* renamed from: F */
    private String f15364F;

    /* renamed from: G */
    private String f15365G;

    /* renamed from: H */
    private int f15366H = 0;

    /* renamed from: c */
    private String f15367c;

    /* renamed from: d */
    private String f15368d;

    /* renamed from: e */
    private String f15369e;

    /* renamed from: f */
    private String f15370f;

    /* renamed from: g */
    private int f15371g;

    /* renamed from: h */
    private String f15372h;

    /* renamed from: i */
    private int f15373i;

    /* renamed from: j */
    private int f15374j;

    /* renamed from: k */
    private int f15375k;

    /* renamed from: l */
    private String f15376l;

    /* renamed from: m */
    private String f15377m;

    /* renamed from: n */
    private int f15378n;

    /* renamed from: o */
    private int f15379o;

    /* renamed from: p */
    private String f15380p;

    /* renamed from: q */
    private long f15381q;

    /* renamed from: r */
    private int f15382r = 0;

    /* renamed from: s */
    private String f15383s;

    /* renamed from: t */
    private String f15384t;

    /* renamed from: u */
    private String f15385u;

    /* renamed from: v */
    private String f15386v;

    /* renamed from: w */
    private String f15387w;

    /* renamed from: x */
    private String f15388x;

    /* renamed from: y */
    private String f15389y;

    /* renamed from: z */
    private String f15390z;

    /* renamed from: a */
    public final String mo43717a() {
        return this.f15367c;
    }

    /* renamed from: a */
    public final void mo43719a(String str) {
        this.f15367c = str;
    }

    /* renamed from: b */
    public final String mo43720b() {
        return this.f15368d;
    }

    /* renamed from: b */
    public final void mo43722b(String str) {
        this.f15368d = str;
    }

    /* renamed from: c */
    public final String mo43723c() {
        return this.f15369e;
    }

    /* renamed from: c */
    public final void mo43725c(String str) {
        this.f15369e = URLEncoder.encode(str);
    }

    /* renamed from: d */
    public final String mo43726d() {
        return this.f15364F;
    }

    /* renamed from: d */
    public final void mo43727d(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f15364F = URLEncoder.encode(str, "utf-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public final String mo43728e() {
        return this.f15363E;
    }

    /* renamed from: e */
    public final void mo43729e(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f15363E = URLEncoder.encode(str, "utf-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    public final String mo43730f() {
        return this.f15362D;
    }

    /* renamed from: f */
    public final void mo43731f(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f15362D = URLEncoder.encode(str, "utf-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    public final String mo43732g() {
        return this.f15361C;
    }

    /* renamed from: g */
    public final void mo43733g(String str) {
        this.f15361C = str;
    }

    /* renamed from: h */
    public final String mo43734h() {
        return this.f15365G;
    }

    /* renamed from: h */
    public final void mo43735h(String str) {
        this.f15365G = str;
    }

    /* renamed from: i */
    public final String mo43736i() {
        return this.f15387w;
    }

    /* renamed from: i */
    public final void mo43737i(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f15387w = URLEncoder.encode(str, "utf-8");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: j */
    public final void mo43739j(String str) {
        this.f15389y = str;
    }

    /* renamed from: a */
    public final void mo43718a(int i) {
        this.f15366H = i;
    }

    public C6203m(String str, int i, int i2, int i3, int i4, String str2, String str3, int i5, String str4, int i6, String str5) {
        this.f15370f = str;
        this.f15371g = i;
        this.f15372h = str5;
        this.f15373i = i2;
        this.f15374j = i3;
        this.f15375k = i4;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f15376l = URLEncoder.encode(str2, "utf-8");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.f15377m = str3;
        this.f15379o = i5;
        this.f15380p = str4;
        this.f15381q = (long) i6;
    }

    public C6203m() {
    }

    public C6203m(String str, int i, String str2, String str3, String str4) {
        this.f15370f = str;
        this.f15372h = str4;
        this.f15371g = i;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f15376l = URLEncoder.encode(str2, "utf-8");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.f15377m = str3;
    }

    public C6203m(String str, int i, int i2, String str2, int i3, String str3, int i4, String str4) {
        this.f15370f = str;
        this.f15371g = i;
        this.f15372h = str4;
        this.f15375k = i2;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f15376l = URLEncoder.encode(str2, "utf-8");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.f15379o = i3;
        this.f15380p = str3;
        this.f15381q = (long) i4;
    }

    public C6203m(Context context, CampaignEx campaignEx, int i, String str, long j, int i2) {
        if (i2 == 1) {
            this.f15370f = "2000022";
        } else if (i2 == 287 || i2 == 94) {
            this.f15370f = "2000022";
        } else if (i2 == 95) {
            this.f15370f = "2000025";
        }
        int n = C6349m.m16123n(context);
        this.f15371g = n;
        this.f15372h = C6349m.m16092a(context, n);
        this.f15375k = campaignEx.getVideoLength();
        try {
            this.f15376l = URLEncoder.encode(campaignEx.getNoticeUrl() == null ? campaignEx.getClickURL() : campaignEx.getNoticeUrl(), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f15379o = i;
        this.f15380p = str;
        this.f15381q = j == 0 ? (long) campaignEx.getVideoSize() : j;
    }

    public C6203m(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7) {
        this.f15370f = str;
        this.f15390z = str2;
        this.f15388x = str3;
        this.f15359A = str4;
        this.f15385u = str5;
        this.f15386v = str6;
        this.f15371g = i;
        this.f15372h = str7;
    }

    public C6203m(String str) {
        this.f15360B = str;
    }

    public C6203m(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f15370f = str;
        this.f15379o = i;
        this.f15380p = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.f15362D = URLEncoder.encode(str3, "utf-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f15386v = str4;
        this.f15385u = str5;
        this.f15377m = str6;
        this.f15361C = str7;
        if (Integer.valueOf(str2).intValue() > 60000) {
            this.f15379o = 2;
        }
    }

    public C6203m(String str, String str2, String str3, String str4, String str5, int i) {
        this.f15370f = str;
        this.f15386v = str2;
        this.f15383s = str3;
        this.f15384t = str4;
        this.f15385u = str5;
        this.f15371g = i;
    }

    public C6203m(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6) {
        this.f15370f = str;
        this.f15386v = str2;
        this.f15383s = str3;
        this.f15384t = str4;
        this.f15385u = str5;
        this.f15371g = i;
        this.f15377m = str6;
        this.f15378n = i2;
    }

    /* renamed from: j */
    public final String mo43738j() {
        return this.f15383s;
    }

    /* renamed from: k */
    public final void mo43741k(String str) {
        this.f15383s = str;
    }

    /* renamed from: k */
    public final String mo43740k() {
        return this.f15384t;
    }

    /* renamed from: l */
    public final void mo43743l(String str) {
        this.f15384t = str;
    }

    /* renamed from: l */
    public final String mo43742l() {
        return this.f15385u;
    }

    /* renamed from: m */
    public final void mo43745m(String str) {
        this.f15385u = str;
    }

    /* renamed from: m */
    public final String mo43744m() {
        return this.f15386v;
    }

    /* renamed from: n */
    public final void mo43747n(String str) {
        this.f15386v = str;
    }

    /* renamed from: n */
    public final String mo43746n() {
        return this.f15370f;
    }

    /* renamed from: o */
    public final void mo43749o(String str) {
        this.f15370f = str;
    }

    /* renamed from: o */
    public final int mo43748o() {
        return this.f15374j;
    }

    /* renamed from: p */
    public final int mo43750p() {
        return this.f15375k;
    }

    /* renamed from: q */
    public final String mo43752q() {
        return this.f15376l;
    }

    /* renamed from: r */
    public final String mo43754r() {
        return this.f15377m;
    }

    /* renamed from: p */
    public final void mo43751p(String str) {
        this.f15377m = str;
    }

    /* renamed from: s */
    public final String mo43756s() {
        return this.f15380p;
    }

    /* renamed from: q */
    public final void mo43753q(String str) {
        this.f15380p = str;
    }

    /* renamed from: t */
    public final long mo43757t() {
        return this.f15381q;
    }

    /* renamed from: u */
    public final int mo43759u() {
        return this.f15371g;
    }

    /* renamed from: b */
    public final void mo43721b(int i) {
        this.f15371g = i;
    }

    /* renamed from: v */
    public final String mo43760v() {
        return this.f15372h;
    }

    /* renamed from: r */
    public final void mo43755r(String str) {
        this.f15372h = str;
    }

    /* renamed from: w */
    public final int mo43761w() {
        return this.f15373i;
    }

    /* renamed from: x */
    public final int mo43762x() {
        return this.f15379o;
    }

    /* renamed from: c */
    public final void mo43724c(int i) {
        this.f15379o = i;
    }

    /* renamed from: a */
    public static String m15625a(List<C6203m> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (C6203m next : list) {
            stringBuffer.append("key=" + next.f15370f + "&");
            stringBuffer.append("resource_type=" + next.f15367c + "&");
            stringBuffer.append("unit_id=" + next.f15385u + "&");
            StringBuilder sb = new StringBuilder();
            sb.append("ad_type=");
            sb.append(next.f15365G);
            stringBuffer.append(sb.toString());
            stringBuffer.append("cid=" + next.f15386v + "&");
            stringBuffer.append("rid=" + next.f15383s + "&");
            stringBuffer.append("rid_n=" + next.f15384t + "&");
            stringBuffer.append("reason=" + next.f15377m + "&");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("creative=");
            sb2.append(next.f15369e);
            stringBuffer.append(sb2.toString());
            if (C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                stringBuffer.append("devid=" + next.f15368d + "&");
            }
            if (C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("network_type=" + next.f15371g + "&");
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static String m15627b(List<C6203m> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (C6203m next : list) {
            if (C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + next.f15370f + "&");
                stringBuffer.append("network_type=" + next.f15371g + "&");
                stringBuffer.append("network_str=" + next.f15372h + "&");
                stringBuffer.append("reason=" + next.f15377m + "&");
                stringBuffer.append("cid=" + next.f15386v + "&");
                stringBuffer.append("video_url=" + next.f15363E + "&");
                stringBuffer.append("rid=" + next.f15383s + "&");
                stringBuffer.append("rid_n=" + next.f15384t + "&");
                stringBuffer.append("unit_id=" + next.f15385u + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("offer_url=");
                sb.append(next.f15376l);
                stringBuffer.append(sb.toString());
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + next.f15370f + "&");
                stringBuffer.append("reason=" + next.f15377m + "&");
                stringBuffer.append("cid=" + next.f15386v + "&");
                stringBuffer.append("video_url=" + next.f15363E + "&");
                stringBuffer.append("rid=" + next.f15383s + "&");
                stringBuffer.append("rid_n=" + next.f15384t + "&");
                stringBuffer.append("unit_id=" + next.f15385u + "&");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("offer_url=");
                sb2.append(next.f15376l);
                stringBuffer.append(sb2.toString());
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: c */
    public static String m15629c(List<C6203m> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<C6203m> it = list.iterator();
        while (it.hasNext()) {
            C6203m next = it.next();
            Iterator<C6203m> it2 = it;
            if (C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + next.f15370f + "&");
                stringBuffer.append("network_type=" + next.f15371g + "&");
                stringBuffer.append("network_str=" + next.f15372h + "&");
                stringBuffer.append("result=" + next.f15379o + "&");
                stringBuffer.append("duration=" + next.f15380p + "&");
                stringBuffer.append("video_size=" + next.f15381q + "&");
                stringBuffer.append("video_length=" + next.f15375k + "&");
                stringBuffer.append("reason=" + next.f15377m + "&");
                stringBuffer.append("cid=" + next.f15386v + "&");
                stringBuffer.append("video_url=" + next.f15363E + "&");
                stringBuffer.append("rid=" + next.f15383s + "&");
                stringBuffer.append("rid_n=" + next.f15384t + "&");
                stringBuffer.append("unit_id=" + next.f15385u + "&");
                stringBuffer.append("offer_url=" + next.f15376l + "&");
            } else {
                stringBuffer.append("key=" + next.f15370f + "&");
                stringBuffer.append("result=" + next.f15379o + "&");
                stringBuffer.append("duration=" + next.f15380p + "&");
                stringBuffer.append("video_size=" + next.f15381q + "&");
                stringBuffer.append("video_length=" + next.f15375k + "&");
                stringBuffer.append("reason=" + next.f15377m + "&");
                stringBuffer.append("cid=" + next.f15386v + "&");
                stringBuffer.append("video_url=" + next.f15363E + "&");
                stringBuffer.append("rid=" + next.f15383s + "&");
                stringBuffer.append("rid_n=" + next.f15384t + "&");
                stringBuffer.append("unit_id=" + next.f15385u + "&");
                stringBuffer.append("offer_url=" + next.f15376l + "&");
            }
            if (next.f15367c != null) {
                stringBuffer.append("resource_type=" + next.f15367c + "&");
            }
            if (next.f15369e != null) {
                stringBuffer.append("creative=" + next.f15369e + "&");
            }
            stringBuffer.append("\n");
            it = it2;
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m15624a(C6203m mVar) {
        if (mVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + mVar.f15370f + "&");
        stringBuffer.append("cid=" + mVar.f15386v + "&");
        stringBuffer.append("unit_id=" + mVar.f15385u + "&");
        stringBuffer.append("network_type=" + mVar.f15371g + "&");
        stringBuffer.append("rid=" + mVar.f15383s + "&");
        stringBuffer.append("rid_n=" + mVar.f15384t + "&");
        StringBuilder sb = new StringBuilder();
        sb.append("reason=");
        sb.append(mVar.f15377m);
        stringBuffer.append(sb.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static String m15626b(C6203m mVar) {
        if (mVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + mVar.f15370f + "&");
        stringBuffer.append("cid=" + mVar.f15386v + "&");
        stringBuffer.append("unit_id=" + mVar.f15385u + "&");
        stringBuffer.append("network_type=" + mVar.f15371g + "&");
        stringBuffer.append("mraid_type=" + mVar.f15366H + "&");
        stringBuffer.append("rid_n=" + mVar.f15384t + "&");
        StringBuilder sb = new StringBuilder();
        sb.append("rid=");
        sb.append(mVar.f15383s);
        stringBuffer.append(sb.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    /* renamed from: c */
    public static String m15628c(C6203m mVar) {
        if (mVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + mVar.f15370f + "&");
        stringBuffer.append("result=" + mVar.f15379o + "&");
        stringBuffer.append("duration=" + mVar.f15380p + "&");
        stringBuffer.append("endcard_url=" + mVar.f15362D + "&");
        stringBuffer.append("cid=" + mVar.f15386v + "&");
        stringBuffer.append("reason=" + mVar.f15377m + "&");
        stringBuffer.append("type=" + mVar.f15361C + "&");
        stringBuffer.append("ad_type=" + mVar.f15365G + "&");
        stringBuffer.append("unit_id=" + mVar.f15385u + "&");
        stringBuffer.append("devid=" + mVar.f15368d + "&");
        stringBuffer.append("mraid_type=" + mVar.f15366H + "&");
        stringBuffer.append("network_type=" + mVar.f15371g + "&");
        if (mVar.f15367c != null) {
            stringBuffer.append("resource_type=" + mVar.f15367c + "&");
        }
        stringBuffer.append("rid_n=" + mVar.f15384t + "&");
        StringBuilder sb = new StringBuilder();
        sb.append("rid=");
        sb.append(mVar.f15383s);
        stringBuffer.append(sb.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    /* renamed from: d */
    public static String m15630d(C6203m mVar) {
        if (mVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + mVar.f15370f + "&");
        stringBuffer.append("result=" + mVar.f15379o + "&");
        stringBuffer.append("duration=" + mVar.f15380p + "&");
        stringBuffer.append("cid=" + mVar.f15386v + "&");
        stringBuffer.append("unit_id=" + mVar.f15385u + "&");
        stringBuffer.append("reason=" + mVar.f15377m + "&");
        stringBuffer.append("ad_type=" + mVar.f15365G + "&");
        stringBuffer.append("rid=" + mVar.f15383s + "&");
        stringBuffer.append("rid_n=" + mVar.f15384t + "&");
        stringBuffer.append("network_type=" + mVar.f15371g + "&");
        stringBuffer.append("mraid_type=" + mVar.f15366H + "&");
        stringBuffer.append("devid=" + mVar.f15368d + "&");
        if (mVar.f15367c != null) {
            stringBuffer.append("resource_type=" + mVar.f15367c + "&");
        }
        if (!TextUtils.isEmpty(mVar.f15362D)) {
            stringBuffer.append("endcard_url=" + mVar.f15362D + "&");
        }
        stringBuffer.append("type=" + mVar.f15361C);
        return stringBuffer.toString();
    }

    /* renamed from: d */
    public static String m15631d(List<C6203m> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (C6203m next : list) {
            stringBuffer.append("key=" + next.f15370f + "&");
            stringBuffer.append("result=" + next.f15379o + "&");
            stringBuffer.append("duration=" + next.f15380p + "&");
            stringBuffer.append("endcard_url=" + next.f15362D + "&");
            stringBuffer.append("cid=" + next.f15386v + "&");
            stringBuffer.append("unit_id=" + next.f15385u + "&");
            stringBuffer.append("reason=" + next.f15377m + "&");
            stringBuffer.append("ad_type=" + next.f15365G + "&");
            stringBuffer.append("rid=" + next.f15383s + "&");
            stringBuffer.append("rid_n=" + next.f15384t + "&");
            StringBuilder sb = new StringBuilder();
            sb.append("type=");
            sb.append(next.f15361C);
            stringBuffer.append(sb.toString());
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    /* renamed from: e */
    public static String m15633e(List<C6203m> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (C6203m next : list) {
            if (C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + next.f15370f + "&");
                stringBuffer.append("network_type=" + next.f15371g + "&");
                stringBuffer.append("result=" + next.f15379o + "&");
                stringBuffer.append("cid=" + next.f15386v + "&");
                stringBuffer.append("template_url=" + next.f15387w + "&");
                stringBuffer.append("reason=" + next.f15377m + "&");
                stringBuffer.append("rid=" + next.f15383s + "&");
                stringBuffer.append("rid_n=" + next.f15384t + "&");
                stringBuffer.append("unit_id=" + next.f15385u + "&");
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + next.f15370f + "&");
                stringBuffer.append("result=" + next.f15379o + "&");
                stringBuffer.append("cid=" + next.f15386v + "&");
                stringBuffer.append("template_url=" + next.f15387w + "&");
                stringBuffer.append("reason=" + next.f15377m + "&");
                stringBuffer.append("rid=" + next.f15383s + "&");
                stringBuffer.append("rid_n=" + next.f15384t + "&");
                stringBuffer.append("unit_id=" + next.f15385u + "&");
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: f */
    public static String m15635f(List<C6203m> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (C6203m next : list) {
            if (C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + next.f15370f + "&");
                stringBuffer.append("network_type=" + next.f15371g + "&");
                stringBuffer.append("cid=" + next.f15386v + "&");
                stringBuffer.append("image_url=" + next.f15364F + "&");
                stringBuffer.append("reason=" + next.f15377m + "&");
                stringBuffer.append("rid=" + next.f15383s + "&");
                stringBuffer.append("rid_n=" + next.f15384t + "&");
                stringBuffer.append("unit_id=" + next.f15385u + "&");
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + next.f15370f + "&");
                stringBuffer.append("cid=" + next.f15386v + "&");
                stringBuffer.append("image_url=" + next.f15364F + "&");
                stringBuffer.append("reason=" + next.f15377m + "&");
                stringBuffer.append("rid=" + next.f15383s + "&");
                stringBuffer.append("rid_n=" + next.f15384t + "&");
                stringBuffer.append("unit_id=" + next.f15385u + "&");
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: e */
    public static String m15632e(C6203m mVar) {
        if (mVar == null) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            if (C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + mVar.f15370f + "&");
                stringBuffer.append("error=" + C6366u.m16212c(mVar.f15389y) + "&");
                stringBuffer.append("template_url=" + C6366u.m16212c(mVar.f15387w) + "&");
                stringBuffer.append("unit_id=" + C6366u.m16212c(mVar.f15385u) + "&");
                stringBuffer.append("cid=" + C6366u.m16212c(mVar.f15386v) + "&");
                stringBuffer.append("network_str=" + mVar.f15372h + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("network_type=");
                sb.append(mVar.f15371g);
                stringBuffer.append(sb.toString());
            } else {
                stringBuffer.append("key=" + mVar.f15370f + "&");
                stringBuffer.append("error=" + C6366u.m16212c(mVar.f15389y) + "&");
                stringBuffer.append("template_url=" + C6366u.m16212c(mVar.f15387w) + "&");
                stringBuffer.append("unit_id=" + C6366u.m16212c(mVar.f15385u) + "&");
                stringBuffer.append("cid=" + C6366u.m16212c(mVar.f15386v) + "&");
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    public static String m15634f(C6203m mVar) {
        if (mVar == null) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            if (C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + mVar.f15370f + "&");
                stringBuffer.append("event=" + C6366u.m16212c(mVar.f15390z) + "&");
                stringBuffer.append("template=" + C6366u.m16212c(mVar.f15388x) + "&");
                stringBuffer.append("layout=" + C6366u.m16212c(mVar.f15359A) + "&");
                stringBuffer.append("unit_id=" + C6366u.m16212c(mVar.f15385u) + "&");
                stringBuffer.append("cid=" + C6366u.m16212c(mVar.f15386v) + "&");
                stringBuffer.append("network_str=" + mVar.f15372h + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("network_type=");
                sb.append(mVar.f15371g);
                stringBuffer.append(sb.toString());
            } else {
                stringBuffer.append("key=" + mVar.f15370f + "&");
                stringBuffer.append("event=" + C6366u.m16212c(mVar.f15390z) + "&");
                stringBuffer.append("template=" + C6366u.m16212c(mVar.f15388x) + "&");
                stringBuffer.append("layout=" + C6366u.m16212c(mVar.f15359A) + "&");
                stringBuffer.append("unit_id=" + C6366u.m16212c(mVar.f15385u) + "&");
                stringBuffer.append("cid=" + C6366u.m16212c(mVar.f15386v) + "&");
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: g */
    public static String m15637g(List<C6203m> list) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (C6203m mVar : list) {
                stringBuffer.append(mVar.f15360B);
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            C6361q.m16155a("VideoReportData", th.getMessage(), th);
            return null;
        }
    }

    /* renamed from: g */
    public static String m15636g(C6203m mVar) {
        if (mVar == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + mVar.f15370f + "&");
        stringBuffer.append("cid=" + mVar.f15386v + "&");
        stringBuffer.append("rid=" + mVar.f15383s + "&");
        stringBuffer.append("rid_n=" + mVar.f15384t + "&");
        stringBuffer.append("unit_id=" + mVar.f15385u + "&");
        stringBuffer.append("network_type=" + mVar.f15371g + "&");
        stringBuffer.append("mraid_type=" + mVar.f15366H + "&");
        stringBuffer.append("platform=1");
        return stringBuffer.toString();
    }

    /* renamed from: h */
    public static String m15638h(C6203m mVar) {
        if (mVar == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + mVar.f15370f + "&");
        stringBuffer.append("cid=" + mVar.f15386v + "&");
        stringBuffer.append("rid=" + mVar.f15383s + "&");
        stringBuffer.append("rid_n=" + mVar.f15384t + "&");
        stringBuffer.append("unit_id=" + mVar.f15385u + "&");
        stringBuffer.append("reason=" + mVar.f15377m + "&");
        stringBuffer.append("case=" + mVar.f15378n + "&");
        StringBuilder sb = new StringBuilder();
        sb.append("network_type=");
        sb.append(mVar.f15371g);
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    public final String toString() {
        return "RewardReportData [key=" + this.f15370f + ", networkType=" + this.f15371g + ", isCompleteView=" + this.f15373i + ", watchedMillis=" + this.f15374j + ", videoLength=" + this.f15375k + ", offerUrl=" + this.f15376l + ", reason=" + this.f15377m + ", result=" + this.f15379o + ", duration=" + this.f15380p + ", videoSize=" + this.f15381q + "]";
    }
}
