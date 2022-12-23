package com.adcolony.sdk;

import com.adcolony.sdk.C0580a0;
import com.mbridge.msdk.foundation.entity.CampaignEx;

public class AdColonyZone {
    public static final int BANNER = 1;
    public static final int INTERSTITIAL = 0;
    @Deprecated
    public static final int NATIVE = 2;

    /* renamed from: l */
    static final int f165l = 0;

    /* renamed from: m */
    static final int f166m = 1;

    /* renamed from: n */
    static final int f167n = 5;

    /* renamed from: o */
    static final int f168o = 6;

    /* renamed from: a */
    private String f169a;

    /* renamed from: b */
    private String f170b;

    /* renamed from: c */
    private int f171c = 5;

    /* renamed from: d */
    private int f172d;

    /* renamed from: e */
    private int f173e;

    /* renamed from: f */
    private int f174f;

    /* renamed from: g */
    private int f175g;

    /* renamed from: h */
    private int f176h;

    /* renamed from: i */
    private int f177i;

    /* renamed from: j */
    private boolean f178j;

    /* renamed from: k */
    private boolean f179k;

    AdColonyZone(String str) {
        this.f169a = str;
    }

    /* renamed from: a */
    private int m125a(int i) {
        if (C0578a.m145e() && !C0578a.m143c().mo9576H() && !C0578a.m143c().mo9577I()) {
            return i;
        }
        m129c();
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo9403b() {
        return this.f171c == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9404c(int i) {
        this.f171c = i;
    }

    public int getPlayFrequency() {
        return m125a(this.f175g);
    }

    public int getRemainingViewsUntilReward() {
        return m125a(this.f173e);
    }

    public int getRewardAmount() {
        return m125a(this.f176h);
    }

    public String getRewardName() {
        return m126a(this.f170b);
    }

    public int getViewsPerReward() {
        return m125a(this.f174f);
    }

    public String getZoneID() {
        return m126a(this.f169a);
    }

    public int getZoneType() {
        return this.f172d;
    }

    public boolean isRewarded() {
        return this.f179k;
    }

    public boolean isValid() {
        return m128a(this.f178j);
    }

    /* renamed from: c */
    private void m129c() {
        new C0580a0.C0581a().mo9419a("The AdColonyZone API is not available while AdColony is disabled.").mo9421a(C0580a0.f191i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9402b(int i) {
        this.f177i = i;
    }

    /* renamed from: a */
    private boolean m128a(boolean z) {
        if (C0578a.m145e() && !C0578a.m143c().mo9576H() && !C0578a.m143c().mo9577I()) {
            return z;
        }
        m129c();
        return false;
    }

    /* renamed from: a */
    private String m126a(String str) {
        return m127a(str, "");
    }

    /* renamed from: a */
    private String m127a(String str, String str2) {
        if (C0578a.m145e() && !C0578a.m143c().mo9576H() && !C0578a.m143c().mo9577I()) {
            return str;
        }
        m129c();
        return str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9401a(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        C0897z0 f = C0894y.m1167f(b, "reward");
        this.f170b = C0894y.m1169h(f, CampaignEx.JSON_KEY_REWARD_NAME);
        this.f176h = C0894y.m1163d(f, CampaignEx.JSON_KEY_REWARD_AMOUNT);
        this.f174f = C0894y.m1163d(f, "views_per_reward");
        this.f173e = C0894y.m1163d(f, "views_until_reward");
        this.f179k = C0894y.m1155b(b, "rewarded");
        this.f171c = C0894y.m1163d(b, "status");
        this.f172d = C0894y.m1163d(b, "type");
        this.f175g = C0894y.m1163d(b, "play_interval");
        this.f169a = C0894y.m1169h(b, "zone_id");
        boolean z = true;
        if (this.f171c == 1) {
            z = false;
        }
        this.f178j = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo9400a() {
        return this.f177i;
    }
}
