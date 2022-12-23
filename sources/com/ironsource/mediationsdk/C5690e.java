package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import com.ironsource.environment.C5517c;
import com.ironsource.environment.C5527g;
import com.ironsource.environment.C5530i;
import com.ironsource.environment.C5532k;
import com.ironsource.environment.p134a.C5510b;
import com.ironsource.environment.p135b.C5516b;
import com.ironsource.mediationsdk.p137a.C5641c;
import com.ironsource.mediationsdk.p137a.C5645g;
import com.ironsource.mediationsdk.server.C5782b;
import com.ironsource.mediationsdk.utils.C5789b;
import com.ironsource.mediationsdk.utils.C5790c;
import com.ironsource.mediationsdk.utils.C5797g;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.e */
public final class C5690e {

    /* renamed from: a */
    private static C5690e f13545a = new C5690e();

    /* renamed from: com.ironsource.mediationsdk.e$a */
    public static class C5691a {

        /* renamed from: a */
        String f13546a;

        /* renamed from: b */
        List<C5782b> f13547b;

        /* renamed from: c */
        C5782b f13548c;

        /* renamed from: d */
        JSONObject f13549d;

        /* renamed from: e */
        int f13550e;

        /* renamed from: f */
        String f13551f;
    }

    /* renamed from: com.ironsource.mediationsdk.e$b */
    static class C5692b extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        private String f13552a;

        /* renamed from: b */
        private String f13553b;

        /* renamed from: c */
        private String f13554c;

        public C5692b(String str, String str2, String str3) {
            this.f13552a = str;
            this.f13553b = str2;
            this.f13554c = str3;
        }

