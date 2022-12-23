package com.ironsource.mediationsdk.adunit.p139b;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.C5789b;
import java.util.List;

/* renamed from: com.ironsource.mediationsdk.adunit.b.a */
public final class C5665a {

    /* renamed from: a */
    IronSource.AD_UNIT f13422a;

    /* renamed from: b */
    String f13423b;

    /* renamed from: c */
    List<NetworkSettings> f13424c;

    /* renamed from: d */
    C5789b f13425d;

    /* renamed from: e */
    int f13426e;

    /* renamed from: f */
    boolean f13427f;

    /* renamed from: g */
    int f13428g;

    /* renamed from: h */
    int f13429h;

    public C5665a(IronSource.AD_UNIT ad_unit, String str, List<NetworkSettings> list, C5789b bVar, int i, boolean z, int i2, int i3) {
        this.f13422a = ad_unit;
        this.f13423b = str;
        this.f13424c = list;
        this.f13425d = bVar;
        this.f13426e = i;
        this.f13427f = z;
        this.f13429h = i2;
        this.f13428g = i3;
    }

    /* renamed from: a */
    public final NetworkSettings mo41774a(String str) {
        for (NetworkSettings next : this.f13424c) {
            if (next.getProviderInstanceName().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo41775a() {
        return this.f13425d.f13917e > 0;
    }
}
