package com.flurry.sdk;

import android.content.SharedPreferences;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.tapjoy.TapjoyConstants;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.flurry.sdk.bs */
public class C2451bs {

    /* renamed from: c */
    private static final String f5714c = C2451bs.class.getSimpleName();

    /* renamed from: d */
    private static C2451bs f5715d;

    /* renamed from: a */
    public final Map<C2475ca, byte[]> f5716a = new HashMap();

    /* renamed from: b */
    public String f5717b;

    /* renamed from: e */
    private final Set<String> f5718e;

    /* renamed from: f */
    private C2459a f5719f = C2459a.NONE;

    /* renamed from: g */
    private C2477cc f5720g;

    /* renamed from: h */
    private C2482ce f5721h;

    /* renamed from: i */
    private List<C2460b> f5722i = new ArrayList();

    /* renamed from: j */
    private final C2510cv<C2597ec> f5723j = new C2510cv<C2597ec>() {
        /* renamed from: a */
        public final /* synthetic */ void mo17521a(C2509cu cuVar) {
            if (C24586.f5732a[((C2597ec) cuVar).f6085d - 1] == 1 && C2451bs.this.mo17649c()) {
                C2494ck.m5371a().mo17685b(new C2621eo() {
                    /* renamed from: a */
                    public final void mo17573a() {
                        C2451bs.this.m5283h();
                    }
                });
            }
        }
    };

