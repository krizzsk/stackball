package com.mbridge.msdk.p158b;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.appevents.UserDataStore;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.C6191a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.p178g.C6280d;
import com.mbridge.msdk.foundation.tools.C6337h;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6361q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.b.a */
/* compiled from: Setting */
public final class C6072a {

    /* renamed from: A */
    private int f14877A = 1;

    /* renamed from: B */
    private int f14878B = 1;

    /* renamed from: C */
    private int f14879C = 1;

    /* renamed from: D */
    private int f14880D = 0;

    /* renamed from: E */
    private int f14881E = 1;

    /* renamed from: F */
    private int f14882F = 0;

    /* renamed from: G */
    private String f14883G;

    /* renamed from: H */
    private int f14884H = 30;

    /* renamed from: I */
    private int f14885I = 5;

    /* renamed from: J */
    private int f14886J = 0;

    /* renamed from: K */
    private int f14887K = 0;

    /* renamed from: L */
    private int f14888L = 9377;

    /* renamed from: M */
    private List<Integer> f14889M = new ArrayList();

    /* renamed from: N */
    private long f14890N;

    /* renamed from: O */
    private int f14891O;

    /* renamed from: P */
    private String f14892P = "";

    /* renamed from: Q */
    private String f14893Q = "";

    /* renamed from: R */
    private String f14894R = "";

    /* renamed from: S */
    private String f14895S = "";

    /* renamed from: T */
    private String f14896T = "";

    /* renamed from: U */
    private String f14897U = "";

    /* renamed from: V */
    private String f14898V = "";

    /* renamed from: W */
    private String f14899W = "";

    /* renamed from: X */
    private String f14900X = "";

    /* renamed from: Y */
    private String f14901Y = "";

    /* renamed from: Z */
    private Map<String, C6073a> f14902Z;

    /* renamed from: a */
    private int f14903a = 0;

    /* renamed from: aa */
    private int f14904aa = 0;

    /* renamed from: ab */
    private String f14905ab = "";

    /* renamed from: ac */
    private String f14906ac;

    /* renamed from: ad */
    private String f14907ad;

    /* renamed from: ae */
    private int f14908ae = 0;

    /* renamed from: af */
    private boolean f14909af = false;

    /* renamed from: ag */
    private int f14910ag = 120;

    /* renamed from: ah */
    private ArrayList<Integer> f14911ah;

    /* renamed from: ai */
    private HashMap<String, String> f14912ai;

    /* renamed from: aj */
    private int f14913aj = 0;

    /* renamed from: ak */
    private int f14914ak = 0;

    /* renamed from: b */
    private int f14915b;

    /* renamed from: c */
    private long f14916c = 86400;

    /* renamed from: d */
    private long f14917d;

    /* renamed from: e */
    private Map<String, String> f14918e;

    /* renamed from: f */
    private boolean f14919f;

    /* renamed from: g */
    private long f14920g;

    /* renamed from: h */
    private boolean f14921h;

    /* renamed from: i */
    private long f14922i;

    /* renamed from: j */
    private long f14923j;

    /* renamed from: k */
    private long f14924k;

    /* renamed from: l */
    private boolean f14925l;

    /* renamed from: m */
    private int f14926m;

    /* renamed from: n */
    private int f14927n;

    /* renamed from: o */
    private long f14928o;

    /* renamed from: p */
    private int f14929p;

    /* renamed from: q */
    private int f14930q;

    /* renamed from: r */
    private String f14931r;

    /* renamed from: s */
    private int f14932s;

    /* renamed from: t */
    private List<C6191a> f14933t;

    /* renamed from: u */
    private boolean f14934u = false;

    /* renamed from: v */
    private int f14935v = 3;

    /* renamed from: w */
    private boolean f14936w = true;

    /* renamed from: x */
    private String f14937x = C6280d.m15868c().f15567c;

    /* renamed from: y */
    private int f14938y = 120;

    /* renamed from: z */
    private String f14939z = "";

    /* renamed from: a */
    public final List<C6191a> mo42682a() {
        return this.f14933t;
    }

    /* renamed from: b */
    public final String mo42690b() {
        return this.f14939z;
    }

    /* renamed from: c */
    public final int mo42694c() {
        return this.f14938y;
    }

    /* renamed from: a */
    public final void mo42683a(int i) {
        this.f14938y = i;
    }

    /* renamed from: d */
    public final int mo42699d() {
        return this.f14903a;
    }

    /* renamed from: b */
    public final void mo42691b(int i) {
        this.f14903a = i;
    }

    /* renamed from: e */
    public final String mo42703e() {
        return this.f14937x;
    }

    /* renamed from: c */
    public final boolean mo42698c(int i) {
        return this.f14889M.contains(Integer.valueOf(i));
    }

    /* renamed from: f */
    public final int mo42706f() {
        return this.f14877A;
    }

