package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.internal.referrer.Payload;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C5725i;
import com.ironsource.mediationsdk.model.C5729m;
import com.ironsource.mediationsdk.model.C5731n;
import com.ironsource.mediationsdk.model.C5732o;
import com.ironsource.mediationsdk.model.C5733p;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.p243my.tracker.ads.AdFormat;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.model.ReportDBAdapter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.utils.j */
public final class C5800j {

    /* renamed from: A */
    private final String f13985A = "adUnits";

    /* renamed from: B */
    private final String f13986B = "providerLoadName";

    /* renamed from: C */
    private final String f13987C = "application";

    /* renamed from: D */
    private final String f13988D = "rewardedVideo";

    /* renamed from: E */
    private final String f13989E = "interstitial";

    /* renamed from: F */
    private final String f13990F = "offerwall";

    /* renamed from: G */
    private final String f13991G = AdFormat.BANNER;

    /* renamed from: H */
    private final String f13992H = "integration";

    /* renamed from: I */
    private final String f13993I = "loggers";

    /* renamed from: J */
    private final String f13994J = "segment";

    /* renamed from: K */
    private final String f13995K = "events";

    /* renamed from: L */
    private final String f13996L = "crashReporter";

    /* renamed from: M */
    private final String f13997M = "token";

    /* renamed from: N */
    private final String f13998N = "external";

    /* renamed from: O */
    private final String f13999O = "mediationTypes";

    /* renamed from: P */
    private final String f14000P = "providerDefaultInstance";

    /* renamed from: Q */
    private final String f14001Q = "settings";

    /* renamed from: R */
    private final String f14002R = "maxNumOfAdaptersToLoadOnStart";

    /* renamed from: S */
    private final String f14003S = "advancedLoading";

    /* renamed from: T */
    private final String f14004T = "adapterTimeOutInSeconds";

    /* renamed from: U */
    private final String f14005U = "atim";

    /* renamed from: V */
    private final String f14006V = "bannerInterval";

    /* renamed from: W */
    private final String f14007W = "loadRVInterval";

    /* renamed from: X */
    private final String f14008X = "expiredDurationInMinutes";

    /* renamed from: Y */
    private final String f14009Y = "server";

    /* renamed from: Z */
    private final String f14010Z = "publisher";

    /* renamed from: a */
    public C5732o f14011a;

    /* renamed from: aA */
    private final String f14012aA = "backFill";

    /* renamed from: aB */
    private final String f14013aB = "premium";

    /* renamed from: aC */
    private final String f14014aC = "uuidEnabled";

    /* renamed from: aD */
    private final String f14015aD = "abt";

    /* renamed from: aE */
    private final String f14016aE = "delayLoadFailure";

    /* renamed from: aF */
    private final String f14017aF = "keysToInclude";

    /* renamed from: aG */
    private final String f14018aG = "reporterURL";

    /* renamed from: aH */
    private final String f14019aH = "reporterKeyword";

    /* renamed from: aI */
    private final String f14020aI = "includeANR";

    /* renamed from: aJ */
    private final String f14021aJ = "timeout";

    /* renamed from: aK */
    private final String f14022aK = "setIgnoreDebugger";

    /* renamed from: aL */
    private final String f14023aL = "adSourceName";

    /* renamed from: aM */
    private final String f14024aM = "spId";

    /* renamed from: aN */
    private final String f14025aN = "mpis";

    /* renamed from: aO */
    private final String f14026aO = "auction";

    /* renamed from: aP */
    private final String f14027aP = "auctionData";

    /* renamed from: aQ */
    private final String f14028aQ = "auctioneerURL";

    /* renamed from: aR */
    private final String f14029aR = IronSourceConstants.EVENTS_PROGRAMMATIC;

    /* renamed from: aS */
    private final String f14030aS = "objectPerWaterfall";

    /* renamed from: aT */
    private final String f14031aT = "minTimeBeforeFirstAuction";

    /* renamed from: aU */
    private final String f14032aU = "timeToWaitBeforeAuction";

    /* renamed from: aV */
    private final String f14033aV = "timeToWaitBeforeLoad";

    /* renamed from: aW */
    private final String f14034aW = "auctionRetryInterval";

    /* renamed from: aX */
    private final String f14035aX = "isAuctionOnShowStart";

    /* renamed from: aY */
    private final String f14036aY = "isLoadWhileShow";

    /* renamed from: aZ */
    private final String f14037aZ = IronSourceConstants.AUCTION_TRIALS;

    /* renamed from: aa */
    private final String f14038aa = "console";

    /* renamed from: ab */
    private final String f14039ab = "sendUltraEvents";

    /* renamed from: ac */
    private final String f14040ac = "sendEventsToggle";

    /* renamed from: ad */
    private final String f14041ad = "eventsCompression";

    /* renamed from: ae */
    private final String f14042ae = "serverEventsURL";

    /* renamed from: af */
    private final String f14043af = "serverEventsType";

    /* renamed from: ag */
    private final String f14044ag = "backupThreshold";

    /* renamed from: ah */
    private final String f14045ah = "maxNumberOfEvents";

    /* renamed from: ai */
    private final String f14046ai = "maxEventsPerBatch";

    /* renamed from: aj */
    private final String f14047aj = "optOut";

    /* renamed from: ak */
    private final String f14048ak = "optIn";

    /* renamed from: al */
    private final String f14049al = "triggerEvents";

    /* renamed from: am */
    private final String f14050am = "nonConnectivityEvents";

    /* renamed from: an */
    private final String f14051an = "placements";

    /* renamed from: ao */
    private final String f14052ao = ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID;

    /* renamed from: ap */
    private final String f14053ap = "placementName";

    /* renamed from: aq */
    private final String f14054aq = MediaFile.DELIVERY;

    /* renamed from: ar */
    private final String f14055ar = "isDefault";

    /* renamed from: as */
    private final String f14056as = "capping";

    /* renamed from: at */
    private final String f14057at = "pacing";

    /* renamed from: au */
    private final String f14058au = TJAdUnitConstants.String.ENABLED;

    /* renamed from: av */
    private final String f14059av = "maxImpressions";

    /* renamed from: aw */
    private final String f14060aw = "numOfSeconds";

    /* renamed from: ax */
    private final String f14061ax = "unit";

    /* renamed from: ay */
    private final String f14062ay = "virtualItemName";

    /* renamed from: az */
    private final String f14063az = "virtualItemCount";

    /* renamed from: b */
    public C5733p f14064b;

    /* renamed from: ba */
    private final String f14065ba = "auctionTimeout";

    /* renamed from: bb */
    private final String f14066bb = "auctionSavedHistory";

    /* renamed from: bc */
    private final String f14067bc = "disableLoadWhileShowSupportFor";

    /* renamed from: bd */
    private final String f14068bd = "timeToDeleteOldWaterfallAfterAuction";

    /* renamed from: be */
    private final String f14069be = "compressAuctionRequest";

    /* renamed from: bf */
    private final String f14070bf = "compressAuctionResponse";

    /* renamed from: bg */
    private final String f14071bg = "encryptionVersion";

    /* renamed from: bh */
    private final String f14072bh = "shouldSendBannerBURLFromImpression";

    /* renamed from: bi */
    private final String f14073bi = "optInKeys";

    /* renamed from: bj */
    private final String f14074bj = "tokenGenericParams";

    /* renamed from: bk */
    private final String f14075bk = "oneToken";

    /* renamed from: bl */
    private final String f14076bl = "compressToken";

    /* renamed from: bm */
    private final String f14077bm = "isExternalArmEventsEnabled";

    /* renamed from: bn */
    private final String f14078bn = "externalArmEventsUrl";

    /* renamed from: bo */
    private final String f14079bo = "compressExternalToken";

    /* renamed from: bp */
    private String f14080bp;

    /* renamed from: bq */
    private String f14081bq;

    /* renamed from: br */
    private Context f14082br;

    /* renamed from: c */
    public C5725i f14083c;

    /* renamed from: d */
    public JSONObject f14084d;

    /* renamed from: e */
    private final String f14085e = "error";

    /* renamed from: f */
    private final int f14086f = 3;

    /* renamed from: g */
    private final int f14087g = 2;

    /* renamed from: h */
    private final int f14088h = 60;

    /* renamed from: i */
    private final int f14089i = 10000;

    /* renamed from: j */
    private final int f14090j = 5000;

    /* renamed from: k */
    private final int f14091k = ErrorCode.GENERAL_WRAPPER_ERROR;

    /* renamed from: l */
    private final int f14092l = 3;

    /* renamed from: m */
    private final int f14093m = 3;

    /* renamed from: n */
    private final int f14094n = 2;

    /* renamed from: o */
    private final int f14095o = 15;

    /* renamed from: p */
    private final long f14096p = TapjoyConstants.TIMER_INCREMENT;

    /* renamed from: q */
    private final int f14097q = 0;

    /* renamed from: r */
    private final boolean f14098r = false;

    /* renamed from: s */
    private final int f14099s = 30000;

    /* renamed from: t */
    private final int f14100t = -1;

    /* renamed from: u */
    private final int f14101u = 5000;

    /* renamed from: v */
    private final int f14102v = 1;

    /* renamed from: w */
    private final String f14103w = "providerOrder";

    /* renamed from: x */
    private final String f14104x = "providerSettings";

    /* renamed from: y */
    private final String f14105y = TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS;

    /* renamed from: z */
    private final String f14106z = IronSourceConstants.EVENTS_GENERIC_PARAMS;

    public C5800j(Context context, String str, String str2, String str3) {
        this.f14082br = context;
        try {
            this.f14084d = TextUtils.isEmpty(str3) ? new JSONObject() : new JSONObject(str3);
            m14348g();
            m14349h();
            m14347f();
            this.f14080bp = TextUtils.isEmpty(str) ? "" : str;
            this.f14081bq = TextUtils.isEmpty(str2) ? "" : str2;
        } catch (JSONException e) {
            e.printStackTrace();
            m14345d();
        }
    }

    public C5800j(C5800j jVar) {
        try {
            this.f14082br = jVar.f14082br;
            this.f14084d = new JSONObject(jVar.f14084d.toString());
            this.f14080bp = jVar.f14080bp;
            this.f14081bq = jVar.f14081bq;
            this.f14011a = jVar.f14011a;
            this.f14064b = jVar.f14064b;
            this.f14083c = jVar.f14083c;
        } catch (Exception unused) {
            m14345d();
        }
    }

