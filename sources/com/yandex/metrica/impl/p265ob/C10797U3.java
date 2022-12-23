package com.yandex.metrica.impl.p265ob;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.yandex.metrica.C12043l;
import com.yandex.metrica.YandexMetrica;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.yandex.metrica.impl.ob.U3 */
public class C10797U3 implements Parcelable {
    public static final Parcelable.Creator<C10797U3> CREATOR = new C10798a();

    /* renamed from: c */
    public static final String f25906c = UUID.randomUUID().toString();

    /* renamed from: a */
    private final ContentValues f25907a;

    /* renamed from: b */
    private ResultReceiver f25908b;

    /* renamed from: com.yandex.metrica.impl.ob.U3$a */
    class C10798a implements Parcelable.Creator<C10797U3> {
        C10798a() {
        }

        public Object createFromParcel(Parcel parcel) {
            Bundle readBundle = parcel.readBundle(C11541n0.class.getClassLoader());
            return new C10797U3((ContentValues) readBundle.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT"), (ResultReceiver) readBundle.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER"));
        }

        public Object[] newArray(int i) {
            return new C10797U3[i];
        }
    }

    public C10797U3(Context context, ResultReceiver resultReceiver) {
        ContentValues contentValues = new ContentValues();
        this.f25907a = contentValues;
        contentValues.put("PROCESS_CFG_PROCESS_ID", Integer.valueOf(Process.myPid()));
        contentValues.put("PROCESS_CFG_PROCESS_SESSION_ID", f25906c);
        contentValues.put("PROCESS_CFG_SDK_API_LEVEL", Integer.valueOf(YandexMetrica.getLibraryApiLevel()));
        contentValues.put("PROCESS_CFG_PACKAGE_NAME", context.getPackageName());
        this.f25908b = resultReceiver;
    }

    /* renamed from: a */
    public static C10797U3 m27899a(Bundle bundle) {
        if (bundle != null) {
            try {
                return (C10797U3) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
            }
        }
        return null;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public void mo62334b(com.yandex.metrica.C12043l r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.List<java.lang.String> r0 = r4.f28948d     // Catch:{ all -> 0x0040 }
            boolean r0 = com.yandex.metrica.impl.p265ob.C10796U2.m27891a((java.lang.Object) r0)     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x001c
            java.util.List<java.lang.String> r0 = r4.f28948d     // Catch:{ all -> 0x0040 }
            monitor-enter(r3)     // Catch:{ all -> 0x0040 }
            android.content.ContentValues r1 = r3.f25907a     // Catch:{ all -> 0x0019 }
            java.lang.String r0 = com.yandex.metrica.impl.p265ob.C11993ym.m30986c((java.util.List<java.lang.String>) r0)     // Catch:{ all -> 0x0019 }
            java.lang.String r2 = "PROCESS_CFG_CUSTOM_HOSTS"
            r1.put(r2, r0)     // Catch:{ all -> 0x0019 }
            monitor-exit(r3)     // Catch:{ all -> 0x0040 }
            goto L_0x001c
        L_0x0019:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0040 }
            throw r4     // Catch:{ all -> 0x0040 }
        L_0x001c:
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f28946b     // Catch:{ all -> 0x0040 }
            boolean r0 = com.yandex.metrica.impl.p265ob.C10796U2.m27891a((java.lang.Object) r0)     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003b
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f28946b     // Catch:{ all -> 0x0040 }
            java.util.Map r0 = com.yandex.metrica.impl.p265ob.C11993ym.m30999i(r0)     // Catch:{ all -> 0x0040 }
            monitor-enter(r3)     // Catch:{ all -> 0x0040 }
            android.content.ContentValues r1 = r3.f25907a     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = com.yandex.metrica.impl.p265ob.C11993ym.m30997g(r0)     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = "PROCESS_CFG_CLIDS"
            r1.put(r2, r0)     // Catch:{ all -> 0x0038 }
            monitor-exit(r3)     // Catch:{ all -> 0x0040 }
            goto L_0x003b
        L_0x0038:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0040 }
            throw r4     // Catch:{ all -> 0x0040 }
        L_0x003b:
            r3.m27900a((com.yandex.metrica.C12043l) r4)     // Catch:{ all -> 0x0040 }
            monitor-exit(r3)     // Catch:{ all -> 0x0040 }
            return
        L_0x0040:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0040 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10797U3.mo62334b(com.yandex.metrica.l):void");
    }

    /* renamed from: c */
    public ResultReceiver mo62336c() {
        return this.f25908b;
    }

    /* renamed from: d */
    public String mo62337d() {
        return this.f25907a.getAsString("PROCESS_CFG_DISTRIBUTION_REFERRER");
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo62339e() {
        return this.f25907a.getAsString("PROCESS_CFG_INSTALL_REFERRER_SOURCE");
    }

    /* renamed from: f */
    public String mo62340f() {
        return this.f25907a.getAsString("PROCESS_CFG_PACKAGE_NAME");
    }

    /* renamed from: g */
    public Integer mo62341g() {
        return this.f25907a.getAsInteger("PROCESS_CFG_PROCESS_ID");
    }

    /* renamed from: h */
    public String mo62342h() {
        return this.f25907a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
    }

    /* renamed from: i */
    public int mo62343i() {
        return this.f25907a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue();
    }

    /* renamed from: j */
    public boolean mo62344j() {
        return this.f25907a.containsKey("PROCESS_CFG_CUSTOM_HOSTS");
    }

    public String toString() {
        return "ProcessConfiguration{mParamsMapping=" + this.f25907a + ", mDataResultReceiver=" + this.f25908b + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT", this.f25907a);
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER", this.f25908b);
        parcel.writeBundle(bundle);
    }

    /* renamed from: a */
    private void m27900a(C12043l lVar) {
        if (C10796U2.m27891a((Object) lVar.f28947c)) {
            String str = lVar.f28947c;
            synchronized (this) {
                this.f25907a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
            }
            synchronized (this) {
                this.f25907a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", "api");
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo62331a(List<String> list) {
        this.f25907a.put("PROCESS_CFG_CUSTOM_HOSTS", C11993ym.m30986c(list));
    }

    /* renamed from: a */
    public Map<String, String> mo62329a() {
        return C11993ym.m30990d(this.f25907a.getAsString("PROCESS_CFG_CLIDS"));
    }

    /* renamed from: a */
    public synchronized void mo62332a(Map<String, String> map) {
        this.f25907a.put("PROCESS_CFG_CLIDS", C11993ym.m30997g(map));
    }

    public C10797U3(C10797U3 u3) {
        synchronized (u3) {
            this.f25907a = new ContentValues(u3.f25907a);
            this.f25908b = u3.f25908b;
        }
    }

    /* renamed from: a */
    public synchronized void mo62330a(String str) {
        this.f25907a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
    }

    /* renamed from: b */
    public List<String> mo62333b() {
        String asString = this.f25907a.getAsString("PROCESS_CFG_CUSTOM_HOSTS");
        if (TextUtils.isEmpty(asString)) {
            return null;
        }
        return C11993ym.m30988c(asString);
    }

    /* renamed from: b */
    public synchronized void mo62335b(String str) {
        this.f25907a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
    }

    public C10797U3(ContentValues contentValues, ResultReceiver resultReceiver) {
        this.f25907a = contentValues == null ? new ContentValues() : contentValues;
        this.f25908b = resultReceiver;
    }
}