    /* renamed from: d */
    public final void mo42700d(int i) {
        this.f14877A = i;
    }

    /* renamed from: g */
    public final int mo42708g() {
        return this.f14878B;
    }

    /* renamed from: e */
    public final void mo42704e(int i) {
        this.f14878B = i;
    }

    /* renamed from: h */
    public final int mo42710h() {
        return this.f14879C;
    }

    /* renamed from: f */
    public final void mo42707f(int i) {
        this.f14879C = i;
    }

    /* renamed from: i */
    public final int mo42712i() {
        return this.f14880D;
    }

    /* renamed from: g */
    public final void mo42709g(int i) {
        this.f14880D = i;
    }

    /* renamed from: j */
    public final int mo42714j() {
        return this.f14881E;
    }

    /* renamed from: h */
    public final void mo42711h(int i) {
        this.f14881E = i;
    }

    /* renamed from: k */
    public final int mo42716k() {
        return this.f14882F;
    }

    /* renamed from: i */
    public final void mo42713i(int i) {
        this.f14882F = i;
    }

    /* renamed from: l */
    public final int mo42718l() {
        return this.f14932s;
    }

    /* renamed from: j */
    public final void mo42715j(int i) {
        this.f14932s = i;
    }

    /* renamed from: m */
    public final String mo42720m() {
        return this.f14931r;
    }

    /* renamed from: a */
    public final void mo42685a(String str) {
        this.f14931r = str;
    }

    /* renamed from: n */
    public final int mo42722n() {
        return this.f14930q;
    }

    /* renamed from: o */
    public final int mo42724o() {
        return this.f14929p;
    }

    /* renamed from: p */
    public final long mo42726p() {
        if (this.f14928o <= 0) {
            this.f14928o = 7200;
        }
        return this.f14928o;
    }

    /* renamed from: a */
    public final void mo42684a(long j) {
        this.f14928o = j;
    }

    /* renamed from: q */
    public final int mo42727q() {
        return this.f14891O;
    }

    /* renamed from: k */
    public final void mo42717k(int i) {
        this.f14891O = i;
    }

    /* renamed from: r */
    public final long mo42728r() {
        return this.f14890N;
    }

    /* renamed from: b */
    public final void mo42692b(long j) {
        this.f14890N = j;
    }

    /* renamed from: s */
    public final boolean mo42729s() {
        return this.f14925l;
    }

    /* renamed from: a */
    public final void mo42686a(boolean z) {
        this.f14925l = z;
    }

    /* renamed from: t */
    public final long mo42730t() {
        return this.f14924k;
    }

    /* renamed from: u */
    public final boolean mo42732u() {
        return this.f14921h;
    }

    /* renamed from: b */
    public final void mo42693b(boolean z) {
        this.f14921h = z;
    }

    /* renamed from: v */
    public final long mo42733v() {
        return this.f14922i;
    }

    /* renamed from: c */
    public final void mo42695c(long j) {
        this.f14922i = j;
    }

    /* renamed from: d */
    public final void mo42701d(long j) {
        this.f14923j = j;
    }

    public final String toString() {
        return " cfc=" + this.f14915b + " getpf=" + this.f14916c + " rurl=" + this.f14921h;
    }

    /* renamed from: w */
    public final int mo42734w() {
        return this.f14915b;
    }

    /* renamed from: l */
    public final void mo42719l(int i) {
        this.f14915b = i;
    }