        /* renamed from: a */
        private static Boolean m14016a(String... strArr) {
            try {
                boolean z = false;
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                httpURLConnection.disconnect();
                if (responseCode == 200) {
                    z = true;
                }
                return Boolean.valueOf(z);
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m14016a((String[]) objArr);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
                    jSONObject.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                    jSONObject.put(IronSourceConstants.EVENTS_EXT1, this.f13552a + ";" + this.f13553b + ";" + this.f13554c);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C5645g.m13810e().mo41689b(new C5641c(IronSourceConstants.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, jSONObject));
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.e$c */
    enum C5693c {
        ;
        

        /* renamed from: a */
        public static final int f13555a = 1;

        /* renamed from: b */
        public static final int f13556b = 2;

        static {
            f13557c = new int[]{1, 2};
        }
    }

    /* renamed from: a */
    static C5691a m13998a(JSONObject jSONObject) {
        String optString = jSONObject.optString(IronSourceConstants.EVENTS_AUCTION_ID);
        if (!TextUtils.isEmpty(optString)) {
            C5691a aVar = new C5691a();
            aVar.f13546a = optString;
            JSONObject jSONObject2 = null;
            if (jSONObject.has("settings")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("settings");
                aVar.f13548c = new C5782b(jSONObject3);
                if (jSONObject3.has("armData")) {
                    jSONObject2 = jSONObject3.optJSONObject("armData");
                }
                if (jSONObject3.has(IronSourceConstants.EVENTS_GENERIC_PARAMS)) {
                    aVar.f13549d = jSONObject3.optJSONObject(IronSourceConstants.EVENTS_GENERIC_PARAMS);
                }
            }
            aVar.f13547b = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("waterfall");
            int i = 0;
            while (i < jSONArray.length()) {
                C5782b bVar = new C5782b(jSONArray.getJSONObject(i), jSONObject2);
                if (bVar.mo42088g()) {
                    aVar.f13547b.add(bVar);
                    i++;
                } else {
                    aVar.f13550e = 1002;
                    aVar.f13551f = "waterfall " + i;
                    throw new JSONException("invalid response");
                }
            }
            return aVar;
        }
        throw new JSONException("Invalid auction response - auction id is missing");
    }

    /* renamed from: a */
    public static C5690e m13999a() {
        return f13545a;
    }

    /* renamed from: a */
    public static C5782b m14000a(String str, List<C5782b> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).mo42082a().equals(str)) {
                return list.get(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m14001a(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7) {
        return str.replace("${AUCTION_PRICE}", str4).replace("${AUCTION_LOSS}", str6).replace("${AUCTION_MBR}", str5).replace("${INSTANCE}", str2).replace("${INSTANCE_TYPE}", Integer.toString(i)).replace("${DYNAMIC_DEMAND_SOURCE}", str3).replace("${PLACEMENT_NAME}", str7);
    }

    /* renamed from: a */
    static JSONObject m14002a(String str) {
        try {
            return new JSONObject(IronSourceAES.decode(C5797g.m14321a().mo42123b(), str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static JSONObject m14003a(JSONObject jSONObject, List<String> list) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if (list.contains(next)) {
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject2;
    }

    /* renamed from: a */
    static void m14004a(String str, String str2, String str3) {
        new C5692b(str, str2, str3).execute(new String[]{str3});
    }

    /* renamed from: a */
    private void m14005a(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        if (jSONObject2 != null) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (jSONObject.has(next)) {
                    int i = 0;
                    str = next;
                    while (jSONObject.has(str)) {
                        i++;
                        str = next + "_" + i;
                    }
                } else {
                    str = next;
                }
                try {
                    jSONObject.put(str, jSONObject2.opt(next));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (((com.ironsource.environment.ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & 134217728) != 0) != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() != false) goto L_0x0034;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m14006b() {
        /*
            int r0 = com.ironsource.mediationsdk.C5690e.C5693c.f13556b
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0016
            android.security.NetworkSecurityPolicy r0 = android.security.NetworkSecurityPolicy.getInstance()
            boolean r0 = r0.isCleartextTrafficPermitted()
            if (r0 == 0) goto L_0x0013
            goto L_0x0034
        L_0x0013:
            int r0 = com.ironsource.mediationsdk.C5690e.C5693c.f13556b
            goto L_0x0036
        L_0x0016:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x0034
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r0 = r0.getApplicationContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.flags
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0031
            r0 = 1
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x0013
        L_0x0034:
            int r0 = com.ironsource.mediationsdk.C5690e.C5693c.f13555a
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5690e.m14006b():int");
    }

    /* renamed from: b */
    static String m14007b(JSONObject jSONObject) {
        return IronSourceAES.encode(C5797g.m14321a().mo42123b(), jSONObject.toString());
    }

    /* renamed from: b */
    public static Map<String, String> m14008b(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(NativeProtocol.WEB_DIALOG_PARAMS)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(NativeProtocol.WEB_DIALOG_PARAMS);
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject2.get(next);
                    if (obj instanceof String) {
                        hashMap.put(next, (String) obj);
                    }
                }
            }
        } catch (JSONException unused) {
        }
        return hashMap;
    }

    /* renamed from: b */
    private JSONObject m14009b(JSONObject jSONObject, List<String> list) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    HashMap<String, String> hashMap = C5532k.f12748b;
                    String str = hashMap.containsKey(next) ? hashMap.get(next) : next;
                    if ((list.isEmpty() && !C5532k.f12747a.contains(str) && !str.startsWith("metadata_")) || list.contains(str)) {
                        jSONObject2.put(str, jSONObject.opt(next));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject2;
    }

    /* renamed from: c */
    public static String m14010c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return jSONObject.has("adMarkup") ? jSONObject.getString("adMarkup") : str;
        } catch (JSONException unused) {
            return str;
        }
    }

    /* renamed from: d */
    public static String m14011d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has(NativeProtocol.WEB_DIALOG_PARAMS)) {
                return "";
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(NativeProtocol.WEB_DIALOG_PARAMS);
            return jSONObject2.has(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID) ? jSONObject2.getString(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID) : "";
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: a */
    public final String mo41844a(String str, int i, C5782b bVar, String str2, String str3, String str4) {
        String str5;
        String c = bVar.mo42084c();
        if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(str2)) {
            double parseDouble = Double.parseDouble(c);
            double parseDouble2 = Double.parseDouble(str2);
            if (parseDouble2 != 0.0d) {
                str5 = String.valueOf(((double) Math.round((parseDouble / parseDouble2) * 1000.0d)) / 1000.0d);
                return m14001a(str, bVar.mo42082a(), i, m14011d(bVar.mo42083b()), c, str5, str3, str4);
            }
        }
        str5 = "";
        return m14001a(str, bVar.mo42082a(), i, m14011d(bVar.mo42083b()), c, str5, str3, str4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONObject mo41845a(Context context, Map<String, Object> map, List<String> list, C5697h hVar, int i, String str, C5789b bVar, ISBannerSize iSBannerSize) {
        String str2;
        String str3;
        C5697h hVar2 = hVar;
        JSONObject jSONObject = new JSONObject();
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            str2 = "";
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(IronSourceConstants.EVENTS_INSTANCE_TYPE, 2);
            Map<String, Object> map2 = map;
            jSONObject2.put("biddingAdditionalData", new JSONObject((Map) map.get(next)));
            if (hVar2 != null) {
                str2 = hVar.mo41854a(next);
            }
            jSONObject2.put("performance", str2);
            jSONObject.put(next, jSONObject2);
        }
        if (list != null) {
            for (String next2 : list) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(IronSourceConstants.EVENTS_INSTANCE_TYPE, 1);
                jSONObject3.put("performance", hVar2 != null ? hVar.mo41854a(next2) : str2);
                jSONObject.put(next2, jSONObject3);
            }
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = C5685c.m13965a().f13532c;
        concurrentHashMap.putAll(C5790c.m14278a().mo42115d());
        JSONObject jSONObject4 = new JSONObject();
        for (Map.Entry next3 : concurrentHashMap.entrySet()) {
            jSONObject4.put((String) next3.getKey(), TextUtils.join(",", (Iterable) next3.getValue()));
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("applicationUserId", C5556E.m13257a().f12855k);
        Boolean bool = C5556E.m13257a().f12868x;
        if (bool != null) {
            jSONObject5.put("consent", bool.booleanValue() ? 1 : 0);
        }
        jSONObject5.put("mobileCarrier", C5527g.m13155j(context));
        jSONObject5.put("connectionType", IronSourceUtils.getConnectionType(context));
        jSONObject5.put("deviceOS", "android");
        jSONObject5.put("deviceWidth", context.getResources().getConfiguration().screenWidthDp);
        jSONObject5.put("deviceHeight", context.getResources().getConfiguration().screenHeightDp);
        jSONObject5.put("deviceOSVersion", Build.VERSION.SDK_INT + "(" + Build.VERSION.RELEASE + ")");
        jSONObject5.put("deviceModel", Build.MODEL);
        jSONObject5.put("deviceMake", Build.MANUFACTURER);
        jSONObject5.put("bundleId", context.getPackageName());
        Context context2 = context;
        jSONObject5.put("appVersion", C5517c.m13106c(context, context.getPackageName()));
        jSONObject5.put("clientTimestamp", new Date().getTime());
        jSONObject5.put("fs", IronSourceUtils.getFirstSession(context) ? 1 : 0);
        jSONObject5.put("browserUserAgent", C5527g.m13171r());
        jSONObject5.put("deviceType", IronSourceUtils.getDeviceType(context));
        jSONObject5.put("deviceLang", Locale.getDefault().getLanguage());
        jSONObject5.put("secure", m14006b() - 1);
        if (iSBannerSize != null) {
            jSONObject5.put("bannerSize", iSBannerSize.getDescription());
            jSONObject5.put("bannerWidth", iSBannerSize.getWidth());
            jSONObject5.put("bannerHeight", iSBannerSize.getHeight());
        }
        boolean z = false;
        try {
            String[] a = C5527g.m13136a(context);
            str3 = !TextUtils.isEmpty(a[0]) ? a[0] : str2;
            try {
                z = Boolean.valueOf(a[1]).booleanValue();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            str2 = IronSourceConstants.TYPE_GAID;
        } else {
            str3 = C5527g.m13180y(context);
            if (!TextUtils.isEmpty(str3)) {
                str2 = IronSourceConstants.TYPE_UUID;
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            jSONObject5.put("advId", str3);
            jSONObject5.put("advIdType", str2);
            jSONObject5.put("isLimitAdTrackingEnabled", z ? "true" : "false");
        }
        String z2 = C5527g.m13181z(context);
        if (!TextUtils.isEmpty(z2)) {
            jSONObject5.put("auid", z2);
        }
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("applicationKey", C5556E.m13257a().f12854j);
        jSONObject6.put("SDKVersion", IronSourceUtils.getSDKVersion());
        jSONObject6.put("clientParams", jSONObject5);
        int i2 = i;
        jSONObject6.put(IronSourceConstants.KEY_SESSION_DEPTH, i);
        jSONObject6.put("sessionId", str);
        jSONObject6.put("instances", jSONObject);
        jSONObject6.put("auctionData", bVar.f13915c);
        jSONObject6.put("metaData", jSONObject4);
        return jSONObject6;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONObject mo41846a(String str, boolean z, Map<String, Object> map, List<String> list, C5697h hVar, int i, ISBannerSize iSBannerSize) {
        String str2;
        C5697h hVar2 = hVar;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            str2 = "";
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("instp", 2);
            Map<String, Object> map2 = map;
            jSONObject3.put("badt", new JSONObject((Map) map.get(next)));
            if (hVar2 != null) {
                str2 = hVar2.mo41854a(next);
            }
            jSONObject3.put("prfm", str2);
            jSONObject2.put(next, jSONObject3);
        }
        if (list != null) {
            for (String next2 : list) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("instp", 1);
                jSONObject4.put("prfm", hVar2 != null ? hVar2.mo41854a(next2) : str2);
                jSONObject2.put(next2, jSONObject4);
            }
        }
        jSONObject.put("inst", jSONObject2);
        JSONObject a = C5530i.m13183a(new C5510b().f12710a);
        Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        JSONObject a2 = C5516b.m13098a(a.optJSONObject("md"));
        if (a2 != null) {
            a.put("md", a2);
        }
        a.put("sd", i);
        a.put("scr", m14006b() - 1);
        jSONObject.put("ctdt", a);
        if (iSBannerSize != null) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("bns", iSBannerSize.getDescription());
            jSONObject5.put("bnw", iSBannerSize.getWidth());
            jSONObject5.put("bnh", iSBannerSize.getHeight());
            jSONObject.put("bndt", jSONObject5);
        }
        String str3 = str;
        jSONObject.put("adu", str);
        jSONObject.put("dner", z ^ true ? 1 : 0);
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONObject mo41847a(JSONObject jSONObject, JSONObject jSONObject2, List<String> list) {
        C5650ac a = C5650ac.m13819a();
        a.mo41713a(C5650ac.m13824c());
        a.mo41713a(C5650ac.m13823b());
        JSONObject a2 = m14003a(a.f13357a, list.isEmpty() ? C5532k.f12747a : list);
        m14005a(a2, m14009b(jSONObject, list));
        if (!list.isEmpty()) {
            jSONObject2 = m14003a(jSONObject2, list);
        }
        m14005a(a2, jSONObject2);
        return a2;
    }
}
