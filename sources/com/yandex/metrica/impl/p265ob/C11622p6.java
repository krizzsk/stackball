package com.yandex.metrica.impl.p265ob;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.p6 */
public class C11622p6 {

    /* renamed from: a */
    private final C11229f4 f27880a;

    /* renamed from: b */
    private final C11936x6 f27881b;

    /* renamed from: c */
    private final C11705r6 f27882c;

    /* renamed from: d */
    private long f27883d;

    /* renamed from: e */
    private long f27884e;

    /* renamed from: f */
    private AtomicLong f27885f;

    /* renamed from: g */
    private boolean f27886g;

    /* renamed from: h */
    private volatile C11623a f27887h;

    /* renamed from: i */
    private long f27888i;

    /* renamed from: j */
    private long f27889j;

    /* renamed from: k */
    private C10580Nm f27890k;

    /* renamed from: com.yandex.metrica.impl.ob.p6$a */
    static class C11623a {

        /* renamed from: a */
        private final String f27891a;

        /* renamed from: b */
        private final String f27892b;

        /* renamed from: c */
        private final String f27893c;

        /* renamed from: d */
        private final String f27894d;

        /* renamed from: e */
        private final String f27895e;

        /* renamed from: f */
        private final int f27896f;

        /* renamed from: g */
        private final int f27897g;

