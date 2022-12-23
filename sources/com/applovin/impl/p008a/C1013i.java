package com.applovin.impl.p008a;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.network.C1496f;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.impl.sdk.utils.C1560t;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.smaato.sdk.video.vast.model.C8938Tracking;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.a.i */
public class C1013i {

    /* renamed from: a */
    private static DateFormat f1707a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* renamed from: b */
    private static Random f1708b = new Random(System.currentTimeMillis());

    /* renamed from: a */
    public static Uri m1359a(String str, long j, Uri uri, C1007d dVar, C1469j jVar) {
        if (URLUtil.isValidUrl(str)) {
            try {
                String replace = str.replace("[ERRORCODE]", Integer.toString(dVar.mo11710a()));
                if (j >= 0) {
                    replace = replace.replace("[CONTENTPLAYHEAD]", m1362a(j));
                }
                if (uri != null) {
                    replace = replace.replace("[ASSETURI]", uri.toString());
                }
                return Uri.parse(replace.replace("[CACHEBUSTING]", m1361a()).replace("[TIMESTAMP]", m1374b()));
            } catch (Throwable th) {
                C1505q v = jVar.mo13139v();
                v.mo13278b("VastUtils", "Unable to replace macros in URL string " + str, th);
                return null;
            }
        } else {
            jVar.mo13139v().mo13281e("VastUtils", "Unable to replace macros in invalid URL string.");
            return null;
        }
    }

    /* renamed from: a */
    public static C1007d m1360a(C1000a aVar) {
        if (m1375b(aVar) || m1377c(aVar)) {
            return null;
        }
        return C1007d.GENERAL_WRAPPER_ERROR;
    }

    /* renamed from: a */
    private static String m1361a() {
        return Integer.toString(f1708b.nextInt(89999999) + 10000000);
    }

    /* renamed from: a */
    private static String m1362a(long j) {
        if (j <= 0) {
            return "00:00:00.000";
        }
        long hours = TimeUnit.SECONDS.toHours(j);
        long seconds = j % TimeUnit.MINUTES.toSeconds(1);
        return String.format(Locale.US, "%02d:%02d:%02d.000", new Object[]{Long.valueOf(hours), Long.valueOf(TimeUnit.SECONDS.toMinutes(j) % TimeUnit.MINUTES.toSeconds(1)), Long.valueOf(seconds)});
    }

    /* renamed from: a */
    public static String m1363a(C1006c cVar) {
        C1560t c;
        if (cVar != null) {
            List<C1560t> b = cVar.mo11702b();
            int size = cVar.mo11702b().size();
            if (size <= 0 || (c = b.get(size - 1).mo13360c("VASTAdTagURI")) == null) {
                return null;
            }
            return c.mo13361c();
        }
        throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
    }

    /* renamed from: a */
    public static String m1364a(C1560t tVar, String str, String str2) {
        C1560t b = tVar.mo13358b(str);
        if (b != null) {
            String c = b.mo13361c();
            if (C1553o.m3554b(c)) {
                return c;
            }
        }
        return str2;
    }

