package com.tapjoy.internal;

import com.appsflyer.ServerParameters;
import com.appsflyer.internal.referrer.Payload;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.purchasing.core.TransactionDetailsUtilities;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.tapjoy.internal.hp */
public final class C9379hp {
    /* renamed from: a */
    public static String m25206a(C9247fa faVar) {
        C9092bh b = new C9092bh().mo57844c().mo57838a("sdk").mo57843b(faVar.f22776t).mo57838a("os_name").mo57843b(faVar.f22767k).mo57838a("os_ver").mo57843b(faVar.f22768l).mo57838a("device_id").mo57843b(faVar.f22764h).mo57838a("device_maker").mo57843b(faVar.f22765i).mo57838a("device_model").mo57843b(faVar.f22766j).mo57838a(TapjoyConstants.TJC_PACKAGE_ID).mo57843b(faVar.f22774r).mo57838a(TapjoyConstants.TJC_PACKAGE_SIGN).mo57843b(faVar.f22775s).mo57838a("locale").mo57843b(faVar.f22772p).mo57838a(TapjoyConstants.TJC_DEVICE_TIMEZONE).mo57843b(faVar.f22773q);
        if (faVar.f22769m != null) {
            b.mo57838a(TapjoyConstants.TJC_DEVICE_DISPLAY_DENSITY).mo57837a((Number) faVar.f22769m);
        }
        if (faVar.f22770n != null) {
            b.mo57838a(TapjoyConstants.TJC_DEVICE_DISPLAY_WIDTH).mo57837a((Number) faVar.f22770n);
        }
        if (faVar.f22771o != null) {
            b.mo57838a(TapjoyConstants.TJC_DEVICE_DISPLAY_HEIGHT).mo57837a((Number) faVar.f22771o);
        }
        if (faVar.f22763g != null) {
            b.mo57838a("mac").mo57843b(faVar.f22763g);
        }
        if (faVar.f22777u != null) {
            b.mo57838a(TapjoyConstants.TJC_DEVICE_COUNTRY_SIM).mo57843b(faVar.f22777u);
        }
        if (faVar.f22778v != null) {
            b.mo57838a("country_net").mo57843b(faVar.f22778v);
        }
        if (faVar.f22779w != null) {
            b.mo57838a(ServerParameters.IMEI).mo57843b(faVar.f22779w);
        }
        if (faVar.f22780x != null) {
            b.mo57838a("android_id").mo57843b(faVar.f22780x);
        }
        return b.mo57845d().toString();
    }

    /* renamed from: a */
    public static String m25202a(C9229eu euVar) {
        C9092bh c = new C9092bh().mo57844c();
        if (euVar.f22662e != null) {
            c.mo57838a(TapjoyConstants.TJC_PACKAGE_VERSION).mo57843b(euVar.f22662e);
        }
        if (euVar.f22663f != null) {
            c.mo57838a(TapjoyConstants.TJC_PACKAGE_REVISION).mo57837a((Number) euVar.f22663f);
        }
        if (euVar.f22664g != null) {
            c.mo57838a("data_ver").mo57843b(euVar.f22664g);
        }
        if (euVar.f22665h != null) {
            c.mo57838a(TapjoyConstants.TJC_INSTALLER).mo57843b(euVar.f22665h);
        }
        if (euVar.f22666i != null) {
            c.mo57838a("store").mo57843b(euVar.f22666i);
        }
        return c.mo57845d().toString();
    }

    /* renamed from: a */
    public static String m25207a(C9268fh fhVar) {
        return m25208a(fhVar, (C9232ev) null);
    }

