package com.yandex.metrica.impl.p265ob;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import com.tapjoy.TapjoyConstants;
import com.yandex.metrica.impl.p265ob.C10474M;
import com.yandex.metrica.impl.p265ob.C10842Vf;
import com.yandex.metrica.impl.p265ob.C10883Wc;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.d2 */
public final class C11127d2 {

    /* renamed from: a */
    private static Map<C12017z6, Integer> f26673a;

    /* renamed from: b */
    private static SparseArray<C12017z6> f26674b;

    /* renamed from: c */
    private static final Map<C11413k1, Integer> f26675c;

    /* renamed from: d */
    private static final Map<C11413k1, C10958Ye> f26676d;

    /* renamed from: e */
    public static final /* synthetic */ int f26677e = 0;

    /* renamed from: com.yandex.metrica.impl.ob.d2$a */
    class C11128a implements C11529mf {
        C11128a() {
        }

        /* renamed from: a */
        public byte[] mo61983a(C10926Xe xe, C11384jh jhVar) {
            byte[] bArr;
            if (!TextUtils.isEmpty(xe.f26258b)) {
                try {
                    C10255Fg a = C10255Fg.m26312a(Base64.decode(xe.f26258b, 0));
                    C10927Xf xf = new C10927Xf();
                    String str = a.f24687a;
                    if (str == null) {
                        bArr = new byte[0];
                    } else {
                        bArr = str.getBytes();
                    }
                    xf.f26283b = bArr;
                    xf.f26285d = a.f24688b;
                    xf.f26284c = a.f24689c;
                    int ordinal = a.f24690d.ordinal();
                    int i = 2;
                    if (ordinal == 1) {
                        i = 1;
                    } else if (ordinal != 2) {
                        i = 0;
                    }
                    xf.f26286e = i;
                    return C11169e.m28804a((C11169e) xf);
                } catch (Throwable unused) {
                }
            }
            return new byte[0];
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.d2$b */
    class C11129b implements C10991Ze {
        C11129b() {
        }

        /* renamed from: a */
        public Integer mo62579a(C10926Xe xe) {
            return xe.f26267k;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        C12017z6 z6Var = C12017z6.FOREGROUND;
        hashMap.put(z6Var, 0);
        C12017z6 z6Var2 = C12017z6.BACKGROUND;
        hashMap.put(z6Var2, 1);
        f26673a = Collections.unmodifiableMap(hashMap);
        SparseArray<C12017z6> sparseArray = new SparseArray<>();
        sparseArray.put(0, z6Var);
        sparseArray.put(1, z6Var2);
        f26674b = sparseArray;
        HashMap hashMap2 = new HashMap();
        C11413k1 k1Var = C11413k1.EVENT_TYPE_INIT;
        hashMap2.put(k1Var, 1);
        C11413k1 k1Var2 = C11413k1.EVENT_TYPE_REGULAR;
        hashMap2.put(k1Var2, 4);
        C11413k1 k1Var3 = C11413k1.EVENT_TYPE_SEND_REFERRER;
        hashMap2.put(k1Var3, 5);
        C11413k1 k1Var4 = C11413k1.EVENT_TYPE_ALIVE;
        hashMap2.put(k1Var4, 7);
        C11413k1 k1Var5 = C11413k1.EVENT_TYPE_EXCEPTION_UNHANDLED;
        hashMap2.put(k1Var5, 3);
        C11413k1 k1Var6 = C11413k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        hashMap2.put(k1Var6, 26);
        C11413k1 k1Var7 = C11413k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT;
        hashMap2.put(k1Var7, 26);
        C11413k1 k1Var8 = C11413k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(k1Var8, 26);
        C11413k1 k1Var9 = C11413k1.EVENT_TYPE_ANR;
        hashMap2.put(k1Var9, 25);
        C11413k1 k1Var10 = C11413k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        hashMap2.put(k1Var10, 3);
        C11413k1 k1Var11 = C11413k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(k1Var11, 26);
        C11413k1 k1Var12 = C11413k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH;
        hashMap2.put(k1Var12, 3);
        C11413k1 k1Var13 = C11413k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(k1Var13, 26);
        C11413k1 k1Var14 = C11413k1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF;
        hashMap2.put(k1Var14, 26);
        C11413k1 k1Var15 = k1Var;
        C11413k1 k1Var16 = C11413k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(k1Var16, 26);
        C11413k1 k1Var17 = C11413k1.EVENT_TYPE_EXCEPTION_USER;
        C11413k1 k1Var18 = k1Var9;
        hashMap2.put(k1Var17, 6);
        C11413k1 k1Var19 = C11413k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        C11413k1 k1Var20 = k1Var8;
        hashMap2.put(k1Var19, 27);
        C11413k1 k1Var21 = k1Var7;
        C11413k1 k1Var22 = C11413k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        hashMap2.put(k1Var22, 27);
        C11413k1 k1Var23 = C11413k1.EVENT_TYPE_IDENTITY;
        C11413k1 k1Var24 = k1Var6;
        hashMap2.put(k1Var23, 8);
        C11413k1 k1Var25 = k1Var5;
        hashMap2.put(C11413k1.EVENT_TYPE_IDENTITY_LIGHT, 28);
        C11413k1 k1Var26 = C11413k1.EVENT_TYPE_STATBOX;
        hashMap2.put(k1Var26, 11);
        C11413k1 k1Var27 = C11413k1.EVENT_TYPE_SET_USER_INFO;
        C11413k1 k1Var28 = k1Var26;
        hashMap2.put(k1Var27, 12);
        C11413k1 k1Var29 = k1Var27;
        C11413k1 k1Var30 = C11413k1.EVENT_TYPE_REPORT_USER_INFO;
        hashMap2.put(k1Var30, 12);
        C11413k1 k1Var31 = C11413k1.EVENT_TYPE_FIRST_ACTIVATION;
        C11413k1 k1Var32 = k1Var30;
        hashMap2.put(k1Var31, 13);
        C11413k1 k1Var33 = C11413k1.EVENT_TYPE_START;
        C11413k1 k1Var34 = k1Var31;
        hashMap2.put(k1Var33, 2);
        C11413k1 k1Var35 = C11413k1.EVENT_TYPE_APP_OPEN;
        C11413k1 k1Var36 = k1Var33;
        hashMap2.put(k1Var35, 16);
        C11413k1 k1Var37 = C11413k1.EVENT_TYPE_APP_UPDATE;
        C11413k1 k1Var38 = k1Var35;
        hashMap2.put(k1Var37, 17);
        C11413k1 k1Var39 = C11413k1.EVENT_TYPE_PERMISSIONS;
        C11413k1 k1Var40 = k1Var37;
        hashMap2.put(k1Var39, 18);
        C11413k1 k1Var41 = C11413k1.EVENT_TYPE_APP_FEATURES;
        C11413k1 k1Var42 = k1Var39;
        hashMap2.put(k1Var41, 19);
        C11413k1 k1Var43 = C11413k1.EVENT_TYPE_SEND_USER_PROFILE;
        C11413k1 k1Var44 = k1Var41;
        hashMap2.put(k1Var43, 20);
        C11413k1 k1Var45 = C11413k1.EVENT_TYPE_SEND_REVENUE_EVENT;
        C11413k1 k1Var46 = k1Var43;
        hashMap2.put(k1Var45, 21);
        C11413k1 k1Var47 = C11413k1.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        C11413k1 k1Var48 = k1Var45;
        hashMap2.put(k1Var47, 40);
        C11413k1 k1Var49 = C11413k1.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        C11413k1 k1Var50 = k1Var47;
        hashMap2.put(k1Var49, 35);
        C11413k1 k1Var51 = k1Var49;
        hashMap2.put(C11413k1.EVENT_TYPE_CLEANUP, 29);
        C11413k1 k1Var52 = C11413k1.EVENT_TYPE_VIEW_TREE;
        hashMap2.put(k1Var52, 30);
        C11413k1 k1Var53 = C11413k1.EVENT_TYPE_RAW_VIEW_TREE;
        C11413k1 k1Var54 = k1Var52;
        hashMap2.put(k1Var53, 34);
        C11413k1 k1Var55 = C11413k1.EVENT_TYPE_STATBOX_EXP;
        C11413k1 k1Var56 = k1Var53;
        hashMap2.put(k1Var55, 36);
        C11413k1 k1Var57 = C11413k1.EVENT_TYPE_WEBVIEW_SYNC;
        C11413k1 k1Var58 = k1Var55;
        hashMap2.put(k1Var57, 38);
        f26675c = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        C10783Te te = new C10783Te();
        C11413k1 k1Var59 = k1Var57;
        C10886We we = new C10886We();
        C11413k1 k1Var60 = k1Var23;
        C10809Ue ue = new C10809Ue();
        C11413k1 k1Var61 = k1Var22;
        C10670Qe qe = new C10670Qe();
        C11413k1 k1Var62 = k1Var19;
        C11492lf lfVar = new C11492lf();
        C11413k1 k1Var63 = k1Var17;
        C11315hf hfVar = new C11315hf();
        C11413k1 k1Var64 = k1Var16;
        C10958Ye a = C10958Ye.m28295a().mo62545a((C11529mf) hfVar).mo62540a((C10841Ve) hfVar).mo62546a();
        C10958Ye a2 = C10958Ye.m28295a().mo62545a((C11529mf) we).mo62546a();
        C10886We we2 = we;
        C10958Ye a3 = C10958Ye.m28295a().mo62545a((C11529mf) qe).mo62546a();
        C10670Qe qe2 = qe;
        C10958Ye a4 = C10958Ye.m28295a().mo62545a((C11529mf) lfVar).mo62546a();
        C10958Ye ye = a4;
        C10958Ye a5 = C10958Ye.m28295a().mo62545a((C11529mf) new C11563nf()).mo62546a();
        hashMap3.put(k1Var2, a2);
        hashMap3.put(k1Var3, C10958Ye.m28295a().mo62545a((C11529mf) new C11128a()).mo62546a());
        hashMap3.put(k1Var4, C10958Ye.m28295a().mo62543a((C11208ef) te).mo62545a((C11529mf) ue).mo62542a((C11151df) new C10704Re()).mo62544a((C11242ff) new C10751Se()).mo62546a());
        hashMap3.put(k1Var10, a);
        hashMap3.put(k1Var12, a);
        hashMap3.put(k1Var11, a);
        hashMap3.put(k1Var13, a);
        hashMap3.put(k1Var14, a);
        hashMap3.put(k1Var64, a);
        hashMap3.put(k1Var63, a2);
        hashMap3.put(k1Var62, a3);
        hashMap3.put(k1Var61, a3);
        hashMap3.put(k1Var60, C10958Ye.m28295a().mo62545a((C11529mf) we2).mo62540a((C10841Ve) new C11112cf()).mo62546a());
        hashMap3.put(k1Var28, a2);
        hashMap3.put(k1Var29, a2);
        hashMap3.put(k1Var32, a2);
        hashMap3.put(k1Var25, a2);
        hashMap3.put(k1Var24, a3);
        hashMap3.put(k1Var21, a3);
        hashMap3.put(k1Var20, a3);
        hashMap3.put(k1Var18, a3);
        hashMap3.put(k1Var36, C10958Ye.m28295a().mo62543a((C11208ef) new C10783Te()).mo62545a((C11529mf) qe2).mo62546a());
        hashMap3.put(C11413k1.EVENT_TYPE_CUSTOM_EVENT, C10958Ye.m28295a().mo62541a((C10991Ze) new C11129b()).mo62546a());
        hashMap3.put(k1Var38, a2);
        C10958Ye a6 = C10958Ye.m28295a().mo62543a((C11208ef) te).mo62546a();
        hashMap3.put(k1Var42, a6);
        hashMap3.put(k1Var44, a6);
        hashMap3.put(k1Var46, a3);
        hashMap3.put(k1Var48, a3);
        hashMap3.put(k1Var50, a3);
        hashMap3.put(k1Var51, ye);
        hashMap3.put(k1Var54, a2);
        hashMap3.put(k1Var56, a2);
        hashMap3.put(k1Var15, a5);
        hashMap3.put(k1Var40, a5);
        hashMap3.put(k1Var34, a2);
        hashMap3.put(k1Var58, a2);
        hashMap3.put(k1Var59, a2);
        f26676d = Collections.unmodifiableMap(hashMap3);
    }

    /* renamed from: a */
    public static C10842Vf.C10853f m28681a(ContentValues contentValues) {
        Long asLong = contentValues.getAsLong("start_time");
        Long asLong2 = contentValues.getAsLong("server_time_offset");
        Boolean asBoolean = contentValues.getAsBoolean("obtained_before_first_sync");
        C10842Vf.C10853f fVar = new C10842Vf.C10853f();
        if (asLong != null) {
            fVar.f26084b = asLong.longValue();
            fVar.f26085c = C11327i.m29162a(asLong.longValue());
        }
        if (asLong2 != null) {
            fVar.f26086d = asLong2.longValue();
        }
        if (asBoolean != null) {
            fVar.f26087e = asBoolean.booleanValue();
        }
        return fVar;
    }

    /* renamed from: b */
    public static C10784Tf[] m28688b(JSONArray jSONArray) {
        try {
            C10784Tf[] tfArr = new C10784Tf[jSONArray.length()];
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        tfArr[i] = m28686b(optJSONObject);
                    }
                    i++;
                } catch (Throwable unused) {
                    return tfArr;
                }
            }
            return tfArr;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: b */
    public static C10784Tf m28686b(JSONObject jSONObject) {
        C10784Tf tf = new C10784Tf();
        int optInt = jSONObject.optInt("signal_strength", tf.f25860c);
        if (optInt != -1) {
            tf.f25860c = optInt;
        }
        tf.f25859b = jSONObject.optInt("cell_id", tf.f25859b);
        tf.f25861d = jSONObject.optInt("lac", tf.f25861d);
        tf.f25862e = jSONObject.optInt(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, tf.f25862e);
        tf.f25863f = jSONObject.optInt("operator_id", tf.f25863f);
        tf.f25864g = jSONObject.optString("operator_name", tf.f25864g);
        tf.f25865h = jSONObject.optBoolean("is_connected", tf.f25865h);
        tf.f25866i = jSONObject.optInt("cell_type", 0);
        tf.f25867j = jSONObject.optInt("pci", tf.f25867j);
        tf.f25868k = jSONObject.optLong("last_visible_time_offset", tf.f25868k);
        tf.f25869l = jSONObject.optInt("lte_rsrq", tf.f25869l);
        tf.f25870m = jSONObject.optInt("lte_rssnr", tf.f25870m);
        tf.f25872o = jSONObject.optInt("arfcn", tf.f25872o);
        tf.f25871n = jSONObject.optInt("lte_rssi", tf.f25871n);
        tf.f25873p = jSONObject.optInt("lte_bandwidth", tf.f25873p);
        tf.f25874q = jSONObject.optInt("lte_cqi", tf.f25874q);
        return tf;
    }

    /* renamed from: a */
    static C12017z6 m28684a(int i) {
        C12017z6 z6Var = f26674b.get(i);
        return z6Var == null ? C12017z6.FOREGROUND : z6Var;
    }

    /* renamed from: a */
    public static C10887Wf[] m28685a(JSONArray jSONArray) {
        try {
            C10887Wf[] wfArr = new C10887Wf[jSONArray.length()];
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    wfArr[i] = m28682a(jSONArray.getJSONObject(i));
                    i++;
                } catch (Throwable unused) {
                    return wfArr;
                }
            }
            return wfArr;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private static C10887Wf m28682a(JSONObject jSONObject) {
        try {
            C10887Wf wf = new C10887Wf();
            wf.f26164b = jSONObject.getString("mac");
            wf.f26165c = jSONObject.getInt("signal_strength");
            wf.f26166d = jSONObject.getString("ssid");
            wf.f26167e = jSONObject.optBoolean("is_connected");
            wf.f26168f = jSONObject.optLong("last_visible_offset_seconds", 0);
            return wf;
        } catch (Throwable unused) {
            C10887Wf wf2 = new C10887Wf();
            wf2.f26164b = jSONObject.optString("mac");
            return wf2;
        }
    }

    /* renamed from: a */
    static int m28680a(C12017z6 z6Var) {
        Integer num = f26673a.get(z6Var);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: a */
    public static C10958Ye m28683a(C11413k1 k1Var) {
        C10958Ye ye = k1Var != null ? f26676d.get(k1Var) : null;
        return ye == null ? C10958Ye.m28297b() : ye;
    }

    /* renamed from: b */
    public static Integer m28687b(C11413k1 k1Var) {
        if (k1Var == null) {
            return null;
        }
        return f26675c.get(k1Var);
    }

    /* renamed from: a */
    public static int m28678a(C10474M.C10476b.C10477a aVar) {
        int ordinal = aVar.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public static int m28679a(C10883Wc.C10884a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 1) {
            return 0;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? 3 : 2;
        }
        return 1;
    }
}