    /* renamed from: a */
    private static Set<C1011g> m1365a(C1006c cVar, C1469j jVar) {
        if (cVar == null) {
            return null;
        }
        List<C1560t> b = cVar.mo11702b();
        Set<C1011g> hashSet = new HashSet<>(b.size());
        for (C1560t next : b) {
            C1560t c = next.mo13360c("Wrapper");
            if (c == null) {
                c = next.mo13360c("InLine");
            }
            hashSet = m1366a(hashSet, c != null ? c.mo13357a("Error") : next.mo13357a("Error"), cVar, jVar);
        }
        C1505q v = jVar.mo13139v();
        v.mo13277b("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
        return hashSet;
    }

    /* renamed from: a */
    private static Set<C1011g> m1366a(Set<C1011g> set, List<C1560t> list, C1006c cVar, C1469j jVar) {
        if (list != null) {
            for (C1560t a : list) {
                C1011g a2 = C1011g.m1355a(a, cVar, jVar);
                if (a2 != null) {
                    set.add(a2);
                }
            }
        }
        return set;
    }

    /* renamed from: a */
    public static void m1367a(C1006c cVar, AppLovinAdLoadListener appLovinAdLoadListener, C1007d dVar, int i, C1469j jVar) {
        if (jVar != null) {
            C1557r.m3600a(appLovinAdLoadListener, cVar.mo11707g(), i, jVar);
            m1371a(m1365a(cVar, jVar), dVar, jVar);
            return;
        }
        throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
    }

    /* renamed from: a */
    public static void m1368a(C1560t tVar, Map<String, Set<C1011g>> map, C1006c cVar, C1469j jVar) {
        List<C1560t> a;
        C1505q v;
        String str;
        if (jVar != null) {
            if (tVar == null) {
                v = jVar.mo13139v();
                str = "Unable to render event trackers; null node provided";
            } else if (map == null) {
                v = jVar.mo13139v();
                str = "Unable to render event trackers; null event trackers provided";
            } else {
                C1560t b = tVar.mo13358b("TrackingEvents");
                if (b != null && (a = b.mo13357a(C8938Tracking.NAME)) != null) {
                    for (C1560t next : a) {
                        String str2 = next.mo13359b().get("event");
                        if (C1553o.m3554b(str2)) {
                            C1011g a2 = C1011g.m1355a(next, cVar, jVar);
                            if (a2 != null) {
                                Set set = map.get(str2);
                                if (set != null) {
                                    set.add(a2);
                                } else {
                                    HashSet hashSet = new HashSet();
                                    hashSet.add(a2);
                                    map.put(str2, hashSet);
                                }
                            }
                        } else {
                            C1505q v2 = jVar.mo13139v();
                            v2.mo13281e("VastUtils", "Could not find event for tracking node = " + next);
                        }
                    }
                    return;
                }
                return;
            }
            v.mo13281e("VastUtils", str);
            return;
        }
        throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
    }

    /* renamed from: a */
    public static void m1369a(List<C1560t> list, Set<C1011g> set, C1006c cVar, C1469j jVar) {
        C1505q v;
        String str;
        if (jVar != null) {
            if (list == null) {
                v = jVar.mo13139v();
                str = "Unable to render trackers; null nodes provided";
            } else if (set == null) {
                v = jVar.mo13139v();
                str = "Unable to render trackers; null trackers provided";
            } else {
                for (C1560t a : list) {
                    C1011g a2 = C1011g.m1355a(a, cVar, jVar);
                    if (a2 != null) {
                        set.add(a2);
                    }
                }
                return;
            }
            v.mo13281e("VastUtils", str);
            return;
        }
        throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
    }

    /* renamed from: a */
    public static void m1370a(Set<C1011g> set, long j, Uri uri, C1007d dVar, C1469j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
        } else if (set != null && !set.isEmpty()) {
            for (C1011g b : set) {
                Uri a = m1359a(b.mo11724b(), j, uri, dVar, jVar);
                if (a != null) {
                    jVar.mo13073M().mo13216a(C1496f.m3253l().mo13233a(a.toString()).mo13235a(false).mo13236a(), false);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m1371a(Set<C1011g> set, C1007d dVar, C1469j jVar) {
        m1370a(set, -1, (Uri) null, dVar, jVar);
    }

    /* renamed from: a */
    public static void m1372a(Set<C1011g> set, C1469j jVar) {
        m1370a(set, -1, (Uri) null, C1007d.UNSPECIFIED, jVar);
    }

    /* renamed from: a */
    public static boolean m1373a(C1560t tVar) {
        if (tVar != null) {
            return tVar.mo13360c("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    /* renamed from: b */
    private static String m1374b() {
        f1707a.setTimeZone(TimeZone.getDefault());
        return f1707a.format(new Date());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        r1 = (r1 = r1.mo11676k()).mo11729a();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m1375b(com.applovin.impl.p008a.C1000a r1) {
        /*
            r0 = 0
            if (r1 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.applovin.impl.a.j r1 = r1.mo11676k()
            if (r1 == 0) goto L_0x0017
            java.util.List r1 = r1.mo11729a()
            if (r1 == 0) goto L_0x0017
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0017
            r0 = 1
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.p008a.C1013i.m1375b(com.applovin.impl.a.a):boolean");
    }

    /* renamed from: b */
    public static boolean m1376b(C1560t tVar) {
        if (tVar != null) {
            return tVar.mo13360c("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    /* renamed from: c */
    public static boolean m1377c(C1000a aVar) {
        C1005b m;
        C1008e b;
        if (aVar == null || (m = aVar.mo11678m()) == null || (b = m.mo11695b()) == null) {
            return false;
        }
        return b.mo11714b() != null || C1553o.m3554b(b.mo11715c());
    }
}
