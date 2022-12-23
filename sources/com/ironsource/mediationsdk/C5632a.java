package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.C5794e;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ironsource.mediationsdk.a */
abstract class C5632a {

    /* renamed from: a */
    C5794e f13259a = null;

    /* renamed from: b */
    int f13260b;

    /* renamed from: c */
    final CopyOnWriteArrayList<C5677b> f13261c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    C5677b f13262d;

    /* renamed from: e */
    C5677b f13263e;

    /* renamed from: f */
    String f13264f;

    /* renamed from: g */
    String f13265g;

    /* renamed from: h */
    IronSourceLoggerManager f13266h = IronSourceLoggerManager.getLogger();

    /* renamed from: i */
    boolean f13267i = false;

    /* renamed from: j */
    Boolean f13268j;

    /* renamed from: k */
    boolean f13269k;

    /* renamed from: l */
    boolean f13270l = true;

    /* renamed from: m */
    private String f13271m = IronSourceConstants.EVENTS_ERROR_REASON;

    /* renamed from: n */
    private String f13272n = "status";

    /* renamed from: o */
    private String f13273o = "placement";

    /* renamed from: p */
    private String f13274p = IronSourceConstants.EVENTS_REWARD_NAME;

    /* renamed from: q */
    private String f13275q = IronSourceConstants.EVENTS_REWARD_AMOUNT;

    /* renamed from: r */
    private String f13276r = "providerPriority";

    C5632a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo41319a(Context context, boolean z);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41666a(C5677b bVar) {
        this.f13261c.add(bVar);
        C5794e eVar = this.f13259a;
        if (eVar != null) {
            synchronized (eVar) {
                try {
                    if (bVar.f13501m != 99) {
                        eVar.f13941a.put(eVar.mo42121d(bVar), Integer.valueOf(bVar.f13501m));
                    }
                } catch (Exception e) {
                    eVar.f13943c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "addSmash", e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo41667a() {
        return this.f13270l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo41645b() {
        this.f13270l = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo41668b(C5677b bVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13266h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, bVar.f13492d + " is set as backfill", 0);
        this.f13262d = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo41669c(C5677b bVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13266h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, bVar.f13492d + " is set as premium", 0);
        this.f13263e = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo41670d(C5677b bVar) {
        try {
            String str = C5556E.m13257a().f12856l;
            if (!TextUtils.isEmpty(str) && bVar.f13490b != null) {
                IronSourceLoggerManager ironSourceLoggerManager = bVar.f13505q;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
                ironSourceLoggerManager.log(ironSourceTag, bVar.mo41811j() + ":setMediationSegment(segment:" + str + ")", 1);
                bVar.f13490b.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                String pluginFrameworkVersion = ConfigFile.getConfigFile().getPluginFrameworkVersion();
                if (bVar.f13490b != null) {
                    bVar.f13490b.setPluginData(pluginType, pluginFrameworkVersion);
                }
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager2 = this.f13266h;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager2.log(ironSourceTag2, ":setCustomParams():" + e.toString(), 3);
        }
    }
}