    /* renamed from: k */
    private SharedPreferences f5724k = C2494ck.m5371a().f5832a.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0);

    /* renamed from: com.flurry.sdk.bs$a */
    enum C2459a {
        NONE,
        ADVERTISING,
        DEVICE,
        INSTALL_ID,
        REPORTED_IDS,
        FINISHED
    }

    /* renamed from: com.flurry.sdk.bs$b */
    public interface C2460b {
        /* renamed from: a */
        void mo17608a();
    }

    private C2451bs() {
        HashSet hashSet = new HashSet();
        hashSet.add("null");
        hashSet.add("9774d56d682e549c");
        hashSet.add("dead00beef");
        this.f5718e = Collections.unmodifiableSet(hashSet);
        C2511cw.m5419a().mo17723a("com.flurry.android.sdk.FlurrySessionEvent", this.f5723j);
        C2494ck.m5371a().mo17685b(new C2621eo() {
            /* renamed from: a */
            public final void mo17573a() {
                C2451bs.m5281b(C2451bs.this);
            }
        });
    }

    /* renamed from: a */
    public static synchronized C2451bs m5276a() {
        C2451bs bsVar;
        synchronized (C2451bs.class) {
            if (f5715d == null) {
                f5715d = new C2451bs();
            }
            bsVar = f5715d;
        }
        return bsVar;
    }

    /* renamed from: b */
    public static void m5280b() {
        f5715d = null;
    }

    /* renamed from: c */
    public final boolean mo17649c() {
        return C2459a.FINISHED.equals(this.f5719f);
    }

    /* renamed from: a */
    public final void mo17648a(C2460b bVar) {
        if (mo17649c()) {
            bVar.mo17608a();
        } else {
            this.f5722i.add(bVar);
        }
    }

    /* renamed from: d */
    public final String mo17650d() {
        C2477cc ccVar = this.f5720g;
        if (ccVar == null) {
            return null;
        }
        return ccVar.f5795a;
    }

    /* renamed from: e */
    public final byte[] mo17651e() {
        try {
            if (this.f5721h == null) {
                this.f5721h = new C2482ce();
            }
            return this.f5721h.mo17670a();
        } catch (Exception e) {
            String str = f5714c;
            C2530db.m5475a(5, str, "Error while generating Install ID" + e.getMessage(), e);
            return null;
        }
    }

    /* renamed from: f */
    public final boolean mo17652f() {
        C2477cc ccVar = this.f5720g;
        return ccVar == null || !ccVar.f5796b;
    }

    /* renamed from: com.flurry.sdk.bs$6 */
    static /* synthetic */ class C24586 {

        /* renamed from: a */
        static final /* synthetic */ int[] f5732a;

        /* renamed from: b */
        static final /* synthetic */ int[] f5733b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.flurry.sdk.bs$a[] r0 = com.flurry.sdk.C2451bs.C2459a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5733b = r0
                r1 = 1
                com.flurry.sdk.bs$a r2 = com.flurry.sdk.C2451bs.C2459a.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5733b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.flurry.sdk.bs$a r2 = com.flurry.sdk.C2451bs.C2459a.ADVERTISING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5733b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.flurry.sdk.bs$a r2 = com.flurry.sdk.C2451bs.C2459a.INSTALL_ID     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3 = 3
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5733b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.flurry.sdk.bs$a r2 = com.flurry.sdk.C2451bs.C2459a.DEVICE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r3 = 4
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5733b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.flurry.sdk.bs$a r2 = com.flurry.sdk.C2451bs.C2459a.REPORTED_IDS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r3 = 5
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.flurry.sdk.C2597ec.C2598a.m5641a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5732a = r0
                int r2 = com.flurry.sdk.C2597ec.C2598a.f6087a     // Catch:{ NoSuchFieldError -> 0x004c }
                int r2 = r2 - r1
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2451bs.C24586.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m5283h() {
        C2477cc ccVar;
        C2619em.m5697a();
        String string = this.f5724k.getString(TapjoyConstants.TJC_ADVERTISING_ID, (String) null);
        boolean z = this.f5724k.getBoolean(TapjoyConstants.TJC_AD_TRACKING_ENABLED, false);
        if (string != null) {
            C2494ck.m5371a().mo17684a((Runnable) new C2621eo() {
                /* renamed from: a */
                public final void mo17573a() {
                    C2451bs.m5278a(C2451bs.this, C2451bs.m5284i());
                }
            }, 5000);
            ccVar = new C2477cc(string, z);
        } else {
            final C2477cc i = m5284i();
            C2494ck.m5371a().mo17684a((Runnable) new C2621eo() {
                /* renamed from: a */
                public final void mo17573a() {
                    C2451bs.m5278a(C2451bs.this, i);
                }
            }, 5000);
            ccVar = i;
        }
        this.f5720g = ccVar;
        if (mo17649c()) {
            m5287l();
            C2511cw.m5419a().mo17721a((C2509cu) new C2462bu());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static C2477cc m5284i() {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(C2494ck.m5371a().f5832a);
            return new C2477cc(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
        } catch (NoClassDefFoundError unused) {
            C2530db.m5482b(f5714c, "There is a problem with the Google Play Services library, which is required for Android Advertising ID support. The Google Play Services library should be integrated in any app shipping in the Play Store that uses analytics or advertising.");
            return null;
        } catch (Exception e) {
            String str = f5714c;
            C2530db.m5482b(str, "GOOGLE PLAY SERVICES ERROR: " + e.getMessage());
            C2530db.m5482b(f5714c, "There is a problem with the Google Play Services library, which is required for Android Advertising ID support. The Google Play Services library should be integrated in any app shipping in the Play Store that uses analytics or advertising.");
            return null;
        }
    }

    /* renamed from: a */
    private static void m5279a(String str, File file) {
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream2.writeInt(1);
                dataOutputStream2.writeUTF(str);
                C2619em.m5698a((Closeable) dataOutputStream2);
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                try {
                    C2530db.m5475a(6, f5714c, "Error when saving deviceId", th);
                } finally {
                    C2619em.m5698a((Closeable) dataOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            C2530db.m5475a(6, f5714c, "Error when saving deviceId", th);
        }
    }

    /* renamed from: j */
    private static String m5285j() {
        DataInputStream dataInputStream;
        File fileStreamPath = C2494ck.m5371a().f5832a.getFileStreamPath(".flurryb.");
        String str = null;
        if (fileStreamPath == null || !fileStreamPath.exists()) {
            return null;
        }
        try {
            dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
            try {
                if (1 == dataInputStream.readInt()) {
                    str = dataInputStream.readUTF();
                }
            } catch (Throwable th) {
                th = th;
                try {
                    C2530db.m5475a(6, f5714c, "Error when loading deviceId", th);
                    C2619em.m5698a((Closeable) dataInputStream);
                    return str;
                } catch (Throwable th2) {
                    C2619em.m5698a((Closeable) dataInputStream);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            dataInputStream = null;
            C2530db.m5475a(6, f5714c, "Error when loading deviceId", th);
            C2619em.m5698a((Closeable) dataInputStream);
            return str;
        }
        C2619em.m5698a((Closeable) dataInputStream);
        return str;
    }

    /* renamed from: k */
    private String m5286k() {
        String[] list;
        File fileStreamPath;
        DataInputStream dataInputStream;
        File filesDir = C2494ck.m5371a().f5832a.getFilesDir();
        String str = null;
        if (filesDir == null || (list = filesDir.list(new FilenameFilter() {
            public final boolean accept(File file, String str) {
                return str.startsWith(".flurryagent.");
            }
        })) == null || list.length == 0 || (fileStreamPath = C2494ck.m5371a().f5832a.getFileStreamPath(list[0])) == null || !fileStreamPath.exists()) {
            return null;
        }
        try {
            dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
            try {
                if (46586 == dataInputStream.readUnsignedShort()) {
                    if (2 == dataInputStream.readUnsignedShort()) {
                        dataInputStream.readUTF();
                        str = dataInputStream.readUTF();
                    }
                }
            } catch (Throwable th) {
                th = th;
                try {
                    C2530db.m5475a(6, f5714c, "Error when loading deviceId", th);
                    C2619em.m5698a((Closeable) dataInputStream);
                    return str;
                } catch (Throwable th2) {
                    C2619em.m5698a((Closeable) dataInputStream);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            dataInputStream = null;
            C2530db.m5475a(6, f5714c, "Error when loading deviceId", th);
            C2619em.m5698a((Closeable) dataInputStream);
            return str;
        }
        C2619em.m5698a((Closeable) dataInputStream);
        return str;
    }

    /* renamed from: l */
    private void m5287l() {
        String d = mo17650d();
        if (d != null) {
            C2530db.m5474a(3, f5714c, "Fetched advertising id");
            this.f5716a.put(C2475ca.AndroidAdvertisingId, C2619em.m5706d(d));
        }
        byte[] e = mo17651e();
        if (e != null) {
            C2530db.m5474a(3, f5714c, "Fetched install id");
            this.f5716a.put(C2475ca.AndroidInstallationId, e);
        }
        String str = this.f5717b;
        if (str != null) {
            C2530db.m5474a(3, f5714c, "Fetched device id");
            this.f5716a.put(C2475ca.DeviceId, C2619em.m5706d(str));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x007e A[Catch:{ Exception -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0080 A[Catch:{ Exception -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0090 A[Catch:{ Exception -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091 A[Catch:{ Exception -> 0x010f }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m5281b(com.flurry.sdk.C2451bs r10) {
        /*
        L_0x0000:
            com.flurry.sdk.bs$a r0 = com.flurry.sdk.C2451bs.C2459a.FINISHED
            com.flurry.sdk.bs$a r1 = r10.f5719f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x012f
            int[] r0 = com.flurry.sdk.C2451bs.C24586.f5733b
            com.flurry.sdk.bs$a r1 = r10.f5719f
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 5
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 4
            if (r0 == r4) goto L_0x0038
            if (r0 == r3) goto L_0x0033
            if (r0 == r2) goto L_0x002e
            if (r0 == r5) goto L_0x0029
            if (r0 == r1) goto L_0x0024
            goto L_0x003c
        L_0x0024:
            com.flurry.sdk.bs$a r0 = com.flurry.sdk.C2451bs.C2459a.FINISHED
            r10.f5719f = r0
            goto L_0x003c
        L_0x0029:
            com.flurry.sdk.bs$a r0 = com.flurry.sdk.C2451bs.C2459a.REPORTED_IDS
            r10.f5719f = r0
            goto L_0x003c
        L_0x002e:
            com.flurry.sdk.bs$a r0 = com.flurry.sdk.C2451bs.C2459a.DEVICE
            r10.f5719f = r0
            goto L_0x003c
        L_0x0033:
            com.flurry.sdk.bs$a r0 = com.flurry.sdk.C2451bs.C2459a.INSTALL_ID
            r10.f5719f = r0
            goto L_0x003c
        L_0x0038:
            com.flurry.sdk.bs$a r0 = com.flurry.sdk.C2451bs.C2459a.ADVERTISING
            r10.f5719f = r0
        L_0x003c:
            int[] r0 = com.flurry.sdk.C2451bs.C24586.f5733b     // Catch:{ Exception -> 0x010f }
            com.flurry.sdk.bs$a r6 = r10.f5719f     // Catch:{ Exception -> 0x010f }
            int r6 = r6.ordinal()     // Catch:{ Exception -> 0x010f }
            r0 = r0[r6]     // Catch:{ Exception -> 0x010f }
            if (r0 == r3) goto L_0x010a
            if (r0 == r2) goto L_0x00fa
            if (r0 == r5) goto L_0x0053
            if (r0 == r1) goto L_0x004f
            goto L_0x0000
        L_0x004f:
            r10.m5287l()     // Catch:{ Exception -> 0x010f }
            goto L_0x0000
        L_0x0053:
            com.flurry.sdk.C2619em.m5697a()     // Catch:{ Exception -> 0x010f }
            com.flurry.sdk.ck r0 = com.flurry.sdk.C2494ck.m5371a()     // Catch:{ Exception -> 0x010f }
            android.content.Context r0 = r0.f5832a     // Catch:{ Exception -> 0x010f }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ Exception -> 0x010f }
            java.lang.String r1 = "android_id"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r1)     // Catch:{ Exception -> 0x010f }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x010f }
            if (r1 != 0) goto L_0x007b
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ Exception -> 0x010f }
            java.lang.String r1 = r0.toLowerCase(r1)     // Catch:{ Exception -> 0x010f }
            java.util.Set<java.lang.String> r2 = r10.f5718e     // Catch:{ Exception -> 0x010f }
            boolean r1 = r2.contains(r1)     // Catch:{ Exception -> 0x010f }
            if (r1 != 0) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r4 = 0
        L_0x007c:
            if (r4 != 0) goto L_0x0080
            r0 = 0
            goto L_0x008a
        L_0x0080:
            java.lang.String r1 = "AND"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x010f }
            java.lang.String r0 = r1.concat(r0)     // Catch:{ Exception -> 0x010f }
        L_0x008a:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x010f }
            if (r1 != 0) goto L_0x0091
            goto L_0x00f6
        L_0x0091:
            java.lang.String r0 = m5285j()     // Catch:{ Exception -> 0x010f }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x010f }
            if (r1 == 0) goto L_0x00f6
            java.lang.String r0 = r10.m5286k()     // Catch:{ Exception -> 0x010f }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x010f }
            if (r1 == 0) goto L_0x00db
            double r0 = java.lang.Math.random()     // Catch:{ Exception -> 0x010f }
            long r0 = java.lang.Double.doubleToLongBits(r0)     // Catch:{ Exception -> 0x010f }
            long r2 = java.lang.System.nanoTime()     // Catch:{ Exception -> 0x010f }
            com.flurry.sdk.ck r4 = com.flurry.sdk.C2494ck.m5371a()     // Catch:{ Exception -> 0x010f }
            android.content.Context r4 = r4.f5832a     // Catch:{ Exception -> 0x010f }
            java.lang.String r4 = com.flurry.sdk.C2615ej.m5682a(r4)     // Catch:{ Exception -> 0x010f }
            long r6 = com.flurry.sdk.C2619em.m5709g(r4)     // Catch:{ Exception -> 0x010f }
            r8 = 37
            long r6 = r6 * r8
            long r2 = r2 + r6
            long r2 = r2 * r8
            long r0 = r0 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010f }
            java.lang.String r3 = "ID"
            r2.<init>(r3)     // Catch:{ Exception -> 0x010f }
            r3 = 16
            java.lang.String r0 = java.lang.Long.toString(r0, r3)     // Catch:{ Exception -> 0x010f }
            r2.append(r0)     // Catch:{ Exception -> 0x010f }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x010f }
        L_0x00db:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x010f }
            if (r1 != 0) goto L_0x00f6
            com.flurry.sdk.ck r1 = com.flurry.sdk.C2494ck.m5371a()     // Catch:{ Exception -> 0x010f }
            android.content.Context r1 = r1.f5832a     // Catch:{ Exception -> 0x010f }
            java.lang.String r2 = ".flurryb."
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch:{ Exception -> 0x010f }
            boolean r2 = com.flurry.sdk.C2617el.m5689a(r1)     // Catch:{ Exception -> 0x010f }
            if (r2 == 0) goto L_0x00f6
            m5279a((java.lang.String) r0, (java.io.File) r1)     // Catch:{ Exception -> 0x010f }
        L_0x00f6:
            r10.f5717b = r0     // Catch:{ Exception -> 0x010f }
            goto L_0x0000
        L_0x00fa:
            com.flurry.sdk.C2619em.m5697a()     // Catch:{ Exception -> 0x010f }
            com.flurry.sdk.ce r0 = r10.f5721h     // Catch:{ Exception -> 0x010f }
            if (r0 != 0) goto L_0x0000
            com.flurry.sdk.ce r0 = new com.flurry.sdk.ce     // Catch:{ Exception -> 0x010f }
            r0.<init>()     // Catch:{ Exception -> 0x010f }
            r10.f5721h = r0     // Catch:{ Exception -> 0x010f }
            goto L_0x0000
        L_0x010a:
            r10.m5283h()     // Catch:{ Exception -> 0x010f }
            goto L_0x0000
        L_0x010f:
            r0 = move-exception
            java.lang.String r1 = f5714c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Exception during id fetch:"
            r2.<init>(r3)
            com.flurry.sdk.bs$a r3 = r10.f5719f
            r2.append(r3)
            java.lang.String r3 = ", "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.flurry.sdk.C2530db.m5474a((int) r5, (java.lang.String) r1, (java.lang.String) r0)
            goto L_0x0000
        L_0x012f:
            com.flurry.sdk.bt r0 = new com.flurry.sdk.bt
            r0.<init>()
            com.flurry.sdk.cw r1 = com.flurry.sdk.C2511cw.m5419a()
            r1.mo17721a((com.flurry.sdk.C2509cu) r0)
            java.util.List<com.flurry.sdk.bs$b> r0 = r10.f5722i
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x015c
            java.util.List<com.flurry.sdk.bs$b> r10 = r10.f5722i
            java.util.Iterator r10 = r10.iterator()
        L_0x0149:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x015c
            java.lang.Object r0 = r10.next()
            com.flurry.sdk.bs$b r0 = (com.flurry.sdk.C2451bs.C2460b) r0
            r0.mo17608a()
            r10.remove()
            goto L_0x0149
        L_0x015c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2451bs.m5281b(com.flurry.sdk.bs):void");
    }

    /* renamed from: a */
    static /* synthetic */ void m5278a(C2451bs bsVar, C2477cc ccVar) {
        if (ccVar != null) {
            bsVar.f5724k.edit().putString(TapjoyConstants.TJC_ADVERTISING_ID, ccVar.f5795a).putBoolean(TapjoyConstants.TJC_AD_TRACKING_ENABLED, ccVar.f5796b).apply();
        }
    }
}
