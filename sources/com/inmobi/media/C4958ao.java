package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ao */
/* compiled from: AdSet */
public final class C4958ao {
    static final String BUYER_PRICE = "buyerPrice";
    public static final String CTX_HASH_KEY = "ctxHash";
    private static final long INVALID_AD_EXPIRY = -1;
    private static final String KEY_ADS = "ads";
    private static final String KEY_AD_SET_EXPIRY = "expiry";
    private static final String KEY_IMPRESSION_ID = "impressionId";
    private static final String KEY_MACROS = "macros";
    public static final String KEY_REQUEST_ID = "requestId";
    private static final String MACRO_ADV_PRICE = "${advPrice}";
    public static final String MACRO_CTX_HASH = "${ctxhash}";
    private static final String TAG = C4958ao.class.getSimpleName();
    private String adSetAuctionMeta = null;
    private String adSetId = "";
    private LinkedList<C4948ah> ads = new LinkedList<>();
    private boolean isAuctionClosed = true;
    private String mAdType;
    private boolean mCanLoadBeforeShow;
    private JSONObject mMacros;
    private long mPlacementId;
    private String requestId = "";

    /* renamed from: a */
    public static C5352hm<C4958ao> m11231a() {
        return new C5352hm().mo40709a(new C5357hr("ads", C4958ao.class), (C5356hq) new C5354ho(new Constructor<List<C4948ah>>() {
            public final /* synthetic */ Object construct() {
                return new LinkedList();
            }
        }, C4948ah.class));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: com.inmobi.media.ah} */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        com.inmobi.media.C4953al.m11182a(r15, r2.getJSONObject(r14), r19, r21, r3);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.inmobi.media.C4958ao m11230a(org.json.JSONObject r16, long r17, java.lang.String r19, java.lang.String r20, com.inmobi.media.C5074ck r21) {
        /*
            r0 = r16
            r1 = 0
            java.lang.String r2 = "expiry"
            r3 = -1
            long r5 = r0.optLong(r2, r3)     // Catch:{ JSONException -> 0x00b8 }
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x0012
            goto L_0x0018
        L_0x0012:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ JSONException -> 0x00b8 }
            long r3 = r2.toMillis(r5)     // Catch:{ JSONException -> 0x00b8 }
        L_0x0018:
            java.lang.String r2 = "ads"
            org.json.JSONArray r2 = r0.getJSONArray(r2)     // Catch:{ JSONException -> 0x00b8 }
            int r5 = r2.length()     // Catch:{ JSONException -> 0x00b8 }
            if (r5 != 0) goto L_0x0025
            return r1
        L_0x0025:
            com.inmobi.media.hm r5 = m11231a()     // Catch:{ JSONException -> 0x00b8 }
            java.lang.Class<com.inmobi.media.ao> r6 = com.inmobi.media.C4958ao.class
            java.lang.Object r0 = r5.mo40710a((org.json.JSONObject) r0, r6)     // Catch:{ JSONException -> 0x00b8 }
            r11 = r0
            com.inmobi.media.ao r11 = (com.inmobi.media.C4958ao) r11     // Catch:{ JSONException -> 0x00b8 }
            if (r11 == 0) goto L_0x00b8
            java.lang.String r0 = r11.adSetId     // Catch:{ JSONException -> 0x00b8 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x00b8 }
            if (r0 != 0) goto L_0x00b8
            r5 = r17
            r11.mPlacementId = r5     // Catch:{ JSONException -> 0x00b8 }
            r0 = r20
            r11.requestId = r0     // Catch:{ JSONException -> 0x00b8 }
            r12 = r19
            r11.mAdType = r12     // Catch:{ JSONException -> 0x00b8 }
            r13 = 0
            r14 = 0
        L_0x004a:
            int r0 = r2.length()     // Catch:{ JSONException -> 0x00b8 }
            if (r14 >= r0) goto L_0x009e
            org.json.JSONObject r0 = r2.getJSONObject(r14)     // Catch:{ JSONException -> 0x00b8 }
            java.util.LinkedList<com.inmobi.media.ah> r5 = r11.ads     // Catch:{ JSONException -> 0x00b8 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ JSONException -> 0x00b8 }
        L_0x005a:
            boolean r6 = r5.hasNext()     // Catch:{ JSONException -> 0x00b8 }
            if (r6 == 0) goto L_0x0093
            java.lang.Object r6 = r5.next()     // Catch:{ JSONException -> 0x00b8 }
            r15 = r6
            com.inmobi.media.ah r15 = (com.inmobi.media.C4948ah) r15     // Catch:{ JSONException -> 0x00b8 }
            java.lang.String r6 = "impressionId"
            java.lang.String r6 = r0.optString(r6)     // Catch:{ JSONException -> 0x00b8 }
            java.lang.String r7 = r15.mo40036f()     // Catch:{ JSONException -> 0x00b8 }
            boolean r6 = r6.equals(r7)     // Catch:{ JSONException -> 0x00b8 }
            if (r6 == 0) goto L_0x005a
            org.json.JSONObject r6 = r2.getJSONObject(r14)     // Catch:{ Exception -> 0x0085 }
            r5 = r15
            r7 = r19
            r8 = r21
            r9 = r3
            com.inmobi.media.C4953al.m11182a(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0085 }
            goto L_0x0093
        L_0x0085:
            r0 = move-exception
            com.inmobi.media.fn r5 = com.inmobi.media.C5275fn.m12068a()     // Catch:{ JSONException -> 0x00b8 }
            com.inmobi.media.gk r6 = new com.inmobi.media.gk     // Catch:{ JSONException -> 0x00b8 }
            r6.<init>(r0)     // Catch:{ JSONException -> 0x00b8 }
            r5.mo40590a((com.inmobi.media.C5308gk) r6)     // Catch:{ JSONException -> 0x00b8 }
            goto L_0x0094
        L_0x0093:
            r15 = r1
        L_0x0094:
            if (r15 == 0) goto L_0x009b
            java.util.LinkedList<com.inmobi.media.ah> r0 = r11.ads     // Catch:{ JSONException -> 0x00b8 }
            r0.remove(r15)     // Catch:{ JSONException -> 0x00b8 }
        L_0x009b:
            int r14 = r14 + 1
            goto L_0x004a
        L_0x009e:
            java.util.LinkedList<com.inmobi.media.ah> r0 = r11.ads     // Catch:{ JSONException -> 0x00b8 }
            boolean r0 = r0.isEmpty()     // Catch:{ JSONException -> 0x00b8 }
            if (r0 != 0) goto L_0x00b4
            java.util.LinkedList<com.inmobi.media.ah> r2 = r11.ads     // Catch:{ JSONException -> 0x00b8 }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ JSONException -> 0x00b8 }
            com.inmobi.media.ah r2 = (com.inmobi.media.C4948ah) r2     // Catch:{ JSONException -> 0x00b8 }
            boolean r2 = r2.mo40042l()     // Catch:{ JSONException -> 0x00b8 }
            r11.mCanLoadBeforeShow = r2     // Catch:{ JSONException -> 0x00b8 }
        L_0x00b4:
            if (r0 == 0) goto L_0x00b7
            return r1
        L_0x00b7:
            return r11
        L_0x00b8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4958ao.m11230a(org.json.JSONObject, long, java.lang.String, java.lang.String, com.inmobi.media.ck):com.inmobi.media.ao");
    }

    /* renamed from: b */
    public final LinkedList<C4948ah> mo40099b() {
        return this.ads;
    }

    /* renamed from: c */
    public final boolean mo40100c() {
        return this.isAuctionClosed;
    }

    /* renamed from: d */
    public final String mo40101d() {
        return this.adSetId;
    }

    /* renamed from: e */
    public final String mo40102e() {
        return this.mAdType;
    }

    /* renamed from: f */
    public final String mo40103f() {
        return this.adSetAuctionMeta;
    }

    /* renamed from: g */
    public final String mo40104g() {
        return this.requestId;
    }

    /* renamed from: h */
    public final long mo40105h() {
        return this.mPlacementId;
    }

    /* renamed from: i */
    public final boolean mo40106i() {
        return this.mCanLoadBeforeShow;
    }

    /* renamed from: j */
    public final C4948ah mo40107j() {
        try {
            if (!this.ads.isEmpty()) {
                this.ads.removeFirst();
            }
        } catch (Exception unused) {
        }
        return mo40108k();
    }

    /* renamed from: k */
    public final C4948ah mo40108k() {
        try {
            if (this.ads.isEmpty()) {
                return null;
            }
            return this.ads.getFirst();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private C4948ah m11229a(String str) {
        Iterator it = this.ads.iterator();
        while (it.hasNext()) {
            C4948ah ahVar = (C4948ah) it.next();
            if (str.equals(ahVar.mo40036f())) {
                return ahVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo40098a(JSONObject jSONObject, C5220ev evVar) throws JSONException {
        if (!this.isAuctionClosed) {
            String string = jSONObject.getString(KEY_REQUEST_ID);
            JSONArray jSONArray = jSONObject.getJSONArray("ads");
            if (this.requestId.equals(string)) {
                int length = jSONArray.length();
                if (length != 0) {
                    LinkedList linkedList = new LinkedList();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String string2 = jSONObject2.getString(KEY_IMPRESSION_ID);
                        this.mMacros = jSONObject2.optJSONObject(KEY_MACROS);
                        C4948ah a = m11229a(string2);
                        if (a != null) {
                            a.mo40030a(this.mMacros);
                            C4948ah a2 = C4953al.m11178a(a, evVar);
                            if (a2 != null) {
                                JSONObject jSONObject3 = this.mMacros;
                                if (jSONObject3 != null) {
                                    if (jSONObject3.has(MACRO_ADV_PRICE)) {
                                        String string3 = this.mMacros.getString(MACRO_ADV_PRICE);
                                        try {
                                            if (a2.transaction != null) {
                                                a2.transaction.put(BUYER_PRICE, Double.parseDouble(string3));
                                                a2.mAdContent.put("transaction", a2.transaction);
                                            }
                                        } catch (Exception e) {
                                            C5275fn.m12068a().mo40590a(new C5308gk(e));
                                        }
                                    }
                                    if (this.mMacros.has(MACRO_CTX_HASH)) {
                                        String string4 = this.mMacros.getString(MACRO_CTX_HASH);
                                        try {
                                            if (a2.transaction != null) {
                                                a2.transaction.put(CTX_HASH_KEY, string4);
                                                a2.mAdContent.put("transaction", a2.transaction);
                                            }
                                        } catch (JSONException e2) {
                                            C5275fn.m12068a().mo40590a(new C5308gk(e2));
                                        }
                                    }
                                }
                                linkedList.add(a2);
                            }
                        }
                    }
                    this.ads.clear();
                    this.ads.addAll(linkedList);
                    if (!this.ads.isEmpty()) {
                        this.isAuctionClosed = true;
                        return;
                    }
                    throw new IllegalArgumentException("No matching ads to render");
                }
                throw new IllegalArgumentException("UAS response supplied doesn't have any ads");
            }
            throw new IllegalArgumentException("UAS response supplied was of a different requestId");
        }
        throw new IllegalStateException("Auction was already closed. Can't process UAS response");
    }

    /* renamed from: l */
    public final JSONObject mo40109l() {
        return this.mMacros;
    }

    /* renamed from: a */
    public final void mo40097a(C5220ev evVar, C5093cu cuVar) {
        C4948ah k = mo40108k();
        if (k != null) {
            C5089ct a = C5089ct.m11560a();
            a.f11665a.execute(new Runnable(k, evVar, cuVar) {

                /* renamed from: a */
                final /* synthetic */ C4948ah f11667a;

                /* renamed from: b */
                final /* synthetic */ C5220ev f11668b;

                /* renamed from: c */
                final /* synthetic */ C5093cu f11669c;

                {
                    this.f11667a = r2;
                    this.f11668b = r3;
                    this.f11669c = r4;
                }

                public final void run() {
                    C5089ct.m11562a(C5089ct.this, this.f11667a, this.f11668b, this.f11669c);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo40096a(C4948ah ahVar) {
        try {
            if (mo40108k() != null) {
                this.ads.removeFirst();
            }
        } catch (Exception unused) {
        }
        this.ads.addFirst(ahVar);
    }
}
