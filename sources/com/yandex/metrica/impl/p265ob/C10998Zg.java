package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.yandex.metrica.impl.p265ob.C10255Fg;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Zg */
public final class C10998Zg {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10264Fm<C10255Fg.C10256a, Integer> f26456a;

    /* renamed from: b */
    private final long f26457b;

    /* renamed from: c */
    private final String f26458c;

    /* renamed from: d */
    private final String f26459d;

    /* renamed from: e */
    private final Context f26460e;

    /* renamed from: f */
    private final C10898Wn f26461f;

    /* renamed from: g */
    private final C10868W0 f26462g;

    /* renamed from: com.yandex.metrica.impl.ob.Zg$a */
    public static final class C10999a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues((Comparable) ((Pair) t).getSecond(), (Comparable) ((Pair) t2).getSecond());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Zg$b */
    static final class C11000b<T> implements Comparator<C10255Fg> {

        /* renamed from: a */
        final /* synthetic */ C10998Zg f26463a;

        C11000b(C10998Zg zg) {
            this.f26463a = zg;
        }

        /* renamed from: a */
        public final int compare(C10255Fg fg, C10255Fg fg2) {
            int sign = MathKt.getSign(fg.f24689c - fg2.f24689c);
            if (sign != 0) {
                return sign;
            }
            int intValue = ((Number) this.f26463a.f26456a.mo61334a(fg.f24690d)).intValue();
            Object a = this.f26463a.f26456a.mo61334a(fg2.f24690d);
            Intrinsics.checkNotNullExpressionValue(a, "sourcePriorities[second.source]");
            return intValue - ((Number) a).intValue();
        }
    }

    public C10998Zg(Context context, C10898Wn wn, C10868W0 w0) {
        this.f26460e = context;
        this.f26461f = wn;
        this.f26462g = w0;
        C10264Fm<C10255Fg.C10256a, Integer> fm = new C10264Fm<>(0);
        fm.mo61336a(C10255Fg.C10256a.HMS, 1);
        fm.mo61336a(C10255Fg.C10256a.GP, 2);
        this.f26456a = fm;
        this.f26457b = TimeUnit.DAYS.toSeconds(1);
        this.f26458c = "com.android.vending";
        this.f26459d = "com.huawei.appmarket";
    }

    /* renamed from: c */
    private final JSONObject m28390c(C10255Fg fg) {
        JSONObject put = new JSONObject().put("referrer", fg.f24687a).put("install_timestamp_seconds", fg.f24689c).put("click_timestamp_seconds", fg.f24688b).put("source", fg.f24690d.f24695a);
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n           …eferrerInfo.source.value)");
        return put;
    }

    /* renamed from: b */
    public final boolean mo62588b(C10255Fg fg) {
        String str = fg != null ? fg.f24687a : null;
        return !(str == null || str.length() == 0);
    }

    /* renamed from: a */
    public final boolean mo62587a(C10255Fg fg) {
        if (fg == null) {
            return false;
        }
        C10898Wn wn = this.f26461f;
        Context context = this.f26460e;
        String packageName = context.getPackageName();
        wn.getClass();
        String str = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (C10796U2.m27890a(30)) {
                str = C10940Xn.m28233a(packageManager, packageName);
            } else {
                str = packageManager.getInstallerPackageName(packageName);
            }
        } catch (Throwable unused) {
        }
        int ordinal = fg.f24690d.ordinal();
        if (ordinal == 1) {
            return Intrinsics.areEqual((Object) this.f26458c, (Object) str);
        }
        if (ordinal != 2) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.f26459d, (Object) str);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C10998Zg(android.content.Context r1, com.yandex.metrica.impl.p265ob.C10898Wn r2, com.yandex.metrica.impl.p265ob.C10868W0 r3, int r4) {
        /*
            r0 = this;
            r2 = r4 & 2
            r3 = 0
            if (r2 == 0) goto L_0x000b
            com.yandex.metrica.impl.ob.Wn r2 = new com.yandex.metrica.impl.ob.Wn
            r2.<init>()
            goto L_0x000c
        L_0x000b:
            r2 = r3
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0019
            com.yandex.metrica.impl.ob.W0 r3 = com.yandex.metrica.impl.p265ob.C10611Oh.m27142a()
            java.lang.String r4 = "YandexMetricaSelfReportFacade.getReporter()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
        L_0x0019:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10998Zg.<init>(android.content.Context, com.yandex.metrica.impl.ob.Wn, com.yandex.metrica.impl.ob.W0, int):void");
    }

    /* renamed from: a */
    public final C10255Fg mo62586a(List<C10255Fg> list) {
        C10255Fg fg = null;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        C10898Wn wn = this.f26461f;
        Context context = this.f26460e;
        PackageInfo b = wn.mo62462b(context, context.getPackageName(), 0);
        if (b != null) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(b.firstInstallTime);
            C10999a aVar = new C10999a();
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                C10255Fg fg2 = (C10255Fg) it.next();
                Pair pair = TuplesKt.m45515to(fg2, Long.valueOf(Math.abs(fg2.f24689c - seconds)));
                while (it.hasNext()) {
                    C10255Fg fg3 = (C10255Fg) it.next();
                    Pair pair2 = TuplesKt.m45515to(fg3, Long.valueOf(Math.abs(fg3.f24689c - seconds)));
                    if (aVar.compare(pair, pair2) > 0) {
                        pair = pair2;
                    }
                }
                C10255Fg fg4 = (C10255Fg) pair.component1();
                if (((Number) pair.component2()).longValue() < this.f26457b) {
                    fg = fg4;
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        if (fg == null) {
            C11000b bVar = new C11000b(this);
            Iterator<T> it2 = list.iterator();
            if (it2.hasNext()) {
                C10255Fg fg5 = (C10255Fg) it2.next();
                while (it2.hasNext()) {
                    C10255Fg fg6 = (C10255Fg) it2.next();
                    if (bVar.compare(fg5, fg6) < 0) {
                        fg5 = fg6;
                    }
                }
                fg = fg5;
            } else {
                throw new NoSuchElementException();
            }
        }
        this.f26462g.reportEvent("several_filled_referrers", m28389a(list, fg, b).toString());
        return fg;
    }

    /* renamed from: a */
    private final JSONObject m28389a(List<C10255Fg> list, C10255Fg fg, PackageInfo packageInfo) {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (C10255Fg c : list) {
            arrayList.add(m28390c(c));
        }
        JSONObject putOpt = jSONObject.put("candidates", C11993ym.m30982b((List<?>) arrayList)).put("chosen", m28390c(fg)).putOpt("install_time", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : null);
        Intrinsics.checkNotNullExpressionValue(putOpt, "JSONObject()\n           …geInfo?.firstInstallTime)");
        return putOpt;
    }
}