    /* renamed from: a */
    private static String m25208a(C9268fh fhVar, C9232ev evVar) {
        String b;
        C9092bh c = new C9092bh().mo57844c();
        if (fhVar.f22895s != null) {
            c.mo57838a(TapjoyConstants.TJC_INSTALLED).mo57837a((Number) fhVar.f22895s);
        }
        if (fhVar.f22896t != null) {
            c.mo57838a("referrer").mo57843b(fhVar.f22896t);
        }
        if (fhVar.f22883G != null) {
            c.mo57838a("idfa").mo57843b(fhVar.f22883G);
            if (fhVar.f22884H != null && fhVar.f22884H.booleanValue()) {
                c.mo57838a("idfa_optout").mo57835a(1);
            }
        } else if (!(evVar == null || evVar.f22699r == null || !C9357hc.f23153a.equals(evVar.f22699r) || (b = C9376hn.m25197b()) == null)) {
            c.mo57838a("idfa").mo57843b(b);
            if (C9376hn.m25198c()) {
                c.mo57838a("idfa_optout").mo57835a(1);
            }
        }
        if (fhVar.f22897u != null) {
            c.mo57838a(TapjoyConstants.TJC_USER_WEEKLY_FREQUENCY).mo57835a((long) Math.max(fhVar.f22897u.intValue(), 1));
        }
        if (fhVar.f22898v != null) {
            c.mo57838a(TapjoyConstants.TJC_USER_MONTHLY_FREQUENCY).mo57835a((long) Math.max(fhVar.f22898v.intValue(), 1));
        }
        if (fhVar.f22899w.size() > 0) {
            ArrayList arrayList = new ArrayList(fhVar.f22899w.size());
            for (C9259fe feVar : fhVar.f22899w) {
                if (feVar.f22851h != null) {
                    arrayList.add(feVar.f22849f);
                }
            }
            if (!arrayList.isEmpty()) {
                c.mo57838a("push").mo57834a();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c.mo57843b((String) it.next());
                }
                c.mo57842b();
            }
        }
        c.mo57838a("session").mo57844c();
        if (fhVar.f22900x != null) {
            c.mo57838a("total_count").mo57837a((Number) fhVar.f22900x);
        }
        if (fhVar.f22901y != null) {
            c.mo57838a("total_length").mo57837a((Number) fhVar.f22901y);
        }
        if (fhVar.f22902z != null) {
            c.mo57838a("last_at").mo57837a((Number) fhVar.f22902z);
        }
        if (fhVar.f22877A != null) {
            c.mo57838a("last_length").mo57837a((Number) fhVar.f22877A);
        }
        c.mo57845d();
        c.mo57838a(FirebaseAnalytics.Event.PURCHASE).mo57844c();
        if (fhVar.f22878B != null) {
            c.mo57838a("currency").mo57843b(fhVar.f22878B);
        }
        if (fhVar.f22879C != null) {
            c.mo57838a("total_count").mo57837a((Number) fhVar.f22879C);
        }
        if (fhVar.f22880D != null) {
            c.mo57838a("total_price").mo57837a((Number) fhVar.f22880D);
        }
        if (fhVar.f22881E != null) {
            c.mo57838a("last_at").mo57837a((Number) fhVar.f22881E);
        }
        if (fhVar.f22882F != null) {
            c.mo57838a("last_price").mo57837a((Number) fhVar.f22882F);
        }
        c.mo57845d();
        if (fhVar.f22885I != null) {
            c.mo57838a("user_id").mo57843b(fhVar.f22885I);
        }
        if (fhVar.f22886J != null) {
            c.mo57838a(TapjoyConstants.TJC_USER_LEVEL).mo57837a((Number) fhVar.f22886J);
        }
        if (fhVar.f22887K != null) {
            c.mo57838a(TapjoyConstants.TJC_USER_FRIEND_COUNT).mo57837a((Number) fhVar.f22887K);
        }
        if (fhVar.f22888L != null) {
            c.mo57838a(TapjoyConstants.TJC_USER_VARIABLE_1).mo57843b(fhVar.f22888L);
        }
        if (fhVar.f22889M != null) {
            c.mo57838a(TapjoyConstants.TJC_USER_VARIABLE_2).mo57843b(fhVar.f22889M);
        }
        if (fhVar.f22890N != null) {
            c.mo57838a(TapjoyConstants.TJC_USER_VARIABLE_3).mo57843b(fhVar.f22890N);
        }
        if (fhVar.f22891O != null) {
            c.mo57838a(TapjoyConstants.TJC_USER_VARIABLE_4).mo57843b(fhVar.f22891O);
        }
        if (fhVar.f22892P != null) {
            c.mo57838a(TapjoyConstants.TJC_USER_VARIABLE_5).mo57843b(fhVar.f22892P);
        }
        if (fhVar.f22893Q.size() > 0) {
            c.mo57838a("tags").mo57839a((Collection) fhVar.f22893Q);
        }
        if (Boolean.TRUE.equals(fhVar.f22894R)) {
            c.mo57838a("push_optout").mo57835a(1);
        }
        return c.mo57845d().toString();
    }

    /* renamed from: a */
    private static String m25203a(C9232ev evVar, boolean z, boolean z2, boolean z3) {
        C9092bh b = new C9092bh().mo57844c().mo57838a("type").mo57843b(m25205a(evVar.f22695n)).mo57838a("name").mo57843b(evVar.f22696o);
        b.mo57838a("time");
        if (evVar.f22698q != null) {
            b.mo57837a((Number) evVar.f22697p);
            b.mo57838a("systime").mo57837a((Number) evVar.f22698q);
        } else if (!C9503v.m25546c() || evVar.f22699r == null || evVar.f22700s == null || !C9357hc.f23153a.equals(evVar.f22699r)) {
            b.mo57837a((Number) evVar.f22697p);
        } else {
            b.mo57835a(C9503v.m25542a(evVar.f22700s.longValue()));
            b.mo57838a("systime").mo57837a((Number) evVar.f22697p);
        }
        if (evVar.f22701t != null) {
            b.mo57838a("duration").mo57837a((Number) evVar.f22701t);
        }
        if (!z && evVar.f22702u != null) {
            b.mo57838a(TJAdUnitConstants.String.VIDEO_INFO).mo57836a((C9099bl) new C9100bm(m25206a(evVar.f22702u)));
        }
        if (!z2 && evVar.f22703v != null) {
            b.mo57838a(TapjoyConstants.TJC_APP_PLACEMENT).mo57836a((C9099bl) new C9100bm(m25202a(evVar.f22703v)));
        }
        if (!z3 && evVar.f22704w != null) {
            b.mo57838a("user").mo57836a((C9099bl) new C9100bm(m25208a(evVar.f22704w, evVar)));
        }
        if (evVar.f22706y != null) {
            b.mo57838a("event_seq").mo57837a((Number) evVar.f22706y);
        }
        if (evVar.f22707z != null) {
            C9092bh a = b.mo57838a("event_prev");
            C9238ex exVar = evVar.f22707z;
            C9092bh b2 = new C9092bh().mo57844c().mo57838a("type").mo57843b(m25205a(exVar.f22738e)).mo57838a("name").mo57843b(exVar.f22739f);
            if (exVar.f22740g != null) {
                b2.mo57838a("category").mo57843b(exVar.f22740g);
            }
            a.mo57836a((C9099bl) new C9100bm(b2.mo57845d().toString()));
        }
        if (evVar.f22683A != null) {
            C9092bh a2 = b.mo57838a(FirebaseAnalytics.Event.PURCHASE);
            C9256fd fdVar = evVar.f22683A;
            C9092bh b3 = new C9092bh().mo57844c().mo57838a("product_id").mo57843b(fdVar.f22818h);
            if (fdVar.f22819i != null) {
                b3.mo57838a("product_quantity").mo57837a((Number) fdVar.f22819i);
            }
            if (fdVar.f22820j != null) {
                b3.mo57838a("product_price").mo57837a((Number) fdVar.f22820j);
            }
            if (fdVar.f22821k != null) {
                b3.mo57838a("product_price_currency").mo57843b(fdVar.f22821k);
            }
            if (fdVar.f22829s != null) {
                b3.mo57838a("currency_price").mo57843b(fdVar.f22829s);
            }
            if (fdVar.f22822l != null) {
                b3.mo57838a("product_type").mo57843b(fdVar.f22822l);
            }
            if (fdVar.f22823m != null) {
                b3.mo57838a("product_title").mo57843b(fdVar.f22823m);
            }
            if (fdVar.f22824n != null) {
                b3.mo57838a("product_description").mo57843b(fdVar.f22824n);
            }
            if (fdVar.f22825o != null) {
                b3.mo57838a("transaction_id").mo57843b(fdVar.f22825o);
            }
            if (fdVar.f22826p != null) {
                b3.mo57838a("transaction_state").mo57837a((Number) fdVar.f22826p);
            }
            if (fdVar.f22827q != null) {
                b3.mo57838a("transaction_date").mo57837a((Number) fdVar.f22827q);
            }
            if (fdVar.f22828r != null) {
                b3.mo57838a("campaign_id").mo57843b(fdVar.f22828r);
            }
            if (fdVar.f22830t != null) {
                b3.mo57838a(TransactionDetailsUtilities.RECEIPT).mo57843b(fdVar.f22830t);
            }
            if (fdVar.f22831u != null) {
                b3.mo57838a(InAppPurchaseMetaData.KEY_SIGNATURE).mo57843b(fdVar.f22831u);
            }
            a2.mo57836a((C9099bl) new C9100bm(b3.mo57845d().toString()));
        }
        if (evVar.f22684B != null) {
            b.mo57838a("exception").mo57843b(evVar.f22684B);
        }
        try {
            if (evVar.f22686D != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (evVar.f22685C != null) {
                    C9101bn.m24359b(evVar.f22685C).mo57855a((Map) linkedHashMap);
                }
                C9253fc fcVar = evVar.f22686D;
                if (fcVar.f22807d != null) {
                    linkedHashMap.put("fq7_change", fcVar.f22807d);
                }
                if (fcVar.f22808e != null) {
                    linkedHashMap.put("fq30_change", fcVar.f22808e);
                }
                if (fcVar.f22809f != null) {
                    linkedHashMap.put(TJAdUnitConstants.PARAM_PUSH_ID, fcVar.f22809f);
                }
                b.mo57838a(ServerParameters.META).mo57840a((Map) linkedHashMap);
            } else if (evVar.f22685C != null) {
                b.mo57838a(ServerParameters.META).mo57836a((C9099bl) new C9100bm(evVar.f22685C));
            }
        } catch (IOException unused) {
        }
        if (evVar.f22691I != null) {
            b.mo57838a(TJAdUnitConstants.String.USAGE_TRACKER_DIMENSIONS).mo57836a((C9099bl) new C9100bm(evVar.f22691I));
        }
        if (evVar.f22692J != null) {
            b.mo57838a("count").mo57837a((Number) evVar.f22692J);
        }
        if (evVar.f22693K != null) {
            b.mo57838a("first_time").mo57837a((Number) evVar.f22693K);
        }
        if (evVar.f22694L != null) {
            b.mo57838a("last_time").mo57837a((Number) evVar.f22694L);
        }
        if (evVar.f22687E != null) {
            b.mo57838a("category").mo57843b(evVar.f22687E);
        }
        if (evVar.f22688F != null) {
            b.mo57838a("p1").mo57843b(evVar.f22688F);
        }
        if (evVar.f22689G != null) {
            b.mo57838a("p2").mo57843b(evVar.f22689G);
        }
        if (evVar.f22690H.size() > 0) {
            b.mo57838a(TJAdUnitConstants.String.USAGE_TRACKER_VALUES).mo57844c();
            for (C9243ez ezVar : evVar.f22690H) {
                b.mo57838a(ezVar.f22748e).mo57837a((Number) ezVar.f22749f);
            }
            b.mo57845d();
        }
        return b.mo57845d().toString();
    }

    /* renamed from: a */
    public static String m25204a(C9235ew ewVar) {
        boolean z;
        boolean z2;
        C9092bh a = new C9092bh().mo57834a();
        C9247fa faVar = null;
        C9229eu euVar = null;
        C9268fh fhVar = null;
        for (C9232ev evVar : ewVar.f22734d) {
            boolean z3 = true;
            if (faVar == null || !faVar.equals(evVar.f22702u)) {
                faVar = evVar.f22702u;
                z = false;
            } else {
                z = true;
            }
            if (euVar == null || !euVar.equals(evVar.f22703v)) {
                euVar = evVar.f22703v;
                z2 = false;
            } else {
                z2 = true;
            }
            if (fhVar == null || !fhVar.equals(evVar.f22704w)) {
                fhVar = evVar.f22704w;
                z3 = false;
            }
            a.mo57836a((C9099bl) new C9100bm(m25203a(evVar, z, z2, z3)));
        }
        return a.mo57842b().toString();
    }

    /* renamed from: com.tapjoy.internal.hp$1 */
    static /* synthetic */ class C93801 {

        /* renamed from: a */
        static final /* synthetic */ int[] f23248a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tapjoy.internal.ey[] r0 = com.tapjoy.internal.C9241ey.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23248a = r0
                com.tapjoy.internal.ey r1 = com.tapjoy.internal.C9241ey.APP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23248a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tapjoy.internal.ey r1 = com.tapjoy.internal.C9241ey.CAMPAIGN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23248a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tapjoy.internal.ey r1 = com.tapjoy.internal.C9241ey.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23248a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tapjoy.internal.ey r1 = com.tapjoy.internal.C9241ey.USAGES     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9379hp.C93801.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static String m25205a(C9241ey eyVar) {
        int i = C93801.f23248a[eyVar.ordinal()];
        if (i == 1) {
            return TapjoyConstants.TJC_APP_PLACEMENT;
        }
        if (i == 2) {
            return "campaign";
        }
        if (i == 3) {
            return Payload.CUSTOM;
        }
        if (i == 4) {
            return "usages";
        }
        throw new RuntimeException();
    }
}
