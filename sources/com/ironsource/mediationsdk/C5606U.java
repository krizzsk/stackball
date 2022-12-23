package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C5717a;
import com.ironsource.mediationsdk.utils.C5802l;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.U */
public abstract class C5606U implements C5802l.C5803a {

    /* renamed from: c */
    protected AbstractAdapter f13192c;

    /* renamed from: d */
    protected C5717a f13193d;

    /* renamed from: e */
    boolean f13194e;

    /* renamed from: f */
    protected JSONObject f13195f;

    /* renamed from: g */
    protected String f13196g;

    /* renamed from: h */
    protected int f13197h;

    /* renamed from: i */
    protected Long f13198i = null;

    C5606U(C5717a aVar, AbstractAdapter abstractAdapter) {
        this.f13193d = aVar;
        this.f13192c = abstractAdapter;
        this.f13195f = aVar.f13707b;
    }

    /* renamed from: a */
    private String mo41420a() {
        return this.f13193d.f13706a.isMultipleInstances() ? this.f13193d.f13706a.getProviderTypeForReflection() : this.f13193d.f13706a.getProviderName();
    }

    /* renamed from: b */
    public final void mo41602b(String str) {
        C5690e.m13999a();
        this.f13196g = C5690e.m14011d(str);
    }

    /* renamed from: d */
    public void mo41541d() {
        try {
            this.f13192c.releaseMemory(this.f13193d.f13711f, this.f13195f);
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception - " + e.getMessage());
        }
        this.f13192c = null;
    }

    /* renamed from: e */
    public int mo41429e() {
        return 1;
    }

    /* renamed from: h */
    public final boolean mo41603h() {
        return this.f13193d.f13708c;
    }

    /* renamed from: i */
    public final int mo41604i() {
        return this.f13193d.f13709d;
    }

    /* renamed from: j */
    public final int mo41605j() {
        return this.f13193d.f13710e;
    }

    /* renamed from: k */
    public final String mo41606k() {
        return this.f13193d.f13706a.getProviderName();
    }

    /* renamed from: l */
    public final String mo41607l() {
        return this.f13193d.f13706a.getProviderTypeForReflection();
    }

    /* renamed from: m */
    public final int mo41608m() {
        return this.f13197h;
    }

    /* renamed from: n */
    public final Map<String, Object> mo41609n() {
        HashMap hashMap = new HashMap();
        try {
            String str = "";
            hashMap.put("providerAdapterVersion", this.f13192c != null ? this.f13192c.getVersion() : str);
            if (this.f13192c != null) {
                str = this.f13192c.getCoreSDKVersion();
            }
            hashMap.put("providerSDKVersion", str);
            hashMap.put("spId", this.f13193d.f13706a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f13193d.f13706a.getAdSourceNameForEvents());
            hashMap.put(IronSourceConstants.EVENTS_INSTANCE_TYPE, Integer.valueOf(mo41603h() ? 2 : 1));
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(mo41429e()));
            if (!TextUtils.isEmpty(this.f13196g)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f13196g);
            }
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + mo41606k() + ")", e);
        }
        return hashMap;
    }

    /* renamed from: o */
    public final Long mo41610o() {
        return this.f13198i;
    }

    /* renamed from: p */
    public final String mo41611p() {
        return String.format("%s %s", new Object[]{mo41420a(), Integer.valueOf(hashCode())});
    }
}
