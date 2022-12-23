package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C5717a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.u */
public class C5786u {

    /* renamed from: a */
    protected AbstractAdapter f13894a;

    /* renamed from: b */
    protected C5717a f13895b;

    /* renamed from: c */
    protected JSONObject f13896c;

    /* renamed from: d */
    int f13897d;

    /* renamed from: e */
    protected String f13898e;

    /* renamed from: f */
    protected JSONObject f13899f;

    /* renamed from: g */
    protected List<String> f13900g;

    /* renamed from: h */
    protected String f13901h;

    /* renamed from: i */
    private C5787a f13902i;

    /* renamed from: j */
    private Timer f13903j;

    /* renamed from: k */
    private final Object f13904k = new Object();

    /* renamed from: l */
    private final Object f13905l = new Object();

    /* renamed from: com.ironsource.mediationsdk.u$a */
    public enum C5787a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public C5786u(C5717a aVar, AbstractAdapter abstractAdapter) {
        this.f13895b = aVar;
        this.f13894a = abstractAdapter;
        this.f13896c = aVar.f13707b;
        this.f13902i = C5787a.NOT_LOADED;
        this.f13903j = null;
        this.f13898e = "";
        this.f13899f = null;
        this.f13900g = new ArrayList();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C5787a mo42094a(C5787a[] aVarArr, C5787a aVar) {
        C5787a aVar2;
        synchronized (this.f13904k) {
            aVar2 = this.f13902i;
            if (Arrays.asList(aVarArr).contains(this.f13902i)) {
                mo42095a(aVar);
            }
        }
        return aVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo42095a(C5787a aVar) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlySmash " + this.f13895b.f13706a.getProviderName() + ": current state=" + this.f13902i + ", new state=" + aVar, 0);
        synchronized (this.f13904k) {
            this.f13902i = aVar;
        }
    }

    /* renamed from: a */
    public final void mo42096a(String str) {
        C5690e.m13999a();
        this.f13901h = C5690e.m14011d(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo42097a(TimerTask timerTask) {
        synchronized (this.f13905l) {
            mo42105h();
            Timer timer = new Timer();
            this.f13903j = timer;
            timer.schedule(timerTask, (long) (this.f13897d * 1000));
        }
    }

    /* renamed from: a */
    public final void mo42098a(JSONObject jSONObject) {
        this.f13899f = jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo42099a(C5787a aVar, C5787a aVar2) {
        synchronized (this.f13904k) {
            if (this.f13902i != aVar) {
                return false;
            }
            mo42095a(aVar2);
            return true;
        }
    }

    /* renamed from: b */
    public final void mo42100b(String str) {
        this.f13898e = str;
    }

    /* renamed from: c */
    public Map<String, Object> mo42005c() {
        HashMap hashMap = new HashMap();
        try {
            String str = "";
            hashMap.put("providerAdapterVersion", this.f13894a != null ? this.f13894a.getVersion() : str);
            if (this.f13894a != null) {
                str = this.f13894a.getCoreSDKVersion();
            }
            hashMap.put("providerSDKVersion", str);
            hashMap.put("spId", this.f13895b.f13706a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f13895b.f13706a.getAdSourceNameForEvents());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (this.f13895b.f13708c) {
                hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                hashMap.put(IronSourceConstants.EVENTS_INSTANCE_TYPE, 2);
                if (!TextUtils.isEmpty(this.f13898e)) {
                    hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f13898e);
                }
                if (this.f13899f != null && this.f13899f.length() > 0) {
                    hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f13899f);
                }
            } else {
                hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 0);
                hashMap.put(IronSourceConstants.EVENTS_INSTANCE_TYPE, 1);
            }
            if (!TextUtils.isEmpty(this.f13901h)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f13901h);
            }
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + mo42101d() + ")", e);
        }
        return hashMap;
    }

    /* renamed from: d */
    public final String mo42101d() {
        return this.f13895b.f13706a.getProviderName();
    }

    /* renamed from: e */
    public final int mo42102e() {
        return this.f13895b.f13709d;
    }

    /* renamed from: f */
    public final String mo42103f() {
        return this.f13895b.f13706a.getSubProviderId();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final String mo42104g() {
        C5787a aVar = this.f13902i;
        return aVar == null ? "null" : aVar.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo42105h() {
        synchronized (this.f13905l) {
            if (this.f13903j != null) {
                this.f13903j.cancel();
                this.f13903j = null;
            }
        }
    }

    /* renamed from: i */
    public final boolean mo42106i() {
        return this.f13895b.f13708c;
    }
}
