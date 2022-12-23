package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.model.C5724h;
import com.ironsource.mediationsdk.model.C5729m;
import com.ironsource.mediationsdk.model.C5731n;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.mediationsdk.utils.c */
public class C5790c {

    /* renamed from: a */
    private static C5790c f13932a;

    /* renamed from: b */
    private final HashSet<ImpressionDataListener> f13933b = new HashSet<>();

    /* renamed from: c */
    private ConcurrentHashMap<String, List<String>> f13934c = new ConcurrentHashMap<>();

    /* renamed from: com.ironsource.mediationsdk.utils.c$1 */
    static /* synthetic */ class C57911 {

        /* renamed from: a */
        static final /* synthetic */ int[] f13935a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ironsource.mediationsdk.model.n[] r0 = com.ironsource.mediationsdk.model.C5731n.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13935a = r0
                com.ironsource.mediationsdk.model.n r1 = com.ironsource.mediationsdk.model.C5731n.PER_DAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13935a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ironsource.mediationsdk.model.n r1 = com.ironsource.mediationsdk.model.C5731n.PER_HOUR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C5790c.C57911.<clinit>():void");
        }
    }

    /* renamed from: com.ironsource.mediationsdk.utils.c$a */
    public enum C5792a {
        ;
        

        /* renamed from: a */
        public static final int f13936a = 1;

        /* renamed from: b */
        public static final int f13937b = 2;

        /* renamed from: c */
        public static final int f13938c = 3;

        /* renamed from: d */
        public static final int f13939d = 4;

        static {
            f13940e = new int[]{1, 2, 3, 4};
        }

        /* renamed from: a */
        public static int[] m14304a() {
            return (int[]) f13940e.clone();
        }
    }

    C5790c() {
    }

    /* renamed from: a */
    private static int m14276a(Context context, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!IronSourceUtils.getBooleanFromSharedPrefs(context, m14280a(str, "CappingManager.IS_DELIVERY_ENABLED", str2), true)) {
            return C5792a.f13936a;
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, m14280a(str, "CappingManager.IS_PACING_ENABLED", str2), false)) {
            if (currentTimeMillis - IronSourceUtils.getLongFromSharedPrefs(context, m14280a(str, "CappingManager.TIME_OF_THE_PREVIOUS_SHOW", str2), 0) < ((long) (IronSourceUtils.getIntFromSharedPrefs(context, m14280a(str, "CappingManager.SECONDS_BETWEEN_SHOWS", str2), 0) * 1000))) {
                return C5792a.f13938c;
            }
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, m14280a(str, "CappingManager.IS_CAPPING_ENABLED", str2), false)) {
            int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(context, m14280a(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), 0);
            String a = m14280a(str, "CappingManager.CURRENT_NUMBER_OF_SHOWS", str2);
            int intFromSharedPrefs2 = IronSourceUtils.getIntFromSharedPrefs(context, a, 0);
            String a2 = m14280a(str, "CappingManager.CAPPING_TIME_THRESHOLD", str2);
            if (currentTimeMillis >= IronSourceUtils.getLongFromSharedPrefs(context, a2, 0)) {
                IronSourceUtils.saveIntToSharedPrefs(context, a, 0);
                IronSourceUtils.saveLongToSharedPrefs(context, a2, 0);
            } else if (intFromSharedPrefs2 >= intFromSharedPrefs) {
                return C5792a.f13937b;
            }
        }
        return C5792a.f13939d;
    }

    /* renamed from: a */
    private static long m14277a(C5731n nVar) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        int i = C57911.f13935a[nVar.ordinal()];
        if (i == 1) {
            instance.set(14, 0);
            instance.set(13, 0);
            instance.set(12, 0);
            instance.set(11, 0);
            instance.add(6, 1);
        } else if (i == 2) {
            instance.set(14, 0);
            instance.set(13, 0);
            instance.set(12, 0);
            instance.add(11, 1);
        }
        return instance.getTimeInMillis();
    }

    /* renamed from: a */
    public static synchronized C5790c m14278a() {
        C5790c cVar;
        synchronized (C5790c.class) {
            if (f13932a == null) {
                f13932a = new C5790c();
            }
            cVar = f13932a;
        }
        return cVar;
    }

    /* renamed from: a */
    private static String m14279a(IronSource.AD_UNIT ad_unit) {
        return ad_unit == IronSource.AD_UNIT.INTERSTITIAL ? IronSourceConstants.INTERSTITIAL_AD_UNIT : ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO ? IronSourceConstants.REWARDED_VIDEO_AD_UNIT : ad_unit == IronSource.AD_UNIT.BANNER ? IronSourceConstants.BANNER_AD_UNIT : ad_unit.toString();
    }

    /* renamed from: a */
    private static String m14280a(String str, String str2, String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    /* renamed from: a */
    public static synchronized void m14281a(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (C5790c.class) {
            if (context != null) {
                C5729m placementAvailabilitySettings = interstitialPlacement.getPlacementAvailabilitySettings();
                if (placementAvailabilitySettings != null) {
                    m14284a(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, interstitialPlacement.getPlacementName(), placementAvailabilitySettings);
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m14282a(Context context, Placement placement) {
        synchronized (C5790c.class) {
            if (context != null) {
                C5729m placementAvailabilitySettings = placement.getPlacementAvailabilitySettings();
                if (placementAvailabilitySettings != null) {
                    m14284a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName(), placementAvailabilitySettings);
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m14283a(Context context, C5724h hVar) {
        synchronized (C5790c.class) {
            if (context != null) {
                C5729m placementAvailabilitySettings = hVar.getPlacementAvailabilitySettings();
                if (placementAvailabilitySettings != null) {
                    m14284a(context, IronSourceConstants.BANNER_AD_UNIT, hVar.getPlacementName(), placementAvailabilitySettings);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m14284a(Context context, String str, String str2, C5729m mVar) {
        boolean z = mVar.f13766a;
        IronSourceUtils.saveBooleanToSharedPrefs(context, m14280a(str, "CappingManager.IS_DELIVERY_ENABLED", str2), z);
        if (z) {
            boolean z2 = mVar.f13767b;
            IronSourceUtils.saveBooleanToSharedPrefs(context, m14280a(str, "CappingManager.IS_CAPPING_ENABLED", str2), z2);
            if (z2) {
                IronSourceUtils.saveIntToSharedPrefs(context, m14280a(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), mVar.f13770e);
                IronSourceUtils.saveStringToSharedPrefs(context, m14280a(str, "CappingManager.CAPPING_TYPE", str2), mVar.f13769d.toString());
            }
            boolean z3 = mVar.f13768c;
            IronSourceUtils.saveBooleanToSharedPrefs(context, m14280a(str, "CappingManager.IS_PACING_ENABLED", str2), z3);
            if (z3) {
                IronSourceUtils.saveIntToSharedPrefs(context, m14280a(str, "CappingManager.SECONDS_BETWEEN_SHOWS", str2), mVar.f13771f);
            }
        }
    }

    /* renamed from: a */
    public static synchronized boolean m14285a(Context context, String str) {
        boolean z;
        synchronized (C5790c.class) {
            z = m14276a(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, str) != C5792a.f13939d;
        }
        return z;
    }

    /* renamed from: a */
    public static synchronized boolean m14286a(Context context, String str, IronSource.AD_UNIT ad_unit) {
        boolean z;
        synchronized (C5790c.class) {
            z = m14276a(context, m14279a(ad_unit), str) != C5792a.f13939d;
        }
        return z;
    }

    /* renamed from: b */
    public static synchronized int m14287b(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (C5790c.class) {
            if (!(context == null || interstitialPlacement == null)) {
                if (interstitialPlacement.getPlacementAvailabilitySettings() != null) {
                    int a = m14276a(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, interstitialPlacement.getPlacementName());
                    return a;
                }
            }
            int i = C5792a.f13939d;
            return i;
        }
    }

    /* renamed from: b */
    public static synchronized int m14288b(Context context, Placement placement) {
        synchronized (C5790c.class) {
            if (!(context == null || placement == null)) {
                if (placement.getPlacementAvailabilitySettings() != null) {
                    int a = m14276a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName());
                    return a;
                }
            }
            int i = C5792a.f13939d;
            return i;
        }
    }

    /* renamed from: b */
    public static synchronized void m14289b(Context context, String str, IronSource.AD_UNIT ad_unit) {
        synchronized (C5790c.class) {
            m14290b(context, m14279a(ad_unit), str);
        }
    }

    /* renamed from: b */
    private static void m14290b(Context context, String str, String str2) {
        int i = 0;
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, m14280a(str, "CappingManager.IS_PACING_ENABLED", str2), false)) {
            IronSourceUtils.saveLongToSharedPrefs(context, m14280a(str, "CappingManager.TIME_OF_THE_PREVIOUS_SHOW", str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, m14280a(str, "CappingManager.IS_CAPPING_ENABLED", str2), false)) {
            IronSourceUtils.getIntFromSharedPrefs(context, m14280a(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), 0);
            String a = m14280a(str, "CappingManager.CURRENT_NUMBER_OF_SHOWS", str2);
            int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(context, a, 0);
            if (intFromSharedPrefs == 0) {
                String stringFromSharedPrefs = IronSourceUtils.getStringFromSharedPrefs(context, m14280a(str, "CappingManager.CAPPING_TYPE", str2), C5731n.PER_DAY.toString());
                C5731n nVar = null;
                C5731n[] values = C5731n.values();
                int length = values.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C5731n nVar2 = values[i];
                    if (nVar2.f13781c.equals(stringFromSharedPrefs)) {
                        nVar = nVar2;
                        break;
                    }
                    i++;
                }
                IronSourceUtils.saveLongToSharedPrefs(context, m14280a(str, "CappingManager.CAPPING_TIME_THRESHOLD", str2), m14277a(nVar));
            }
            IronSourceUtils.saveIntToSharedPrefs(context, a, intFromSharedPrefs + 1);
        }
    }

    /* renamed from: b */
    public static synchronized boolean m14291b(Context context, String str) {
        boolean z;
        synchronized (C5790c.class) {
            z = m14276a(context, IronSourceConstants.BANNER_AD_UNIT, str) != C5792a.f13939d;
        }
        return z;
    }

    /* renamed from: c */
    public static synchronized void m14292c(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (C5790c.class) {
            if (interstitialPlacement != null) {
                m14290b(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, interstitialPlacement.getPlacementName());
            }
        }
    }

    /* renamed from: c */
    public static synchronized void m14293c(Context context, Placement placement) {
        synchronized (C5790c.class) {
            if (placement != null) {
                m14290b(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName());
            }
        }
    }

    /* renamed from: c */
    public static synchronized boolean m14294c(Context context, String str) {
        boolean z;
        synchronized (C5790c.class) {
            z = m14276a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str) != C5792a.f13939d;
        }
        return z;
    }

    /* renamed from: d */
    public static synchronized void m14295d(Context context, String str) {
        synchronized (C5790c.class) {
            m14290b(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, str);
        }
    }

    /* renamed from: e */
    public static synchronized void m14296e(Context context, String str) {
        synchronized (C5790c.class) {
            m14290b(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str);
        }
    }

    /* renamed from: f */
    public static synchronized void m14297f(Context context, String str) {
        synchronized (C5790c.class) {
            if (!TextUtils.isEmpty(str)) {
                m14290b(context, IronSourceConstants.BANNER_AD_UNIT, str);
            }
        }
    }

    /* renamed from: a */
    public void mo42110a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f13933b.add(impressionDataListener);
        }
    }

    /* renamed from: a */
    public void mo42111a(String str, List<String> list) {
        this.f13934c.put(str, list);
    }

    /* renamed from: b */
    public HashSet<ImpressionDataListener> mo42112b() {
        return this.f13933b;
    }

    /* renamed from: b */
    public void mo42113b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f13933b.remove(impressionDataListener);
        }
    }

    /* renamed from: c */
    public void mo42114c() {
        synchronized (this) {
            this.f13933b.clear();
        }
    }

    /* renamed from: d */
    public ConcurrentHashMap<String, List<String>> mo42115d() {
        return this.f13934c;
    }
}