    /* renamed from: x */
    public final long mo42735x() {
        return this.f14916c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.mbridge.msdk.b.a} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v17, types: [java.util.List<com.mbridge.msdk.foundation.entity.a>] */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.mbridge.msdk.p158b.C6072a m15000b(java.lang.String r14) {
        /*
            java.lang.String r0 = "plctb"
            java.lang.String r1 = "pcrn"
            java.lang.String r2 = "plct"
            java.lang.String r3 = ""
            r4 = 0
            boolean r5 = android.text.TextUtils.isEmpty(r14)     // Catch:{ Exception -> 0x03b0 }
            if (r5 != 0) goto L_0x03b4
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x03b0 }
            r5.<init>(r14)     // Catch:{ Exception -> 0x03b0 }
            com.mbridge.msdk.b.a r14 = new com.mbridge.msdk.b.a     // Catch:{ Exception -> 0x03b0 }
            r14.<init>()     // Catch:{ Exception -> 0x03b0 }
            java.lang.String r6 = "mv_wildcard"
            java.lang.String r7 = "mbridge"
            java.lang.String r6 = r5.optString(r6, r7)     // Catch:{ Exception -> 0x03ad }
            r14.f14931r = r6     // Catch:{ Exception -> 0x03ad }
            java.lang.String r6 = "cfc"
            int r6 = r5.optInt(r6)     // Catch:{ Exception -> 0x03ad }
            r14.f14915b = r6     // Catch:{ Exception -> 0x03ad }
            java.lang.String r6 = "getpf"
            long r6 = r5.optLong(r6)     // Catch:{ Exception -> 0x03ad }
            r14.f14916c = r6     // Catch:{ Exception -> 0x03ad }
            java.lang.String r6 = "current_time"
            long r6 = r5.optLong(r6)     // Catch:{ Exception -> 0x03ad }
            r14.f14920g = r6     // Catch:{ Exception -> 0x03ad }
            java.lang.String r6 = "cfb"
            boolean r6 = r5.optBoolean(r6)     // Catch:{ Exception -> 0x03ad }
            r14.f14919f = r6     // Catch:{ Exception -> 0x03ad }
            java.lang.String r6 = "awct"
            long r6 = r5.optLong(r6)     // Catch:{ Exception -> 0x03ad }
            r14.f14923j = r6     // Catch:{ Exception -> 0x03ad }
            long r6 = r5.optLong(r2)     // Catch:{ Exception -> 0x03ad }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0058
            r6 = 3600(0xe10, double:1.7786E-320)
            goto L_0x005c
        L_0x0058:
            long r6 = r5.optLong(r2)     // Catch:{ Exception -> 0x03ad }
        L_0x005c:
            r14.f14922i = r6     // Catch:{ Exception -> 0x03ad }
            java.lang.String r2 = "rurl"
            boolean r2 = r5.optBoolean(r2)     // Catch:{ Exception -> 0x03ad }
            r14.f14921h = r2     // Catch:{ Exception -> 0x03ad }
            java.lang.String r2 = "uct"
            long r6 = r5.optLong(r2)     // Catch:{ Exception -> 0x03ad }
            r14.f14924k = r6     // Catch:{ Exception -> 0x03ad }
            java.lang.String r2 = "ujds"
            boolean r2 = r5.optBoolean(r2)     // Catch:{ Exception -> 0x03ad }
            r14.f14925l = r2     // Catch:{ Exception -> 0x03ad }
            java.lang.String r2 = "n2"
            int r2 = r5.optInt(r2)     // Catch:{ Exception -> 0x03ad }
            r14.f14926m = r2     // Catch:{ Exception -> 0x03ad }
            java.lang.String r2 = "n3"
            int r2 = r5.optInt(r2)     // Catch:{ Exception -> 0x03ad }
            r14.f14927n = r2     // Catch:{ Exception -> 0x03ad }
            java.lang.String r2 = "is_startup_crashsystem"
            int r2 = r5.optInt(r2)     // Catch:{ Exception -> 0x03ad }
            r14.f14932s = r2     // Catch:{ Exception -> 0x03ad }
            int r2 = r5.optInt(r1)     // Catch:{ Exception -> 0x03ad }
            r14.f14929p = r2     // Catch:{ Exception -> 0x03ad }
            long r6 = r5.optLong(r0)     // Catch:{ Exception -> 0x03ad }
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x009f
            r6 = 7200(0x1c20, double:3.5573E-320)
            goto L_0x00a3
        L_0x009f:
            long r6 = r5.optLong(r0)     // Catch:{ Exception -> 0x03ad }
        L_0x00a3:
            r14.f14928o = r6     // Catch:{ Exception -> 0x03ad }
            r0 = 100
            int r0 = r5.optInt(r1, r0)     // Catch:{ Exception -> 0x03ad }
            r14.f14929p = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "opent"
            r1 = 1
            int r0 = r5.optInt(r0, r1)     // Catch:{ Exception -> 0x03ad }
            r14.f14930q = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "sfct"
            r6 = 1800(0x708, double:8.893E-321)
            long r6 = r5.optLong(r0, r6)     // Catch:{ Exception -> 0x03ad }
            r14.f14890N = r6     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "upgd"
            int r0 = r5.optInt(r0, r1)     // Catch:{ Exception -> 0x03ad }
            r14.f14878B = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "upsrl"
            int r0 = r5.optInt(r0, r1)     // Catch:{ Exception -> 0x03ad }
            r14.f14877A = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "updevid"
            int r0 = r5.optInt(r0, r1)     // Catch:{ Exception -> 0x03ad }
            r14.f14879C = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "sc"
            r2 = 0
            int r0 = r5.optInt(r0, r2)     // Catch:{ Exception -> 0x03ad }
            r14.f14880D = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "up_tips"
            int r0 = r5.optInt(r0, r1)     // Catch:{ Exception -> 0x03ad }
            r14.f14881E = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "iseu"
            r6 = -1
            int r0 = r5.optInt(r0, r6)     // Catch:{ Exception -> 0x03ad }
            r14.f14882F = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "jm_unit"
            java.lang.String r0 = r5.optString(r0)     // Catch:{ Exception -> 0x03ad }
            r14.f14883G = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "atf"
            org.json.JSONArray r0 = r5.optJSONArray(r0)     // Catch:{ Exception -> 0x013f }
            if (r0 == 0) goto L_0x013a
            int r7 = r0.length()     // Catch:{ Exception -> 0x013f }
            if (r7 <= 0) goto L_0x013a
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x013f }
            r4.<init>()     // Catch:{ Exception -> 0x013f }
            r7 = 0
        L_0x010e:
            int r10 = r0.length()     // Catch:{ Exception -> 0x013f }
            if (r7 >= r10) goto L_0x013a
            java.lang.String r10 = r0.optString(r7)     // Catch:{ Exception -> 0x013f }
            boolean r11 = com.mbridge.msdk.foundation.tools.C6369x.m16236b(r10)     // Catch:{ Exception -> 0x013f }
            if (r11 == 0) goto L_0x0137
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Exception -> 0x013f }
            r11.<init>(r10)     // Catch:{ Exception -> 0x013f }
            com.mbridge.msdk.foundation.entity.a r10 = new com.mbridge.msdk.foundation.entity.a     // Catch:{ Exception -> 0x013f }
            java.lang.String r12 = "adtype"
            int r12 = r11.optInt(r12)     // Catch:{ Exception -> 0x013f }
            java.lang.String r13 = "unitid"
            java.lang.String r11 = r11.optString(r13)     // Catch:{ Exception -> 0x013f }
            r10.<init>(r12, r11)     // Catch:{ Exception -> 0x013f }
            r4.add(r10)     // Catch:{ Exception -> 0x013f }
        L_0x0137:
            int r7 = r7 + 1
            goto L_0x010e
        L_0x013a:
            if (r4 == 0) goto L_0x0143
            r14.f14933t = r4     // Catch:{ Exception -> 0x013f }
            goto L_0x0143
        L_0x013f:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ Exception -> 0x03ad }
        L_0x0143:
            java.lang.String r0 = "adct"
            r4 = 259200(0x3f480, float:3.63217E-40)
            int r0 = r5.optInt(r0, r4)     // Catch:{ Exception -> 0x03ad }
            r14.f14891O = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "confirm_title"
            java.lang.String r0 = r5.optString(r0, r3)     // Catch:{ Exception -> 0x03ad }
            r14.f14892P = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "confirm_description"
            java.lang.String r0 = r5.optString(r0, r3)     // Catch:{ Exception -> 0x03ad }
            r14.f14893Q = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "confirm_t"
            java.lang.String r0 = r5.optString(r0, r3)     // Catch:{ Exception -> 0x03ad }
            r14.f14894R = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "confirm_c_rv"
            java.lang.String r0 = r5.optString(r0, r3)     // Catch:{ Exception -> 0x03ad }
            r14.f14895S = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "confirm_c_play"
            java.lang.String r0 = r5.optString(r0, r3)     // Catch:{ Exception -> 0x03ad }
            r14.f14896T = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "adchoice_icon"
            java.lang.String r0 = r5.optString(r0, r3)     // Catch:{ Exception -> 0x03ad }
            r14.f14897U = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "adchoice_link"
            java.lang.String r0 = r5.optString(r0, r3)     // Catch:{ Exception -> 0x03ad }
            r14.f14899W = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "adchoice_size"
            java.lang.String r0 = r5.optString(r0, r3)     // Catch:{ Exception -> 0x03ad }
            r14.f14898V = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "platform_logo"
            java.lang.String r0 = r5.optString(r0, r3)     // Catch:{ Exception -> 0x03ad }
            r14.f14901Y = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "platform_name"
            java.lang.String r0 = r5.optString(r0, r3)     // Catch:{ Exception -> 0x03ad }
            r14.f14900X = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "cdnate_cfg"
            java.lang.String r0 = r5.optString(r0, r3)     // Catch:{ Exception -> 0x03ad }
            java.util.Map r0 = m15001d((java.lang.String) r0)     // Catch:{ Exception -> 0x03ad }
            r14.f14902Z = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "atrqt"
            int r0 = r5.optInt(r0, r2)     // Catch:{ Exception -> 0x03ad }
            r14.f14903a = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "iupdid"
            int r0 = r5.optInt(r0, r2)     // Catch:{ Exception -> 0x03ad }
            r14.f14904aa = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "mcs"
            r4 = 120(0x78, float:1.68E-43)
            int r0 = r5.optInt(r0, r4)     // Catch:{ Exception -> 0x03ad }
            r14.f14938y = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "ab_id"
            java.lang.String r0 = r5.optString(r0, r3)     // Catch:{ Exception -> 0x03ad }
            r14.f14939z = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "omsdkjs_url"
            java.lang.String r0 = r5.optString(r0, r3)     // Catch:{ Exception -> 0x03ad }
            r14.f14905ab = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "tcto"
            long r10 = r5.optLong(r0)     // Catch:{ Exception -> 0x03ad }
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x01e3
            r7 = 10
            r14.f14917d = r7     // Catch:{ Exception -> 0x03ad }
            goto L_0x0217
        L_0x01e3:
            r14.f14917d = r10     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "jt"
            org.json.JSONArray r0 = r5.optJSONArray(r0)     // Catch:{ Exception -> 0x03ad }
            if (r0 == 0) goto L_0x0217
            int r3 = r0.length()     // Catch:{ Exception -> 0x03ad }
            if (r3 <= 0) goto L_0x0217
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Exception -> 0x03ad }
            r3.<init>()     // Catch:{ Exception -> 0x03ad }
            r7 = 0
        L_0x01f9:
            int r8 = r0.length()     // Catch:{ Exception -> 0x03ad }
            if (r7 >= r8) goto L_0x0215
            org.json.JSONObject r8 = r0.optJSONObject(r7)     // Catch:{ Exception -> 0x03ad }
            java.lang.String r9 = "domain"
            java.lang.String r9 = r8.optString(r9)     // Catch:{ Exception -> 0x03ad }
            java.lang.String r10 = "format"
            java.lang.String r8 = r8.optString(r10)     // Catch:{ Exception -> 0x03ad }
            r3.put(r9, r8)     // Catch:{ Exception -> 0x03ad }
            int r7 = r7 + 1
            goto L_0x01f9
        L_0x0215:
            r14.f14918e = r3     // Catch:{ Exception -> 0x03ad }
        L_0x0217:
            java.lang.String r0 = "mraid_js"
            java.lang.String r0 = r5.optString(r0)     // Catch:{ Exception -> 0x03ad }
            r14.f14907ad = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "web_env_url"
            java.lang.String r0 = r5.optString(r0)     // Catch:{ Exception -> 0x03ad }
            r14.f14906ac = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "alrbs"
            int r0 = r5.optInt(r0, r2)     // Catch:{ Exception -> 0x03ad }
            r3 = 2
            if (r0 > r3) goto L_0x0232
            if (r0 >= 0) goto L_0x0233
        L_0x0232:
            r0 = 0
        L_0x0233:
            r14.f14908ae = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "GDPR_area"
            boolean r0 = r5.optBoolean(r0, r2)     // Catch:{ Exception -> 0x03ad }
            r14.f14909af = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "ct"
            int r0 = r5.optInt(r0, r4)     // Catch:{ Exception -> 0x03ad }
            r14.f14910ag = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "ercd"
            org.json.JSONArray r0 = r5.optJSONArray(r0)     // Catch:{ Exception -> 0x03ad }
            if (r0 == 0) goto L_0x027e
            int r3 = r0.length()     // Catch:{ Exception -> 0x03ad }
            if (r3 <= 0) goto L_0x027e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x03ad }
            r3.<init>()     // Catch:{ Exception -> 0x03ad }
            r4 = 0
        L_0x0259:
            int r7 = r0.length()     // Catch:{ Exception -> 0x03ad }
            if (r4 >= r7) goto L_0x026f
            int r7 = r0.optInt(r4)     // Catch:{ Exception -> 0x03ad }
            if (r7 == 0) goto L_0x026c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x03ad }
            r3.add(r7)     // Catch:{ Exception -> 0x03ad }
        L_0x026c:
            int r4 = r4 + 1
            goto L_0x0259
        L_0x026f:
            int r0 = r3.size()     // Catch:{ Exception -> 0x03ad }
            if (r0 <= 0) goto L_0x027e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x03ad }
            r3.add(r0)     // Catch:{ Exception -> 0x03ad }
            r14.f14911ah = r3     // Catch:{ Exception -> 0x03ad }
        L_0x027e:
            java.lang.String r0 = "hst"
            java.lang.String r0 = r5.optString(r0)     // Catch:{ Exception -> 0x03ad }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x03ad }
            if (r3 != 0) goto L_0x02e1
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.C6348l.m16089b(r0)     // Catch:{ Exception -> 0x02d7 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x02d7 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x02d7 }
            java.util.Iterator r0 = r3.keys()     // Catch:{ Exception -> 0x02d7 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ Exception -> 0x02d7 }
            r4.<init>()     // Catch:{ Exception -> 0x02d7 }
        L_0x029c:
            boolean r6 = r0.hasNext()     // Catch:{ Exception -> 0x02d7 }
            if (r6 == 0) goto L_0x02ce
            java.lang.Object r6 = r0.next()     // Catch:{ Exception -> 0x02d7 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x02d7 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x02d7 }
            if (r7 != 0) goto L_0x029c
            java.lang.String r7 = r3.optString(r6)     // Catch:{ Exception -> 0x02d7 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x02d7 }
            if (r7 != 0) goto L_0x029c
            java.lang.String r7 = r3.optString(r6)     // Catch:{ Exception -> 0x02d7 }
            java.lang.String r7 = com.mbridge.msdk.foundation.tools.C6348l.m16089b(r7)     // Catch:{ Exception -> 0x02d7 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x02d7 }
            if (r7 != 0) goto L_0x029c
            java.lang.String r7 = r3.optString(r6)     // Catch:{ Exception -> 0x02d7 }
            r4.put(r6, r7)     // Catch:{ Exception -> 0x02d7 }
            goto L_0x029c
        L_0x02ce:
            int r0 = r4.size()     // Catch:{ Exception -> 0x02d7 }
            if (r0 <= 0) goto L_0x02e1
            r14.f14912ai = r4     // Catch:{ Exception -> 0x02d7 }
            goto L_0x02e1
        L_0x02d7:
            r0 = move-exception
            java.lang.String r3 = "SETTING"
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x03ad }
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r3, r0)     // Catch:{ Exception -> 0x03ad }
        L_0x02e1:
            java.lang.String r0 = "refactor_switch"
            org.json.JSONArray r0 = r5.optJSONArray(r0)     // Catch:{ Exception -> 0x03ad }
            if (r0 == 0) goto L_0x0327
            int r3 = r0.length()     // Catch:{ Exception -> 0x03ad }
            if (r3 <= 0) goto L_0x0327
            r3 = 0
        L_0x02f0:
            int r4 = r0.length()     // Catch:{ Exception -> 0x03ad }
            if (r3 >= r4) goto L_0x0327
            org.json.JSONObject r4 = r0.getJSONObject(r3)     // Catch:{ Exception -> 0x03ad }
            java.util.Iterator r6 = r4.keys()     // Catch:{ Exception -> 0x03ad }
        L_0x02fe:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x03ad }
            if (r7 == 0) goto L_0x0324
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x03ad }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x03ad }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x03ad }
            if (r8 != 0) goto L_0x02fe
            boolean r8 = r4.getBoolean(r7)     // Catch:{ Exception -> 0x03ad }
            if (r8 == 0) goto L_0x02fe
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ Exception -> 0x03ad }
            java.util.List<java.lang.Integer> r8 = r14.f14889M     // Catch:{ Exception -> 0x03ad }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x03ad }
            r8.add(r7)     // Catch:{ Exception -> 0x03ad }
            goto L_0x02fe
        L_0x0324:
            int r3 = r3 + 1
            goto L_0x02f0
        L_0x0327:
            java.lang.String r0 = "lqcnt"
            r3 = 30
            int r0 = r5.optInt(r0, r3)     // Catch:{ Exception -> 0x0368 }
            java.lang.String r3 = "lqto"
            r4 = 5
            int r3 = r5.optInt(r3, r4)     // Catch:{ Exception -> 0x0368 }
            java.lang.String r4 = "lqswt"
            int r4 = r5.optInt(r4, r2)     // Catch:{ Exception -> 0x0368 }
            java.lang.String r6 = "lqtype"
            int r6 = r5.optInt(r6, r2)     // Catch:{ Exception -> 0x0368 }
            r14.f14885I = r3     // Catch:{ Exception -> 0x0368 }
            r14.f14884H = r0     // Catch:{ Exception -> 0x0368 }
            r14.f14886J = r4     // Catch:{ Exception -> 0x0368 }
            r14.f14887K = r6     // Catch:{ Exception -> 0x0368 }
            java.lang.String r0 = "lqpt"
            java.lang.String r0 = r5.optString(r0)     // Catch:{ Exception -> 0x0368 }
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.C6348l.m16089b(r0)     // Catch:{ Exception -> 0x0368 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0368 }
            if (r0 <= 0) goto L_0x0368
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 >= r3) goto L_0x0368
            r14.f14888L = r0     // Catch:{ Exception -> 0x0368 }
            com.mbridge.msdk.foundation.same.net.m r3 = com.mbridge.msdk.foundation.same.net.C6295m.m15932a()     // Catch:{ Exception -> 0x0368 }
            r3.mo43897a((int) r0)     // Catch:{ Exception -> 0x0368 }
        L_0x0368:
            java.lang.String r0 = "wvddt"
            int r0 = r5.optInt(r0, r2)     // Catch:{ Exception -> 0x03ad }
            r14.f14913aj = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "host_setting"
            com.mbridge.msdk.foundation.same.net.g.d r3 = com.mbridge.msdk.foundation.same.net.p178g.C6280d.m15868c()     // Catch:{ Exception -> 0x03ad }
            java.lang.String r3 = r3.f15567c     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = r5.optString(r0, r3)     // Catch:{ Exception -> 0x03ad }
            r14.f14937x = r0     // Catch:{ Exception -> 0x03ad }
            java.lang.String r0 = "l"
            r3 = 3
            int r0 = r5.optInt(r0, r3)     // Catch:{ Exception -> 0x03a1 }
            java.lang.String r3 = "k"
            int r3 = r5.optInt(r3, r2)     // Catch:{ Exception -> 0x03a1 }
            if (r3 != r1) goto L_0x038f
            r3 = 1
            goto L_0x0390
        L_0x038f:
            r3 = 0
        L_0x0390:
            java.lang.String r4 = "m"
            int r4 = r5.optInt(r4, r1)     // Catch:{ Exception -> 0x03a1 }
            if (r4 != r1) goto L_0x0399
            goto L_0x039a
        L_0x0399:
            r1 = 0
        L_0x039a:
            r14.f14935v = r0     // Catch:{ Exception -> 0x03a1 }
            r14.f14934u = r3     // Catch:{ Exception -> 0x03a1 }
            r14.f14936w = r1     // Catch:{ Exception -> 0x03a1 }
            goto L_0x03ab
        L_0x03a1:
            r0 = move-exception
            java.lang.String r1 = "Setting"
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x03ad }
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r1, r0)     // Catch:{ Exception -> 0x03ad }
        L_0x03ab:
            r4 = r14
            goto L_0x03b4
        L_0x03ad:
            r0 = move-exception
            r4 = r14
            goto L_0x03b1
        L_0x03b0:
            r0 = move-exception
        L_0x03b1:
            r0.printStackTrace()
        L_0x03b4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.p158b.C6072a.m15000b(java.lang.String):com.mbridge.msdk.b.a");
    }

    /* renamed from: y */
    public final long mo42736y() {
        return this.f14920g;
    }

    /* renamed from: z */
    public final long mo42737z() {
        return this.f14917d * 1000;
    }

    /* renamed from: e */
    public final void mo42705e(long j) {
        this.f14917d = j;
    }

    /* renamed from: a */
    public static String m14999a(Context context, String str) {
        try {
            C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
            if (b == null) {
                return "";
            }
            if (b.f14918e == null) {
                return "";
            }
            String host = Uri.parse(str).getHost();
            for (Map.Entry<String, String> key : b.f14918e.entrySet()) {
                String str2 = (String) key.getKey();
                if (!TextUtils.isEmpty(host) && host.contains(str2)) {
                    String str3 = b.f14918e.get(str2);
                    if (TextUtils.isEmpty(str3)) {
                        return "";
                    }
                    return str3.replace("{gaid}", C6349m.m16113i());
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: c */
    public final void mo42697c(boolean z) {
        this.f14919f = z;
    }

    /* renamed from: A */
    public final int mo42656A() {
        return this.f14926m;
    }

    /* renamed from: B */
    public final int mo42657B() {
        return this.f14927n;
    }

    /* renamed from: C */
    public final String mo42658C() {
        return this.f14892P;
    }

    /* renamed from: D */
    public final String mo42659D() {
        return this.f14893Q;
    }

    /* renamed from: E */
    public final String mo42660E() {
        return this.f14894R;
    }

    /* renamed from: F */
    public final String mo42661F() {
        return this.f14895S;
    }

    /* renamed from: G */
    public final String mo42662G() {
        return this.f14896T;
    }

    /* renamed from: H */
    public final void mo42663H() {
        String language = Locale.getDefault().getLanguage();
        boolean z = true;
        if (!(!TextUtils.isEmpty(this.f14892P) && !TextUtils.isEmpty(this.f14893Q) && !TextUtils.isEmpty(this.f14894R) && !TextUtils.isEmpty(this.f14895S))) {
            if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                this.f14892P = "Confirm to close? ";
                this.f14893Q = "You will not be rewarded after closing the window";
                this.f14894R = "Close it";
                this.f14895S = "Continue";
            } else {
                this.f14892P = "确认关闭？";
                this.f14893Q = "关闭后您将不会获得任何奖励噢~ ";
                this.f14894R = "确认关闭";
                this.f14895S = "继续观看";
            }
        }
        if (TextUtils.isEmpty(this.f14892P) || TextUtils.isEmpty(this.f14893Q) || TextUtils.isEmpty(this.f14894R) || TextUtils.isEmpty(this.f14896T)) {
            z = false;
        }
        if (z) {
            return;
        }
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            this.f14892P = "Confirm to close? ";
            this.f14893Q = "You will not be rewarded after closing the window";
            this.f14894R = "Close it";
            this.f14896T = "Continue";
            return;
        }
        this.f14892P = "确认关闭？";
        this.f14893Q = "关闭后您将不会获得任何奖励噢~ ";
        this.f14894R = "确认关闭";
        this.f14896T = "继续试玩";
    }

    /* renamed from: I */
    public final String mo42664I() {
        return this.f14897U;
    }

    /* renamed from: J */
    public final String mo42665J() {
        return this.f14898V;
    }

    /* renamed from: K */
    public final String mo42666K() {
        return this.f14899W;
    }

    /* renamed from: L */
    public final Map<String, C6073a> mo42667L() {
        return this.f14902Z;
    }

    /* renamed from: d */
    private static Map<String, C6073a> m15001d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C6073a aVar = new C6073a();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    aVar.mo42739a(optJSONObject);
                }
                hashMap.put(next, aVar);
            }
            return hashMap;
        } catch (JSONException e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return null;
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
            return null;
        }
    }

    /* renamed from: M */
    public final int mo42668M() {
        return this.f14884H;
    }

    /* renamed from: N */
    public final int mo42669N() {
        return this.f14885I;
    }

    /* renamed from: O */
    public final int mo42670O() {
        return this.f14886J;
    }

    /* renamed from: P */
    public final int mo42671P() {
        return this.f14887K;
    }

    /* renamed from: Q */
    public final boolean mo42672Q() {
        return this.f14934u;
    }

    /* renamed from: R */
    public final int mo42673R() {
        return this.f14935v;
    }

    /* renamed from: S */
    public final boolean mo42674S() {
        return this.f14936w;
    }

    /* renamed from: com.mbridge.msdk.b.a$a */
    /* compiled from: Setting */
    public static class C6073a {

        /* renamed from: a */
        private List<String> f14940a;

        /* renamed from: b */
        private List<String> f14941b;

        /* renamed from: c */
        private List<String> f14942c;

        /* renamed from: d */
        private List<String> f14943d;

        /* renamed from: a */
        public final List<String> mo42738a() {
            return this.f14940a;
        }

        /* renamed from: b */
        public final List<String> mo42740b() {
            return this.f14941b;
        }

        /* renamed from: c */
        public final List<String> mo42741c() {
            return this.f14942c;
        }

        /* renamed from: d */
        public final List<String> mo42742d() {
            return this.f14943d;
        }

        /* renamed from: a */
        public final void mo42739a(JSONObject jSONObject) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("x");
                if (optJSONArray != null) {
                    this.f14940a = C6337h.m16063a(optJSONArray);
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("y");
                if (optJSONArray2 != null) {
                    this.f14941b = C6337h.m16063a(optJSONArray2);
                }
                JSONArray optJSONArray3 = jSONObject.optJSONArray("width");
                if (optJSONArray3 != null) {
                    this.f14942c = C6337h.m16063a(optJSONArray3);
                }
                JSONArray optJSONArray4 = jSONObject.optJSONArray("height");
                if (optJSONArray4 != null) {
                    this.f14943d = C6337h.m16063a(optJSONArray4);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: T */
    public final String mo42675T() {
        return this.f14905ab;
    }

    /* renamed from: c */
    public final void mo42696c(String str) {
        this.f14905ab = str;
    }

    /* renamed from: U */
    public final String mo42676U() {
        return this.f14906ac;
    }

    /* renamed from: V */
    public final String mo42677V() {
        return this.f14907ad;
    }

    /* renamed from: W */
    public final int mo42678W() {
        return this.f14908ae;
    }

    /* renamed from: m */
    public final void mo42721m(int i) {
        this.f14908ae = i;
    }

    /* renamed from: X */
    public final boolean mo42679X() {
        return this.f14909af;
    }

    /* renamed from: d */
    public final void mo42702d(boolean z) {
        this.f14909af = z;
    }

    /* renamed from: Y */
    public final int mo42680Y() {
        return this.f14910ag;
    }

    /* renamed from: n */
    public final void mo42723n(int i) {
        this.f14910ag = i;
    }

    /* renamed from: Z */
    public final ArrayList<Integer> mo42681Z() {
        return this.f14911ah;
    }

    /* renamed from: aa */
    public final HashMap<String, String> mo42687aa() {
        return this.f14912ai;
    }

    /* renamed from: ab */
    public final int mo42688ab() {
        return this.f14913aj;
    }

    /* renamed from: o */
    public final void mo42725o(int i) {
        this.f14914ak = i;
    }

    /* renamed from: ac */
    public final String mo42689ac() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cfc", this.f14915b);
            jSONObject.put("cfb", this.f14919f);
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, this.f14922i);
            jSONObject.put("awct", this.f14923j);
            jSONObject.put("rurl", this.f14921h);
            jSONObject.put("ujds", this.f14925l);
            jSONObject.put(CampaignEx.JSON_KEY_PLCTB, this.f14928o);
            jSONObject.put("tcto", this.f14917d);
            jSONObject.put("mv_wildcard", this.f14931r);
            jSONObject.put("is_startup_crashsystem", this.f14932s);
            jSONObject.put("sfct", this.f14890N);
            jSONObject.put("pcrn", this.f14929p);
            jSONObject.put("adct", this.f14891O);
            jSONObject.put("atrqt", this.f14903a);
            jSONObject.put("omsdkjs_url", this.f14905ab);
            jSONObject.put("mcs", this.f14938y);
            jSONObject.put("GDPR_area", this.f14909af);
            jSONObject.put("alrbs", this.f14908ae);
            jSONObject.put(UserDataStore.CITY, this.f14910ag);
            jSONObject.put("isDefault", this.f14914ak);
            return jSONObject.toString();
        } catch (Throwable th) {
            C6361q.m16158d("Setting", th.getMessage());
            return null;
        }
    }
}
