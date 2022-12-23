package com.mbridge.msdk.foundation.same.net.p178g;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.C6295m;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.p158b.C6072a;
import com.mbridge.msdk.p158b.C6076b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Pattern;

/* renamed from: com.mbridge.msdk.foundation.same.net.g.d */
/* compiled from: RequestUrlUtil */
public final class C6280d {

    /* renamed from: a */
    public String f15565a;

    /* renamed from: b */
    public String f15566b;

    /* renamed from: c */
    public String f15567c;

    /* renamed from: d */
    public String f15568d;

    /* renamed from: e */
    public String f15569e;

    /* renamed from: f */
    public String f15570f;

    /* renamed from: g */
    public String f15571g;

    /* renamed from: h */
    public String f15572h;

    /* renamed from: i */
    public String f15573i;

    /* renamed from: j */
    public String f15574j;

    /* renamed from: k */
    public String f15575k;

    /* renamed from: l */
    public String f15576l;

    /* renamed from: m */
    public int f15577m;

    /* renamed from: n */
    public boolean f15578n;

    /* renamed from: o */
    public ArrayList<String> f15579o;

    /* renamed from: p */
    private final String f15580p;

    /* renamed from: q */
    private boolean f15581q;

    /* renamed from: r */
    private String f15582r;

    /* renamed from: s */
    private String f15583s;

    /* renamed from: t */
    private String f15584t;

    /* renamed from: u */
    private String f15585u;

    /* renamed from: v */
    private String f15586v;

    /* renamed from: w */
    private String f15587w;

    /* renamed from: x */
    private String f15588x;

    /* renamed from: y */
    private String f15589y;

    /* renamed from: z */
    private String f15590z;

    /* renamed from: com.mbridge.msdk.foundation.same.net.g.d$a */
    /* compiled from: RequestUrlUtil */
    private static class C6282a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C6280d f15591a = new C6280d();
    }

    /* renamed from: a */
    public final boolean mo43859a() {
        try {
            if (this.f15579o == null || this.f15577m > this.f15579o.size() - 1) {
                if (this.f15578n) {
                    this.f15577m = 0;
                }
                return false;
            }
            this.f15567c = this.f15579o.get(this.f15577m);
            mo43862e();
            return true;
        } catch (Throwable th) {
            C6361q.m16154a("RequestUrlUtil", th.getMessage());
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo43860b() {
        return this.f15581q;
    }

    private C6280d() {
        this.f15580p = "RequestUrlUtil";
        this.f15581q = true;
        this.f15582r = "https://{}hb.rayjump.com";
        this.f15565a = "https://analytics.rayjump.com";
        this.f15566b = "https://net.rayjump.com";
        this.f15567c = "https://configure.rayjump.com";
        this.f15583s = "/bid";
        this.f15584t = "/load";
        this.f15585u = "/openapi/ad/v3";
        this.f15586v = "/openapi/ad/v4";
        this.f15587w = "/openapi/ad/v5";
        this.f15588x = "/setting";
        this.f15589y = "/sdk/customid";
        this.f15590z = "/rewardsetting";
        this.f15568d = this.f15582r + this.f15583s;
        this.f15569e = this.f15582r + this.f15584t;
        this.f15570f = this.f15566b + this.f15585u;
        this.f15571g = this.f15566b + this.f15586v;
        this.f15572h = this.f15566b + this.f15587w;
        this.f15573i = this.f15567c + this.f15588x;
        this.f15574j = this.f15567c + this.f15589y;
        this.f15575k = this.f15567c + this.f15590z;
        this.f15576l = "https://d1tru86qrby720.cloudfront.net/hostsetting";
        this.f15577m = 0;
        this.f15578n = false;
        this.f15579o = new ArrayList<>(Arrays.asList(new String[]{"https://configure.rayjump.com", "https://policy.rayjump.com", "https://lazy.rayjump.com", "https://check.rayjump.com"}));
    }

    /* renamed from: c */
    public static C6280d m15868c() {
        return C6282a.f15591a;
    }

    /* renamed from: a */
    public final String mo43857a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split("_");
                if (split.length > 1) {
                    return mo43858a(true, split[1]);
                }
            }
        } catch (Exception e) {
            C6361q.m16158d("RequestUrlUtil", e.getMessage());
        }
        if (TextUtils.isEmpty(str)) {
            return C6282a.f15591a.f15581q ? this.f15572h : this.f15570f;
        }
        return mo43858a(true, "");
    }

    /* renamed from: a */
    public final String mo43858a(boolean z, String str) {
        if (!z) {
            return this.f15568d.replace("{}", "");
        }
        if (!this.f15569e.contains("{}") || TextUtils.isEmpty(str)) {
            return this.f15569e.replace("{}", "");
        }
        String str2 = this.f15569e;
        return str2.replace("{}", str + "-");
    }

    /* renamed from: d */
    public final void mo43861d() {
        HashMap<String, String> aa;
        C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
        if (b != null) {
            this.f15581q = !b.mo42698c(2);
            if (b.mo42687aa() != null && b.mo42687aa().size() > 0 && (aa = b.mo42687aa()) != null && aa.size() > 0) {
                if (aa.containsKey("v") && !TextUtils.isEmpty(aa.get("v")) && m15867b(aa.get("v"))) {
                    this.f15566b = aa.get("v");
                    this.f15570f = this.f15566b + this.f15585u;
                    this.f15571g = this.f15566b + this.f15586v;
                    this.f15572h = this.f15566b + this.f15587w;
                }
                if (aa.containsKey(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(aa.get(CampaignEx.JSON_KEY_HB)) && m15867b(aa.get(CampaignEx.JSON_KEY_HB))) {
                    this.f15582r = aa.get(CampaignEx.JSON_KEY_HB);
                    this.f15568d = this.f15582r + this.f15583s;
                    this.f15569e = this.f15582r + this.f15584t;
                }
                if (aa.containsKey("lg") && !TextUtils.isEmpty(aa.get("lg"))) {
                    String str = aa.get("lg");
                    if (m15867b(str)) {
                        this.f15565a = str;
                    } else if (!TextUtils.isEmpty(str)) {
                        C6295m.m15932a().mo43898a(str);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m15867b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("(https|http)://[-A-Za-z0-9{}+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str.trim()).matches();
    }

    /* renamed from: e */
    public final void mo43862e() {
        this.f15573i = this.f15567c + this.f15588x;
        this.f15574j = this.f15567c + this.f15589y;
        this.f15575k = this.f15567c + this.f15590z;
    }
}