        C11623a(JSONObject jSONObject) {
            this.f27891a = jSONObject.optString("analyticsSdkVersionName", (String) null);
            this.f27892b = jSONObject.optString("kitBuildNumber", (String) null);
            this.f27893c = jSONObject.optString("appVer", (String) null);
            this.f27894d = jSONObject.optString("appBuild", (String) null);
            this.f27895e = jSONObject.optString("osVer", (String) null);
            this.f27896f = jSONObject.optInt("osApiLev", -1);
            this.f27897g = jSONObject.optInt("attribution_id", 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo63471a(C11384jh jhVar) {
            jhVar.getClass();
            return TextUtils.equals("5.0.0", this.f27891a) && TextUtils.equals("45001354", this.f27892b) && TextUtils.equals(jhVar.mo62777f(), this.f27893c) && TextUtils.equals(jhVar.mo62769b(), this.f27894d) && TextUtils.equals(jhVar.mo62787p(), this.f27895e) && this.f27896f == jhVar.mo62786o() && this.f27897g == jhVar.mo63073D();
        }

        public String toString() {
            return "SessionRequestParams{mKitVersionName='" + this.f27891a + '\'' + ", mKitBuildNumber='" + this.f27892b + '\'' + ", mAppVersion='" + this.f27893c + '\'' + ", mAppBuild='" + this.f27894d + '\'' + ", mOsVersion='" + this.f27895e + '\'' + ", mApiLevel=" + this.f27896f + ", mAttributionId=" + this.f27897g + '}';
        }
    }

    C11622p6(C11229f4 f4Var, C11936x6 x6Var, C11705r6 r6Var, C10580Nm nm) {
        this.f27880a = f4Var;
        this.f27881b = x6Var;
        this.f27882c = r6Var;
        this.f27890k = nm;
        m30013g();
    }

    /* renamed from: g */
    private void m30013g() {
        C11705r6 r6Var = this.f27882c;
        this.f27890k.getClass();
        this.f27884e = r6Var.mo63572a(SystemClock.elapsedRealtime());
        this.f27883d = this.f27882c.mo63576c(-1);
        this.f27885f = new AtomicLong(this.f27882c.mo63575b(0));
        this.f27886g = this.f27882c.mo63574a(true);
        long e = this.f27882c.mo63578e(0);
        this.f27888i = e;
        this.f27889j = this.f27882c.mo63577d(e - this.f27884e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo63459a(long j) {
        C11936x6 x6Var = this.f27881b;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j - this.f27884e);
        this.f27889j = seconds;
        ((C11974y6) x6Var).mo64124b(seconds);
        return this.f27889j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo63461b() {
        return Math.max(this.f27888i - TimeUnit.MILLISECONDS.toSeconds(this.f27884e), this.f27889j);
    }

    /* renamed from: c */
    public long mo63463c() {
        return this.f27883d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo63465d() {
        return this.f27889j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public long mo63466e() {
        long andIncrement = this.f27885f.getAndIncrement();
        ((C11974y6) this.f27881b).mo64126c(this.f27885f.get()).mo64125b();
        return andIncrement;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C12017z6 mo63467f() {
        return this.f27882c.mo63573a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo63468h() {
        return this.f27886g && this.f27883d > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public synchronized void mo63469i() {
        ((C11974y6) this.f27881b).mo64123a();
        this.f27887h = null;
    }

    public String toString() {
        return "Session{mId=" + this.f27883d + ", mInitTime=" + this.f27884e + ", mCurrentReportId=" + this.f27885f + ", mSessionRequestParams=" + this.f27887h + ", mSleepStartSeconds=" + this.f27888i + '}';
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo63462b(long j) {
        boolean z = this.f27883d >= 0;
        boolean a = m30012a();
        this.f27890k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.f27888i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        boolean z2 = !(((timeUnit.toSeconds(elapsedRealtime) > j2 ? 1 : (timeUnit.toSeconds(elapsedRealtime) == j2 ? 0 : -1)) < 0) || timeUnit.toSeconds(j) - j2 >= ((long) this.f27882c.mo63571a(this.f27880a.mo62880m().mo63084O())) || timeUnit.toSeconds(j - this.f27884e) >= C11738s6.f28123b);
        if (!z || !a || !z2) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo63464c(long j) {
        C11936x6 x6Var = this.f27881b;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
        this.f27888i = seconds;
        ((C11974y6) x6Var).mo64130e(seconds).mo64125b();
    }

    /* renamed from: a */
    public void mo63460a(boolean z) {
        if (this.f27886g != z) {
            this.f27886g = z;
            ((C11974y6) this.f27881b).mo64122a(z).mo64125b();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:3|4|(3:6|7|(1:9))|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0033 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m30012a() {
        /*
            r4 = this;
            com.yandex.metrica.impl.ob.p6$a r0 = r4.f27887h
            if (r0 != 0) goto L_0x0038
            monitor-enter(r4)
            com.yandex.metrica.impl.ob.p6$a r0 = r4.f27887h     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0033
            com.yandex.metrica.impl.ob.f4 r0 = r4.f27880a     // Catch:{ all -> 0x0033 }
            com.yandex.metrica.impl.ob.t8 r0 = r0.mo62876i()     // Catch:{ all -> 0x0033 }
            long r1 = r4.f27883d     // Catch:{ all -> 0x0033 }
            com.yandex.metrica.impl.ob.r6 r3 = r4.f27882c     // Catch:{ all -> 0x0033 }
            com.yandex.metrica.impl.ob.z6 r3 = r3.mo63573a()     // Catch:{ all -> 0x0033 }
            android.content.ContentValues r0 = r0.mo63705a((long) r1, (com.yandex.metrica.impl.p265ob.C12017z6) r3)     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "report_request_parameters"
            java.lang.String r0 = r0.getAsString(r1)     // Catch:{ all -> 0x0033 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0033 }
            if (r1 != 0) goto L_0x0033
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0033 }
            r1.<init>(r0)     // Catch:{ all -> 0x0033 }
            com.yandex.metrica.impl.ob.p6$a r0 = new com.yandex.metrica.impl.ob.p6$a     // Catch:{ all -> 0x0033 }
            r0.<init>(r1)     // Catch:{ all -> 0x0033 }
            r4.f27887h = r0     // Catch:{ all -> 0x0033 }
        L_0x0033:
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            goto L_0x0038
        L_0x0035:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            throw r0
        L_0x0038:
            com.yandex.metrica.impl.ob.p6$a r0 = r4.f27887h
            r1 = 0
            if (r0 == 0) goto L_0x0047
            com.yandex.metrica.impl.ob.f4 r1 = r4.f27880a
            com.yandex.metrica.impl.ob.jh r1 = r1.mo62880m()
            boolean r1 = r0.mo63471a(r1)
        L_0x0047:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11622p6.m30012a():boolean");
    }
}