    /* renamed from: a */
    private static int m14342a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i) {
        int i2 = 0;
        if (jSONObject.has(str)) {
            i2 = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            i2 = jSONObject2.optInt(str, 0);
        }
        return i2 == 0 ? i : i2;
    }

    /* renamed from: a */
    private static C5729m m14343a(JSONObject jSONObject) {
        C5731n nVar = null;
        if (jSONObject == null) {
            return null;
        }
        C5729m.C5730a aVar = new C5729m.C5730a();
        boolean z = true;
        aVar.f13772a = jSONObject.optBoolean(MediaFile.DELIVERY, true);
        JSONObject optJSONObject = jSONObject.optJSONObject("capping");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("unit");
            if (!TextUtils.isEmpty(optString)) {
                if (C5731n.PER_DAY.toString().equals(optString)) {
                    nVar = C5731n.PER_DAY;
                } else if (C5731n.PER_HOUR.toString().equals(optString)) {
                    nVar = C5731n.PER_HOUR;
                }
            }
            int optInt = optJSONObject.optInt("maxImpressions", 0);
            aVar.mo41982a(optJSONObject.optBoolean(TJAdUnitConstants.String.ENABLED, false) && optInt > 0, nVar, optInt);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("pacing");
        if (optJSONObject2 != null) {
            int optInt2 = optJSONObject2.optInt("numOfSeconds", 0);
            if (!optJSONObject2.optBoolean(TJAdUnitConstants.String.ENABLED, false) || optInt2 <= 0) {
                z = false;
            }
            aVar.mo41981a(z, optInt2);
        }
        return aVar.mo41983a();
    }

    /* renamed from: a */
    private static JSONObject m14344a(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    /* renamed from: d */
    private void m14345d() {
        this.f14084d = new JSONObject();
        this.f14080bp = "";
        this.f14081bq = "";
        this.f14011a = new C5732o();
        this.f14064b = C5733p.m14114a();
        this.f14083c = new C5725i();
    }

    /* renamed from: e */
    private boolean m14346e() {
        JSONObject a = m14344a(m14344a(this.f14084d, TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS), "adUnits");
        JSONArray names = a.names();
        if (names == null) {
            return false;
        }
        for (int i = 0; i < names.length(); i++) {
            JSONArray optJSONArray = m14344a(a, names.optString(i)).optJSONArray("placements");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    private void m14347f() {
        try {
            JSONObject a = m14344a(this.f14084d, "providerOrder");
            JSONArray optJSONArray = a.optJSONArray("rewardedVideo");
            JSONArray optJSONArray2 = a.optJSONArray("interstitial");
            JSONArray optJSONArray3 = a.optJSONArray(AdFormat.BANNER);
            this.f14011a = new C5732o();
            if (!(optJSONArray == null || this.f14083c == null || this.f14083c.f13744a == null)) {
                String str = this.f14083c.f13744a.f13796f;
                String str2 = this.f14083c.f13744a.f13797g;
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (optString.equals(str)) {
                        this.f14011a.f13783b = str;
                    } else {
                        if (optString.equals(str2)) {
                            this.f14011a.f13784c = str2;
                        }
                        C5732o oVar = this.f14011a;
                        if (!TextUtils.isEmpty(optString)) {
                            oVar.f13782a.add(optString);
                        }
                        NetworkSettings a2 = C5733p.m14114a().mo41985a(optString);
                        if (a2 != null) {
                            a2.setRewardedVideoPriority(i);
                        }
                    }
                }
            }
            if (!(optJSONArray2 == null || this.f14083c == null || this.f14083c.f13745b == null)) {
                String str3 = this.f14083c.f13745b.f13755g;
                String str4 = this.f14083c.f13745b.f13756h;
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    String optString2 = optJSONArray2.optString(i2);
                    if (optString2.equals(str3)) {
                        this.f14011a.f13787f = str3;
                    } else {
                        if (optString2.equals(str4)) {
                            this.f14011a.f13788g = str4;
                        }
                        C5732o oVar2 = this.f14011a;
                        if (!TextUtils.isEmpty(optString2)) {
                            oVar2.f13785d.add(optString2);
                        }
                        NetworkSettings a3 = C5733p.m14114a().mo41985a(optString2);
                        if (a3 != null) {
                            a3.setInterstitialPriority(i2);
                        }
                    }
                }
            }
            if (optJSONArray3 != null) {
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    String optString3 = optJSONArray3.optString(i3);
                    C5732o oVar3 = this.f14011a;
                    if (!TextUtils.isEmpty(optString3)) {
                        oVar3.f13786e.add(optString3);
                    }
                    NetworkSettings a4 = C5733p.m14114a().mo41985a(optString3);
                    if (a4 != null) {
                        a4.setBannerPriority(i3);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e2 A[Catch:{ Exception -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0132 A[Catch:{ Exception -> 0x015c }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14348g() {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "Mediation"
            com.ironsource.mediationsdk.model.p r2 = com.ironsource.mediationsdk.model.C5733p.m14114a()     // Catch:{ Exception -> 0x015c }
            r1.f14064b = r2     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r2 = r1.f14084d     // Catch:{ Exception -> 0x015c }
            java.lang.String r3 = "providerSettings"
            org.json.JSONObject r2 = m14344a(r2, r3)     // Catch:{ Exception -> 0x015c }
            java.util.Iterator r3 = r2.keys()     // Catch:{ Exception -> 0x015c }
        L_0x0016:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x015c }
            if (r4 == 0) goto L_0x0156
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x015c }
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r4 = r2.optJSONObject(r6)     // Catch:{ Exception -> 0x015c }
            if (r4 == 0) goto L_0x014c
            java.lang.String r5 = "mpis"
            r7 = 0
            boolean r13 = r4.optBoolean(r5, r7)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "spId"
            java.lang.String r8 = "0"
            java.lang.String r14 = r4.optString(r5, r8)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "adSourceName"
            r8 = 0
            java.lang.String r15 = r4.optString(r5, r8)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "providerLoadName"
            java.lang.String r8 = r4.optString(r5, r6)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "providerDefaultInstance"
            java.lang.String r9 = r4.optString(r5, r8)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "adUnits"
            org.json.JSONObject r5 = m14344a(r4, r5)     // Catch:{ Exception -> 0x015c }
            java.lang.String r10 = "application"
            org.json.JSONObject r4 = m14344a(r4, r10)     // Catch:{ Exception -> 0x015c }
            java.lang.String r10 = "rewardedVideo"
            org.json.JSONObject r10 = m14344a(r5, r10)     // Catch:{ Exception -> 0x015c }
            java.lang.String r11 = "interstitial"
            org.json.JSONObject r11 = m14344a(r5, r11)     // Catch:{ Exception -> 0x015c }
            java.lang.String r12 = "banner"
            org.json.JSONObject r5 = m14344a(r5, r12)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r10, r4)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r11 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r11, r4)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r12 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r5, r4)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.p r5 = r1.f14064b     // Catch:{ Exception -> 0x015c }
            boolean r5 = r5.mo41988b(r6)     // Catch:{ Exception -> 0x015c }
            if (r5 == 0) goto L_0x00af
            com.ironsource.mediationsdk.model.p r4 = r1.f14064b     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.NetworkSettings r4 = r4.mo41985a((java.lang.String) r6)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = r4.getRewardedVideoSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r6 = r4.getInterstitialSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r7 = r4.getBannerSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r5, r10)     // Catch:{ Exception -> 0x015c }
            r4.setRewardedVideoSettings(r5)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r6, r11)     // Catch:{ Exception -> 0x015c }
            r4.setInterstitialSettings(r5)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r7, r12)     // Catch:{ Exception -> 0x015c }
            r4.setBannerSettings(r5)     // Catch:{ Exception -> 0x015c }
            r4.setIsMultipleInstances(r13)     // Catch:{ Exception -> 0x015c }
            r4.setSubProviderId(r14)     // Catch:{ Exception -> 0x015c }
            r4.setAdSourceNameForEvents(r15)     // Catch:{ Exception -> 0x015c }
            goto L_0x0016
        L_0x00af:
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = r8.toLowerCase(r5)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.p r7 = r1.f14064b     // Catch:{ Exception -> 0x015c }
            boolean r7 = r7.mo41988b(r0)     // Catch:{ Exception -> 0x015c }
            if (r7 == 0) goto L_0x00dd
            java.lang.String r7 = "SupersonicAds"
            r17 = r2
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x015c }
            java.lang.String r2 = r7.toLowerCase(r2)     // Catch:{ Exception -> 0x015c }
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x015c }
            if (r2 != 0) goto L_0x00db
            java.lang.String r2 = "IronSource"
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x015c }
            java.lang.String r2 = r2.toLowerCase(r7)     // Catch:{ Exception -> 0x015c }
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x015c }
            if (r2 == 0) goto L_0x00df
        L_0x00db:
            r7 = 1
            goto L_0x00e0
        L_0x00dd:
            r17 = r2
        L_0x00df:
            r7 = 0
        L_0x00e0:
            if (r7 == 0) goto L_0x0132
            com.ironsource.mediationsdk.model.p r2 = r1.f14064b     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.NetworkSettings r2 = r2.mo41985a((java.lang.String) r0)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = r2.getRewardedVideoSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r7 = r2.getInterstitialSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r2 = r2.getBannerSettings()     // Catch:{ Exception -> 0x015c }
            r16 = r0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x015c }
            r0.<init>(r5)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x015c }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x015c }
            r5.<init>(r7)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x015c }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x015c }
            r7.<init>(r2)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r0, r10)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r11 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r5, r11)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r12 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r7, r12)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.NetworkSettings r0 = new com.ironsource.mediationsdk.model.NetworkSettings     // Catch:{ Exception -> 0x015c }
            r5 = r0
            r7 = r8
            r8 = r9
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x015c }
            r0.setIsMultipleInstances(r13)     // Catch:{ Exception -> 0x015c }
            r0.setSubProviderId(r14)     // Catch:{ Exception -> 0x015c }
            r0.setAdSourceNameForEvents(r15)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.p r2 = r1.f14064b     // Catch:{ Exception -> 0x015c }
            goto L_0x0148
        L_0x0132:
            r16 = r0
            com.ironsource.mediationsdk.model.NetworkSettings r0 = new com.ironsource.mediationsdk.model.NetworkSettings     // Catch:{ Exception -> 0x015c }
            r5 = r0
            r7 = r8
            r8 = r9
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x015c }
            r0.setIsMultipleInstances(r13)     // Catch:{ Exception -> 0x015c }
            r0.setSubProviderId(r14)     // Catch:{ Exception -> 0x015c }
            r0.setAdSourceNameForEvents(r15)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.p r2 = r1.f14064b     // Catch:{ Exception -> 0x015c }
        L_0x0148:
            r2.mo41986a((com.ironsource.mediationsdk.model.NetworkSettings) r0)     // Catch:{ Exception -> 0x015c }
            goto L_0x0150
        L_0x014c:
            r16 = r0
            r17 = r2
        L_0x0150:
            r0 = r16
            r2 = r17
            goto L_0x0016
        L_0x0156:
            com.ironsource.mediationsdk.model.p r0 = r1.f14064b     // Catch:{ Exception -> 0x015c }
            r0.mo41987b()     // Catch:{ Exception -> 0x015c }
            return
        L_0x015c:
            r0 = move-exception
            r0.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C5800j.m14348g():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:164:0x0553 A[Catch:{ Exception -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x079d A[Catch:{ Exception -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x08da A[Catch:{ Exception -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0315 A[Catch:{ Exception -> 0x0586 }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14349h() {
        /*
            r86 = this;
            r1 = r86
            java.lang.String r2 = "events"
            org.json.JSONObject r3 = r1.f14084d     // Catch:{ Exception -> 0x0a81 }
            java.lang.String r4 = "configurations"
            org.json.JSONObject r3 = m14344a(r3, r4)     // Catch:{ Exception -> 0x0a81 }
            java.lang.String r4 = "adUnits"
            org.json.JSONObject r4 = m14344a(r3, r4)     // Catch:{ Exception -> 0x0a81 }
            java.lang.String r5 = "application"
            org.json.JSONObject r3 = m14344a(r3, r5)     // Catch:{ Exception -> 0x0a81 }
            java.lang.String r5 = "rewardedVideo"
            org.json.JSONObject r5 = m14344a(r4, r5)     // Catch:{ Exception -> 0x0a81 }
            java.lang.String r6 = "interstitial"
            org.json.JSONObject r6 = m14344a(r4, r6)     // Catch:{ Exception -> 0x0a81 }
            java.lang.String r7 = "offerwall"
            org.json.JSONObject r7 = m14344a(r4, r7)     // Catch:{ Exception -> 0x0a81 }
            java.lang.String r8 = "banner"
            org.json.JSONObject r4 = m14344a(r4, r8)     // Catch:{ Exception -> 0x0a81 }
            org.json.JSONObject r8 = m14344a(r3, r2)     // Catch:{ Exception -> 0x0a81 }
            java.lang.String r9 = "loggers"
            org.json.JSONObject r9 = m14344a(r3, r9)     // Catch:{ Exception -> 0x0a81 }
            java.lang.String r10 = "token"
            org.json.JSONObject r10 = m14344a(r3, r10)     // Catch:{ Exception -> 0x0a81 }
            java.lang.String r11 = "segment"
            org.json.JSONObject r11 = m14344a(r3, r11)     // Catch:{ Exception -> 0x0a81 }
            java.lang.String r12 = "auction"
            org.json.JSONObject r12 = m14344a(r3, r12)     // Catch:{ Exception -> 0x0a81 }
            java.lang.String r13 = "crashReporter"
            org.json.JSONObject r13 = m14344a(r3, r13)     // Catch:{ Exception -> 0x0a81 }
            java.lang.String r14 = "settings"
            org.json.JSONObject r14 = m14344a(r3, r14)     // Catch:{ Exception -> 0x0a81 }
            java.lang.String r15 = "external"
            org.json.JSONObject r15 = m14344a(r3, r15)     // Catch:{ Exception -> 0x0a81 }
            r16 = r15
            r15 = 1
            if (r3 == 0) goto L_0x0075
            r17 = r14
            java.lang.String r14 = "uuidEnabled"
            boolean r14 = r3.optBoolean(r14, r15)     // Catch:{ Exception -> 0x0a81 }
            android.content.Context r15 = r1.f14082br     // Catch:{ Exception -> 0x0a81 }
            r18 = r11
            java.lang.String r11 = "uuidEnabled"
            com.ironsource.mediationsdk.utils.IronSourceUtils.saveBooleanToSharedPrefs(r15, r11, r14)     // Catch:{ Exception -> 0x0a81 }
            goto L_0x0079
        L_0x0075:
            r18 = r11
            r17 = r14
        L_0x0079:
            if (r8 == 0) goto L_0x0093
            java.lang.String r11 = "abt"
            java.lang.String r11 = r8.optString(r11)     // Catch:{ Exception -> 0x0a81 }
            boolean r14 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x0a81 }
            if (r14 != 0) goto L_0x0093
            com.ironsource.mediationsdk.a.d r14 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ Exception -> 0x0a81 }
            r14.f13313p = r11     // Catch:{ Exception -> 0x0a81 }
            com.ironsource.mediationsdk.a.g r14 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ Exception -> 0x0a81 }
            r14.f13313p = r11     // Catch:{ Exception -> 0x0a81 }
        L_0x0093:
            java.lang.String r11 = "auctionData"
            java.lang.String r14 = "optIn"
            java.lang.String r15 = "optOut"
            r19 = r13
            java.lang.String r13 = "maxEventsPerBatch"
            r20 = r9
            java.lang.String r9 = "maxNumberOfEvents"
            r21 = r10
            java.lang.String r10 = "backupThreshold"
            r22 = r6
            r23 = r7
            java.lang.String r6 = "serverEventsType"
            java.lang.String r7 = "serverEventsURL"
            r25 = r4
            java.lang.String r4 = "eventsCompression"
            java.lang.String r1 = "sendEventsToggle"
            r26 = r11
            java.lang.String r11 = "placements"
            r27 = r12
            java.lang.String r12 = ""
            r28 = 0
            r29 = r14
            if (r5 == 0) goto L_0x0347
            org.json.JSONArray r14 = r5.optJSONArray(r11)     // Catch:{ Exception -> 0x0342 }
            r30 = r11
            org.json.JSONObject r11 = m14344a(r5, r2)     // Catch:{ Exception -> 0x0342 }
            r31 = r2
            java.lang.String r2 = "maxNumOfAdaptersToLoadOnStart"
            r32 = r14
            r14 = 2
            int r2 = m14342a(r5, r3, r2, r14)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r14 = "advancedLoading"
            r33 = r2
            r2 = 0
            int r14 = m14342a(r5, r3, r14, r2)     // Catch:{ Exception -> 0x0342 }
            if (r14 <= 0) goto L_0x00e6
            r35 = r14
            r36 = 1
            goto L_0x00ea
        L_0x00e6:
            r35 = r33
            r36 = 0
        L_0x00ea:
            java.lang.String r2 = "adapterTimeOutInSeconds"
            r14 = 60
            int r37 = m14342a(r5, r3, r2, r14)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r2 = "loadRVInterval"
            r14 = 300(0x12c, float:4.2E-43)
            int r38 = m14342a(r5, r3, r2, r14)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r2 = "expiredDurationInMinutes"
            r14 = -1
            int r39 = m14342a(r5, r3, r2, r14)     // Catch:{ Exception -> 0x0342 }
            org.json.JSONObject r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r11, r8)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r11 = "sendUltraEvents"
            r14 = 0
            boolean r41 = r2.optBoolean(r11, r14)     // Catch:{ Exception -> 0x0342 }
            boolean r42 = r2.optBoolean(r1, r14)     // Catch:{ Exception -> 0x0342 }
            boolean r43 = r2.optBoolean(r4, r14)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r44 = r2.optString(r7, r12)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r45 = r2.optString(r6, r12)     // Catch:{ Exception -> 0x0342 }
            r11 = -1
            int r46 = r2.optInt(r10, r11)     // Catch:{ Exception -> 0x0342 }
            int r47 = r2.optInt(r9, r11)     // Catch:{ Exception -> 0x0342 }
            r11 = 5000(0x1388, float:7.006E-42)
            int r48 = r2.optInt(r13, r11)     // Catch:{ Exception -> 0x0342 }
            org.json.JSONArray r11 = r2.optJSONArray(r15)     // Catch:{ Exception -> 0x0342 }
            if (r11 == 0) goto L_0x014e
            int r14 = r11.length()     // Catch:{ Exception -> 0x0342 }
            int[] r14 = new int[r14]     // Catch:{ Exception -> 0x0342 }
            r53 = r13
            r33 = r15
            r15 = 0
        L_0x013c:
            int r13 = r11.length()     // Catch:{ Exception -> 0x0342 }
            if (r15 >= r13) goto L_0x014b
            int r13 = r11.optInt(r15)     // Catch:{ Exception -> 0x0342 }
            r14[r15] = r13     // Catch:{ Exception -> 0x0342 }
            int r15 = r15 + 1
            goto L_0x013c
        L_0x014b:
            r49 = r14
            goto L_0x0154
        L_0x014e:
            r53 = r13
            r33 = r15
            r49 = r28
        L_0x0154:
            r11 = r29
            org.json.JSONArray r13 = r2.optJSONArray(r11)     // Catch:{ Exception -> 0x0342 }
            if (r13 == 0) goto L_0x0177
            int r14 = r13.length()     // Catch:{ Exception -> 0x0342 }
            int[] r14 = new int[r14]     // Catch:{ Exception -> 0x0342 }
            r29 = r11
            r15 = 0
        L_0x0165:
            int r11 = r13.length()     // Catch:{ Exception -> 0x0342 }
            if (r15 >= r11) goto L_0x0174
            int r11 = r13.optInt(r15)     // Catch:{ Exception -> 0x0342 }
            r14[r15] = r11     // Catch:{ Exception -> 0x0342 }
            int r15 = r15 + 1
            goto L_0x0165
        L_0x0174:
            r50 = r14
            goto L_0x017b
        L_0x0177:
            r29 = r11
            r50 = r28
        L_0x017b:
            java.lang.String r11 = "triggerEvents"
            org.json.JSONArray r11 = r2.optJSONArray(r11)     // Catch:{ Exception -> 0x0342 }
            if (r11 == 0) goto L_0x019c
            int r13 = r11.length()     // Catch:{ Exception -> 0x0342 }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x0342 }
            r14 = 0
        L_0x018a:
            int r15 = r11.length()     // Catch:{ Exception -> 0x0342 }
            if (r14 >= r15) goto L_0x0199
            int r15 = r11.optInt(r14)     // Catch:{ Exception -> 0x0342 }
            r13[r14] = r15     // Catch:{ Exception -> 0x0342 }
            int r14 = r14 + 1
            goto L_0x018a
        L_0x0199:
            r51 = r13
            goto L_0x019e
        L_0x019c:
            r51 = r28
        L_0x019e:
            java.lang.String r11 = "nonConnectivityEvents"
            org.json.JSONArray r2 = r2.optJSONArray(r11)     // Catch:{ Exception -> 0x0342 }
            if (r2 == 0) goto L_0x01bf
            int r11 = r2.length()     // Catch:{ Exception -> 0x0342 }
            int[] r11 = new int[r11]     // Catch:{ Exception -> 0x0342 }
            r13 = 0
        L_0x01ad:
            int r14 = r2.length()     // Catch:{ Exception -> 0x0342 }
            if (r13 >= r14) goto L_0x01bc
            int r14 = r2.optInt(r13)     // Catch:{ Exception -> 0x0342 }
            r11[r13] = r14     // Catch:{ Exception -> 0x0342 }
            int r13 = r13 + 1
            goto L_0x01ad
        L_0x01bc:
            r52 = r11
            goto L_0x01c1
        L_0x01bf:
            r52 = r28
        L_0x01c1:
            com.ironsource.mediationsdk.model.d r2 = new com.ironsource.mediationsdk.model.d     // Catch:{ Exception -> 0x0342 }
            r40 = r2
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)     // Catch:{ Exception -> 0x0342 }
            if (r27 == 0) goto L_0x028a
            java.lang.String r11 = "rewardedVideo"
            r13 = r27
            org.json.JSONObject r11 = m14344a(r13, r11)     // Catch:{ Exception -> 0x0342 }
            r14 = r26
            java.lang.String r55 = r13.optString(r14, r12)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r15 = "auctioneerURL"
            java.lang.String r56 = r13.optString(r15, r12)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r15 = "auctionTrials"
            r26 = r14
            r14 = 2
            int r57 = r13.optInt(r15, r14)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r14 = "auctionTimeout"
            r15 = r9
            r27 = r10
            r9 = 10000(0x2710, double:4.9407E-320)
            long r59 = r13.optLong(r14, r9)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r9 = "auctionSavedHistory"
            r10 = 15
            int r58 = r13.optInt(r9, r10)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r9 = "compressAuctionRequest"
            r10 = 0
            boolean r73 = r13.optBoolean(r9, r10)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r9 = "compressAuctionResponse"
            boolean r74 = r13.optBoolean(r9, r10)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r9 = "encryptionVersion"
            r14 = 1
            int r76 = r13.optInt(r9, r14)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r9 = "programmatic"
            boolean r61 = r11.optBoolean(r9, r10)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r9 = "minTimeBeforeFirstAuction"
            r10 = 2000(0x7d0, float:2.803E-42)
            int r9 = r11.optInt(r9, r10)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r10 = "auctionRetryInterval"
            r14 = 30000(0x7530, float:4.2039E-41)
            int r10 = r11.optInt(r10, r14)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r14 = "timeToWaitBeforeAuction"
            r42 = r15
            r15 = 5000(0x1388, float:7.006E-42)
            int r14 = r11.optInt(r14, r15)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r15 = "timeToWaitBeforeLoad"
            r43 = r13
            r13 = 50
            int r13 = r11.optInt(r15, r13)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r15 = "isAuctionOnShowStart"
            r44 = r6
            r6 = 0
            boolean r70 = r11.optBoolean(r15, r6)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r15 = "isLoadWhileShow"
            boolean r71 = r11.optBoolean(r15, r6)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r6 = "timeToDeleteOldWaterfallAfterAuction"
            r15 = 30000(0x7530, float:4.2039E-41)
            int r72 = r11.optInt(r6, r15)     // Catch:{ Exception -> 0x0342 }
            com.ironsource.mediationsdk.utils.b r6 = new com.ironsource.mediationsdk.utils.b     // Catch:{ Exception -> 0x0342 }
            r45 = r7
            r15 = r8
            long r7 = (long) r9     // Catch:{ Exception -> 0x0342 }
            r62 = r7
            long r7 = (long) r10     // Catch:{ Exception -> 0x0342 }
            r64 = r7
            long r7 = (long) r14     // Catch:{ Exception -> 0x0342 }
            r66 = r7
            long r7 = (long) r13     // Catch:{ Exception -> 0x0342 }
            r68 = r7
            r75 = 0
            r77 = 0
            r54 = r6
            r54.<init>(r55, r56, r57, r58, r59, r61, r62, r64, r66, r68, r70, r71, r72, r73, r74, r75, r76, r77)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r7 = "disableLoadWhileShowSupportFor"
            org.json.JSONArray r7 = r11.optJSONArray(r7)     // Catch:{ Exception -> 0x0342 }
            if (r7 == 0) goto L_0x029a
            r8 = 0
        L_0x0272:
            int r9 = r7.length()     // Catch:{ Exception -> 0x0342 }
            if (r8 >= r9) goto L_0x029a
            java.lang.String r9 = r7.optString(r8)     // Catch:{ Exception -> 0x0342 }
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x0342 }
            if (r10 != 0) goto L_0x0287
            java.util.ArrayList<java.lang.String> r10 = r6.f13927o     // Catch:{ Exception -> 0x0342 }
            r10.add(r9)     // Catch:{ Exception -> 0x0342 }
        L_0x0287:
            int r8 = r8 + 1
            goto L_0x0272
        L_0x028a:
            r44 = r6
            r45 = r7
            r15 = r8
            r42 = r9
            r43 = r27
            r27 = r10
            com.ironsource.mediationsdk.utils.b r6 = new com.ironsource.mediationsdk.utils.b     // Catch:{ Exception -> 0x0342 }
            r6.<init>()     // Catch:{ Exception -> 0x0342 }
        L_0x029a:
            r41 = r6
            com.ironsource.mediationsdk.model.q r6 = new com.ironsource.mediationsdk.model.q     // Catch:{ Exception -> 0x0342 }
            r34 = r6
            r40 = r2
            r34.<init>(r35, r36, r37, r38, r39, r40, r41)     // Catch:{ Exception -> 0x0342 }
            if (r32 == 0) goto L_0x0321
            r2 = 0
        L_0x02a8:
            int r7 = r32.length()     // Catch:{ Exception -> 0x0342 }
            if (r2 >= r7) goto L_0x0321
            r7 = r32
            org.json.JSONObject r8 = r7.optJSONObject(r2)     // Catch:{ Exception -> 0x0342 }
            if (r8 == 0) goto L_0x0301
            java.lang.String r9 = "placementId"
            r10 = -1
            int r35 = r8.optInt(r9, r10)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r9 = "placementName"
            java.lang.String r36 = r8.optString(r9, r12)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r9 = "isDefault"
            r10 = 0
            boolean r37 = r8.optBoolean(r9, r10)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r9 = "virtualItemName"
            java.lang.String r38 = r8.optString(r9, r12)     // Catch:{ Exception -> 0x0342 }
            java.lang.String r9 = "virtualItemCount"
            r10 = -1
            int r39 = r8.optInt(r9, r10)     // Catch:{ Exception -> 0x0342 }
            com.ironsource.mediationsdk.model.m r8 = m14343a(r8)     // Catch:{ Exception -> 0x0342 }
            if (r35 < 0) goto L_0x0301
            boolean r9 = android.text.TextUtils.isEmpty(r36)     // Catch:{ Exception -> 0x0342 }
            if (r9 != 0) goto L_0x0301
            boolean r9 = android.text.TextUtils.isEmpty(r38)     // Catch:{ Exception -> 0x0342 }
            if (r9 != 0) goto L_0x0301
            if (r39 <= 0) goto L_0x0301
            com.ironsource.mediationsdk.model.Placement r9 = new com.ironsource.mediationsdk.model.Placement     // Catch:{ Exception -> 0x0342 }
            r34 = r9
            r40 = r8
            r34.<init>(r35, r36, r37, r38, r39, r40)     // Catch:{ Exception -> 0x0342 }
            if (r8 == 0) goto L_0x02fe
            r8 = r86
            android.content.Context r10 = r8.f14082br     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.utils.C5790c.m14282a((android.content.Context) r10, (com.ironsource.mediationsdk.model.Placement) r9)     // Catch:{ Exception -> 0x0586 }
            goto L_0x0305
        L_0x02fe:
            r8 = r86
            goto L_0x0305
        L_0x0301:
            r8 = r86
            r9 = r28
        L_0x0305:
            if (r9 == 0) goto L_0x031c
            if (r9 == 0) goto L_0x031c
            java.util.ArrayList<com.ironsource.mediationsdk.model.Placement> r10 = r6.f13791a     // Catch:{ Exception -> 0x0586 }
            r10.add(r9)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.Placement r10 = r6.f13800j     // Catch:{ Exception -> 0x0586 }
            if (r10 != 0) goto L_0x0315
        L_0x0312:
            r6.f13800j = r9     // Catch:{ Exception -> 0x0586 }
            goto L_0x031c
        L_0x0315:
            int r10 = r9.getPlacementId()     // Catch:{ Exception -> 0x0586 }
            if (r10 != 0) goto L_0x031c
            goto L_0x0312
        L_0x031c:
            int r2 = r2 + 1
            r32 = r7
            goto L_0x02a8
        L_0x0321:
            r8 = r86
            java.lang.String r2 = "backFill"
            java.lang.String r2 = r5.optString(r2)     // Catch:{ Exception -> 0x0586 }
            boolean r7 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0586 }
            if (r7 != 0) goto L_0x0331
            r6.f13796f = r2     // Catch:{ Exception -> 0x0586 }
        L_0x0331:
            java.lang.String r2 = "premium"
            java.lang.String r2 = r5.optString(r2)     // Catch:{ Exception -> 0x0586 }
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0586 }
            if (r5 != 0) goto L_0x033f
            r6.f13797g = r2     // Catch:{ Exception -> 0x0586 }
        L_0x033f:
            r35 = r6
            goto L_0x035e
        L_0x0342:
            r0 = move-exception
            r8 = r86
            goto L_0x0a83
        L_0x0347:
            r31 = r2
            r44 = r6
            r45 = r7
            r42 = r9
            r30 = r11
            r53 = r13
            r33 = r15
            r43 = r27
            r15 = r8
            r27 = r10
            r8 = r86
            r35 = r28
        L_0x035e:
            r2 = 3
            if (r22 == 0) goto L_0x0589
            r5 = r22
            r6 = r30
            org.json.JSONArray r7 = r5.optJSONArray(r6)     // Catch:{ Exception -> 0x0586 }
            r9 = r31
            org.json.JSONObject r10 = m14344a(r5, r9)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r11 = "maxNumOfAdaptersToLoadOnStart"
            r13 = 2
            int r11 = m14342a(r5, r3, r11, r13)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r13 = "advancedLoading"
            r14 = 0
            int r13 = m14342a(r5, r3, r13, r14)     // Catch:{ Exception -> 0x0586 }
            if (r13 <= 0) goto L_0x0384
            r47 = r13
            r48 = 1
            goto L_0x0388
        L_0x0384:
            r47 = r11
            r48 = 0
        L_0x0388:
            java.lang.String r11 = "adapterTimeOutInSeconds"
            r13 = 60
            int r49 = m14342a(r5, r3, r11, r13)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r11 = "delayLoadFailure"
            int r52 = m14342a(r5, r3, r11, r2)     // Catch:{ Exception -> 0x0586 }
            r11 = r15
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r10, r11)     // Catch:{ Exception -> 0x0586 }
            r13 = 0
            boolean r56 = r10.optBoolean(r1, r13)     // Catch:{ Exception -> 0x0586 }
            boolean r57 = r10.optBoolean(r4, r13)     // Catch:{ Exception -> 0x0586 }
            r13 = r45
            java.lang.String r58 = r10.optString(r13, r12)     // Catch:{ Exception -> 0x0586 }
            r14 = r44
            java.lang.String r59 = r10.optString(r14, r12)     // Catch:{ Exception -> 0x0586 }
            r15 = r27
            r2 = -1
            int r60 = r10.optInt(r15, r2)     // Catch:{ Exception -> 0x0586 }
            r27 = r15
            r15 = r42
            int r61 = r10.optInt(r15, r2)     // Catch:{ Exception -> 0x0586 }
            r42 = r15
            r2 = r53
            r15 = 5000(0x1388, float:7.006E-42)
            int r62 = r10.optInt(r2, r15)     // Catch:{ Exception -> 0x0586 }
            r53 = r2
            r15 = r33
            org.json.JSONArray r2 = r10.optJSONArray(r15)     // Catch:{ Exception -> 0x0586 }
            if (r2 == 0) goto L_0x03f2
            r33 = r15
            int r15 = r2.length()     // Catch:{ Exception -> 0x0586 }
            int[] r15 = new int[r15]     // Catch:{ Exception -> 0x0586 }
            r45 = r13
            r44 = r14
            r14 = 0
        L_0x03e0:
            int r13 = r2.length()     // Catch:{ Exception -> 0x0586 }
            if (r14 >= r13) goto L_0x03ef
            int r13 = r2.optInt(r14)     // Catch:{ Exception -> 0x0586 }
            r15[r14] = r13     // Catch:{ Exception -> 0x0586 }
            int r14 = r14 + 1
            goto L_0x03e0
        L_0x03ef:
            r63 = r15
            goto L_0x03fa
        L_0x03f2:
            r45 = r13
            r44 = r14
            r33 = r15
            r63 = r28
        L_0x03fa:
            r2 = r29
            org.json.JSONArray r13 = r10.optJSONArray(r2)     // Catch:{ Exception -> 0x0586 }
            if (r13 == 0) goto L_0x041d
            int r14 = r13.length()     // Catch:{ Exception -> 0x0586 }
            int[] r14 = new int[r14]     // Catch:{ Exception -> 0x0586 }
            r29 = r2
            r15 = 0
        L_0x040b:
            int r2 = r13.length()     // Catch:{ Exception -> 0x0586 }
            if (r15 >= r2) goto L_0x041a
            int r2 = r13.optInt(r15)     // Catch:{ Exception -> 0x0586 }
            r14[r15] = r2     // Catch:{ Exception -> 0x0586 }
            int r15 = r15 + 1
            goto L_0x040b
        L_0x041a:
            r64 = r14
            goto L_0x0421
        L_0x041d:
            r29 = r2
            r64 = r28
        L_0x0421:
            java.lang.String r2 = "triggerEvents"
            org.json.JSONArray r2 = r10.optJSONArray(r2)     // Catch:{ Exception -> 0x0586 }
            if (r2 == 0) goto L_0x0442
            int r13 = r2.length()     // Catch:{ Exception -> 0x0586 }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x0586 }
            r14 = 0
        L_0x0430:
            int r15 = r2.length()     // Catch:{ Exception -> 0x0586 }
            if (r14 >= r15) goto L_0x043f
            int r15 = r2.optInt(r14)     // Catch:{ Exception -> 0x0586 }
            r13[r14] = r15     // Catch:{ Exception -> 0x0586 }
            int r14 = r14 + 1
            goto L_0x0430
        L_0x043f:
            r65 = r13
            goto L_0x0444
        L_0x0442:
            r65 = r28
        L_0x0444:
            java.lang.String r2 = "nonConnectivityEvents"
            org.json.JSONArray r2 = r10.optJSONArray(r2)     // Catch:{ Exception -> 0x0586 }
            if (r2 == 0) goto L_0x0465
            int r10 = r2.length()     // Catch:{ Exception -> 0x0586 }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x0586 }
            r13 = 0
        L_0x0453:
            int r14 = r2.length()     // Catch:{ Exception -> 0x0586 }
            if (r13 >= r14) goto L_0x0462
            int r14 = r2.optInt(r13)     // Catch:{ Exception -> 0x0586 }
            r10[r13] = r14     // Catch:{ Exception -> 0x0586 }
            int r13 = r13 + 1
            goto L_0x0453
        L_0x0462:
            r66 = r10
            goto L_0x0467
        L_0x0465:
            r66 = r28
        L_0x0467:
            com.ironsource.mediationsdk.model.d r50 = new com.ironsource.mediationsdk.model.d     // Catch:{ Exception -> 0x0586 }
            r55 = 0
            r54 = r50
            r54.<init>(r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)     // Catch:{ Exception -> 0x0586 }
            if (r43 == 0) goto L_0x04e4
            java.lang.String r2 = "interstitial"
            r10 = r43
            org.json.JSONObject r2 = m14344a(r10, r2)     // Catch:{ Exception -> 0x0586 }
            r13 = r26
            java.lang.String r55 = r10.optString(r13, r12)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r14 = "auctioneerURL"
            java.lang.String r56 = r10.optString(r14, r12)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r14 = "auctionTrials"
            r15 = 2
            int r57 = r10.optInt(r14, r15)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r14 = "auctionSavedHistory"
            r15 = 15
            int r58 = r10.optInt(r14, r15)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r14 = "auctionTimeout"
            r15 = r3
            r26 = r4
            r3 = 10000(0x2710, double:4.9407E-320)
            long r59 = r10.optLong(r14, r3)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = "compressAuctionRequest"
            r4 = 0
            boolean r73 = r10.optBoolean(r3, r4)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = "compressAuctionResponse"
            boolean r74 = r10.optBoolean(r3, r4)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = "encryptionVersion"
            r14 = 1
            int r76 = r10.optInt(r3, r14)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = "programmatic"
            boolean r61 = r2.optBoolean(r3, r4)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = "objectPerWaterfall"
            boolean r75 = r2.optBoolean(r3, r4)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = "minTimeBeforeFirstAuction"
            r4 = 2000(0x7d0, float:2.803E-42)
            int r2 = r2.optInt(r3, r4)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.utils.b r3 = new com.ironsource.mediationsdk.utils.b     // Catch:{ Exception -> 0x0586 }
            r4 = r15
            long r14 = (long) r2     // Catch:{ Exception -> 0x0586 }
            r62 = r14
            r64 = 0
            r66 = 0
            r68 = 0
            r70 = 1
            r71 = 1
            r72 = 0
            r77 = 0
            r54 = r3
            r54.<init>(r55, r56, r57, r58, r59, r61, r62, r64, r66, r68, r70, r71, r72, r73, r74, r75, r76, r77)     // Catch:{ Exception -> 0x0586 }
            r51 = r3
            goto L_0x04f2
        L_0x04e4:
            r13 = r26
            r10 = r43
            r26 = r4
            r4 = r3
            com.ironsource.mediationsdk.utils.b r2 = new com.ironsource.mediationsdk.utils.b     // Catch:{ Exception -> 0x0586 }
            r2.<init>()     // Catch:{ Exception -> 0x0586 }
            r51 = r2
        L_0x04f2:
            com.ironsource.mediationsdk.model.j r2 = new com.ironsource.mediationsdk.model.j     // Catch:{ Exception -> 0x0586 }
            r46 = r2
            r46.<init>(r47, r48, r49, r50, r51, r52)     // Catch:{ Exception -> 0x0586 }
            if (r7 == 0) goto L_0x0563
            r3 = 0
        L_0x04fc:
            int r14 = r7.length()     // Catch:{ Exception -> 0x0586 }
            if (r3 >= r14) goto L_0x0563
            org.json.JSONObject r14 = r7.optJSONObject(r3)     // Catch:{ Exception -> 0x0586 }
            if (r14 == 0) goto L_0x053b
            java.lang.String r15 = "placementId"
            r30 = r4
            r4 = -1
            int r15 = r14.optInt(r15, r4)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r4 = "placementName"
            java.lang.String r4 = r14.optString(r4, r12)     // Catch:{ Exception -> 0x0586 }
            r31 = r7
            java.lang.String r7 = "isDefault"
            r32 = r13
            r13 = 0
            boolean r7 = r14.optBoolean(r7, r13)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.m r13 = m14343a(r14)     // Catch:{ Exception -> 0x0586 }
            if (r15 < 0) goto L_0x0541
            boolean r14 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0586 }
            if (r14 != 0) goto L_0x0541
            com.ironsource.mediationsdk.model.InterstitialPlacement r14 = new com.ironsource.mediationsdk.model.InterstitialPlacement     // Catch:{ Exception -> 0x0586 }
            r14.<init>(r15, r4, r7, r13)     // Catch:{ Exception -> 0x0586 }
            if (r13 == 0) goto L_0x0543
            android.content.Context r4 = r8.f14082br     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.utils.C5790c.m14281a((android.content.Context) r4, (com.ironsource.mediationsdk.model.InterstitialPlacement) r14)     // Catch:{ Exception -> 0x0586 }
            goto L_0x0543
        L_0x053b:
            r30 = r4
            r31 = r7
            r32 = r13
        L_0x0541:
            r14 = r28
        L_0x0543:
            if (r14 == 0) goto L_0x055a
            if (r14 == 0) goto L_0x055a
            java.util.ArrayList<com.ironsource.mediationsdk.model.InterstitialPlacement> r4 = r2.f13749a     // Catch:{ Exception -> 0x0586 }
            r4.add(r14)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.InterstitialPlacement r4 = r2.f13758j     // Catch:{ Exception -> 0x0586 }
            if (r4 != 0) goto L_0x0553
        L_0x0550:
            r2.f13758j = r14     // Catch:{ Exception -> 0x0586 }
            goto L_0x055a
        L_0x0553:
            int r4 = r14.getPlacementId()     // Catch:{ Exception -> 0x0586 }
            if (r4 != 0) goto L_0x055a
            goto L_0x0550
        L_0x055a:
            int r3 = r3 + 1
            r4 = r30
            r7 = r31
            r13 = r32
            goto L_0x04fc
        L_0x0563:
            r30 = r4
            r32 = r13
            java.lang.String r3 = "backFill"
            java.lang.String r3 = r5.optString(r3)     // Catch:{ Exception -> 0x0586 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0586 }
            if (r4 != 0) goto L_0x0575
            r2.f13755g = r3     // Catch:{ Exception -> 0x0586 }
        L_0x0575:
            java.lang.String r3 = "premium"
            java.lang.String r3 = r5.optString(r3)     // Catch:{ Exception -> 0x0586 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0586 }
            if (r4 != 0) goto L_0x0583
            r2.f13756h = r3     // Catch:{ Exception -> 0x0586 }
        L_0x0583:
            r36 = r2
            goto L_0x0598
        L_0x0586:
            r0 = move-exception
            goto L_0x0a83
        L_0x0589:
            r11 = r15
            r32 = r26
            r6 = r30
            r9 = r31
            r10 = r43
            r30 = r3
            r26 = r4
            r36 = r28
        L_0x0598:
            if (r25 == 0) goto L_0x07b4
            r2 = r25
            org.json.JSONArray r3 = r2.optJSONArray(r6)     // Catch:{ Exception -> 0x0586 }
            org.json.JSONObject r4 = m14344a(r2, r9)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r5 = "maxNumOfAdaptersToLoadOnStart"
            r7 = r30
            r13 = 1
            int r55 = m14342a(r2, r7, r5, r13)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r5 = "atim"
            boolean r13 = r2.has(r5)     // Catch:{ Exception -> 0x0586 }
            r14 = 0
            if (r13 == 0) goto L_0x05bc
            long r30 = r2.optLong(r5, r14)     // Catch:{ Exception -> 0x0586 }
            goto L_0x05c9
        L_0x05bc:
            boolean r13 = r7.has(r5)     // Catch:{ Exception -> 0x0586 }
            if (r13 == 0) goto L_0x05c7
            long r30 = r7.optLong(r5, r14)     // Catch:{ Exception -> 0x0586 }
            goto L_0x05c9
        L_0x05c7:
            r30 = r14
        L_0x05c9:
            int r5 = (r30 > r14 ? 1 : (r30 == r14 ? 0 : -1))
            if (r5 != 0) goto L_0x05d0
            r56 = 10000(0x2710, double:4.9407E-320)
            goto L_0x05d2
        L_0x05d0:
            r56 = r30
        L_0x05d2:
            java.lang.String r5 = "delayLoadFailure"
            r13 = 3
            int r61 = m14342a(r2, r7, r5, r13)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r5 = "bannerInterval"
            r13 = 60
            int r59 = m14342a(r2, r7, r5, r13)     // Catch:{ Exception -> 0x0586 }
            org.json.JSONObject r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r4, r11)     // Catch:{ Exception -> 0x0586 }
            r4 = 0
            boolean r64 = r2.optBoolean(r1, r4)     // Catch:{ Exception -> 0x0586 }
            r5 = r26
            boolean r65 = r2.optBoolean(r5, r4)     // Catch:{ Exception -> 0x0586 }
            r4 = r45
            java.lang.String r66 = r2.optString(r4, r12)     // Catch:{ Exception -> 0x0586 }
            r13 = r44
            java.lang.String r67 = r2.optString(r13, r12)     // Catch:{ Exception -> 0x0586 }
            r14 = r27
            r15 = -1
            int r68 = r2.optInt(r14, r15)     // Catch:{ Exception -> 0x0586 }
            r30 = r7
            r7 = r42
            int r69 = r2.optInt(r7, r15)     // Catch:{ Exception -> 0x0586 }
            r25 = r6
            r15 = r53
            r6 = 5000(0x1388, float:7.006E-42)
            int r70 = r2.optInt(r15, r6)     // Catch:{ Exception -> 0x0586 }
            r53 = r15
            r6 = r33
            org.json.JSONArray r15 = r2.optJSONArray(r6)     // Catch:{ Exception -> 0x0586 }
            if (r15 == 0) goto L_0x063e
            r33 = r6
            int r6 = r15.length()     // Catch:{ Exception -> 0x0586 }
            int[] r6 = new int[r6]     // Catch:{ Exception -> 0x0586 }
            r42 = r7
            r27 = r14
            r7 = 0
        L_0x062c:
            int r14 = r15.length()     // Catch:{ Exception -> 0x0586 }
            if (r7 >= r14) goto L_0x063b
            int r14 = r15.optInt(r7)     // Catch:{ Exception -> 0x0586 }
            r6[r7] = r14     // Catch:{ Exception -> 0x0586 }
            int r7 = r7 + 1
            goto L_0x062c
        L_0x063b:
            r71 = r6
            goto L_0x0646
        L_0x063e:
            r33 = r6
            r42 = r7
            r27 = r14
            r71 = r28
        L_0x0646:
            r6 = r29
            org.json.JSONArray r7 = r2.optJSONArray(r6)     // Catch:{ Exception -> 0x0586 }
            if (r7 == 0) goto L_0x0669
            int r14 = r7.length()     // Catch:{ Exception -> 0x0586 }
            int[] r14 = new int[r14]     // Catch:{ Exception -> 0x0586 }
            r29 = r6
            r15 = 0
        L_0x0657:
            int r6 = r7.length()     // Catch:{ Exception -> 0x0586 }
            if (r15 >= r6) goto L_0x0666
            int r6 = r7.optInt(r15)     // Catch:{ Exception -> 0x0586 }
            r14[r15] = r6     // Catch:{ Exception -> 0x0586 }
            int r15 = r15 + 1
            goto L_0x0657
        L_0x0666:
            r72 = r14
            goto L_0x066d
        L_0x0669:
            r29 = r6
            r72 = r28
        L_0x066d:
            java.lang.String r6 = "triggerEvents"
            org.json.JSONArray r6 = r2.optJSONArray(r6)     // Catch:{ Exception -> 0x0586 }
            if (r6 == 0) goto L_0x068e
            int r7 = r6.length()     // Catch:{ Exception -> 0x0586 }
            int[] r7 = new int[r7]     // Catch:{ Exception -> 0x0586 }
            r14 = 0
        L_0x067c:
            int r15 = r6.length()     // Catch:{ Exception -> 0x0586 }
            if (r14 >= r15) goto L_0x068b
            int r15 = r6.optInt(r14)     // Catch:{ Exception -> 0x0586 }
            r7[r14] = r15     // Catch:{ Exception -> 0x0586 }
            int r14 = r14 + 1
            goto L_0x067c
        L_0x068b:
            r73 = r7
            goto L_0x0690
        L_0x068e:
            r73 = r28
        L_0x0690:
            java.lang.String r6 = "nonConnectivityEvents"
            org.json.JSONArray r2 = r2.optJSONArray(r6)     // Catch:{ Exception -> 0x0586 }
            if (r2 == 0) goto L_0x06b1
            int r6 = r2.length()     // Catch:{ Exception -> 0x0586 }
            int[] r6 = new int[r6]     // Catch:{ Exception -> 0x0586 }
            r7 = 0
        L_0x069f:
            int r14 = r2.length()     // Catch:{ Exception -> 0x0586 }
            if (r7 >= r14) goto L_0x06ae
            int r14 = r2.optInt(r7)     // Catch:{ Exception -> 0x0586 }
            r6[r7] = r14     // Catch:{ Exception -> 0x0586 }
            int r7 = r7 + 1
            goto L_0x069f
        L_0x06ae:
            r74 = r6
            goto L_0x06b3
        L_0x06b1:
            r74 = r28
        L_0x06b3:
            com.ironsource.mediationsdk.model.d r58 = new com.ironsource.mediationsdk.model.d     // Catch:{ Exception -> 0x0586 }
            r63 = 0
            r62 = r58
            r62.<init>(r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74)     // Catch:{ Exception -> 0x0586 }
            if (r10 == 0) goto L_0x0733
            java.lang.String r2 = "banner"
            org.json.JSONObject r2 = m14344a(r10, r2)     // Catch:{ Exception -> 0x0586 }
            if (r2 == 0) goto L_0x072b
            r6 = r32
            java.lang.String r63 = r10.optString(r6, r12)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r7 = "auctioneerURL"
            java.lang.String r64 = r10.optString(r7, r12)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r7 = "auctionTrials"
            r14 = 2
            int r65 = r10.optInt(r7, r14)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r7 = "auctionSavedHistory"
            r14 = 15
            int r66 = r10.optInt(r7, r14)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r7 = "auctionTimeout"
            r14 = 10000(0x2710, double:4.9407E-320)
            long r67 = r10.optLong(r7, r14)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r7 = "compressAuctionRequest"
            r14 = 0
            boolean r81 = r10.optBoolean(r7, r14)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r7 = "compressAuctionResponse"
            boolean r82 = r10.optBoolean(r7, r14)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r7 = "encryptionVersion"
            r15 = 1
            int r84 = r10.optInt(r7, r15)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r7 = "programmatic"
            boolean r69 = r2.optBoolean(r7, r14)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r7 = "minTimeBeforeFirstAuction"
            r14 = 2000(0x7d0, float:2.803E-42)
            int r7 = r2.optInt(r7, r14)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r14 = "shouldSendBannerBURLFromImpression"
            r15 = 1
            boolean r85 = r2.optBoolean(r14, r15)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.utils.b r2 = new com.ironsource.mediationsdk.utils.b     // Catch:{ Exception -> 0x0586 }
            long r14 = (long) r7     // Catch:{ Exception -> 0x0586 }
            r70 = r14
            r72 = 0
            r74 = 0
            r76 = 0
            r78 = 1
            r79 = 1
            r80 = 0
            r83 = 0
            r62 = r2
            r62.<init>(r63, r64, r65, r66, r67, r69, r70, r72, r74, r76, r78, r79, r80, r81, r82, r83, r84, r85)     // Catch:{ Exception -> 0x0586 }
            goto L_0x073a
        L_0x072b:
            r6 = r32
            com.ironsource.mediationsdk.utils.b r2 = new com.ironsource.mediationsdk.utils.b     // Catch:{ Exception -> 0x0586 }
            r2.<init>()     // Catch:{ Exception -> 0x0586 }
            goto L_0x073a
        L_0x0733:
            r6 = r32
            com.ironsource.mediationsdk.utils.b r2 = new com.ironsource.mediationsdk.utils.b     // Catch:{ Exception -> 0x0586 }
            r2.<init>()     // Catch:{ Exception -> 0x0586 }
        L_0x073a:
            r60 = r2
            com.ironsource.mediationsdk.model.g r2 = new com.ironsource.mediationsdk.model.g     // Catch:{ Exception -> 0x0586 }
            r54 = r2
            r54.<init>(r55, r56, r58, r59, r60, r61)     // Catch:{ Exception -> 0x0586 }
            if (r3 == 0) goto L_0x07ad
            r7 = 0
        L_0x0746:
            int r14 = r3.length()     // Catch:{ Exception -> 0x0586 }
            if (r7 >= r14) goto L_0x07ad
            org.json.JSONObject r14 = r3.optJSONObject(r7)     // Catch:{ Exception -> 0x0586 }
            if (r14 == 0) goto L_0x0785
            java.lang.String r15 = "placementId"
            r24 = r3
            r3 = -1
            int r15 = r14.optInt(r15, r3)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = "placementName"
            java.lang.String r3 = r14.optString(r3, r12)     // Catch:{ Exception -> 0x0586 }
            r26 = r6
            java.lang.String r6 = "isDefault"
            r43 = r10
            r10 = 0
            boolean r6 = r14.optBoolean(r6, r10)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.m r10 = m14343a(r14)     // Catch:{ Exception -> 0x0586 }
            if (r15 < 0) goto L_0x078b
            boolean r14 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0586 }
            if (r14 != 0) goto L_0x078b
            com.ironsource.mediationsdk.model.h r14 = new com.ironsource.mediationsdk.model.h     // Catch:{ Exception -> 0x0586 }
            r14.<init>(r15, r3, r6, r10)     // Catch:{ Exception -> 0x0586 }
            if (r10 == 0) goto L_0x078d
            android.content.Context r3 = r8.f14082br     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.utils.C5790c.m14283a((android.content.Context) r3, (com.ironsource.mediationsdk.model.C5724h) r14)     // Catch:{ Exception -> 0x0586 }
            goto L_0x078d
        L_0x0785:
            r24 = r3
            r26 = r6
            r43 = r10
        L_0x078b:
            r14 = r28
        L_0x078d:
            if (r14 == 0) goto L_0x07a4
            if (r14 == 0) goto L_0x07a4
            java.util.ArrayList<com.ironsource.mediationsdk.model.h> r3 = r2.f13738c     // Catch:{ Exception -> 0x0586 }
            r3.add(r14)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.h r3 = r2.f13739d     // Catch:{ Exception -> 0x0586 }
            if (r3 != 0) goto L_0x079d
        L_0x079a:
            r2.f13739d = r14     // Catch:{ Exception -> 0x0586 }
            goto L_0x07a4
        L_0x079d:
            int r3 = r14.getPlacementId()     // Catch:{ Exception -> 0x0586 }
            if (r3 != 0) goto L_0x07a4
            goto L_0x079a
        L_0x07a4:
            int r7 = r7 + 1
            r3 = r24
            r6 = r26
            r10 = r43
            goto L_0x0746
        L_0x07ad:
            r26 = r6
            r43 = r10
            r38 = r2
            goto L_0x07c2
        L_0x07b4:
            r25 = r6
            r43 = r10
            r5 = r26
            r26 = r32
            r13 = r44
            r4 = r45
            r38 = r28
        L_0x07c2:
            if (r23 == 0) goto L_0x08e5
            r2 = r23
            org.json.JSONObject r3 = m14344a(r2, r9)     // Catch:{ Exception -> 0x0586 }
            org.json.JSONObject r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r3, r11)     // Catch:{ Exception -> 0x0586 }
            r6 = 0
            boolean r56 = r3.optBoolean(r1, r6)     // Catch:{ Exception -> 0x0586 }
            boolean r57 = r3.optBoolean(r5, r6)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r58 = r3.optString(r4, r12)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r59 = r3.optString(r13, r12)     // Catch:{ Exception -> 0x0586 }
            r1 = r27
            r4 = -1
            int r60 = r3.optInt(r1, r4)     // Catch:{ Exception -> 0x0586 }
            r1 = r42
            int r61 = r3.optInt(r1, r4)     // Catch:{ Exception -> 0x0586 }
            r1 = r53
            r4 = 5000(0x1388, float:7.006E-42)
            int r62 = r3.optInt(r1, r4)     // Catch:{ Exception -> 0x0586 }
            r1 = r33
            org.json.JSONArray r1 = r3.optJSONArray(r1)     // Catch:{ Exception -> 0x0586 }
            if (r1 == 0) goto L_0x0815
            int r4 = r1.length()     // Catch:{ Exception -> 0x0586 }
            int[] r4 = new int[r4]     // Catch:{ Exception -> 0x0586 }
            r5 = 0
        L_0x0803:
            int r6 = r1.length()     // Catch:{ Exception -> 0x0586 }
            if (r5 >= r6) goto L_0x0812
            int r6 = r1.optInt(r5)     // Catch:{ Exception -> 0x0586 }
            r4[r5] = r6     // Catch:{ Exception -> 0x0586 }
            int r5 = r5 + 1
            goto L_0x0803
        L_0x0812:
            r63 = r4
            goto L_0x0817
        L_0x0815:
            r63 = r28
        L_0x0817:
            r1 = r29
            org.json.JSONArray r1 = r3.optJSONArray(r1)     // Catch:{ Exception -> 0x0586 }
            if (r1 == 0) goto L_0x0838
            int r4 = r1.length()     // Catch:{ Exception -> 0x0586 }
            int[] r4 = new int[r4]     // Catch:{ Exception -> 0x0586 }
            r5 = 0
        L_0x0826:
            int r6 = r1.length()     // Catch:{ Exception -> 0x0586 }
            if (r5 >= r6) goto L_0x0835
            int r6 = r1.optInt(r5)     // Catch:{ Exception -> 0x0586 }
            r4[r5] = r6     // Catch:{ Exception -> 0x0586 }
            int r5 = r5 + 1
            goto L_0x0826
        L_0x0835:
            r64 = r4
            goto L_0x083a
        L_0x0838:
            r64 = r28
        L_0x083a:
            java.lang.String r1 = "triggerEvents"
            org.json.JSONArray r1 = r3.optJSONArray(r1)     // Catch:{ Exception -> 0x0586 }
            if (r1 == 0) goto L_0x085b
            int r4 = r1.length()     // Catch:{ Exception -> 0x0586 }
            int[] r4 = new int[r4]     // Catch:{ Exception -> 0x0586 }
            r5 = 0
        L_0x0849:
            int r6 = r1.length()     // Catch:{ Exception -> 0x0586 }
            if (r5 >= r6) goto L_0x0858
            int r6 = r1.optInt(r5)     // Catch:{ Exception -> 0x0586 }
            r4[r5] = r6     // Catch:{ Exception -> 0x0586 }
            int r5 = r5 + 1
            goto L_0x0849
        L_0x0858:
            r65 = r4
            goto L_0x085d
        L_0x085b:
            r65 = r28
        L_0x085d:
            java.lang.String r1 = "nonConnectivityEvents"
            org.json.JSONArray r1 = r3.optJSONArray(r1)     // Catch:{ Exception -> 0x0586 }
            if (r1 == 0) goto L_0x087e
            int r3 = r1.length()     // Catch:{ Exception -> 0x0586 }
            int[] r3 = new int[r3]     // Catch:{ Exception -> 0x0586 }
            r4 = 0
        L_0x086c:
            int r5 = r1.length()     // Catch:{ Exception -> 0x0586 }
            if (r4 >= r5) goto L_0x087b
            int r5 = r1.optInt(r4)     // Catch:{ Exception -> 0x0586 }
            r3[r4] = r5     // Catch:{ Exception -> 0x0586 }
            int r4 = r4 + 1
            goto L_0x086c
        L_0x087b:
            r66 = r3
            goto L_0x0880
        L_0x087e:
            r66 = r28
        L_0x0880:
            com.ironsource.mediationsdk.model.d r1 = new com.ironsource.mediationsdk.model.d     // Catch:{ Exception -> 0x0586 }
            r55 = 0
            r54 = r1
            r54.<init>(r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.k r3 = new com.ironsource.mediationsdk.model.k     // Catch:{ Exception -> 0x0586 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0586 }
            r3.f13762d = r2     // Catch:{ Exception -> 0x0586 }
            r1 = r25
            org.json.JSONArray r1 = r2.optJSONArray(r1)     // Catch:{ Exception -> 0x0586 }
            if (r1 == 0) goto L_0x08e2
            r2 = 0
        L_0x0899:
            int r4 = r1.length()     // Catch:{ Exception -> 0x0586 }
            if (r2 >= r4) goto L_0x08e2
            org.json.JSONObject r4 = r1.optJSONObject(r2)     // Catch:{ Exception -> 0x0586 }
            if (r4 == 0) goto L_0x08c7
            java.lang.String r5 = "placementId"
            r6 = -1
            int r5 = r4.optInt(r5, r6)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r7 = "placementName"
            java.lang.String r7 = r4.optString(r7, r12)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r10 = "isDefault"
            r13 = 0
            boolean r4 = r4.optBoolean(r10, r13)     // Catch:{ Exception -> 0x0586 }
            if (r5 < 0) goto L_0x08c8
            boolean r10 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x0586 }
            if (r10 != 0) goto L_0x08c8
            com.ironsource.mediationsdk.model.l r10 = new com.ironsource.mediationsdk.model.l     // Catch:{ Exception -> 0x0586 }
            r10.<init>(r5, r7, r4)     // Catch:{ Exception -> 0x0586 }
            goto L_0x08ca
        L_0x08c7:
            r6 = -1
        L_0x08c8:
            r10 = r28
        L_0x08ca:
            if (r10 == 0) goto L_0x08df
            if (r10 == 0) goto L_0x08df
            java.util.ArrayList<com.ironsource.mediationsdk.model.l> r4 = r3.f13759a     // Catch:{ Exception -> 0x0586 }
            r4.add(r10)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.l r4 = r3.f13760b     // Catch:{ Exception -> 0x0586 }
            if (r4 != 0) goto L_0x08da
        L_0x08d7:
            r3.f13760b = r10     // Catch:{ Exception -> 0x0586 }
            goto L_0x08df
        L_0x08da:
            int r4 = r10.f13763a     // Catch:{ Exception -> 0x0586 }
            if (r4 != 0) goto L_0x08df
            goto L_0x08d7
        L_0x08df:
            int r2 = r2 + 1
            goto L_0x0899
        L_0x08e2:
            r37 = r3
            goto L_0x08e7
        L_0x08e5:
            r37 = r28
        L_0x08e7:
            com.ironsource.mediationsdk.utils.n r1 = new com.ironsource.mediationsdk.utils.n     // Catch:{ Exception -> 0x0586 }
            r1.<init>()     // Catch:{ Exception -> 0x0586 }
            if (r21 == 0) goto L_0x092d
            java.lang.String r2 = "optInKeys"
            r3 = r21
            org.json.JSONArray r2 = r3.optJSONArray(r2)     // Catch:{ Exception -> 0x0586 }
            if (r2 == 0) goto L_0x0911
            r4 = 0
        L_0x08f9:
            int r5 = r2.length()     // Catch:{ Exception -> 0x0586 }
            if (r4 >= r5) goto L_0x0911
            java.lang.String r5 = r2.optString(r4)     // Catch:{ Exception -> 0x0586 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0586 }
            if (r6 != 0) goto L_0x090e
            java.util.ArrayList<java.lang.String> r6 = r1.f14118a     // Catch:{ Exception -> 0x0586 }
            r6.add(r5)     // Catch:{ Exception -> 0x0586 }
        L_0x090e:
            int r4 = r4 + 1
            goto L_0x08f9
        L_0x0911:
            java.lang.String r2 = "tokenGenericParams"
            org.json.JSONObject r2 = r3.optJSONObject(r2)     // Catch:{ Exception -> 0x0586 }
            if (r2 == 0) goto L_0x091b
            r1.f14119b = r2     // Catch:{ Exception -> 0x0586 }
        L_0x091b:
            java.lang.String r2 = "oneToken"
            r4 = 0
            boolean r2 = r3.optBoolean(r2, r4)     // Catch:{ Exception -> 0x0586 }
            r1.f14120c = r2     // Catch:{ Exception -> 0x0586 }
            java.lang.String r2 = "compressToken"
            r4 = 1
            boolean r2 = r3.optBoolean(r2, r4)     // Catch:{ Exception -> 0x0586 }
            r1.f14121d = r2     // Catch:{ Exception -> 0x0586 }
        L_0x092d:
            java.lang.String r2 = "server"
            r3 = r20
            r4 = 3
            int r2 = r3.optInt(r2, r4)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r5 = "publisher"
            int r5 = r3.optInt(r5, r4)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r6 = "console"
            int r3 = r3.optInt(r6, r4)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.f r4 = new com.ironsource.mediationsdk.model.f     // Catch:{ Exception -> 0x0586 }
            r4.<init>(r2, r5, r3)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.c r2 = new com.ironsource.mediationsdk.model.c     // Catch:{ Exception -> 0x0586 }
            r2.<init>()     // Catch:{ Exception -> 0x0586 }
            if (r19 == 0) goto L_0x09a6
            java.lang.String r3 = "enabled"
            r5 = r19
            r6 = 0
            boolean r3 = r5.optBoolean(r3, r6)     // Catch:{ Exception -> 0x0586 }
            r2.f13713a = r3     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = "reporterURL"
            java.lang.String r3 = r5.optString(r3, r12)     // Catch:{ Exception -> 0x0586 }
            r2.f13715c = r3     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = "reporterKeyword"
            java.lang.String r3 = r5.optString(r3, r12)     // Catch:{ Exception -> 0x0586 }
            r2.f13716d = r3     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = "includeANR"
            r6 = 0
            boolean r3 = r5.optBoolean(r3, r6)     // Catch:{ Exception -> 0x0586 }
            r2.f13717e = r3     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = "timeout"
            r6 = 5000(0x1388, float:7.006E-42)
            int r3 = r5.optInt(r3, r6)     // Catch:{ Exception -> 0x0586 }
            r2.f13718f = r3     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = "setIgnoreDebugger"
            r6 = 0
            boolean r3 = r5.optBoolean(r3, r6)     // Catch:{ Exception -> 0x0586 }
            r2.f13719g = r3     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = "keysToInclude"
            org.json.JSONArray r3 = r5.optJSONArray(r3)     // Catch:{ Exception -> 0x0586 }
            if (r3 == 0) goto L_0x09a6
            r5 = 0
        L_0x098e:
            int r6 = r3.length()     // Catch:{ Exception -> 0x0586 }
            if (r5 >= r6) goto L_0x09a6
            java.lang.String r6 = r3.optString(r5)     // Catch:{ Exception -> 0x0586 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0586 }
            if (r7 != 0) goto L_0x09a3
            java.util.HashSet<java.lang.String> r7 = r2.f13714b     // Catch:{ Exception -> 0x0586 }
            r7.add(r6)     // Catch:{ Exception -> 0x0586 }
        L_0x09a3:
            int r5 = r5 + 1
            goto L_0x098e
        L_0x09a6:
            if (r18 == 0) goto L_0x09c6
            java.lang.String r3 = "name"
            r5 = r18
            java.lang.String r3 = r5.optString(r3, r12)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r6 = "id"
            java.lang.String r7 = "-1"
            java.lang.String r6 = r5.optString(r6, r7)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r7 = "custom"
            org.json.JSONObject r5 = r5.optJSONObject(r7)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.r r7 = new com.ironsource.mediationsdk.model.r     // Catch:{ Exception -> 0x0586 }
            r7.<init>(r3, r6, r5)     // Catch:{ Exception -> 0x0586 }
            r46 = r7
            goto L_0x09c8
        L_0x09c6:
            r46 = r28
        L_0x09c8:
            com.ironsource.mediationsdk.utils.a r3 = new com.ironsource.mediationsdk.utils.a     // Catch:{ Exception -> 0x0586 }
            r3.<init>()     // Catch:{ Exception -> 0x0586 }
            if (r17 == 0) goto L_0x09e8
            java.lang.String r3 = "isExternalArmEventsEnabled"
            r5 = r17
            r6 = 1
            boolean r3 = r5.optBoolean(r3, r6)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r6 = "externalArmEventsUrl"
            java.lang.String r7 = "https://outcome-arm-ext-med-ext.sonic-us.supersonicads.com/aemData"
            java.lang.String r5 = r5.optString(r6, r7)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.utils.a r6 = new com.ironsource.mediationsdk.utils.a     // Catch:{ Exception -> 0x0586 }
            r6.<init>(r3, r5)     // Catch:{ Exception -> 0x0586 }
            r50 = r6
            goto L_0x09ea
        L_0x09e8:
            r50 = r3
        L_0x09ea:
            com.ironsource.mediationsdk.model.e r3 = new com.ironsource.mediationsdk.model.e     // Catch:{ Exception -> 0x0586 }
            r3.<init>()     // Catch:{ Exception -> 0x0586 }
            if (r16 == 0) goto L_0x0a0f
            java.lang.String r3 = "mediationTypes"
            r5 = r16
            org.json.JSONObject r3 = r5.optJSONObject(r3)     // Catch:{ Exception -> 0x0586 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ Exception -> 0x0586 }
            r6.<init>()     // Catch:{ Exception -> 0x0586 }
            if (r3 == 0) goto L_0x0a04
            java.util.Map r6 = com.ironsource.mediationsdk.utils.IronSourceUtils.parseJsonToStringMap(r3)     // Catch:{ Exception -> 0x0586 }
        L_0x0a04:
            java.lang.String r3 = "compressExternalToken"
            r7 = 0
            r5.optBoolean(r3, r7)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.e r3 = new com.ironsource.mediationsdk.model.e     // Catch:{ Exception -> 0x0586 }
            r3.<init>(r6)     // Catch:{ Exception -> 0x0586 }
        L_0x0a0f:
            r51 = r3
            com.ironsource.mediationsdk.model.b r3 = new com.ironsource.mediationsdk.model.b     // Catch:{ Exception -> 0x0586 }
            r3.<init>()     // Catch:{ Exception -> 0x0586 }
            if (r43 == 0) goto L_0x0a28
            r5 = r26
            r3 = r43
            java.lang.String r3 = r3.optString(r5)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.b r5 = new com.ironsource.mediationsdk.model.b     // Catch:{ Exception -> 0x0586 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x0586 }
            r52 = r5
            goto L_0x0a2a
        L_0x0a28:
            r52 = r3
        L_0x0a2a:
            java.lang.String r3 = "integration"
            r5 = r30
            r6 = 0
            boolean r48 = r5.optBoolean(r3, r6)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.sdk.g.d r39 = new com.ironsource.sdk.g.d     // Catch:{ Exception -> 0x0586 }
            r44 = r39
            r45 = r4
            r47 = r1
            r49 = r2
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.model.i r1 = new com.ironsource.mediationsdk.model.i     // Catch:{ Exception -> 0x0586 }
            r34 = r1
            r34.<init>(r35, r36, r37, r38, r39)     // Catch:{ Exception -> 0x0586 }
            r8.f14083c = r1     // Catch:{ Exception -> 0x0586 }
            java.lang.String r1 = "genericParams"
            org.json.JSONObject r1 = m14344a(r11, r1)     // Catch:{ Exception -> 0x0586 }
            if (r1 == 0) goto L_0x0a6c
            org.json.JSONObject r2 = m14344a(r1, r9)     // Catch:{ Exception -> 0x0586 }
            if (r2 == 0) goto L_0x0a6c
            r1.remove(r9)     // Catch:{ Exception -> 0x0586 }
            java.util.Map r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.parseJsonToStringMap(r2)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.a.g r3 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ Exception -> 0x0586 }
            r3.mo41691b((java.util.Map<java.lang.String, java.lang.String>) r2)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ Exception -> 0x0586 }
            r3.mo41691b((java.util.Map<java.lang.String, java.lang.String>) r2)     // Catch:{ Exception -> 0x0586 }
        L_0x0a6c:
            if (r1 == 0) goto L_0x0a80
            java.util.Map r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.parseJsonToStringMap(r1)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.a.g r2 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ Exception -> 0x0586 }
            r2.mo41683a((java.util.Map<java.lang.String, java.lang.String>) r1)     // Catch:{ Exception -> 0x0586 }
            com.ironsource.mediationsdk.a.d r2 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ Exception -> 0x0586 }
            r2.mo41683a((java.util.Map<java.lang.String, java.lang.String>) r1)     // Catch:{ Exception -> 0x0586 }
        L_0x0a80:
            return
        L_0x0a81:
            r0 = move-exception
            r8 = r1
        L_0x0a83:
            r1 = r0
            r1.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C5800j.m14349h():void");
    }

    /* renamed from: a */
    public final boolean mo42127a() {
        return (((((this.f14084d != null) && !this.f14084d.has("error")) && this.f14011a != null) && this.f14064b != null) && this.f14083c != null) && m14346e();
    }

    /* renamed from: b */
    public final String mo42128b() {
        try {
            return this.f14011a.f13783b;
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getRVBackFillProvider", e);
            return null;
        }
    }

    /* renamed from: c */
    public final String mo42129c() {
        try {
            return this.f14011a.f13784c;
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getRVPremiumProvider", e);
            return null;
        }
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", this.f14080bp);
            jSONObject.put(DataKeys.USER_ID, this.f14081bq);
            jSONObject.put(Payload.RESPONSE, this.f14084d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}
