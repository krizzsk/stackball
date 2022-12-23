package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Timer;

/* renamed from: com.ironsource.mediationsdk.b */
public abstract class C5677b {

    /* renamed from: a */
    C5678a f13489a;

    /* renamed from: b */
    public AbstractAdapter f13490b;

    /* renamed from: c */
    NetworkSettings f13491c;

    /* renamed from: d */
    String f13492d;

    /* renamed from: e */
    boolean f13493e;

    /* renamed from: f */
    public String f13494f;

    /* renamed from: g */
    public String f13495g;

    /* renamed from: h */
    int f13496h;

    /* renamed from: i */
    Timer f13497i;

    /* renamed from: j */
    Timer f13498j;

    /* renamed from: k */
    int f13499k;

    /* renamed from: l */
    int f13500l;

    /* renamed from: m */
    public int f13501m;

    /* renamed from: n */
    public int f13502n;

    /* renamed from: o */
    protected Long f13503o;

    /* renamed from: p */
    protected Long f13504p;

    /* renamed from: q */
    IronSourceLoggerManager f13505q;

    /* renamed from: r */
    private String f13506r;

    /* renamed from: s */
    private int f13507s;

    /* renamed from: t */
    private String f13508t = "maxAdsPerSession";

    /* renamed from: u */
    private String f13509u = "maxAdsPerIteration";

    /* renamed from: v */
    private String f13510v = "maxAdsPerDay";

    /* renamed from: com.ironsource.mediationsdk.b$a */
    public enum C5678a {
        NOT_INITIATED(0),
        INIT_FAILED(1),
        INITIATED(2),
        AVAILABLE(3),
        NOT_AVAILABLE(4),
        EXHAUSTED(5),
        CAPPED_PER_SESSION(6),
        INIT_PENDING(7),
        LOAD_PENDING(8),
        CAPPED_PER_DAY(9),
        NEEDS_RELOAD(10);
        

        /* renamed from: l */
        public int f13523l;

        private C5678a(int i) {
            this.f13523l = i;
        }
    }

    C5677b(NetworkSettings networkSettings) {
        this.f13506r = networkSettings.getProviderTypeForReflection();
        this.f13492d = networkSettings.getProviderInstanceName();
        this.f13493e = networkSettings.isMultipleInstances();
        this.f13491c = networkSettings;
        this.f13494f = networkSettings.getSubProviderId();
        this.f13495g = networkSettings.getAdSourceNameForEvents();
        this.f13496h = 0;
        this.f13507s = 0;
        this.f13489a = C5678a.NOT_INITIATED;
        this.f13505q = IronSourceLoggerManager.getLogger();
        this.f13503o = null;
        this.f13504p = null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41803a(com.ironsource.mediationsdk.C5677b.C5678a r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.b$a r0 = r4.f13489a     // Catch:{ all -> 0x0044 }
            if (r0 != r5) goto L_0x0007
            monitor-exit(r4)
            return
        L_0x0007:
            r4.f13489a = r5     // Catch:{ all -> 0x0044 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r4.f13505q     // Catch:{ all -> 0x0044 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x0044 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = "Smart Loading - "
            r2.<init>(r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = r4.f13492d     // Catch:{ all -> 0x0044 }
            r2.append(r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = " state changed to "
            r2.append(r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0044 }
            r2.append(r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0044 }
            r3 = 0
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x0044 }
            com.ironsource.mediationsdk.AbstractAdapter r0 = r4.f13490b     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0042
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C5677b.C5678a.CAPPED_PER_SESSION     // Catch:{ all -> 0x0044 }
            if (r5 == r0) goto L_0x0039
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C5677b.C5678a.CAPPED_PER_DAY     // Catch:{ all -> 0x0044 }
            if (r5 != r0) goto L_0x0042
        L_0x0039:
            com.ironsource.mediationsdk.AbstractAdapter r0 = r4.f13490b     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = r4.mo41342k()     // Catch:{ all -> 0x0044 }
            r0.setMediationState(r5, r1)     // Catch:{ all -> 0x0044 }
        L_0x0042:
            monitor-exit(r4)
            return
        L_0x0044:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5677b.mo41803a(com.ironsource.mediationsdk.b$a):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41804a(String str, String str2) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13505q;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, str + " exception: " + this.f13492d + " | " + str2, 3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo41805a() {
        return this.f13496h >= this.f13499k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo41806b() {
        return this.f13507s >= this.f13500l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo41807c() {
        if (!mo41805a() && !mo41806b()) {
            if (!(this.f13489a == C5678a.CAPPED_PER_DAY)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo41808d() {
        this.f13496h++;
        this.f13507s++;
        if (mo41806b()) {
            mo41803a(C5678a.CAPPED_PER_SESSION);
        } else if (mo41805a()) {
            mo41803a(C5678a.EXHAUSTED);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo41809e() {
        try {
            if (this.f13497i != null) {
                this.f13497i.cancel();
            }
        } catch (Exception e) {
            mo41804a("stopInitTimer", e.getLocalizedMessage());
        } finally {
            this.f13497i = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo41810f() {
        try {
            if (this.f13498j != null) {
                this.f13498j.cancel();
            }
        } catch (Exception e) {
            mo41804a("stopLoadTimer", e.getLocalizedMessage());
        } finally {
            this.f13498j = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract void mo41339g();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract void mo41340h();

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract void mo41341i();

    /* renamed from: j */
    public final String mo41811j() {
        return this.f13493e ? this.f13506r : this.f13492d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract String mo41342k();

    /* renamed from: l */
    public final Long mo41812l() {
        return this.f13503o;
    }

    /* renamed from: m */
    public final Long mo41813m() {
        return this.f13504p;
    }
}
