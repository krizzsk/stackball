package com.inmobi.media;

import android.graphics.Point;
import android.webkit.URLUtil;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.inmobi.media.C5024bo;
import com.inmobi.media.C5082cp;
import com.smaato.sdk.video.vast.model.Verification;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.bj */
/* compiled from: NativeDataModel */
public class C5016bj {

    /* renamed from: m */
    private static final String f11401m = C5016bj.class.getSimpleName();

    /* renamed from: a */
    public byte f11402a;

    /* renamed from: b */
    public boolean f11403b;

    /* renamed from: c */
    public boolean f11404c;

    /* renamed from: d */
    public C5012bh f11405d;

    /* renamed from: e */
    public JSONArray f11406e;

    /* renamed from: f */
    public C5016bj f11407f;

    /* renamed from: g */
    public Map<String, String> f11408g;

    /* renamed from: h */
    public C5094cv f11409h;

    /* renamed from: i */
    public C5017a f11410i;

    /* renamed from: j */
    public boolean f11411j;

    /* renamed from: k */
    public C5033bt f11412k;

    /* renamed from: l */
    HashMap<String, String> f11413l;

    /* renamed from: n */
    private JSONObject f11414n;

    /* renamed from: o */
    private JSONObject f11415o;

    /* renamed from: p */
    private Map<String, List<C5010bf>> f11416p;

    /* renamed from: q */
    private Map<String, C5010bf> f11417q;

    /* renamed from: r */
    private Map<String, String> f11418r;

    /* renamed from: s */
    private C5220ev f11419s;

    /* renamed from: t */
    private int f11420t;

    /* renamed from: u */
    private boolean f11421u;

    /* renamed from: com.inmobi.media.bj$a */
    /* compiled from: NativeDataModel */
    public class C5017a {

        /* renamed from: a */
        public JSONObject f11422a;

        /* renamed from: b */
        public C5018a f11423b = new C5018a();

        /* renamed from: c */
        public C5010bf f11424c;

        public C5017a() {
        }

        /* renamed from: com.inmobi.media.bj$a$a */
        /* compiled from: NativeDataModel */
        public class C5018a {

            /* renamed from: a */
            public String f11426a;

            /* renamed from: b */
            public String f11427b;

            /* renamed from: c */
            public String f11428c;

            /* renamed from: d */
            public String f11429d;

            /* renamed from: e */
            public float f11430e;

            /* renamed from: f */
            public String f11431f;

            /* renamed from: g */
            public boolean f11432g;

            public C5018a() {
            }
        }
    }

    public C5016bj() {
        this.f11407f = null;
    }

