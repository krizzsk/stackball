package com.yandex.metrica;

import android.content.ContentValues;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.yandex.metrica.impl.p265ob.C10796U2;
import com.yandex.metrica.impl.p265ob.C11146dd;
import com.yandex.metrica.impl.p265ob.C11541n0;

@Deprecated
public class CounterConfiguration implements Parcelable {
    public static final Parcelable.Creator<CounterConfiguration> CREATOR = new C10018a();

    /* renamed from: a */
    private final ContentValues f24012a;

    /* renamed from: com.yandex.metrica.CounterConfiguration$a */
    class C10018a implements Parcelable.Creator<CounterConfiguration> {
        C10018a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new CounterConfiguration((ContentValues) parcel.readBundle(C11541n0.class.getClassLoader()).getParcelable("com.yandex.metrica.CounterConfiguration.data"));
        }

        public Object[] newArray(int i) {
            return new CounterConfiguration[i];
        }
    }

    /* renamed from: com.yandex.metrica.CounterConfiguration$b */
    public enum C10019b {
        MAIN("main"),
        MANUAL("manual"),
        APPMETRICA("appmetrica"),
        COMMUTATION("commutation"),
        SELF_DIAGNOSTIC_MAIN("self_diagnostic_main"),
        SELF_DIAGNOSTIC_MANUAL("self_diagnostic_manual"),
        CRASH("crash");
        

        /* renamed from: a */
        private final String f24021a;

        private C10019b(String str) {
            this.f24021a = str;
        }

        /* renamed from: a */
        public String mo60823a() {
            return this.f24021a;
        }

        /* renamed from: a */
        public static C10019b m25810a(String str) {
            C10019b[] values = values();
            for (int i = 0; i < 7; i++) {
                C10019b bVar = values[i];
                if (bVar.f24021a.equals(str)) {
                    return bVar;
                }
            }
            return MAIN;
        }
    }

    public CounterConfiguration(CounterConfiguration counterConfiguration) {
        synchronized (counterConfiguration) {
            this.f24012a = new ContentValues(counterConfiguration.f24012a);
            m25785r();
        }
    }

    /* renamed from: a */
    private void m25771a(String str) {
        if (C10796U2.m27891a((Object) str)) {
            synchronized (this) {
                this.f24012a.put("CFG_API_KEY", str);
            }
        }
    }

    /* renamed from: b */
    private void m25774b(Integer num) {
        if (C10796U2.m27891a((Object) num)) {
            int intValue = num.intValue();
            synchronized (this) {
                ContentValues contentValues = this.f24012a;
                if (intValue <= 0) {
                    intValue = Integer.MAX_VALUE;
                }
                contentValues.put("CFG_MAX_REPORTS_COUNT", Integer.valueOf(intValue));
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: c */
    private void m25778c(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "20799a27-fa80-4b36-b2db-0f8141f24180"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x001a
            com.yandex.metrica.CounterConfiguration$b r3 = com.yandex.metrica.CounterConfiguration.C10019b.APPMETRICA
            monitor-enter(r2)
            android.content.ContentValues r0 = r2.f24012a     // Catch:{ all -> 0x0017 }
            java.lang.String r3 = r3.mo60823a()     // Catch:{ all -> 0x0017 }
            java.lang.String r1 = "CFG_REPORTER_TYPE"
            r0.put(r1, r3)     // Catch:{ all -> 0x0017 }
            goto L_0x0028
        L_0x0017:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x001a:
            com.yandex.metrica.CounterConfiguration$b r3 = com.yandex.metrica.CounterConfiguration.C10019b.MANUAL
            monitor-enter(r2)
            android.content.ContentValues r0 = r2.f24012a     // Catch:{ all -> 0x002a }
            java.lang.String r3 = r3.mo60823a()     // Catch:{ all -> 0x002a }
            java.lang.String r1 = "CFG_REPORTER_TYPE"
            r0.put(r1, r3)     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r2)
            return
        L_0x002a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.CounterConfiguration.m25778c(java.lang.String):void");
    }

    /* renamed from: d */
    private void m25780d(Integer num) {
        if (C10796U2.m27891a((Object) num)) {
            int intValue = num.intValue();
            synchronized (this) {
                this.f24012a.put("CFG_SESSION_TIMEOUT", Integer.valueOf(intValue));
            }
        }
    }

    /* renamed from: e */
    private void m25781e(C12043l lVar) {
        if (C10796U2.m27891a((Object) lVar.locationTracking)) {
            mo60800b(lVar.locationTracking.booleanValue());
        }
    }

    /* renamed from: f */
    private void m25782f(C12043l lVar) {
        if (C10796U2.m27891a((Object) lVar.location)) {
            mo60795a(lVar.location);
        }
    }

    /* renamed from: g */
    private void m25783g(C12043l lVar) {
        if (C10796U2.m27891a((Object) lVar.f28954j)) {
            boolean booleanValue = lVar.f28954j.booleanValue();
            synchronized (this) {
                this.f24012a.put("CFG_PERMISSIONS_COLLECTING", Boolean.valueOf(booleanValue));
            }
        }
    }

    /* renamed from: h */
    private void m25784h(C12043l lVar) {
        if (C10796U2.m27891a((Object) lVar.revenueAutoTrackingEnabled)) {
            boolean booleanValue = lVar.revenueAutoTrackingEnabled.booleanValue();
            synchronized (this) {
                this.f24012a.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(booleanValue));
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: r */
    private void m25785r() {
        /*
            r3 = this;
            android.content.ContentValues r0 = r3.f24012a
            java.lang.String r1 = "CFG_REPORTER_TYPE"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            android.content.ContentValues r0 = r3.f24012a
            java.lang.String r1 = "CFG_MAIN_REPORTER"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x003d
            android.content.ContentValues r0 = r3.f24012a
            java.lang.String r1 = "CFG_MAIN_REPORTER"
            java.lang.Boolean r0 = r0.getAsBoolean(r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0035
            com.yandex.metrica.CounterConfiguration$b r0 = com.yandex.metrica.CounterConfiguration.C10019b.MAIN
            monitor-enter(r3)
            android.content.ContentValues r1 = r3.f24012a     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = r0.mo60823a()     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "CFG_REPORTER_TYPE"
            r1.put(r2, r0)     // Catch:{ all -> 0x0032 }
            goto L_0x0063
        L_0x0032:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0035:
            java.lang.String r0 = r3.mo60794a()
            r3.m25778c((java.lang.String) r0)
            goto L_0x0068
        L_0x003d:
            android.content.ContentValues r0 = r3.f24012a
            java.lang.String r1 = "CFG_COMMUTATION_REPORTER"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0068
            android.content.ContentValues r0 = r3.f24012a
            java.lang.String r1 = "CFG_COMMUTATION_REPORTER"
            java.lang.Boolean r0 = r0.getAsBoolean(r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0068
            com.yandex.metrica.CounterConfiguration$b r0 = com.yandex.metrica.CounterConfiguration.C10019b.COMMUTATION
            monitor-enter(r3)
            android.content.ContentValues r1 = r3.f24012a     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = r0.mo60823a()     // Catch:{ all -> 0x0065 }
            java.lang.String r2 = "CFG_REPORTER_TYPE"
            r1.put(r2, r0)     // Catch:{ all -> 0x0065 }
        L_0x0063:
            monitor-exit(r3)
            goto L_0x0068
        L_0x0065:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.CounterConfiguration.m25785r():void");
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public Integer mo60810i() {
        return this.f24012a.getAsInteger("MAX_REPORTS_IN_DB_COUNT");
    }

    /* renamed from: j */
    public Boolean mo60811j() {
        return this.f24012a.getAsBoolean("CFG_NATIVE_CRASHES_ENABLED");
    }

    /* renamed from: k */
    public C10019b mo60812k() {
        return C10019b.m25810a(this.f24012a.getAsString("CFG_REPORTER_TYPE"));
    }

    /* renamed from: l */
    public Integer mo60813l() {
        return this.f24012a.getAsInteger("CFG_SESSION_TIMEOUT");
    }

    /* renamed from: m */
    public Boolean mo60814m() {
        return this.f24012a.getAsBoolean("CFG_STATISTICS_SENDING");
    }

    /* renamed from: n */
    public Boolean mo60815n() {
        return this.f24012a.getAsBoolean("CFG_IS_FIRST_ACTIVATION_AS_UPDATE");
    }

    /* renamed from: o */
    public Boolean mo60816o() {
        return this.f24012a.getAsBoolean("CFG_LOCATION_TRACKING");
    }

    /* renamed from: p */
    public Boolean mo60817p() {
        return this.f24012a.getAsBoolean("CFG_IS_LOG_ENABLED");
    }

    /* renamed from: q */
    public synchronized Boolean mo60818q() {
        return this.f24012a.getAsBoolean("CFG_REVENUE_AUTO_TRACKING_ENABLED");
    }

    public synchronized String toString() {
        return "CounterConfiguration{mParamsMapping=" + this.f24012a + '}';
    }

    public synchronized void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.CounterConfiguration.data", this.f24012a);
        parcel.writeBundle(bundle);
    }

    /* renamed from: a */
    private void m25770a(Integer num) {
        if (C10796U2.m27891a((Object) num)) {
            int intValue = num.intValue();
            synchronized (this) {
                this.f24012a.put("CFG_DISPATCH_PERIOD", Integer.valueOf(intValue));
            }
        }
    }

    /* renamed from: e */
    public Integer mo60806e() {
        return this.f24012a.getAsInteger("CFG_DISPATCH_PERIOD");
    }

    /* renamed from: f */
    public Boolean mo60807f() {
        return this.f24012a.getAsBoolean("CFG_LOCATION_ALLOWED_BY_BRIDGE");
    }

    /* renamed from: b */
    private void m25772b(C12043l lVar) {
        if (!TextUtils.isEmpty(lVar.appVersion)) {
            String str = lVar.appVersion;
            synchronized (this) {
                this.f24012a.put("CFG_APP_VERSION", str);
            }
        }
    }

    /* renamed from: d */
    private void m25779d(C12043l lVar) {
        if (C10796U2.m27891a((Object) lVar.firstActivationAsUpdate)) {
            boolean booleanValue = lVar.firstActivationAsUpdate.booleanValue();
            synchronized (this) {
                this.f24012a.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(booleanValue));
            }
        }
    }

    /* renamed from: g */
    public Location mo60808g() {
        if (!this.f24012a.containsKey("CFG_MANUAL_LOCATION")) {
            return null;
        }
        byte[] asByteArray = this.f24012a.getAsByteArray("CFG_MANUAL_LOCATION");
        int i = C11146dd.f26702q;
        if (asByteArray == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(asByteArray, 0, asByteArray.length);
            obtain.setDataPosition(0);
            Location location = (Location) obtain.readValue(Location.class.getClassLoader());
            obtain.recycle();
            return location;
        } catch (Throwable unused) {
            obtain.recycle();
            return null;
        }
    }

    /* renamed from: h */
    public Integer mo60809h() {
        return this.f24012a.getAsInteger("CFG_MAX_REPORTS_COUNT");
    }

    public CounterConfiguration() {
        this.f24012a = new ContentValues();
    }

    /* renamed from: a */
    private void m25769a(Boolean bool) {
        if (C10796U2.m27891a((Object) bool)) {
            boolean booleanValue = bool.booleanValue();
            synchronized (this) {
                this.f24012a.put("CFG_IS_LOG_ENABLED", Boolean.valueOf(booleanValue));
            }
        }
    }

    /* renamed from: c */
    private void m25775c(C12043l lVar) {
        if (C10796U2.m27891a((Object) lVar.f28945a)) {
            String str = lVar.f28945a;
            synchronized (this) {
                ContentValues contentValues = this.f24012a;
                if (TextUtils.isEmpty(str)) {
                    str = null;
                }
                contentValues.put("CFG_DEVICE_SIZE_TYPE", str);
            }
        }
    }

    /* renamed from: d */
    public String mo60803d() {
        return this.f24012a.getAsString("CFG_DEVICE_SIZE_TYPE");
    }

    public CounterConfiguration(C12043l lVar, C10019b bVar) {
        this();
        synchronized (this) {
            m25771a(lVar.apiKey);
            m25780d(lVar.sessionTimeout);
            m25782f(lVar);
            m25781e(lVar);
            m25775c(lVar);
            m25770a(lVar.f28950f);
            m25774b(lVar.f28951g);
            m25772b(lVar);
            m25768a(lVar);
            m25783g(lVar);
            m25779d(lVar);
            m25776c(lVar.statisticsSending);
            m25777c(lVar.maxReportsInDatabaseCount);
            m25773b(lVar.nativeCrashReporting);
            m25784h(lVar);
            mo60796a(bVar);
        }
    }

    /* renamed from: b */
    private void m25773b(Boolean bool) {
        if (C10796U2.m27891a((Object) bool)) {
            this.f24012a.put("CFG_NATIVE_CRASHES_ENABLED", bool);
        }
    }

    /* renamed from: d */
    public synchronized void mo60804d(String str) {
        this.f24012a.put("CFG_UUID", str);
    }

    /* renamed from: a */
    private void m25768a(C12043l lVar) {
        if (C10796U2.m27891a((Object) lVar.f28949e)) {
            int intValue = lVar.f28949e.intValue();
            synchronized (this) {
                this.f24012a.put("CFG_APP_VERSION_CODE", String.valueOf(intValue));
            }
        }
    }

    /* renamed from: c */
    private void m25776c(Boolean bool) {
        if (C10796U2.m27891a((Object) bool)) {
            mo60802c(bool.booleanValue());
        }
    }

    /* renamed from: b */
    public synchronized void mo60799b(String str) {
        this.f24012a.put("CFG_API_KEY", str);
    }

    /* renamed from: c */
    private void m25777c(Integer num) {
        if (C10796U2.m27891a((Object) num)) {
            this.f24012a.put("MAX_REPORTS_IN_DB_COUNT", num);
        }
    }

    /* renamed from: b */
    public synchronized void mo60800b(boolean z) {
        this.f24012a.put("CFG_LOCATION_TRACKING", Boolean.valueOf(z));
    }

    /* renamed from: a */
    public String mo60794a() {
        return this.f24012a.getAsString("CFG_API_KEY");
    }

    /* renamed from: b */
    public String mo60798b() {
        return this.f24012a.getAsString("CFG_APP_VERSION_CODE");
    }

    /* renamed from: a */
    public synchronized void mo60797a(boolean z) {
        this.f24012a.put("CFG_LOCATION_ALLOWED_BY_BRIDGE", Boolean.valueOf(z));
    }

    /* renamed from: c */
    public String mo60801c() {
        return this.f24012a.getAsString("CFG_APP_VERSION");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0015 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo60795a(android.location.Location r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.content.ContentValues r0 = r4.f24012a     // Catch:{ all -> 0x001d }
            java.lang.String r1 = "CFG_MANUAL_LOCATION"
            int r2 = com.yandex.metrica.impl.p265ob.C11146dd.f26702q     // Catch:{ all -> 0x001d }
            r2 = 0
            if (r5 == 0) goto L_0x0018
            android.os.Parcel r3 = android.os.Parcel.obtain()     // Catch:{ all -> 0x001d }
            r3.writeValue(r5)     // Catch:{ all -> 0x0015 }
            byte[] r2 = r3.marshall()     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r3.recycle()     // Catch:{ all -> 0x001d }
        L_0x0018:
            r0.put(r1, r2)     // Catch:{ all -> 0x001d }
            monitor-exit(r4)
            return
        L_0x001d:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.CounterConfiguration.mo60795a(android.location.Location):void");
    }

    /* renamed from: c */
    public final synchronized void mo60802c(boolean z) {
        this.f24012a.put("CFG_STATISTICS_SENDING", Boolean.valueOf(z));
    }

    public CounterConfiguration(C10086i iVar) {
        this();
        synchronized (this) {
            m25771a(iVar.apiKey);
            m25780d(iVar.sessionTimeout);
            m25770a(iVar.f24283a);
            m25774b(iVar.f24284b);
            m25769a(iVar.logs);
            m25776c(iVar.statisticsSending);
            m25777c(iVar.maxReportsInDatabaseCount);
            m25778c(iVar.apiKey);
        }
    }

    CounterConfiguration(ContentValues contentValues) {
        this.f24012a = contentValues;
        m25785r();
    }

    /* renamed from: a */
    public synchronized void mo60796a(C10019b bVar) {
        this.f24012a.put("CFG_REPORTER_TYPE", bVar.mo60823a());
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public static com.yandex.metrica.CounterConfiguration m25767a(android.os.Bundle r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x000e
            java.lang.String r1 = "COUNTER_CFG_OBJ"
            android.os.Parcelable r1 = r4.getParcelable(r1)     // Catch:{ all -> 0x000d }
            com.yandex.metrica.CounterConfiguration r1 = (com.yandex.metrica.CounterConfiguration) r1     // Catch:{ all -> 0x000d }
            r0 = r1
            goto L_0x000e
        L_0x000d:
            return r0
        L_0x000e:
            if (r0 != 0) goto L_0x0015
            com.yandex.metrica.CounterConfiguration r0 = new com.yandex.metrica.CounterConfiguration
            r0.<init>()
        L_0x0015:
            monitor-enter(r0)
            if (r4 != 0) goto L_0x001a
            goto L_0x009b
        L_0x001a:
            java.lang.String r1 = "CFG_DISPATCH_PERIOD"
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x0039
            java.lang.String r1 = "CFG_DISPATCH_PERIOD"
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x009d }
            monitor-enter(r0)     // Catch:{ all -> 0x009d }
            android.content.ContentValues r2 = r0.f24012a     // Catch:{ all -> 0x0036 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = "CFG_DISPATCH_PERIOD"
            r2.put(r3, r1)     // Catch:{ all -> 0x0036 }
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            goto L_0x0039
        L_0x0036:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            throw r4     // Catch:{ all -> 0x009d }
        L_0x0039:
            java.lang.String r1 = "CFG_SESSION_TIMEOUT"
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x0058
            java.lang.String r1 = "CFG_SESSION_TIMEOUT"
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x009d }
            monitor-enter(r0)     // Catch:{ all -> 0x009d }
            android.content.ContentValues r2 = r0.f24012a     // Catch:{ all -> 0x0055 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0055 }
            java.lang.String r3 = "CFG_SESSION_TIMEOUT"
            r2.put(r3, r1)     // Catch:{ all -> 0x0055 }
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            goto L_0x0058
        L_0x0055:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            throw r4     // Catch:{ all -> 0x009d }
        L_0x0058:
            java.lang.String r1 = "CFG_MAX_REPORTS_COUNT"
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x007c
            java.lang.String r1 = "CFG_MAX_REPORTS_COUNT"
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x009d }
            monitor-enter(r0)     // Catch:{ all -> 0x009d }
            android.content.ContentValues r2 = r0.f24012a     // Catch:{ all -> 0x0079 }
            java.lang.String r3 = "CFG_MAX_REPORTS_COUNT"
            if (r1 > 0) goto L_0x0070
            r1 = 2147483647(0x7fffffff, float:NaN)
        L_0x0070:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0079 }
            r2.put(r3, r1)     // Catch:{ all -> 0x0079 }
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            goto L_0x007c
        L_0x0079:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            throw r4     // Catch:{ all -> 0x009d }
        L_0x007c:
            java.lang.String r1 = "CFG_API_KEY"
            java.lang.String r1 = r4.getString(r1)     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x009b
            java.lang.String r1 = "CFG_API_KEY"
            java.lang.String r1 = r4.getString(r1)     // Catch:{ all -> 0x009d }
            java.lang.String r2 = "-1"
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x009d }
            if (r1 != 0) goto L_0x009b
            java.lang.String r1 = "CFG_API_KEY"
            java.lang.String r4 = r4.getString(r1)     // Catch:{ all -> 0x009d }
            r0.mo60799b((java.lang.String) r4)     // Catch:{ all -> 0x009d }
        L_0x009b:
            monitor-exit(r0)
            return r0
        L_0x009d:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.CounterConfiguration.m25767a(android.os.Bundle):com.yandex.metrica.CounterConfiguration");
    }
}
