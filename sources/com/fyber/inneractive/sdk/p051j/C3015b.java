package com.fyber.inneractive.sdk.p051j;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.C2739a;
import com.fyber.inneractive.sdk.config.C2808t;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.p049h.C2960i;
import com.fyber.inneractive.sdk.p049h.C2961j;
import com.fyber.inneractive.sdk.util.C3656k;
import com.fyber.inneractive.sdk.util.C3670q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.j.b */
public abstract class C3015b {

    /* renamed from: a */
    protected C3018e f7385a;

    /* renamed from: b */
    String f7386b;

    /* renamed from: c */
    private C2961j f7387c;

    /* renamed from: d */
    private boolean f7388d = true;

    /* renamed from: e */
    private boolean f7389e = true;

    /* renamed from: a */
    public abstract C3018e mo18249a();

    /* renamed from: a */
    public abstract void mo18250a(String str, C2808t tVar) throws Exception;

    /* renamed from: b */
    public boolean mo18251b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo18252c() {
        return true;
    }

    protected C3015b() {
    }

    /* renamed from: a */
    public final void mo18496a(C2961j jVar) {
        this.f7387c = jVar;
        this.f7385a = mo18249a();
    }

    /* renamed from: a */
    public final C3018e mo18495a(String str) throws Exception {
        String str2;
        long j;
        this.f7389e = str != null;
        this.f7385a.f7401d = System.currentTimeMillis();
        ImpressionData impressionData = new ImpressionData();
        Map<String, String> a = this.f7387c.mo18429a();
        String a2 = m7017a(a, C2960i.RETURNED_AD_TYPE);
        String a3 = m7017a(a, C2960i.ERROR_CODE);
        String a4 = m7017a(a, C2960i.SESSION_ID);
        String a5 = m7017a(a, C2960i.CONTENT_ID);
        String a6 = m7017a(a, C2960i.PUBLISHER_ID);
        String a7 = m7017a(a, C2960i.WIDTH);
        String a8 = m7017a(a, C2960i.HEIGHT);
        String a9 = m7017a(a, C2960i.SDK_IMPRESSION_URL);
        String a10 = m7017a(a, C2960i.SDK_CLICK_URL);
        String a11 = m7017a(a, C2960i.AD_TIMEOUT);
        String a12 = m7017a(a, C2960i.AD_COMPLETION_URL);
        this.f7386b = m7017a(a, C2960i.AD_UNIT_ID);
        String a13 = m7017a(a, C2960i.AD_UNIT_TYPE);
        String a14 = m7017a(a, C2960i.AD_UNIT_DISPLAY_TYPE);
        String a15 = m7017a(a, C2960i.AD_NETWORK);
        String str3 = a13;
        String a16 = m7017a(a, C2960i.AD_NETWORK_ID);
        String str4 = a12;
        String a17 = m7017a(a, C2960i.CREATIVE_ID);
        String a18 = m7017a(a, C2960i.AD_DOMAIN);
        String a19 = m7017a(a, C2960i.APP_BUNDLE);
        String str5 = a10;
        String a20 = m7017a(a, C2960i.CAMPAIGN_ID);
        String a21 = m7017a(a, C2960i.CPM_VALUE);
        String str6 = a9;
        String a22 = m7017a(a, C2960i.CPM_CURRENCY);
        impressionData.setCpmValue(a21);
        impressionData.setCurrency(a22);
        String a23 = m7017a(a, C2960i.BANNER_MRC_PERCENT);
        String a24 = m7017a(a, C2960i.BANNER_MRC_DURATION);
        String a25 = m7017a(a, C2960i.BANNER_MRC_IMPRESSION_URL);
        String a26 = m7017a(a, C2960i.INTERSTITIAL_SKIP_MODE);
        if (mo18251b()) {
            str2 = a26;
            this.f7385a.f7418u = a;
        } else {
            str2 = a26;
        }
        C3018e eVar = this.f7385a;
        try {
            j = Long.parseLong(a11);
        } catch (NumberFormatException unused) {
            j = 20;
        }
        eVar.f7400c = j;
        String str7 = a8;
        String str8 = a23;
        String str9 = a7;
        eVar.f7399b = eVar.f7401d + TimeUnit.MINUTES.toMillis(j);
        impressionData.setImpressionId(a4);
        impressionData.setDemandSource(a15);
        this.f7385a.f7402e = a5;
        this.f7385a.f7403f = a6;
        this.f7385a.f7408k = a3;
        this.f7385a.f7397C = a19;
        if (!TextUtils.isEmpty(a16)) {
            impressionData.setDemandId(Long.valueOf(a16));
        }
        if (!TextUtils.isEmpty(a2)) {
            this.f7385a.f7406i = Integer.valueOf(a2).intValue();
        }
        if (!TextUtils.isEmpty(str9)) {
            this.f7385a.f7404g = Integer.valueOf(str9).intValue();
        }
        if (!TextUtils.isEmpty(str7)) {
            this.f7385a.f7405h = Integer.valueOf(str7).intValue();
        }
        this.f7385a.f7411n = str6;
        this.f7385a.f7412o = str5;
        this.f7385a.f7417t = str4;
        this.f7385a.f7413p = this.f7386b;
        this.f7385a.f7414q = str3;
        try {
            this.f7385a.f7415r = UnitDisplayType.fromValue(a14);
        } catch (IllegalArgumentException e) {
            if (this.f7388d) {
                this.f7385a.f7415r = UnitDisplayType.INTERSTITIAL;
            } else {
                throw e;
            }
        }
        if (!TextUtils.isEmpty(a17)) {
            impressionData.setCreativeId(a17);
        }
        if (!TextUtils.isEmpty(a18)) {
            impressionData.setAdvertiserDomain(a18);
        }
        if (!TextUtils.isEmpty(a20)) {
            impressionData.setCampaignId(a20);
        }
        impressionData.setCountry(C3656k.m9096h());
        this.f7385a.f7419v = impressionData;
        this.f7385a.f7421x = C3670q.m9151a(str8, 0);
        this.f7385a.f7422y = C3670q.m9150a(a24);
        this.f7385a.f7423z = a25;
        this.f7385a.f7395A = C3670q.m9151a(str2, -1);
        String stringBuffer = this.f7387c.mo18430b().toString();
        this.f7385a.f7407j = stringBuffer;
        C2808t a27 = C2739a.m5956a(this.f7386b);
        IAlog.m9034b("%sGot unit config for unitId: %s from config manager", IAlog.m9029a((Object) this), this.f7386b);
        IAlog.m9034b("%s%s", IAlog.m9029a((Object) this), a27);
        if (a27 == null && !this.f7388d) {
            this.f7385a.f7409l = "ErrorConfigurationMismatch";
        } else if (this.f7389e) {
            mo18250a(str, a27);
        } else if (mo18252c()) {
            C3021h hVar = new C3021h(stringBuffer);
            if (hVar.f7432a) {
                String str10 = hVar.f7433b;
                if (str10 == null || TextUtils.isEmpty(str10.trim())) {
                    throw new Exception("empty ad content detected. failing fast.");
                }
                mo18250a(str10, a27);
            }
        } else {
            mo18250a(stringBuffer, a27);
        }
        return this.f7385a;
    }

    /* renamed from: a */
    private String m7017a(Map<String, String> map, C2960i iVar) {
        String str = iVar.f7154E;
        String str2 = map.get(str);
        IAlog.m9033a("%s%s extracted from response header: %s", IAlog.m9029a((Object) this), str, str2);
        IAlog.m9030a(IAlog.f9871b, "%s %s : %s", "RESPONSE_HEADER", str, str2);
        return str2;
    }
}