    public C5016bj(int i, JSONObject jSONObject, C5220ev evVar, HashMap<String, String> hashMap, C5094cv cvVar) {
        this(i, jSONObject, (C5016bj) null, false, evVar, hashMap, cvVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C5016bj(int i, JSONObject jSONObject, C5016bj bjVar, boolean z, C5220ev evVar) {
        this(i, jSONObject, bjVar, z, evVar, bjVar == null ? null : bjVar.f11413l, (C5094cv) null);
    }

    private C5016bj(int i, JSONObject jSONObject, C5016bj bjVar, boolean z, C5220ev evVar, HashMap<String, String> hashMap, C5094cv cvVar) {
        this.f11420t = i;
        this.f11407f = bjVar;
        this.f11419s = evVar;
        this.f11414n = jSONObject;
        this.f11402a = 0;
        this.f11403b = false;
        this.f11409h = cvVar;
        this.f11417q = new HashMap();
        this.f11418r = new HashMap();
        this.f11416p = new HashMap();
        this.f11410i = new C5017a();
        this.f11421u = z;
        this.f11413l = hashMap;
        m11424i();
    }

    /* renamed from: a */
    public final HashMap<String, String> mo40181a() {
        HashMap<String, String> hashMap = this.f11413l;
        return hashMap == null ? new HashMap<>() : hashMap;
    }

    /* renamed from: b */
    public final JSONObject mo40183b() {
        try {
            return this.f11406e.getJSONObject(0);
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return null;
        }
    }

    /* renamed from: f */
    private C5012bh m11414f() {
        Iterator<C5010bf> it = this.f11405d.iterator();
        while (it.hasNext()) {
            C5010bf next = it.next();
            if (next.f11362d.equalsIgnoreCase("card_scrollable")) {
                return (C5012bh) next;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final int mo40184c() {
        C5012bh bhVar = this.f11405d;
        if (bhVar == null) {
            return 0;
        }
        Iterator<C5010bf> it = bhVar.iterator();
        while (it.hasNext()) {
            C5010bf next = it.next();
            if (next.f11362d.equalsIgnoreCase("card_scrollable")) {
                return ((C5012bh) next).f11397C;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final C5012bh mo40180a(int i) {
        Iterator<C5010bf> it = this.f11405d.iterator();
        while (it.hasNext()) {
            C5010bf next = it.next();
            if (next.f11362d.equalsIgnoreCase("card_scrollable")) {
                C5012bh bhVar = (C5012bh) next;
                if (i >= bhVar.f11397C) {
                    return null;
                }
                return (C5012bh) bhVar.mo40173a(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C5012bh m11396a(C5010bf bfVar) {
        if (bfVar instanceof C5012bh) {
            C5012bh bhVar = (C5012bh) bfVar;
            if (m11402a(bhVar)) {
                return bhVar;
            }
        }
        for (C5012bh bhVar2 = (C5012bh) bfVar.f11378t; bhVar2 != null; bhVar2 = (C5012bh) bhVar2.f11378t) {
            if (m11402a(bhVar2)) {
                return bhVar2;
            }
        }
        return null;
    }

    /* renamed from: g */
    private void m11419g() {
        C5010bf a;
        List<C5082cp.C5083a> list;
        for (C5010bf next : mo40185c(ShareConstants.IMAGE_URL)) {
            if (!URLUtil.isValidUrl((String) next.f11363e) && (a = m11393a(this, next)) != null) {
                if (a.f11360b.equals(next.f11360b)) {
                    next.f11363e = a.f11363e;
                } else if (ShareConstants.VIDEO_URL.equals(a.f11360b) && 1 != a.f11371m && 2 == a.f11371m) {
                    C5031bs bsVar = (C5031bs) a;
                    C5095cw b = bsVar.mo40205b();
                    C5082cp a2 = C5081co.m11531a(bsVar, next);
                    C5082cp.C5083a aVar = null;
                    if (a2 == null) {
                        list = null;
                    } else {
                        list = a2.mo40343a(1);
                    }
                    if (list != null) {
                        Iterator<C5082cp.C5083a> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C5082cp.C5083a next2 = it.next();
                            if (URLUtil.isValidUrl(next2.f11639b)) {
                                aVar = next2;
                                break;
                            }
                        }
                    }
                    if (a2 != null && aVar != null) {
                        b.mo40358a(a2);
                        next.f11363e = aVar.f11639b;
                        next.mo40164a(a2.mo40344a("creativeView"));
                        for (C5030br next3 : bsVar.f11379u) {
                            if ("error".equals(next3.f11469d)) {
                                next.f11379u.add(next3);
                            }
                        }
                    } else if (b.mo40362e().size() > 0) {
                        m11401a(bsVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0107  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11422h() {
        /*
            r12 = this;
            java.lang.String r0 = "WEBVIEW"
            java.util.List r0 = r12.mo40185c((java.lang.String) r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0110
            java.lang.Object r1 = r0.next()
            com.inmobi.media.bf r1 = (com.inmobi.media.C5010bf) r1
            r2 = r1
            com.inmobi.media.bt r2 = (com.inmobi.media.C5033bt) r2
            java.lang.String r3 = r2.f11483z
            java.lang.String r4 = "URL"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x000a
            java.lang.String r3 = r2.f11483z
            java.lang.String r4 = "HTML"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x000a
            com.inmobi.media.bf r3 = m11393a((com.inmobi.media.C5016bj) r12, (com.inmobi.media.C5010bf) r1)
            if (r3 == 0) goto L_0x000a
            java.lang.String r4 = r3.f11360b
            java.lang.String r5 = r1.f11360b
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0042
            java.lang.Object r2 = r3.f11363e
            r1.f11363e = r2
            goto L_0x000a
        L_0x0042:
            java.lang.String r4 = r3.f11360b
            java.lang.String r5 = "VIDEO"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x000a
            byte r4 = r3.f11371m
            r5 = 2
            if (r5 != r4) goto L_0x000a
            com.inmobi.media.bs r3 = (com.inmobi.media.C5031bs) r3
            com.inmobi.media.cw r4 = r3.mo40205b()
            com.inmobi.media.cp r6 = com.inmobi.media.C5081co.m11531a(r3, r1)
            java.lang.String r7 = "REF_HTML"
            java.lang.String r8 = "REF_IFRAME"
            if (r6 == 0) goto L_0x00d1
            java.lang.String r9 = r2.f11483z
            boolean r9 = r7.equals(r9)
            r10 = 3
            r11 = 0
            if (r9 == 0) goto L_0x0099
            java.util.List r5 = r6.mo40343a((int) r5)
            int r9 = r5.size()
            if (r9 <= 0) goto L_0x007e
            java.lang.Object r5 = r5.get(r11)
            com.inmobi.media.cp$a r5 = (com.inmobi.media.C5082cp.C5083a) r5
            java.lang.String r5 = r5.f11639b
            goto L_0x00d2
        L_0x007e:
            java.util.List r5 = r6.mo40343a((int) r10)
            int r9 = r5.size()
            if (r9 <= 0) goto L_0x00d1
            java.lang.Object r5 = r5.get(r11)
            com.inmobi.media.cp$a r5 = (com.inmobi.media.C5082cp.C5083a) r5
            java.lang.String r5 = r5.f11639b
            boolean r9 = android.webkit.URLUtil.isValidUrl(r5)
            if (r9 == 0) goto L_0x00d1
            r2.f11483z = r8
            goto L_0x00d2
        L_0x0099:
            java.lang.String r9 = r2.f11483z
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x00d1
            java.util.List r9 = r6.mo40343a((int) r10)
            int r10 = r9.size()
            if (r10 <= 0) goto L_0x00bc
            java.lang.Object r5 = r9.get(r11)
            com.inmobi.media.cp$a r5 = (com.inmobi.media.C5082cp.C5083a) r5
            java.lang.String r5 = r5.f11639b
            boolean r9 = android.webkit.URLUtil.isValidUrl(r5)
            if (r9 == 0) goto L_0x00d1
            r2.f11483z = r8
            goto L_0x00d2
        L_0x00bc:
            java.util.List r5 = r6.mo40343a((int) r5)
            int r9 = r5.size()
            if (r9 <= 0) goto L_0x00d1
            r2.f11483z = r7
            java.lang.Object r5 = r5.get(r11)
            com.inmobi.media.cp$a r5 = (com.inmobi.media.C5082cp.C5083a) r5
            java.lang.String r5 = r5.f11639b
            goto L_0x00d2
        L_0x00d1:
            r5 = 0
        L_0x00d2:
            java.lang.String r9 = r2.f11483z
            boolean r8 = r8.equals(r9)
            java.lang.String r9 = r2.f11483z
            boolean r7 = r7.equals(r9)
            if (r6 == 0) goto L_0x00fd
            if (r8 == 0) goto L_0x00e8
            boolean r8 = android.webkit.URLUtil.isValidUrl(r5)
            if (r8 == 0) goto L_0x00fd
        L_0x00e8:
            if (r7 == 0) goto L_0x00ed
            if (r5 != 0) goto L_0x00ed
            goto L_0x00fd
        L_0x00ed:
            r4.mo40358a(r6)
            r1.f11363e = r5
            java.lang.String r2 = "creativeView"
            java.util.List r2 = r6.mo40344a((java.lang.String) r2)
            r1.mo40164a((java.util.List<com.inmobi.media.C5030br>) r2)
            goto L_0x000a
        L_0x00fd:
            java.util.List r1 = r4.mo40362e()
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x010a
            m11401a((com.inmobi.media.C5031bs) r3)
        L_0x010a:
            java.lang.String r1 = "UNKNOWN"
            r2.f11483z = r1
            goto L_0x000a
        L_0x0110:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5016bj.m11422h():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:39|40|41|42|(2:44|45)(1:46)|47|(1:49)|50|51|52|(1:54)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0151 */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0295 A[Catch:{ JSONException -> 0x02a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x029d A[Catch:{ JSONException -> 0x02a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ JSONException -> 0x02a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076 A[Catch:{ JSONException -> 0x02a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9 A[Catch:{ JSONException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011a A[Catch:{ JSONException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0157 A[Catch:{ JSONException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0172 A[Catch:{ JSONException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0199 A[Catch:{ JSONException -> 0x02a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a8 A[Catch:{ JSONException -> 0x02a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01c3 A[Catch:{ JSONException -> 0x02a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0237 A[Catch:{ JSONException -> 0x02a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x023b A[Catch:{ JSONException -> 0x02a6 }] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11424i() {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = "fallbackUrl"
            java.lang.String r2 = "action"
            java.lang.String r3 = "pages"
            java.lang.String r4 = "openMode"
            java.lang.String r5 = "itemUrl"
            java.lang.String r6 = "onClick"
            java.lang.String r7 = "adContent"
            java.lang.String r8 = "passThroughJson"
            java.lang.String r9 = "orientation"
            org.json.JSONObject r10 = r1.f11414n     // Catch:{ JSONException -> 0x02a6 }
            java.lang.String r11 = "styleRefs"
            org.json.JSONObject r10 = r10.optJSONObject(r11)     // Catch:{ JSONException -> 0x02a6 }
            r1.f11415o = r10     // Catch:{ JSONException -> 0x02a6 }
            org.json.JSONObject r10 = r1.f11414n     // Catch:{ JSONException -> 0x02a6 }
            boolean r10 = r10.isNull(r9)     // Catch:{ JSONException -> 0x02a6 }
            r12 = 2
            r13 = 1
            r14 = 0
            if (r10 == 0) goto L_0x002b
        L_0x0029:
            r9 = 0
            goto L_0x0077
        L_0x002b:
            org.json.JSONObject r10 = r1.f11414n     // Catch:{ JSONException -> 0x02a6 }
            java.lang.String r9 = r10.getString(r9)     // Catch:{ JSONException -> 0x02a6 }
            java.util.Locale r10 = java.util.Locale.US     // Catch:{ JSONException -> 0x02a6 }
            java.lang.String r9 = r9.toLowerCase(r10)     // Catch:{ JSONException -> 0x02a6 }
            java.lang.String r9 = r9.trim()     // Catch:{ JSONException -> 0x02a6 }
            int r10 = r9.hashCode()     // Catch:{ JSONException -> 0x02a6 }
            r15 = -1626174665(0xffffffff9f128b37, float:-3.103186E-20)
            r11 = 3
            if (r10 == r15) goto L_0x0064
            r15 = 729267099(0x2b77bb9b, float:8.8012383E-13)
            if (r10 == r15) goto L_0x005a
            r15 = 1430647483(0x5545f2bb, float:1.36028944E13)
            if (r10 == r15) goto L_0x0050
            goto L_0x006e
        L_0x0050:
            java.lang.String r10 = "landscape"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x02a6 }
            if (r9 == 0) goto L_0x006e
            r9 = 3
            goto L_0x006f
        L_0x005a:
            java.lang.String r10 = "portrait"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x02a6 }
            if (r9 == 0) goto L_0x006e
            r9 = 2
            goto L_0x006f
        L_0x0064:
            java.lang.String r10 = "unspecified"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x02a6 }
            if (r9 == 0) goto L_0x006e
            r9 = 1
            goto L_0x006f
        L_0x006e:
            r9 = -1
        L_0x006f:
            if (r9 == r12) goto L_0x0076
            if (r9 == r11) goto L_0x0074
            goto L_0x0029
        L_0x0074:
            r9 = 2
            goto L_0x0077
        L_0x0076:
            r9 = 1
        L_0x0077:
            r1.f11402a = r9     // Catch:{ JSONException -> 0x02a6 }
            org.json.JSONObject r9 = r1.f11414n     // Catch:{ JSONException -> 0x02a6 }
            java.lang.String r10 = "shouldAutoOpenLandingPage"
            boolean r9 = r9.optBoolean(r10, r13)     // Catch:{ JSONException -> 0x02a6 }
            r1.f11411j = r9     // Catch:{ JSONException -> 0x02a6 }
            org.json.JSONObject r9 = r1.f11414n     // Catch:{ JSONException -> 0x02a6 }
            java.lang.String r10 = "disableBackButton"
            boolean r9 = r9.optBoolean(r10, r14)     // Catch:{ JSONException -> 0x02a6 }
            r1.f11403b = r9     // Catch:{ JSONException -> 0x02a6 }
            org.json.JSONObject r9 = r1.f11414n     // Catch:{ JSONException -> 0x02a6 }
            java.lang.String r10 = "rootContainer"
            org.json.JSONObject r9 = r9.getJSONObject(r10)     // Catch:{ JSONException -> 0x02a6 }
            java.lang.String r10 = "CONTAINER"
            java.lang.String r11 = "/rootContainer"
            com.inmobi.media.bf r9 = r1.m11394a((org.json.JSONObject) r9, (java.lang.String) r10, (java.lang.String) r11)     // Catch:{ JSONException -> 0x02a6 }
            com.inmobi.media.bh r9 = (com.inmobi.media.C5012bh) r9     // Catch:{ JSONException -> 0x02a6 }
            r1.f11405d = r9     // Catch:{ JSONException -> 0x02a6 }
            org.json.JSONObject r9 = r1.f11414n     // Catch:{ JSONException -> 0x0180 }
            boolean r9 = r9.isNull(r8)     // Catch:{ JSONException -> 0x0180 }
            if (r9 != 0) goto L_0x00b3
            com.inmobi.media.bj$a r9 = r1.f11410i     // Catch:{ JSONException -> 0x0180 }
            org.json.JSONObject r10 = r1.f11414n     // Catch:{ JSONException -> 0x0180 }
            org.json.JSONObject r8 = r10.getJSONObject(r8)     // Catch:{ JSONException -> 0x0180 }
            r9.f11422a = r8     // Catch:{ JSONException -> 0x0180 }
        L_0x00b3:
            org.json.JSONObject r8 = r1.f11414n     // Catch:{ JSONException -> 0x0180 }
            boolean r8 = r8.isNull(r7)     // Catch:{ JSONException -> 0x0180 }
            if (r8 != 0) goto L_0x010d
            org.json.JSONObject r8 = r1.f11414n     // Catch:{ JSONException -> 0x0180 }
            org.json.JSONObject r7 = r8.getJSONObject(r7)     // Catch:{ JSONException -> 0x0180 }
            if (r7 == 0) goto L_0x010d
            com.inmobi.media.bj$a$a r8 = new com.inmobi.media.bj$a$a     // Catch:{ JSONException -> 0x0180 }
            com.inmobi.media.bj$a r9 = r1.f11410i     // Catch:{ JSONException -> 0x0180 }
            r9.getClass()     // Catch:{ JSONException -> 0x0180 }
            r8.<init>()     // Catch:{ JSONException -> 0x0180 }
            java.lang.String r9 = "title"
            r10 = 0
            java.lang.String r9 = r7.optString(r9, r10)     // Catch:{ JSONException -> 0x0180 }
            r8.f11426a = r9     // Catch:{ JSONException -> 0x0180 }
            java.lang.String r9 = "description"
            java.lang.String r9 = r7.optString(r9, r10)     // Catch:{ JSONException -> 0x0180 }
            r8.f11427b = r9     // Catch:{ JSONException -> 0x0180 }
            java.lang.String r9 = "ctaText"
            java.lang.String r9 = r7.optString(r9, r10)     // Catch:{ JSONException -> 0x0180 }
            r8.f11429d = r9     // Catch:{ JSONException -> 0x0180 }
            java.lang.String r9 = "iconUrl"
            java.lang.String r9 = r7.optString(r9, r10)     // Catch:{ JSONException -> 0x0180 }
            r8.f11428c = r9     // Catch:{ JSONException -> 0x0180 }
            java.lang.String r9 = "rating"
            r12 = 0
            long r12 = r7.optLong(r9, r12)     // Catch:{ JSONException -> 0x0180 }
            float r9 = (float) r12     // Catch:{ JSONException -> 0x0180 }
            r8.f11430e = r9     // Catch:{ JSONException -> 0x0180 }
            java.lang.String r9 = "landingPageUrl"
            java.lang.String r9 = r7.optString(r9, r10)     // Catch:{ JSONException -> 0x0180 }
            r8.f11431f = r9     // Catch:{ JSONException -> 0x0180 }
            java.lang.String r9 = "isApp"
            boolean r7 = r7.optBoolean(r9)     // Catch:{ JSONException -> 0x0180 }
            r8.f11432g = r7     // Catch:{ JSONException -> 0x0180 }
            com.inmobi.media.bj$a r7 = r1.f11410i     // Catch:{ JSONException -> 0x0180 }
            r7.f11423b = r8     // Catch:{ JSONException -> 0x0180 }
        L_0x010d:
            com.inmobi.media.bf r7 = new com.inmobi.media.bf     // Catch:{ JSONException -> 0x0180 }
            r7.<init>()     // Catch:{ JSONException -> 0x0180 }
            org.json.JSONObject r8 = r1.f11414n     // Catch:{ JSONException -> 0x0180 }
            boolean r8 = r8.isNull(r6)     // Catch:{ JSONException -> 0x0180 }
            if (r8 != 0) goto L_0x0168
            org.json.JSONObject r8 = r1.f11414n     // Catch:{ JSONException -> 0x0180 }
            org.json.JSONObject r6 = r8.getJSONObject(r6)     // Catch:{ JSONException -> 0x0180 }
            boolean r8 = r6.isNull(r5)     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r9 = ""
            if (r8 != 0) goto L_0x012e
            java.lang.String r5 = r6.getString(r5)     // Catch:{ JSONException -> 0x0151 }
            r8 = 1
            goto L_0x0130
        L_0x012e:
            r5 = r9
            r8 = 0
        L_0x0130:
            boolean r10 = r6.isNull(r2)     // Catch:{ JSONException -> 0x0151 }
            if (r10 != 0) goto L_0x013b
            java.lang.String r9 = r6.getString(r2)     // Catch:{ JSONException -> 0x0151 }
            r8 = 1
        L_0x013b:
            r7.mo40162a((java.lang.String) r5)     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r2 = r6.optString(r0)     // Catch:{ JSONException -> 0x0151 }
            r7.mo40165b(r2)     // Catch:{ JSONException -> 0x0151 }
            r7.f11368j = r9     // Catch:{ JSONException -> 0x0151 }
            r7.f11366h = r8     // Catch:{ JSONException -> 0x0151 }
            java.lang.String r2 = "appBundleId"
            java.lang.String r2 = r6.optString(r2)     // Catch:{ JSONException -> 0x0151 }
            r7.f11381w = r2     // Catch:{ JSONException -> 0x0151 }
        L_0x0151:
            boolean r2 = r6.isNull(r4)     // Catch:{ JSONException -> 0x0180 }
            if (r2 != 0) goto L_0x0168
            java.lang.String r2 = r6.getString(r4)     // Catch:{ JSONException -> 0x0180 }
            byte r2 = m11410d((java.lang.String) r2)     // Catch:{ JSONException -> 0x0180 }
            r7.f11367i = r2     // Catch:{ JSONException -> 0x0180 }
            java.lang.String r0 = r6.optString(r0)     // Catch:{ JSONException -> 0x0180 }
            r7.mo40165b(r0)     // Catch:{ JSONException -> 0x0180 }
        L_0x0168:
            org.json.JSONObject r0 = r1.f11414n     // Catch:{ JSONException -> 0x0180 }
            java.lang.String r2 = "trackers"
            boolean r0 = r0.isNull(r2)     // Catch:{ JSONException -> 0x0180 }
            if (r0 != 0) goto L_0x017b
            org.json.JSONObject r0 = r1.f11414n     // Catch:{ JSONException -> 0x0180 }
            java.util.List r0 = m11407b((org.json.JSONObject) r0)     // Catch:{ JSONException -> 0x0180 }
            r7.mo40164a((java.util.List<com.inmobi.media.C5030br>) r0)     // Catch:{ JSONException -> 0x0180 }
        L_0x017b:
            com.inmobi.media.bj$a r0 = r1.f11410i     // Catch:{ JSONException -> 0x0180 }
            r0.f11424c = r7     // Catch:{ JSONException -> 0x0180 }
            goto L_0x018d
        L_0x0180:
            r0 = move-exception
            com.inmobi.media.fn r2 = com.inmobi.media.C5275fn.m12068a()     // Catch:{ JSONException -> 0x02a6 }
            com.inmobi.media.gk r4 = new com.inmobi.media.gk     // Catch:{ JSONException -> 0x02a6 }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x02a6 }
            r2.mo40590a((com.inmobi.media.C5308gk) r4)     // Catch:{ JSONException -> 0x02a6 }
        L_0x018d:
            r1.f11404c = r14     // Catch:{ JSONException -> 0x02a6 }
            org.json.JSONObject r0 = r1.f11414n     // Catch:{ JSONException -> 0x02a6 }
            java.lang.String r2 = "rewards"
            boolean r0 = r0.has(r2)     // Catch:{ JSONException -> 0x02a6 }
            if (r0 == 0) goto L_0x01a0
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ JSONException -> 0x02a6 }
            r0.<init>()     // Catch:{ JSONException -> 0x02a6 }
            r1.f11408g = r0     // Catch:{ JSONException -> 0x02a6 }
        L_0x01a0:
            org.json.JSONObject r0 = r1.f11414n     // Catch:{ JSONException -> 0x02a6 }
            java.util.Map r0 = com.inmobi.media.C4948ah.m11142b(r0)     // Catch:{ JSONException -> 0x02a6 }
            if (r0 == 0) goto L_0x01ad
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.f11408g     // Catch:{ JSONException -> 0x02a6 }
            r2.putAll(r0)     // Catch:{ JSONException -> 0x02a6 }
        L_0x01ad:
            r16.m11419g()     // Catch:{ JSONException -> 0x02a6 }
            r16.m11422h()     // Catch:{ JSONException -> 0x02a6 }
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f11418r     // Catch:{ JSONException -> 0x02a6 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ JSONException -> 0x02a6 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ JSONException -> 0x02a6 }
        L_0x01bd:
            boolean r0 = r2.hasNext()     // Catch:{ JSONException -> 0x02a6 }
            if (r0 == 0) goto L_0x028d
            java.lang.Object r0 = r2.next()     // Catch:{ JSONException -> 0x02a6 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ JSONException -> 0x02a6 }
            java.lang.Object r4 = r0.getValue()     // Catch:{ JSONException -> 0x02a6 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ JSONException -> 0x02a6 }
            java.util.Map<java.lang.String, com.inmobi.media.bf> r5 = r1.f11417q     // Catch:{ JSONException -> 0x02a6 }
            java.lang.Object r0 = r0.getKey()     // Catch:{ JSONException -> 0x02a6 }
            java.lang.Object r0 = r5.get(r0)     // Catch:{ JSONException -> 0x02a6 }
            r5 = r0
            com.inmobi.media.bf r5 = (com.inmobi.media.C5010bf) r5     // Catch:{ JSONException -> 0x02a6 }
            if (r5 == 0) goto L_0x0288
            byte r0 = r5.f11372n     // Catch:{ JSONException -> 0x02a6 }
            r6 = 4
            if (r6 != r0) goto L_0x0288
            int r0 = r5.f11373o     // Catch:{ JSONException -> 0x02a6 }
            r7 = -1
            if (r0 != r7) goto L_0x01ec
            int r0 = r5.f11374p     // Catch:{ JSONException -> 0x02a6 }
            if (r0 == r7) goto L_0x0288
        L_0x01ec:
            java.util.Map<java.lang.String, com.inmobi.media.bf> r0 = r1.f11417q     // Catch:{ JSONException -> 0x02a6 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ JSONException -> 0x02a6 }
            r4 = r0
            com.inmobi.media.bf r4 = (com.inmobi.media.C5010bf) r4     // Catch:{ JSONException -> 0x02a6 }
            if (r4 == 0) goto L_0x0288
            java.lang.String r0 = "VIDEO"
            java.lang.String r7 = r4.f11360b     // Catch:{ JSONException -> 0x02a6 }
            boolean r0 = r0.equals(r7)     // Catch:{ JSONException -> 0x02a6 }
            if (r0 == 0) goto L_0x0288
            r0 = r4
            com.inmobi.media.bs r0 = (com.inmobi.media.C5031bs) r0     // Catch:{ JSONException -> 0x02a6 }
            com.inmobi.media.cw r0 = r0.mo40205b()     // Catch:{ JSONException -> 0x02a6 }
            com.inmobi.media.cv r0 = (com.inmobi.media.C5094cv) r0     // Catch:{ JSONException -> 0x02a6 }
            java.lang.String r0 = r0.f11677b     // Catch:{ JSONException -> 0x02a6 }
            java.lang.String r7 = ":"
            java.lang.String[] r0 = r0.split(r7)     // Catch:{ JSONException -> 0x02a6 }
            r7 = 1
            r8 = r0[r7]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0226 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0226 }
            int r8 = r8 * 60
            r9 = 2
            r0 = r0[r9]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0224 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0224 }
            int r8 = r8 + r0
            goto L_0x0235
        L_0x0224:
            r0 = move-exception
            goto L_0x0228
        L_0x0226:
            r0 = move-exception
            r9 = 2
        L_0x0228:
            com.inmobi.media.fn r8 = com.inmobi.media.C5275fn.m12068a()     // Catch:{ JSONException -> 0x02a6 }
            com.inmobi.media.gk r10 = new com.inmobi.media.gk     // Catch:{ JSONException -> 0x02a6 }
            r10.<init>(r0)     // Catch:{ JSONException -> 0x02a6 }
            r8.mo40590a((com.inmobi.media.C5308gk) r10)     // Catch:{ JSONException -> 0x02a6 }
            r8 = 0
        L_0x0235:
            if (r8 != 0) goto L_0x023b
            r5.f11373o = r14     // Catch:{ JSONException -> 0x02a6 }
            r13 = -1
            goto L_0x027f
        L_0x023b:
            int r0 = r5.f11373o     // Catch:{ JSONException -> 0x02a6 }
            r10 = 100
            r11 = 75
            r12 = 50
            r13 = -1
            if (r0 == r13) goto L_0x0260
            if (r0 == 0) goto L_0x0260
            if (r0 == r12) goto L_0x025c
            if (r0 == r11) goto L_0x0256
            if (r0 == r10) goto L_0x0253
            int r0 = r8 / 4
            r5.f11373o = r0     // Catch:{ JSONException -> 0x02a6 }
            goto L_0x0260
        L_0x0253:
            r5.f11373o = r8     // Catch:{ JSONException -> 0x02a6 }
            goto L_0x0260
        L_0x0256:
            int r0 = r8 * 3
            int r0 = r0 / r6
            r5.f11373o = r0     // Catch:{ JSONException -> 0x02a6 }
            goto L_0x0260
        L_0x025c:
            int r0 = r8 / 2
            r5.f11373o = r0     // Catch:{ JSONException -> 0x02a6 }
        L_0x0260:
            int r0 = r5.f11374p     // Catch:{ JSONException -> 0x02a6 }
            r13 = -1
            if (r0 == r13) goto L_0x027f
            if (r0 == 0) goto L_0x027f
            if (r0 == r12) goto L_0x027b
            if (r0 == r11) goto L_0x0275
            if (r0 == r10) goto L_0x0272
            int r8 = r8 / 4
            r5.f11374p = r8     // Catch:{ JSONException -> 0x02a6 }
            goto L_0x027f
        L_0x0272:
            r5.f11374p = r8     // Catch:{ JSONException -> 0x02a6 }
            goto L_0x027f
        L_0x0275:
            int r8 = r8 * 3
            int r8 = r8 / r6
            r5.f11374p = r8     // Catch:{ JSONException -> 0x02a6 }
            goto L_0x027f
        L_0x027b:
            int r8 = r8 / 2
            r5.f11374p = r8     // Catch:{ JSONException -> 0x02a6 }
        L_0x027f:
            com.inmobi.media.bs r4 = (com.inmobi.media.C5031bs) r4     // Catch:{ JSONException -> 0x02a6 }
            java.util.List<com.inmobi.media.bf> r0 = r4.f11480z     // Catch:{ JSONException -> 0x02a6 }
            r0.add(r5)     // Catch:{ JSONException -> 0x02a6 }
            goto L_0x01bd
        L_0x0288:
            r7 = 1
            r9 = 2
            r13 = -1
            goto L_0x01bd
        L_0x028d:
            org.json.JSONObject r0 = r1.f11414n     // Catch:{ JSONException -> 0x02a6 }
            boolean r0 = r0.isNull(r3)     // Catch:{ JSONException -> 0x02a6 }
            if (r0 == 0) goto L_0x029d
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x02a6 }
            r0.<init>()     // Catch:{ JSONException -> 0x02a6 }
            r1.f11406e = r0     // Catch:{ JSONException -> 0x02a6 }
            return
        L_0x029d:
            org.json.JSONObject r0 = r1.f11414n     // Catch:{ JSONException -> 0x02a6 }
            org.json.JSONArray r0 = r0.getJSONArray(r3)     // Catch:{ JSONException -> 0x02a6 }
            r1.f11406e = r0     // Catch:{ JSONException -> 0x02a6 }
            return
        L_0x02a6:
            r0 = move-exception
            com.inmobi.media.fn r2 = com.inmobi.media.C5275fn.m12068a()
            com.inmobi.media.gk r3 = new com.inmobi.media.gk
            r3.<init>(r0)
            r2.mo40590a((com.inmobi.media.C5308gk) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5016bj.m11424i():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte m11390a(java.lang.String r5) {
        /*
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r0)
            java.lang.String r5 = r5.trim()
            int r0 = r5.hashCode()
            r1 = -1412832500(0xffffffffabc9e30c, float:-1.4344927E-12)
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x0032
            if (r0 == 0) goto L_0x0028
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L_0x001e
            goto L_0x003c
        L_0x001e:
            java.lang.String r0 = "video"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003c
            r5 = 2
            goto L_0x003d
        L_0x0028:
            java.lang.String r0 = ""
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003c
            r5 = 1
            goto L_0x003d
        L_0x0032:
            java.lang.String r0 = "companion"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003c
            r5 = 3
            goto L_0x003d
        L_0x003c:
            r5 = -1
        L_0x003d:
            if (r5 == r4) goto L_0x0046
            if (r5 == r3) goto L_0x0046
            if (r5 == r2) goto L_0x0045
            r5 = 0
            return r5
        L_0x0045:
            return r3
        L_0x0046:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5016bj.m11390a(java.lang.String):byte");
    }

    /* renamed from: d */
    public final boolean mo40186d() {
        if (this.f11405d == null) {
            return false;
        }
        if (m11414f() == null) {
            return m11426j();
        }
        if (mo40184c() <= 0) {
            return false;
        }
        return m11426j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m11426j() {
        /*
            r5 = this;
            java.lang.String r0 = "VIDEO"
            java.util.List r0 = r5.mo40185c((java.lang.String) r0)
            r1 = 1
            if (r0 == 0) goto L_0x0062
            int r2 = r0.size()
            if (r2 > 0) goto L_0x0010
            goto L_0x0062
        L_0x0010:
            java.util.Iterator r0 = r0.iterator()
        L_0x0014:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0062
            java.lang.Object r2 = r0.next()
            com.inmobi.media.bf r2 = (com.inmobi.media.C5010bf) r2
            java.lang.String r3 = r2.f11359a
            r3.length()
            com.inmobi.media.bs r2 = (com.inmobi.media.C5031bs) r2
            com.inmobi.media.cw r3 = r2.mo40205b()
            r4 = 0
            if (r3 != 0) goto L_0x002f
            return r4
        L_0x002f:
            com.inmobi.media.cw r3 = r2.mo40205b()
            java.util.List r3 = r3.mo40360c()
            if (r3 == 0) goto L_0x0061
            int r3 = r3.size()
            if (r3 != 0) goto L_0x0040
            goto L_0x0061
        L_0x0040:
            com.inmobi.media.cw r3 = r2.mo40205b()
            java.lang.String r3 = r3.mo40359b()
            if (r3 == 0) goto L_0x0050
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0014
        L_0x0050:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "[ERRORCODE]"
            java.lang.String r3 = "403"
            r0.put(r1, r3)
            java.lang.String r1 = "error"
            r2.mo40163a((java.lang.String) r1, (java.util.Map<java.lang.String, java.lang.String>) r0)
        L_0x0061:
            return r4
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5016bj.m11426j():boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: com.inmobi.media.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: com.inmobi.media.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.inmobi.media.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: com.inmobi.media.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: com.inmobi.media.bp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: com.inmobi.media.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: com.inmobi.media.bt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: com.inmobi.media.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: com.inmobi.media.bs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: com.inmobi.media.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: com.inmobi.media.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: com.inmobi.media.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: com.inmobi.media.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: com.inmobi.media.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v5, resolved type: com.inmobi.media.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v89, resolved type: com.inmobi.media.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v90, resolved type: com.inmobi.media.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v92, resolved type: com.inmobi.media.bs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: com.inmobi.media.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: com.inmobi.media.bi} */
    /* JADX WARNING: type inference failed for: r2v21, types: [com.inmobi.media.bf, com.inmobi.media.bn] */
    /* JADX WARNING: type inference failed for: r1v20, types: [com.inmobi.media.bf, com.inmobi.media.bl] */
    /* JADX WARNING: type inference failed for: r0v48, types: [com.inmobi.media.bf] */
    /* JADX WARNING: type inference failed for: r2v55, types: [com.inmobi.media.bf] */
    /* JADX WARNING: type inference failed for: r2v57 */
    /* JADX WARNING: type inference failed for: r2v58, types: [com.inmobi.media.bf] */
    /* JADX WARNING: type inference failed for: r6v87, types: [com.inmobi.media.bf] */
    /* JADX WARNING: type inference failed for: r6v88, types: [com.inmobi.media.bf] */
    /* JADX WARNING: type inference failed for: r8v30, types: [com.inmobi.media.bk] */
    /* JADX WARNING: type inference failed for: r8v31, types: [com.inmobi.media.bm] */
    /* JADX WARNING: type inference failed for: r8v32, types: [com.inmobi.media.bk] */
    /* JADX WARNING: type inference failed for: r8v33, types: [com.inmobi.media.bm] */
    /* JADX WARNING: type inference failed for: r2v61 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r1 = m11410d(r15.getJSONObject("assetOnclick").getString("openMode"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x019e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x019f, code lost:
        r6 = r46;
        r26 = r12;
        r32 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01a6, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r2 = r15.getJSONObject("assetOnclick").optString("fallbackUrl");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01af, code lost:
        if (r18 == null) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01b5, code lost:
        if (r18.size() != 0) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01ba, code lost:
        r8 = r8;
        r7 = r25;
        r6 = r24;
        r4 = r12;
        r5 = r49;
        r32 = r13;
        r14 = r1;
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        r8 = new com.inmobi.media.C5014bi(r12, r10, r0, r27, r18, r14, r47);
        r15 = r1;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01d3, code lost:
        r5 = r49;
        r4 = r12;
        r32 = r13;
        r6 = r24;
        r7 = r25;
        r8 = new com.inmobi.media.C5014bi(r4, r10, r0, r27, r1, r47);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01e9, code lost:
        r3.f11365g = r5;
        m11400a((com.inmobi.media.C5010bf) r3, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01ee, code lost:
        if (r2 == null) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01f0, code lost:
        r3.mo40165b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01f3, code lost:
        r21 = r3;
        r26 = r4;
        r44 = r6;
        r43 = r7;
        r6 = r46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01ff, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0200, code lost:
        r26 = r4;
        r44 = r6;
        r43 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0208, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0209, code lost:
        r32 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x020c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x020d, code lost:
        r32 = r19;
        r31 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0211, code lost:
        r6 = r46;
        r26 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0217, code lost:
        r32 = r19;
        r31 = r20;
        r6 = r46;
        r26 = r12;
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0221, code lost:
        r44 = r24;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0223, code lost:
        r43 = r25;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0227, code lost:
        r1 = r46;
        r14 = r49;
        r13 = r12;
        r32 = r19;
        r31 = r20;
        r6 = r24;
        r7 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        r1.f11416p.get(r28);
        r33 = new com.inmobi.media.C5031bs.C5032a(r2.x, r2.y, r3.x, r3.y, r4.x, r4.y, r5.x, r5.y, m11435s(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0268, code lost:
        if (r1.f11409h != null) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x026a, code lost:
        r2 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        r0 = m11398a(r15, r27, (com.inmobi.media.C5010bf) r2);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0273, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0274, code lost:
        r44 = r6;
        r43 = r7;
        r26 = r13;
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x027d, code lost:
        r2 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        r0 = r1.f11409h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0281, code lost:
        r12 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0284, code lost:
        r24 = r6;
        r25 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0294, code lost:
        if (r1.f11420t != 0) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0296, code lost:
        if (r2 == 0) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02a6, code lost:
        if (((java.lang.Boolean) r2.f11380v.get("didRequestFullScreen")).booleanValue() != false) goto L_0x02bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02aa, code lost:
        if (r1.f11421u == false) goto L_0x02ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02ad, code lost:
        r17 = r10;
        r0 = Integer.MAX_VALUE;
        r3 = 0;
        r4 = false;
        r5 = true;
        r6 = true;
        r7 = true;
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02bb, code lost:
        r0 = r15.optBoolean("loop", false);
        r4 = r15.optBoolean("showProgress", true);
        r3 = r15.optBoolean("soundOn", true);
        r7 = r15.optBoolean("showMute", true);
        r6 = r15.optBoolean("autoPlay", true);
        r8 = r2.f11476E;
        r17 = r3;
        r16 = r4;
        r3 = (int) r15.optDouble("pauseAfter", 0.0d);
        r4 = r0;
        r0 = r8;
        r5 = r16;
        r16 = r17;
        r17 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02eb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02ec, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02ef, code lost:
        r0 = r15.optBoolean("loop", true);
        r4 = r15.optBoolean("showProgress", false);
        r3 = r15.optBoolean("soundOn", false);
        r6 = r15.optBoolean("showMute", false);
        r7 = r15.optBoolean("autoPlay", true);
        r8 = r15.optInt("completeAfter", Integer.MAX_VALUE);
        r17 = r3;
        r16 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0319, code lost:
        r3 = (int) r15.optDouble("pauseAfter", 0.0d);
        r4 = r0;
        r0 = r8;
        r5 = r16;
        r16 = r17;
        r17 = r10;
        r45 = r7;
        r7 = r6;
        r6 = r45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
        r0 = r15.optBoolean("loop", false);
        r4 = r15.optBoolean("showProgress", true);
        r3 = r15.optBoolean("soundOn", true);
        r7 = r15.optBoolean("showMute", true);
        r6 = r15.optBoolean("autoPlay", true);
        r8 = r15.optInt("completeAfter", Integer.MAX_VALUE);
        r17 = r10;
        r16 = r3;
        r3 = (int) r15.optDouble("pauseAfter", 0.0d);
        r5 = r4;
        r4 = r0;
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0356, code lost:
        r10 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0361, code lost:
        if (r15.isNull("videoViewabilityConfig") != false) goto L_0x0389;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
        r8 = r15.getJSONObject("videoViewabilityConfig");
        r9 = r8.keys();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0371, code lost:
        if (r9.hasNext() == false) goto L_0x0389;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0373, code lost:
        r20 = r9;
        r9 = r9.next();
        r10.put(r9, r8.get(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0384, code lost:
        r14 = r49;
        r9 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0391, code lost:
        r8 = r8;
        r20 = r1.f11419s.rendering.enablePubMuteControl;
        r1 = r10;
        r26 = r13;
        r27 = r2;
        r23 = r3;
        r2 = r8;
        r3 = r49;
        r14 = r7;
        r7 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:?, code lost:
        r8 = new com.inmobi.media.C5031bs(r13, r17, r33, r12, r16, r14, r4, r5, r6, r18, r47, r20);
        r2.f11478G = new java.util.HashMap(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03b9, code lost:
        if (r0 > 0) goto L_0x03bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03bb, code lost:
        r7 = Integer.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03bf, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03c0, code lost:
        r2.f11476E = r7;
        r2.f11365g = r3;
        r6 = r27;
        r2.f11383y = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03c8, code lost:
        if (r6 == null) goto L_0x03cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03ca, code lost:
        r6.f11383y = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03cc, code lost:
        if (r23 == 0) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03ce, code lost:
        r2.f11477F = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03d2, code lost:
        r6 = r46;
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03d7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03d8, code lost:
        r6 = r46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03da, code lost:
        r26 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03de, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03df, code lost:
        r44 = r6;
        r43 = r7;
        r26 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03e7, code lost:
        r17 = r10;
        r26 = r12;
        r32 = r19;
        r31 = r20;
        r0 = r27;
        r10 = r3;
        r3 = r49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03f5, code lost:
        if (r0 != null) goto L_0x03f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03f7, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03f8, code lost:
        r9 = com.inmobi.media.C5033bt.m11460c(m11421h(r47));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0406, code lost:
        if ("URL".equals(r9) == false) goto L_0x040f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x040c, code lost:
        if (android.webkit.URLUtil.isValidUrl(r0) != false) goto L_0x040f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x040e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x040f, code lost:
        r13 = r46;
        r12 = r3;
        r7 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        r1 = new com.inmobi.media.C5033bt(r26, r17, m11395a(r2, r10, r4, r5, r8), r0, r15.optBoolean("isScrollable"));
        r1.f11483z = r9;
        r1.f11365g = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0438, code lost:
        if (r15.optBoolean("preload", false) == false) goto L_0x0445;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x043a, code lost:
        r1.f11481A = true;
        r13.f11412k = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x043f, code lost:
        r44 = r7;
        r1 = r1;
        r6 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0445, code lost:
        r44 = r7;
        r21 = r1;
        r6 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x044c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x044d, code lost:
        r44 = r7;
        r6 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0452, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0453, code lost:
        r6 = r46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0457, code lost:
        r13 = r46;
        r17 = r10;
        r26 = r12;
        r32 = r19;
        r31 = r20;
        r14 = 0;
        r12 = r49;
        r43 = r25;
        r10 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:?, code lost:
        r1 = m11395a(r2, r3, r4, r5, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0478, code lost:
        if (m11432p(r47) == false) goto L_0x049f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0482, code lost:
        if (r15.getJSONObject("assetOnclick").isNull("openMode") != false) goto L_0x0491;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0484, code lost:
        r2 = m11410d(r15.getJSONObject("assetOnclick").getString("openMode"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0491, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0492, code lost:
        r3 = r15.getJSONObject("assetOnclick").optString("fallbackUrl");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x049a, code lost:
        r14 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x049c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x049f, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04a1, code lost:
        if (r18 == null) goto L_0x04e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04a7, code lost:
        if (r18.size() != 0) goto L_0x04aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04b0, code lost:
        if (com.facebook.share.internal.ShareConstants.IMAGE_URL.equals(r48) == false) goto L_0x04cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04b8, code lost:
        r8 = r8;
        r6 = r10;
        r4 = r12;
        r2 = r13;
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:?, code lost:
        r8 = new com.inmobi.media.C5021bm(r26, r17, r1, m11409c(r47), r18, r14, r47);
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04cb, code lost:
        r6 = r10;
        r4 = r12;
        r2 = r13;
        r5 = r15;
        r8 = new com.inmobi.media.C5019bk(r26, r17, r1, m11409c(r47), r18, r14, r47);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04e3, code lost:
        r6 = r10;
        r4 = r12;
        r2 = r13;
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04ed, code lost:
        if (com.facebook.share.internal.ShareConstants.IMAGE_URL.equals(r48) == false) goto L_0x0502;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04ef, code lost:
        r8 = new com.inmobi.media.C5021bm(r26, r17, r1, m11409c(r47), r14, r47);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0502, code lost:
        r8 = new com.inmobi.media.C5019bk(r26, r17, r1, m11409c(r47), r14, r47);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0514, code lost:
        r0.f11365g = r4;
        m11400a((com.inmobi.media.C5010bf) r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0519, code lost:
        if (r3 == null) goto L_0x0524;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x051b, code lost:
        r0.mo40165b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x051e, code lost:
        r1 = r0;
        r44 = r6;
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0524, code lost:
        r21 = r0;
        r44 = r6;
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x052b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x052c, code lost:
        r44 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x052e, code lost:
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0531, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0532, code lost:
        r7 = r48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0534, code lost:
        r44 = r10;
        r6 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0539, code lost:
        r11 = r49;
        r17 = r10;
        r26 = r12;
        r7 = r14;
        r9 = r15;
        r32 = r19;
        r31 = r20;
        r43 = r25;
        r15 = r46;
        r10 = r3;
        r12 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
        r0 = m11395a(r2, r3, r4, r5, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x055b, code lost:
        if (r9.has("startOffset") == false) goto L_0x0568;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x055d, code lost:
        r1 = r15.m11433q(r9.getJSONObject("startOffset"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0568, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0570, code lost:
        if (r9.has("timerDuration") == false) goto L_0x057d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0572, code lost:
        r2 = r15.m11433q(r9.getJSONObject("timerDuration"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x057d, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x057f, code lost:
        r3 = r9.optBoolean("displayTimer", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x058d, code lost:
        r13 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:?, code lost:
        r1 = new com.inmobi.media.C5026bp(r13, r17, r0, new com.inmobi.media.C5024bo(r1, r2));
        r1.f11448z = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x059c, code lost:
        if (r9.has("assetOnFinish") == false) goto L_0x05ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x059e, code lost:
        r0 = (org.json.JSONObject) r9.get("assetOnFinish");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x05ac, code lost:
        if (r0.has("action") == false) goto L_0x05ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x05ae, code lost:
        r0 = r0.getString("action").toUpperCase(java.util.Locale.US).trim();
        r2 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x05c5, code lost:
        if (r2 == 2142494) goto L_0x05d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x05ca, code lost:
        if (r2 == 2402104) goto L_0x05cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x05d3, code lost:
        if (r0.equals("NONE") == false) goto L_0x05e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05d5, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05dd, code lost:
        if (r0.equals("EXIT") == false) goto L_0x05e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x05df, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x05e1, code lost:
        r0 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x05e3, code lost:
        if (r0 == 2) goto L_0x05e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x05e5, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x05e7, code lost:
        r9 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x05e8, code lost:
        r1.f11369k = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x05ea, code lost:
        r1.f11365g = r11;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05ed, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05ee, code lost:
        r44 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x05f2, code lost:
        r6 = r10;
        r13 = r12;
        r7 = r14;
        r9 = r15;
        r32 = r19;
        r31 = r20;
        r12 = r24;
        r43 = r25;
        r15 = r46;
        r10 = r3;
        r1 = new com.inmobi.media.C5020bl(r13, r6, m11395a(r2, r3, r4, r5, r8), m11409c(r47));
        r1.f11365g = r49;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0617, code lost:
        r15 = r46;
        r13 = r12;
        r7 = r14;
        r32 = r19;
        r31 = r20;
        r12 = r24;
        r43 = r25;
        r14 = r10;
        r10 = r3;
        r2 = new com.inmobi.media.C5022bn(r13, r14, m11406b(r2, r3, r4, r5, r8), r27);
        r2.f11365g = r49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0637, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0638, code lost:
        r44 = r12;
        r26 = r13;
        r6 = r15;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x063f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0640, code lost:
        r44 = r12;
        r26 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0644, code lost:
        r6 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0647, code lost:
        r16 = r10;
        r26 = r12;
        r32 = r19;
        r31 = r20;
        r44 = r24;
        r43 = r25;
        r12 = r28;
        r10 = r3;
        r3 = r15;
        r15 = r46;
        r15 = r3;
        r19 = "CONTAINER";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:?, code lost:
        r1 = m11395a(r2, r10, r4, r5, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x066b, code lost:
        if (m11432p(r47) == false) goto L_0x068e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0675, code lost:
        if (r15.getJSONObject("assetOnclick").isNull("openMode") != false) goto L_0x0684;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0677, code lost:
        r2 = m11410d(r15.getJSONObject("assetOnclick").getString("openMode"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0684, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0685, code lost:
        r3 = r15.getJSONObject("assetOnclick").optString("fallbackUrl");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x068e, code lost:
        r3 = null;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0697, code lost:
        if (r8.has("transitionEffect") == false) goto L_0x06cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0699, code lost:
        r4 = r8.getString("transitionEffect").trim();
        r5 = r4.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x06aa, code lost:
        if (r5 == 3151468) goto L_0x06bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x06af, code lost:
        if (r5 == 106426293) goto L_0x06b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x06b8, code lost:
        if (r4.equals("paged") == false) goto L_0x06c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x06ba, code lost:
        r4 = 2;
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x06c3, code lost:
        if (r4.equals("free") == false) goto L_0x06c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x06c5, code lost:
        r4 = 2;
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x06c8, code lost:
        r4 = 2;
        r6 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x06ca, code lost:
        if (r6 == r4) goto L_0x06cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x06cd, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x06d0, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x06d1, code lost:
        if (r18 == null) goto L_0x0702;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x06d7, code lost:
        if (r18.size() != 0) goto L_0x06da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x06dc, code lost:
        r8 = r8;
        r17 = r29;
        r20 = r30;
        r23 = r12;
        r4 = r13;
        r13 = r2;
        r2 = r46;
        r7 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:?, code lost:
        r8 = new com.inmobi.media.C5012bh(r26, r16, r1, r18, r13, r47, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x06f9, code lost:
        r1 = r8;
        r15 = 0;
        r6 = r2;
        r2 = r49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x06ff, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0702, code lost:
        r23 = r12;
        r4 = r13;
        r7 = r15;
        r17 = r29;
        r20 = r30;
        r15 = 0;
        r6 = r46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:?, code lost:
        r2 = r49;
        r1 = new com.inmobi.media.C5012bh(r26, r16, r1, r2, r47, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0723, code lost:
        r1.f11365g = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0725, code lost:
        if (r3 == null) goto L_0x072a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0727, code lost:
        r1.mo40165b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x072a, code lost:
        m11400a((com.inmobi.media.C5010bf) r1, r7);
        r3 = r7.getJSONArray("assetValue");
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0738, code lost:
        if (r5 >= r3.length()) goto L_0x084a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x073a, code lost:
        r7 = r2 + ".assetValue[" + r5 + "]";
        r8 = r3.getJSONObject(r5);
        r9 = m11416f(r8).toLowerCase(java.util.Locale.US).trim();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0769, code lost:
        switch(r9.hashCode()) {
            case -938102371: goto L_0x07cb;
            case -410956671: goto L_0x07c1;
            case 98832: goto L_0x07b7;
            case 102340: goto L_0x07ac;
            case 3226745: goto L_0x07a2;
            case 3556653: goto L_0x0798;
            case 100313435: goto L_0x078e;
            case 110364485: goto L_0x0783;
            case 112202875: goto L_0x0779;
            case 1224424441: goto L_0x076e;
            default: goto L_0x076c;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0774, code lost:
        if (r9.equals("webview") == false) goto L_0x07d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0776, code lost:
        r9 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x077f, code lost:
        if (r9.equals("video") == false) goto L_0x07d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0781, code lost:
        r9 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0789, code lost:
        if (r9.equals("timer") == false) goto L_0x07d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x078b, code lost:
        r9 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0794, code lost:
        if (r9.equals("image") == false) goto L_0x07d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0796, code lost:
        r9 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x079e, code lost:
        if (r9.equals("text") == false) goto L_0x07d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x07a0, code lost:
        r9 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x07a8, code lost:
        if (r9.equals(com.mbridge.msdk.foundation.entity.RewardPlus.ICON) == false) goto L_0x07d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x07aa, code lost:
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x07b2, code lost:
        if (r9.equals("gif") == false) goto L_0x07d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x07b4, code lost:
        r9 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x07bd, code lost:
        if (r9.equals(com.facebook.gamingservices.cloudgaming.internal.SDKConstants.PARAM_GAME_REQUESTS_CTA) == false) goto L_0x07d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x07bf, code lost:
        r9 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x07c7, code lost:
        if (r9.equals(com.google.android.exoplayer2.text.ttml.TtmlNode.RUBY_CONTAINER) == false) goto L_0x07d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x07c9, code lost:
        r9 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x07d1, code lost:
        if (r9.equals(com.mbridge.msdk.foundation.entity.CampaignEx.JSON_KEY_STAR) == false) goto L_0x07d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x07d3, code lost:
        r9 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x07d5, code lost:
        r9 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x07d6, code lost:
        switch(r9) {
            case 2: goto L_0x07f0;
            case 3: goto L_0x07ee;
            case 4: goto L_0x07eb;
            case 5: goto L_0x07e8;
            case 6: goto L_0x07e5;
            case 7: goto L_0x07e2;
            case 8: goto L_0x07df;
            case 9: goto L_0x07dc;
            case 10: goto L_0x07da;
            default: goto L_0x07d9;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x07da, code lost:
        r13 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x07dc, code lost:
        r13 = "WEBVIEW";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x07df, code lost:
        r13 = "TIMER";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x07e2, code lost:
        r13 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x07e5, code lost:
        r13 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x07e8, code lost:
        r13 = "TEXT";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x07eb, code lost:
        r13 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x07ee, code lost:
        r13 = com.facebook.share.internal.ShareConstants.IMAGE_URL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x07f0, code lost:
        r13 = "ICON";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x07f3, code lost:
        r13 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x07f5, code lost:
        r8 = r6.m11394a(r8, r13, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x07f9, code lost:
        if (r8 == null) goto L_0x0826;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x07fb, code lost:
        r8.f11365g = r7;
        r8.f11378t = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0803, code lost:
        if (r1.f11397C >= 16) goto L_0x0826;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x080a, code lost:
        if (r1.f11397C != r1.f11396B.length) goto L_0x081c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x080c, code lost:
        r7 = new com.inmobi.media.C5010bf[(r1.f11396B.length * 2)];
        java.lang.System.arraycopy(r1.f11396B, r15, r7, r15, r1.f11397C);
        r1.f11396B = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x081c, code lost:
        r7 = r1.f11396B;
        r9 = r1.f11397C;
        r1.f11397C = r9 + 1;
        r7[r9] = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0826, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x082a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x082c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x082d, code lost:
        r6 = r46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x084c, code lost:
        r1.f11372n = r44;
        r1.f11373o = r31;
        r1.f11374p = r43;
        r2 = r32;
        r1.f11375q = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x085c, code lost:
        if (r2 == null) goto L_0x086c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0864, code lost:
        r3 = r26;
        r6.f11418r.put(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x086c, code lost:
        r3 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x087c, code lost:
        r6.f11417q.put(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0881, code lost:
        r2 = r48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0889, code lost:
        if (r6.f11416p.containsKey(r2) != false) goto L_0x088b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x088b, code lost:
        r6.f11416p.get(r2).add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0897, code lost:
        r0 = new java.util.ArrayList();
        r0.add(r1);
        r6.f11416p.put(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x014a, code lost:
        r28 = com.facebook.share.internal.ShareConstants.VIDEO_URL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x015a, code lost:
        r29 = "RATING";
        r30 = "CTA";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0164, code lost:
        switch(r1) {
            case 0: goto L_0x0647;
            case 1: goto L_0x0617;
            case 2: goto L_0x05f2;
            case 3: goto L_0x0539;
            case 4: goto L_0x0457;
            case 5: goto L_0x0457;
            case 6: goto L_0x03e7;
            case 7: goto L_0x0227;
            case 8: goto L_0x0217;
            case 9: goto L_0x0175;
            default: goto L_0x0167;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0167, code lost:
        r6 = r46;
        r26 = r12;
        r32 = r19;
        r31 = r20;
        r44 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0171, code lost:
        r43 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0179, code lost:
        if (m11432p(r47) != false) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x017b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x017c, code lost:
        r13 = r19;
        r31 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r0 = m11408c(r2, r3, r4, r5, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x018f, code lost:
        if (r15.getJSONObject("assetOnclick").isNull("openMode") != false) goto L_0x01a6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x084c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f0 A[Catch:{ JSONException -> 0x0122 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f8 A[Catch:{ JSONException -> 0x0122 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0102 A[Catch:{ JSONException -> 0x0122 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010a A[Catch:{ JSONException -> 0x0122 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0116 A[Catch:{ JSONException -> 0x0122 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0131 A[Catch:{ JSONException -> 0x0122 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0139 A[Catch:{ JSONException -> 0x0122 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0142 A[Catch:{ JSONException -> 0x0122 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x014d A[Catch:{ JSONException -> 0x0122 }] */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.inmobi.media.C5010bf m11394a(org.json.JSONObject r47, java.lang.String r48, java.lang.String r49) {
        /*
            r46 = this;
            r7 = r46
            r15 = r47
            r14 = r48
            r13 = r49
            java.lang.String r12 = m11411d((org.json.JSONObject) r47)
            java.lang.String r10 = m11413e((org.json.JSONObject) r47)
            org.json.JSONObject r8 = r46.m11423i(r47)
            boolean r0 = m11404a((org.json.JSONObject) r8, (java.lang.String) r14)
            r21 = 0
            if (r0 != 0) goto L_0x001d
            return r21
        L_0x001d:
            android.graphics.Point r2 = r46.m11425j(r47)
            android.graphics.Point r4 = r7.m11392a((org.json.JSONObject) r15, (android.graphics.Point) r2)
            android.graphics.Point r3 = r46.m11427k(r47)
            android.graphics.Point r5 = r7.m11405b(r15, r3)
            java.util.List r18 = m11407b((org.json.JSONObject) r47)
            byte r11 = m11428l(r47)
            r9 = 1
            int r6 = m11391a((org.json.JSONObject) r15, (boolean) r9)
            r1 = 0
            int r9 = m11391a((org.json.JSONObject) r15, (boolean) r1)
            java.lang.String r1 = m11429m(r47)
            java.lang.String r0 = m11418g((org.json.JSONObject) r47)
            java.lang.String r0 = r0.trim()
            r19 = r1
            int r1 = r0.hashCode()
            r20 = r6
            r6 = -925155509(0xffffffffc8db3f4b, float:-449018.34)
            r22 = -1
            r13 = 2
            if (r1 == r6) goto L_0x006b
            r6 = 1728122231(0x67010d77, float:6.0943366E23)
            if (r1 == r6) goto L_0x0061
            goto L_0x0075
        L_0x0061:
            java.lang.String r1 = "absolute"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0075
            r0 = 1
            goto L_0x0076
        L_0x006b:
            java.lang.String r1 = "reference"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0075
            r0 = 2
            goto L_0x0076
        L_0x0075:
            r0 = -1
        L_0x0076:
            if (r0 == r13) goto L_0x007a
            r0 = 0
            goto L_0x007b
        L_0x007a:
            r0 = 1
        L_0x007b:
            org.json.JSONArray r1 = m11431o(r47)
            if (r1 == 0) goto L_0x00c6
            int r6 = r1.length()
            if (r6 == 0) goto L_0x00c6
            r6 = 0
            java.lang.String r1 = r1.getString(r6)     // Catch:{ JSONException -> 0x00b1 }
            boolean r6 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x00ad }
            if (r6 == 0) goto L_0x0093
            return r21
        L_0x0093:
            r6 = 1
            if (r0 != r6) goto L_0x00a9
            com.inmobi.media.bf r6 = r7.mo40182b((java.lang.String) r1)     // Catch:{ JSONException -> 0x00ad }
            if (r6 != 0) goto L_0x00ab
            com.inmobi.media.bj r0 = r7.f11407f     // Catch:{ JSONException -> 0x00a7 }
            if (r0 == 0) goto L_0x00ab
            com.inmobi.media.bj r0 = r7.f11407f     // Catch:{ JSONException -> 0x00a7 }
            com.inmobi.media.bf r6 = r0.mo40182b((java.lang.String) r1)     // Catch:{ JSONException -> 0x00a7 }
            goto L_0x00ab
        L_0x00a7:
            r0 = move-exception
            goto L_0x00b5
        L_0x00a9:
            r6 = r21
        L_0x00ab:
            r0 = r1
            goto L_0x00c9
        L_0x00ad:
            r0 = move-exception
            r6 = r21
            goto L_0x00b5
        L_0x00b1:
            r0 = move-exception
            r1 = r21
            r6 = r1
        L_0x00b5:
            com.inmobi.media.fn r13 = com.inmobi.media.C5275fn.m12068a()
            r24 = r1
            com.inmobi.media.gk r1 = new com.inmobi.media.gk
            r1.<init>(r0)
            r13.mo40590a((com.inmobi.media.C5308gk) r1)
            r0 = r24
            goto L_0x00c9
        L_0x00c6:
            r0 = r21
            r6 = r0
        L_0x00c9:
            int r1 = r48.hashCode()     // Catch:{ JSONException -> 0x0830 }
            java.lang.String r13 = "GIF"
            r24 = r11
            java.lang.String r11 = "CTA"
            r25 = r9
            java.lang.String r9 = "RATING"
            r26 = r6
            java.lang.String r6 = "CONTAINER"
            java.lang.String r7 = "VIDEO"
            r27 = r0
            java.lang.String r0 = "IMAGE"
            switch(r1) {
                case -1919329183: goto L_0x014d;
                case -1884772963: goto L_0x0142;
                case 67056: goto L_0x0139;
                case 70564: goto L_0x0131;
                case 2241657: goto L_0x0116;
                case 2571565: goto L_0x010a;
                case 69775675: goto L_0x0102;
                case 79826725: goto L_0x00f8;
                case 81665115: goto L_0x00f0;
                case 1942407129: goto L_0x00e6;
                default: goto L_0x00e4;
            }
        L_0x00e4:
            goto L_0x0157
        L_0x00e6:
            java.lang.String r1 = "WEBVIEW"
            boolean r1 = r14.equals(r1)     // Catch:{ JSONException -> 0x0122 }
            if (r1 == 0) goto L_0x0157
            r1 = 6
            goto L_0x014a
        L_0x00f0:
            boolean r1 = r14.equals(r7)     // Catch:{ JSONException -> 0x0122 }
            if (r1 == 0) goto L_0x0157
            r1 = 7
            goto L_0x014a
        L_0x00f8:
            java.lang.String r1 = "TIMER"
            boolean r1 = r14.equals(r1)     // Catch:{ JSONException -> 0x0122 }
            if (r1 == 0) goto L_0x0157
            r1 = 3
            goto L_0x014a
        L_0x0102:
            boolean r1 = r14.equals(r0)     // Catch:{ JSONException -> 0x0122 }
            if (r1 == 0) goto L_0x0157
            r1 = 4
            goto L_0x014a
        L_0x010a:
            java.lang.String r1 = "TEXT"
            boolean r1 = r14.equals(r1)     // Catch:{ JSONException -> 0x0122 }
            if (r1 == 0) goto L_0x0157
            r28 = r7
            r1 = 1
            goto L_0x015a
        L_0x0116:
            java.lang.String r1 = "ICON"
            boolean r1 = r14.equals(r1)     // Catch:{ JSONException -> 0x0122 }
            if (r1 == 0) goto L_0x0157
            r28 = r7
            r1 = 2
            goto L_0x015a
        L_0x0122:
            r0 = move-exception
            r6 = r46
            r26 = r12
            r32 = r19
            r31 = r20
        L_0x012b:
            r44 = r24
        L_0x012d:
            r43 = r25
            goto L_0x083c
        L_0x0131:
            boolean r1 = r14.equals(r13)     // Catch:{ JSONException -> 0x0122 }
            if (r1 == 0) goto L_0x0157
            r1 = 5
            goto L_0x014a
        L_0x0139:
            boolean r1 = r14.equals(r11)     // Catch:{ JSONException -> 0x0122 }
            if (r1 == 0) goto L_0x0157
            r1 = 9
            goto L_0x014a
        L_0x0142:
            boolean r1 = r14.equals(r9)     // Catch:{ JSONException -> 0x0122 }
            if (r1 == 0) goto L_0x0157
            r1 = 8
        L_0x014a:
            r28 = r7
            goto L_0x015a
        L_0x014d:
            boolean r1 = r14.equals(r6)     // Catch:{ JSONException -> 0x0122 }
            if (r1 == 0) goto L_0x0157
            r28 = r7
            r1 = 0
            goto L_0x015a
        L_0x0157:
            r28 = r7
            r1 = -1
        L_0x015a:
            java.lang.String r7 = "fallbackUrl"
            r29 = r9
            java.lang.String r9 = "openMode"
            r30 = r11
            java.lang.String r11 = "assetOnclick"
            switch(r1) {
                case 0: goto L_0x0647;
                case 1: goto L_0x0617;
                case 2: goto L_0x05f2;
                case 3: goto L_0x0539;
                case 4: goto L_0x0457;
                case 5: goto L_0x0457;
                case 6: goto L_0x03e7;
                case 7: goto L_0x0227;
                case 8: goto L_0x0217;
                case 9: goto L_0x0175;
                default: goto L_0x0167;
            }
        L_0x0167:
            r6 = r46
            r26 = r12
            r32 = r19
            r31 = r20
            r44 = r24
        L_0x0171:
            r43 = r25
            goto L_0x0848
        L_0x0175:
            boolean r0 = m11432p(r47)     // Catch:{ JSONException -> 0x020c }
            if (r0 != 0) goto L_0x017c
            return r21
        L_0x017c:
            r13 = r19
            r1 = r46
            r31 = r20
            r6 = r8
            com.inmobi.media.bn$a r0 = r1.m11408c(r2, r3, r4, r5, r6)     // Catch:{ JSONException -> 0x0208 }
            org.json.JSONObject r1 = r15.getJSONObject(r11)     // Catch:{ JSONException -> 0x0208 }
            boolean r1 = r1.isNull(r9)     // Catch:{ JSONException -> 0x0208 }
            if (r1 != 0) goto L_0x01a6
            org.json.JSONObject r1 = r15.getJSONObject(r11)     // Catch:{ JSONException -> 0x019e }
            java.lang.String r1 = r1.getString(r9)     // Catch:{ JSONException -> 0x019e }
            byte r1 = m11410d((java.lang.String) r1)     // Catch:{ JSONException -> 0x019e }
            goto L_0x01a7
        L_0x019e:
            r0 = move-exception
            r6 = r46
            r26 = r12
            r32 = r13
            goto L_0x012b
        L_0x01a6:
            r1 = 2
        L_0x01a7:
            org.json.JSONObject r2 = r15.getJSONObject(r11)     // Catch:{ JSONException -> 0x0208 }
            java.lang.String r2 = r2.optString(r7)     // Catch:{ JSONException -> 0x0208 }
            if (r18 == 0) goto L_0x01d3
            int r3 = r18.size()     // Catch:{ JSONException -> 0x0208 }
            if (r3 != 0) goto L_0x01b8
            goto L_0x01d3
        L_0x01b8:
            com.inmobi.media.bi r3 = new com.inmobi.media.bi     // Catch:{ JSONException -> 0x0208 }
            r8 = r3
            r7 = r25
            r9 = r12
            r6 = r24
            r11 = r0
            r4 = r12
            r12 = r27
            r5 = r49
            r32 = r13
            r13 = r18
            r14 = r1
            r1 = r15
            r15 = r47
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ JSONException -> 0x01ff }
            r15 = r1
            goto L_0x01e9
        L_0x01d3:
            r5 = r49
            r4 = r12
            r32 = r13
            r6 = r24
            r7 = r25
            com.inmobi.media.bi r3 = new com.inmobi.media.bi     // Catch:{ JSONException -> 0x01ff }
            r8 = r3
            r9 = r4
            r11 = r0
            r12 = r27
            r13 = r1
            r14 = r47
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x01ff }
        L_0x01e9:
            r3.f11365g = r5     // Catch:{ JSONException -> 0x01ff }
            m11400a((com.inmobi.media.C5010bf) r3, (org.json.JSONObject) r15)     // Catch:{ JSONException -> 0x01ff }
            if (r2 == 0) goto L_0x01f3
            r3.mo40165b(r2)     // Catch:{ JSONException -> 0x01ff }
        L_0x01f3:
            r21 = r3
            r26 = r4
            r44 = r6
            r43 = r7
            r6 = r46
            goto L_0x0848
        L_0x01ff:
            r0 = move-exception
            r26 = r4
            r44 = r6
            r43 = r7
            goto L_0x082d
        L_0x0208:
            r0 = move-exception
            r32 = r13
            goto L_0x0211
        L_0x020c:
            r0 = move-exception
            r32 = r19
            r31 = r20
        L_0x0211:
            r6 = r46
            r26 = r12
            goto L_0x012b
        L_0x0217:
            r32 = r19
            r31 = r20
            r6 = r46
            r26 = r12
            r1 = r21
        L_0x0221:
            r44 = r24
        L_0x0223:
            r43 = r25
            goto L_0x084a
        L_0x0227:
            r1 = r46
            r14 = r49
            r13 = r12
            r32 = r19
            r31 = r20
            r6 = r24
            r7 = r25
            r12 = r28
            java.util.Map<java.lang.String, java.util.List<com.inmobi.media.bf>> r0 = r1.f11416p     // Catch:{ JSONException -> 0x03de }
            r0.get(r12)     // Catch:{ JSONException -> 0x03de }
            com.inmobi.media.bo r42 = r1.m11435s(r8)     // Catch:{ JSONException -> 0x03de }
            com.inmobi.media.bs$a r11 = new com.inmobi.media.bs$a     // Catch:{ JSONException -> 0x03de }
            int r0 = r2.x     // Catch:{ JSONException -> 0x03de }
            int r2 = r2.y     // Catch:{ JSONException -> 0x03de }
            int r8 = r3.x     // Catch:{ JSONException -> 0x03de }
            int r3 = r3.y     // Catch:{ JSONException -> 0x03de }
            int r9 = r4.x     // Catch:{ JSONException -> 0x03de }
            int r4 = r4.y     // Catch:{ JSONException -> 0x03de }
            int r12 = r5.x     // Catch:{ JSONException -> 0x03de }
            int r5 = r5.y     // Catch:{ JSONException -> 0x03de }
            r33 = r11
            r34 = r0
            r35 = r2
            r36 = r8
            r37 = r3
            r38 = r9
            r39 = r4
            r40 = r12
            r41 = r5
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ JSONException -> 0x03de }
            com.inmobi.media.cv r0 = r1.f11409h     // Catch:{ JSONException -> 0x03de }
            if (r0 != 0) goto L_0x027d
            r2 = r26
            r0 = r27
            com.inmobi.media.cw r0 = r1.m11398a((org.json.JSONObject) r15, (java.lang.String) r0, (com.inmobi.media.C5010bf) r2)     // Catch:{ JSONException -> 0x0273 }
            goto L_0x0281
        L_0x0273:
            r0 = move-exception
            r44 = r6
            r43 = r7
            r26 = r13
            r6 = r1
            goto L_0x083c
        L_0x027d:
            r2 = r26
            com.inmobi.media.cv r0 = r1.f11409h     // Catch:{ JSONException -> 0x03de }
        L_0x0281:
            r12 = r0
            int r0 = r1.f11420t     // Catch:{ JSONException -> 0x03de }
            java.lang.String r5 = "pauseAfter"
            java.lang.String r8 = "autoPlay"
            java.lang.String r9 = "showMute"
            java.lang.String r3 = "soundOn"
            java.lang.String r4 = "showProgress"
            r24 = r6
            java.lang.String r6 = "loop"
            r25 = r7
            if (r0 != 0) goto L_0x0328
            if (r2 == 0) goto L_0x02ef
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f11380v     // Catch:{ JSONException -> 0x02eb }
            java.lang.String r7 = "didRequestFullScreen"
            java.lang.Object r0 = r0.get(r7)     // Catch:{ JSONException -> 0x02eb }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ JSONException -> 0x02eb }
            boolean r0 = r0.booleanValue()     // Catch:{ JSONException -> 0x02eb }
            if (r0 != 0) goto L_0x02bb
            boolean r0 = r1.f11421u     // Catch:{ JSONException -> 0x02eb }
            if (r0 == 0) goto L_0x02ad
            goto L_0x02bb
        L_0x02ad:
            r17 = r10
            r0 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 1
            r7 = 1
            r16 = 1
            goto L_0x0356
        L_0x02bb:
            r7 = 0
            boolean r0 = r15.optBoolean(r6, r7)     // Catch:{ JSONException -> 0x02eb }
            r6 = 1
            boolean r4 = r15.optBoolean(r4, r6)     // Catch:{ JSONException -> 0x02eb }
            boolean r3 = r15.optBoolean(r3, r6)     // Catch:{ JSONException -> 0x02eb }
            boolean r7 = r15.optBoolean(r9, r6)     // Catch:{ JSONException -> 0x02eb }
            boolean r6 = r15.optBoolean(r8, r6)     // Catch:{ JSONException -> 0x02eb }
            r8 = r2
            com.inmobi.media.bs r8 = (com.inmobi.media.C5031bs) r8     // Catch:{ JSONException -> 0x02eb }
            int r8 = r8.f11476E     // Catch:{ JSONException -> 0x02eb }
            r17 = r3
            r16 = r4
            r3 = 0
            double r3 = r15.optDouble(r5, r3)     // Catch:{ JSONException -> 0x02eb }
            int r3 = (int) r3     // Catch:{ JSONException -> 0x02eb }
            r4 = r0
            r0 = r8
            r5 = r16
            r16 = r17
            r17 = r10
            goto L_0x0356
        L_0x02eb:
            r0 = move-exception
            r6 = r1
            goto L_0x03da
        L_0x02ef:
            r7 = 1
            boolean r0 = r15.optBoolean(r6, r7)     // Catch:{ JSONException -> 0x02eb }
            r6 = 0
            boolean r4 = r15.optBoolean(r4, r6)     // Catch:{ JSONException -> 0x02eb }
            boolean r3 = r15.optBoolean(r3, r6)     // Catch:{ JSONException -> 0x02eb }
            boolean r6 = r15.optBoolean(r9, r6)     // Catch:{ JSONException -> 0x02eb }
            r7 = 1
            boolean r7 = r15.optBoolean(r8, r7)     // Catch:{ JSONException -> 0x02eb }
            java.lang.String r8 = "completeAfter"
            r9 = 2147483647(0x7fffffff, float:NaN)
            int r8 = r15.optInt(r8, r9)     // Catch:{ JSONException -> 0x02eb }
            r17 = r3
            r16 = r4
            r3 = 0
            double r3 = r15.optDouble(r5, r3)     // Catch:{ JSONException -> 0x02eb }
            int r3 = (int) r3
            r4 = r0
            r0 = r8
            r5 = r16
            r16 = r17
            r17 = r10
            r45 = r7
            r7 = r6
            r6 = r45
            goto L_0x0356
        L_0x0328:
            r7 = 0
            boolean r0 = r15.optBoolean(r6, r7)     // Catch:{ JSONException -> 0x03d7 }
            r6 = 1
            boolean r4 = r15.optBoolean(r4, r6)     // Catch:{ JSONException -> 0x03d7 }
            boolean r3 = r15.optBoolean(r3, r6)     // Catch:{ JSONException -> 0x03d7 }
            boolean r7 = r15.optBoolean(r9, r6)     // Catch:{ JSONException -> 0x03d7 }
            boolean r6 = r15.optBoolean(r8, r6)     // Catch:{ JSONException -> 0x03d7 }
            java.lang.String r8 = "completeAfter"
            r9 = 2147483647(0x7fffffff, float:NaN)
            int r8 = r15.optInt(r8, r9)     // Catch:{ JSONException -> 0x03d7 }
            r17 = r10
            r9 = 0
            double r9 = r15.optDouble(r5, r9)     // Catch:{ JSONException -> 0x03d7 }
            int r5 = (int) r9     // Catch:{ JSONException -> 0x03d7 }
            r16 = r3
            r3 = r5
            r5 = r4
            r4 = r0
            r0 = r8
        L_0x0356:
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ JSONException -> 0x03d7 }
            r10.<init>()     // Catch:{ JSONException -> 0x03d7 }
            java.lang.String r8 = "videoViewabilityConfig"
            boolean r8 = r15.isNull(r8)     // Catch:{ JSONException -> 0x03d7 }
            if (r8 != 0) goto L_0x0389
            java.lang.String r8 = "videoViewabilityConfig"
            org.json.JSONObject r8 = r15.getJSONObject(r8)     // Catch:{ JSONException -> 0x02eb }
            java.util.Iterator r9 = r8.keys()     // Catch:{ JSONException -> 0x02eb }
        L_0x036d:
            boolean r19 = r9.hasNext()     // Catch:{ JSONException -> 0x02eb }
            if (r19 == 0) goto L_0x0389
            java.lang.Object r19 = r9.next()     // Catch:{ JSONException -> 0x02eb }
            r20 = r9
            r9 = r19
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ JSONException -> 0x02eb }
            java.lang.Object r14 = r8.get(r9)     // Catch:{ JSONException -> 0x02eb }
            r10.put(r9, r14)     // Catch:{ JSONException -> 0x02eb }
            r14 = r49
            r9 = r20
            goto L_0x036d
        L_0x0389:
            com.inmobi.media.bs r14 = new com.inmobi.media.bs     // Catch:{ JSONException -> 0x03d7 }
            com.inmobi.media.ev r8 = r1.f11419s     // Catch:{ JSONException -> 0x03d7 }
            com.inmobi.media.ev$g r8 = r8.rendering     // Catch:{ JSONException -> 0x03d7 }
            boolean r9 = r8.enablePubMuteControl     // Catch:{ JSONException -> 0x03d7 }
            r8 = r14
            r20 = r9
            r22 = 2147483647(0x7fffffff, float:NaN)
            r9 = r13
            r1 = r10
            r10 = r17
            r26 = r13
            r13 = r16
            r27 = r2
            r23 = r3
            r2 = r14
            r3 = r49
            r14 = r7
            r7 = r15
            r15 = r4
            r16 = r5
            r17 = r6
            r19 = r47
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ JSONException -> 0x0452 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ JSONException -> 0x0452 }
            r4.<init>(r1)     // Catch:{ JSONException -> 0x0452 }
            r2.f11478G = r4     // Catch:{ JSONException -> 0x0452 }
            if (r0 > 0) goto L_0x03bf
            r7 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x03c0
        L_0x03bf:
            r7 = r0
        L_0x03c0:
            r2.f11476E = r7     // Catch:{ JSONException -> 0x0452 }
            r2.f11365g = r3     // Catch:{ JSONException -> 0x0452 }
            r6 = r27
            r2.f11383y = r6     // Catch:{ JSONException -> 0x0452 }
            if (r6 == 0) goto L_0x03cc
            r6.f11383y = r2     // Catch:{ JSONException -> 0x0452 }
        L_0x03cc:
            if (r23 == 0) goto L_0x03d2
            r3 = r23
            r2.f11477F = r3     // Catch:{ JSONException -> 0x0452 }
        L_0x03d2:
            r6 = r46
            r1 = r2
            goto L_0x0221
        L_0x03d7:
            r0 = move-exception
            r6 = r46
        L_0x03da:
            r26 = r13
            goto L_0x012b
        L_0x03de:
            r0 = move-exception
            r44 = r6
            r43 = r7
            r26 = r13
            goto L_0x082d
        L_0x03e7:
            r17 = r10
            r26 = r12
            r32 = r19
            r31 = r20
            r0 = r27
            r7 = 0
            r10 = r3
            r3 = r49
            if (r0 != 0) goto L_0x03f8
            return r21
        L_0x03f8:
            java.lang.String r1 = m11421h((org.json.JSONObject) r47)     // Catch:{ JSONException -> 0x0452 }
            java.lang.String r9 = com.inmobi.media.C5033bt.m11460c(r1)     // Catch:{ JSONException -> 0x0452 }
            java.lang.String r1 = "URL"
            boolean r1 = r1.equals(r9)     // Catch:{ JSONException -> 0x0452 }
            if (r1 == 0) goto L_0x040f
            boolean r1 = android.webkit.URLUtil.isValidUrl(r0)     // Catch:{ JSONException -> 0x0452 }
            if (r1 != 0) goto L_0x040f
            return r21
        L_0x040f:
            r14 = 0
            r13 = r46
            r1 = r46
            r12 = r3
            r3 = r10
            r7 = r24
            r6 = r8
            com.inmobi.media.bg r4 = r1.m11395a(r2, r3, r4, r5, r6)     // Catch:{ JSONException -> 0x044c }
            com.inmobi.media.bt r8 = new com.inmobi.media.bt     // Catch:{ JSONException -> 0x044c }
            java.lang.String r1 = "isScrollable"
            boolean r6 = r15.optBoolean(r1)     // Catch:{ JSONException -> 0x044c }
            r1 = r8
            r2 = r26
            r3 = r17
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ JSONException -> 0x044c }
            r8.f11483z = r9     // Catch:{ JSONException -> 0x044c }
            r8.f11365g = r12     // Catch:{ JSONException -> 0x044c }
            java.lang.String r0 = "preload"
            boolean r0 = r15.optBoolean(r0, r14)     // Catch:{ JSONException -> 0x044c }
            if (r0 == 0) goto L_0x0445
            r1 = 1
            r8.f11481A = r1     // Catch:{ JSONException -> 0x044c }
            r13.f11412k = r8     // Catch:{ JSONException -> 0x044c }
            r44 = r7
            r1 = r8
            r6 = r13
            goto L_0x0223
        L_0x0445:
            r44 = r7
            r21 = r8
            r6 = r13
            goto L_0x0171
        L_0x044c:
            r0 = move-exception
            r44 = r7
            r6 = r13
            goto L_0x012d
        L_0x0452:
            r0 = move-exception
            r6 = r46
            goto L_0x012b
        L_0x0457:
            r13 = r46
            r17 = r10
            r26 = r12
            r32 = r19
            r31 = r20
            r6 = r24
            r14 = 0
            r12 = r49
            r10 = r3
            r3 = r25
            r1 = r46
            r43 = r3
            r3 = r10
            r10 = r6
            r6 = r8
            com.inmobi.media.bg r1 = r1.m11395a(r2, r3, r4, r5, r6)     // Catch:{ JSONException -> 0x0531 }
            boolean r2 = m11432p(r47)     // Catch:{ JSONException -> 0x0531 }
            if (r2 == 0) goto L_0x049f
            org.json.JSONObject r2 = r15.getJSONObject(r11)     // Catch:{ JSONException -> 0x049c }
            boolean r2 = r2.isNull(r9)     // Catch:{ JSONException -> 0x049c }
            if (r2 != 0) goto L_0x0491
            org.json.JSONObject r2 = r15.getJSONObject(r11)     // Catch:{ JSONException -> 0x049c }
            java.lang.String r2 = r2.getString(r9)     // Catch:{ JSONException -> 0x049c }
            byte r2 = m11410d((java.lang.String) r2)     // Catch:{ JSONException -> 0x049c }
            goto L_0x0492
        L_0x0491:
            r2 = 2
        L_0x0492:
            org.json.JSONObject r3 = r15.getJSONObject(r11)     // Catch:{ JSONException -> 0x049c }
            java.lang.String r3 = r3.optString(r7)     // Catch:{ JSONException -> 0x049c }
            r14 = r2
            goto L_0x04a1
        L_0x049c:
            r0 = move-exception
            goto L_0x0534
        L_0x049f:
            r3 = r21
        L_0x04a1:
            if (r18 == 0) goto L_0x04e3
            int r2 = r18.size()     // Catch:{ JSONException -> 0x0531 }
            if (r2 != 0) goto L_0x04aa
            goto L_0x04e3
        L_0x04aa:
            r7 = r48
            boolean r0 = r0.equals(r7)     // Catch:{ JSONException -> 0x049c }
            if (r0 == 0) goto L_0x04cb
            com.inmobi.media.bm r0 = new com.inmobi.media.bm     // Catch:{ JSONException -> 0x049c }
            java.lang.String r2 = m11409c((org.json.JSONObject) r47)     // Catch:{ JSONException -> 0x049c }
            r8 = r0
            r9 = r26
            r6 = r10
            r10 = r17
            r11 = r1
            r4 = r12
            r12 = r2
            r2 = r13
            r13 = r18
            r5 = r15
            r15 = r47
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ JSONException -> 0x052b }
            goto L_0x0514
        L_0x04cb:
            r6 = r10
            r4 = r12
            r2 = r13
            r5 = r15
            com.inmobi.media.bk r0 = new com.inmobi.media.bk     // Catch:{ JSONException -> 0x052b }
            java.lang.String r12 = m11409c((org.json.JSONObject) r47)     // Catch:{ JSONException -> 0x052b }
            r8 = r0
            r9 = r26
            r10 = r17
            r11 = r1
            r13 = r18
            r15 = r47
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ JSONException -> 0x052b }
            goto L_0x0514
        L_0x04e3:
            r7 = r48
            r6 = r10
            r4 = r12
            r2 = r13
            r5 = r15
            boolean r0 = r0.equals(r7)     // Catch:{ JSONException -> 0x052b }
            if (r0 == 0) goto L_0x0502
            com.inmobi.media.bm r0 = new com.inmobi.media.bm     // Catch:{ JSONException -> 0x052b }
            java.lang.String r12 = m11409c((org.json.JSONObject) r47)     // Catch:{ JSONException -> 0x052b }
            r8 = r0
            r9 = r26
            r10 = r17
            r11 = r1
            r13 = r14
            r14 = r47
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x052b }
            goto L_0x0514
        L_0x0502:
            com.inmobi.media.bk r0 = new com.inmobi.media.bk     // Catch:{ JSONException -> 0x052b }
            java.lang.String r12 = m11409c((org.json.JSONObject) r47)     // Catch:{ JSONException -> 0x052b }
            r8 = r0
            r9 = r26
            r10 = r17
            r11 = r1
            r13 = r14
            r14 = r47
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x052b }
        L_0x0514:
            r0.f11365g = r4     // Catch:{ JSONException -> 0x052b }
            m11400a((com.inmobi.media.C5010bf) r0, (org.json.JSONObject) r5)     // Catch:{ JSONException -> 0x052b }
            if (r3 == 0) goto L_0x0524
            r0.mo40165b(r3)     // Catch:{ JSONException -> 0x052b }
            r1 = r0
            r44 = r6
            r6 = r2
            goto L_0x084a
        L_0x0524:
            r21 = r0
            r44 = r6
            r6 = r2
            goto L_0x0848
        L_0x052b:
            r0 = move-exception
            r44 = r6
        L_0x052e:
            r6 = r2
            goto L_0x083c
        L_0x0531:
            r0 = move-exception
            r7 = r48
        L_0x0534:
            r44 = r10
            r6 = r13
            goto L_0x083c
        L_0x0539:
            r11 = r49
            r17 = r10
            r26 = r12
            r7 = r14
            r9 = r15
            r32 = r19
            r31 = r20
            r6 = r24
            r43 = r25
            r14 = 0
            r15 = r46
            r10 = r3
            r1 = r46
            r12 = r6
            r6 = r8
            com.inmobi.media.bg r0 = r1.m11395a(r2, r3, r4, r5, r6)     // Catch:{ JSONException -> 0x05ed }
            java.lang.String r1 = "startOffset"
            boolean r1 = r9.has(r1)     // Catch:{ JSONException -> 0x05ed }
            if (r1 == 0) goto L_0x0568
            java.lang.String r1 = "startOffset"
            org.json.JSONObject r1 = r9.getJSONObject(r1)     // Catch:{ JSONException -> 0x05ed }
            com.inmobi.media.bo$a r1 = r15.m11433q(r1)     // Catch:{ JSONException -> 0x05ed }
            goto L_0x056a
        L_0x0568:
            r1 = r21
        L_0x056a:
            java.lang.String r2 = "timerDuration"
            boolean r2 = r9.has(r2)     // Catch:{ JSONException -> 0x05ed }
            if (r2 == 0) goto L_0x057d
            java.lang.String r2 = "timerDuration"
            org.json.JSONObject r2 = r9.getJSONObject(r2)     // Catch:{ JSONException -> 0x05ed }
            com.inmobi.media.bo$a r2 = r15.m11433q(r2)     // Catch:{ JSONException -> 0x05ed }
            goto L_0x057f
        L_0x057d:
            r2 = r21
        L_0x057f:
            java.lang.String r3 = "displayTimer"
            r4 = 1
            boolean r3 = r9.optBoolean(r3, r4)     // Catch:{ JSONException -> 0x05ed }
            com.inmobi.media.bo r5 = new com.inmobi.media.bo     // Catch:{ JSONException -> 0x05ed }
            r5.<init>(r1, r2)     // Catch:{ JSONException -> 0x05ed }
            com.inmobi.media.bp r1 = new com.inmobi.media.bp     // Catch:{ JSONException -> 0x05ed }
            r6 = r17
            r13 = r26
            r1.<init>(r13, r6, r0, r5)     // Catch:{ JSONException -> 0x063f }
            r1.f11448z = r3     // Catch:{ JSONException -> 0x063f }
            java.lang.String r0 = "assetOnFinish"
            boolean r0 = r9.has(r0)     // Catch:{ JSONException -> 0x063f }
            if (r0 == 0) goto L_0x05ea
            java.lang.String r0 = "assetOnFinish"
            java.lang.Object r0 = r9.get(r0)     // Catch:{ JSONException -> 0x063f }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x063f }
            java.lang.String r2 = "action"
            boolean r2 = r0.has(r2)     // Catch:{ JSONException -> 0x063f }
            if (r2 == 0) goto L_0x05ea
            java.lang.String r2 = "action"
            java.lang.String r0 = r0.getString(r2)     // Catch:{ JSONException -> 0x063f }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ JSONException -> 0x063f }
            java.lang.String r0 = r0.toUpperCase(r2)     // Catch:{ JSONException -> 0x063f }
            java.lang.String r0 = r0.trim()     // Catch:{ JSONException -> 0x063f }
            int r2 = r0.hashCode()     // Catch:{ JSONException -> 0x063f }
            r3 = 2142494(0x20b11e, float:3.002274E-39)
            if (r2 == r3) goto L_0x05d7
            r3 = 2402104(0x24a738, float:3.366065E-39)
            if (r2 == r3) goto L_0x05cd
            goto L_0x05e1
        L_0x05cd:
            java.lang.String r2 = "NONE"
            boolean r0 = r0.equals(r2)     // Catch:{ JSONException -> 0x063f }
            if (r0 == 0) goto L_0x05e1
            r0 = 1
            goto L_0x05e2
        L_0x05d7:
            java.lang.String r2 = "EXIT"
            boolean r0 = r0.equals(r2)     // Catch:{ JSONException -> 0x063f }
            if (r0 == 0) goto L_0x05e1
            r0 = 2
            goto L_0x05e2
        L_0x05e1:
            r0 = -1
        L_0x05e2:
            r2 = 2
            if (r0 == r2) goto L_0x05e7
            r9 = 0
            goto L_0x05e8
        L_0x05e7:
            r9 = 1
        L_0x05e8:
            r1.f11369k = r9     // Catch:{ JSONException -> 0x063f }
        L_0x05ea:
            r1.f11365g = r11     // Catch:{ JSONException -> 0x063f }
            goto L_0x0638
        L_0x05ed:
            r0 = move-exception
            r44 = r12
            goto L_0x0644
        L_0x05f2:
            r11 = r49
            r6 = r10
            r13 = r12
            r7 = r14
            r9 = r15
            r32 = r19
            r31 = r20
            r12 = r24
            r43 = r25
            r15 = r46
            r10 = r3
            r1 = r46
            r14 = r6
            r6 = r8
            com.inmobi.media.bg r0 = r1.m11395a(r2, r3, r4, r5, r6)     // Catch:{ JSONException -> 0x063f }
            com.inmobi.media.bl r1 = new com.inmobi.media.bl     // Catch:{ JSONException -> 0x063f }
            java.lang.String r2 = m11409c((org.json.JSONObject) r47)     // Catch:{ JSONException -> 0x063f }
            r1.<init>(r13, r14, r0, r2)     // Catch:{ JSONException -> 0x063f }
            r1.f11365g = r11     // Catch:{ JSONException -> 0x063f }
            goto L_0x0638
        L_0x0617:
            r15 = r46
            r11 = r49
            r13 = r12
            r7 = r14
            r32 = r19
            r31 = r20
            r12 = r24
            r43 = r25
            r0 = r27
            r14 = r10
            r10 = r3
            r1 = r46
            r6 = r8
            com.inmobi.media.bn$a r1 = r1.m11406b(r2, r3, r4, r5, r6)     // Catch:{ JSONException -> 0x063f }
            com.inmobi.media.bn r2 = new com.inmobi.media.bn     // Catch:{ JSONException -> 0x063f }
            r2.<init>(r13, r14, r1, r0)     // Catch:{ JSONException -> 0x063f }
            r2.f11365g = r11     // Catch:{ JSONException -> 0x063f }
            r1 = r2
        L_0x0638:
            r44 = r12
            r26 = r13
            r6 = r15
            goto L_0x084a
        L_0x063f:
            r0 = move-exception
            r44 = r12
            r26 = r13
        L_0x0644:
            r6 = r15
            goto L_0x083c
        L_0x0647:
            r16 = r10
            r26 = r12
            r32 = r19
            r31 = r20
            r44 = r24
            r43 = r25
            r12 = r28
            r14 = 0
            r17 = 1
            r10 = r3
            r3 = r15
            r15 = r46
            r1 = r46
            r15 = r3
            r3 = r10
            r19 = r6
            r6 = r8
            com.inmobi.media.bg r1 = r1.m11395a(r2, r3, r4, r5, r6)     // Catch:{ JSONException -> 0x082c }
            boolean r2 = m11432p(r47)     // Catch:{ JSONException -> 0x082c }
            if (r2 == 0) goto L_0x068e
            org.json.JSONObject r2 = r15.getJSONObject(r11)     // Catch:{ JSONException -> 0x082c }
            boolean r2 = r2.isNull(r9)     // Catch:{ JSONException -> 0x082c }
            if (r2 != 0) goto L_0x0684
            org.json.JSONObject r2 = r15.getJSONObject(r11)     // Catch:{ JSONException -> 0x082c }
            java.lang.String r2 = r2.getString(r9)     // Catch:{ JSONException -> 0x082c }
            byte r2 = m11410d((java.lang.String) r2)     // Catch:{ JSONException -> 0x082c }
            goto L_0x0685
        L_0x0684:
            r2 = 2
        L_0x0685:
            org.json.JSONObject r3 = r15.getJSONObject(r11)     // Catch:{ JSONException -> 0x082c }
            java.lang.String r3 = r3.optString(r7)     // Catch:{ JSONException -> 0x082c }
            goto L_0x0691
        L_0x068e:
            r3 = r21
            r2 = 0
        L_0x0691:
            java.lang.String r4 = "transitionEffect"
            boolean r4 = r8.has(r4)     // Catch:{ JSONException -> 0x082c }
            if (r4 == 0) goto L_0x06cf
            java.lang.String r4 = "transitionEffect"
            java.lang.String r4 = r8.getString(r4)     // Catch:{ JSONException -> 0x082c }
            java.lang.String r4 = r4.trim()     // Catch:{ JSONException -> 0x082c }
            int r5 = r4.hashCode()     // Catch:{ JSONException -> 0x082c }
            r6 = 3151468(0x30166c, float:4.416147E-39)
            if (r5 == r6) goto L_0x06bd
            r6 = 106426293(0x657efb5, float:4.0613115E-35)
            if (r5 == r6) goto L_0x06b2
            goto L_0x06c8
        L_0x06b2:
            java.lang.String r5 = "paged"
            boolean r4 = r4.equals(r5)     // Catch:{ JSONException -> 0x082c }
            if (r4 == 0) goto L_0x06c8
            r4 = 2
            r6 = 1
            goto L_0x06ca
        L_0x06bd:
            java.lang.String r5 = "free"
            boolean r4 = r4.equals(r5)     // Catch:{ JSONException -> 0x082c }
            if (r4 == 0) goto L_0x06c8
            r4 = 2
            r6 = 2
            goto L_0x06ca
        L_0x06c8:
            r4 = 2
            r6 = -1
        L_0x06ca:
            if (r6 == r4) goto L_0x06cd
            goto L_0x06d0
        L_0x06cd:
            r5 = 1
            goto L_0x06d1
        L_0x06cf:
            r4 = 2
        L_0x06d0:
            r5 = 0
        L_0x06d1:
            if (r18 == 0) goto L_0x0702
            int r6 = r18.size()     // Catch:{ JSONException -> 0x082c }
            if (r6 != 0) goto L_0x06da
            goto L_0x0702
        L_0x06da:
            com.inmobi.media.bh r6 = new com.inmobi.media.bh     // Catch:{ JSONException -> 0x082c }
            r8 = r6
            r17 = r29
            r7 = 1
            r9 = r26
            r10 = r16
            r20 = r30
            r11 = r1
            r23 = r12
            r12 = r18
            r4 = r13
            r18 = 2
            r13 = r2
            r1 = 0
            r14 = r47
            r2 = r46
            r7 = r15
            r15 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ JSONException -> 0x06ff }
            r1 = r6
            r15 = 0
            r6 = r2
            r2 = r49
            goto L_0x0723
        L_0x06ff:
            r0 = move-exception
            goto L_0x052e
        L_0x0702:
            r23 = r12
            r4 = r13
            r7 = r15
            r17 = r29
            r20 = r30
            r15 = 0
            r18 = 2
            r6 = r46
            com.inmobi.media.bh r25 = new com.inmobi.media.bh     // Catch:{ JSONException -> 0x082a }
            r8 = r25
            r9 = r26
            r10 = r16
            r11 = r1
            r12 = r2
            r13 = r47
            r14 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x082a }
            r2 = r49
            r1 = r25
        L_0x0723:
            r1.f11365g = r2     // Catch:{ JSONException -> 0x082a }
            if (r3 == 0) goto L_0x072a
            r1.mo40165b(r3)     // Catch:{ JSONException -> 0x082a }
        L_0x072a:
            m11400a((com.inmobi.media.C5010bf) r1, (org.json.JSONObject) r7)     // Catch:{ JSONException -> 0x082a }
            java.lang.String r3 = "assetValue"
            org.json.JSONArray r3 = r7.getJSONArray(r3)     // Catch:{ JSONException -> 0x082a }
            r5 = 0
        L_0x0734:
            int r7 = r3.length()     // Catch:{ JSONException -> 0x082a }
            if (r5 >= r7) goto L_0x084a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x082a }
            r7.<init>()     // Catch:{ JSONException -> 0x082a }
            r7.append(r2)     // Catch:{ JSONException -> 0x082a }
            java.lang.String r8 = ".assetValue["
            r7.append(r8)     // Catch:{ JSONException -> 0x082a }
            r7.append(r5)     // Catch:{ JSONException -> 0x082a }
            java.lang.String r8 = "]"
            r7.append(r8)     // Catch:{ JSONException -> 0x082a }
            java.lang.String r7 = r7.toString()     // Catch:{ JSONException -> 0x082a }
            org.json.JSONObject r8 = r3.getJSONObject(r5)     // Catch:{ JSONException -> 0x082a }
            java.lang.String r9 = m11416f((org.json.JSONObject) r8)     // Catch:{ JSONException -> 0x082a }
            java.util.Locale r10 = java.util.Locale.US     // Catch:{ JSONException -> 0x082a }
            java.lang.String r9 = r9.toLowerCase(r10)     // Catch:{ JSONException -> 0x082a }
            java.lang.String r9 = r9.trim()     // Catch:{ JSONException -> 0x082a }
            int r10 = r9.hashCode()     // Catch:{ JSONException -> 0x082a }
            switch(r10) {
                case -938102371: goto L_0x07cb;
                case -410956671: goto L_0x07c1;
                case 98832: goto L_0x07b7;
                case 102340: goto L_0x07ac;
                case 3226745: goto L_0x07a2;
                case 3556653: goto L_0x0798;
                case 100313435: goto L_0x078e;
                case 110364485: goto L_0x0783;
                case 112202875: goto L_0x0779;
                case 1224424441: goto L_0x076e;
                default: goto L_0x076c;
            }     // Catch:{ JSONException -> 0x082a }
        L_0x076c:
            goto L_0x07d5
        L_0x076e:
            java.lang.String r10 = "webview"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x082a }
            if (r9 == 0) goto L_0x07d5
            r9 = 9
            goto L_0x07d6
        L_0x0779:
            java.lang.String r10 = "video"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x082a }
            if (r9 == 0) goto L_0x07d5
            r9 = 4
            goto L_0x07d6
        L_0x0783:
            java.lang.String r10 = "timer"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x082a }
            if (r9 == 0) goto L_0x07d5
            r9 = 8
            goto L_0x07d6
        L_0x078e:
            java.lang.String r10 = "image"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x082a }
            if (r9 == 0) goto L_0x07d5
            r9 = 3
            goto L_0x07d6
        L_0x0798:
            java.lang.String r10 = "text"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x082a }
            if (r9 == 0) goto L_0x07d5
            r9 = 5
            goto L_0x07d6
        L_0x07a2:
            java.lang.String r10 = "icon"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x082a }
            if (r9 == 0) goto L_0x07d5
            r9 = 2
            goto L_0x07d6
        L_0x07ac:
            java.lang.String r10 = "gif"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x082a }
            if (r9 == 0) goto L_0x07d5
            r9 = 10
            goto L_0x07d6
        L_0x07b7:
            java.lang.String r10 = "cta"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x082a }
            if (r9 == 0) goto L_0x07d5
            r9 = 6
            goto L_0x07d6
        L_0x07c1:
            java.lang.String r10 = "container"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x082a }
            if (r9 == 0) goto L_0x07d5
            r9 = 1
            goto L_0x07d6
        L_0x07cb:
            java.lang.String r10 = "rating"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x082a }
            if (r9 == 0) goto L_0x07d5
            r9 = 7
            goto L_0x07d6
        L_0x07d5:
            r9 = -1
        L_0x07d6:
            switch(r9) {
                case 2: goto L_0x07f0;
                case 3: goto L_0x07ee;
                case 4: goto L_0x07eb;
                case 5: goto L_0x07e8;
                case 6: goto L_0x07e5;
                case 7: goto L_0x07e2;
                case 8: goto L_0x07df;
                case 9: goto L_0x07dc;
                case 10: goto L_0x07da;
                default: goto L_0x07d9;
            }     // Catch:{ JSONException -> 0x082a }
        L_0x07d9:
            goto L_0x07f3
        L_0x07da:
            r13 = r4
            goto L_0x07f5
        L_0x07dc:
            java.lang.String r13 = "WEBVIEW"
            goto L_0x07f5
        L_0x07df:
            java.lang.String r13 = "TIMER"
            goto L_0x07f5
        L_0x07e2:
            r13 = r17
            goto L_0x07f5
        L_0x07e5:
            r13 = r20
            goto L_0x07f5
        L_0x07e8:
            java.lang.String r13 = "TEXT"
            goto L_0x07f5
        L_0x07eb:
            r13 = r23
            goto L_0x07f5
        L_0x07ee:
            r13 = r0
            goto L_0x07f5
        L_0x07f0:
            java.lang.String r13 = "ICON"
            goto L_0x07f5
        L_0x07f3:
            r13 = r19
        L_0x07f5:
            com.inmobi.media.bf r8 = r6.m11394a((org.json.JSONObject) r8, (java.lang.String) r13, (java.lang.String) r7)     // Catch:{ JSONException -> 0x082a }
            if (r8 == 0) goto L_0x0826
            r8.f11365g = r7     // Catch:{ JSONException -> 0x082a }
            r8.f11378t = r1     // Catch:{ JSONException -> 0x082a }
            int r7 = r1.f11397C     // Catch:{ JSONException -> 0x082a }
            r9 = 16
            if (r7 >= r9) goto L_0x0826
            int r7 = r1.f11397C     // Catch:{ JSONException -> 0x082a }
            com.inmobi.media.bf[] r9 = r1.f11396B     // Catch:{ JSONException -> 0x082a }
            int r9 = r9.length     // Catch:{ JSONException -> 0x082a }
            if (r7 != r9) goto L_0x081c
            com.inmobi.media.bf[] r7 = r1.f11396B     // Catch:{ JSONException -> 0x082a }
            int r7 = r7.length     // Catch:{ JSONException -> 0x082a }
            int r7 = r7 * 2
            com.inmobi.media.bf[] r7 = new com.inmobi.media.C5010bf[r7]     // Catch:{ JSONException -> 0x082a }
            com.inmobi.media.bf[] r9 = r1.f11396B     // Catch:{ JSONException -> 0x082a }
            int r10 = r1.f11397C     // Catch:{ JSONException -> 0x082a }
            java.lang.System.arraycopy(r9, r15, r7, r15, r10)     // Catch:{ JSONException -> 0x082a }
            r1.f11396B = r7     // Catch:{ JSONException -> 0x082a }
        L_0x081c:
            com.inmobi.media.bf[] r7 = r1.f11396B     // Catch:{ JSONException -> 0x082a }
            int r9 = r1.f11397C     // Catch:{ JSONException -> 0x082a }
            int r10 = r9 + 1
            r1.f11397C = r10     // Catch:{ JSONException -> 0x082a }
            r7[r9] = r8     // Catch:{ JSONException -> 0x082a }
        L_0x0826:
            int r5 = r5 + 1
            goto L_0x0734
        L_0x082a:
            r0 = move-exception
            goto L_0x083c
        L_0x082c:
            r0 = move-exception
        L_0x082d:
            r6 = r46
            goto L_0x083c
        L_0x0830:
            r0 = move-exception
            r6 = r7
            r43 = r9
            r44 = r11
            r26 = r12
            r32 = r19
            r31 = r20
        L_0x083c:
            com.inmobi.media.fn r1 = com.inmobi.media.C5275fn.m12068a()
            com.inmobi.media.gk r2 = new com.inmobi.media.gk
            r2.<init>(r0)
            r1.mo40590a((com.inmobi.media.C5308gk) r2)
        L_0x0848:
            r1 = r21
        L_0x084a:
            if (r1 == 0) goto L_0x08a4
            r2 = r44
            r1.f11372n = r2
            r2 = r31
            r1.f11373o = r2
            r2 = r43
            r1.f11374p = r2
            r2 = r32
            r1.f11375q = r2
            if (r2 == 0) goto L_0x086c
            int r0 = r2.length()
            if (r0 == 0) goto L_0x086c
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.f11418r
            r3 = r26
            r0.put(r3, r2)
            goto L_0x086e
        L_0x086c:
            r3 = r26
        L_0x086e:
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0881
            java.util.Map<java.lang.String, com.inmobi.media.bf> r0 = r6.f11417q
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L_0x0881
            java.util.Map<java.lang.String, com.inmobi.media.bf> r0 = r6.f11417q
            r0.put(r3, r1)
        L_0x0881:
            java.util.Map<java.lang.String, java.util.List<com.inmobi.media.bf>> r0 = r6.f11416p
            r2 = r48
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x0897
            java.util.Map<java.lang.String, java.util.List<com.inmobi.media.bf>> r0 = r6.f11416p
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            r0.add(r1)
            goto L_0x08a4
        L_0x0897:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
            java.util.Map<java.lang.String, java.util.List<com.inmobi.media.bf>> r3 = r6.f11416p
            r3.put(r2, r0)
        L_0x08a4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5016bj.m11394a(org.json.JSONObject, java.lang.String, java.lang.String):com.inmobi.media.bf");
    }

    /* renamed from: a */
    private static void m11400a(C5010bf bfVar, JSONObject jSONObject) throws JSONException {
        String str;
        boolean z;
        String str2;
        boolean z2 = true;
        String str3 = "";
        if (m11432p(jSONObject)) {
            if (!jSONObject.getJSONObject("assetOnclick").isNull("itemUrl")) {
                str2 = jSONObject.getJSONObject("assetOnclick").getString("itemUrl");
                z = true;
            } else {
                str2 = str3;
                z = false;
            }
            if (!jSONObject.getJSONObject("assetOnclick").isNull("action")) {
                str = jSONObject.getJSONObject("assetOnclick").getString("action");
                str3 = str2;
            } else {
                str = str3;
                str3 = str2;
                z2 = z;
            }
        } else {
            str = str3;
            z2 = false;
        }
        bfVar.mo40162a(str3);
        bfVar.f11368j = str;
        bfVar.f11366h = z2;
    }

    /* renamed from: b */
    public final C5010bf mo40182b(String str) {
        if (!(str == null || str.length() == 0)) {
            if (this.f11417q.get(str) != null) {
                return this.f11417q.get(str);
            }
            C5016bj bjVar = this.f11407f;
            if (bjVar != null) {
                return bjVar.f11417q.get(str);
            }
        }
        return null;
    }

    /* renamed from: e */
    public final List<String> mo40187e() {
        return new ArrayList(this.f11416p.keySet());
    }

    /* renamed from: c */
    public final List<C5010bf> mo40185c(String str) {
        if (this.f11416p.containsKey(str)) {
            return this.f11416p.get(str);
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    private static boolean m11404a(JSONObject jSONObject, String str) {
        if (jSONObject.isNull("geometry")) {
            return false;
        }
        try {
            if (!m11403a(jSONObject.getJSONArray("geometry"))) {
                return false;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1919329183:
                    if (str.equals("CONTAINER")) {
                        c = 1;
                        break;
                    }
                    break;
                case 67056:
                    if (str.equals("CTA")) {
                        c = 9;
                        break;
                    }
                    break;
                case 70564:
                    if (str.equals("GIF")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2241657:
                    if (str.equals("ICON")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2571565:
                    if (str.equals("TEXT")) {
                        c = 8;
                        break;
                    }
                    break;
                case 69775675:
                    if (str.equals(ShareConstants.IMAGE_URL)) {
                        c = 3;
                        break;
                    }
                    break;
                case 79826725:
                    if (str.equals("TIMER")) {
                        c = 5;
                        break;
                    }
                    break;
                case 81665115:
                    if (str.equals(ShareConstants.VIDEO_URL)) {
                        c = 4;
                        break;
                    }
                    break;
                case 1942407129:
                    if (str.equals("WEBVIEW")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return true;
                case 8:
                case 9:
                    if (jSONObject.isNull("text")) {
                        return false;
                    }
                    try {
                        if (((int) Double.parseDouble(jSONObject.getJSONObject("text").getString("size"))) > 0) {
                            return true;
                        }
                        return false;
                    } catch (NumberFormatException e) {
                        C5275fn.m12068a().mo40590a(new C5308gk(e));
                        return false;
                    }
                default:
                    return false;
            }
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return false;
        } catch (JSONException e2) {
            C5275fn.m12068a().mo40590a(new C5308gk(e2));
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m11403a(JSONArray jSONArray) {
        try {
            int i = jSONArray.getInt(2);
            int i2 = jSONArray.getInt(3);
            if (i <= 0 || i2 <= 0) {
                return false;
            }
            return true;
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return false;
        }
    }

    /* renamed from: a */
    private static C5030br m11397a(int i, String str, JSONObject jSONObject) throws JSONException {
        String trim = jSONObject.isNull("url") ? "" : jSONObject.getString("url").trim();
        HashMap hashMap = new HashMap();
        if ("VideoImpression".equals(str)) {
            JSONArray optJSONArray = jSONObject.optJSONArray("events");
            if ((trim.length() == 0 || ((trim.startsWith("http") && !URLUtil.isValidUrl(trim)) || !trim.startsWith("http"))) && optJSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    String a = C5030br.m11456a(optJSONArray.getString(i2));
                    if ("creativeView".equals(a) || "start".equals(a) || "Impression".equals(a)) {
                        arrayList.add(a);
                    }
                }
            }
            hashMap.put("referencedEvents", arrayList);
        } else if (trim.length() == 0 || !URLUtil.isValidUrl(trim)) {
            return null;
        }
        HashMap hashMap2 = new HashMap();
        try {
            if (!jSONObject.isNull(NativeProtocol.WEB_DIALOG_PARAMS)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(NativeProtocol.WEB_DIALOG_PARAMS);
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap2.put(next, jSONObject2.getString(next));
                }
            }
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        }
        C5030br brVar = new C5030br(trim, i, str, hashMap2);
        brVar.f11471f = new HashMap(hashMap);
        return brVar;
    }

    /* renamed from: a */
    private static List<C5030br> m11399a(JSONObject jSONObject) {
        LinkedList linkedList = new LinkedList();
        try {
            HashMap hashMap = new HashMap();
            if (!jSONObject.isNull("macros")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("macros");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject2.getString(next));
                }
            }
            JSONArray jSONArray = jSONObject.getJSONArray("adVerifications");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                if (!jSONObject3.isNull("url")) {
                    linkedList.add(new C5133ds(jSONObject3.optString(Verification.VENDOR), jSONObject3.optString("verificationParams"), jSONObject3.getString("url"), "OMID_VIEWABILITY", hashMap));
                }
            }
            if (linkedList.isEmpty()) {
                linkedList.add(new C5030br("", 0, "OMID_VIEWABILITY", hashMap));
            }
        } catch (Exception e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        }
        return linkedList;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0158, code lost:
        if (r5 == 2) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x015a, code lost:
        if (r5 == 3) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x015d, code lost:
        if (r5 == 4) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x015f, code lost:
        r15 = "unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0161, code lost:
        r15 = "TRACKER_EVENT_TYPE_DOWNLOADER_ERROR";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0164, code lost:
        r15 = "TRACKER_EVENT_TYPE_DOWNLOADER_DOWNLOADED";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0167, code lost:
        r15 = "TRACKER_EVENT_TYPE_DOWNLOADER_DOWNLOADING";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0155, code lost:
        r5 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0156, code lost:
        if (r5 == 1) goto L_0x0169;
     */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0186 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b A[Catch:{ JSONException -> 0x018c }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.inmobi.media.C5030br> m11407b(org.json.JSONObject r17) {
        /*
            r0 = r17
            java.lang.String r1 = "uiEvent"
            java.lang.String r2 = "trackerType"
            java.lang.String r3 = "trackers"
            boolean r4 = r0.isNull(r3)
            if (r4 == 0) goto L_0x0010
            r0 = 0
            return r0
        L_0x0010:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            org.json.JSONArray r0 = r0.getJSONArray(r3)     // Catch:{ JSONException -> 0x018c }
            int r3 = r0.length()     // Catch:{ JSONException -> 0x018c }
            if (r3 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r5 = 0
            r6 = 0
        L_0x0022:
            if (r6 >= r3) goto L_0x018b
            org.json.JSONObject r7 = r0.getJSONObject(r6)     // Catch:{ JSONException -> 0x018c }
            boolean r8 = r7.isNull(r2)     // Catch:{ JSONException -> 0x018c }
            if (r8 != 0) goto L_0x0186
            java.lang.String r8 = r7.getString(r2)     // Catch:{ JSONException -> 0x018c }
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ JSONException -> 0x018c }
            java.lang.String r8 = r8.toUpperCase(r9)     // Catch:{ JSONException -> 0x018c }
            java.lang.String r8 = r8.trim()     // Catch:{ JSONException -> 0x018c }
            int r9 = r8.hashCode()     // Catch:{ JSONException -> 0x018c }
            r10 = -1430070305(0xffffffffaac2dbdf, float:-3.461389E-13)
            r12 = 3
            r13 = 2
            r14 = 1
            if (r9 == r10) goto L_0x0067
            r10 = -158113182(0xfffffffff6936262, float:-1.4946545E33)
            if (r9 == r10) goto L_0x005d
            r10 = 1110926088(0x42376308, float:45.84671)
            if (r9 == r10) goto L_0x0053
            goto L_0x0071
        L_0x0053:
            java.lang.String r9 = "URL_WEBVIEW_PING"
            boolean r8 = r8.equals(r9)     // Catch:{ JSONException -> 0x018c }
            if (r8 == 0) goto L_0x0071
            r8 = 2
            goto L_0x0072
        L_0x005d:
            java.lang.String r9 = "URL_PING"
            boolean r8 = r8.equals(r9)     // Catch:{ JSONException -> 0x018c }
            if (r8 == 0) goto L_0x0071
            r8 = 1
            goto L_0x0072
        L_0x0067:
            java.lang.String r9 = "HTML_SCRIPT"
            boolean r8 = r8.equals(r9)     // Catch:{ JSONException -> 0x018c }
            if (r8 == 0) goto L_0x0071
            r8 = 3
            goto L_0x0072
        L_0x0071:
            r8 = -1
        L_0x0072:
            java.lang.String r9 = "url_ping"
            java.lang.String r10 = "unknown"
            if (r8 == r14) goto L_0x0084
            if (r8 == r13) goto L_0x0081
            if (r8 == r12) goto L_0x007e
            r8 = r10
            goto L_0x0085
        L_0x007e:
            java.lang.String r8 = "html_script"
            goto L_0x0085
        L_0x0081:
            java.lang.String r8 = "webview_ping"
            goto L_0x0085
        L_0x0084:
            r8 = r9
        L_0x0085:
            boolean r8 = r9.equals(r8)     // Catch:{ JSONException -> 0x018c }
            if (r8 == 0) goto L_0x0186
            java.lang.String r8 = "eventId"
            int r8 = r7.optInt(r8, r5)     // Catch:{ JSONException -> 0x018c }
            boolean r9 = r7.isNull(r1)     // Catch:{ JSONException -> 0x018c }
            if (r9 != 0) goto L_0x0186
            java.lang.String r9 = r7.getString(r1)     // Catch:{ JSONException -> 0x018c }
            java.util.Locale r15 = java.util.Locale.US     // Catch:{ JSONException -> 0x018c }
            java.lang.String r15 = r9.toUpperCase(r15)     // Catch:{ JSONException -> 0x018c }
            java.lang.String r15 = r15.trim()     // Catch:{ JSONException -> 0x018c }
            int r16 = r15.hashCode()     // Catch:{ JSONException -> 0x018c }
            java.lang.String r11 = "OMID_VIEWABILITY"
            switch(r16) {
                case -1881262698: goto L_0x00f4;
                case -825499301: goto L_0x00e9;
                case 2342118: goto L_0x00df;
                case 2634405: goto L_0x00d5;
                case 64212328: goto L_0x00cb;
                case 368426751: goto L_0x00c3;
                case 1963885793: goto L_0x00b9;
                case 2008409463: goto L_0x00af;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            goto L_0x00fe
        L_0x00af:
            java.lang.String r5 = "CLIENT_FILL"
            boolean r5 = r15.equals(r5)     // Catch:{ JSONException -> 0x018c }
            if (r5 == 0) goto L_0x00fe
            r5 = 2
            goto L_0x00ff
        L_0x00b9:
            java.lang.String r5 = "VIDEO_VIEWABILITY"
            boolean r5 = r15.equals(r5)     // Catch:{ JSONException -> 0x018c }
            if (r5 == 0) goto L_0x00fe
            r5 = 6
            goto L_0x00ff
        L_0x00c3:
            boolean r5 = r15.equals(r11)     // Catch:{ JSONException -> 0x018c }
            if (r5 == 0) goto L_0x00fe
            r5 = 7
            goto L_0x00ff
        L_0x00cb:
            java.lang.String r5 = "CLICK"
            boolean r5 = r15.equals(r5)     // Catch:{ JSONException -> 0x018c }
            if (r5 == 0) goto L_0x00fe
            r5 = 5
            goto L_0x00ff
        L_0x00d5:
            java.lang.String r5 = "VIEW"
            boolean r5 = r15.equals(r5)     // Catch:{ JSONException -> 0x018c }
            if (r5 == 0) goto L_0x00fe
            r5 = 4
            goto L_0x00ff
        L_0x00df:
            java.lang.String r5 = "LOAD"
            boolean r5 = r15.equals(r5)     // Catch:{ JSONException -> 0x018c }
            if (r5 == 0) goto L_0x00fe
            r5 = 1
            goto L_0x00ff
        L_0x00e9:
            java.lang.String r5 = "FALLBACK_URL_CLICK"
            boolean r5 = r15.equals(r5)     // Catch:{ JSONException -> 0x018c }
            if (r5 == 0) goto L_0x00fe
            r5 = 8
            goto L_0x00ff
        L_0x00f4:
            java.lang.String r5 = "RENDER"
            boolean r5 = r15.equals(r5)     // Catch:{ JSONException -> 0x018c }
            if (r5 == 0) goto L_0x00fe
            r5 = 3
            goto L_0x00ff
        L_0x00fe:
            r5 = -1
        L_0x00ff:
            java.lang.String r15 = "TRACKER_EVENT_TYPE_FALLBACK_URL"
            switch(r5) {
                case 1: goto L_0x011a;
                case 2: goto L_0x0117;
                case 3: goto L_0x0114;
                case 4: goto L_0x0111;
                case 5: goto L_0x010e;
                case 6: goto L_0x010a;
                case 7: goto L_0x0107;
                case 8: goto L_0x0169;
                default: goto L_0x0104;
            }
        L_0x0104:
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ JSONException -> 0x018c }
            goto L_0x011d
        L_0x0107:
            r15 = r11
            goto L_0x0169
        L_0x010a:
            java.lang.String r15 = "VideoImpression"
            goto L_0x0169
        L_0x010e:
            java.lang.String r15 = "click"
            goto L_0x0169
        L_0x0111:
            java.lang.String r15 = "page_view"
            goto L_0x0169
        L_0x0114:
            java.lang.String r15 = "Impression"
            goto L_0x0169
        L_0x0117:
            java.lang.String r15 = "client_fill"
            goto L_0x0169
        L_0x011a:
            java.lang.String r15 = "load"
            goto L_0x0169
        L_0x011d:
            java.lang.String r5 = r9.toUpperCase(r5)     // Catch:{ JSONException -> 0x018c }
            java.lang.String r5 = r5.trim()     // Catch:{ JSONException -> 0x018c }
            int r9 = r5.hashCode()     // Catch:{ JSONException -> 0x018c }
            switch(r9) {
                case -1836567951: goto L_0x014b;
                case -1099027408: goto L_0x0141;
                case 1331888222: goto L_0x0137;
                case 1346121898: goto L_0x012d;
                default: goto L_0x012c;
            }     // Catch:{ JSONException -> 0x018c }
        L_0x012c:
            goto L_0x0155
        L_0x012d:
            java.lang.String r9 = "DOWNLOADER_INITIALIZED"
            boolean r5 = r5.equals(r9)     // Catch:{ JSONException -> 0x018c }
            if (r5 == 0) goto L_0x0155
            r5 = 1
            goto L_0x0156
        L_0x0137:
            java.lang.String r9 = "DOWNLOADER_ERROR"
            boolean r5 = r5.equals(r9)     // Catch:{ JSONException -> 0x018c }
            if (r5 == 0) goto L_0x0155
            r5 = 4
            goto L_0x0156
        L_0x0141:
            java.lang.String r9 = "DOWNLOADER_DOWNLOADING"
            boolean r5 = r5.equals(r9)     // Catch:{ JSONException -> 0x018c }
            if (r5 == 0) goto L_0x0155
            r5 = 2
            goto L_0x0156
        L_0x014b:
            java.lang.String r9 = "DOWNLOADER_DOWNLOADED"
            boolean r5 = r5.equals(r9)     // Catch:{ JSONException -> 0x018c }
            if (r5 == 0) goto L_0x0155
            r5 = 3
            goto L_0x0156
        L_0x0155:
            r5 = -1
        L_0x0156:
            if (r5 == r14) goto L_0x0169
            if (r5 == r13) goto L_0x0167
            if (r5 == r12) goto L_0x0164
            r9 = 4
            if (r5 == r9) goto L_0x0161
            r15 = r10
            goto L_0x0169
        L_0x0161:
            java.lang.String r15 = "TRACKER_EVENT_TYPE_DOWNLOADER_ERROR"
            goto L_0x0169
        L_0x0164:
            java.lang.String r15 = "TRACKER_EVENT_TYPE_DOWNLOADER_DOWNLOADED"
            goto L_0x0169
        L_0x0167:
            java.lang.String r15 = "TRACKER_EVENT_TYPE_DOWNLOADER_DOWNLOADING"
        L_0x0169:
            boolean r5 = r10.equals(r15)     // Catch:{ JSONException -> 0x018c }
            if (r5 != 0) goto L_0x0186
            boolean r5 = r11.equals(r15)     // Catch:{ JSONException -> 0x018c }
            if (r5 != 0) goto L_0x017f
            com.inmobi.media.br r5 = m11397a((int) r8, (java.lang.String) r15, (org.json.JSONObject) r7)     // Catch:{ JSONException -> 0x018c }
            if (r5 == 0) goto L_0x0186
            r4.add(r5)     // Catch:{ JSONException -> 0x018c }
            goto L_0x0186
        L_0x017f:
            java.util.List r5 = m11399a((org.json.JSONObject) r7)     // Catch:{ JSONException -> 0x018c }
            r4.addAll(r5)     // Catch:{ JSONException -> 0x018c }
        L_0x0186:
            int r6 = r6 + 1
            r5 = 0
            goto L_0x0022
        L_0x018b:
            return r4
        L_0x018c:
            r0 = move-exception
            com.inmobi.media.fn r1 = com.inmobi.media.C5275fn.m12068a()
            com.inmobi.media.gk r2 = new com.inmobi.media.gk
            r2.<init>(r0)
            r1.mo40590a((com.inmobi.media.C5308gk) r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5016bj.m11407b(org.json.JSONObject):java.util.List");
    }

    /* renamed from: a */
    private C5095cw m11398a(JSONObject jSONObject, String str, C5010bf bfVar) {
        if (m11416f(jSONObject).equalsIgnoreCase(ShareConstants.VIDEO_URL)) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
                if (jSONArray != null) {
                    if (jSONArray.length() != 0) {
                        if (bfVar instanceof C5031bs) {
                            return (C5095cw) bfVar.f11363e;
                        }
                        return new C5088cs(this.f11419s.vastVideo).mo40353a(str);
                    }
                }
                return null;
            } catch (JSONException e) {
                C5275fn.m12068a().mo40590a(new C5308gk(e));
            }
        }
        return null;
    }

    /* renamed from: c */
    private static String m11409c(JSONObject jSONObject) {
        try {
            if ((m11416f(jSONObject).equalsIgnoreCase("ICON") || m11416f(jSONObject).equalsIgnoreCase(ShareConstants.IMAGE_URL) || m11416f(jSONObject).equalsIgnoreCase("GIF")) && jSONObject.getJSONArray("assetValue").getString(0).length() != 0) {
                return jSONObject.getJSONArray("assetValue").getString(0);
            }
            return "";
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return "";
        }
    }

    /* renamed from: d */
    private static String m11411d(JSONObject jSONObject) {
        try {
            return jSONObject.getString("assetId");
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return Integer.toString(jSONObject.hashCode());
        }
    }

    /* renamed from: e */
    private static String m11413e(JSONObject jSONObject) {
        try {
            return jSONObject.getString("assetName");
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return "";
        }
    }

    /* renamed from: f */
    private static String m11416f(JSONObject jSONObject) {
        try {
            return jSONObject.getString("assetType");
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return "";
        }
    }

    /* renamed from: g */
    private static String m11418g(JSONObject jSONObject) {
        try {
            return jSONObject.getString("valueType");
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return "";
        }
    }

    /* renamed from: h */
    private static String m11421h(JSONObject jSONObject) {
        try {
            return jSONObject.getString("dataType");
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return "";
        }
    }

    /* renamed from: i */
    private JSONObject m11423i(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        try {
            if (jSONObject.isNull("assetStyle")) {
                jSONObject2 = null;
            } else {
                jSONObject2 = jSONObject.getJSONObject("assetStyle");
            }
            if (jSONObject2 != null) {
                return jSONObject2;
            }
            if (jSONObject.isNull("assetStyleRef")) {
                return new JSONObject();
            }
            String string = jSONObject.getString("assetStyleRef");
            if (this.f11415o == null) {
                jSONObject3 = new JSONObject();
            } else {
                jSONObject3 = this.f11415o.getJSONObject(string);
            }
            return jSONObject3;
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return new JSONObject();
        }
    }

    /* renamed from: j */
    private Point m11425j(JSONObject jSONObject) {
        Point point = new Point();
        try {
            JSONObject i = m11423i(jSONObject);
            if (i.isNull("geometry")) {
                return point;
            }
            JSONArray jSONArray = i.getJSONArray("geometry");
            point.x = C5343hf.m12332a(jSONArray.getInt(0));
            point.y = C5343hf.m12332a(jSONArray.getInt(1));
            return point;
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        }
    }

    /* renamed from: a */
    private Point m11392a(JSONObject jSONObject, Point point) {
        try {
            JSONObject i = m11423i(jSONObject);
            if (i.isNull("finalGeometry")) {
                return point;
            }
            Point point2 = new Point();
            JSONArray jSONArray = i.getJSONArray("finalGeometry");
            point2.x = C5343hf.m12332a(jSONArray.getInt(0));
            point2.y = C5343hf.m12332a(jSONArray.getInt(1));
            return point2;
        } catch (JSONException unused) {
            return point;
        }
    }

    /* renamed from: k */
    private Point m11427k(JSONObject jSONObject) {
        Point point = new Point();
        try {
            JSONObject i = m11423i(jSONObject);
            if (i.isNull("geometry")) {
                return point;
            }
            JSONArray jSONArray = i.getJSONArray("geometry");
            point.x = C5343hf.m12332a(jSONArray.getInt(2));
            point.y = C5343hf.m12332a(jSONArray.getInt(3));
            return point;
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
        }
    }

    /* renamed from: b */
    private Point m11405b(JSONObject jSONObject, Point point) {
        try {
            JSONObject i = m11423i(jSONObject);
            if (i.isNull("finalGeometry")) {
                return point;
            }
            Point point2 = new Point();
            JSONArray jSONArray = i.getJSONArray("finalGeometry");
            point2.x = C5343hf.m12332a(jSONArray.getInt(2));
            point2.y = C5343hf.m12332a(jSONArray.getInt(3));
            return point2;
        } catch (JSONException unused) {
            return point;
        }
    }

    /* renamed from: l */
    private static byte m11428l(JSONObject jSONObject) {
        try {
            JSONObject n = m11430n(jSONObject);
            if (n.isNull("type")) {
                return 2;
            }
            String lowerCase = n.getString("type").trim().toLowerCase(Locale.US);
            char c = 65535;
            int hashCode = lowerCase.hashCode();
            if (hashCode != -921832806) {
                if (hashCode != -284840886) {
                    if (hashCode == 1728122231) {
                        if (lowerCase.equals(Constants.PATH_TYPE_ABSOLUTE)) {
                            c = 2;
                        }
                    }
                } else if (lowerCase.equals("unknown")) {
                    c = 1;
                }
            } else if (lowerCase.equals("percentage")) {
                c = 3;
            }
            if (c != 2) {
                return c != 3 ? (byte) 1 : 4;
            }
            return 3;
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return 2;
        }
    }

    /* renamed from: a */
    private static int m11391a(JSONObject jSONObject, boolean z) {
        try {
            JSONObject n = m11430n(jSONObject);
            String str = AdvertisementDBAdapter.AdvertisementColumns.COLUMN_DELAY;
            if (n.isNull(z ? str : "hideAfterDelay")) {
                return -1;
            }
            if (!z) {
                str = "hideAfterDelay";
            }
            int i = n.getInt(str);
            if (3 == m11428l(jSONObject)) {
                return i;
            }
            if (4 == m11428l(jSONObject)) {
                if (i == 0) {
                    return i;
                }
                if (i > 0 && i <= 100) {
                    int[] iArr = {25, 50, 75, 100};
                    double d = Double.MAX_VALUE;
                    int i2 = -1;
                    for (int i3 = 0; i3 < 4; i3++) {
                        int i4 = i - iArr[i3];
                        double d2 = (double) (i4 * i4);
                        if (d2 < d) {
                            i2 = i3;
                            d = d2;
                        }
                    }
                    return iArr[i2];
                }
            }
            return -1;
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return -1;
        }
    }

    /* renamed from: m */
    private static String m11429m(JSONObject jSONObject) {
        try {
            JSONObject n = m11430n(jSONObject);
            if (n.isNull("reference")) {
                return "";
            }
            return n.getString("reference");
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return "";
        }
    }

    /* renamed from: n */
    private static JSONObject m11430n(JSONObject jSONObject) {
        if (jSONObject.isNull("display")) {
            return new JSONObject();
        }
        try {
            return jSONObject.getJSONObject("display");
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return new JSONObject();
        }
    }

    /* renamed from: o */
    private static JSONArray m11431o(JSONObject jSONObject) {
        try {
            return jSONObject.getJSONArray("assetValue");
        } catch (JSONException e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            return new JSONArray();
        }
    }

    /* renamed from: p */
    private static boolean m11432p(JSONObject jSONObject) {
        return !jSONObject.isNull("assetOnclick");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte m11410d(java.lang.String r5) {
        /*
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = r5.toUpperCase(r0)
            java.lang.String r5 = r5.trim()
            int r0 = r5.hashCode()
            r1 = 1
            r2 = 4
            r3 = 3
            r4 = 2
            switch(r0) {
                case -2084521848: goto L_0x0034;
                case -1038134325: goto L_0x002a;
                case 69805756: goto L_0x0020;
                case 1411860198: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x003e
        L_0x0016:
            java.lang.String r0 = "DEEPLINK"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 3
            goto L_0x003f
        L_0x0020:
            java.lang.String r0 = "INAPP"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 2
            goto L_0x003f
        L_0x002a:
            java.lang.String r0 = "EXTERNAL"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 1
            goto L_0x003f
        L_0x0034:
            java.lang.String r0 = "DOWNLOAD"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 4
            goto L_0x003f
        L_0x003e:
            r5 = -1
        L_0x003f:
            if (r5 == r4) goto L_0x0048
            if (r5 == r3) goto L_0x0047
            if (r5 == r2) goto L_0x0046
            return r4
        L_0x0046:
            return r2
        L_0x0047:
            return r3
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5016bj.m11410d(java.lang.String):byte");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m11412e(java.lang.String r10) {
        /*
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r10 = r10.toLowerCase(r0)
            java.lang.String r10 = r10.trim()
            int r0 = r10.hashCode()
            java.lang.String r1 = "none"
            java.lang.String r2 = "bold"
            java.lang.String r3 = "strike"
            java.lang.String r4 = "underline"
            java.lang.String r5 = "italic"
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            switch(r0) {
                case -1178781136: goto L_0x0040;
                case -1026963764: goto L_0x0038;
                case -891985998: goto L_0x0030;
                case 3029637: goto L_0x0028;
                case 3387192: goto L_0x0020;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x0048
        L_0x0020:
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x0048
            r10 = 1
            goto L_0x0049
        L_0x0028:
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x0048
            r10 = 2
            goto L_0x0049
        L_0x0030:
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L_0x0048
            r10 = 4
            goto L_0x0049
        L_0x0038:
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L_0x0048
            r10 = 5
            goto L_0x0049
        L_0x0040:
            boolean r10 = r10.equals(r5)
            if (r10 == 0) goto L_0x0048
            r10 = 3
            goto L_0x0049
        L_0x0048:
            r10 = -1
        L_0x0049:
            if (r10 == r9) goto L_0x0055
            if (r10 == r8) goto L_0x0054
            if (r10 == r7) goto L_0x0053
            if (r10 == r6) goto L_0x0052
            return r1
        L_0x0052:
            return r4
        L_0x0053:
            return r3
        L_0x0054:
            return r5
        L_0x0055:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5016bj.m11412e(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032 A[RETURN] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m11415f(java.lang.String r5) {
        /*
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r0)
            java.lang.String r5 = r5.trim()
            int r0 = r5.hashCode()
            r1 = 3321844(0x32aff4, float:4.654895E-39)
            java.lang.String r2 = "none"
            java.lang.String r3 = "line"
            r4 = 2
            if (r0 == r1) goto L_0x0026
            r1 = 3387192(0x33af38, float:4.746467E-39)
            if (r0 == r1) goto L_0x001e
            goto L_0x002e
        L_0x001e:
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x002e
            r5 = 1
            goto L_0x002f
        L_0x0026:
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x002e
            r5 = 2
            goto L_0x002f
        L_0x002e:
            r5 = -1
        L_0x002f:
            if (r5 == r4) goto L_0x0032
            return r2
        L_0x0032:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5016bj.m11415f(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032 A[RETURN] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m11417g(java.lang.String r5) {
        /*
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r0)
            java.lang.String r5 = r5.trim()
            int r0 = r5.hashCode()
            r1 = -1349116587(0xffffffffaf961d55, float:-2.7305683E-10)
            java.lang.String r2 = "straight"
            java.lang.String r3 = "curved"
            r4 = 2
            if (r0 == r1) goto L_0x0026
            r1 = 1787472634(0x6a8aaafa, float:8.381959E25)
            if (r0 == r1) goto L_0x001e
            goto L_0x002e
        L_0x001e:
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x002e
            r5 = 1
            goto L_0x002f
        L_0x0026:
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x002e
            r5 = 2
            goto L_0x002f
        L_0x002e:
            r5 = -1
        L_0x002f:
            if (r5 == r4) goto L_0x0032
            return r2
        L_0x0032:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5016bj.m11417g(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m11420h(java.lang.String r8) {
        /*
            java.lang.String r8 = r8.trim()
            int r0 = r8.hashCode()
            java.lang.String r1 = "aspectFill"
            java.lang.String r2 = "fill"
            java.lang.String r3 = "aspectFit"
            java.lang.String r4 = "unspecified"
            r5 = 4
            r6 = 3
            r7 = 2
            switch(r0) {
                case -1626174665: goto L_0x002f;
                case -1362001767: goto L_0x0027;
                case 3143043: goto L_0x001f;
                case 727618043: goto L_0x0017;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x0037
        L_0x0017:
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0037
            r8 = 3
            goto L_0x0038
        L_0x001f:
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L_0x0037
            r8 = 2
            goto L_0x0038
        L_0x0027:
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0037
            r8 = 4
            goto L_0x0038
        L_0x002f:
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L_0x0037
            r8 = 1
            goto L_0x0038
        L_0x0037:
            r8 = -1
        L_0x0038:
            if (r8 == r7) goto L_0x0041
            if (r8 == r6) goto L_0x0040
            if (r8 == r5) goto L_0x003f
            return r4
        L_0x003f:
            return r3
        L_0x0040:
            return r1
        L_0x0041:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5016bj.m11420h(java.lang.String):java.lang.String");
    }

    /* renamed from: q */
    private C5024bo.C5025a m11433q(JSONObject jSONObject) {
        return new C5024bo.C5025a(jSONObject.optLong(Constants.PATH_TYPE_ABSOLUTE), jSONObject.optLong("percentage"), jSONObject.optString("reference"), this);
    }

    /* renamed from: r */
    private C5024bo.C5025a m11434r(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new C5024bo.C5025a(jSONObject.optLong(Constants.PATH_TYPE_ABSOLUTE), jSONObject.optLong("percentage"), jSONObject.optString("reference"), this);
    }

    /* renamed from: a */
    private C5011bg m11395a(Point point, Point point2, Point point3, Point point4, JSONObject jSONObject) throws JSONException {
        String str;
        Point point5 = point;
        Point point6 = point2;
        Point point7 = point3;
        Point point8 = point4;
        JSONObject jSONObject2 = jSONObject;
        String str2 = "none";
        String str3 = "#ff000000";
        String str4 = "straight";
        if (!jSONObject2.isNull("border")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("border");
            if (!jSONObject3.isNull("style")) {
                str2 = m11415f(jSONObject3.getString("style"));
                if (!jSONObject3.isNull("corner")) {
                    str4 = m11417g(jSONObject3.getString("corner"));
                }
                if (!jSONObject3.isNull("color")) {
                    str3 = jSONObject3.getString("color").trim();
                }
            }
        }
        String str5 = str2;
        String str6 = str3;
        String str7 = str4;
        if (jSONObject2.isNull("backgroundColor")) {
            str = "#00000000";
        } else {
            str = jSONObject2.getString("backgroundColor").trim();
        }
        String str8 = str;
        return new C5011bg(point5.x, point5.y, point6.x, point6.y, point7.x, point7.y, point8.x, point8.y, !jSONObject2.isNull("contentMode") ? m11420h(jSONObject2.getString("contentMode")) : "fill", str5, str7, str6, str8, m11435s(jSONObject2));
    }

    /* renamed from: s */
    private C5024bo m11435s(JSONObject jSONObject) throws JSONException {
        C5024bo.C5025a aVar = null;
        C5024bo.C5025a r = !jSONObject.isNull("startOffset") ? m11434r(jSONObject.optJSONObject("startOffset")) : null;
        if (!jSONObject.isNull("timerDuration")) {
            aVar = m11434r(jSONObject.optJSONObject("timerDuration"));
        }
        return new C5024bo(r, aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0139  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.inmobi.media.C5022bn.C5023a m11406b(android.graphics.Point r32, android.graphics.Point r33, android.graphics.Point r34, android.graphics.Point r35, org.json.JSONObject r36) throws org.json.JSONException {
        /*
            r31 = this;
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r35
            r4 = r36
            java.lang.String r5 = "border"
            boolean r6 = r4.isNull(r5)
            java.lang.String r7 = "straight"
            java.lang.String r8 = "color"
            java.lang.String r9 = "#ff000000"
            java.lang.String r10 = "none"
            java.lang.String r11 = "style"
            if (r6 == 0) goto L_0x0023
        L_0x001c:
            r22 = r7
            r23 = r9
            r21 = r10
            goto L_0x0062
        L_0x0023:
            org.json.JSONObject r5 = r4.getJSONObject(r5)
            boolean r6 = r5.isNull(r11)
            if (r6 == 0) goto L_0x002e
            goto L_0x001c
        L_0x002e:
            java.lang.String r6 = r5.getString(r11)
            java.lang.String r6 = m11415f((java.lang.String) r6)
            java.lang.String r12 = "corner"
            boolean r13 = r5.isNull(r12)
            if (r13 == 0) goto L_0x003f
            goto L_0x0047
        L_0x003f:
            java.lang.String r7 = r5.getString(r12)
            java.lang.String r7 = m11417g((java.lang.String) r7)
        L_0x0047:
            boolean r12 = r5.isNull(r8)
            if (r12 == 0) goto L_0x0054
            r21 = r6
            r22 = r7
            r23 = r9
            goto L_0x0062
        L_0x0054:
            java.lang.String r5 = r5.getString(r8)
            java.lang.String r5 = r5.trim()
            r23 = r5
            r21 = r6
            r22 = r7
        L_0x0062:
            java.lang.String r5 = "backgroundColor"
            boolean r6 = r4.isNull(r5)
            if (r6 == 0) goto L_0x006d
            java.lang.String r5 = "#00000000"
            goto L_0x0075
        L_0x006d:
            java.lang.String r5 = r4.getString(r5)
            java.lang.String r5 = r5.trim()
        L_0x0075:
            r24 = r5
            java.lang.String r5 = "text"
            org.json.JSONObject r5 = r4.getJSONObject(r5)
            java.lang.String r6 = "size"
            java.lang.String r6 = r5.getString(r6)     // Catch:{ NumberFormatException -> 0x0164 }
            double r6 = java.lang.Double.parseDouble(r6)     // Catch:{ NumberFormatException -> 0x0164 }
            int r6 = (int) r6
            java.lang.String r7 = "length"
            boolean r12 = r5.isNull(r7)
            if (r12 == 0) goto L_0x0097
            r7 = 2147483647(0x7fffffff, float:NaN)
            r27 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00a1
        L_0x0097:
            java.lang.String r7 = r5.getString(r7)
            int r7 = java.lang.Integer.parseInt(r7)
            r27 = r7
        L_0x00a1:
            boolean r7 = r5.isNull(r8)
            if (r7 == 0) goto L_0x00a8
            goto L_0x00b0
        L_0x00a8:
            java.lang.String r7 = r5.getString(r8)
            java.lang.String r9 = r7.trim()
        L_0x00b0:
            r28 = r9
            boolean r7 = r5.isNull(r11)
            r8 = 0
            if (r7 == 0) goto L_0x00c0
            java.lang.String[] r7 = new java.lang.String[]{r10}
        L_0x00bd:
            r29 = r7
            goto L_0x00e7
        L_0x00c0:
            org.json.JSONArray r7 = r5.getJSONArray(r11)
            int r7 = r7.length()
            if (r7 != 0) goto L_0x00cf
            java.lang.String[] r7 = new java.lang.String[]{r10}
            goto L_0x00bd
        L_0x00cf:
            java.lang.String[] r9 = new java.lang.String[r7]
            r10 = 0
        L_0x00d2:
            if (r10 >= r7) goto L_0x00e5
            org.json.JSONArray r12 = r5.getJSONArray(r11)
            java.lang.String r12 = r12.getString(r10)
            java.lang.String r12 = m11412e((java.lang.String) r12)
            r9[r10] = r12
            int r10 = r10 + 1
            goto L_0x00d2
        L_0x00e5:
            r29 = r9
        L_0x00e7:
            java.lang.String r7 = "align"
            boolean r9 = r5.isNull(r7)
            if (r9 != 0) goto L_0x0139
            java.lang.String r5 = r5.getString(r7)
            java.lang.String r5 = r5.trim()
            r7 = -1
            int r9 = r5.hashCode()
            r10 = -1364013605(0xffffffffaeb2cddb, float:-8.13107E-11)
            r11 = 3
            r12 = 2
            r13 = 1
            if (r9 == r10) goto L_0x0123
            r10 = 3317767(0x32a007, float:4.649182E-39)
            if (r9 == r10) goto L_0x0119
            r10 = 108511772(0x677c21c, float:4.6598146E-35)
            if (r9 == r10) goto L_0x010f
            goto L_0x012c
        L_0x010f:
            java.lang.String r9 = "right"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x012c
            r7 = 2
            goto L_0x012c
        L_0x0119:
            java.lang.String r9 = "left"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x012c
            r7 = 1
            goto L_0x012c
        L_0x0123:
            java.lang.String r9 = "centre"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x012c
            r7 = 3
        L_0x012c:
            if (r7 == r12) goto L_0x0133
            if (r7 == r11) goto L_0x0131
            goto L_0x0134
        L_0x0131:
            r8 = 2
            goto L_0x0134
        L_0x0133:
            r8 = 1
        L_0x0134:
            r5 = r31
            r26 = r8
            goto L_0x013d
        L_0x0139:
            r26 = 0
            r5 = r31
        L_0x013d:
            com.inmobi.media.bo r30 = r5.m11435s(r4)
            com.inmobi.media.bn$a r4 = new com.inmobi.media.bn$a
            r12 = r4
            int r13 = r0.x
            int r14 = r0.y
            int r15 = r1.x
            int r0 = r1.y
            r16 = r0
            int r0 = r2.x
            r17 = r0
            int r0 = r2.y
            r18 = r0
            int r0 = r3.x
            r19 = r0
            int r0 = r3.y
            r20 = r0
            r25 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r4
        L_0x0164:
            r0 = move-exception
            r5 = r31
            org.json.JSONException r1 = new org.json.JSONException
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2)
            com.inmobi.media.fn r2 = com.inmobi.media.C5275fn.m12068a()
            com.inmobi.media.gk r3 = new com.inmobi.media.gk
            r3.<init>(r0)
            r2.mo40590a((com.inmobi.media.C5308gk) r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5016bj.m11406b(android.graphics.Point, android.graphics.Point, android.graphics.Point, android.graphics.Point, org.json.JSONObject):com.inmobi.media.bn$a");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a8  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.inmobi.media.C5022bn.C5023a m11408c(android.graphics.Point r30, android.graphics.Point r31, android.graphics.Point r32, android.graphics.Point r33, org.json.JSONObject r34) throws org.json.JSONException {
        /*
            r29 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            java.lang.String r5 = "border"
            boolean r6 = r4.isNull(r5)
            java.lang.String r7 = "straight"
            java.lang.String r8 = "color"
            java.lang.String r9 = "#ff000000"
            java.lang.String r10 = "none"
            java.lang.String r11 = "style"
            if (r6 == 0) goto L_0x0023
        L_0x001c:
            r22 = r7
            r23 = r9
            r21 = r10
            goto L_0x0062
        L_0x0023:
            org.json.JSONObject r5 = r4.getJSONObject(r5)
            boolean r6 = r5.isNull(r11)
            if (r6 == 0) goto L_0x002e
            goto L_0x001c
        L_0x002e:
            java.lang.String r6 = r5.getString(r11)
            java.lang.String r6 = m11415f((java.lang.String) r6)
            java.lang.String r12 = "corner"
            boolean r13 = r5.isNull(r12)
            if (r13 == 0) goto L_0x003f
            goto L_0x0047
        L_0x003f:
            java.lang.String r7 = r5.getString(r12)
            java.lang.String r7 = m11417g((java.lang.String) r7)
        L_0x0047:
            boolean r12 = r5.isNull(r8)
            if (r12 == 0) goto L_0x0054
            r21 = r6
            r22 = r7
            r23 = r9
            goto L_0x0062
        L_0x0054:
            java.lang.String r5 = r5.getString(r8)
            java.lang.String r5 = r5.trim()
            r23 = r5
            r21 = r6
            r22 = r7
        L_0x0062:
            java.lang.String r5 = "backgroundColor"
            boolean r6 = r4.isNull(r5)
            if (r6 == 0) goto L_0x006d
            java.lang.String r5 = "#00000000"
            goto L_0x0075
        L_0x006d:
            java.lang.String r5 = r4.getString(r5)
            java.lang.String r5 = r5.trim()
        L_0x0075:
            r24 = r5
            java.lang.String r5 = "text"
            org.json.JSONObject r5 = r4.getJSONObject(r5)
            java.lang.String r6 = "size"
            java.lang.String r6 = r5.getString(r6)     // Catch:{ NumberFormatException -> 0x00f8 }
            double r6 = java.lang.Double.parseDouble(r6)     // Catch:{ NumberFormatException -> 0x00f8 }
            int r6 = (int) r6
            boolean r7 = r5.isNull(r8)
            if (r7 == 0) goto L_0x008f
            goto L_0x0097
        L_0x008f:
            java.lang.String r7 = r5.getString(r8)
            java.lang.String r9 = r7.trim()
        L_0x0097:
            r26 = r9
            boolean r7 = r5.isNull(r11)
            if (r7 == 0) goto L_0x00a8
            java.lang.String[] r5 = new java.lang.String[]{r10}
        L_0x00a3:
            r27 = r5
            r5 = r29
            goto L_0x00d1
        L_0x00a8:
            org.json.JSONArray r7 = r5.getJSONArray(r11)
            int r7 = r7.length()
            if (r7 != 0) goto L_0x00b7
            java.lang.String[] r5 = new java.lang.String[]{r10}
            goto L_0x00a3
        L_0x00b7:
            java.lang.String[] r8 = new java.lang.String[r7]
            r9 = 0
        L_0x00ba:
            if (r9 >= r7) goto L_0x00cd
            org.json.JSONArray r10 = r5.getJSONArray(r11)
            java.lang.String r10 = r10.getString(r9)
            java.lang.String r10 = m11412e((java.lang.String) r10)
            r8[r9] = r10
            int r9 = r9 + 1
            goto L_0x00ba
        L_0x00cd:
            r5 = r29
            r27 = r8
        L_0x00d1:
            com.inmobi.media.bo r28 = r5.m11435s(r4)
            com.inmobi.media.bi$a r4 = new com.inmobi.media.bi$a
            r12 = r4
            int r13 = r0.x
            int r14 = r0.y
            int r15 = r1.x
            int r0 = r1.y
            r16 = r0
            int r0 = r2.x
            r17 = r0
            int r0 = r2.y
            r18 = r0
            int r0 = r3.x
            r19 = r0
            int r0 = r3.y
            r20 = r0
            r25 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r4
        L_0x00f8:
            r0 = move-exception
            r5 = r29
            org.json.JSONException r1 = new org.json.JSONException
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2)
            com.inmobi.media.fn r2 = com.inmobi.media.C5275fn.m12068a()
            com.inmobi.media.gk r3 = new com.inmobi.media.gk
            r3.<init>(r0)
            r2.mo40590a((com.inmobi.media.C5308gk) r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5016bj.m11408c(android.graphics.Point, android.graphics.Point, android.graphics.Point, android.graphics.Point, org.json.JSONObject):com.inmobi.media.bn$a");
    }

    /* renamed from: a */
    private static boolean m11402a(C5012bh bhVar) {
        return "card_scrollable".equalsIgnoreCase(bhVar.f11362d);
    }

    /* renamed from: a */
    private static void m11401a(C5031bs bsVar) {
        bsVar.f11382x = 8;
        HashMap hashMap = new HashMap();
        hashMap.put("[ERRORCODE]", "601");
        bsVar.mo40163a("error", (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    private static C5010bf m11393a(C5016bj bjVar, C5010bf bfVar) {
        do {
            String str = (String) bfVar.f11363e;
            if (str == null || str.length() == 0) {
                return null;
            }
            String[] split = str.split("\\|");
            C5010bf b = bjVar.mo40182b(split[0]);
            if (b == null) {
                bjVar = bjVar.f11407f;
            } else if (b.equals(bfVar)) {
                return null;
            } else {
                if (1 == split.length) {
                    b.f11371m = 1;
                    return b;
                }
                b.f11371m = m11390a(split[1]);
                return b;
            }
        } while (bjVar != null);
        return null;
    }
}
