package com.inmobi.media;

import android.net.Uri;
import com.inmobi.unification.sdk.model.ASRequestParams;
import java.util.Map;

/* renamed from: com.inmobi.media.bx */
/* compiled from: AdNetworkRequest */
public final class C5037bx extends C5299gc {

    /* renamed from: v */
    private static final String f11489v = C5037bx.class.getSimpleName();

    /* renamed from: x */
    private static String f11490x;

    /* renamed from: y */
    private static Map<String, String> f11491y = null;

    /* renamed from: a */
    public String f11492a;

    /* renamed from: b */
    public String f11493b;

    /* renamed from: c */
    public String f11494c;

    /* renamed from: d */
    public Map<String, String> f11495d;

    /* renamed from: e */
    public final C5074ck f11496e;

    /* renamed from: f */
    public ASRequestParams f11497f;

    /* renamed from: w */
    private C4955an f11498w;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5037bx(java.lang.String r9, com.inmobi.media.C5361hu r10, java.lang.String r11, com.inmobi.media.C4955an r12, java.util.Map<java.lang.String, java.lang.Long> r13) {
        /*
            r8 = this;
            java.lang.String r0 = f11490x
            if (r0 != 0) goto L_0x0006
            r3 = r9
            goto L_0x0007
        L_0x0006:
            r3 = r0
        L_0x0007:
            f11490x = r3
            boolean r4 = m11462a(r3)
            java.lang.String r9 = f11490x
            boolean r6 = m11462a(r9)
            r7 = 0
            java.lang.String r2 = "POST"
            r1 = r8
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "json"
            r8.f11492a = r9
            r8.f11498w = r12
            java.lang.String r9 = com.inmobi.media.C5314go.m12211f()
            r8.f12141t = r9
            java.util.Map r9 = r8.f12130i
            java.util.Map r10 = com.inmobi.media.C5343hf.m12338c()
            r9.putAll(r10)
            java.util.Map r9 = r8.f12130i
            com.inmobi.media.hd r10 = com.inmobi.media.C5340hd.m12324a()
            java.lang.String r10 = r10.f12230b
            java.lang.String r12 = "u-appIS"
            r9.put(r12, r10)
            java.util.Map r9 = r8.f12130i
            com.inmobi.media.an r10 = r8.f11498w
            java.lang.String r10 = r10.mo40081n()
            java.lang.String r12 = "client-request-id"
            r9.put(r12, r10)
            if (r11 == 0) goto L_0x0053
            java.util.Map r9 = r8.f12130i
            java.lang.String r10 = "u-appcache"
            r9.put(r10, r11)
        L_0x0053:
            java.util.Map r9 = r8.f12130i
            java.lang.String r10 = "sdk-flavor"
            java.lang.String r11 = "row"
            r9.put(r10, r11)
            java.util.Map r9 = r8.f12130i
            android.content.Context r10 = com.inmobi.media.C5314go.m12203c()
            java.util.Map r10 = com.inmobi.media.C5318gr.m12237a((android.content.Context) r10, (java.util.Map<java.lang.String, java.lang.Long>) r13)
            r9.putAll(r10)
            com.inmobi.media.ck r9 = new com.inmobi.media.ck
            r9.<init>()
            r8.f11496e = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5037bx.<init>(java.lang.String, com.inmobi.media.hu, java.lang.String, com.inmobi.media.an, java.util.Map):void");
    }

    /* renamed from: a */
    private static boolean m11462a(String str) {
        if (str == null) {
            return true;
        }
        Uri parse = Uri.parse(str);
        if ("http".equals(parse.getScheme()) || !"https".equals(parse.getScheme())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0277  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40207a() {
        /*
            r11 = this;
            super.mo40207a()
            java.util.Map r0 = r11.f12130i
            java.lang.String r1 = r11.f11492a
            java.lang.String r2 = "format"
            r0.put(r2, r1)
            java.util.Map r0 = r11.f12130i
            java.lang.String r1 = r11.f11493b
            java.lang.String r2 = "adtype"
            r0.put(r2, r1)
            java.util.Map r0 = r11.f12130i
            com.inmobi.media.hx r1 = com.inmobi.media.C5365hx.m12407a()
            java.util.HashMap r1 = r1.mo40726d()
            r0.putAll(r1)
            java.util.Map r0 = r11.f12130i
            com.inmobi.media.hx r1 = com.inmobi.media.C5365hx.m12407a()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            boolean r3 = com.inmobi.media.C5365hx.m12411c()
            java.lang.String r4 = "DENIED"
            if (r3 == 0) goto L_0x003d
            boolean r1 = r1.mo40727e()
            if (r1 == 0) goto L_0x003d
            java.lang.String r4 = "AUTHORISED"
        L_0x003d:
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r1 = r4.toLowerCase(r1)
            java.lang.String r3 = "loc-consent-status"
            r2.put(r3, r1)
            r0.putAll(r2)
            java.util.Map r0 = r11.f12130i
            com.inmobi.media.C5371hz.m12430a()
            java.lang.String r1 = com.inmobi.media.C5314go.m12220m()
            com.inmobi.media.ig r2 = com.inmobi.media.C5384ii.m12471b()
            r3 = 0
            if (r2 == 0) goto L_0x0060
            java.lang.String r4 = r2.mo40745e()
            goto L_0x0061
        L_0x0060:
            r4 = r3
        L_0x0061:
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x006d
            boolean r7 = r2.mo40744d()
            if (r7 == 0) goto L_0x006d
            r7 = 1
            goto L_0x006e
        L_0x006d:
            r7 = 0
        L_0x006e:
            if (r1 == 0) goto L_0x007d
            com.inmobi.media.fl$b r1 = com.inmobi.media.C5371hz.m12429a(r1)
            com.inmobi.media.fl$c r1 = r1.f12045w
            boolean r1 = r1.cwe
            if (r1 == 0) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r1 = 0
            goto L_0x007e
        L_0x007d:
            r1 = 1
        L_0x007e:
            if (r4 == 0) goto L_0x0089
            boolean r2 = r2.mo40742b()
            if (r2 == 0) goto L_0x0087
            goto L_0x0089
        L_0x0087:
            r2 = 0
            goto L_0x008a
        L_0x0089:
            r2 = 1
        L_0x008a:
            if (r7 == 0) goto L_0x0099
            com.inmobi.media.fl$b r4 = com.inmobi.media.C5371hz.m12429a(r4)
            com.inmobi.media.fl$c r4 = r4.f12045w
            boolean r4 = r4.cwe
            if (r4 == 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r4 = 0
            goto L_0x009a
        L_0x0099:
            r4 = 1
        L_0x009a:
            if (r1 == 0) goto L_0x00a2
            if (r2 == 0) goto L_0x00a2
            if (r4 == 0) goto L_0x00a2
            r1 = 1
            goto L_0x00a3
        L_0x00a2:
            r1 = 0
        L_0x00a3:
            r2 = 29
            if (r1 == 0) goto L_0x00e8
            boolean r1 = com.inmobi.media.C5314go.m12197a()
            if (r1 == 0) goto L_0x00cc
            android.content.Context r1 = com.inmobi.media.C5314go.m12203c()
            java.lang.String r4 = "android.permission.ACCESS_WIFI_STATE"
            boolean r1 = com.inmobi.media.C5329gy.m12278a(r1, r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 >= r2) goto L_0x00bc
            goto L_0x00cd
        L_0x00bc:
            android.content.Context r4 = com.inmobi.media.C5314go.m12203c()
            java.lang.String r7 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r4 = com.inmobi.media.C5329gy.m12278a(r4, r7)
            if (r1 == 0) goto L_0x00cc
            if (r4 == 0) goto L_0x00cc
            r1 = 1
            goto L_0x00cd
        L_0x00cc:
            r1 = 0
        L_0x00cd:
            if (r1 != 0) goto L_0x00d0
            goto L_0x00e8
        L_0x00d0:
            com.inmobi.media.C5371hz.m12430a()
            com.inmobi.media.fl$b r1 = com.inmobi.media.C5371hz.m12431d()
            com.inmobi.media.fl$c r1 = r1.f12045w
            int r1 = r1.f12046wf
            boolean r4 = com.inmobi.media.C5378ie.m12451a((int) r1)
            boolean r1 = com.inmobi.media.C5378ie.m12452a((int) r1, (int) r6)
            com.inmobi.media.id r1 = com.inmobi.media.C5378ie.m12450a((boolean) r4, (boolean) r1)
            goto L_0x00e9
        L_0x00e8:
            r1 = r3
        L_0x00e9:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            if (r1 == 0) goto L_0x00fb
            long r7 = r1.f12316a
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r7 = "c-ap-bssid"
            r4.put(r7, r1)
        L_0x00fb:
            r0.putAll(r4)
            java.util.Map r0 = r11.f12130i
            com.inmobi.media.C5371hz.m12430a()
            boolean r1 = com.inmobi.media.C5371hz.m12433f()
            if (r1 == 0) goto L_0x0110
            java.util.List r1 = com.inmobi.media.C5379if.m12457b()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            goto L_0x0111
        L_0x0110:
            r1 = r3
        L_0x0111:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            if (r1 == 0) goto L_0x0134
            int r7 = r1.size()
            if (r7 <= 0) goto L_0x0134
            int r7 = r1.size()
            int r7 = r7 - r6
            java.lang.Object r1 = r1.get(r7)
            com.inmobi.media.id r1 = (com.inmobi.media.C5377id) r1
            long r7 = r1.f12316a
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r7 = "v-ap-bssid"
            r4.put(r7, r1)
        L_0x0134:
            r0.putAll(r4)
            java.util.Map r0 = r11.f12130i
            com.inmobi.media.an r1 = r11.f11498w
            java.lang.String r1 = r1.mo40062a()
            java.util.Map r1 = com.inmobi.media.C5376ic.m12443a((java.lang.String) r1)
            r0.putAll(r1)
            java.util.Map r0 = r11.f12130i
            java.util.Map r1 = com.inmobi.media.C5376ic.m12442a()
            r0.putAll(r1)
            java.util.Map r0 = r11.f12130i
            java.util.Map r1 = com.inmobi.media.C5376ic.m12445b()
            r0.putAll(r1)
            java.util.Map r0 = r11.f12130i
            com.inmobi.media.fj r1 = r11.mo40617c()
            java.lang.String r1 = r1.ver
            java.lang.String r4 = "skdv"
            r0.put(r4, r1)
            java.util.Map r0 = r11.f12130i
            com.inmobi.media.ck r1 = r11.f11496e
            com.inmobi.media.fj r4 = r11.mo40617c()
            java.lang.String r4 = r4.f12042m
            com.inmobi.media.fj r7 = r11.mo40617c()
            java.lang.String r7 = r7.f12041e
            java.lang.String r1 = r1.mo40329a(r4, r7)
            java.lang.String r4 = "skdm"
            r0.put(r4, r1)
            java.lang.String r0 = r11.f11494c
            if (r0 == 0) goto L_0x018b
            java.util.Map r0 = r11.f12130i
            java.lang.String r1 = r11.f11494c
            java.lang.String r4 = "p-keywords"
            r0.put(r4, r1)
        L_0x018b:
            com.inmobi.media.an r0 = r11.f11498w
            java.lang.String r0 = r0.mo40080m()
            java.lang.String r1 = "M10N_CONTEXT_ACTIVITY"
            if (r0 == 0) goto L_0x01a5
            com.inmobi.media.an r0 = r11.f11498w
            java.lang.String r0 = r0.mo40080m()
            java.lang.String r4 = "others"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x01a5
            java.lang.String r1 = "M10N_CONTEXT_OTHER"
        L_0x01a5:
            java.util.Map r0 = r11.f12130i
            java.lang.String r4 = "m10n_context"
            r0.put(r4, r1)
            com.inmobi.media.an r0 = r11.f11498w
            java.util.Map r0 = r0.mo40067c()
            if (r0 == 0) goto L_0x01e8
            com.inmobi.media.an r0 = r11.f11498w
            java.util.Map r0 = r0.mo40067c()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x01c2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01e8
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.util.Map r4 = r11.f12130i
            java.lang.Object r7 = r1.getKey()
            boolean r4 = r4.containsKey(r7)
            if (r4 != 0) goto L_0x01c2
            java.util.Map r4 = r11.f12130i
            java.lang.Object r7 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r4.put(r7, r1)
            goto L_0x01c2
        L_0x01e8:
            java.util.Map<java.lang.String, java.lang.String> r0 = r11.f11495d
            if (r0 == 0) goto L_0x01f3
            java.util.Map r0 = r11.f12130i
            java.util.Map<java.lang.String, java.lang.String> r1 = r11.f11495d
            r0.putAll(r1)
        L_0x01f3:
            com.inmobi.media.an r0 = r11.f11498w
            long r0 = r0.mo40076i()
            r7 = -9223372036854775808
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0210
            java.util.Map r0 = r11.f12130i
            com.inmobi.media.an r1 = r11.f11498w
            long r9 = r1.mo40076i()
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r4 = "im-plid"
            r0.put(r4, r1)
        L_0x0210:
            com.inmobi.media.an r0 = r11.f11498w
            long r0 = r0.mo40074h()
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x022b
            java.util.Map r0 = r11.f12130i
            com.inmobi.media.an r1 = r11.f11498w
            long r9 = r1.mo40074h()
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r4 = "as-plid"
            r0.put(r4, r1)
        L_0x022b:
            java.util.Map r0 = r11.f12130i
            com.inmobi.media.an r1 = r11.f11498w
            java.lang.String r1 = r1.mo40064b()
            java.lang.String r4 = "int-origin"
            r0.put(r4, r1)
            java.lang.String r0 = r11.f12141t
            java.lang.String r1 = "signals"
            com.inmobi.media.ex r0 = com.inmobi.media.C5239ey.m11987a(r1, r0, r3)
            com.inmobi.media.fl r0 = (com.inmobi.media.C5266fl) r0
            org.json.JSONObject r0 = r0.ext
            if (r0 == 0) goto L_0x0257
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x0257
            java.util.Map r1 = r11.f12130i
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "im-ext"
            r1.put(r4, r0)
        L_0x0257:
            java.util.Map r0 = r11.f12130i
            com.inmobi.unification.sdk.model.ASRequestParams r1 = r11.f11497f
            if (r1 == 0) goto L_0x0263
            boolean r1 = r1.f12632d
            if (r1 == 0) goto L_0x0263
            r1 = 1
            goto L_0x0264
        L_0x0263:
            r1 = 0
        L_0x0264:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "has-dynamic-mediation"
            r0.put(r4, r1)
            com.inmobi.media.an r0 = r11.f11498w
            long r0 = r0.mo40074h()
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x028c
            com.inmobi.media.ig r0 = com.inmobi.media.C5384ii.m12471b()
            if (r0 == 0) goto L_0x0282
            java.lang.String r0 = r0.mo40747g()
            goto L_0x0283
        L_0x0282:
            r0 = r3
        L_0x0283:
            if (r0 == 0) goto L_0x028c
            java.util.Map r1 = r11.f12130i
            java.lang.String r4 = "as-ext"
            r1.put(r4, r0)
        L_0x028c:
            com.inmobi.unification.sdk.model.ASRequestParams r0 = r11.f11497f
            if (r0 == 0) goto L_0x02c1
            java.lang.String r0 = r0.f12630b
            if (r0 == 0) goto L_0x029f
            java.util.Map r0 = r11.f12130i
            com.inmobi.unification.sdk.model.ASRequestParams r1 = r11.f11497f
            java.lang.String r1 = r1.f12630b
            java.lang.String r4 = "a9_params"
            r0.put(r4, r1)
        L_0x029f:
            com.inmobi.unification.sdk.model.ASRequestParams r0 = r11.f11497f
            java.lang.String r0 = r0.f12629a
            if (r0 == 0) goto L_0x02b0
            java.util.Map r0 = r11.f12130i
            com.inmobi.unification.sdk.model.ASRequestParams r1 = r11.f11497f
            java.lang.String r1 = r1.f12629a
            java.lang.String r4 = "publisher_keys"
            r0.put(r4, r1)
        L_0x02b0:
            com.inmobi.unification.sdk.model.ASRequestParams r0 = r11.f11497f
            java.lang.String r0 = r0.f12631c
            if (r0 == 0) goto L_0x02c1
            java.util.Map r0 = r11.f12130i
            com.inmobi.unification.sdk.model.ASRequestParams r1 = r11.f11497f
            java.lang.String r1 = r1.f12631c
            java.lang.String r4 = "vc_user_id"
            r0.put(r4, r1)
        L_0x02c1:
            java.util.Map<java.lang.String, java.lang.String> r0 = f11491y
            if (r0 == 0) goto L_0x02c8
            r11.mo40614a((java.util.Map<java.lang.String, java.lang.String>) r0)
        L_0x02c8:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L_0x02d9
            java.lang.String r0 = com.inmobi.media.C5343hf.m12339d()
            if (r0 == 0) goto L_0x02d9
            java.util.Map r1 = r11.f12130i
            java.lang.String r2 = "d-device-gesture-margins"
            r1.put(r2, r0)
        L_0x02d9:
            java.util.Map r0 = r11.f12130i
            java.lang.String r1 = r11.f12141t
            java.lang.String r2 = "ads"
            com.inmobi.media.ex r1 = com.inmobi.media.C5239ey.m11987a(r2, r1, r3)
            com.inmobi.media.ev r1 = (com.inmobi.media.C5220ev) r1
            if (r1 == 0) goto L_0x02ed
            boolean r1 = r1.cctEnabled
            if (r1 == 0) goto L_0x02ed
            r1 = 1
            goto L_0x02ee
        L_0x02ed:
            r1 = 0
        L_0x02ee:
            if (r1 == 0) goto L_0x02fb
            android.content.Context r1 = com.inmobi.media.C5314go.m12203c()
            java.lang.String r1 = com.inmobi.media.C5296g.m12117a(r1)
            if (r1 == 0) goto L_0x02fb
            r5 = 1
        L_0x02fb:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "cct-enabled"
            r0.put(r2, r1)
            java.util.Map r0 = r11.f12130i
            java.util.HashMap r1 = com.inmobi.media.C5348hj.m12361c()
            r0.putAll(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5037bx.mo40207a():void");
    }
}
